package com.scalekit.models.providers;

import com.scalekit.internal.Preconditions;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * A provider (a connector to a third-party service), as returned by
 * {@link com.scalekit.api.ProvidersClient}. Immutable and thread-safe.
 *
 * <p>{@link #identifier()} is the value to pass to
 * {@link com.scalekit.api.ProvidersClient#updateCustomProvider} and
 * {@link com.scalekit.api.ProvidersClient#deleteCustomProvider}.
 *
 * @since 2.6.0
 */
public final class Provider {

    private final String id;
    private final String identifier;
    private final String displayName;
    private final String description;
    private final List<String> categories;
    private final List<AuthPattern> authPatterns;
    private final String iconSrc;
    private final int displayPriority;
    private final boolean comingSoon;
    private final String proxyUrl;
    private final boolean proxyEnabled;
    private final boolean custom;
    private final boolean customMcp;
    private final Map<String, String> metadata;

    private Provider(Builder builder) {
        this.id = Preconditions.nullToEmpty(builder.id);
        this.identifier = Preconditions.nullToEmpty(builder.identifier);
        this.displayName = Preconditions.nullToEmpty(builder.displayName);
        this.description = Preconditions.emptyToNull(builder.description);
        this.categories = Preconditions.copyStrings(builder.categories, "categories");
        this.authPatterns = Preconditions.copyList(builder.authPatterns, "authPatterns");
        this.iconSrc = Preconditions.emptyToNull(builder.iconSrc);
        this.displayPriority = builder.displayPriority;
        this.comingSoon = builder.comingSoon;
        this.proxyUrl = Preconditions.emptyToNull(builder.proxyUrl);
        this.proxyEnabled = builder.proxyEnabled;
        this.custom = builder.custom;
        this.customMcp = builder.customMcp;
        this.metadata = Preconditions.copyStringMap(builder.metadata, "metadata");
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
     * Returns the provider's ID.
     *
     * @return the ID, never null
     */
    public String id() {
        return id;
    }

    /**
     * Returns the provider's identifier, used to update and delete it.
     *
     * @return the identifier, never null
     */
    public String identifier() {
        return identifier;
    }

    /**
     * Returns the display name.
     *
     * @return the name, never null
     */
    public String displayName() {
        return displayName;
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
     * Returns the categories.
     *
     * @return an unmodifiable list, never null
     */
    public List<String> categories() {
        return categories;
    }

    /**
     * Returns the ways users authenticate.
     *
     * @return an unmodifiable list, never null
     */
    public List<AuthPattern> authPatterns() {
        return authPatterns;
    }

    /**
     * Returns the icon URL.
     *
     * @return the URL, or empty
     */
    public Optional<String> iconSrc() {
        return Optional.ofNullable(iconSrc);
    }

    /**
     * Returns the position in provider listings; lower comes first.
     *
     * @return the priority
     */
    public int displayPriority() {
        return displayPriority;
    }

    /**
     * Returns whether the provider is announced but not yet available.
     *
     * @return the flag
     */
    public boolean comingSoon() {
        return comingSoon;
    }

    /**
     * Returns the upstream base URL that proxied requests go to.
     *
     * @return the URL, or empty
     */
    public Optional<String> proxyUrl() {
        return Optional.ofNullable(proxyUrl);
    }

    /**
     * Returns whether Scalekit proxies requests to the provider.
     *
     * @return the flag
     */
    public boolean proxyEnabled() {
        return proxyEnabled;
    }

    /**
     * Returns whether this is a custom provider of your environment.
     *
     * @return the flag
     */
    public boolean isCustom() {
        return custom;
    }

    /**
     * Returns whether this is a custom provider that fronts an MCP server.
     *
     * @return the flag
     */
    public boolean isCustomMcp() {
        return customMcp;
    }

    /**
     * Returns the metadata.
     *
     * @return an unmodifiable map, never null
     */
    public Map<String, String> metadata() {
        return metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Provider)) {
            return false;
        }
        Provider that = (Provider) o;
        return displayPriority == that.displayPriority && comingSoon == that.comingSoon
                && proxyEnabled == that.proxyEnabled && custom == that.custom && customMcp == that.customMcp
                && id.equals(that.id) && identifier.equals(that.identifier) && displayName.equals(that.displayName)
                && Objects.equals(description, that.description) && categories.equals(that.categories)
                && authPatterns.equals(that.authPatterns) && Objects.equals(iconSrc, that.iconSrc)
                && Objects.equals(proxyUrl, that.proxyUrl) && metadata.equals(that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, identifier, displayName, description, categories, authPatterns, iconSrc,
                displayPriority, comingSoon, proxyUrl, proxyEnabled, custom, customMcp, metadata);
    }

    @Override
    public String toString() {
        return "Provider{id=" + id + ", identifier=" + identifier + ", displayName=" + displayName
                + ", proxyUrl=" + proxyUrl + ", proxyEnabled=" + proxyEnabled + ", isCustom=" + custom
                + ", isCustomMcp=" + customMcp + ", authPatterns=" + authPatterns + "}";
    }

    /**
     * Builder for {@link Provider}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String id;
        private String identifier;
        private String displayName;
        private String description;
        private List<String> categories;
        private List<AuthPattern> authPatterns;
        private String iconSrc;
        private int displayPriority;
        private boolean comingSoon;
        private String proxyUrl;
        private boolean proxyEnabled;
        private boolean custom;
        private boolean customMcp;
        private Map<String, String> metadata;

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
         * Sets the display name.
         *
         * @param displayName the name
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
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
         * Sets the categories.
         *
         * @param categories the categories; null means none
         * @return this builder
         */
        public Builder categories(List<String> categories) {
            this.categories = categories;
            return this;
        }

        /**
         * Sets the auth patterns.
         *
         * @param authPatterns the patterns; null means none
         * @return this builder
         */
        public Builder authPatterns(List<AuthPattern> authPatterns) {
            this.authPatterns = authPatterns;
            return this;
        }

        /**
         * Sets the icon URL.
         *
         * @param iconSrc the URL, or null
         * @return this builder
         */
        public Builder iconSrc(String iconSrc) {
            this.iconSrc = iconSrc;
            return this;
        }

        /**
         * Sets the display priority.
         *
         * @param displayPriority the priority
         * @return this builder
         */
        public Builder displayPriority(int displayPriority) {
            this.displayPriority = displayPriority;
            return this;
        }

        /**
         * Sets the coming-soon flag.
         *
         * @param comingSoon the flag
         * @return this builder
         */
        public Builder comingSoon(boolean comingSoon) {
            this.comingSoon = comingSoon;
            return this;
        }

        /**
         * Sets the upstream base URL.
         *
         * @param proxyUrl the URL, or null
         * @return this builder
         */
        public Builder proxyUrl(String proxyUrl) {
            this.proxyUrl = proxyUrl;
            return this;
        }

        /**
         * Sets whether requests are proxied.
         *
         * @param proxyEnabled the flag
         * @return this builder
         */
        public Builder proxyEnabled(boolean proxyEnabled) {
            this.proxyEnabled = proxyEnabled;
            return this;
        }

        /**
         * Sets whether the provider is custom.
         *
         * @param custom the flag
         * @return this builder
         */
        public Builder isCustom(boolean custom) {
            this.custom = custom;
            return this;
        }

        /**
         * Sets whether the provider is a custom MCP provider.
         *
         * @param customMcp the flag
         * @return this builder
         */
        public Builder isCustomMcp(boolean customMcp) {
            this.customMcp = customMcp;
            return this;
        }

        /**
         * Sets the metadata.
         *
         * @param metadata the metadata; null means none
         * @return this builder
         */
        public Builder metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the provider.
         *
         * @return the provider
         * @throws IllegalArgumentException if a list or map holds null
         */
        public Provider build() {
            return new Provider(this);
        }
    }
}
