package com.scalekit.internal.proxy;

import com.scalekit.api.ActionsClient;
import com.scalekit.api.AuthClient;
import com.scalekit.api.impl.ScalekitActionsClient;
import com.scalekit.exceptions.AuthenticationException;
import com.scalekit.exceptions.ProxyException;
import com.scalekit.exceptions.ScalekitConnectionException;
import com.scalekit.exceptions.ScalekitTimeoutException;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.CallCredentials;
import io.grpc.Metadata;
import com.scalekit.models.proxy.ProxyRequest;
import com.scalekit.models.proxy.ProxyResponse;
import com.scalekit.internal.proxy.StubHttpServer.Recorded;
import com.scalekit.internal.proxy.StubHttpServer.Reply;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.ServerSocket;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/** Behaviour every proxy transport must show; subclasses pick the transport. */
abstract class ProxyExecutorContract {

    StubHttpServer server;
    AuthClient authClient;
    ScalekitCredentials credentials;
    ProxyExecutor executor;

    abstract HttpTransport newTransport();

    /** Whether the transport loses a 401's body on streamed (POST, PUT, PATCH...) requests. */
    abstract boolean dropsUnauthorizedBodyOnStreamedRequests();

    @BeforeEach
    void setUp() throws Exception {
        server = new StubHttpServer();
        authClient = mock(AuthClient.class);
        when(authClient.getClientAccessToken()).thenReturn("token-1", "token-2", "token-3");
        credentials = new ScalekitCredentials(authClient);
        executor = new ProxyExecutor(server.baseUrl() + "/", credentials, this::newTransport);
    }

    /** Caches token-1 the way an earlier gRPC call would, outside the refresh debounce. */
    void primeTokenFromAnEarlierGrpcCall() {
        credentials.applyRequestMetadata(null, Runnable::run, new CallCredentials.MetadataApplier() {
            @Override
            public void apply(Metadata headers) {
            }

            @Override
            public void fail(io.grpc.Status status) {
                throw new AssertionError(status.toString());
            }
        });
        assertEquals("token-1", credentials.getToken());
    }

    @Test
    void coldStartFetchesATokenAndAFreshTokenRejectionIsNotRefreshedAgain() {
        server.enqueue(new Reply(401, "{\"detail\":\"invalid token\",\"code\":\"UNAUTHORIZED\"}", 0, "Content-Type", "application/json"));
        ProxyException e = assertThrows(ProxyException.class, () -> executor.execute(get("/x").build()));
        assertEquals("UNAUTHORIZED", e.proxyErrorCode().get());
        // The token was fetched moments ago; the refresh debounce keeps it, so nothing is resent.
        assertEquals(1, server.proxyRequests().size());
        assertEquals("Bearer token-1", server.proxyRequests().get(0).headers.getFirst("Authorization"));
    }

    @AfterEach
    void tearDown() {
        server.close();
        Thread.interrupted();
    }

    private static ProxyRequest.Builder get(String path) {
        return ProxyRequest.builder(" gmail ", " user_1 ", path);
    }

    @Test
    void getSendsUrlQueryAndHeaders() {
        server.enqueue(new Reply(200, "{\"emailAddress\":\"a@b.c\",\"count\":12}", 0, "Content-Type", "application/json"));
        ProxyResponse response = executor.execute(get("gmail/v1/users/me/profile")
                .queryParam("q", "from:a b")
                .queryParam("label", "x")
                .queryParam("label", "y")
                .header("X-Custom", "1")
                .header("Identifier", "spoofed")
                .header("AUTHORIZATION", "Bearer spoofed")
                .build());

        Recorded request = server.proxyRequests().get(0);
        assertEquals("GET", request.method);
        assertEquals("/proxy/gmail/v1/users/me/profile?q=from%3Aa%20b&label=x&label=y", request.uri);
        assertEquals("Bearer token-1", request.headers.getFirst("Authorization"));
        assertEquals(1, request.headers.get("Authorization").size());
        assertEquals("gmail", request.headers.getFirst("Connection_name"));
        assertEquals(Collections.singletonList("user_1"), request.headers.get("Identifier"));
        assertEquals("1", request.headers.getFirst("X-custom"));
        assertTrue(request.headers.getFirst("User-agent").startsWith("scalekit-sdk-java/"));

        assertEquals(200, response.statusCode());
        assertTrue(response.isSuccessful());
        assertEquals("application/json", response.header("content-type").get());
        assertEquals("a@b.c", response.bodyAsJsonObject().get("emailAddress"));
        assertEquals(12L, response.bodyAsJsonObject().get("count"));
    }

