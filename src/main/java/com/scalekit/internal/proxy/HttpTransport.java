package com.scalekit.internal.proxy;

import java.io.IOException;

/** Sends one HTTP exchange; implementations never follow redirects. Not part of the public API. */
public interface HttpTransport {

    /**
     * Returns whether this transport can send a method on this runtime.
     *
     * @param method the HTTP method, upper-case
     * @return true when {@link #send} accepts it
     */
    boolean supportsMethod(String method);

    /**
     * Sends a call and reads the whole response.
     *
     * @param call the call
     * @return the response
     * @throws TransportTimeoutException if the deadline passes
     * @throws IOException               if the exchange fails
     * @throws InterruptedException      if the thread is interrupted while waiting
     */
    HttpResult send(HttpCall call) throws IOException, InterruptedException;
}
