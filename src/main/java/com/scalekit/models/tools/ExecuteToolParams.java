package com.scalekit.models.tools;

import com.scalekit.internal.JsonValues;
import com.scalekit.internal.Preconditions;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Which account runs a tool, the tool's input, and the deadline, for
 * {@link com.scalekit.api.ToolsClient#execute(String, ExecuteToolParams)}.
 *
 * <p>Select the account with {@link Builder#connectedAccountId(String)}, or with
 * {@link Builder#connectionName(String)} plus {@link Builder#identifier(String)}, or with
 * {@link Builder#identifier(String)} alone when that identifier has exactly one account for the
 * tool's provider.
 *
 * <pre>{@code
 * ExecuteToolParams params = ExecuteToolParams.builder()
 *         .connectionName("gmail")
 *         .identifier("user_123")
 *         .putToolInput("max_results", 5)
 *         .build();
 * }</pre>
 *
 * <p>Blank strings are treated as unset. Immutable and thread-safe.
 *
 * @since 2.6.0
 */
public final class ExecuteToolParams {

    /** Default deadline for running a tool: 60 seconds. */
    public static final Duration DEFAULT_TIMEOUT = Duration.ofSeconds(60);

    private final String identifier;
    private final String connectionName;
    private final String connectedAccountId;
    private final Map<String, Object> toolInput;
    private final Duration timeout;

    private ExecuteToolParams(Builder builder) {
        this.identifier = Preconditions.trimToNull(builder.identifier);
        this.connectionName = Preconditions.trimToNull(builder.connectionName);
        this.connectedAccountId = Preconditions.trimToNull(builder.connectedAccountId);
        this.toolInput = builder.toolInput == null ? null : JsonValues.copyObject(builder.toolInput, "toolInput");
        this.timeout = Preconditions.requirePositive(builder.timeout, "timeout");
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
     * Returns a builder initialised with these parameters.
     *
     * @return the builder
     */
    public Builder toBuilder() {
        return new Builder().identifier(identifier).connectionName(connectionName)
                .connectedAccountId(connectedAccountId).toolInput(toolInput).timeout(timeout);
    }

    /**
     * Returns the identifier of the account's owner.
     *
     * @return the identifier, or empty
     */
    public Optional<String> identifier() {
        return Optional.ofNullable(identifier);
    }

    /**
     * Returns the connection name.
     *
     * @return the connection name, or empty
     */
    public Optional<String> connectionName() {
        return Optional.ofNullable(connectionName);
    }

    /**
     * Returns the connected account ID.
     *
     * @return the ID, or empty
     */
    public Optional<String> connectedAccountId() {
        return Optional.ofNullable(connectedAccountId);
    }

    /**
     * Returns the tool input.
     *
     * @return an unmodifiable map, or empty when no input is sent
     */
    public Optional<Map<String, Object>> toolInput() {
        return Optional.ofNullable(toolInput);
    }

    /**
     * Returns the deadline for the call.
     *
     * @return the deadline; {@link #DEFAULT_TIMEOUT} unless set
     */
    public Duration timeout() {
        return timeout;
    }

    @Override
    public String toString() {
        return "ExecuteToolParams{identifier=" + identifier + ", connectionName=" + connectionName
                + ", connectedAccountId=" + connectedAccountId
                + ", toolInput=" + (toolInput == null ? null : toolInput.keySet()) + ", timeout=" + timeout + "}";
    }

    /**
     * Builder for {@link ExecuteToolParams}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private String identifier;
        private String connectionName;
        private String connectedAccountId;
        private Map<String, Object> toolInput;
        private Duration timeout = DEFAULT_TIMEOUT;

        private Builder() {
        }

        /**
         * Sets the identifier of the user or tenant whose account runs the tool.
         *
         * @param identifier the identifier
         * @return this builder
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * Sets the connection whose account runs the tool, for example {@code "gmail"}.
         *
         * @param connectionName the connection name
         * @return this builder
         */
        public Builder connectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        /**
         * Sets the connected account that runs the tool.
         *
         * @param connectedAccountId the connected account ID
         * @return this builder
         */
        public Builder connectedAccountId(String connectedAccountId) {
            this.connectedAccountId = connectedAccountId;
            return this;
        }

        /**
         * Sets the tool input, replacing any set before. Values must be JSON-compatible:
         * String, Number, Boolean, null, {@code Map<String, ?>}, List or arrays. Integers must be
         * within &plusmn;2<sup>53</sup>.
         *
         * @param toolInput the input; null sends no input
         * @return this builder
         */
        public Builder toolInput(Map<String, ?> toolInput) {
            this.toolInput = toolInput == null ? null : new LinkedHashMap<String, Object>(toolInput);
            return this;
        }

        /**
         * Adds one entry to the tool input.
         *
         * @param key   the input name
         * @param value a JSON-compatible value
         * @return this builder
         * @throws IllegalArgumentException if {@code key} is null
         */
        public Builder putToolInput(String key, Object value) {
            if (key == null) {
                throw new IllegalArgumentException("toolInput key must not be null");
            }
            if (toolInput == null) {
                toolInput = new LinkedHashMap<>();
            }
            toolInput.put(key, value);
            return this;
        }

        /**
         * Sets the deadline for the call. The tool may still run to completion on the server
         * after the deadline passes.
         *
         * @param timeout a positive duration; defaults to {@link #DEFAULT_TIMEOUT}
         * @return this builder
         */
        public Builder timeout(Duration timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * Builds the parameters.
         *
         * @return the parameters
         * @throws IllegalArgumentException if the timeout is not positive or the input holds a
         *                                  value that is not JSON-compatible
         */
        public ExecuteToolParams build() {
            return new ExecuteToolParams(this);
        }
    }
}
