package com.scalekit.api.impl;

import com.scalekit.api.ConnectedAccountsClient;
import com.scalekit.exceptions.NotFoundException;
import com.scalekit.grpc.scalekit.v1.connected_accounts.ConnectedAccountForList;
import com.scalekit.grpc.scalekit.v1.connected_accounts.ConnectedAccountServiceGrpc;
import com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccount;
import com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountResponse;
import com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierResponse;
import com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountResponse;
import com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsResponse;
import com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccount;
import com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountResponse;
import com.scalekit.grpc.scalekit.v1.connected_accounts.VerifyConnectedAccountUserRequest;
import com.scalekit.grpc.scalekit.v1.connected_accounts.VerifyConnectedAccountUserResponse;
import com.scalekit.internal.Preconditions;
import com.scalekit.internal.ProtoTime;
import com.scalekit.internal.ScalekitCredentials;
import com.scalekit.internal.StructConverter;
import com.scalekit.models.Page;
import com.scalekit.models.connectedaccounts.AuthorizationDetails;
import com.scalekit.models.connectedaccounts.AuthorizationLink;
import com.scalekit.models.connectedaccounts.AuthorizationLinkParams;
import com.scalekit.models.connectedaccounts.ConnectedAccount;
import com.scalekit.models.connectedaccounts.ConnectedAccountRef;
import com.scalekit.models.connectedaccounts.CreateConnectedAccountParams;
import com.scalekit.models.connectedaccounts.ListConnectedAccountsParams;
import com.scalekit.models.connectedaccounts.OAuthToken;
import com.scalekit.models.connectedaccounts.UpdateConnectedAccountParams;
import com.scalekit.models.connectedaccounts.UserVerificationResult;
import io.grpc.Channel;

import java.util.ArrayList;
import java.util.List;

/** {@link ConnectedAccountsClient} over gRPC. Thread-safe. */
public class ScalekitConnectedAccountsClient implements ConnectedAccountsClient {

    private final ConnectedAccountServiceGrpc.ConnectedAccountServiceBlockingStub stub;
    private final ScalekitCredentials credentials;

    /**
     * Creates the client.
     *
     * @param channel     the channel
     * @param credentials the credentials attached to every call
     */
    public ScalekitConnectedAccountsClient(Channel channel, ScalekitCredentials credentials) {
        this.credentials = credentials;
        this.stub = ConnectedAccountServiceGrpc.newBlockingStub(channel).withCallCredentials(credentials);
    }

    private ConnectedAccountServiceGrpc.ConnectedAccountServiceBlockingStub stub() {
        return stub.withDeadlineAfter(AgentKitCalls.controlPlaneTimeoutMillis(), AgentKitCalls.MILLIS);
    }

    @Override
    public Page<ConnectedAccount> list() {
        return list(null);
    }

    @Override
    public Page<ConnectedAccount> list(ListConnectedAccountsParams params) {
        ListConnectedAccountsParams effective = params == null ? ListConnectedAccountsParams.builder().build() : params;
        return fetch(effective, effective.pageToken().orElse(null));
    }

    private Page<ConnectedAccount> fetch(final ListConnectedAccountsParams params, String pageToken) {
        ListConnectedAccountsRequest.Builder request = ListConnectedAccountsRequest.newBuilder();
        params.connectionName().ifPresent(request::setConnector);
        if (!params.connectionNames().isEmpty()) {
            request.addAllConnectionNames(params.connectionNames());
        }
        params.identifier().ifPresent(request::setIdentifier);
        params.provider().ifPresent(request::setProvider);
        params.query().ifPresent(request::setQuery);
        if (params.pageSize().isPresent()) {
            request.setPageSize(params.pageSize().getAsInt());
        }
        if (pageToken != null) {
            request.setPageToken(pageToken);
        }
        final ListConnectedAccountsRequest built = request.build();
        ListConnectedAccountsResponse response = AgentKitCalls.call(
                ConnectedAccountServiceGrpc.getListConnectedAccountsMethod(), credentials,
                () -> stub().listConnectedAccounts(built));
        List<ConnectedAccount> accounts = new ArrayList<>(response.getConnectedAccountsCount());
        for (ConnectedAccountForList account : response.getConnectedAccountsList()) {
            accounts.add(AgentKitConverters.connectedAccount(account));
        }
        return new Page.Builder<ConnectedAccount>()
                .items(accounts)
                .nextPageToken(response.getNextPageToken())
                .prevPageToken(response.getPrevPageToken())
                .totalSize(response.getTotalSize())
                .nextPageFetcher(next -> fetch(params, next))
                .build();
    }

