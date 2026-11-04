package com.scalekit.internal;

/**
 * Formats secret values for {@code toString()} without revealing them. Not part of the public API.
 */
public final class Redaction {

    /** The placeholder printed instead of a secret. */
    public static final String REDACTED = "<redacted>";

    private Redaction() {
    }

    /**
     * Returns the placeholder for a set secret, or null for an absent one.
     *
     * @param value the secret
     * @return {@link #REDACTED} or null
     */
    public static String secret(Object value) {
        return value == null ? null : REDACTED;
    }
}
