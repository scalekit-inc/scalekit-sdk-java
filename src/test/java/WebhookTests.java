import com.google.type.DateTime;
import com.scalekit.exceptions.WebHookException;
import com.scalekit.webhooks.ScalekitWebhook;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebhookTests {

    private static ScalekitWebhook scalekitWebhook;

    @BeforeAll
    public static void setUp() {
        scalekitWebhook = new ScalekitWebhook();
    }

    @Test
    public void testVerifyWebhookPayload_ValidSignature() throws WebHookException {

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


        Map<String, String> headers = new HashMap<>();
        headers.put("webhook-id", id);
        headers.put("webhook-timestamp",timeStampString);
        headers.put("webhook-signature", "v1,"+computedSignature);

        boolean result = scalekitWebhook.verifyWebhookPayload(secretVal, headers, payload.getBytes());
        assertTrue(result);
    }

    @Test
    public void testVerifyWebhookPayload_InvalidTimeStamp() throws WebHookException {

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


        Map<String, String> headers = new HashMap<>();
        headers.put("webhook-id", id);
        headers.put("webhook-timestamp",timeStampString);
        headers.put("webhook-signature", "v1,"+computedSignature);


        try {
            boolean result = scalekitWebhook.verifyWebhookPayload(secretVal, headers, payload.getBytes());
        }
        catch (WebHookException e) {
            assertTrue(e.getMessage().contains("Invalid timestamp"));
        }

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
