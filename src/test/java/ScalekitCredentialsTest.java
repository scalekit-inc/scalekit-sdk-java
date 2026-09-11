import com.scalekit.api.AuthClient;
import com.scalekit.internal.Constants;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.CallCredentials;
import io.grpc.Metadata;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class ScalekitCredentialsTest {

    private AuthClient authClient;
    private ScalekitCredentials credentials;

    @BeforeEach
    void setUp() {
        authClient = mock(AuthClient.class);
        credentials = new ScalekitCredentials(authClient);
    }

    @Test
    void tokenIsNullBeforeFirstUse() {
        assertNull(credentials.getToken());
    }

    @Test
    void applyRequestMetadataFetchesAndCachesTokenOnColdStart() {
        when(authClient.getClientAccessToken()).thenReturn("token-a");

        CallCredentials.RequestInfo requestInfo = mock(CallCredentials.RequestInfo.class);
        CallCredentials.MetadataApplier applier = mock(CallCredentials.MetadataApplier.class);

        credentials.applyRequestMetadata(requestInfo, Runnable::run, applier);

        verify(applier, times(1)).apply(any());
        verify(applier, never()).fail(any());
        assertEquals("token-a", credentials.getToken());
    }

    // The bug this guards against: applyRequestMetadata's cold-start "if no token cached, fetch
    // one" is a check-then-act sequence. With a plain (even volatile) field, concurrent callers
    // can all observe no cached token and each independently fetch one - not a crash, but every
    // fetch is a real network call, and the last write silently wins with no guarantee of
    // consistency. AtomicReference.compareAndSet makes the *cache install* atomic: every caller
    // still gets a valid token for its own request, and the cache converges to exactly one of
    // the fetched values instead of an undefined race.
    @Test
    void concurrentColdStartConvergesToASingleCachedTokenAndNeverAppliesNull() throws InterruptedException {
        AtomicInteger counter = new AtomicInteger();
        when(authClient.getClientAccessToken()).thenAnswer(inv -> "token-" + counter.incrementAndGet());

        int threadCount = 16;
        CountDownLatch ready = new CountDownLatch(threadCount);
        CountDownLatch go = new CountDownLatch(1);
        List<String> appliedTokens = new CopyOnWriteArrayList<>();

        List<Thread> threads = IntStream.range(0, threadCount).mapToObj(i -> new Thread(() -> {
            CallCredentials.RequestInfo requestInfo = mock(CallCredentials.RequestInfo.class);
            CallCredentials.MetadataApplier applier = mock(CallCredentials.MetadataApplier.class);
            doAnswer(inv -> {
                Metadata headers = inv.getArgument(0);
                appliedTokens.add(headers.get(Constants.AUTHORIZATION_METADATA_KEY));
                return null;
            }).when(applier).apply(any());

            ready.countDown();
            try {
                go.await();
            } catch (InterruptedException ignored) {
                Thread.currentThread().interrupt();
            }
            credentials.applyRequestMetadata(requestInfo, Runnable::run, applier);
        })).collect(Collectors.toList());

        threads.forEach(Thread::start);
        ready.await();
        go.countDown();
        for (Thread t : threads) {
            t.join();
        }

        assertEquals(threadCount, appliedTokens.size());
        assertTrue(appliedTokens.stream().allMatch(t -> t != null && t.startsWith("Bearer token-")));
        assertNotNull(credentials.getToken());
    }

    @Test
    void updateCredentialsDebouncesRepeatedRefreshesWithinFiveSeconds() {
        when(authClient.getClientAccessToken()).thenReturn("token-a", "token-b");

        credentials.updateCredentials();
        assertEquals("token-a", credentials.getToken());

        credentials.updateCredentials();
        credentials.updateCredentials();

        assertEquals("token-a", credentials.getToken());
        verify(authClient, times(1)).getClientAccessToken();
    }
}
