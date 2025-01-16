
import com.scalekit.ScalekitClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.organizations.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class OrganizationTests {

    private static ScalekitClient client;

    @BeforeAll
    static void init(){
        //Init client
        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String  clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String apiSecret = System.getenv("SCALEKIT_CLIENT_SECRET");

        client = new ScalekitClient(environmentUrl, clientId, apiSecret);
    }

    @Test
    void OrganizationsTest() {
        String organizationName = "Tested from Sdk 1";
        CreateOrganization createOrganization = CreateOrganization.newBuilder()
                .setDisplayName(organizationName)
                .setExternalId( UUID.randomUUID().toString().substring(0,10))
                .putMetadata("testKey","testValue")
                .build();

        Organization createdOrganization       = client.organizations().create(createOrganization);

        Organization retrievedOrganizationById = client.organizations().getById(createdOrganization.getId());
        Organization retrieveByExternalId      = client.organizations().getByExternalId(createdOrganization.getExternalId());
        Organization updatedOrganizationById   = client.organizations().updateById(
                createdOrganization.getId(),
                UpdateOrganization.newBuilder()
                        .setDisplayName("Updated name")
                        .build()
        );

        Organization updatedOrganizationByExternalId = client.organizations().updateByExternalId(
                createdOrganization.getExternalId(),
                UpdateOrganization.newBuilder()
                        .setDisplayName("Updated name again")
                        .build()
        );


        client.organizations().deleteById(createdOrganization.getId());
        // create again with same external Id
        Organization reCreatedOrganization = client.organizations().create(createOrganization);
        client.organizations().deleteByExternalId(reCreatedOrganization.getExternalId());

        ListOrganizationsResponse organizations = client.organizations().listOrganizations(10, "");

        assertNotNull(organizations);
        assertTrue(organizations.getTotalSize() > 10);
        assertNotNull(organizations.getNextPageToken());

        assertThrows(APIException.class, () -> client.organizations().getById(createdOrganization.getId()));
        assertThrows(APIException.class, () -> client.organizations().getById(reCreatedOrganization.getId()));
        assertThrows(APIException.class, () -> client.organizations().getById(reCreatedOrganization.getExternalId()));
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


        APIException exception = assertThrows(APIException.class, () -> client.organizations().create(createOrganization));
        assertEquals("INVALID_ARGUMENT", exception.getScalekitErrorCode());

    }


    @Test
    void GeneratePortalLinkTest() {
        CreateOrganization createOrganization = CreateOrganization.newBuilder()
                .setDisplayName("tested for creating portal links")
                .build();

        Organization organization = client.organizations().create(createOrganization);
        assertNotNull(organization);

        OrganizationSettingsFeature featureSSOEnable = OrganizationSettingsFeature.newBuilder()
                .setName("sso")
                .setEnabled(true)
                .build();

        OrganizationSettingsFeature featureDirectorySyncEnable = OrganizationSettingsFeature.newBuilder()
                .setName("dir_sync")
                .setEnabled(true)
                .build();


        Organization updatedOrganization = client.organizations()
                .updateOrganizationSettings(organization.getId(), Arrays.asList(featureSSOEnable, featureDirectorySyncEnable));

        // Generate link for each module available in the org.
        // all can verified by visiting the link in browser
        Link linkForDirectorySync = client.organizations().generatePortalLink(updatedOrganization.getId(),
                Collections.singletonList(Feature.dir_sync));
        Link linkForSSO = client.organizations().generatePortalLink(updatedOrganization.getId(),
                Collections.singletonList(Feature.sso));
        Link linkForBoth = client.organizations().generatePortalLink(updatedOrganization.getId(),
                Arrays.asList(Feature.sso, Feature.dir_sync));


        Link linkWithDefaultFeatures = client.organizations().generatePortalLink(updatedOrganization.getId());

        System.out.println("Link for Directory Sync: " + linkForDirectorySync.getLocation());
        System.out.println("Link for SSO: " + linkForSSO.getLocation());
        System.out.println("Link for Both: " + linkForBoth.getLocation());
        System.out.println("Link with default features (whatever is enabled for the org): " + linkWithDefaultFeatures.getLocation());

        assertNotNull(linkForDirectorySync);
        assertNotNull(linkForDirectorySync.getLocation());
        assertNotNull(linkForDirectorySync.getId());
        assertNotNull(linkForSSO);
        assertNotNull(linkForSSO.getLocation());
        assertNotNull(linkForSSO.getId());
        assertNotNull(linkForBoth);
        assertNotNull(linkForBoth.getLocation());
        assertNotNull(linkForBoth.getId());
    }


    @Test
    void GeneratePortalLinkTestException() {
        CreateOrganization createOrganization = CreateOrganization.newBuilder()
                .setDisplayName("tested for creating portal links")
                .build();

        Organization organization = client.organizations().create(createOrganization);
        assertNotNull(organization);

        OrganizationSettingsFeature featureSSOEnable = OrganizationSettingsFeature.newBuilder()
                .setName("sso")
                .setEnabled(false)
                .build();

        OrganizationSettingsFeature featureDirectorySyncEnable = OrganizationSettingsFeature.newBuilder()
                .setName("dir_sync")
                .setEnabled(false)
                .build();


        Organization updatedOrganization = client.organizations()
                .updateOrganizationSettings(organization.getId(), Arrays.asList(featureSSOEnable, featureDirectorySyncEnable));

        try{
            // directory sync not enabled
            Link linkForDirectorySync = client.organizations().generatePortalLink(updatedOrganization.getId(), Collections.singletonList(Feature.dir_sync));
        } catch (APIException e) {
            assertEquals("INVALID_ARGUMENT", e.getScalekitErrorCode());
        }


    }

    @Test
    void UpdateOrganizationSettingsTest() {
        ListOrganizationsResponse organizations = client.organizations().listOrganizations(10, null);
        assertNotNull(organizations);

        Organization organization = organizations.getOrganizationsList().get(0);

        OrganizationSettingsFeature featureSSOEnable = OrganizationSettingsFeature.newBuilder()
                .setName("sso")
                .setEnabled(true)
                .build();

        OrganizationSettingsFeature featureDirectorySyncEnable = OrganizationSettingsFeature.newBuilder()
                .setName("dir_sync")
                .setEnabled(true)
                .build();

        OrganizationSettingsFeature featureSSODisable = OrganizationSettingsFeature.newBuilder()
                .setName("sso")
                .setEnabled(false)
                .build();

        OrganizationSettingsFeature featureDirectorySyncDisable = OrganizationSettingsFeature.newBuilder()
                .setName("dir_sync")
                .setEnabled(false)
                .build();


        Organization updatedOrganization = client.organizations()
                .updateOrganizationSettings(organization.getId(), Arrays.asList(featureSSOEnable, featureDirectorySyncEnable));

        assertNotNull(updatedOrganization);
        assertTrue(updatedOrganization.getSettings().getFeaturesList().get(0).getEnabled());
        assertTrue(updatedOrganization.getSettings().getFeaturesList().get(1).getEnabled());

         updatedOrganization = client.organizations()
                .updateOrganizationSettings(organization.getId(), Arrays.asList(featureSSODisable, featureDirectorySyncDisable));

        assertNotNull(updatedOrganization);
        assertFalse(updatedOrganization.getSettings().getFeaturesList().get(0).getEnabled());
        assertFalse(updatedOrganization.getSettings().getFeaturesList().get(1).getEnabled());
    }

}
