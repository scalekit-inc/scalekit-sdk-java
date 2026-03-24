import com.scalekit.ScalekitClient;
import com.scalekit.grpc.scalekit.v1.roles.*;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RoleDefaultsDependentTests {

    private static ScalekitClient client;
    private static String testRoleName;

    @BeforeAll
    static void init() {
        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String clientSecret = System.getenv("SCALEKIT_CLIENT_SECRET");
        testRoleName = System.getenv("TEST_ROLE_NAME");

        Assumptions.assumeTrue(
            environmentUrl != null && !environmentUrl.isEmpty(),
            "SCALEKIT_ENVIRONMENT_URL environment variable is required"
        );
        Assumptions.assumeTrue(
            clientId != null && !clientId.isEmpty(),
            "SCALEKIT_CLIENT_ID environment variable is required"
        );
        Assumptions.assumeTrue(
            clientSecret != null && !clientSecret.isEmpty(),
            "SCALEKIT_CLIENT_SECRET environment variable is required"
        );

        client = new ScalekitClient(environmentUrl, clientId, clientSecret);

        if (testRoleName == null || testRoleName.isEmpty()) {
            testRoleName = "member";
        }
    }

    @Disabled("updateDefaultRoles requires a valid creator role name (environment-specific). " +
              "Set TEST_CREATOR_ROLE_NAME to re-enable once a safe read/restore flow is available.")
    @Test
    public void testUpdateDefaultRoles() {
        String creatorRoleName = System.getenv("TEST_CREATOR_ROLE_NAME");
        Assumptions.assumeTrue(creatorRoleName != null && !creatorRoleName.isEmpty(),
            "TEST_CREATOR_ROLE_NAME environment variable is required");

        UpdateDefaultRolesRequest request = UpdateDefaultRolesRequest.newBuilder()
                .setDefaultCreatorRole(creatorRoleName)
                .build();
        UpdateDefaultRolesResponse response = client.roles().updateDefaultRoles(request);

        assertNotNull(response, "updateDefaultRoles response should not be null");
    }

    @Test
    public void testListDependentRoles() {
        ListDependentRolesResponse response = client.roles().listDependentRoles(testRoleName);

        assertNotNull(response, "listDependentRoles response should not be null");
        List<Role> roles = response.getRolesList();
        assertNotNull(roles, "Dependent roles list should not be null");
        for (Role role : roles) {
            assertNotNull(role.getId(), "Each dependent role should have an ID");
            assertFalse(role.getId().trim().isEmpty(), "Each dependent role ID should not be blank");
        }
    }

    @Test
    public void testListDependentRolesRejectsNullRoleName() {
        assertThrows(IllegalArgumentException.class, () -> {
            client.roles().listDependentRoles(null);
        }, "listDependentRoles should throw IllegalArgumentException for null roleName");
    }

    @Test
    public void testListDependentRolesRejectsEmptyRoleName() {
        assertThrows(IllegalArgumentException.class, () -> {
            client.roles().listDependentRoles("");
        }, "listDependentRoles should throw IllegalArgumentException for empty roleName");
    }
}
