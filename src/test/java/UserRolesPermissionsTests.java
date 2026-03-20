import com.scalekit.ScalekitClient;
import com.scalekit.grpc.scalekit.v1.commons.Role;
import com.scalekit.grpc.scalekit.v1.users.*;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserRolesPermissionsTests {

    private static ScalekitClient client;
    private static String testOrganizationId;
    private static String testUserId;

    @BeforeAll
    static void init() {
        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String clientSecret = System.getenv("SCALEKIT_CLIENT_SECRET");
        testOrganizationId = System.getenv("TEST_ORGANIZATION_ID");
        testUserId = System.getenv("TEST_USER_ID");

        Assumptions.assumeTrue(
            environmentUrl != null && !environmentUrl.trim().isEmpty() &&
            clientId != null && !clientId.trim().isEmpty() &&
            clientSecret != null && !clientSecret.trim().isEmpty() &&
            testOrganizationId != null && !testOrganizationId.trim().isEmpty() &&
            testUserId != null && !testUserId.trim().isEmpty(),
            "Skipping integration tests: SCALEKIT_ENVIRONMENT_URL, SCALEKIT_CLIENT_ID, SCALEKIT_CLIENT_SECRET, TEST_ORGANIZATION_ID, TEST_USER_ID are required"
        );

        client = new ScalekitClient(environmentUrl, clientId, clientSecret);
    }

    @Test
    public void testListUserRoles() {
        ListUserRolesResponse response = client.users().listUserRoles(testOrganizationId, testUserId);

        assertNotNull(response, "listUserRoles response should not be null");
        List<Role> roles = response.getRolesList();
        assertNotNull(roles, "Roles list should not be null");
        // Response is valid even if empty; verify the list itself is accessible
        for (Role role : roles) {
            assertNotNull(role.getId(), "Each role should have an ID");
            assertFalse(role.getId().trim().isEmpty(), "Each role ID should not be blank");
        }
    }

    @Test
    public void testListUserPermissions() {
        ListUserPermissionsResponse response = client.users().listUserPermissions(testOrganizationId, testUserId);

        assertNotNull(response, "listUserPermissions response should not be null");
        List<com.scalekit.grpc.scalekit.v1.users.Permission> permissions = response.getPermissionsList();
        assertNotNull(permissions, "Permissions list should not be null");
        // Response is valid even if empty; verify the list itself is accessible
        for (com.scalekit.grpc.scalekit.v1.users.Permission permission : permissions) {
            assertNotNull(permission.getId(), "Each permission should have an ID");
        }
    }
}
