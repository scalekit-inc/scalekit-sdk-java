package com.scalekit.internal.proxy;

import java.io.IOException;

/** Signals that an HTTP exchange did not finish before its deadline. Not part of the public API. */
public final class TransportTimeoutException extends IOException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception.
     *
     * @param message the message
     * @param cause   the cause, or null
     */
    public TransportTimeoutException(String message, Throwable cause) {
        super(message, cause);
    }
}
