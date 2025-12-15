import com.scalekit.ScalekitClient;
import com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.Operation;
import com.scalekit.grpc.scalekit.v1.domains.Domain;
import com.scalekit.grpc.scalekit.v1.domains.DomainType;
import com.scalekit.grpc.scalekit.v1.domains.CreateDomainRequest;
import com.scalekit.grpc.scalekit.v1.domains.CreateDomain;
import com.scalekit.grpc.scalekit.v1.organizations.Organization;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

public class DomainTests {

    private static ScalekitClient client;
    @BeforeAll
    static void init(){
        //Init client
        String environmentUrl = "https://scalekit-5ymxt5aaaena-dev.scalekit.cloud";
        String  clientId = "skc_67019057341137178";
        String apiSecret = "test_K5ldnscrtxCfgARXFBednkSqCewjVDybAhH1Jx2gyRkbnCNPbVXbDuvCLbr8fGij";

        client = new ScalekitClient(environmentUrl, clientId, apiSecret);
    }

    @Test
    public void DomainTest(){
        Organization organization  = client.organizations().listOrganizations(10, "").getOrganizationsList().get(0);
        assert organization != null;
        String domainName = UUID.randomUUID().toString().substring(0,10) + ".test";
        
        CreateDomainRequest request = CreateDomainRequest.newBuilder()
                .setOrganizationId(organization.getId())
                .setDomain(CreateDomain.newBuilder()
                        .setDomain(domainName)
                        .build())
                .build();
        
        Domain domain = client.domains().createDomain(request);
        Assertions.assertEquals(domainName, domain.getDomain());

        List<Domain> retrievedDomain = client.domains().listDomainsByOrganizationId(organization.getId());
        Assertions.assertFalse(retrievedDomain.isEmpty());

        Domain retrievedDomainById = client.domains().getDomainById(organization.getId(), domain.getId());
        Assertions.assertEquals(domain.getId(), retrievedDomainById.getId());
    }

    @Test
    public void testCreateDomainWithHomeRealmDiscoveryType() {
        Organization organization = client.organizations().listOrganizations(10, "").getOrganizationsList().get(0);
        assert organization != null;
        String domainName = UUID.randomUUID().toString().substring(0, 10) + ".test";
        
        CreateDomainRequest request = CreateDomainRequest.newBuilder()
                .setOrganizationId(organization.getId())
                .setDomain(CreateDomain.newBuilder()
                        .setDomain(domainName)
                        .setDomainType(DomainType.ORGANIZATION_DOMAIN)
                        .build())
                .build();
        
        Domain domain = client.domains().createDomain(request);
        Assertions.assertEquals(domainName, domain.getDomain());
        Assertions.assertEquals(DomainType.ORGANIZATION_DOMAIN, domain.getDomainType());
    }

    @Test
    public void testCreateDomainWithJitProvisioningDomainType() {
        Organization organization = client.organizations().listOrganizations(10, "").getOrganizationsList().get(0);
        assert organization != null;
        String domainName = UUID.randomUUID().toString().substring(0, 10) + ".test";
        
        CreateDomainRequest request = CreateDomainRequest.newBuilder()
                .setOrganizationId(organization.getId())
                .setDomain(CreateDomain.newBuilder()
                        .setDomain(domainName)
                        .setDomainType(DomainType.ALLOWED_EMAIL_DOMAIN)
                        .build())
                .build();
        
        Domain domain = client.domains().createDomain(request);
        Assertions.assertEquals(domainName, domain.getDomain());
        Assertions.assertEquals(DomainType.ALLOWED_EMAIL_DOMAIN, domain.getDomainType());
    }

    @Test
    public void testCreateDomainWithoutDomainType() {
        Organization organization = client.organizations().listOrganizations(10, "").getOrganizationsList().get(0);
        assert organization != null;
        String domainName = UUID.randomUUID().toString().substring(0, 10) + ".test";
        
        CreateDomainRequest request = CreateDomainRequest.newBuilder()
                .setOrganizationId(organization.getId())
                .setDomain(CreateDomain.newBuilder()
                        .setDomain(domainName)
                        .build())
                .build();
        
        Domain domain = client.domains().createDomain(request);
        Assertions.assertEquals(domainName, domain.getDomain());
        // When domainType is not specified, it should default to DOMAIN_TYPE_UNSPECIFIED
        Assertions.assertEquals(DomainType.ORGANIZATION_DOMAIN, domain.getDomainType());
    }

