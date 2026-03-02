package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.roles.*;

public interface RoleClient {
    // Environment-level role management
    CreateRoleResponse createRole(CreateRoleRequest request);
    
    GetRoleResponse getRole(String roleName);
    
    ListRolesResponse listRoles();
    
    UpdateRoleResponse updateRole(String roleName, UpdateRoleRequest request);
    
    void deleteRole(String roleName);
    
    void deleteRole(String roleName, String reassignRoleName);
    
    GetRoleUsersCountResponse getRoleUsersCount(String roleName);

    // Organization-level role management
    CreateOrganizationRoleResponse createOrganizationRole(String orgId, CreateOrganizationRoleRequest request);
    
    GetOrganizationRoleResponse getOrganizationRole(String orgId, String roleName);
    
    ListOrganizationRolesResponse listOrganizationRoles(String orgId);
    
    UpdateOrganizationRoleResponse updateOrganizationRole(String orgId, String roleName, UpdateOrganizationRoleRequest request);
    
    void deleteOrganizationRole(String orgId, String roleName);
    
    void deleteOrganizationRole(String orgId, String roleName, String reassignRoleName);

    GetOrganizationRoleUsersCountResponse getOrganizationRoleUsersCount(String orgId, String roleName);

    UpdateDefaultOrganizationRolesResponse updateDefaultOrganizationRoles(String orgId, UpdateDefaultOrganizationRolesRequest request);
    
    void deleteRoleBase(String roleName);

    void deleteOrganizationRoleBase(String orgId, String roleName);
}
