package com.scalekit.models.tools;

import com.scalekit.internal.Preconditions;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * A tool that matched {@link com.scalekit.api.ToolsClient#search}, with its relevance score and,
 * when the search named an identifier, whether that identifier can run it. Immutable and
 * thread-safe.
 *
 * @since 2.6.0
 */
public final class SearchedTool {

    private final String name;
    private final String provider;
    private final String description;
    private final double score;
    private final List<ConnectionReadiness> connections;

    private SearchedTool(Builder builder) {
        this.name = Preconditions.nullToEmpty(builder.name);
        this.provider = Preconditions.nullToEmpty(builder.provider);
        this.description = Preconditions.emptyToNull(builder.description);
        this.score = builder.score;
        this.connections = Preconditions.copyList(builder.connections, "connections");
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
     * Returns the tool's name, as passed to {@link com.scalekit.api.ToolsClient#execute}.
     *
     * @return the name, never null
     */
    public String name() {
        return name;
    }

    /**
     * Returns the tool's provider.
     *
     * @return the provider, never null
     */
    public String provider() {
        return provider;
    }

    /**
     * Returns the tool's description.
     *
     * @return the description, or empty
     */
    public Optional<String> description() {
        return Optional.ofNullable(description);
    }

    /**
     * Returns the relevance score; higher is more relevant.
     *
     * @return the score
     */
    public double score() {
        return score;
    }

    /**
     * Returns, per connection the identifier has used, whether the tool can run through it.
     *
     * @return an unmodifiable list; empty when the search named no identifier
     */
    public List<ConnectionReadiness> connections() {
        return connections;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchedTool)) {
            return false;
        }
        SearchedTool that = (SearchedTool) o;
        return Double.compare(score, that.score) == 0 && name.equals(that.name) && provider.equals(that.provider)
                && Objects.equals(description, that.description) && connections.equals(that.connections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, provider, description, score, connections);
    }

    @Override
    public String toString() {
        return "SearchedTool{name=" + name + ", provider=" + provider + ", score=" + score
                + ", connections=" + connections + "}";
    }

    /**
     * Builder for {@link SearchedTool}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String name;
        private String provider;
        private String description;
        private double score;
        private List<ConnectionReadiness> connections;

        private Builder() {
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
         * Sets the score.
         *
         * @param score the score
         * @return this builder
         */
        public Builder score(double score) {
            this.score = score;
            return this;
        }

        /**
         * Sets the per-connection readiness.
         *
         * @param connections the readiness entries; null means none
         * @return this builder
         */
        public Builder connections(List<ConnectionReadiness> connections) {
            this.connections = connections;
            return this;
        }

        /**
         * Builds the tool.
         *
         * @return the tool
         * @throws IllegalArgumentException if the connections contain null
         */
        public SearchedTool build() {
            return new SearchedTool(this);
        }
    }
}
