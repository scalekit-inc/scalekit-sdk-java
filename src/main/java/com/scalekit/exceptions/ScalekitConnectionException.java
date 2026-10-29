package com.scalekit.exceptions;

/**
 * Thrown when the request could not be sent or the response not received: a DNS, connection,
 * TLS or I/O failure, a cancelled call (gRPC {@code CANCELLED}), or an interrupted thread. When
 * the thread was interrupted, the cause is an {@link InterruptedException} and the thread's
 * interrupt flag is set.
 *
 * <p>Thrown by the clients added in 2.6.0 ({@code tools()}, {@code connectedAccounts()},
 * {@code actions()}); the other clients still throw {@link APIException}. Catching
 * {@code APIException} catches both.
 *
 * @since 2.6.0
 */
public class ScalekitConnectionException extends APIException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception from a failure, keeping its status, Scalekit error code, error details
     * and cause.
     *
     * @param source the failure
     */
    public ScalekitConnectionException(APIException source) {
        super(source);
    }

    /**
     * Creates the exception for a failure detected by the SDK. {@code getGrpcStatusCode()}
     * returns {@code CANCELLED} (1) when the cause is an {@link InterruptedException}, otherwise
     * {@code UNAVAILABLE} (14); {@code getScalekitErrorCode()} returns null.
     *
     * @param message the message
     * @param cause   the cause, or null
     */
    public ScalekitConnectionException(String message, Throwable cause) {
        super(null, message, cause instanceof InterruptedException ? 1 : 14, null);
        initCause(cause);
    }
}
