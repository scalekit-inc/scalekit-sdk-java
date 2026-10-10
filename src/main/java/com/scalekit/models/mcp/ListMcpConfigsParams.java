package com.scalekit.models.mcp;

import com.scalekit.internal.Preconditions;

import java.util.Optional;
import java.util.OptionalInt;

/**
 * Optional search and paging for {@link com.scalekit.api.McpClient#listConfigs(ListMcpConfigsParams)}.
 *
 * <pre>{@code
 * ListMcpConfigsParams params = ListMcpConfigsParams.builder().search("support").pageSize(10).build();
 * }</pre>
 *
 * <p>Empty strings are treated as unset. Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class ListMcpConfigsParams {

    private final String search;
    private final Integer pageSize;
    private final String pageToken;

    private ListMcpConfigsParams(Builder builder) {
        this.search = Preconditions.emptyToNull(builder.search);
        this.pageSize = builder.pageSize;
        this.pageToken = Preconditions.emptyToNull(builder.pageToken);
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
        Builder builder = new Builder().search(search).pageToken(pageToken);
        builder.pageSize = pageSize;
        return builder;
    }

    /**
     * Returns the search text.
     *
     * @return the text, or empty
     */
    public Optional<String> search() {
        return Optional.ofNullable(search);
    }

    /**
     * Returns the page size.
     *
     * @return the page size, or empty for the server default (30)
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

    @Override
    public String toString() {
        return "ListMcpConfigsParams{search=" + search + ", pageSize=" + pageSize + ", pageToken=" + pageToken + "}";
    }

    /**
     * Builder for {@link ListMcpConfigsParams}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String search;
        private Integer pageSize;
        private String pageToken;

        private Builder() {
        }

        /**
         * Searches configurations by name (at least 3 characters).
         *
         * @param search the search text
         * @return this builder
         */
        public Builder search(String search) {
            this.search = search;
            return this;
        }

        /**
         * Sets the maximum number of configurations on one page (the server allows up to 30). This
         * limits one page, not the total.
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
         * Builds the parameters.
         *
         * @return the parameters
         */
        public ListMcpConfigsParams build() {
            return new ListMcpConfigsParams(this);
        }
    }
}
