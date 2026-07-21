
import com.scalekit.ScalekitClient;
import com.scalekit.grpc.scalekit.v1.events.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class EventsTests {

    private static ScalekitClient client;

    @BeforeAll
    static void init(){
        //Init client
        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String  clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String apiSecret = System.getenv("SCALEKIT_CLIENT_SECRET");

        client = new ScalekitClient(environmentUrl, clientId, apiSecret);
    }

    @Test
    void ListEventsPaginatedTest() {
        ListEventsPaginatedResponse response = client.events().listEventsPaginated(10, "");

        assertNotNull(response);
        // Events list may be empty for a fresh environment - that is a valid response.
        assertNotNull(response.getEventsList());
        // Reading the page tokens must not throw regardless of whether more pages exist.
        assertDoesNotThrow(response::getNextPageToken);
        assertDoesNotThrow(response::getPrevPageToken);
    }

    @Test
    void ListEventsTest() {
        ListEventsResponse response = client.events().listEvents(10, "");

        assertNotNull(response);
        assertNotNull(response.getEventsList());
        assertDoesNotThrow(response::getTotalSize);
    }

    @Test
    void ListEventsWithFiltersTest() {
        EventFilter filter = EventFilter.newBuilder()
                .setOrganizationId("org_does_not_exist")
                .setSource(Source.SCALEKIT)
                .build();

        ListEventsResponse response = client.events().listEvents(filter, 5, "");

        assertNotNull(response);
        // A nonexistent organization_id filters out all events, but the call still succeeds.
        assertEquals(0, response.getEventsList().size());
    }

    @Test
    void ListEventsAuthRequestIdFilterNoMatchTest() {
        EventFilter filter = EventFilter.newBuilder()
                .setAuthRequestId("areq_does_not_exist")
                .build();

        ListEventsResponse response = client.events().listEvents(filter, 10, "");

        assertNotNull(response);
        assertEquals(0, response.getEventsList().size());
    }

}
