package com.scalekit.api.impl;

import com.google.protobuf.BoolValue;
import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.scalekit.exceptions.APIException;
import com.scalekit.exceptions.AuthenticationException;
import com.scalekit.exceptions.BadRequestException;
import com.scalekit.exceptions.InternalServerException;
import com.scalekit.exceptions.NotFoundException;
import com.scalekit.exceptions.ScalekitTimeoutException;
import com.scalekit.exceptions.ToolException;
import com.scalekit.exceptions.ToolForbiddenException;
import com.scalekit.exceptions.ToolRateLimitException;
import com.scalekit.exceptions.ToolUnauthorizedException;
import com.scalekit.grpc.scalekit.v1.errdetails.ToolErrorInfo;
import com.scalekit.grpc.scalekit.v1.tools.ExecuteToolRequest;
import com.scalekit.grpc.scalekit.v1.tools.ExecuteToolResponse;
import com.scalekit.grpc.scalekit.v1.tools.ListToolsRequest;
import com.scalekit.grpc.scalekit.v1.tools.ListToolsResponse;
import com.scalekit.internal.RetryTestSupport;
import com.scalekit.models.tools.ExecuteToolParams;
import com.scalekit.models.tools.ExecuteToolResult;
import com.scalekit.models.tools.ListToolsParams;
import com.scalekit.models.tools.Tool;
import com.scalekit.models.tools.ToolPage;
import io.grpc.Status;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class ScalekitToolsClientTest {

    private FakeAgentKitServer fake;
    private ScalekitToolsClient tools;
    private List<Long> sleeps;

    @BeforeEach
    void setUp() throws Exception {
        fake = new FakeAgentKitServer();
        tools = new ScalekitToolsClient(fake.channel, fake.credentials);
        sleeps = RetryTestSupport.recordSleepsInsteadOfSleeping();
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
                .setIsDefault(BoolValue.of(true))
                .addTags("mail")
                .build();
    }

    @Test
    void listMapsFiltersAndLeavesUnsetFieldsOut() {
        fake.enqueue("ListTools", ListToolsResponse.newBuilder().addTools(protoTool("gmail_fetch_mails"))
                .addToolNames("gmail_fetch_mails").setTotalSize(1).build());

        ToolPage page = tools.list(ListToolsParams.builder()
                .connectionName("  gmail ")
                .identifier("user_1")
                .addToolName("gmail_fetch_mails")
                .summary(false)
                .pageSize(5)
                .connectedAccountId("   ")
                .build());

        ListToolsRequest request = fake.lastRequest("ListTools");
        assertEquals("gmail", request.getFilter().getConnector());
        assertEquals("user_1", request.getFilter().getIdentifier());
        assertEquals(Collections.singletonList("gmail_fetch_mails"), request.getFilter().getToolNameList());
        assertTrue(request.getFilter().hasSummary());
        assertFalse(request.getFilter().hasConnectedAccountId(), "blank id must be left unset, never sent as \"\"");
        assertFalse(request.getFilter().hasQuery());
        assertEquals(5, request.getPageSize());

        assertEquals(1, page.items().size());
        Tool tool = page.items().get(0);
        assertEquals("gmail_fetch_mails", tool.definition().get("name"));
        assertEquals(Boolean.TRUE, tool.isDefault().orElse(null));
        assertEquals(Collections.singletonList("gmail_fetch_mails"), page.toolNames());
        assertFalse(page.hasNextPage());
    }

    @Test
    void listWithoutParamsSendsNoFilter() {
        tools.list();
        assertFalse(((ListToolsRequest) fake.lastRequest("ListTools")).hasFilter());
    }

    @Test
    void listAndExecuteUseTheSixtySecondToolDeadlineByDefault() {
        tools.list();
        tools.execute("gmail_fetch_mails", null);
        long sixtySeconds = TimeUnit.SECONDS.toNanos(60);
        for (String method : Arrays.asList("ListTools", "ExecuteTool")) {
            long remaining = fake.deadlines(method).get(0);
            assertTrue(remaining > sixtySeconds - TimeUnit.SECONDS.toNanos(5) && remaining <= sixtySeconds,
                    method + " deadline was " + remaining);
        }
    }

    @Test
    void shortTimeoutFailsWithScalekitTimeoutException() {
        fake.enqueue("ExecuteTool", new FakeAgentKitServer.Delay(1500, null));
        assertThrows(ScalekitTimeoutException.class, () -> tools.execute("slow_tool",
                ExecuteToolParams.builder().timeout(Duration.ofMillis(200)).build()));
        assertEquals(1, fake.calls("ExecuteTool"), "a timed-out execute must not be retried");
    }

    @Test
    void autoPagerFetchesLazilyAndStopsOnEmptyToken() {
        fake.enqueue("ListTools",
                ListToolsResponse.newBuilder().addTools(protoTool("a")).addTools(protoTool("b")).setNextPageToken("p2").build(),
                ListToolsResponse.newBuilder().addTools(protoTool("c")).setNextPageToken("").build());

        ToolPage first = tools.list(ListToolsParams.builder().pageSize(2).build());
        assertEquals(1, fake.calls("ListTools"));
        Iterator<Tool> it = first.autoPager().iterator();
        assertEquals("a", it.next().definition().get("name"));
        assertEquals("b", it.next().definition().get("name"));
        assertEquals(1, fake.calls("ListTools"), "second page must not be fetched before it is needed");
        assertEquals("c", it.next().definition().get("name"));
        assertEquals(2, fake.calls("ListTools"));
        assertFalse(it.hasNext());
        assertEquals(2, fake.calls("ListTools"));

        List<ListToolsRequest> requests = fake.requests("ListTools");
        assertEquals("p2", requests.get(1).getPageToken());
        assertEquals(2, requests.get(1).getPageSize(), "later pages keep the filters");
    }

    @Test
    void executeMapsRequestAndResult() {
        fake.enqueue("ExecuteTool", ExecuteToolResponse.newBuilder()
                .setExecutionId("exec_1")
                .setData(Struct.newBuilder()
                        .putFields("count", Value.newBuilder().setNumberValue(3).build())
                        .putFields("ratio", Value.newBuilder().setNumberValue(0.5).build()))
                .build());

        ExecuteToolResult result = tools.execute("  gmail_fetch_mails ", ExecuteToolParams.builder()
                .connectionName("gmail")
                .identifier("user_1")
                .putToolInput("max_results", 5)
                .putToolInput("labels", Arrays.asList("INBOX", "UNREAD"))
                .build());

        ExecuteToolRequest request = fake.lastRequest("ExecuteTool");
        assertEquals("gmail_fetch_mails", request.getToolName());
        assertEquals("gmail", request.getConnector());
        assertEquals("user_1", request.getIdentifier());
        assertFalse(request.hasConnectedAccountId());
        assertEquals(5.0, request.getParams().getFieldsOrThrow("max_results").getNumberValue());
        assertEquals(2, request.getParams().getFieldsOrThrow("labels").getListValue().getValuesCount());

        assertEquals("exec_1", result.executionId());
        assertEquals(3L, result.data().get("count"));
        assertEquals(0.5, result.data().get("ratio"));
    }

    @Test
    void executeWithoutParamsSendsNoInput() {
        ExecuteToolResult result = tools.execute("tool", null);
        assertFalse(((ExecuteToolRequest) fake.lastRequest("ExecuteTool")).hasParams());
        assertTrue(result.data().isEmpty());
    }

    @Test
    void blankToolNameFailsBeforeAnyCall() {
        assertThrows(IllegalArgumentException.class, () -> tools.execute(null, null));
        assertThrows(IllegalArgumentException.class, () -> tools.execute("  ", null));
        assertThrows(IllegalArgumentException.class,
                () -> tools.execute("t", ExecuteToolParams.builder().timeout(Duration.ZERO).build()));
        assertEquals(0, fake.totalCalls());
    }

    @Test
    void unavailableIsNotRetriedForExecuteButIsForList() {
        fake.enqueue("ExecuteTool", FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null));
        InternalServerException e = assertThrows(InternalServerException.class, () -> tools.execute("t", null));
        assertEquals(Status.Code.UNAVAILABLE.value(), e.getGrpcStatusCode());
        assertEquals(1, fake.calls("ExecuteTool"));

        fake.enqueue("ListTools", FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null),
                FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null),
                FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null));
        assertThrows(InternalServerException.class, () -> tools.list());
        assertEquals(3, fake.calls("ListTools"));
        assertEquals(2, sleeps.size());
    }

    @Test
    void toolErrorsMapToToolExceptionsWithoutCredentialRefresh() {
        ToolErrorInfo info = ToolErrorInfo.newBuilder().setExecutionId("exec_9").setToolErrorCode("UNAUTHENTICATED")
                .setToolErrorMessage("account expired").build();
        fake.enqueue("ExecuteTool",
                FakeAgentKitServer.error(Status.Code.UNAUTHENTICATED, "TOOL_ERROR", info),
                FakeAgentKitServer.error(Status.Code.PERMISSION_DENIED, "TOOL_ERROR", info),
                FakeAgentKitServer.error(Status.Code.RESOURCE_EXHAUSTED, "TOOL_ERROR", info),
                FakeAgentKitServer.error(Status.Code.INVALID_ARGUMENT, "TOOL_ERROR", info));

        ToolUnauthorizedException unauthorized = assertThrows(ToolUnauthorizedException.class,
                () -> tools.execute("t", null));
        assertEquals("exec_9", unauthorized.executionId().orElse(null));
        assertEquals("UNAUTHENTICATED", unauthorized.toolErrorCode().orElse(null));
        assertEquals("account expired", unauthorized.toolErrorMessage().orElse(null));
        assertEquals("TOOL_ERROR", unauthorized.getScalekitErrorCode());
        assertThrows(ToolForbiddenException.class, () -> tools.execute("t", null));
        assertThrows(ToolRateLimitException.class, () -> tools.execute("t", null));
        ToolException generic = assertThrows(ToolException.class, () -> tools.execute("t", null));
        assertEquals(ToolException.class, generic.getClass());

        assertEquals(4, fake.calls("ExecuteTool"), "tool errors are never retried");
        // One token fetch per call through the credentials' first-use path, none for a refresh.
        verify(fake.authClient, times(1)).getClientAccessToken();
    }

    @Test
    void clientCredentialRejectionRefreshesOnceAndRetries() {
        fake.enqueue("ListTools", FakeAgentKitServer.error(Status.Code.UNAUTHENTICATED, "UNAUTHENTICATED"));
        tools.list();
        assertEquals(2, fake.calls("ListTools"));
        verify(fake.authClient, times(2)).getClientAccessToken();
    }

    @Test
    void unauthenticatedWithoutErrorInfoAlsoRefreshes() {
        fake.enqueue("ExecuteTool", FakeAgentKitServer.error(Status.Code.UNAUTHENTICATED, null));
        tools.execute("t", null);
        assertEquals(2, fake.calls("ExecuteTool"));
    }

    @Test
    void repeatedClientCredentialRejectionFailsAfterOneRefresh() {
        fake.enqueue("ListTools", FakeAgentKitServer.error(Status.Code.UNAUTHENTICATED, "UNAUTHENTICATED"),
                FakeAgentKitServer.error(Status.Code.UNAUTHENTICATED, "UNAUTHENTICATED"));
        assertThrows(AuthenticationException.class, () -> tools.list());
        assertEquals(2, fake.calls("ListTools"));
    }

    @Test
    void reauthenticationNeededIsNotRefreshed() {
        fake.enqueue("ExecuteTool", FakeAgentKitServer.error(Status.Code.UNAUTHENTICATED, "REAUTHENTICATION_NEEDED"));
        AuthenticationException e = assertThrows(AuthenticationException.class, () -> tools.execute("t", null));
        assertEquals("REAUTHENTICATION_NEEDED", e.getScalekitErrorCode());
        assertEquals(1, fake.calls("ExecuteTool"));
        verify(fake.authClient, times(1)).getClientAccessToken();
    }

    @Test
    void wrappedNotFoundKeepsItsStatusClass() {
        fake.enqueue("ListTools", FakeAgentKitServer.error(Status.Code.NOT_FOUND, "INTERNAL_ERROR"));
        NotFoundException e = assertThrows(NotFoundException.class, () -> tools.list());
        assertEquals("INTERNAL_ERROR", e.getScalekitErrorCode());
        assertFalse(e.getMessage().contains("\n"), "message is one line: " + e.getMessage());
        assertTrue(e.getMessage().contains("error_code: INTERNAL_ERROR"));
    }

    @Test
    void unknownToolIsABadRequest() {
        fake.enqueue("ExecuteTool", FakeAgentKitServer.error(Status.Code.INVALID_ARGUMENT, "RESOURCE_NOT_FOUND"));
        APIException e = assertThrows(BadRequestException.class, () -> tools.execute("nope", null));
        assertEquals(Status.Code.INVALID_ARGUMENT.value(), e.getGrpcStatusCode());
    }

    @Test
    void toolDataKeepsNestedStructures() {
        fake.enqueue("ExecuteTool", ExecuteToolResponse.newBuilder().setData(Struct.newBuilder()
                .putFields("array", Value.newBuilder().setListValue(com.google.protobuf.ListValue.newBuilder()
                        .addValues(Value.newBuilder().setStructValue(Struct.newBuilder()
                                .putFields("id", Value.newBuilder().setStringValue("m1").build())))).build()))
                .build());
        Map<String, Object> data = tools.execute("t", null).data();
        List<?> array = (List<?>) data.get("array");
        assertEquals("m1", ((Map<?, ?>) array.get(0)).get("id"));
        assertThrows(UnsupportedOperationException.class, () -> data.put("x", 1));
    }
}
