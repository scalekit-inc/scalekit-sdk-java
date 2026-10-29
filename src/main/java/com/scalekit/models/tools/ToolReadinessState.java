package com.scalekit.models.tools;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Whether a user can run a searched tool through one connection. An extensible enum: values the
 * server adds later are kept as-is, with {@link #known()} returning {@link Known#_UNKNOWN}.
 *
 * @since 2.6.0
 */
public final class ToolReadinessState {

    /** Readiness was not evaluated, because the search did not name an identifier. */
    public static final ToolReadinessState NOT_EVALUATED = new ToolReadinessState("NOT_EVALUATED");
    /** The user has an active account on the connection; the tool can run. */
    public static final ToolReadinessState READY = new ToolReadinessState("READY");
    /** The user has no account on the connection yet. */
    public static final ToolReadinessState NEEDS_CONNECTION = new ToolReadinessState("NEEDS_CONNECTION");
    /** The user's account must be authorized again. */
    public static final ToolReadinessState NEEDS_REAUTH = new ToolReadinessState("NEEDS_REAUTH");

    /**
     * The readiness states this SDK version knows, for use in {@code switch}.
     *
     * @since 2.6.0
     */
    public enum Known {
        /** See {@link ToolReadinessState#NOT_EVALUATED}. */
        NOT_EVALUATED,
        /** See {@link ToolReadinessState#READY}. */
        READY,
        /** See {@link ToolReadinessState#NEEDS_CONNECTION}. */
        NEEDS_CONNECTION,
        /** See {@link ToolReadinessState#NEEDS_REAUTH}. */
        NEEDS_REAUTH,
        /** A value this SDK version does not know; read {@link ToolReadinessState#value()}. */
        _UNKNOWN
    }

    private static final Map<String, ToolReadinessState> CONSTANTS;

    static {
        Map<String, ToolReadinessState> constants = new HashMap<>();
        for (ToolReadinessState state : new ToolReadinessState[]{NOT_EVALUATED, READY, NEEDS_CONNECTION, NEEDS_REAUTH}) {
            constants.put(state.value, state);
        }
        CONSTANTS = Collections.unmodifiableMap(constants);
    }

    private final String value;

    private ToolReadinessState(String value) {
        this.value = value;
    }

    /**
     * Returns the state for a raw value. Known values return the shared constant.
     *
     * @param value the raw value, for example {@code "READY"}
     * @return the state
     * @throws IllegalArgumentException if {@code value} is null
     */
    public static ToolReadinessState of(String value) {
        if (value == null) {
            throw new IllegalArgumentException("value must not be null");
        }
        ToolReadinessState constant = CONSTANTS.get(value);
        return constant != null ? constant : new ToolReadinessState(value);
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
     * Returns the matching known state.
     *
     * @return the known state, or {@link Known#_UNKNOWN}
     */
    public Known known() {
        return CONSTANTS.containsKey(value) ? Known.valueOf(value) : Known._UNKNOWN;
    }

    @Override
    public boolean equals(Object o) {
        return this == o || (o instanceof ToolReadinessState && value.equals(((ToolReadinessState) o).value));
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
