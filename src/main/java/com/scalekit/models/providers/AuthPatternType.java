package com.scalekit.models.providers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The authentication method of an {@link AuthPattern}. An extensible enum: values the server adds
 * later are kept as-is, with {@link #known()} returning {@link Known#_UNKNOWN}.
 *
 * @since 2.6.0
 */
public final class AuthPatternType {

    /** OAuth 2.0. The flow collects its own credentials, so the pattern has no fields. */
    public static final AuthPatternType OAUTH = new AuthPatternType("OAUTH");
    /** A bearer token, collected in a field named {@code token}. */
    public static final AuthPatternType BEARER = new AuthPatternType("BEARER");
    /** An API key, collected in a field named {@code api_key}. */
    public static final AuthPatternType API_KEY = new AuthPatternType("API_KEY");
    /** HTTP basic authentication. */
    public static final AuthPatternType BASIC = new AuthPatternType("BASIC");
    /** No credentials; the pattern has no fields. */
    public static final AuthPatternType NO_AUTH = new AuthPatternType("NO_AUTH");

    /**
     * The pattern types this SDK version knows, for use in {@code switch}.
     *
     * @since 2.6.0
     */
    public enum Known {
        /** See {@link AuthPatternType#OAUTH}. */
        OAUTH,
        /** See {@link AuthPatternType#BEARER}. */
        BEARER,
        /** See {@link AuthPatternType#API_KEY}. */
        API_KEY,
        /** See {@link AuthPatternType#BASIC}. */
        BASIC,
        /** See {@link AuthPatternType#NO_AUTH}. */
        NO_AUTH,
        /** A value this SDK version does not know; read {@link AuthPatternType#value()}. */
        _UNKNOWN
    }

    private static final Map<String, AuthPatternType> CONSTANTS;

    static {
        Map<String, AuthPatternType> constants = new HashMap<>();
        for (AuthPatternType type : new AuthPatternType[]{OAUTH, BEARER, API_KEY, BASIC, NO_AUTH}) {
            constants.put(type.value, type);
        }
        CONSTANTS = Collections.unmodifiableMap(constants);
    }

    private final String value;

    private AuthPatternType(String value) {
        this.value = value;
    }

    /**
     * Returns the pattern type for a raw value. Known values return the shared constant.
     *
     * @param value the raw value, for example {@code "API_KEY"}
     * @return the pattern type
     * @throws IllegalArgumentException if {@code value} is null
     */
    public static AuthPatternType of(String value) {
        if (value == null) {
            throw new IllegalArgumentException("value must not be null");
        }
        AuthPatternType constant = CONSTANTS.get(value);
        return constant != null ? constant : new AuthPatternType(value);
    }

    /**
     * Returns the raw value.
     *
     * @return the value, never null
     */
    public String value() {
        return value;
    }

    /**
     * Returns the matching known pattern type.
     *
     * @return the known type, or {@link Known#_UNKNOWN}
     */
    public Known known() {
        if (CONSTANTS.containsKey(value)) {
            return Known.valueOf(value);
        }
        return Known._UNKNOWN;
    }

    @Override
    public boolean equals(Object o) {
        return this == o || (o instanceof AuthPatternType && value.equals(((AuthPatternType) o).value));
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value;
    }
}
