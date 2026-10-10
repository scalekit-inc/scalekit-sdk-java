package com.scalekit.models.mcp;

import com.scalekit.internal.Preconditions;
import com.scalekit.internal.Redaction;

import java.time.Instant;
import java.util.Objects;
import java.util.Optional;

/**
 * A token that lets an agent call an MCP configuration's server on behalf of one user. The token
 * is a secret: {@link #toString()} never prints it. Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class McpSessionToken {

    private final String token;
    private final Instant expiresAt;

    private McpSessionToken(Builder builder) {
        this.token = Preconditions.nullToEmpty(builder.token);
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
     * Returns the token. Send it as a bearer token to the MCP server.
     *
     * @return the token, never null
     */
    public String token() {
        return token;
    }

    /**
     * Returns when the token expires.
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
        if (!(o instanceof McpSessionToken)) {
            return false;
        }
        McpSessionToken that = (McpSessionToken) o;
        return token.equals(that.token) && Objects.equals(expiresAt, that.expiresAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, expiresAt);
    }

    @Override
    public String toString() {
        return "McpSessionToken{token=" + Redaction.secret(token) + ", expiresAt=" + expiresAt + "}";
    }

    /**
     * Builder for {@link McpSessionToken}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String token;
        private Instant expiresAt;

        private Builder() {
        }

        /**
         * Sets the token.
         *
         * @param token the token
         * @return this builder
         */
        public Builder token(String token) {
            this.token = token;
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
         * Builds the token.
         *
         * @return the token
         */
        public McpSessionToken build() {
            return new McpSessionToken(this);
        }
    }
}
