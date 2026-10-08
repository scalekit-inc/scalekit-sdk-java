package com.scalekit.internal.proxy;

import com.scalekit.api.AuthClient;
import com.scalekit.exceptions.ScalekitConnectionException;
import com.scalekit.exceptions.ScalekitTimeoutException;
import com.scalekit.exceptions.UploadException;
import com.scalekit.exceptions.UploadProtocolException;
import com.scalekit.exceptions.UploadSessionExpiredException;
import com.scalekit.internal.ScalekitCredentials;
import com.scalekit.internal.proxy.StubHttpServer.Recorded;
import com.scalekit.internal.proxy.StubHttpServer.Reply;
import com.scalekit.models.proxy.ResumableUploadRequest;
import com.scalekit.models.proxy.UploadProgress;
import io.grpc.CallCredentials;
import io.grpc.Metadata;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/** Resumable upload behaviour every proxy transport must show; subclasses pick the transport. */
abstract class ResumableUploaderContract {

    static final int KIB_256 = 256 * 1024;
    static final String UPLOAD_PATH = "/proxy/upload/drive/v3/files";
    static final String CHUNK_URI = UPLOAD_PATH + "?uploadType=resumable&upload_id=up-1";
    static final Instant NOW = Instant.parse("2026-10-08T12:00:00Z");

    StubHttpServer server;
    ScalekitCredentials credentials;
    ProxyExecutor executor;
    ResumableUploader uploader;
    final List<Long> sleeps = new ArrayList<>();
    final Set<Integer> failingCalls = new HashSet<>();
    final AtomicInteger calls = new AtomicInteger();
    /** The body array of every call the transport sent, in order (null for none). */
    final List<byte[]> sentBodies = java.util.Collections.synchronizedList(new ArrayList<byte[]>());
    double jitter = 0.5;

    abstract HttpTransport newTransport();

    @BeforeEach
    void setUp() throws Exception {
        server = new StubHttpServer();
        AuthClient authClient = mock(AuthClient.class);
        when(authClient.getClientAccessToken()).thenReturn("token-1", "token-2", "token-3");
        credentials = new ScalekitCredentials(authClient);
        executor = new ProxyExecutor(server.baseUrl(), credentials, this::flakyTransport);
        uploader = new ResumableUploader(executor, sleeps::add, () -> jitter, Clock.fixed(NOW, ZoneOffset.UTC));
    }

    /** Caches token-1 the way an earlier gRPC call would, outside the refresh debounce. */
    void primeOldToken() {
        credentials.applyRequestMetadata(null, Runnable::run, new CallCredentials.MetadataApplier() {
            @Override
            public void apply(Metadata headers) {
            }

            @Override
            public void fail(io.grpc.Status status) {
                throw new AssertionError(status.toString());
            }
        });
        assertEquals("token-1", credentials.getToken());
    }

    @AfterEach
    void tearDown() {
        server.close();
        Thread.interrupted();
    }

    /** The subclass's transport, failing the calls listed in {@link #failingCalls} with an IOException. */
    private HttpTransport flakyTransport() {
        final HttpTransport real = newTransport();
        return new HttpTransport() {
            @Override
            public boolean supportsMethod(String method) {
                return real.supportsMethod(method);
            }

            @Override
            public HttpResult send(HttpCall call) throws IOException, InterruptedException {
                sentBodies.add(call.body);
                if (failingCalls.contains(calls.incrementAndGet())) {
                    throw new IOException("connection reset");
                }
                return real.send(call);
            }
        };
    }

    static byte[] data(int size) {
        byte[] bytes = new byte[size];
        for (int i = 0; i < size; i++) {
            bytes[i] = (byte) (i * 31 + i / 7);
        }
        return bytes;
    }

    static ResumableUploadRequest.Builder upload() {
        return ResumableUploadRequest.builder("googledrive", "user_1", "upload/drive/v3/files").chunkSize(KIB_256);
    }

    static Reply started() {
        return new Reply(200, "", 0, "Location",
                "https://www.googleapis.com/upload/drive/v3/files?uploadType=resumable&upload_id=up-1");
    }

    static Reply committed(long lastByte) {
        return new Reply(308, "", 0, "Range", "bytes=0-" + lastByte);
    }

    static Reply done(String json) {
        return new Reply(200, json, 0, "Content-Type", "application/json; charset=UTF-8");
    }

    static Reply status(int status, String... headers) {
        return new Reply(status, "{\"error\":{\"code\":" + status + "}}", 0, headers);
    }

    static String contentRange(Recorded request) {
        return request.headers.getFirst("Content-Range");
    }

    static byte[] slice(byte[] data, int from, int to) {
        return Arrays.copyOfRange(data, from, to);
    }

    // ----- success paths -----

