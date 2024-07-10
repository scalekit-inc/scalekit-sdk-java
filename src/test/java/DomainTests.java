import com.scalekit.ScalekitClient;
import com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.Operation;
import com.scalekit.grpc.scalekit.v1.domains.Domain;
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
        String domainName = UUID.randomUUID().toString().substring(0,10);
        Domain domain = client.domains().createDomain("org_26441296998563842", domainName);
        Assertions.assertEquals(domainName, domain.getDomain());

        List<Domain> retrievedDomain = client.domains().listDomainsByOrganizationId("org_26441296998563842");
        Assertions.assertFalse(retrievedDomain.isEmpty());


        Domain retrievedDomainById = client.domains().getDomainById("org_26441296998563842", domain.getId());
        Assertions.assertEquals(domain.getId(), retrievedDomainById.getId());

    }
}
