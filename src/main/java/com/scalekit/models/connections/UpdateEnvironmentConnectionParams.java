package com.scalekit.models.connections;

import com.scalekit.internal.JsonValues;
import com.scalekit.internal.Preconditions;

import java.util.Map;
import java.util.Optional;

/**
 * The new definition of an environment connection, for
 * {@link com.scalekit.api.ConnectionClient#updateEnvironmentConnection(String, UpdateEnvironmentConnectionParams)}.
 *
 * <p>The server requires the connection name, the provider key and the type on every update, and
 * stores the connection name given here: pass the current name to keep it. On app connections only
 * the settings change; the other values are required but not otherwise applied. Set at most one
 * kind of settings.
 *
 * <pre>{@code
 * UpdateEnvironmentConnectionParams params = UpdateEnvironmentConnectionParams
 *         .builder("gmail", "GMAIL", EnvironmentConnectionType.OAUTH)
 *         .oauthSettings(OAuthConnectionSettings.builder()
 *                 .clientId(System.getenv("GMAIL_CLIENT_ID"))
 *                 .clientSecret(System.getenv("GMAIL_CLIENT_SECRET"))
 *                 .build())
 *         .build();
 * }</pre>
 *
 * <p>Immutable and thread-safe. {@link #toString()} never prints settings.
 *
 * @since 2.6.0
 */
public final class UpdateEnvironmentConnectionParams {

    private final String connectionName;
    private final String providerKey;
    private final EnvironmentConnectionType type;
    private final OAuthConnectionSettings oauthSettings;
    private final Map<String, Object> staticSettings;
    private final GoogleDwdConnectionSettings googleDwdSettings;

    private UpdateEnvironmentConnectionParams(Builder builder) {
        this.connectionName = Preconditions.requireNonBlank(builder.connectionName, "connectionName");
        this.providerKey = Preconditions.requireNonBlank(builder.providerKey, "providerKey");
        if (builder.type == null) {
            throw new IllegalArgumentException("type is required");
        }
        this.type = builder.type;
        int kinds = (builder.oauthSettings != null ? 1 : 0) + (builder.staticSettings != null ? 1 : 0)
                + (builder.googleDwdSettings != null ? 1 : 0);
        if (kinds > 1) {
            throw new IllegalArgumentException("set at most one of oauthSettings, staticSettings and googleDwdSettings");
        }
        this.oauthSettings = builder.oauthSettings;
        this.staticSettings = builder.staticSettings == null ? null
                : JsonValues.copyObject(builder.staticSettings, "staticSettings");
        this.googleDwdSettings = builder.googleDwdSettings;
    }

    /**
     * Returns a new builder.
     *
     * @param connectionName the connection's name; the server stores it, so pass the current name
     *                       to keep it
     * @param providerKey    the provider key, for example {@code "GMAIL"}
     * @param type           the authentication type
     * @return the builder
     */
    public static Builder builder(String connectionName, String providerKey, EnvironmentConnectionType type) {
        return new Builder(connectionName, providerKey, type);
    }

    /**
     * Returns the connection name.
     *
     * @return the trimmed name
     */
    public String connectionName() {
        return connectionName;
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
     * @return the type
     */
    public EnvironmentConnectionType type() {
        return type;
    }

    /**
     * Returns the OAuth settings.
     *
     * @return the settings, or empty
     */
    public Optional<OAuthConnectionSettings> oauthSettings() {
        return Optional.ofNullable(oauthSettings);
    }

    /**
     * Returns the static credential settings.
     *
     * @return an unmodifiable map, or empty
     */
    public Optional<Map<String, Object>> staticSettings() {
        return Optional.ofNullable(staticSettings);
    }

    /**
     * Returns the Google domain-wide delegation settings.
     *
     * @return the settings, or empty
     */
    public Optional<GoogleDwdConnectionSettings> googleDwdSettings() {
        return Optional.ofNullable(googleDwdSettings);
    }

    @Override
    public String toString() {
        String settings = oauthSettings != null ? "oauth" : staticSettings != null ? "static"
                : googleDwdSettings != null ? "googleDwd" : "none";
        return "UpdateEnvironmentConnectionParams{connectionName=" + connectionName + ", providerKey=" + providerKey
                + ", type=" + type + ", settings=" + settings + "}";
    }

    /**
     * Builder for {@link UpdateEnvironmentConnectionParams}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private final String connectionName;
        private final String providerKey;
        private final EnvironmentConnectionType type;
        private OAuthConnectionSettings oauthSettings;
        private Map<String, ?> staticSettings;
        private GoogleDwdConnectionSettings googleDwdSettings;

        private Builder(String connectionName, String providerKey, EnvironmentConnectionType type) {
            this.connectionName = connectionName;
            this.providerKey = providerKey;
            this.type = type;
        }

        /**
         * Sets OAuth settings.
         *
         * @param oauthSettings the settings
         * @return this builder
         */
        public Builder oauthSettings(OAuthConnectionSettings oauthSettings) {
            this.oauthSettings = oauthSettings;
            return this;
        }

        /**
         * Sets static credential settings.
         *
         * @param staticSettings JSON-compatible map
         * @return this builder
         */
        public Builder staticSettings(Map<String, ?> staticSettings) {
            this.staticSettings = staticSettings;
            return this;
        }

        /**
         * Sets Google domain-wide delegation settings.
         *
         * @param googleDwdSettings the settings
         * @return this builder
         */
        public Builder googleDwdSettings(GoogleDwdConnectionSettings googleDwdSettings) {
            this.googleDwdSettings = googleDwdSettings;
            return this;
        }

        /**
         * Builds the parameters.
         *
         * @return the parameters
         * @throws IllegalArgumentException if the connection name or provider key is blank, the type
         *                                  is null, more than one kind of settings is set, or the
         *                                  static settings are not JSON-compatible
         */
        public UpdateEnvironmentConnectionParams build() {
            return new UpdateEnvironmentConnectionParams(this);
        }
    }
}
