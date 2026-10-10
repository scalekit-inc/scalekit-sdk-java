package com.scalekit.models.providers;

import com.scalekit.internal.JsonValues;
import com.scalekit.internal.Preconditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * One way a user can authenticate against a custom provider.
 *
 * <p>Attributes this SDK does not model are kept in {@link #additionalProperties()} and sent back
 * unchanged, so the patterns of a {@link Provider} can be passed straight to
 * {@link com.scalekit.api.ProvidersClient#updateCustomProvider}. Immutable and thread-safe.
 *
 * <pre>{@code
 * AuthPattern bearer = AuthPattern.builder(AuthPatternType.BEARER, "Personal access token")
 *         .addField(AuthField.builder("token").label("Token").inputType("password").required(true).build())
 *         .build();
 * }</pre>
 *
 * @since 2.6.0
 */
public final class AuthPattern {

    private final AuthPatternType type;
    private final String displayName;
    private final String description;
    private final Boolean isMcp;
    private final List<AuthField> fields;
    private final Map<String, Object> oauthConfig;
    private final String authHeaderKeyOverride;
    private final Map<String, Object> additionalProperties;

    private AuthPattern(Builder builder) {
        if (builder.type == null) {
            throw new IllegalArgumentException("type is required");
        }
        this.type = builder.type;
        this.displayName = Preconditions.nullToEmpty(builder.displayName);
        this.description = Preconditions.emptyToNull(builder.description);
        this.isMcp = builder.isMcp;
        this.fields = Preconditions.copyList(builder.fields, "fields");
        this.oauthConfig = builder.oauthConfig == null ? null : JsonValues.copyObject(builder.oauthConfig, "oauthConfig");
        this.authHeaderKeyOverride = Preconditions.emptyToNull(builder.authHeaderKeyOverride);
        this.additionalProperties = builder.additionalProperties.isEmpty() ? Collections.<String, Object>emptyMap()
                : JsonValues.copyObject(builder.additionalProperties, "additionalProperties");
    }

    /**
     * Returns a new builder.
     *
     * @param type        the authentication method
     * @param displayName the name of this method, shown to the user while they connect
     * @return the builder
     */
    public static Builder builder(AuthPatternType type, String displayName) {
        return new Builder(type, displayName);
    }

    /**
     * Returns a builder initialised with this pattern's values.
     *
     * @return the builder
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, displayName).description(description).fields(fields)
                .oauthConfig(oauthConfig).authHeaderKeyOverride(authHeaderKeyOverride)
                .additionalProperties(additionalProperties);
        builder.isMcp = isMcp;
        return builder;
    }

    /**
     * Returns the authentication method.
     *
     * @return the type, never null
     */
    public AuthPatternType type() {
        return type;
    }

    /**
     * Returns the name shown to the user.
     *
     * @return the name, never null
     */
    public String displayName() {
        return displayName;
    }

    /**
     * Returns the explanation shown to the user.
     *
     * @return the description, or empty
     */
    public Optional<String> description() {
        return Optional.ofNullable(description);
    }

    /**
     * Returns whether the provider fronts an MCP server.
     *
     * @return the flag, or empty when not set
     */
    public Optional<Boolean> isMcp() {
        return Optional.ofNullable(isMcp);
    }

    /**
     * Returns the credential inputs.
     *
     * @return an unmodifiable list, never null; empty for {@code OAUTH} and {@code NO_AUTH}
     */
    public List<AuthField> fields() {
        return fields;
    }

    /**
     * Returns the OAuth settings of an {@code OAUTH} pattern.
     *
     * @return an unmodifiable map, or empty when not set
     */
    public Optional<Map<String, Object>> oauthConfig() {
        return Optional.ofNullable(oauthConfig);
    }

    /**
     * Returns the header an {@code API_KEY} credential is sent in, when it is not the default.
     *
     * @return the header name, or empty
     */
    public Optional<String> authHeaderKeyOverride() {
        return Optional.ofNullable(authHeaderKeyOverride);
    }

    /**
     * Returns attributes this SDK does not model, keyed by their JSON name.
     *
     * @return an unmodifiable map, never null
     */
    public Map<String, Object> additionalProperties() {
        return additionalProperties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthPattern)) {
            return false;
        }
        AuthPattern that = (AuthPattern) o;
        return type.equals(that.type) && displayName.equals(that.displayName)
                && Objects.equals(description, that.description) && Objects.equals(isMcp, that.isMcp)
                && fields.equals(that.fields) && Objects.equals(oauthConfig, that.oauthConfig)
                && Objects.equals(authHeaderKeyOverride, that.authHeaderKeyOverride)
                && additionalProperties.equals(that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, displayName, description, isMcp, fields, oauthConfig, authHeaderKeyOverride,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "AuthPattern{type=" + type + ", displayName=" + displayName + ", description=" + description
                + ", isMcp=" + isMcp + ", fields=" + fields
                + ", oauthConfig=" + (oauthConfig == null ? null : oauthConfig.keySet())
                + ", authHeaderKeyOverride=" + authHeaderKeyOverride
                + ", additionalProperties=" + additionalProperties.keySet() + "}";
    }

    /**
     * Builder for {@link AuthPattern}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private final AuthPatternType type;
        private final String displayName;
        private String description;
        private Boolean isMcp;
        private List<AuthField> fields = new ArrayList<>();
        private Map<String, ?> oauthConfig;
        private String authHeaderKeyOverride;
        private Map<String, Object> additionalProperties = new LinkedHashMap<>();

        private Builder(AuthPatternType type, String displayName) {
            this.type = type;
            this.displayName = displayName;
        }

        /**
         * Sets the explanation shown to the user.
         *
         * @param description the description
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Marks the provider as fronting an MCP server.
         *
         * @param isMcp the flag
         * @return this builder
         */
        public Builder isMcp(boolean isMcp) {
            this.isMcp = isMcp;
            return this;
        }

        /**
         * Sets the credential inputs, replacing any set before. Leave empty for {@code OAUTH} and
         * {@code NO_AUTH}.
         *
         * @param fields the inputs; null clears them
         * @return this builder
         */
        public Builder fields(List<AuthField> fields) {
            this.fields = fields == null ? new ArrayList<AuthField>() : new ArrayList<>(fields);
            return this;
        }

        /**
         * Adds one credential input.
         *
         * @param field the input
         * @return this builder
         * @throws IllegalArgumentException if {@code field} is null
         */
        public Builder addField(AuthField field) {
            if (field == null) {
                throw new IllegalArgumentException("field must not be null");
            }
            this.fields.add(field);
            return this;
        }

        /**
         * Sets the OAuth settings of an {@code OAUTH} pattern. An empty map uses the upstream
         * server's discovered defaults.
         *
         * @param oauthConfig JSON-compatible map, or null to leave it out
         * @return this builder
         */
        public Builder oauthConfig(Map<String, ?> oauthConfig) {
            this.oauthConfig = oauthConfig;
            return this;
        }

        /**
         * Sets the header an {@code API_KEY} credential is sent in.
         *
         * @param authHeaderKeyOverride the header name
         * @return this builder
         */
        public Builder authHeaderKeyOverride(String authHeaderKeyOverride) {
            this.authHeaderKeyOverride = authHeaderKeyOverride;
            return this;
        }

        /**
         * Sets attributes this SDK does not model, replacing any set before.
         *
         * @param additionalProperties JSON-compatible map; null clears them
         * @return this builder
         */
        public Builder additionalProperties(Map<String, ?> additionalProperties) {
            this.additionalProperties = additionalProperties == null ? new LinkedHashMap<String, Object>()
                    : new LinkedHashMap<String, Object>(additionalProperties);
            return this;
        }

        /**
         * Adds one attribute this SDK does not model. Modelled attributes win over an additional
         * property with the same JSON name.
         *
         * @param name  the JSON name
         * @param value a JSON-compatible value
         * @return this builder
         * @throws IllegalArgumentException if {@code name} is null
         */
        public Builder putAdditionalProperty(String name, Object value) {
            if (name == null) {
                throw new IllegalArgumentException("name must not be null");
            }
            this.additionalProperties.put(name, value);
            return this;
        }

        /**
         * Builds the pattern.
         *
         * @return the pattern
         * @throws IllegalArgumentException if the type is null, the fields contain null, or a map
         *                                  holds a value that is not JSON-compatible
         */
        public AuthPattern build() {
            return new AuthPattern(this);
        }
    }
}
