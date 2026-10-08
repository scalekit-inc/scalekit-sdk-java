package com.scalekit.internal.proxy;

import com.scalekit.exceptions.ProxyException;
import com.scalekit.exceptions.ScalekitConnectionException;
import com.scalekit.exceptions.ScalekitTimeoutException;
import com.scalekit.exceptions.UploadException;
import com.scalekit.exceptions.UploadProtocolException;
import com.scalekit.exceptions.UploadSessionExpiredException;
import com.scalekit.internal.JsonCodec;
import com.scalekit.models.proxy.ProxyRequest;
import com.scalekit.models.proxy.ProxyResponse;
import com.scalekit.models.proxy.ResumableUploadRequest;
import com.scalekit.models.proxy.UploadProgress;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Uploads content with Google's resumable upload protocol through {@link ProxyExecutor}. Not part
 * of the public API; callers use {@code ActionsClient.uploadResumable}.
 *
 * <ol>
 *   <li>Reads the first chunk, so that a content that fits in one chunk has a known size.</li>
 *   <li>Starts the session ({@link Step#START}) with {@code <method> path?uploadType=resumable}
 *       and reads {@code upload_id} from the {@code Location} header. Never retried: a second
 *       request would open a second session.</li>
 *   <li>Sends each chunk with {@code PUT path?uploadType=resumable&upload_id=<id>} and
 *       {@code Content-Range}; a 308 reports the committed bytes in its {@code Range} header, and a
 *       200 or 201 ends the upload with the resource's JSON.</li>
 *   <li>On a timeout, a connection failure or HTTP 408, 429, 500, 502, 503 or 504, waits, asks the
 *       server how much it has ({@link Step#STATUS_QUERY}: an empty {@code PUT} with
 *       <code>Content-Range: bytes &#42;/&lt;total&gt;</code>), and resumes from there. A chunk may fail
 *       {@code maxRetries} times in a row; the count resets when the committed offset advances.</li>
 * </ol>
 *
 * <p>Holds at most one chunk of content (plus one look-ahead byte) in memory, and gives each
 * request its own copy of the bytes it sends, because a request that timed out may still be reading
 * its array. When the server commits part of a chunk, the rest of that chunk is sent next. A 308
 * that commits nothing new counts as one failed attempt and the chunk is resent from the reported
 * offset; the failure count resets only when the committed offset reaches a new high-water mark.
 */
public final class ResumableUploader {

    /** First backoff ceiling: the first delay is at most this long. */
    static final long BACKOFF_BASE_MILLIS = 1000;

    /** Longest backoff, and longest {@code Retry-After} honoured. */
    static final long BACKOFF_CAP_MILLIS = 30_000;

    /** Statuses after which a chunk is retried. */
    private static final List<Integer> RETRYABLE_STATUSES = Collections.unmodifiableList(
            Arrays.asList(408, 429, 500, 502, 503, 504));

    private static final Pattern RANGE = Pattern.compile("\\s*bytes=(\\d+)-(\\d+)\\s*");
    private static final Pattern DELTA_SECONDS = Pattern.compile("-?\\d+");
    private static final String METADATA_CONTENT_TYPE = "application/json; charset=UTF-8";
    private static final int NO_LOOKAHEAD = -1;

    /**
     * Which requests of the protocol may be repeated after a transient failure (JV-RETRY-3). Only
     * these three are ever sent.
     */
    enum Step {
        /** Opens the session. Not idempotent: repeating it opens a second session. */
        START(false),
        /** Sends bytes at an explicit offset. Idempotent: the server keeps what it committed. */
        CHUNK(true),
        /** Asks for the committed offset. Read-only. */
        STATUS_QUERY(true);

        final boolean retriedAfterTransientFailure;

        Step(boolean retriedAfterTransientFailure) {
            this.retriedAfterTransientFailure = retriedAfterTransientFailure;
        }
    }

    /** Sleeps between attempts; tests replace it. */
    interface Sleeper {
        void sleep(long millis) throws InterruptedException;
    }

    private final ProxyExecutor proxy;
    private final Sleeper sleeper;
    private final DoubleSupplier jitter;
    private final Clock clock;

    /**
     * Creates an uploader that sends every request through {@code proxy}.
     *
     * @param proxy the proxy executor
     */
    public ResumableUploader(ProxyExecutor proxy) {
        this(proxy, Thread::sleep, () -> java.util.concurrent.ThreadLocalRandom.current().nextDouble(),
                Clock.systemUTC());
    }

    ResumableUploader(ProxyExecutor proxy, Sleeper sleeper, DoubleSupplier jitter, Clock clock) {
        this.proxy = proxy;
        this.sleeper = sleeper;
        this.jitter = jitter;
        this.clock = clock;
    }

    /**
     * Uploads the request's content.
     *
     * @param request the upload
     * @return the final response's JSON object; empty when its body is empty
     * @throws IllegalArgumentException if {@code request} is null
     */
    public Map<String, Object> upload(ResumableUploadRequest request) {
        if (request == null) {
            throw new IllegalArgumentException("request is required");
        }
        InputStream content = request.openContent();
        Throwable failure = null;
        try {
            return new Session(request, content).run();
        } catch (RuntimeException | Error e) {
            failure = e;
            throw e;
        } finally {
            try {
                content.close();
            } catch (IOException closeFailure) {
                // The upload's own outcome matters more; keep the close failure only as context.
                if (failure != null) {
                    failure.addSuppressed(closeFailure);
                }
            }
        }
    }

    /** Backoff before retry {@code attempt} (1-based): full jitter up to min(cap, base * 2^(attempt-1)). */
    long backoffMillis(int attempt) {
        int exponent = Math.min(Math.max(attempt - 1, 0), 30);
        long ceiling = Math.min(BACKOFF_CAP_MILLIS, BACKOFF_BASE_MILLIS << Math.min(exponent, 15));
        double random = Math.min(Math.max(jitter.getAsDouble(), 0.0), 1.0);
        return (long) (random * ceiling);
    }

    /**
     * Parses {@code Retry-After}: delta-seconds or an HTTP-date. A negative value or a past date
     * means 0; the result is capped at {@link #BACKOFF_CAP_MILLIS}.
     *
     * @return the delay in milliseconds, or -1 when the value is absent or unparseable
     */
    long retryAfterMillis(String value) {
        if (value == null) {
            return -1;
        }
        String trimmed = value.trim();
        if (DELTA_SECONDS.matcher(trimmed).matches()) {
            if (trimmed.startsWith("-")) {
                return 0;
            }
            if (trimmed.length() > 9) {
                return BACKOFF_CAP_MILLIS;
            }
            return Math.min(BACKOFF_CAP_MILLIS, Long.parseLong(trimmed) * 1000);
        }
        Instant date = parseHttpDate(trimmed);
        if (date == null) {
            return -1;
        }
        long millis = date.toEpochMilli() - clock.millis();
        return Math.max(0, Math.min(BACKOFF_CAP_MILLIS, millis));
    }

    // RFC 9110 section 5.6.7: IMF-fixdate, then the obsolete RFC 850 and asctime forms.
    private static final DateTimeFormatter RFC_850 = new DateTimeFormatterBuilder()
            .appendPattern("EEEE, dd-MMM-")
            .appendValueReduced(ChronoField.YEAR, 2, 2, 1970)
            .appendPattern(" HH:mm:ss 'GMT'")
            .toFormatter(Locale.US)
            .withZone(ZoneOffset.UTC);
    private static final DateTimeFormatter ASCTIME = new DateTimeFormatterBuilder()
            .appendPattern("EEE MMM ")
            .padNext(2)
            .appendValue(ChronoField.DAY_OF_MONTH)
            .appendPattern(" HH:mm:ss yyyy")
            .toFormatter(Locale.US)
            .withZone(ZoneOffset.UTC);

    private static Instant parseHttpDate(String value) {
        for (DateTimeFormatter format : Arrays.asList(DateTimeFormatter.RFC_1123_DATE_TIME, RFC_850, ASCTIME)) {
            try {
                return ZonedDateTime.parse(value, format).toInstant();
            } catch (DateTimeParseException ignored) {
                // try the next form
            }
        }
        return null;
    }

    /** The outcome of one request: a response below 400, or a failure that may be retried. */
    private static final class Attempt {
        final ProxyResponse response;
        final RuntimeException failure;
        final long retryAfterMillis;

        private Attempt(ProxyResponse response, RuntimeException failure, long retryAfterMillis) {
            this.response = response;
            this.failure = failure;
            this.retryAfterMillis = retryAfterMillis;
        }
    }

    /**
     * One upload: the content, the current chunk and the session state. The buffer holds the
     * current chunk from its first byte ({@code chunkStart}) until the server has committed all of
     * it, so the upload can resume from any offset the server reports inside the chunk.
     */
    private final class Session {
        private final ResumableUploadRequest request;
        private final InputStream in;
        private final byte[] buffer;
        private final Consumer<UploadProgress> onProgress;
        private final long declaredTotal;
        /** Absolute offset of buffer[0]: the first byte of the current chunk. */
        private long chunkStart;
        /** Bytes of the current chunk in the buffer; all of them have been read from the content. */
        private int bufferLength;
        /** The offset the server last reported as committed. */
        private long committed;
        /** The highest offset the server has reported as committed. */
        private long highWater;
        private int lookahead = NO_LOOKAHEAD;
        private boolean endOfContent;
        /** The total size, or -1 until it is known. */
        private long total;
        private String uploadId;
        /** Consecutive failed attempts since the last new high-water mark. */
        private int failures;
        /** Whether a request carrying the content's last byte (or the empty final request) was sent. */
        private boolean finalChunkSent;

        Session(ResumableUploadRequest request, InputStream in) {
            this.request = request;
            this.in = in;
            this.declaredTotal = request.totalBytes().isPresent() ? request.totalBytes().getAsLong() : -1;
            this.total = declaredTotal;
            int capacity = request.chunkSize();
            if (declaredTotal >= 0 && declaredTotal < capacity) {
                capacity = (int) declaredTotal;
            }
            this.buffer = new byte[capacity];
            this.onProgress = request.onProgress().orElse(null);
        }

        private long chunkEnd() {
            return chunkStart + bufferLength;
        }

        Map<String, Object> run() {
            fill();
            start();
            Step step = Step.CHUNK;
            while (true) {
                if (step == Step.CHUNK) {
                    fill();
                }
                long unsent = chunkEnd() - committed;
                Attempt attempt = exchange(step);
                if (attempt.failure != null) {
                    failures++;
                    if (failures > request.maxRetries()) {
                        throw exhausted(attempt.failure);
                    }
                    pause(attempt.retryAfterMillis >= 0 ? attempt.retryAfterMillis : backoffMillis(failures));
                    step = Step.STATUS_QUERY;
                    continue;
                }
                ProxyResponse response = attempt.response;
                int status = response.statusCode();
                if (status == 200 || status == 201) {
                    if (!finalChunkSent) {
                        // Completing before the last byte was sent would return a truncated file.
                        throw protocolError("the server completed the upload before the final chunk was sent, after "
                                + chunkEnd() + " bytes", response);
                    }
                    return complete(response);
                }
                if (status >= 200 && status <= 299) {
                    // A success status the protocol does not define: report the response as is.
                    throw new UploadException(response, uploadId, committed);
                }
                if (status != 308) {
                    throw protocolError("unexpected HTTP " + status + " to an upload "
                            + (step == Step.CHUNK ? "chunk" : "status query"), response);
                }
                committed = committedOffset(response);
                if (committed > highWater) {
                    highWater = committed;
                    failures = 0;
                    progress(total >= 0 ? UploadProgress.of(committed, total) : UploadProgress.of(committed));
                } else if (step == Step.CHUNK && unsent == 0) {
                    // Every byte is committed and the final request did not complete the upload.
                    throw protocolError("the server did not complete the upload after receiving all "
                            + committed + " bytes", response);
                } else if (step == Step.CHUNK) {
                    // A 308 that commits nothing new is one failed attempt. The next attempt resends
                    // from the offset it reported, without a status query.
                    failures++;
                    if (failures > request.maxRetries()) {
                        throw protocolError("the server committed no new bytes of the chunk at offset " + committed
                                + " after " + failures + " attempts", response);
                    }
                    pause(backoffMillis(failures));
                }
                step = Step.CHUNK;
            }
        }

        private void start() {
            ProxyRequest.Builder start = ProxyRequest.builder(request.connectionName(), request.identifier(),
                            request.path())
                    .method(request.method())
                    .timeout(request.timeout())
                    .queryParam("uploadType", "resumable")
                    .header("X-Upload-Content-Type", request.contentType());
            for (Map.Entry<String, List<String>> param : request.queryParams().entrySet()) {
                for (String value : param.getValue()) {
                    start.queryParam(param.getKey(), value);
                }
            }
            if (total >= 0) {
                start.header("X-Upload-Content-Length", Long.toString(total));
            }
            if (request.metadata().isPresent()) {
                start.rawBody(JsonCodec.encode(request.metadata().get()), METADATA_CONTENT_TYPE);
            }
            ProxyRequest startRequest = start.build();
            Attempt attempt = send(Step.START, startRequest, startRequest.body().orElse(null));
            ProxyResponse response = attempt.response;
            if (response.statusCode() < 200 || response.statusCode() > 299) {
                throw protocolError("unexpected HTTP " + response.statusCode() + " to the request that starts the "
                        + "upload session", response);
            }
            String location = response.header("Location").orElse(null);
            String id = location == null ? null : queryValue(location, "upload_id");
            if (id == null || id.isEmpty()) {
                throw protocolError("the response that starts the upload session has no Location header with an "
                        + "upload_id", response);
            }
            uploadId = id;
        }

        /** Sends the uncommitted rest of the current chunk, or a status query. */
        private Attempt exchange(Step step) {
            ProxyRequest.Builder put = ProxyRequest.builder(request.connectionName(), request.identifier(),
                            request.path())
                    .method("PUT")
                    .timeout(request.timeout())
                    .queryParam("uploadType", "resumable")
                    .queryParam("upload_id", uploadId);
            String totalText = total >= 0 ? Long.toString(total) : "*";
            byte[] body = null;
            if (step == Step.CHUNK && endOfContent) {
                finalChunkSent = true;
            }
            if (step == Step.CHUNK && committed < chunkEnd()) {
                put.header("Content-Range", "bytes " + committed + "-" + (chunkEnd() - 1) + "/" + totalText)
                        .header("Content-Type", request.contentType());
                body = Arrays.copyOfRange(buffer, (int) (committed - chunkStart), bufferLength);
            } else {
                put.header("Content-Range", "bytes */" + totalText);
            }
            return send(step, put.build(), body);
        }

        /**
         * Sends one request. Returns its response, or a transient failure when the step may be
         * retried; throws everything else.
         */
        private Attempt send(Step step, ProxyRequest proxyRequest, byte[] body) {
            try {
                return new Attempt(proxy.execute(proxyRequest, body), null, -1);
            } catch (ProxyException e) {
                ProxyResponse response = e.response();
                int status = response.statusCode();
                if (step == Step.START) {
                    UploadException failed = new UploadException(response, null, 0);
                    failed.initCause(e);
                    throw failed;
                }
                if (status == 404 || status == 410) {
                    UploadSessionExpiredException expired =
                            new UploadSessionExpiredException(response, uploadId, committed);
                    expired.initCause(e);
                    throw expired;
                }
                if (!RETRYABLE_STATUSES.contains(status) || !step.retriedAfterTransientFailure) {
                    UploadException failed = new UploadException(response, uploadId, committed);
                    failed.initCause(e);
                    throw failed;
                }
                long retryAfter = status == 429 || status == 503
                        ? retryAfterMillis(response.header("Retry-After").orElse(null)) : -1;
                return new Attempt(null, e, retryAfter);
            } catch (ScalekitTimeoutException e) {
                if (!step.retriedAfterTransientFailure) {
                    throw e;
                }
                return new Attempt(null, e, -1);
            } catch (ScalekitConnectionException e) {
                if (!step.retriedAfterTransientFailure || e.getCause() instanceof InterruptedException) {
                    throw e;
                }
                return new Attempt(null, e, -1);
            }
        }

        private RuntimeException exhausted(RuntimeException last) {
            String context = " after " + failures + " attempts (upload_id: " + uploadId + ", " + committed
                    + " bytes committed)";
            if (last instanceof ProxyException) {
                UploadException failed = new UploadException(((ProxyException) last).response(), uploadId, committed);
                failed.initCause(last);
                return failed;
            }
            if (last instanceof ScalekitTimeoutException) {
                return new ScalekitTimeoutException("resumable upload timed out" + context, last);
            }
            return new ScalekitConnectionException("resumable upload could not reach the server" + context, last);
        }

        private void pause(long millis) {
            try {
                sleeper.sleep(millis);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new ScalekitConnectionException("resumable upload interrupted (upload_id: " + uploadId + ", "
                        + committed + " bytes committed)", e);
            }
        }

        /** Reads the committed offset from a 308's Range header and checks it against the current chunk. */
        private long committedOffset(ProxyResponse response) {
            String range = response.header("Range").orElse(null);
            long reported;
            if (range == null) {
                reported = 0;
            } else {
                Matcher matcher = RANGE.matcher(range);
                if (!matcher.matches() || !"0".equals(matcher.group(1)) || matcher.group(2).length() > 18) {
                    throw protocolError("malformed Range header in a 308 response: " + range, response);
                }
                reported = Long.parseLong(matcher.group(2)) + 1;
            }
            if (reported < chunkStart) {
                throw protocolError("the server's committed offset " + reported
                        + " went back before the current chunk at " + chunkStart, response);
            }
            if (reported > chunkEnd()) {
                throw protocolError("the server reports " + reported + " bytes committed but only "
                        + chunkEnd() + " were sent", response);
            }
            return reported;
        }

        private Map<String, Object> complete(ProxyResponse response) {
            Map<String, Object> resource = parseResource(response);
            long size = total >= 0 ? total : chunkEnd();
            progress(UploadProgress.of(size, size));
            return resource;
        }

        private Map<String, Object> parseResource(ProxyResponse response) {
            byte[] body = response.body();
            if (new String(body, StandardCharsets.UTF_8).trim().isEmpty()) {
                return Collections.emptyMap();
            }
            try {
                return response.bodyAsJsonObject();
            } catch (IllegalStateException notAnObject) {
                throw protocolError("the final response's body is not a JSON object", response);
            }
        }

        private void progress(UploadProgress progress) {
            if (onProgress != null) {
                onProgress.accept(progress);
            }
        }

        private UploadProtocolException protocolError(String message, ProxyResponse response) {
            return new UploadProtocolException("resumable upload: " + message, response, uploadId, committed);
        }

        /**
         * Once the server has committed the whole current chunk, reads the next one: a full chunk,
         * or the rest of the content, then one byte ahead to learn whether the content ends there.
         * Checks the content against its declared size before the final chunk can be sent.
         */
        private void fill() {
            if (committed < chunkEnd()) {
                return;
            }
            chunkStart = chunkEnd();
            bufferLength = 0;
            if (endOfContent) {
                return;
            }
            int capacity = buffer.length;
            if (declaredTotal >= 0) {
                capacity = (int) Math.min(capacity, declaredTotal - chunkStart);
            }
            try {
                if (lookahead != NO_LOOKAHEAD && capacity > 0) {
                    buffer[bufferLength++] = (byte) lookahead;
                    lookahead = NO_LOOKAHEAD;
                }
                while (bufferLength < capacity) {
                    int read = in.read(buffer, bufferLength, capacity - bufferLength);
                    if (read < 0) {
                        endOfContent = true;
                        break;
                    }
                    bufferLength += read;
                }
                if (!endOfContent && lookahead == NO_LOOKAHEAD) {
                    int next = in.read();
                    if (next < 0) {
                        endOfContent = true;
                    } else {
                        lookahead = next;
                    }
                }
            } catch (IOException e) {
                throw new UncheckedIOException("cannot read the upload content" + sessionContext() + ": "
                        + e.getMessage(), e);
            }
            long read = chunkEnd();
            if (declaredTotal >= 0) {
                if (endOfContent && read < declaredTotal) {
                    throw new IllegalStateException("the content ended after " + read + " bytes but totalBytes is "
                            + declaredTotal + sessionContext());
                }
                if (lookahead != NO_LOOKAHEAD && read == declaredTotal) {
                    throw new IllegalStateException("the content is longer than totalBytes " + declaredTotal
                            + sessionContext());
                }
            }
            if (endOfContent) {
                total = read;
            }
        }

        private String sessionContext() {
            return uploadId == null ? "" : " (upload_id: " + uploadId + ", " + committed + " bytes committed)";
        }
    }

    /** Returns a query parameter's decoded value from a URL, or null. */
    static String queryValue(String url, String name) {
        int query = url.indexOf('?');
        if (query < 0) {
            return null;
        }
        int fragment = url.indexOf('#', query);
        String params = fragment < 0 ? url.substring(query + 1) : url.substring(query + 1, fragment);
        for (String pair : params.split("&")) {
            int equals = pair.indexOf('=');
            String key = equals < 0 ? pair : pair.substring(0, equals);
            if (name.equals(key)) {
                String value = equals < 0 ? "" : pair.substring(equals + 1);
                try {
                    return URLDecoder.decode(value, StandardCharsets.UTF_8.name());
                } catch (UnsupportedEncodingException | IllegalArgumentException malformed) {
                    return null;
                }
            }
        }
        return null;
    }
}
