package com.scalekit.api;

import com.scalekit.exceptions.APIException;
import com.scalekit.exceptions.BadRequestException;
import com.scalekit.exceptions.NotFoundException;
import com.scalekit.models.Page;
import com.scalekit.models.mcp.CreateMcpConfigParams;
import com.scalekit.models.mcp.CreateMcpSessionTokenParams;
import com.scalekit.models.mcp.ListMcpConfigsParams;
import com.scalekit.models.mcp.ListMcpConnectedAccountsParams;
import com.scalekit.models.mcp.McpConfig;
import com.scalekit.models.mcp.McpConnectionAuthState;
import com.scalekit.models.mcp.McpSessionToken;
import com.scalekit.models.mcp.UpdateMcpConfigParams;

import java.util.List;

/**
 * Manages MCP configurations: named sets of connections and tools that Scalekit serves to agents
 * as one MCP server, and the per-user tokens that call them. Get it from
 * {@link ActionsClient#mcp()}.
 *
 * <pre>{@code
 * McpConfig config = client.actions().mcp().createConfig("support_agent",
 *         CreateMcpConfigParams.builder()
 *                 .addConnectionToolMapping(McpConnectionToolMapping.of("gmail", Collections.<String>emptyList()))
 *                 .build());
 * McpSessionToken token = client.actions().mcp().createSessionToken(config.id(), "user_123");
 * }</pre>
 *
 * <p>Calls use the client's default deadline. Implementations are thread-safe. This interface is
 * not designed for implementation outside the SDK: mock it in tests, but do not implement it,
 * because methods may be added.
 *
 * @since 2.6.0
 */
public interface McpClient {

    /**
     * Creates an MCP configuration. Never retried on transient failures.
     *
     * @param name   the configuration name: lower-case letters, digits, {@code _} and {@code -},
     *               unique in the environment
     * @param params description and connection-tool mappings; the server requires at least one
     *               mapping
     * @return the new configuration
     * @throws IllegalArgumentException if {@code name} is null or empty
     * @throws BadRequestException if the name is taken ({@code DUPLICATE_IDENTIFIER}), no mapping
     *                             is given, or a tool does not belong to its connection
     * @throws NotFoundException if a connection does not exist
     * @throws APIException for other failures
     * @since 2.6.0
     */
    McpConfig createConfig(String name, CreateMcpConfigParams params);

    /**
     * Gets an MCP configuration.
     *
     * @param configId the configuration ID
     * @return the configuration
     * @throws IllegalArgumentException if {@code configId} is null or empty
     * @throws NotFoundException if the configuration does not exist
     * @throws APIException for other failures
     * @since 2.6.0
     */
    McpConfig getConfig(String configId);

    /**
     * Lists the first page of MCP configurations.
     *
     * @return the first page; iterate {@link Page#autoPager()} for every configuration
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    Page<McpConfig> listConfigs();

    /**
     * Lists one page of MCP configurations.
     *
     * @param params search and paging; null lists all
     * @return the page
     * @throws BadRequestException if the search text is shorter than 3 characters
     * @throws APIException for other failures
     * @since 2.6.0
     */
    Page<McpConfig> listConfigs(ListMcpConfigsParams params);

    /**
     * Updates an MCP configuration's description or connection-tool mappings. Mappings, when
     * given, replace the stored ones as a whole.
     *
     * @param configId the configuration ID
     * @param params   the changes
     * @return the updated configuration
     * @throws IllegalArgumentException if {@code configId} is null or empty, or {@code params} is null
     * @throws NotFoundException if the configuration does not exist
     * @throws BadRequestException if the input is invalid
     * @throws APIException for other failures
     * @since 2.6.0
     */
    McpConfig updateConfig(String configId, UpdateMcpConfigParams params);

    /**
     * Deletes an MCP configuration. Deleting one that does not exist fails with
     * {@link NotFoundException}, including when a retry follows a first attempt that succeeded.
     *
     * @param configId the configuration ID
     * @throws IllegalArgumentException if {@code configId} is null or empty
     * @throws NotFoundException if the configuration does not exist
     * @throws APIException for other failures
     * @since 2.6.0
     */
    void deleteConfig(String configId);

    /**
     * Lists, for one user, the state of their account on each connection of a configuration.
     * The result is complete (not paged).
     *
     * @param configId   the configuration ID
     * @param identifier your identifier for the user
     * @return one entry per connection, never null
     * @throws IllegalArgumentException if {@code configId} or {@code identifier} is null or empty
     * @throws APIException if the request fails; see
     *                      {@link #listConnectedAccounts(String, String, ListMcpConnectedAccountsParams)}
     * @since 2.6.0
     */
    List<McpConnectionAuthState> listConnectedAccounts(String configId, String identifier);

    /**
     * Lists, for one user, the state of their account on each connection of a configuration,
     * optionally with authorization links. The result is complete (not paged).
     *
     * @param configId   the configuration ID
     * @param identifier your identifier for the user
     * @param params     whether to include authorization links; null for none
     * @return one entry per connection, never null
     * @throws IllegalArgumentException if {@code configId} or {@code identifier} is null or empty
     * @throws NotFoundException if the configuration does not exist
     * @throws BadRequestException if the input is invalid
     * @throws APIException for other failures
     * @since 2.6.0
     */
    List<McpConnectionAuthState> listConnectedAccounts(String configId, String identifier,
                                                       ListMcpConnectedAccountsParams params);

    /**
     * Creates a token that lets an agent call a configuration's MCP server on behalf of one user,
     * valid for the server default of one hour. Never retried on transient failures.
     *
     * @param mcpConfigId the configuration ID
     * @param identifier  your identifier for the user
     * @return the token
     * @throws IllegalArgumentException if {@code mcpConfigId} or {@code identifier} is null or empty
     * @throws APIException if the request fails; see
     *                      {@link #createSessionToken(String, String, CreateMcpSessionTokenParams)}
     * @since 2.6.0
     */
    McpSessionToken createSessionToken(String mcpConfigId, String identifier);

    /**
     * Creates a token that lets an agent call a configuration's MCP server on behalf of one user.
     * Never retried on transient failures.
     *
     * @param mcpConfigId the configuration ID
     * @param identifier  your identifier for the user
     * @param params      the token lifetime; null for the server default of one hour
     * @return the token
     * @throws IllegalArgumentException if {@code mcpConfigId} or {@code identifier} is null or empty
     * @throws NotFoundException if the configuration does not exist
     * @throws BadRequestException if the lifetime is outside 60 seconds to 24 hours, or the user's
     *                             accounts are missing or inactive and your environment requires them
     * @throws APIException for other failures
     * @since 2.6.0
     */
    McpSessionToken createSessionToken(String mcpConfigId, String identifier, CreateMcpSessionTokenParams params);
}
