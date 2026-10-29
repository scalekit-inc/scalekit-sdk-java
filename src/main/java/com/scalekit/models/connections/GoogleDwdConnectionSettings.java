package com.scalekit.models.connections;

import com.scalekit.internal.Preconditions;
import com.scalekit.internal.Redaction;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * The Google Workspace domain-wide delegation settings of an app connection. The service account
 * key is a secret: {@link #toString()} never prints it, and the server returns it masked. A masked
 * value sent back in an update keeps the stored key. Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class GoogleDwdConnectionSettings {

    private final String serviceAccountJson;
    private final String tokenUri;
    private final List<String> scopes;

    private GoogleDwdConnectionSettings(Builder builder) {
        this.serviceAccountJson = Preconditions.emptyToNull(builder.serviceAccountJson);
        this.tokenUri = Preconditions.emptyToNull(builder.tokenUri);
        this.scopes = Preconditions.copyStrings(builder.scopes, "scopes");
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
     * Returns a builder initialised with these settings.
     *
     * @return the builder
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.serviceAccountJson = serviceAccountJson;
        builder.tokenUri = tokenUri;
        builder.scopes = scopes;
        return builder;
    }

    /**
     * Returns the service account key, as JSON. A secret.
     *
     * <p>Read back from the server, the value is masked (a fixed prefix and the service account's
     * email), not JSON. Sending a masked value back in an update keeps the stored key.
     *
     * @return the value, or empty when not set
     */
    public Optional<String> serviceAccountJson() {
        return Optional.ofNullable(serviceAccountJson);
    }

    /**
     * Returns the token endpoint.
     *
     * @return the value, or empty when not set
     */
    public Optional<String> tokenUri() {
        return Optional.ofNullable(tokenUri);
    }

    /**
     * Returns the delegated scopes.
     *
     * @return an unmodifiable list, never null
     */
    public List<String> scopes() {
        return scopes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GoogleDwdConnectionSettings)) {
            return false;
        }
        GoogleDwdConnectionSettings that = (GoogleDwdConnectionSettings) o;
        return Objects.equals(serviceAccountJson, that.serviceAccountJson)
                && Objects.equals(tokenUri, that.tokenUri)
                && scopes.equals(that.scopes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceAccountJson, tokenUri, scopes);
    }

    @Override
    public String toString() {
        return "GoogleDwdConnectionSettings{serviceAccountJson=" + Redaction.secret(serviceAccountJson)
                + ", tokenUri=" + tokenUri + ", scopes=" + scopes + "}";
    }

    /**
     * Builder for {@link GoogleDwdConnectionSettings}. Fields left unset are not sent.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String serviceAccountJson;
        private String tokenUri;
        private List<String> scopes;

        private Builder() {
        }

        /**
         * Sets the service account key, as JSON. A masked value read from the server keeps the
         * stored key.
         *
         * @param serviceAccountJson the value
         * @return this builder
         */
        public Builder serviceAccountJson(String serviceAccountJson) {
            this.serviceAccountJson = serviceAccountJson;
            return this;
        }

        /**
         * Sets the token endpoint.
         *
         * @param tokenUri the value
         * @return this builder
         */
        public Builder tokenUri(String tokenUri) {
            this.tokenUri = tokenUri;
            return this;
        }

        /**
         * Sets the delegated scopes.
         *
         * @param scopes the values; null means none
         * @return this builder
         */
        public Builder scopes(List<String> scopes) {
            this.scopes = scopes;
            return this;
        }

        /**
         * Builds the settings.
         *
         * @return the settings
         * @throws IllegalArgumentException if a list contains null
         */
        public GoogleDwdConnectionSettings build() {
            return new GoogleDwdConnectionSettings(this);
        }
    }
}
