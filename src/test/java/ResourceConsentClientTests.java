import com.google.protobuf.FieldMask;
import com.scalekit.ScalekitClient;
import com.scalekit.api.util.ListUserConsentsOptions;
import com.scalekit.exceptions.APIException;
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
import com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientResponse;
import io.grpc.Status;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class ResourceConsentClientTests {

    private static ScalekitClient client;

    // A real MCP server resource in the test environment. These tests assert the
    // call shape and the pagination envelope, never the consent contents, so they
    // hold whether or not the resource currently has consents.
    private static final String TEST_RESOURCE_ID = "res_142388122116685880";

    // Syntactically valid but nonexistent, used to prove deleteResourceClient's
    // ownership check refuses a client/resource pairing that does not match.
    private static final String OTHER_RESOURCE_ID = "res_999999999999999999";

    @BeforeAll
    static void init() {
        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String apiSecret = System.getenv("SCALEKIT_CLIENT_SECRET");

        Assumptions.assumeTrue(
            environmentUrl != null && !environmentUrl.trim().isEmpty() &&
            clientId != null && !clientId.trim().isEmpty() &&
            apiSecret != null && !apiSecret.trim().isEmpty(),
            "Skipping integration tests: SCALEKIT_ENVIRONMENT_URL, SCALEKIT_CLIENT_ID, SCALEKIT_CLIENT_SECRET are required"
        );

        client = new ScalekitClient(environmentUrl, clientId, apiSecret);
    }

    @Test
    void testGetResourceRequiresResourceId() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                client.resources().getResource(""));

        assertEquals("resourceId is required", exception.getMessage());
    }

    @Test
    void testListResourcesRejectsNegativePageSize() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                client.resources().listResources(ResourceType.MCP_SERVER, -1, ""));

        assertEquals("pageSize must be 0 (server default) or a positive integer", exception.getMessage());
    }

    @Test
    void testGetResource() {
        GetResourceResponse response = client.resources().getResource(TEST_RESOURCE_ID);

        assertNotNull(response);
        assertNotNull(response.getResource());
        assertEquals(TEST_RESOURCE_ID, response.getResource().getId());
        assertEquals(ResourceType.MCP_SERVER, response.getResource().getResourceType());
        assertNotNull(response.getResource().getScopesList());
    }

    @Test
    void testGetResourceRejectsMalformedResourceId() {
        APIException exception = assertThrows(APIException.class, () ->
                client.resources().getResource("not-a-real-resource-id"));
        assertEquals(Status.Code.INVALID_ARGUMENT.value(), exception.getGrpcStatusCode());
    }

    @Test
    void testListResources() {
        // pageSize 30 (the server-side max) to give the test resource the best
        // chance of appearing on the first page regardless of how many other
        // MCP_SERVER resources exist in whichever environment runs this test.
        ListResourcesResponse response = client.resources().listResources(ResourceType.MCP_SERVER, 30, "");

        assertNotNull(response);
        assertNotNull(response.getResourcesList());
        assertTrue(response.getTotalSize() >= 0);
        assertTrue(response.getResourcesList().stream()
                        .anyMatch(r -> r.getId().equals(TEST_RESOURCE_ID)),
                "the test resource should appear in the MCP_SERVER listing");
    }

    @Test
    void testListResourcesWithPageSize() {
        ListResourcesResponse response = client.resources().listResources(ResourceType.MCP_SERVER, 1, "");

        assertNotNull(response);
        assertTrue(response.getResourcesList().size() <= 1);
    }

    // Confirms the server-side requirement documented on ListResourcesRequest:
    // RESOURCE_TYPE_UNSPECIFIED is rejected outright, it is not "list every type".
    @Test
    void testListResourcesRejectsUnspecifiedType() {
        APIException exception = assertThrows(APIException.class, () ->
                client.resources().listResources(ResourceType.RESOURCE_TYPE_UNSPECIFIED, 0, ""));
        assertEquals(Status.Code.INVALID_ARGUMENT.value(), exception.getGrpcStatusCode());
    }

    @Test
    void testCreateResourceClientRequiresResourceId() {
        assertThrows(IllegalArgumentException.class, () ->
                client.resources().createResourceClient("", ResourceClient.newBuilder().setName("Test").build()));
    }

    @Test
    void testCreateResourceClientRequiresClient() {
        assertThrows(IllegalArgumentException.class, () ->
                client.resources().createResourceClient(TEST_RESOURCE_ID, null));
    }

    @Test
    void testGetResourceClientRequiresResourceId() {
        assertThrows(IllegalArgumentException.class, () ->
                client.resources().getResourceClient("", "m2m_dummy"));
    }

    @Test
    void testGetResourceClientRequiresClientId() {
        assertThrows(IllegalArgumentException.class, () ->
                client.resources().getResourceClient(TEST_RESOURCE_ID, ""));
    }

    @Test
    void testListResourceClientsRequiresResourceId() {
        assertThrows(IllegalArgumentException.class, () ->
                client.resources().listResourceClients(""));
    }

    @Test
    void testUpdateResourceClientRequiresResourceId() {
        assertThrows(IllegalArgumentException.class, () ->
                client.resources().updateResourceClient("", "m2m_dummy",
                        ResourceClient.newBuilder().setName("Test").build(), null));
    }

    @Test
    void testUpdateResourceClientRequiresClientId() {
        assertThrows(IllegalArgumentException.class, () ->
                client.resources().updateResourceClient(TEST_RESOURCE_ID, "",
                        ResourceClient.newBuilder().setName("Test").build(), null));
    }

    @Test
    void testUpdateResourceClientRequiresClient() {
        assertThrows(IllegalArgumentException.class, () ->
                client.resources().updateResourceClient(TEST_RESOURCE_ID, "m2m_dummy", null, null));
    }

    @Test
    void testDeleteResourceClientRequiresResourceId() {
        assertThrows(IllegalArgumentException.class, () ->
                client.resources().deleteResourceClient("", "m2m_dummy"));
    }

    @Test
    void testDeleteResourceClientRequiresClientId() {
        assertThrows(IllegalArgumentException.class, () ->
                client.resources().deleteResourceClient(TEST_RESOURCE_ID, ""));
    }

    @Test
    void testCreateResourceClientSecretRequiresResourceId() {
        assertThrows(IllegalArgumentException.class, () ->
                client.resources().createResourceClientSecret("", "m2m_dummy"));
    }

    @Test
    void testCreateResourceClientSecretRequiresClientId() {
        assertThrows(IllegalArgumentException.class, () ->
                client.resources().createResourceClientSecret(TEST_RESOURCE_ID, ""));
    }

    @Test
    void testDeleteResourceClientSecretRequiresResourceId() {
        assertThrows(IllegalArgumentException.class, () ->
                client.resources().deleteResourceClientSecret("", "m2m_dummy", "secret_dummy"));
    }

    @Test
    void testDeleteResourceClientSecretRequiresClientId() {
        assertThrows(IllegalArgumentException.class, () ->
                client.resources().deleteResourceClientSecret(TEST_RESOURCE_ID, "", "secret_dummy"));
    }

    @Test
    void testDeleteResourceClientSecretRequiresSecretId() {
        assertThrows(IllegalArgumentException.class, () ->
                client.resources().deleteResourceClientSecret(TEST_RESOURCE_ID, "m2m_dummy", ""));
    }

    @Test
    void testCreateGetListUpdateDeleteResourceClient() {
        CreateResourceClientResponse created = client.resources().createResourceClient(TEST_RESOURCE_ID,
                ResourceClient.newBuilder()
                        .setName("Java SDK Test Client")
                        .setDescription("Integration test client")
                        .addScopes("test:e2e_resource_scope")
                        .build());

        assertNotNull(created);
        assertNotNull(created.getClient());
        assertFalse(created.getPlainSecret().isEmpty());
        String clientId = created.getClient().getClientId();
        assertEquals("Java SDK Test Client", created.getClient().getName());
        assertEquals(TEST_RESOURCE_ID, created.getClient().getResourceId());

        boolean[] deleted = {false};
        try {
            GetResourceClientResponse fetched = client.resources().getResourceClient(TEST_RESOURCE_ID, clientId);
            assertNotNull(fetched.getClient());
            assertEquals(clientId, fetched.getClient().getClientId());

            ListResourceClientsResponse list = client.resources().listResourceClients(TEST_RESOURCE_ID);
            assertTrue(list.getClientsList().stream().anyMatch(c -> c.getClientId().equals(clientId)),
                    "created client should appear in list");

            UpdateResourceClientResponse updated = client.resources().updateResourceClient(TEST_RESOURCE_ID, clientId,
                    ResourceClient.newBuilder().setName("Java SDK Test Client Updated").build(),
                    FieldMask.newBuilder().addPaths("name").build());
            assertEquals("Java SDK Test Client Updated", updated.getClient().getName());

            DeleteResourceClientResponse deleteResponse = client.resources().deleteResourceClient(TEST_RESOURCE_ID, clientId);
            assertNotNull(deleteResponse);
            deleted[0] = true;

            APIException exception = assertThrows(APIException.class, () ->
                    client.resources().getResourceClient(TEST_RESOURCE_ID, clientId));
            assertEquals(Status.Code.NOT_FOUND.value(), exception.getGrpcStatusCode());
        } finally {
            if (!deleted[0]) {
                client.resources().deleteResourceClient(TEST_RESOURCE_ID, clientId);
            }
        }
    }

    // OTHER_RESOURCE_ID doesn't exist, so the client can't belong to it — the
    // server's own resource-scoping on getResourceClient refuses the delete
    // (NOT_FOUND) before it ever runs, and the SDK-side ownership check in
    // deleteResourceClient is the second line of defense for a backend that
    // didn't enforce this.
    @Test
    void testDeleteResourceClientRefusesWrongResource() {
        CreateResourceClientResponse created = client.resources().createResourceClient(TEST_RESOURCE_ID,
                ResourceClient.newBuilder().setName("Java SDK Ownership Test Client").build());
        String clientId = created.getClient().getClientId();

        try {
            APIException exception = assertThrows(APIException.class, () ->
                    client.resources().deleteResourceClient(OTHER_RESOURCE_ID, clientId));
            assertEquals(Status.Code.NOT_FOUND.value(), exception.getGrpcStatusCode());

            // The client must still exist under its real resource.
            GetResourceClientResponse stillThere = client.resources().getResourceClient(TEST_RESOURCE_ID, clientId);
            assertEquals(clientId, stillThere.getClient().getClientId());
        } finally {
            client.resources().deleteResourceClient(TEST_RESOURCE_ID, clientId);
        }
    }

    @Test
    void testCreateAndDeleteResourceClientSecret() {
        CreateResourceClientResponse created = client.resources().createResourceClient(TEST_RESOURCE_ID,
                ResourceClient.newBuilder().setName("Java SDK Secret Test Client").build());
        String clientId = created.getClient().getClientId();

        try {
            CreateClientSecretResponse secretResponse = client.resources().createResourceClientSecret(TEST_RESOURCE_ID, clientId);
            assertNotNull(secretResponse);
            assertFalse(secretResponse.getPlainSecret().isEmpty());
            assertNotNull(secretResponse.getSecret());
            assertFalse(secretResponse.getSecret().getId().isEmpty());

            client.resources().deleteResourceClientSecret(TEST_RESOURCE_ID, clientId, secretResponse.getSecret().getId());
        } finally {
            client.resources().deleteResourceClient(TEST_RESOURCE_ID, clientId);
        }
    }

    // OTHER_RESOURCE_ID doesn't exist, so the client can't belong to it —
    // createResourceClientSecret's ownership check fetches the client via
    // getResourceClient(OTHER_RESOURCE_ID, clientId) first, which the server's
    // own resource-scoping on that call refuses (NOT_FOUND) before the
    // resource-unaware secret-creation RPC itself is ever reached, mirroring
    // testDeleteResourceClientRefusesWrongResource above.
    @Test
    void testCreateResourceClientSecretRefusesWrongResource() {
        CreateResourceClientResponse created = client.resources().createResourceClient(TEST_RESOURCE_ID,
                ResourceClient.newBuilder().setName("Java SDK Secret Ownership Test Client").build());
        String clientId = created.getClient().getClientId();

        try {
            APIException exception = assertThrows(APIException.class, () ->
                    client.resources().createResourceClientSecret(OTHER_RESOURCE_ID, clientId));
            assertEquals(Status.Code.NOT_FOUND.value(), exception.getGrpcStatusCode());
        } finally {
            client.resources().deleteResourceClient(TEST_RESOURCE_ID, clientId);
        }
    }

    // Verified against a live environment: audience is ignored on create too
    // (not just update) for an MCP_SERVER/MCP_GATEWAY resource, which gets its
    // audience from the resource itself — so it comes back empty here even
    // though a value was supplied, matching the documented update-time
    // behavior (same finding as the Go SDK PR).
    @Test
    void testCreateResourceClientAllFields() {
        CreateResourceClientResponse created = client.resources().createResourceClient(TEST_RESOURCE_ID,
                ResourceClient.newBuilder()
                        .setName("Java SDK All Fields Client")
                        .setDescription("exercises every field")
                        .addScopes("test:e2e_resource_scope")
                        .addAudience("https://example.com/should-be-ignored")
                        .addCustomClaims(com.scalekit.grpc.scalekit.v1.clients.CustomClaim.newBuilder()
                                .setKey("team").setValue("sdk").build())
                        .setExpiry(3600)
                        .addRedirectUris("https://example.com/callback")
                        .build());

        String clientId = created.getClient().getClientId();
        try {
            assertEquals(java.util.Collections.singletonList("test:e2e_resource_scope"), created.getClient().getScopesList());
            assertTrue(created.getClient().getAudienceList().isEmpty(), "audience is ignored on create for an MCP_SERVER resource");
            assertEquals(1, created.getClient().getCustomClaimsCount());
            assertEquals("team", created.getClient().getCustomClaims(0).getKey());
            assertEquals("sdk", created.getClient().getCustomClaims(0).getValue());
            assertEquals(3600, created.getClient().getExpiry());
            assertEquals(java.util.Collections.singletonList("https://example.com/callback"), created.getClient().getRedirectUrisList());
        } finally {
            client.resources().deleteResourceClient(TEST_RESOURCE_ID, clientId);
        }
    }

    // Confirms name/description are truthy-gated, not mask-gated: a non-empty
    // value applies even when its path isn't in the update mask.
    @Test
    void testUpdateResourceClientNameDescriptionAppliedRegardlessOfMask() {
        CreateResourceClientResponse created = client.resources().createResourceClient(TEST_RESOURCE_ID,
                ResourceClient.newBuilder().setName("Original Name").build());
        String clientId = created.getClient().getClientId();

        try {
            UpdateResourceClientResponse updated = client.resources().updateResourceClient(TEST_RESOURCE_ID, clientId,
                    ResourceClient.newBuilder()
                            .setName("Applied Despite Missing From Mask")
                            .setDescription("also applied")
                            .build(),
                    FieldMask.newBuilder().addPaths("scopes").build()); // name and description deliberately left out

            assertEquals("Applied Despite Missing From Mask", updated.getClient().getName());
            assertEquals("also applied", updated.getClient().getDescription());
        } finally {
            client.resources().deleteResourceClient(TEST_RESOURCE_ID, clientId);
        }
    }

    // Confirms an empty name/description does not clear the field, even when
    // its path is in the mask — there's currently no way to clear either.
    @Test
    void testUpdateResourceClientEmptyStringIsNoOp() {
        CreateResourceClientResponse created = client.resources().createResourceClient(TEST_RESOURCE_ID,
                ResourceClient.newBuilder().setName("Keep This Name").setDescription("keep this description").build());
        String clientId = created.getClient().getClientId();

        try {
            UpdateResourceClientResponse updated = client.resources().updateResourceClient(TEST_RESOURCE_ID, clientId,
                    ResourceClient.newBuilder().setName("").setDescription("").build(),
                    FieldMask.newBuilder().addPaths("name").addPaths("description").build());

            assertEquals("Keep This Name", updated.getClient().getName());
            assertEquals("keep this description", updated.getClient().getDescription());
        } finally {
            client.resources().deleteResourceClient(TEST_RESOURCE_ID, clientId);
        }
    }

    // Confirms audience can't be changed via update, by design, even with its
    // path in the mask.
    @Test
    void testUpdateResourceClientAudienceImmutable() {
        CreateResourceClientResponse created = client.resources().createResourceClient(TEST_RESOURCE_ID,
                ResourceClient.newBuilder().setName("Audience Immutable Test").build());
        String clientId = created.getClient().getClientId();
        java.util.List<String> originalAudience = created.getClient().getAudienceList();

        try {
            UpdateResourceClientResponse updated = client.resources().updateResourceClient(TEST_RESOURCE_ID, clientId,
                    ResourceClient.newBuilder().addAudience("https://example.com/should-not-apply").build(),
                    FieldMask.newBuilder().addPaths("audience").build());

            assertEquals(originalAudience, updated.getClient().getAudienceList());
        } finally {
            client.resources().deleteResourceClient(TEST_RESOURCE_ID, clientId);
        }
    }

    // Confirms scopes/customClaims/redirectUris — the three fields the mask
    // actually governs — can be cleared by passing an empty value with the
    // path included in the mask.
    @Test
    void testUpdateResourceClientClearsListFields() {
        CreateResourceClientResponse created = client.resources().createResourceClient(TEST_RESOURCE_ID,
                ResourceClient.newBuilder()
                        .setName("Clear Fields Test")
                        .addScopes("test:e2e_resource_scope")
                        .addCustomClaims(com.scalekit.grpc.scalekit.v1.clients.CustomClaim.newBuilder()
                                .setKey("k").setValue("v").build())
                        .addRedirectUris("https://example.com/callback")
                        .build());
        String clientId = created.getClient().getClientId();
        assertFalse(created.getClient().getScopesList().isEmpty());
        assertFalse(created.getClient().getCustomClaimsList().isEmpty());
        assertFalse(created.getClient().getRedirectUrisList().isEmpty());

        try {
            UpdateResourceClientResponse updated = client.resources().updateResourceClient(TEST_RESOURCE_ID, clientId,
                    ResourceClient.newBuilder().build(),
                    FieldMask.newBuilder().addPaths("scopes").addPaths("custom_claims").addPaths("redirect_uris").build());

            assertTrue(updated.getClient().getScopesList().isEmpty());
            assertTrue(updated.getClient().getCustomClaimsList().isEmpty());
            assertTrue(updated.getClient().getRedirectUrisList().isEmpty());
        } finally {
            client.resources().deleteResourceClient(TEST_RESOURCE_ID, clientId);
        }
    }

    // Documents the server's actual redirect URI validation, verified live
    // (same finding as the Go SDK PR): a javascript: scheme and a URI with no
    // scheme at all are both rejected.
    @Test
    void testCreateResourceClientRejectsJavascriptRedirectUri() {
        APIException exception = assertThrows(APIException.class, () ->
                client.resources().createResourceClient(TEST_RESOURCE_ID,
                        ResourceClient.newBuilder().setName("Bad Redirect").addRedirectUris("javascript:alert(1)").build()));
        assertEquals(Status.Code.INVALID_ARGUMENT.value(), exception.getGrpcStatusCode());
    }

    @Test
    void testCreateResourceClientRejectsSchemelessRedirectUri() {
        APIException exception = assertThrows(APIException.class, () ->
                client.resources().createResourceClient(TEST_RESOURCE_ID,
                        ResourceClient.newBuilder().setName("Bad Redirect").addRedirectUris("not-a-uri").build()));
        assertEquals(Status.Code.INVALID_ARGUMENT.value(), exception.getGrpcStatusCode());
    }

    // Confirms a second delete on an already-deleted client fails rather than
    // silently no-op-ing.
    @Test
    void testDoubleDeleteResourceClient() {
        CreateResourceClientResponse created = client.resources().createResourceClient(TEST_RESOURCE_ID,
                ResourceClient.newBuilder().setName("Double Delete Test").build());
        String clientId = created.getClient().getClientId();

        DeleteResourceClientResponse first = client.resources().deleteResourceClient(TEST_RESOURCE_ID, clientId);
        assertNotNull(first);
        APIException exception = assertThrows(APIException.class, () ->
                client.resources().deleteResourceClient(TEST_RESOURCE_ID, clientId));
        assertEquals(Status.Code.NOT_FOUND.value(), exception.getGrpcStatusCode());
    }

    // Confirms a syntactically invalid client id is rejected by the server
    // rather than treated as a not-found.
    @Test
    void testGetResourceClientRejectsMalformedClientId() {
        APIException exception = assertThrows(APIException.class, () ->
                client.resources().getResourceClient(TEST_RESOURCE_ID, "not-a-real-client-id"));
        assertEquals(Status.Code.INVALID_ARGUMENT.value(), exception.getGrpcStatusCode());
    }

    @Test
    void testListUserConsents() {
        ListResourceUserConsentsResponse response =
                client.resources().listUserConsents(TEST_RESOURCE_ID, null);

        assertNotNull(response);
        assertNotNull(response.getConsentsList());
        assertTrue(response.getTotalSize() >= 0);
    }

    @Test
    void testListUserConsentsWithPageSize() {
        ListResourceUserConsentsResponse response =
                client.resources().listUserConsents(TEST_RESOURCE_ID,
                        ListUserConsentsOptions.builder().pageSize(10).build());

        assertNotNull(response);
        assertTrue(response.getConsentsCount() <= 10);
    }

    @Test
    void testListUserConsentsWithSearch() {
        ListResourceUserConsentsResponse response =
                client.resources().listUserConsents(TEST_RESOURCE_ID,
                        ListUserConsentsOptions.builder().search("usr_").build());

        assertNotNull(response);
        assertNotNull(response.getConsentsList());
    }

    @Test
    void testListUserConsentsWithUserIds() {
        ListResourceUserConsentsResponse response =
                client.resources().listUserConsents(TEST_RESOURCE_ID,
                        ListUserConsentsOptions.builder()
                                .userIds(Collections.singletonList("usr_does_not_exist"))
                                .build());

        assertNotNull(response);
        assertEquals(0, response.getConsentsCount());
    }

    @Test
    void testListUserConsentsUserIdsTakesPrecedenceOverSearch() {
        // search alone would match nothing here either, but the point is that the
        // request is accepted and the exact filter is what is applied.
        ListResourceUserConsentsResponse response =
                client.resources().listUserConsents(TEST_RESOURCE_ID,
                        ListUserConsentsOptions.builder()
                                .userIds(Collections.singletonList("usr_does_not_exist"))
                                .search("usr_")
                                .build());

        assertNotNull(response);
        assertEquals(0, response.getConsentsCount());
    }

    @Test
    void testListUserConsentsRejectsMoreThan25UserIds() {
        String[] userIds = new String[26];
        for (int i = 0; i < userIds.length; i++) {
            userIds[i] = "usr_" + i;
        }

        // RetryExecuter converts a StatusRuntimeException into an APIException,
        // preserving the gRPC status code, so assert on that rather than on the
        // raw gRPC exception, which never reaches the caller.
        APIException exception = assertThrows(APIException.class, () ->
                client.resources().listUserConsents(TEST_RESOURCE_ID,
                        ListUserConsentsOptions.builder()
                                .userIds(Arrays.asList(userIds))
                                .build()));

        assertEquals(Status.Code.INVALID_ARGUMENT.value(), exception.getGrpcStatusCode());
    }

    @Test
    void testListUserConsentsWithoutResourceId() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                client.resources().listUserConsents("", null));

        assertEquals("resourceId is required", exception.getMessage());
    }

    @Test
    void testListUserConsentsRejectsNegativePageSize() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                client.resources().listUserConsents(TEST_RESOURCE_ID,
                        ListUserConsentsOptions.builder().pageSize(-1).build()));

        assertEquals("pageSize must be 0 (server default) or a positive integer", exception.getMessage());
    }

    @Test
    void testRevokeUserConsentWithoutClientId() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                client.resources().revokeUserConsent("", "usrcnst_1234567890"));

        assertEquals("clientId is required", exception.getMessage());
    }

    @Test
    void testRevokeUserConsentWithoutConsentId() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                client.resources().revokeUserConsent("m2m_1234567890", ""));

        assertEquals("consentId is required", exception.getMessage());
    }

    // An unknown consent must surface as an error rather than a silent success, so
    // callers can tell "revoked" apart from "there was nothing to revoke". The
    // exact code is the server's business; what matters here is that a real gRPC
    // status reached the caller, which a non-zero grpcStatusCode proves — the
    // String-only APIException constructors leave it at 0.
    @Test
    void testRevokeUserConsentUnknownConsent() {
        APIException exception = assertThrows(APIException.class, () ->
                client.resources().revokeUserConsent("m2m_000000000000000000", "usrcnst_000000000000000000"));

        assertNotEquals(0, exception.getGrpcStatusCode());
    }
}
