package com.scalekit.exceptions;

import com.scalekit.models.proxy.ProxyResponse;

/**
 * Thrown when a resumable upload's session no longer exists: a chunk or status query got
 * {@code 404} or {@code 410}. Google keeps an upload session for about a week. The SDK does not
 * start a new session on its own, so nothing is uploaded twice without you deciding to; to
 * retry, call {@link com.scalekit.api.ActionsClient#uploadResumable} again with fresh content.
 *
 * <pre>{@code
 * try {
 *     client.actions().uploadResumable(upload);
 * } catch (UploadSessionExpiredException e) {
 *     client.actions().uploadResumable(rebuildUpload());
 * }
 * }</pre>
 *
 * @since 2.6.0
 */
public class UploadSessionExpiredException extends UploadException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception.
     *
     * @param response       the 404 or 410 response
     * @param uploadId       the upload session's ID, or null when unknown
     * @param bytesCommitted the bytes the server had committed; not negative
     * @throws IllegalArgumentException if {@code response} is null or {@code bytesCommitted} is
     *                                  negative
     */
    public UploadSessionExpiredException(ProxyResponse response, String uploadId, long bytesCommitted) {
        super(response, uploadId, bytesCommitted);
    }
}
