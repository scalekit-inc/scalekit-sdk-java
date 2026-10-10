package com.scalekit.api;

import com.scalekit.exceptions.APIException;
import com.scalekit.exceptions.BadRequestException;
import com.scalekit.exceptions.InternalServerException;
import com.scalekit.exceptions.NotFoundException;
import com.scalekit.exceptions.ScalekitTimeoutException;
import com.scalekit.exceptions.ToolException;
import com.scalekit.models.Page;
import com.scalekit.models.tools.ExecuteToolParams;
import com.scalekit.models.tools.ExecuteToolResult;
import com.scalekit.models.tools.ListAvailableToolsParams;
import com.scalekit.models.tools.ListScopedToolsParams;
import com.scalekit.models.tools.ListToolsParams;
import com.scalekit.models.tools.ScopedTool;
import com.scalekit.models.tools.SearchToolsParams;
import com.scalekit.models.tools.SearchedTool;
import com.scalekit.models.tools.Tool;
import com.scalekit.models.tools.ToolPage;

import java.util.List;

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

    /**
     * Searches every tool of your environment's enabled connections by relevance. The result is
     * complete (not paged), ranked by score. Retried on transient unavailability.
     *
     * @param query what the tool should do, in plain words; not blank
     * @return the matching tools, never null
     * @throws IllegalArgumentException if {@code query} is null or blank
     * @throws APIException if the request fails; see {@link #search(String, SearchToolsParams)}
     * @since 2.6.0
     */
    List<SearchedTool> search(String query);

    /**
     * Searches every tool of your environment's enabled connections by relevance. With an
     * identifier, each result lists whether that identifier can run it through each connection
     * it has used, and the identifier's custom MCP tools are included.
     *
     * <pre>{@code
     * List<SearchedTool> tools = client.tools().search("send an email",
     *         SearchToolsParams.builder().identifier("user_123").topK(5).build());
     * }</pre>
     *
     * @param query  what the tool should do, in plain words (1 to 256 characters)
     * @param params identifier, result limit (default 10, at most 50) and deadline; null for none
     * @return the matching tools, never null
     * @throws IllegalArgumentException if {@code query} is null or blank
     * @throws BadRequestException if the query is invalid
     * @throws ScalekitTimeoutException if the deadline passes
     * @throws APIException for other failures
     * @since 2.6.0
     */
    List<SearchedTool> search(String query, SearchToolsParams params);

    /**
     * Lists the tools an identifier can run through its connected accounts, each with the account
     * that runs it. Retried on transient unavailability.
     *
     * <pre>{@code
     * Page<ScopedTool> page = client.tools().listScoped("user_123",
     *         ListScopedToolsParams.builder().addConnectionName("gmail").build());
     * }</pre>
     *
     * @param identifier your identifier for the user or tenant; trimmed
     * @param params     the filter (required: providers, tool names or connection names), paging
     *                   and deadline
     * @return one page of tools
     * @throws IllegalArgumentException if {@code identifier} is null or blank, or {@code params} is null
     * @throws BadRequestException if a provider is repeated or the identifier has more than one
     *                             account for a provider
     * @throws NotFoundException if the identifier has no account for a requested provider or connection
     * @throws APIException for other failures
     * @since 2.6.0
     */
    Page<ScopedTool> listScoped(String identifier, ListScopedToolsParams params);

    /**
     * Lists the tools of the providers an identifier has accounts with, whatever the accounts'
     * status. An identifier without accounts gets an empty page, not an error.
     *
     * @param identifier your identifier for the user or tenant; trimmed
     * @return the first page of tools
     * @throws IllegalArgumentException if {@code identifier} is null or blank
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    Page<Tool> listAvailable(String identifier);

    /**
     * Lists the tools of the providers an identifier has accounts with, whatever the accounts'
     * status. An identifier without accounts gets an empty page, not an error.
     *
     * <pre>{@code
     * for (Tool tool : client.tools().listAvailable("user_123",
     *         ListAvailableToolsParams.builder().pageSize(50).build()).autoPager()) {
     *     System.out.println(tool.definition().get("name"));
     * }
     * }</pre>
     *
     * @param identifier your identifier for the user or tenant; trimmed
     * @param params     paging and deadline; null for the defaults
     * @return one page of tools
     * @throws IllegalArgumentException if {@code identifier} is null or blank
     * @throws ScalekitTimeoutException if the deadline passes
     * @throws APIException for other failures
     * @since 2.6.0
     */
    Page<Tool> listAvailable(String identifier, ListAvailableToolsParams params);
}
