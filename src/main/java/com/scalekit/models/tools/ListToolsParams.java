package com.scalekit.models.tools;

import com.scalekit.internal.Preconditions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * Optional filters and paging for {@link com.scalekit.api.ToolsClient#list(ListToolsParams)}.
 *
 * <pre>{@code
 * ListToolsParams params = ListToolsParams.builder()
 *         .connectionName("gmail")
 *         .identifier("user_123")
 *         .pageSize(50)
 *         .build();
 * }</pre>
 *
 * <p>Blank strings are treated as unset. Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class ListToolsParams {

    /** Default deadline for listing tools: 60 seconds, the same as for running one. */
    public static final Duration DEFAULT_TIMEOUT = ExecuteToolParams.DEFAULT_TIMEOUT;

    private final String connectionName;
    private final String identifier;
    private final String provider;
    private final List<String> toolNames;
    private final String query;
    private final String connectedAccountId;
    private final Boolean summary;
    private final Integer pageSize;
    private final String pageToken;
    private final Duration timeout;

    private ListToolsParams(Builder builder) {
        this.connectionName = Preconditions.trimToNull(builder.connectionName);
        this.identifier = Preconditions.trimToNull(builder.identifier);
        this.provider = Preconditions.trimToNull(builder.provider);
        this.toolNames = Preconditions.copyStrings(builder.toolNames, "toolNames");
        this.query = Preconditions.emptyToNull(builder.query);
        this.connectedAccountId = Preconditions.trimToNull(builder.connectedAccountId);
        this.summary = builder.summary;
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
        Builder builder = new Builder().connectionName(connectionName).identifier(identifier).provider(provider)
                .toolNames(toolNames).query(query).connectedAccountId(connectedAccountId).pageToken(pageToken)
                .timeout(timeout);
        builder.summary = summary;
        builder.pageSize = pageSize;
        return builder;
    }

    /**
     * Returns the connection name filter.
     *
     * @return the connection name, or empty
     */
    public Optional<String> connectionName() {
        return Optional.ofNullable(connectionName);
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
     * Returns the tool name filter.
     *
     * @return an unmodifiable list, never null
     */
    public List<String> toolNames() {
        return toolNames;
    }

    /**
     * Returns the free-text query.
     *
     * @return the query, or empty
     */
    public Optional<String> query() {
        return Optional.ofNullable(query);
    }

    /**
     * Returns the connected account ID filter.
     *
     * @return the ID, or empty
     */
    public Optional<String> connectedAccountId() {
        return Optional.ofNullable(connectedAccountId);
    }

    /**
     * Returns whether only tool names are requested.
     *
     * @return the flag, or empty when not set
     */
    public Optional<Boolean> summary() {
        return Optional.ofNullable(summary);
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

    /**
     * Returns the deadline for each request.
     *
     * @return the deadline; {@link #DEFAULT_TIMEOUT} unless set
     */
    public Duration timeout() {
        return timeout;
    }

    @Override
    public String toString() {
        return "ListToolsParams{connectionName=" + connectionName + ", identifier=" + identifier
                + ", provider=" + provider + ", toolNames=" + toolNames + ", query=" + query
                + ", connectedAccountId=" + connectedAccountId + ", summary=" + summary
                + ", pageSize=" + pageSize + ", pageToken=" + pageToken + ", timeout=" + timeout + "}";
    }

    /**
     * Builder for {@link ListToolsParams}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String connectionName;
        private String identifier;
        private String provider;
        private List<String> toolNames = new ArrayList<>();
        private String query;
        private String connectedAccountId;
        private Boolean summary;
        private Integer pageSize;
        private String pageToken;
        private Duration timeout = DEFAULT_TIMEOUT;

        private Builder() {
        }

        /**
         * Lists the tools of one connection (for example {@code "gmail"}). Combined with
         * {@link #identifier(String)}, lists the tools of that user's account on the connection.
         *
         * @param connectionName the connection name
         * @return this builder
         */
        public Builder connectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        /**
         * Lists the tools available to the connected accounts of this identifier.
         *
         * @param identifier the user or tenant identifier
         * @return this builder
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * Filters by provider, for example {@code "GOOGLE"}.
         *
         * @param provider the provider
         * @return this builder
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Filters by tool names, replacing any set before.
         *
         * @param toolNames the names; null clears the filter
         * @return this builder
         */
        public Builder toolNames(List<String> toolNames) {
            this.toolNames = toolNames == null ? new ArrayList<String>() : new ArrayList<>(toolNames);
            return this;
        }

        /**
         * Adds one tool name to the filter.
         *
         * @param toolName the name
         * @return this builder
         * @throws IllegalArgumentException if {@code toolName} is null
         */
        public Builder addToolName(String toolName) {
            if (toolName == null) {
                throw new IllegalArgumentException("toolName must not be null");
            }
            this.toolNames.add(toolName);
            return this;
        }

        /**
         * Searches global tools by name. The server requires 3 to 100 characters.
         *
         * @param query the search text
         * @return this builder
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * Lists the tools of one connected account.
         *
         * @param connectedAccountId the connected account ID ({@code ca_...})
         * @return this builder
         */
        public Builder connectedAccountId(String connectedAccountId) {
            this.connectedAccountId = connectedAccountId;
            return this;
        }

        /**
         * Requests tool names only. The page's items are then empty; read
         * {@link ToolPage#toolNames()} instead.
         *
         * @param summary true for names only
         * @return this builder
         */
        public Builder summary(boolean summary) {
            this.summary = summary;
            return this;
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
         * @param pageToken a token from {@link ToolPage#nextPageToken()}
         * @return this builder
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

        /**
         * Sets the deadline for each request, including the requests made by the auto-pager.
         *
         * @param timeout a positive duration; defaults to {@link #DEFAULT_TIMEOUT}
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
        public ListToolsParams build() {
            return new ListToolsParams(this);
        }
    }
}
