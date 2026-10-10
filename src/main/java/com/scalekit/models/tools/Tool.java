package com.scalekit.models.tools;

import com.scalekit.internal.JsonValues;
import com.scalekit.internal.Preconditions;

import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * A tool that an agent can run through {@link com.scalekit.api.ToolsClient#execute}.
 *
 * <p>{@link #definition()} holds the tool's schema as JSON (its {@code name}, {@code description}
 * and {@code input_schema}), ready to hand to an LLM. Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class Tool {

    private final String id;
    private final String provider;
    private final Map<String, Object> definition;
    private final Map<String, Object> metadata;
    private final List<String> tags;
    private final Boolean isDefault;
    private final Instant updatedAt;

    private Tool(Builder builder) {
        this.id = Preconditions.nullToEmpty(builder.id);
        this.provider = Preconditions.nullToEmpty(builder.provider);
        this.definition = builder.definition == null ? Collections.<String, Object>emptyMap()
                : JsonValues.copyObject(builder.definition, "definition");
        this.metadata = builder.metadata == null ? Collections.<String, Object>emptyMap()
                : JsonValues.copyObject(builder.metadata, "metadata");
        this.tags = Preconditions.copyStrings(builder.tags, "tags");
        this.isDefault = builder.isDefault;
        this.updatedAt = builder.updatedAt;
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
     * Returns a builder initialised with this tool's values.
     *
     * @return the builder
     */
    public Builder toBuilder() {
        return new Builder().id(id).provider(provider).definition(definition).metadata(metadata).tags(tags)
                .isDefault(isDefault).updatedAt(updatedAt);
    }

    /**
     * Returns the tool's ID.
     *
     * @return the ID, or {@code ""} when the server sent none
     */
    public String id() {
        return id;
    }

    /**
     * Returns the provider the tool belongs to, for example {@code GMAIL}.
     *
     * @return the provider, or {@code ""} when the server sent none
     */
    public String provider() {
        return provider;
    }

    /**
     * Returns the tool's definition (name, description, input schema) as JSON.
     *
     * @return an unmodifiable map, never null
     */
    public Map<String, Object> definition() {
        return definition;
    }

    /**
     * Returns the tool's metadata as JSON.
     *
     * @return an unmodifiable map, never null
     */
    public Map<String, Object> metadata() {
        return metadata;
    }

    /**
     * Returns the tool's tags.
     *
     * @return an unmodifiable list, never null
     */
    public List<String> tags() {
        return tags;
    }

    /**
     * Returns whether this is the default version of the tool.
     *
     * @return the flag, or empty when the server did not say
     */
    public Optional<Boolean> isDefault() {
        return Optional.ofNullable(isDefault);
    }

    /**
     * Returns when the tool was last updated.
     *
     * @return the time, or empty when unknown
     */
    public Optional<Instant> updatedAt() {
        return Optional.ofNullable(updatedAt);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tool)) {
            return false;
        }
        Tool that = (Tool) o;
        return id.equals(that.id) && provider.equals(that.provider) && definition.equals(that.definition)
                && metadata.equals(that.metadata) && tags.equals(that.tags)
                && Objects.equals(isDefault, that.isDefault) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, provider, definition, metadata, tags, isDefault, updatedAt);
    }

    @Override
    public String toString() {
        return "Tool{id=" + id + ", provider=" + provider + ", name=" + definition.get("name") + ", tags=" + tags + "}";
    }

    /**
     * Builder for {@link Tool}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String id;
        private String provider;
        private Map<String, ?> definition;
        private Map<String, ?> metadata;
        private List<String> tags;
        private Boolean isDefault;
        private Instant updatedAt;

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
         * Sets the definition.
         *
         * @param definition JSON-compatible map; null means empty
         * @return this builder
         */
        public Builder definition(Map<String, ?> definition) {
            this.definition = definition;
            return this;
        }

        /**
         * Sets the metadata.
         *
         * @param metadata JSON-compatible map; null means empty
         * @return this builder
         */
        public Builder metadata(Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the tags.
         *
         * @param tags the tags; null means none
         * @return this builder
         */
        public Builder tags(List<String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets whether this is the default version.
         *
         * @param isDefault the flag, or null when unknown
         * @return this builder
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * Sets the last update time.
         *
         * @param updatedAt the time, or null when unknown
         * @return this builder
         */
        public Builder updatedAt(Instant updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Builds the tool.
         *
         * @return the tool
         * @throws IllegalArgumentException if a map holds a value that is not JSON-compatible
         */
        public Tool build() {
            return new Tool(this);
        }
    }
}