    @Override
    public ConnectedAccount get(ConnectedAccountRef account) {
        requireRef(account);
        GetConnectedAccountByIdentifierRequest.Builder request = GetConnectedAccountByIdentifierRequest.newBuilder();
        if (account.connectedAccountId().isPresent()) {
            request.setId(account.connectedAccountId().get());
        } else {
            request.setConnector(account.connectionName().get()).setIdentifier(account.identifier().get());
        }
        final GetConnectedAccountByIdentifierRequest built = request.build();
        GetConnectedAccountByIdentifierResponse response = AgentKitCalls.call(
                ConnectedAccountServiceGrpc.getGetConnectedAccountAuthMethod(), credentials,
                () -> stub().getConnectedAccountAuth(built));
        return AgentKitConverters.connectedAccount(response.getConnectedAccount());
    }

    @Override
    public ConnectedAccount create(String connectionName, String identifier) {
        return create(connectionName, identifier, null);
    }

    @Override
    public ConnectedAccount create(String connectionName, String identifier, CreateConnectedAccountParams params) {
        String connection = Preconditions.requireNonBlank(connectionName, "connectionName");
        String owner = Preconditions.requireNonBlank(identifier, "identifier");
        // The server requires connected_account; it is always sent, empty when there are no params.
        CreateConnectedAccount.Builder account = CreateConnectedAccount.newBuilder();
        if (params != null) {
            if (params.authorizationDetails().isPresent()) {
                account.setAuthorizationDetails(AgentKitConverters.toProto(params.authorizationDetails().get()));
            }
            if (params.apiConfig().isPresent()) {
                account.setApiConfig(StructConverter.toStruct(params.apiConfig().get()));
            }
        }
        final CreateConnectedAccountRequest built = CreateConnectedAccountRequest.newBuilder()
                .setConnector(connection)
                .setIdentifier(owner)
                .setConnectedAccount(account)
                .build();
        CreateConnectedAccountResponse response = AgentKitCalls.call(
                ConnectedAccountServiceGrpc.getCreateConnectedAccountMethod(), credentials,
                () -> stub().createConnectedAccount(built));
        return AgentKitConverters.connectedAccount(response.getConnectedAccount());
    }

    @Override
    public ConnectedAccount update(ConnectedAccountRef account, UpdateConnectedAccountParams params) {
        requireRef(account);
        if (params == null) {
            throw new IllegalArgumentException("params is required");
        }
        UpdateConnectedAccount.Builder update = UpdateConnectedAccount.newBuilder();
        if (params.authorizationDetails().isPresent()) {
            update.setAuthorizationDetails(AgentKitConverters.toProto(params.authorizationDetails().get()));
        }
        if (params.apiConfig().isPresent()) {
            update.setApiConfig(StructConverter.toStruct(params.apiConfig().get()));
        }
        UpdateConnectedAccountRequest.Builder request = UpdateConnectedAccountRequest.newBuilder()
                .setConnectedAccount(update);
        if (account.connectedAccountId().isPresent()) {
            request.setId(account.connectedAccountId().get());
        } else {
            request.setConnector(account.connectionName().get()).setIdentifier(account.identifier().get());
        }
        final UpdateConnectedAccountRequest built = request.build();
        UpdateConnectedAccountResponse response = AgentKitCalls.call(
                ConnectedAccountServiceGrpc.getUpdateConnectedAccountMethod(), credentials,
                () -> stub().updateConnectedAccount(built));
        return AgentKitConverters.connectedAccount(response.getConnectedAccount());
    }