    @Test
    void pathWithQueryStringGetsParamsAppended() {
        executor.execute(get("/search?x=1").queryParam("y", "2").build());
        assertEquals("/proxy/search?x=1&y=2", server.proxyRequests().get(0).uri);
    }

    @Test
    void pathCharactersOutsideTheUriSyntaxAreEncoded() {
        executor.execute(get("/files/my file é.txt").build());
        assertEquals("/proxy/files/my%20file%20%C3%A9.txt", server.proxyRequests().get(0).uri);
    }

    @Test
    void jsonBodyIsSentAsJson() {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("text", "hello");
        body.put("n", 2);
        executor.execute(get("/api/chat.postMessage").method("post").jsonBody(body).build());
        Recorded request = server.proxyRequests().get(0);
        assertEquals("POST", request.method);
        assertEquals("application/json", request.headers.getFirst("Content-Type"));
        assertEquals("{\"text\":\"hello\",\"n\":2}", request.bodyText());
    }

    @Test
    void formAndRawBodies() {
        Map<String, String> form = new LinkedHashMap<>();
        form.put("a", "1 2");
        form.put("b", "&");
        executor.execute(get("/form").method("PUT").formBody(form).build());
        executor.execute(get("/raw").method("POST").rawBody("<x/>".getBytes(StandardCharsets.UTF_8), "application/xml")
                .header("Content-Type", "text/xml").build());
        List<Recorded> requests = server.proxyRequests();
        assertEquals("application/x-www-form-urlencoded", requests.get(0).headers.getFirst("Content-Type"));
        assertEquals("a=1+2&b=%26", requests.get(0).bodyText());
        assertEquals("text/xml", requests.get(1).headers.getFirst("Content-Type"), "an explicit header wins");
        assertEquals("<x/>", requests.get(1).bodyText());
    }

    @Test
    void postWithoutBodySendsZeroLength() {
        executor.execute(get("/trigger").method("POST").build());
        Recorded request = server.proxyRequests().get(0);
        assertEquals("POST", request.method);
        assertEquals(0, request.body.length);
    }

    @Test
    void patchIsSentOrRejectedBeforeAnyIo() {
        HttpTransport transport = newTransport();
        ProxyRequest patch = get("/items/1").method("patch").jsonBody(Collections.singletonMap("a", 1)).build();
        if (transport.supportsMethod("PATCH")) {
            executor.execute(patch);
            Recorded request = server.proxyRequests().get(0);
            assertEquals("PATCH", request.method);
            assertEquals("{\"a\":1}", request.bodyText());
        } else {
            assertThrows(UnsupportedOperationException.class, () -> executor.execute(patch));
            assertTrue(server.proxyRequests().isEmpty());
            assertTrue(server.tokenRequests().isEmpty());
        }
    }

    @Test
    void errorStatusThrowsProxyExceptionWithParsedBody() {
        server.enqueue(new Reply(404, "{\"detail\":\"connection not found\",\"code\":\"NOT_FOUND\"}", 0,
                "Content-Type", "application/json"));
        ProxyException e = assertThrows(ProxyException.class, () -> executor.execute(get("/x").build()));
        assertEquals(404, e.statusCode());
        assertEquals("NOT_FOUND", e.proxyErrorCode().get());
        assertEquals("connection not found", e.proxyErrorDetail().get());
        assertEquals("NOT_FOUND", e.getScalekitErrorCode());
        assertEquals(5, e.getGrpcStatusCode());
        assertTrue(e.getMessage().contains("404"));
        assertEquals("connection not found", e.response().bodyAsJsonObject().get("detail"));
    }

