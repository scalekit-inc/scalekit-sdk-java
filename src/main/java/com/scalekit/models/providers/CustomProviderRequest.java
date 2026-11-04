package com.scalekit.models.providers;

import com.scalekit.internal.Preconditions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * The full definition of a custom provider, used to create one with
 * {@link com.scalekit.api.ProvidersClient#createCustomProvider(CustomProviderRequest)} and to
 * replace one with {@link com.scalekit.api.ProvidersClient#updateCustomProvider(String, CustomProviderRequest)}.
 *
 * <p>An update replaces the stored provider: {@code proxyEnabled} is always sent (default
 * {@code true}), leaving out {@code metadata} clears it, and the server requires the auth
 * patterns. Start from the stored values when you change one field.
 *
 * <pre>{@code
 * CustomProviderRequest request = CustomProviderRequest.builder("Acme CRM", "https://api.acme.example")
 *         .addAuthPattern(AuthPattern.builder(AuthPatternType.BEARER, "API token")
 *                 .addField(AuthField.builder("token").label("Token").inputType("password").build())
 *                 .build())
 *         .build();
 * }</pre>
 *
 * <p>Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class CustomProviderRequest {

    private final String displayName;
    private final String proxyUrl;
    private final String description;
    private final boolean proxyEnabled;
    private final List<AuthPattern> authPatterns;
    private final String iconSrc;
    private final Map<String, String> metadata;

    private CustomProviderRequest(Builder builder) {
        this.displayName = Preconditions.requireNonEmpty(builder.displayName, "displayName");
        this.proxyUrl = Preconditions.requireNonEmpty(builder.proxyUrl, "proxyUrl");
        this.description = Preconditions.emptyToNull(builder.description);
        this.proxyEnabled = builder.proxyEnabled;
        this.authPatterns = Preconditions.copyList(builder.authPatterns, "authPatterns");
        this.iconSrc = Preconditions.emptyToNull(builder.iconSrc);
        this.metadata = Preconditions.copyStringMap(builder.metadata, "metadata");
    }

    /**
     * Returns a new builder.
     *
     * @param displayName the provider's name: letters, digits and spaces
     * @param proxyUrl    the base HTTPS URL of the upstream service
     * @return the builder
     */
    public static Builder builder(String displayName, String proxyUrl) {
        return new Builder(displayName, proxyUrl);
    }

    /**
     * Returns a builder initialised with this request's values.
     *
     * @return the builder
     */
    public Builder toBuilder() {
        return new Builder(displayName, proxyUrl).description(description).proxyEnabled(proxyEnabled)
                .authPatterns(authPatterns).iconSrc(iconSrc).metadata(metadata);
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
     * Returns the upstream base URL.
     *
     * @return the URL, never null
     */
    public String proxyUrl() {
        return proxyUrl;
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
     * Returns whether Scalekit proxies requests to the provider.
     *
     * @return the flag; true unless set
     */
    public boolean proxyEnabled() {
        return proxyEnabled;
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
     * Returns the metadata.
     *
     * @return an unmodifiable map, never null
     */
    public Map<String, String> metadata() {
        return metadata;
    }

    @Override
    public String toString() {
        return "CustomProviderRequest{displayName=" + displayName + ", proxyUrl=" + proxyUrl
                + ", description=" + description + ", proxyEnabled=" + proxyEnabled
                + ", authPatterns=" + authPatterns + ", iconSrc=" + iconSrc + ", metadata=" + metadata + "}";
    }

    /**
     * Builder for {@link CustomProviderRequest}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private final String displayName;
        private final String proxyUrl;
        private String description;
        private boolean proxyEnabled = true;
        private List<AuthPattern> authPatterns = new ArrayList<>();
        private String iconSrc;
        private Map<String, String> metadata = new LinkedHashMap<>();

        private Builder(String displayName, String proxyUrl) {
            this.displayName = displayName;
            this.proxyUrl = proxyUrl;
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
         * Sets whether Scalekit proxies requests to the provider. Defaults to {@code true}; an
         * update always sends this value.
         *
         * @param proxyEnabled the flag
         * @return this builder
         */
        public Builder proxyEnabled(boolean proxyEnabled) {
            this.proxyEnabled = proxyEnabled;
            return this;
        }

        /**
         * Sets the ways users authenticate, replacing any set before. The server supports one
         * pattern today and requires it.
         *
         * @param authPatterns the patterns; null clears them
         * @return this builder
         */
        public Builder authPatterns(List<AuthPattern> authPatterns) {
            this.authPatterns = authPatterns == null ? new ArrayList<AuthPattern>() : new ArrayList<>(authPatterns);
            return this;
        }

        /**
         * Adds one way users authenticate.
         *
         * @param authPattern the pattern
         * @return this builder
         * @throws IllegalArgumentException if {@code authPattern} is null
         */
        public Builder addAuthPattern(AuthPattern authPattern) {
            if (authPattern == null) {
                throw new IllegalArgumentException("authPattern must not be null");
            }
            this.authPatterns.add(authPattern);
            return this;
        }

        /**
         * Sets the icon URL (HTTPS).
         *
         * @param iconSrc the URL
         * @return this builder
         */
        public Builder iconSrc(String iconSrc) {
            this.iconSrc = iconSrc;
            return this;
        }

        /**
         * Sets the metadata (at most 20 pairs), replacing any set before. An update that leaves it
         * empty clears the stored metadata.
         *
         * @param metadata the metadata; null clears it
         * @return this builder
         */
        public Builder metadata(Map<String, String> metadata) {
            this.metadata = metadata == null ? new LinkedHashMap<String, String>() : new LinkedHashMap<>(metadata);
            return this;
        }

        /**
         * Adds one metadata pair.
         *
         * @param key   the key
         * @param value the value
         * @return this builder
         * @throws IllegalArgumentException if {@code key} or {@code value} is null
         */
        public Builder putMetadata(String key, String value) {
            if (key == null || value == null) {
                throw new IllegalArgumentException("metadata key and value must not be null");
            }
            this.metadata.put(key, value);
            return this;
        }

        /**
         * Builds the request.
         *
         * @return the request
         * @throws IllegalArgumentException if the display name or proxy URL is null or empty, or a
         *                                  list or map holds null
         */
        public CustomProviderRequest build() {
            return new CustomProviderRequest(this);
        }
    }
}
