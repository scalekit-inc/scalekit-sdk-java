package com.scalekit.internal;

import com.scalekit.api.AuthClient;
import com.scalekit.exceptions.APIException;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class RetryExecuterTest {

    private AuthClient authClient;
    private ScalekitCredentials credentials;
    private final List<Long> recordedSleeps = new CopyOnWriteArrayList<>();

    @BeforeEach
    void setUp() {
        authClient = mock(AuthClient.class);
        when(authClient.getClientAccessToken()).thenReturn("fresh-token");
        credentials = new ScalekitCredentials(authClient);
        // Swap out the real Thread.sleep so tests exercising retries don't pay the (now much
        // larger, 1s-30s-capped) production backoff in wall-clock time - see backoffBeforeRetry's
        // javadoc-equivalent comment for why the cap was widened. Package-private access is why
        // this test lives in com.scalekit.internal instead of the default package like most of
        // this SDK's other tests - sleeper deliberately isn't public production API surface.
        RetryExecuter.sleeper = recordedSleeps::add;
    }

    @AfterEach
    void tearDown() {
        RetryExecuter.sleeper = ms -> {
            try {
                Thread.sleep(ms);
            } catch (InterruptedException interrupted) {
                Thread.currentThread().interrupt();
            }
        };
    }

    @Test
    void succeedsOnFirstAttemptWithoutRetrying() throws Exception {
        Callable<String> callable = () -> "ok";

        assertEquals("ok", RetryExecuter.executeWithRetry(callable, credentials));
        verifyNoInteractions(authClient);
    }

    @Test
    void retriesOnceOnUnavailableThenSucceeds() throws Exception {
        AtomicInteger calls = new AtomicInteger();
        Callable<String> callable = () -> {
            if (calls.getAndIncrement() == 0) {
                throw new StatusRuntimeException(Status.UNAVAILABLE.withDescription("transport blip"));
            }
            return "ok";
        };

        assertEquals("ok", RetryExecuter.executeWithRetry(callable, credentials));
        assertEquals(2, calls.get());
    }

    @Test
    void retriesOnceOnUnauthenticatedAfterRefreshingCredentialsThenSucceeds() throws Exception {
        AtomicInteger calls = new AtomicInteger();
        Callable<String> callable = () -> {
            if (calls.getAndIncrement() == 0) {
                throw new StatusRuntimeException(Status.UNAUTHENTICATED.withDescription("token expired"));
            }
            return "ok";
        };

        assertEquals("ok", RetryExecuter.executeWithRetry(callable, credentials));
        assertEquals(2, calls.get());
        verify(authClient, times(1)).getClientAccessToken();
    }

    // Reproduces the exact sequence from the production incident this fix addresses: the first
    // attempt fails with UNAVAILABLE (a transport blip), the retry reaches the server but the
    // cached token has since expired so it fails with UNAUTHENTICATED, and a second retry - now
    // with a refreshed token - finally succeeds. Before this fix, the UNAVAILABLE branch's retry
    // had no further recovery for a differently-typed failure and threw immediately.
    @Test
    void survivesUnavailableThenUnauthenticatedChain() throws Exception {
        AtomicInteger calls = new AtomicInteger();
        Callable<String> callable = () -> {
            int n = calls.getAndIncrement();
            if (n == 0) {
                throw new StatusRuntimeException(Status.UNAVAILABLE.withDescription("transport blip"));
            }
            if (n == 1) {
                throw new StatusRuntimeException(Status.UNAUTHENTICATED.withDescription("token expired"));
            }
            return "ok";
        };

        assertEquals("ok", RetryExecuter.executeWithRetry(callable, credentials));
        assertEquals(3, calls.get());
        verify(authClient, times(1)).getClientAccessToken();
    }

    @Test
    void survivesUnauthenticatedThenUnavailableChain() throws Exception {
        AtomicInteger calls = new AtomicInteger();
        Callable<String> callable = () -> {
            int n = calls.getAndIncrement();
            if (n == 0) {
                throw new StatusRuntimeException(Status.UNAUTHENTICATED.withDescription("token expired"));
            }
            if (n == 1) {
                throw new StatusRuntimeException(Status.UNAVAILABLE.withDescription("transport blip"));
            }
            return "ok";
        };

        assertEquals("ok", RetryExecuter.executeWithRetry(callable, credentials));
        assertEquals(3, calls.get());
    }

    @Test
    void exhaustsAttemptsAndThrowsApiExceptionWrappingLastError() {
        Callable<String> callable = () -> {
            throw new StatusRuntimeException(Status.UNAVAILABLE.withDescription("still down"));
        };

        APIException ex = assertThrows(APIException.class,
                () -> RetryExecuter.executeWithRetry(callable, credentials));
        assertEquals(Status.Code.UNAVAILABLE.value(), ex.getGrpcStatusCode());
    }

    @Test
    void doesNotRetryNonRetryableStatus() throws Exception {
        AtomicInteger calls = new AtomicInteger();
        Callable<String> callable = () -> {
            calls.incrementAndGet();
            throw new StatusRuntimeException(Status.INVALID_ARGUMENT.withDescription("bad request"));
        };

        assertThrows(APIException.class, () -> RetryExecuter.executeWithRetry(callable, credentials));
        assertEquals(1, calls.get());
    }

    // Before this fix, a failure inside credentials.updateCredentials() (e.g. the token endpoint
    // itself being unreachable) was a plain RuntimeException with no surrounding try/catch in
    // RetryExecuter, so it propagated unwrapped instead of surfacing as an APIException.
    @Test
    void wrapsCredentialRefreshFailureInsteadOfLeakingRawException() {
        AuthClient failingAuthClient = mock(AuthClient.class);
        when(failingAuthClient.getClientAccessToken())
                .thenThrow(new RuntimeException("token endpoint unreachable"));
        ScalekitCredentials failingCredentials = new ScalekitCredentials(failingAuthClient);

        Callable<String> callable = () -> {
            throw new StatusRuntimeException(Status.UNAUTHENTICATED.withDescription("token expired"));
        };

        APIException ex = assertThrows(APIException.class,
                () -> RetryExecuter.executeWithRetry(callable, failingCredentials));
        assertNotNull(ex.getCause());
        assertTrue(ex.getMessage().contains("Failed to refresh credentials"));
    }

    // Backoff must be wide enough to plausibly outlast a multi-second transient outage (see
    // RetryExecuter's backoffBeforeRetry comment) - not just nonzero. Exhausting all 3 attempts
    // in the previous ~300ms-max backoff meant Java failed cases Python/Node would retry through.
    @Test
    void backoffWidensExponentiallyWithHalfJitter() throws Exception {
        AtomicInteger calls = new AtomicInteger();
        Callable<String> callable = () -> {
            if (calls.getAndIncrement() < 2) {
                throw new StatusRuntimeException(Status.UNAVAILABLE.withDescription("still recovering"));
            }
            return "ok";
        };

        assertEquals("ok", RetryExecuter.executeWithRetry(callable, credentials));

        assertEquals(2, recordedSleeps.size());
        // attempt=1: base 1000ms, half-jitter -> [500, 1000]
        assertTrue(recordedSleeps.get(0) >= 500 && recordedSleeps.get(0) <= 1000,
                "expected first backoff in [500,1000], got " + recordedSleeps.get(0));
        // attempt=2: base 2000ms, half-jitter -> [1000, 2000]
        assertTrue(recordedSleeps.get(1) >= 1000 && recordedSleeps.get(1) <= 2000,
                "expected second backoff in [1000,2000], got " + recordedSleeps.get(1));
    }

    @Test
    void backoffCapsAtThirtySecondsRegardlessOfAttemptCount() {
        // MAX_ATTEMPTS is 3, so this mostly documents the cap's existence for whenever that
        // changes, rather than exercising it through executeWithRetry today.
        Callable<String> callable = () -> {
            throw new StatusRuntimeException(Status.UNAVAILABLE.withDescription("still down"));
        };

        assertThrows(APIException.class, () -> RetryExecuter.executeWithRetry(callable, credentials));

        assertEquals(2, recordedSleeps.size());
        recordedSleeps.forEach(ms -> assertTrue(ms <= 30_000, "backoff exceeded the 30s cap: " + ms));
    }

    // Before this fix, the sleeper caught InterruptedException, restored the interrupt flag, and
    // returned normally - executeWithRetry never checked that flag, so it just proceeded to
    // another callable.call() on a thread that had been told to stop (e.g. executor
    // shutdown/cancellation while an attempt was backing off).
    @Test
    void abortsRetryLoopWhenBackoffIsInterrupted() {
        AtomicInteger calls = new AtomicInteger();
        Callable<String> callable = () -> {
            calls.incrementAndGet();
            throw new StatusRuntimeException(Status.UNAVAILABLE.withDescription("still down"));
        };

        // Simulates what the real sleeper does when Thread.sleep is interrupted: it restores the
        // interrupt flag (Thread.currentThread().interrupt()) without throwing.
        RetryExecuter.sleeper = ms -> Thread.currentThread().interrupt();

        try {
            assertThrows(APIException.class, () -> RetryExecuter.executeWithRetry(callable, credentials));
            assertEquals(1, calls.get(), "should not have retried after the interrupted backoff");
            assertTrue(Thread.currentThread().isInterrupted(), "interrupt status should still be set for the caller to observe");
        } finally {
            Thread.interrupted(); // clear so the flag doesn't leak into later tests on this thread
        }
    }
}
