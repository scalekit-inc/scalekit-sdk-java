import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import com.scalekit.ScalekitClient;
import com.scalekit.api.util.*;
import com.scalekit.grpc.scalekit.v1.directories.Directory;
import com.scalekit.grpc.scalekit.v1.directories.DirectoryProvider;
import com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse;
import com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse;
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

        long seconds = 1729851960L;
        updatedAfter = Timestamp.newBuilder().setSeconds(seconds).build();


        //Init client
        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String  clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String apiSecret = System.getenv("SCALEKIT_CLIENT_SECRET");
        organizationId = System.getenv("TEST_ORGANIZATION");
        directoryId = System.getenv("TEST_DIRECTORY");

        client = new ScalekitClient(environmentUrl, clientId, apiSecret);
    }

    @Test
    public void GetDirectoryTest(){
        ListDirectoriesResponse response = client.directories().listDirectories(organizationId);
        assertTrue(response.getDirectoriesCount() > 0);

        Directory directoryById = client.directories().getDirectory(directoryId, organizationId);

        Directory directory = response.getDirectories(0);
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

        Directory directory = response.getDirectories(0);
        assertNotNull(directory);

        ListDirectoryResourceOptions options = ListDirectoryResourceOptions.builder()
                .pageSize(10)
                .pageToken("")
                .includeDetail(true)
                .build();

        ListDirectoryUserResponse usersResponse = client
                .directories()
                .listDirectoryUsers(directory.getId(),organizationId,options);

        assertTrue(usersResponse.getUsersCount() > 1);

        for (int i = 0; i < usersResponse.getUsersCount(); i++) {
            DirectoryUser user = usersResponse.getUsers(i);
            assertNotNull(user);
            assertNotNull(user.getId());
            assertNotNull(user.getEmail());
            assertNotNull(user.getUserDetail());

            JsonNode node = mapper.readTree(user.getUserDetail());
            assertNotNull(node);
            assertEquals(node.get("id").asText(), user.getId());
            assertEquals(node.get("email").asText(), user.getEmail());
        }
    }

    @Test
    public void ListDirectoryUsersUpdatedAfter(){
        ListDirectoriesResponse response = client.directories().listDirectories(organizationId);
        assertTrue(response.getDirectoriesCount() > 0);

        Directory directory = response.getDirectories(0);
        assertNotNull(directory);

        ListDirectoryResourceOptions options = ListDirectoryResourceOptions.builder()
                .pageSize(10)
                .pageToken("")
                .includeDetail(true)
                .updatedAfter(updatedAfter)
                .build();

        ListDirectoryUserResponse usersResponse = client
                .directories()
                .listDirectoryUsers(directory.getId(),organizationId,options);

        assertEquals(usersResponse.getUsersCount() ,2);

        DirectoryUser user = usersResponse.getUsers(0);
        assertNotNull(user);
        assertNotNull(user.getId());
        assertNotNull(user.getEmail());
        assertNotNull(user.getUserDetail());
    }

    @Test
    public void EnableDisableDirectory(){
        try {
            ToggleDirectoryResponse enableResponse = client.directories().enableDirectory(directoryId, organizationId);
            assertTrue(enableResponse.getEnabled());

            ToggleDirectoryResponse disableResponse = client.directories().disableDirectory(directoryId, organizationId);
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
    public void ListDirectoryGroups() throws JsonProcessingException {
        ListDirectoriesResponse response = client.directories().listDirectories(organizationId);
        assertTrue(response.getDirectoriesCount() > 0);

        Directory directory = response.getDirectories(0);
        assertNotNull(directory);

        ListDirectoryResourceOptions options = ListDirectoryResourceOptions.builder()
                .pageSize(10)
                .pageToken("")
                .includeDetail(true)
                .build();

        ListDirectoryGroupResponse groupsResponse = client
                .directories()
                .listDirectoryGroups(directory.getId(),organizationId,options);


        assertTrue(groupsResponse.getGroupsCount() > 0);

        for (int i = 0; i < groupsResponse.getGroupsCount(); i++) {
            DirectoryGroup group = groupsResponse.getGroups(i);
            assertNotNull(group);
            assertNotNull(group.getId());
            assertNotNull(group.getDisplayName());
            assertNotNull(group.getGroupDetail());

            JsonNode node = mapper.readTree(group.getGroupDetail());
            assertNotNull(node);
            assertEquals(node.get("id").asText(), group.getId());
            assertEquals(node.get("display_name").asText(), group.getDisplayName());
        }
    }

    @Test
    public void GetDirectoryByOrganizationId(){
        Directory directory = client.directories().getPrimaryDirectoryByOrganizationId(organizationId);
        Directory directoryById = client.directories().getDirectory(directory.getId(), organizationId);
        assertNotNull(directory);
        assertNotNull(directoryById);
        assertEquals(directory.getId(), directoryById.getId());
        assertEquals(organizationId, directory.getOrganizationId());
        assertEquals(DirectoryProvider.OKTA, directory.getDirectoryProvider());
        assertTrue(directory.getStats().getTotalGroups() > 0);
        assertTrue(directory.getStats().getTotalUsers() > 0);
    }

}
