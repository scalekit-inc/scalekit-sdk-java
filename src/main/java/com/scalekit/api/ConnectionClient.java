package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.connections.*;

public interface ConnectionClient {
    Connection getConnectionById(String connectionId, String organizationId);

    ListConnectionsResponse listConnectionsByDomain(String domain);

    ListConnectionsResponse listConnectionsByOrganization(String organizationId);

    ToggleConnectionResponse enableConnection(String connectionId, String organizationId);

    ToggleConnectionResponse disableConnection(String connectionId, String organizationId);

    Connection createConnection(String organizationId, CreateConnection connection);

}
