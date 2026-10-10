package com.scalekit.models.connectedaccounts;

import com.scalekit.internal.Preconditions;
import com.scalekit.internal.Redaction;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * OAuth credentials of a connected account. Both tokens are secrets: {@link #toString()} never
 * prints them. Immutable and thread-safe.
 *
 * <p>An empty token ({@code OAuthToken.builder().build()}) creates an account that the user then
 * authorizes through {@link com.scalekit.api.ConnectedAccountsClient#getMagicLink}.
 *
 * @since 2.6.0
 */
public final class OAuthToken {

    private final String accessToken;
    private final String refreshToken;
    private final List<String> scopes;
    private final String domain;

    private OAuthToken(Builder builder) {
        this.accessToken = Preconditions.emptyToNull(builder.accessToken);
        this.refreshToken = Preconditions.emptyToNull(builder.refreshToken);
        this.scopes = Preconditions.copyStrings(builder.scopes, "scopes");
        this.domain = Preconditions.emptyToNull(builder.domain);
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
     * Returns a builder initialised with this token's values.
     *
     * @return the builder
     */
    public Builder toBuilder() {
        return new Builder().accessToken(accessToken).refreshToken(refreshToken).scopes(scopes).domain(domain);
    }

    /**
     * Returns the access token. A secret.
     *
     * @return the token, or empty
     */
    public Optional<String> accessToken() {
        return Optional.ofNullable(accessToken);
    }

    /**
     * Returns the refresh token. A secret.
     *
     * @return the token, or empty
     */
    public Optional<String> refreshToken() {
        return Optional.ofNullable(refreshToken);
    }

    /**
     * Returns the granted scopes.
     *
     * @return an unmodifiable list, never null
     */
    public List<String> scopes() {
        return scopes;
    }

    /**
     * Returns the domain the token is bound to, for providers that use one.
     *
     * @return the domain, or empty
     */
    public Optional<String> domain() {
        return Optional.ofNullable(domain);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OAuthToken)) {
            return false;
        }
        OAuthToken that = (OAuthToken) o;
        return Objects.equals(accessToken, that.accessToken) && Objects.equals(refreshToken, that.refreshToken)
                && scopes.equals(that.scopes) && Objects.equals(domain, that.domain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken, refreshToken, scopes, domain);
    }

    @Override
    public String toString() {
        return "OAuthToken{accessToken=" + Redaction.secret(accessToken) + ", refreshToken=" + Redaction.secret(refreshToken)
                + ", scopes=" + scopes + ", domain=" + domain + "}";
    }

    /**
     * Builder for {@link OAuthToken}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String accessToken;
        private String refreshToken;
        private List<String> scopes;
        private String domain;

        private Builder() {
        }

        /**
         * Sets the access token.
         *
         * @param accessToken the token
         * @return this builder
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Sets the refresh token.
         *
         * @param refreshToken the token
         * @return this builder
         */
        public Builder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * Sets the scopes.
         *
         * @param scopes the scopes; null means none
         * @return this builder
         */
        public Builder scopes(List<String> scopes) {
            this.scopes = scopes;
            return this;
        }

        /**
         * Sets the domain.
         *
         * @param domain the domain
         * @return this builder
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * Builds the token.
         *
         * @return the token
         * @throws IllegalArgumentException if the scopes contain null
         */
        public OAuthToken build() {
            return new OAuthToken(this);
        }
    }
}
