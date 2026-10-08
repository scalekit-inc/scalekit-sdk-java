package com.scalekit.api.impl;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.scalekit.exceptions.BadRequestException;
import com.scalekit.exceptions.InternalServerException;
import com.scalekit.exceptions.NotFoundException;
import com.scalekit.exceptions.ScalekitTimeoutException;
import com.scalekit.grpc.scalekit.v1.tools.ConnectionReadiness;
import com.scalekit.grpc.scalekit.v1.tools.ListAvailableToolsRequest;
import com.scalekit.grpc.scalekit.v1.tools.ListAvailableToolsResponse;
import com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsRequest;
import com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsResponse;
import com.scalekit.grpc.scalekit.v1.tools.SearchToolsRequest;
import com.scalekit.grpc.scalekit.v1.tools.SearchToolsResponse;
import com.scalekit.internal.RetryTestSupport;
import com.scalekit.models.Page;
import com.scalekit.models.tools.ListAvailableToolsParams;
import com.scalekit.models.tools.ListScopedToolsParams;
import com.scalekit.models.tools.ScopedTool;
import com.scalekit.models.tools.SearchToolsParams;
import com.scalekit.models.tools.SearchedTool;
import com.scalekit.models.tools.Tool;
import com.scalekit.models.tools.ToolReadinessState;
import io.grpc.Status;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/** Tool search, scoped tools and available tools: mapping, validation, deadlines and retries. */
class ScalekitToolsDiscoveryTest {

    private FakeAgentKitServer fake;
    private ScalekitToolsClient tools;

    @BeforeEach
    void setUp() throws Exception {
        fake = new FakeAgentKitServer();
        tools = new ScalekitToolsClient(fake.channel, fake.credentials);
        RetryTestSupport.recordSleepsInsteadOfSleeping();
    }

    @AfterEach
    void tearDown() throws Exception {
        RetryTestSupport.restoreRealSleeper();
        fake.close();
    }

    private static com.scalekit.grpc.scalekit.v1.tools.Tool protoTool(String name) {
        return com.scalekit.grpc.scalekit.v1.tools.Tool.newBuilder()
                .setId("tool_" + name)
                .setProvider("GMAIL")
                .setDefinition(Struct.newBuilder().putFields("name", Value.newBuilder().setStringValue(name).build()))
                .build();
    }

    // ---- search ----

    @Test
    void searchMapsResultsAndReadiness() {
        fake.enqueue("SearchTools", SearchToolsResponse.newBuilder()
                .addTools(com.scalekit.grpc.scalekit.v1.tools.SearchedTool.newBuilder()
                        .setName("gmail_send_email").setProvider("GMAIL").setDescription("Send an email")
                        .setScore(0.92)
                        .addConnections(ConnectionReadiness.newBuilder().setConnectionName("gmail")
                                .setConnectedAccountId("ca_1").setReadinessStateValue(1))
                        .addConnections(ConnectionReadiness.newBuilder().setConnectionName("gmail-2")
                                .setReadinessStateValue(2))
                        .addConnections(ConnectionReadiness.newBuilder().setConnectionName("gmail-3")
                                .setReadinessStateValue(3))
                        .addConnections(ConnectionReadiness.newBuilder().setConnectionName("gmail-4")
                                .setReadinessStateValue(0))
                        .addConnections(ConnectionReadiness.newBuilder().setConnectionName("gmail-5")
                                .setReadinessStateValue(42)))
                .addTools(com.scalekit.grpc.scalekit.v1.tools.SearchedTool.newBuilder()
                        .setName("gmail_fetch_mails").setProvider("GMAIL"))
                .build());

        List<SearchedTool> result = tools.search("send an email",
                SearchToolsParams.builder().identifier(" user_1 ").topK(5).build());

        SearchToolsRequest request = fake.lastRequest("SearchTools");
        assertEquals("send an email", request.getQuery());
        assertEquals("user_1", request.getIdentifier());
        assertEquals(5, request.getTopK());

        assertEquals(2, result.size());
        SearchedTool first = result.get(0);
        assertEquals("gmail_send_email", first.name());
        assertEquals("GMAIL", first.provider());
        assertEquals("Send an email", first.description().orElse(null));
        assertEquals(0.92, first.score(), 1e-9);
        assertEquals(5, first.connections().size());
        assertEquals("gmail", first.connections().get(0).connectionName());
        assertEquals("ca_1", first.connections().get(0).connectedAccountId().orElse(null));
        assertSame(ToolReadinessState.READY, first.connections().get(0).readinessState());
        assertFalse(first.connections().get(1).connectedAccountId().isPresent());
        assertSame(ToolReadinessState.NEEDS_CONNECTION, first.connections().get(1).readinessState());
        assertSame(ToolReadinessState.NEEDS_REAUTH, first.connections().get(2).readinessState());
        assertSame(ToolReadinessState.NOT_EVALUATED, first.connections().get(3).readinessState());
        assertEquals(ToolReadinessState.Known.NOT_EVALUATED, first.connections().get(3).readinessState().known());
        assertEquals(ToolReadinessState.Known._UNKNOWN, first.connections().get(4).readinessState().known());
        assertEquals("42", first.connections().get(4).readinessState().value());

        assertFalse(result.get(1).description().isPresent());
        assertTrue(result.get(1).connections().isEmpty());
        assertThrows(UnsupportedOperationException.class, () -> result.add(result.get(0)));
    }

