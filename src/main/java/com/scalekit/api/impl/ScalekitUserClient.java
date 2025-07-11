package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.api.UserClient;
import com.scalekit.grpc.scalekit.v1.users.*;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

public class ScalekitUserClient implements UserClient {
    private final UserServiceGrpc.UserServiceBlockingStub userService;
    private final ScalekitCredentials credentials;

    public ScalekitUserClient(ManagedChannel channel, ScalekitCredentials credentials) {
        try {
            this.credentials = credentials;
            this.userService = UserServiceGrpc.newBlockingStub(channel)
                    .withCallCredentials(credentials);
        } catch (StatusRuntimeException e) {
            throw new RuntimeException("Error creating User client", e);
        }
    }

    /**
     * Creates a new user and membership in the specified organization
     * @param organizationId: The organization ID
     * @param request: The create user and membership request containing user details
     * @return CreateUserAndMembershipResponse: The response containing the created user
     */
    @Override
    public CreateUserAndMembershipResponse createUserAndMembership(String organizationId, CreateUserAndMembershipRequest request) {
        return RetryExecuter.executeWithRetry(() -> {
            return userService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .createUserAndMembership(request.toBuilder()
                            .setOrganizationId(organizationId)
                            .build());
        }, this.credentials);
    }

    /**
     * Retrieves a user from the specified organization
     * @param userId: The ID of the user to retrieve
     * @return GetUserResponse: The response containing the user details
     */
    @Override
    public GetUserResponse getUser(String userId) {
        return RetryExecuter.executeWithRetry(() -> {
            GetUserRequest request = GetUserRequest.newBuilder()
                    .setId(userId)
                    .build();
            return userService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .getUser(request);
        }, this.credentials);
    }

    /**
     * Lists users in the specified organization with optional filtering and pagination
     * @param request: The list users request containing filters and pagination options
     * @return ListUsersResponse: The response containing the list of users and pagination info
     */
    @Override
    public ListUsersResponse listUsers(ListUsersRequest request) {
        return RetryExecuter.executeWithRetry(() -> {
            return userService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .listUsers(request);
        }, this.credentials);
    }

    /**
     * Updates an existing user in the specified organization
     * @param userId: The ID of the user to update
     * @param request: The update user request containing the changes
     * @return UpdateUserResponse: The response containing the updated user
     */
    @Override
    public UpdateUserResponse updateUser(String userId, UpdateUserRequest request) {
        return RetryExecuter.executeWithRetry(() -> {
            return userService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .updateUser(request.toBuilder()
                            .setId(userId)
                            .build());
        }, this.credentials);
    }

    /**
     * Deletes a user from the specified organization
     * @param userId: The ID of the user to delete
     */
    @Override
    public void deleteUser(String userId) {
        RetryExecuter.executeWithRetry(() -> {
            DeleteUserRequest request = DeleteUserRequest.newBuilder()
                    .setId(userId)
                    .build();
            userService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .deleteUser(request);
            return null;
        }, this.credentials);
    }

    /**
     * Creates a membership for a user in the specified organization
     * @param organizationId: The organization ID
     * @param userId: The ID of the user to create membership for
     * @param request: The create membership request containing membership details
     * @return CreateMembershipResponse: The response containing the created membership
     */
    @Override
    public CreateMembershipResponse createMembership(String organizationId, String userId, CreateMembershipRequest request) {
        return RetryExecuter.executeWithRetry(() -> {
            return userService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .createMembership(request.toBuilder()
                            .setOrganizationId(organizationId)
                            .setId(userId)
                            .build());
        }, this.credentials);
    }

    /**
     * Deletes a membership for a user from the specified organization
     * @param organizationId: The organization ID
     * @param userId: The ID of the user whose membership to delete
     */
    @Override
    public void deleteMembership(String organizationId, String userId) {
        RetryExecuter.executeWithRetry(() -> {
            DeleteMembershipRequest request = DeleteMembershipRequest.newBuilder()
                    .setOrganizationId(organizationId)
                    .setId(userId)
                    .build();
            userService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .deleteMembership(request);
            return null;
        }, this.credentials);
    }

    /**
     * Updates a membership for a user in the specified organization
     * @param organizationId: The organization ID
     * @param userId: The ID of the user whose membership to update
     * @param request: The update membership request containing the changes
     * @return UpdateMembershipResponse: The response containing the updated membership
     */
    @Override
    public UpdateMembershipResponse updateMembership(String organizationId, String userId, UpdateMembershipRequest request) {
        return RetryExecuter.executeWithRetry(() -> {
            return userService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .updateMembership(request.toBuilder()
                            .setOrganizationId(organizationId)
                            .setId(userId)
                            .build());
        }, this.credentials);
    }

    /**
     * Lists users in the specified organization with optional filtering and pagination
     * @param organizationId: The organization ID
     * @param request: The list organization users request containing filters and pagination options
     * @return ListOrganizationUsersResponse: The response containing the list of users and pagination info
     */
    @Override
    public ListOrganizationUsersResponse listOrganizationUsers(String organizationId, ListOrganizationUsersRequest request) {
        return RetryExecuter.executeWithRetry(() -> {
            return userService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .listOrganizationUsers(request.toBuilder()
                            .setOrganizationId(organizationId)
                            .build());
        }, this.credentials);
    }
} 