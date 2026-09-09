import com.scalekit.internal.CallTimeout;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CallTimeoutTest {

    @Test
    void resolvesToEnvironmentDefaultWithNoOverride() {
        com.scalekit.Environment.configure("https://example.scalekit.dev", "id", "secret");
        assertEquals(com.scalekit.Environment.defaultConfig().timeout, CallTimeout.resolveMillis());
    }

    @Test
    void environmentDefaultsToTwentySecondsMatchingPythonAndNode() {
        com.scalekit.Environment.configure("https://example.scalekit.dev", "id", "secret");
        assertEquals(20_000, com.scalekit.Environment.defaultConfig().timeout);
    }

    @Test
    void rejectsZeroOrNegativeOverride() {
        assertThrows(IllegalArgumentException.class, () -> CallTimeout.override(0));
        assertThrows(IllegalArgumentException.class, () -> CallTimeout.override(-1));
    }

    @Test
    void overrideAppliesWithinScope() {
        try (CallTimeout.Scope scope = CallTimeout.override(5000)) {
            assertEquals(5000, CallTimeout.resolveMillis());
        }
    }

    @Test
    void overrideIsClearedAfterScopeCloses() {
        com.scalekit.Environment.configure("https://example.scalekit.dev", "id", "secret");
        long defaultTimeout = com.scalekit.Environment.defaultConfig().timeout;

        CallTimeout.Scope scope = CallTimeout.override(5000);
        scope.close();

        assertEquals(defaultTimeout, CallTimeout.resolveMillis());
    }

    @Test
    void nestedOverrideRestoresOuterOverrideOnClose() {
        try (CallTimeout.Scope outer = CallTimeout.override(9000)) {
            try (CallTimeout.Scope inner = CallTimeout.override(1000)) {
                assertEquals(1000, CallTimeout.resolveMillis());
            }
            assertEquals(9000, CallTimeout.resolveMillis());
        }
    }
}