    @Test
    public void testDeleteDomain() {
        Organization organization = client.organizations().listOrganizations(10, "").getOrganizationsList().get(0);
        assert organization != null;
        // Use a more unique domain name to avoid conflicts
        String domainName = UUID.randomUUID().toString().substring(0, 10) + ".test";
        
        // Create a domain first
        try {
            CreateDomainRequest request = CreateDomainRequest.newBuilder()
                    .setOrganizationId(organization.getId())
                    .setDomain(CreateDomain.newBuilder()
                            .setDomain(domainName)
                            .build())
                    .build();
            Domain domain = client.domains().createDomain(request);
            Assertions.assertEquals(domainName, domain.getDomain());
            Assertions.assertNotNull(domain.getId());
            
            // Verify the domain exists
            Domain retrievedDomain = client.domains().getDomainById(organization.getId(), domain.getId());
            Assertions.assertEquals(domain.getId(), retrievedDomain.getId());
            
            // Delete the domain
            client.domains().deleteDomain(organization.getId(), domain.getId());
            
            // Verify the domain is deleted by trying to get it (should throw an exception)
            try {
                client.domains().getDomainById(organization.getId(), domain.getId());
                Assertions.fail("Domain should have been deleted");
            } catch (Exception e) {
                // Expected behavior - domain should not exist after deletion
                Assertions.assertTrue(e.getMessage().contains("not found") || e.getMessage().contains("NOT_FOUND"));
            }
        } catch (com.scalekit.exceptions.APIException e) {
            // Print the full error message for debugging
            System.err.println("APIException creating domain: " + e.getMessage());
            System.err.println("Error code: " + e.getScalekitErrorCode());
            throw e;
        }
    }

    @Test
    public void testListDomainsByOrganizationId() {
        Organization organization  = client.organizations().listOrganizations(10, "").getOrganizationsList().get(0);
        assert organization != null;
        String domainName = UUID.randomUUID().toString().substring(0, 10) + ".test";
        CreateDomainRequest request = CreateDomainRequest.newBuilder()
                .setOrganizationId(organization.getId())
                .setDomain(CreateDomain.newBuilder()
                        .setDomain(domainName)
                        .build())
                .build();
        Domain domain = client.domains().createDomain(request);
        Assertions.assertEquals(domainName, domain.getDomain());
        List<Domain> domains = client.domains().listDomainsByOrganizationId(organization.getId());
        Assertions.assertFalse(domains.isEmpty());
    }

    @Test
    public void testListDomainsByHomeRealmDiscoveryType() {
        Organization organization  = client.organizations().listOrganizations(10, "").getOrganizationsList().get(0);
        assert organization != null;
        String domainName = UUID.randomUUID().toString().substring(0, 10) + ".test";
        CreateDomainRequest request = CreateDomainRequest.newBuilder()
                .setOrganizationId(organization.getId())
                .setDomain(CreateDomain.newBuilder()
                        .setDomain(domainName)
                        .setDomainType(DomainType.ORGANIZATION_DOMAIN)
                        .build())
                .build();
        Domain domain = client.domains().createDomain(request);
        Assertions.assertEquals(domainName, domain.getDomain());
        Assertions.assertEquals(DomainType.ORGANIZATION_DOMAIN, domain.getDomainType());
        Assertions.assertNotNull(domain.getId(), "Domain ID should not be null");

        // Filter by domain type - the created domain should appear in this filtered list
        List<Domain> domains = client.domains().listDomainsByOrganizationId(organization.getId(), DomainType.ORGANIZATION_DOMAIN);
        Assertions.assertFalse(domains.isEmpty(), "Filtered list should not be empty");

        Assertions.assertTrue(domains.stream().anyMatch(d -> d.getDomain().equals(domainName)),
                "Created domain '" + domainName + "' should appear in the filtered list");
    }

    @Test
    public void testListDomainsByJitProvisioningDomainType() {
        Organization organization = client.organizations().listOrganizations(10, "").getOrganizationsList().get(0);
        assert organization != null;
        String domainName = UUID.randomUUID().toString().substring(0, 10) + ".test";
        CreateDomainRequest request = CreateDomainRequest.newBuilder()
                .setOrganizationId(organization.getId())
                .setDomain(CreateDomain.newBuilder()
                        .setDomain(domainName)
                        .setDomainType(DomainType.ALLOWED_EMAIL_DOMAIN)
                        .build())
                .build();
        Domain domain = client.domains().createDomain(request);
        Assertions.assertEquals(domainName, domain.getDomain());
        Assertions.assertEquals(DomainType.ALLOWED_EMAIL_DOMAIN, domain.getDomainType());
        Assertions.assertNotNull(domain.getId(), "Domain ID should not be null");
        
        // Filter by domain type - the created domain should appear in this filtered list
        List<Domain> domains = client.domains().listDomainsByOrganizationId(organization.getId(), DomainType.ALLOWED_EMAIL_DOMAIN);
        Assertions.assertFalse(domains.isEmpty(), "Filtered list should not be empty");
        
        Assertions.assertTrue(domains.stream().anyMatch(d -> d.getDomain().equals(domainName)),
            "Created domain '" + domainName + "' should appear in the filtered list");
    }
}
