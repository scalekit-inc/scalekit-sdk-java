package com.scalekit.api;

import com.scalekit.exceptions.APIException;
import com.scalekit.exceptions.AuthenticationException;
import com.scalekit.exceptions.ProxyException;
import com.scalekit.exceptions.ScalekitConnectionException;
import com.scalekit.exceptions.ScalekitTimeoutException;
import com.scalekit.models.Page;
import com.scalekit.models.connectedaccounts.AuthorizationLink;
import com.scalekit.models.connectedaccounts.AuthorizationLinkParams;
import com.scalekit.models.connectedaccounts.ConnectedAccount;
import com.scalekit.models.connectedaccounts.ConnectedAccountRef;
import com.scalekit.models.connectedaccounts.CreateConnectedAccountParams;
import com.scalekit.models.connectedaccounts.ListConnectedAccountsParams;
import com.scalekit.models.connectedaccounts.UpdateConnectedAccountParams;
import com.scalekit.models.connectedaccounts.UserVerificationResult;
import com.scalekit.models.connections.AppConnection;
import com.scalekit.models.connections.ListAppConnectionsParams;
import com.scalekit.models.proxy.ProxyRequest;
import com.scalekit.models.proxy.ProxyResponse;
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
 * One entry point for agent actions: tools, connected accounts, MCP configurations, custom
 * providers, and calls to third-party APIs through Scalekit's proxy. Get it from
 * {@link com.scalekit.ScalekitClient#actions()}.
 *
 * <p>The tool and connected-account methods are the same operations as
 * {@link ToolsClient} and {@link ConnectedAccountsClient}, under the names the other Scalekit
 * SDKs use for this facade; they behave and fail identically.
 *
 * <pre>{@code
 * ActionsClient actions = client.actions();
 * ConnectedAccount account = actions.getOrCreateConnectedAccount("gmail", "user_123");
 * ProxyResponse profile = actions.request(
 *         ProxyRequest.builder("gmail", "user_123", "/gmail/v1/users/me/profile").build());
 * }</pre>
 *
 * <p>Implementations are thread-safe. This interface is not designed for implementation outside
 * the SDK: mock it in tests, but do not implement it, because methods may be added.
 *
 * @since 2.6.0
 */
public interface ActionsClient {

    /**
     * Returns the MCP configuration client. The same instance is returned on every call.
     *
     * @return the MCP client
     * @since 2.6.0
     */
    McpClient mcp();

    /**
     * Returns the custom provider client. The same instance is returned on every call.
     *
     * @return the providers client
     * @since 2.6.0
     */
    ProvidersClient providers();

    /**
     * Same as {@link ToolsClient#list()}.
     *
     * @return the first page of tools
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    ToolPage listTools();

    /**
     * Same as {@link ToolsClient#list(ListToolsParams)}.
     *
     * @param params filters and paging; null lists all tools
     * @return the page
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    ToolPage listTools(ListToolsParams params);

    /**
     * Same as {@link ToolsClient#execute(String, ExecuteToolParams)}: runs a tool, never retried.
     *
     * <pre>{@code
     * ExecuteToolResult result = client.actions().executeTool("gmail_fetch_mails",
     *         ExecuteToolParams.builder().connectionName("gmail").identifier("user_123")
     *                 .putToolInput("max_results", 1).build());
     * }</pre>
     *
     * @param toolName the tool's name; trimmed
     * @param params   which account runs the tool, the input, and the deadline; null sends none
     * @return the tool's output
     * @throws IllegalArgumentException if {@code toolName} is null or blank
     * @throws com.scalekit.exceptions.ToolException if the tool failed
     * @throws APIException for other failures
     * @since 2.6.0
     */
    ExecuteToolResult executeTool(String toolName, ExecuteToolParams params);

    /**
     * Same as {@link ConnectedAccountsClient#getMagicLink(ConnectedAccountRef)}.
     *
     * @param account the account to authorize
     * @return the link
     * @throws IllegalArgumentException if {@code account} is null
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    AuthorizationLink getAuthorizationLink(ConnectedAccountRef account);

    /**
     * Same as {@link ConnectedAccountsClient#getMagicLink(ConnectedAccountRef, AuthorizationLinkParams)}.
     *
     * @param account the account to authorize
     * @param params  state and verification URL; null for none
     * @return the link
     * @throws IllegalArgumentException if {@code account} is null
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    AuthorizationLink getAuthorizationLink(ConnectedAccountRef account, AuthorizationLinkParams params);

    /**
     * Same as {@link ConnectedAccountsClient#verifyUser(String, String)}.
     *
     * @param authRequestId the auth request ID passed to your verification page
     * @param identifier    the identifier of the user signed in to your app
     * @return where to send the user next
     * @throws IllegalArgumentException if either value is null or blank
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    UserVerificationResult verifyConnectedAccountUser(String authRequestId, String identifier);

    /**
     * Same as {@link ConnectedAccountsClient#list()}.
     *
     * @return the first page of connected accounts
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    Page<ConnectedAccount> listConnectedAccounts();

    /**
     * Same as {@link ConnectedAccountsClient#list(ListConnectedAccountsParams)}.
     *
     * @param params filters and paging; null lists all accounts
     * @return the page
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    Page<ConnectedAccount> listConnectedAccounts(ListConnectedAccountsParams params);

    /**
     * Same as {@link ConnectedAccountsClient#get(ConnectedAccountRef)}.
     *
     * @param account the account to get
     * @return the account
     * @throws IllegalArgumentException if {@code account} is null
     * @throws com.scalekit.exceptions.NotFoundException if the connection does not exist, or no
     *                           account matches the connection name and identifier; an unknown
     *                           account ID surfaces as
     *                           {@link com.scalekit.exceptions.InternalServerException}
     * @throws APIException for other failures
     * @since 2.6.0
     */
    ConnectedAccount getConnectedAccount(ConnectedAccountRef account);

    /**
     * Same as {@link ConnectedAccountsClient#create(String, String)}.
     *
     * @param connectionName the connection
     * @param identifier     your identifier for the account's owner
     * @return the new account
     * @throws IllegalArgumentException if either value is null or blank
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    ConnectedAccount createConnectedAccount(String connectionName, String identifier);

    /**
     * Same as {@link ConnectedAccountsClient#create(String, String, CreateConnectedAccountParams)}.
     *
     * @param connectionName the connection
     * @param identifier     your identifier for the account's owner
     * @param params         credentials and API configuration; null for none
     * @return the new account
     * @throws IllegalArgumentException if {@code connectionName} or {@code identifier} is null or blank
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    ConnectedAccount createConnectedAccount(String connectionName, String identifier,
                                            CreateConnectedAccountParams params);

    /**
     * Same as {@link ConnectedAccountsClient#getOrCreate(String, String)}.
     *
     * @param connectionName the connection
     * @param identifier     your identifier for the account's owner
     * @return the existing or new account
     * @throws IllegalArgumentException if either value is null or blank
     * @throws APIException if a request fails
     * @since 2.6.0
     */
    ConnectedAccount getOrCreateConnectedAccount(String connectionName, String identifier);

    /**
     * Same as {@link ConnectedAccountsClient#getOrCreate(String, String, CreateConnectedAccountParams)}.
     *
     * @param connectionName the connection
     * @param identifier     your identifier for the account's owner
     * @param params         credentials and API configuration; null for none
     * @return the existing, updated or new account
     * @throws IllegalArgumentException if {@code connectionName} or {@code identifier} is null or blank
     * @throws APIException if a request fails
     * @since 2.6.0
     */
    ConnectedAccount getOrCreateConnectedAccount(String connectionName, String identifier,
                                                 CreateConnectedAccountParams params);

    /**
     * Same as {@link ConnectedAccountsClient#upsert(String, String)}.
     *
     * @param connectionName the connection
     * @param identifier     your identifier for the account's owner
     * @return the existing or new account
     * @throws IllegalArgumentException if either value is null or blank
     * @throws APIException if a request fails
     * @since 2.6.0
     */
    ConnectedAccount upsertConnectedAccount(String connectionName, String identifier);

    /**
     * Same as {@link ConnectedAccountsClient#upsert(String, String, CreateConnectedAccountParams)}.
     *
     * @param connectionName the connection
     * @param identifier     your identifier for the account's owner
     * @param params         credentials and API configuration; null for none
     * @return the existing, updated or new account
     * @throws IllegalArgumentException if {@code connectionName} or {@code identifier} is null or blank
     * @throws APIException if a request fails
     * @since 2.6.0
     */
    ConnectedAccount upsertConnectedAccount(String connectionName, String identifier,
                                            CreateConnectedAccountParams params);

    /**
     * Same as {@link ConnectedAccountsClient#update(ConnectedAccountRef, UpdateConnectedAccountParams)}.
     *
     * @param account the account to update
     * @param params  the new credentials and configuration
     * @return the updated account
     * @throws IllegalArgumentException if {@code account} or {@code params} is null
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    ConnectedAccount updateConnectedAccount(ConnectedAccountRef account, UpdateConnectedAccountParams params);

    /**
     * Same as {@link ConnectedAccountsClient#delete(ConnectedAccountRef)}.
     *
     * @param account the account to delete
     * @throws IllegalArgumentException if {@code account} is null
     * @throws com.scalekit.exceptions.NotFoundException if the connection does not exist, or no
     *                           account matches the connection name and identifier
     * @throws APIException for other failures
     * @since 2.6.0
     */
    void deleteConnectedAccount(ConnectedAccountRef account);

    /**
     * Calls a third-party API through Scalekit's proxy, which adds the connected account's
     * credentials. The request goes to {@code <environment URL>/proxy<path>} with your client's
     * access token; Scalekit forwards it to the provider's API and passes the response back
     * unchanged.
     *
     * <ul>
     *   <li>Any HTTP method works, including {@code PATCH}. On Java 8 the SDK uses
     *       {@code HttpURLConnection}; on Java 11 and later it uses {@code java.net.http}. On Java
     *       16 or later without the {@code java.net.http} module (a custom runtime image, or a
     *       module path that does not resolve it), methods other than GET, POST, HEAD, OPTIONS,
     *       PUT, DELETE and TRACE throw {@link UnsupportedOperationException} before any request;
     *       add {@code --add-modules java.net.http}.</li>
     *   <li>Redirects are not followed: a 3xx response is returned as is.</li>
     *   <li>A status of 400 or above throws {@link ProxyException}, which carries the full
     *       response.</li>
     *   <li>Never retried, because the upstream call may not be idempotent. The one exception:
     *       when Scalekit rejects the SDK's access token before anything is forwarded (a 401 with a
     *       JSON content type and a body of exactly {@code {"detail": ..., "code": "UNAUTHORIZED"}}),
     *       the SDK refreshes the token and sends the request once more. A 401 from the upstream
     *       API is never resent. The resend does not happen:
     *       <ul>
     *         <li>within 5 seconds of the SDK fetching a token, because the token cache does not
     *             refresh again that soon. This includes the first proxy call of a client that has
     *             made no other call yet: its token was fetched for that call, so a rejection is
     *             returned as {@link ProxyException};</li>
     *         <li>on Java 8 (or wherever {@code HttpURLConnection} is used), for POST, PUT, PATCH
     *             and other non-standard methods, with or without a body: these are streamed, and
     *             {@code HttpURLConnection} then discards the 401's body, so the SDK cannot tell
     *             Scalekit's rejection from the upstream API's. It throws {@link ProxyException}
     *             without a body and refreshes the token for the next call.</li>
     *       </ul></li>
     *   <li>The deadline is {@link ProxyRequest#DEFAULT_TIMEOUT} unless the request sets one. On
     *       Java 8 it applies to connecting and to each read rather than to the whole exchange.</li>
     *   <li>An interrupt is honoured before the request is sent and, on Java 11+, while it is in
     *       flight. On Java 8 an interrupt that arrives while the request is in flight takes
     *       effect only when the request finishes or times out.</li>
     * </ul>
     *
     * <pre>{@code
     * ProxyResponse response = client.actions().request(
     *         ProxyRequest.builder("gmail", "user_123", "/gmail/v1/users/me/profile").build());
     * String email = (String) response.bodyAsJsonObject().get("emailAddress");
     * }</pre>
     *
     * @param request the request
     * @return the response, for statuses below 400
     * @throws IllegalArgumentException if {@code request} is null
     * @throws UnsupportedOperationException if the runtime cannot send the request's method
     * @throws ProxyException if the response status is 400 or above
     * @throws AuthenticationException if the SDK cannot obtain an access token
     * @throws ScalekitTimeoutException if the deadline passes
     * @throws ScalekitConnectionException if the request cannot be sent or the response read, or
     *                                     the thread is interrupted (on Java 8, only before the
     *                                     request is sent)
     * @since 2.6.0
     */
    ProxyResponse request(ProxyRequest request);

    /**
     * Same as {@link ToolsClient#search(String)}.
     *
     * @param query what the tool should do; not blank
     * @return the matching tools, never null
     * @throws IllegalArgumentException if {@code query} is null or blank
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    List<SearchedTool> searchTools(String query);

    /**
     * Same as {@link ToolsClient#search(String, SearchToolsParams)}.
     *
     * @param query  what the tool should do; not blank
     * @param params identifier, result limit and deadline; null for none
     * @return the matching tools, never null
     * @throws IllegalArgumentException if {@code query} is null or blank
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    List<SearchedTool> searchTools(String query, SearchToolsParams params);

    /**
     * Same as {@link ToolsClient#listScoped(String, ListScopedToolsParams)}.
     *
     * @param identifier your identifier for the user or tenant
     * @param params     the filter (required), paging and deadline
     * @return one page of tools
     * @throws IllegalArgumentException if {@code identifier} is blank or {@code params} is null
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    Page<ScopedTool> listScopedTools(String identifier, ListScopedToolsParams params);

    /**
     * Same as {@link ToolsClient#listAvailable(String)}.
     *
     * @param identifier your identifier for the user or tenant
     * @return the first page of tools
     * @throws IllegalArgumentException if {@code identifier} is null or blank
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    Page<Tool> listAvailableTools(String identifier);

    /**
     * Same as {@link ToolsClient#listAvailable(String, ListAvailableToolsParams)}.
     *
     * @param identifier your identifier for the user or tenant
     * @param params     paging and deadline; null for the defaults
     * @return one page of tools
     * @throws IllegalArgumentException if {@code identifier} is null or blank
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    Page<Tool> listAvailableTools(String identifier, ListAvailableToolsParams params);

    /**
     * Same as {@link ConnectionClient#listAppConnections()}.
     *
     * @return the first page of app connections
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    Page<AppConnection> listConnections();

    /**
     * Same as {@link ConnectionClient#listAppConnections(ListAppConnectionsParams)}.
     *
     * <pre>{@code
     * for (AppConnection connection : client.actions().listConnections().autoPager()) {
     *     System.out.println(connection.connectionName());
     * }
     * }</pre>
     *
     * @param params provider, search text and paging; null for none
     * @return one page of app connections
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    Page<AppConnection> listConnections(ListAppConnectionsParams params);
}