    @Test
    void plainTextServerErrorIsNotRetried() {
        server.enqueue(new Reply(502, "upstream request failed", 0));
        ProxyException e = assertThrows(ProxyException.class, () -> executor.execute(get("/x").method("POST").build()));
        assertEquals(502, e.statusCode());
        assertFalse(e.proxyErrorCode().isPresent());
        assertNull(e.getScalekitErrorCode());
        assertEquals(2, e.getGrpcStatusCode());
        assertEquals("upstream request failed", e.response().bodyAsString());
        assertEquals(1, server.proxyRequests().size());
    }

    @Test
    void redirectsAreNotFollowed() {
        server.enqueue(new Reply(302, "", 0, "Location", server.baseUrl() + "/elsewhere"));
        ProxyResponse response = executor.execute(get("/x").build());
        assertEquals(302, response.statusCode());
        assertFalse(response.isSuccessful());
        assertEquals(1, server.proxyRequests().size());
    }

    @Test
    void scalekitUnauthorizedRefreshesTheTokenAndResendsOnce() {
        primeTokenFromAnEarlierGrpcCall();
        server.enqueue(new Reply(401, "{\"detail\":\"invalid token\",\"code\":\"UNAUTHORIZED\"}", 0,
                "Content-Type", "application/json"));
        ProxyResponse response = executor.execute(get("/x").build());
        assertEquals(200, response.statusCode());
        List<Recorded> requests = server.proxyRequests();
        assertEquals(2, requests.size());
        assertEquals("Bearer token-1", requests.get(0).headers.getFirst("Authorization"));
        assertEquals("Bearer token-2", requests.get(1).headers.getFirst("Authorization"));
    }

    @Test
    void secondScalekitUnauthorizedIsNotResentAgain() {
        primeTokenFromAnEarlierGrpcCall();
        Reply unauthorized = new Reply(401, "{\"detail\":\"invalid token\",\"code\":\"UNAUTHORIZED\"}", 0, "Content-Type", "application/json");
        server.enqueue(unauthorized, unauthorized);
        ProxyException e = assertThrows(ProxyException.class, () -> executor.execute(get("/x").build()));
        assertEquals(401, e.statusCode());
        assertEquals(16, e.getGrpcStatusCode());
        assertEquals(2, server.proxyRequests().size());
    }

    @Test
    void upstreamUnauthorizedIsNeverResent() {
        primeTokenFromAnEarlierGrpcCall();
        server.enqueue(new Reply(401, "{\"error\":\"invalid_auth\"}", 0, "Content-Type", "application/json"));
        ProxyException e = assertThrows(ProxyException.class, () -> executor.execute(get("/x").build()));
        assertEquals(401, e.statusCode());
        assertEquals("{\"error\":\"invalid_auth\"}", e.response().bodyAsString());
        assertEquals(1, server.proxyRequests().size());
        assertEquals("token-1", credentials.getToken(), "an upstream 401 does not refresh the token");
        verify(authClient, times(1)).getClientAccessToken();
    }

    @Test
    void upstreamUnauthorizedToAPostIsNeverResent() {
        primeTokenFromAnEarlierGrpcCall();
        server.enqueue(new Reply(401, "{\"error\":\"invalid_auth\"}", 0, "Content-Type", "application/json"));
        ProxyRequest post = get("/api/chat.postMessage").method("POST")
                .jsonBody(Collections.singletonMap("text", "hello")).build();
        ProxyException e = assertThrows(ProxyException.class, () -> executor.execute(post));
        assertEquals(401, e.statusCode());
        assertEquals(1, server.proxyRequests().size(), "a non-idempotent upstream call must not be repeated");
        if (dropsUnauthorizedBodyOnStreamedRequests()) {
            // The body was lost, so the 401 cannot be attributed: not resent, but the token is
            // refreshed so that a stale one does not fail the next call too.
            assertEquals("token-2", credentials.getToken());
            verify(authClient, times(2)).getClientAccessToken();
        } else {
            assertEquals("token-1", credentials.getToken(), "an upstream 401 does not refresh the token");
            verify(authClient, times(1)).getClientAccessToken();
        }
    }

