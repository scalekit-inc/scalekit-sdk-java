package com.scalekit;

import com.scalekit.exceptions.AuthenticationException;
import com.scalekit.exceptions.ProxyException;
import com.scalekit.internal.proxy.StubHttpServer;
import com.scalekit.internal.proxy.StubHttpServer.Recorded;
import com.scalekit.internal.proxy.StubHttpServer.Reply;
import com.scalekit.models.proxy.ProxyRequest;
import com.scalekit.models.proxy.ProxyResponse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The AgentKit accessors and the REST proxy through the public API only, so this class also runs
 * against the packaged (shaded) jar. The stub server plays both the token endpoint and the proxy.
 */
class ScalekitClientAgentKitTest {

    private StubHttpServer server;
    private ScalekitClient client;

    @BeforeEach
    void setUp() throws Exception {
        server = new StubHttpServer();
        client = new ScalekitClient(server.baseUrl(), "client-id", "client-secret");
    }

    @AfterEach
    void tearDown() {
        server.close();
    }

    @Test
    void accessorsReturnTheSameInstancesAndConstructionMakesNoCalls() {
        assertSame(client.tools(), client.tools());
        assertSame(client.connectedAccounts(), client.connectedAccounts());
        assertSame(client.actions(), client.actions());
        assertSame(client.actions().mcp(), client.actions().mcp());
        assertSame(client.actions().providers(), client.actions().providers());
        assertTrue(server.tokenRequests().isEmpty());
        assertTrue(server.proxyRequests().isEmpty());
    }

    @Test
    void firstProxyCallFetchesATokenAndSendsIt() {
        ProxyResponse response = client.actions().request(
                ProxyRequest.builder("gmail", "user_1", "/gmail/v1/users/me/profile").build());
        assertEquals(200, response.statusCode());
        assertEquals(1, server.tokenRequests().size());
        assertTrue(server.tokenRequests().get(0).bodyText().contains("grant_type=client_credentials"));
        Recorded request = server.proxyRequests().get(0);
        assertEquals("/proxy/gmail/v1/users/me/profile", request.uri);
        assertEquals("Bearer token-1", request.headers.getFirst("Authorization"));
        assertEquals("gmail", request.headers.getFirst("Connection_name"));
        assertEquals("user_1", request.headers.getFirst("Identifier"));
    }

    @Test
    void rejectionOfAFreshlyFetchedTokenIsNotRetried() {
        server.enqueue(new Reply(401, "{\"detail\":\"token expired\",\"code\":\"UNAUTHORIZED\"}", 0, "Content-Type", "application/json"));
        ProxyException e = assertThrows(ProxyException.class,
                () -> client.actions().request(ProxyRequest.builder("gmail", "user_1", "/x").build()));
        assertEquals(401, e.statusCode());
        assertEquals(16, e.getGrpcStatusCode());
        assertEquals(1, server.proxyRequests().size());
        assertEquals(1, server.tokenRequests().size());
    }

    @Test
    void patchGoesThroughOnRuntimesThatSupportIt() {
        ProxyRequest patch = ProxyRequest.builder("slack", "user_1", "/items/1").method("PATCH")
                .jsonBody(Collections.singletonMap("done", true)).build();
        try {
            client.actions().request(patch);
            assertEquals("PATCH", server.proxyRequests().get(0).method);
        } catch (UnsupportedOperationException unsupported) {
            assertTrue(server.proxyRequests().isEmpty());
        }
    }

    @Test
    void errorStatusIsAProxyException() {
        server.enqueue(new Reply(403, "{\"detail\":\"proxy disabled\",\"code\":\"TOOL_PROXY_DISABLED\"}", 0));
        ProxyException e = assertThrows(ProxyException.class,
                () -> client.actions().request(ProxyRequest.builder("gmail", "user_1", "/x").build()));
        assertEquals(403, e.statusCode());
        assertEquals("TOOL_PROXY_DISABLED", e.getScalekitErrorCode());
        assertEquals(7, e.getGrpcStatusCode());
    }

    @Test
    void tokenEndpointFailureIsAnAuthenticationException() {
        server.failTokenRequests(401);
        assertThrows(AuthenticationException.class,
                () -> client.actions().request(ProxyRequest.builder("gmail", "user_1", "/x").build()));
        assertTrue(server.proxyRequests().isEmpty());
    }

    @Test
    void validationHappensBeforeAnyCall() {
        assertThrows(IllegalArgumentException.class, () -> client.tools().execute(" ", null));
        assertThrows(IllegalArgumentException.class, () -> client.connectedAccounts().create("", "u"));
        assertThrows(IllegalArgumentException.class, () -> client.actions().request(null));
        assertTrue(server.tokenRequests().isEmpty());
    }
}
