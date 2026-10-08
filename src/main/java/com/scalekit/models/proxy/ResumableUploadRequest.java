package com.scalekit.models.proxy;

import com.scalekit.internal.JsonCodec;
import com.scalekit.internal.JsonValues;
import com.scalekit.internal.Preconditions;
import com.scalekit.internal.proxy.UploadContentAccess;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;

/**
 * A file upload sent with Google's resumable upload protocol through Scalekit's proxy, with
 * {@link com.scalekit.api.ActionsClient#uploadResumable(ResumableUploadRequest)}. It works with
 * the Google APIs that support resumable uploads: Drive ({@code /upload/drive/v3/files}), Cloud
 * Storage ({@code /upload/storage/v1/b/<bucket>/o}) and YouTube ({@code /upload/youtube/v3/videos}).
 *
 * <pre>{@code
 * ResumableUploadRequest upload = ResumableUploadRequest
 *         .builder("googledrive", "user_123", "/upload/drive/v3/files")
 *         .content(Paths.get("big.mp4"))
 *         .contentType("video/mp4")
 *         .metadata(Collections.singletonMap("name", "big.mp4"))
 *         .build();
 *
 * // Replace the content of an existing Drive file.
 * ResumableUploadRequest replace = ResumableUploadRequest
 *         .builder("googledrive", "user_123", "/upload/drive/v3/files/" + fileId)
 *         .method("PATCH")
 *         .content(inputStream)
 *         .build();
 * }</pre>
 *
 * <p>Exactly one content source is required:
 * <ul>
 *   <li>{@link Builder#content(byte[])}: the total size is the array's length;</li>
 *   <li>{@link Builder#content(Path)}: the total size is the file's size when {@link Builder#build()}
 *       runs; the SDK opens and closes the file;</li>
 *   <li>{@link Builder#content(InputStream, long)}: a stream of a known size;</li>
 *   <li>{@link Builder#content(InputStream)}: a stream of unknown size, read until it ends.</li>
 * </ul>
 * The SDK never closes a stream you pass, and reads it one chunk at a time.
 *
 * <p>Rules checked by {@link Builder#build()}, before any network call:
 * <ul>
 *   <li>{@code connectionName}, {@code identifier} and {@code path} are required; the first two
 *       are trimmed and a leading {@code /} is added to the path when missing. They follow the
 *       same rules as in {@link ProxyRequest}; in addition the path must not contain {@code ?}
 *       (pass query parameters with {@link Builder#queryParam(String, String)}), a space, a
 *       control character or DEL;</li>
 *   <li>the method is {@code POST}, {@code PATCH} or {@code PUT}, in any case;</li>
 *   <li>the content type is not blank and contains only printable US-ASCII characters and TAB:
 *       any other control character, including CR and LF anywhere, is rejected, and leading or
 *       trailing spaces and tabs are trimmed;</li>
 *   <li>the chunk size is a positive multiple of {@value #CHUNK_SIZE_MULTIPLE} bytes (256 KiB);</li>
 *   <li>{@code maxRetries} is not negative and the timeout is positive;</li>
 *   <li>a {@link Path} is an existing regular file.</li>
 * </ul>
 *
 * <p>Immutable and thread-safe, apart from the content: a request built from a stream can be
 * uploaded once, and an array passed to {@link Builder#content(byte[])} is not copied, so do not
 * change it until the upload returns. {@link #toString()} prints neither the content nor the
 * metadata values.
 *
 * @since 2.6.0
 */
public final class ResumableUploadRequest {

    /** Default chunk size: 4 MiB. */
    public static final int DEFAULT_CHUNK_SIZE = 4 * 1024 * 1024;

    /** Every chunk size is a multiple of this: 256 KiB, as Google's protocol requires. */
    public static final int CHUNK_SIZE_MULTIPLE = 256 * 1024;

    /** Default number of retries per chunk: 3. */
    public static final int DEFAULT_MAX_RETRIES = 3;

    /** Default content type: {@code application/octet-stream}. */
    public static final String DEFAULT_CONTENT_TYPE = "application/octet-stream";

    private static final String UPLOAD_TYPE = "uploadType";

    static {
        // Gives the SDK's uploader access to the content without making openContent() public.
        UploadContentAccess.install(new UploadContentAccess() {
            @Override
            protected InputStream open(ResumableUploadRequest request) {
                return request.openContent();
            }
        });
    }

