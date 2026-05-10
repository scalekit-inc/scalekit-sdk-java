
import com.google.protobuf.BoolValue;
import com.google.protobuf.Int32Value;
import com.scalekit.ScalekitClient;
import com.scalekit.grpc.scalekit.v1.commons.Commons;
import com.scalekit.grpc.scalekit.v1.organizations.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class OrganizationSessionPolicyTests {

    private static ScalekitClient client;

    @BeforeAll
    static void init() {
        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String apiSecret = System.getenv("SCALEKIT_CLIENT_SECRET");
        client = new ScalekitClient(environmentUrl, clientId, apiSecret);
    }

    private Organization createTestOrg() {
        CreateOrganization create = CreateOrganization.newBuilder()
                .setDisplayName("Session Policy Test Org")
                .setExternalId(UUID.randomUUID().toString().substring(0, 10))
                .build();
        return client.organizations().create(create);
    }

    @Test
    void testGetDefaultPolicy() {
        Organization org = createTestOrg();
        try {
            OrganizationSessionPolicySettings policy =
                    client.organizations().getOrganizationSessionPolicy(org.getId());

            assertNotNull(policy);
            assertEquals(SessionPolicyType.APPLICATION, policy.getPolicySource());
        } finally {
            client.organizations().deleteById(org.getId());
        }
    }

    @Test
    void testSetCustomPolicy() {
        Organization org = createTestOrg();
        try {
            OrganizationSessionPolicySettings policyInput = OrganizationSessionPolicySettings.newBuilder()
                    .setPolicySource(SessionPolicyType.CUSTOM)
                    .setAbsoluteSessionTimeout(Int32Value.newBuilder().setValue(360).build())
                    .setAbsoluteSessionTimeoutUnit(Commons.TimeUnit.MINUTES)
                    .setIdleSessionTimeoutEnabled(BoolValue.newBuilder().setValue(true).build())
                    .setIdleSessionTimeout(Int32Value.newBuilder().setValue(60).build())
                    .setIdleSessionTimeoutUnit(Commons.TimeUnit.MINUTES)
                    .build();

            OrganizationSessionPolicySettings updated =
                    client.organizations().updateOrganizationSessionPolicy(org.getId(), policyInput);

            assertNotNull(updated);
            assertEquals(SessionPolicyType.CUSTOM, updated.getPolicySource());

            OrganizationSessionPolicySettings fetched =
                    client.organizations().getOrganizationSessionPolicy(org.getId());

            assertEquals(SessionPolicyType.CUSTOM, fetched.getPolicySource());
            assertTrue(fetched.hasAbsoluteSessionTimeout());
            assertEquals(360, fetched.getAbsoluteSessionTimeout().getValue());
            assertTrue(fetched.hasIdleSessionTimeoutEnabled());
            assertTrue(fetched.getIdleSessionTimeoutEnabled().getValue());
        } finally {
            client.organizations().deleteById(org.getId());
        }
    }

    @Test
    void testRevertToApplicationPolicy() {
        Organization org = createTestOrg();
        try {
            OrganizationSessionPolicySettings customPolicy = OrganizationSessionPolicySettings.newBuilder()
                    .setPolicySource(SessionPolicyType.CUSTOM)
                    .setAbsoluteSessionTimeout(Int32Value.newBuilder().setValue(120).build())
                    .setAbsoluteSessionTimeoutUnit(Commons.TimeUnit.MINUTES)
                    .build();
            client.organizations().updateOrganizationSessionPolicy(org.getId(), customPolicy);

            OrganizationSessionPolicySettings revertPolicy = OrganizationSessionPolicySettings.newBuilder()
                    .setPolicySource(SessionPolicyType.APPLICATION)
                    .build();
            OrganizationSessionPolicySettings reverted =
                    client.organizations().updateOrganizationSessionPolicy(org.getId(), revertPolicy);

            assertNotNull(reverted);
            assertEquals(SessionPolicyType.APPLICATION, reverted.getPolicySource());
        } finally {
            client.organizations().deleteById(org.getId());
        }
    }

    @Test
    void testSetIdleTimeoutDisabled() {
        Organization org = createTestOrg();
        try {
            OrganizationSessionPolicySettings policyInput = OrganizationSessionPolicySettings.newBuilder()
                    .setPolicySource(SessionPolicyType.CUSTOM)
                    .setAbsoluteSessionTimeout(Int32Value.newBuilder().setValue(480).build())
                    .setAbsoluteSessionTimeoutUnit(Commons.TimeUnit.MINUTES)
                    .setIdleSessionTimeoutEnabled(BoolValue.newBuilder().setValue(false).build())
                    .build();

            OrganizationSessionPolicySettings updated =
                    client.organizations().updateOrganizationSessionPolicy(org.getId(), policyInput);

            assertNotNull(updated);
            assertEquals(SessionPolicyType.CUSTOM, updated.getPolicySource());

            OrganizationSessionPolicySettings fetched =
                    client.organizations().getOrganizationSessionPolicy(org.getId());

            assertTrue(fetched.hasIdleSessionTimeoutEnabled());
            assertFalse(fetched.getIdleSessionTimeoutEnabled().getValue());
        } finally {
            client.organizations().deleteById(org.getId());
        }
    }
}
