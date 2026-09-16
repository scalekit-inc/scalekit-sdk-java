package com.scalekit.api.impl;

import com.google.protobuf.FieldMask;
import com.scalekit.Environment;
import com.scalekit.api.ResourceConsentClient;
import com.scalekit.api.util.ListUserConsentsOptions;
import com.scalekit.grpc.scalekit.v1.clients.*;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.ManagedChannel;

import java.util.concurrent.TimeUnit;

/**
 * Implementation of the ResourceConsentClient interface for reading
 * resources, managing the API clients scoped to a resource, and reading and
 * revoking the end-user consents granted against one.
 */
public class ScalekitResourceConsentClient implements ResourceConsentClient {

    private final ClientServiceGrpc.ClientServiceBlockingStub clientStub;
    private final ScalekitCredentials credentials;

    public ScalekitResourceConsentClient(ManagedChannel channel, ScalekitCredentials credentials) {
        this.credentials = credentials;
        this.clientStub = ClientServiceGrpc
                .newBlockingStub(channel)
                .withCallCredentials(this.credentials);
    }

    @Override
    public GetResourceResponse getResource(String resourceId) {
        if (resourceId == null || resourceId.isEmpty()) {
            throw new IllegalArgumentException("resourceId is required");
        }
        GetResourceRequest request = GetResourceRequest.newBuilder()
                .setResourceId(resourceId)
                .build();
        return RetryExecuter.executeWithRetry(() ->
                this.clientStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .getResource(request),
                this.credentials);
    }

    @Override
    public ListResourcesResponse listResources(ResourceType resourceType, int pageSize, String pageToken) {
        if (resourceType == null) {
            throw new IllegalArgumentException("resourceType is required");
        }
        if (pageSize < 0) {
            throw new IllegalArgumentException("pageSize must be 0 (server default) or a positive integer");
        }
        ListResourcesRequest request = ListResourcesRequest.newBuilder()
                .setResourceType(resourceType)
                .setPageSize(pageSize)
                .setPageToken(pageToken != null ? pageToken : "")
                .build();
        return RetryExecuter.executeWithRetry(() ->
                this.clientStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .listResources(request),
                this.credentials);
    }

    @Override
    public CreateResourceClientResponse createResourceClient(String resourceId, ResourceClient client) {
        if (resourceId == null || resourceId.isEmpty()) {
            throw new IllegalArgumentException("resourceId is required");
        }
        if (client == null) {
            throw new IllegalArgumentException("client is required");
        }
        CreateResourceClientRequest request = CreateResourceClientRequest.newBuilder()
                .setResourceId(resourceId)
                .setClient(client)
                .build();
        return RetryExecuter.executeWithRetry(() ->
                this.clientStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .createResourceClient(request),
                this.credentials);
    }

    @Override
    public GetResourceClientResponse getResourceClient(String resourceId, String clientId) {
        if (resourceId == null || resourceId.isEmpty()) {
            throw new IllegalArgumentException("resourceId is required");
        }
        if (clientId == null || clientId.isEmpty()) {
            throw new IllegalArgumentException("clientId is required");
        }
        GetResourceClientRequest request = GetResourceClientRequest.newBuilder()
                .setResourceId(resourceId)
                .setClientId(clientId)
                .build();
        return RetryExecuter.executeWithRetry(() ->
                this.clientStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .getResourceClient(request),
                this.credentials);
    }

    @Override
    public ListResourceClientsResponse listResourceClients(String resourceId) {
        if (resourceId == null || resourceId.isEmpty()) {
            throw new IllegalArgumentException("resourceId is required");
        }
        ListResourceClientsRequest request = ListResourceClientsRequest.newBuilder()
                .setResourceId(resourceId)
                .build();
        return RetryExecuter.executeWithRetry(() ->
                this.clientStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .listResourceClients(request),
                this.credentials);
    }

    @Override
    public UpdateResourceClientResponse updateResourceClient(String resourceId, String clientId, ResourceClient client, FieldMask updateMask) {
        if (resourceId == null || resourceId.isEmpty()) {
            throw new IllegalArgumentException("resourceId is required");
        }
        if (clientId == null || clientId.isEmpty()) {
            throw new IllegalArgumentException("clientId is required");
        }
        if (client == null) {
            throw new IllegalArgumentException("client is required");
        }
        if (updateMask != null && updateMask.getPathsList().contains("audience")) {
            throw new IllegalArgumentException("audience cannot be changed via update; it is fixed at creation");
        }
        UpdateResourceClientRequest.Builder request = UpdateResourceClientRequest.newBuilder()
                .setResourceId(resourceId)
                .setClientId(clientId)
                .setClient(client);
        if (updateMask != null && updateMask.getPathsCount() > 0) {
            request.setUpdateMask(updateMask);
        }
        UpdateResourceClientRequest builtRequest = request.build();
        return RetryExecuter.executeWithRetry(() ->
                this.clientStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .updateResourceClient(builtRequest),
                this.credentials);
    }