    private enum ContentKind { BYTES, STREAM, FILE }

    private final String connectionName;
    private final String identifier;
    private final String path;
    private final String method;
    private final String contentType;
    private final Map<String, Object> metadata;
    private final Map<String, List<String>> queryParams;
    private final ContentKind contentKind;
    private final byte[] bytes;
    private final InputStream stream;
    private final Path file;
    private final long totalBytes;
    private final int chunkSize;
    private final int maxRetries;
    private final Duration timeout;
    private final Consumer<UploadProgress> onProgress;

    private ResumableUploadRequest(Builder builder) {
        this.connectionName = ProxyRequest.checkHeaderValue(
                Preconditions.requireNonBlank(builder.connectionName, "connectionName"), "connectionName");
        this.identifier = ProxyRequest.checkHeaderValue(
                Preconditions.requireNonBlank(builder.identifier, "identifier"), "identifier");
        // Checked before trimming: a control character, space or DEL anywhere is rejected, so that
        // nothing like ".\t." can be turned into a ".." segment by a server along the way.
        if (builder.path != null) {
            for (int i = 0; i < builder.path.length(); i++) {
                char c = builder.path.charAt(i);
                if (c <= 0x20 || c == 0x7F) {
                    throw new IllegalArgumentException("path must not contain spaces or control characters; "
                            + "percent-encode them");
                }
            }
        }
        String rawPath = Preconditions.requireNonBlank(builder.path, "path");
        if (rawPath.indexOf('?') >= 0) {
            throw new IllegalArgumentException("path must not contain '?'; pass query parameters with queryParam");
        }
        this.path = ProxyRequest.checkPath(rawPath.startsWith("/") ? rawPath : "/" + rawPath);
        this.method = checkMethod(builder.method);
        // Checked before trimming, so that a CR or LF anywhere is rejected rather than trimmed away.
        this.contentType = Preconditions.requireNonBlank(
                ProxyRequest.checkHeaderValue(Preconditions.requireNonEmpty(builder.contentType, "contentType"),
                        "contentType"), "contentType");
        this.metadata = builder.metadata;
        Map<String, List<String>> params = new LinkedHashMap<>();
        for (Map.Entry<String, List<String>> entry : builder.queryParams.entrySet()) {
            params.put(entry.getKey(), Collections.unmodifiableList(new ArrayList<>(entry.getValue())));
        }
        this.queryParams = Collections.unmodifiableMap(params);
        if (builder.chunkSize <= 0 || builder.chunkSize % CHUNK_SIZE_MULTIPLE != 0) {
            throw new IllegalArgumentException("chunkSize must be a positive multiple of " + CHUNK_SIZE_MULTIPLE
                    + " bytes (256 KiB), got " + builder.chunkSize);
        }
        this.chunkSize = builder.chunkSize;
        if (builder.maxRetries < 0) {
            throw new IllegalArgumentException("maxRetries must not be negative, got " + builder.maxRetries);
        }
        this.maxRetries = builder.maxRetries;
        this.timeout = Preconditions.requirePositive(builder.timeout, "timeout");
        this.onProgress = builder.onProgress;

        if (builder.contentKind == null) {
            throw new IllegalArgumentException("content is required");
        }
        this.contentKind = builder.contentKind;
        this.bytes = builder.bytes;
        this.stream = builder.stream;
        this.file = builder.file;
        if (contentKind == ContentKind.FILE) {
            this.totalBytes = sizeOf(file);
        } else if (contentKind == ContentKind.BYTES) {
            this.totalBytes = bytes.length;
        } else {
            this.totalBytes = builder.streamTotal;
        }
    }

    /**
     * Returns a new builder.
     *
     * @param connectionName the connection whose account the upload uses, for example {@code "googledrive"}
     * @param identifier     your identifier for the account's owner
     * @param path           the provider's upload path, for example {@code "/upload/drive/v3/files"},
     *                       or {@code "/upload/drive/v3/files/<fileId>"} with method {@code PATCH}
     *                       to replace a Drive file's content; without a query string
     * @return the builder
     */
    public static Builder builder(String connectionName, String identifier, String path) {
        return new Builder(connectionName, identifier, path);
    }

