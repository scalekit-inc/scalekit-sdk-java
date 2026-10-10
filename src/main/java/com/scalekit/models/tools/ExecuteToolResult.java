package com.scalekit.models.tools;

import com.scalekit.internal.JsonValues;
import com.scalekit.internal.Preconditions;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/**
 * The output of a tool run.
 *
 * <p>{@link #data()} is the upstream service's response body as JSON. When the upstream returned
 * a JSON array it is wrapped as {@code {"array": [...]}}; when it returned plain text it is
 * wrapped as {@code {"result": "..."}}. Integral numbers are {@link Long} when within
 * &plusmn;2<sup>53</sup>, other numbers {@link Double}. Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class ExecuteToolResult {

    private final Map<String, Object> data;
    private final String executionId;

    private ExecuteToolResult(Builder builder) {
        this.data = builder.data == null ? Collections.<String, Object>emptyMap()
                : JsonValues.copyObject(builder.data, "data");
        this.executionId = Preconditions.nullToEmpty(builder.executionId);
    }

    /**
     * Returns a new builder.
     *
     * @return the builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Returns the tool's output.
     *
     * @return an unmodifiable map; empty when the tool returned nothing
     */
    public Map<String, Object> data() {
        return data;
    }

    /**
     * Returns the ID of this run, for correlating with Scalekit's tool-call logs.
     *
     * @return the ID, or {@code ""} when the server sent none
     */
    public String executionId() {
        return executionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteToolResult)) {
            return false;
        }
        ExecuteToolResult that = (ExecuteToolResult) o;
        return data.equals(that.data) && executionId.equals(that.executionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, executionId);
    }

    @Override
    public String toString() {
        return "ExecuteToolResult{executionId=" + executionId + ", data=" + data.keySet() + "}";
    }

    /**
     * Builder for {@link ExecuteToolResult}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private Map<String, ?> data;
        private String executionId;

        private Builder() {
        }

        /**
         * Sets the output.
         *
         * @param data JSON-compatible map; null means empty
         * @return this builder
         */
        public Builder data(Map<String, ?> data) {
            this.data = data;
            return this;
        }

        /**
         * Sets the execution ID.
         *
         * @param executionId the ID
         * @return this builder
         */
        public Builder executionId(String executionId) {
            this.executionId = executionId;
            return this;
        }

        /**
         * Builds the result.
         *
         * @return the result
         * @throws IllegalArgumentException if the data holds a value that is not JSON-compatible
         */
        public ExecuteToolResult build() {
            return new ExecuteToolResult(this);
        }
    }
}
