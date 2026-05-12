import com.scalekit.ScalekitClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.organizations.CreateOrganization;
import com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsResponse;
import com.scalekit.grpc.scalekit.v1.organizations.Organization;
import com.scalekit.grpc.scalekit.v1.roles.ListRolesResponse;
import com.scalekit.grpc.scalekit.v1.users.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class UserTests {

    private static ScalekitClient client;
    private static String testOrg;


    @BeforeAll
    static void init() {
        // Init client
        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String apiSecret = System.getenv("SCALEKIT_CLIENT_SECRET");
        testOrg = System.getenv("TEST_ORGANIZATION");
        client = new ScalekitClient(environmentUrl, clientId, apiSecret);

        if (testOrg == null || testOrg.isEmpty()) {
            ListOrganizationsResponse orgs = client.organizations().listOrganizations(1, "");
            if (orgs.getOrganizationsCount() > 0) {
                testOrg = orgs.getOrganizations(0).getId();
            }
        }
    }

    @Test
    public void testListAndGetUsers() {
        // Test listing users
        ListUsersRequest listRequest = ListUsersRequest.newBuilder()
                .setPageSize(10)
                .setPageToken("")
                .build();

        ListUsersResponse usersList = client.users().listUsers(listRequest);
        assertNotNull(usersList);
        assertTrue(usersList.getUsersCount() > 0);

        // Test getting user by ID
        User firstUser = usersList.getUsers(0);
        GetUserResponse user = client.users().getUser(firstUser.getId());
        assertNotNull(user);
        assertEquals(firstUser.getId(), user.getUser().getId());
        assertEquals(firstUser.getEmail(), user.getUser().getEmail());

        // Test listing users with pagination
        ListUsersRequest paginatedRequest = ListUsersRequest.newBuilder()
                .setPageSize(5)
                .setPageToken(usersList.getNextPageToken())
                .build();

        ListUsersResponse paginatedUsers = client.users().listUsers(paginatedRequest);
        assertNotNull(paginatedUsers);
        assertTrue(paginatedUsers.getUsersCount() > 0);
    }

    @Test
    public void testUpdateUser() {
        // First get an existing user
        ListUsersRequest listRequest = ListUsersRequest.newBuilder()
                .setPageSize(1)
                .setPageToken("")
                .build();

        ListUsersResponse usersList = client.users().listUsers(listRequest);
        assertNotNull(usersList);
        assertTrue(usersList.getUsersCount() > 0);

        User firstUser = usersList.getUsers(0);

        // Create update request
        UpdateUserProfile userProfile = UpdateUserProfile.newBuilder()
                .setFirstName("Test")
                .setLastName("User")
                .setName("Test User")
                .setLocale("en-US")
                .build();

        UpdateUser updateUser = UpdateUser.newBuilder()
                .setUserProfile(userProfile)
                .build();

        UpdateUserRequest updateRequest = UpdateUserRequest.newBuilder()
                .setUser(updateUser)
                .build();

        // Update user
        UpdateUserResponse updatedUser = client.users().updateUser(firstUser.getId(), updateRequest);
        assertNotNull(updatedUser);
        assertNotNull(updatedUser.getUser());
        assertNotNull(updatedUser.getUser().getUserProfile());

        // Verify the profile fields were updated
        assertEquals("Test", updatedUser.getUser().getUserProfile().getFirstName());
        assertEquals("User", updatedUser.getUser().getUserProfile().getLastName());
        assertEquals("Test User", updatedUser.getUser().getUserProfile().getName());
        assertEquals("en-US", updatedUser.getUser().getUserProfile().getLocale());
    }

    @Test
    public void testCreateAndDeleteUser() {
        // Create a user

        String userEmail =  "sdktest" + System.currentTimeMillis()  + "@example.com"; // Unique email for each test run
        CreateUser user = CreateUser.newBuilder()
            .setEmail(userEmail)
            .build();

        CreateUserAndMembershipRequest createRequest = CreateUserAndMembershipRequest.newBuilder()
            .setOrganizationId(testOrg)
            .setUser(user)
            .build();

        CreateUserAndMembershipResponse createdUser = client.users().createUserAndMembership(testOrg, createRequest);
        assertNotNull(createdUser);
        assertEquals(user.getEmail(), createdUser.getUser().getEmail());

        String userId = createdUser.getUser().getId();

        // Get the user to verify creation
        GetUserResponse userResponse = client.users().getUser(userId);
        assertNotNull(userResponse);
        assertEquals(userId, userResponse.getUser().getId());

        // Delete user
        client.users().deleteUser(userId);

        // Verify user is deleted
        assertThrows(APIException.class, () -> {
            client.users().getUser(userId);
        });
    }

    @Test
    public void testAddUserToOrganization() {
        // First create a user

        String userEmail =  "sdktest" + System.currentTimeMillis()  + "@example.com"; // Unique email for each test run
        CreateUser user = CreateUser.newBuilder()
            .setEmail(userEmail)
            .build();

        CreateUserAndMembershipRequest createRequest = CreateUserAndMembershipRequest.newBuilder()
            .setOrganizationId(testOrg)
            .setUser(user)
            .build();

        CreateUserAndMembershipResponse createdUser = client.users().createUserAndMembership(testOrg, createRequest);
        assertNotNull(createdUser);
        assertEquals(user.getEmail(), createdUser.getUser().getEmail());
        String userId = createdUser.getUser().getId();

        // Add user to organization using createMembership
        CreateMembership membership = CreateMembership.newBuilder()
            .build(); // Add any required membership fields here if needed

        Organization testOrgUser = client.organizations().create(
                CreateOrganization.newBuilder()
                        .setDisplayName("Test Organization For User Membership")
                        .build()
        );

        CreateMembershipRequest addRequest = CreateMembershipRequest.newBuilder()
            .setOrganizationId(testOrgUser.getId())
            .setId(userId)  // Set the user ID
            .setMembership(membership)  // Set the required membership field
            .build();



        CreateMembershipResponse addResponse = client.users().createMembership(testOrgUser.getId(), userId, addRequest);
        assertNotNull(addResponse);
        assertNotNull(addResponse.getUser());


        // Cleanup
        client.users().deleteUser(userId);
        client.organizations().deleteById(testOrgUser.getId());


    }

    @Test
    public void testSearchUsers() {
        // First get a user to use their email for search
        ListUsersRequest listRequest = ListUsersRequest.newBuilder()
                .setPageSize(1)
                .build();
        ListUsersResponse usersList = client.users().listUsers(listRequest);
        assertNotNull(usersList);
        assertTrue(usersList.getUsersCount() > 0);

        String emailQuery = usersList.getUsers(0).getEmail();

        // Search with a query that should return results
        SearchUsersRequest searchRequest = SearchUsersRequest.newBuilder()
                .setQuery(emailQuery)
                .setPageSize(10)
                .build();

        SearchUsersResponse searchResponse = client.users().searchUsers(searchRequest);
        assertNotNull(searchResponse);
        assertTrue(searchResponse.getUsersCount() > 0);
        assertTrue(searchResponse.getTotalSize() > 0);

        // Verify the matched user email contains the query
        boolean found = searchResponse.getUsersList().stream()
                .anyMatch(u -> u.getEmail().equals(emailQuery));
        assertTrue(found);

        // Search with a query that should return no results
        SearchUsersRequest emptyRequest = SearchUsersRequest.newBuilder()
                .setQuery("no_match_xyz_" + System.currentTimeMillis() + "@nowhere.invalid")
                .setPageSize(10)
                .build();

        SearchUsersResponse emptyResponse = client.users().searchUsers(emptyRequest);
        assertNotNull(emptyResponse);
        assertEquals(0, emptyResponse.getUsersCount());
    }

    @Test
    public void testSearchOrganizationUsers() {
        // Create a user in testOrg to search for
        String userEmail = "search.test" + System.currentTimeMillis() + "@example.com";
        CreateUser user = CreateUser.newBuilder()
                .setEmail(userEmail)
                .build();

        CreateUserAndMembershipRequest createRequest = CreateUserAndMembershipRequest.newBuilder()
                .setOrganizationId(testOrg)
                .setSendInvitationEmail(false)
                .setUser(user)
                .build();

        CreateUserAndMembershipResponse createdUser = client.users().createUserAndMembership(testOrg, createRequest);
        assertNotNull(createdUser);
        String userId = createdUser.getUser().getId();

        try {
            // Search by email within the org
            SearchOrganizationUsersRequest searchRequest = SearchOrganizationUsersRequest.newBuilder()
                    .setQuery(userEmail)
                    .setPageSize(10)
                    .build();

            SearchOrganizationUsersResponse searchResponse = client.users().searchOrganizationUsers(testOrg, searchRequest);
            assertNotNull(searchResponse);
            assertTrue(searchResponse.getUsersCount() > 0);
            assertTrue(searchResponse.getTotalSize() > 0);

            boolean found = searchResponse.getUsersList().stream()
                    .anyMatch(u -> u.getId().equals(userId));
            assertTrue(found);

            // Search with a query that should return no results
            SearchOrganizationUsersRequest emptyRequest = SearchOrganizationUsersRequest.newBuilder()
                    .setQuery("no_match_xyz_" + System.currentTimeMillis() + "@nowhere.invalid")
                    .setPageSize(10)
                    .build();

            SearchOrganizationUsersResponse emptyResponse = client.users().searchOrganizationUsers(testOrg, emptyRequest);
            assertNotNull(emptyResponse);
            assertEquals(0, emptyResponse.getUsersCount());
        } finally {
            client.users().deleteUser(userId);
        }
    }

    @Test
    public void testResendInvite() {
        // Create a user with invitation email
        String userEmail = "resend.invite.test" + System.currentTimeMillis() + "@example.com";
        CreateUser user = CreateUser.newBuilder()
                .setEmail(userEmail)
                .build();

        CreateUserAndMembershipRequest createRequest = CreateUserAndMembershipRequest.newBuilder()
                .setOrganizationId(testOrg)
                .setUser(user)
                .setSendInvitationEmail(true)
                .build();

        CreateUserAndMembershipResponse createdUser = client.users().createUserAndMembership(testOrg, createRequest);
        assertNotNull(createdUser);
        assertEquals(user.getEmail(), createdUser.getUser().getEmail());
        String userId = createdUser.getUser().getId();

        // Resend invite
        ResendInviteResponse resendResponse = client.users().resendInvite(testOrg, userId);
        assertNotNull(resendResponse);
        assertNotNull(resendResponse.getInvite());
        assertEquals(userId, resendResponse.getInvite().getUserId());
        assertEquals(testOrg, resendResponse.getInvite().getOrganizationId());
        assertEquals("PENDING_INVITE", resendResponse.getInvite().getStatus());
        assertNotNull(resendResponse.getInvite().getCreatedAt());
        assertNotNull(resendResponse.getInvite().getExpiresAt());
        assertEquals(1, resendResponse.getInvite().getResentCount());

        // Cleanup
        client.users().deleteUser(userId);
    }

    @Test
    public void testAssignAndRemoveUserRole() {
        // Fetch available environment-level roles to find one we can assign
        ListRolesResponse rolesResponse = client.roles().listRoles();
        assertNotNull(rolesResponse);
        if (rolesResponse.getRolesCount() == 0) {
            log.warn("No roles available to test assignUserRoles/removeUserRole");
            return;
        }

        String roleName = rolesResponse.getRoles(0).getName();
        String roleId = rolesResponse.getRoles(0).getId();

        // Create a user in testOrg
        String userEmail = "role.test" + System.currentTimeMillis() + "@example.com";
        CreateUser user = CreateUser.newBuilder()
                .setEmail(userEmail)
                .build();

        CreateUserAndMembershipRequest createRequest = CreateUserAndMembershipRequest.newBuilder()
                .setOrganizationId(testOrg)
                .setSendInvitationEmail(false)
                .setUser(user)
                .build();

        CreateUserAndMembershipResponse createdUser = client.users().createUserAndMembership(testOrg, createRequest);
        assertNotNull(createdUser);
        String userId = createdUser.getUser().getId();

        try {
            // Assign the role to the user
            AssignRoleRequest assignRoleRequest = AssignRoleRequest.newBuilder()
                    .setId(roleId)
                    .setRoleName(roleName)
                    .build();

            AssignUserRolesRequest assignRequest = AssignUserRolesRequest.newBuilder()
                    .addRoles(assignRoleRequest)
                    .build();

            AssignUserRolesResponse assignResponse = client.users().assignUserRoles(testOrg, userId, assignRequest);
            assertNotNull(assignResponse);

            // Remove the role from the user
            RemoveUserRoleRequest removeRequest = RemoveUserRoleRequest.newBuilder()
                    .setRoleName(roleName)
                    .build();

            // removeUserRole returns void; just verify it does not throw
            client.users().removeUserRole(testOrg, userId, removeRequest);
        } finally {
            client.users().deleteUser(userId);
        }
    }
} 