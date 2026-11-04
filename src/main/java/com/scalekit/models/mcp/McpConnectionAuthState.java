package com.scalekit.models.mcp;

import com.scalekit.internal.Preconditions;
import com.scalekit.internal.Redaction;
import com.scalekit.models.connectedaccounts.ConnectedAccountStatus;

import java.util.Objects;
import java.util.Optional;

/**
 * Whether a user has a usable account on one connection of an MCP configuration. The
 * authentication link grants access to the authorization flow, so {@link #toString()} never
 * prints it. Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class McpConnectionAuthState {

    private final String connectionId;
    private final String connectionName;
    private final String provider;
    private final String connectedAccountId;
    private final ConnectedAccountStatus connectedAccountStatus;
    private final String authenticationLink;

    private McpConnectionAuthState(Builder builder) {
        this.connectionId = Preconditions.nullToEmpty(builder.connectionId);
        this.connectionName = Preconditions.nullToEmpty(builder.connectionName);
        this.provider = Preconditions.nullToEmpty(builder.provider);
        this.connectedAccountId = Preconditions.emptyToNull(builder.connectedAccountId);
        this.connectedAccountStatus = builder.connectedAccountStatus;
        this.authenticationLink = Preconditions.emptyToNull(builder.authenticationLink);
    }

    /**
     * Returns a new builder.
     *
     * @return the builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Returns the connection ID.
     *
     * @return the ID, never null
     */
    public String connectionId() {
        return connectionId;
    }

    /**
     * Returns the connection name.
     *
     * @return the name, never null
     */
    public String connectionName() {
        return connectionName;
    }

    /**
     * Returns the connection's provider.
     *
     * @return the provider, never null
     */
    public String provider() {
        return provider;
    }

    /**
     * Returns the user's connected account on this connection.
     *
     * @return the account ID, or empty when the user has none
     */
    public Optional<String> connectedAccountId() {
        return Optional.ofNullable(connectedAccountId);
    }

    /**
     * Returns the status of that connected account.
     *
     * @return the status, or empty when the user has no account
     */
    public Optional<ConnectedAccountStatus> connectedAccountStatus() {
        return Optional.ofNullable(connectedAccountStatus);
    }

    /**
     * Returns a link the user can follow to authorize the connection. Present only when the
     * request asked for links.
     *
     * @return the link, or empty
     */
    public Optional<String> authenticationLink() {
        return Optional.ofNullable(authenticationLink);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof McpConnectionAuthState)) {
            return false;
        }
        McpConnectionAuthState that = (McpConnectionAuthState) o;
        return connectionId.equals(that.connectionId) && connectionName.equals(that.connectionName)
                && provider.equals(that.provider) && Objects.equals(connectedAccountId, that.connectedAccountId)
                && Objects.equals(connectedAccountStatus, that.connectedAccountStatus)
                && Objects.equals(authenticationLink, that.authenticationLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionId, connectionName, provider, connectedAccountId, connectedAccountStatus,
                authenticationLink);
    }

    @Override
    public String toString() {
        return "McpConnectionAuthState{connectionId=" + connectionId + ", connectionName=" + connectionName
                + ", provider=" + provider + ", connectedAccountId=" + connectedAccountId
                + ", connectedAccountStatus=" + connectedAccountStatus
                + ", authenticationLink=" + Redaction.secret(authenticationLink) + "}";
    }

    /**
     * Builder for {@link McpConnectionAuthState}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String connectionId;
        private String connectionName;
        private String provider;
        private String connectedAccountId;
        private ConnectedAccountStatus connectedAccountStatus;
        private String authenticationLink;

        private Builder() {
        }

        /**
         * Sets the connection ID.
         *
         * @param connectionId the ID
         * @return this builder
         */
        public Builder connectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Sets the connection name.
         *
         * @param connectionName the name
         * @return this builder
         */
        public Builder connectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        /**
         * Sets the provider.
         *
         * @param provider the provider
         * @return this builder
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the connected account ID.
         *
         * @param connectedAccountId the ID, or null
         * @return this builder
         */
        public Builder connectedAccountId(String connectedAccountId) {
            this.connectedAccountId = connectedAccountId;
            return this;
        }

        /**
         * Sets the connected account status.
         *
         * @param connectedAccountStatus the status, or null
         * @return this builder
         */
        public Builder connectedAccountStatus(ConnectedAccountStatus connectedAccountStatus) {
            this.connectedAccountStatus = connectedAccountStatus;
            return this;
        }

        /**
         * Sets the authentication link.
         *
         * @param authenticationLink the link, or null
         * @return this builder
         */
        public Builder authenticationLink(String authenticationLink) {
            this.authenticationLink = authenticationLink;
            return this;
        }

        /**
         * Builds the state.
         *
         * @return the state
         */
        public McpConnectionAuthState build() {
            return new McpConnectionAuthState(this);
        }
    }
}
