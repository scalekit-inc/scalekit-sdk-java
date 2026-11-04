package com.scalekit.models.connections;

import com.scalekit.internal.JsonValues;
import com.scalekit.internal.Preconditions;

import java.util.Map;
import java.util.Optional;

/**
 * A new app connection, for
 * {@link com.scalekit.api.ConnectionClient#createEnvironmentConnection(CreateEnvironmentConnectionParams)}.
 *
 * <pre>{@code
 * CreateEnvironmentConnectionParams params = CreateEnvironmentConnectionParams.appConnection("GMAIL").build();
 * }</pre>
 *
 * <p>Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class CreateEnvironmentConnectionParams {

    private final String providerKey;
    private final EnvironmentConnectionType type;
    private final String connectionName;
    private final EnvironmentConnectionAuthMode authMode;
    private final Map<String, Object> context;

    private CreateEnvironmentConnectionParams(Builder builder) {
        this.providerKey = Preconditions.requireNonBlank(builder.providerKey, "providerKey");
        this.type = builder.type;
        this.connectionName = Preconditions.trimToNull(builder.connectionName);
        this.authMode = builder.authMode;
        this.context = builder.context == null ? null : JsonValues.copyObject(builder.context, "context");
    }

    /**
     * Returns a builder for an app connection: one whose connected accounts agents act through.
     *
     * @param providerKey the provider, for example {@code "GMAIL"}
     * @return the builder
     */
    public static Builder appConnection(String providerKey) {
        return new Builder(providerKey);
    }

    /**
     * Returns the provider key.
     *
     * @return the trimmed key
     */
    public String providerKey() {
        return providerKey;
    }

    /**
     * Returns the authentication type.
     *
     * @return the type, or empty to let the server choose
     */
    public Optional<EnvironmentConnectionType> type() {
        return Optional.ofNullable(type);
    }

    /**
     * Returns the requested connection name.
     *
     * @return the name, or empty to let the server generate one
     */
    public Optional<String> connectionName() {
        return Optional.ofNullable(connectionName);
    }

    /**
     * Returns the auth mode.
     *
     * @return the mode, or empty for the server default
     */
    public Optional<EnvironmentConnectionAuthMode> authMode() {
        return Optional.ofNullable(authMode);
    }

    /**
     * Returns the connection context.
     *
     * @return an unmodifiable map, or empty
     */
    public Optional<Map<String, Object>> context() {
        return Optional.ofNullable(context);
    }

    @Override
    public String toString() {
        return "CreateEnvironmentConnectionParams{providerKey=" + providerKey + ", type=" + type
                + ", connectionName=" + connectionName + ", authMode=" + authMode
                + ", context=" + (context == null ? null : context.keySet()) + "}";
    }

    /**
     * Builder for {@link CreateEnvironmentConnectionParams}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private final String providerKey;
        private EnvironmentConnectionType type;
        private String connectionName;
        private EnvironmentConnectionAuthMode authMode;
        private Map<String, ?> context;

        private Builder(String providerKey) {
            this.providerKey = providerKey;
        }

        /**
         * Sets the authentication type.
         *
         * @param type the type
         * @return this builder
         */
        public Builder type(EnvironmentConnectionType type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the connection name. Without one, the server uses the provider's name in lower case,
         * or adds a random suffix when that is taken.
         *
         * @param connectionName the name
         * @return this builder
         */
        public Builder connectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        /**
         * Sets whether each user connects their own account or one credential serves an
         * organization.
         *
         * @param authMode the mode
         * @return this builder
         */
        public Builder authMode(EnvironmentConnectionAuthMode authMode) {
            this.authMode = authMode;
            return this;
        }

        /**
         * Sets the connection context.
         *
         * @param context JSON-compatible map, or null
         * @return this builder
         */
        public Builder context(Map<String, ?> context) {
            this.context = context;
            return this;
        }

        /**
         * Builds the parameters.
         *
         * @return the parameters
         * @throws IllegalArgumentException if the provider key is blank or the context is not
         *                                  JSON-compatible
         */
        public CreateEnvironmentConnectionParams build() {
            return new CreateEnvironmentConnectionParams(this);
        }
    }
}
