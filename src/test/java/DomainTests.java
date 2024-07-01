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
        client = new ScalekitClient("gmail-dev.scalekit.cloud",
                "skc_13388706786312310",
                "test_DdFtAfDceJQeQ5aLj4afSgdyrZeqAir8tbRGeIKxkgcwNitgov7q3GtExe4p2Aek");
    }

    @Test
    public void DomainTest(){
        String domainName = UUID.randomUUID().toString().substring(0,10);
        Domain domain = client.Domains().CreateDomain("org_26441296998563842", domainName);
        Assertions.assertEquals(domainName, domain.getDomain());

        List<Domain> retrievedDomain = client.Domains().ListDomainsByOrganizationId("org_26441296998563842");
        Assertions.assertFalse(retrievedDomain.isEmpty());


        Domain retrievedDomainById = client.Domains().GetDomainById("org_26441296998563842", domain.getId());
        Assertions.assertEquals(domain.getId(), retrievedDomainById.getId());

    }
}
