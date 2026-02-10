package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.tokens.*;
import com.google.protobuf.Timestamp;

import java.util.Map;

/**
 * Client interface for managing API tokens in Scalekit.
 *
 * API tokens provide programmatic access credentials for automated clients
 * and external systems. Each token is scoped to an organization and optionally
 * to a specific user.
 */
public interface TokenClient {

    /**
     * Creates a new API token for an organization.
     *
     * @param organizationId The organization ID to scope the token to
     * @return CreateTokenResponse containing the opaque token, token_id, and token_info
     */
    CreateTokenResponse create(String organizationId);

    /**
     * Creates a new API token for an organization with custom options.
     *
     * @param organizationId The organization ID to scope the token to
     * @param userId Optional user ID to scope the token to a specific user
     * @param customClaims Optional custom claims key-value pairs
     * @param expiry Optional expiry timestamp
     * @param description Optional human-readable description
     * @return CreateTokenResponse containing the opaque token, token_id, and token_info
     */
    CreateTokenResponse create(String organizationId, String userId, Map<String, String> customClaims, Timestamp expiry, String description);

    /**
     * Validates an API token and returns associated context.
     *
     * @param token The opaque token string or token_id (apit_xxxxx)
     * @return ValidateTokenResponse containing the token_info
     */
    ValidateTokenResponse validate(String token);

    /**
     * Invalidates (soft deletes) an API token.
     * This operation is idempotent - it succeeds even if the token was already invalidated.
     *
     * @param token The opaque token string or token_id (apit_xxxxx)
     */
    void invalidate(String token);

    /**
     * Lists API tokens for an organization with pagination.
     *
     * @param organizationId The organization ID to list tokens for
     * @param pageSize Page size (default 10, max 30)
     * @param pageToken Pagination cursor for next page
     * @return ListTokensResponse containing tokens, total_count, and pagination cursors
     */
    ListTokensResponse list(String organizationId, int pageSize, String pageToken);

    /**
     * Lists API tokens for an organization and user with pagination.
     *
     * @param organizationId The organization ID to list tokens for
     * @param userId The user ID to filter tokens for
     * @param pageSize Page size (default 10, max 30)
     * @param pageToken Pagination cursor for next page
     * @return ListTokensResponse containing tokens, total_count, and pagination cursors
     */
    ListTokensResponse list(String organizationId, String userId, int pageSize, String pageToken);
}
