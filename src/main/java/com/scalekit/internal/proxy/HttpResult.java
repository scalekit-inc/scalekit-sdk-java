package com.scalekit.internal.proxy;

import java.util.List;
import java.util.Map;

/** The status, headers and body of an HTTP response. Not part of the public API. */
public final class HttpResult {

    final int status;
    final Map<String, List<String>> headers;
    final byte[] body;
    final boolean bodyAvailable;

    /**
     * Creates a result.
     *
     * @param status  the status code
     * @param headers the headers
     * @param body    the body, never null
     */
    public HttpResult(int status, Map<String, List<String>> headers, byte[] body) {
        this(status, headers, body, true);
    }

    /**
     * Creates a result.
     *
     * @param status        the status code
     * @param headers       the headers
     * @param body          the body, never null
     * @param bodyAvailable false when the transport could not read the headers and body
     */
    public HttpResult(int status, Map<String, List<String>> headers, byte[] body, boolean bodyAvailable) {
        this.status = status;
        this.headers = headers;
        this.body = body;
        this.bodyAvailable = bodyAvailable;
    }
}