    @Override
    public void delete(ConnectedAccountRef account) {
        requireRef(account);
        DeleteConnectedAccountRequest.Builder request = DeleteConnectedAccountRequest.newBuilder();
        if (account.connectedAccountId().isPresent()) {
            request.setId(account.connectedAccountId().get());
        } else {
            request.setConnector(account.connectionName().get()).setIdentifier(account.identifier().get());
        }
        final DeleteConnectedAccountRequest built = request.build();
        AgentKitCalls.call(ConnectedAccountServiceGrpc.getDeleteConnectedAccountMethod(), credentials,
                () -> stub().deleteConnectedAccount(built));
    }

    @Override
    public ConnectedAccount getOrCreate(String connectionName, String identifier) {
        return getOrCreate(connectionName, identifier, null);
    }

    @Override
    public ConnectedAccount getOrCreate(String connectionName, String identifier, CreateConnectedAccountParams params) {
        ConnectedAccountRef ref = ConnectedAccountRef.of(connectionName, identifier);
        boolean hasDetails = params != null && params.authorizationDetails().isPresent();
        try {
            ConnectedAccount existing = get(ref);
            if (!hasDetails) {
                return existing;
            }
            UpdateConnectedAccountParams.Builder update = UpdateConnectedAccountParams.builder()
                    .authorizationDetails(params.authorizationDetails().get());
            if (params.apiConfig().isPresent()) {
                update.apiConfig(params.apiConfig().get());
            }
            return update(ref, update.build());
        } catch (NotFoundException notFound) {
            // Missing (or removed between the get and the update): create it below.
        }
        CreateConnectedAccountParams.Builder create = params == null
                ? CreateConnectedAccountParams.builder() : params.toBuilder();
        if (!hasDetails) {
            create.authorizationDetails(AuthorizationDetails.oauthToken(OAuthToken.builder().build()));
        }
        return create(ref.connectionName().get(), ref.identifier().get(), create.build());
    }

    @Override
    public ConnectedAccount upsert(String connectionName, String identifier) {
        return getOrCreate(connectionName, identifier, null);
    }

    @Override
    public ConnectedAccount upsert(String connectionName, String identifier, CreateConnectedAccountParams params) {
        return getOrCreate(connectionName, identifier, params);
    }

    @Override
    public AuthorizationLink getMagicLink(ConnectedAccountRef account) {
        return getMagicLink(account, null);
    }

    @Override
    public AuthorizationLink getMagicLink(ConnectedAccountRef account, AuthorizationLinkParams params) {
        requireRef(account);
        GetMagicLinkForConnectedAccountRequest.Builder request = GetMagicLinkForConnectedAccountRequest.newBuilder();
        if (account.connectedAccountId().isPresent()) {
            request.setId(account.connectedAccountId().get());
        } else {
            request.setConnector(account.connectionName().get()).setIdentifier(account.identifier().get());
        }
        if (params != null) {
            params.state().ifPresent(request::setState);
            params.userVerifyUrl().ifPresent(request::setUserVerifyUrl);
        }
        final GetMagicLinkForConnectedAccountRequest built = request.build();
        GetMagicLinkForConnectedAccountResponse response = AgentKitCalls.call(
                ConnectedAccountServiceGrpc.getGetMagicLinkForConnectedAccountMethod(), credentials,
                () -> stub().getMagicLinkForConnectedAccount(built));
        return AuthorizationLink.builder()
                .link(response.getLink())
                .expiresAt(ProtoTime.toInstantOrNull(response.hasExpiry(), response.getExpiry()))
                .build();
    }

    @Override
    public UserVerificationResult verifyUser(String authRequestId, String identifier) {
        final VerifyConnectedAccountUserRequest built = VerifyConnectedAccountUserRequest.newBuilder()
                .setAuthRequestId(Preconditions.requireNonBlank(authRequestId, "authRequestId"))
                .setIdentifier(Preconditions.requireNonBlank(identifier, "identifier"))
                .build();
        VerifyConnectedAccountUserResponse response = AgentKitCalls.call(
                ConnectedAccountServiceGrpc.getVerifyConnectedAccountUserMethod(), credentials,
                () -> stub().verifyConnectedAccountUser(built));
        return UserVerificationResult.builder()
                .postUserVerifyRedirectUrl(response.getPostUserVerifyRedirectUrl())
                .build();
    }

    private static void requireRef(ConnectedAccountRef account) {
        if (account == null) {
            throw new IllegalArgumentException("account is required");
        }
    }
}
