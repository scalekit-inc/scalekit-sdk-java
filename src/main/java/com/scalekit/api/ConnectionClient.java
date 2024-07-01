package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.connections.Connection;

import java.util.List;

public interface ConnectionClient {
    Connection GetConnectionById(String connectionId, String organizationId);

    List<Connection> ListConnectionsByDomain(String domain);

    List<Connection> ListConnectionsByOrganization(String organizationId);

}
