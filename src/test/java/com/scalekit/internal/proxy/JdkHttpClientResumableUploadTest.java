package com.scalekit.internal.proxy;

import com.scalekit.internal.proxy.StubHttpServer.Reply;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/** Resumable uploads over the java.net.http transport, used on Java 11 and later. Skipped on Java 8. */
class JdkHttpClientResumableUploadTest extends ResumableUploaderContract {

    @BeforeEach
    void requireJavaNetHttp() {
        Assumptions.assumeTrue(JdkHttpClientTransport.isAvailable(), "java.net.http is not available on this JDK");
    }

    @Override
    HttpTransport newTransport() {
        return new JdkHttpClientTransport();
    }

    @Test
    void patchStartsASessionToReplaceAFilesContent() {
        server.enqueue(started(), done("{\"id\":\"file-1\"}"));
        Map<String, Object> file = uploader.upload(com.scalekit.models.proxy.ResumableUploadRequest
                .builder("googledrive", "user_1", "/upload/drive/v3/files/file-1")
                .method("patch")
                .content(data(10))
                .build());
        assertEquals("file-1", file.get("id"));
        assertEquals("PATCH", server.proxyRequests().get(0).method);
        assertEquals("/proxy/upload/drive/v3/files/file-1?uploadType=resumable", server.proxyRequests().get(0).uri);
        assertEquals("/proxy/upload/drive/v3/files/file-1?uploadType=resumable&upload_id=up-1",
                server.proxyRequests().get(1).uri);
    }

    @Test
    void scalekitRejectingTheTokenOnTheStartIsRefreshedAndResentOnce() {
        server.enqueue(new Reply(401, "{\"detail\":\"invalid token\",\"code\":\"UNAUTHORIZED\"}", 0,
                "Content-Type", "application/json"), started(), done("{}"));
        // The cold-start token is inside the refresh debounce, so let it age out first.
        primeOldToken();
        uploader.upload(upload().content(data(10)).metadata(Collections.singletonMap("name", "a")).build());
        assertEquals(3, server.proxyRequests().size());
        assertEquals("{\"name\":\"a\"}", server.proxyRequests().get(1).bodyText());
    }
}
