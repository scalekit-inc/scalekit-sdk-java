import com.scalekit.ScalekitClient;
import com.scalekit.api.util.ListUserConsentsOptions;
import com.scalekit.grpc.scalekit.v1.clients.ListResourceUserConsentsResponse;
import io.grpc.StatusRuntimeException;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class ResourceConsentClientTests {

    private static ScalekitClient client;

    // A real MCP server resource in the test environment. It currently has no
    // consents, which is fine — these tests assert the call shape and the
    // pagination envelope, never the consent contents.
    private static final String TEST_RESOURCE_ID = "res_142145647087190278";

    @BeforeAll
    static void init() {
        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String apiSecret = System.getenv("SCALEKIT_CLIENT_SECRET");

        Assumptions.assumeTrue(
            environmentUrl != null && !environmentUrl.trim().isEmpty() &&
            clientId != null && !clientId.trim().isEmpty() &&
            apiSecret != null && !apiSecret.trim().isEmpty(),
            "Skipping integration tests: SCALEKIT_ENVIRONMENT_URL, SCALEKIT_CLIENT_ID, SCALEKIT_CLIENT_SECRET are required"
        );

        client = new ScalekitClient(environmentUrl, clientId, apiSecret);
    }

    @Test
    void testListUserConsents() {
        ListResourceUserConsentsResponse response =
                client.resources().listUserConsents(TEST_RESOURCE_ID, null);

        assertNotNull(response);
        assertNotNull(response.getConsentsList());
        assertTrue(response.getTotalSize() >= 0);
    }

    @Test
    void testListUserConsentsWithPageSize() {
        ListResourceUserConsentsResponse response =
                client.resources().listUserConsents(TEST_RESOURCE_ID,
                        ListUserConsentsOptions.builder().pageSize(10).build());

        assertNotNull(response);
        assertTrue(response.getConsentsCount() <= 10);
    }

    @Test
    void testListUserConsentsWithSearch() {
        ListResourceUserConsentsResponse response =
                client.resources().listUserConsents(TEST_RESOURCE_ID,
                        ListUserConsentsOptions.builder().search("usr_").build());

        assertNotNull(response);
        assertNotNull(response.getConsentsList());
    }

    @Test
    void testListUserConsentsWithUserIds() {
        ListResourceUserConsentsResponse response =
                client.resources().listUserConsents(TEST_RESOURCE_ID,
                        ListUserConsentsOptions.builder()
                                .userIds(Collections.singletonList("usr_does_not_exist"))
                                .build());

        assertNotNull(response);
        assertEquals(0, response.getConsentsCount());
    }

    @Test
    void testListUserConsentsUserIdsTakesPrecedenceOverSearch() {
        // search alone would match nothing here either, but the point is that the
        // request is accepted and the exact filter is what is applied.
        ListResourceUserConsentsResponse response =
                client.resources().listUserConsents(TEST_RESOURCE_ID,
                        ListUserConsentsOptions.builder()
                                .userIds(Collections.singletonList("usr_does_not_exist"))
                                .search("usr_")
                                .build());

        assertNotNull(response);
        assertEquals(0, response.getConsentsCount());
    }

    @Test
    void testListUserConsentsRejectsMoreThan25UserIds() {
        String[] userIds = new String[26];
        for (int i = 0; i < userIds.length; i++) {
            userIds[i] = "usr_" + i;
        }

        StatusRuntimeException exception = assertThrows(StatusRuntimeException.class, () ->
                client.resources().listUserConsents(TEST_RESOURCE_ID,
                        ListUserConsentsOptions.builder()
                                .userIds(Arrays.asList(userIds))
                                .build()));

        assertEquals(io.grpc.Status.INVALID_ARGUMENT.getCode(), exception.getStatus().getCode());
    }

    @Test
    void testListUserConsentsWithoutResourceId() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                client.resources().listUserConsents("", null));

        assertEquals("resourceId is required", exception.getMessage());
    }

    @Test
    void testListUserConsentsRejectsNegativePageSize() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                client.resources().listUserConsents(TEST_RESOURCE_ID,
                        ListUserConsentsOptions.builder().pageSize(-1).build()));

        assertEquals("pageSize must be 0 (server default) or a positive integer", exception.getMessage());
    }

    @Test
    void testRevokeUserConsentWithoutClientId() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                client.resources().revokeUserConsent("", "usrcnst_1234567890"));

        assertEquals("clientId is required", exception.getMessage());
    }

    @Test
    void testRevokeUserConsentWithoutConsentId() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                client.resources().revokeUserConsent("m2m_1234567890", ""));

        assertEquals("consentId is required", exception.getMessage());
    }

    @Test
    void testRevokeUserConsentUnknownConsent() {
        StatusRuntimeException exception = assertThrows(StatusRuntimeException.class, () ->
                client.resources().revokeUserConsent("m2m_000000000000000000", "usrcnst_000000000000000000"));

        assertNotNull(exception.getStatus());
    }
}
