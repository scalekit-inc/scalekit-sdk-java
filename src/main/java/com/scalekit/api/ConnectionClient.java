package com.scalekit.api;

import com.google.protobuf.Empty;
import com.scalekit.grpc.scalekit.v1.connections.*;
import com.scalekit.models.Page;
import com.scalekit.models.connections.AppConnection;
import com.scalekit.models.connections.CreateEnvironmentConnectionParams;
import com.scalekit.models.connections.EnvironmentConnection;
import com.scalekit.models.connections.ListAppConnectionsParams;
import com.scalekit.models.connections.UpdateEnvironmentConnectionParams;

public interface ConnectionClient {
    Connection getConnectionById(String connectionId, String organizationId);

    ListConnectionsResponse listConnectionsByDomain(String domain);

    ListConnectionsResponse listConnectionsByOrganization(String organizationId);

    ToggleConnectionResponse enableConnection(String connectionId, String organizationId);

    ToggleConnectionResponse disableConnection(String connectionId, String organizationId);

    Connection createConnection(String organizationId, CreateConnection connection);

    void deleteConnection(String connectionId, String organizationId);


    /**
     * Lists the first page of your environment's app connections: the connections your users'
     * connected accounts belong to.
     *
     * @return the first page of app connections
     * @throws UnsupportedOperationException if this implementation does not support it
     * @throws com.scalekit.exceptions.APIException if the request fails
     * @since 2.6.0
     */
    default Page<AppConnection> listAppConnections() {
        return listAppConnections(null);
    }

    /**
     * Lists one page of your environment's app connections. Retried on transient unavailability.
     *
     * <pre>{@code
     * Page<AppConnection> page = client.connections().listAppConnections(
     *         ListAppConnectionsParams.builder().query("gmail").build());
     * }</pre>
     *
     * @param params provider, search text (3 to 100 characters) and paging (at most 30 per page);
     *               null for none
     * @return one page of app connections
     * @throws UnsupportedOperationException if this implementation does not support it
     * @throws com.scalekit.exceptions.BadRequestException if the search text or page size is invalid
     * @throws com.scalekit.exceptions.APIException for other failures
     * @since 2.6.0
     */
    default Page<AppConnection> listAppConnections(ListAppConnectionsParams params) {
        throw new UnsupportedOperationException("listAppConnections is not supported by this implementation");
    }

    /**
     * Creates an app connection in your environment. When no connection name is given, the server
     * generates one. Never retried on transient failures, because a repeat could create a second
     * connection.
     *
     * <pre>{@code
     * EnvironmentConnection gmail = client.connections().createEnvironmentConnection(
     *         CreateEnvironmentConnectionParams.appConnection("GMAIL").build());
     * String connectionName = gmail.connectionName().orElse(null);
     * }</pre>
     *
     * @param params the new connection
     * @return the created connection
     * @throws IllegalArgumentException if {@code params} is null, or its type or auth mode is a value
     *         this SDK version cannot send
     * @throws UnsupportedOperationException if this implementation does not support it
     * @throws com.scalekit.exceptions.BadRequestException if the name is taken
     *         ({@code DUPLICATE_IDENTIFIER}) or reserved, or the provider is invalid
     * @throws com.scalekit.exceptions.APIException for other failures
     * @since 2.6.0
     */
    default EnvironmentConnection createEnvironmentConnection(CreateEnvironmentConnectionParams params) {
        throw new UnsupportedOperationException("createEnvironmentConnection is not supported by this implementation");
    }

    /**
     * Gets an environment connection, including its settings. Secrets in the settings are masked.
     *
     * @param connectionId the connection ID
     * @return the connection
     * @throws IllegalArgumentException if {@code connectionId} is null or empty
     * @throws UnsupportedOperationException if this implementation does not support it
     * @throws com.scalekit.exceptions.NotFoundException if the connection does not exist
     * @throws com.scalekit.exceptions.BadRequestException if the ID is malformed
     * @throws com.scalekit.exceptions.APIException for other failures
     * @since 2.6.0
     */
    default EnvironmentConnection getEnvironmentConnection(String connectionId) {
        throw new UnsupportedOperationException("getEnvironmentConnection is not supported by this implementation");
    }

    /**
     * Updates an environment connection. The server requires the connection name, provider key and
     * type on every update and stores the connection name given, so pass the current name to keep
     * it. Reserved connection names cannot change.
     *
     * <p><b>Pass the connection's current type</b>, for example from
     * {@link #getEnvironmentConnection(String)}. A different type converts the connection: the server
     * changes its type and provider, resets its settings and sets its status to
     * {@code IN_PROGRESS}. The SDK does not check this for you.
     *
     * <p>Secrets read back from the server are masked. Sending a masked value back keeps the stored
     * secret, so settings read with {@link #getEnvironmentConnection(String)} can be changed and sent
     * back as they are.
     *
     * <pre>{@code
     * EnvironmentConnection current = client.connections().getEnvironmentConnection("conn_123");
     * EnvironmentConnection updated = client.connections().updateEnvironmentConnection(current.id(),
     *         UpdateEnvironmentConnectionParams.builder(
     *                         current.connectionName().orElseThrow(IllegalStateException::new),
     *                         current.providerKey(),
     *                         current.type())
     *                 .oauthSettings(OAuthConnectionSettings.builder()
     *                         .clientId(System.getenv("GMAIL_CLIENT_ID"))
     *                         .clientSecret(System.getenv("GMAIL_CLIENT_SECRET"))
     *                         .build())
     *                 .build());
     * }</pre>
     *
     * @param connectionId the connection ID
     * @param params       the connection's new definition
     * @return the updated connection
     * @throws IllegalArgumentException if {@code connectionId} is null or empty, {@code params} is null,
     *         or its type is a value this SDK version cannot send
     * @throws UnsupportedOperationException if this implementation does not support it
     * @throws com.scalekit.exceptions.NotFoundException if the connection does not exist
     * @throws com.scalekit.exceptions.BadRequestException if the definition is invalid, for example
     *         a reserved name ({@code RESTRICTED_CONNECTION_NAME})
     * @throws com.scalekit.exceptions.APIException for other failures
     * @since 2.6.0
     */
    default EnvironmentConnection updateEnvironmentConnection(String connectionId,
                                                              UpdateEnvironmentConnectionParams params) {
        throw new UnsupportedOperationException("updateEnvironmentConnection is not supported by this implementation");
    }
}
