import com.scalekit.ScalekitClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.commons.UserProfile;
import com.scalekit.grpc.scalekit.v1.users.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

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
        // Test listing users by organization
        ListUserRequest listRequest = ListUserRequest.newBuilder()
                .setPageSize(10)
                .setPageToken("")
                .build();

        ListUserResponse usersList = client.users().listUsers(testOrg, listRequest);
        assertNotNull(usersList);
        assertTrue(usersList.getUsersCount() > 0);

        // Test getting user by ID
        User firstUser = usersList.getUsers(0);
        GetUserResponse user = client.users().getUser(testOrg, firstUser.getId());
        assertNotNull(user);
        assertEquals(firstUser.getId(), user.getUser().getId());
        assertEquals(firstUser.getEmail(), user.getUser().getEmail());

        // Test listing users with pagination
        ListUserRequest paginatedRequest = ListUserRequest.newBuilder()
                .setPageSize(5)
                .setPageToken(usersList.getNextPageToken())
                .build();

        ListUserResponse paginatedUsers = client.users().listUsers(testOrg, paginatedRequest);
        assertNotNull(paginatedUsers);
        assertTrue(paginatedUsers.getUsersCount() > 0);
    }

    @Test
    public void testUpdateUser() {
        // First get an existing user
        ListUserRequest listRequest = ListUserRequest.newBuilder()
                .setPageSize(1)
                .setPageToken("")
                .build();

        ListUserResponse usersList = client.users().listUsers(testOrg, listRequest);
        assertNotNull(usersList);
        assertTrue(usersList.getUsersCount() > 0);

        User firstUser = usersList.getUsers(0);

        // Create update request
        UserProfile userProfile = UserProfile.newBuilder()
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
        UpdateUserResponse updatedUser = client.users().updateUser(testOrg, firstUser.getId(), updateRequest);
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
        User user = User.newBuilder()
            .setEmail("testin@example.com")
            .build();

        CreateUserRequest createRequest = CreateUserRequest.newBuilder()
            .setOrganizationId(testOrg)
            .setUser(user)
            .build();

        CreateUserResponse createdUser = client.users().createUser(testOrg, createRequest);
        assertNotNull(createdUser);
        assertEquals(user.getEmail(), createdUser.getUser().getEmail());

        String userId = createdUser.getUser().getId();

        // Get the user to verify creation
        GetUserResponse userResponse = client.users().getUser(testOrg, userId);
        assertNotNull(userResponse);
        assertEquals(userId, userResponse.getUser().getId());

        // Delete user
        client.users().deleteUser(testOrg, userId);

        // Verify user is deleted
        assertThrows(APIException.class, () -> {
            client.users().getUser(testOrg, userId);
        });
    }

    @Test
    public void testAddUserToOrganization() {
        // First create a user
        User user = User.newBuilder()
            .setEmail("org2.user@example.com")
            .build();

        CreateUserRequest createRequest = CreateUserRequest.newBuilder()
            .setOrganizationId(testOrg)
            .setUser(user)
            .build();

        CreateUserResponse createdUser = client.users().createUser(testOrg, createRequest);
        assertNotNull(createdUser);
        assertEquals(user.getEmail(), createdUser.getUser().getEmail());
        String userId = createdUser.getUser().getId();

        // Add user to organization
        AddUserRequest addRequest = AddUserRequest.newBuilder()
            .setOrganizationId(testOrg2)
            .build();

        AddUserResponse addResponse = client.users().addUserToOrganization(testOrg2, userId, addRequest);
        assertNotNull(addResponse);
        assertNotNull(addResponse.getUser());
        String userId2 = addResponse.getUser().getId();

        // Cleanup
        client.users().deleteUser(testOrg, userId);
        client.users().deleteUser(testOrg2, userId2);
    }
} 