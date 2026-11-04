package com.scalekit.models.connectedaccounts;

import com.scalekit.internal.Preconditions;
import com.scalekit.internal.Redaction;

import java.time.Instant;
import java.util.Objects;
import java.util.Optional;

/**
 * Credentials issued through a trusted identity provider. To create an account, set only the
 * {@link #dbUser()}; Scalekit fills in the rest. The secret access key and session token are
 * secrets: {@link #toString()} never prints them.
 *
 * @since 2.6.0
 */
public final class TrustedIdpAuth {

    private final String dbUser;
    private final String accessKeyId;
    private final String secretAccessKey;
    private final String sessionToken;
    private final Instant expiry;

    private TrustedIdpAuth(Builder builder) {
        this.dbUser = Preconditions.nullToEmpty(builder.dbUser);
        this.accessKeyId = Preconditions.emptyToNull(builder.accessKeyId);
        this.secretAccessKey = Preconditions.emptyToNull(builder.secretAccessKey);
        this.sessionToken = Preconditions.emptyToNull(builder.sessionToken);
        this.expiry = builder.expiry;
    }

    /**
     * Returns a new builder.
     *
     * @param dbUser the database user the credentials are for
     * @return the builder
     */
    public static Builder builder(String dbUser) {
        return new Builder(dbUser);
    }

    /**
     * Returns a builder initialised with these values.
     *
     * @return the builder
     */
    public Builder toBuilder() {
        return new Builder(dbUser).accessKeyId(accessKeyId).secretAccessKey(secretAccessKey)
                .sessionToken(sessionToken).expiry(expiry);
    }

    /**
     * Returns the database user.
     *
     * @return the user, never null
     */
    public String dbUser() {
        return dbUser;
    }

    /**
     * Returns the access key ID.
     *
     * @return the ID, or empty
     */
    public Optional<String> accessKeyId() {
        return Optional.ofNullable(accessKeyId);
    }

    /**
     * Returns the secret access key. A secret.
     *
     * @return the key, or empty
     */
    public Optional<String> secretAccessKey() {
        return Optional.ofNullable(secretAccessKey);
    }

    /**
     * Returns the session token. A secret.
     *
     * @return the token, or empty
     */
    public Optional<String> sessionToken() {
        return Optional.ofNullable(sessionToken);
    }

    /**
     * Returns when the credentials expire.
     *
     * @return the time, or empty
     */
    public Optional<Instant> expiry() {
        return Optional.ofNullable(expiry);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TrustedIdpAuth)) {
            return false;
        }
        TrustedIdpAuth that = (TrustedIdpAuth) o;
        return dbUser.equals(that.dbUser) && Objects.equals(accessKeyId, that.accessKeyId)
                && Objects.equals(secretAccessKey, that.secretAccessKey)
                && Objects.equals(sessionToken, that.sessionToken) && Objects.equals(expiry, that.expiry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbUser, accessKeyId, secretAccessKey, sessionToken, expiry);
    }

    @Override
    public String toString() {
        return "TrustedIdpAuth{dbUser=" + dbUser + ", accessKeyId=" + accessKeyId
                + ", secretAccessKey=" + Redaction.secret(secretAccessKey)
                + ", sessionToken=" + Redaction.secret(sessionToken) + ", expiry=" + expiry + "}";
    }

    /**
     * Builder for {@link TrustedIdpAuth}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private final String dbUser;
        private String accessKeyId;
        private String secretAccessKey;
        private String sessionToken;
        private Instant expiry;

        private Builder(String dbUser) {
            this.dbUser = dbUser;
        }

        /**
         * Sets the access key ID.
         *
         * @param accessKeyId the ID
         * @return this builder
         */
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * Sets the secret access key.
         *
         * @param secretAccessKey the key
         * @return this builder
         */
        public Builder secretAccessKey(String secretAccessKey) {
            this.secretAccessKey = secretAccessKey;
            return this;
        }

        /**
         * Sets the session token.
         *
         * @param sessionToken the token
         * @return this builder
         */
        public Builder sessionToken(String sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }

        /**
         * Sets the expiry.
         *
         * @param expiry the time, or null
         * @return this builder
         */
        public Builder expiry(Instant expiry) {
            this.expiry = expiry;
            return this;
        }

        /**
         * Builds the credentials.
         *
         * @return the credentials
         */
        public TrustedIdpAuth build() {
            return new TrustedIdpAuth(this);
        }
    }
}
