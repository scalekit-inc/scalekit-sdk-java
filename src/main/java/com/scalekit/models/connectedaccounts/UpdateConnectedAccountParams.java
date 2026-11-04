package com.scalekit.models.connectedaccounts;

import com.scalekit.internal.JsonValues;

import java.util.Map;
import java.util.Optional;

/**
 * New credentials and API configuration for
 * {@link com.scalekit.api.ConnectedAccountsClient#update(ConnectedAccountRef, UpdateConnectedAccountParams)}.
 *
 * <p>The server replaces the stored credentials with the ones given here and merges the API
 * configuration into the stored one. {@link #toString()} never prints credentials or
 * configuration values. Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class UpdateConnectedAccountParams {

    private final AuthorizationDetails authorizationDetails;
    private final Map<String, Object> apiConfig;

    private UpdateConnectedAccountParams(Builder builder) {
        this.authorizationDetails = builder.authorizationDetails;
        this.apiConfig = builder.apiConfig == null ? null : JsonValues.copyObject(builder.apiConfig, "apiConfig");
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
     * Returns a builder initialised with these parameters.
     *
     * @return the builder
     */
    public Builder toBuilder() {
        return new Builder().authorizationDetails(authorizationDetails).apiConfig(apiConfig);
    }

    /**
     * Returns the credentials.
     *
     * @return the credentials, or empty
     */
    public Optional<AuthorizationDetails> authorizationDetails() {
        return Optional.ofNullable(authorizationDetails);
    }

    /**
     * Returns the API configuration.
     *
     * @return an unmodifiable map, or empty
     */
    public Optional<Map<String, Object>> apiConfig() {
        return Optional.ofNullable(apiConfig);
    }

    @Override
    public String toString() {
        return "UpdateConnectedAccountParams{authorizationDetails=" + authorizationDetails
                + ", apiConfig=" + (apiConfig == null ? null : apiConfig.keySet()) + "}";
    }

    /**
     * Builder for {@link UpdateConnectedAccountParams}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private AuthorizationDetails authorizationDetails;
        private Map<String, ?> apiConfig;

        private Builder() {
        }

        /**
         * Sets the new credentials.
         *
         * @param authorizationDetails the credentials, or null
         * @return this builder
         */
        public Builder authorizationDetails(AuthorizationDetails authorizationDetails) {
            this.authorizationDetails = authorizationDetails;
            return this;
        }

        /**
         * Sets API configuration to merge into the stored configuration.
         *
         * @param apiConfig JSON-compatible map, or null
         * @return this builder
         */
        public Builder apiConfig(Map<String, ?> apiConfig) {
            this.apiConfig = apiConfig;
            return this;
        }

        /**
         * Builds the parameters.
         *
         * @return the parameters
         * @throws IllegalArgumentException if the API configuration is not JSON-compatible
         */
        public UpdateConnectedAccountParams build() {
            return new UpdateConnectedAccountParams(this);
        }
    }
}
