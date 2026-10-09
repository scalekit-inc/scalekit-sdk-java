package com.scalekit.models;

import com.scalekit.models.connectedaccounts.AuthorizationDetails;
import com.scalekit.models.connectedaccounts.AuthorizationType;
import com.scalekit.models.connectedaccounts.ConnectedAccountRef;
import com.scalekit.models.connectedaccounts.ConnectedAccountStatus;
import com.scalekit.models.connectedaccounts.CreateConnectedAccountParams;
import com.scalekit.models.connectedaccounts.GoogleDwdAuth;
import com.scalekit.models.connectedaccounts.OAuthToken;
import com.scalekit.models.connectedaccounts.TrustedIdpAuth;
import com.scalekit.models.connections.CreateEnvironmentConnectionParams;
import com.scalekit.models.connections.EnvironmentConnection;
import com.scalekit.models.connections.EnvironmentConnectionAuthMode;
import com.scalekit.models.connections.EnvironmentConnectionStatus;
import com.scalekit.models.connections.EnvironmentConnectionType;
import com.scalekit.models.connections.GoogleDwdConnectionSettings;
import com.scalekit.models.connections.ListAppConnectionsParams;
import com.scalekit.models.connections.OAuthConnectionSettings;
import com.scalekit.models.providers.AuthPatternType;
import com.scalekit.models.providers.ListProvidersParams;
import com.scalekit.models.providers.ProviderType;
import com.scalekit.models.proxy.ProxyRequest;
import com.scalekit.models.proxy.ProxyResponse;
import com.scalekit.models.tools.ExecuteToolParams;
import com.scalekit.models.tools.ListAvailableToolsParams;
import com.scalekit.models.tools.ListScopedToolsParams;
import com.scalekit.models.tools.ListToolsParams;
import com.scalekit.models.tools.SearchToolsParams;
import com.scalekit.models.tools.ToolReadinessState;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class ModelsTest {

    // ---- paging ----

    private static Page<Integer> pages(AtomicInteger fetches, int pageCount) {
        return page(fetches, 1, pageCount);
    }

    private static Page<Integer> page(AtomicInteger fetches, int number, int pageCount) {
        return new Page.Builder<Integer>()
                .items(Arrays.asList(number * 10, number * 10 + 1))
                .nextPageToken(number < pageCount ? "t" + (number + 1) : "")
                .totalSize(pageCount * 2L)
                .nextPageFetcher(token -> {
                    fetches.incrementAndGet();
                    return page(fetches, Integer.parseInt(token.substring(1)), pageCount);
                })
                .build();
    }

    @Test
    void autoPagerIsLazyAndRestartsFromTheFirstPage() {
        AtomicInteger fetches = new AtomicInteger();
        Page<Integer> first = pages(fetches, 3);
        assertEquals(3, first.autoPager().stream().limit(3).count());
        assertEquals(1, fetches.get(), "limit(3) needs only the second page");
        assertEquals(Arrays.asList(10, 11, 20, 21, 30, 31),
                first.autoPager().stream().collect(Collectors.toList()));
        assertEquals(3, fetches.get());
        assertEquals(6L, first.totalSize().getAsLong());
    }

    @Test
    void lastPageHasNoNext() {
        Page<Integer> only = new Page.Builder<Integer>().items(Collections.singletonList(1)).nextPageToken("").build();
        assertFalse(only.hasNextPage());
        assertFalse(only.nextPageToken().isPresent());
        assertThrows(NoSuchElementException.class, only::nextPage);
        Iterator<Integer> it = only.autoPager().iterator();
        assertEquals(1, it.next());
        assertThrows(NoSuchElementException.class, it::next);
        assertFalse(only.totalSize().isPresent());
    }

    @Test
    void autoPagerStopsWhenTheServerRepeatsTheCursor() {
        AtomicInteger fetches = new AtomicInteger();
        Page<Integer> stuck = new Page.Builder<Integer>().items(Collections.<Integer>emptyList()).nextPageToken("same")
                .nextPageFetcher(token -> {
                    fetches.incrementAndGet();
                    return new Page.Builder<Integer>().items(Collections.<Integer>emptyList()).nextPageToken("same")
                            .nextPageFetcher(t -> {
                                fetches.incrementAndGet();
                                return null;
                            }).build();
                }).build();
        assertFalse(stuck.autoPager().iterator().hasNext());
        assertEquals(1, fetches.get());
    }

    @Test
    void pageItemsAreImmutableCopies() {
        List<Integer> items = new ArrayList<>(Arrays.asList(1, 2));
        Page<Integer> page = new Page.Builder<Integer>().items(items).build();
        items.add(3);
        assertEquals(2, page.items().size());
        assertThrows(UnsupportedOperationException.class, () -> page.items().add(4));
    }

    // ---- extensible enums ----

    @Test
    void extensibleEnumsKeepUnknownValues() {
        assertSame(ConnectedAccountStatus.ACTIVE, ConnectedAccountStatus.of("ACTIVE"));
        ConnectedAccountStatus future = ConnectedAccountStatus.of("SUSPENDED");
        assertEquals(ConnectedAccountStatus.Known._UNKNOWN, future.known());
        assertEquals("SUSPENDED", future.value());
        assertEquals(future, ConnectedAccountStatus.of("SUSPENDED"));
        assertEquals(AuthorizationType.Known.NO_AUTH, AuthorizationType.of("NO_AUTH").known());
        assertEquals(AuthorizationType.Known._UNKNOWN, AuthorizationType.of("_UNKNOWN").known());
        assertEquals(AuthPatternType.Known.BEARER, AuthPatternType.of("BEARER").known());
        assertEquals(AuthPatternType.Known._UNKNOWN, AuthPatternType.of("SAML").known());
        assertThrows(IllegalArgumentException.class, () -> AuthPatternType.of(null));
    }

    @Test
    void everyGeneratedConnectorTypeIsKnown() {
        for (com.scalekit.grpc.scalekit.v1.connected_accounts.ConnectorType type
                : com.scalekit.grpc.scalekit.v1.connected_accounts.ConnectorType.values()) {
            if (type == com.scalekit.grpc.scalekit.v1.connected_accounts.ConnectorType.UNRECOGNIZED
                    || type.getNumber() == 0) {
                continue;
            }
            assertNotEquals(AuthorizationType.Known._UNKNOWN, AuthorizationType.of(type.name()).known(), type.name());
        }
    }

    @Test
    void everyGeneratedConnectionEnumValueIsKnown() {
        for (com.scalekit.grpc.scalekit.v1.connections.ConnectionType type
                : com.scalekit.grpc.scalekit.v1.connections.ConnectionType.values()) {
            if (type == com.scalekit.grpc.scalekit.v1.connections.ConnectionType.UNRECOGNIZED || type.getNumber() == 0) {
                continue;
            }
            assertNotEquals(EnvironmentConnectionType.Known._UNKNOWN, EnvironmentConnectionType.of(type.name()).known(),
                    type.name());
        }
        for (com.scalekit.grpc.scalekit.v1.connections.ConnectionStatus status
                : com.scalekit.grpc.scalekit.v1.connections.ConnectionStatus.values()) {
            if (status == com.scalekit.grpc.scalekit.v1.connections.ConnectionStatus.UNRECOGNIZED
                    || status.getNumber() == 0) {
                continue;
            }
            assertNotEquals(EnvironmentConnectionStatus.Known._UNKNOWN,
                    EnvironmentConnectionStatus.of(status.name()).known(), status.name());
        }
        for (com.scalekit.grpc.scalekit.v1.connections.ConnectionAuthMode mode
                : com.scalekit.grpc.scalekit.v1.connections.ConnectionAuthMode.values()) {
            if (mode == com.scalekit.grpc.scalekit.v1.connections.ConnectionAuthMode.UNRECOGNIZED
                    || mode.getNumber() == 0) {
                continue;
            }
            assertNotEquals(EnvironmentConnectionAuthMode.Known._UNKNOWN,
                    EnvironmentConnectionAuthMode.of(mode.name()).known(), mode.name());
        }
        for (com.scalekit.grpc.scalekit.v1.tools.ToolReadinessState state
                : com.scalekit.grpc.scalekit.v1.tools.ToolReadinessState.values()) {
            if (state == com.scalekit.grpc.scalekit.v1.tools.ToolReadinessState.UNRECOGNIZED
                    || state.getNumber() == 0) {
                continue;
            }
            String name = state.name().substring("TOOL_READINESS_STATE_".length());
            assertNotEquals(ToolReadinessState.Known._UNKNOWN, ToolReadinessState.of(name).known(), name);
        }
        for (com.scalekit.grpc.scalekit.v1.providers.ProviderType type
                : com.scalekit.grpc.scalekit.v1.providers.ProviderType.values()) {
            if (type != com.scalekit.grpc.scalekit.v1.providers.ProviderType.UNRECOGNIZED) {
                assertEquals(type.name(), ProviderType.valueOf(type.name()).name());
            }
        }
        assertEquals(EnvironmentConnectionType.Known._UNKNOWN, EnvironmentConnectionType.of("INVALID").known());
    }

    // ---- redaction ----

    @Test
    void secretsNeverAppearInToString() {
        String text = AuthorizationDetails.oauthToken(OAuthToken.builder().accessToken("AT-S3CR3T")
                .refreshToken("RT-S3CR3T").build()).toString()
                + AuthorizationDetails.staticAuth(Collections.singletonMap("api_key", "KEY-S3CR3T")).toString()
                + AuthorizationDetails.googleDwd(GoogleDwdAuth.builder("a@b.c").accessToken("DWD-S3CR3T").build())
                + AuthorizationDetails.trustedIdp(TrustedIdpAuth.builder("db").secretAccessKey("SK-S3CR3T")
                .sessionToken("ST-S3CR3T").build())
                + CreateConnectedAccountParams.builder().apiConfig(Collections.singletonMap("k", "CFG-S3CR3T")).build()
                + ProxyRequest.builder("c", "i", "/p").header("X-Api-Key", "HDR-S3CR3T").method("POST")
                .jsonBody(Collections.singletonMap("password", "BODY-S3CR3T")).build()
                + ProxyResponse.builder().statusCode(200).body("RESP-S3CR3T".getBytes(StandardCharsets.UTF_8)).build();
        assertFalse(text.contains("S3CR3T"), text);
        assertTrue(text.contains("api_key"), "static auth keeps the key names");
    }

    @Test
    void connectionSettingsSecretsNeverAppearInToString() {
        OAuthConnectionSettings oauth = OAuthConnectionSettings.builder().clientId("client-id")
                .clientSecret("CS-S3CR3T").googleadsDeveloperToken("GA-S3CR3T").build();
        GoogleDwdConnectionSettings dwd = GoogleDwdConnectionSettings.builder().serviceAccountJson("SA-S3CR3T").build();
        String text = oauth.toString() + dwd
                + EnvironmentConnection.builder().id("c").oauthSettings(oauth).build()
                + EnvironmentConnection.builder().id("c").googleDwdSettings(dwd).build()
                + EnvironmentConnection.builder().id("c")
                .staticSettings(Collections.singletonMap("api_key", "ST-S3CR3T")).build()
                + CreateEnvironmentConnectionParams.appConnection("X")
                .context(Collections.singletonMap("token", "CTX-S3CR3T")).build();
        assertFalse(text.contains("S3CR3T"), text);
        assertTrue(text.contains("client-id"));
    }

    // ---- params ----

    @Test
    void paramsNormalizeBlankValuesAndValidate() {
        ListToolsParams list = ListToolsParams.builder().identifier("  ").connectionName(" gmail ").build();
        assertFalse(list.identifier().isPresent());
        assertEquals("gmail", list.connectionName().get());
        assertEquals(ListToolsParams.DEFAULT_TIMEOUT, list.timeout());
        assertEquals(Duration.ofSeconds(60), ExecuteToolParams.DEFAULT_TIMEOUT);
        assertThrows(IllegalArgumentException.class, () -> ListToolsParams.builder().timeout(Duration.ZERO).build());
        assertThrows(IllegalArgumentException.class, () -> ExecuteToolParams.builder().timeout(null).build());
        assertThrows(IllegalArgumentException.class,
                () -> ExecuteToolParams.builder().putToolInput("big", Long.MAX_VALUE).build());
        assertEquals(ConnectedAccountRef.of("gmail", "u"), ConnectedAccountRef.of(" gmail", "u "));
    }

    @Test
    void newParamsNormalizeBlankValuesAndValidate() {
        SearchToolsParams search = SearchToolsParams.builder().identifier("  ").build();
        assertFalse(search.identifier().isPresent());
        assertFalse(search.topK().isPresent());
        assertEquals(ExecuteToolParams.DEFAULT_TIMEOUT, search.timeout());
        assertThrows(IllegalArgumentException.class, () -> SearchToolsParams.builder().timeout(Duration.ofSeconds(-1)).build());
        assertEquals(ExecuteToolParams.DEFAULT_TIMEOUT, ListAvailableToolsParams.builder().build().timeout());
        assertThrows(IllegalArgumentException.class, () -> ListScopedToolsParams.builder().build());
        ListScopedToolsParams scoped = ListScopedToolsParams.builder().addToolName("gmail_send_email").build();
        assertThrows(UnsupportedOperationException.class, () -> scoped.toolNames().add("x"));
        ListAppConnectionsParams connections = ListAppConnectionsParams.builder().query(" ").provider(" ").pageToken("").build();
        assertFalse(connections.query().isPresent());
        assertFalse(connections.provider().isPresent());
        assertFalse(connections.pageToken().isPresent());
        assertEquals(" gma", ListAppConnectionsParams.builder().query(" gma").build().query().get(),
                "a non-blank query is sent as given");
        ListProvidersParams providers = ListProvidersParams.builder().identifier(" ").build();
        assertFalse(providers.identifier().isPresent());
        assertFalse(providers.providerType().isPresent());
        CreateEnvironmentConnectionParams create = CreateEnvironmentConnectionParams.appConnection(" GMAIL ")
                .connectionName(" ").build();
        assertFalse(create.connectionName().isPresent());
        assertEquals("GMAIL", create.providerKey());
        assertThrows(IllegalArgumentException.class, () -> CreateEnvironmentConnectionParams.appConnection("X")
                .context(Collections.singletonMap("bad", new Object())).build());
    }

    @Test
    void newParamsToBuilderRoundTrips() {
        SearchToolsParams search = SearchToolsParams.builder().identifier("u").topK(3).timeout(Duration.ofSeconds(5)).build();
        assertEquals(search.toString(), search.toBuilder().build().toString());
        ListScopedToolsParams scoped = ListScopedToolsParams.builder().addProvider("GMAIL").addConnectionName("gmail")
                .pageSize(5).pageToken("t").build();
        assertEquals(scoped.toString(), scoped.toBuilder().build().toString());
        ListAvailableToolsParams available = ListAvailableToolsParams.builder().pageSize(5).build();
        assertEquals(available.toString(), available.toBuilder().build().toString());
        ListAppConnectionsParams connections = ListAppConnectionsParams.builder().provider("GMAIL").query("gma")
                .pageSize(3).build();
        assertEquals(connections.toString(), connections.toBuilder().build().toString());
        ListProvidersParams providers = ListProvidersParams.builder().providerType(ProviderType.ALL).pageSize(2).build();
        assertEquals(providers.toString(), providers.toBuilder().build().toString());
    }

    @Test
    void toBuilderRoundTrips() {
        ListToolsParams params = ListToolsParams.builder().provider("GOOGLE").summary(true).pageSize(5).build();
        ListToolsParams copy = params.toBuilder().build();
        assertEquals(params.toString(), copy.toString());
    }

    // ---- proxy request rules ----

    @Test
    void proxyRequestRules() {
        ProxyRequest request = ProxyRequest.builder(" conn ", " user ", "x/y").method("patch").build();
        assertEquals("/x/y", request.path());
        assertEquals("PATCH", request.method());
        assertEquals("conn", request.connectionName());
        assertEquals(ProxyRequest.DEFAULT_TIMEOUT, request.timeout());

        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("", "u", "/p").build());
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", " ", "/p").build());
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "u", null).build());
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "u", "/p")
                .jsonBody(Collections.singletonMap("a", 1)).build(), "GET cannot have a body");
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "u", "/p").method("HEAD")
                .formBody(Collections.singletonMap("a", "1")).build());
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "u", "/p").method("POST")
                .jsonBody(Collections.singletonMap("a", 1)).formBody(Collections.singletonMap("a", "1")).build());
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "u", "/p").jsonBody("text"));
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "u", "/p").header("Host", "x"));
        assertThrows(IllegalArgumentException.class,
                () -> ProxyRequest.builder("c", "u", "/p").header("content-length", "1"));
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "u", "/p").header("X-A", "a\r\nb: c"));
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "u", "/p").header("bad name", "v"));
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "u", "/p").method("GE T").build());
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "u", "/p").method("CONNECT").build());
        assertThrows(IllegalArgumentException.class,
                () -> ProxyRequest.builder("c", "u", "/p").timeout(Duration.ofMillis(-1)).build());
        assertThrows(IllegalArgumentException.class,
                () -> ProxyRequest.builder("c", "u", "/p").method("POST").rawBody(new byte[0], " ").build());
    }

    @Test
    void proxyRequestRejectsUnsafePathsAndHeaderValues() {
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "u", "/a#frag").build());
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "u", "/../outside").build());
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "u", "/a/./b").build());
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "u", "/a/%2E%2e/b").build());
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "u", "/a/..").build());
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "u", "..").build());
        assertEquals("/a..b/.well-known/x?next=../y", ProxyRequest.builder("c", "u", "/a..b/.well-known/x?next=../y").build().path(),
                "dots inside segments and in the query are fine");

        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "u", "/p").header("X-A", "\u20ac"));
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "u", "/p").header("X-A", "a\u007fb"));
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "\u7528\u6237", "/p").build());
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("con\nn", "u", "/p").build());
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "caf\u00e9", "/p").build(),
                "java.net.http would send \"caf?\"");
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c\u00e9", "u", "/p").build());
        assertThrows(IllegalArgumentException.class,
                () -> ProxyRequest.builder("c", "u", "/p").header("X-Title", "R\u00e9sum\u00e9"));
        assertThrows(IllegalArgumentException.class, () -> ProxyRequest.builder("c", "u", "/p").header("X-A", "\u00ff"));
        ProxyRequest ascii = ProxyRequest.builder("c", "user ~1!", "/p").header("X-A", "a\tb ~").build();
        assertEquals("user ~1!", ascii.identifier());
        assertEquals("/x?next=/../y", ProxyRequest.builder("c", "u", "/x?next=/../y").build().path(),
                "a dot segment inside the query is not a path segment");
    }

    @Test
    void proxyResponseHeadersAreCaseInsensitiveAndCharsetAware() {
        Map<String, List<String>> headers = new HashMap<>();
        headers.put("Content-Type", Collections.singletonList("text/plain; charset=ISO-8859-1"));
        ProxyResponse response = ProxyResponse.builder().statusCode(201).headers(headers)
                .body("café".getBytes(StandardCharsets.ISO_8859_1)).build();
        assertEquals("café", response.bodyAsString());
        assertTrue(response.header("CONTENT-TYPE").isPresent());
        assertTrue(response.isSuccessful());
        assertThrows(IllegalStateException.class, response::bodyAsJsonObject);
        assertThrows(IllegalStateException.class,
                () -> ProxyResponse.builder().body("[1]".getBytes(StandardCharsets.UTF_8)).build().bodyAsJsonObject());
    }
}
