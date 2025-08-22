package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.users.*;

public interface UserClient {
    CreateUserAndMembershipResponse createUserAndMembership(String organizationId, CreateUserAndMembershipRequest request);

    GetUserResponse getUser(String userId);

    ListUsersResponse listUsers(ListUsersRequest request);

    UpdateUserResponse updateUser(String userId, UpdateUserRequest request);

    void deleteUser(String userId);

    CreateMembershipResponse createMembership(String organizationId, String userId, CreateMembershipRequest request);

    void deleteMembership(String organizationId, String userId);

    UpdateMembershipResponse updateMembership(String organizationId, String userId, UpdateMembershipRequest request);

    ListOrganizationUsersResponse listOrganizationUsers(String organizationId, ListOrganizationUsersRequest request);

    ResendInviteResponse resendInvite(String organizationId, String userId);
} 