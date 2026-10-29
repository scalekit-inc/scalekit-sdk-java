package com.scalekit.internal.proxy;

import java.net.URI;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/** One HTTP exchange to send. Not part of the public API. */
public final class HttpCall {

    final String method;
    final URI uri;
    final List<Map.Entry<String, String>> headers;
    final byte[] body;
    final Duration timeout;

    /**
     * Creates a call.
     *
     * @param method  the HTTP method, upper-case
     * @param uri     the absolute URI
     * @param headers the headers, in order
     * @param body    the body, or null for none
     * @param timeout the positive deadline
     */
    public HttpCall(String method, URI uri, List<Map.Entry<String, String>> headers, byte[] body, Duration timeout) {
        this.method = method;
        this.uri = uri;
        this.headers = Collections.unmodifiableList(headers);
        this.body = body;
        this.timeout = timeout;
    }
}
