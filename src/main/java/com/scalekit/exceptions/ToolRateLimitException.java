package com.scalekit.exceptions;

/**
 * Thrown when a tool failed because the upstream service rate-limited the call (gRPC {@code RESOURCE_EXHAUSTED}). Retry later.
 *
 * @since 2.6.0
 */
public class ToolRateLimitException extends ToolException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception from a failure, keeping its status, Scalekit error code, error details
     * and cause, and reading the tool details from it.
     *
     * @param source the failure
     */
    public ToolRateLimitException(APIException source) {
        super(source);
    }
}
