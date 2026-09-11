package com.scalekit.internal;

import com.scalekit.exceptions.APIException;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.LongConsumer;

public class RetryExecuter {

    private static final int MAX_ATTEMPTS = 3;

    // 1s base, doubling per attempt - long enough that a retry sequence can plausibly outlast a
    // multi-second transient outage instead of exhausting all attempts in the first few hundred
    // milliseconds (see java-sdk-auth-hooks-client task notes: a toxiproxy fault-matrix run showed
    // the previous 100ms-based backoff finishing all 3 attempts in well under 300ms, failing a
    // case that a wider backoff retried through successfully).
    //
    // UNAVAILABLE_MAX_BACKOFF_MILLIS is headroom for a future MAX_ATTEMPTS increase, not live
    // today: with MAX_ATTEMPTS=3, backoffBeforeRetry only ever runs for attempt=1 and attempt=2
    // (1000ms and 2000ms), so the 30s cap can never actually bind at the current attempt count -
    // don't read its presence as evidence the SDK backs off up to 30s right now.
    private static final long UNAVAILABLE_BASE_BACKOFF_MILLIS = 1000;
    private static final long UNAVAILABLE_MAX_BACKOFF_MILLIS = 30_000;

    // Swappable so tests (in this same package) can assert on the computed backoff without
    // actually sleeping for it. Package-private deliberately - this controls production retry
    // timing, so it shouldn't be reachable (and overridable) from arbitrary application code.
    // Not thread-safe against concurrent test execution: a single mutable static field means two
    // tests swapping it in parallel (e.g. under a future switch to JUnit's parallel execution,
    // off by default today) can race and clobber each other's override.
    static LongConsumer sleeper = ms -> {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException interrupted) {
            Thread.currentThread().interrupt();
        }
    };

    /**
     * Retries on UNAUTHENTICATED (refreshing credentials first - a rejected token means the
     * request never reached a handler, so this one is safe) and on UNAVAILABLE (backing off
     * first).
     *
     * <p>UNAVAILABLE is <b>not</b> the same kind of safe. A connection torn down after the
     * request was already written, a keepalive timeout on a still-in-progress call, and a
     * request the server fully processed but whose response never made it back are all
     * indistinguishable from this side - only some of those are actually safe to retry. This SDK
     * retries UNAVAILABLE anyway, unconditionally, for every operation including non-idempotent
     * writes ({@code create*}/{@code update*}/{@code delete*} etc.) - a deliberate
     * availability-over-safety tradeoff, not a proven-safe case. This matches the Node SDK's
     * actual behavior (also unconditional) and this SDK's own default before this change existed;
     * Python defaults the same way but additionally exposes a per-call opt-out
     * ({@code retry_on_unavailable=False}) for callers who need to disable it - this SDK doesn't
     * have that yet. Per-operation idempotency-aware retry (skip the retry for known-unsafe
     * writes, closing this gap) is tracked as separate follow-up work, not addressed here.
     *
     * <p>DEADLINE_EXCEEDED is deliberately never retried, for the identical reason UNAVAILABLE's
     * retry is risky: the server may have already started processing a non-idempotent write by
     * the time the deadline fires. The two branches currently land on different sides of the
     * same tradeoff - that inconsistency is real, and exactly what the follow-up above should
     * resolve, not something this comment should paper over.
     *
     * <p>A single failing call can therefore take up to MAX_ATTEMPTS x the per-call deadline
     * (Environment.defaultConfig().timeout) to finally fail.
     */
    public static <T> T executeWithRetry(Callable<T> callable, ScalekitCredentials credentials) {
        StatusRuntimeException lastError = null;

        for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
            try {
                return callable.call();
            } catch (StatusRuntimeException e) {
                Status.Code code = e.getStatus().getCode();
                if (code != Status.Code.UNAUTHENTICATED && code != Status.Code.UNAVAILABLE) {
                    throw new APIException(e);
                }

                lastError = e;
                if (attempt == MAX_ATTEMPTS) {
                    break;
                }

                if (code == Status.Code.UNAUTHENTICATED) {
                    try {
                        credentials.updateCredentials();
                    } catch (Exception refreshError) {
                        throw new APIException(
                                "Failed to refresh credentials after UNAUTHENTICATED response: " + refreshError.getMessage(),
                                refreshError);
                    }
                } else if (!backoffBeforeRetry(attempt)) {
                    // Interrupted mid-backoff (e.g. executor shutdown/cancellation) - stop
                    // retrying instead of firing another RPC on a thread that's been told to
                    // stop. The interrupt flag stays set (backoffBeforeRetry doesn't clear it)
                    // so calling code still observes the interruption.
                    throw new APIException("Retry aborted: interrupted while backing off after " + code, lastError);
                }
            } catch (Exception e) {
                throw new APIException(e.getMessage(), e);
            }
        }

        throw new APIException(lastError);
    }

    // Exponential backoff with half jitter (same shape as Python's/Node's: base * (0.5 + rand()
    // * 0.5)), so a channel-wide UNAVAILABLE blip doesn't turn into every concurrent caller
    // retrying in lockstep against a struggling backend, while still guaranteeing at least half
    // of the capped delay - full 0-to-max jitter could roll close to zero and defeat the point
    // of widening the cap in the first place.
    //
    // @return false if the sleep was interrupted (caller should abort the retry loop instead of
    //         making another RPC), true if it completed normally.
    private static boolean backoffBeforeRetry(int attempt) {
        long capped = Math.min(UNAVAILABLE_BASE_BACKOFF_MILLIS * (1L << (attempt - 1)), UNAVAILABLE_MAX_BACKOFF_MILLIS);
        double jitterFactor = 0.5 + ThreadLocalRandom.current().nextDouble() * 0.5;
        long delayMillis = (long) (capped * jitterFactor);
        sleeper.accept(delayMillis);
        return !Thread.currentThread().isInterrupted();
    }
}
