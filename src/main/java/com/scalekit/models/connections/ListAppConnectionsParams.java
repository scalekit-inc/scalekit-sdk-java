package com.scalekit.models.connections;

import com.scalekit.internal.Preconditions;

import java.util.Optional;
import java.util.OptionalInt;

/**
 * Optional filters and paging for
 * {@link com.scalekit.api.ConnectionClient#listAppConnections(ListAppConnectionsParams)}.
 *
 * <pre>{@code
 * ListAppConnectionsParams params = ListAppConnectionsParams.builder().query("gmail").pageSize(10).build();
 * }</pre>
 *
 * <p>Blank strings are treated as unset. Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class ListAppConnectionsParams {

    private final String provider;
    private final String query;
    private final Integer pageSize;
    private final String pageToken;

    private ListAppConnectionsParams(Builder builder) {
        this.provider = Preconditions.trimToNull(builder.provider);
        this.query = Preconditions.trimToNull(builder.query) == null ? null : builder.query;
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
        Builder builder = new Builder().provider(provider).query(query).pageToken(pageToken);
        builder.pageSize = pageSize;
        return builder;
    }

    /**
     * Returns the provider filter.
     *
     * @return the provider, or empty
     */
    public Optional<String> provider() {
        return Optional.ofNullable(provider);
    }

    /**
     * Returns the search text.
     *
     * @return the text, or empty
     */
    public Optional<String> query() {
        return Optional.ofNullable(query);
    }

    /**
     * Returns the page size.
     *
     * @return the page size, or empty for the server default (10)
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
        return "ListAppConnectionsParams{provider=" + provider + ", query=" + query + ", pageSize=" + pageSize
                + ", pageToken=" + pageToken + "}";
    }

    /**
     * Builder for {@link ListAppConnectionsParams}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String provider;
        private String query;
        private Integer pageSize;
        private String pageToken;

        private Builder() {
        }

        /**
         * Lists only the connections of one provider (1 to 50 characters).
         *
         * @param provider the provider
         * @return this builder
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Searches connections (3 to 100 characters). Sent as given; a blank query is unset.
         *
         * @param query the search text
         * @return this builder
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * Sets the maximum number of connections on one page (the server allows up to 30). This
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
        public ListAppConnectionsParams build() {
            return new ListAppConnectionsParams(this);
        }
    }
}
