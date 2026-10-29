package com.scalekit.exceptions;

/**
 * Thrown when authentication fails: gRPC {@code UNAUTHENTICATED} (HTTP 401) after the SDK's
 * one credential refresh, or when the SDK cannot obtain an access token.
 *
 * <p>When {@code getScalekitErrorCode()} is {@code REAUTHENTICATION_NEEDED}, the failing
 * credentials are a connected account's, not your client credentials: the account's owner must
 * authorize it again.
 *
 * <p>Thrown by the clients added in 2.6.0 ({@code tools()}, {@code connectedAccounts()},
 * {@code actions()}); the other clients still throw {@link APIException}. Catching
 * {@code APIException} catches both.
 *
 * @since 2.6.0
 */
public class AuthenticationException extends APIException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception from a failure, keeping its status, Scalekit error code, error details
     * and cause.
     *
     * @param source the failure
     */
    public AuthenticationException(APIException source) {
        super(source);
    }

    /**
     * Creates the exception for a failure detected by the SDK. {@code getGrpcStatusCode()}
     * returns {@code UNAUTHENTICATED} (16); {@code getScalekitErrorCode()} returns null.
     *
     * @param message the message
     * @param cause   the cause, or null
     */
    public AuthenticationException(String message, Throwable cause) {
        super(null, message, 16, null);
        initCause(cause);
    }
}
