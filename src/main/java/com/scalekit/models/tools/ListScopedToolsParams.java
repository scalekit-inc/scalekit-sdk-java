package com.scalekit.models.tools;

import com.scalekit.internal.Preconditions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * The filter and paging for
 * {@link com.scalekit.api.ToolsClient#listScoped(String, ListScopedToolsParams)}. The server
 * requires a filter, so set at least one of providers, tool names or connection names; the server
 * applies tool names first, then providers, then connection names.
 *
 * <pre>{@code
 * ListScopedToolsParams params = ListScopedToolsParams.builder().addConnectionName("gmail").build();
 * }</pre>
 *
 * <p>Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class ListScopedToolsParams {

    private final List<String> providers;
    private final List<String> toolNames;
    private final List<String> connectionNames;
    private final Integer pageSize;
    private final String pageToken;
    private final Duration timeout;

    private ListScopedToolsParams(Builder builder) {
        this.providers = Preconditions.copyStrings(builder.providers, "providers");
        this.toolNames = Preconditions.copyStrings(builder.toolNames, "toolNames");
        this.connectionNames = Preconditions.copyStrings(builder.connectionNames, "connectionNames");
        if (providers.isEmpty() && toolNames.isEmpty() && connectionNames.isEmpty()) {
            throw new IllegalArgumentException("set at least one of providers, toolNames or connectionNames");
        }
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
        Builder builder = new Builder().providers(providers).toolNames(toolNames).connectionNames(connectionNames)
                .pageToken(pageToken).timeout(timeout);
        builder.pageSize = pageSize;
        return builder;
    }

    /**
     * Returns the provider filter.
     *
     * @return an unmodifiable list, never null
     */
    public List<String> providers() {
        return providers;
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
     * Returns the connection name filter.
     *
     * @return an unmodifiable list, never null
     */
    public List<String> connectionNames() {
        return connectionNames;
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
     * @return the deadline; 60 seconds unless set
     */
    public Duration timeout() {
        return timeout;
    }

    @Override
    public String toString() {
        return "ListScopedToolsParams{providers=" + providers + ", toolNames=" + toolNames
                + ", connectionNames=" + connectionNames + ", pageSize=" + pageSize + ", pageToken=" + pageToken
                + ", timeout=" + timeout + "}";
    }

    /**
     * Builder for {@link ListScopedToolsParams}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private List<String> providers = new ArrayList<>();
        private List<String> toolNames = new ArrayList<>();
        private List<String> connectionNames = new ArrayList<>();
        private Integer pageSize;
        private String pageToken;
        private Duration timeout = ExecuteToolParams.DEFAULT_TIMEOUT;

        private Builder() {
        }

        /**
         * Filters by providers, replacing any set before. A provider may appear once, and the
         * identifier must have exactly one account for it.
         *
         * @param providers the providers; null clears them
         * @return this builder
         */
        public Builder providers(List<String> providers) {
            this.providers = providers == null ? new ArrayList<String>() : new ArrayList<>(providers);
            return this;
        }

        /**
         * Adds one provider to the filter.
         *
         * @param provider the provider, for example {@code "GMAIL"}
         * @return this builder
         * @throws IllegalArgumentException if {@code provider} is null
         */
        public Builder addProvider(String provider) {
            this.providers.add(requireValue(provider, "provider"));
            return this;
        }

        /**
         * Filters by tool names, replacing any set before. Each tool's provider comes from its name.
         *
         * @param toolNames the names; null clears them
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
            this.toolNames.add(requireValue(toolName, "toolName"));
            return this;
        }

        /**
         * Filters by connection names, replacing any set before.
         *
         * @param connectionNames the names; null clears them
         * @return this builder
         */
        public Builder connectionNames(List<String> connectionNames) {
            this.connectionNames = connectionNames == null ? new ArrayList<String>() : new ArrayList<>(connectionNames);
            return this;
        }

        /**
         * Adds one connection name to the filter.
         *
         * @param connectionName the name
         * @return this builder
         * @throws IllegalArgumentException if {@code connectionName} is null
         */
        public Builder addConnectionName(String connectionName) {
            this.connectionNames.add(requireValue(connectionName, "connectionName"));
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
         * @throws IllegalArgumentException if no filter is set, a list contains null, or the
         *                                  timeout is not positive
         */
        public ListScopedToolsParams build() {
            return new ListScopedToolsParams(this);
        }

        private static String requireValue(String value, String name) {
            if (value == null) {
                throw new IllegalArgumentException(name + " must not be null");
            }
            return value;
        }
    }
}
