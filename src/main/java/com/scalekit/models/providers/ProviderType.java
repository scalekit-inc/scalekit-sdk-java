package com.scalekit.models.providers;

/**
 * Which providers {@link com.scalekit.api.ProvidersClient#listProviders(ListProvidersParams)}
 * returns. Used only in requests.
 *
 * @since 2.6.0
 */
public enum ProviderType {
    /** The providers Scalekit ships. This is what the server returns when no type is set. */
    DEFAULT,
    /** The custom providers of your environment. */
    CUSTOM,
    /** Both. */
    ALL
}
