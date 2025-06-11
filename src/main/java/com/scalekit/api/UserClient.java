package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.users.*;

public interface UserClient {
    CreateUserAndMembershipResponse createUserAndMembership(String organizationId, CreateUserAndMembershipRequest request);

    GetUserResponse getUser(String organizationId, String userId);

    ListUsersResponse listUsers(String organizationId, ListUsersRequest request);

    UpdateUserResponse updateUser(String organizationId, String userId, UpdateUserRequest request);

    void deleteUser(String organizationId, String userId);

    CreateMembershipResponse createMembership(String organizationId, String userId, CreateMembershipRequest request);

    void deleteMembership(String organizationId, String userId);

    UpdateMembershipResponse updateMembership(String organizationId, String userId, UpdateMembershipRequest request);

    ListOrganizationUsersResponse listOrganizationUsers(String organizationId, ListOrganizationUsersRequest request);
} 