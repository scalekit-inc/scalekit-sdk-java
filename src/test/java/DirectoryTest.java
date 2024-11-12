import com.google.protobuf.Timestamp;
import com.scalekit.ScalekitClient;
import com.scalekit.api.ListDirectoryResourceOptions;
import com.scalekit.grpc.scalekit.v1.directories.DirectoryProvider;
import com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse;
import com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse;
import com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DirectoryTest {

    //configs
    private static String organizationId;
    private static String directoryId;
    private static Timestamp updatedAfter;

    private static ScalekitClient client;

    @BeforeAll
    static void init(){

        organizationId = "org_43223111834796035";
        directoryId = "dir_43223123058754084";

        //25-Oct-2024 03:06pm
        long seconds = 1729851960L;
        updatedAfter = Timestamp.newBuilder().setSeconds(seconds).build();


        //Init client
        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String  clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String apiSecret = System.getenv("SCALEKIT_CLIENT_SECRET");
        

        client = new ScalekitClient(environmentUrl, clientId, apiSecret);
    }

    @Test
    public void GetDirectoryTest(){
        ListDirectoriesResponse response = client.directories().listDirectories(organizationId);
        assertTrue(response.getDirectoriesCount() > 0);

        var directory = response.getDirectories(0);
        assertNotNull(directory);
        assertEquals(directoryId, directory.getId());
        assertEquals(organizationId, directory.getOrganizationId());
        assertEquals(DirectoryProvider.OKTA, directory.getDirectoryProvider());
        assertTrue(directory.getStats().getTotalGroups() > 0);
        assertTrue(directory.getStats().getTotalUsers() > 0);
    }

    @Test
    public void ListDirectoryUsers(){
        ListDirectoriesResponse response = client.directories().listDirectories(organizationId);
        assertTrue(response.getDirectoriesCount() > 0);

        var directory = response.getDirectories(0);
        assertNotNull(directory);

        var options = ListDirectoryResourceOptions.builder()
                .pageSize(10)
                .pageToken("")
                .includeDetail(true)
                .build();

        ListDirectoryUsersResponse usersResponse = client
                .directories()
                .listDirectoryUsers(directory.getId(),organizationId,options);

        assertTrue(usersResponse.getUsersCount() > 1);

        var user = usersResponse.getUsers(0);
        assertNotNull(user);
        assertNotNull(user.getId());
        assertNotNull(user.getEmail());
        assertNotNull(user.getUserDetail());
    }

    @Test
    public void ListDirectoryUsersUpdatedAfter(){
        ListDirectoriesResponse response = client.directories().listDirectories(organizationId);
        assertTrue(response.getDirectoriesCount() > 0);

        var directory = response.getDirectories(0);
        assertNotNull(directory);

        var options = ListDirectoryResourceOptions.builder()
                .pageSize(10)
                .pageToken("")
                .includeDetail(true)
                .updatedAfter(updatedAfter)
                .build();

        ListDirectoryUsersResponse usersResponse = client
                .directories()
                .listDirectoryUsers(directory.getId(),organizationId,options);

        assertEquals(usersResponse.getUsersCount() ,1);

        var user = usersResponse.getUsers(0);
        assertNotNull(user);
        assertNotNull(user.getId());
        assertNotNull(user.getEmail());
        assertNotNull(user.getUserDetail());
    }

    @Test
    public void ListDirectoryGroups(){
        ListDirectoriesResponse response = client.directories().listDirectories(organizationId);
        assertTrue(response.getDirectoriesCount() > 0);

        var directory = response.getDirectories(0);
        assertNotNull(directory);

        var options = ListDirectoryResourceOptions.builder()
                .pageSize(10)
                .pageToken("")
                .includeDetail(true)
                .build();

        ListDirectoryGroupsResponse groupsResponse = client
                .directories()
                .listDirectoryGroups(directory.getId(),organizationId,options);

        assertTrue(groupsResponse.getGroupsCount() > 0);

        var group = groupsResponse.getGroups(0);
        assertNotNull(group);
        assertNotNull(group.getId());
        assertNotNull(group.getDisplayName());
        assertNotNull(group.getGroupDetail());

    }

    @Test
    public void EnableDisableDirectory(){
        try {
            var enableResponse = client.directories().enableDirectory(directoryId, organizationId);
            assertTrue(enableResponse.getEnabled());

            var disableResponse = client.directories().disableDirectory(directoryId, organizationId);
            assertFalse(disableResponse.getEnabled());
        }
        catch (Exception e){
            fail(e);
        }finally {
            //cleanup
            client.directories().enableDirectory(directoryId, organizationId);
        }
    }

    @Test
    public void GetDirectoryByOrganizationId(){
        var directory = client.directories().getDirectoryByOrganizationId(organizationId);
        var directoryById = client.directories().getDirectory(directoryId, organizationId);
        assertNotNull(directory);
        assertNotNull(directoryById);
        assertEquals(directory.getId(), directoryById.getId());
        assertEquals(organizationId, directory.getOrganizationId());
        assertEquals(DirectoryProvider.OKTA, directory.getDirectoryProvider());
        assertTrue(directory.getStats().getTotalGroups() > 0);
        assertTrue(directory.getStats().getTotalUsers() > 0);
    }

}
