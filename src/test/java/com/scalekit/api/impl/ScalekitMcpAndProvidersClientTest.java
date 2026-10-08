package com.scalekit.api.impl;

import com.google.protobuf.ListValue;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import com.google.protobuf.Value;
import com.scalekit.exceptions.BadRequestException;
import com.scalekit.exceptions.ConflictException;
import com.scalekit.exceptions.InternalServerException;
import com.scalekit.exceptions.NotFoundException;
import com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigRequest;
import com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigResponse;
import com.scalekit.grpc.scalekit.v1.mcp.CreateMcpSessionTokenRequest;
import com.scalekit.grpc.scalekit.v1.mcp.CreateMcpSessionTokenResponse;
import com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsRequest;
import com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsResponse;
import com.scalekit.grpc.scalekit.v1.mcp.ListMcpConnectedAccountsRequest;
import com.scalekit.grpc.scalekit.v1.mcp.ListMcpConnectedAccountsResponse;
import com.scalekit.grpc.scalekit.v1.mcp.McpConfigConnectionToolMapping;
import com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigRequest;
import com.scalekit.grpc.scalekit.v1.providers.CreateCustomProviderRequest;
import com.scalekit.grpc.scalekit.v1.providers.CreateProviderResponse;
import com.scalekit.grpc.scalekit.v1.providers.UpdateCustomProviderRequest;
import com.scalekit.grpc.scalekit.v1.providers.UpdateProviderResponse;
import com.scalekit.internal.RetryTestSupport;
import com.scalekit.models.Page;
import com.scalekit.models.connectedaccounts.ConnectedAccountStatus;
import com.scalekit.models.mcp.CreateMcpConfigParams;
import com.scalekit.models.mcp.CreateMcpSessionTokenParams;
import com.scalekit.models.mcp.ListMcpConfigsParams;
import com.scalekit.models.mcp.ListMcpConnectedAccountsParams;
import com.scalekit.models.mcp.McpConfig;
import com.scalekit.models.mcp.McpConnectionAuthState;
import com.scalekit.models.mcp.McpConnectionToolMapping;
import com.scalekit.models.mcp.McpSessionToken;
import com.scalekit.models.mcp.UpdateMcpConfigParams;
import com.scalekit.models.providers.AuthField;
import com.scalekit.models.providers.AuthPattern;
import com.scalekit.models.providers.AuthPatternType;
import com.scalekit.models.providers.CustomProviderRequest;
import com.scalekit.models.providers.Provider;
import io.grpc.Status;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ScalekitMcpAndProvidersClientTest {

    private FakeAgentKitServer fake;
    private ScalekitMcpClient mcp;
    private ScalekitProvidersClient providers;

    @BeforeEach
    void setUp() throws Exception {
        fake = new FakeAgentKitServer();
        mcp = new ScalekitMcpClient(fake.channel, fake.credentials);
        providers = new ScalekitProvidersClient(fake.channel, fake.credentials);
        RetryTestSupport.recordSleepsInsteadOfSleeping();
    }

    @AfterEach
    void tearDown() throws Exception {
        RetryTestSupport.restoreRealSleeper();
        fake.close();
    }

    // ---- MCP ----

    @Test
    void createConfigMapsMappingsAndResponse() {
        fake.enqueue("CreateMcpConfig", CreateMcpConfigResponse.newBuilder().setConfig(
                com.scalekit.grpc.scalekit.v1.mcp.McpConfig.newBuilder().setId("cfg_1").setName("support")
                        .addConnectionToolMappings(McpConfigConnectionToolMapping.newBuilder()
                                .setConnectionName("gmail").setProvider("GMAIL").addTools("gmail_fetch_mails")
                                .setConnectedAccountStatus("ACTIVE"))
                        .setMcpServerUrl("")).build());

        McpConfig config = mcp.createConfig("support", CreateMcpConfigParams.builder()
                .description("desc")
                .addConnectionToolMapping(McpConnectionToolMapping.of("gmail", Collections.<String>emptyList()))
                .build());

        CreateMcpConfigRequest request = fake.lastRequest("CreateMcpConfig");
        assertEquals("support", request.getConfig().getName());
        assertEquals("desc", request.getConfig().getDescription());
        assertEquals("gmail", request.getConfig().getConnectionToolMappings(0).getConnectionName());
        assertEquals(0, request.getConfig().getConnectionToolMappings(0).getToolsCount());

        assertEquals("cfg_1", config.id());
        assertFalse(config.mcpServerUrl().isPresent(), "empty URL is absent");
        McpConnectionToolMapping mapping = config.connectionToolMappings().get(0);
        assertEquals(Collections.singletonList("gmail_fetch_mails"), mapping.tools());
        assertEquals(ConnectedAccountStatus.ACTIVE, mapping.connectedAccountStatus().get());
    }

    @Test
    void createConfigIsNotRetriedAndMapsDuplicates() {
        fake.enqueue("CreateMcpConfig", FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null));
        assertThrows(InternalServerException.class, () -> mcp.createConfig("a", null));
        assertEquals(1, fake.calls("CreateMcpConfig"));
        fake.enqueue("CreateMcpConfig", FakeAgentKitServer.error(Status.Code.INVALID_ARGUMENT, "DUPLICATE_IDENTIFIER"));
        assertThrows(BadRequestException.class, () -> mcp.createConfig("a", null));
    }

    @Test
    void mcpValidationFailsBeforeAnyCall() {
        assertThrows(IllegalArgumentException.class, () -> mcp.createConfig("", null));
        assertThrows(IllegalArgumentException.class, () -> mcp.getConfig(null));
        assertThrows(IllegalArgumentException.class, () -> mcp.deleteConfig(""));
        assertThrows(IllegalArgumentException.class, () -> mcp.updateConfig("cfg", null));
        assertThrows(IllegalArgumentException.class, () -> mcp.listConnectedAccounts("cfg", ""));
        assertThrows(IllegalArgumentException.class, () -> mcp.createSessionToken("", "user"));
        assertThrows(IllegalArgumentException.class,
                () -> CreateMcpSessionTokenParams.builder().expiry(Duration.ofSeconds(-1)).build());
        assertEquals(0, fake.totalCalls());
    }

    @Test
    void getUpdateDeleteSendTheConfigId() {
        mcp.getConfig("cfg_1");
        mcp.updateConfig("cfg_1", UpdateMcpConfigParams.builder()
                .addConnectionToolMapping(McpConnectionToolMapping.of("gmail", Arrays.asList("t1"))).build());
        mcp.deleteConfig("cfg_1");
        UpdateMcpConfigRequest update = fake.lastRequest("UpdateMcpConfig");
        assertEquals("cfg_1", update.getConfigId());
        assertEquals("", update.getDescription());
        assertEquals("t1", update.getConnectionToolMappings(0).getTools(0));
        assertEquals(1, fake.calls("GetMcpConfig"));
        assertEquals(1, fake.calls("DeleteMcpConfig"));
        fake.enqueue("DeleteMcpConfig", FakeAgentKitServer.error(Status.Code.NOT_FOUND, "NOT_FOUND"));
        assertThrows(NotFoundException.class, () -> mcp.deleteConfig("cfg_1"));
    }

    @Test
    void listConfigsPages() {
        fake.enqueue("ListMcpConfigs",
                ListMcpConfigsResponse.newBuilder().addConfigs(com.scalekit.grpc.scalekit.v1.mcp.McpConfig.newBuilder()
                        .setId("c1")).setNextPageToken("t2").build(),
                ListMcpConfigsResponse.newBuilder().addConfigs(com.scalekit.grpc.scalekit.v1.mcp.McpConfig.newBuilder()
                        .setId("c2")).build());
        Page<McpConfig> page = mcp.listConfigs(ListMcpConfigsParams.builder().search("sup").pageSize(1).build());
        ListMcpConfigsRequest first = fake.lastRequest("ListMcpConfigs");
        assertEquals("sup", first.getSearch());
        assertEquals(1, first.getPageSize());
        assertEquals("c2", page.nextPage().items().get(0).id());
        assertEquals("t2", ((ListMcpConfigsRequest) fake.lastRequest("ListMcpConfigs")).getPageToken());
    }

    @Test
    void listConnectedAccountsIsCompleteAndRedactsLinks() {
        fake.enqueue("ListMcpConnectedAccounts", ListMcpConnectedAccountsResponse.newBuilder()
                .addConnectedAccounts(com.scalekit.grpc.scalekit.v1.mcp.McpConnectionAuthState.newBuilder()
                        .setConnectionName("gmail").setConnectedAccountStatus("PENDING_AUTH")
                        .setAuthenticationLink("https://link/secret"))
                .addConnectedAccounts(com.scalekit.grpc.scalekit.v1.mcp.McpConnectionAuthState.newBuilder()
                        .setConnectionName("slack"))
                .build());
        List<McpConnectionAuthState> states = mcp.listConnectedAccounts("cfg_1", "user_1",
                ListMcpConnectedAccountsParams.builder().includeAuthLink(true).build());
        ListMcpConnectedAccountsRequest request = fake.lastRequest("ListMcpConnectedAccounts");
        assertTrue(request.getIncludeAuthLink());
        assertEquals(2, states.size());
        assertEquals(ConnectedAccountStatus.PENDING_AUTH, states.get(0).connectedAccountStatus().get());
        assertEquals("https://link/secret", states.get(0).authenticationLink().get());
        assertFalse(states.get(0).toString().contains("secret"));
        assertFalse(states.get(1).connectedAccountStatus().isPresent());
        assertFalse(states.get(1).authenticationLink().isPresent());
    }

    @Test
    void sessionTokenSendsExactExpiryAndRedactsToken() {
        fake.enqueue("CreateMcpSessionToken", CreateMcpSessionTokenResponse.newBuilder().setToken("jwt-secret")
                .setExpiresAt(Timestamp.newBuilder().setSeconds(100)).build());
        McpSessionToken token = mcp.createSessionToken("cfg_1", "user_1",
                CreateMcpSessionTokenParams.builder().expiry(Duration.ofSeconds(90, 500)).build());
        CreateMcpSessionTokenRequest request = fake.lastRequest("CreateMcpSessionToken");
        assertEquals(90, request.getExpiry().getSeconds());
        assertEquals(500, request.getExpiry().getNanos());
        assertEquals("jwt-secret", token.token());
        assertEquals(Instant.ofEpochSecond(100), token.expiresAt().get());
        assertFalse(token.toString().contains("jwt-secret"));

        mcp.createSessionToken("cfg_1", "user_1");
        assertFalse(((CreateMcpSessionTokenRequest) fake.lastRequest("CreateMcpSessionToken")).hasExpiry());

        fake.enqueue("CreateMcpSessionToken", FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null));
        assertThrows(InternalServerException.class, () -> mcp.createSessionToken("cfg_1", "user_1"));
        assertEquals(3, fake.calls("CreateMcpSessionToken"));
    }

    // ---- providers ----

    private static ListValue storedPatterns() {
        Struct field = Struct.newBuilder()
                .putFields("field_name", Value.newBuilder().setStringValue("plan").build())
                .putFields("input_type", Value.newBuilder().setStringValue("select").build())
                .putFields("options", Value.newBuilder().setListValue(ListValue.newBuilder()
                        .addValues(Value.newBuilder().setStringValue("free"))
                        .addValues(Value.newBuilder().setStringValue("pro"))).build())
                .build();
        Struct pattern = Struct.newBuilder()
                .putFields("type", Value.newBuilder().setStringValue("API_KEY").build())
                .putFields("display_name", Value.newBuilder().setStringValue("Key").build())
                .putFields("fields", Value.newBuilder().setListValue(ListValue.newBuilder()
                        .addValues(Value.newBuilder().setStructValue(field))).build())
                .putFields("custom_flag", Value.newBuilder().setBoolValue(true).build())
                .build();
        return ListValue.newBuilder().addValues(Value.newBuilder().setStructValue(pattern)).build();
    }

    @Test
    void providerAuthPatternsRoundTripUnknownAttributes() {
        fake.enqueue("CreateCustomProvider", CreateProviderResponse.newBuilder().setProvider(
                com.scalekit.grpc.scalekit.v1.providers.Provider.newBuilder().setIdentifier("ACME:env")
                        .setDisplayName("Acme").setProxyUrl("https://api.acme.example").setProxyEnabled(true)
                        .setAuthPatterns(storedPatterns()).putMetadata("team", "crm")).build());

        Provider created = providers.createCustomProvider(
                CustomProviderRequest.builder("Acme", "https://api.acme.example").build());
        CreateCustomProviderRequest createRequest = fake.lastRequest("CreateCustomProvider");
        assertTrue(createRequest.getProvider().getProxyEnabled(), "proxyEnabled defaults to true");
        assertEquals("", createRequest.getProvider().getIconSrc());

        AuthPattern pattern = created.authPatterns().get(0);
        assertEquals(AuthPatternType.API_KEY, pattern.type());
        assertEquals(Boolean.TRUE, pattern.additionalProperties().get("custom_flag"));
        AuthField field = pattern.fields().get(0);
        assertEquals("select", field.inputType().get());
        assertEquals(Arrays.asList("free", "pro"), field.additionalProperties().get("options"));

        fake.enqueue("UpdateCustomProvider", UpdateProviderResponse.newBuilder().build());
        providers.updateCustomProvider(created.identifier(),
                CustomProviderRequest.builder(created.displayName(), created.proxyUrl().get())
                        .authPatterns(created.authPatterns())
                        .metadata(created.metadata())
                        .build());
        UpdateCustomProviderRequest update = fake.lastRequest("UpdateCustomProvider");
        assertEquals("ACME:env", update.getIdentifier());
        assertTrue(update.getProvider().getProxyEnabled(), "an update always sends proxyEnabled");
        assertEquals("crm", update.getProvider().getMetadataOrThrow("team"));
        assertEquals(storedPatterns(), update.getProvider().getAuthPatterns(),
                "patterns read from a provider are sent back unchanged");
    }

    @Test
    void providerErrorsAndValidation() {
        assertThrows(IllegalArgumentException.class, () -> providers.createCustomProvider(null));
        assertThrows(IllegalArgumentException.class, () -> providers.updateCustomProvider("", null));
        assertThrows(IllegalArgumentException.class, () -> providers.deleteCustomProvider(null));
        assertThrows(IllegalArgumentException.class, () -> CustomProviderRequest.builder("", "https://x").build());
        assertEquals(0, fake.totalCalls());

        fake.enqueue("CreateCustomProvider", FakeAgentKitServer.error(Status.Code.ALREADY_EXISTS, "RESOURCE_ALREADY_EXISTS"));
        assertThrows(ConflictException.class,
                () -> providers.createCustomProvider(CustomProviderRequest.builder("A", "https://a").build()));
        fake.enqueue("DeleteCustomProvider",
                FakeAgentKitServer.error(Status.Code.INVALID_ARGUMENT, "PROVIDER_HAS_EXISTING_CONNECTIONS"));
        BadRequestException e = assertThrows(BadRequestException.class, () -> providers.deleteCustomProvider("A:env"));
        assertEquals("PROVIDER_HAS_EXISTING_CONNECTIONS", e.getScalekitErrorCode());
    }

    @Test
    void modelledFieldsWinOverAdditionalPropertiesWithTheSameName() {
        AuthPattern pattern = AuthPattern.builder(AuthPatternType.BEARER, "Token")
                .description("real")
                .putAdditionalProperty("description", "shadow")
                .putAdditionalProperty("extra", 1)
                .build();
        Map<String, Object> json = AgentKitConverters.toJson(pattern);
        assertEquals("real", json.get("description"));
        assertEquals(1L, json.get("extra"));
        assertEquals("BEARER", json.get("type"));
        assertFalse(json.containsKey("fields"));
    }
}
