package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.api.ResourceConsentClient;
import com.scalekit.api.util.ListUserConsentsOptions;
import com.scalekit.grpc.scalekit.v1.clients.*;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.ManagedChannel;

import java.util.concurrent.TimeUnit;

/**
 * Implementation of the ResourceConsentClient interface for reading and
 * revoking the end-user consents granted against a resource.
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
