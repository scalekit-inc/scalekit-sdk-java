package com.scalekit.internal;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Validates caller-supplied JSON-like values and copies them into an immutable, normalized form.
 *
 * <p>Accepted: {@code null}, {@link String}, {@link Boolean}, {@link Number}, {@code Map<String, ?>},
 * {@link Iterable} and arrays (except {@code byte[]} and {@code char[]}). Integral numbers become
 * {@link Long} and must lie within &plusmn;2<sup>53</sup>, because the wire format carries every
 * number as an IEEE double and larger integers would silently lose precision. Other numbers
 * become {@link Double} and must be finite. Nesting is limited to {@value #MAX_DEPTH} levels.
 *
 * <p>Not part of the public API.
 */
public final class JsonValues {

    /** Largest integer magnitude a double represents exactly (2^53). */
    public static final long MAX_SAFE_INTEGER = 1L << 53;

    /** Maximum nesting depth of maps and lists. */
    public static final int MAX_DEPTH = 100;

    private static final BigInteger MAX_SAFE_BIG = BigInteger.valueOf(MAX_SAFE_INTEGER);

    private JsonValues() {
    }

    /**
     * Validates and deep-copies a JSON object.
     *
     * @param value the map to copy
     * @param name  the argument name, used as the root of error paths
     * @return an unmodifiable, insertion-ordered copy
     * @throws IllegalArgumentException if a key is not a String or a value is not JSON-compatible
     */
    @SuppressWarnings("unchecked")
    public static Map<String, Object> copyObject(Map<?, ?> value, String name) {
        if (value == null) {
            throw new IllegalArgumentException(name + " must not be null");
        }
        return (Map<String, Object>) copy(value, name, 0);
    }

    /**
     * Validates and deep-copies any JSON-compatible value.
     *
     * @param value the value to copy
     * @param name  the argument name, used as the root of error paths
     * @return an immutable copy ({@code null}, String, Boolean, Long, Double, List or Map)
     * @throws IllegalArgumentException if the value is not JSON-compatible
     */
    public static Object copyValue(Object value, String name) {
        return copy(value, name, 0);
    }

    private static Object copy(Object value, String path, int depth) {
        if (value == null || value instanceof String || value instanceof Boolean) {
            return value;
        }
        if (value instanceof Number) {
            return copyNumber((Number) value, path);
        }
        if (value instanceof Map) {
            checkDepth(path, depth);
            Map<String, Object> copy = new LinkedHashMap<>();
            for (Map.Entry<?, ?> entry : ((Map<?, ?>) value).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new IllegalArgumentException(path + " has a key that is not a String: "
                            + (key == null ? "null" : key.getClass().getName()));
                }
                copy.put((String) key, copy(entry.getValue(), path + "." + key, depth + 1));
            }
            return Collections.unmodifiableMap(copy);
        }
        if (value instanceof Iterable) {
            checkDepth(path, depth);
            List<Object> copy = new ArrayList<>();
            int index = 0;
            for (Object element : (Iterable<?>) value) {
                copy.add(copy(element, path + "[" + index + "]", depth + 1));
                index++;
            }
            return Collections.unmodifiableList(copy);
        }
        if (value.getClass().isArray() && !(value instanceof byte[]) && !(value instanceof char[])) {
            checkDepth(path, depth);
            int length = Array.getLength(value);
            List<Object> copy = new ArrayList<>(length);
            for (int i = 0; i < length; i++) {
                copy.add(copy(Array.get(value, i), path + "[" + i + "]", depth + 1));
            }
            return Collections.unmodifiableList(copy);
        }
        throw new IllegalArgumentException(path + " has unsupported type " + value.getClass().getName()
                + "; use String, Number, Boolean, null, Map<String, ?>, List or an array");
    }

    private static void checkDepth(String path, int depth) {
        if (depth >= MAX_DEPTH) {
            throw new IllegalArgumentException(path + " is nested deeper than " + MAX_DEPTH + " levels");
        }
    }

    private static Object copyNumber(Number number, String path) {
        if (number instanceof Long || number instanceof Integer || number instanceof Short
                || number instanceof Byte || number instanceof AtomicInteger || number instanceof AtomicLong) {
            return checkSafe(number.longValue(), path);
        }
        if (number instanceof BigInteger) {
            BigInteger big = (BigInteger) number;
            if (big.abs().compareTo(MAX_SAFE_BIG) > 0) {
                throw unsafeInteger(path, big.toString());
            }
            return big.longValue();
        }
        if (number instanceof BigDecimal) {
            BigDecimal decimal = (BigDecimal) number;
            if (decimal.signum() == 0 || decimal.stripTrailingZeros().scale() <= 0) {
                BigInteger integral = decimal.toBigIntegerExact();
                if (integral.abs().compareTo(MAX_SAFE_BIG) > 0) {
                    throw unsafeInteger(path, decimal.toPlainString());
                }
                return integral.longValue();
            }
        }
        double asDouble = number.doubleValue();
        if (Double.isNaN(asDouble) || Double.isInfinite(asDouble)) {
            throw new IllegalArgumentException(path + " must be a finite number, got " + number);
        }
        return asDouble;
    }

    private static Long checkSafe(long value, String path) {
        if (value > MAX_SAFE_INTEGER || value < -MAX_SAFE_INTEGER) {
            throw unsafeInteger(path, Long.toString(value));
        }
        return value;
    }

    private static IllegalArgumentException unsafeInteger(String path, String value) {
        return new IllegalArgumentException(path + " is " + value
                + ", outside +/-2^53; JSON numbers lose precision beyond that, so send it as a String");
    }
}
