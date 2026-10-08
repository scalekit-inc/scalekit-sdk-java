package com.scalekit;

import com.scalekit.exceptions.APIException;
import com.scalekit.exceptions.UploadException;
import com.scalekit.models.proxy.ProxyRequest;
import com.scalekit.models.proxy.ResumableUploadRequest;
import com.scalekit.models.proxy.UploadProgress;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.ByteArrayInputStream;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Live resumable uploads to Google Drive. They need SCALEKIT_ENVIRONMENT_URL,
 * SCALEKIT_CLIENT_ID and SCALEKIT_CLIENT_SECRET, plus TEST_AGENTKIT_UPLOAD_IDENTIFIER (an
 * identifier with an active Google Drive account) and optionally TEST_AGENTKIT_UPLOAD_CONNECTION
 * (default {@code googledrive}). Every test skips when they are missing.
 *
 * <p>Files are named {@code sdk-upload-test-java-<run>-*}. Afterwards every file with this run's
 * prefix is deleted, together with any "Untitled" file created during the run (an upload that fails
 * after its session started can leave one behind).
 */
@Tag("live")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ResumableUploadLiveTest {

    private static final int KIB_256 = 256 * 1024;

    private ScalekitClient client;
    private String connection;
    private String identifier;
    private String run;
    private Instant runStarted;
    private final List<String> createdFiles = Collections.synchronizedList(new ArrayList<String>());

    @BeforeAll
    void setUp() {
        String url = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String id = System.getenv("SCALEKIT_CLIENT_ID");
        String secret = System.getenv("SCALEKIT_CLIENT_SECRET");
        identifier = trimToNull(System.getenv("TEST_AGENTKIT_UPLOAD_IDENTIFIER"));
        Assumptions.assumeTrue(url != null && id != null && secret != null, "Scalekit credentials are not set");
        Assumptions.assumeTrue(identifier != null, "TEST_AGENTKIT_UPLOAD_IDENTIFIER is not set");
        String configured = trimToNull(System.getenv("TEST_AGENTKIT_UPLOAD_CONNECTION"));
        connection = configured == null ? "googledrive" : configured;
        client = new ScalekitClient(url, id, secret);
        run = UUID.randomUUID().toString().replace("-", "").substring(0, 10);
        runStarted = Instant.now().minus(5, ChronoUnit.SECONDS).truncatedTo(ChronoUnit.SECONDS);
    }

    @AfterAll
    void cleanUp() {
        if (client == null) {
            return;
        }
        for (String fileId : new ArrayList<>(createdFiles)) {
            deleteQuietly(fileId);
        }
        // Then sweep: anything left with this run's prefix, and orphans from failed uploads.
        deleteMatching("name contains '" + prefix() + "' and trashed = false");
        deleteMatching("name = 'Untitled' and createdTime > '" + runStarted + "' and trashed = false");
    }

    private void deleteMatching(String query) {
        try {
            Map<String, Object> listed = client.actions().request(ProxyRequest
                    .builder(connection, identifier, "/drive/v3/files")
                    .queryParam("q", query)
                    .queryParam("fields", "files(id)")
                    .build()).bodyAsJsonObject();
            Object files = listed.get("files");
            if (files instanceof List) {
                for (Object file : (List<?>) files) {
                    deleteQuietly((String) ((Map<?, ?>) file).get("id"));
                }
            }
        } catch (APIException ignored) {
            // Best effort: nothing else to clean.
        }
    }

    private void deleteQuietly(String fileId) {
        try {
            client.actions().request(ProxyRequest.builder(connection, identifier, "/drive/v3/files/" + fileId)
                    .method("DELETE").build());
        } catch (APIException ignored) {
            // already gone
        }
    }

    private static String trimToNull(String value) {
        return value == null || value.trim().isEmpty() ? null : value.trim();
    }

    private static byte[] data(int size) {
        byte[] bytes = new byte[size];
        for (int i = 0; i < size; i++) {
            bytes[i] = (byte) (i * 31 + i / 7);
        }
        return bytes;
    }

    private String prefix() {
        return "sdk-upload-test-java-" + run + "-";
    }

    private ResumableUploadRequest.Builder newFile(String suffix) {
        return ResumableUploadRequest.builder(connection, identifier, "/upload/drive/v3/files")
                .metadata(Collections.singletonMap("name", prefix() + suffix))
                .chunkSize(KIB_256);
    }

    private String track(Map<String, Object> file) {
        String fileId = (String) file.get("id");
        assertNotNull(fileId, "the response is the Drive file: " + file.keySet());
        createdFiles.add(fileId);
        return fileId;
    }

    private String sizeOf(String fileId) {
        Map<String, Object> file = client.actions().request(ProxyRequest
                .builder(connection, identifier, "/drive/v3/files/" + fileId)
                .queryParam("fields", "size")
                .build()).bodyAsJsonObject();
        return String.valueOf(file.get("size"));
    }

    @Test
    void knownSizeInChunksReportsProgressAndUploadsEveryByte() {
        List<UploadProgress> progress = new ArrayList<>();
        Map<String, Object> file = client.actions().uploadResumable(newFile("known.bin")
                .content(data(600 * 1024))
                .contentType("application/octet-stream")
                .onProgress(progress::add)
                .build());

        String fileId = track(file);
        assertEquals("614400", sizeOf(fileId));
        assertEquals(3, progress.size(), progress.toString());
        assertEquals(UploadProgress.of(KIB_256, 614400), progress.get(0));
        assertEquals(UploadProgress.of(614400, 614400), progress.get(2));
    }

    @Test
    void streamOfUnknownSize() {
        List<UploadProgress> progress = new ArrayList<>();
        Map<String, Object> file = client.actions().uploadResumable(newFile("stream.bin")
                .content(new ByteArrayInputStream(data(600 * 1024)))
                .onProgress(progress::add)
                .build());

        assertEquals("614400", sizeOf(track(file)));
        assertFalse(progress.get(0).totalBytes().isPresent(), "the total is unknown until the stream ends");
        assertEquals(UploadProgress.of(614400, 614400), progress.get(progress.size() - 1));
    }

    @Test
    void zeroBytes() {
        Map<String, Object> file = client.actions().uploadResumable(newFile("empty.bin").content(new byte[0]).build());
        assertEquals("0", sizeOf(track(file)));
    }

    @Test
    void patchReplacesAnExistingFilesContent() {
        String fileId = track(client.actions().uploadResumable(newFile("replace.bin").content(data(1000)).build()));

        Map<String, Object> replaced = client.actions().uploadResumable(ResumableUploadRequest
                .builder(connection, identifier, "/upload/drive/v3/files/" + fileId)
                .method("PATCH")
                .content(new ByteArrayInputStream(data(300 * 1024)), 300 * 1024)
                .chunkSize(KIB_256)
                .build());

        assertEquals(fileId, replaced.get("id"));
        assertEquals("307200", sizeOf(fileId));
    }

    @Test
    void patchOnAFileThatDoesNotExistIsAnUploadExceptionWith404() {
        UploadException e = assertThrows(UploadException.class, () -> client.actions().uploadResumable(
                ResumableUploadRequest.builder(connection, identifier, "/upload/drive/v3/files/doesnotexist")
                        .method("PATCH")
                        .content(data(10))
                        .build()));
        assertEquals(404, e.statusCode());
        assertFalse(e.uploadId().isPresent(), "the session never started");
    }
}
