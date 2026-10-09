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
        guard("https://env.example/proxy/files/a%2Fb", "/proxy/");
        guard("https://env.example/proxy/files/a%2F...%2Fb", "/proxy/");
        guard("https://env.example/proxy/files/a%2f.b", "/proxy/");
        guard("https://env.example/proxy/files/100%25", "/proxy/");
    }

    @Test
    void proxyRequestRejectsDotSegmentsFormedByEncodedSlashesButKeepsOtherEncodedSlashes() {
        for (String path : new String[]{"/a%2f..%2fb", "/a%2F.%2Fb", "/x/%2e%2E", "/a%2f%2e%2e%2fb", "/a/..%2fb",
                "/a\\..\\b", "/a%5c..%5Cb", "/a/.\\b"}) {
            assertThrows(IllegalArgumentException.class,
                    () -> com.scalekit.models.proxy.ProxyRequest.builder("c", "u", path).build(), path);
            assertThrows(IllegalArgumentException.class, () -> com.scalekit.models.proxy.ResumableUploadRequest
                    .builder("c", "u", path).content(new byte[0]).build(), path);
        }
        for (String path : new String[]{"/files/a%2Fb", "/files/a%2F...%2Fb", "/files/.x", "/files/x.", "/a%2f.b",
                "/q?next=/../x", "/100%25", "/bad%zz", "/a\\b", "/a%5C...%5Cb"}) {
            assertEquals(path, com.scalekit.models.proxy.ProxyRequest.builder("c", "u", path).build().path(), path);
        }
    }

    @Test
    void pathsThatLeaveTheProxyFail() {
        for (String uri : new String[]{"https://env.example/proxy/../x", "https://env.example/proxy/a/%2E%2e/x",
                "https://env.example/proxy/./x", "https://env.example/proxyx", "https://env.example/other/proxy/x",
                "https://env.example/proxy/a/%2e", "https://env.example/proxy/a%2f..%2fb",
                "https://env.example/proxy/a%2F.%2Fb", "https://env.example/proxy/a/%2E%2e%2Fx",
                "https://env.example/proxy/a%2f%2e%2e", "https://env.example/proxy/a%5C..%5Cb",
                "https://env.example/proxy/a%5c%2e%2e"}) {
            assertThrows(IllegalArgumentException.class, () -> guard(uri, "/proxy/"), uri);
        }
        assertThrows(IllegalArgumentException.class, () -> guard("https://env.example/proxy/x", "/base/proxy/"));
    }
}
