package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.roles.*;

public interface PermissionClient {
    // Permission management
    CreatePermissionResponse createPermission(CreatePermissionRequest request);
    
    GetPermissionResponse getPermission(String permissionName);
    
    ListPermissionsResponse listPermissions();
    
    ListPermissionsResponse listPermissions(String pageToken);
    
    UpdatePermissionResponse updatePermission(String permissionName, UpdatePermissionRequest request);
    
    void deletePermission(String permissionName);

    // Role-Permission relationships
    ListRolePermissionsResponse listRolePermissions(String roleName);
    
    AddPermissionsToRoleResponse addPermissionsToRole(String roleName, AddPermissionsToRoleRequest request);
    
    void removePermissionFromRole(String roleName, String permissionName);
    
    ListEffectiveRolePermissionsResponse listEffectiveRolePermissions(String roleName);
}
