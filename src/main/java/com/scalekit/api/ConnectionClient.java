package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.connections.Connection;
import com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse;

import java.util.List;

public interface ConnectionClient {
    Connection GetConnectionById(String connectionId, String organizationId);

    ListConnectionsResponse ListConnectionsByDomain(String domain);

    ListConnectionsResponse ListConnectionsByOrganization(String organizationId);

}
