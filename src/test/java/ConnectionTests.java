import com.scalekit.Environment;
import com.scalekit.ScalekitClient;
import com.scalekit.grpc.scalekit.v1.connections.*;
import com.scalekit.grpc.scalekit.v1.organizations.CreateOrganization;
import com.scalekit.grpc.scalekit.v1.organizations.Organization;
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
        domain = System.getenv("TEST_DOMAIN");
        testOrg = System.getenv("TEST_ORGANIZATION");
        testConnection = System.getenv("TEST_CONNECTION");

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
        assertEquals(ConnectionProvider.OKTA, connection.getProvider());
        String connectionURL  =Environment.defaultConfig().siteName + "/sso/v1/oidc/" + connection.getId() + "/test";
        assertEquals(connectionURL, connection.getTestConnectionUri());

    }

    @Test
    public void CreateConnectionTest(){

        Organization organization = client.organizations().create(
                CreateOrganization.newBuilder()
                        .setDisplayName("Test Organization For Connection Creation")
                        .build()
        );

        assert organization != null;

        Connection connection = client.connections().createConnection(organization.getId(), CreateConnection.newBuilder()
                        .setProvider(ConnectionProvider.OKTA)
                        .setType(ConnectionType.OIDC)
                .build());

        assert connection != null;


        assertEquals(ConnectionProvider.OKTA, connection.getProvider());
        String connectionURL  =Environment.defaultConfig().siteName + "/sso/v1/oidc/" + connection.getId() + "/test";
        assertEquals(connectionURL, connection.getTestConnectionUri());

    }
}
