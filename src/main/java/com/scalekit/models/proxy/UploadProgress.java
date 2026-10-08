package com.scalekit.models.proxy;

import java.util.OptionalLong;

/**
 * How far a resumable upload has got: the bytes the server has committed and, once known, the
 * total size. Passed to the callback set with {@link ResumableUploadRequest.Builder#onProgress}.
 *
 * <pre>{@code
 * ResumableUploadRequest.builder("googledrive", "user_123", "/upload/drive/v3/files")
 *         .content(Paths.get("big.mp4"))
 *         .onProgress(p -> log.info("uploaded {} of {} bytes", p.bytesCommitted(),
 *                 p.totalBytes().isPresent() ? p.totalBytes().getAsLong() : "?"))
 *         .build();
 * }</pre>
 *
 * <p>Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class UploadProgress {

    private static final long UNKNOWN = -1;

    private final long bytesCommitted;
    private final long totalBytes;

    private UploadProgress(long bytesCommitted, long totalBytes) {
        if (bytesCommitted < 0) {
            throw new IllegalArgumentException("bytesCommitted must not be negative, got " + bytesCommitted);
        }
        if (totalBytes != UNKNOWN && totalBytes < bytesCommitted) {
            throw new IllegalArgumentException("totalBytes (" + totalBytes + ") must not be less than bytesCommitted ("
                    + bytesCommitted + ")");
        }
        this.bytesCommitted = bytesCommitted;
        this.totalBytes = totalBytes;
    }

    /**
     * Returns the progress of an upload whose total size is not known yet.
     *
     * @param bytesCommitted the bytes the server has committed; not negative
     * @return the progress
     * @throws IllegalArgumentException if {@code bytesCommitted} is negative
     */
    public static UploadProgress of(long bytesCommitted) {
        return new UploadProgress(bytesCommitted, UNKNOWN);
    }

    /**
     * Returns the progress of an upload whose total size is known.
     *
     * @param bytesCommitted the bytes the server has committed; not negative
     * @param totalBytes     the total size; not less than {@code bytesCommitted}
     * @return the progress
     * @throws IllegalArgumentException if {@code bytesCommitted} is negative or
     *                                  {@code totalBytes} is less than it
     */
    public static UploadProgress of(long bytesCommitted, long totalBytes) {
        if (totalBytes < 0) {
            throw new IllegalArgumentException("totalBytes must not be negative, got " + totalBytes);
        }
        return new UploadProgress(bytesCommitted, totalBytes);
    }

    /**
     * Returns the number of bytes the server has committed.
     *
     * @return the committed bytes
     */
    public long bytesCommitted() {
        return bytesCommitted;
    }

    /**
     * Returns the total size of the upload.
     *
     * @return the total, or empty while the content is a stream of unknown size that has not
     *         been read to its end
     */
    public OptionalLong totalBytes() {
        return totalBytes == UNKNOWN ? OptionalLong.empty() : OptionalLong.of(totalBytes);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadProgress)) {
            return false;
        }
        UploadProgress that = (UploadProgress) other;
        return bytesCommitted == that.bytesCommitted && totalBytes == that.totalBytes;
    }

    @Override
    public int hashCode() {
        return 31 * Long.hashCode(bytesCommitted) + Long.hashCode(totalBytes);
    }

    @Override
    public String toString() {
        return "UploadProgress{bytesCommitted=" + bytesCommitted + ", totalBytes="
                + (totalBytes == UNKNOWN ? "unknown" : String.valueOf(totalBytes)) + "}";
    }
}
