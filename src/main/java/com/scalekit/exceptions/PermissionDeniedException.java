package com.scalekit.exceptions;

/**
 * Thrown when the caller may not perform the operation: gRPC {@code PERMISSION_DENIED}
 * (HTTP 403), for example a disabled connection ({@code CONNECTION_NOT_ENABLED}) or an
 * identifier that does not match the one a verification link was issued for.
 *
 * <p>Thrown by the clients added in 2.6.0 ({@code tools()}, {@code connectedAccounts()},
 * {@code actions()}); the other clients still throw {@link APIException}. Catching
 * {@code APIException} catches both.
 *
 * @since 2.6.0
 */
public class PermissionDeniedException extends APIException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception from a failure, keeping its status, Scalekit error code, error details
     * and cause.
     *
     * @param source the failure
     */
    public PermissionDeniedException(APIException source) {
        super(source);
    }

    /**
     * Creates the exception for a failure detected by the SDK. {@code getGrpcStatusCode()}
     * returns {@code PERMISSION_DENIED} (7); {@code getScalekitErrorCode()} returns null.
     *
     * @param message the message
     * @param cause   the cause, or null
     */
    public PermissionDeniedException(String message, Throwable cause) {
        super(null, message, 7, null);
        initCause(cause);
    }
}