    /**
     * Returns the connection name.
     *
     * @return the trimmed name
     */
    public String connectionName() {
        return connectionName;
    }

    /**
     * Returns the identifier.
     *
     * @return the trimmed identifier
     */
    public String identifier() {
        return identifier;
    }

    /**
     * Returns the upload path, starting with {@code /}.
     *
     * @return the path
     */
    public String path() {
        return path;
    }

    /**
     * Returns the HTTP method that starts the upload session, upper-cased.
     *
     * @return {@code POST}, {@code PATCH} or {@code PUT}
     */
    public String method() {
        return method;
    }

    /**
     * Returns the content's MIME type.
     *
     * @return the content type; {@link #DEFAULT_CONTENT_TYPE} unless set
     */
    public String contentType() {
        return contentType;
    }

    /**
     * Returns the metadata sent as the JSON body of the request that starts the session.
     *
     * @return an unmodifiable copy, or empty when none was set
     */
    public Optional<Map<String, Object>> metadata() {
        return Optional.ofNullable(metadata);
    }

    /**
     * Returns the extra query parameters for the request that starts the session, in the order
     * they were added. The SDK adds {@code uploadType=resumable} itself.
     *
     * @return an unmodifiable map from name to values
     */
    public Map<String, List<String>> queryParams() {
        return queryParams;
    }

    /**
     * Returns the content's total size, when it is known before reading.
     *
     * @return the array's length, the file's size when the request was built, or the size given
     *         with the stream; empty for a stream of unknown size
     */
    public OptionalLong totalBytes() {
        return totalBytes < 0 ? OptionalLong.empty() : OptionalLong.of(totalBytes);
    }

    /**
     * Returns the chunk size.
     *
     * @return the size in bytes; {@link #DEFAULT_CHUNK_SIZE} unless set
     */
    public int chunkSize() {
        return chunkSize;
    }

    /**
     * Returns the maximum number of consecutive retries for a chunk.
     *
     * @return the retries; {@link #DEFAULT_MAX_RETRIES} unless set
     */
    public int maxRetries() {
        return maxRetries;
    }

    /**
     * Returns the deadline for each request of the upload.
     *
     * @return the deadline; {@link ProxyRequest#DEFAULT_TIMEOUT} unless set
     */
    public Duration timeout() {
        return timeout;
    }

    /**
     * Returns the progress callback.
     *
     * @return the callback, or empty when none was set
     */
    public Optional<Consumer<UploadProgress>> onProgress() {
        return Optional.ofNullable(onProgress);
    }

    /**
     * Opens the content for reading. Not part of the public API: the SDK's uploader calls it
     * through {@link UploadContentAccess}. The
     * caller closes the returned stream; closing it never closes a stream passed to
     * {@link Builder#content(InputStream)}.
     *
     * @return a new stream over the array or the file, or the stream that was passed in
     * @throws UncheckedIOException if the file cannot be opened
     */
    InputStream openContent() {
        switch (contentKind) {
            case BYTES:
                return new ByteArrayInputStream(bytes);
            case STREAM:
                return new FilterInputStream(stream) {
                    @Override
                    public void close() {
                        // The caller owns the stream.
                    }
                };
            default:
                try {
                    return Files.newInputStream(file);
                } catch (IOException e) {
                    throw new UncheckedIOException("cannot open the content file: " + e.getMessage(), e);
                }
        }
    }

    @Override
    public String toString() {
        String content;
        switch (contentKind) {
            case BYTES:
                content = "byte[" + bytes.length + "]";
                break;
            case FILE:
                content = "file (" + totalBytes + " bytes)";
                break;
            default:
                content = totalBytes < 0 ? "stream" : "stream (" + totalBytes + " bytes)";
        }
        return "ResumableUploadRequest{method=" + method + ", connectionName=" + connectionName + ", identifier="
                + identifier + ", path=" + path + ", queryParams=" + queryParams.keySet()
                + ", contentType=" + contentType
                + ", content=" + content + ", metadata=" + (metadata == null ? "none" : metadata.keySet())
                + ", chunkSize=" + chunkSize + ", maxRetries=" + maxRetries + ", timeout=" + timeout + "}";
    }

