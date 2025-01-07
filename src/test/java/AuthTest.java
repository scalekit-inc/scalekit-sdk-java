import com.scalekit.ScalekitClient;
import com.scalekit.internal.ScalekitCredentials;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

public class AuthTest {

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
    public void TestValidateAccessToken() throws Exception {
        String token = client.authentication().getClientAccessToken();
        assertTrue(client.authentication().validateAccessToken(token));
    }

    @Test
    public void TestCredentials() throws Exception {

        ScalekitCredentials credentials = new ScalekitCredentials(client.authentication());
        assertNotNull(credentials);

        credentials.updateCredentials();
        String token1 = credentials.getToken();

        credentials.updateCredentials();
        credentials.updateCredentials();
        credentials.updateCredentials();

        // New token should not be generated
        String token2 = credentials.getToken();
        assertEquals(token1, token2);



        sleep(6000);

        // New Token will be generated
        credentials.updateCredentials();
        String token3 = credentials.getToken();
        assertNotEquals(token2, token3);

        List<Thread> threads = Arrays.asList(
                new Thread(credentials::updateCredentials),
                new Thread(credentials::updateCredentials),
                new Thread(credentials::updateCredentials),
                new Thread(credentials::updateCredentials)
        );

        threads.forEach(Thread::start);
        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
               fail();
            }
        });


        String  token4 = credentials.getToken();
        assertEquals(token3, token4);
    }

}
