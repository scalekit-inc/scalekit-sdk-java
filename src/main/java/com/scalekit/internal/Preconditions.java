package com.scalekit.internal;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Argument checks shared by the SDK's models and clients. Not part of the public API: it may
 * change or disappear in any release.
 */
public final class Preconditions {

    private Preconditions() {
    }

    /**
     * Returns {@code value} trimmed, or throws when it is null or blank.
     *
     * @param value the value to check
     * @param name  the argument name used in the error message
     * @return the trimmed value
     * @throws IllegalArgumentException if {@code value} is null or blank
     */
    public static String requireNonBlank(String value, String name) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(name + " is required");
        }
        return value.trim();
    }

    /**
     * Returns {@code value} unchanged, or throws when it is null or empty. Whitespace is kept.
     *
     * @param value the value to check
     * @param name  the argument name used in the error message
     * @return the value
     * @throws IllegalArgumentException if {@code value} is null or empty
     */
    public static String requireNonEmpty(String value, String name) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException(name + " is required");
        }
        return value;
    }

    /**
     * Returns {@code value} trimmed, or null when it is null or blank.
     *
     * @param value the value
     * @return the trimmed value or null
     */
    public static String trimToNull(String value) {
        if (value == null) {
            return null;
        }
        String trimmed = value.trim();
        return trimmed.isEmpty() ? null : trimmed;
    }

    /**
     * Returns {@code value}, or null when it is null or empty. Whitespace is kept.
     *
     * @param value the value
     * @return the value or null
     */
    public static String emptyToNull(String value) {
        return value == null || value.isEmpty() ? null : value;
    }

    /**
     * Returns {@code value}, or {@code ""} when it is null.
     *
     * @param value the value
     * @return the value or the empty string
     */
    public static String nullToEmpty(String value) {
        return value == null ? "" : value;
    }

    /**
     * Checks that a duration is set and strictly positive.
     *
     * @param value the duration
     * @param name  the argument name used in the error message
     * @return the duration
     * @throws IllegalArgumentException if it is null, zero or negative
     */
    public static Duration requirePositive(Duration value, String name) {
        if (value == null) {
            throw new IllegalArgumentException(name + " is required");
        }
        if (value.isZero() || value.isNegative()) {
            throw new IllegalArgumentException(name + " must be positive, got " + value);
        }
        return value;
    }

    /**
     * Converts a positive duration to nanoseconds, saturating at {@link Long#MAX_VALUE}.
     *
     * @param value a positive duration
     * @return the duration in nanoseconds
     */
    public static long saturatedNanos(Duration value) {
        try {
            return value.toNanos();
        } catch (ArithmeticException overflow) {
            return Long.MAX_VALUE;
        }
    }

    /**
     * Returns an unmodifiable copy of a string list; null becomes an empty list.
     *
     * @param values the values
     * @param name   the argument name used in the error message
     * @return the copy
     * @throws IllegalArgumentException if an element is null
     */
    public static List<String> copyStrings(Collection<String> values, String name) {
        if (values == null || values.isEmpty()) {
            return Collections.emptyList();
        }
        List<String> copy = new ArrayList<>(values.size());
        for (String value : values) {
            if (value == null) {
                throw new IllegalArgumentException(name + " must not contain null");
            }
            copy.add(value);
        }
        return Collections.unmodifiableList(copy);
    }

    /**
     * Returns an unmodifiable copy of a list; null becomes an empty list.
     *
     * @param values the values
     * @param name   the argument name used in the error message
     * @param <T>    the element type
     * @return the copy
     * @throws IllegalArgumentException if an element is null
     */
    public static <T> List<T> copyList(Collection<? extends T> values, String name) {
        if (values == null || values.isEmpty()) {
            return Collections.emptyList();
        }
        List<T> copy = new ArrayList<>(values.size());
        for (T value : values) {
            if (value == null) {
                throw new IllegalArgumentException(name + " must not contain null");
            }
            copy.add(value);
        }
        return Collections.unmodifiableList(copy);
    }

    /**
     * Returns an unmodifiable, insertion-ordered copy of a string map; null becomes an empty map.
     *
     * @param values the values
     * @param name   the argument name used in the error message
     * @return the copy
     * @throws IllegalArgumentException if a key or value is null
     */
    public static Map<String, String> copyStringMap(Map<String, String> values, String name) {
        if (values == null || values.isEmpty()) {
            return Collections.emptyMap();
        }
        Map<String, String> copy = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : values.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                throw new IllegalArgumentException(name + " must not contain null keys or values");
            }
            copy.put(entry.getKey(), entry.getValue());
        }
        return Collections.unmodifiableMap(copy);
    }
}