    private static String checkMethod(String method) {
        String upper = Preconditions.requireNonBlank(method, "method").toUpperCase(Locale.ROOT);
        if (!"POST".equals(upper) && !"PATCH".equals(upper) && !"PUT".equals(upper)) {
            throw new IllegalArgumentException("method must be POST, PATCH or PUT, got " + method);
        }
        return upper;
    }

    private static long sizeOf(Path file) {
        if (!Files.isRegularFile(file)) {
            throw new IllegalArgumentException("content file does not exist or is not a regular file: " + file);
        }
        try {
            return Files.size(file);
        } catch (IOException e) {
            throw new IllegalArgumentException("cannot read the size of the content file " + file + ": "
                    + e.getMessage(), e);
        }
    }

    /**
     * Builder for {@link ResumableUploadRequest}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private final String connectionName;
        private final String identifier;
        private final String path;
        private String method = "POST";
        private String contentType = DEFAULT_CONTENT_TYPE;
        private Map<String, Object> metadata;
        private final Map<String, List<String>> queryParams = new LinkedHashMap<>();
        private ContentKind contentKind;
        private byte[] bytes;
        private InputStream stream;
        private long streamTotal = -1;
        private Path file;
        private int chunkSize = DEFAULT_CHUNK_SIZE;
        private int maxRetries = DEFAULT_MAX_RETRIES;
        private Duration timeout = ProxyRequest.DEFAULT_TIMEOUT;
        private Consumer<UploadProgress> onProgress;

        private Builder(String connectionName, String identifier, String path) {
            this.connectionName = connectionName;
            this.identifier = identifier;
            this.path = path;
        }

        /**
         * Uploads an array. Its length is the total size. The array is not copied: do not
         * change it until the upload returns.
         *
         * @param content the bytes; may be empty
         * @return this builder
         * @throws IllegalArgumentException if {@code content} is null or a content source is
         *                                  already set
         */
        public Builder content(byte[] content) {
            setContent(ContentKind.BYTES, content);
            this.bytes = content;
            return this;
        }

        /**
         * Uploads a stream of unknown size, read until it ends. Chunks before the last are sent
         * without a total; the total is sent with the last chunk. The stream is not closed.
         *
         * @param content the stream
         * @return this builder
         * @throws IllegalArgumentException if {@code content} is null or a content source is
         *                                  already set
         */
        public Builder content(InputStream content) {
            setContent(ContentKind.STREAM, content);
            this.stream = content;
            this.streamTotal = -1;
            return this;
        }

        /**
         * Uploads a stream of a known size. The stream must hold exactly {@code totalBytes}
         * bytes: if it ends early, or holds more, the upload stops with
         * {@link IllegalStateException} before the last chunk is sent. The stream is not closed.
         *
         * @param content    the stream
         * @param totalBytes the number of bytes in the stream; not negative
         * @return this builder
         * @throws IllegalArgumentException if {@code content} is null, {@code totalBytes} is
         *                                  negative, or a content source is already set
         */
        public Builder content(InputStream content, long totalBytes) {
            if (totalBytes < 0) {
                throw new IllegalArgumentException("totalBytes must not be negative, got " + totalBytes);
            }
            setContent(ContentKind.STREAM, content);
            this.stream = content;
            this.streamTotal = totalBytes;
            return this;
        }

        /**
         * Uploads a file. Its size when {@link #build()} runs is the total size; if the file
         * changes size before the upload ends, the upload stops with {@link IllegalStateException}.
         * The SDK opens the file when the upload starts and closes it when it ends.
         *
         * @param content the file
         * @return this builder
         * @throws IllegalArgumentException if {@code content} is null or a content source is
         *                                  already set
         */
        public Builder content(Path content) {
            setContent(ContentKind.FILE, content);
            this.file = content;
            return this;
        }

        private void setContent(ContentKind kind, Object content) {
            if (content == null) {
                throw new IllegalArgumentException("content must not be null");
            }
            if (contentKind != null) {
                throw new IllegalArgumentException("content is already set; set exactly one content source");
            }
            this.contentKind = kind;
        }

