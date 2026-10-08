package com.scalekit.models.mcp;

import com.scalekit.internal.Preconditions;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * An MCP configuration: a named set of connections and tools that Scalekit serves to agents as
 * one MCP server. Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class McpConfig {

    private final String id;
    private final String name;
    private final String description;
    private final List<McpConnectionToolMapping> connectionToolMappings;
    private final String mcpServerUrl;

    private McpConfig(Builder builder) {
        this.id = Preconditions.nullToEmpty(builder.id);
        this.name = Preconditions.nullToEmpty(builder.name);
        this.description = Preconditions.emptyToNull(builder.description);
        this.connectionToolMappings = Preconditions.copyList(builder.connectionToolMappings, "connectionToolMappings");
        this.mcpServerUrl = Preconditions.emptyToNull(builder.mcpServerUrl);
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
     * Returns the configuration ID.
     *
     * @return the ID, never null
     */
    public String id() {
        return id;
    }

    /**
     * Returns the configuration name.
     *
     * @return the name, never null
     */
    public String name() {
        return name;
    }

    /**
     * Returns the description.
     *
     * @return the description, or empty
     */
    public Optional<String> description() {
        return Optional.ofNullable(description);
    }

    /**
     * Returns the connections and tools the configuration exposes.
     *
     * @return an unmodifiable list, never null
     */
    public List<McpConnectionToolMapping> connectionToolMappings() {
        return connectionToolMappings;
    }

    /**
     * Returns the URL agents use to reach this configuration's MCP server.
     *
     * @return the URL, or empty when the environment does not expose one
     */
    public Optional<String> mcpServerUrl() {
        return Optional.ofNullable(mcpServerUrl);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof McpConfig)) {
            return false;
        }
        McpConfig that = (McpConfig) o;
        return id.equals(that.id) && name.equals(that.name) && Objects.equals(description, that.description)
                && connectionToolMappings.equals(that.connectionToolMappings)
                && Objects.equals(mcpServerUrl, that.mcpServerUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, connectionToolMappings, mcpServerUrl);
    }

    @Override
    public String toString() {
        return "McpConfig{id=" + id + ", name=" + name + ", description=" + description
                + ", connectionToolMappings=" + connectionToolMappings + ", mcpServerUrl=" + mcpServerUrl + "}";
    }

    /**
     * Builder for {@link McpConfig}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String id;
        private String name;
        private String description;
        private List<McpConnectionToolMapping> connectionToolMappings;
        private String mcpServerUrl;

        private Builder() {
        }

        /**
         * Sets the ID.
         *
         * @param id the ID
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the name.
         *
         * @param name the name
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the description.
         *
         * @param description the description, or null
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the connection-tool mappings.
         *
         * @param connectionToolMappings the mappings; null means none
         * @return this builder
         */
        public Builder connectionToolMappings(List<McpConnectionToolMapping> connectionToolMappings) {
            this.connectionToolMappings = connectionToolMappings;
            return this;
        }

        /**
         * Sets the MCP server URL.
         *
         * @param mcpServerUrl the URL, or null
         * @return this builder
         */
        public Builder mcpServerUrl(String mcpServerUrl) {
            this.mcpServerUrl = mcpServerUrl;
            return this;
        }

        /**
         * Builds the configuration.
         *
         * @return the configuration
         * @throws IllegalArgumentException if the mappings contain null
         */
        public McpConfig build() {
            return new McpConfig(this);
        }
    }
}
