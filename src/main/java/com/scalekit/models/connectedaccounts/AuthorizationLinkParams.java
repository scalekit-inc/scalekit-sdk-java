package com.scalekit.models.connectedaccounts;

import com.scalekit.internal.Preconditions;

import java.util.Optional;

/**
 * Optional settings for {@link com.scalekit.api.ConnectedAccountsClient#getMagicLink(ConnectedAccountRef, AuthorizationLinkParams)}.
 *
 * <pre>{@code
 * AuthorizationLinkParams params = AuthorizationLinkParams.builder()
 *         .state(csrfToken)
 *         .userVerifyUrl("https://app.example.com/connect/verify")
 *         .build();
 * }</pre>
 *
 * <p>Empty strings are treated as unset. Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class AuthorizationLinkParams {

    private final String state;
    private final String userVerifyUrl;

    private AuthorizationLinkParams(Builder builder) {
        this.state = Preconditions.emptyToNull(builder.state);
        this.userVerifyUrl = Preconditions.emptyToNull(builder.userVerifyUrl);
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
     * Returns a builder initialised with these parameters.
     *
     * @return the builder
     */
    public Builder toBuilder() {
        return new Builder().state(state).userVerifyUrl(userVerifyUrl);
    }

    /**
     * Returns the state value passed back to your app.
     *
     * @return the state, or empty
     */
    public Optional<String> state() {
        return Optional.ofNullable(state);
    }

    /**
     * Returns the URL the user is sent to for verification.
     *
     * @return the URL, or empty
     */
    public Optional<String> userVerifyUrl() {
        return Optional.ofNullable(userVerifyUrl);
    }

    @Override
    public String toString() {
        return "AuthorizationLinkParams{state=" + (state == null ? null : "<set>")
                + ", userVerifyUrl=" + userVerifyUrl + "}";
    }

    /**
     * Builder for {@link AuthorizationLinkParams}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String state;
        private String userVerifyUrl;

        private Builder() {
        }

        /**
         * Sets an opaque value, such as a CSRF token, that Scalekit passes back to your app after
         * the user connects (at most 512 characters).
         *
         * @param state the value
         * @return this builder
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Sets the URL in your app where the user is sent so you can confirm they are who the
         * account's identifier says; then call
         * {@link com.scalekit.api.ConnectedAccountsClient#verifyUser(String, String)}. Must start
         * with {@code http://} or {@code https://}.
         *
         * @param userVerifyUrl the URL
         * @return this builder
         */
        public Builder userVerifyUrl(String userVerifyUrl) {
            this.userVerifyUrl = userVerifyUrl;
            return this;
        }

        /**
         * Builds the parameters.
         *
         * @return the parameters
         */
        public AuthorizationLinkParams build() {
            return new AuthorizationLinkParams(this);
        }
    }
}