    @Test
    void knownSizeUploadsInChunksWithProgressAndReturnsTheResource() {
        byte[] content = data(600 * 1024);
        List<UploadProgress> progress = new ArrayList<>();
        server.enqueue(started(), committed(KIB_256 - 1), committed(2 * KIB_256 - 1),
                done("{\"id\":\"file-1\",\"size\":\"614400\"}"));
        Map<String, Object> metadata = new LinkedHashMap<>();
        metadata.put("name", "report.bin");
        metadata.put("parents", Collections.singletonList("folder-1"));

        Map<String, Object> file = uploader.upload(upload()
                .content(content)
                .contentType("application/pdf")
                .metadata(metadata)
                .queryParam("supportsAllDrives", "true")
                .onProgress(progress::add)
                .build());

        assertEquals("file-1", file.get("id"));
        List<Recorded> requests = server.proxyRequests();
        assertEquals(4, requests.size());
        Recorded start = requests.get(0);
        assertEquals("POST", start.method);
        assertEquals(UPLOAD_PATH + "?uploadType=resumable&supportsAllDrives=true", start.uri);
        assertEquals("application/pdf", start.headers.getFirst("X-Upload-Content-Type"));
        assertEquals("614400", start.headers.getFirst("X-Upload-Content-Length"));
        assertEquals("application/json; charset=UTF-8", start.headers.getFirst("Content-Type"));
        assertEquals("{\"name\":\"report.bin\",\"parents\":[\"folder-1\"]}", start.bodyText());
        assertEquals("googledrive", start.headers.getFirst("Connection_name"));
        assertEquals("user_1", start.headers.getFirst("Identifier"));
        assertEquals("Bearer token-1", start.headers.getFirst("Authorization"));

        String[] ranges = {"bytes 0-262143/614400", "bytes 262144-524287/614400", "bytes 524288-614399/614400"};
        for (int i = 0; i < 3; i++) {
            Recorded chunk = requests.get(i + 1);
            assertEquals("PUT", chunk.method);
            assertEquals(CHUNK_URI, chunk.uri, "chunks carry only uploadType and upload_id");
            assertEquals(ranges[i], contentRange(chunk));
            assertEquals("application/pdf", chunk.headers.getFirst("Content-Type"));
            assertNull(chunk.headers.getFirst("X-Upload-Content-Type"));
            assertArrayEquals(slice(content, i * KIB_256, Math.min((i + 1) * KIB_256, content.length)), chunk.body);
        }
        assertEquals(Arrays.asList(UploadProgress.of(KIB_256, 614400), UploadProgress.of(2 * KIB_256, 614400),
                UploadProgress.of(614400, 614400)), progress);
        assertTrue(sleeps.isEmpty());
    }

    @Test
    void withoutMetadataTheStartRequestHasNoBodyAndTheDefaultContentType() {
        server.enqueue(started(), done("{\"id\":\"f\"}"));
        uploader.upload(upload().content(data(10)).build());

        Recorded start = server.proxyRequests().get(0);
        assertEquals(0, start.body.length);
        String startType = start.headers.getFirst("Content-Type");
        assertFalse(startType != null && startType.startsWith("application/json"), startType);
        assertEquals("application/octet-stream", start.headers.getFirst("X-Upload-Content-Type"));
        assertEquals("application/octet-stream", server.proxyRequests().get(1).headers.getFirst("Content-Type"));
    }

    @Test
    void streamOfUnknownSizeSendsNoTotalUntilTheLastChunk() {
        byte[] content = data(600 * 1024);
        List<UploadProgress> progress = new ArrayList<>();
        server.enqueue(started(), committed(KIB_256 - 1), committed(2 * KIB_256 - 1), done("{\"id\":\"f\"}"));

        uploader.upload(upload().content(new ByteArrayInputStream(content)).onProgress(progress::add).build());

        List<Recorded> requests = server.proxyRequests();
        assertNull(requests.get(0).headers.getFirst("X-Upload-Content-Length"));
        assertEquals("bytes 0-262143/*", contentRange(requests.get(1)));
        assertEquals("bytes 262144-524287/*", contentRange(requests.get(2)));
        assertEquals("bytes 524288-614399/614400", contentRange(requests.get(3)));
        assertArrayEquals(slice(content, 2 * KIB_256, content.length), requests.get(3).body);
        assertEquals(Arrays.asList(UploadProgress.of(KIB_256), UploadProgress.of(2 * KIB_256),
                UploadProgress.of(614400, 614400)), progress);
    }

    @Test
    void streamOfUnknownSizeThatIsAnExactMultipleOfTheChunkSizeSendsTheTotalWithTheLastChunk() {
        byte[] content = data(2 * KIB_256);
        server.enqueue(started(), committed(KIB_256 - 1), done("{\"id\":\"f\"}"));

        uploader.upload(upload().content(new ByteArrayInputStream(content)).build());

        List<Recorded> requests = server.proxyRequests();
        assertEquals(3, requests.size(), "no extra empty request after an exact multiple");
        assertEquals("bytes 0-262143/*", contentRange(requests.get(1)));
        assertEquals("bytes 262144-524287/524288", contentRange(requests.get(2)));
    }

