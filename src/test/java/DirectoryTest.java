import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import com.scalekit.ScalekitClient;
import com.scalekit.api.util.ListDirectoryResourceOptions;
import com.scalekit.api.util.ListDirectoryUserResponse;
import com.scalekit.grpc.scalekit.v1.directories.DirectoryProvider;
import com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse;
import com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DirectoryTest {

    //configs
    private static String organizationId;
    private static String directoryId;
    private static Timestamp updatedAfter;
    private static ScalekitClient client;
    private static final ObjectMapper mapper = new ObjectMapper();

    @BeforeAll
    static void init(){

        organizationId = "org_43223111834796035";
        directoryId = "dir_43223123058754084";

        //25-Oct-2024 03:06pm
        long seconds = 1729851960L;
        updatedAfter = Timestamp.newBuilder().setSeconds(seconds).build();


        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String  clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String apiSecret = System.getenv("SCALEKIT_CLIENT_SECRET");

        client = new ScalekitClient(environmentUrl, clientId, apiSecret);
    }

    @Test
    public void GetDirectoryTest(){
        ListDirectoriesResponse response = client.directories().listDirectories(organizationId);
        assertTrue(response.getDirectoriesCount() > 0);

        var directoryById = client.directories().getDirectory(directoryId, organizationId);

        var directory = response.getDirectories(0);
        assertNotNull(directory);
        assertEquals(directoryId, directory.getId());
        assertEquals(organizationId, directory.getOrganizationId());
        assertEquals(DirectoryProvider.OKTA, directory.getDirectoryProvider());
        assertTrue(directory.getStats().getTotalGroups() > 0);
        assertTrue(directory.getStats().getTotalUsers() > 0);
        assertEquals(directoryById.getId(), directory.getId());
        assertEquals(directoryById.getOrganizationId(), directory.getOrganizationId());

    }

    @Test
    public void ListDirectoryUsers() throws InvalidProtocolBufferException, JsonProcessingException {

        ListDirectoriesResponse response = client.directories().listDirectories(organizationId);
        assertTrue(response.getDirectoriesCount() > 0);

        var directory = response.getDirectories(0);
        assertNotNull(directory);

        var options = ListDirectoryResourceOptions.builder()
                .pageSize(10)
                .pageToken("")
                .includeDetail(true)
                .build();

        ListDirectoryUserResponse usersResponse = client
                .directories()
                .listDirectoryUsers(directory.getId(),organizationId,options);

        assertTrue(usersResponse.getUsersCount() > 1);

        var user = usersResponse.getUsers(0);
        assertNotNull(user);
        assertNotNull(user.getId());
        assertNotNull(user.getEmail());
        assertNotNull(user.getUserDetail());

        JsonNode node = mapper.readTree(user.getUserDetail());
        assertNotNull(node);
        assertEquals(node.get("id").asText(), user.getId());
        assertEquals(node.get("email").asText(), user.getEmail());

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

        ListDirectoryUserResponse usersResponse = client
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
        var directory = client.directories().getPrimaryDirectoryByOrganizationId(organizationId);
        var directoryById = client.directories().getDirectory(directory.getId(), organizationId);
        assertNotNull(directory);
        assertNotNull(directoryById);
        assertEquals(directory.getId(), directoryById.getId());
        assertEquals(organizationId, directory.getOrganizationId());
        assertEquals(DirectoryProvider.OKTA, directory.getDirectoryProvider());
        assertTrue(directory.getStats().getTotalGroups() > 0);
        assertTrue(directory.getStats().getTotalUsers() > 0);
    }

}
