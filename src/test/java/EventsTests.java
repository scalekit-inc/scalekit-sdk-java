
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

}
