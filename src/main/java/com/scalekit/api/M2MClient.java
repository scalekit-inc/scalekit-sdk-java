package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientResponse;
import com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientResponse;
import com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientResponse;
import com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretResponse;
import com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsResponse;

/**
 * Interface for managing M2M (machine-to-machine) API clients per organization.
 *
 * Organization clients enable automated, headless system-to-system authentication
 * using the OAuth 2.0 client_credentials flow, scoped to a specific organization.
 */
public interface M2MClient {

    /**
     * Creates a new M2M API client for an organization.
     *
     * @param organizationId The organization ID to create the client for
     * @param client         OrganizationClient proto with desired properties (name, scopes, audience, customClaims)
     * @return CreateOrganizationClientResponse with clientId and plain secret (only returned once)
     */
    CreateOrganizationClientResponse createOrganizationClient(String organizationId, com.scalekit.grpc.scalekit.v1.clients.OrganizationClient client);

    /**
     * Retrieves details of a specific M2M client.
     *
     * @param organizationId The organization ID
     * @param clientId       The client ID (format: skc_xxxxx)
     * @return GetOrganizationClientResponse with client metadata and active secrets (values hidden)
     */
    GetOrganizationClientResponse getOrganizationClient(String organizationId, String clientId);

    /**
     * Updates the configuration of an existing M2M client.
     *
     * @param organizationId The organization ID
     * @param clientId       The client ID to update
     * @param client         OrganizationClient proto with fields to update
     * @return UpdateOrganizationClientResponse with updated client metadata
     */
    UpdateOrganizationClientResponse updateOrganizationClient(String organizationId, String clientId, com.scalekit.grpc.scalekit.v1.clients.OrganizationClient client);

    /**
     * Permanently deletes an M2M client from an organization.
     *
     * This operation cannot be undone. All associated secrets are invalidated.
     *
     * @param organizationId The organization ID
     * @param clientId       The client ID to delete
     */
    void deleteOrganizationClient(String organizationId, String clientId);

    /**
     * Creates a new secret for an M2M client.
     *
     * The plain secret value is returned only at creation time and cannot be retrieved again.
     *
     * @param organizationId The organization ID
     * @param clientId       The client ID to add a secret to
     * @return CreateOrganizationClientSecretResponse with secretId and plain secret
     */
    CreateOrganizationClientSecretResponse createOrganizationClientSecret(String organizationId, String clientId);

    /**
     * Permanently deletes a secret from an M2M client.
     *
     * @param organizationId The organization ID
     * @param clientId       The client ID
     * @param secretId       The secret ID to delete
     */
    void deleteOrganizationClientSecret(String organizationId, String clientId, String secretId);

    /**
     * Lists all M2M clients for an organization with pagination.
     *
     * @param organizationId The organization ID
     * @param pageSize       Page size (between 10 and 100; 0 uses server default)
     * @param pageToken      Pagination cursor for next page (null or empty for first page)
     * @return ListOrganizationClientsResponse with clients and pagination cursors
     */
    ListOrganizationClientsResponse listOrganizationClients(String organizationId, int pageSize, String pageToken);
}
