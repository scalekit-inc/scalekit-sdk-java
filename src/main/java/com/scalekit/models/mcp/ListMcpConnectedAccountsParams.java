package com.scalekit.models.mcp;

/**
 * Optional settings for
 * {@link com.scalekit.api.McpClient#listConnectedAccounts(String, String, ListMcpConnectedAccountsParams)}.
 *
 * <pre>{@code
 * ListMcpConnectedAccountsParams params = ListMcpConnectedAccountsParams.builder().includeAuthLink(true).build();
 * }</pre>
 *
 * <p>Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class ListMcpConnectedAccountsParams {

    private final boolean includeAuthLink;

    private ListMcpConnectedAccountsParams(Builder builder) {
        this.includeAuthLink = builder.includeAuthLink;
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
        return new Builder().includeAuthLink(includeAuthLink);
    }

    /**
     * Returns whether authentication links are requested.
     *
     * @return the flag
     */
    public boolean includeAuthLink() {
        return includeAuthLink;
    }

    @Override
    public String toString() {
        return "ListMcpConnectedAccountsParams{includeAuthLink=" + includeAuthLink + "}";
    }

    /**
     * Builder for {@link ListMcpConnectedAccountsParams}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private boolean includeAuthLink;

        private Builder() {
        }

        /**
         * Requests a link for each connection the user still has to authorize. Note that this
         * creates a pending connected account for each connection that has none yet, so the call
         * is no longer read-only.
         *
         * @param includeAuthLink true to request links
         * @return this builder
         */
        public Builder includeAuthLink(boolean includeAuthLink) {
            this.includeAuthLink = includeAuthLink;
            return this;
        }

        /**
         * Builds the parameters.
         *
         * @return the parameters
         */
        public ListMcpConnectedAccountsParams build() {
            return new ListMcpConnectedAccountsParams(this);
        }
    }
}
