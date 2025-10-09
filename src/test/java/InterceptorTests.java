import com.scalekit.exceptions.WebHookException;
import com.scalekit.webhooks.ScalekitInterceptor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InterceptorTests {

    private static ScalekitInterceptor scalekitInterceptor;

    @BeforeAll
    public static void setUp() {
        scalekitInterceptor = new ScalekitInterceptor();
    }

    @Test
    public void testVerifyInterceptorPayload_ValidSignature() throws WebHookException {
        String secret = "9vx5xtFNxQMZFcjLLGporL6TGkcSRNHb";
        String secretPrefix = "whsec";
        String secretVal = String.format("%s_%s", secretPrefix, secret);
        String id = "msg_2o3NaedIm6pL62OQ544VzM1cIYo";
        String payload = "{\"data\":{\"external_id\":null,\"id\":\"org_43666332410970707\",\"metadata\":null,\"name\":\"AMK\",\"region\":\"us\",\"settings\":{\"domain_capture_required\":false,\"features\":[{\"enabled\":true,\"name\":\"sso\"},{\"enabled\":false,\"name\":\"dir_sync\"},{\"enabled\":false,\"name\":\"gbra\"}]},\"updated_at\":\"2024-10-28T05:46:02.322200192Z\"},\"environment_id\":\"env_26602260712653095\",\"id\":\"evt_43666332427747923\",\"object\":\"Organization\",\"occurred_at\":\"2024-10-28T05:46:02.332510521Z\",\"organization_id\":\"org_43666332410970707\",\"spec_version\":\"1\",\"type\":\"scalekit.org.create\"}";
        long currentEpochTime = Instant.now().getEpochSecond();
        String timeStampString = String.valueOf(currentEpochTime);

        Date timestamp = new Date(currentEpochTime * 1000);
        String data = String.format("%s.%d.%s", id, timestamp.getTime() / 1000, payload);
        byte[] secretBytes = Base64.getDecoder().decode(secret);
        String computedSignature = computeSignature(secretBytes, data);

        // Use interceptor headers instead of webhook headers
        Map<String, String> headers = new HashMap<>();
        headers.put("interceptor-id", id);
        headers.put("interceptor-timestamp", timeStampString);
        headers.put("interceptor-signature", "v1," + computedSignature);

        boolean result = scalekitInterceptor.verifyInterceptorPayload(secretVal, headers, payload.getBytes());
        assertTrue(result);
    }

    @Test
    public void testVerifyInterceptorPayload_InvalidTimeStamp() {
        String secret = "9vx5xtFNxQMZFcjLLGporL6TGkcSRNHb";
        String secretPrefix = "whsec";
        String secretVal = String.format("%s_%s", secretPrefix, secret);
        String id = "msg_2o3NaedIm6pL62OQ544VzM1cIYo";
        String payload = "{\"data\":{\"external_id\":null,\"id\":\"org_43666332410970707\",\"metadata\":null,\"name\":\"AMK\",\"region\":\"us\",\"settings\":{\"domain_capture_required\":false,\"features\":[{\"enabled\":true,\"name\":\"sso\"},{\"enabled\":false,\"name\":\"dir_sync\"},{\"enabled\":false,\"name\":\"gbra\"}]},\"updated_at\":\"2024-10-28T05:46:02.322200192Z\"},\"environment_id\":\"env_26602260712653095\",\"id\":\"evt_43666332427747923\",\"object\":\"Organization\",\"occurred_at\":\"2024-10-28T05:46:02.332510521Z\",\"organization_id\":\"org_43666332410970707\",\"spec_version\":\"1\",\"type\":\"scalekit.org.create\"}";
        long currentEpochTime = Instant.now().minus(10, java.time.temporal.ChronoUnit.DAYS).getEpochSecond();
        String timeStampString = String.valueOf(currentEpochTime);

        Date timestamp = new Date(currentEpochTime * 1000);
        String data = String.format("%s.%d.%s", id, timestamp.getTime() / 1000, payload);
        byte[] secretBytes = Base64.getDecoder().decode(secret);
        String computedSignature = computeSignature(secretBytes, data);

        // Use interceptor headers instead of webhook headers
        Map<String, String> headers = new HashMap<>();
        headers.put("interceptor-id", id);
        headers.put("interceptor-timestamp", timeStampString);
        headers.put("interceptor-signature", "v1," + computedSignature);

        WebHookException exception = assertThrows(WebHookException.class, () -> {
            scalekitInterceptor.verifyInterceptorPayload(secretVal, headers, payload.getBytes());
        });
        assertTrue(exception.getMessage().contains("Invalid timestamp"));
    }

    @Test
    public void testVerifyInterceptorPayload_MissingHeaders() {
        String secret = "9vx5xtFNxQMZFcjLLGporL6TGkcSRNHb";
        String secretPrefix = "whsec";
        String secretVal = String.format("%s_%s", secretPrefix, secret);
        String payload = "{\"test\":\"payload\"}";

        Map<String, String> headers = new HashMap<>();
        // Missing required interceptor headers

        WebHookException exception = assertThrows(WebHookException.class, () -> {
            scalekitInterceptor.verifyInterceptorPayload(secretVal, headers, payload.getBytes());
        });
        assertTrue(exception.getMessage().contains("Missing required headers"));
    }

    @Test
    public void testVerifyInterceptorPayload_InvalidSecret() {
        String secret = "invalid_secret";
        String payload = "{\"test\":\"payload\"}";

        Map<String, String> headers = new HashMap<>();
        headers.put("interceptor-id", "test_id");
        headers.put("interceptor-timestamp", String.valueOf(Instant.now().getEpochSecond()));
        headers.put("interceptor-signature", "v1,invalid_signature");

        WebHookException exception = assertThrows(WebHookException.class, () -> {
            scalekitInterceptor.verifyInterceptorPayload(secret, headers, payload.getBytes());
        });
        assertTrue(exception.getMessage().contains("Invalid secret"));
    }

    @Test
    public void testVerifyInterceptorPayload_HeaderMapping() throws WebHookException {
        String secret = "9vx5xtFNxQMZFcjLLGporL6TGkcSRNHb";
        String secretPrefix = "whsec";
        String secretVal = String.format("%s_%s", secretPrefix, secret);
        String id = "msg_test123";
        String payload = "{\"test\":\"interceptor_payload\"}";
        long currentEpochTime = Instant.now().getEpochSecond();
        String timeStampString = String.valueOf(currentEpochTime);

        Date timestamp = new Date(currentEpochTime * 1000);
        String data = String.format("%s.%d.%s", id, timestamp.getTime() / 1000, payload);
        byte[] secretBytes = Base64.getDecoder().decode(secret);
        String computedSignature = computeSignature(secretBytes, data);

        // Test with interceptor headers and additional custom headers
        Map<String, String> headers = new HashMap<>();
        headers.put("interceptor-id", id);
        headers.put("interceptor-timestamp", timeStampString);
        headers.put("interceptor-signature", "v1," + computedSignature);
        headers.put("custom-header", "custom-value");
        headers.put("content-type", "application/json");

        boolean result = scalekitInterceptor.verifyInterceptorPayload(secretVal, headers, payload.getBytes());
        assertTrue(result);
    }

    private String computeSignature(byte[] secret, String data) throws WebHookException {
        try {
            Mac hmac = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKey = new SecretKeySpec(secret, "HmacSHA256");
            hmac.init(secretKey);
            byte[] hash = hmac.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(hash);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new WebHookException("Invalid secret");
        }
    }
}