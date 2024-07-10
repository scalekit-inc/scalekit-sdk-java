package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.connections.Connection;
import com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse;
import com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse;

import java.util.List;

public interface ConnectionClient {
    Connection getConnectionById(String connectionId, String organizationId);

    ListConnectionsResponse listConnectionsByDomain(String domain);

    ListConnectionsResponse listConnectionsByOrganization(String organizationId);

    ToggleConnectionResponse enableConnection(String connectionId, String organizationId);

    ToggleConnectionResponse disableConnection(String connectionId, String organizationId);

}
