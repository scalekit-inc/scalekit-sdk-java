import com.scalekit.ScalekitClient;
import com.scalekit.grpc.scalekit.v1.connections.Connection;
import com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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

        ListConnectionsResponse response = client.Connections().ListConnectionsByDomain("test.sdk.com");
        System.out.println(response);

        response = client.Connections().ListConnectionsByOrganization("org_26727998916919595");
        System.out.println(response);

        Connection connection = client.Connections().GetConnectionById("conn_26728023562649899", "org_26727998916919595");

        System.out.println(connection);
    }
}
