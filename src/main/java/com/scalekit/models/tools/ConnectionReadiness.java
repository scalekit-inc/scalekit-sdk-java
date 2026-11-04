package com.scalekit.models.tools;

import com.scalekit.internal.Preconditions;

import java.util.Objects;
import java.util.Optional;

/**
 * Whether a searched tool can run for the searched identifier through one of its connections.
 * Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class ConnectionReadiness {

    private final String connectionName;
    private final String connectedAccountId;
    private final ToolReadinessState readinessState;

    private ConnectionReadiness(Builder builder) {
        this.connectionName = Preconditions.nullToEmpty(builder.connectionName);
        this.connectedAccountId = Preconditions.emptyToNull(builder.connectedAccountId);
        this.readinessState = builder.readinessState == null ? ToolReadinessState.NOT_EVALUATED : builder.readinessState;
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
     * Returns the connection name.
     *
     * @return the name, never null
     */
    public String connectionName() {
        return connectionName;
    }

    /**
     * Returns the identifier's connected account on this connection.
     *
     * @return the account ID, or empty when there is none
     */
    public Optional<String> connectedAccountId() {
        return Optional.ofNullable(connectedAccountId);
    }

    /**
     * Returns whether the tool can run through this connection.
     *
     * @return the state, never null
     */
    public ToolReadinessState readinessState() {
        return readinessState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectionReadiness)) {
            return false;
        }
        ConnectionReadiness that = (ConnectionReadiness) o;
        return connectionName.equals(that.connectionName) && Objects.equals(connectedAccountId, that.connectedAccountId)
                && readinessState.equals(that.readinessState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionName, connectedAccountId, readinessState);
    }

    @Override
    public String toString() {
        return "ConnectionReadiness{connectionName=" + connectionName + ", connectedAccountId=" + connectedAccountId
                + ", readinessState=" + readinessState + "}";
    }

    /**
     * Builder for {@link ConnectionReadiness}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String connectionName;
        private String connectedAccountId;
        private ToolReadinessState readinessState;

        private Builder() {
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
         * Sets the readiness state.
         *
         * @param readinessState the state; null means {@link ToolReadinessState#NOT_EVALUATED}
         * @return this builder
         */
        public Builder readinessState(ToolReadinessState readinessState) {
            this.readinessState = readinessState;
            return this;
        }

        /**
         * Builds the readiness.
         *
         * @return the readiness
         */
        public ConnectionReadiness build() {
            return new ConnectionReadiness(this);
        }
    }
}
