package com.scalekit.internal.proxy;

import com.scalekit.internal.proxy.StubHttpServer.Reply;
import com.scalekit.models.proxy.ProxyRequest;
import com.scalekit.models.proxy.ProxyResponse;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

/** The java.net.http transport, used on Java 11 and later. Skipped on Java 8. */
class JdkHttpClientTransportTest extends ProxyExecutorContract {

    @BeforeEach
    void requireJavaNetHttp() {
        Assumptions.assumeTrue(JdkHttpClientTransport.isAvailable(), "java.net.http is not available on this JDK");
    }

    @Override
    HttpTransport newTransport() {
        return new JdkHttpClientTransport();
    }

    @Override
    boolean dropsUnauthorizedBodyOnStreamedRequests() {
        return false;
    }

    @Test
    void isTheDefaultWhenAvailable() {
        assertTrue(ProxyExecutor.defaultTransport() instanceof JdkHttpClientTransport);
    }

    @Test
    void scalekitUnauthorizedOnAPostIsResentOnce() {
        primeTokenFromAnEarlierGrpcCall();
        server.enqueue(new Reply(401, "{\"detail\":\"invalid token\",\"code\":\"UNAUTHORIZED\"}", 0, "Content-Type", "application/json"));
        ProxyResponse response = executor.execute(ProxyRequest.builder("gmail", "user_1", "/x").method("POST")
                .jsonBody(Collections.singletonMap("a", 1)).build());
        assertEquals(200, response.statusCode());
        assertEquals(2, server.proxyRequests().size());
        assertEquals("{\"a\":1}", server.proxyRequests().get(1).bodyText());
    }
}
