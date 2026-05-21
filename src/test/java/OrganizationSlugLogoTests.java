
import com.scalekit.ScalekitClient;
import com.scalekit.grpc.scalekit.v1.organizations.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class OrganizationSlugLogoTests {

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
                .setDisplayName("Slug Logo Test Org")
                .setExternalId(UUID.randomUUID().toString().substring(0, 10))
                .build();
        return client.organizations().create(create);
    }

    private static final String PUBLIC_LOGO_URL = "https://logo.debounce.com/microsoft.com";

    @Test
    void testCreateWithLogoUrl() {
        CreateOrganization create = CreateOrganization.newBuilder()
                .setDisplayName("Logo URL Test Org")
                .setExternalId(UUID.randomUUID().toString().substring(0, 10))
                .setLogoUrl(PUBLIC_LOGO_URL)
                .build();

        Organization org = client.organizations().create(create);
        try {
            assertNotNull(org);
            assertNotNull(org.getId());
            assertEquals(PUBLIC_LOGO_URL, org.getLogoUrl());

            Organization fetched = client.organizations().getById(org.getId());
            assertNotNull(fetched);
            assertEquals(PUBLIC_LOGO_URL, fetched.getLogoUrl());
            log.info("Created org {} with logoUrl={}", org.getId(), org.getLogoUrl());
        } finally {
            client.organizations().deleteById(org.getId());
        }
    }

    @Test
    void testCreateWithSlug() {
        String slug = "auth.megasoft.com";
        CreateOrganization create = CreateOrganization.newBuilder()
                .setDisplayName("Slug Test Org")
                .setExternalId(UUID.randomUUID().toString().substring(0, 10))
                .setSlug(slug)
                .build();

        Organization org = client.organizations().create(create);
        try {
            assertNotNull(org);
            assertNotNull(org.getId());
            assertEquals(slug, org.getSlug());

            Organization fetched = client.organizations().getById(org.getId());
            assertNotNull(fetched);
            assertEquals(slug, fetched.getSlug());
            log.info("Created org {} with slug={}", org.getId(), org.getSlug());
        } finally {
            client.organizations().deleteById(org.getId());
        }
    }

    @Test
    void testUpdateLogoUrl() {
        Organization org = createTestOrg();
        try {
            Organization updated = client.organizations().updateById(
                    org.getId(),
                    UpdateOrganization.newBuilder()
                            .setLogoUrl(PUBLIC_LOGO_URL)
                            .build()
            );

            assertNotNull(updated);
            assertEquals(org.getId(), updated.getId());
            assertEquals(PUBLIC_LOGO_URL, updated.getLogoUrl());

            Organization fetched = client.organizations().getById(org.getId());
            assertNotNull(fetched);
            assertEquals(PUBLIC_LOGO_URL, fetched.getLogoUrl());
            log.info("Updated org {} logoUrl={}", updated.getId(), updated.getLogoUrl());
        } finally {
            client.organizations().deleteById(org.getId());
        }
    }

    @Test
    void testUpdateSlugAndMetadata() {
        Organization org = createTestOrg();
        try {
            String slug = "auth.megasoft.com";
            Organization updated = client.organizations().updateById(
                    org.getId(),
                    UpdateOrganization.newBuilder()
                            .setSlug(slug)
                            .putMetadata("custom_domain", "auth.megasoft.com")
                            .build()
            );

            assertNotNull(updated);
            assertEquals(org.getId(), updated.getId());
            assertEquals(slug, updated.getSlug());
            assertEquals("auth.megasoft.com", updated.getMetadataMap().get("custom_domain"));

            Organization fetched = client.organizations().getById(org.getId());
            assertNotNull(fetched);
            assertEquals(slug, fetched.getSlug());
            assertEquals("auth.megasoft.com", fetched.getMetadataMap().get("custom_domain"));
            log.info("Updated org {} slug={} metadata={}", updated.getId(), updated.getSlug(), updated.getMetadataMap());
        } finally {
            client.organizations().deleteById(org.getId());
        }
    }
}
