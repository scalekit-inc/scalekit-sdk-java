package com.scalekit.webhooks;

import com.scalekit.exceptions.WebHookException;

import java.util.Map;

public interface Webhook {
    boolean verifyWebhookPayload(String secret, Map<String, String> headers, byte[] payload) throws WebHookException;
}
