package com.scalekit.exceptions;

import com.scalekit.models.proxy.ProxyResponse;

import java.util.Optional;

/**
 * Thrown when the server's answers during a resumable upload do not follow Google's resumable
 * upload protocol, so the SDK cannot continue safely. For example:
 * <ul>
 *   <li>the response that starts the session has no {@code Location} header with an
 *       {@code upload_id}, or is a redirect;</li>
 *   <li>a {@code Range} header is malformed, does not start at byte 0, goes back before the
 *       current chunk, or claims bytes that were never sent;</li>
 *   <li>the server keeps answering a chunk with 308 without committing any more bytes, until
 *       the chunk's retries run out;</li>
 *   <li>the server reports the upload complete before the final chunk was sent, which would
 *       otherwise return a truncated file;</li>
 *   <li>the final response's body is not a JSON object.</li>
 * </ul>
 * It is not an {@link UploadException}: the server did not report an error.
 * {@code getGrpcStatusCode()} returns {@code UNKNOWN} (2).
 *
 * @since 2.6.0
 */
public class UploadProtocolException extends APIException {

    private static final long serialVersionUID = 1L;

    private final transient ProxyResponse response;
    private final String uploadId;
    private final long bytesCommitted;

    /**
     * Creates the exception.
     *
     * @param message        what was wrong
     * @param response       the response that broke the protocol, or null
     * @param uploadId       the upload session's ID, or null when the session did not start
     * @param bytesCommitted the bytes the server had committed; not negative
     * @throws IllegalArgumentException if {@code bytesCommitted} is negative
     */
    public UploadProtocolException(String message, ProxyResponse response, String uploadId, long bytesCommitted) {
        super(null, message + UploadException.context(uploadId, bytesCommitted), 2, null);
        this.response = response;
        this.uploadId = uploadId;
        this.bytesCommitted = bytesCommitted;
    }

    /**
     * Returns the response that broke the protocol: its status, headers and body.
     *
     * @return the response, or empty when the problem was not in a single response
     */
    public Optional<ProxyResponse> response() {
        return Optional.ofNullable(response);
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
}
