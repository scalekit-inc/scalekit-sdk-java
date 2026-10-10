package com.scalekit.models.connectedaccounts;

import com.scalekit.internal.Preconditions;

import java.util.Objects;
import java.util.Optional;

/**
 * Selects one connected account: by its ID, or by connection name plus identifier. Values are
 * trimmed and checked when the reference is created, so an invalid selector fails before any
 * request. Immutable and thread-safe.
 *
 * <pre>{@code
 * ConnectedAccountRef byId = ConnectedAccountRef.byId("ca_123");
 * ConnectedAccountRef byOwner = ConnectedAccountRef.of("gmail", "user_123");
 * }</pre>
 *
 * @since 2.6.0
 */
public final class ConnectedAccountRef {

    private final String connectedAccountId;
    private final String connectionName;
    private final String identifier;

    private ConnectedAccountRef(String connectedAccountId, String connectionName, String identifier) {
        this.connectedAccountId = connectedAccountId;
        this.connectionName = connectionName;
        this.identifier = identifier;
    }

    /**
     * Selects an account by its ID.
     *
     * @param connectedAccountId the connected account ID ({@code ca_...})
     * @return the reference
     * @throws IllegalArgumentException if {@code connectedAccountId} is null or blank
     */
    public static ConnectedAccountRef byId(String connectedAccountId) {
        return new ConnectedAccountRef(Preconditions.requireNonBlank(connectedAccountId, "connectedAccountId"),
                null, null);
    }

    /**
     * Selects the account that {@code identifier} holds on a connection.
     *
     * @param connectionName the connection name, for example {@code "gmail"}
     * @param identifier     your identifier for the account's owner (a user or tenant ID)
     * @return the reference
     * @throws IllegalArgumentException if either value is null or blank
     */
    public static ConnectedAccountRef of(String connectionName, String identifier) {
        return new ConnectedAccountRef(null, Preconditions.requireNonBlank(connectionName, "connectionName"),
                Preconditions.requireNonBlank(identifier, "identifier"));
    }

    /**
     * Returns the account ID, when the reference selects by ID.
     *
     * @return the ID, or empty
     */
    public Optional<String> connectedAccountId() {
        return Optional.ofNullable(connectedAccountId);
    }

    /**
     * Returns the connection name, when the reference selects by connection and identifier.
     *
     * @return the connection name, or empty
     */
    public Optional<String> connectionName() {
        return Optional.ofNullable(connectionName);
    }

    /**
     * Returns the identifier, when the reference selects by connection and identifier.
     *
     * @return the identifier, or empty
     */
    public Optional<String> identifier() {
        return Optional.ofNullable(identifier);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectedAccountRef)) {
            return false;
        }
        ConnectedAccountRef that = (ConnectedAccountRef) o;
        return Objects.equals(connectedAccountId, that.connectedAccountId)
                && Objects.equals(connectionName, that.connectionName) && Objects.equals(identifier, that.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectedAccountId, connectionName, identifier);
    }

    @Override
    public String toString() {
        return connectedAccountId != null
                ? "ConnectedAccountRef{connectedAccountId=" + connectedAccountId + "}"
                : "ConnectedAccountRef{connectionName=" + connectionName + ", identifier=" + identifier + "}";
    }
}
