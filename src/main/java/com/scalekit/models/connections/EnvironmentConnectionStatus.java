package com.scalekit.models.connections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * How far an environment connection's configuration has progressed. An extensible enum: values the server adds later are kept as-is, with
 * {@link #known()} returning {@link Known#_UNKNOWN}.
 *
 * @since 2.6.0
 */
public final class EnvironmentConnectionStatus {

    /** Created but not configured. */
    public static final EnvironmentConnectionStatus DRAFT = new EnvironmentConnectionStatus("DRAFT");
    /** Partly configured. */
    public static final EnvironmentConnectionStatus IN_PROGRESS = new EnvironmentConnectionStatus("IN_PROGRESS");
    /** Fully configured. */
    public static final EnvironmentConnectionStatus COMPLETED = new EnvironmentConnectionStatus("COMPLETED");

    /**
     * The values this SDK version knows, for use in {@code switch}.
     *
     * @since 2.6.0
     */
    public enum Known {
        /** See {@link EnvironmentConnectionStatus#DRAFT}. */
        DRAFT,
        /** See {@link EnvironmentConnectionStatus#IN_PROGRESS}. */
        IN_PROGRESS,
        /** See {@link EnvironmentConnectionStatus#COMPLETED}. */
        COMPLETED,
        /** A value this SDK version does not know; read {@link EnvironmentConnectionStatus#value()}. */
        _UNKNOWN
    }

    private static final Map<String, EnvironmentConnectionStatus> CONSTANTS;

    static {
        Map<String, EnvironmentConnectionStatus> constants = new HashMap<>();
        for (EnvironmentConnectionStatus constant : new EnvironmentConnectionStatus[]{DRAFT, IN_PROGRESS, COMPLETED}) {
            constants.put(constant.value, constant);
        }
        CONSTANTS = Collections.unmodifiableMap(constants);
    }

    private final String value;

    private EnvironmentConnectionStatus(String value) {
        this.value = value;
    }

    /**
     * Returns the value for a raw string. Known values return the shared constant.
     *
     * @param value the raw value
     * @return the value
     * @throws IllegalArgumentException if {@code value} is null
     */
    public static EnvironmentConnectionStatus of(String value) {
        if (value == null) {
            throw new IllegalArgumentException("value must not be null");
        }
        EnvironmentConnectionStatus constant = CONSTANTS.get(value);
        return constant != null ? constant : new EnvironmentConnectionStatus(value);
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
        return this == o || (o instanceof EnvironmentConnectionStatus && value.equals(((EnvironmentConnectionStatus) o).value));
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
