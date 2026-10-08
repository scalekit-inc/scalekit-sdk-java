package com.scalekit.exceptions;

/**
 * Thrown when a call does not complete before its deadline: gRPC {@code DEADLINE_EXCEEDED}, or
 * the timeout of a proxied request. Never retried by the SDK: the operation may still complete
 * on the server.
 *
 * <p>Thrown by the clients added in 2.6.0 ({@code tools()}, {@code connectedAccounts()},
 * {@code actions()}); the other clients still throw {@link APIException}. Catching
 * {@code APIException} catches both.
 *
 * @since 2.6.0
 */
public class ScalekitTimeoutException extends APIException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception from a failure, keeping its status, Scalekit error code, error details
     * and cause.
     *
     * @param source the failure
     */
    public ScalekitTimeoutException(APIException source) {
        super(source);
    }

    /**
     * Creates the exception for a failure detected by the SDK. {@code getGrpcStatusCode()}
     * returns {@code DEADLINE_EXCEEDED} (4); {@code getScalekitErrorCode()} returns null.
     *
     * @param message the message
     * @param cause   the cause, or null
     */
    public ScalekitTimeoutException(String message, Throwable cause) {
        super(null, message, 4, null);
        initCause(cause);
    }
}
