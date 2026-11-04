package com.scalekit.api.impl;

import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import com.google.protobuf.Value;
import com.scalekit.exceptions.BadRequestException;
import com.scalekit.exceptions.InternalServerException;
import com.scalekit.exceptions.NotFoundException;
import com.scalekit.exceptions.PermissionDeniedException;
import com.scalekit.grpc.scalekit.v1.connected_accounts.ConnectedAccountForList;
import com.scalekit.grpc.scalekit.v1.connected_accounts.ConnectorStatus;
import com.scalekit.grpc.scalekit.v1.connected_accounts.ConnectorType;
import com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountResponse;
import com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierResponse;
import com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountResponse;
import com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsResponse;
import com.scalekit.grpc.scalekit.v1.connected_accounts.OauthToken;
import com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountResponse;
import com.scalekit.grpc.scalekit.v1.connected_accounts.VerifyConnectedAccountUserRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.VerifyConnectedAccountUserResponse;
import com.scalekit.internal.RetryTestSupport;
import com.scalekit.models.Page;
import com.scalekit.models.connectedaccounts.AuthorizationDetails;
import com.scalekit.models.connectedaccounts.AuthorizationLink;
import com.scalekit.models.connectedaccounts.AuthorizationLinkParams;
import com.scalekit.models.connectedaccounts.AuthorizationType;
import com.scalekit.models.connectedaccounts.ConnectedAccount;
import com.scalekit.models.connectedaccounts.ConnectedAccountRef;
import com.scalekit.models.connectedaccounts.ConnectedAccountStatus;
import com.scalekit.models.connectedaccounts.CreateConnectedAccountParams;
import com.scalekit.models.connectedaccounts.GoogleDwdAuth;
import com.scalekit.models.connectedaccounts.ListConnectedAccountsParams;
import com.scalekit.models.connectedaccounts.UpdateConnectedAccountParams;
import io.grpc.Status;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ScalekitConnectedAccountsClientTest {

    private FakeAgentKitServer fake;
    private ScalekitConnectedAccountsClient accounts;

    @BeforeEach
    void setUp() throws Exception {
        fake = new FakeAgentKitServer();
        accounts = new ScalekitConnectedAccountsClient(fake.channel, fake.credentials);
        RetryTestSupport.recordSleepsInsteadOfSleeping();
    }

    @AfterEach
    void tearDown() throws Exception {
        RetryTestSupport.restoreRealSleeper();
        fake.close();
    }

    private static com.scalekit.grpc.scalekit.v1.connected_accounts.ConnectedAccount protoAccount(String id) {
        return com.scalekit.grpc.scalekit.v1.connected_accounts.ConnectedAccount.newBuilder()
                .setId(id)
                .setIdentifier("user_1")
                .setProvider("GMAIL")
                .setConnector("gmail")
                .setConnectionId("conn_1")
                .setStatus(ConnectorStatus.ACTIVE)
                .setAuthorizationType(ConnectorType.OAUTH)
                .setAuthorizationDetails(com.scalekit.grpc.scalekit.v1.connected_accounts.AuthorizationDetails.newBuilder()
                        .setOauthToken(OauthToken.newBuilder().setAccessToken("secret-access").setRefreshToken("secret-refresh")
                                .addScopes("mail.read")))
                .setApiConfig(Struct.newBuilder().putFields("domain", Value.newBuilder().setStringValue("acme").build()))
                .setTokenExpiresAt(Timestamp.newBuilder().setSeconds(1_700_000_000L))
                .build();
    }

    @Test
    void getByConnectionAndIdentifierSendsTrimmedSelectorAndMapsCredentials() {
        fake.enqueue("GetConnectedAccountAuth",
                GetConnectedAccountByIdentifierResponse.newBuilder().setConnectedAccount(protoAccount("ca_1")).build());

        ConnectedAccount account = accounts.get(ConnectedAccountRef.of(" gmail ", " user_1 "));

        GetConnectedAccountByIdentifierRequest request = fake.lastRequest("GetConnectedAccountAuth");
        assertEquals("gmail", request.getConnector());
        assertEquals("user_1", request.getIdentifier());
        assertFalse(request.hasId(), "an absent id must not be sent as \"\"");
        assertEquals("ca_1", account.id());
        assertEquals("gmail", account.connectionName());
        assertEquals(ConnectedAccountStatus.ACTIVE, account.status());
        assertEquals(AuthorizationType.Known.OAUTH, account.authorizationType().known());
        assertEquals("secret-access", account.authorizationDetails().get().oauthToken().get().accessToken().get());
        assertEquals("acme", account.apiConfig().get().get("domain"));
        assertEquals(Instant.ofEpochSecond(1_700_000_000L), account.tokenExpiresAt().get());
        assertFalse(account.toString().contains("secret-access"), account.toString());
        assertFalse(account.toString().contains("secret-refresh"), account.toString());
    }

    @Test
    void getByIdSendsOnlyTheId() {
        accounts.get(ConnectedAccountRef.byId(" ca_9 "));
        GetConnectedAccountByIdentifierRequest request = fake.lastRequest("GetConnectedAccountAuth");
        assertEquals("ca_9", request.getId());
        assertFalse(request.hasConnector());
        assertFalse(request.hasIdentifier());
    }

    @Test
    void unknownEnumValuesPassThroughAsRawValues() {
        fake.enqueue("GetConnectedAccountAuth", GetConnectedAccountByIdentifierResponse.newBuilder()
                .setConnectedAccount(com.scalekit.grpc.scalekit.v1.connected_accounts.ConnectedAccount.newBuilder()
                        .setStatusValue(42).setAuthorizationTypeValue(12)).build());
        ConnectedAccount account = accounts.get(ConnectedAccountRef.byId("ca_1"));
        assertEquals("42", account.status().value());
        assertEquals(ConnectedAccountStatus.Known._UNKNOWN, account.status().known());
        assertEquals(AuthorizationType.NO_AUTH, account.authorizationType());
        assertFalse(account.authorizationDetails().isPresent());
    }

    @Test
    void createAlwaysSendsConnectedAccountEvenWithoutParams() {
        fake.enqueue("CreateConnectedAccount",
                CreateConnectedAccountResponse.newBuilder().setConnectedAccount(protoAccount("ca_2")).build());
        ConnectedAccount created = accounts.create(" gmail ", " user_1 ");
        CreateConnectedAccountRequest request = fake.lastRequest("CreateConnectedAccount");
        assertTrue(request.hasConnectedAccount());
        assertFalse(request.getConnectedAccount().hasAuthorizationDetails());
        assertEquals("gmail", request.getConnector());
        assertEquals("user_1", request.getIdentifier());
        assertFalse(request.hasOrganizationId());
        assertEquals("ca_2", created.id());
    }

    @Test
    void createSendsStaticCredentialsAndApiConfig() {
        accounts.create("freshdesk", "user_1", CreateConnectedAccountParams.builder()
                .authorizationDetails(AuthorizationDetails.staticAuth(Collections.singletonMap("api_key", "k")))
                .apiConfig(Collections.singletonMap("domain", "acme"))
                .build());
        CreateConnectedAccountRequest request = fake.lastRequest("CreateConnectedAccount");
        assertEquals("k", request.getConnectedAccount().getAuthorizationDetails().getStaticAuth().getDetails()
                .getFieldsOrThrow("api_key").getStringValue());
        assertEquals("acme", request.getConnectedAccount().getApiConfig().getFieldsOrThrow("domain").getStringValue());
    }

    @Test
    void createGoogleDwdSendsSubject() {
        accounts.create("google", "user_1", CreateConnectedAccountParams.builder()
                .authorizationDetails(AuthorizationDetails.googleDwd(GoogleDwdAuth.builder("admin@example.com").build()))
                .build());
        CreateConnectedAccountRequest request = fake.lastRequest("CreateConnectedAccount");
        assertEquals("admin@example.com", request.getConnectedAccount().getAuthorizationDetails().getGoogleDwd().getSubject());
    }

    @Test
    void createIsNotRetriedOnUnavailable() {
        fake.enqueue("CreateConnectedAccount", FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null));
        assertThrows(InternalServerException.class, () -> accounts.create("gmail", "user_1"));
        assertEquals(1, fake.calls("CreateConnectedAccount"));
    }

    @Test
    void duplicateCreateIsABadRequest() {
        fake.enqueue("CreateConnectedAccount",
                FakeAgentKitServer.error(Status.Code.INVALID_ARGUMENT, "RESOURCE_ALREADY_EXISTS"));
        BadRequestException e = assertThrows(BadRequestException.class, () -> accounts.create("gmail", "user_1"));
        assertEquals("RESOURCE_ALREADY_EXISTS", e.getScalekitErrorCode());
    }

    @Test
    void validationFailsBeforeAnyCall() {
        assertThrows(IllegalArgumentException.class, () -> accounts.create(" ", "user_1"));
        assertThrows(IllegalArgumentException.class, () -> accounts.create("gmail", null));
        assertThrows(IllegalArgumentException.class, () -> accounts.getOrCreate("gmail", " "));
        assertThrows(IllegalArgumentException.class, () -> accounts.upsert(null, "user_1"));
        assertThrows(IllegalArgumentException.class, () -> accounts.get(null));
        assertThrows(IllegalArgumentException.class, () -> accounts.delete(null));
        assertThrows(IllegalArgumentException.class, () -> accounts.getMagicLink(null));
        assertThrows(IllegalArgumentException.class,
                () -> accounts.update(ConnectedAccountRef.byId("ca_1"), null));
        assertThrows(IllegalArgumentException.class, () -> accounts.verifyUser(" ", "user_1"));
        assertThrows(IllegalArgumentException.class, () -> accounts.verifyUser("req", ""));
        assertThrows(IllegalArgumentException.class, () -> ConnectedAccountRef.byId("  "));
        assertThrows(IllegalArgumentException.class, () -> ConnectedAccountRef.of("gmail", null));
        assertEquals(0, fake.totalCalls());
    }

    @Test
    void getOrCreateReturnsExistingAccountWithoutDetails() {
        fake.enqueue("GetConnectedAccountAuth",
                GetConnectedAccountByIdentifierResponse.newBuilder().setConnectedAccount(protoAccount("ca_1")).build());
        ConnectedAccount account = accounts.getOrCreate("gmail", "user_1");
        assertEquals("ca_1", account.id());
        assertEquals(0, fake.calls("UpdateConnectedAccount"));
        assertEquals(0, fake.calls("CreateConnectedAccount"));
    }

    @Test
    void getOrCreateUpdatesExistingAccountWhenDetailsAreGiven() {
        fake.enqueue("GetConnectedAccountAuth",
                GetConnectedAccountByIdentifierResponse.newBuilder().setConnectedAccount(protoAccount("ca_1")).build());
        fake.enqueue("UpdateConnectedAccount",
                UpdateConnectedAccountResponse.newBuilder().setConnectedAccount(protoAccount("ca_1")).build());
        accounts.getOrCreate(" gmail", "user_1 ", CreateConnectedAccountParams.builder()
                .authorizationDetails(AuthorizationDetails.staticAuth(Collections.singletonMap("token", "t")))
                .apiConfig(Collections.singletonMap("v", 2))
                .build());
        UpdateConnectedAccountRequest update = fake.lastRequest("UpdateConnectedAccount");
        assertEquals("gmail", update.getConnector());
        assertEquals("user_1", update.getIdentifier());
        assertFalse(update.hasId());
        assertTrue(update.getConnectedAccount().getAuthorizationDetails().hasStaticAuth());
        assertEquals(2.0, update.getConnectedAccount().getApiConfig().getFieldsOrThrow("v").getNumberValue());
        assertEquals(0, fake.calls("CreateConnectedAccount"));
    }

    @Test
    void getOrCreateCreatesWithEmptyOAuthTokenWhenNotFound() {
        fake.enqueue("GetConnectedAccountAuth", FakeAgentKitServer.error(Status.Code.NOT_FOUND, "RESOURCE_NOT_FOUND"));
        fake.enqueue("CreateConnectedAccount",
                CreateConnectedAccountResponse.newBuilder().setConnectedAccount(protoAccount("ca_new")).build());
        ConnectedAccount account = accounts.upsert("gmail", "user_1");
        CreateConnectedAccountRequest create = fake.lastRequest("CreateConnectedAccount");
        assertTrue(create.getConnectedAccount().getAuthorizationDetails().hasOauthToken());
        assertEquals("", create.getConnectedAccount().getAuthorizationDetails().getOauthToken().getAccessToken());
        assertEquals("ca_new", account.id());
    }

    @Test
    void getOrCreateTreatsWrappedNotFoundAsMissing() {
        fake.enqueue("GetConnectedAccountAuth", FakeAgentKitServer.error(Status.Code.NOT_FOUND, "INTERNAL_ERROR"));
        accounts.getOrCreate("gmail", "user_1");
        assertEquals(1, fake.calls("CreateConnectedAccount"));
    }

    @Test
    void getOrCreateCreatesWhenTheUpdateFindsNothing() {
        fake.enqueue("GetConnectedAccountAuth",
                GetConnectedAccountByIdentifierResponse.newBuilder().setConnectedAccount(protoAccount("ca_1")).build());
        fake.enqueue("UpdateConnectedAccount", FakeAgentKitServer.error(Status.Code.NOT_FOUND, "RESOURCE_NOT_FOUND"));
        accounts.getOrCreate("gmail", "user_1", CreateConnectedAccountParams.builder()
                .authorizationDetails(AuthorizationDetails.staticAuth(Collections.singletonMap("token", "t"))).build());
        CreateConnectedAccountRequest create = fake.lastRequest("CreateConnectedAccount");
        assertTrue(create.getConnectedAccount().getAuthorizationDetails().hasStaticAuth(),
                "the given credentials are used, not the OAuth default");
    }

    @Test
    void getOrCreatePropagatesOtherErrors() {
        fake.enqueue("GetConnectedAccountAuth",
                FakeAgentKitServer.error(Status.Code.PERMISSION_DENIED, "CONNECTION_NOT_ENABLED"));
        assertThrows(PermissionDeniedException.class, () -> accounts.getOrCreate("gmail", "user_1"));
        assertEquals(0, fake.calls("CreateConnectedAccount"));
    }

    @Test
    void updateByIdSendsTheIdOnly() {
        accounts.update(ConnectedAccountRef.byId("ca_1"), UpdateConnectedAccountParams.builder().build());
        UpdateConnectedAccountRequest request = fake.lastRequest("UpdateConnectedAccount");
        assertEquals("ca_1", request.getId());
        assertFalse(request.hasConnector());
        assertTrue(request.hasConnectedAccount());
    }

    @Test
    void deleteMapsNotFound() {
        fake.enqueue("DeleteConnectedAccount", FakeAgentKitServer.error(Status.Code.NOT_FOUND, "RESOURCE_NOT_FOUND"));
        assertThrows(NotFoundException.class, () -> accounts.delete(ConnectedAccountRef.of("gmail", "user_1")));
        DeleteConnectedAccountRequest request = fake.lastRequest("DeleteConnectedAccount");
        assertEquals("gmail", request.getConnector());
    }

    @Test
    void magicLinkSendsStateAndVerifyUrlAndRedactsTheLink() {
        fake.enqueue("GetMagicLinkForConnectedAccount", GetMagicLinkForConnectedAccountResponse.newBuilder()
                .setLink("https://example.scalekit.dev/magic/secret").setExpiry(Timestamp.newBuilder().setSeconds(10)).build());
        AuthorizationLink link = accounts.getMagicLink(ConnectedAccountRef.of("gmail", "user_1"),
                AuthorizationLinkParams.builder().state("csrf").userVerifyUrl("https://app.example.com/verify").build());
        GetMagicLinkForConnectedAccountRequest request = fake.lastRequest("GetMagicLinkForConnectedAccount");
        assertEquals("csrf", request.getState());
        assertEquals("https://app.example.com/verify", request.getUserVerifyUrl());
        assertEquals("https://example.scalekit.dev/magic/secret", link.link());
        assertEquals(Instant.ofEpochSecond(10), link.expiresAt().get());
        assertFalse(link.toString().contains("secret"));
    }

    @Test
    void magicLinkWithoutParamsLeavesOptionalFieldsUnset() {
        accounts.getMagicLink(ConnectedAccountRef.byId("ca_1"));
        GetMagicLinkForConnectedAccountRequest request = fake.lastRequest("GetMagicLinkForConnectedAccount");
        assertFalse(request.hasState());
        assertFalse(request.hasUserVerifyUrl());
        assertFalse(request.hasConnector());
    }

    @Test
    void verifyUserTrimsAndIsNotRetriedOnUnavailable() {
        fake.enqueue("VerifyConnectedAccountUser", VerifyConnectedAccountUserResponse.newBuilder()
                .setPostUserVerifyRedirectUrl("https://next").build());
        assertEquals("https://next", accounts.verifyUser(" req_1 ", " user_1 ").postUserVerifyRedirectUrl().get());
        VerifyConnectedAccountUserRequest request = fake.lastRequest("VerifyConnectedAccountUser");
        assertEquals("req_1", request.getAuthRequestId());
        assertEquals("user_1", request.getIdentifier());

        fake.enqueue("VerifyConnectedAccountUser", FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null));
        assertThrows(InternalServerException.class, () -> accounts.verifyUser("req_1", "user_1"));
        assertEquals(2, fake.calls("VerifyConnectedAccountUser"));
    }

    @Test
    void listMapsFiltersAndPages() {
        fake.enqueue("ListConnectedAccounts",
                ListConnectedAccountsResponse.newBuilder()
                        .addConnectedAccounts(ConnectedAccountForList.newBuilder().setId("ca_1").setConnector("gmail")
                                .setStatus(ConnectorStatus.PENDING_AUTH))
                        .setNextPageToken("n2").setTotalSize(2).build(),
                ListConnectedAccountsResponse.newBuilder()
                        .addConnectedAccounts(ConnectedAccountForList.newBuilder().setId("ca_2")).build());

        Page<ConnectedAccount> page = accounts.list(ListConnectedAccountsParams.builder()
                .connectionNames(Arrays.asList("gmail", "slack"))
                .identifier(" user_1 ")
                .query("")
                .pageSize(1)
                .build());
        ListConnectedAccountsRequest request = fake.lastRequest("ListConnectedAccounts");
        assertEquals(Arrays.asList("gmail", "slack"), request.getConnectionNamesList());
        assertEquals("user_1", request.getIdentifier());
        assertFalse(request.hasConnector());
        assertEquals("", request.getQuery());
        assertEquals(2L, page.totalSize().getAsLong());
        assertEquals(ConnectedAccountStatus.PENDING_AUTH, page.items().get(0).status());
        assertFalse(page.items().get(0).authorizationDetails().isPresent());

        int count = 0;
        for (ConnectedAccount ignored : page.autoPager()) {
            count++;
        }
        assertEquals(2, count);
        assertEquals("n2", ((ListConnectedAccountsRequest) fake.lastRequest("ListConnectedAccounts")).getPageToken());
    }

    @Test
    void listIsRetriedOnUnavailable() {
        fake.enqueue("ListConnectedAccounts", FakeAgentKitServer.error(Status.Code.UNAVAILABLE, null));
        accounts.list();
        assertEquals(2, fake.calls("ListConnectedAccounts"));
    }
}
