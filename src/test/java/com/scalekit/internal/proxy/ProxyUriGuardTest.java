package com.scalekit.internal.proxy;

import org.junit.jupiter.api.Test;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.*;

/** The last check before a request carrying the access token is sent: the URI stays under the proxy prefix. */
class ProxyUriGuardTest {

    private static void guard(String uri, String prefix) {
        ProxyExecutor.requireUnderProxy(URI.create(uri), prefix);
    }

    @Test
    void pathsUnderTheProxyPrefixPass() {
        guard("https://env.example/proxy/upload/drive/v3/files?uploadType=resumable", "/proxy/");
        guard("https://env.example/proxy/a//b", "/proxy/");
        guard("https://env.example/proxy/a/.%09./x", "/proxy/");
        guard("https://env.example/proxy/a/...", "/proxy/");
        guard("https://env.example/base/proxy/x", "/base/proxy/");
    }

    @Test
    void pathsThatLeaveTheProxyFail() {
        for (String uri : new String[]{"https://env.example/proxy/../x", "https://env.example/proxy/a/%2E%2e/x",
                "https://env.example/proxy/./x", "https://env.example/proxyx", "https://env.example/other/proxy/x",
                "https://env.example/proxy/a/%2e"}) {
            assertThrows(IllegalArgumentException.class, () -> guard(uri, "/proxy/"), uri);
        }
        assertThrows(IllegalArgumentException.class, () -> guard("https://env.example/proxy/x", "/base/proxy/"));
    }
}
