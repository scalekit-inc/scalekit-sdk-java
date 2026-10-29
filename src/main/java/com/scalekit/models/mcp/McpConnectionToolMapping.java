package com.scalekit.models.mcp;

import com.scalekit.internal.Preconditions;
import com.scalekit.models.connectedaccounts.ConnectedAccountStatus;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Which tools of one connection an MCP configuration exposes.
 *
 * <p>To configure, set the connection name and the tool names; an empty tool list exposes every
 * tool of the connection. The server fills in the remaining fields on the configurations it
 * returns. Immutable and thread-safe.
 *
 * <pre>{@code
 * McpConnectionToolMapping gmail = McpConnectionToolMapping.of("gmail",
 *         Arrays.asList("gmail_fetch_mails", "gmail_send_email"));
 * }</pre>
 *
 * @since 2.6.0
 */
public final class McpConnectionToolMapping {

    private final String connectionName;
    private final List<String> tools;
    private final String connectionId;
    private final String provider;
    private final String connectedAccountId;
    private final ConnectedAccountStatus connectedAccountStatus;

    private McpConnectionToolMapping(Builder builder) {
        this.connectionName = Preconditions.nullToEmpty(builder.connectionName);
        this.tools = Preconditions.copyStrings(builder.tools, "tools");
        this.connectionId = Preconditions.emptyToNull(builder.connectionId);
        this.provider = Preconditions.emptyToNull(builder.provider);
        this.connectedAccountId = Preconditions.emptyToNull(builder.connectedAccountId);
        this.connectedAccountStatus = builder.connectedAccountStatus;
    }

    /**
     * Creates a mapping for a request.
     *
     * @param connectionName the connection name
     * @param tools          the tool names to expose; null or empty exposes every tool of the
     *                       connection
     * @return the mapping
     * @throws IllegalArgumentException if {@code connectionName} is null or empty, or the tools
     *                                  contain null
     */
    public static McpConnectionToolMapping of(String connectionName, List<String> tools) {
        return builder(Preconditions.requireNonEmpty(connectionName, "connectionName")).tools(tools).build();
    }

    /**
     * Returns a new builder.
     *
     * @param connectionName the connection name
     * @return the builder
     */
    public static Builder builder(String connectionName) {
        return new Builder(connectionName);
    }

    /**
     * Returns the connection name.
     *
     * @return the name, never null
     */
    public String connectionName() {
        return connectionName;
    }

    /**
     * Returns the exposed tool names. On a returned configuration, the server lists the full
     * catalog when the mapping was created with an empty list.
     *
     * @return an unmodifiable list, never null
     */
    public List<String> tools() {
        return tools;
    }

    /**
     * Returns the connection ID.
     *
     * @return the ID, or empty on request mappings
     */
    public Optional<String> connectionId() {
        return Optional.ofNullable(connectionId);
    }

    /**
     * Returns the connection's provider.
     *
     * @return the provider, or empty on request mappings
     */
    public Optional<String> provider() {
        return Optional.ofNullable(provider);
    }

    /**
     * Returns the connected account used for this connection, when the server resolved one.
     *
     * @return the account ID, or empty
     */
    public Optional<String> connectedAccountId() {
        return Optional.ofNullable(connectedAccountId);
    }

    /**
     * Returns the status of that connected account.
     *
     * @return the status, or empty
     */
    public Optional<ConnectedAccountStatus> connectedAccountStatus() {
        return Optional.ofNullable(connectedAccountStatus);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof McpConnectionToolMapping)) {
            return false;
        }
        McpConnectionToolMapping that = (McpConnectionToolMapping) o;
        return connectionName.equals(that.connectionName) && tools.equals(that.tools)
                && Objects.equals(connectionId, that.connectionId) && Objects.equals(provider, that.provider)
                && Objects.equals(connectedAccountId, that.connectedAccountId)
                && Objects.equals(connectedAccountStatus, that.connectedAccountStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionName, tools, connectionId, provider, connectedAccountId, connectedAccountStatus);
    }

    @Override
    public String toString() {
        return "McpConnectionToolMapping{connectionName=" + connectionName + ", tools=" + tools
                + ", connectionId=" + connectionId + ", provider=" + provider
                + ", connectedAccountId=" + connectedAccountId + ", connectedAccountStatus=" + connectedAccountStatus + "}";
    }

    /**
     * Builder for {@link McpConnectionToolMapping}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private final String connectionName;
        private List<String> tools;
        private String connectionId;
        private String provider;
        private String connectedAccountId;
        private ConnectedAccountStatus connectedAccountStatus;

        private Builder(String connectionName) {
            this.connectionName = connectionName;
        }

        /**
         * Sets the tool names.
         *
         * @param tools the names; null or empty means every tool
         * @return this builder
         */
        public Builder tools(List<String> tools) {
            this.tools = tools;
            return this;
        }

        /**
         * Sets the connection ID.
         *
         * @param connectionId the ID
         * @return this builder
         */
        public Builder connectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Sets the provider.
         *
         * @param provider the provider
         * @return this builder
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the connected account ID.
         *
         * @param connectedAccountId the ID
         * @return this builder
         */
        public Builder connectedAccountId(String connectedAccountId) {
            this.connectedAccountId = connectedAccountId;
            return this;
        }

        /**
         * Sets the connected account status.
         *
         * @param connectedAccountStatus the status, or null
         * @return this builder
         */
        public Builder connectedAccountStatus(ConnectedAccountStatus connectedAccountStatus) {
            this.connectedAccountStatus = connectedAccountStatus;
            return this;
        }

        /**
         * Builds the mapping.
         *
         * @return the mapping
         * @throws IllegalArgumentException if the tools contain null
         */
        public McpConnectionToolMapping build() {
            return new McpConnectionToolMapping(this);
        }
    }
}
