package com.scalekit.api;

import com.scalekit.exceptions.APIException;
import com.scalekit.exceptions.BadRequestException;
import com.scalekit.exceptions.InternalServerException;
import com.scalekit.exceptions.NotFoundException;
import com.scalekit.exceptions.ScalekitTimeoutException;
import com.scalekit.exceptions.ToolException;
import com.scalekit.models.tools.ExecuteToolParams;
import com.scalekit.models.tools.ExecuteToolResult;
import com.scalekit.models.tools.ListToolsParams;
import com.scalekit.models.tools.ToolPage;

/**
 * Lists the tools agents can run and runs them on behalf of a connected account. Get it from
 * {@link com.scalekit.ScalekitClient#tools()}.
 *
 * <pre>{@code
 * ExecuteToolResult result = client.tools().execute("gmail_fetch_mails",
 *         ExecuteToolParams.builder()
 *                 .connectionName("gmail")
 *                 .identifier("user_123")
 *                 .putToolInput("max_results", 5)
 *                 .build());
 * Map<String, Object> data = result.data();
 * }</pre>
 *
 * <p>Calls use a 60-second deadline by default ({@link ExecuteToolParams#DEFAULT_TIMEOUT}).
 * Implementations are thread-safe. This interface is not designed for implementation outside
 * the SDK: mock it in tests, but do not implement it, because methods may be added.
 *
 * @since 2.6.0
 */
public interface ToolsClient {

    /**
     * Lists the first page of all tools.
     *
     * @return the first page; iterate {@link ToolPage#autoPager()} for every tool
     * @throws APIException if the request fails; see {@link #list(ListToolsParams)}
     * @since 2.6.0
     */
    ToolPage list();

    /**
     * Lists one page of tools that match the filters. Retried on transient unavailability.
     *
     * <pre>{@code
     * for (Tool tool : client.tools().list(ListToolsParams.builder().connectionName("gmail").build()).autoPager()) {
     *     System.out.println(tool.definition().get("name"));
     * }
     * }</pre>
     *
     * @param params filters and paging; null lists all tools
     * @return the page; with {@code summary(true)} only {@link ToolPage#toolNames()} is filled
     * @throws NotFoundException if the connection, connected account or identifier is unknown
     * @throws BadRequestException if a filter is invalid
     * @throws ScalekitTimeoutException if the deadline passes
     * @throws APIException for other failures
     * @since 2.6.0
     */
    ToolPage list(ListToolsParams params);

    /**
     * Runs a tool. Never retried on transient failures, because the tool may already have acted
     * upstream; an {@link InternalServerException} or {@link ScalekitTimeoutException} therefore
     * does not mean the tool did not run.
     *
     * @param toolName the tool's name, for example {@code "gmail_send_email"}; trimmed
     * @param params   which account runs the tool, the input, and the deadline; null sends none
     * @return the tool's output
     * @throws IllegalArgumentException if {@code toolName} is null or blank
     * @throws ToolException if the tool failed; subclasses mark an account that must be
     *                       re-authorized, a forbidden call and a rate limit
     * @throws BadRequestException if the tool does not exist, no account is selected, or the
     *                             account is not active
     * @throws NotFoundException if the selected account does not exist
     * @throws ScalekitTimeoutException if the deadline passes
     * @throws APIException for other failures
     * @since 2.6.0
     */
    ExecuteToolResult execute(String toolName, ExecuteToolParams params);
}
