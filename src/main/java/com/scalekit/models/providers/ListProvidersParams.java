package com.scalekit.models.providers;

import com.scalekit.internal.Preconditions;

import java.util.Optional;
import java.util.OptionalInt;

/**
 * Optional filters and paging for
 * {@link com.scalekit.api.ProvidersClient#listProviders(ListProvidersParams)}.
 *
 * <pre>{@code
 * ListProvidersParams params = ListProvidersParams.builder().providerType(ProviderType.CUSTOM).build();
 * }</pre>
 *
 * <p>Blank strings are treated as unset. Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class ListProvidersParams {

    private final ProviderType providerType;
    private final String identifier;
    private final Integer pageSize;
    private final String pageToken;

    private ListProvidersParams(Builder builder) {
        this.providerType = builder.providerType;
        this.identifier = Preconditions.trimToNull(builder.identifier);
        this.pageSize = builder.pageSize;
        this.pageToken = Preconditions.emptyToNull(builder.pageToken);
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
        Builder builder = new Builder().providerType(providerType).identifier(identifier).pageToken(pageToken);
        builder.pageSize = pageSize;
        return builder;
    }

    /**
     * Returns which providers are listed.
     *
     * @return the type, or empty for the server default ({@link ProviderType#DEFAULT})
     */
    public Optional<ProviderType> providerType() {
        return Optional.ofNullable(providerType);
    }

    /**
     * Returns the provider identifier filter.
     *
     * @return the identifier, or empty
     */
    public Optional<String> identifier() {
        return Optional.ofNullable(identifier);
    }

    /**
     * Returns the page size.
     *
     * @return the page size, or empty for the server default (10)
     */
    public OptionalInt pageSize() {
        return pageSize == null ? OptionalInt.empty() : OptionalInt.of(pageSize);
    }

    /**
     * Returns the page token.
     *
     * @return the token, or empty for the first page
     */
    public Optional<String> pageToken() {
        return Optional.ofNullable(pageToken);
    }

    @Override
    public String toString() {
        return "ListProvidersParams{providerType=" + providerType + ", identifier=" + identifier
                + ", pageSize=" + pageSize + ", pageToken=" + pageToken + "}";
    }

    /**
     * Builder for {@link ListProvidersParams}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private ProviderType providerType;
        private String identifier;
        private Integer pageSize;
        private String pageToken;

        private Builder() {
        }

        /**
         * Selects built-in providers, custom ones, or both.
         *
         * @param providerType the type; null for the server default (built-in only)
         * @return this builder
         */
        public Builder providerType(ProviderType providerType) {
            this.providerType = providerType;
            return this;
        }

        /**
         * Lists only the provider with this identifier.
         *
         * @param identifier the provider identifier
         * @return this builder
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * Sets the maximum number of providers on one page. This limits one page, not the total.
         *
         * @param pageSize the page size
         * @return this builder
         */
        public Builder pageSize(int pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Sets the token of the page to fetch.
         *
         * @param pageToken a token from {@link com.scalekit.models.Page#nextPageToken()}
         * @return this builder
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

        /**
         * Builds the parameters.
         *
         * @return the parameters
         */
        public ListProvidersParams build() {
            return new ListProvidersParams(this);
        }
    }
}
