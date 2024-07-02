package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.api.ConnectionClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.connections.*;
import com.scalekit.grpc.scalekit.v1.domains.DomainServiceGrpc;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.Deadline;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

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


    @Override
    public Connection GetConnectionById(String connectionId, String organizationId) {
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

    @Override
    public List<Connection> ListConnectionsByDomain(String domain) {
        ListConnectionsRequest request = ListConnectionsRequest.newBuilder()
                .setDomain(domain)
                .build();

        try {
            ListConnectionsResponse response = ConnectionStub.listConnections(request);
            return toConnectionList(response);
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }

    @Override
    public List<Connection> ListConnectionsByOrganization(String organizationId) {
        ListConnectionsRequest request = ListConnectionsRequest.newBuilder()
                .setOrganizationId(organizationId)
                .build();

        try {
            ListConnectionsResponse response = ConnectionStub.listConnections(request);
            return toConnectionList(response);
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }

    private List<Connection> toConnectionList(ListConnectionsResponse response){
        return response.getConnectionsList().stream().map(listConnection -> Connection.newBuilder()
                        .setOrganizationId(listConnection.getOrganizationId())
                        .setId(listConnection.getId())
                        .setEnabled(listConnection.getEnabled())
                        .setProvider(listConnection.getProvider())
                        .setStatusValue(listConnection.getStatusValue())
                        .setType(listConnection.getType())
                        .build())
                .collect(Collectors.toList());
    }
}