    private void assertNotResent(Reply lookAlike) {
        primeTokenFromAnEarlierGrpcCall();
        server.enqueue(lookAlike);
        assertThrows(ProxyException.class, () -> executor.execute(get("/x").build()));
        assertEquals(1, server.proxyRequests().size());
        assertEquals("token-1", credentials.getToken());
    }

    @Test
    void lookAlikeWithoutDetailIsTreatedAsUpstream() {
        assertNotResent(new Reply(401, "{\"code\":\"UNAUTHORIZED\"}", 0, "Content-Type", "application/json"));
    }

    @Test
    void twoKeyLookAlikeWithoutDetailIsTreatedAsUpstream() {
        assertNotResent(new Reply(401, "{\"code\":\"UNAUTHORIZED\",\"message\":\"x\"}", 0,
                "Content-Type", "application/json"));
        verify(authClient, times(1)).getClientAccessToken();
    }

    @Test
    void lookAlikeWithExtraKeysIsTreatedAsUpstream() {
        assertNotResent(new Reply(401, "{\"detail\":\"x\",\"code\":\"UNAUTHORIZED\",\"request_id\":\"r\"}", 0,
                "Content-Type", "application/json"));
    }

    @Test
    void lookAlikeWithoutJsonContentTypeIsTreatedAsUpstream() {
        assertNotResent(new Reply(401, "{\"detail\":\"x\",\"code\":\"UNAUTHORIZED\"}", 0,
                "Content-Type", "text/plain"));
        server.enqueue(new Reply(401, "{\"detail\":\"x\",\"code\":\"UNAUTHORIZED\"}", 0));
        assertThrows(ProxyException.class, () -> executor.execute(get("/y").build()));
        assertEquals(2, server.proxyRequests().size(), "no content type is not JSON either");
    }

    @Test
    void lookAlikeWithAnotherCodeIsTreatedAsUpstream() {
        assertNotResent(new Reply(401, "{\"detail\":\"x\",\"code\":\"INVALID_TOKEN\"}", 0,
                "Content-Type", "application/json"));
    }

    @Test
    void scalekitUnauthorizedWithJsonSuffixContentTypeIsResent() {
        primeTokenFromAnEarlierGrpcCall();
        server.enqueue(new Reply(401, "{\"detail\":\"x\",\"code\":\"UNAUTHORIZED\"}", 0,
                "Content-Type", "application/problem+json; charset=utf-8"));
        assertEquals(200, executor.execute(get("/x").build()).statusCode());
        assertEquals(2, server.proxyRequests().size());
    }

    @Test
    void timeoutBecomesScalekitTimeoutException() {
        server.enqueue(new Reply(200, "{}", 3000));
        long start = System.nanoTime();
        assertThrows(ScalekitTimeoutException.class,
                () -> executor.execute(get("/slow").timeout(Duration.ofMillis(300)).build()));
        assertTrue(System.nanoTime() - start < Duration.ofSeconds(2).toNanos(), "the deadline was not honoured");
    }

    @Test
    void refusedConnectionBecomesScalekitConnectionException() throws Exception {
        int closedPort;
        try (ServerSocket socket = new ServerSocket(0)) {
            closedPort = socket.getLocalPort();
        }
        ProxyExecutor refused = new ProxyExecutor("http://127.0.0.1:" + closedPort, credentials, this::newTransport);
        assertThrows(ScalekitConnectionException.class, () -> refused.execute(get("/x").build()));
    }

    @Test
    void interruptedThreadSendsNothing() {
        Thread.currentThread().interrupt();
        ScalekitConnectionException e = assertThrows(ScalekitConnectionException.class,
                () -> executor.execute(get("/x").build()));
        assertTrue(e.getCause() instanceof InterruptedException);
        assertTrue(Thread.currentThread().isInterrupted(), "the interrupt flag stays set");
        assertTrue(server.proxyRequests().isEmpty());
    }

