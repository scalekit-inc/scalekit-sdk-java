package com.scalekit.models.proxy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Collections;
import java.util.OptionalLong;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;

class ResumableUploadRequestTest {

    private static ResumableUploadRequest.Builder valid() {
        return ResumableUploadRequest.builder(" googledrive ", " user_1 ", "upload/drive/v3/files").content(new byte[3]);
    }

    @Test
    void defaultsAndNormalisation() {
        ResumableUploadRequest request = valid().build();
        assertEquals("googledrive", request.connectionName());
        assertEquals("user_1", request.identifier());
        assertEquals("/upload/drive/v3/files", request.path());
        assertEquals("POST", request.method());
        assertEquals("application/octet-stream", request.contentType());
        assertEquals(4 * 1024 * 1024, request.chunkSize());
        assertEquals(3, request.maxRetries());
        assertEquals(Duration.ofSeconds(60), request.timeout());
        assertFalse(request.metadata().isPresent());
        assertFalse(request.onProgress().isPresent());
        assertTrue(request.queryParams().isEmpty());
        assertEquals(OptionalLong.of(3), request.totalBytes());
        assertEquals("PATCH", valid().method("pAtCh").build().method());
    }

    @Test
    void totalBytesComesFromTheContentSource(@TempDir Path dir) throws IOException {
        Path file = dir.resolve("a.bin");
        Files.write(file, new byte[1234]);
        assertEquals(OptionalLong.of(1234), base().content(file).build().totalBytes());
        assertEquals(OptionalLong.of(9), base().content(new ByteArrayInputStream(new byte[9]), 9).build().totalBytes());
        assertEquals(OptionalLong.empty(), base().content(new ByteArrayInputStream(new byte[9])).build().totalBytes());
    }

    private static ResumableUploadRequest.Builder base() {
        return ResumableUploadRequest.builder("googledrive", "user_1", "/upload/drive/v3/files");
    }

    @Test
    void invalidInputIsRejected(@TempDir Path dir) {
        assertThrows(IllegalArgumentException.class, () -> ResumableUploadRequest.builder(" ", "u", "/p").content(new byte[0]).build());
        assertThrows(IllegalArgumentException.class, () -> ResumableUploadRequest.builder("c", null, "/p").content(new byte[0]).build());
        assertThrows(IllegalArgumentException.class, () -> ResumableUploadRequest.builder("c", "u", "").content(new byte[0]).build());
        assertThrows(IllegalArgumentException.class, () -> ResumableUploadRequest.builder("c", "us\u00e9r", "/p").content(new byte[0]).build());
        assertThrows(IllegalArgumentException.class, () -> ResumableUploadRequest.builder("c", "u", "/p?uploadType=media").content(new byte[0]).build());
        assertThrows(IllegalArgumentException.class, () -> ResumableUploadRequest.builder("c", "u", "/p#x").content(new byte[0]).build());
        assertThrows(IllegalArgumentException.class, () -> ResumableUploadRequest.builder("c", "u", "/a/../p").content(new byte[0]).build());
        assertThrows(IllegalArgumentException.class, () -> ResumableUploadRequest.builder("c", "u", "/a/%2E/p").content(new byte[0]).build());
        for (String dots : new String[]{"/a/%2e/p", "/a/%2e%2e/p", "/a/%2E%2e/p", "/a/.%2E/p", "/a/%2e."}) {
            assertThrows(IllegalArgumentException.class,
                    () -> ResumableUploadRequest.builder("c", "u", dots).content(new byte[0]).build(), dots);
        }
        assertEquals("/a/%2e%2ex/p", ResumableUploadRequest.builder("c", "u", "/a/%2e%2ex/p").content(new byte[0])
                .build().path(), "a segment that only starts with dots is a normal name");
        for (String bad : new String[]{"/upload/.\t./x", "/upload/.\n./x", "/upload/..\r/x", "/a b", "/a\u0000",
                "/a\u007f", "/a\u001f", " /a", "/a "}) {
            assertThrows(IllegalArgumentException.class,
                    () -> ResumableUploadRequest.builder("c", "u", bad).content(new byte[0]).build(), bad);
        }
        assertEquals("/a/%20b", ResumableUploadRequest.builder("c", "u", "/a/%20b").content(new byte[0]).build().path());
        assertThrows(IllegalArgumentException.class, () -> valid().method("GET").build());
        assertThrows(IllegalArgumentException.class, () -> valid().method(null).build());
        assertThrows(IllegalArgumentException.class, () -> valid().contentType(" ").build());
        assertThrows(IllegalArgumentException.class, () -> valid().contentType("text/plain; name=\u00e9").build());
        assertThrows(IllegalArgumentException.class, () -> valid().contentType("text/plain\r\nX-Injected: 1").build());
        assertThrows(IllegalArgumentException.class, () -> valid().contentType("text/plain\n").build());
        assertThrows(IllegalArgumentException.class, () -> valid().contentType("text/\rplain").build());
        assertThrows(IllegalArgumentException.class, () -> valid().chunkSize(0).build());
        assertThrows(IllegalArgumentException.class, () -> valid().chunkSize(-262144).build());
        assertThrows(IllegalArgumentException.class, () -> valid().chunkSize(1_000_000).build());
        assertThrows(IllegalArgumentException.class, () -> valid().maxRetries(-1).build());
        assertThrows(IllegalArgumentException.class, () -> valid().timeout(Duration.ZERO).build());
        assertThrows(IllegalArgumentException.class, () -> valid().timeout(null).build());
        assertThrows(IllegalArgumentException.class, () -> valid().queryParam("uploadType", "media"));
        assertThrows(IllegalArgumentException.class, () -> valid().queryParams(Collections.singletonMap("uploadType", "x")));
        assertThrows(IllegalArgumentException.class, () -> valid().queryParam("a", null));
        assertThrows(IllegalArgumentException.class, () -> valid().metadata(null));
        assertThrows(IllegalArgumentException.class, () -> valid().metadata(Collections.singletonMap("a", new Object())));
        assertThrows(IllegalArgumentException.class, () -> valid().onProgress(null));
        assertThrows(IllegalArgumentException.class, () -> base().build(), "content is required");
        assertThrows(IllegalArgumentException.class, () -> valid().content(new byte[1]), "only one content source");
        assertThrows(IllegalArgumentException.class, () -> base().content((byte[]) null));
        assertThrows(IllegalArgumentException.class, () -> base().content((InputStream) null));
        assertThrows(IllegalArgumentException.class, () -> base().content((Path) null));
        assertThrows(IllegalArgumentException.class, () -> base().content(new ByteArrayInputStream(new byte[0]), -1));
        assertThrows(IllegalArgumentException.class, () -> base().content(dir.resolve("missing.bin")).build());
        assertThrows(IllegalArgumentException.class, () -> base().content(dir).build(), "a directory is not a file");
    }

