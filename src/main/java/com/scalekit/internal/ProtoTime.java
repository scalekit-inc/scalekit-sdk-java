package com.scalekit.internal;

import com.google.protobuf.Timestamp;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.Instant;

/**
 * Converts protobuf time types to and from {@code java.time}. Not part of the public API.
 */
public final class ProtoTime {

    private ProtoTime() {
    }

    /**
     * Converts a Timestamp to an Instant.
     *
     * @param present   whether the field is set on the message
     * @param timestamp the Timestamp
     * @return the Instant, or null when the field is not set or out of range
     */
    public static Instant toInstantOrNull(boolean present, Timestamp timestamp) {
        if (!present || timestamp == null) {
            return null;
        }
        try {
            return Instant.ofEpochSecond(timestamp.getSeconds(), timestamp.getNanos());
        } catch (DateTimeException | ArithmeticException outOfRange) {
            return null;
        }
    }

    /**
     * Converts an Instant to a Timestamp.
     *
     * @param instant the Instant
     * @return the Timestamp
     */
    public static Timestamp toTimestamp(Instant instant) {
        return Timestamp.newBuilder().setSeconds(instant.getEpochSecond()).setNanos(instant.getNano()).build();
    }

    /**
     * Converts a java.time Duration to a protobuf Duration, keeping seconds and nanos exactly.
     *
     * @param duration the Duration
     * @return the protobuf Duration
     */
    public static com.google.protobuf.Duration toProto(Duration duration) {
        return com.google.protobuf.Duration.newBuilder()
                .setSeconds(duration.getSeconds())
                .setNanos(duration.getNano())
                .build();
    }
}
