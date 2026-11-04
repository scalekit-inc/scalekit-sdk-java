package com.scalekit.exceptions;

/**
 * Thrown when the request conflicts with the current state: gRPC {@code ALREADY_EXISTS} or
 * {@code ABORTED} (HTTP 409).
 *
 * <p>Thrown by the clients added in 2.6.0 ({@code tools()}, {@code connectedAccounts()},
 * {@code actions()}); the other clients still throw {@link APIException}. Catching
 * {@code APIException} catches both.
 *
 * @since 2.6.0
 */
public class ConflictException extends APIException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception from a failure, keeping its status, Scalekit error code, error details
     * and cause.
     *
     * @param source the failure
     */
    public ConflictException(APIException source) {
        super(source);
    }

    /**
     * Creates the exception for a failure detected by the SDK. {@code getGrpcStatusCode()}
     * returns {@code ALREADY_EXISTS} (6); {@code getScalekitErrorCode()} returns null.
     *
     * @param message the message
     * @param cause   the cause, or null
     */
    public ConflictException(String message, Throwable cause) {
        super(null, message, 6, null);
        initCause(cause);
    }
}
