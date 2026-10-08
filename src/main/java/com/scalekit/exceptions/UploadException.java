package com.scalekit.exceptions;

import com.scalekit.models.proxy.ProxyResponse;

import java.util.Optional;

/**
 * Thrown when a resumable upload
 * ({@link com.scalekit.api.ActionsClient#uploadResumable(com.scalekit.models.proxy.ResumableUploadRequest)})
 * gets an HTTP status it cannot continue from: the request that starts the session got a status
 * of 400 or above; a chunk got a 4xx other than 408 and 429, or a 2xx other than 200 and 201; or a
 * chunk kept failing with a retryable status (408, 429, 500, 502, 503, 504) until its retries ran
 * out. As a {@link ProxyException} it carries the response's status, headers and body.
 *
 * <p>{@link UploadSessionExpiredException}, a subclass, marks an upload session that no longer
 * exists. {@link #uploadId()} is empty when the session never started.
 *
 * <pre>{@code
 * try {
 *     Map<String, Object> file = client.actions().uploadResumable(upload);
 * } catch (UploadSessionExpiredException e) {
 *     // start the upload again
 * } catch (UploadException e) {
 *     log.warn("upload failed with HTTP {} after {} bytes (upload {})", e.statusCode(),
 *             e.bytesCommitted(), e.uploadId().orElse("-"));
 * }
 * }</pre>
 *
 * @since 2.6.0
 */
public class UploadException extends ProxyException {

    private static final long serialVersionUID = 1L;

    private final String uploadId;
    private final long bytesCommitted;

    /**
     * Creates the exception.
     *
     * @param response       the error response
     * @param uploadId       the upload session's ID, or null when the session did not start
     * @param bytesCommitted the bytes the server had committed; not negative
     * @throws IllegalArgumentException if {@code response} is null or {@code bytesCommitted} is
     *                                  negative
     */
    public UploadException(ProxyResponse response, String uploadId, long bytesCommitted) {
        super(response, "resumable upload", context(uploadId, bytesCommitted));
        this.uploadId = uploadId;
        this.bytesCommitted = bytesCommitted;
    }

    /**
     * Returns the upload session's ID. It is not a secret; quote it when reporting a problem.
     *
     * @return the ID, or empty when the session did not start
     */
    public Optional<String> uploadId() {
        return Optional.ofNullable(uploadId);
    }

    /**
     * Returns the number of bytes the server had committed when the upload stopped.
     *
     * @return the committed bytes
     */
    public long bytesCommitted() {
        return bytesCommitted;
    }

    static String context(String uploadId, long bytesCommitted) {
        if (bytesCommitted < 0) {
            throw new IllegalArgumentException("bytesCommitted must not be negative, got " + bytesCommitted);
        }
        return uploadId == null ? " (session not started)"
                : " (upload_id: " + uploadId + ", " + bytesCommitted + " bytes committed)";
    }
}