    @Test
    void streamOfUnknownSizeThatFitsInOneChunkSendsItsLengthWhenStarting() {
        server.enqueue(started(), done("{\"id\":\"f\"}"));
        uploader.upload(upload().content(new ByteArrayInputStream(data(1000))).build());

        List<Recorded> requests = server.proxyRequests();
        assertEquals("1000", requests.get(0).headers.getFirst("X-Upload-Content-Length"));
        assertEquals("bytes 0-999/1000", contentRange(requests.get(1)));
    }

    @Test
    void zeroBytesAreSentAsOneEmptyFinalRequest() {
        List<UploadProgress> progress = new ArrayList<>();
        server.enqueue(started(), done("{\"id\":\"empty\"}"));

        Map<String, Object> file = uploader.upload(upload().content(new byte[0]).onProgress(progress::add).build());

        assertEquals("empty", file.get("id"));
        List<Recorded> requests = server.proxyRequests();
        assertEquals(2, requests.size());
        assertEquals("0", requests.get(0).headers.getFirst("X-Upload-Content-Length"));
        assertEquals("PUT", requests.get(1).method);
        assertEquals("bytes */0", contentRange(requests.get(1)));
        assertEquals(0, requests.get(1).body.length);
        assertEquals(Collections.singletonList(UploadProgress.of(0, 0)), progress);
    }

    @Test
    void emptyStreamOfUnknownSizeIsAZeroByteUpload() {
        server.enqueue(started(), done("{}"));
        uploader.upload(upload().content(new ByteArrayInputStream(new byte[0])).build());

        assertEquals("0", server.proxyRequests().get(0).headers.getFirst("X-Upload-Content-Length"));
        assertEquals("bytes */0", contentRange(server.proxyRequests().get(1)));
    }

    @Test
    void anEmptyFinalBodyReturnsAnEmptyMap() {
        server.enqueue(started(), new Reply(201, "", 0));
        Map<String, Object> result = uploader.upload(upload().content(data(10)).build());
        assertTrue(result.isEmpty());
    }

    @Test
    void fileContentIsUploadedWithItsSize(@org.junit.jupiter.api.io.TempDir Path dir) throws IOException {
        byte[] content = data(300 * 1024);
        Path file = dir.resolve("upload.bin");
        Files.write(file, content);
        server.enqueue(started(), committed(KIB_256 - 1), done("{\"id\":\"f\"}"));

        uploader.upload(upload().content(file).build());

        List<Recorded> requests = server.proxyRequests();
        assertEquals("307200", requests.get(0).headers.getFirst("X-Upload-Content-Length"));
        assertEquals("bytes 262144-307199/307200", contentRange(requests.get(2)));
        assertArrayEquals(slice(content, KIB_256, content.length), requests.get(2).body);
    }

    @Test
    void theCallersStreamIsNotClosed() {
        final boolean[] closed = {false};
        InputStream stream = new FilterInputStream(new ByteArrayInputStream(data(10))) {
            @Override
            public void close() {
                closed[0] = true;
            }
        };
        server.enqueue(started(), done("{}"));
        uploader.upload(upload().content(stream, 10).build());
        assertFalse(closed[0]);
    }

    @Test
    void methodIsCaseInsensitiveAndSentUpperCase() {
        server.enqueue(started(), done("{}"));
        uploader.upload(upload().method("put").content(data(10)).build());
        assertEquals("PUT", server.proxyRequests().get(0).method);
    }

    // ----- what the server commits -----

    @Test
    void a308WithoutRangeMeansNothingCommittedAndTheChunkIsResent() {
        byte[] content = data(2 * KIB_256);
        server.enqueue(started(), new Reply(308, "", 0), committed(KIB_256 - 1), done("{}"));

        uploader.upload(upload().content(content).build());

        List<Recorded> requests = server.proxyRequests();
        assertEquals(4, requests.size());
        assertEquals("bytes 0-262143/524288", contentRange(requests.get(1)));
        assertEquals("bytes 0-262143/524288", contentRange(requests.get(2)));
        assertEquals("bytes 262144-524287/524288", contentRange(requests.get(3)));
        assertEquals(1, sleeps.size(), "a chunk the server took none of counts as a failed attempt");
    }

