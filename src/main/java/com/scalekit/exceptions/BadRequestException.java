package com.scalekit.exceptions;

/**
 * Thrown when the server rejects a request as invalid: gRPC {@code INVALID_ARGUMENT},
 * {@code FAILED_PRECONDITION} or {@code OUT_OF_RANGE} (HTTP 400). Validation failures, a
 * duplicate create ({@code RESOURCE_ALREADY_EXISTS}) and an unknown tool name land here; read
 * {@code getScalekitErrorCode()} for the reason.
 *
 * <p>Thrown by the clients added in 2.6.0 ({@code tools()}, {@code connectedAccounts()},
 * {@code actions()}); the other clients still throw {@link APIException}. Catching
 * {@code APIException} catches both.
 *
 * @since 2.6.0
 */
public class BadRequestException extends APIException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception from a failure, keeping its status, Scalekit error code, error details
     * and cause.
     *
     * @param source the failure
     */
    public BadRequestException(APIException source) {
        super(source);
    }

    /**
     * Creates the exception for a failure detected by the SDK. {@code getGrpcStatusCode()}
     * returns {@code INVALID_ARGUMENT} (3); {@code getScalekitErrorCode()} returns null.
     *
     * @param message the message
     * @param cause   the cause, or null
     */
    public BadRequestException(String message, Throwable cause) {
        super(null, message, 3, null);
        initCause(cause);
    }
}
