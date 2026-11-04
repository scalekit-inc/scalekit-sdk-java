package com.scalekit.internal;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class JsonValuesTest {

    @Test
    void normalizesNumbersAndCollections() {
        Map<String, Object> input = new LinkedHashMap<>();
        input.put("int", 1);
        input.put("long", JsonValues.MAX_SAFE_INTEGER);
        input.put("double", 1.5f);
        input.put("decimal", new BigDecimal("2.000"));
        input.put("fraction", new BigDecimal("2.5"));
        input.put("array", new int[]{1, 2});
        input.put("list", Arrays.asList("a", null));
        input.put("null", null);
        Map<String, Object> copy = JsonValues.copyObject(input, "in");
        assertEquals(1L, copy.get("int"));
        assertEquals(JsonValues.MAX_SAFE_INTEGER, copy.get("long"));
        assertEquals(1.5, copy.get("double"));
        assertEquals(2L, copy.get("decimal"));
        assertEquals(2.5, copy.get("fraction"));
        assertEquals(Arrays.asList(1L, 2L), copy.get("array"));
        assertEquals(Arrays.asList("a", null), copy.get("list"));
        assertTrue(copy.containsKey("null"));
        assertThrows(UnsupportedOperationException.class, () -> copy.put("x", 1));
    }

    @Test
    void copiesAreIndependentOfTheInput() {
        List<Object> list = new ArrayList<>(Collections.singletonList("a"));
        Map<String, Object> copy = JsonValues.copyObject(Collections.singletonMap("l", list), "in");
        list.add("b");
        assertEquals(Collections.singletonList("a"), copy.get("l"));
    }

    @Test
    void rejectsValuesThatJsonCannotCarryWithThePath() {
        IllegalArgumentException big = assertThrows(IllegalArgumentException.class, () -> JsonValues.copyObject(
                Collections.singletonMap("a", Collections.singletonMap("b", JsonValues.MAX_SAFE_INTEGER + 1)), "toolInput"));
        assertTrue(big.getMessage().startsWith("toolInput.a.b"), big.getMessage());
        assertThrows(IllegalArgumentException.class, () -> JsonValues.copyValue(BigInteger.TEN.pow(20), "x"));
        assertThrows(IllegalArgumentException.class, () -> JsonValues.copyValue(Double.NaN, "x"));
        assertThrows(IllegalArgumentException.class, () -> JsonValues.copyValue(new Object(), "x"));
        assertThrows(IllegalArgumentException.class, () -> JsonValues.copyValue(new byte[]{1}, "x"));
        Map<Object, Object> nonStringKey = new HashMap<>();
        nonStringKey.put(1, "v");
        assertThrows(IllegalArgumentException.class, () -> JsonValues.copyObject(nonStringKey, "x"));
    }

    @Test
    void rejectsCyclesThroughTheDepthLimit() {
        Map<String, Object> cyclic = new HashMap<>();
        cyclic.put("self", cyclic);
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> JsonValues.copyObject(cyclic, "x"));
        assertTrue(e.getMessage().contains("nested deeper"));
    }

    @Test
    void structRoundTripKeepsTypes() {
        Map<String, Object> input = new LinkedHashMap<>();
        input.put("s", "v");
        input.put("b", true);
        input.put("n", 3);
        input.put("d", 0.25);
        input.put("o", Collections.singletonMap("k", Arrays.asList(1, "x")));
        input.put("z", null);
        Struct struct = StructConverter.toStruct(JsonValues.copyObject(input, "in"));
        Map<String, Object> back = StructConverter.fromStruct(struct);
        assertEquals("v", back.get("s"));
        assertEquals(true, back.get("b"));
        assertEquals(3L, back.get("n"));
        assertEquals(0.25, back.get("d"));
        assertEquals(Arrays.asList(1L, "x"), ((Map<?, ?>) back.get("o")).get("k"));
        assertNull(back.get("z"));
        assertTrue(back.containsKey("z"));
    }

    @Test
    void largeAndNonFiniteNumbersFromTheServerDoNotThrow() {
        Struct struct = Struct.newBuilder()
                .putFields("big", Value.newBuilder().setNumberValue(1e300).build())
                .putFields("nan", Value.newBuilder().setNumberValue(Double.NaN).build())
                .putFields("unset", Value.getDefaultInstance())
                .build();
        Map<String, Object> map = StructConverter.fromStruct(struct);
        assertEquals(1e300, map.get("big"));
        assertNull(map.get("nan"));
        assertNull(map.get("unset"));
    }
}
