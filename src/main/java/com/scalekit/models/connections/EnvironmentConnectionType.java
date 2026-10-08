package com.scalekit.models.connections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * How an environment connection authenticates. An extensible enum: values the server adds later are kept as-is, with
 * {@link #known()} returning {@link Known#_UNKNOWN}.
 *
 * @since 2.6.0
 */
public final class EnvironmentConnectionType {

    /** OpenID Connect. */
    public static final EnvironmentConnectionType OIDC = new EnvironmentConnectionType("OIDC");
    /** SAML. */
    public static final EnvironmentConnectionType SAML = new EnvironmentConnectionType("SAML");
    /** Password. */
    public static final EnvironmentConnectionType PASSWORD = new EnvironmentConnectionType("PASSWORD");
    /** OAuth 2.0. */
    public static final EnvironmentConnectionType OAUTH = new EnvironmentConnectionType("OAUTH");
    /** Passwordless. */
    public static final EnvironmentConnectionType PASSWORDLESS = new EnvironmentConnectionType("PASSWORDLESS");
    /** HTTP basic authentication. */
    public static final EnvironmentConnectionType BASIC = new EnvironmentConnectionType("BASIC");
    /** A bearer token. */
    public static final EnvironmentConnectionType BEARER = new EnvironmentConnectionType("BEARER");
    /** An API key. */
    public static final EnvironmentConnectionType API_KEY = new EnvironmentConnectionType("API_KEY");
    /** WebAuthn. */
    public static final EnvironmentConnectionType WEBAUTHN = new EnvironmentConnectionType("WEBAUTHN");
    /** OAuth 2.0 client credentials. */
    public static final EnvironmentConnectionType OAUTH_M2M = new EnvironmentConnectionType("OAUTH_M2M");
    /** OAuth 1.0a as used by Trello. */
    public static final EnvironmentConnectionType TRELLO_OAUTH1 = new EnvironmentConnectionType("TRELLO_OAUTH1");
    /** Google Workspace domain-wide delegation. */
    public static final EnvironmentConnectionType GOOGLE_DWD = new EnvironmentConnectionType("GOOGLE_DWD");
    /** Credentials from a trusted identity provider. */
    public static final EnvironmentConnectionType TRUSTED_IDP = new EnvironmentConnectionType("TRUSTED_IDP");
    /** SMART on FHIR. */
    public static final EnvironmentConnectionType SMART_FHIR = new EnvironmentConnectionType("SMART_FHIR");
    /** No credentials. */
    public static final EnvironmentConnectionType NO_AUTH = new EnvironmentConnectionType("NO_AUTH");

    /**
     * The values this SDK version knows, for use in {@code switch}.
     *
     * @since 2.6.0
     */
    public enum Known {
        /** See {@link EnvironmentConnectionType#OIDC}. */
        OIDC,
        /** See {@link EnvironmentConnectionType#SAML}. */
        SAML,
        /** See {@link EnvironmentConnectionType#PASSWORD}. */
        PASSWORD,
        /** See {@link EnvironmentConnectionType#OAUTH}. */
        OAUTH,
        /** See {@link EnvironmentConnectionType#PASSWORDLESS}. */
        PASSWORDLESS,
        /** See {@link EnvironmentConnectionType#BASIC}. */
        BASIC,
        /** See {@link EnvironmentConnectionType#BEARER}. */
        BEARER,
        /** See {@link EnvironmentConnectionType#API_KEY}. */
        API_KEY,
        /** See {@link EnvironmentConnectionType#WEBAUTHN}. */
        WEBAUTHN,
        /** See {@link EnvironmentConnectionType#OAUTH_M2M}. */
        OAUTH_M2M,
        /** See {@link EnvironmentConnectionType#TRELLO_OAUTH1}. */
        TRELLO_OAUTH1,
        /** See {@link EnvironmentConnectionType#GOOGLE_DWD}. */
        GOOGLE_DWD,
        /** See {@link EnvironmentConnectionType#TRUSTED_IDP}. */
        TRUSTED_IDP,
        /** See {@link EnvironmentConnectionType#SMART_FHIR}. */
        SMART_FHIR,
        /** See {@link EnvironmentConnectionType#NO_AUTH}. */
        NO_AUTH,
        /** A value this SDK version does not know; read {@link EnvironmentConnectionType#value()}. */
        _UNKNOWN
    }

    private static final Map<String, EnvironmentConnectionType> CONSTANTS;

    static {
        Map<String, EnvironmentConnectionType> constants = new HashMap<>();
        for (EnvironmentConnectionType constant : new EnvironmentConnectionType[]{OIDC, SAML, PASSWORD, OAUTH, PASSWORDLESS, BASIC, BEARER, API_KEY, WEBAUTHN, OAUTH_M2M, TRELLO_OAUTH1, GOOGLE_DWD, TRUSTED_IDP, SMART_FHIR, NO_AUTH}) {
            constants.put(constant.value, constant);
        }
        CONSTANTS = Collections.unmodifiableMap(constants);
    }

    private final String value;

    private EnvironmentConnectionType(String value) {
        this.value = value;
    }

    /**
     * Returns the value for a raw string. Known values return the shared constant.
     *
     * @param value the raw value
     * @return the value
     * @throws IllegalArgumentException if {@code value} is null
     */
    public static EnvironmentConnectionType of(String value) {
        if (value == null) {
            throw new IllegalArgumentException("value must not be null");
        }
        EnvironmentConnectionType constant = CONSTANTS.get(value);
        return constant != null ? constant : new EnvironmentConnectionType(value);
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
     * Returns the matching known value.
     *
     * @return the known value, or {@link Known#_UNKNOWN}
     */
    public Known known() {
        return CONSTANTS.containsKey(value) ? Known.valueOf(value) : Known._UNKNOWN;
    }

    @Override
    public boolean equals(Object o) {
        return this == o || (o instanceof EnvironmentConnectionType && value.equals(((EnvironmentConnectionType) o).value));
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
