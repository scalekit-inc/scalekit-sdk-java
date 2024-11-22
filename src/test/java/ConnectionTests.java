import com.scalekit.ScalekitClient;
import com.scalekit.grpc.scalekit.v1.connections.Connection;
import com.scalekit.grpc.scalekit.v1.connections.ConnectionProvider;
import com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConnectionTests {

    //configs
    private static String domain;
    private static String testOrg;
    private static String testConnection;

    private static ScalekitClient client;



    @BeforeAll
    static void init(){
        //Init client
        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String  clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String apiSecret = System.getenv("SCALEKIT_CLIENT_SECRET");
        domain = "test.sdk.com";
        testOrg = "org_26727998916919595";
        testConnection = "conn_26728023562649899";

        client = new ScalekitClient(environmentUrl, clientId, apiSecret);
    }

    @Test
    public void ConnectionTest(){

        ListConnectionsResponse response = client.connections().listConnectionsByDomain(domain);
        assertTrue(response.getConnectionsCount() > 0);

        response = client.connections().listConnectionsByOrganization(testOrg);
        assertTrue(response.getConnectionsCount() > 0);

        Connection connection = client.connections().getConnectionById(testConnection, testOrg);


        assertEquals(testConnection, connection.getId());
        assertEquals(ConnectionProvider.MICROSOFT_AD, connection.getProvider());
        assertEquals("https://gmail-dev.scalekit.cloud/sso/v1/oidc/conn_26728023562649899/test", connection.getTestConnectionUri());

    }
}
