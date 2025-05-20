package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.users.*;


public interface UserClient {

    CreateUserResponse createUser(String organizationId, CreateUserRequest request);

    UpdateUserResponse updateUser(String organizationId, String userId, UpdateUserRequest request);

    GetUserResponse getUser(String organizationId, String userId);

    ListUserResponse listUsers(String organizationId, ListUserRequest request);

    void deleteUser(String organizationId, String userId);

    AddUserResponse addUserToOrganization(String organizationId, String userId, AddUserRequest request);
} 