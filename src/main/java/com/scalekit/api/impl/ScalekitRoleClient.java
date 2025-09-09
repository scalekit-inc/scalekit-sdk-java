package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.api.RoleClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.roles.*;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

public class ScalekitRoleClient implements RoleClient {
    private final RolesServiceGrpc.RolesServiceBlockingStub rolesService;
    private final ScalekitCredentials credentials;

    public ScalekitRoleClient(ManagedChannel channel, ScalekitCredentials credentials) {
        try {
            this.credentials = credentials;
            this.rolesService = RolesServiceGrpc.newBlockingStub(channel)
                    .withCallCredentials(credentials);
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }

    // Environment-level role management methods

    /**
     * Creates a new role in the environment
     * @param request: The create role request containing role details
     * @return CreateRoleResponse: The response containing the created role
     */
    @Override
    public CreateRoleResponse createRole(CreateRoleRequest request) {
        return RetryExecuter.executeWithRetry(() -> {
            return rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .createRole(request);
        }, this.credentials);
    }

    /**
     * Retrieves a role by name
     * @param roleName: The name of the role to retrieve
     * @return GetRoleResponse: The response containing the role details
     */
    @Override
    public GetRoleResponse getRole(String roleName) {
        return RetryExecuter.executeWithRetry(() -> {
            return rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .getRole(GetRoleRequest.newBuilder()
                            .setRoleName(roleName)
                            .build());
        }, this.credentials);
    }

    /**
     * Lists all roles in the environment
     * @return ListRolesResponse: The response containing the list of roles
     */
    @Override
    public ListRolesResponse listRoles() {
        return RetryExecuter.executeWithRetry(() -> {
            return rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .listRoles(ListRolesRequest.newBuilder().build());
        }, this.credentials);
    }

    /**
     * Updates an existing role by name
     * @param roleName: The name of the role to update
     * @param request: The update role request containing role details
     * @return UpdateRoleResponse: The response containing the updated role
     */
    @Override
    public UpdateRoleResponse updateRole(String roleName, UpdateRoleRequest request) {
        return RetryExecuter.executeWithRetry(() -> {
            return rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .updateRole(UpdateRoleRequest.newBuilder()
                            .setRoleName(roleName)
                            .setRole(request.getRole())
                            .build());
        }, this.credentials);
    }

    /**
     * Deletes a role by name
     * @param roleName: The name of the role to delete
     */
    @Override
    public void deleteRole(String roleName) {
        RetryExecuter.executeWithRetry(() -> {
            rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .deleteRole(DeleteRoleRequest.newBuilder()
                            .setRoleName(roleName)
                            .build());
            return null;
        }, this.credentials);
    }

    /**
     * Deletes a role by name with reassignment
     * @param roleName: The name of the role to delete
     * @param reassignRoleName: The name of the role to reassign users to
     */
    @Override
    public void deleteRole(String roleName, String reassignRoleName) {
        RetryExecuter.executeWithRetry(() -> {
            rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .deleteRole(DeleteRoleRequest.newBuilder()
                            .setRoleName(roleName)
                            .setReassignRoleName(reassignRoleName)
                            .build());
            return null;
        }, this.credentials);
    }

    /**
     * Gets the count of users associated with a role
     * @param roleName: The name of the role
     * @return GetRoleUsersCountResponse: The response containing the user count
     */
    @Override
    public GetRoleUsersCountResponse getRoleUsersCount(String roleName) {
        return RetryExecuter.executeWithRetry(() -> {
            return rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .getRoleUsersCount(GetRoleUsersCountRequest.newBuilder()
                            .setRoleName(roleName)
                            .build());
        }, this.credentials);
    }

    // Organization-level role management methods

    /**
     * Creates a new role in an organization
     * @param orgId: The organization ID
     * @param request: The create organization role request containing role details
     * @return CreateOrganizationRoleResponse: The response containing the created role
     */
    @Override
    public CreateOrganizationRoleResponse createOrganizationRole(String orgId, CreateOrganizationRoleRequest request) {
        return RetryExecuter.executeWithRetry(() -> {
            return rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .createOrganizationRole(request.toBuilder()
                            .setOrgId(orgId)
                            .build());
        }, this.credentials);
    }

    /**
     * Retrieves an organization role by name
     * @param orgId: The organization ID
     * @param roleName: The name of the role to retrieve
     * @return GetOrganizationRoleResponse: The response containing the role details
     */
    @Override
    public GetOrganizationRoleResponse getOrganizationRole(String orgId, String roleName) {
        return RetryExecuter.executeWithRetry(() -> {
            return rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .getOrganizationRole(GetOrganizationRoleRequest.newBuilder()
                            .setOrgId(orgId)
                            .setRoleName(roleName)
                            .build());
        }, this.credentials);
    }

    /**
     * Lists all roles in an organization
     * @param orgId: The organization ID
     * @return ListOrganizationRolesResponse: The response containing the list of roles
     */
    @Override
    public ListOrganizationRolesResponse listOrganizationRoles(String orgId) {
        return RetryExecuter.executeWithRetry(() -> {
            return rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .listOrganizationRoles(ListOrganizationRolesRequest.newBuilder()
                            .setOrgId(orgId)
                            .build());
        }, this.credentials);
    }

    /**
     * Updates an existing organization role by name
     * @param orgId: The organization ID
     * @param roleName: The name of the role to update
     * @param request: The update organization role request containing role details
     * @return UpdateOrganizationRoleResponse: The response containing the updated role
     */
    @Override
    public UpdateOrganizationRoleResponse updateOrganizationRole(String orgId, String roleName, UpdateOrganizationRoleRequest request) {
        return RetryExecuter.executeWithRetry(() -> {
            return rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .updateOrganizationRole(UpdateOrganizationRoleRequest.newBuilder()
                            .setOrgId(orgId)
                            .setRoleName(roleName)
                            .setRole(request.getRole())
                            .build());
        }, this.credentials);
    }

    /**
     * Deletes an organization role by name
     * @param orgId: The organization ID
     * @param roleName: The name of the role to delete
     */
    @Override
    public void deleteOrganizationRole(String orgId, String roleName) {
        RetryExecuter.executeWithRetry(() -> {
            rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .deleteOrganizationRole(DeleteOrganizationRoleRequest.newBuilder()
                            .setOrgId(orgId)
                            .setRoleName(roleName)
                            .build());
            return null;
        }, this.credentials);
    }

    /**
     * Deletes an organization role by name with reassignment
     * @param orgId: The organization ID
     * @param roleName: The name of the role to delete
     * @param reassignRoleName: The name of the role to reassign users to
     */
    @Override
    public void deleteOrganizationRole(String orgId, String roleName, String reassignRoleName) {
        RetryExecuter.executeWithRetry(() -> {
            rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .deleteOrganizationRole(DeleteOrganizationRoleRequest.newBuilder()
                            .setOrgId(orgId)
                            .setRoleName(roleName)
                            .setReassignRoleName(reassignRoleName)
                            .build());
            return null;
        }, this.credentials);
    }

    /**
     * Updates the default roles for an organization
     * @param orgId: The organization ID
     * @param request: The update default organization roles request
     * @return UpdateDefaultOrganizationRolesResponse: The response containing the updated default roles
     */
    @Override
    public UpdateDefaultOrganizationRolesResponse updateDefaultOrganizationRoles(String orgId, UpdateDefaultOrganizationRolesRequest request) {
        return RetryExecuter.executeWithRetry(() -> {
            return rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .updateDefaultOrganizationRoles(request.toBuilder()
                            .setOrgId(orgId)
                            .build());
        }, this.credentials);
    }

    /**
     * Deletes the base relationship for an organization role
     * @param roleName: The name of the role
     */
    @Override
    public void deleteRoleBase(String roleName) {
        RetryExecuter.executeWithRetry(() -> {
            rolesService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .deleteRoleBase(DeleteRoleBaseRequest.newBuilder()
                            .setRoleName(roleName)
                            .build());
            return null;
        }, this.credentials);
    }
}
