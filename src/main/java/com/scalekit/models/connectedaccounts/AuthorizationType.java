package com.scalekit.models.connectedaccounts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * How a connected account authenticates to the upstream service. An extensible enum: values the
 * server adds later are kept as-is, with {@link #known()} returning {@link Known#_UNKNOWN}.
 *
 * @since 2.6.0
 */
public final class AuthorizationType {

    /** OAuth 2.0 on behalf of a user. */
    public static final AuthorizationType OAUTH = new AuthorizationType("OAUTH");
    /** An API key. */
    public static final AuthorizationType API_KEY = new AuthorizationType("API_KEY");
    /** HTTP basic authentication. */
    public static final AuthorizationType BASIC_AUTH = new AuthorizationType("BASIC_AUTH");
    /** A bearer token. */
    public static final AuthorizationType BEARER_TOKEN = new AuthorizationType("BEARER_TOKEN");
    /** A custom scheme. */
    public static final AuthorizationType CUSTOM = new AuthorizationType("CUSTOM");
    /** HTTP basic authentication. */
    public static final AuthorizationType BASIC = new AuthorizationType("BASIC");
    /** OAuth 2.0 client credentials (machine to machine). */
    public static final AuthorizationType OAUTH_M2M = new AuthorizationType("OAUTH_M2M");
    /** OAuth 1.0a as used by Trello. */
    public static final AuthorizationType TRELLO_OAUTH1 = new AuthorizationType("TRELLO_OAUTH1");
    /** Google Workspace domain-wide delegation. */
    public static final AuthorizationType GOOGLE_DWD = new AuthorizationType("GOOGLE_DWD");
    /** Credentials from a trusted identity provider. */
    public static final AuthorizationType TRUSTED_IDP = new AuthorizationType("TRUSTED_IDP");
    /** SMART on FHIR. */
    public static final AuthorizationType SMART_FHIR = new AuthorizationType("SMART_FHIR");
    /** No credentials are needed. */
    public static final AuthorizationType NO_AUTH = new AuthorizationType("NO_AUTH");

    /**
     * The authorization types this SDK version knows, for use in {@code switch}.
     *
     * @since 2.6.0
     */
    public enum Known {
        /** See {@link AuthorizationType#OAUTH}. */
        OAUTH,
        /** See {@link AuthorizationType#API_KEY}. */
        API_KEY,
        /** See {@link AuthorizationType#BASIC_AUTH}. */
        BASIC_AUTH,
        /** See {@link AuthorizationType#BEARER_TOKEN}. */
        BEARER_TOKEN,
        /** See {@link AuthorizationType#CUSTOM}. */
        CUSTOM,
        /** See {@link AuthorizationType#BASIC}. */
        BASIC,
        /** See {@link AuthorizationType#OAUTH_M2M}. */
        OAUTH_M2M,
        /** See {@link AuthorizationType#TRELLO_OAUTH1}. */
        TRELLO_OAUTH1,
        /** See {@link AuthorizationType#GOOGLE_DWD}. */
        GOOGLE_DWD,
        /** See {@link AuthorizationType#TRUSTED_IDP}. */
        TRUSTED_IDP,
        /** See {@link AuthorizationType#SMART_FHIR}. */
        SMART_FHIR,
        /** See {@link AuthorizationType#NO_AUTH}. */
        NO_AUTH,
        /** A value this SDK version does not know; read {@link AuthorizationType#value()}. */
        _UNKNOWN
    }

    private static final Map<String, AuthorizationType> CONSTANTS;
    private static final Map<String, Known> KNOWN;

    static {
        Map<String, AuthorizationType> constants = new HashMap<>();
        for (AuthorizationType type : new AuthorizationType[]{OAUTH, API_KEY, BASIC_AUTH, BEARER_TOKEN, CUSTOM, BASIC,
                OAUTH_M2M, TRELLO_OAUTH1, GOOGLE_DWD, TRUSTED_IDP, SMART_FHIR, NO_AUTH}) {
            constants.put(type.value, type);
        }
        CONSTANTS = Collections.unmodifiableMap(constants);
        Map<String, Known> known = new HashMap<>();
        for (Known value : Known.values()) {
            if (value != Known._UNKNOWN) {
                known.put(value.name(), value);
            }
        }
        KNOWN = Collections.unmodifiableMap(known);
    }

    private final String value;

    private AuthorizationType(String value) {
        this.value = value;
    }

    /**
     * Returns the authorization type for a raw value. Known values return the shared constant.
     *
     * @param value the raw value, for example {@code "OAUTH"}
     * @return the authorization type
     * @throws IllegalArgumentException if {@code value} is null
     */
    public static AuthorizationType of(String value) {
        if (value == null) {
            throw new IllegalArgumentException("value must not be null");
        }
        AuthorizationType constant = CONSTANTS.get(value);
        return constant != null ? constant : new AuthorizationType(value);
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
     * Returns the matching known authorization type.
     *
     * @return the known type, or {@link Known#_UNKNOWN}
     */
    public Known known() {
        Known known = KNOWN.get(value);
        return known != null ? known : Known._UNKNOWN;
    }

    @Override
    public boolean equals(Object o) {
        return this == o || (o instanceof AuthorizationType && value.equals(((AuthorizationType) o).value));
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
