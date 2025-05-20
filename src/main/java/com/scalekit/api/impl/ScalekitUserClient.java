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
     * Creates a new user in the specified organization
     * @param organizationId: The organization ID
     * @param request: The create user request containing user details
     * @return CreateUserResponse: The response containing the created user
     */
    @Override
    public CreateUserResponse createUser(String organizationId, CreateUserRequest request) {
        return RetryExecuter.executeWithRetry(() -> {
            return userService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .createUser(request.toBuilder()
                            .setOrganizationId(organizationId)
                            .build());
        }, this.credentials);
    }

    /**
     * Updates an existing user in the specified organization
     * @param organizationId: The organization ID
     * @param userId: The ID of the user to update
     * @param request: The update user request containing the changes
     * @return UpdateUserResponse: The response containing the updated user
     */
    @Override
    public UpdateUserResponse updateUser(String organizationId, String userId, UpdateUserRequest request) {
        return RetryExecuter.executeWithRetry(() -> {
            return userService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .updateUser(request.toBuilder()
                            .setOrganizationId(organizationId)
                            .setId(userId)
                            .build());
        }, this.credentials);
    }

    /**
     * Retrieves a user from the specified organization
     * @param organizationId: The organization ID
     * @param userId: The ID of the user to retrieve
     * @return GetUserResponse: The response containing the user details
     */
    @Override
    public GetUserResponse getUser(String organizationId, String userId) {
        return RetryExecuter.executeWithRetry(() -> {
            GetUserRequest request = GetUserRequest.newBuilder()
                    .setOrganizationId(organizationId)
                    .setId(userId)
                    .build();
            return userService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .getUser(request);
        }, this.credentials);
    }

    /**
     * Lists users in the specified organization with optional filtering and pagination
     * @param organizationId: The organization ID
     * @param request: The list users request containing filters and pagination options
     * @return ListUserResponse: The response containing the list of users and pagination info
     */
    @Override
    public ListUserResponse listUsers(String organizationId, ListUserRequest request) {
        return RetryExecuter.executeWithRetry(() -> {
            return userService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .listUsers(request.toBuilder()
                            .setOrganizationId(organizationId)
                            .build());
        }, this.credentials);
    }

    /**
     * Deletes a user from the specified organization
     * @param organizationId: The organization ID
     * @param userId: The ID of the user to delete
     */
    @Override
    public void deleteUser(String organizationId, String userId) {
        RetryExecuter.executeWithRetry(() -> {
            DeleteUserRequest request = DeleteUserRequest.newBuilder()
                    .setOrganizationId(organizationId)
                    .setId(userId)
                    .build();
            userService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .deleteUser(request);
            return null;
        }, this.credentials);
    }

    /**
     * Adds an existing user to an organization
     * @param organizationId: The organization ID
     * @param userId: The ID of the user to add
     * @param request: The add user request containing additional details
     * @return AddUserResponse: The response containing the updated user membership
     */
    @Override
    public AddUserResponse addUserToOrganization(String organizationId, String userId, AddUserRequest request) {
        return RetryExecuter.executeWithRetry(() -> {
            return userService
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .addUserToOrganization(request.toBuilder()
                            .setOrganizationId(organizationId)
                            .setId(userId)
                            .build());
        }, this.credentials);
    }
} 