        /**
         * Sets the HTTP method that starts the upload session. Chunks are always sent with
         * {@code PUT}.
         *
         * @param method {@code POST} (the default), {@code PATCH} (Drive: replace an existing
         *               file's content) or {@code PUT}, in any case
         * @return this builder
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * Sets the content's MIME type, sent as {@code X-Upload-Content-Type} when the session
         * starts and as {@code Content-Type} with each chunk.
         *
         * @param contentType the type, for example {@code video/mp4}; defaults to
         *                    {@link #DEFAULT_CONTENT_TYPE}
         * @return this builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Sets the resource metadata, sent as the JSON body of the request that starts the
         * session, for example a Drive file's {@code name} and {@code parents}. Without metadata
         * that request has no body.
         *
         * @param metadata a JSON object of String, Number, Boolean, null, maps and lists
         * @return this builder
         * @throws IllegalArgumentException if {@code metadata} is null or holds a value that is
         *                                  not JSON-compatible
         */
        public Builder metadata(Map<String, ?> metadata) {
            Map<String, Object> copy = JsonValues.copyObject(metadata, "metadata");
            JsonCodec.encode(copy);
            this.metadata = copy;
            return this;
        }

        /**
         * Adds a query parameter to the request that starts the session, for example YouTube's
         * {@code part=snippet,status} or Drive's {@code supportsAllDrives=true}. Call it again
         * with the same name to send several values. Chunk requests do not repeat it.
         *
         * @param name  the parameter name; not {@code uploadType} (matched exactly), which the
         *              SDK sets
         * @param value the parameter value
         * @return this builder
         * @throws IllegalArgumentException if {@code name} or {@code value} is null, or
         *                                  {@code name} is {@code uploadType}
         */
        public Builder queryParam(String name, String value) {
            if (name == null || value == null) {
                throw new IllegalArgumentException("query parameter name and value must not be null");
            }
            if (UPLOAD_TYPE.equals(name)) {
                throw new IllegalArgumentException("uploadType is set by the SDK and cannot be given");
            }
            List<String> values = queryParams.get(name);
            if (values == null) {
                values = new ArrayList<>();
                queryParams.put(name, values);
            }
            values.add(value);
            return this;
        }

        /**
         * Adds several query parameters to the request that starts the session.
         *
         * @param params the parameters
         * @return this builder
         * @throws IllegalArgumentException under the same conditions as
         *                                  {@link #queryParam(String, String)}
         */
        public Builder queryParams(Map<String, String> params) {
            if (params != null) {
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    queryParam(entry.getKey(), entry.getValue());
                }
            }
            return this;
        }

        /**
         * Sets the chunk size. Each chunk is held in memory until the server commits it, so this
         * bounds the upload's memory use. Smaller chunks lose less work when a chunk fails;
         * larger ones need fewer requests.
         *
         * @param chunkSize a positive multiple of {@link #CHUNK_SIZE_MULTIPLE} bytes; defaults to
         *                  {@link #DEFAULT_CHUNK_SIZE}
         * @return this builder
         */
        public Builder chunkSize(int chunkSize) {
            this.chunkSize = chunkSize;
            return this;
        }

        /**
         * Sets how many times in a row a chunk may fail before the upload gives up. The count
         * resets whenever the server commits more bytes.
         *
         * @param maxRetries zero or more; defaults to {@link #DEFAULT_MAX_RETRIES}
         * @return this builder
         */
        public Builder maxRetries(int maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        /**
         * Sets the deadline for each request of the upload (the session start, each chunk and
         * each status query), not for the whole upload. On Java 8 it applies to connecting and to
         * each read.
         *
         * @param timeout a positive duration; defaults to {@link ProxyRequest#DEFAULT_TIMEOUT}
         * @return this builder
         */
        public Builder timeout(Duration timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * Sets a callback for progress. It runs on the uploading thread each time the server
         * commits more bytes, and once when the upload completes with the total size. An
         * exception it throws stops the upload and is thrown by
         * {@link com.scalekit.api.ActionsClient#uploadResumable(ResumableUploadRequest)}.
         *
         * @param onProgress the callback
         * @return this builder
         * @throws IllegalArgumentException if {@code onProgress} is null
         */
        public Builder onProgress(Consumer<UploadProgress> onProgress) {
            if (onProgress == null) {
                throw new IllegalArgumentException("onProgress must not be null");
            }
            this.onProgress = onProgress;
            return this;
        }

        /**
         * Builds the request.
         *
         * @return the request
         * @throws IllegalArgumentException if a rule in the class description is broken
         */
        public ResumableUploadRequest build() {
            return new ResumableUploadRequest(this);
        }
    }
}
