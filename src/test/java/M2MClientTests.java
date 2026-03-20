import com.scalekit.ScalekitClient;
import com.scalekit.grpc.scalekit.v1.clients.*;
import com.scalekit.grpc.scalekit.v1.organizations.CreateOrganization;
import com.scalekit.grpc.scalekit.v1.organizations.Organization;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class M2MClientTests {

    private static ScalekitClient client;
    private static String testOrgId;

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

        CreateOrganization createOrg = CreateOrganization.newBuilder()
                .setDisplayName("M2M Tests Org " + System.currentTimeMillis())
                .build();
        Organization org = client.organizations().create(createOrg);
        testOrgId = org.getId();
    }

    @AfterAll
    static void teardown() {
        if (testOrgId != null && client != null) {
            try {
                client.organizations().deleteById(testOrgId);
            } catch (Exception e) {
                System.err.println("Failed to delete test org " + testOrgId + ": " + e.getMessage());
            }
        }
    }

    @Test
    void testCreateOrganizationClient() {
        OrganizationClient clientProto = OrganizationClient.newBuilder()
                .setName("Test M2M Client")
                .setDescription("Integration test client")
                .build();

        CreateOrganizationClientResponse response =
                client.m2m().createOrganizationClient(testOrgId, clientProto);

        assertNotNull(response);
        assertNotNull(response.getClient());
        assertFalse(response.getClient().getClientId().isEmpty());
        assertEquals("Test M2M Client", response.getClient().getName());

        // Cleanup
        client.m2m().deleteOrganizationClient(testOrgId, response.getClient().getClientId());
    }

    @Test
    void testCreateOrganizationClientRequiresOrgId() {
        OrganizationClient stub = OrganizationClient.newBuilder().setName("stub").build();
        assertThrows(IllegalArgumentException.class, () ->
                client.m2m().createOrganizationClient("", stub));
    }

    @Test
    void testCreateOrganizationClientRequiresClient() {
        assertThrows(IllegalArgumentException.class, () ->
                client.m2m().createOrganizationClient(testOrgId, null));
    }

    @Test
    void testGetOrganizationClient() {
        OrganizationClient clientProto = OrganizationClient.newBuilder()
                .setName("Get Test Client")
                .build();

        CreateOrganizationClientResponse created =
                client.m2m().createOrganizationClient(testOrgId, clientProto);
        String clientId = created.getClient().getClientId();

        try {
            GetOrganizationClientResponse fetched =
                    client.m2m().getOrganizationClient(testOrgId, clientId);

            assertNotNull(fetched);
            assertEquals(clientId, fetched.getClient().getClientId());
            assertEquals("Get Test Client", fetched.getClient().getName());
        } finally {
            client.m2m().deleteOrganizationClient(testOrgId, clientId);
        }
    }

    @Test
    void testGetOrganizationClientRequiresClientId() {
        assertThrows(IllegalArgumentException.class, () ->
                client.m2m().getOrganizationClient(testOrgId, ""));
    }

    @Test
    void testUpdateOrganizationClient() {
        OrganizationClient clientProto = OrganizationClient.newBuilder()
                .setName("Original Name")
                .build();

        CreateOrganizationClientResponse created =
                client.m2m().createOrganizationClient(testOrgId, clientProto);
        String clientId = created.getClient().getClientId();

        try {
            OrganizationClient updateProto = OrganizationClient.newBuilder()
                    .setName("Updated Name")
                    .setDescription("Updated description")
                    .build();

            UpdateOrganizationClientResponse updated =
                    client.m2m().updateOrganizationClient(testOrgId, clientId, updateProto);

            assertNotNull(updated);
            assertEquals("Updated Name", updated.getClient().getName());
            assertEquals("Updated description", updated.getClient().getDescription());
        } finally {
            client.m2m().deleteOrganizationClient(testOrgId, clientId);
        }
    }

    @Test
    void testCreateOrganizationClientSecret() {
        OrganizationClient clientProto = OrganizationClient.newBuilder()
                .setName("Secret Test Client")
                .build();

        CreateOrganizationClientResponse created =
                client.m2m().createOrganizationClient(testOrgId, clientProto);
        String clientId = created.getClient().getClientId();

        try {
            CreateOrganizationClientSecretResponse secretResp =
                    client.m2m().createOrganizationClientSecret(testOrgId, clientId);

            assertNotNull(secretResp);
            assertFalse(secretResp.getSecretId().isEmpty());
            assertFalse(secretResp.getSecret().isEmpty());

            // Cleanup secret
            client.m2m().deleteOrganizationClientSecret(testOrgId, clientId, secretResp.getSecretId());
        } finally {
            client.m2m().deleteOrganizationClient(testOrgId, clientId);
        }
    }

    @Test
    void testDeleteOrganizationClientSecret() {
        OrganizationClient clientProto = OrganizationClient.newBuilder()
                .setName("Delete Secret Client")
                .build();

        CreateOrganizationClientResponse created =
                client.m2m().createOrganizationClient(testOrgId, clientProto);
        String clientId = created.getClient().getClientId();

        try {
            CreateOrganizationClientSecretResponse secretResp =
                    client.m2m().createOrganizationClientSecret(testOrgId, clientId);
            String secretId = secretResp.getSecretId();

            // Should not throw
            assertDoesNotThrow(() ->
                    client.m2m().deleteOrganizationClientSecret(testOrgId, clientId, secretId));
        } finally {
            client.m2m().deleteOrganizationClient(testOrgId, clientId);
        }
    }

    @Test
    void testDeleteOrganizationClientSecretRequiresSecretId() {
        assertThrows(IllegalArgumentException.class, () ->
                client.m2m().deleteOrganizationClientSecret(testOrgId, "skc_dummy", ""));
    }

    @Test
    void testListOrganizationClients() {
        OrganizationClient clientProto = OrganizationClient.newBuilder()
                .setName("List Test Client")
                .build();

        CreateOrganizationClientResponse created =
                client.m2m().createOrganizationClient(testOrgId, clientProto);
        String clientId = created.getClient().getClientId();

        try {
            ListOrganizationClientsResponse list =
                    client.m2m().listOrganizationClients(testOrgId, 10, null);

            assertNotNull(list);
            assertFalse(list.getClientsList().isEmpty());

            boolean found = list.getClientsList().stream()
                    .anyMatch(c -> c.getClientId().equals(clientId));
            assertTrue(found, "Created client should appear in the list");
        } finally {
            client.m2m().deleteOrganizationClient(testOrgId, clientId);
        }
    }

    @Test
    void testListOrganizationClientsRequiresOrgId() {
        assertThrows(IllegalArgumentException.class, () ->
                client.m2m().listOrganizationClients("", 10, null));
    }

    @Test
    void testDeleteOrganizationClient() {
        OrganizationClient clientProto = OrganizationClient.newBuilder()
                .setName("To Delete Client")
                .build();

        CreateOrganizationClientResponse created =
                client.m2m().createOrganizationClient(testOrgId, clientProto);
        String clientId = created.getClient().getClientId();

        // Should not throw
        assertDoesNotThrow(() ->
                client.m2m().deleteOrganizationClient(testOrgId, clientId));
    }
}
