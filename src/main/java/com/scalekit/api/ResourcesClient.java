package com.scalekit.api;

import com.scalekit.api.util.ListUserConsentsOptions;
import com.scalekit.api.util.UpdateResourceClientOptions;
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

/**
 * Client for reading resources, managing the resource clients scoped to a
 * resource, and reading/revoking end-user consents granted against one.
 */
public interface ResourcesClient {

    /** Retrieves a single resource, including its scopes allowlist. */
    GetResourceResponse getResource(String resourceId); // resourceId format: res_xxxxx

    /** Lists resources of a given type, with pagination. */
    ListResourcesResponse listResources(ResourceType resourceType, int pageSize, String pageToken); // resourceType required, not UNSPECIFIED

    /** Creates a new resource client; response's plainSecret is only ever returned here. */
    CreateResourceClientResponse createResourceClient(String resourceId, ResourceClient client); // audience not settable via SDK

    /** Retrieves a single resource client, along with the end-users who have granted it consent. */
    GetResourceClientResponse getResourceClient(String resourceId, String clientId); // clientId format: m2m_xxxxx

    /** Lists every resource client belonging to a resource. */
    ListResourceClientsResponse listResourceClients(String resourceId);

    /** Updates an existing resource client; only non-null fields on options are changed. */
    UpdateResourceClientResponse updateResourceClient(String resourceId, String clientId, UpdateResourceClientOptions options); // only scopes/customClaims/redirectUris clearable

    /** Permanently deletes a resource client; refuses if the client doesn't belong to resourceId. */
    DeleteResourceClientResponse deleteResourceClient(String resourceId, String clientId);

    /** Creates a new secret for a resource client; refuses if the client doesn't belong to resourceId. */
    CreateClientSecretResponse createResourceClientSecret(String resourceId, String clientId); // server caps secrets per client

    /** Permanently deletes a secret from a resource client; refuses if the client doesn't belong to resourceId. */
    void deleteResourceClientSecret(String resourceId, String clientId, String secretId); // a client must keep >= 1 secret

    /** Lists the end-user consents granted against a resource, with pagination. */
    ListResourceUserConsentsResponse listUserConsents(String resourceId, ListUserConsentsOptions options); // options may be null

    /** Revokes a single end-user consent held by a resource client. */
    RevokeUserConsentResponse revokeUserConsent(String clientId, String consentId); // clientId (not resourceId) format: m2m_xxxxx
}
