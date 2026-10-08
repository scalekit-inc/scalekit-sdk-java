package com.scalekit.models.connectedaccounts;

import com.scalekit.internal.JsonValues;
import com.scalekit.internal.Preconditions;

import java.time.Instant;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * A user's or tenant's account on a third-party service, connected through Scalekit.
 *
 * <p>{@link #authorizationDetails()} and {@link #apiConfig()} are present only on accounts
 * returned by get, create and update calls, and only when the server returns them; items of a
 * list are always without them. {@link #toString()} never prints credentials or API
 * configuration values. Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class ConnectedAccount {

    private final String id;
    private final String identifier;
    private final String provider;
    private final String connectionName;
    private final String connectionId;
    private final ConnectedAccountStatus status;
    private final AuthorizationType authorizationType;
    private final AuthorizationDetails authorizationDetails;
    private final Map<String, Object> apiConfig;
    private final Instant tokenExpiresAt;
    private final Instant updatedAt;
    private final Instant lastUsedAt;
    private final boolean orgWideCredential;

    private ConnectedAccount(Builder builder) {
        this.id = Preconditions.nullToEmpty(builder.id);
        this.identifier = Preconditions.nullToEmpty(builder.identifier);
        this.provider = Preconditions.nullToEmpty(builder.provider);
        this.connectionName = Preconditions.nullToEmpty(builder.connectionName);
        this.connectionId = Preconditions.nullToEmpty(builder.connectionId);
        this.status = builder.status == null ? ConnectedAccountStatus.of("") : builder.status;
        this.authorizationType = builder.authorizationType == null ? AuthorizationType.of("")
                : builder.authorizationType;
        this.authorizationDetails = builder.authorizationDetails;
        this.apiConfig = builder.apiConfig == null ? null : JsonValues.copyObject(builder.apiConfig, "apiConfig");
        this.tokenExpiresAt = builder.tokenExpiresAt;
        this.updatedAt = builder.updatedAt;
        this.lastUsedAt = builder.lastUsedAt;
        this.orgWideCredential = builder.orgWideCredential;
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
     * Returns a builder initialised with this account's values.
     *
     * @return the builder
     */
    public Builder toBuilder() {
        return new Builder().id(id).identifier(identifier).provider(provider).connectionName(connectionName)
                .connectionId(connectionId).status(status).authorizationType(authorizationType)
                .authorizationDetails(authorizationDetails).apiConfig(apiConfig).tokenExpiresAt(tokenExpiresAt)
                .updatedAt(updatedAt).lastUsedAt(lastUsedAt).orgWideCredential(orgWideCredential);
    }

    /**
     * Returns the account ID ({@code ca_...}).
     *
     * @return the ID, never null
     */
    public String id() {
        return id;
    }

    /**
     * Returns your identifier for the account's owner.
     *
     * @return the identifier, never null
     */
    public String identifier() {
        return identifier;
    }

    /**
     * Returns the provider, for example {@code GMAIL}.
     *
     * @return the provider, never null
     */
    public String provider() {
        return provider;
    }

    /**
     * Returns the name of the connection the account belongs to.
     *
     * @return the connection name, never null
     */
    public String connectionName() {
        return connectionName;
    }

    /**
     * Returns the ID of the connection the account belongs to.
     *
     * @return the connection ID, never null
     */
    public String connectionId() {
        return connectionId;
    }

    /**
     * Returns the account's status.
     *
     * @return the status, never null
     */
    public ConnectedAccountStatus status() {
        return status;
    }

    /**
     * Returns how the account authenticates upstream.
     *
     * @return the authorization type, never null
     */
    public AuthorizationType authorizationType() {
        return authorizationType;
    }

    /**
     * Returns the account's credentials.
     *
     * @return the credentials, or empty when the server did not return them (always empty on
     *         list items)
     */
    public Optional<AuthorizationDetails> authorizationDetails() {
        return Optional.ofNullable(authorizationDetails);
    }

    /**
     * Returns the account's API configuration, such as a custom base URL.
     *
     * @return an unmodifiable map, or empty when the server did not return it (always empty on
     *         list items)
     */
    public Optional<Map<String, Object>> apiConfig() {
        return Optional.ofNullable(apiConfig);
    }

    /**
     * Returns when the account's upstream token expires.
     *
     * @return the time, or empty
     */
    public Optional<Instant> tokenExpiresAt() {
        return Optional.ofNullable(tokenExpiresAt);
    }

    /**
     * Returns when the account was last updated.
     *
     * @return the time, or empty
     */
    public Optional<Instant> updatedAt() {
        return Optional.ofNullable(updatedAt);
    }

    /**
     * Returns when the account was last used to run a tool or proxy a request.
     *
     * @return the time, or empty
     */
    public Optional<Instant> lastUsedAt() {
        return Optional.ofNullable(lastUsedAt);
    }

    /**
     * Returns whether the account holds a credential shared by a whole organization.
     *
     * @return true for an organization-wide credential
     */
    public boolean isOrgWideCredential() {
        return orgWideCredential;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectedAccount)) {
            return false;
        }
        ConnectedAccount that = (ConnectedAccount) o;
        return orgWideCredential == that.orgWideCredential && id.equals(that.id)
                && identifier.equals(that.identifier) && provider.equals(that.provider)
                && connectionName.equals(that.connectionName) && connectionId.equals(that.connectionId)
                && status.equals(that.status) && authorizationType.equals(that.authorizationType)
                && Objects.equals(authorizationDetails, that.authorizationDetails)
                && Objects.equals(apiConfig, that.apiConfig) && Objects.equals(tokenExpiresAt, that.tokenExpiresAt)
                && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(lastUsedAt, that.lastUsedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, identifier, provider, connectionName, connectionId, status, authorizationType,
                authorizationDetails, apiConfig, tokenExpiresAt, updatedAt, lastUsedAt, orgWideCredential);
    }

    @Override
    public String toString() {
        return "ConnectedAccount{id=" + id + ", identifier=" + identifier + ", provider=" + provider
                + ", connectionName=" + connectionName + ", status=" + status
                + ", authorizationType=" + authorizationType + ", authorizationDetails=" + authorizationDetails
                + ", apiConfig=" + (apiConfig == null ? null : apiConfig.keySet())
                + ", orgWideCredential=" + orgWideCredential + "}";
    }

    /**
     * Builder for {@link ConnectedAccount}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String id;
        private String identifier;
        private String provider;
        private String connectionName;
        private String connectionId;
        private ConnectedAccountStatus status;
        private AuthorizationType authorizationType;
        private AuthorizationDetails authorizationDetails;
        private Map<String, ?> apiConfig;
        private Instant tokenExpiresAt;
        private Instant updatedAt;
        private Instant lastUsedAt;
        private boolean orgWideCredential;

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
         * Sets the identifier.
         *
         * @param identifier the identifier
         * @return this builder
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
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
         * Sets the connection name.
         *
         * @param connectionName the connection name
         * @return this builder
         */
        public Builder connectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        /**
         * Sets the connection ID.
         *
         * @param connectionId the connection ID
         * @return this builder
         */
        public Builder connectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Sets the status.
         *
         * @param status the status
         * @return this builder
         */
        public Builder status(ConnectedAccountStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Sets the authorization type.
         *
         * @param authorizationType the type
         * @return this builder
         */
        public Builder authorizationType(AuthorizationType authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }

        /**
         * Sets the credentials.
         *
         * @param authorizationDetails the credentials, or null
         * @return this builder
         */
        public Builder authorizationDetails(AuthorizationDetails authorizationDetails) {
            this.authorizationDetails = authorizationDetails;
            return this;
        }

        /**
         * Sets the API configuration.
         *
         * @param apiConfig JSON-compatible map, or null
         * @return this builder
         */
        public Builder apiConfig(Map<String, ?> apiConfig) {
            this.apiConfig = apiConfig;
            return this;
        }

        /**
         * Sets when the upstream token expires.
         *
         * @param tokenExpiresAt the time, or null
         * @return this builder
         */
        public Builder tokenExpiresAt(Instant tokenExpiresAt) {
            this.tokenExpiresAt = tokenExpiresAt;
            return this;
        }

        /**
         * Sets when the account was last updated.
         *
         * @param updatedAt the time, or null
         * @return this builder
         */
        public Builder updatedAt(Instant updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Sets when the account was last used.
         *
         * @param lastUsedAt the time, or null
         * @return this builder
         */
        public Builder lastUsedAt(Instant lastUsedAt) {
            this.lastUsedAt = lastUsedAt;
            return this;
        }

        /**
         * Sets whether the account holds an organization-wide credential.
         *
         * @param orgWideCredential the flag
         * @return this builder
         */
        public Builder orgWideCredential(boolean orgWideCredential) {
            this.orgWideCredential = orgWideCredential;
            return this;
        }

        /**
         * Builds the account.
         *
         * @return the account
         * @throws IllegalArgumentException if the API configuration is not JSON-compatible
         */
        public ConnectedAccount build() {
            return new ConnectedAccount(this);
        }
    }
}