    @Test
    void searchWithoutParamsSendsOnlyTheQueryUntrimmed() {
        assertTrue(tools.search("  email  ").isEmpty());
        SearchToolsRequest request = fake.lastRequest("SearchTools");
        assertEquals("  email  ", request.getQuery(), "the server trims; the SDK sends the query as given");
        assertEquals("", request.getIdentifier());
        assertEquals(0, request.getTopK());
    }

    @Test
    void searchRejectsBlankQueryBeforeAnyCall() {
        assertThrows(IllegalArgumentException.class, () -> tools.search(null));
        assertThrows(IllegalArgumentException.class, () -> tools.search(""));
        assertThrows(IllegalArgumentException.class, () -> tools.search(" \t", null));
        assertEquals(0, fake.totalCalls());
    }

    @Test
    void searchMapsInvalidArgument() {
        fake.enqueue("SearchTools", FakeAgentKitServer.error(Status.Code.INVALID_ARGUMENT, null));
        assertThrows(BadRequestException.class, () -> tools.search("x"));
    }

    // ---- scoped ----

    @Test
    void listScopedSendsFilterAndMapsTools() {
        fake.enqueue("ListScopedTools", ListScopedToolsResponse.newBuilder()
                .addTools(com.scalekit.grpc.scalekit.v1.tools.ScopedTool.newBuilder()
                        .setTool(protoTool("gmail_send_email")).setIdentifier("user_1").setConnectedAccountId("ca_1"))
                .addTools(com.scalekit.grpc.scalekit.v1.tools.ScopedTool.newBuilder().setIdentifier("user_1"))
                .setTotalSize(2)
                .build());

        Page<ScopedTool> page = tools.listScoped(" user_1 ", ListScopedToolsParams.builder()
                .addProvider("GMAIL").addToolName("gmail_send_email").addConnectionName("gmail")
                .pageSize(10).pageToken("tok").build());

        ListScopedToolsRequest request = fake.lastRequest("ListScopedTools");
        assertEquals("user_1", request.getIdentifier());
        assertEquals(Collections.singletonList("GMAIL"), request.getFilter().getProvidersList());
        assertEquals(Collections.singletonList("gmail_send_email"), request.getFilter().getToolNamesList());
        assertEquals(Collections.singletonList("gmail"), request.getFilter().getConnectionNamesList());
        assertEquals(10, request.getPageSize());
        assertEquals("tok", request.getPageToken());

        assertEquals(2, page.items().size());
        ScopedTool first = page.items().get(0);
        assertEquals("gmail_send_email", first.tool().get().definition().get("name"));
        assertEquals("user_1", first.identifier());
        assertEquals("ca_1", first.connectedAccountId().orElse(null));
        assertFalse(page.items().get(1).tool().isPresent(), "a scoped tool without a tool is empty, not null");
        assertFalse(page.items().get(1).connectedAccountId().isPresent());
    }

    @Test
    void listScopedValidatesBeforeAnyCall() {
        ListScopedToolsParams filter = ListScopedToolsParams.builder().addProvider("GMAIL").build();
        assertThrows(IllegalArgumentException.class, () -> tools.listScoped(null, filter));
        assertThrows(IllegalArgumentException.class, () -> tools.listScoped("  ", filter));
        assertThrows(IllegalArgumentException.class, () -> tools.listScoped("user_1", null));
        assertThrows(IllegalArgumentException.class, () -> ListScopedToolsParams.builder().build());
        assertThrows(IllegalArgumentException.class, () -> ListScopedToolsParams.builder()
                .providers(Collections.<String>emptyList()).toolNames(null).build());
        assertThrows(IllegalArgumentException.class, () -> ListScopedToolsParams.builder().addProvider(null));
        assertThrows(IllegalArgumentException.class, () -> ListScopedToolsParams.builder()
                .providers(Arrays.asList("GMAIL", null)).build());
        assertEquals(0, fake.totalCalls());
    }

    @Test
    void listScopedMapsNotFoundAndInvalidArgument() {
        ListScopedToolsParams filter = ListScopedToolsParams.builder().addConnectionName("gmail").build();
        fake.enqueue("ListScopedTools", FakeAgentKitServer.error(Status.Code.NOT_FOUND, "RESOURCE_NOT_FOUND"),
                FakeAgentKitServer.error(Status.Code.INVALID_ARGUMENT, null));
        assertThrows(NotFoundException.class, () -> tools.listScoped("user_1", filter));
        assertThrows(BadRequestException.class, () -> tools.listScoped("user_1", filter));
    }

