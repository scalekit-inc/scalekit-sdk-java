package com.scalekit.exceptions;

/**
 * Thrown when a rate limit or quota is exceeded: gRPC {@code RESOURCE_EXHAUSTED} (HTTP 429).
 * Retry later.
 *
 * <p>Thrown by the clients added in 2.6.0 ({@code tools()}, {@code connectedAccounts()},
 * {@code actions()}); the other clients still throw {@link APIException}. Catching
 * {@code APIException} catches both.
 *
 * @since 2.6.0
 */
public class RateLimitException extends APIException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception from a failure, keeping its status, Scalekit error code, error details
     * and cause.
     *
     * @param source the failure
     */
    public RateLimitException(APIException source) {
        super(source);
    }

    /**
     * Creates the exception for a failure detected by the SDK. {@code getGrpcStatusCode()}
     * returns {@code RESOURCE_EXHAUSTED} (8); {@code getScalekitErrorCode()} returns null.
     *
     * @param message the message
     * @param cause   the cause, or null
     */
    public RateLimitException(String message, Throwable cause) {
        super(null, message, 8, null);
        initCause(cause);
    }
}
