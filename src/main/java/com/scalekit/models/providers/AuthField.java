package com.scalekit.models.providers;

import com.scalekit.internal.JsonValues;
import com.scalekit.internal.Preconditions;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * One credential input that a user fills in while connecting to a custom provider, used with
 * {@code BEARER}, {@code API_KEY} and {@code BASIC} patterns.
 *
 * <p>Attributes this SDK does not model (for example the options of a {@code select} input) are
 * kept in {@link #additionalProperties()} and sent back unchanged, so a field read from a
 * {@link Provider} can be passed to an update without losing them. Immutable and thread-safe.
 *
 * <pre>{@code
 * AuthField apiKey = AuthField.builder("api_key")
 *         .label("API key")
 *         .inputType("password")
 *         .required(true)
 *         .build();
 * }</pre>
 *
 * @since 2.6.0
 */
public final class AuthField {

    private final String fieldName;
    private final String label;
    private final String inputType;
    private final String hint;
    private final Boolean required;
    private final Map<String, Object> additionalProperties;

    private AuthField(Builder builder) {
        this.fieldName = Preconditions.nullToEmpty(builder.fieldName);
        this.label = Preconditions.emptyToNull(builder.label);
        this.inputType = Preconditions.emptyToNull(builder.inputType);
        this.hint = Preconditions.emptyToNull(builder.hint);
        this.required = builder.required;
        this.additionalProperties = builder.additionalProperties.isEmpty() ? Collections.<String, Object>emptyMap()
                : JsonValues.copyObject(builder.additionalProperties, "additionalProperties");
    }

    /**
     * Returns a new builder.
     *
     * @param fieldName the key the credential is stored under, for example {@code token} or
     *                  {@code api_key}
     * @return the builder
     */
    public static Builder builder(String fieldName) {
        return new Builder(fieldName);
    }

    /**
     * Returns a builder initialised with this field's values.
     *
     * @return the builder
     */
    public Builder toBuilder() {
        Builder builder = new Builder(fieldName).label(label).inputType(inputType).hint(hint)
                .additionalProperties(additionalProperties);
        builder.required = required;
        return builder;
    }

    /**
     * Returns the key the credential is stored under.
     *
     * @return the name, never null
     */
    public String fieldName() {
        return fieldName;
    }

    /**
     * Returns the label shown above the input.
     *
     * @return the label, or empty
     */
    public Optional<String> label() {
        return Optional.ofNullable(label);
    }

    /**
     * Returns the input type, such as {@code text}, {@code password} or {@code select}.
     *
     * @return the type, or empty
     */
    public Optional<String> inputType() {
        return Optional.ofNullable(inputType);
    }

    /**
     * Returns the helper text shown with the input.
     *
     * @return the hint, or empty
     */
    public Optional<String> hint() {
        return Optional.ofNullable(hint);
    }

    /**
     * Returns whether the user must fill the input in.
     *
     * @return the flag, or empty when not set
     */
    public Optional<Boolean> required() {
        return Optional.ofNullable(required);
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
        if (!(o instanceof AuthField)) {
            return false;
        }
        AuthField that = (AuthField) o;
        return fieldName.equals(that.fieldName) && Objects.equals(label, that.label)
                && Objects.equals(inputType, that.inputType) && Objects.equals(hint, that.hint)
                && Objects.equals(required, that.required) && additionalProperties.equals(that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldName, label, inputType, hint, required, additionalProperties);
    }

    @Override
    public String toString() {
        return "AuthField{fieldName=" + fieldName + ", label=" + label + ", inputType=" + inputType
                + ", hint=" + hint + ", required=" + required + ", additionalProperties=" + additionalProperties + "}";
    }

    /**
     * Builder for {@link AuthField}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private final String fieldName;
        private String label;
        private String inputType;
        private String hint;
        private Boolean required;
        private Map<String, Object> additionalProperties = new LinkedHashMap<>();

        private Builder(String fieldName) {
            this.fieldName = fieldName;
        }

        /**
         * Sets the label.
         *
         * @param label the label
         * @return this builder
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Sets the input type. Use {@code password} for secrets so the UI masks them.
         *
         * @param inputType the type, for example {@code text}, {@code password} or {@code select}
         * @return this builder
         */
        public Builder inputType(String inputType) {
            this.inputType = inputType;
            return this;
        }

        /**
         * Sets the helper text.
         *
         * @param hint the text
         * @return this builder
         */
        public Builder hint(String hint) {
            this.hint = hint;
            return this;
        }

        /**
         * Sets whether the user must fill the input in.
         *
         * @param required the flag
         * @return this builder
         */
        public Builder required(boolean required) {
            this.required = required;
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
         * Builds the field.
         *
         * @return the field
         * @throws IllegalArgumentException if an additional property is not JSON-compatible
         */
        public AuthField build() {
            return new AuthField(this);
        }
    }
}
