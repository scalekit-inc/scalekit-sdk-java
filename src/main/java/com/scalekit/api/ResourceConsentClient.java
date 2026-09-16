package com.scalekit.api;

import com.scalekit.api.util.ListUserConsentsOptions;
import com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse;
import com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientResponse;
import com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientResponse;
import com.scalekit.grpc.scalekit.v1.clients.GetResourceClientResponse;
import com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse;
import com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsResponse;
import com.scalekit.grpc.scalekit.v1.clients.ListResourceUserConsentsResponse;
import com.scalekit.grpc.scalekit.v1.clients.ListResourcesResponse;
import com.scalekit.grpc.scalekit.v1.clients.ResourceClient;
import com.scalekit.grpc.scalekit.v1.clients.ResourceType;
import com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentResponse;
import com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientResponse;
import com.google.protobuf.FieldMask;

/**
 * Client for reading resources, managing the API clients scoped to a
 * resource, and reading and revoking end-user consents granted against one.
 *
 * A consent records that one end user allowed a specific API client to act on
 * their behalf. Each consent identifies the user by its external user ID — the
 * identifier your application supplied for that user when the consent was
 * granted.
 */
public interface ResourceConsentClient {

    /**
     * Retrieves a single resource, including its scopes allowlist.
     *
     * A resource client's scopes are only actually granted in an issued
     * access token when they also appear in the resource's own scopes
     * allowlist, so this is how callers can check what will actually survive
     * that intersection before configuring a client's scopes.
     *
     * @param resourceId The resource to fetch (format: res_xxxxx)
     * @return GetResourceResponse with the resource, including its scopes
     */
    GetResourceResponse getResource(String resourceId);

    /**
     * Lists resources of a given type, with pagination.
     *
     * resourceType is required — the server rejects
     * RESOURCE_TYPE_UNSPECIFIED with an INVALID_ARGUMENT error rather than
     * treating it as "list every type".
     *
     * @param resourceType The type of resource to list; required, not RESOURCE_TYPE_UNSPECIFIED
     * @param pageSize     Max resources per page; 0 uses the server default, capped at 30 server-side
     * @param pageToken    Cursor for the next page; empty for the first page
     * @return ListResourcesResponse with resources and pagination cursors
     */
    ListResourcesResponse listResources(ResourceType resourceType, int pageSize, String pageToken);

    /**
     * Creates a new API client scoped to a resource.
     *
     * The response's plainSecret is the plaintext client secret, only
     * available at creation time. audience is ignored for MCP_SERVER/
     * MCP_GATEWAY resources, which get their audience from the resource
     * itself.
     *
     * @param resourceId The resource to create the client for (format: res_xxxxx)
     * @param client     ResourceClient proto with the desired client properties
     * @return CreateResourceClientResponse with the created client and plainSecret
     */
    CreateResourceClientResponse createResourceClient(String resourceId, ResourceClient client);

    /**
     * Retrieves a single API client scoped to a resource, along with the
     * end-users who have granted it consent.
     *
     * @param resourceId The resource the client must belong to (format: res_xxxxx)
     * @param clientId   The client ID (format: m2m_xxxxx)
     * @return GetResourceClientResponse with client metadata and consentedUsers
     */
    GetResourceClientResponse getResourceClient(String resourceId, String clientId);

    /**
     * Lists every API client scoped to a resource.
     *
     * @param resourceId The resource whose clients to list (format: res_xxxxx)
     * @return ListResourceClientsResponse with clients and DCR/static client counts
     */
    ListResourceClientsResponse listResourceClients(String resourceId);

    /**
     * Updates an existing API client scoped to a resource.
     *
     * updateMask lists which fields of client to change. Verified against a
     * live environment: the server only actually honors the mask for scopes,
     * customClaims and redirectUris — include one of those paths with an
     * empty value (e.g. an empty scopes list) to clear it. name/description
     * are applied whenever non-empty regardless of updateMask (an empty
     * string is a no-op, not a clear).
     *
     * "audience" is not a supported updateMask path — a resource client's
     * audience is fixed at creation and can never be changed via update, for
     * any resource type, so this throws IllegalArgumentException rather than
     * silently accepting a path that can never take effect.
     *
     * @param resourceId The resource the client must belong to (format: res_xxxxx)
     * @param clientId   The client ID to update
     * @param client     ResourceClient proto with the fields to update
     * @param updateMask Field paths in client to apply; null or empty applies no partial-update mask
     * @return UpdateResourceClientResponse with updated client metadata
     */
    UpdateResourceClientResponse updateResourceClient(String resourceId, String clientId, ResourceClient client, FieldMask updateMask);

