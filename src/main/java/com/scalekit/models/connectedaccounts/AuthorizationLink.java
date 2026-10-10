package com.scalekit.models.connectedaccounts;

import com.scalekit.internal.Preconditions;
import com.scalekit.internal.Redaction;

import java.time.Instant;
import java.util.Objects;
import java.util.Optional;

/**
 * A link that sends a user to authorize a connected account. The link grants access to the
 * authorization flow, so {@link #toString()} never prints it. Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class AuthorizationLink {

    private final String link;
    private final Instant expiresAt;

    private AuthorizationLink(Builder builder) {
        this.link = Preconditions.nullToEmpty(builder.link);
        this.expiresAt = builder.expiresAt;
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
     * Returns the link to send the user to.
     *
     * @return the link, never null
     */
    public String link() {
        return link;
    }

    /**
     * Returns when the link stops working.
     *
     * @return the time, or empty
     */
    public Optional<Instant> expiresAt() {
        return Optional.ofNullable(expiresAt);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthorizationLink)) {
            return false;
        }
        AuthorizationLink that = (AuthorizationLink) o;
        return link.equals(that.link) && Objects.equals(expiresAt, that.expiresAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(link, expiresAt);
    }

    @Override
    public String toString() {
        return "AuthorizationLink{link=" + Redaction.secret(link) + ", expiresAt=" + expiresAt + "}";
    }

    /**
     * Builder for {@link AuthorizationLink}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String link;
        private Instant expiresAt;

        private Builder() {
        }

        /**
         * Sets the link.
         *
         * @param link the link
         * @return this builder
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }

        /**
         * Sets the expiry.
         *
         * @param expiresAt the time, or null
         * @return this builder
         */
        public Builder expiresAt(Instant expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * Builds the link.
         *
         * @return the link
         */
        public AuthorizationLink build() {
            return new AuthorizationLink(this);
        }
    }
}
