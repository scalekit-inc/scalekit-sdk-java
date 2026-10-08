package com.scalekit.internal.proxy;

import com.scalekit.internal.proxy.StubHttpServer.Reply;
import com.scalekit.models.proxy.ResumableUploadRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/** Resumable uploads over the HttpURLConnection transport, used on Java 8 and where java.net.http is missing. */
class UrlConnectionResumableUploadTest extends ResumableUploaderContract {

    @Override
    HttpTransport newTransport() {
        return new UrlConnectionTransport();
    }

    @Test
    void a401WhoseBodyWasDiscardedOnAChunkIsRetriedOnce() {
        // HttpURLConnection discards the body of a 401 to a streamed PUT, so the SDK cannot tell
        // whether Scalekit rejected its token (now refreshed) or the provider did.
        server.enqueue(started(), new Reply(401, "{\"detail\":\"invalid token\",\"code\":\"UNAUTHORIZED\"}", 0,
                "Content-Type", "application/json"), new Reply(308, "", 0), done("{\"id\":\"f\"}"));

        Map<String, Object> file = uploader.upload(upload().content(data(10)).build());

        assertEquals("f", file.get("id"));
        assertEquals(4, server.proxyRequests().size(), "start, chunk (401), status query, chunk");
        assertEquals("bytes */10", contentRange(server.proxyRequests().get(2)));
        assertEquals(1, sleeps.size());
    }

    @Test
    void a401WhoseBodyWasDiscardedUsesTheNormalRetryBudget() {
        Reply unauthorized = new Reply(401, "{\"error\":\"x\"}", 0, "Content-Type", "application/json");
        server.enqueue(started(), unauthorized, unauthorized);
        UploadExceptionHolder.assertUploadException(401,
                () -> uploader.upload(upload().content(data(10)).maxRetries(1).build()));
        assertEquals(3, server.proxyRequests().size());
    }

    @Test
    void a401WhoseBodyWasDiscardedOnTheStartIsNeverRetried() {
        server.enqueue(new Reply(401, "{\"error\":\"x\"}", 0, "Content-Type", "application/json"));
        UploadExceptionHolder.assertUploadException(401, () -> uploader.upload(upload()
                .metadata(java.util.Collections.singletonMap("name", "a")).content(data(10)).build()));
        assertEquals(1, server.proxyRequests().size());
        assertTrue(sleeps.isEmpty());
    }

    @Test
    void anUnsupportedMethodFailsBeforeTheContentIsRead() {
        Assumptions.assumeFalse(new UrlConnectionTransport().supportsMethod("PATCH"),
                "this runtime can send PATCH through HttpURLConnection");
        final int[] reads = {0};
        ByteArrayInputStream content = new ByteArrayInputStream(data(10)) {
            @Override
            public synchronized int read(byte[] b, int off, int len) {
                reads[0]++;
                return super.read(b, off, len);
            }

            @Override
            public synchronized int read() {
                reads[0]++;
                return super.read();
            }
        };
        assertThrows(UnsupportedOperationException.class, () -> uploader.upload(ResumableUploadRequest
                .builder("googledrive", "user_1", "/upload/drive/v3/files/f").method("PATCH").content(content).build()));
        assertEquals(0, reads[0], "the caller's stream was not consumed");
        assertTrue(server.proxyRequests().isEmpty());
    }
}
