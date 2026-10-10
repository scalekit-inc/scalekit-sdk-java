package com.scalekit.internal.proxy;

import com.scalekit.exceptions.ProxyException;
import com.scalekit.internal.proxy.StubHttpServer.Reply;
import com.scalekit.models.proxy.ProxyRequest;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;

/** The HttpURLConnection transport, used on Java 8 and where java.net.http is missing. */
class UrlConnectionTransportTest extends ProxyExecutorContract {

    @Override
    HttpTransport newTransport() {
        return new UrlConnectionTransport();
    }

    @Override
    boolean dropsUnauthorizedBodyOnStreamedRequests() {
        return true;
    }

    @Test
    void customMethodsWorkOnJava8AndAreRejectedWhereTheJdkIsClosed() {
        String spec = System.getProperty("java.specification.version");
        boolean java8 = spec.startsWith("1.");
        int feature = java8 ? 8 : Integer.parseInt(spec.split("\\.")[0]);
        boolean supported = new UrlConnectionTransport().supportsMethod("PATCH");
        if (feature <= 15) {
            assertTrue(supported, "PATCH must work on Java " + feature);
        } else {
            assertFalse(supported, "PATCH cannot be sent through HttpURLConnection on Java " + feature);
        }
        assertTrue(new UrlConnectionTransport().supportsMethod("DELETE"));
    }

    @Test
    void unauthorizedToAStreamedRequestIsNotResentButRefreshesTheToken() {
        primeTokenFromAnEarlierGrpcCall();
        server.enqueue(new Reply(401, "{\"detail\":\"invalid token\",\"code\":\"UNAUTHORIZED\"}", 0, "Content-Type", "application/json"));
        ProxyRequest post = ProxyRequest.builder("gmail", "user_1", "/x").method("POST")
                .jsonBody(Collections.singletonMap("a", 1)).build();
        ProxyException e = assertThrows(ProxyException.class, () -> executor.execute(post));
        assertEquals(401, e.statusCode());
        assertEquals(1, server.proxyRequests().size(), "a 401 that cannot be attributed is never resent");
        verify(authClient, atLeast(2)).getClientAccessToken();
    }
}
