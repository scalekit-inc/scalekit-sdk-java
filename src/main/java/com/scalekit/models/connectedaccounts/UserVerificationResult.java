package com.scalekit.models.connectedaccounts;

import com.scalekit.internal.Preconditions;

import java.util.Objects;
import java.util.Optional;

/**
 * The outcome of {@link com.scalekit.api.ConnectedAccountsClient#verifyUser(String, String)}.
 * Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class UserVerificationResult {

    private final String postUserVerifyRedirectUrl;

    private UserVerificationResult(Builder builder) {
        this.postUserVerifyRedirectUrl = Preconditions.emptyToNull(builder.postUserVerifyRedirectUrl);
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
     * Returns where to send the user after verification, to finish connecting.
     *
     * @return the URL, or empty
     */
    public Optional<String> postUserVerifyRedirectUrl() {
        return Optional.ofNullable(postUserVerifyRedirectUrl);
    }

    @Override
    public boolean equals(Object o) {
        return this == o || (o instanceof UserVerificationResult
                && Objects.equals(postUserVerifyRedirectUrl, ((UserVerificationResult) o).postUserVerifyRedirectUrl));
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(postUserVerifyRedirectUrl);
    }

    @Override
    public String toString() {
        return "UserVerificationResult{postUserVerifyRedirectUrl=" + postUserVerifyRedirectUrl + "}";
    }

    /**
     * Builder for {@link UserVerificationResult}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String postUserVerifyRedirectUrl;

        private Builder() {
        }

        /**
         * Sets the redirect URL.
         *
         * @param postUserVerifyRedirectUrl the URL, or null
         * @return this builder
         */
        public Builder postUserVerifyRedirectUrl(String postUserVerifyRedirectUrl) {
            this.postUserVerifyRedirectUrl = postUserVerifyRedirectUrl;
            return this;
        }

        /**
         * Builds the result.
         *
         * @return the result
         */
        public UserVerificationResult build() {
            return new UserVerificationResult(this);
        }
    }
}
