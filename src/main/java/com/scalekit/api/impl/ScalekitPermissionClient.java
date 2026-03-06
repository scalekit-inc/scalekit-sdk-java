package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.api.PermissionClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.roles.*;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

public class ScalekitPermissionClient implements PermissionClient {
    private final RolesServiceGrpc.RolesServiceBlockingStub rolesService;
    private final ScalekitCredentials credentials;

    public ScalekitPermissionClient(ManagedChannel channel, ScalekitCredentials credentials) {
        try {
            this.credentials = credentials;
            this.rolesService = RolesServiceGrpc.newBlockingStub(channel)
                    .withCallCredentials(credentials);
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }

    // Permission management methods

    /**
     * Creates a new permission
     * @param request: The create permission request containing permission details
     * @return CreatePermissionResponse: The response containing the created permission
     */
    @Override
    public CreatePermissionResponse createPermission(CreatePermissionRequest request) {
        return RetryExecuter.executeWithRetry(() -> {
            return rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .createPermission(request);
        }, this.credentials);
    }

    /**
     * Retrieves a permission by name
     * @param permissionName: The name of the permission to retrieve
     * @return GetPermissionResponse: The response containing the permission details
     */
    @Override
    public GetPermissionResponse getPermission(String permissionName) {
        return RetryExecuter.executeWithRetry(() -> {
            return rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .getPermission(GetPermissionRequest.newBuilder()
                            .setPermissionName(permissionName)
                            .build());
        }, this.credentials);
    }

    /**
     * Lists permissions with optional pagination
     * @param pageToken: The page token for pagination (pass null to start from the beginning)
     * @param pageSize: The number of permissions per page (pass null to use the server default)
     * @return ListPermissionsResponse: The response containing the list of permissions
     */
    @Override
    public ListPermissionsResponse listPermissions(String pageToken, Integer pageSize) {
        return RetryExecuter.executeWithRetry(() -> {
            ListPermissionsRequest.Builder builder = ListPermissionsRequest.newBuilder();
            if (pageToken != null) builder.setPageToken(pageToken);
            if (pageSize != null) {
                if (pageSize <= 0) throw new IllegalArgumentException("pageSize must be greater than 0");
                builder.setPageSize(pageSize);
            }
            return rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .listPermissions(builder.build());
        }, this.credentials);
    }

    /**
     * Lists all permissions
     * @return ListPermissionsResponse: The response containing the list of permissions
     * @deprecated Use {@link #listPermissions(String, Integer)} instead
     */
    @Deprecated
    @Override
    public ListPermissionsResponse listPermissions() {
        return listPermissions(null, null);
    }

    /**
     * Lists all permissions with pagination by page token
     * @param pageToken: The page token for pagination
     * @return ListPermissionsResponse: The response containing the list of permissions
     * @deprecated Use {@link #listPermissions(String, Integer)} instead
     */
    @Deprecated
    @Override
    public ListPermissionsResponse listPermissions(String pageToken) {
        return listPermissions(pageToken, null);
    }

    /**
     * Updates an existing permission by name
     * @param permissionName: The name of the permission to update
     * @param request: The update permission request containing permission details
     * @return UpdatePermissionResponse: The response containing the updated permission
     */
    @Override
    public UpdatePermissionResponse updatePermission(String permissionName, UpdatePermissionRequest request) {
        return RetryExecuter.executeWithRetry(() -> {
            return rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .updatePermission(UpdatePermissionRequest.newBuilder()
                            .setPermissionName(permissionName)
                            .setPermission(request.getPermission())
                            .build());
        }, this.credentials);
    }

    /**
     * Deletes a permission by name
     * @param permissionName: The name of the permission to delete
     */
    @Override
    public void deletePermission(String permissionName) {
        RetryExecuter.executeWithRetry(() -> {
            rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .deletePermission(DeletePermissionRequest.newBuilder()
                            .setPermissionName(permissionName)
                            .build());
            return null;
        }, this.credentials);
    }

    // Role-Permission relationship methods

    /**
     * Lists all permissions associated with a role
     * @param roleName: The name of the role
     * @return ListRolePermissionsResponse: The response containing the list of permissions
     */
    @Override
    public ListRolePermissionsResponse listRolePermissions(String roleName) {
        return RetryExecuter.executeWithRetry(() -> {
            return rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .listRolePermissions(ListRolePermissionsRequest.newBuilder()
                            .setRoleName(roleName)
                            .build());
        }, this.credentials);
    }

    /**
     * Adds permissions to a role
     * @param roleName: The name of the role
     * @param request: The add permissions to role request containing permission names
     * @return AddPermissionsToRoleResponse: The response containing the result
     */
    @Override
    public AddPermissionsToRoleResponse addPermissionsToRole(String roleName, AddPermissionsToRoleRequest request) {
        return RetryExecuter.executeWithRetry(() -> {
            return rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .addPermissionsToRole(request.toBuilder()
                            .setRoleName(roleName)
                            .build());
        }, this.credentials);
    }

    /**
     * Removes a permission from a role
     * @param roleName: The name of the role
     * @param permissionName: The name of the permission to remove
     */
    @Override
    public void removePermissionFromRole(String roleName, String permissionName) {
        RetryExecuter.executeWithRetry(() -> {
            rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .removePermissionFromRole(RemovePermissionFromRoleRequest.newBuilder()
                            .setRoleName(roleName)
                            .setPermissionName(permissionName)
                            .build());
            return null;
        }, this.credentials);
    }

    /**
     * Lists all effective permissions for a role (including inherited permissions)
     * @param roleName: The name of the role
     * @return ListEffectiveRolePermissionsResponse: The response containing the list of effective permissions
     */
    @Override
    public ListEffectiveRolePermissionsResponse listEffectiveRolePermissions(String roleName) {
        return RetryExecuter.executeWithRetry(() -> {
            return rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .listEffectiveRolePermissions(ListEffectiveRolePermissionsRequest.newBuilder()
                            .setRoleName(roleName)
                            .build());
        }, this.credentials);
    }
}
