import com.scalekit.ScalekitClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.auth.User;
import io.grpc.Status;
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

        // A login request id (lri_xxx) is short-lived, so a real call will usually
        // fail because the request has already expired or been consumed (e.g.
        // NOT_FOUND / FAILED_PRECONDITION). That is acceptable here. What must NOT
        // happen is an INVALID_ARGUMENT protobuf-validation error: that would mean
        // the SDK sent a malformed payload (e.g. missing sub/email while login_failed
        // is false), which is the regression this test guards against. We therefore
        // send a well-formed payload (both sub and email set) and assert the failure,
        // if any, is not a validation error.
        User user = User.newBuilder()
                .setSub("usr_test_sub")
                .setEmail("test.user@example.com")
                .build();
        try {
            String authRequestId = client.login().updateLoginUserDetails(connectionId, loginRequestId, user);
            assertNotNull(authRequestId);
            assertFalse(authRequestId.isEmpty());
            assertTrue(authRequestId.startsWith("req_"));
        } catch (APIException e) {
            assertNotEquals(Status.Code.INVALID_ARGUMENT.value(), e.getGrpcStatusCode(),
                    "expected a non-validation error for a short-lived login request, "
                            + "but got a protobuf validation error: " + e.getMessage());
        }
    }
}
