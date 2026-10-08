package com.scalekit.models.connections;

import com.scalekit.internal.Preconditions;
import com.scalekit.internal.Redaction;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * The OAuth settings of an app connection: the OAuth client Scalekit uses when users authorize
 * their accounts. Used to update a connection and returned when reading one. The client secret
 * and the Google Ads developer token are secrets: {@link #toString()} never prints them, and the
 * server returns them masked. A masked value sent back in an update keeps the stored secret, so
 * settings read from a connection can be changed and sent back with {@link #toBuilder()}.
 * Immutable and thread-safe.
 *
 * <pre>{@code
 * OAuthConnectionSettings settings = OAuthConnectionSettings.builder()
 *         .clientId(System.getenv("GMAIL_CLIENT_ID"))
 *         .clientSecret(System.getenv("GMAIL_CLIENT_SECRET"))
 *         .scopes(Arrays.asList("https://www.googleapis.com/auth/gmail.readonly"))
 *         .build();
 * }</pre>
 *
 * @since 2.6.0
 */
public final class OAuthConnectionSettings {

    private final String clientId;
    private final String clientSecret;
    private final List<String> scopes;
    private final String authorizeUri;
    private final String tokenUri;
    private final String userInfoUri;
    private final String redirectUri;
    private final Boolean pkceEnabled;
    private final String prompt;
    private final String accessType;
    private final String tokenAccessType;
    private final Boolean usePlatformCreds;
    private final String customScopeName;
    private final String tenantId;
    private final String appName;
    private final String tokenEndpointAuthMethod;
    private final String googleadsDeveloperToken;

    private OAuthConnectionSettings(Builder builder) {
        this.clientId = Preconditions.emptyToNull(builder.clientId);
        this.clientSecret = Preconditions.emptyToNull(builder.clientSecret);
        this.scopes = Preconditions.copyStrings(builder.scopes, "scopes");
        this.authorizeUri = Preconditions.emptyToNull(builder.authorizeUri);
        this.tokenUri = Preconditions.emptyToNull(builder.tokenUri);
        this.userInfoUri = Preconditions.emptyToNull(builder.userInfoUri);
        this.redirectUri = Preconditions.emptyToNull(builder.redirectUri);
        this.pkceEnabled = builder.pkceEnabled;
        this.prompt = Preconditions.emptyToNull(builder.prompt);
        this.accessType = Preconditions.emptyToNull(builder.accessType);
        this.tokenAccessType = Preconditions.emptyToNull(builder.tokenAccessType);
        this.usePlatformCreds = builder.usePlatformCreds;
        this.customScopeName = Preconditions.emptyToNull(builder.customScopeName);
        this.tenantId = Preconditions.emptyToNull(builder.tenantId);
        this.appName = Preconditions.emptyToNull(builder.appName);
        this.tokenEndpointAuthMethod = Preconditions.emptyToNull(builder.tokenEndpointAuthMethod);
        this.googleadsDeveloperToken = Preconditions.emptyToNull(builder.googleadsDeveloperToken);
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
     * Returns a builder initialised with these settings.
     *
     * @return the builder
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.clientId = clientId;
        builder.clientSecret = clientSecret;
        builder.scopes = scopes;
        builder.authorizeUri = authorizeUri;
        builder.tokenUri = tokenUri;
        builder.userInfoUri = userInfoUri;
        builder.redirectUri = redirectUri;
        builder.pkceEnabled = pkceEnabled;
        builder.prompt = prompt;
        builder.accessType = accessType;
        builder.tokenAccessType = tokenAccessType;
        builder.usePlatformCreds = usePlatformCreds;
        builder.customScopeName = customScopeName;
        builder.tenantId = tenantId;
        builder.appName = appName;
        builder.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
        builder.googleadsDeveloperToken = googleadsDeveloperToken;
        return builder;
    }

    /**
     * Returns the OAuth client ID.
     *
     * @return the value, or empty when not set
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(clientId);
    }

    /**
     * Returns the OAuth client secret. A secret.
     *
     * <p>Read back from the server, the value is masked (a fixed prefix and the last four
     * characters). Sending a masked value back in an update keeps the stored secret.
     *
     * @return the value, or empty when not set
     */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(clientSecret);
    }

    /**
     * Returns the scopes requested from users.
     *
     * @return an unmodifiable list, never null
     */
    public List<String> scopes() {
        return scopes;
    }

    /**
     * Returns the authorization endpoint.
     *
     * @return the value, or empty when not set
     */
    public Optional<String> authorizeUri() {
        return Optional.ofNullable(authorizeUri);
    }

    /**
     * Returns the token endpoint.
     *
     * @return the value, or empty when not set
     */
    public Optional<String> tokenUri() {
        return Optional.ofNullable(tokenUri);
    }

    /**
     * Returns the user info endpoint.
     *
     * @return the value, or empty when not set
     */
    public Optional<String> userInfoUri() {
        return Optional.ofNullable(userInfoUri);
    }

    /**
     * Returns the redirect URI Scalekit uses (set by the server; ignored in updates).
     *
     * @return the value, or empty when not set
     */
    public Optional<String> redirectUri() {
        return Optional.ofNullable(redirectUri);
    }

    /**
     * Returns whether PKCE is used.
     *
     * @return the value, or empty when not set
     */
    public Optional<Boolean> pkceEnabled() {
        return Optional.ofNullable(pkceEnabled);
    }

    /**
     * Returns the {@code prompt} parameter sent to the authorization endpoint.
     *
     * @return the value, or empty when not set
     */
    public Optional<String> prompt() {
        return Optional.ofNullable(prompt);
    }

    /**
     * Returns the {@code access_type} parameter.
     *
     * @return the value, or empty when not set
     */
    public Optional<String> accessType() {
        return Optional.ofNullable(accessType);
    }

    /**
     * Returns the {@code token_access_type} parameter.
     *
     * @return the value, or empty when not set
     */
    public Optional<String> tokenAccessType() {
        return Optional.ofNullable(tokenAccessType);
    }

    /**
     * Returns whether Scalekit's own OAuth client is used instead of yours.
     *
     * @return the value, or empty when not set
     */
    public Optional<Boolean> usePlatformCreds() {
        return Optional.ofNullable(usePlatformCreds);
    }

    /**
     * Returns a custom name for the scope parameter.
     *
     * @return the value, or empty when not set
     */
    public Optional<String> customScopeName() {
        return Optional.ofNullable(customScopeName);
    }

    /**
     * Returns the tenant ID, for providers that need one.
     *
     * @return the value, or empty when not set
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(tenantId);
    }

    /**
     * Returns the app name shown to users.
     *
     * @return the value, or empty when not set
     */
    public Optional<String> appName() {
        return Optional.ofNullable(appName);
    }

    /**
     * Returns how the client authenticates to the token endpoint.
     *
     * @return the value, or empty when not set
     */
    public Optional<String> tokenEndpointAuthMethod() {
        return Optional.ofNullable(tokenEndpointAuthMethod);
    }

    /**
     * Returns the Google Ads developer token. A secret.
     *
     * <p>Read back from the server, the value is masked (a fixed prefix and the last four
     * characters). Sending a masked value back in an update keeps the stored secret.
     *
     * @return the value, or empty when not set
     */
    public Optional<String> googleadsDeveloperToken() {
        return Optional.ofNullable(googleadsDeveloperToken);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OAuthConnectionSettings)) {
            return false;
        }
        OAuthConnectionSettings that = (OAuthConnectionSettings) o;
        return Objects.equals(clientId, that.clientId)
                && Objects.equals(clientSecret, that.clientSecret)
                && scopes.equals(that.scopes)
                && Objects.equals(authorizeUri, that.authorizeUri)
                && Objects.equals(tokenUri, that.tokenUri)
                && Objects.equals(userInfoUri, that.userInfoUri)
                && Objects.equals(redirectUri, that.redirectUri)
                && Objects.equals(pkceEnabled, that.pkceEnabled)
                && Objects.equals(prompt, that.prompt)
                && Objects.equals(accessType, that.accessType)
                && Objects.equals(tokenAccessType, that.tokenAccessType)
                && Objects.equals(usePlatformCreds, that.usePlatformCreds)
                && Objects.equals(customScopeName, that.customScopeName)
                && Objects.equals(tenantId, that.tenantId)
                && Objects.equals(appName, that.appName)
                && Objects.equals(tokenEndpointAuthMethod, that.tokenEndpointAuthMethod)
                && Objects.equals(googleadsDeveloperToken, that.googleadsDeveloperToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, clientSecret, scopes, authorizeUri, tokenUri, userInfoUri, redirectUri, pkceEnabled, prompt, accessType, tokenAccessType, usePlatformCreds, customScopeName, tenantId, appName, tokenEndpointAuthMethod, googleadsDeveloperToken);
    }

    @Override
    public String toString() {
        return "OAuthConnectionSettings{clientId=" + clientId + ", clientSecret=" + Redaction.secret(clientSecret)
                + ", scopes=" + scopes + ", authorizeUri=" + authorizeUri + ", tokenUri=" + tokenUri
                + ", userInfoUri=" + userInfoUri + ", redirectUri=" + redirectUri + ", pkceEnabled=" + pkceEnabled
                + ", prompt=" + prompt + ", accessType=" + accessType + ", tokenAccessType=" + tokenAccessType
                + ", usePlatformCreds=" + usePlatformCreds + ", customScopeName=" + customScopeName
                + ", tenantId=" + tenantId + ", appName=" + appName + ", tokenEndpointAuthMethod=" + tokenEndpointAuthMethod
                + ", googleadsDeveloperToken=" + Redaction.secret(googleadsDeveloperToken) + "}";
    }

    /**
     * Builder for {@link OAuthConnectionSettings}. Fields left unset are not sent.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String clientId;
        private String clientSecret;
        private List<String> scopes;
        private String authorizeUri;
        private String tokenUri;
        private String userInfoUri;
        private String redirectUri;
        private Boolean pkceEnabled;
        private String prompt;
        private String accessType;
        private String tokenAccessType;
        private Boolean usePlatformCreds;
        private String customScopeName;
        private String tenantId;
        private String appName;
        private String tokenEndpointAuthMethod;
        private String googleadsDeveloperToken;

        private Builder() {
        }

        /**
         * Sets the OAuth client ID.
         *
         * @param clientId the value
         * @return this builder
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * Sets the OAuth client secret. A masked value read from the server keeps the stored
         * secret.
         *
         * @param clientSecret the value
         * @return this builder
         */
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * Sets the scopes requested from users.
         *
         * @param scopes the values; null means none
         * @return this builder
         */
        public Builder scopes(List<String> scopes) {
            this.scopes = scopes;
            return this;
        }

        /**
         * Sets the authorization endpoint.
         *
         * @param authorizeUri the value
         * @return this builder
         */
        public Builder authorizeUri(String authorizeUri) {
            this.authorizeUri = authorizeUri;
            return this;
        }

        /**
         * Sets the token endpoint.
         *
         * @param tokenUri the value
         * @return this builder
         */
        public Builder tokenUri(String tokenUri) {
            this.tokenUri = tokenUri;
            return this;
        }

        /**
         * Sets the user info endpoint.
         *
         * @param userInfoUri the value
         * @return this builder
         */
        public Builder userInfoUri(String userInfoUri) {
            this.userInfoUri = userInfoUri;
            return this;
        }

        /**
         * Sets the redirect URI Scalekit uses (set by the server; ignored in updates).
         *
         * @param redirectUri the value
         * @return this builder
         */
        public Builder redirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }

        /**
         * Sets whether PKCE is used.
         *
         * @param pkceEnabled the value
         * @return this builder
         */
        public Builder pkceEnabled(boolean pkceEnabled) {
            this.pkceEnabled = pkceEnabled;
            return this;
        }

        /**
         * Sets the {@code prompt} parameter sent to the authorization endpoint.
         *
         * @param prompt the value
         * @return this builder
         */
        public Builder prompt(String prompt) {
            this.prompt = prompt;
            return this;
        }

        /**
         * Sets the {@code access_type} parameter.
         *
         * @param accessType the value
         * @return this builder
         */
        public Builder accessType(String accessType) {
            this.accessType = accessType;
            return this;
        }

        /**
         * Sets the {@code token_access_type} parameter.
         *
         * @param tokenAccessType the value
         * @return this builder
         */
        public Builder tokenAccessType(String tokenAccessType) {
            this.tokenAccessType = tokenAccessType;
            return this;
        }

        /**
         * Sets whether Scalekit's own OAuth client is used instead of yours.
         *
         * @param usePlatformCreds the value
         * @return this builder
         */
        public Builder usePlatformCreds(boolean usePlatformCreds) {
            this.usePlatformCreds = usePlatformCreds;
            return this;
        }

        /**
         * Sets a custom name for the scope parameter.
         *
         * @param customScopeName the value
         * @return this builder
         */
        public Builder customScopeName(String customScopeName) {
            this.customScopeName = customScopeName;
            return this;
        }

        /**
         * Sets the tenant ID, for providers that need one.
         *
         * @param tenantId the value
         * @return this builder
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Sets the app name shown to users.
         *
         * @param appName the value
         * @return this builder
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * Sets how the client authenticates to the token endpoint.
         *
         * @param tokenEndpointAuthMethod the value
         * @return this builder
         */
        public Builder tokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
            this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
            return this;
        }

        /**
         * Sets the Google Ads developer token. A masked value read from the server keeps the
         * stored token.
         *
         * @param googleadsDeveloperToken the value
         * @return this builder
         */
        public Builder googleadsDeveloperToken(String googleadsDeveloperToken) {
            this.googleadsDeveloperToken = googleadsDeveloperToken;
            return this;
        }

        /**
         * Builds the settings.
         *
         * @return the settings
         * @throws IllegalArgumentException if a list contains null
         */
        public OAuthConnectionSettings build() {
            return new OAuthConnectionSettings(this);
        }
    }
}
