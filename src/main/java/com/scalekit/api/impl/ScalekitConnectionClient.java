package com.scalekit.api.impl;

import com.google.protobuf.Empty;
import com.scalekit.Environment;
import com.scalekit.api.ConnectionClient;
import com.scalekit.grpc.scalekit.v1.connections.*;
import com.scalekit.internal.Preconditions;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import com.scalekit.internal.StructConverter;
import com.scalekit.models.Page;
import com.scalekit.models.connections.AppConnection;
import com.scalekit.models.connections.CreateEnvironmentConnectionParams;
import com.scalekit.models.connections.EnvironmentConnection;
import com.scalekit.models.connections.ListAppConnectionsParams;
import com.scalekit.models.connections.UpdateEnvironmentConnectionParams;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ScalekitConnectionClient implements ConnectionClient {

    private final ConnectionServiceGrpc.ConnectionServiceBlockingStub ConnectionStub;
    private final ScalekitCredentials credentials;

    public ScalekitConnectionClient(ManagedChannel channel, ScalekitCredentials credentials){
        try {
            this.credentials = credentials;
            this.ConnectionStub =  ConnectionServiceGrpc
                    .newBlockingStub(channel)
                    .withCallCredentials(credentials);
        }
        catch (StatusRuntimeException e){
            throw new RuntimeException("Error creating Connection client", e);
        }
    }


    /**
        * getConnectionById retrieves a connection by its ID
        * @param connectionId: The connection ID
        * @param organizationId: The organization ID
     */
    @Override
    public Connection getConnectionById(String connectionId, String organizationId) {
        return RetryExecuter.executeWithRetry(() -> {
            GetConnectionResponse response = this.ConnectionStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .getConnection(
                    GetConnectionRequest.newBuilder()
                            .setId(connectionId)
                            .setOrganizationId(organizationId)
                            .build()
            );
            return response.getConnection();
        },this.credentials);
    }

    /**
        * listConnectionsByDomain retrieves a list of connections by domain
        * @param domain: The domain
        * @return ListConnectionsResponse: The list of connections
     */
    @Override
    public ListConnectionsResponse listConnectionsByDomain(String domain) {
        return RetryExecuter.executeWithRetry(() -> this.ConnectionStub
                .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                .listConnections(
                ListConnectionsRequest.newBuilder()
                        .setDomain(domain)
                        .setInclude("all")
                        .build()
        ),this.credentials);
    }

    /**
        * listConnectionsByOrganization retrieves a list of connections by organization
        * @param organizationId: The organization ID
        * @return ListConnectionsResponse: The list of connections
     */
    @Override
    public ListConnectionsResponse listConnectionsByOrganization(String organizationId) {

        return RetryExecuter.executeWithRetry(() -> this.ConnectionStub
                .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                .listConnections(
                ListConnectionsRequest.newBuilder()
                        .setOrganizationId(organizationId)
                        .setInclude("all")
                        .build()
        ),this.credentials);
    }


    /**
        * enableConnection enables a connection by its ID and organization ID
        * @param connectionId: The connection ID
        * @param organizationId: The organization ID
        * @return ToggleConnectionResponse: The response after enabling the connection
     */
    @Override
    public ToggleConnectionResponse enableConnection(String connectionId, String organizationId) {

        return RetryExecuter.executeWithRetry(() -> {
            ToggleConnectionRequest request = ToggleConnectionRequest.newBuilder()
                    .setOrganizationId(organizationId)
                    .setId(connectionId)
                    .build();
            return this.ConnectionStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .enableConnection(request);
        },this.credentials);

    }

    /**
        * disableConnection disables a connection by its ID and organization ID
        * @param connectionId: The connection ID
        * @param organizationId: The organization ID
        * @return ToggleConnectionResponse: The response after disabling the connection
     */
    @Override
    public ToggleConnectionResponse disableConnection(String connectionId, String organizationId) {

            return RetryExecuter.executeWithRetry(() -> {
                ToggleConnectionRequest request = ToggleConnectionRequest.newBuilder()
                        .setOrganizationId(organizationId)
                        .setId(connectionId)
                        .build();
                return this.ConnectionStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .disableConnection(request);
            },this.credentials);
    }


    /**
     * createConnection creates a new connection in Scalekit for the organization
     * @param organizationId: The organization ID
     * @param connection: The connection to create
     * @return Connection: The connection created
     */
    @Override
    public Connection createConnection(String organizationId, CreateConnection connection) {
        return RetryExecuter.executeWithRetry(() -> {
            CreateConnectionResponse response = this.ConnectionStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .createConnection(
                    CreateConnectionRequest.newBuilder()
                            .setOrganizationId(organizationId)
                            .setConnection(connection)
                            .build()
            );
            return response.getConnection();
        },this.credentials);
    }


    /**
     * deleteConnection deletes a connection by its ID and organization ID
     * @param connectionId: The connection ID
     * @param organizationId: The organization ID
     */
    @Override
    public void  deleteConnection(String connectionId, String organizationId) {
         RetryExecuter.executeWithRetry(()->{
           Empty response = this.ConnectionStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .deleteConnection(
                    DeleteConnectionRequest.newBuilder()
                            .setId(connectionId)
                            .setOrganizationId(organizationId)
                            .build()
            );
             return null;
         },this.credentials);
    }

    private ConnectionServiceGrpc.ConnectionServiceBlockingStub agentKitStub() {
        return this.ConnectionStub.withDeadlineAfter(AgentKitCalls.controlPlaneTimeoutMillis(), AgentKitCalls.MILLIS);
    }

    @Override
    public Page<AppConnection> listAppConnections(ListAppConnectionsParams params) {
        ListAppConnectionsParams effective = params == null ? ListAppConnectionsParams.builder().build() : params;
        return fetchAppConnections(effective, effective.pageToken().orElse(null));
    }

    private Page<AppConnection> fetchAppConnections(final ListAppConnectionsParams params, String pageToken) {
        ListAppConnectionsRequest.Builder request = ListAppConnectionsRequest.newBuilder();
        params.provider().ifPresent(request::setProvider);
        params.query().ifPresent(request::setQuery);
        if (params.pageSize().isPresent()) {
            request.setPageSize(params.pageSize().getAsInt());
        }
        if (pageToken != null) {
            request.setPageToken(pageToken);
        }
        final ListAppConnectionsRequest built = request.build();
        ListAppConnectionsResponse response = AgentKitCalls.call(ConnectionServiceGrpc.getListAppConnectionsMethod(),
                credentials, () -> agentKitStub().listAppConnections(built));
        List<AppConnection> connections = new ArrayList<>(response.getConnectionsCount());
        for (ListConnection connection : response.getConnectionsList()) {
            connections.add(ConnectionConverters.appConnection(connection));
        }
        return new Page.Builder<AppConnection>()
                .items(connections)
                .nextPageToken(response.getNextPageToken())
                .prevPageToken(response.getPrevPageToken())
                .totalSize(response.getTotalSize())
                .nextPageFetcher(next -> fetchAppConnections(params, next))
                .build();
    }

    @Override
    public EnvironmentConnection createEnvironmentConnection(CreateEnvironmentConnectionParams params) {
        if (params == null) {
            throw new IllegalArgumentException("params is required");
        }
        CreateConnection.Builder connection = CreateConnection.newBuilder().setProviderKey(params.providerKey());
        if (params.type().isPresent()) {
            connection.setTypeValue(ConnectionConverters.typeNumber(params.type().get()));
        }
        params.connectionName().ifPresent(connection::setKeyId);
        if (params.authMode().isPresent()) {
            connection.setAuthModeValue(ConnectionConverters.authModeNumber(params.authMode().get()));
        }
        if (params.context().isPresent()) {
            connection.setContext(StructConverter.toStruct(params.context().get()));
        }
        final CreateEnvironmentConnectionRequest built = CreateEnvironmentConnectionRequest.newBuilder()
                .setConnection(connection)
                .setFlags(Flags.newBuilder().setIsApp(true))
                .build();
        CreateConnectionResponse response = AgentKitCalls.call(
                ConnectionServiceGrpc.getCreateEnvironmentConnectionMethod(), credentials,
                () -> agentKitStub().createEnvironmentConnection(built));
        return ConnectionConverters.environmentConnection(response.getConnection());
    }

    @Override
    public EnvironmentConnection getEnvironmentConnection(String connectionId) {
        final GetEnvironmentConnectionRequest built = GetEnvironmentConnectionRequest.newBuilder()
                .setConnectionId(Preconditions.requireNonEmpty(connectionId, "connectionId"))
                .build();
        GetConnectionResponse response = AgentKitCalls.call(ConnectionServiceGrpc.getGetEnvironmentConnectionMethod(),
                credentials, () -> agentKitStub().getEnvironmentConnection(built));
        return ConnectionConverters.environmentConnection(response.getConnection());
    }

    @Override
    public EnvironmentConnection updateEnvironmentConnection(String connectionId,
                                                             UpdateEnvironmentConnectionParams params) {
        String id = Preconditions.requireNonEmpty(connectionId, "connectionId");
        if (params == null) {
            throw new IllegalArgumentException("params is required");
        }
        final UpdateEnvironmentConnectionRequest built = UpdateEnvironmentConnectionRequest.newBuilder()
                .setConnectionId(id)
                .setConnection(ConnectionConverters.toProto(params))
                .build();
        UpdateConnectionResponse response = AgentKitCalls.call(
                ConnectionServiceGrpc.getUpdateEnvironmentConnectionMethod(), credentials,
                () -> agentKitStub().updateEnvironmentConnection(built));
        return ConnectionConverters.environmentConnection(response.getConnection());
    }
}
