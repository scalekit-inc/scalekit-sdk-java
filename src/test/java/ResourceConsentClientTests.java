import com.google.protobuf.FieldMask;
import com.scalekit.ScalekitClient;
import com.scalekit.api.util.ListUserConsentsOptions;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientResponse;
import com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientResponse;
import com.scalekit.grpc.scalekit.v1.clients.GetResourceClientResponse;
import com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsResponse;
import com.scalekit.grpc.scalekit.v1.clients.ListResourceUserConsentsResponse;
import com.scalekit.grpc.scalekit.v1.clients.ResourceClient;
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
