import com.scalekit.ScalekitClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.roles.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PermissionTests {

    private static ScalekitClient client;

    @BeforeAll
    static void init() {
        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String apiSecret = System.getenv("SCALEKIT_CLIENT_SECRET");
        client = new ScalekitClient(environmentUrl, clientId, apiSecret);
    }

    // Permission CRUD tests

    @Test
    public void testCreatePermission() {
        String permissionName = "test_permission_" + System.currentTimeMillis();
        CreatePermission createPermission = CreatePermission.newBuilder()
                .setName(permissionName)
                .setDescription("A test permission for SDK testing")
                .build();

        CreatePermissionRequest request = CreatePermissionRequest.newBuilder()
                .setPermission(createPermission)
                .build();

        CreatePermissionResponse response = client.permissions().createPermission(request);
        assertNotNull(response);
        assertNotNull(response.getPermission());
        assertEquals(permissionName, response.getPermission().getName());
        assertEquals("A test permission for SDK testing", response.getPermission().getDescription());

        // Cleanup
        client.permissions().deletePermission(permissionName);
    }

    @Test
    public void testGetPermission() {
        // Create a permission first
        String permissionName = "test_get_permission_" + System.currentTimeMillis();
        CreatePermission createPermission = CreatePermission.newBuilder()
                .setName(permissionName)
                .setDescription("Permission for get testing")
                .build();

        client.permissions().createPermission(CreatePermissionRequest.newBuilder()
                .setPermission(createPermission)
                .build());

        // Get the permission
        GetPermissionResponse response = client.permissions().getPermission(permissionName);
        assertNotNull(response);
        assertNotNull(response.getPermission());
        assertEquals(permissionName, response.getPermission().getName());
        assertEquals("Permission for get testing", response.getPermission().getDescription());

        // Cleanup
        client.permissions().deletePermission(permissionName);
    }

    @Test
    public void testListPermissions() {
        ListPermissionsResponse response = client.permissions().listPermissions();
        assertNotNull(response);
        assertNotNull(response.getPermissionsList());
        assertTrue(response.getPermissionsCount() >= 0);
    }

    @Test
    public void testListPermissionsWithPagination() {
        // First, get permissions without pagination
        ListPermissionsResponse firstResponse = client.permissions().listPermissions();
        assertNotNull(firstResponse);

        // If there are permissions and a next page token, test pagination
        if (firstResponse.getPermissionsCount() > 0 && !firstResponse.getNextPageToken().isEmpty()) {
            ListPermissionsResponse paginatedResponse = client.permissions().listPermissions(firstResponse.getNextPageToken());
            assertNotNull(paginatedResponse);
            assertNotNull(paginatedResponse.getPermissionsList());
        }
    }

    @Test
    public void testUpdatePermission() {
        // Create a permission first
        String permissionName = "test_update_permission_" + System.currentTimeMillis();
        CreatePermission createPermission = CreatePermission.newBuilder()
                .setName(permissionName)
                .setDescription("Original description")
                .build();

        client.permissions().createPermission(CreatePermissionRequest.newBuilder()
                .setPermission(createPermission)
                .build());

        // Update the permission
        CreatePermission updatePermission = CreatePermission.newBuilder()
                .setName(permissionName)
                .setDescription("Updated description")
                .build();

        UpdatePermissionRequest updateRequest = UpdatePermissionRequest.newBuilder()
                .setPermissionName(permissionName)
                .setPermission(updatePermission)
                .build();

        UpdatePermissionResponse response = client.permissions().updatePermission(permissionName, updateRequest);
        assertNotNull(response);
        assertNotNull(response.getPermission());
        assertEquals(permissionName, response.getPermission().getName());
        assertEquals("Updated description", response.getPermission().getDescription());

        // Cleanup
        client.permissions().deletePermission(permissionName);
    }

    @Test
    public void testDeletePermission() {
        // Create a permission first
        String permissionName = "test_delete_permission_" + System.currentTimeMillis();
        CreatePermission createPermission = CreatePermission.newBuilder()
                .setName(permissionName)
                .setDescription("Permission to be deleted")
                .build();

        client.permissions().createPermission(CreatePermissionRequest.newBuilder()
                .setPermission(createPermission)
                .build());

        // Verify permission exists
        GetPermissionResponse getResponse = client.permissions().getPermission(permissionName);
        assertNotNull(getResponse);

        // Delete the permission
        client.permissions().deletePermission(permissionName);

        // Verify permission is deleted
        assertThrows(APIException.class, () -> {
            client.permissions().getPermission(permissionName);
        });
    }

    @Test
    public void testCreatePermissionWithDuplicateName() {
        String permissionName = "test_duplicate_permission_" + System.currentTimeMillis();
        
        // Create first permission
        CreatePermission createPermission = CreatePermission.newBuilder()
                .setName(permissionName)
                .setDescription("First permission with this name")
                .build();

        client.permissions().createPermission(CreatePermissionRequest.newBuilder()
                .setPermission(createPermission)
                .build());

        // Try to create another permission with the same name
        CreatePermission duplicatePermission = CreatePermission.newBuilder()
                .setName(permissionName)  // Same name
                .setDescription("Second permission with same name")
                .build();

        assertThrows(APIException.class, () -> {
            client.permissions().createPermission(CreatePermissionRequest.newBuilder()
                    .setPermission(duplicatePermission)
                    .build());
        });

        // Cleanup
        client.permissions().deletePermission(permissionName);
    }

    @Test
    public void testGetNonExistentPermission() {
        String nonExistentPermission = "non_existent_permission_" + System.currentTimeMillis();
        
        assertThrows(APIException.class, () -> {
            client.permissions().getPermission(nonExistentPermission);
        });
    }

    @Test
    public void testUpdateNonExistentPermission() {
        String nonExistentPermission = "non_existent_permission_" + System.currentTimeMillis();
        CreatePermission updatePermission = CreatePermission.newBuilder()
                .setName(nonExistentPermission)
                .setDescription("Updated description")
                .build();

        UpdatePermissionRequest updateRequest = UpdatePermissionRequest.newBuilder()
                .setPermissionName(nonExistentPermission)
                .setPermission(updatePermission)
                .build();

        assertThrows(APIException.class, () -> {
            client.permissions().updatePermission(nonExistentPermission, updateRequest);
        });
    }

    @Test
    public void testDeleteNonExistentPermission() {
        String nonExistentPermission = "non_existent_permission_" + System.currentTimeMillis();
        
        assertThrows(APIException.class, () -> {
            client.permissions().deletePermission(nonExistentPermission);
        });
    }

    // Role-Permission relationship tests

    @Test
    public void testListRolePermissions() {
        // Create a permission
        String permissionName = "test_role_permission_" + System.currentTimeMillis();
        CreatePermission createPermission = CreatePermission.newBuilder()
                .setName(permissionName)
                .setDescription("Permission for role testing")
                .build();

        client.permissions().createPermission(CreatePermissionRequest.newBuilder()
                .setPermission(createPermission)
                .build());

        // Create a role
        String roleName = "test_role_for_permissions_" + System.currentTimeMillis();
        CreateRole createRole = CreateRole.newBuilder()
                .setName(roleName)
                .setDisplayName("Role for Permission Testing")
                .setDescription("A role to test permission listing")
                .build();

        client.roles().createRole(CreateRoleRequest.newBuilder()
                .setRole(createRole)
                .build());

        // Initially, role should have no permissions
        ListRolePermissionsResponse initialResponse = client.permissions().listRolePermissions(roleName);
        assertNotNull(initialResponse);
        assertEquals(0, initialResponse.getPermissionsCount());

        // Assign permission to role
        AddPermissionsToRoleRequest addRequest = AddPermissionsToRoleRequest.newBuilder()
                .setRoleName(roleName)
                .addPermissionNames(permissionName)
                .build();

        client.permissions().addPermissionsToRole(roleName, addRequest);

        // Now role should have the permission
        ListRolePermissionsResponse afterAddResponse = client.permissions().listRolePermissions(roleName);
        assertNotNull(afterAddResponse);
        assertEquals(1, afterAddResponse.getPermissionsCount());
        assertEquals(permissionName, afterAddResponse.getPermissions(0).getName());

        // Cleanup
        client.roles().deleteRole(roleName);
        client.permissions().deletePermission(permissionName);
    }

    @Test
    public void testAddPermissionsToRole() {
        // Create permissions
        String permission1Name = "test_add_permission_1_" + System.currentTimeMillis();
        String permission2Name = "test_add_permission_2_" + System.currentTimeMillis();

        CreatePermission permission1 = CreatePermission.newBuilder()
                .setName(permission1Name)
                .setDescription("First permission for add testing")
                .build();

        CreatePermission permission2 = CreatePermission.newBuilder()
                .setName(permission2Name)
                .setDescription("Second permission for add testing")
                .build();

        client.permissions().createPermission(CreatePermissionRequest.newBuilder()
                .setPermission(permission1)
                .build());

        client.permissions().createPermission(CreatePermissionRequest.newBuilder()
                .setPermission(permission2)
                .build());

        // Create a role
        String roleName = "test_role_add_permissions_" + System.currentTimeMillis();
        CreateRole createRole = CreateRole.newBuilder()
                .setName(roleName)
                .setDisplayName("Role for Add Permissions Testing")
                .setDescription("A role to test adding permissions")
                .build();

        client.roles().createRole(CreateRoleRequest.newBuilder()
                .setRole(createRole)
                .build());

        // Add multiple permissions to role
        AddPermissionsToRoleRequest addRequest = AddPermissionsToRoleRequest.newBuilder()
                .setRoleName(roleName)
                .addPermissionNames(permission1Name)
                .addPermissionNames(permission2Name)
                .build();

        AddPermissionsToRoleResponse response = client.permissions().addPermissionsToRole(roleName, addRequest);
        assertNotNull(response);
        assertEquals(2, response.getPermissionsCount());

        // Verify permissions are assigned
        ListRolePermissionsResponse listResponse = client.permissions().listRolePermissions(roleName);
        assertEquals(2, listResponse.getPermissionsCount());

        // Cleanup
        client.roles().deleteRole(roleName);
        client.permissions().deletePermission(permission1Name);
        client.permissions().deletePermission(permission2Name);
    }

    @Test
    public void testRemovePermissionFromRole() {
        // Create a permission
        String permissionName = "test_remove_permission_" + System.currentTimeMillis();
        CreatePermission createPermission = CreatePermission.newBuilder()
                .setName(permissionName)
                .setDescription("Permission for removal testing")
                .build();

        client.permissions().createPermission(CreatePermissionRequest.newBuilder()
                .setPermission(createPermission)
                .build());

        // Create a role
        String roleName = "test_role_remove_permission_" + System.currentTimeMillis();
        CreateRole createRole = CreateRole.newBuilder()
                .setName(roleName)
                .setDisplayName("Role for Remove Permission Testing")
                .setDescription("A role to test removing permissions")
                .build();

        client.roles().createRole(CreateRoleRequest.newBuilder()
                .setRole(createRole)
                .build());

        // Add permission to role
        AddPermissionsToRoleRequest addRequest = AddPermissionsToRoleRequest.newBuilder()
                .setRoleName(roleName)
                .addPermissionNames(permissionName)
                .build();

        client.permissions().addPermissionsToRole(roleName, addRequest);

        // Verify permission is assigned
        ListRolePermissionsResponse beforeRemove = client.permissions().listRolePermissions(roleName);
        assertEquals(1, beforeRemove.getPermissionsCount());

        // Remove permission from role
        client.permissions().removePermissionFromRole(roleName, permissionName);

        // Verify permission is removed
        ListRolePermissionsResponse afterRemove = client.permissions().listRolePermissions(roleName);
        assertEquals(0, afterRemove.getPermissionsCount());

        // Cleanup
        client.roles().deleteRole(roleName);
        client.permissions().deletePermission(permissionName);
    }

    @Test
    public void testListEffectiveRolePermissions() {
        // Create a permission
        String permissionName = "test_effective_permission_" + System.currentTimeMillis();
        CreatePermission createPermission = CreatePermission.newBuilder()
                .setName(permissionName)
                .setDescription("Permission for effective testing")
                .build();

        client.permissions().createPermission(CreatePermissionRequest.newBuilder()
                .setPermission(createPermission)
                .build());

        // Create a role
        String roleName = "test_role_effective_permissions_" + System.currentTimeMillis();
        CreateRole createRole = CreateRole.newBuilder()
                .setName(roleName)
                .setDisplayName("Role for Effective Permissions Testing")
                .setDescription("A role to test effective permissions")
                .build();

        client.roles().createRole(CreateRoleRequest.newBuilder()
                .setRole(createRole)
                .build());

        // Add permission to role
        AddPermissionsToRoleRequest addRequest = AddPermissionsToRoleRequest.newBuilder()
                .setRoleName(roleName)
                .addPermissionNames(permissionName)
                .build();

        client.permissions().addPermissionsToRole(roleName, addRequest);

        // Test effective permissions
        ListEffectiveRolePermissionsResponse response = client.permissions().listEffectiveRolePermissions(roleName);
        assertNotNull(response);
        assertNotNull(response.getPermissionsList());
        // Note: Effective permissions might include inherited permissions, so we just verify the method works

        // Cleanup
        client.roles().deleteRole(roleName);
        client.permissions().deletePermission(permissionName);
    }

    @Test
    public void testListRolePermissionsForNonExistentRole() {
        String nonExistentRole = "non_existent_role_" + System.currentTimeMillis();
        
        assertThrows(APIException.class, () -> {
            client.permissions().listRolePermissions(nonExistentRole);
        });
    }

    @Test
    public void testAddPermissionsToNonExistentRole() {
        String nonExistentRole = "non_existent_role_" + System.currentTimeMillis();
        String permissionName = "test_permission_" + System.currentTimeMillis();

        AddPermissionsToRoleRequest addRequest = AddPermissionsToRoleRequest.newBuilder()
                .setRoleName(nonExistentRole)
                .addPermissionNames(permissionName)
                .build();

        assertThrows(APIException.class, () -> {
            client.permissions().addPermissionsToRole(nonExistentRole, addRequest);
        });
    }

    @Test
    public void testRemovePermissionFromNonExistentRole() {
        String nonExistentRole = "non_existent_role_" + System.currentTimeMillis();
        String permissionName = "test_permission_" + System.currentTimeMillis();
        
        assertThrows(APIException.class, () -> {
            client.permissions().removePermissionFromRole(nonExistentRole, permissionName);
        });
    }

    @Test
    public void testListEffectivePermissionsForNonExistentRole() {
        String nonExistentRole = "non_existent_role_" + System.currentTimeMillis();
        
        assertThrows(APIException.class, () -> {
            client.permissions().listEffectiveRolePermissions(nonExistentRole);
        });
    }

    @Test
    public void testAddNonExistentPermissionToRole() {
        // Create a role
        String roleName = "test_role_invalid_permission_" + System.currentTimeMillis();
        CreateRole createRole = CreateRole.newBuilder()
                .setName(roleName)
                .setDisplayName("Role for Invalid Permission Test")
                .setDescription("A role to test invalid permission assignment")
                .build();

        client.roles().createRole(CreateRoleRequest.newBuilder()
                .setRole(createRole)
                .build());

        // Try to add a non-existent permission
        String nonExistentPermission = "non_existent_permission_" + System.currentTimeMillis();
        AddPermissionsToRoleRequest addRequest = AddPermissionsToRoleRequest.newBuilder()
                .setRoleName(roleName)
                .addPermissionNames(nonExistentPermission)
                .build();

        // The API allows adding non-existent permissions (they get ignored)
        AddPermissionsToRoleResponse response = client.permissions().addPermissionsToRole(roleName, addRequest);
        assertNotNull(response);
        assertEquals(0, response.getPermissionsCount());

        // Cleanup
        client.roles().deleteRole(roleName);
    }

    @Test
    public void testRemoveNonExistentPermissionFromRole() {
        // Create a role
        String roleName = "test_role_remove_invalid_permission_" + System.currentTimeMillis();
        CreateRole createRole = CreateRole.newBuilder()
                .setName(roleName)
                .setDisplayName("Role for Remove Invalid Permission Test")
                .setDescription("A role to test removing invalid permissions")
                .build();

        client.roles().createRole(CreateRoleRequest.newBuilder()
                .setRole(createRole)
                .build());

        // Try to remove a non-existent permission
        String nonExistentPermission = "non_existent_permission_" + System.currentTimeMillis();
        
        // The API throws an exception for invalid permission names
        assertThrows(APIException.class, () -> {
            client.permissions().removePermissionFromRole(roleName, nonExistentPermission);
        });

        // Cleanup
        client.roles().deleteRole(roleName);
    }

    @Test
    public void testPermissionWorkflow() {
        // Test a complete workflow: create permission, assign to role, verify, remove, delete
        String permissionName = "test_workflow_permission_" + System.currentTimeMillis();
        String roleName = "test_workflow_role_" + System.currentTimeMillis();

        // 1. Create permission
        CreatePermission createPermission = CreatePermission.newBuilder()
                .setName(permissionName)
                .setDescription("Permission for workflow testing")
                .build();

        CreatePermissionResponse permissionResponse = client.permissions().createPermission(
                CreatePermissionRequest.newBuilder()
                        .setPermission(createPermission)
                        .build());
        assertNotNull(permissionResponse);
        assertEquals(permissionName, permissionResponse.getPermission().getName());

        // 2. Create role
        CreateRole createRole = CreateRole.newBuilder()
                .setName(roleName)
                .setDisplayName("Role for Workflow Testing")
                .setDescription("A role for workflow testing")
                .build();

        CreateRoleResponse roleResponse = client.roles().createRole(
                CreateRoleRequest.newBuilder()
                        .setRole(createRole)
                        .build());
        assertNotNull(roleResponse);

        // 3. Assign permission to role
        AddPermissionsToRoleRequest addRequest = AddPermissionsToRoleRequest.newBuilder()
                .setRoleName(roleName)
                .addPermissionNames(permissionName)
                .build();

        AddPermissionsToRoleResponse addResponse = client.permissions().addPermissionsToRole(roleName, addRequest);
        assertNotNull(addResponse);
        assertEquals(1, addResponse.getPermissionsCount());

        // 4. Verify permission is assigned
        ListRolePermissionsResponse listResponse = client.permissions().listRolePermissions(roleName);
        assertEquals(1, listResponse.getPermissionsCount());
        assertEquals(permissionName, listResponse.getPermissions(0).getName());

        // 5. Remove permission from role
        client.permissions().removePermissionFromRole(roleName, permissionName);

        // 6. Verify permission is removed
        ListRolePermissionsResponse afterRemove = client.permissions().listRolePermissions(roleName);
        assertEquals(0, afterRemove.getPermissionsCount());

        // 7. Delete role
        client.roles().deleteRole(roleName);

        // 8. Delete permission
        client.permissions().deletePermission(permissionName);

        // 9. Verify permission is deleted
        assertThrows(APIException.class, () -> {
            client.permissions().getPermission(permissionName);
        });
    }
}
