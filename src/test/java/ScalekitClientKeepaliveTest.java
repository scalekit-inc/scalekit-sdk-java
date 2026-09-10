import com.scalekit.ScalekitClient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ScalekitClientKeepaliveTest {

    private static final String SITE = "https://example.scalekit.dev";

    @Test
    void rejectsKeepAliveTimeBelowTheFloor() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> new ScalekitClient(SITE, "id", "secret", 5, 10));
        assertTrue(ex.getMessage().contains("60"));
    }

    @Test
    void rejectsKeepAliveTimeJustBelowTheFloor() {
        assertThrows(IllegalArgumentException.class,
                () -> new ScalekitClient(SITE, "id", "secret", ScalekitClient.MIN_KEEPALIVE_TIME_SECONDS - 1, 10));
    }

    @Test
    void acceptsZeroToDisableKeepaliveEntirely() {
        assertDoesNotThrow(() -> new ScalekitClient(SITE, "id", "secret", 0, 0));
    }

    @Test
    void acceptsExactlyTheFloor() {
        assertDoesNotThrow(
                () -> new ScalekitClient(SITE, "id", "secret", ScalekitClient.MIN_KEEPALIVE_TIME_SECONDS, 10));
    }

    @Test
    void threeArgConstructorUsesValidDefaults() {
        assertDoesNotThrow(() -> new ScalekitClient(SITE, "id", "secret"));
    }

    @Test
    void rejectsNonPositiveKeepAliveTimeoutWhenKeepaliveEnabled() {
        assertThrows(IllegalArgumentException.class,
                () -> new ScalekitClient(SITE, "id", "secret", ScalekitClient.MIN_KEEPALIVE_TIME_SECONDS, 0));
        assertThrows(IllegalArgumentException.class,
                () -> new ScalekitClient(SITE, "id", "secret", ScalekitClient.MIN_KEEPALIVE_TIME_SECONDS, -1));
    }

    @Test
    void keepAliveTimeoutIsUnvalidatedWhenKeepaliveDisabled() {
        // keepAliveTimeSeconds=0 means keepalive is off entirely, so a nonsensical companion
        // timeout is harmless - it's never read.
        assertDoesNotThrow(() -> new ScalekitClient(SITE, "id", "secret", 0, -1));
    }

    // A ping interval longer than IDLE_TIMEOUT_SECONDS would never get a chance to fire - the
    // channel idles itself out first, silently defeating the caller's own chosen cadence.
    @Test
    void rejectsKeepAliveTimeAboveTheIdleTimeoutCeiling() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> new ScalekitClient(SITE, "id", "secret", ScalekitClient.IDLE_TIMEOUT_SECONDS + 1, 10));
        assertTrue(ex.getMessage().contains(String.valueOf(ScalekitClient.IDLE_TIMEOUT_SECONDS)));
    }

    @Test
    void acceptsExactlyTheIdleTimeoutCeiling() {
        assertDoesNotThrow(
                () -> new ScalekitClient(SITE, "id", "secret", ScalekitClient.IDLE_TIMEOUT_SECONDS, 10));
    }
}
