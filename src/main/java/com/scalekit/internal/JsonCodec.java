package com.scalekit.internal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Encodes normalized JSON values to bytes and parses JSON bytes into plain Java values. Not part
 * of the public API.
 */
public final class JsonCodec {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    private JsonCodec() {
    }

    /**
     * Encodes a value produced by {@link JsonValues} as UTF-8 JSON.
     *
     * @param value a normalized value
     * @return the JSON bytes
     * @throws IllegalArgumentException if the value cannot be encoded
     */
    public static byte[] encode(Object value) {
        try {
            return MAPPER.writeValueAsBytes(value);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("value cannot be encoded as JSON: " + e.getOriginalMessage(), e);
        }
    }

    /**
     * Parses JSON into null, String, Boolean, Long, Double, an unmodifiable List or an
     * unmodifiable, insertion-ordered Map. Integers that do not fit in a long become Double.
     *
     * @param json the JSON bytes
     * @return the parsed value
     * @throws IOException if the bytes are not valid JSON
     */
    public static Object parse(byte[] json) throws IOException {
        JsonNode node = MAPPER.readTree(json);
        if (node == null || node.isMissingNode()) {
            throw new IOException("empty body");
        }
        return toJava(node);
    }

    private static Object toJava(JsonNode node) {
        if (node.isObject()) {
            Map<String, Object> map = new LinkedHashMap<>();
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> field = fields.next();
                map.put(field.getKey(), toJava(field.getValue()));
            }
            return Collections.unmodifiableMap(map);
        }
        if (node.isArray()) {
            List<Object> list = new ArrayList<>(node.size());
            for (JsonNode element : node) {
                list.add(toJava(element));
            }
            return Collections.unmodifiableList(list);
        }
        if (node.isTextual()) {
            return node.textValue();
        }
        if (node.isBoolean()) {
            return node.booleanValue();
        }
        if (node.isIntegralNumber() && node.canConvertToLong()) {
            return node.longValue();
        }
        if (node.isNumber()) {
            return node.doubleValue();
        }
        return null;
    }
}
