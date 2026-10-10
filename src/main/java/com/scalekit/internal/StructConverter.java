package com.scalekit.internal;

import com.google.protobuf.ListValue;
import com.google.protobuf.NullValue;
import com.google.protobuf.Struct;
import com.google.protobuf.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Converts between {@code google.protobuf.Struct}/{@code Value}/{@code ListValue} and plain Java
 * maps and lists. Not part of the public API.
 *
 * <p>Inputs must already be normalized by {@link JsonValues}. Outputs are unmodifiable; numbers
 * come back as {@link Long} when they are integral and within &plusmn;2<sup>53</sup>, otherwise
 * as {@link Double}. NaN and infinities, which JSON cannot express, come back as null.
 */
public final class StructConverter {

    private StructConverter() {
    }

    /**
     * Converts a normalized map to a Struct.
     *
     * @param map a map produced by {@link JsonValues#copyObject}
     * @return the Struct
     */
    public static Struct toStruct(Map<String, ?> map) {
        Struct.Builder builder = Struct.newBuilder();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            builder.putFields(entry.getKey(), toValue(entry.getValue()));
        }
        return builder.build();
    }

    /**
     * Converts a normalized list to a ListValue.
     *
     * @param list a list produced by {@link JsonValues}
     * @return the ListValue
     */
    public static ListValue toListValue(List<?> list) {
        ListValue.Builder builder = ListValue.newBuilder();
        for (Object element : list) {
            builder.addValues(toValue(element));
        }
        return builder.build();
    }

    /**
     * Converts a normalized value to a protobuf Value.
     *
     * @param value a value produced by {@link JsonValues}
     * @return the Value
     */
    public static Value toValue(Object value) {
        if (value == null) {
            return Value.newBuilder().setNullValue(NullValue.NULL_VALUE).build();
        }
        if (value instanceof String) {
            return Value.newBuilder().setStringValue((String) value).build();
        }
        if (value instanceof Boolean) {
            return Value.newBuilder().setBoolValue((Boolean) value).build();
        }
        if (value instanceof Number) {
            return Value.newBuilder().setNumberValue(((Number) value).doubleValue()).build();
        }
        if (value instanceof Map) {
            @SuppressWarnings("unchecked")
            Map<String, ?> map = (Map<String, ?>) value;
            return Value.newBuilder().setStructValue(toStruct(map)).build();
        }
        if (value instanceof List) {
            return Value.newBuilder().setListValue(toListValue((List<?>) value)).build();
        }
        throw new IllegalArgumentException("unsupported value type " + value.getClass().getName());
    }

    /**
     * Converts a Struct to an unmodifiable, insertion-ordered map.
     *
     * @param struct the Struct
     * @return the map
     */
    public static Map<String, Object> fromStruct(Struct struct) {
        Map<String, Object> map = new LinkedHashMap<>();
        for (Map.Entry<String, Value> entry : struct.getFieldsMap().entrySet()) {
            map.put(entry.getKey(), fromValue(entry.getValue()));
        }
        return Collections.unmodifiableMap(map);
    }

    /**
     * Converts a ListValue to an unmodifiable list.
     *
     * @param listValue the ListValue
     * @return the list
     */
    public static List<Object> fromListValue(ListValue listValue) {
        List<Object> list = new ArrayList<>(listValue.getValuesCount());
        for (Value value : listValue.getValuesList()) {
            list.add(fromValue(value));
        }
        return Collections.unmodifiableList(list);
    }

    /**
     * Converts a protobuf Value to a plain Java value.
     *
     * @param value the Value
     * @return null, String, Boolean, Long, Double, List or Map
     */
    public static Object fromValue(Value value) {
        switch (value.getKindCase()) {
            case STRING_VALUE:
                return value.getStringValue();
            case BOOL_VALUE:
                return value.getBoolValue();
            case NUMBER_VALUE:
                return fromNumber(value.getNumberValue());
            case STRUCT_VALUE:
                return fromStruct(value.getStructValue());
            case LIST_VALUE:
                return fromListValue(value.getListValue());
            case NULL_VALUE:
            case KIND_NOT_SET:
            default:
                return null;
        }
    }

    private static Object fromNumber(double number) {
        if (Double.isNaN(number) || Double.isInfinite(number)) {
            // JSON has no representation for these; treat them like JSON null rather than fail.
            return null;
        }
        if (number == Math.rint(number) && Math.abs(number) <= JsonValues.MAX_SAFE_INTEGER) {
            return (long) number;
        }
        return number;
    }
}
