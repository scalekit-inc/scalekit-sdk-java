package com.scalekit.api.impl;

import com.google.protobuf.BoolValue;
import com.google.protobuf.StringValue;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import com.google.protobuf.Value;
import com.scalekit.exceptions.BadRequestException;
import com.scalekit.exceptions.InternalServerException;
import com.scalekit.exceptions.NotFoundException;
import com.scalekit.grpc.scalekit.v1.connections.Connection;
import com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse;
import com.scalekit.grpc.scalekit.v1.connections.CreateEnvironmentConnectionRequest;
import com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse;
import com.scalekit.grpc.scalekit.v1.connections.GetEnvironmentConnectionRequest;
import com.scalekit.grpc.scalekit.v1.connections.GoogleDWDConfig;
import com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsRequest;
import com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsResponse;
import com.scalekit.grpc.scalekit.v1.connections.ListConnection;
import com.scalekit.grpc.scalekit.v1.connections.OAuthConnectionConfig;
import com.scalekit.grpc.scalekit.v1.connections.OIDCConnectionConfig;
import com.scalekit.grpc.scalekit.v1.connections.StaticAuthConfig;
import com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse;
import com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest;
import com.scalekit.internal.RetryTestSupport;
import com.scalekit.models.Page;
import com.scalekit.models.connections.AppConnection;
import com.scalekit.models.connections.CreateEnvironmentConnectionParams;
import com.scalekit.models.connections.EnvironmentConnection;
import com.scalekit.models.connections.EnvironmentConnectionAuthMode;
import com.scalekit.models.connections.EnvironmentConnectionStatus;
import com.scalekit.models.connections.EnvironmentConnectionType;
import com.scalekit.models.connections.GoogleDwdConnectionSettings;
import com.scalekit.models.connections.ListAppConnectionsParams;
import com.scalekit.models.connections.OAuthConnectionSettings;
import com.scalekit.models.connections.UpdateEnvironmentConnectionParams;
import io.grpc.Status;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/** App and environment connections on {@code client.connections()}. */
class ScalekitEnvironmentConnectionsTest {

    private static final String SECRET = "S3CR3T-value";

    private FakeAgentKitServer fake;
    private ScalekitConnectionClient connections;

    @BeforeEach
    void setUp() throws Exception {
        fake = new FakeAgentKitServer();
        connections = new ScalekitConnectionClient(fake.managedChannel, fake.credentials);
        RetryTestSupport.recordSleepsInsteadOfSleeping();
    }

    @AfterEach
    void tearDown() throws Exception {
        RetryTestSupport.restoreRealSleeper();
        fake.close();
    }

    // ---- listAppConnections ----

    @Test
    void listAppConnectionsMapsFieldsAndUnsetEnums() {
        fake.enqueue("ListAppConnections", ListAppConnectionsResponse.newBuilder()
                .addConnections(ListConnection.newBuilder().setId("conn_1").setKeyId("gmail").setProviderKey("GMAIL")
                        .setTypeValue(4).setStatusValue(3).setEnabled(true).setAuthModeValue(1)
                        .setCreatedAt(Timestamp.newBuilder().setSeconds(1_700_000_000L)))
                .addConnections(ListConnection.newBuilder().setId("conn_2").setKeyId("custom").setProviderKey("X")
                        .setTypeValue(99).setStatusValue(0).setAuthModeValue(0))
                .setTotalSize(2).setNextPageToken("n").setPrevPageToken("p")
                .build());

        Page<AppConnection> page = connections.listAppConnections(ListAppConnectionsParams.builder()
                .provider(" GMAIL ").query("gma").pageSize(10).pageToken("t").build());

        ListAppConnectionsRequest request = fake.lastRequest("ListAppConnections");
        assertEquals("GMAIL", request.getProvider());
        assertEquals("gma", request.getQuery());
        assertEquals(10, request.getPageSize());
        assertEquals("t", request.getPageToken());

        AppConnection gmail = page.items().get(0);
        assertEquals("conn_1", gmail.id());
        assertEquals("gmail", gmail.connectionName());
        assertEquals("GMAIL", gmail.provider());
        assertSame(EnvironmentConnectionType.OAUTH, gmail.type());
        assertSame(EnvironmentConnectionStatus.COMPLETED, gmail.status().orElse(null));
        assertTrue(gmail.enabled());
        assertSame(EnvironmentConnectionAuthMode.USER, gmail.authMode().orElse(null));
        assertEquals(Instant.ofEpochSecond(1_700_000_000L), gmail.createdAt().orElse(null));

        AppConnection other = page.items().get(1);
        assertEquals(EnvironmentConnectionType.Known._UNKNOWN, other.type().known());
        assertEquals("99", other.type().value());
        assertFalse(other.status().isPresent(), "an unspecified status is empty");
        assertFalse(other.authMode().isPresent());
        assertFalse(other.createdAt().isPresent());
        assertEquals(2L, page.totalSize().getAsLong());
        assertTrue(page.hasNextPage());
    }

