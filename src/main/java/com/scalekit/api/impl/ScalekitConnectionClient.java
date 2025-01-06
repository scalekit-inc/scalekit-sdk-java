package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.api.ConnectionClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.connections.*;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.Deadline;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import java.util.concurrent.TimeUnit;

public class ScalekitConnectionClient implements ConnectionClient {

    private final ConnectionServiceGrpc.ConnectionServiceBlockingStub ConnectionStub;
    private final ScalekitCredentials credentials;

    public ScalekitConnectionClient(ManagedChannel channel, ScalekitCredentials credentials){
        try {
            this.credentials = credentials;
            this.ConnectionStub =  ConnectionServiceGrpc
                    .newBlockingStub(channel)
                    .withDeadline(Deadline.after(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS))
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
            GetConnectionResponse response = this.ConnectionStub.getConnection(
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
        return RetryExecuter.executeWithRetry(() -> this.ConnectionStub.listConnections(
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

        return RetryExecuter.executeWithRetry(() -> this.ConnectionStub.listConnections(
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
            return this.ConnectionStub.enableConnection(request);
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
                return this.ConnectionStub.disableConnection(request);
            },this.credentials);
    }
}
