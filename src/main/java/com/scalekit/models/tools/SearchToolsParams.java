package com.scalekit.models.tools;

import com.scalekit.internal.Preconditions;

import java.time.Duration;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * Optional settings for {@link com.scalekit.api.ToolsClient#search(String, SearchToolsParams)}.
 *
 * <pre>{@code
 * SearchToolsParams params = SearchToolsParams.builder().identifier("user_123").topK(5).build();
 * }</pre>
 *
 * <p>Blank strings are treated as unset. Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class SearchToolsParams {

    private final String identifier;
    private final Integer topK;
    private final Duration timeout;

    private SearchToolsParams(Builder builder) {
        this.identifier = Preconditions.trimToNull(builder.identifier);
        this.topK = builder.topK;
        this.timeout = Preconditions.requirePositive(builder.timeout, "timeout");
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
        Builder builder = new Builder().identifier(identifier).timeout(timeout);
        builder.topK = topK;
        return builder;
    }

    /**
     * Returns the identifier whose accounts the results are checked against.
     *
     * @return the identifier, or empty
     */
    public Optional<String> identifier() {
        return Optional.ofNullable(identifier);
    }

    /**
     * Returns the maximum number of results.
     *
     * @return the limit, or empty for the server default (10)
     */
    public OptionalInt topK() {
        return topK == null ? OptionalInt.empty() : OptionalInt.of(topK);
    }

    /**
     * Returns the deadline for the call.
     *
     * @return the deadline; {@link ExecuteToolParams#DEFAULT_TIMEOUT} unless set
     */
    public Duration timeout() {
        return timeout;
    }

    @Override
    public String toString() {
        return "SearchToolsParams{identifier=" + identifier + ", topK=" + topK + ", timeout=" + timeout + "}";
    }

    /**
     * Builder for {@link SearchToolsParams}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String identifier;
        private Integer topK;
        private Duration timeout = ExecuteToolParams.DEFAULT_TIMEOUT;

        private Builder() {
        }

        /**
         * Checks each result against this identifier's accounts: results then list, per connection,
         * whether the tool can run, and include the identifier's custom MCP tools.
         *
         * @param identifier the identifier
         * @return this builder
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * Sets the maximum number of results. The server defaults to 10 and caps at 50.
         *
         * @param topK the limit
         * @return this builder
         */
        public Builder topK(int topK) {
            this.topK = topK;
            return this;
        }

        /**
         * Sets the deadline for the call.
         *
         * @param timeout a positive duration; defaults to 60 seconds
         * @return this builder
         */
        public Builder timeout(Duration timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * Builds the parameters.
         *
         * @return the parameters
         * @throws IllegalArgumentException if the timeout is not positive
         */
        public SearchToolsParams build() {
            return new SearchToolsParams(this);
        }
    }
}
