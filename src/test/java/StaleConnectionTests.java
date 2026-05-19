import com.scalekit.ScalekitClient;
import com.scalekit.api.impl.ScalekitAuthClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Local-only tests that replicate SDK bugs from Rocketlane production logs.
 * Kept @Disabled — run manually to reproduce.
 *
 * Issue 1: ScalekitAuthClient pools HTTP connections but never evicts idle ones.
 *          After GCLB closes the server side (~600s), the pooled connection is
 *          dead. Next getClientAccessToken() reuses it → "Connection reset".
 *
 * Issue 2: DEADLINE_EXCEEDED from dead gRPC channels (no keepalive) is not
 *          retried by RetryExecuter — call fails with no recovery.
 */
public class StaleConnectionTests {

    private static ScalekitClient client;
    private static ScalekitAuthClient authClient;

    @BeforeAll
    static void init() {
        String environmentUrl = System.getenv("TOOL_ENV_URL");
        String clientId = System.getenv("TOOL_CLIENT_ID");
        String clientSecret = System.getenv("TOOL_CLIENT_SECRET");

        Assumptions.assumeTrue(
                environmentUrl != null && !environmentUrl.trim().isEmpty()
                        && clientId != null && !clientId.trim().isEmpty()
                        && clientSecret != null && !clientSecret.trim().isEmpty(),
                "Skipping: TOOL_ENV_URL, TOOL_CLIENT_ID, TOOL_CLIENT_SECRET required"
        );

        client = new ScalekitClient(environmentUrl, clientId, clientSecret);
        authClient = new ScalekitAuthClient();
    }

    // -----------------------------------------------------------------------
    // Issue 1: Stale HTTP connection after GCLB idle timeout (~600s)
    //
    // 1. getClientAccessToken() succeeds — connection enters pool
    // 2. Wait 660s for GCLB to close the server side of the TCP connection
    // 3. getClientAccessToken() reuses the dead pooled connection
    //    → "Connection reset" / "NoHttpResponseException"
    // -----------------------------------------------------------------------

    @Test
    // @Disabled("Local only — takes ~11 minutes, waits for real GCLB idle timeout")
    void staleHttpConnection_afterGclbIdleTimeout_causesConnectionReset() throws Exception {
        // First call — succeeds, connection goes back to pool
        String token1 = authClient.getClientAccessToken();
        assertNotNull(token1, "First token call should succeed");
        System.out.println("[00:00] First token obtained successfully.");

        // Wait for GCLB to close the idle connection (~600s timeout + 60s buffer)
        int waitSeconds = 660;
        System.out.println("[00:00] Waiting " + waitSeconds + "s for GCLB to close idle connection...");

        for (int elapsed = 0; elapsed < waitSeconds; elapsed += 60) {
            Thread.sleep(60_000);
            int mins = (elapsed + 60) / 60;
            System.out.println("[" + String.format("%02d:%02d", mins, 0) + "] "
                    + (elapsed + 60) + "s elapsed...");
        }

        System.out.println("[11:00] Attempting second token call on pooled connection...");

        // Second call — the pooled connection is dead, should fail
        try {
            String token2 = authClient.getClientAccessToken();
            System.out.println("[11:00] Second call succeeded (connection survived): " + token2.substring(0, 20) + "...");
            fail("Expected stale connection error but call succeeded — "
                    + "GCLB may not have closed the connection yet");
        } catch (Exception e) {
            System.out.println("[11:00] REPLICATED: " + e.getMessage());
            assertTrue(
                    e.getMessage().contains("Connection reset")
                            || e.getMessage().contains("NoHttpResponseException")
                            || e.getMessage().contains("Failed to authenticate")
                            || e.getMessage().contains("Connection pool"),
                    "Expected a stale connection error, got: " + e.getMessage());
        }
    }

    // -----------------------------------------------------------------------
    // Issue 2: DEADLINE_EXCEEDED — no retry, no recovery
    //
    // Without gRPC keepalive, idle channels die at GCLB (~600s).
    // Next RPC reconnects from scratch — TLS + HTTP/2 eats 3-8s,
    // blowing past the deadline. RetryExecuter doesn't retry it.
    // -----------------------------------------------------------------------

    @Test
    // @Disabled("Local only — replicates DEADLINE_EXCEEDED with no recovery")
    void deadlineExceeded_noRetry_callFailsImmediately() {
        ScalekitCredentials credentials = new ScalekitCredentials(authClient);
        credentials.updateCredentials(); // prime with real token

        AtomicInteger callCount = new AtomicInteger(0);

        // Simulate dead gRPC channel causing DEADLINE_EXCEEDED
        // — exact error string from Rocketlane's mimecast logs
        APIException ex = assertThrows(APIException.class, () ->
                RetryExecuter.executeWithRetry(() -> {
                    callCount.incrementAndGet();
                    throw new StatusRuntimeException(Status.DEADLINE_EXCEEDED
                            .withDescription("CallOptions deadline exceeded after 6.133s. "
                                    + "Name resolution delay 0.275s. "
                                    + "[closed=[], open=[[buffered_nanos=6175838798, "
                                    + "waiting_for_connection]]]"));
                }, credentials));

        assertEquals(1, callCount.get(),
                "DEADLINE_EXCEEDED should not be retried (non-idempotent operations)");
        assertTrue(ex.getMessage().contains("DEADLINE_EXCEEDED"));
        System.out.println("[deadlineExceeded] REPLICATED: Failed after " + callCount.get()
                + " attempt(s), no retry.");
    }
}
