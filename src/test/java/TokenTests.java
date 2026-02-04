import com.scalekit.ScalekitClient;
import com.scalekit.grpc.scalekit.v1.organizations.CreateOrganization;
import com.scalekit.grpc.scalekit.v1.organizations.Organization;
import com.scalekit.grpc.scalekit.v1.tokens.*;
import com.scalekit.grpc.scalekit.v1.users.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class TokenTests {

    private static ScalekitClient client;
    private static String testOrgId;

    @BeforeAll
    static void init() {
        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String apiSecret = System.getenv("SCALEKIT_CLIENT_SECRET");

        client = new ScalekitClient(environmentUrl, clientId, apiSecret);

        // Create a dedicated test organization for token tests
        CreateOrganization createOrganization = CreateOrganization.newBuilder()
                .setDisplayName("Token Tests Org " + System.currentTimeMillis())
                .build();

        Organization org = client.organizations().create(createOrganization);
        testOrgId = org.getId();
    }

    @AfterAll
    static void cleanup() {
        if (testOrgId != null) {
            try {
                client.organizations().deleteById(testOrgId);
            } catch (Exception e) {
                // best effort cleanup
            }
        }
    }

    @Test
    void testCreateToken() {
        CreateTokenResponse response = client.tokens().create(testOrgId);

        assertNotNull(response);
        assertNotNull(response.getToken());
        assertFalse(response.getToken().isEmpty());
        assertNotNull(response.getTokenId());
        assertTrue(response.getTokenId().startsWith("apit_"));
        assertNotNull(response.getTokenInfo());
        assertEquals(testOrgId, response.getTokenInfo().getOrganizationId());

        // Cleanup
        client.tokens().invalidate(response.getTokenId());
    }

    @Test
    void testCreateTokenWithCustomClaims() {
        Map<String, String> customClaims = new HashMap<>();
        customClaims.put("env", "test");
        customClaims.put("scope", "read");

        CreateTokenResponse response = client.tokens().create(
                testOrgId, null, customClaims, "SDK Test Token"
        );

        assertNotNull(response);
        assertNotNull(response.getToken());
        assertTrue(response.getTokenId().startsWith("apit_"));
        assertNotNull(response.getTokenInfo());
        assertEquals(testOrgId, response.getTokenInfo().getOrganizationId());

        // Cleanup
        client.tokens().invalidate(response.getTokenId());
    }

    @Test
    void testCreateTokenWithUserId() {
        // Create a test user with a unique email; sendInvitationEmail=false ensures active membership
        String userEmail = "tokentest" + UUID.randomUUID().toString().substring(0, 8) + "@example.com";
        CreateUser user = CreateUser.newBuilder()
                .setEmail(userEmail)
                .build();

        CreateUserAndMembershipRequest createRequest = CreateUserAndMembershipRequest.newBuilder()
                .setOrganizationId(testOrgId)
                .setUser(user)
                .setSendInvitationEmail(false)
                .build();

        CreateUserAndMembershipResponse createdUser = client.users().createUserAndMembership(testOrgId, createRequest);
        String userId = createdUser.getUser().getId();

        // Create a user-scoped token
        CreateTokenResponse response = client.tokens().create(
                testOrgId, userId, null, "User scoped token"
        );

        assertNotNull(response);
        assertNotNull(response.getToken());
        assertTrue(response.getTokenId().startsWith("apit_"));

        // Cleanup
        client.tokens().invalidate(response.getTokenId());
        client.users().deleteUser(userId);
    }

    @Test
    void testValidateToken() {
        // Create a token
        CreateTokenResponse createResponse = client.tokens().create(testOrgId);
        String opaqueToken = createResponse.getToken();

        // Validate using the opaque token
        ValidateTokenResponse validateResponse = client.tokens().validate(opaqueToken);

        assertNotNull(validateResponse);
        assertNotNull(validateResponse.getTokenInfo());
        assertEquals(testOrgId, validateResponse.getTokenInfo().getOrganizationId());

        // Cleanup
        client.tokens().invalidate(createResponse.getTokenId());
    }

    @Test
    void testValidateTokenById() {
        // Create a token
        CreateTokenResponse createResponse = client.tokens().create(testOrgId);
        String tokenId = createResponse.getTokenId();

        // Validate using the token_id
        ValidateTokenResponse validateResponse = client.tokens().validate(tokenId);

        assertNotNull(validateResponse);
        assertNotNull(validateResponse.getTokenInfo());
        assertEquals(testOrgId, validateResponse.getTokenInfo().getOrganizationId());

        // Cleanup
        client.tokens().invalidate(tokenId);
    }

    @Test
    void testListTokens() {
        // Create a token
        CreateTokenResponse createResponse = client.tokens().create(testOrgId);

        // List tokens for the organization
        ListTokensResponse listResponse = client.tokens().list(testOrgId, 10, null);

        assertNotNull(listResponse);
        assertTrue(listResponse.getTokensCount() > 0);
        assertTrue(listResponse.getTotalCount() > 0);

        // Cleanup
        client.tokens().invalidate(createResponse.getTokenId());
    }

    @Test
    void testListTokensWithPagination() {
        // Create multiple tokens
        String[] tokenIds = new String[3];
        for (int i = 0; i < 3; i++) {
            CreateTokenResponse response = client.tokens().create(testOrgId);
            tokenIds[i] = response.getTokenId();
        }

        // List with small page size
        ListTokensResponse listResponse = client.tokens().list(testOrgId, 2, null);

        assertNotNull(listResponse);
        assertTrue(listResponse.getTokensCount() <= 2);

        // Cleanup
        for (String tokenId : tokenIds) {
            client.tokens().invalidate(tokenId);
        }
    }

    @Test
    void testInvalidateToken() {
        // Create a token
        CreateTokenResponse createResponse = client.tokens().create(testOrgId);
        String tokenId = createResponse.getTokenId();

        // Invalidate the token
        client.tokens().invalidate(tokenId);

        // Verify token no longer appears in the list
        ListTokensResponse listResponse = client.tokens().list(testOrgId, 30, null);
        List<String> tokenIds = listResponse.getTokensList().stream()
                .map(Token::getTokenId)
                .collect(Collectors.toList());

        assertFalse(tokenIds.contains(tokenId));
    }

    @Test
    void testInvalidateTokenIdempotent() {
        // Create a token
        CreateTokenResponse createResponse = client.tokens().create(testOrgId);
        String tokenId = createResponse.getTokenId();

        // Invalidate twice - should not throw
        client.tokens().invalidate(tokenId);
        client.tokens().invalidate(tokenId);
    }
}
