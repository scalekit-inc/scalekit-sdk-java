
import com.scalekit.ScalekitClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.organizations.CreateOrganization;
import com.scalekit.grpc.scalekit.v1.organizations.Organization;
import com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganization;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class OrganizationTests {

    private static ScalekitClient client;

    @BeforeAll
    static void init(){
        //Init client
         client = new ScalekitClient("gmail-dev.scalekit.cloud",
                 "test",
                 "test");
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


}
