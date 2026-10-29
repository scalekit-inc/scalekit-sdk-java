package com.scalekit.exceptions;

/**
 * Thrown when a tool failed because the upstream service refused the call even with valid credentials (gRPC {@code PERMISSION_DENIED}), typically because a scope is missing.
 *
 * @since 2.6.0
 */
public class ToolForbiddenException extends ToolException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception from a failure, keeping its status, Scalekit error code, error details
     * and cause, and reading the tool details from it.
     *
     * @param source the failure
     */
    public ToolForbiddenException(APIException source) {
        super(source);
    }
}
