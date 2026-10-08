package com.scalekit.api.impl;

import com.scalekit.api.ActionsClient;
import com.scalekit.api.ConnectedAccountsClient;
import com.scalekit.api.McpClient;
import com.scalekit.api.ProvidersClient;
import com.scalekit.api.ToolsClient;
import com.scalekit.internal.proxy.ProxyExecutor;
import com.scalekit.models.Page;
import com.scalekit.models.connectedaccounts.AuthorizationLink;
import com.scalekit.models.connectedaccounts.AuthorizationLinkParams;
import com.scalekit.models.connectedaccounts.ConnectedAccount;
import com.scalekit.models.connectedaccounts.ConnectedAccountRef;
import com.scalekit.models.connectedaccounts.CreateConnectedAccountParams;
import com.scalekit.models.connectedaccounts.ListConnectedAccountsParams;
import com.scalekit.models.connectedaccounts.UpdateConnectedAccountParams;
import com.scalekit.models.connectedaccounts.UserVerificationResult;
import com.scalekit.models.proxy.ProxyRequest;
import com.scalekit.models.proxy.ProxyResponse;
import com.scalekit.models.tools.ExecuteToolParams;
import com.scalekit.models.tools.ExecuteToolResult;
import com.scalekit.models.tools.ListToolsParams;
import com.scalekit.models.tools.ToolPage;

/** {@link ActionsClient} that delegates to the service clients and the proxy executor. Thread-safe. */
public class ScalekitActionsClient implements ActionsClient {

    private final ToolsClient tools;
    private final ConnectedAccountsClient connectedAccounts;
    private final McpClient mcp;
    private final ProvidersClient providers;
    private final ProxyExecutor proxy;

    /**
     * Creates the facade.
     *
     * @param tools             the tools client
     * @param connectedAccounts the connected accounts client
     * @param mcp               the MCP client
     * @param providers         the providers client
     * @param proxy             the proxy executor
     */
    public ScalekitActionsClient(ToolsClient tools, ConnectedAccountsClient connectedAccounts, McpClient mcp,
                                 ProvidersClient providers, ProxyExecutor proxy) {
        this.tools = tools;
        this.connectedAccounts = connectedAccounts;
        this.mcp = mcp;
        this.providers = providers;
        this.proxy = proxy;
    }

    @Override
    public McpClient mcp() {
        return mcp;
    }

    @Override
    public ProvidersClient providers() {
        return providers;
    }

    @Override
    public ToolPage listTools() {
        return tools.list();
    }

    @Override
    public ToolPage listTools(ListToolsParams params) {
        return tools.list(params);
    }

    @Override
    public ExecuteToolResult executeTool(String toolName, ExecuteToolParams params) {
        return tools.execute(toolName, params);
    }

    @Override
    public AuthorizationLink getAuthorizationLink(ConnectedAccountRef account) {
        return connectedAccounts.getMagicLink(account);
    }

    @Override
    public AuthorizationLink getAuthorizationLink(ConnectedAccountRef account, AuthorizationLinkParams params) {
        return connectedAccounts.getMagicLink(account, params);
    }

    @Override
    public UserVerificationResult verifyConnectedAccountUser(String authRequestId, String identifier) {
        return connectedAccounts.verifyUser(authRequestId, identifier);
    }

    @Override
    public Page<ConnectedAccount> listConnectedAccounts() {
        return connectedAccounts.list();
    }

    @Override
    public Page<ConnectedAccount> listConnectedAccounts(ListConnectedAccountsParams params) {
        return connectedAccounts.list(params);
    }

    @Override
    public ConnectedAccount getConnectedAccount(ConnectedAccountRef account) {
        return connectedAccounts.get(account);
    }

    @Override
    public ConnectedAccount createConnectedAccount(String connectionName, String identifier) {
        return connectedAccounts.create(connectionName, identifier);
    }

    @Override
    public ConnectedAccount createConnectedAccount(String connectionName, String identifier,
                                                   CreateConnectedAccountParams params) {
        return connectedAccounts.create(connectionName, identifier, params);
    }

    @Override
    public ConnectedAccount getOrCreateConnectedAccount(String connectionName, String identifier) {
        return connectedAccounts.getOrCreate(connectionName, identifier);
    }

    @Override
    public ConnectedAccount getOrCreateConnectedAccount(String connectionName, String identifier,
                                                        CreateConnectedAccountParams params) {
        return connectedAccounts.getOrCreate(connectionName, identifier, params);
    }

    @Override
    public ConnectedAccount upsertConnectedAccount(String connectionName, String identifier) {
        return connectedAccounts.upsert(connectionName, identifier);
    }

    @Override
    public ConnectedAccount upsertConnectedAccount(String connectionName, String identifier,
                                                   CreateConnectedAccountParams params) {
        return connectedAccounts.upsert(connectionName, identifier, params);
    }

    @Override
    public ConnectedAccount updateConnectedAccount(ConnectedAccountRef account, UpdateConnectedAccountParams params) {
        return connectedAccounts.update(account, params);
    }

    @Override
    public void deleteConnectedAccount(ConnectedAccountRef account) {
        connectedAccounts.delete(account);
    }

    @Override
    public ProxyResponse request(ProxyRequest request) {
        return proxy.execute(request);
    }
}
