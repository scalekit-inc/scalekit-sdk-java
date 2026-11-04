package com.scalekit.internal;

/**
 * How {@link RetryExecuter} retries a call and which exceptions it throws. Not part of the public
 * API.
 */
public enum RetryPolicy {

    /**
     * The behaviour of the clients that predate 2.6.0: refresh credentials on any
     * UNAUTHENTICATED, retry UNAVAILABLE for every call, and throw plain {@code APIException}.
     */
    LEGACY,

    /**
     * For calls that are safe to repeat: retry UNAVAILABLE with backoff, refresh credentials and
     * retry only when the SDK's own credentials were rejected, and throw status-family exceptions.
     */
    IDEMPOTENT,

    /**
     * For calls that must not run twice (running a tool, creates): as {@link #IDEMPOTENT}, but
     * UNAVAILABLE is never retried, because the server may already have acted on the request.
     */
    NON_IDEMPOTENT
}
