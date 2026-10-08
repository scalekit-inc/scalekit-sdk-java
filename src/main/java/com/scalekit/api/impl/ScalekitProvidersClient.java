package com.scalekit.api.impl;

import com.scalekit.api.ProvidersClient;
import com.scalekit.grpc.scalekit.v1.providers.CreateCustomProvider;
import com.scalekit.grpc.scalekit.v1.providers.CreateCustomProviderRequest;
import com.scalekit.grpc.scalekit.v1.providers.CreateProviderResponse;
import com.scalekit.grpc.scalekit.v1.providers.DeleteProviderRequest;
import com.scalekit.grpc.scalekit.v1.providers.ProviderServiceGrpc;
import com.scalekit.grpc.scalekit.v1.providers.UpdateCustomProvider;
import com.scalekit.grpc.scalekit.v1.providers.UpdateCustomProviderRequest;
import com.scalekit.grpc.scalekit.v1.providers.UpdateProviderResponse;
import com.scalekit.internal.Preconditions;
import com.scalekit.internal.ScalekitCredentials;
import com.scalekit.models.providers.CustomProviderRequest;
import com.scalekit.models.providers.Provider;
import io.grpc.Channel;

/** {@link ProvidersClient} over gRPC. Thread-safe. */
public class ScalekitProvidersClient implements ProvidersClient {

    private final ProviderServiceGrpc.ProviderServiceBlockingStub stub;
    private final ScalekitCredentials credentials;

    /**
     * Creates the client.
     *
     * @param channel     the channel
     * @param credentials the credentials attached to every call
     */
    public ScalekitProvidersClient(Channel channel, ScalekitCredentials credentials) {
        this.credentials = credentials;
        this.stub = ProviderServiceGrpc.newBlockingStub(channel).withCallCredentials(credentials);
    }

    private ProviderServiceGrpc.ProviderServiceBlockingStub stub() {
        return stub.withDeadlineAfter(AgentKitCalls.controlPlaneTimeoutMillis(), AgentKitCalls.MILLIS);
    }

    @Override
    public Provider createCustomProvider(CustomProviderRequest request) {
        if (request == null) {
            throw new IllegalArgumentException("request is required");
        }
        CreateCustomProvider.Builder provider = CreateCustomProvider.newBuilder()
                .setDisplayName(request.displayName())
                .setProxyUrl(request.proxyUrl())
                .setProxyEnabled(request.proxyEnabled())
                .setAuthPatterns(AgentKitConverters.toListValue(request.authPatterns()))
                .putAllMetadata(request.metadata());
        request.description().ifPresent(provider::setDescription);
        request.iconSrc().ifPresent(provider::setIconSrc);
        final CreateCustomProviderRequest built = CreateCustomProviderRequest.newBuilder().setProvider(provider).build();
        CreateProviderResponse response = AgentKitCalls.call(ProviderServiceGrpc.getCreateCustomProviderMethod(),
                credentials, () -> stub().createCustomProvider(built));
        return AgentKitConverters.provider(response.getProvider());
    }

    @Override
    public Provider updateCustomProvider(String identifier, CustomProviderRequest request) {
        String id = Preconditions.requireNonEmpty(identifier, "identifier");
        if (request == null) {
            throw new IllegalArgumentException("request is required");
        }
        UpdateCustomProvider.Builder provider = UpdateCustomProvider.newBuilder()
                .setDisplayName(request.displayName())
                .setProxyUrl(request.proxyUrl())
                .setProxyEnabled(request.proxyEnabled())
                .setAuthPatterns(AgentKitConverters.toListValue(request.authPatterns()))
                .putAllMetadata(request.metadata());
        request.description().ifPresent(provider::setDescription);
        request.iconSrc().ifPresent(provider::setIconSrc);
        final UpdateCustomProviderRequest built = UpdateCustomProviderRequest.newBuilder()
                .setIdentifier(id)
                .setProvider(provider)
                .build();
        UpdateProviderResponse response = AgentKitCalls.call(ProviderServiceGrpc.getUpdateCustomProviderMethod(),
                credentials, () -> stub().updateCustomProvider(built));
        return AgentKitConverters.provider(response.getProvider());
    }

    @Override
    public void deleteCustomProvider(String identifier) {
        final DeleteProviderRequest built = DeleteProviderRequest.newBuilder()
                .setIdentifier(Preconditions.requireNonEmpty(identifier, "identifier"))
                .build();
        AgentKitCalls.call(ProviderServiceGrpc.getDeleteCustomProviderMethod(), credentials,
                () -> stub().deleteCustomProvider(built));
    }
}
