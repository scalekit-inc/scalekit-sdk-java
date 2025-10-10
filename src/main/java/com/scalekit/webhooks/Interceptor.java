package com.scalekit.webhooks;

import com.scalekit.exceptions.WebHookException;

import java.util.Map;

public interface Interceptor {
    boolean verifyInterceptorPayload(String secret, Map<String, String> headers, byte[] payload) throws WebHookException;
}
