package com.scalekit.api;

import com.scalekit.exceptions.APIException;
import com.scalekit.exceptions.BadRequestException;
import com.scalekit.exceptions.ConflictException;
import com.scalekit.exceptions.NotFoundException;
import com.scalekit.models.Page;
import com.scalekit.models.providers.CustomProviderRequest;
import com.scalekit.models.providers.ListProvidersParams;
import com.scalekit.models.providers.Provider;

/**
 * Manages custom providers: connectors you define for third-party services that Scalekit does not
 * ship. Users connect accounts to them like any other provider, and you call them through
 * {@link ActionsClient#request}. Get it from {@link ActionsClient#providers()}.
 *
 * <pre>{@code
 * Provider provider = client.actions().providers().createCustomProvider(
 *         CustomProviderRequest.builder("Acme CRM", "https://api.acme.example")
 *                 .addAuthPattern(AuthPattern.builder(AuthPatternType.BEARER, "API token")
 *                         .addField(AuthField.builder("token").label("Token").inputType("password").build())
 *                         .build())
 *                 .build());
 * String identifier = provider.identifier();
 * }</pre>
 *
 * <p>Calls use the client's default deadline. Implementations are thread-safe. This interface is
 * not designed for implementation outside the SDK: mock it in tests, but do not implement it,
 * because methods may be added.
 *
 * @since 2.6.0
 */
public interface ProvidersClient {

    /**
     * Creates a custom provider. Never retried on transient failures.
     *
     * @param request the provider's definition
     * @return the new provider; its {@link Provider#identifier()} names it in later calls
     * @throws IllegalArgumentException if {@code request} is null
     * @throws BadRequestException if the definition is invalid, for example a name that clashes
     *                             with a built-in provider or no auth pattern
     * @throws ConflictException if a provider with the same name was just created
     * @throws APIException for other failures
     * @since 2.6.0
     */
    Provider createCustomProvider(CustomProviderRequest request);

    /**
     * Replaces a custom provider's definition. This is a full replacement: {@code proxyEnabled}
     * is always sent (default {@code true}), leaving metadata out clears the stored metadata, and
     * the server requires the auth patterns. The auth pattern's type and MCP flag cannot change.
     *
     * <pre>{@code
     * client.actions().providers().updateCustomProvider(provider.identifier(),
     *         CustomProviderRequest.builder(provider.displayName(), provider.proxyUrl().orElse(null))
     *                 .description("New description")
     *                 .proxyEnabled(provider.proxyEnabled())
     *                 .authPatterns(provider.authPatterns())
     *                 .metadata(provider.metadata())
     *                 .build());
     * }</pre>
     *
     * @param identifier the provider's identifier, from {@link Provider#identifier()}
     * @param request    the provider's full new definition
     * @return the updated provider
     * @throws IllegalArgumentException if {@code identifier} is null or empty, or {@code request} is null
     * @throws NotFoundException if the provider does not exist
     * @throws BadRequestException if the definition is invalid
     * @throws APIException for other failures
     * @since 2.6.0
     */
    Provider updateCustomProvider(String identifier, CustomProviderRequest request);

    /**
     * Deletes a custom provider. The server refuses while connections still use it. Deleting one
     * that does not exist fails with {@link NotFoundException}, including when a retry follows a
     * first attempt that succeeded.
     *
     * @param identifier the provider's identifier
     * @throws IllegalArgumentException if {@code identifier} is null or empty
     * @throws NotFoundException if the provider does not exist
     * @throws BadRequestException if connections still use it ({@code PROVIDER_HAS_EXISTING_CONNECTIONS})
     * @throws APIException for other failures
     * @since 2.6.0
     */
    void deleteCustomProvider(String identifier);

    /**
     * Lists the first page of the providers Scalekit ships.
     *
     * @return the first page of providers
     * @throws APIException if the request fails
     * @since 2.6.0
     */
    Page<Provider> listProviders();

    /**
     * Lists one page of providers: those Scalekit ships, your custom ones, or both.
     *
     * <pre>{@code
     * for (Provider provider : client.actions().providers().listProviders(
     *         ListProvidersParams.builder().providerType(ProviderType.CUSTOM).build()).autoPager()) {
     *     System.out.println(provider.identifier());
     * }
     * }</pre>
     *
     * @param params type, identifier and paging; null lists the built-in providers
     * @return one page of providers
     * @throws BadRequestException if the type is not supported
     * @throws APIException for other failures
     * @since 2.6.0
     */
    Page<Provider> listProviders(ListProvidersParams params);
}
