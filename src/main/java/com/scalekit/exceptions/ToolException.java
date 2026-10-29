package com.scalekit.exceptions;

import com.scalekit.grpc.scalekit.v1.errdetails.ErrorInfo;
import com.scalekit.grpc.scalekit.v1.errdetails.ToolErrorInfo;

import java.util.Optional;

/**
 * Thrown when a tool ran, or tried to run, and failed: the upstream service rejected the call,
 * the connected account's credentials no longer work, or the tool returned an error. The server
 * marks these failures with the Scalekit error code {@code TOOL_ERROR}.
 *
 * <p>{@link #toolErrorCode()}, {@link #toolErrorMessage()} and {@link #executionId()} carry the
 * details. Subclasses mark the cases callers usually handle differently:
 * {@link ToolUnauthorizedException} (the account must be re-authorized),
 * {@link ToolForbiddenException} and {@link ToolRateLimitException}. A tool error never makes the
 * SDK refresh its own credentials or retry.
 *
 * <pre>{@code
 * try {
 *     client.tools().execute("gmail_fetch_mails", params);
 * } catch (ToolUnauthorizedException e) {
 *     // send the user a new authorization link
 * } catch (ToolException e) {
 *     log.warn("tool failed: {} {} (execution {})", e.toolErrorCode().orElse("-"),
 *             e.toolErrorMessage().orElse("-"), e.executionId().orElse("-"));
 * }
 * }</pre>
 *
 * @since 2.6.0
 */
public class ToolException extends APIException {

    private static final long serialVersionUID = 1L;

    private final String toolErrorCode;
    private final String toolErrorMessage;
    private final String executionId;

    /**
     * Creates the exception from a failure, keeping its status, Scalekit error code, error details
     * and cause, and reading the tool details from it.
     *
     * @param source the failure
     */
    public ToolException(APIException source) {
        super(source);
        ErrorInfo info = errorInfo();
        ToolErrorInfo tool = info != null && info.hasToolErrorInfo() ? info.getToolErrorInfo() : null;
        this.toolErrorCode = tool == null ? null : emptyToNull(tool.getToolErrorCode());
        this.toolErrorMessage = tool == null ? null : emptyToNull(tool.getToolErrorMessage());
        this.executionId = tool == null ? null : emptyToNull(tool.getExecutionId());
    }

    /**
     * Returns the tool's own error code, for example {@code UNAUTHENTICATED}.
     *
     * @return the code, or empty
     */
    public Optional<String> toolErrorCode() {
        return Optional.ofNullable(toolErrorCode);
    }

    /**
     * Returns the tool's error message, often the upstream service's.
     *
     * @return the message, or empty
     */
    public Optional<String> toolErrorMessage() {
        return Optional.ofNullable(toolErrorMessage);
    }

    /**
     * Returns the ID of the failed run, for correlating with Scalekit's tool-call logs.
     *
     * @return the ID, or empty
     */
    public Optional<String> executionId() {
        return Optional.ofNullable(executionId);
    }

    private static String emptyToNull(String value) {
        return value == null || value.isEmpty() ? null : value;
    }
}
