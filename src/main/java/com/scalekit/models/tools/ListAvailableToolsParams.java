package com.scalekit.models.tools;

import com.scalekit.internal.Preconditions;

import java.time.Duration;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * Optional paging and deadline for
 * {@link com.scalekit.api.ToolsClient#listAvailable(String, ListAvailableToolsParams)}.
 *
 * <pre>{@code
 * ListAvailableToolsParams params = ListAvailableToolsParams.builder().pageSize(50).build();
 * }</pre>
 *
 * <p>Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class ListAvailableToolsParams {

    private final Integer pageSize;
    private final String pageToken;
    private final Duration timeout;

    private ListAvailableToolsParams(Builder builder) {
        this.pageSize = builder.pageSize;
        this.pageToken = Preconditions.emptyToNull(builder.pageToken);
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
        Builder builder = new Builder().pageToken(pageToken).timeout(timeout);
        builder.pageSize = pageSize;
        return builder;
    }

    /**
     * Returns the page size.
     *
     * @return the page size, or empty for the server default (100)
     */
    public OptionalInt pageSize() {
        return pageSize == null ? OptionalInt.empty() : OptionalInt.of(pageSize);
    }

    /**
     * Returns the page token.
     *
     * @return the token, or empty for the first page
     */
    public Optional<String> pageToken() {
        return Optional.ofNullable(pageToken);
    }

    /**
     * Returns the deadline for each request.
     *
     * @return the deadline; 60 seconds unless set
     */
    public Duration timeout() {
        return timeout;
    }

    @Override
    public String toString() {
        return "ListAvailableToolsParams{pageSize=" + pageSize + ", pageToken=" + pageToken + ", timeout=" + timeout + "}";
    }

    /**
     * Builder for {@link ListAvailableToolsParams}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private Integer pageSize;
        private String pageToken;
        private Duration timeout = ExecuteToolParams.DEFAULT_TIMEOUT;

        private Builder() {
        }

        /**
         * Sets the maximum number of tools on one page. This limits one page, not the total.
         *
         * @param pageSize the page size
         * @return this builder
         */
        public Builder pageSize(int pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Sets the token of the page to fetch.
         *
         * @param pageToken a token from {@link com.scalekit.models.Page#nextPageToken()}
         * @return this builder
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

        /**
         * Sets the deadline for each request, including the requests made by the auto-pager.
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
        public ListAvailableToolsParams build() {
            return new ListAvailableToolsParams(this);
        }
    }
}
