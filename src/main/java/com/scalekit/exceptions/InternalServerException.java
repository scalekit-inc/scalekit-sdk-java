package com.scalekit.exceptions;

/**
 * Thrown when the server fails or is unreachable: gRPC {@code INTERNAL}, {@code UNKNOWN},
 * {@code DATA_LOSS}, {@code UNIMPLEMENTED} or {@code UNAVAILABLE} (HTTP 5xx). Read
 * {@code getGrpcStatusCode()} to tell them apart.
 *
 * <p>For calls that are not retried (running a tool and the create calls), the operation may
 * have completed on the server before the failure; check before repeating it.
 *
 * <p>Thrown by the clients added in 2.6.0 ({@code tools()}, {@code connectedAccounts()},
 * {@code actions()}); the other clients still throw {@link APIException}. Catching
 * {@code APIException} catches both.
 *
 * @since 2.6.0
 */
public class InternalServerException extends APIException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception from a failure, keeping its status, Scalekit error code, error details
     * and cause.
     *
     * @param source the failure
     */
    public InternalServerException(APIException source) {
        super(source);
    }

    /**
     * Creates the exception for a failure detected by the SDK. {@code getGrpcStatusCode()}
     * returns {@code INTERNAL} (13); {@code getScalekitErrorCode()} returns null.
     *
     * @param message the message
     * @param cause   the cause, or null
     */
    public InternalServerException(String message, Throwable cause) {
        super(null, message, 13, null);
        initCause(cause);
    }
}
