package com.scalekit.internal;

import com.scalekit.api.AuthClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.exceptions.AuthenticationException;
import com.scalekit.exceptions.InternalServerException;
import com.scalekit.exceptions.NotFoundException;
import com.scalekit.exceptions.ScalekitConnectionException;
import com.scalekit.exceptions.ScalekitTimeoutException;
import com.scalekit.grpc.scalekit.v1.tools.ToolServiceGrpc;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RetryPolicyTest {

    private AuthClient authClient;
    private ScalekitCredentials credentials;
    private List<Long> sleeps;

    @BeforeEach
    void setUp() {
        authClient = mock(AuthClient.class);
        when(authClient.getClientAccessToken()).thenReturn("fresh-token");
        credentials = new ScalekitCredentials(authClient);
        sleeps = RetryTestSupport.recordSleepsInsteadOfSleeping();
    }

    @AfterEach
    void tearDown() {
        RetryTestSupport.restoreRealSleeper();
        Thread.interrupted();
    }

    private static Callable<String> failing(AtomicInteger calls, Status status) {
        return () -> {
            calls.incrementAndGet();
            throw new StatusRuntimeException(status);
        };
    }

    @Test
    void legacyPolicyKeepsTheOldBehaviour() {
        AtomicInteger calls = new AtomicInteger();
        APIException e = assertThrows(APIException.class,
                () -> RetryExecuter.executeWithRetry(failing(calls, Status.UNAVAILABLE), credentials, RetryPolicy.LEGACY));
        assertEquals(APIException.class, e.getClass(), "legacy throws the plain class");
        assertEquals(3, calls.get());

        AtomicInteger nullPolicyCalls = new AtomicInteger();
        assertThrows(APIException.class,
                () -> RetryExecuter.executeWithRetry(failing(nullPolicyCalls, Status.UNAVAILABLE), credentials, null));
        assertEquals(3, nullPolicyCalls.get());
    }

    @Test
    void nonIdempotentNeverRetriesUnavailable() {
        AtomicInteger calls = new AtomicInteger();
        assertThrows(InternalServerException.class, () -> RetryExecuter.executeWithRetry(
                failing(calls, Status.UNAVAILABLE), credentials, RetryPolicy.NON_IDEMPOTENT));
        assertEquals(1, calls.get());
        assertTrue(sleeps.isEmpty());
    }

    @Test
    void idempotentRetriesUnavailableWithBackoff() {
        AtomicInteger calls = new AtomicInteger();
        String result = RetryExecuter.executeWithRetry(() -> {
            if (calls.incrementAndGet() < 3) {
                throw new StatusRuntimeException(Status.UNAVAILABLE);
            }
            return "ok";
        }, credentials, RetryPolicy.IDEMPOTENT);
        assertEquals("ok", result);
        assertEquals(2, sleeps.size());
    }

    @Test
    void deadlineExceededIsNeverRetried() {
        AtomicInteger calls = new AtomicInteger();
        assertThrows(ScalekitTimeoutException.class, () -> RetryExecuter.executeWithRetry(
                failing(calls, Status.DEADLINE_EXCEEDED), credentials, RetryPolicy.IDEMPOTENT));
        assertEquals(1, calls.get());
    }

    @Test
    void otherErrorsAreNotRetried() {
        AtomicInteger calls = new AtomicInteger();
        assertThrows(NotFoundException.class, () -> RetryExecuter.executeWithRetry(
                failing(calls, Status.NOT_FOUND), credentials, RetryPolicy.IDEMPOTENT));
        assertEquals(1, calls.get());
    }

    @Test
    void failedRefreshBecomesAuthenticationException() {
        when(authClient.getClientAccessToken()).thenThrow(new RuntimeException("bad secret"));
        AtomicInteger calls = new AtomicInteger();
        AuthenticationException e = assertThrows(AuthenticationException.class, () -> RetryExecuter.executeWithRetry(
                failing(calls, Status.UNAUTHENTICATED), credentials, RetryPolicy.NON_IDEMPOTENT));
        assertNotNull(e.getCause());
        assertEquals(1, calls.get());
    }

    @Test
    void interruptDuringBackoffStopsWithConnectionException() {
        RetryExecuter.sleeper = ms -> Thread.currentThread().interrupt();
        AtomicInteger calls = new AtomicInteger();
        ScalekitConnectionException e = assertThrows(ScalekitConnectionException.class,
                () -> RetryExecuter.executeWithRetry(failing(calls, Status.UNAVAILABLE), credentials,
                        RetryPolicy.IDEMPOTENT));
        assertEquals(1, calls.get());
        assertTrue(e.getCause() instanceof InterruptedException);
        assertEquals(Status.Code.CANCELLED.value(), e.getGrpcStatusCode());
        assertTrue(Thread.currentThread().isInterrupted());
    }

    @Test
    void everyWrappedMethodHasAPolicyAndUnknownOnesFailFast() {
        assertEquals(RetryPolicy.NON_IDEMPOTENT, MethodRetryPolicies.of(ToolServiceGrpc.getExecuteToolMethod()));
        assertEquals(RetryPolicy.IDEMPOTENT, MethodRetryPolicies.of(ToolServiceGrpc.getListToolsMethod()));
        assertThrows(IllegalStateException.class, () -> MethodRetryPolicies.of(ToolServiceGrpc.getSearchToolsMethod()));
    }
}
