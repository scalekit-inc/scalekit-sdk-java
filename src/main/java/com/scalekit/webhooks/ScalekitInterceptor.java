package com.scalekit.webhooks;

import com.scalekit.exceptions.WebHookException;
import lombok.NoArgsConstructor;

import java.util.Map;

@NoArgsConstructor
public class ScalekitInterceptor extends ScalekitWebhook implements Interceptor {
    
    @Override
    public boolean verifyInterceptorPayload(String secret, Map<String, String> headers, byte[] payload) throws WebHookException {
        return verifyPayloadSignature(secret, headers.get("interceptor-id"), headers.get("interceptor-timestamp"), headers.get("interceptor-signature"), payload);
    }
}
