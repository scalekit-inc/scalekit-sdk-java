package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.api.M2MClient;
import com.scalekit.grpc.scalekit.v1.clients.*;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

/**
 * Implementation of the M2MClient interface for managing M2M organization clients.
 */
public class ScalekitM2MClient implements M2MClient {

    private final ClientServiceGrpc.ClientServiceBlockingStub clientStub;
    private final ScalekitCredentials credentials;

    public ScalekitM2MClient(ManagedChannel channel, ScalekitCredentials credentials) {
        this.credentials = credentials;
        this.clientStub = ClientServiceGrpc
                .newBlockingStub(channel)
                .withCallCredentials(this.credentials);
    }

    @Override
    public CreateOrganizationClientResponse createOrganizationClient(String organizationId, OrganizationClient client) {
        if (organizationId == null || organizationId.isEmpty()) {
            throw new IllegalArgumentException("organizationId is required");
        }
        if (client == null) {
            throw new IllegalArgumentException("client is required");
        }
        CreateOrganizationClientRequest request = CreateOrganizationClientRequest.newBuilder()
                .setOrganizationId(organizationId)
                .setClient(client)
                .build();
        return RetryExecuter.executeWithRetry(() ->
                this.clientStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .createOrganizationClient(request),
                this.credentials);
    }

    @Override
    public GetOrganizationClientResponse getOrganizationClient(String organizationId, String clientId) {
        if (organizationId == null || organizationId.isEmpty()) {
            throw new IllegalArgumentException("organizationId is required");
        }
        if (clientId == null || clientId.isEmpty()) {
            throw new IllegalArgumentException("clientId is required");
        }
        GetOrganizationClientRequest request = GetOrganizationClientRequest.newBuilder()
                .setOrganizationId(organizationId)
                .setClientId(clientId)
                .build();
        return RetryExecuter.executeWithRetry(() ->
                this.clientStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .getOrganizationClient(request),
                this.credentials);
    }

    @Override
    public UpdateOrganizationClientResponse updateOrganizationClient(String organizationId, String clientId, OrganizationClient client) {
        if (organizationId == null || organizationId.isEmpty()) {
            throw new IllegalArgumentException("organizationId is required");
        }
        if (clientId == null || clientId.isEmpty()) {
            throw new IllegalArgumentException("clientId is required");
        }
        if (client == null) {
            throw new IllegalArgumentException("client is required");
        }
        UpdateOrganizationClientRequest request = UpdateOrganizationClientRequest.newBuilder()
                .setOrganizationId(organizationId)
                .setClientId(clientId)
                .setClient(client)
                .build();
        return RetryExecuter.executeWithRetry(() ->
                this.clientStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .updateOrganizationClient(request),
                this.credentials);
    }

    @Override
    public void deleteOrganizationClient(String organizationId, String clientId) {
        if (organizationId == null || organizationId.isEmpty()) {
            throw new IllegalArgumentException("organizationId is required");
        }
        if (clientId == null || clientId.isEmpty()) {
            throw new IllegalArgumentException("clientId is required");
        }
        DeleteOrganizationClientRequest request = DeleteOrganizationClientRequest.newBuilder()
                .setOrganizationId(organizationId)
                .setClientId(clientId)
                .build();
        RetryExecuter.executeWithRetry(() -> {
            try {
                this.clientStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .deleteOrganizationClient(request);
            } catch (StatusRuntimeException e) {
                if (e.getStatus().getCode() == io.grpc.Status.NOT_FOUND.getCode()) {
                    return null;
                }
                throw e;
            }
            return null;
        }, this.credentials);
    }

    @Override
    public CreateOrganizationClientSecretResponse createOrganizationClientSecret(String organizationId, String clientId) {
        if (organizationId == null || organizationId.isEmpty()) {
            throw new IllegalArgumentException("organizationId is required");
        }
        if (clientId == null || clientId.isEmpty()) {
            throw new IllegalArgumentException("clientId is required");
        }
        CreateOrganizationClientSecretRequest request = CreateOrganizationClientSecretRequest.newBuilder()
                .setOrganizationId(organizationId)
                .setClientId(clientId)
                .build();
        return RetryExecuter.executeWithRetry(() ->
                this.clientStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .createOrganizationClientSecret(request),
                this.credentials);
    }

    @Override
    public void deleteOrganizationClientSecret(String organizationId, String clientId, String secretId) {
        if (organizationId == null || organizationId.isEmpty()) {
            throw new IllegalArgumentException("organizationId is required");
        }
        if (clientId == null || clientId.isEmpty()) {
            throw new IllegalArgumentException("clientId is required");
        }
        if (secretId == null || secretId.isEmpty()) {
            throw new IllegalArgumentException("secretId is required");
        }
        DeleteOrganizationClientSecretRequest request = DeleteOrganizationClientSecretRequest.newBuilder()
                .setOrganizationId(organizationId)
                .setClientId(clientId)
                .setSecretId(secretId)
                .build();
        RetryExecuter.executeWithRetry(() -> {
            try {
                this.clientStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .deleteOrganizationClientSecret(request);
            } catch (io.grpc.StatusRuntimeException e) {
                if (e.getStatus().getCode() == io.grpc.Status.NOT_FOUND.getCode()) {
                    return null;
                }
                throw e;
            }
            return null;
        }, this.credentials);
    }

    @Override
    public ListOrganizationClientsResponse listOrganizationClients(String organizationId, int pageSize, String pageToken) {
        if (organizationId == null || organizationId.isEmpty()) {
            throw new IllegalArgumentException("organizationId is required");
        }
        int effectivePageSize = pageSize > 0 ? Math.min(pageSize, 100) : 10;
        String effectivePageToken = pageToken != null ? pageToken : "";

        ListOrganizationClientsRequest request = ListOrganizationClientsRequest.newBuilder()
                .setOrganizationId(organizationId)
                .setPageSize(effectivePageSize)
                .setPageToken(effectivePageToken)
                .build();
        return RetryExecuter.executeWithRetry(() ->
                this.clientStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .listOrganizationClients(request),
                this.credentials);
    }
}
