package com.scalekit.exceptions;

import io.grpc.StatusRuntimeException;

/**
 * Exception thrown when token validation fails.
 * This indicates the token is invalid, expired, or has been revoked.
 */
public class TokenInvalidException extends APIException {

    public TokenInvalidException(StatusRuntimeException exception) {
        super(exception);
    }

    public TokenInvalidException(String message) {
        super(message);
    }

    public TokenInvalidException(APIException cause) {
        super(cause.getMessage());
        initCause(cause);
    }
}