    /**
     * Permanently deletes an API client scoped to a resource.
     *
     * DeleteResourceClient shares its underlying delete path with client
     * deletion in general, so nothing forces the given clientId to actually
     * belong to resourceId. Since this method lives on resources(), callers
     * reasonably expect it to only ever touch clients within that resource —
     * so this fetches the client first and verifies its own resourceId
     * matches before deleting, refusing instead of trusting the id pair
     * blindly.
     *
     * @param resourceId The resource the client must belong to (format: res_xxxxx)
     * @param clientId   The client ID to delete
     * @return DeleteResourceClientResponse on success; throws if the client does not belong to resourceId
     */
    DeleteResourceClientResponse deleteResourceClient(String resourceId, String clientId);

    /**
     * Creates a new secret for an API client scoped to a resource.
     *
     * The underlying secret-creation call is keyed by clientId alone — it has
     * no notion of a resource — so this fetches the client first and verifies
     * it belongs to resourceId before creating a secret for it, the same
     * ownership check deleteResourceClient applies.
     *
     * The backend caps how many secrets a client can hold at once (a
     * configurable limit — 5 in Scalekit's own dev environment, verified
     * live; treat the exact number as environment-specific, not a fixed
     * constant). Exceeding it throws (the server rejects it as
     * INVALID_ARGUMENT, "only N secrets are allowed") — delete an existing
     * secret first via deleteResourceClientSecret. The dashboard itself is
     * more conservative than the server limit: it only shows an "Add new
     * secret" action while a client has fewer than 2 secrets. Match
     * whichever threshold — the actual server limit or the dashboard's
     * stricter 2 — fits your own UX.
     *
     * @param resourceId the resource the client must belong to (format: res_xxxxx)
     * @param clientId the client id to create a secret for
     * @return CreateClientSecretResponse with the new secret's plain value and metadata
     */
    CreateClientSecretResponse createResourceClientSecret(String resourceId, String clientId);

    /**
     * Permanently deletes a secret from an API client scoped to a resource.
     *
     * Like createResourceClientSecret, the underlying delete call is keyed by
     * clientId alone, so this verifies the client belongs to resourceId first
     * rather than trusting the id pair blindly.
     *
     * A client must always keep at least 1 secret. Calling this on a
     * client's last remaining secret throws (the server rejects it as
     * INVALID_ARGUMENT, "at least one secret is required"). Mirror the
     * dashboard's own UX: only offer a "Revoke" action on a secret while
     * the client has more than 1.
     *
     * @param resourceId the resource the client must belong to (format: res_xxxxx)
     * @param clientId the client id the secret belongs to
     * @param secretId the secret id to delete
     */
    void deleteResourceClientSecret(String resourceId, String clientId, String secretId);

    /**
     * Lists the end-user consents granted against a resource, with pagination.
     *
     * Each returned consent carries id, externalUserId, clientId, clientName,
     * scopes and grantedAt. The response also carries totalSize plus
     * nextPageToken / prevPageToken cursors.
     *
     * @param resourceId The resource to list consents for (format: res_xxxxx)
     * @param options    Filter and pagination options; null is treated as no options
     * @return ListResourceUserConsentsResponse with consents and pagination cursors
     */
    ListResourceUserConsentsResponse listUserConsents(String resourceId, ListUserConsentsOptions options);

    /**
     * Revokes a single end-user consent held by an API client.
     *
     * Deletes the consent, so the client is prompted for consent again on its
     * next authorization attempt, and revokes every active refresh token issued
     * to that client for the same user. Access tokens already issued stay valid
     * until they expire.
     *
     * @param clientId  The API client holding the consent (format: m2m_xxxxx), not the resource id
     * @param consentId The consent to revoke (format: usrcnst_xxxxx)
     * @return RevokeUserConsentResponse
     */
    RevokeUserConsentResponse revokeUserConsent(String clientId, String consentId);
}