    @Test
    void listAppConnectionsWithoutParamsSendsNothingAndBlankQueryIsUnset() {
        connections.listAppConnections();
        connections.listAppConnections(ListAppConnectionsParams.builder().query("   ").provider(" ").build());
        for (ListAppConnectionsRequest request : fake.<ListAppConnectionsRequest>requests("ListAppConnections")) {
            assertEquals(ListAppConnectionsRequest.getDefaultInstance(), request);
        }
    }

    @Test
    void listAppConnectionsAutoPagerFollowsTokens() {
        fake.enqueue("ListAppConnections",
                ListAppConnectionsResponse.newBuilder().addConnections(ListConnection.newBuilder().setId("a"))
                        .setNextPageToken("p2").build(),
                ListAppConnectionsResponse.newBuilder().addConnections(ListConnection.newBuilder().setId("b")).build());
        List<String> ids = new ArrayList<>();
        for (AppConnection connection : connections.listAppConnections(
                ListAppConnectionsParams.builder().provider("GMAIL").build()).autoPager()) {
            ids.add(connection.id());
        }
        assertEquals(Arrays.asList("a", "b"), ids);
        ListAppConnectionsRequest second = fake.<ListAppConnectionsRequest>requests("ListAppConnections").get(1);
        assertEquals("p2", second.getPageToken());
        assertEquals("GMAIL", second.getProvider());
    }

    @Test
    void listAppConnectionsMapsInvalidArgument() {
        fake.enqueue("ListAppConnections", FakeAgentKitServer.error(Status.Code.INVALID_ARGUMENT, null));
        assertThrows(BadRequestException.class, () -> connections.listAppConnections());
    }

    // ---- create ----

    @Test
    void createAlwaysSendsTheAppFlagAndOnlyWhatWasSet() {
        fake.enqueue("CreateEnvironmentConnection", CreateConnectionResponse.newBuilder()
                .setConnection(Connection.newBuilder().setId("conn_1").setKeyId("gmail-ab12cd34")
                        .setProviderKey("GMAIL").setTypeValue(4).setStatusValue(1))
                .build());

        EnvironmentConnection created = connections.createEnvironmentConnection(
                CreateEnvironmentConnectionParams.appConnection("GMAIL").build());

        CreateEnvironmentConnectionRequest request = fake.lastRequest("CreateEnvironmentConnection");
        assertTrue(request.getFlags().getIsApp());
        assertFalse(request.getFlags().getIsLogin());
        assertEquals("GMAIL", request.getConnection().getProviderKey());
        assertFalse(request.getConnection().hasKeyId());
        assertFalse(request.getConnection().hasContext());
        assertEquals(0, request.getConnection().getTypeValue());
        assertEquals(0, request.getConnection().getAuthModeValue());

        assertEquals("conn_1", created.id());
        assertEquals("gmail-ab12cd34", created.connectionName().orElse(null));
        assertSame(EnvironmentConnectionStatus.DRAFT, created.status().orElse(null));
        assertFalse(created.oauthSettings().isPresent());
    }

