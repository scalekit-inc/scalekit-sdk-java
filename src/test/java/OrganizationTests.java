
import com.scalekit.ScalekitClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.organizations.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class OrganizationTests {

    private static ScalekitClient client;

    @BeforeAll
    static void init(){
        //Init client
         client = new ScalekitClient("gmail-dev.scalekit.cloud",
                 "skc_13388706786312310",
                 "test_DdFtAfDceJQeQ5aLj4afSgdyrZeqAir8tbRGeIKxkgcwNitgov7q3GtExe4p2Aek");
    }

    @Test
    void OrganizationsTest(){
        String organizationName = "Tested from Sdk 1";
        CreateOrganization createOrganization = CreateOrganization.newBuilder()
                .setDisplayName(organizationName)
                .setExternalId( UUID.randomUUID().toString().substring(0,10))
                .putMetadata("testKey","testValue")
                .build();

        Organization createdOrganization       = client.Organizations().Create(createOrganization);
        Organization retrievedOrganizationById = client.Organizations().GetById(createdOrganization.getId());
        Organization retrieveByExternalId      = client.Organizations().GetByExternalId(createdOrganization.getExternalId());
        Organization updatedOrganizationById   = client.Organizations().UpdateById(
                createdOrganization.getId(),
                UpdateOrganization.newBuilder()
                        .setDisplayName("Updated name")
                        .build()
        );

        Organization updatedOrganizationByExternalId = client.Organizations().UpdateByExternalId(
                createdOrganization.getExternalId(),
                UpdateOrganization.newBuilder()
                        .setDisplayName("Updated name again")
                        .build()
        );

        client.Organizations().DeleteById(createdOrganization.getId());
        // create again with same external Id
        Organization reCreatedOrganization = client.Organizations().Create(createOrganization);
        client.Organizations().DeleteByExternalId(reCreatedOrganization.getExternalId());

        List<Organization> organizations = client.Organizations().GetOrganizations();

        assertNotNull(organizations);
        assertThrows(APIException.class, () -> client.Organizations().GetById(createdOrganization.getId()));
        assertThrows(APIException.class, () -> client.Organizations().GetById(reCreatedOrganization.getId()));
        assertThrows(APIException.class, () -> client.Organizations().GetById(reCreatedOrganization.getExternalId()));
        assertEquals(organizationName, createdOrganization.getDisplayName());
        assertEquals(createdOrganization.getMetadataMap(),createdOrganization.getMetadataMap());
        assertEquals(retrievedOrganizationById.getId(),createdOrganization.getId());
        assertEquals(retrievedOrganizationById.getExternalId(),createdOrganization.getExternalId());
        assertEquals(retrievedOrganizationById.getMetadataMap(), createdOrganization.getMetadataMap());
        assertEquals(retrieveByExternalId,retrievedOrganizationById);
        assertEquals(updatedOrganizationById.getDisplayName(),"Updated name");
        assertEquals(updatedOrganizationById.getId(),createdOrganization.getId());
        assertEquals(updatedOrganizationByExternalId.getExternalId(),createdOrganization.getExternalId());
        assertEquals(updatedOrganizationByExternalId.getDisplayName(),"Updated name again");
    }

    @Test
    void  ExceptionTest() {
        String organizationName = "";
        CreateOrganization createOrganization = CreateOrganization.newBuilder()
                .setDisplayName(organizationName)
                .setExternalId( "123")
                .putMetadata("testKey","testValue")
                .build();


        APIException exception = assertThrows(APIException.class, () -> client.Organizations().Create(createOrganization));
        assertEquals("INVALID_ARGUMENT", exception.getScalekitErrorCode());

    }

    @Test
    void ListOrganizationsTest() {
        List<Organization> organizations = client.Organizations().GetOrganizations();
        assertNotNull(organizations);

        GeneratePortalLinkRequest request = GeneratePortalLinkRequest.newBuilder()
                .setId(organizations.get(0).getId())
                .build();
    }

    @Test
    void GeneratePortalLinkTest() {
        List<Organization> organizations = client.Organizations().GetOrganizations();
        assertNotNull(organizations);


        Link response = client.Organizations().GeneratePortalLink(organizations.get(0).getId());
        assertNotNull(response);
        assertNotNull(response.getLocation());
        assertNotNull(response.getId());
    }


}
