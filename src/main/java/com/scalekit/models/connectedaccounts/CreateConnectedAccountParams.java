package com.scalekit.models.connectedaccounts;

import com.scalekit.internal.JsonValues;

import java.util.Map;
import java.util.Optional;

/**
 * Credentials and API configuration for a new connected account, used by
 * {@link com.scalekit.api.ConnectedAccountsClient#create(String, String, CreateConnectedAccountParams)}
 * and {@link com.scalekit.api.ConnectedAccountsClient#getOrCreate(String, String, CreateConnectedAccountParams)}.
 *
 * <pre>{@code
 * CreateConnectedAccountParams params = CreateConnectedAccountParams.builder()
 *         .authorizationDetails(AuthorizationDetails.staticAuth(
 *                 Collections.singletonMap("api_key", System.getenv("VENDOR_API_KEY"))))
 *         .build();
 * }</pre>
 *
 * <p>{@link #toString()} never prints credentials or configuration values. Immutable and
 * thread-safe.
 *
 * @since 2.6.0
 */
public final class CreateConnectedAccountParams {

    private final AuthorizationDetails authorizationDetails;
    private final Map<String, Object> apiConfig;

    private CreateConnectedAccountParams(Builder builder) {
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
        return "CreateConnectedAccountParams{authorizationDetails=" + authorizationDetails
                + ", apiConfig=" + (apiConfig == null ? null : apiConfig.keySet()) + "}";
    }

    /**
     * Builder for {@link CreateConnectedAccountParams}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private AuthorizationDetails authorizationDetails;
        private Map<String, ?> apiConfig;

        private Builder() {
        }

        /**
         * Sets the account's credentials. OAuth accounts are usually created without a token and
         * authorized by the user through a magic link.
         *
         * @param authorizationDetails the credentials, or null
         * @return this builder
         */
        public Builder authorizationDetails(AuthorizationDetails authorizationDetails) {
            this.authorizationDetails = authorizationDetails;
            return this;
        }

        /**
         * Sets the account's API configuration, such as a custom base URL or domain.
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
        public CreateConnectedAccountParams build() {
            return new CreateConnectedAccountParams(this);
        }
    }
}
