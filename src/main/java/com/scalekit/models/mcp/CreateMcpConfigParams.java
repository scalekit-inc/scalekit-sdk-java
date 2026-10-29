package com.scalekit.models.mcp;

import com.scalekit.internal.Preconditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Optional settings for a new MCP configuration, used by
 * {@link com.scalekit.api.McpClient#createConfig(String, CreateMcpConfigParams)}.
 *
 * <p>The server requires at least one connection-tool mapping (at most 25).
 *
 * <pre>{@code
 * CreateMcpConfigParams params = CreateMcpConfigParams.builder()
 *         .description("Mail tools for the support agent")
 *         .addConnectionToolMapping(McpConnectionToolMapping.of("gmail", Collections.<String>emptyList()))
 *         .build();
 * }</pre>
 *
 * <p>Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class CreateMcpConfigParams {

    private final String description;
    private final List<McpConnectionToolMapping> connectionToolMappings;

    private CreateMcpConfigParams(Builder builder) {
        this.description = Preconditions.emptyToNull(builder.description);
        this.connectionToolMappings = Preconditions.copyList(builder.connectionToolMappings, "connectionToolMappings");
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
        return new Builder().description(description).connectionToolMappings(connectionToolMappings);
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
     * Returns the connection-tool mappings.
     *
     * @return an unmodifiable list, never null
     */
    public List<McpConnectionToolMapping> connectionToolMappings() {
        return connectionToolMappings;
    }

    @Override
    public String toString() {
        return "CreateMcpConfigParams{description=" + description
                + ", connectionToolMappings=" + connectionToolMappings + "}";
    }

    /**
     * Builder for {@link CreateMcpConfigParams}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String description;
        private List<McpConnectionToolMapping> connectionToolMappings = new ArrayList<>();

        private Builder() {
        }

        /**
         * Sets the description.
         *
         * @param description the description
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the connections and tools to expose (at most 25), replacing any set before.
         *
         * @param connectionToolMappings the mappings; null clears them
         * @return this builder
         */
        public Builder connectionToolMappings(List<McpConnectionToolMapping> connectionToolMappings) {
            this.connectionToolMappings = connectionToolMappings == null
                    ? new ArrayList<McpConnectionToolMapping>() : new ArrayList<>(connectionToolMappings);
            return this;
        }

        /**
         * Adds one connection-tool mapping.
         *
         * @param mapping the mapping
         * @return this builder
         * @throws IllegalArgumentException if {@code mapping} is null
         */
        public Builder addConnectionToolMapping(McpConnectionToolMapping mapping) {
            if (mapping == null) {
                throw new IllegalArgumentException("mapping must not be null");
            }
            this.connectionToolMappings.add(mapping);
            return this;
        }

        /**
         * Builds the parameters.
         *
         * @return the parameters
         * @throws IllegalArgumentException if the mappings contain null
         */
        public CreateMcpConfigParams build() {
            return new CreateMcpConfigParams(this);
        }
    }
}