    @Test
    void a308ThatCommitsNothingUsesTheRetryBudgetAndEndsInAProtocolError() {
        server.enqueue(started(), committed(KIB_256 - 1), committed(KIB_256 - 1), committed(KIB_256 - 1),
                committed(KIB_256 - 1));
        UploadProtocolException e = assertThrows(UploadProtocolException.class,
                () -> uploader.upload(upload().content(data(3 * KIB_256)).maxRetries(2).build()));
        assertEquals(KIB_256, e.bytesCommitted());
        assertEquals("up-1", e.uploadId().get());
        assertEquals(2, sleeps.size(), "each 308 without progress backs off");
        assertEquals(5, server.proxyRequests().size(), "start, the first chunk, then the second chunk three times");
        for (int i = 2; i < 5; i++) {
            assertEquals("bytes 262144-524287/786432", contentRange(server.proxyRequests().get(i)),
                    "resent directly, without a status query");
        }
    }

    @Test
    void completionBeforeTheFinalChunkIsAProtocolError() {
        server.enqueue(started(), done("{\"id\":\"truncated\"}"));
        UploadProtocolException e = assertThrows(UploadProtocolException.class,
                () -> uploader.upload(upload().content(data(2 * KIB_256)).build()));
        assertTrue(e.getMessage().contains("before the final chunk"), e.getMessage());
        assertEquals(2, server.proxyRequests().size());

        // The same through a status query after the first, non-final chunk failed.
        server.enqueue(started(), status(503), new Reply(201, "{}", 0));
        assertThrows(UploadProtocolException.class,
                () -> uploader.upload(upload().content(new ByteArrayInputStream(data(2 * KIB_256))).build()));
    }

    @Test
    void aSuccessStatusOtherThan200Or201IsAnUploadException() {
        server.enqueue(started(), new Reply(204, "", 0));
        UploadException e = assertThrows(UploadException.class,
                () -> uploader.upload(upload().content(data(10)).build()));
        assertEquals(204, e.statusCode());
        assertEquals("up-1", e.uploadId().get());

        server.enqueue(started(), status(500), new Reply(202, "", 0));
        assertEquals(202, assertThrows(UploadException.class,
                () -> uploader.upload(upload().content(data(10)).build())).statusCode());
    }

    @Test
    void aPartialCommitSendsTheRestOfTheChunkFromTheCommittedOffset() {
        byte[] content = data(4 * KIB_256);
        List<UploadProgress> progress = new ArrayList<>();
        server.enqueue(started(), committed(KIB_256 - 1), committed(2 * KIB_256 - 1), done("{}"));

        uploader.upload(upload().chunkSize(2 * KIB_256).content(content).onProgress(progress::add).build());

        List<Recorded> requests = server.proxyRequests();
        assertEquals(4, requests.size());
        assertEquals("bytes 0-524287/1048576", contentRange(requests.get(1)));
        assertEquals("bytes 262144-524287/1048576", contentRange(requests.get(2)));
        assertArrayEquals(slice(content, KIB_256, 2 * KIB_256), requests.get(2).body);
        assertEquals("bytes 524288-1048575/1048576", contentRange(requests.get(3)));
        assertArrayEquals(slice(content, 2 * KIB_256, 4 * KIB_256), requests.get(3).body);
        assertEquals(Arrays.asList(UploadProgress.of(KIB_256, 1048576), UploadProgress.of(2 * KIB_256, 1048576),
                UploadProgress.of(1048576, 1048576)), progress);
        assertTrue(sleeps.isEmpty(), "progress is not a failure");
    }

    @Test
    void aChunkIsSentAsItsOwnArrayWithoutCopiesAndOnlyAPartialResendIsCopied() {
        server.enqueue(started(), status(503), new Reply(308, "", 0), committed(KIB_256 - 1), done("{}"));

        uploader.upload(upload().chunkSize(2 * KIB_256).content(data(2 * KIB_256)).build());

        // start, chunk (503), status query, chunk again (308: half committed), the unsent half.
        assertEquals(5, sentBodies.size());
        byte[] first = sentBodies.get(1);
        assertEquals(2 * KIB_256, first.length);
        assertNull(sentBodies.get(2), "a status query has no body");
        assertSame(first, sentBodies.get(3), "a resend from the chunk's start reuses the chunk's array");
        byte[] tail = sentBodies.get(4);
        assertNotSame(first, tail);
        assertEquals(KIB_256, tail.length);
        assertArrayEquals(data(2 * KIB_256), first, "the chunk's array is never overwritten");
    }

    @Test
    void aFileIsClosedAfterSuccessAndAfterFailure(@org.junit.jupiter.api.io.TempDir Path dir) throws IOException {
        Path fds = java.nio.file.Paths.get("/proc/self/fd");
        org.junit.jupiter.api.Assumptions.assumeTrue(Files.isDirectory(fds), "needs /proc to list open files");
        Path written = dir.resolve("upload.bin");
        Files.write(written, data(1000));
        Path file = written.toRealPath();

        server.enqueue(started(), done("{}"));
        uploader.upload(upload().content(file).build());
        assertFalse(isOpen(fds, file), "closed after success");

        server.enqueue(started(), status(403));
        assertThrows(UploadException.class, () -> uploader.upload(upload().content(file).build()));
        assertFalse(isOpen(fds, file), "closed after an HTTP failure");

        server.enqueue(status(500));
        assertThrows(UploadException.class, () -> uploader.upload(upload().content(file).build()));
        assertFalse(isOpen(fds, file), "closed when the session never started");
    }

