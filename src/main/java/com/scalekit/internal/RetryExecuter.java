package com.scalekit.internal;

import com.scalekit.exceptions.APIException;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class RetryExecuter {

    private static final int MAX_ATTEMPTS = 3;
    private static final long UNAVAILABLE_BASE_BACKOFF_MILLIS = 100;

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
                } else {
                    backoffBeforeRetry(attempt);
                }
            } catch (Exception e) {
                throw new APIException(e.getMessage());
            }
        }

        throw new APIException(lastError);
    }

    // Exponential backoff with full jitter, so a channel-wide UNAVAILABLE blip doesn't turn into
    // every concurrent caller retrying in lockstep against a struggling backend.
    private static void backoffBeforeRetry(int attempt) {
        long maxDelayMillis = UNAVAILABLE_BASE_BACKOFF_MILLIS * (1L << (attempt - 1));
        long delayMillis = ThreadLocalRandom.current().nextLong(maxDelayMillis);
        try {
            Thread.sleep(delayMillis);
        } catch (InterruptedException interrupted) {
            Thread.currentThread().interrupt();
        }
    }
}
