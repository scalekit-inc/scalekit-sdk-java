package com.scalekit.internal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PreconditionsPathTest {

    @Test
    void percentDecodingIsFullAndLeavesMalformedEscapesAlone() {
        assertEquals("a/../b", Preconditions.percentDecode("a%2f..%2Fb"));
        assertEquals("..", Preconditions.percentDecode("%2E%2e"));
        assertEquals("a+b", Preconditions.percentDecode("a+b"), "+ is not a space in a path");
        assertEquals("100%", Preconditions.percentDecode("100%25"));
        assertEquals("%zz%4", Preconditions.percentDecode("%zz%4"));
        assertEquals("é", Preconditions.percentDecode("%C3%A9"));
    }

    @Test
    void dotSegmentsAreFoundAfterDecoding() {
        assertTrue(Preconditions.hasDotSegment("/a%2f..%2fb"));
        assertTrue(Preconditions.hasDotSegment("/a/./b"));
        assertTrue(Preconditions.hasDotSegment("/a/%2e%2e"));
        assertFalse(Preconditions.hasDotSegment("/a%2Fb/c"));
        assertFalse(Preconditions.hasDotSegment("/a/.../b"));
        assertFalse(Preconditions.hasDotSegment("/a/..b/.c"));
        assertFalse(Preconditions.hasDotSegment("/a//b"));
    }
}