    private static boolean isOpen(Path fds, Path file) throws IOException {
        try (java.util.stream.Stream<Path> open = Files.list(fds)) {
            return open.anyMatch(fd -> {
                try {
                    return Files.readSymbolicLink(fd).equals(file);
                } catch (IOException | UnsupportedOperationException gone) {
                    return false;
                }
            });
        }
    }

    @Test
    void anOffsetThatMovesBackInsideTheChunkIsAcceptedButOnlyANewHighResetsTheRetries() {
        byte[] content = data(4 * KIB_256);
        List<UploadProgress> progress = new ArrayList<>();
        // The server alternates between two offsets inside one chunk and never gets past the higher one.
        server.enqueue(started(), committed(2 * KIB_256 - 1), committed(KIB_256 - 1), committed(2 * KIB_256 - 1),
                committed(KIB_256 - 1));

        UploadProtocolException e = assertThrows(UploadProtocolException.class, () -> uploader.upload(upload()
                .chunkSize(4 * KIB_256).content(content).maxRetries(2).onProgress(progress::add).build()));

        List<Recorded> requests = server.proxyRequests();
        assertEquals(5, requests.size());
        assertEquals("bytes 524288-1048575/1048576", contentRange(requests.get(2)));
        assertEquals("bytes 262144-1048575/1048576", contentRange(requests.get(3)), "resent from the reported offset");
        assertArrayEquals(slice(content, KIB_256, 4 * KIB_256), requests.get(3).body);
        assertEquals("bytes 524288-1048575/1048576", contentRange(requests.get(4)));
        assertEquals(2, sleeps.size());
        assertEquals(KIB_256, e.bytesCommitted());
        assertEquals(Collections.singletonList(UploadProgress.of(2 * KIB_256, 1048576)), progress,
                "progress never goes backwards");
    }

    @Test
    void aCommittedOffsetBeforeTheCurrentChunkIsAProtocolError() {
        server.enqueue(started(), committed(KIB_256 - 1), status(503), committed(99));
        UploadProtocolException e = assertThrows(UploadProtocolException.class,
                () -> uploader.upload(upload().content(data(3 * KIB_256)).build()));
        assertEquals("up-1", e.uploadId().get());
        assertEquals(KIB_256, e.bytesCommitted());
        assertEquals(308, e.response().get().statusCode());
        assertTrue(e.getMessage().contains("went back"), e.getMessage());
    }

    @Test
    void aCommittedOffsetPastTheBytesSentIsAProtocolError() {
        server.enqueue(started(), committed(10 * KIB_256));
        UploadProtocolException e = assertThrows(UploadProtocolException.class,
                () -> uploader.upload(upload().content(data(3 * KIB_256)).build()));
        assertEquals(0, e.bytesCommitted());
    }

    @Test
    void aRangeThatDoesNotStartAtZeroIsAProtocolError() {
        server.enqueue(started(), new Reply(308, "", 0, "Range", "bytes=5-100"));
        assertThrows(UploadProtocolException.class, () -> uploader.upload(upload().content(data(3 * KIB_256)).build()));
        assertEquals(2, server.proxyRequests().size());
    }

    @Test
    void aFinalBodyThatIsNotAJsonObjectIsAProtocolError() {
        server.enqueue(started(), new Reply(200, "[1,2]", 0, "Content-Type", "application/json"));
        UploadProtocolException e = assertThrows(UploadProtocolException.class,
                () -> uploader.upload(upload().content(data(10)).build()));
        assertEquals("[1,2]", e.response().get().bodyAsString());

        server.enqueue(started(), new Reply(200, "<html>ok</html>", 0, "Content-Type", "text/html"));
        assertThrows(UploadProtocolException.class, () -> uploader.upload(upload().content(data(10)).build()));
    }

    @Test
    void anUnexpectedStatusToAChunkIsAProtocolError() {
        server.enqueue(started(), new Reply(302, "", 0, "Location", "https://elsewhere.example"));
        assertThrows(UploadProtocolException.class, () -> uploader.upload(upload().content(data(10)).build()));
    }

    // ----- retries -----

