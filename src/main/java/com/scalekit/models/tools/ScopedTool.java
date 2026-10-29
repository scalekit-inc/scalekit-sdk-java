package com.scalekit.models.tools;

import com.scalekit.internal.Preconditions;

import java.util.Objects;
import java.util.Optional;

/**
 * A tool that an identifier can run, with the connected account that runs it, from
 * {@link com.scalekit.api.ToolsClient#listScoped}. Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class ScopedTool {

    private final Tool tool;
    private final String identifier;
    private final String connectedAccountId;

    private ScopedTool(Builder builder) {
        this.tool = builder.tool;
        this.identifier = Preconditions.nullToEmpty(builder.identifier);
        this.connectedAccountId = Preconditions.emptyToNull(builder.connectedAccountId);
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
     * Returns the tool.
     *
     * @return the tool, or empty when the server sent none
     */
    public Optional<Tool> tool() {
        return Optional.ofNullable(tool);
    }

    /**
     * Returns the identifier the tool is scoped to.
     *
     * @return the identifier, never null
     */
    public String identifier() {
        return identifier;
    }

    /**
     * Returns the connected account that runs the tool for the identifier.
     *
     * @return the account ID, or empty
     */
    public Optional<String> connectedAccountId() {
        return Optional.ofNullable(connectedAccountId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScopedTool)) {
            return false;
        }
        ScopedTool that = (ScopedTool) o;
        return Objects.equals(tool, that.tool) && identifier.equals(that.identifier)
                && Objects.equals(connectedAccountId, that.connectedAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tool, identifier, connectedAccountId);
    }

    @Override
    public String toString() {
        return "ScopedTool{tool=" + tool + ", identifier=" + identifier + ", connectedAccountId=" + connectedAccountId + "}";
    }

    /**
     * Builder for {@link ScopedTool}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private Tool tool;
        private String identifier;
        private String connectedAccountId;

        private Builder() {
        }

        /**
         * Sets the tool.
         *
         * @param tool the tool, or null
         * @return this builder
         */
        public Builder tool(Tool tool) {
            this.tool = tool;
            return this;
        }

        /**
         * Sets the identifier.
         *
         * @param identifier the identifier
         * @return this builder
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * Sets the connected account ID.
         *
         * @param connectedAccountId the ID, or null
         * @return this builder
         */
        public Builder connectedAccountId(String connectedAccountId) {
            this.connectedAccountId = connectedAccountId;
            return this;
        }

        /**
         * Builds the scoped tool.
         *
         * @return the scoped tool
         */
        public ScopedTool build() {
            return new ScopedTool(this);
        }
    }
}
