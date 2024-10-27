package com.scalekit.webhooks;

import com.scalekit.exceptions.WebHookException;
import lombok.NoArgsConstructor;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.concurrent.TimeUnit;

@NoArgsConstructor
public class ScalekitWebhook implements Webhook {
    private static final String WEBHOOK_SIGNATURE_VERSION = "v1";
    private static final long WEBHOOK_TOLERANCE_IN_SECONDS = 300;

    public boolean verifyWebhookPayload(String secret, Map<String, String> headers, byte[] payload) throws WebHookException {
        String webhookId = headers.get("webhook-id");
        String webhookTimestamp = headers.get("webhook-timestamp");
        String webhookSignature = headers.get("webhook-signature");

        if (webhookId == null || webhookTimestamp == null || webhookSignature == null) {
            throw new WebHookException("Missing required headers");
        }

        String[] secretParts = secret.split("_");
        if (secretParts.length < 2) {
            throw new WebHookException("Invalid secret");
        }

        byte[] secretBytes = Base64.getDecoder().decode(secretParts[1]);
        Date timestamp = verifyTimestamp(webhookTimestamp);

        String data = String.format("%s.%d.%s", webhookId, timestamp.getTime() / 1000, new String(payload));
        String computedSignature = computeSignature(secretBytes, data);

        String[] receivedSignatures = webhookSignature.split(" ");
        for (String versionedSignature : receivedSignatures) {
            String[] signatureParts = versionedSignature.split(",");
            if (signatureParts.length < 2) {
                continue;
            }
            String version = signatureParts[0];
            String signature = signatureParts[1];
            if (!version.equals(WEBHOOK_SIGNATURE_VERSION)) {
                continue;
            }
            if (MessageDigest.isEqual(signature.getBytes(), computedSignature.getBytes())) {
                return true;
            }
        }

        throw new WebHookException("Invalid signature");
    }

    private Date verifyTimestamp(String timestampStr) throws WebHookException {
        Date now = new Date();
        Date timestamp = Date.from(java.time.OffsetDateTime.parse(timestampStr).toInstant());

        long diffInSeconds = TimeUnit.MILLISECONDS.toSeconds(now.getTime() - timestamp.getTime());
        if (diffInSeconds > WEBHOOK_TOLERANCE_IN_SECONDS || diffInSeconds < -WEBHOOK_TOLERANCE_IN_SECONDS) {
            throw new WebHookException("Invalid timestamp");
        }

        return timestamp;
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
