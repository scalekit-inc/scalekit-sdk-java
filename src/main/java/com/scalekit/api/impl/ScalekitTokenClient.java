package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.api.TokenClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.exceptions.TokenInvalidException;
import com.scalekit.grpc.scalekit.v1.tokens.*;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import com.google.protobuf.Timestamp;
import io.grpc.ManagedChannel;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * Implementation of the TokenClient interface for managing API tokens.
 */
public class ScalekitTokenClient implements TokenClient {

    private final ApiTokenServiceGrpc.ApiTokenServiceBlockingStub tokenStub;
    private final ScalekitCredentials credentials;

    public ScalekitTokenClient(ManagedChannel channel, ScalekitCredentials credentials) {
        try {
            this.credentials = credentials;
            this.tokenStub = ApiTokenServiceGrpc
                    .newBlockingStub(channel)
                    .withCallCredentials(this.credentials);
        } catch (StatusRuntimeException e) {
            throw new RuntimeException("Error creating Token client", e);
        }
    }

    /**
     * Creates a new API token for an organization.
     *
     * @param organizationId The organization ID to scope the token to
     * @return CreateTokenResponse containing the opaque token, token_id, and token_info
     */
    @Override
    public CreateTokenResponse create(String organizationId) {
        if (organizationId == null || organizationId.isEmpty()) {
            throw new IllegalArgumentException("organizationId is required");
        }
        return create(organizationId, null, null, null, null);
    }

    /**
     * Creates a new API token for an organization with custom options.
     *
     * @param organizationId The organization ID to scope the token to
     * @param userId         Optional user ID to scope the token to a specific user
     * @param customClaims   Optional custom claims key-value pairs
     * @param expiry         Optional expiry timestamp
     * @param description    Optional human-readable description
     * @return CreateTokenResponse containing the opaque token, token_id, and token_info
     */
    @Override
    public CreateTokenResponse create(String organizationId, String userId, Map<String, String> customClaims, Timestamp expiry, String description) {
        if (organizationId == null || organizationId.isEmpty()) {
            throw new IllegalArgumentException("organizationId is required");
        }
        CreateToken.Builder tokenBuilder = CreateToken.newBuilder()
                .setOrganizationId(organizationId);

        if (userId != null && !userId.isEmpty()) {
            tokenBuilder.setUserId(userId);
        }
        if (customClaims != null && !customClaims.isEmpty()) {
            tokenBuilder.putAllCustomClaims(customClaims);
        }
        if (expiry != null) {
            tokenBuilder.setExpiry(expiry);
        }
        if (description != null && !description.isEmpty()) {
            tokenBuilder.setDescription(description);
        }

        CreateTokenRequest request = CreateTokenRequest.newBuilder()
                .setToken(tokenBuilder.build())
                .build();

        return this.tokenStub
                .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                .createToken(request);
    }

    /**
     * Validates an API token and returns associated context.
     *
     * @param token The opaque token string or token_id (apit_xxxxx)
     * @return ValidateTokenResponse containing the token_info
     */
    @Override
    public ValidateTokenResponse validate(String token) {
        if (token == null || token.isEmpty()) {
            throw new IllegalArgumentException("token is required");
        }
        try {
            return RetryExecuter.executeWithRetry(() -> {
                ValidateTokenRequest request = ValidateTokenRequest.newBuilder()
                        .setToken(token)
                        .build();

                return this.tokenStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .validateToken(request);
            }, this.credentials);
        } catch (APIException e) {
            int code = e.getGrpcStatusCode();
            if (code == Status.Code.UNAUTHENTICATED.value()
                    || code == Status.Code.NOT_FOUND.value()
                    || code == Status.Code.INVALID_ARGUMENT.value()
                    || code == Status.Code.PERMISSION_DENIED.value()) {
                throw new TokenInvalidException(e);
            }
            throw e;
        }
    }

    /**
     * Invalidates (soft deletes) an API token.
     * This operation is idempotent - it succeeds even if the token was already invalidated.
     *
     * @param token The opaque token string or token_id (apit_xxxxx)
     */
    @Override
    public void invalidate(String token) {
        if (token == null || token.isEmpty()) {
            throw new IllegalArgumentException("token is required");
        }
        RetryExecuter.executeWithRetry(() -> {
            InvalidateTokenRequest request = InvalidateTokenRequest.newBuilder()
                    .setToken(token)
                    .build();

            try {
                this.tokenStub
                        .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                        .invalidateToken(request);
            } catch (StatusRuntimeException e) {
                if (e.getStatus().getCode() == Status.NOT_FOUND.getCode()) {
                    return null;
                }
                throw e;
            }
            return null;
        }, this.credentials);
    }

    /**
     * Lists API tokens for an organization with pagination.
     *
     * @param organizationId The organization ID to list tokens for
     * @param pageSize       Page size (default 10, max 30)
     * @param pageToken      Pagination cursor for next page
     * @return ListTokensResponse containing tokens, total_count, and pagination cursors
     */
    @Override
    public ListTokensResponse list(String organizationId, int pageSize, String pageToken) {
        if (organizationId == null || organizationId.isEmpty()) {
            throw new IllegalArgumentException("organizationId is required");
        }
        return list(organizationId, null, pageSize, pageToken);
    }

    /**
     * Lists API tokens for an organization and user with pagination.
     *
     * @param organizationId The organization ID to list tokens for
     * @param userId         The user ID to filter tokens for
     * @param pageSize       Page size (default 10, max 30)
     * @param pageToken      Pagination cursor for next page
     * @return ListTokensResponse containing tokens, total_count, and pagination cursors
     */
    @Override
    public ListTokensResponse list(String organizationId, String userId, int pageSize, String pageToken) {
        if (organizationId == null || organizationId.isEmpty()) {
            throw new IllegalArgumentException("organizationId is required");
        }
        String finalPageToken = pageToken;
        int finalPageSize = pageSize;
        if (Objects.isNull(finalPageToken)) {
            finalPageToken = "";
        }
        if (finalPageSize <= 0) {
            finalPageSize = 10;
        }
        final String effectivePageToken = finalPageToken;
        final int effectivePageSize = finalPageSize;
        final String effectiveUserId = userId;

        return RetryExecuter.executeWithRetry(() -> {
            ListTokensRequest.Builder requestBuilder = ListTokensRequest.newBuilder()
                    .setOrganizationId(organizationId)
                    .setPageSize(effectivePageSize)
                    .setPageToken(effectivePageToken);

            if (effectiveUserId != null && !effectiveUserId.isEmpty()) {
                requestBuilder.setUserId(effectiveUserId);
            }

            return this.tokenStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .listTokens(requestBuilder.build());
        }, this.credentials);
    }
}
