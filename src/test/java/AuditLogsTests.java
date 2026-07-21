import com.scalekit.ScalekitClient;
import com.scalekit.grpc.scalekit.v1.auditlogs.*;
import com.scalekit.grpc.scalekit.v1.events.EventFilter;
import com.scalekit.grpc.scalekit.v1.events.ListEventsResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class AuditLogsTests {

    private static ScalekitClient client;

    @BeforeAll
    static void init() {
        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String apiSecret = System.getenv("SCALEKIT_CLIENT_SECRET");

        client = new ScalekitClient(environmentUrl, clientId, apiSecret);
    }

    @Test
    void ListAuthRequestsTest() {
        ListAuthLogRequest request = ListAuthLogRequest.newBuilder()
                .setPageSize(10)
                .build();

        ListAuthLogResponse response = client.auditLogs().listAuthRequests(request);

        assertNotNull(response);
        // The list may be empty for a fresh environment - that is a valid response.
        assertNotNull(response.getAuthRequestsList());
        assertDoesNotThrow(response::getTotalSize);
    }

    @Test
    void ListAuthRequestsWithFiltersTest() {
        ListAuthLogRequest request = ListAuthLogRequest.newBuilder()
                .setEmail("nobody-matching@example.com")
                .addAllStatus(Collections.singletonList("SUCCESS"))
                .setPageSize(5)
                .build();

        ListAuthLogResponse response = client.auditLogs().listAuthRequests(request);

        assertNotNull(response);
        // A non-matching email filters out all logs, but the call still succeeds.
        assertEquals(0, response.getAuthRequestsList().size());
    }

    /**
     * Fetches real authentication request logs, takes a real authRequestId from the results,
     * and confirms the Events API returns at least one event for that same authRequestId.
     * No IDs are hardcoded — everything is fetched live from the environment. If the
     * environment has no authentication request history, there is nothing to correlate, so
     * the assertion is skipped rather than failed.
     */
    @Test
    void EventsCorrelateWithAuthRequestIdTest() {
        ListAuthLogRequest request = ListAuthLogRequest.newBuilder()
                .setPageSize(50)
                .build();

        ListAuthLogResponse authResponse = client.auditLogs().listAuthRequests(request);
        assertNotNull(authResponse);

        String authRequestId = authResponse.getAuthRequestsList().stream()
                .map(AuthLogRequest::getAuthRequestId)
                .filter(id -> id != null && !id.isEmpty())
                .findFirst()
                .orElse(null);

        Assumptions.assumeTrue(
                authRequestId != null,
                "No authentication request logs with an authRequestId were found in this "
                        + "environment; nothing to correlate against the Events API."
        );

        EventFilter filter = EventFilter.newBuilder()
                .setAuthRequestId(authRequestId)
                .build();
        ListEventsResponse eventsResponse = client.events().listEvents(filter, 10, "");

        assertNotNull(eventsResponse);
        assertTrue(
                eventsResponse.getEventsList().size() > 0,
                "Expected at least one event for authRequestId=" + authRequestId
                        + ", which was returned by listAuthRequests, but the Events API returned none."
        );
    }

}