    @Test
    void tokenFailureBecomesAuthenticationExceptionWithoutAProxyCall() {
        when(authClient.getClientAccessToken()).thenThrow(new RuntimeException("invalid_client"));
        ProxyExecutor failing = new ProxyExecutor(server.baseUrl(), new ScalekitCredentials(authClient),
                this::newTransport);
        assertThrows(AuthenticationException.class, () -> failing.execute(get("/x").build()));
        assertTrue(server.proxyRequests().isEmpty());
    }

    @Test
    void headRequestHasNoBody() {
        ProxyResponse response = executor.execute(get("/x").method("HEAD").build());
        assertEquals(200, response.statusCode());
        assertEquals(0, response.body().length);
        assertEquals("HEAD", server.proxyRequests().get(0).method);
    }

    // request(): the access token only ever goes to <environment URL>/proxy/.

    private static ActionsClient actions(ProxyExecutor proxy) {
        return new ScalekitActionsClient(null, null, null, null, null, proxy);
    }

    /**
     * Paths whose effective location leaves /proxy/ for a server that percent-decodes the path, reads
     * a backslash as a slash, collapses "//" and then resolves dot segments.
     */
    private static final String[] ESCAPING_PATHS = {
            "/x/../../outside",
            "/../outside",
            "..",
            "x/../../outside",
            "/x/../../outside?q=1",
            "/x/%2e%2e/%2e%2e/outside",
            "/x/%2E%2e/%2e%2E/outside",
            "/x%2f..%2f..%2foutside",
            "/x%2F..%2F..%2Foutside",
            "/x%2f%2e%2e%2f%2e%2e%2foutside",
            "/x\\..\\..\\outside",
            "/x%5c..%5c..%5coutside",
            "/x%5C%2e%2e%5Coutside",
            "/x/..\\..\\outside",
            // "//" is collapsed before ".." is resolved, so one ".." already pops the proxy prefix.
            "//..%2foutside/x",
            "/%2f..%2foutside/x",
            "/x//..%2f..%2fy",
    };

    @Test
    void requestRejectsPathsThatResolveOutsideTheProxyPrefixBeforeAnyIo() {
        ActionsClient actions = actions(executor);
        for (String path : ESCAPING_PATHS) {
            for (String method : new String[]{"GET", "POST"}) {
                assertThrows(IllegalArgumentException.class,
                        () -> actions.request(get(path).method(method).build()), method + " " + path);
            }
        }
        assertTrue(server.proxyRequests().isEmpty(), "nothing reached the server");
        verify(authClient, never()).getClientAccessToken();
    }

    @Test
    void requestUnderAnEnvironmentBasePathRejectsPathsThatLeaveItBeforeAnyIo() {
        ActionsClient actions = actions(new ProxyExecutor(server.baseUrl() + "/base/", credentials, this::newTransport));
        for (String path : new String[]{"/../x", "/../../x", "/%2e%2e/x", "/..%2f..%2fx", "/x%2F..%2F..%2F..%2Fx",
                "\\..\\x", "//..%2fx", "/%2f..%2fx"}) {
            assertThrows(IllegalArgumentException.class, () -> actions.request(get(path).build()), path);
        }
        assertTrue(server.proxyRequests().isEmpty(), "nothing reached the server");
        verify(authClient, never()).getClientAccessToken();

        actions.request(get("/drive/v3/about").build());
        assertEquals("/base/proxy/drive/v3/about", server.proxyRequests().get(0).uri);
    }

