package com.scalekit.api;

import com.scalekit.api.util.ListUserConsentsOptions;
import com.scalekit.grpc.scalekit.v1.clients.ListResourceUserConsentsResponse;
import com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentResponse;

/**
 * Interface for reading and revoking the end-user consents granted against a
 * resource, such as an MCP server.
 *
 * A consent records that one end user allowed a specific API client to act on
 * their behalf. Each consent identifies the user by its external user ID — the
 * identifier your application supplied for that user when the consent was
 * granted.
 */
public interface ResourceConsentClient {

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
