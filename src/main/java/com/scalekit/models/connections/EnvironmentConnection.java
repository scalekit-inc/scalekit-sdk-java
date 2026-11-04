package com.scalekit.models.connections;

import com.scalekit.internal.JsonValues;
import com.scalekit.internal.Preconditions;
import com.scalekit.internal.Redaction;

import java.time.Instant;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * An environment connection, as returned by
 * {@link com.scalekit.api.ConnectionClient#getEnvironmentConnection},
 * {@link com.scalekit.api.ConnectionClient#createEnvironmentConnection} and
 * {@link com.scalekit.api.ConnectionClient#updateEnvironmentConnection}.
 *
 * <p>Only the settings app connections use are modelled: OAuth, static credentials and Google
 * domain-wide delegation. Settings are never printed by {@link #toString()}. Immutable and
 * thread-safe.
 *
 * @since 2.6.0
 */
public final class EnvironmentConnection {

    private final String id;
    private final String connectionName;
    private final String providerKey;
    private final EnvironmentConnectionType type;
    private final EnvironmentConnectionStatus status;
    private final boolean enabled;
    private final EnvironmentConnectionAuthMode authMode;
    private final Instant createdAt;
    private final Instant updatedAt;
    private final String mcpServerUrl;
    private final String resolvedProxyUrl;
    private final OAuthConnectionSettings oauthSettings;
    private final Map<String, Object> staticSettings;
    private final GoogleDwdConnectionSettings googleDwdSettings;

    private EnvironmentConnection(Builder builder) {
        this.id = Preconditions.nullToEmpty(builder.id);
        this.connectionName = Preconditions.emptyToNull(builder.connectionName);
        this.providerKey = Preconditions.nullToEmpty(builder.providerKey);
        this.type = builder.type == null ? EnvironmentConnectionType.of("") : builder.type;
        this.status = builder.status;
        this.enabled = builder.enabled;
        this.authMode = builder.authMode;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
        this.mcpServerUrl = Preconditions.emptyToNull(builder.mcpServerUrl);
        this.resolvedProxyUrl = Preconditions.emptyToNull(builder.resolvedProxyUrl);
        this.oauthSettings = builder.oauthSettings;
        this.staticSettings = builder.staticSettings == null ? null
                : JsonValues.copyObject(builder.staticSettings, "staticSettings");
        this.googleDwdSettings = builder.googleDwdSettings;
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
     * Returns the connection name, which connected accounts and tools refer to.
     *
     * @return the name, or empty when the connection has none
     */
    public Optional<String> connectionName() {
        return Optional.ofNullable(connectionName);
    }

    /**
     * Returns the provider key, for example {@code "GMAIL"}.
     *
     * @return the key, never null
     */
    public String providerKey() {
        return providerKey;
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
     * Returns whether each user connects their own account or one credential serves an
     * organization.
     *
     * @return the mode, or empty when the server did not say
     */
    public Optional<EnvironmentConnectionAuthMode> authMode() {
        return Optional.ofNullable(authMode);
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
     * Returns when the connection was last updated.
     *
     * @return the time, or empty
     */
    public Optional<Instant> updatedAt() {
        return Optional.ofNullable(updatedAt);
    }

    /**
     * Returns the URL of the connection's MCP server.
     *
     * @return the URL, or empty when your environment does not expose one
     */
    public Optional<String> mcpServerUrl() {
        return Optional.ofNullable(mcpServerUrl);
    }

    /**
     * Returns the upstream base URL that proxied requests for this connection go to.
     *
     * @return the URL, or empty
     */
    public Optional<String> resolvedProxyUrl() {
        return Optional.ofNullable(resolvedProxyUrl);
    }

    /**
     * Returns the OAuth settings.
     *
     * @return the settings, or empty when the connection has settings of another kind or none
     */
    public Optional<OAuthConnectionSettings> oauthSettings() {
        return Optional.ofNullable(oauthSettings);
    }

    /**
     * Returns the static credential settings. The values may be secrets.
     *
     * @return an unmodifiable map, or empty when the connection has settings of another kind or none
     */
    public Optional<Map<String, Object>> staticSettings() {
        return Optional.ofNullable(staticSettings);
    }

    /**
     * Returns the Google domain-wide delegation settings.
     *
     * @return the settings, or empty when the connection has settings of another kind or none
     */
    public Optional<GoogleDwdConnectionSettings> googleDwdSettings() {
        return Optional.ofNullable(googleDwdSettings);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnvironmentConnection)) {
            return false;
        }
        EnvironmentConnection that = (EnvironmentConnection) o;
        return enabled == that.enabled && id.equals(that.id) && Objects.equals(connectionName, that.connectionName)
                && providerKey.equals(that.providerKey) && type.equals(that.type) && Objects.equals(status, that.status)
                && Objects.equals(authMode, that.authMode) && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(mcpServerUrl, that.mcpServerUrl)
                && Objects.equals(resolvedProxyUrl, that.resolvedProxyUrl)
                && Objects.equals(oauthSettings, that.oauthSettings) && Objects.equals(staticSettings, that.staticSettings)
                && Objects.equals(googleDwdSettings, that.googleDwdSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, connectionName, providerKey, type, status, enabled, authMode, createdAt, updatedAt,
                mcpServerUrl, resolvedProxyUrl, oauthSettings, staticSettings, googleDwdSettings);
    }

    @Override
    public String toString() {
        String settings = oauthSettings != null ? "oauth" : staticSettings != null ? "static"
                : googleDwdSettings != null ? "googleDwd" : "none";
        return "EnvironmentConnection{id=" + id + ", connectionName=" + connectionName + ", providerKey=" + providerKey
                + ", type=" + type + ", status=" + status + ", enabled=" + enabled + ", authMode=" + authMode
                + ", settings=" + settings + (settings.equals("none") ? "" : "(" + Redaction.REDACTED + ")") + "}";
    }

    /**
     * Builder for {@link EnvironmentConnection}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String id;
        private String connectionName;
        private String providerKey;
        private EnvironmentConnectionType type;
        private EnvironmentConnectionStatus status;
        private boolean enabled;
        private EnvironmentConnectionAuthMode authMode;
        private Instant createdAt;
        private Instant updatedAt;
        private String mcpServerUrl;
        private String resolvedProxyUrl;
        private OAuthConnectionSettings oauthSettings;
        private Map<String, ?> staticSettings;
        private GoogleDwdConnectionSettings googleDwdSettings;

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
         * @param connectionName the name, or null
         * @return this builder
         */
        public Builder connectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        /**
         * Sets the provider key.
         *
         * @param providerKey the key
         * @return this builder
         */
        public Builder providerKey(String providerKey) {
            this.providerKey = providerKey;
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
         * Sets the update time.
         *
         * @param updatedAt the time, or null
         * @return this builder
         */
        public Builder updatedAt(Instant updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Sets the MCP server URL.
         *
         * @param mcpServerUrl the URL, or null
         * @return this builder
         */
        public Builder mcpServerUrl(String mcpServerUrl) {
            this.mcpServerUrl = mcpServerUrl;
            return this;
        }

        /**
         * Sets the resolved proxy URL.
         *
         * @param resolvedProxyUrl the URL, or null
         * @return this builder
         */
        public Builder resolvedProxyUrl(String resolvedProxyUrl) {
            this.resolvedProxyUrl = resolvedProxyUrl;
            return this;
        }

        /**
         * Sets the OAuth settings.
         *
         * @param oauthSettings the settings, or null
         * @return this builder
         */
        public Builder oauthSettings(OAuthConnectionSettings oauthSettings) {
            this.oauthSettings = oauthSettings;
            return this;
        }

        /**
         * Sets the static credential settings.
         *
         * @param staticSettings JSON-compatible map, or null
         * @return this builder
         */
        public Builder staticSettings(Map<String, ?> staticSettings) {
            this.staticSettings = staticSettings;
            return this;
        }

        /**
         * Sets the Google domain-wide delegation settings.
         *
         * @param googleDwdSettings the settings, or null
         * @return this builder
         */
        public Builder googleDwdSettings(GoogleDwdConnectionSettings googleDwdSettings) {
            this.googleDwdSettings = googleDwdSettings;
            return this;
        }

        /**
         * Builds the connection.
         *
         * @return the connection
         * @throws IllegalArgumentException if the static settings are not JSON-compatible
         */
        public EnvironmentConnection build() {
            return new EnvironmentConnection(this);
        }
    }
}