    @Test
    void listScopedAutoPagerKeepsFilterAndTimeout() {
        fake.enqueue("ListScopedTools",
                ListScopedToolsResponse.newBuilder()
                        .addTools(com.scalekit.grpc.scalekit.v1.tools.ScopedTool.newBuilder().setIdentifier("a"))
                        .setNextPageToken("p2").build(),
                ListScopedToolsResponse.newBuilder()
                        .addTools(com.scalekit.grpc.scalekit.v1.tools.ScopedTool.newBuilder().setIdentifier("b"))
                        .build());
        List<String> seen = new ArrayList<>();
        for (ScopedTool tool : tools.listScoped("user_1", ListScopedToolsParams.builder().addProvider("GMAIL")
                .timeout(Duration.ofSeconds(5)).build()).autoPager()) {
            seen.add(tool.identifier());
        }
        assertEquals(Arrays.asList("a", "b"), seen);
        List<ListScopedToolsRequest> requests = fake.requests("ListScopedTools");
        assertEquals("p2", requests.get(1).getPageToken());
        assertEquals(Collections.singletonList("GMAIL"), requests.get(1).getFilter().getProvidersList());
        for (long remaining : fake.deadlines("ListScopedTools")) {
            assertTrue(remaining <= TimeUnit.SECONDS.toNanos(5), "per-call timeout must apply to every page");
        }
    }

    // ---- available ----

    @Test
    void listAvailableSendsIdentifierAndMapsTools() {
        fake.enqueue("ListAvailableTools", ListAvailableToolsResponse.newBuilder()
                .addTools(protoTool("gmail_fetch_mails")).setTotalSize(1).setNextPageToken("n").build());
        Page<Tool> page = tools.listAvailable(" user_1 ",
                ListAvailableToolsParams.builder().pageSize(50).pageToken("t").build());
        ListAvailableToolsRequest request = fake.lastRequest("ListAvailableTools");
        assertEquals("user_1", request.getIdentifier());
        assertEquals(50, request.getPageSize());
        assertEquals("t", request.getPageToken());
        assertEquals("gmail_fetch_mails", page.items().get(0).definition().get("name"));
        assertTrue(page.hasNextPage());
    }

    @Test
    void listAvailableWithoutAccountsIsAnEmptyPage() {
        Page<Tool> page = tools.listAvailable("nobody");
        assertTrue(page.items().isEmpty());
        assertFalse(page.hasNextPage());
    }

    @Test
    void listAvailableValidatesBeforeAnyCall() {
        assertThrows(IllegalArgumentException.class, () -> tools.listAvailable(null));
        assertThrows(IllegalArgumentException.class, () -> tools.listAvailable(" ", null));
        assertThrows(IllegalArgumentException.class,
                () -> ListAvailableToolsParams.builder().timeout(Duration.ZERO).build());
        assertEquals(0, fake.totalCalls());
    }

    // ---- deadlines and retries ----

    @Test
    void searchScopedAndAvailableUseTheSixtySecondToolDeadlineByDefault() {
        tools.search("email");
        tools.listScoped("user_1", ListScopedToolsParams.builder().addProvider("GMAIL").build());
        tools.listAvailable("user_1");
        long sixtySeconds = TimeUnit.SECONDS.toNanos(60);
        for (String method : Arrays.asList("SearchTools", "ListScopedTools", "ListAvailableTools")) {
            long remaining = fake.deadlines(method).get(0);
            assertTrue(remaining > sixtySeconds - TimeUnit.SECONDS.toNanos(5) && remaining <= sixtySeconds,
                    method + " deadline was " + remaining);
        }
    }

    @Test
    void shortSearchTimeoutFailsWithScalekitTimeoutException() {
        fake.enqueue("SearchTools", new FakeAgentKitServer.Delay(1500, null));
        assertThrows(ScalekitTimeoutException.class,
                () -> tools.search("x", SearchToolsParams.builder().timeout(Duration.ofMillis(200)).build()));
    }

    @Test
    void readsAreRetriedOnUnavailable() {
        fake.enqueue("SearchTools", FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null));
        fake.enqueue("ListScopedTools", FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null));
        fake.enqueue("ListAvailableTools", FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null));
        tools.search("x");
        tools.listScoped("u", ListScopedToolsParams.builder().addProvider("GMAIL").build());
        tools.listAvailable("u");
        assertEquals(2, fake.calls("SearchTools"));
        assertEquals(2, fake.calls("ListScopedTools"));
        assertEquals(2, fake.calls("ListAvailableTools"));
    }

    @Test
    void persistentUnavailableSurfacesAsInternalServerException() {
        fake.enqueue("SearchTools", FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null),
                FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null),
                FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null),
                FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null));
        assertThrows(InternalServerException.class, () -> tools.search("x"));
    }
}
