import com.scalekit.ScalekitClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.internal.ScalekitCredentials;
import com.scalekit.internal.http.AccessTokenClaims;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

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

    @Test
    public void TestValidateAccessTokenAndGetClaims() throws Exception {
        String token = client.authentication().getClientAccessToken();
        Map<String, Object> claims = client.authentication().validateAccessTokenAndGetClaims(token);

        assertNotNull(claims);
        assertTrue(claims.containsKey("sub"));
        assertTrue(claims.containsKey("iss"));
        assertTrue(claims.containsKey("iat"));
        assertTrue(claims.containsKey("exp"));

        AccessTokenClaims typed = client.authentication().getTokenClaims(token, AccessTokenClaims.class);
        assertEquals(claims.get("sub"), typed.getSub());
        assertEquals(claims.get("iss"), typed.getIss());
        assertEquals(claims.get("sub"), typed.getClaims().get("sub"));
        assertEquals(claims.get("iss"), typed.getClaims().get("iss"));
    }

    @Test
    public void TestGetTokenClaims() throws Exception {
        String token = client.authentication().getClientAccessToken();
        AccessTokenClaims result = client.authentication().getTokenClaims(token, AccessTokenClaims.class);

        assertNotNull(result.getSub());
        assertNotNull(result.getIss());
        assertTrue(result.getExp() > 0);
        assertTrue(result.getIat() > 0);

        Map<String, Object> claims = result.getClaims();
        assertNotNull(claims);
        assertTrue(claims.containsKey("sub"));
        assertTrue(claims.containsKey("iss"));
        assertTrue(claims.containsKey("iat"));
        assertTrue(claims.containsKey("exp"));
        assertEquals(result.getSub(), claims.get("sub"));
        assertEquals(result.getIss(), claims.get("iss"));
    }

    @Test
    public void TestGetTokenClaims_NullJwt_ThrowsAPIException() {
        assertThrows(APIException.class, () ->
            client.authentication().getTokenClaims(null, AccessTokenClaims.class));
    }

    @Test
    public void TestGetTokenClaims_EmptyJwt_ThrowsAPIException() {
        assertThrows(APIException.class, () ->
            client.authentication().getTokenClaims("", AccessTokenClaims.class));
    }

    @Test
    public void TestGetTokenClaims_InvalidSignature_ThrowsAPIException() {
        String validToken = client.authentication().getClientAccessToken();
        String[] parts = validToken.split("\\.");
        String tamperedToken = parts[0] + "." + parts[1] + ".invalidsignature";
        assertThrows(APIException.class, () ->
            client.authentication().getTokenClaims(tamperedToken, AccessTokenClaims.class));
    }
}
