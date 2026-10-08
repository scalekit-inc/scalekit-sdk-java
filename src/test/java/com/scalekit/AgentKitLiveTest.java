package com.scalekit;

import com.scalekit.exceptions.APIException;
import com.scalekit.exceptions.BadRequestException;
import com.scalekit.exceptions.NotFoundException;
import com.scalekit.exceptions.ProxyException;
import com.scalekit.models.connectedaccounts.AuthorizationLink;
import com.scalekit.models.connectedaccounts.ConnectedAccount;
import com.scalekit.models.connectedaccounts.ConnectedAccountRef;
import com.scalekit.models.mcp.CreateMcpConfigParams;
import com.scalekit.models.mcp.McpConfig;
import com.scalekit.models.mcp.McpConnectionToolMapping;
import com.scalekit.models.mcp.McpSessionToken;
import com.scalekit.models.mcp.UpdateMcpConfigParams;
import com.scalekit.models.providers.AuthField;
import com.scalekit.models.providers.AuthPattern;
import com.scalekit.models.providers.AuthPatternType;
import com.scalekit.models.providers.CustomProviderRequest;
import com.scalekit.models.providers.Provider;
import com.scalekit.models.proxy.ProxyRequest;
import com.scalekit.models.proxy.ProxyResponse;
import com.scalekit.models.tools.ExecuteToolParams;
import com.scalekit.models.tools.ExecuteToolResult;
import com.scalekit.models.tools.ListToolsParams;
import com.scalekit.models.tools.ToolPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Live tests against a real environment. They need SCALEKIT_ENVIRONMENT_URL, SCALEKIT_CLIENT_ID
 * and SCALEKIT_CLIENT_SECRET; tests that use a connection also need TEST_AGENTKIT_CONNECTION (an
 * enabled connection), TEST_AGENTKIT_IDENTIFIER (an identifier with an active account on it),
 * TEST_AGENTKIT_TOOL (a tool of that connection) and TEST_AGENTKIT_PROXY_PATH (a GET path on the
 * provider's API). Each test skips when what it needs is missing, and removes what it creates.
 */
@Tag("live")
class AgentKitLiveTest {

    private ScalekitClient client;
    private final List<Runnable> cleanup = new ArrayList<>();

    @BeforeEach
    void setUp() {
        String url = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String id = System.getenv("SCALEKIT_CLIENT_ID");
        String secret = System.getenv("SCALEKIT_CLIENT_SECRET");
        Assumptions.assumeTrue(url != null && id != null && secret != null, "Scalekit credentials are not set");
        client = new ScalekitClient(url, id, secret);
    }

    @AfterEach
    void tearDown() {
        for (Runnable step : cleanup) {
            try {
                step.run();
            } catch (APIException ignored) {
                // already gone
            }
        }
    }

    private static String fixture(String name) {
        String value = System.getenv(name);
        Assumptions.assumeTrue(value != null && !value.trim().isEmpty(), name + " is not set");
        return value.trim();
    }

    private static String unique(String prefix) {
        return prefix + UUID.randomUUID().toString().replace("-", "").substring(0, 12);
    }

    @Test
    void listToolsReturnsAPage() {
        ToolPage page = client.tools().list(ListToolsParams.builder().pageSize(5).build());
        assertNotNull(page.items());
        assertTrue(page.items().size() <= 5);
    }

    @Test
    void executeToolRunsAndUnknownToolIsABadRequest() {
        String connection = fixture("TEST_AGENTKIT_CONNECTION");
        String identifier = fixture("TEST_AGENTKIT_IDENTIFIER");
        String tool = fixture("TEST_AGENTKIT_TOOL");
        ExecuteToolResult result = client.actions().executeTool(tool, ExecuteToolParams.builder()
                .connectionName(connection).identifier(identifier).putToolInput("max_results", 1).build());
        assertFalse(result.executionId().isEmpty());

        assertThrows(BadRequestException.class, () -> client.tools().execute(unique("no_such_tool_"),
                ExecuteToolParams.builder().connectionName(connection).identifier(identifier).build()));
    }

    @Test
    void connectedAccountLifecycle() {
        String connection = fixture("TEST_AGENTKIT_CONNECTION");
        String identifier = unique("sdk-java-");
        ConnectedAccountRef ref = ConnectedAccountRef.of(connection, identifier);
        cleanup.add(() -> client.connectedAccounts().delete(ref));

        ConnectedAccount created = client.connectedAccounts().getOrCreate(connection, identifier);
        assertEquals(identifier, created.identifier());
        assertEquals(created.id(), client.connectedAccounts().getOrCreate(connection, identifier).id(),
                "a second getOrCreate returns the same account");
        assertEquals(created.id(), client.actions().getConnectedAccount(ConnectedAccountRef.byId(created.id())).id());

        AuthorizationLink link = client.actions().getAuthorizationLink(ref);
        assertFalse(link.link().isEmpty());

        boolean listed = false;
        for (ConnectedAccount account : client.connectedAccounts().list(
                com.scalekit.models.connectedaccounts.ListConnectedAccountsParams.builder()
                        .identifier(identifier).build()).autoPager()) {
            listed |= account.id().equals(created.id());
        }
        assertTrue(listed);

        client.connectedAccounts().delete(ref);
        assertThrows(NotFoundException.class, () -> client.connectedAccounts().get(ref));
        assertThrows(NotFoundException.class, () -> client.connectedAccounts().delete(ref));
    }

    @Test
    void verifyUserWithAnUnknownRequestFails() {
        APIException e = assertThrows(APIException.class, () -> client.connectedAccounts()
                .verifyUser("00000000-0000-0000-0000-000000000000", "user_123"));
        assertTrue(e instanceof BadRequestException || e instanceof NotFoundException, e.getClass().getName());
    }

    @Test
    void mcpConfigLifecycle() {
        String connection = fixture("TEST_AGENTKIT_CONNECTION");
        String name = unique("sdk_java_");
        McpConfig config = client.actions().mcp().createConfig(name, CreateMcpConfigParams.builder()
                .description("SDK test")
                .addConnectionToolMapping(McpConnectionToolMapping.of(connection, Collections.<String>emptyList()))
                .build());
        cleanup.add(() -> client.actions().mcp().deleteConfig(config.id()));
        assertEquals(name, config.name());

        assertEquals(config.id(), client.actions().mcp().getConfig(config.id()).id());
        McpConfig updated = client.actions().mcp().updateConfig(config.id(),
                UpdateMcpConfigParams.builder().description("SDK test updated").build());
        assertEquals("SDK test updated", updated.description().orElse(null));
        assertNotNull(client.actions().mcp().listConnectedAccounts(config.id(), unique("user-")));

        McpSessionToken token = client.actions().mcp().createSessionToken(config.id(), unique("user-"));
        assertFalse(token.token().isEmpty());

        client.actions().mcp().deleteConfig(config.id());
        assertThrows(NotFoundException.class, () -> client.actions().mcp().getConfig(config.id()));
    }

    @Test
    void customProviderLifecycle() {
        String displayName = "Sdk Java " + UUID.randomUUID().toString().replace("-", "")
                .substring(0, 10).toUpperCase(Locale.ROOT);
        AuthPattern bearer = AuthPattern.builder(AuthPatternType.BEARER, "Token")
                .addField(AuthField.builder("token").label("Token").inputType("password").required(true).build())
                .build();
        Provider provider = client.actions().providers().createCustomProvider(
                CustomProviderRequest.builder(displayName, "https://api.example.com").addAuthPattern(bearer).build());
        cleanup.add(() -> client.actions().providers().deleteCustomProvider(provider.identifier()));
        assertTrue(provider.isCustom());
        assertTrue(provider.proxyEnabled());

        Provider updated = client.actions().providers().updateCustomProvider(provider.identifier(),
                CustomProviderRequest.builder(provider.displayName(), provider.proxyUrl().get())
                        .description("updated")
                        .authPatterns(provider.authPatterns())
                        .build());
        assertEquals("updated", updated.description().orElse(null));

        client.actions().providers().deleteCustomProvider(provider.identifier());
        assertThrows(NotFoundException.class,
                () -> client.actions().providers().deleteCustomProvider(provider.identifier()));
    }

    @Test
    void proxyGetAndUnknownConnection() {
        String connection = fixture("TEST_AGENTKIT_CONNECTION");
        String identifier = fixture("TEST_AGENTKIT_IDENTIFIER");
        String path = fixture("TEST_AGENTKIT_PROXY_PATH");
        ProxyResponse response = client.actions().request(ProxyRequest.builder(connection, identifier, path).build());
        assertTrue(response.isSuccessful(), "status " + response.statusCode());

        ProxyException e = assertThrows(ProxyException.class, () -> client.actions().request(
                ProxyRequest.builder(unique("missing-"), identifier, path).build()));
        assertEquals(404, e.statusCode());
    }
}
