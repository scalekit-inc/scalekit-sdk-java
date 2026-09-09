package com.scalekit.internal;

import com.scalekit.Environment;

/**
 * Per-call timeout override, scoped to the current thread. Every {@code api/impl} client calls
 * {@link #resolveMillis()} instead of reading {@code Environment.defaultConfig().timeout}
 * directly, so a caller can temporarily override the deadline for one or more calls (e.g. a
 * longer-running operation, or a tighter budget for a latency-sensitive path) without changing
 * every client method's signature.
 *
 * <p>Scoped via try-with-resources on {@link com.scalekit.ScalekitClient#withTimeout}:
 * <pre>{@code
 * try (var scope = scalekitClient.withTimeout(5, TimeUnit.SECONDS)) {
 *     scalekitClient.organizations().getById("org_123");
 * }
 * }</pre>
 *
 * <p>Uses a plain {@link ThreadLocal}, so it only scopes calls made on the same thread that
 * opened it - the common case for this SDK's synchronous, blocking-stub client methods. It does
 * not propagate across an explicit hand-off to another thread (e.g. submitting work to an
 * executor from inside the scope).
 */
public final class CallTimeout {

    private static final ThreadLocal<Long> OVERRIDE_MILLIS = new ThreadLocal<>();

    private CallTimeout() {
    }

    /** Returns the per-call override if one is active on this thread, else the client's default timeout. */
    public static long resolveMillis() {
        Long override = OVERRIDE_MILLIS.get();
        return override != null ? override : Environment.defaultConfig().timeout;
    }

    /**
     * Opens a scope overriding the timeout for calls made on this thread until the scope is
     * closed.
     *
     * @throws IllegalArgumentException if timeoutMillis is not positive - matches Python's/Node's
     *                                   own per-call timeout validation (Node's assertValidTimeout).
     */
    public static Scope override(long timeoutMillis) {
        if (timeoutMillis <= 0) {
            throw new IllegalArgumentException("timeout must be positive, got " + timeoutMillis + "ms");
        }
        Long previous = OVERRIDE_MILLIS.get();
        OVERRIDE_MILLIS.set(timeoutMillis);
        return () -> {
            if (previous == null) {
                OVERRIDE_MILLIS.remove();
            } else {
                OVERRIDE_MILLIS.set(previous);
            }
        };
    }

    /** An open per-call timeout override; restores the prior state (or clears it) on close. */
    public interface Scope extends AutoCloseable {
        @Override
        void close();
    }
}
