package com.scalekit.models;

import com.scalekit.internal.Preconditions;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Function;

/**
 * One page of results from a list call, with access to the pages that follow.
 *
 * <p>A list call makes one request and returns its page. {@code pageSize} in the request
 * parameters limits the size of one page, not the total number of items. Call
 * {@link #nextPage()} to fetch the next page, or iterate {@link #autoPager()} to walk every item
 * across pages, fetching each page only when iteration reaches it.
 *
 * <pre>{@code
 * for (ConnectedAccount account : client.connectedAccounts().list(params).autoPager()) {
 *     System.out.println(account.id());
 * }
 * }</pre>
 *
 * <p>Instances are immutable and thread-safe. The class is not designed for extension outside
 * the SDK; use {@code new Page.Builder<T>()} to create one, for example in a test double.
 *
 * @param <T> the item type
 * @since 2.6.0
 */
public class Page<T> {

    private final List<T> items;
    private final String nextPageToken;
    private final String prevPageToken;
    private final Long totalSize;
    private final Function<String, ? extends Page<T>> nextPageFetcher;

    /**
     * Creates a page. Intended for SDK subclasses; use {@link Builder} instead.
     *
     * @param items           the items on this page; null means none
     * @param nextPageToken   the token for the next page; null or empty means this is the last page
     * @param prevPageToken   the token for the previous page; null or empty means none
     * @param totalSize       the total number of items across all pages, or null when unknown
     * @param nextPageFetcher fetches the page for a token; null means no further pages can be fetched
     * @throws IllegalArgumentException if {@code items} contains null
     */
    protected Page(List<T> items, String nextPageToken, String prevPageToken, Long totalSize,
                   Function<String, ? extends Page<T>> nextPageFetcher) {
        this.items = Preconditions.copyList(items, "items");
        this.nextPageToken = Preconditions.emptyToNull(nextPageToken);
        this.prevPageToken = Preconditions.emptyToNull(prevPageToken);
        this.totalSize = totalSize;
        this.nextPageFetcher = nextPageFetcher;
    }

    /**
     * Returns the items on this page.
     *
     * @return an unmodifiable list, never null
     */
    public List<T> items() {
        return items;
    }

    /**
     * Returns the token that fetches the next page.
     *
     * @return the token, or empty when this is the last page
     */
    public Optional<String> nextPageToken() {
        return Optional.ofNullable(nextPageToken);
    }

    /**
     * Returns the token that fetches the previous page.
     *
     * @return the token, or empty when there is none
     */
    public Optional<String> prevPageToken() {
        return Optional.ofNullable(prevPageToken);
    }

    /**
     * Returns the total number of items across all pages, when the server reports it.
     *
     * @return the total, or empty when unknown
     */
    public OptionalLong totalSize() {
        return totalSize == null ? OptionalLong.empty() : OptionalLong.of(totalSize);
    }

    /**
     * Returns whether another page follows this one.
     *
     * @return true when {@link #nextPage()} can be called
     */
    public boolean hasNextPage() {
        return nextPageToken != null && nextPageFetcher != null;
    }

    /**
     * Fetches the next page with the same filters. Makes one request.
     *
     * @return the next page
     * @throws NoSuchElementException if {@link #hasNextPage()} is false
     * @throws com.scalekit.exceptions.APIException if the request fails
     */
    public Page<T> nextPage() {
        if (!hasNextPage()) {
            throw new NoSuchElementException("this is the last page");
        }
        Page<T> next = nextPageFetcher.apply(nextPageToken);
        if (next == null) {
            throw new IllegalStateException("next page fetcher returned null");
        }
        return next;
    }

    /**
     * Returns an iterable over every item on this page and the pages that follow. Pages are
     * fetched lazily, one request at a time, only when iteration needs them. Iteration stops when
     * a page has no next-page token. Each call to {@code iterator()} starts again from this page.
     *
     * @return the auto-pager
     */
    public AutoPager<T> autoPager() {
        return new AutoPager<>(this);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{items=" + items.size()
                + ", nextPageToken=" + nextPageToken + ", totalSize=" + totalSize + "}";
    }

    /**
     * Builder for {@link Page}. (A page has no static {@code builder()} factory, because
     * {@code ToolPage.builder()} would hide it.)
     *
     * <pre>{@code
     * Page<ConnectedAccount> page = new Page.Builder<ConnectedAccount>().items(accounts).build();
     * }</pre>
     *
     * @param <T> the item type
     * @since 2.6.0
     */
    public static final class Builder<T> {
        private List<T> items;
        private String nextPageToken;
        private String prevPageToken;
        private Long totalSize;
        private Function<String, ? extends Page<T>> nextPageFetcher;

        /** Creates an empty builder. */
        public Builder() {
        }

        /**
         * Sets the items on the page.
         *
         * @param items the items; null means none
         * @return this builder
         */
        public Builder<T> items(List<T> items) {
            this.items = items;
            return this;
        }

        /**
         * Sets the token for the next page.
         *
         * @param nextPageToken the token; null or empty marks the last page
         * @return this builder
         */
        public Builder<T> nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * Sets the token for the previous page.
         *
         * @param prevPageToken the token; null or empty means none
         * @return this builder
         */
        public Builder<T> prevPageToken(String prevPageToken) {
            this.prevPageToken = prevPageToken;
            return this;
        }

        /**
         * Sets the total number of items across all pages.
         *
         * @param totalSize the total
         * @return this builder
         */
        public Builder<T> totalSize(long totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        /**
         * Sets the function that fetches the page for a next-page token.
         *
         * @param nextPageFetcher the fetcher; null means no further pages can be fetched
         * @return this builder
         */
        public Builder<T> nextPageFetcher(Function<String, ? extends Page<T>> nextPageFetcher) {
            this.nextPageFetcher = nextPageFetcher;
            return this;
        }

        /**
         * Builds the page.
         *
         * @return the page
         * @throws IllegalArgumentException if the items contain null
         */
        public Page<T> build() {
            return new Page<>(items, nextPageToken, prevPageToken, totalSize, nextPageFetcher);
        }
    }
}