    @Test
    void aRetryableStatusIsFollowedByAStatusQueryAndTheUploadResumes() {
        byte[] content = data(2 * KIB_256);
        server.enqueue(started(), status(503, "Retry-After", "2"), committed(KIB_256 - 1), done("{\"id\":\"f\"}"));

        Map<String, Object> file = uploader.upload(upload().content(content).build());

        assertEquals("f", file.get("id"));
        List<Recorded> requests = server.proxyRequests();
        assertEquals(4, requests.size());
        Recorded query = requests.get(2);
        assertEquals("PUT", query.method);
        assertEquals(CHUNK_URI, query.uri);
        assertEquals("bytes */524288", contentRange(query));
        assertEquals(0, query.body.length);
        assertEquals("bytes 262144-524287/524288", contentRange(requests.get(3)));
        assertEquals(Collections.singletonList(2000L), sleeps, "Retry-After seconds are honoured");
    }

    @Test
    void retryAfterAsAnHttpDateIsHonouredAndCapped() {
        server.enqueue(started(), status(429, "Retry-After", "Thu, 08 Oct 2026 12:00:10 GMT"), done("{}"));
        uploader.upload(upload().content(data(10)).build());
        assertEquals(Collections.singletonList(10_000L), sleeps);

        sleeps.clear();
        server.enqueue(started(), status(503, "Retry-After", "3600"), done("{}"));
        uploader.upload(upload().content(data(10)).build());
        assertEquals(Collections.singletonList(30_000L), sleeps, "Retry-After is capped at 30 seconds");
    }

    @Test
    void retryAfterOnAnotherStatusIsIgnored() {
        jitter = 0.25;
        server.enqueue(started(), status(500, "Retry-After", "20"), done("{}"));
        uploader.upload(upload().content(data(10)).build());
        assertEquals(Collections.singletonList(250L), sleeps);
    }

    @Test
    void theFirstBackoffDelayIsAtMostOneSecond() {
        jitter = 1.0;
        server.enqueue(started(), status(502), done("{}"));
        uploader.upload(upload().content(data(10)).build());
        assertEquals(1, sleeps.size());
        assertTrue(sleeps.get(0) <= 1000, "first delay " + sleeps.get(0));
    }

    @Test
    void aStatusQueryThatReportsCompletionEndsTheUpload() {
        List<UploadProgress> progress = new ArrayList<>();
        server.enqueue(started(), new Reply(200, "{}", 1500), done("{\"id\":\"done\"}"));

        Map<String, Object> file = uploader.upload(upload().content(data(10)).timeout(Duration.ofMillis(300))
                .onProgress(progress::add).build());

        assertEquals("done", file.get("id"));
        assertEquals("bytes */10", contentRange(server.proxyRequests().get(2)));
        assertEquals(Collections.singletonList(UploadProgress.of(10, 10)), progress);
    }

    @Test
    void aConnectionFailureIsRetried() {
        failingCalls.add(2);
        server.enqueue(started(), new Reply(308, "", 0), done("{\"id\":\"f\"}"));

        uploader.upload(upload().content(data(10)).build());

        List<Recorded> requests = server.proxyRequests();
        assertEquals(3, requests.size(), "the failed chunk never reached the server");
        assertEquals("bytes */10", contentRange(requests.get(1)));
        assertEquals("bytes 0-9/10", contentRange(requests.get(2)));
    }

    @Test
    void retriesRunOutWithTheLastHttpError() {
        server.enqueue(started(), status(500), status(503), status(500));

        UploadException e = assertThrows(UploadException.class,
                () -> uploader.upload(upload().content(data(10)).maxRetries(2).build()));

        assertFalse(e instanceof UploadSessionExpiredException);
        assertEquals(500, e.statusCode());
        assertEquals("up-1", e.uploadId().get());
        assertEquals(0, e.bytesCommitted());
        assertEquals(4, server.proxyRequests().size(), "start, chunk and two status queries");
        assertEquals(2, sleeps.size());
        assertTrue(e.getMessage().contains("upload_id: up-1"), e.getMessage());
        assertFalse(e.getMessage().contains("token-1"));
    }

    @Test
    void retriesRunOutAfterConnectionFailures() {
        failingCalls.addAll(Arrays.asList(2, 3));
        server.enqueue(started());
        ScalekitConnectionException e = assertThrows(ScalekitConnectionException.class,
                () -> uploader.upload(upload().content(data(10)).maxRetries(1).build()));
        assertTrue(e.getMessage().contains("upload_id: up-1"), e.getMessage());
        assertTrue(e.getCause() instanceof ScalekitConnectionException);
    }

    @Test
    void retriesRunOutAfterTimeouts() {
        server.enqueue(started(), new Reply(200, "{}", 1500));
        ScalekitTimeoutException e = assertThrows(ScalekitTimeoutException.class,
                () -> uploader.upload(upload().content(data(10)).maxRetries(0).timeout(Duration.ofMillis(300)).build()));
        assertTrue(e.getMessage().contains("upload_id: up-1"), e.getMessage());
    }

