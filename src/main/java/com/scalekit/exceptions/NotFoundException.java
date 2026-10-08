package com.scalekit.exceptions;

/**
 * Thrown when the resource, or something the request names (such as a connection), does not
 * exist: gRPC {@code NOT_FOUND} (HTTP 404).
 *
 * <p>Thrown by the clients added in 2.6.0 ({@code tools()}, {@code connectedAccounts()},
 * {@code actions()}); the other clients still throw {@link APIException}. Catching
 * {@code APIException} catches both.
 *
 * @since 2.6.0
 */
public class NotFoundException extends APIException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception from a failure, keeping its status, Scalekit error code, error details
     * and cause.
     *
     * @param source the failure
     */
    public NotFoundException(APIException source) {
        super(source);
    }

    /**
     * Creates the exception for a failure detected by the SDK. {@code getGrpcStatusCode()}
     * returns {@code NOT_FOUND} (5); {@code getScalekitErrorCode()} returns null.
     *
     * @param message the message
     * @param cause   the cause, or null
     */
    public NotFoundException(String message, Throwable cause) {
        super(null, message, 5, null);
        initCause(cause);
    }
}
