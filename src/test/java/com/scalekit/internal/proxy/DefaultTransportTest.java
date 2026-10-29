package com.scalekit.internal.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DefaultTransportTest {

    @Test
    void java8UsesHttpUrlConnection() {
        if (System.getProperty("java.specification.version").startsWith("1.")) {
            assertTrue(ProxyExecutor.defaultTransport() instanceof UrlConnectionTransport);
        } else {
            assertTrue(ProxyExecutor.defaultTransport() instanceof JdkHttpClientTransport);
        }
    }
}
