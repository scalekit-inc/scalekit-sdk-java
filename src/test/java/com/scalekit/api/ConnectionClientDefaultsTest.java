package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.connections.Connection;
import com.scalekit.grpc.scalekit.v1.connections.CreateConnection;
import com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse;
import com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse;
import com.scalekit.models.connections.CreateEnvironmentConnectionParams;
import com.scalekit.models.connections.EnvironmentConnectionType;
import com.scalekit.models.connections.UpdateEnvironmentConnectionParams;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * An implementation written against the interface before 2.6.0 still compiles, and the methods it
 * lacks fail clearly instead of with AbstractMethodError.
 */
class ConnectionClientDefaultsTest {

    /** Implements exactly the methods the interface had before 2.6.0. */
    private static final class OlderImplementation implements ConnectionClient {
        @Override
        public Connection getConnectionById(String connectionId, String organizationId) {
            return Connection.getDefaultInstance();
        }

        @Override
        public ListConnectionsResponse listConnectionsByDomain(String domain) {
            return ListConnectionsResponse.getDefaultInstance();
        }

        @Override
        public ListConnectionsResponse listConnectionsByOrganization(String organizationId) {
            return ListConnectionsResponse.getDefaultInstance();
        }

        @Override
        public ToggleConnectionResponse enableConnection(String connectionId, String organizationId) {
            return ToggleConnectionResponse.getDefaultInstance();
        }

        @Override
        public ToggleConnectionResponse disableConnection(String connectionId, String organizationId) {
            return ToggleConnectionResponse.getDefaultInstance();
        }

        @Override
        public Connection createConnection(String organizationId, CreateConnection connection) {
            return Connection.getDefaultInstance();
        }

        @Override
        public void deleteConnection(String connectionId, String organizationId) {
        }
    }

    @Test
    void newMethodsThrowUnsupportedOperationExceptionOnOlderImplementations() {
        ConnectionClient client = new OlderImplementation();
        assertThrows(UnsupportedOperationException.class, client::listAppConnections);
        assertThrows(UnsupportedOperationException.class, () -> client.listAppConnections(null));
        assertThrows(UnsupportedOperationException.class, () -> client.createEnvironmentConnection(
                CreateEnvironmentConnectionParams.appConnection("GMAIL").build()));
        assertThrows(UnsupportedOperationException.class, () -> client.getEnvironmentConnection("conn_1"));
        assertThrows(UnsupportedOperationException.class, () -> client.updateEnvironmentConnection("conn_1",
                UpdateEnvironmentConnectionParams.builder("gmail", "GMAIL", EnvironmentConnectionType.OAUTH).build()));
    }
}
