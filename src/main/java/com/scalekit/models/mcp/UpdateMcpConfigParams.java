package com.scalekit.models.mcp;

import com.scalekit.internal.Preconditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Changes to an MCP configuration, used by
 * {@link com.scalekit.api.McpClient#updateConfig(String, UpdateMcpConfigParams)}.
 *
 * <p>The name cannot change. A blank description leaves the stored one unchanged. When any
 * mapping is given, the mappings replace the stored ones as a whole; when none is given, the
 * stored mappings stay.
 *
 * <pre>{@code
 * UpdateMcpConfigParams params = UpdateMcpConfigParams.builder()
 *         .addConnectionToolMapping(McpConnectionToolMapping.of("gmail", Arrays.asList("gmail_fetch_mails")))
 *         .build();
 * }</pre>
 *
 * <p>Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class UpdateMcpConfigParams {

    private final String description;
    private final List<McpConnectionToolMapping> connectionToolMappings;

    private UpdateMcpConfigParams(Builder builder) {
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
        return "UpdateMcpConfigParams{description=" + description
                + ", connectionToolMappings=" + connectionToolMappings + "}";
    }

    /**
     * Builder for {@link UpdateMcpConfigParams}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String description;
        private List<McpConnectionToolMapping> connectionToolMappings = new ArrayList<>();

        private Builder() {
        }

        /**
         * Sets a new description. Blank leaves the stored description unchanged.
         *
         * @param description the description
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the connections and tools to expose (at most 25), replacing the stored mappings as a
         * whole and any set before on this builder.
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
        public UpdateMcpConfigParams build() {
            return new UpdateMcpConfigParams(this);
        }
    }
}
