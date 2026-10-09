package com.scalekit.internal.proxy;

import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;

import static org.junit.jupiter.api.Assertions.*;

/** Backoff, Retry-After parsing and Location parsing, without a server. */
class ResumableUploaderTest {

    private static final Instant NOW = Instant.parse("2026-10-08T12:00:00Z");

    private static ResumableUploader uploader(double jitter) {
        return new ResumableUploader(null, millis -> { }, () -> jitter, Clock.fixed(NOW, ZoneOffset.UTC));
    }

    @Test
    void backoffUsesFullJitterUnderAnExponentialCeiling() {
        ResumableUploader max = uploader(1.0);
        assertEquals(1000, max.backoffMillis(1), "the first delay is at most 1 second");
        assertEquals(2000, max.backoffMillis(2));
        assertEquals(16_000, max.backoffMillis(5));
        assertEquals(30_000, max.backoffMillis(6), "capped at 30 seconds");
        assertEquals(30_000, max.backoffMillis(1000));
        assertEquals(0, uploader(0.0).backoffMillis(3));
        assertEquals(500, uploader(0.5).backoffMillis(1));
    }

    @Test
    void retryAfterAcceptsDeltaSecondsAndClampsThem() {
        ResumableUploader u = uploader(0.5);
        assertEquals(5000, u.retryAfterMillis("5"));
        assertEquals(5000, u.retryAfterMillis(" 5 "));
        assertEquals(0, u.retryAfterMillis("0"));
        assertEquals(0, u.retryAfterMillis("-3"), "a negative value means no wait");
        assertEquals(30_000, u.retryAfterMillis("31"));
        assertEquals(30_000, u.retryAfterMillis("99999999999999999999"));
    }

    @Test
    void retryAfterAcceptsAllThreeHttpDateForms() {
        ResumableUploader u = uploader(0.5);
        assertEquals(10_000, u.retryAfterMillis("Thu, 08 Oct 2026 12:00:10 GMT"));
        assertEquals(10_000, u.retryAfterMillis("Thursday, 08-Oct-26 12:00:10 GMT"));
        assertEquals(10_000, u.retryAfterMillis("Thu Oct  8 12:00:10 2026"));
        assertEquals(0, u.retryAfterMillis("Thu, 08 Oct 2026 11:00:00 GMT"), "a past date means no wait");
        assertEquals(30_000, u.retryAfterMillis("Fri, 09 Oct 2026 12:00:00 GMT"));
    }

    @Test
    void anUnparseableRetryAfterFallsBackToBackoff() {
        ResumableUploader u = uploader(0.5);
        assertEquals(-1, u.retryAfterMillis(null));
        assertEquals(-1, u.retryAfterMillis(""));
        assertEquals(-1, u.retryAfterMillis("soon"));
        assertEquals(-1, u.retryAfterMillis("1.5"));
    }

    @Test
    void uploadIdIsReadFromTheLocationQuery() {
        assertEquals("AbC-1_2", ResumableUploader.queryValue(
                "https://www.googleapis.com/upload/drive/v3/files?uploadType=resumable&upload_id=AbC-1_2", "upload_id"));
        assertEquals("a b", ResumableUploader.queryValue("https://x/?upload_id=a%20b#frag", "upload_id"));
        assertNull(ResumableUploader.queryValue("https://x/?xupload_id=a", "upload_id"));
        assertNull(ResumableUploader.queryValue("https://x/upload_id=a", "upload_id"));
        assertNull(ResumableUploader.queryValue("https://x/?upload_id=%zz", "upload_id"));
    }
}