    @Override
    public DeleteResourceClientResponse deleteResourceClient(String resourceId, String clientId) {
        if (resourceId == null || resourceId.isEmpty()) {
            throw new IllegalArgumentException("resourceId is required");
        }
        if (clientId == null || clientId.isEmpty()) {
            throw new IllegalArgumentException("clientId is required");
        }

        GetResourceClientResponse fetched = getResourceClient(resourceId, clientId);
        if (fetched.getClient() == null || !resourceId.equals(fetched.getClient().getResourceId())) {
            throw new IllegalArgumentException("Client " + clientId + " does not belong to resource " + resourceId);
        }

        DeleteResourceClientRequest request = DeleteResourceClientRequest.newBuilder()
                .setResourceId(resourceId)
                .setClientId(clientId)
                .build();
        return RetryExecuter.executeWithRetry(() ->
                this.clientStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .deleteResourceClient(request),
                this.credentials);
    }

    @Override
    public CreateClientSecretResponse createResourceClientSecret(String resourceId, String clientId) {
        if (resourceId == null || resourceId.isEmpty()) {
            throw new IllegalArgumentException("resourceId is required");
        }
        if (clientId == null || clientId.isEmpty()) {
            throw new IllegalArgumentException("clientId is required");
        }

        GetResourceClientResponse fetched = getResourceClient(resourceId, clientId);
        if (fetched.getClient() == null || !resourceId.equals(fetched.getClient().getResourceId())) {
            throw new IllegalArgumentException("Client " + clientId + " does not belong to resource " + resourceId);
        }

        CreateClientSecretRequest request = CreateClientSecretRequest.newBuilder()
                .setClientId(clientId)
                .build();
        return RetryExecuter.executeWithRetry(() ->
                this.clientStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .createClientSecret(request),
                this.credentials);
    }

    @Override
    public void deleteResourceClientSecret(String resourceId, String clientId, String secretId) {
        if (resourceId == null || resourceId.isEmpty()) {
            throw new IllegalArgumentException("resourceId is required");
        }
        if (clientId == null || clientId.isEmpty()) {
            throw new IllegalArgumentException("clientId is required");
        }
        if (secretId == null || secretId.isEmpty()) {
            throw new IllegalArgumentException("secretId is required");
        }

        GetResourceClientResponse fetched = getResourceClient(resourceId, clientId);
        if (fetched.getClient() == null || !resourceId.equals(fetched.getClient().getResourceId())) {
            throw new IllegalArgumentException("Client " + clientId + " does not belong to resource " + resourceId);
        }

        DeleteClientSecretRequest request = DeleteClientSecretRequest.newBuilder()
                .setClientId(clientId)
                .setSecretId(secretId)
                .build();
        RetryExecuter.executeWithRetry(() ->
                this.clientStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .deleteClientSecret(request),
                this.credentials);
    }

    @Override
    public ListResourceUserConsentsResponse listUserConsents(String resourceId, ListUserConsentsOptions options) {
        if (resourceId == null || resourceId.isEmpty()) {
            throw new IllegalArgumentException("resourceId is required");
        }
        ListUserConsentsOptions effectiveOptions = options != null ? options : ListUserConsentsOptions.builder().build();
        if (effectiveOptions.getPageSize() < 0) {
            throw new IllegalArgumentException("pageSize must be 0 (server default) or a positive integer");
        }

        ListResourceUserConsentsRequest.Builder request = ListResourceUserConsentsRequest.newBuilder()
                .setResourceId(resourceId)
                .setPageSize(effectiveOptions.getPageSize())
                .setPageToken(effectiveOptions.getPageToken() != null ? effectiveOptions.getPageToken() : "");

        if (effectiveOptions.getSearch() != null) {
            request.setSearch(effectiveOptions.getSearch());
        }
        // The filter takes precedence over search server-side, so only attach it
        // when the caller actually supplied user IDs — an empty filter would
        // otherwise suppress a search the caller did supply.
        if (effectiveOptions.getUserIds() != null && !effectiveOptions.getUserIds().isEmpty()) {
            request.setFilter(ResourceUserConsentFilter.newBuilder()
                    .addAllExternalUserId(effectiveOptions.getUserIds())
                    .build());
        }

        ListResourceUserConsentsRequest builtRequest = request.build();
        return RetryExecuter.executeWithRetry(() ->
                this.clientStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .listResourceUserConsents(builtRequest),
                this.credentials);
    }

    @Override
    public RevokeUserConsentResponse revokeUserConsent(String clientId, String consentId) {
        if (clientId == null || clientId.isEmpty()) {
            throw new IllegalArgumentException("clientId is required");
        }
        if (consentId == null || consentId.isEmpty()) {
            throw new IllegalArgumentException("consentId is required");
        }
        RevokeUserConsentRequest request = RevokeUserConsentRequest.newBuilder()
                .setClientId(clientId)
                .setConsentId(consentId)
                .build();
        return RetryExecuter.executeWithRetry(() ->
                this.clientStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .revokeUserConsent(request),
                this.credentials);
    }
}