    @Test
    void createSendsTypeNameAuthModeAndContext() {
        Map<String, Object> context = new HashMap<>();
        context.put("team", "support");
        connections.createEnvironmentConnection(CreateEnvironmentConnectionParams.appConnection("GMAIL")
                .type(EnvironmentConnectionType.OAUTH)
                .connectionName(" gmail-support ")
                .authMode(EnvironmentConnectionAuthMode.ORG_WIDE)
                .context(context)
                .build());
        CreateEnvironmentConnectionRequest request = fake.lastRequest("CreateEnvironmentConnection");
        assertEquals(4, request.getConnection().getTypeValue());
        assertEquals("gmail-support", request.getConnection().getKeyId());
        assertEquals(2, request.getConnection().getAuthModeValue());
        assertEquals("support", request.getConnection().getContext().getFieldsOrThrow("team").getStringValue());
    }

    @Test
    void createPassesRawEnumNumbersAndRejectsUnknownNamesBeforeAnyCall() {
        connections.createEnvironmentConnection(CreateEnvironmentConnectionParams.appConnection("X")
                .type(EnvironmentConnectionType.of("77")).authMode(EnvironmentConnectionAuthMode.of("9")).build());
        CreateEnvironmentConnectionRequest request = fake.lastRequest("CreateEnvironmentConnection");
        assertEquals(77, request.getConnection().getTypeValue());
        assertEquals(9, request.getConnection().getAuthModeValue());

        assertThrows(IllegalArgumentException.class, () -> connections.createEnvironmentConnection(
                CreateEnvironmentConnectionParams.appConnection("X").type(EnvironmentConnectionType.of("NEW_KIND")).build()));
        assertThrows(IllegalArgumentException.class, () -> connections.createEnvironmentConnection(
                CreateEnvironmentConnectionParams.appConnection("X").type(EnvironmentConnectionType.of("INVALID")).build()));
        assertThrows(IllegalArgumentException.class, () -> connections.createEnvironmentConnection(
                CreateEnvironmentConnectionParams.appConnection("X").authMode(EnvironmentConnectionAuthMode.of("TEAM")).build()));
        assertThrows(IllegalArgumentException.class, () -> connections.createEnvironmentConnection(null));
        assertThrows(IllegalArgumentException.class, () -> CreateEnvironmentConnectionParams.appConnection(" ").build());
        assertThrows(IllegalArgumentException.class, () -> CreateEnvironmentConnectionParams.appConnection(null).build());
        assertEquals(1, fake.calls("CreateEnvironmentConnection"));
    }