    @Test
    void theRetryCountResetsWhenTheCommittedOffsetAdvances() {
        server.enqueue(started(), status(503), committed(KIB_256 - 1), status(503), done("{\"id\":\"f\"}"));

        Map<String, Object> file = uploader.upload(upload().content(data(2 * KIB_256)).maxRetries(1).build());

        assertEquals("f", file.get("id"));
        assertEquals(2, sleeps.size());
    }

    @Test
    void zeroRetriesFailsOnTheFirstRetryableStatus() {
        server.enqueue(started(), status(503));
        UploadException e = assertThrows(UploadException.class,
                () -> uploader.upload(upload().content(data(10)).maxRetries(0).build()));
        assertEquals(503, e.statusCode());
        assertEquals(2, server.proxyRequests().size());
        assertTrue(sleeps.isEmpty());
    }

    @Test
    void anInterruptDuringBackoffStopsTheUploadAndKeepsTheFlag() {
        uploader = new ResumableUploader(executor, millis -> {
            throw new InterruptedException();
        }, () -> jitter, Clock.systemUTC());
        server.enqueue(started(), status(503));

        ScalekitConnectionException e = assertThrows(ScalekitConnectionException.class,
                () -> uploader.upload(upload().content(data(10)).build()));

        assertTrue(e.getCause() instanceof InterruptedException);
        assertTrue(Thread.currentThread().isInterrupted());
        assertEquals(2, server.proxyRequests().size(), "no status query after an interrupt");
    }

    @Test
    void anInterruptedThreadSendsNothing() {
        Thread.currentThread().interrupt();
        ScalekitConnectionException e = assertThrows(ScalekitConnectionException.class,
                () -> uploader.upload(upload().content(data(10)).build()));
        assertTrue(e.getCause() instanceof InterruptedException);
        assertTrue(server.proxyRequests().isEmpty());
    }

    // ----- failures that are not retried -----

    @Test
    void a404OnAChunkMeansTheSessionExpired() {
        server.enqueue(started(), committed(KIB_256 - 1), status(404));
        UploadSessionExpiredException e = assertThrows(UploadSessionExpiredException.class,
                () -> uploader.upload(upload().content(data(2 * KIB_256)).build()));
        assertEquals(404, e.statusCode());
        assertEquals("up-1", e.uploadId().get());
        assertEquals(KIB_256, e.bytesCommitted());
        assertEquals(3, server.proxyRequests().size(), "never restarted");
    }

    @Test
    void a410OnAStatusQueryMeansTheSessionExpired() {
        server.enqueue(started(), status(500), status(410));
        UploadSessionExpiredException e = assertThrows(UploadSessionExpiredException.class,
                () -> uploader.upload(upload().content(data(10)).build()));
        assertEquals(410, e.statusCode());
        assertEquals(3, server.proxyRequests().size());
    }

    @Test
    void anotherClientErrorOnAChunkFailsAtOnce() {
        server.enqueue(started(), new Reply(403, "{\"error\":\"forbidden\"}", 0, "Content-Type", "application/json"));
        UploadException e = assertThrows(UploadException.class,
                () -> uploader.upload(upload().content(data(10)).build()));
        assertEquals(UploadException.class, e.getClass());
        assertEquals(403, e.statusCode());
        assertEquals("{\"error\":\"forbidden\"}", e.response().bodyAsString());
        assertEquals(2, server.proxyRequests().size());
        assertTrue(sleeps.isEmpty());
    }

    @Test
    void aFailedStartIsAnUploadExceptionAndIsNeverRetried() {
        server.enqueue(status(503));
        UploadException e = assertThrows(UploadException.class,
                () -> uploader.upload(upload().content(data(10)).build()));
        assertEquals(503, e.statusCode());
        assertFalse(e.uploadId().isPresent());
        assertEquals(0, e.bytesCommitted());
        assertEquals(1, server.proxyRequests().size(), "a second start would open a second session");
        assertTrue(sleeps.isEmpty());
    }

    @Test
    void aStartThatTimesOutIsNeverRetried() {
        server.enqueue(new Reply(200, "", 1500));
        assertThrows(ScalekitTimeoutException.class,
                () -> uploader.upload(upload().content(data(10)).timeout(Duration.ofMillis(300)).build()));
        assertEquals(1, server.proxyRequests().size());
    }

    @Test
    void aStartThatCannotConnectIsNeverRetried() {
        failingCalls.add(1);
        assertThrows(ScalekitConnectionException.class, () -> uploader.upload(upload().content(data(10)).build()));
        assertTrue(server.proxyRequests().isEmpty());
        assertTrue(sleeps.isEmpty());
    }