    @Test
    void requestSendsPathsThatStayUnderTheProxyPrefixUnchanged() {
        ActionsClient actions = actions(executor);
        String[][] sent = {
                {"/drive/v3/about?fields=user", "/proxy/drive/v3/about?fields=user"},
                {"/files/my file.txt", "/proxy/files/my%20file.txt"},
                {"/files/a%2Fb", "/proxy/files/a%2Fb"},
                {"/", "/proxy/"},
                {"//double", "/proxy//double"},
                {"/files/...", "/proxy/files/..."},
                {"/files/a\\b", "/proxy/files/a%5Cb"},
                // Control characters are percent-encoded, so ".\t." reaches the server as ".%09.": a
                // three-character segment, not "..", and the path stays under /proxy/.
                {"/x/.\t./.\t./outside", "/proxy/x/.%09./.%09./outside"},
                {"/x/.\r\n./outside", "/proxy/x/.%0D%0A./outside"},
                {"/x\ny", "/proxy/x%0Ay"},
                // Surrounding whitespace is trimmed before the path is checked, so the check sees what is sent.
                {"/x\n", "/proxy/x"},
        };
        for (String[] pair : sent) {
            actions.request(get(pair[0]).build());
        }
        List<Recorded> requests = server.proxyRequests();
        assertEquals(sent.length, requests.size());
        for (int i = 0; i < sent.length; i++) {
            assertEquals(sent[i][1], requests.get(i).uri, sent[i][0]);
        }
    }

    @Test
    void scalekitUnauthorizedResendGoesToTheSameCheckedUri() {
        primeTokenFromAnEarlierGrpcCall();
        server.enqueue(new Reply(401, "{\"detail\":\"invalid token\",\"code\":\"UNAUTHORIZED\"}", 0,
                "Content-Type", "application/json"));
        ActionsClient actions = actions(new ProxyExecutor(server.baseUrl() + "/base", credentials, this::newTransport));
        assertEquals(200, actions.request(get("/drive/v3/about").queryParam("fields", "user").build()).statusCode());
        List<Recorded> requests = server.proxyRequests();
        assertEquals(2, requests.size());
        assertEquals("/base/proxy/drive/v3/about?fields=user", requests.get(0).uri);
        assertEquals(requests.get(0).uri, requests.get(1).uri);
        assertEquals("Bearer token-2", requests.get(1).headers.getFirst("Authorization"));
    }

    private static void assertNoSecretInChain(Throwable e) {
        for (Throwable t = e; t != null; t = t.getCause()) {
            assertFalse(String.valueOf(t.getMessage()).contains("SECRET"), String.valueOf(t.getMessage()));
        }
    }

    @Test
    void malformedPercentEscapeIsRejectedBeforeAnyIoWithoutEchoingTheUrl() {
        ActionsClient actions = actions(executor);
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> actions.request(get("/bad%zz").queryParam("access_token", "SECRET").build()));
        assertEquals("path has a malformed percent escape; encode '%' as %25", e.getMessage());
        assertNoSecretInChain(e);
        for (String path : new String[]{"/bad%zz?access_token=SECRET", "/ok?access_token=SECRET&x=%z", "/bad%2"}) {
            IllegalArgumentException inPath = assertThrows(IllegalArgumentException.class,
                    () -> actions.request(get(path).build()), path);
            assertTrue(inPath.getMessage().contains("malformed percent escape"), inPath.getMessage());
            assertNoSecretInChain(inPath);
        }
        assertTrue(server.proxyRequests().isEmpty(), "nothing reached the server");
        verify(authClient, never()).getClientAccessToken();
    }

    @Test
    void environmentUrlThatIsNotAValidUriIsRejectedBeforeAnyIoWithoutEchoingTheUrl() {
        ActionsClient actions = actions(new ProxyExecutor(server.baseUrl() + "/b%zz", credentials, this::newTransport));
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> actions.request(get("/x?access_token=SECRET").queryParam("token", "SECRET").build()));
        assertTrue(e.getMessage().contains("not a valid URI"), e.getMessage());
        assertNull(e.getCause(), "the JDK's exception carries the whole URL and is not chained");
        assertNoSecretInChain(e);
        assertTrue(server.proxyRequests().isEmpty(), "nothing reached the server");
        verify(authClient, never()).getClientAccessToken();
    }
}
