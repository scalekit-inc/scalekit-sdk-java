package com.scalekit.api.impl;

import com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.VerifyConnectedAccountUserRequest;
import com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsRequest;
import com.scalekit.grpc.scalekit.v1.tools.ExecuteToolRequest;
import com.scalekit.grpc.scalekit.v1.tools.ListAvailableToolsRequest;
import com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsRequest;
import com.scalekit.grpc.scalekit.v1.tools.ListToolsRequest;
import com.scalekit.grpc.scalekit.v1.tools.SearchToolsRequest;
import com.scalekit.internal.RetryTestSupport;
import com.scalekit.internal.proxy.ProxyExecutor;
import com.scalekit.models.connectedaccounts.AuthorizationLinkParams;
import com.scalekit.models.connectedaccounts.ConnectedAccountRef;
import com.scalekit.models.connectedaccounts.ListConnectedAccountsParams;
import com.scalekit.models.connectedaccounts.UpdateConnectedAccountParams;
import com.scalekit.models.connections.ListAppConnectionsParams;
import com.scalekit.models.tools.ExecuteToolParams;
import com.scalekit.models.tools.ListAvailableToolsParams;
import com.scalekit.models.tools.ListScopedToolsParams;
import com.scalekit.models.tools.SearchToolsParams;
import com.scalekit.models.tools.ListToolsParams;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/** The facade uses connectionName everywhere and reaches the same RPCs as the service clients. */
class ScalekitActionsClientTest {

    private FakeAgentKitServer fake;
    private ScalekitActionsClient actions;

    @BeforeEach
    void setUp() throws Exception {
        fake = new FakeAgentKitServer();
        ScalekitToolsClient tools = new ScalekitToolsClient(fake.channel, fake.credentials);
        ScalekitConnectedAccountsClient accounts = new ScalekitConnectedAccountsClient(fake.channel, fake.credentials);
        ScalekitMcpClient mcp = new ScalekitMcpClient(fake.channel, fake.credentials);
        ScalekitProvidersClient providers = new ScalekitProvidersClient(fake.channel, fake.credentials);
        ScalekitConnectionClient connections = new ScalekitConnectionClient(fake.managedChannel, fake.credentials);
        actions = new ScalekitActionsClient(tools, accounts, mcp, providers, connections,
                new ProxyExecutor("https://test.scalekit.local", fake.credentials));
        RetryTestSupport.recordSleepsInsteadOfSleeping();
    }

    @AfterEach
    void tearDown() throws Exception {
        RetryTestSupport.restoreRealSleeper();
        fake.close();
    }

    @Test
    void subClientsAreStable() {
        assertSame(actions.mcp(), actions.mcp());
        assertSame(actions.providers(), actions.providers());
    }

    @Test
    void toolMethodsDelegate() {
        actions.listTools(ListToolsParams.builder().connectionName("gmail").build());
        assertEquals("gmail", ((ListToolsRequest) fake.lastRequest("ListTools")).getFilter().getConnector());
        actions.listTools();
        actions.executeTool("t", ExecuteToolParams.builder().connectionName("gmail").identifier("u").build());
        assertEquals("gmail", ((ExecuteToolRequest) fake.lastRequest("ExecuteTool")).getConnector());
        assertThrows(IllegalArgumentException.class, () -> actions.executeTool(" ", null));
    }

    @Test
    void connectedAccountMethodsDelegate() {
        ConnectedAccountRef ref = ConnectedAccountRef.of("gmail", "u");
        actions.getConnectedAccount(ref);
        assertEquals("gmail", ((GetConnectedAccountByIdentifierRequest) fake.lastRequest("GetConnectedAccountAuth")).getConnector());
        actions.getAuthorizationLink(ref);
        actions.getAuthorizationLink(ref, AuthorizationLinkParams.builder().state("s").build());
        assertEquals("s", ((GetMagicLinkForConnectedAccountRequest) fake.lastRequest("GetMagicLinkForConnectedAccount")).getState());
        actions.verifyConnectedAccountUser("req", "u");
        assertEquals("req", ((VerifyConnectedAccountUserRequest) fake.lastRequest("VerifyConnectedAccountUser")).getAuthRequestId());
        actions.listConnectedAccounts();
        actions.listConnectedAccounts(ListConnectedAccountsParams.builder().connectionName("gmail").build());
        assertEquals("gmail", ((ListConnectedAccountsRequest) fake.lastRequest("ListConnectedAccounts")).getConnector());
        actions.createConnectedAccount("gmail", "u");
        actions.createConnectedAccount("gmail", "u", null);
        assertTrue(((CreateConnectedAccountRequest) fake.lastRequest("CreateConnectedAccount")).hasConnectedAccount());
        actions.getOrCreateConnectedAccount("gmail", "u");
        actions.getOrCreateConnectedAccount("gmail", "u", null);
        actions.upsertConnectedAccount("gmail", "u");
        actions.upsertConnectedAccount("gmail", "u", null);
        actions.updateConnectedAccount(ref, UpdateConnectedAccountParams.builder().build());
        assertEquals("u", ((UpdateConnectedAccountRequest) fake.lastRequest("UpdateConnectedAccount")).getIdentifier());
        actions.deleteConnectedAccount(ConnectedAccountRef.byId("ca_1"));
        assertEquals("ca_1", ((DeleteConnectedAccountRequest) fake.lastRequest("DeleteConnectedAccount")).getId());
        // getOrCreate/upsert found the (empty) account each time, so nothing else was created.
        assertEquals(2, fake.calls("CreateConnectedAccount"));
    }

    @Test
    void searchScopedAvailableAndConnectionMethodsDelegate() {
        actions.searchTools("send email");
        actions.searchTools("send email", SearchToolsParams.builder().topK(3).build());
        assertEquals(3, ((SearchToolsRequest) fake.lastRequest("SearchTools")).getTopK());
        actions.listScopedTools("u", ListScopedToolsParams.builder().addConnectionName("gmail").build());
        assertEquals("gmail", ((ListScopedToolsRequest) fake.lastRequest("ListScopedTools"))
                .getFilter().getConnectionNames(0));
        actions.listAvailableTools("u");
        actions.listAvailableTools("u", ListAvailableToolsParams.builder().pageSize(7).build());
        assertEquals(7, ((ListAvailableToolsRequest) fake.lastRequest("ListAvailableTools")).getPageSize());
        actions.listConnections();
        actions.listConnections(ListAppConnectionsParams.builder().query("gma").build());
        assertEquals("gma", ((ListAppConnectionsRequest) fake.lastRequest("ListAppConnections")).getQuery());
        assertEquals(2, fake.calls("SearchTools"));
        assertEquals(2, fake.calls("ListAvailableTools"));
        assertEquals(2, fake.calls("ListAppConnections"));
        assertThrows(IllegalArgumentException.class, () -> actions.searchTools(" "));
        assertThrows(IllegalArgumentException.class, () -> actions.listScopedTools("u", null));
        assertThrows(IllegalArgumentException.class, () -> actions.listAvailableTools(""));
    }

    @Test
    void requestRejectsNull() {
        assertThrows(IllegalArgumentException.class, () -> actions.request(null));
    }
}
