package com.scalekit.internal;

import com.scalekit.exceptions.APIException;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.LongConsumer;

public class RetryExecuter {

    private static final int MAX_ATTEMPTS = 3;

    // Matches Python's/Node's shape: 1s base, doubling per attempt, capped at 30s - long enough
    // that a retry sequence can plausibly outlast a multi-second transient outage instead of
    // exhausting all attempts in the first few hundred milliseconds (see java-sdk-auth-hooks-client
    // task notes: a toxiproxy fault-matrix run showed the previous 100ms-based backoff finishing
    // all 3 attempts in well under 300ms, failing a case where the outage cleared at 2s that
    // Python/Node would have successfully retried through).
    private static final long UNAVAILABLE_BASE_BACKOFF_MILLIS = 1000;
    private static final long UNAVAILABLE_MAX_BACKOFF_MILLIS = 30_000;

    // Swappable so tests (in this same package) can assert on the computed backoff without
    // actually sleeping for it. Package-private deliberately - this controls production retry
    // timing, so it shouldn't be reachable (and overridable) from arbitrary application code.
    static LongConsumer sleeper = ms -> {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException interrupted) {
            Thread.currentThread().interrupt();
        }
    };

    /**
     * Retries on UNAUTHENTICATED (refreshing credentials first) and UNAVAILABLE (backing off
     * first), since both mean the request was rejected before any handler ran on the server -
     * unlike DEADLINE_EXCEEDED, which is deliberately never retried here because the server may
     * have already started processing a non-idempotent write by the time the deadline fires.
     * A single failing call can therefore take up to MAX_ATTEMPTS x the per-call deadline
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
                throw new APIException(e.getMessage());
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