    @Test
    void createIsNeverRetriedOnUnavailable() {
        fake.enqueue("CreateEnvironmentConnection", FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null));
        assertThrows(InternalServerException.class, () -> connections.createEnvironmentConnection(
                CreateEnvironmentConnectionParams.appConnection("GMAIL").build()));
        assertEquals(1, fake.calls("CreateEnvironmentConnection"), "a repeat could create a second connection");
    }

    @Test
    void createMapsDuplicateName() {
        fake.enqueue("CreateEnvironmentConnection",
                FakeAgentKitServer.error(Status.Code.INVALID_ARGUMENT, "DUPLICATE_IDENTIFIER"));
        BadRequestException e = assertThrows(BadRequestException.class, () -> connections.createEnvironmentConnection(
                CreateEnvironmentConnectionParams.appConnection("GMAIL").connectionName("gmail").build()));
        assertEquals("DUPLICATE_IDENTIFIER", e.getScalekitErrorCode());
    }

    // ---- get ----

    @Test
    void getMapsOAuthSettings() {
        fake.enqueue("GetEnvironmentConnection", GetConnectionResponse.newBuilder().setConnection(Connection.newBuilder()
                .setId("conn_1").setKeyId("gmail").setProviderKey("GMAIL").setTypeValue(4).setStatusValue(3)
                .setEnabled(true).setAuthModeValue(2)
                .setCreateTime(Timestamp.newBuilder().setSeconds(10)).setUpdateTime(Timestamp.newBuilder().setSeconds(20))
                .setMcpServerUrl("https://mcp.example.com").setResolvedProxyUrl("https://gmail.googleapis.com")
                .setOauthConfig(OAuthConnectionConfig.newBuilder()
                        .setClientId(StringValue.of("client")).setClientSecret(StringValue.of(SECRET))
                        .addScopes("email").setRedirectUri("https://auth.example.com/cb")
                        .setPkceEnabled(BoolValue.of(false)).setUsePlatformCreds(BoolValue.of(true))
                        .setGoogleadsDeveloperToken(StringValue.of(SECRET))))
                .build());

        EnvironmentConnection connection = connections.getEnvironmentConnection("conn_1");

        assertEquals("conn_1", ((GetEnvironmentConnectionRequest) fake.lastRequest("GetEnvironmentConnection"))
                .getConnectionId());
        assertEquals("gmail", connection.connectionName().orElse(null));
        assertSame(EnvironmentConnectionAuthMode.ORG_WIDE, connection.authMode().orElse(null));
        assertEquals(Instant.ofEpochSecond(10), connection.createdAt().orElse(null));
        assertEquals(Instant.ofEpochSecond(20), connection.updatedAt().orElse(null));
        assertEquals("https://mcp.example.com", connection.mcpServerUrl().orElse(null));
        assertEquals("https://gmail.googleapis.com", connection.resolvedProxyUrl().orElse(null));
        OAuthConnectionSettings oauth = connection.oauthSettings().get();
        assertEquals("client", oauth.clientId().orElse(null));
        assertEquals(SECRET, oauth.clientSecret().orElse(null));
        assertEquals(Collections.singletonList("email"), oauth.scopes());
        assertEquals("https://auth.example.com/cb", oauth.redirectUri().orElse(null));
        assertEquals(Boolean.FALSE, oauth.pkceEnabled().orElse(null), "a wrapped false is kept, not dropped");
        assertEquals(Boolean.TRUE, oauth.usePlatformCreds().orElse(null));
        assertFalse(oauth.prompt().isPresent());
        assertFalse(connection.staticSettings().isPresent());
        assertFalse(connection.googleDwdSettings().isPresent());

        assertFalse(connection.toString().contains(SECRET));
        assertFalse(oauth.toString().contains(SECRET));
        assertTrue(oauth.toString().contains("client"));
    }

    @Test
    void getMapsStaticAndDwdSettingsAndRedactsThem() {
        fake.enqueue("GetEnvironmentConnection",
                GetConnectionResponse.newBuilder().setConnection(Connection.newBuilder().setId("c1")
                        .setStaticConfig(StaticAuthConfig.newBuilder().setStaticConfig(Struct.newBuilder()
                                .putFields("api_key", Value.newBuilder().setStringValue(SECRET).build())))).build(),
                GetConnectionResponse.newBuilder().setConnection(Connection.newBuilder().setId("c2")
                        .setGoogleDwdConfig(GoogleDWDConfig.newBuilder().setServiceAccountJson(StringValue.of(SECRET))
                                .setTokenUri(StringValue.of("https://oauth2.googleapis.com/token"))
                                .addScopes("https://www.googleapis.com/auth/gmail.readonly"))).build(),
                GetConnectionResponse.newBuilder().setConnection(Connection.newBuilder().setId("c3")
                        .setOidcConfig(OIDCConnectionConfig.newBuilder().setClientSecret(StringValue.of(SECRET))))
                        .build());

        EnvironmentConnection fixed = connections.getEnvironmentConnection("c1");
        assertEquals(SECRET, fixed.staticSettings().get().get("api_key"));
        assertFalse(fixed.connectionName().isPresent());
        assertFalse(fixed.status().isPresent());
        assertFalse(fixed.toString().contains(SECRET));

        EnvironmentConnection dwd = connections.getEnvironmentConnection("c2");
        GoogleDwdConnectionSettings settings = dwd.googleDwdSettings().get();
        assertEquals(SECRET, settings.serviceAccountJson().orElse(null));
        assertEquals("https://oauth2.googleapis.com/token", settings.tokenUri().orElse(null));
        assertEquals(1, settings.scopes().size());
        assertFalse(dwd.toString().contains(SECRET));
        assertFalse(settings.toString().contains(SECRET));

        EnvironmentConnection login = connections.getEnvironmentConnection("c3");
        assertFalse(login.oauthSettings().isPresent());
        assertFalse(login.staticSettings().isPresent());
        assertFalse(login.googleDwdSettings().isPresent());
    }

    @Test
    void getValidatesAndMapsErrors() {
        assertThrows(IllegalArgumentException.class, () -> connections.getEnvironmentConnection(null));
        assertThrows(IllegalArgumentException.class, () -> connections.getEnvironmentConnection(""));
        assertEquals(0, fake.totalCalls());
        fake.enqueue("GetEnvironmentConnection",
                FakeAgentKitServer.error(Status.Code.NOT_FOUND, "RESOURCE_NOT_FOUND"),
                FakeAgentKitServer.error(Status.Code.INVALID_ARGUMENT, "INVALID_RESOURCE_IDENTIFIER"));
        assertThrows(NotFoundException.class, () -> connections.getEnvironmentConnection("conn_missing"));
        assertThrows(BadRequestException.class, () -> connections.getEnvironmentConnection("bad id"));
    }

    // ---- update ----

    @Test
    void updateSendsRequiredFieldsAndOAuthSettings() {
        fake.enqueue("UpdateEnvironmentConnection", UpdateConnectionResponse.newBuilder()
                .setConnection(Connection.newBuilder().setId("conn_1").setKeyId("gmail")).build());

        EnvironmentConnection updated = connections.updateEnvironmentConnection("conn_1",
                UpdateEnvironmentConnectionParams.builder("gmail", "GMAIL", EnvironmentConnectionType.OAUTH)
                        .oauthSettings(OAuthConnectionSettings.builder()
                                .clientId("client").clientSecret(SECRET).scopes(Arrays.asList("a", "b"))
                                .pkceEnabled(false).usePlatformCreds(false).build())
                        .build());

        UpdateEnvironmentConnectionRequest request = fake.lastRequest("UpdateEnvironmentConnection");
        assertEquals("conn_1", request.getConnectionId());
        assertEquals("gmail", request.getConnection().getKeyId());
        assertEquals("GMAIL", request.getConnection().getProviderKey());
        assertEquals(4, request.getConnection().getTypeValue());
        OAuthConnectionConfig oauth = request.getConnection().getOauthConfig();
        assertEquals("client", oauth.getClientId().getValue());
        assertEquals(SECRET, oauth.getClientSecret().getValue());
        assertEquals(Arrays.asList("a", "b"), oauth.getScopesList());
        assertTrue(oauth.hasPkceEnabled(), "an explicit false must be sent");
        assertFalse(oauth.getPkceEnabled().getValue());
        assertTrue(oauth.hasUsePlatformCreds());
        assertFalse(oauth.hasPrompt(), "unset fields are not sent");
        assertFalse(oauth.hasAuthorizeUri());
        assertFalse(oauth.hasGoogleadsDeveloperToken());
        assertEquals("gmail", updated.connectionName().orElse(null));
    }

    @Test
    void updateSendsStaticOrDwdSettings() {
        Map<String, Object> fixed = new HashMap<>();
        fixed.put("api_key", SECRET);
        connections.updateEnvironmentConnection("conn_1",
                UpdateEnvironmentConnectionParams.builder("svc", "SVC", EnvironmentConnectionType.API_KEY)
                        .staticSettings(fixed).build());
        UpdateEnvironmentConnectionRequest first = fake.lastRequest("UpdateEnvironmentConnection");
        assertEquals(SECRET, first.getConnection().getStaticConfig().getStaticConfig()
                .getFieldsOrThrow("api_key").getStringValue());
        assertEquals(8, first.getConnection().getTypeValue());

        connections.updateEnvironmentConnection("conn_2",
                UpdateEnvironmentConnectionParams.builder("gdrive", "GOOGLE_DRIVE", EnvironmentConnectionType.GOOGLE_DWD)
                        .googleDwdSettings(GoogleDwdConnectionSettings.builder().serviceAccountJson(SECRET)
                                .scopes(Collections.singletonList("s")).build())
                        .build());
        UpdateEnvironmentConnectionRequest second = fake.lastRequest("UpdateEnvironmentConnection");
        assertEquals(SECRET, second.getConnection().getGoogleDwdConfig().getServiceAccountJson().getValue());
        assertFalse(second.getConnection().getGoogleDwdConfig().hasTokenUri());

        connections.updateEnvironmentConnection("conn_3",
                UpdateEnvironmentConnectionParams.builder("x", "X", EnvironmentConnectionType.NO_AUTH).build());
        UpdateEnvironmentConnectionRequest third = fake.lastRequest("UpdateEnvironmentConnection");
        assertEquals(Connection.SettingsCase.SETTINGS_NOT_SET.getNumber(),
                third.getConnection().getSettingsCase().getNumber());
    }

    @Test
    void updateValidatesBeforeAnyCall() {
        UpdateEnvironmentConnectionParams params =
                UpdateEnvironmentConnectionParams.builder("gmail", "GMAIL", EnvironmentConnectionType.OAUTH).build();
        assertThrows(IllegalArgumentException.class, () -> connections.updateEnvironmentConnection(null, params));
        assertThrows(IllegalArgumentException.class, () -> connections.updateEnvironmentConnection("", params));
        assertThrows(IllegalArgumentException.class, () -> connections.updateEnvironmentConnection("conn_1", null));
        assertThrows(IllegalArgumentException.class, () -> connections.updateEnvironmentConnection("conn_1",
                UpdateEnvironmentConnectionParams.builder("g", "G", EnvironmentConnectionType.of("NEW_KIND")).build()));
        assertThrows(IllegalArgumentException.class,
                () -> UpdateEnvironmentConnectionParams.builder(" ", "GMAIL", EnvironmentConnectionType.OAUTH).build());
        assertThrows(IllegalArgumentException.class,
                () -> UpdateEnvironmentConnectionParams.builder("gmail", null, EnvironmentConnectionType.OAUTH).build());
        assertThrows(IllegalArgumentException.class,
                () -> UpdateEnvironmentConnectionParams.builder("gmail", "GMAIL", null).build());
        assertThrows(IllegalArgumentException.class,
                () -> UpdateEnvironmentConnectionParams.builder("gmail", "GMAIL", EnvironmentConnectionType.OAUTH)
                        .oauthSettings(OAuthConnectionSettings.builder().build())
                        .staticSettings(Collections.<String, Object>emptyMap())
                        .build());
        assertEquals(0, fake.totalCalls());
    }

    @Test
    void updateParamsToStringNeverPrintsSettings() {
        String text = UpdateEnvironmentConnectionParams.builder("gmail", "GMAIL", EnvironmentConnectionType.OAUTH)
                .oauthSettings(OAuthConnectionSettings.builder().clientSecret(SECRET).build()).build().toString();
        assertFalse(text.contains(SECRET));
        assertTrue(text.contains("oauth"));
    }

    // ---- deadlines and retries ----

    @Test
    void connectionCallsUseTheTwentySecondClientDeadline() {
        connections.listAppConnections();
        connections.createEnvironmentConnection(CreateEnvironmentConnectionParams.appConnection("GMAIL").build());
        connections.getEnvironmentConnection("conn_1");
        connections.updateEnvironmentConnection("conn_1",
                UpdateEnvironmentConnectionParams.builder("g", "G", EnvironmentConnectionType.OAUTH).build());
        long twentySeconds = TimeUnit.SECONDS.toNanos(20);
        for (String method : Arrays.asList("ListAppConnections", "CreateEnvironmentConnection",
                "GetEnvironmentConnection", "UpdateEnvironmentConnection")) {
            long remaining = fake.serverDeadlines(method).get(0);
            assertTrue(remaining > twentySeconds - TimeUnit.SECONDS.toNanos(5) && remaining <= twentySeconds,
                    method + " deadline was " + remaining);
        }
    }

    @Test
    void idempotentConnectionCallsAreRetriedOnUnavailable() {
        fake.enqueue("ListAppConnections", FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null));
        fake.enqueue("GetEnvironmentConnection", FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null));
        fake.enqueue("UpdateEnvironmentConnection", FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null));
        connections.listAppConnections();
        connections.getEnvironmentConnection("conn_1");
        connections.updateEnvironmentConnection("conn_1",
                UpdateEnvironmentConnectionParams.builder("g", "G", EnvironmentConnectionType.OAUTH).build());
        assertEquals(2, fake.calls("ListAppConnections"));
        assertEquals(2, fake.calls("GetEnvironmentConnection"));
        assertEquals(2, fake.calls("UpdateEnvironmentConnection"));
    }
}
