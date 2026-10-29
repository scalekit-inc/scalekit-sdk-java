package com.scalekit.exceptions;

/**
 * Thrown when a tool failed because the connected account's credentials were rejected or have expired (gRPC {@code UNAUTHENTICATED}). The account's owner must authorize it again, for example through a new authorization link.
 *
 * @since 2.6.0
 */
public class ToolUnauthorizedException extends ToolException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception from a failure, keeping its status, Scalekit error code, error details
     * and cause, and reading the tool details from it.
     *
     * @param source the failure
     */
    public ToolUnauthorizedException(APIException source) {
        super(source);
    }
}
