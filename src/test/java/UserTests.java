import com.scalekit.ScalekitClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.commons.MembershipStatus;
import com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership;
import com.scalekit.grpc.scalekit.v1.organizations.CreateOrganization;
import com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsResponse;
import com.scalekit.grpc.scalekit.v1.organizations.Organization;
import com.scalekit.grpc.scalekit.v1.users.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

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
    public void testUserExternalIdOperations() {
        // Scenario: Alice Johnson onboards via an external IdP. She has a full profile and user-level metadata.
        String externalId = "usr_alice_" + UUID.randomUUID();
        String userEmail = "alice.johnson+" + UUID.randomUUID() + "@example.com";

        CreateUserProfile createProfile = CreateUserProfile.newBuilder()
                .setGivenName("Alice")
                .setFamilyName("Johnson")
                .setName("Alice Johnson")
                .setLocale("en-US")
                .setPhoneNumber("+14155550100")
                .build();

        CreateUser createUser = CreateUser.newBuilder()
                .setEmail(userEmail)
                .setExternalId(externalId)
                .setUserProfile(createProfile)
                .putMetadata("source", "external-idp")
                .putMetadata("plan", "enterprise")
                .build();

        CreateUserAndMembershipResponse created = client.users().createUserAndMembership(testOrg,
                CreateUserAndMembershipRequest.newBuilder()
                        .setOrganizationId(testOrg)
                        .setSendInvitationEmail(false)
                        .setUser(createUser)
                        .build());

        assertTrue(created.hasUser());
        User createdU = created.getUser();
        String userId = createdU.getId();

        // creation response — full field-by-field check
        assertFalse(userId.isEmpty());
        assertFalse(createdU.getEnvironmentId().isEmpty());
        assertEquals(userEmail, createdU.getEmail());
        assertTrue(createdU.hasExternalId());
        assertEquals(externalId, createdU.getExternalId());
        assertTrue(createdU.hasCreateTime());
        assertTrue(createdU.hasUpdateTime());
        assertTrue(createdU.hasUserProfile());
        assertEquals("Alice",        createdU.getUserProfile().getGivenName());
        assertEquals("Johnson",      createdU.getUserProfile().getFamilyName());
        assertEquals("Alice Johnson", createdU.getUserProfile().getName());
        assertEquals("en-US",        createdU.getUserProfile().getLocale());
        assertEquals("+14155550100", createdU.getUserProfile().getPhoneNumber());
        assertEquals("external-idp", createdU.getMetadataOrThrow("source"));
        assertEquals("enterprise",   createdU.getMetadataOrThrow("plan"));
        assertEquals(1, createdU.getMembershipsCount());
        OrganizationMembership initialMembership = createdU.getMemberships(0);
        assertEquals(testOrg, initialMembership.getOrganizationId());
        assertTrue(initialMembership.hasJoinTime());
        assertNotEquals(MembershipStatus.Membership_Status_UNSPECIFIED, initialMembership.getMembershipStatus());

        try {
            // getUserByExternalId — must resolve to the exact same user with all fields intact
            GetUserResponse fetched = client.users().getUserByExternalId(externalId);
            assertTrue(fetched.hasUser());
            User fetchedU = fetched.getUser();
            assertEquals(userId,       fetchedU.getId());
            assertFalse(fetchedU.getEnvironmentId().isEmpty());
            assertEquals(userEmail,    fetchedU.getEmail());
            assertTrue(fetchedU.hasExternalId());
            assertEquals(externalId,   fetchedU.getExternalId());
            assertTrue(fetchedU.hasCreateTime());
            assertTrue(fetchedU.hasUpdateTime());
            assertTrue(fetchedU.hasUserProfile());
            assertEquals("Alice",        fetchedU.getUserProfile().getGivenName());
            assertEquals("Johnson",      fetchedU.getUserProfile().getFamilyName());
            assertEquals("Alice Johnson", fetchedU.getUserProfile().getName());
            assertEquals("en-US",        fetchedU.getUserProfile().getLocale());
            assertEquals("+14155550100", fetchedU.getUserProfile().getPhoneNumber());
            assertEquals("external-idp", fetchedU.getMetadataOrThrow("source"));
            assertEquals("enterprise",   fetchedU.getMetadataOrThrow("plan"));
            assertEquals(1, fetchedU.getMembershipsCount());
            assertEquals(testOrg, fetchedU.getMemberships(0).getOrganizationId());

            // updateUserByExternalId — Alice marries and changes her surname, moves to UK, updates her plan
            UpdateUserProfile updatedProfile = UpdateUserProfile.newBuilder()
                    .setGivenName("Alice")
                    .setFamilyName("Smith")
                    .setName("Alice Smith")
                    .setLocale("en-GB")
                    .setPhoneNumber("+442071234567")
                    .build();
            UpdateUserResponse updated = client.users().updateUserByExternalId(externalId,
                    UpdateUserRequest.newBuilder()
                            .setUser(UpdateUser.newBuilder()
                                    .setUserProfile(updatedProfile)
                                    .putMetadata("plan", "enterprise-plus")
                                    .build())
                            .build());

            assertTrue(updated.hasUser());
            User updatedU = updated.getUser();
            assertEquals(userId,    updatedU.getId());
            assertFalse(updatedU.getEnvironmentId().isEmpty());
            assertEquals(userEmail, updatedU.getEmail());
            assertTrue(updatedU.hasExternalId());
            assertEquals(externalId, updatedU.getExternalId());
            assertTrue(updatedU.hasCreateTime());
            assertTrue(updatedU.hasUpdateTime());
            assertTrue(updatedU.hasUserProfile());
            assertEquals("Alice",           updatedU.getUserProfile().getGivenName());
            assertEquals("Smith",           updatedU.getUserProfile().getFamilyName());
            assertEquals("Alice Smith",     updatedU.getUserProfile().getName());
            assertEquals("en-GB",           updatedU.getUserProfile().getLocale());
            assertEquals("+442071234567",   updatedU.getUserProfile().getPhoneNumber());
            assertEquals("enterprise-plus", updatedU.getMetadataOrThrow("plan"));

            // deleteUserByExternalId — user must no longer be retrievable afterwards
            client.users().deleteUserByExternalId(externalId);
            assertThrows(APIException.class, () -> client.users().getUserByExternalId(externalId));
        } finally {
            try { client.users().deleteUser(userId); } catch (Exception ignored) {}
        }
    }

    @Test
    public void testMembershipExternalIdOperations() {
        // Scenario: Bob Chen is a developer who first joins testOrg, then is added to a second org.
        String externalId = "usr_bob_" + UUID.randomUUID();
        String userEmail = "bob.chen+" + UUID.randomUUID() + "@example.com";

        CreateUserProfile createProfile = CreateUserProfile.newBuilder()
                .setGivenName("Bob")
                .setFamilyName("Chen")
                .setName("Bob Chen")
                .setLocale("en-US")
                .setPhoneNumber("+16505550200")
                .build();

        CreateUser createUser = CreateUser.newBuilder()
                .setEmail(userEmail)
                .setExternalId(externalId)
                .setUserProfile(createProfile)
                .putMetadata("department", "engineering")
                .build();

        CreateUserAndMembershipResponse created = client.users().createUserAndMembership(testOrg,
                CreateUserAndMembershipRequest.newBuilder()
                        .setOrganizationId(testOrg)
                        .setSendInvitationEmail(false)
                        .setUser(createUser)
                        .build());

        assertTrue(created.hasUser());
        User createdU = created.getUser();
        String userId = createdU.getId();
        assertFalse(userId.isEmpty());
        assertFalse(createdU.getEnvironmentId().isEmpty());
        assertEquals(userEmail, createdU.getEmail());
        assertTrue(createdU.hasExternalId());
        assertEquals(externalId, createdU.getExternalId());
        assertTrue(createdU.hasCreateTime());
        assertTrue(createdU.hasUpdateTime());
        assertTrue(createdU.hasUserProfile());
        assertEquals("Bob",      createdU.getUserProfile().getGivenName());
        assertEquals("Chen",     createdU.getUserProfile().getFamilyName());
        assertEquals("Bob Chen", createdU.getUserProfile().getName());
        assertEquals("en-US",    createdU.getUserProfile().getLocale());
        assertEquals("+16505550200", createdU.getUserProfile().getPhoneNumber());
        assertEquals("engineering", createdU.getMetadataOrThrow("department"));
        assertEquals(1, createdU.getMembershipsCount());
        assertEquals(testOrg, createdU.getMemberships(0).getOrganizationId());

        Organization secondOrg = client.organizations().create(
                CreateOrganization.newBuilder()
                        .setDisplayName("Bob Chen Second Org")
                        .build()
        );

        try {
            // createMembershipByExternalId — Bob joins secondOrg as a developer
            CreateMembership membershipPayload = CreateMembership.newBuilder()
                    .putMetadata("invited_by", "admin@example.com")
                    .putMetadata("access_level", "developer")
                    .build();
            CreateMembershipResponse membershipResp = client.users().createMembershipByExternalId(
                    secondOrg.getId(), externalId,
                    CreateMembershipRequest.newBuilder().setMembership(membershipPayload).build());

            assertTrue(membershipResp.hasUser());
            User memberU = membershipResp.getUser();
            assertEquals(userId,    memberU.getId());
            assertFalse(memberU.getEnvironmentId().isEmpty());
            assertEquals(userEmail, memberU.getEmail());
            assertTrue(memberU.hasExternalId());
            assertEquals(externalId, memberU.getExternalId());
            assertTrue(memberU.hasUserProfile());
            assertEquals("Bob",      memberU.getUserProfile().getGivenName());
            assertEquals("Chen",     memberU.getUserProfile().getFamilyName());
            assertEquals("Bob Chen", memberU.getUserProfile().getName());
            // now belongs to both testOrg and secondOrg
            assertTrue(memberU.getMembershipsCount() >= 2);
            OrganizationMembership secondOrgMembership = memberU.getMembershipsList().stream()
                    .filter(m -> m.getOrganizationId().equals(secondOrg.getId()))
                    .findFirst()
                    .orElse(null);
            assertNotNull(secondOrgMembership);
            assertEquals(secondOrg.getId(), secondOrgMembership.getOrganizationId());
            assertTrue(secondOrgMembership.hasJoinTime());
            assertNotEquals(MembershipStatus.Membership_Status_UNSPECIFIED, secondOrgMembership.getMembershipStatus());

            // updateMembershipByExternalId — Bob gets promoted to senior developer in secondOrg
            UpdateMembership updateMembershipPayload = UpdateMembership.newBuilder()
                    .putMetadata("access_level", "senior-developer")
                    .putMetadata("invited_by", "admin@example.com")
                    .build();
            UpdateMembershipResponse updateMembershipResp = client.users().updateMembershipByExternalId(
                    secondOrg.getId(), externalId,
                    UpdateMembershipRequest.newBuilder().setMembership(updateMembershipPayload).build());

            assertTrue(updateMembershipResp.hasUser());
            User updatedMemberU = updateMembershipResp.getUser();
            assertEquals(userId,    updatedMemberU.getId());
            assertFalse(updatedMemberU.getEnvironmentId().isEmpty());
            assertEquals(userEmail, updatedMemberU.getEmail());
            assertTrue(updatedMemberU.hasExternalId());
            assertEquals(externalId, updatedMemberU.getExternalId());
            assertTrue(updatedMemberU.hasUserProfile());
            assertEquals("Bob",  updatedMemberU.getUserProfile().getGivenName());
            assertEquals("Chen", updatedMemberU.getUserProfile().getFamilyName());
            assertTrue(updatedMemberU.getMembershipsCount() >= 2);
            OrganizationMembership updatedSecondOrgMembership = updatedMemberU.getMembershipsList().stream()
                    .filter(m -> m.getOrganizationId().equals(secondOrg.getId()))
                    .findFirst()
                    .orElse(null);
            assertNotNull(updatedSecondOrgMembership);
            assertEquals(secondOrg.getId(), updatedSecondOrgMembership.getOrganizationId());

            // deleteMembershipByExternalId — Bob leaves secondOrg; a second delete must fail
            client.users().deleteMembershipByExternalId(secondOrg.getId(), externalId);
            assertThrows(APIException.class,
                    () -> client.users().deleteMembershipByExternalId(secondOrg.getId(), externalId));
        } finally {
            try { client.users().deleteUser(userId); } catch (Exception ignored) {}
            try { client.organizations().deleteById(secondOrg.getId()); } catch (Exception ignored) {}
        }
    }

    @Test
    public void testExternalIdInputValidation() {
        UpdateUserRequest dummyUpdateUser = UpdateUserRequest.newBuilder()
                .setUser(UpdateUser.newBuilder().build())
                .build();
        CreateMembershipRequest dummyCreateMembership = CreateMembershipRequest.newBuilder()
                .setMembership(CreateMembership.newBuilder().build())
                .build();
        UpdateMembershipRequest dummyUpdateMembership = UpdateMembershipRequest.newBuilder()
                .setMembership(UpdateMembership.newBuilder().build())
                .build();

        // getUserByExternalId
        assertThrows(IllegalArgumentException.class, () -> client.users().getUserByExternalId(null));
        assertThrows(IllegalArgumentException.class, () -> client.users().getUserByExternalId(""));
        assertThrows(IllegalArgumentException.class, () -> client.users().getUserByExternalId("  "));

        // updateUserByExternalId
        assertThrows(IllegalArgumentException.class, () -> client.users().updateUserByExternalId(null, dummyUpdateUser));
        assertThrows(IllegalArgumentException.class, () -> client.users().updateUserByExternalId("", dummyUpdateUser));
        assertThrows(IllegalArgumentException.class, () -> client.users().updateUserByExternalId("ext-id", null));

        // deleteUserByExternalId
        assertThrows(IllegalArgumentException.class, () -> client.users().deleteUserByExternalId(null));
        assertThrows(IllegalArgumentException.class, () -> client.users().deleteUserByExternalId(""));

        // createMembershipByExternalId
        assertThrows(IllegalArgumentException.class, () -> client.users().createMembershipByExternalId(null, "ext-id", dummyCreateMembership));
        assertThrows(IllegalArgumentException.class, () -> client.users().createMembershipByExternalId("", "ext-id", dummyCreateMembership));
        assertThrows(IllegalArgumentException.class, () -> client.users().createMembershipByExternalId("org-id", null, dummyCreateMembership));
        assertThrows(IllegalArgumentException.class, () -> client.users().createMembershipByExternalId("org-id", "", dummyCreateMembership));
        assertThrows(IllegalArgumentException.class, () -> client.users().createMembershipByExternalId("org-id", "ext-id", null));

        // deleteMembershipByExternalId
        assertThrows(IllegalArgumentException.class, () -> client.users().deleteMembershipByExternalId(null, "ext-id"));
        assertThrows(IllegalArgumentException.class, () -> client.users().deleteMembershipByExternalId("", "ext-id"));
        assertThrows(IllegalArgumentException.class, () -> client.users().deleteMembershipByExternalId("org-id", null));
        assertThrows(IllegalArgumentException.class, () -> client.users().deleteMembershipByExternalId("org-id", ""));

        // updateMembershipByExternalId
        assertThrows(IllegalArgumentException.class, () -> client.users().updateMembershipByExternalId(null, "ext-id", dummyUpdateMembership));
        assertThrows(IllegalArgumentException.class, () -> client.users().updateMembershipByExternalId("", "ext-id", dummyUpdateMembership));
        assertThrows(IllegalArgumentException.class, () -> client.users().updateMembershipByExternalId("org-id", null, dummyUpdateMembership));
        assertThrows(IllegalArgumentException.class, () -> client.users().updateMembershipByExternalId("org-id", "", dummyUpdateMembership));
        assertThrows(IllegalArgumentException.class, () -> client.users().updateMembershipByExternalId("org-id", "ext-id", null));
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
} 