    @Test
    void aStartWithoutAnUploadIdIsAProtocolError() {
        server.enqueue(new Reply(200, "", 0));
        UploadProtocolException e = assertThrows(UploadProtocolException.class,
                () -> uploader.upload(upload().content(data(10)).build()));
        assertFalse(e.uploadId().isPresent());
        assertEquals(200, e.response().get().statusCode());

        server.enqueue(new Reply(200, "", 0, "Location", "https://www.googleapis.com/upload/drive/v3/files?x=1"));
        assertThrows(UploadProtocolException.class, () -> uploader.upload(upload().content(data(10)).build()));

        server.enqueue(new Reply(308, "", 0, "Location", "https://x.example/?upload_id=a"));
        assertThrows(UploadProtocolException.class, () -> uploader.upload(upload().content(data(10)).build()));
        assertEquals(3, server.proxyRequests().size());
    }

    @Test
    void anExceptionFromTheProgressCallbackPropagatesAndStopsTheUpload() {
        final IllegalStateException boom = new IllegalStateException("stop");
        server.enqueue(started(), committed(KIB_256 - 1));
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> uploader.upload(upload()
                .content(data(2 * KIB_256))
                .onProgress(p -> {
                    throw boom;
                })
                .build()));
        assertSame(boom, e);
        assertEquals(2, server.proxyRequests().size());
    }

    // ----- content that does not match its size -----

    @Test
    void aStreamShorterThanDeclaredFailsBeforeTheLastChunk() {
        server.enqueue(started(), committed(KIB_256 - 1));
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> uploader.upload(upload()
                .content(new ByteArrayInputStream(data(300 * 1024)), 600 * 1024)
                .build()));
        assertTrue(e.getMessage().contains("ended after 307200 bytes"), e.getMessage());
        assertTrue(e.getMessage().contains("upload_id: up-1"), e.getMessage());
        assertEquals(2, server.proxyRequests().size(), "the short final chunk is never sent");
    }

    @Test
    void aStreamLongerThanDeclaredFailsBeforeTheLastChunk() {
        server.enqueue(started(), committed(KIB_256 - 1));
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> uploader.upload(upload()
                .content(new ByteArrayInputStream(data(600 * 1024)), 2 * KIB_256)
                .build()));
        assertTrue(e.getMessage().contains("longer than totalBytes"), e.getMessage());
        assertEquals(2, server.proxyRequests().size(), "a truncated final chunk would complete a wrong file");
    }

    @Test
    void aMismatchInTheFirstChunkFailsBeforeAnyRequest() {
        assertThrows(IllegalStateException.class, () -> uploader.upload(upload()
                .content(new ByteArrayInputStream(data(100)), 200).build()));
        assertThrows(IllegalStateException.class, () -> uploader.upload(upload()
                .content(new ByteArrayInputStream(data(1000)), 500).build()));
        assertThrows(IllegalStateException.class, () -> uploader.upload(upload()
                .content(new ByteArrayInputStream(data(1)), 0).build()));
        assertTrue(server.proxyRequests().isEmpty());
    }

    @Test
    void aReadFailureIsAnUncheckedIOException() {
        InputStream broken = new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("disk error");
            }
        };
        UncheckedIOException e = assertThrows(UncheckedIOException.class,
                () -> uploader.upload(upload().content(broken).build()));
        assertEquals("disk error", e.getCause().getMessage());
        assertTrue(server.proxyRequests().isEmpty());
    }

    @Test
    void pathsWithSpacesOrControlCharactersAreRejectedBeforeAnyRequest() {
        String[] paths = {"/upload/.\t./.\t./x", "/upload/.\n./x", "/upload/..\r/x", "/upload/a b",
                "/upload/\u0000x", "/upload/\u007fx", "/upload/x ", " /upload/x", "/upload/%2e%2e/x"};
        for (String path : paths) {
            assertThrows(IllegalArgumentException.class, () -> uploader.upload(ResumableUploadRequest
                    .builder("googledrive", "user_1", path).content(data(10)).build()), path);
        }
        assertTrue(server.proxyRequests().isEmpty());
    }

    @Test
    void aNullRequestIsRejectedBeforeAnyRequest() {
        assertThrows(IllegalArgumentException.class, () -> uploader.upload(null));
        assertTrue(server.proxyRequests().isEmpty());
    }

    @Test
    void errorMessagesNeverCarryTheAccessToken() {
        server.enqueue(new Reply(400, "{\"detail\":\"bad\",\"code\":\"BAD\"}", 0, "Content-Type", "application/json"));
        UploadException e = assertThrows(UploadException.class,
                () -> uploader.upload(upload().content(data(10)).build()));
        assertFalse(e.getMessage().contains("token-"), e.getMessage());
        assertFalse(e.toString().contains("token-"));
        assertTrue(e.getMessage().startsWith("resumable upload failed with HTTP 400"), e.getMessage());
        assertEquals("BAD", e.proxyErrorCode().get());
        assertTrue(new String(e.response().body(), StandardCharsets.UTF_8).contains("bad"));
    }
}
