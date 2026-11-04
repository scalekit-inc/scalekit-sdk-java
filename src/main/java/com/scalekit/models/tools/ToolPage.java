package com.scalekit.models.tools;

import com.scalekit.internal.Preconditions;
import com.scalekit.models.Page;

import java.util.List;
import java.util.function.Function;

/**
 * One page of tools from {@link com.scalekit.api.ToolsClient#list}, plus the de-duplicated tool
 * names on the page.
 *
 * <p>When the request sets {@link ListToolsParams.Builder#summary(boolean) summary(true)}, the
 * server returns only names: {@link #items()} is empty, {@link #autoPager()} yields nothing, and
 * {@link #toolNames()} holds the result.
 *
 * @since 2.6.0
 */
public final class ToolPage extends Page<Tool> {

    private final List<String> toolNames;

    private ToolPage(Builder builder) {
        super(builder.items, builder.nextPageToken, builder.prevPageToken, builder.totalSize, builder.nextPageFetcher);
        this.toolNames = Preconditions.copyStrings(builder.toolNames, "toolNames");
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
     * Returns the de-duplicated names of the tools that matched, on this page.
     *
     * @return an unmodifiable list, never null
     */
    public List<String> toolNames() {
        return toolNames;
    }

    /**
     * Fetches the next page of tools with the same filters. Makes one request.
     *
     * @return the next page
     * @throws java.util.NoSuchElementException if {@link #hasNextPage()} is false
     * @throws com.scalekit.exceptions.APIException if the request fails
     */
    @Override
    public ToolPage nextPage() {
        return (ToolPage) super.nextPage();
    }

    /**
     * Builder for {@link ToolPage}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private List<Tool> items;
        private List<String> toolNames;
        private String nextPageToken;
        private String prevPageToken;
        private Long totalSize;
        private Function<String, ToolPage> nextPageFetcher;

        private Builder() {
        }

        /**
         * Sets the tools on the page.
         *
         * @param items the tools; null means none
         * @return this builder
         */
        public Builder items(List<Tool> items) {
            this.items = items;
            return this;
        }

        /**
         * Sets the tool names on the page.
         *
         * @param toolNames the names; null means none
         * @return this builder
         */
        public Builder toolNames(List<String> toolNames) {
            this.toolNames = toolNames;
            return this;
        }

        /**
         * Sets the token for the next page.
         *
         * @param nextPageToken the token; null or empty marks the last page
         * @return this builder
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * Sets the token for the previous page.
         *
         * @param prevPageToken the token; null or empty means none
         * @return this builder
         */
        public Builder prevPageToken(String prevPageToken) {
            this.prevPageToken = prevPageToken;
            return this;
        }

        /**
         * Sets the total number of tools across all pages.
         *
         * @param totalSize the total
         * @return this builder
         */
        public Builder totalSize(long totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        /**
         * Sets the function that fetches the page for a next-page token.
         *
         * @param nextPageFetcher the fetcher; null means no further pages can be fetched
         * @return this builder
         */
        public Builder nextPageFetcher(Function<String, ToolPage> nextPageFetcher) {
            this.nextPageFetcher = nextPageFetcher;
            return this;
        }

        /**
         * Builds the page.
         *
         * @return the page
         * @throws IllegalArgumentException if the items or names contain null
         */
        public ToolPage build() {
            return new ToolPage(this);
        }
    }
}
