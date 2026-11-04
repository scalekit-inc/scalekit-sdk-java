package com.scalekit.models.connections;

import com.scalekit.internal.Preconditions;

import java.time.Instant;
import java.util.Objects;
import java.util.Optional;

/**
 * An app connection: a connection your users' connected accounts belong to, as listed by
 * {@link com.scalekit.api.ConnectionClient#listAppConnections}. Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class AppConnection {

    private final String id;
    private final String connectionName;
    private final String provider;
    private final EnvironmentConnectionType type;
    private final EnvironmentConnectionStatus status;
    private final boolean enabled;
    private final Instant createdAt;
    private final EnvironmentConnectionAuthMode authMode;

    private AppConnection(Builder builder) {
        this.id = Preconditions.nullToEmpty(builder.id);
        this.connectionName = Preconditions.nullToEmpty(builder.connectionName);
        this.provider = Preconditions.nullToEmpty(builder.provider);
        this.type = builder.type == null ? EnvironmentConnectionType.of("") : builder.type;
        this.status = builder.status;
        this.enabled = builder.enabled;
        this.createdAt = builder.createdAt;
        this.authMode = builder.authMode;
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
    public String id() {
        return id;
    }

    /**
     * Returns the connection name, which connected accounts and tools refer to (for example
     * {@code "gmail"}).
     *
     * @return the name, never null
     */
    public String connectionName() {
        return connectionName;
    }

    /**
     * Returns the provider, for example {@code "GMAIL"}.
     *
     * @return the provider, never null
     */
    public String provider() {
        return provider;
    }

    /**
     * Returns how the connection authenticates.
     *
     * @return the type, never null
     */
    public EnvironmentConnectionType type() {
        return type;
    }

    /**
     * Returns how far the connection's configuration has progressed.
     *
     * @return the status, or empty when the server did not say
     */
    public Optional<EnvironmentConnectionStatus> status() {
        return Optional.ofNullable(status);
    }

    /**
     * Returns whether the connection is enabled.
     *
     * @return true when enabled
     */
    public boolean enabled() {
        return enabled;
    }

    /**
     * Returns when the connection was created.
     *
     * @return the time, or empty
     */
    public Optional<Instant> createdAt() {
        return Optional.ofNullable(createdAt);
    }

    /**
     * Returns whether each user connects their own account or one credential serves an
     * organization.
     *
     * @return the mode, or empty when the server did not say
     */
    public Optional<EnvironmentConnectionAuthMode> authMode() {
        return Optional.ofNullable(authMode);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppConnection)) {
            return false;
        }
        AppConnection that = (AppConnection) o;
        return enabled == that.enabled && id.equals(that.id) && connectionName.equals(that.connectionName)
                && provider.equals(that.provider) && type.equals(that.type) && Objects.equals(status, that.status)
                && Objects.equals(createdAt, that.createdAt) && Objects.equals(authMode, that.authMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, connectionName, provider, type, status, enabled, createdAt, authMode);
    }

    @Override
    public String toString() {
        return "AppConnection{id=" + id + ", connectionName=" + connectionName + ", provider=" + provider
                + ", type=" + type + ", status=" + status + ", enabled=" + enabled + ", authMode=" + authMode + "}";
    }

    /**
     * Builder for {@link AppConnection}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String id;
        private String connectionName;
        private String provider;
        private EnvironmentConnectionType type;
        private EnvironmentConnectionStatus status;
        private boolean enabled;
        private Instant createdAt;
        private EnvironmentConnectionAuthMode authMode;

        private Builder() {
        }

        /**
         * Sets the ID.
         *
         * @param id the ID
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
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
         * Sets the type.
         *
         * @param type the type
         * @return this builder
         */
        public Builder type(EnvironmentConnectionType type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the status.
         *
         * @param status the status, or null
         * @return this builder
         */
        public Builder status(EnvironmentConnectionStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Sets whether the connection is enabled.
         *
         * @param enabled the flag
         * @return this builder
         */
        public Builder enabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the creation time.
         *
         * @param createdAt the time, or null
         * @return this builder
         */
        public Builder createdAt(Instant createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Sets the auth mode.
         *
         * @param authMode the mode, or null
         * @return this builder
         */
        public Builder authMode(EnvironmentConnectionAuthMode authMode) {
            this.authMode = authMode;
            return this;
        }

        /**
         * Builds the connection.
         *
         * @return the connection
         */
        public AppConnection build() {
            return new AppConnection(this);
        }
    }
}
