package com.scalekit.models.connections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Whose credentials an app connection's accounts hold. An extensible enum: values the server adds later are kept as-is, with
 * {@link #known()} returning {@link Known#_UNKNOWN}.
 *
 * @since 2.6.0
 */
public final class EnvironmentConnectionAuthMode {

    /** Each user connects their own account. */
    public static final EnvironmentConnectionAuthMode USER = new EnvironmentConnectionAuthMode("USER");
    /** One credential is shared by a whole organization. */
    public static final EnvironmentConnectionAuthMode ORG_WIDE = new EnvironmentConnectionAuthMode("ORG_WIDE");

    /**
     * The values this SDK version knows, for use in {@code switch}.
     *
     * @since 2.6.0
     */
    public enum Known {
        /** See {@link EnvironmentConnectionAuthMode#USER}. */
        USER,
        /** See {@link EnvironmentConnectionAuthMode#ORG_WIDE}. */
        ORG_WIDE,
        /** A value this SDK version does not know; read {@link EnvironmentConnectionAuthMode#value()}. */
        _UNKNOWN
    }

    private static final Map<String, EnvironmentConnectionAuthMode> CONSTANTS;

    static {
        Map<String, EnvironmentConnectionAuthMode> constants = new HashMap<>();
        for (EnvironmentConnectionAuthMode constant : new EnvironmentConnectionAuthMode[]{USER, ORG_WIDE}) {
            constants.put(constant.value, constant);
        }
        CONSTANTS = Collections.unmodifiableMap(constants);
    }

    private final String value;

    private EnvironmentConnectionAuthMode(String value) {
        this.value = value;
    }

    /**
     * Returns the value for a raw string. Known values return the shared constant.
     *
     * @param value the raw value
     * @return the value
     * @throws IllegalArgumentException if {@code value} is null
     */
    public static EnvironmentConnectionAuthMode of(String value) {
        if (value == null) {
            throw new IllegalArgumentException("value must not be null");
        }
        EnvironmentConnectionAuthMode constant = CONSTANTS.get(value);
        return constant != null ? constant : new EnvironmentConnectionAuthMode(value);
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
        return this == o || (o instanceof EnvironmentConnectionAuthMode && value.equals(((EnvironmentConnectionAuthMode) o).value));
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
