import com.scalekit.ScalekitClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.users.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTests {

    private static ScalekitClient client;
    private static String testOrg;
    private static String testOrg2;

    @BeforeAll
    static void init() {
        // Init client
        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String  clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String apiSecret = System.getenv("SCALEKIT_CLIENT_SECRET");
        testOrg = System.getenv("TEST_ORGANIZATION");
        testOrg2 = System.getenv("TEST_ORGANIZATION2");
        client = new ScalekitClient(environmentUrl, clientId, apiSecret);
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
        CreateUser user = CreateUser.newBuilder()
            .setEmail("testin@example.com")
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
        CreateUser user = CreateUser.newBuilder()
            .setEmail("org2.user@example.com")
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

        CreateMembershipRequest addRequest = CreateMembershipRequest.newBuilder()
            .setOrganizationId(testOrg2)
            .setId(userId)  // Set the user ID
            .setMembership(membership)  // Set the required membership field
            .build();

        CreateMembershipResponse addResponse = client.users().createMembership(testOrg2, userId, addRequest);
        assertNotNull(addResponse);
        assertNotNull(addResponse.getUser());
        String userId2 = addResponse.getUser().getId();

        // Cleanup
        client.users().deleteUser(userId);
        client.users().deleteUser(userId2);
    }
} 