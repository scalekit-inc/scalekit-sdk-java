import com.scalekit.ScalekitClient;
import com.scalekit.grpc.scalekit.v1.auth.User;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTests {

    private static ScalekitClient client;

    @BeforeAll
    static void init() {
        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String apiSecret = System.getenv("SCALEKIT_CLIENT_SECRET");

        // Fall back to placeholder values so client-side validation tests always run.
        // The channel/stubs are built lazily and make no network call until an RPC is issued.
        if (environmentUrl == null || environmentUrl.isEmpty()) {
            environmentUrl = "https://placeholder.scalekit.dev";
        }
        if (clientId == null || clientId.isEmpty()) {
            clientId = "skc_placeholder";
        }
        if (apiSecret == null || apiSecret.isEmpty()) {
            apiSecret = "placeholder_secret";
        }

        client = new ScalekitClient(environmentUrl, clientId, apiSecret);
    }

    // --- Client-side validation: always runs, no network required ---

    @Test
    void UpdateLoginUserDetailsRejectsNullConnectionId() {
        assertThrows(IllegalArgumentException.class,
                () -> client.login().updateLoginUserDetails(null, "lri_123", User.newBuilder().build()));
    }

    @Test
    void UpdateLoginUserDetailsRejectsEmptyConnectionId() {
        assertThrows(IllegalArgumentException.class,
                () -> client.login().updateLoginUserDetails("", "lri_123", User.newBuilder().build()));
    }

    @Test
    void UpdateLoginUserDetailsRejectsNullLoginRequestId() {
        assertThrows(IllegalArgumentException.class,
                () -> client.login().updateLoginUserDetails("conn_123", null, User.newBuilder().build()));
    }

    @Test
    void UpdateLoginUserDetailsRejectsEmptyLoginRequestId() {
        assertThrows(IllegalArgumentException.class,
                () -> client.login().updateLoginUserDetails("conn_123", "", User.newBuilder().build()));
    }

    @Test
    void UpdateLoginUserDetailsRejectsNullUser() {
        assertThrows(IllegalArgumentException.class,
                () -> client.login().updateLoginUserDetails("conn_123", "lri_123", null));
    }

    // --- Live integration: skips unless server-side IDs are provided ---

    @Test
    void UpdateLoginUserDetailsLive() {
        String connectionId = System.getenv("SCALEKIT_TEST_CONNECTION_ID");
        String loginRequestId = System.getenv("SCALEKIT_TEST_LOGIN_REQUEST_ID");
        Assumptions.assumeTrue(connectionId != null && !connectionId.isEmpty()
                && loginRequestId != null && !loginRequestId.isEmpty());

        // The server-side validation rule requires either login_failed=true or both
        // sub and email to be non-empty, so set them for the success path.
        User user = User.newBuilder()
                .setSub("usr_test_sub")
                .setEmail("test.user@example.com")
                .build();
        String authRequestId = client.login().updateLoginUserDetails(connectionId, loginRequestId, user);
        assertNotNull(authRequestId);
        assertFalse(authRequestId.isEmpty());
        assertTrue(authRequestId.startsWith("req_"));
    }
}
