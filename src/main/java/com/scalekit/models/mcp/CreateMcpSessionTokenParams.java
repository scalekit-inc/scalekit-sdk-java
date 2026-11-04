package com.scalekit.models.mcp;

import com.scalekit.internal.Preconditions;

import java.time.Duration;
import java.util.Optional;

/**
 * Optional settings for
 * {@link com.scalekit.api.McpClient#createSessionToken(String, String, CreateMcpSessionTokenParams)}.
 *
 * <pre>{@code
 * CreateMcpSessionTokenParams params = CreateMcpSessionTokenParams.builder()
 *         .expiry(Duration.ofMinutes(15))
 *         .build();
 * }</pre>
 *
 * <p>Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class CreateMcpSessionTokenParams {

    private final Duration expiry;

    private CreateMcpSessionTokenParams(Builder builder) {
        this.expiry = builder.expiry == null ? null : Preconditions.requirePositive(builder.expiry, "expiry");
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
        return new Builder().expiry(expiry);
    }

    /**
     * Returns how long the token stays valid.
     *
     * @return the lifetime, or empty for the server default (1 hour)
     */
    public Optional<Duration> expiry() {
        return Optional.ofNullable(expiry);
    }

    @Override
    public String toString() {
        return "CreateMcpSessionTokenParams{expiry=" + expiry + "}";
    }

    /**
     * Builder for {@link CreateMcpSessionTokenParams}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private Duration expiry;

        private Builder() {
        }

        /**
         * Sets how long the token stays valid. The server accepts 60 seconds to 24 hours.
         *
         * @param expiry a positive duration, or null for the server default (1 hour)
         * @return this builder
         */
        public Builder expiry(Duration expiry) {
            this.expiry = expiry;
            return this;
        }

        /**
         * Builds the parameters.
         *
         * @return the parameters
         * @throws IllegalArgumentException if the expiry is zero or negative
         */
        public CreateMcpSessionTokenParams build() {
            return new CreateMcpSessionTokenParams(this);
        }
    }
}
