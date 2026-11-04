package com.scalekit.models.connectedaccounts;

import com.scalekit.internal.Preconditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * Optional filters and paging for
 * {@link com.scalekit.api.ConnectedAccountsClient#list(ListConnectedAccountsParams)}.
 *
 * <pre>{@code
 * ListConnectedAccountsParams params = ListConnectedAccountsParams.builder()
 *         .identifier("user_123")
 *         .pageSize(50)
 *         .build();
 * }</pre>
 *
 * <p>Set either {@link Builder#connectionName(String)} or {@link Builder#connectionNames(List)},
 * not both; the server rejects the combination. Blank strings are treated as unset. Immutable and
 * thread-safe.
 *
 * @since 2.6.0
 */
public final class ListConnectedAccountsParams {

    private final String connectionName;
    private final List<String> connectionNames;
    private final String identifier;
    private final String provider;
    private final String query;
    private final Integer pageSize;
    private final String pageToken;

    private ListConnectedAccountsParams(Builder builder) {
        this.connectionName = Preconditions.trimToNull(builder.connectionName);
        this.connectionNames = Preconditions.copyStrings(builder.connectionNames, "connectionNames");
        this.identifier = Preconditions.trimToNull(builder.identifier);
        this.provider = Preconditions.trimToNull(builder.provider);
        this.query = Preconditions.emptyToNull(builder.query);
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
        Builder builder = new Builder().connectionName(connectionName).connectionNames(connectionNames)
                .identifier(identifier).provider(provider).query(query).pageToken(pageToken);
        builder.pageSize = pageSize;
        return builder;
    }

    /**
     * Returns the connection name filter.
     *
     * @return the name, or empty
     */
    public Optional<String> connectionName() {
        return Optional.ofNullable(connectionName);
    }

    /**
     * Returns the connection names filter.
     *
     * @return an unmodifiable list, never null
     */
    public List<String> connectionNames() {
        return connectionNames;
    }

    /**
     * Returns the identifier filter.
     *
     * @return the identifier, or empty
     */
    public Optional<String> identifier() {
        return Optional.ofNullable(identifier);
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
     * @return the page size, or empty for the server default
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
        return "ListConnectedAccountsParams{connectionName=" + connectionName + ", connectionNames=" + connectionNames
                + ", identifier=" + identifier + ", provider=" + provider + ", query=" + query
                + ", pageSize=" + pageSize + ", pageToken=" + pageToken + "}";
    }

    /**
     * Builder for {@link ListConnectedAccountsParams}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String connectionName;
        private List<String> connectionNames = new ArrayList<>();
        private String identifier;
        private String provider;
        private String query;
        private Integer pageSize;
        private String pageToken;

        private Builder() {
        }

        /**
         * Lists the accounts of one connection.
         *
         * @param connectionName the connection name
         * @return this builder
         */
        public Builder connectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        /**
         * Lists the accounts of several connections (at most 20), replacing any set before.
         *
         * @param connectionNames the connection names; null clears the filter
         * @return this builder
         */
        public Builder connectionNames(List<String> connectionNames) {
            this.connectionNames = connectionNames == null ? new ArrayList<String>() : new ArrayList<>(connectionNames);
            return this;
        }

        /**
         * Lists the accounts of one owner.
         *
         * @param identifier your identifier for the owner
         * @return this builder
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * Lists the accounts of one provider, for example {@code "GOOGLE"}.
         *
         * @param provider the provider
         * @return this builder
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Searches accounts by identifier, provider or connection.
         *
         * @param query the search text
         * @return this builder
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * Sets the maximum number of accounts on one page (the server allows up to 99). This
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
         * @throws IllegalArgumentException if the connection names contain null
         */
        public ListConnectedAccountsParams build() {
            return new ListConnectedAccountsParams(this);
        }
    }
}
