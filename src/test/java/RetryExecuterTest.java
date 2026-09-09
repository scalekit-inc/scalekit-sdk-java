import com.scalekit.api.AuthClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class RetryExecuterTest {

    private AuthClient authClient;
    private ScalekitCredentials credentials;

    @BeforeEach
    void setUp() {
        authClient = mock(AuthClient.class);
        when(authClient.getClientAccessToken()).thenReturn("fresh-token");
        credentials = new ScalekitCredentials(authClient);
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
}
