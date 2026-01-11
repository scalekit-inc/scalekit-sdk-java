import com.scalekit.ScalekitClient;
import com.scalekit.api.WebAuthnClient;
import com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsResponse;
import com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialResponse;
import com.scalekit.grpc.scalekit.v1.auth.webauthn.WebAuthnCredential;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WebAuthnTests {

    private static ScalekitClient client;
    private static WebAuthnClient webAuthnClient;
    private static String testUserId;
    private static String testCredentialId;

    @BeforeAll
    static void init() {
        // Init client
        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String apiSecret = System.getenv("SCALEKIT_CLIENT_SECRET");
        testUserId = System.getenv("TEST_USER_ID");
        testCredentialId = System.getenv("TEST_CREDENTIAL_ID");

        client = new ScalekitClient(environmentUrl, clientId, apiSecret);
        webAuthnClient = client.webAuthn();
    }

    @Test
    public void testListCredentials() {
        // Skip test if userId is not provided
        if (testUserId == null || testUserId.trim().isEmpty()) {
            System.out.println("Skipping testListCredentials: TEST_USER_ID not set");
            return;
        }

        // Test listing credentials for a user
        ListCredentialsResponse response = webAuthnClient.listCredentials(testUserId);

        assertNotNull(response);
        assertNotNull(response.getCredentialsList());
        // Response should contain a list (can be empty if user has no credentials)
        assertTrue(response.getCredentialsCount() >= 0);

        // If credentials exist, verify structure
        if (response.getCredentialsCount() > 0) {
            WebAuthnCredential firstCredential = response.getCredentials(0);
            assertNotNull(firstCredential);
            assertNotNull(firstCredential.getId());
            assertFalse(firstCredential.getId().trim().isEmpty());
        }
    }

    @Test
    public void testListCredentialsWithInvalidUserId() {
        // Test with null userId
        assertThrows(IllegalArgumentException.class, () -> {
            webAuthnClient.listCredentials(null);
        });

        // Test with empty userId
        assertThrows(IllegalArgumentException.class, () -> {
            webAuthnClient.listCredentials("");
        });

        // Test with whitespace-only userId
        assertThrows(IllegalArgumentException.class, () -> {
            webAuthnClient.listCredentials("   ");
        });
    }

    @Test
    public void testUpdateCredential() {
        // Skip test if credentialId is not provided
        if (testCredentialId == null || testCredentialId.trim().isEmpty()) {
            System.out.println("Skipping testUpdateCredential: TEST_CREDENTIAL_ID not set");
            return;
        }

        // Test updating credential display name
        String newDisplayName = "Updated Test Credential " + System.currentTimeMillis();
        UpdateCredentialResponse response = webAuthnClient.updateCredential(testCredentialId, newDisplayName);

        assertNotNull(response);
        assertNotNull(response.getCredential());
        assertEquals(testCredentialId, response.getCredential().getId());
        assertEquals(newDisplayName, response.getCredential().getDisplayName());
    }

    @Test
    public void testUpdateCredentialWithInvalidInputs() {
        // Test with null credentialId
        assertThrows(IllegalArgumentException.class, () -> {
            webAuthnClient.updateCredential(null, "Test Display Name");
        });

        // Test with empty credentialId
        assertThrows(IllegalArgumentException.class, () -> {
            webAuthnClient.updateCredential("", "Test Display Name");
        });

        // Test with whitespace-only credentialId
        assertThrows(IllegalArgumentException.class, () -> {
            webAuthnClient.updateCredential("   ", "Test Display Name");
        });

        // Test with null displayName
        assertThrows(IllegalArgumentException.class, () -> {
            webAuthnClient.updateCredential("test-credential-id", null);
        });

        // Test with empty displayName
        assertThrows(IllegalArgumentException.class, () -> {
            webAuthnClient.updateCredential("test-credential-id", "");
        });

        // Test with whitespace-only displayName
        assertThrows(IllegalArgumentException.class, () -> {
            webAuthnClient.updateCredential("test-credential-id", "   ");
        });
    }
}

