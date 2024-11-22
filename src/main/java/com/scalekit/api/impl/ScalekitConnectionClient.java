package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.api.ConnectionClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.connections.*;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.Deadline;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import java.util.concurrent.TimeUnit;

public class ScalekitConnectionClient implements ConnectionClient {

    private final ConnectionServiceGrpc.ConnectionServiceBlockingStub ConnectionStub;

    public ScalekitConnectionClient(ManagedChannel channel, ScalekitCredentials credentials){
        try {
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
        GetConnectionRequest request = GetConnectionRequest.newBuilder()
                .setOrganizationId(organizationId)
                .setId(connectionId)
                .build();

        try {
            GetConnectionResponse response = ConnectionStub.getConnection(request);
            return response.getConnection();
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }

    /**
        * listConnectionsByDomain retrieves a list of connections by domain
        * @param domain: The domain
        * @return List<Connection>: The list of connections
        * @throws APIException: If an error occurs
     */
    @Override
    public ListConnectionsResponse listConnectionsByDomain(String domain) {
        ListConnectionsRequest request = ListConnectionsRequest.newBuilder()
                .setDomain(domain)
                .setInclude("all")
                .build();
        try {
            return ConnectionStub.listConnections(request);
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }

    /**
        * listConnectionsByOrganization retrieves a list of connections by organization
        * @param organizationId: The organization ID
        * @return List<Connection>: The list of connections
        * @throws APIException: If an error occurs
     */
    @Override
    public ListConnectionsResponse listConnectionsByOrganization(String organizationId) {
        ListConnectionsRequest request = ListConnectionsRequest.newBuilder()
                .setInclude("all")
                .setOrganizationId(organizationId)
                .build();

        try {
            return ConnectionStub.listConnections(request);
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }


    /**
        * enableConnection enables a connection by its ID and organization ID
        * @param connectionId: The connection ID
        * @param organizationId: The organization ID
        * @return ToggleConnectionResponse: The response after enabling the connection
        * @throws APIException: If an error occurs
     */
    @Override
    public ToggleConnectionResponse enableConnection(String connectionId, String organizationId) {
        ToggleConnectionRequest request = ToggleConnectionRequest.newBuilder()
                .setOrganizationId(organizationId)
                .setId(connectionId)
                .build();

        try {
            return ConnectionStub.enableConnection(request);
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }

    }

    /**
        * disableConnection disables a connection by its ID and organization ID
        * @param connectionId: The connection ID
        * @param organizationId: The organization ID
        * @return ToggleConnectionResponse: The response after disabling the connection
        * @throws APIException: If an error occurs
     */
    @Override
    public ToggleConnectionResponse disableConnection(String connectionId, String organizationId) {
        ToggleConnectionRequest request = ToggleConnectionRequest.newBuilder()
                .setOrganizationId(organizationId)
                .setId(connectionId)
                .build();

        try {
            return ConnectionStub.disableConnection(request);
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }
}
