package com.scalekit.models.connectedaccounts;

import com.scalekit.internal.Preconditions;
import com.scalekit.internal.Redaction;

import java.time.Instant;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Google Workspace domain-wide delegation credentials of a connected account. To create an
 * account, set only the {@link #subject()} (the Workspace user to impersonate); Scalekit fills in
 * the token. The access token is a secret: {@link #toString()} never prints it.
 *
 * <pre>{@code
 * AuthorizationDetails details = AuthorizationDetails.googleDwd(
 *         GoogleDwdAuth.builder("admin@example.com").build());
 * }</pre>
 *
 * @since 2.6.0
 */
public final class GoogleDwdAuth {

    private final String subject;
    private final String accessToken;
    private final List<String> scopes;
    private final Instant tokenExpiresAt;

    private GoogleDwdAuth(Builder builder) {
        this.subject = Preconditions.nullToEmpty(builder.subject);
        this.accessToken = Preconditions.emptyToNull(builder.accessToken);
        this.scopes = Preconditions.copyStrings(builder.scopes, "scopes");
        this.tokenExpiresAt = builder.tokenExpiresAt;
    }

    /**
     * Returns a new builder.
     *
     * @param subject the email of the Workspace user to act as
     * @return the builder
     */
    public static Builder builder(String subject) {
        return new Builder(subject);
    }

    /**
     * Returns a builder initialised with these values.
     *
     * @return the builder
     */
    public Builder toBuilder() {
        return new Builder(subject).accessToken(accessToken).scopes(scopes).tokenExpiresAt(tokenExpiresAt);
    }

    /**
     * Returns the email of the Workspace user the account acts as.
     *
     * @return the subject, never null
     */
    public String subject() {
        return subject;
    }

    /**
     * Returns the current access token. A secret.
     *
     * @return the token, or empty
     */
    public Optional<String> accessToken() {
        return Optional.ofNullable(accessToken);
    }

    /**
     * Returns the delegated scopes.
     *
     * @return an unmodifiable list, never null
     */
    public List<String> scopes() {
        return scopes;
    }

    /**
     * Returns when the access token expires.
     *
     * @return the time, or empty
     */
    public Optional<Instant> tokenExpiresAt() {
        return Optional.ofNullable(tokenExpiresAt);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GoogleDwdAuth)) {
            return false;
        }
        GoogleDwdAuth that = (GoogleDwdAuth) o;
        return subject.equals(that.subject) && Objects.equals(accessToken, that.accessToken)
                && scopes.equals(that.scopes) && Objects.equals(tokenExpiresAt, that.tokenExpiresAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, accessToken, scopes, tokenExpiresAt);
    }

    @Override
    public String toString() {
        return "GoogleDwdAuth{subject=" + subject + ", accessToken=" + Redaction.secret(accessToken)
                + ", scopes=" + scopes + ", tokenExpiresAt=" + tokenExpiresAt + "}";
    }

    /**
     * Builder for {@link GoogleDwdAuth}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private final String subject;
        private String accessToken;
        private List<String> scopes;
        private Instant tokenExpiresAt;

        private Builder(String subject) {
            this.subject = subject;
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
         * Sets when the access token expires.
         *
         * @param tokenExpiresAt the time, or null
         * @return this builder
         */
        public Builder tokenExpiresAt(Instant tokenExpiresAt) {
            this.tokenExpiresAt = tokenExpiresAt;
            return this;
        }

        /**
         * Builds the credentials.
         *
         * @return the credentials
         * @throws IllegalArgumentException if the scopes contain null
         */
        public GoogleDwdAuth build() {
            return new GoogleDwdAuth(this);
        }
    }
}
