import com.scalekit.ScalekitClient;
import com.scalekit.grpc.scalekit.v1.connections.Connection;
import com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConnectionTests {
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
    public void ConnectionTest(){

        ListConnectionsResponse response = client.connections().listConnectionsByDomain("test.sdk.com");
        assertTrue(response.getConnectionsCount() > 0);

        response = client.connections().listConnectionsByOrganization("org_26727998916919595");
        assertTrue(response.getConnectionsCount() > 0);

        Connection connection = client.connections().getConnectionById("conn_26728023562649899", "org_26727998916919595");

        assertEquals("conn_26728023562649899", connection.getId());
    }
}