    @Test
    void otherCaseVariantsOfUploadTypeAreOrdinaryParameters() {
        assertEquals(Collections.singletonList("x"), valid().queryParam("uploadtype", "x").build().queryParams().get("uploadtype"));
    }

    @Test
    void openContentNeverClosesTheCallersStream() throws IOException {
        final boolean[] closed = {false};
        InputStream stream = new ByteArrayInputStream(new byte[]{1, 2}) {
            @Override
            public void close() {
                closed[0] = true;
            }
        };
        ResumableUploadRequest request = base().content(stream).build();
        try (InputStream in = request.openContent()) {
            assertEquals(1, in.read());
        }
        assertFalse(closed[0]);
    }

    @Test
    void toStringHidesContentAndMetadataValues() {
        Consumer<UploadProgress> callback = p -> { };
        String text = base().content("secret-bytes".getBytes(java.nio.charset.StandardCharsets.UTF_8))
                .metadata(Collections.singletonMap("name", "private-name.pdf"))
                .onProgress(callback)
                .build().toString();
        assertFalse(text.contains("secret-bytes"), text);
        assertFalse(text.contains("private-name"), text);
        assertTrue(text.contains("byte[12]"), text);
        assertTrue(text.contains("[name]"), text);
    }

    @Test
    void uploadProgress() {
        assertEquals(OptionalLong.empty(), UploadProgress.of(5).totalBytes());
        assertEquals(OptionalLong.of(10), UploadProgress.of(5, 10).totalBytes());
        assertEquals(5, UploadProgress.of(5, 10).bytesCommitted());
        assertEquals(UploadProgress.of(5, 10), UploadProgress.of(5, 10));
        assertEquals(UploadProgress.of(5, 10).hashCode(), UploadProgress.of(5, 10).hashCode());
        assertNotEquals(UploadProgress.of(5), UploadProgress.of(5, 5));
        assertEquals("UploadProgress{bytesCommitted=5, totalBytes=unknown}", UploadProgress.of(5).toString());
        assertThrows(IllegalArgumentException.class, () -> UploadProgress.of(-1));
        assertThrows(IllegalArgumentException.class, () -> UploadProgress.of(5, 4));
        assertThrows(IllegalArgumentException.class, () -> UploadProgress.of(0, -1));
    }
}
