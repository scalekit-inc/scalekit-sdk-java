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
        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String  clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String apiSecret = System.getenv("SCALEKIT_CLIENT_SECRET");

        client = new ScalekitClient(environmentUrl, clientId, apiSecret);
    }

    @Test
    public void DomainTest(){
        Organization organization  = client.organizations().listOrganizations(10, "").getOrganizationsList().get(0);
        assert organization != null;
        String domainName = UUID.randomUUID().toString().substring(0,10);
        
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
        String domainName = UUID.randomUUID().toString().substring(0, 10);
        
        CreateDomainRequest request = CreateDomainRequest.newBuilder()
                .setOrganizationId(organization.getId())
                .setDomain(CreateDomain.newBuilder()
                        .setDomain(domainName)
                        .setDomainType(DomainType.HOME_REALM_DISCOVERY)
                        .build())
                .build();
        
        Domain domain = client.domains().createDomain(request);
        Assertions.assertEquals(domainName, domain.getDomain());
        Assertions.assertEquals(DomainType.HOME_REALM_DISCOVERY, domain.getDomainType());
    }

    @Test
    public void testCreateDomainWithJitProvisioningDomainType() {
        Organization organization = client.organizations().listOrganizations(10, "").getOrganizationsList().get(0);
        assert organization != null;
        String domainName = UUID.randomUUID().toString().substring(0, 10);
        
        CreateDomainRequest request = CreateDomainRequest.newBuilder()
                .setOrganizationId(organization.getId())
                .setDomain(CreateDomain.newBuilder()
                        .setDomain(domainName)
                        .setDomainType(DomainType.JIT_PROVISIONING_DOMAIN)
                        .build())
                .build();
        
        Domain domain = client.domains().createDomain(request);
        Assertions.assertEquals(domainName, domain.getDomain());
        Assertions.assertEquals(DomainType.JIT_PROVISIONING_DOMAIN, domain.getDomainType());
    }

    @Test
    public void testCreateDomainWithoutDomainType() {
        Organization organization = client.organizations().listOrganizations(10, "").getOrganizationsList().get(0);
        assert organization != null;
        String domainName = UUID.randomUUID().toString().substring(0, 10);
        
        CreateDomainRequest request = CreateDomainRequest.newBuilder()
                .setOrganizationId(organization.getId())
                .setDomain(CreateDomain.newBuilder()
                        .setDomain(domainName)
                        .build())
                .build();
        
        Domain domain = client.domains().createDomain(request);
        Assertions.assertEquals(domainName, domain.getDomain());
        // When domainType is not specified, it should default to DOMAIN_TYPE_UNSPECIFIED
        Assertions.assertEquals(DomainType.DOMAIN_TYPE_UNSPECIFIED, domain.getDomainType());
    }
}
