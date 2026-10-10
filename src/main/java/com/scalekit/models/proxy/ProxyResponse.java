package com.scalekit.models.proxy;

import com.scalekit.internal.JsonCodec;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

/**
 * The response to a proxied request: the upstream API's status, headers and body, passed through
 * unchanged. {@link com.scalekit.api.ActionsClient#request(ProxyRequest)} returns it for 1xx-3xx
 * statuses and throws {@link com.scalekit.exceptions.ProxyException}, which carries it, for 4xx
 * and 5xx. Redirects are not followed.
 *
 * <p>Immutable and thread-safe. {@link #toString()} prints neither header values nor the body.
 *
 * @since 2.6.0
 */
public final class ProxyResponse {

    private final int statusCode;
    private final Map<String, List<String>> headers;
    private final byte[] body;

    private ProxyResponse(Builder builder) {
        this.statusCode = builder.statusCode;
        TreeMap<String, List<String>> copy = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        if (builder.headers != null) {
            for (Map.Entry<String, List<String>> entry : builder.headers.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    continue;
                }
                List<String> values = copy.get(entry.getKey());
                if (values == null) {
                    values = new ArrayList<>();
                    copy.put(entry.getKey(), values);
                }
                values.addAll(entry.getValue());
            }
        }
        for (Map.Entry<String, List<String>> entry : copy.entrySet()) {
            entry.setValue(Collections.unmodifiableList(entry.getValue()));
        }
        this.headers = Collections.unmodifiableMap(copy);
        this.body = builder.body == null ? new byte[0] : builder.body.clone();
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
     * Returns the HTTP status code.
     *
     * @return the status code
     */
    public int statusCode() {
        return statusCode;
    }

    /**
     * Returns whether the status code is 2xx.
     *
     * @return true for 200-299
     */
    public boolean isSuccessful() {
        return statusCode >= 200 && statusCode < 300;
    }

    /**
     * Returns the response headers. Lookups ignore the case of the header name.
     *
     * @return an unmodifiable map from header name to values
     */
    public Map<String, List<String>> headers() {
        return headers;
    }

    /**
     * Returns the first value of a header.
     *
     * @param name the header name, in any case
     * @return the value, or empty when the header is absent
     */
    public Optional<String> header(String name) {
        if (name == null) {
            return Optional.empty();
        }
        List<String> values = headers.get(name);
        return values == null || values.isEmpty() ? Optional.<String>empty() : Optional.of(values.get(0));
    }

    /**
     * Returns the body.
     *
     * @return a copy of the body bytes; empty when there is no body
     */
    public byte[] body() {
        return body.clone();
    }

    /**
     * Returns the body as text, decoded with the charset named in {@code Content-Type}, or UTF-8.
     *
     * @return the body text
     */
    public String bodyAsString() {
        return new String(body, charset());
    }

    /**
     * Parses the body as a JSON object. Integers that fit in a {@code long} become {@link Long},
     * other numbers {@link Double}.
     *
     * @return an unmodifiable map
     * @throws IllegalStateException if the body is not a JSON object
     */
    public Map<String, Object> bodyAsJsonObject() {
        Object parsed;
        try {
            parsed = JsonCodec.parse(body);
        } catch (IOException e) {
            throw new IllegalStateException("response body is not valid JSON: " + e.getMessage(), e);
        }
        if (!(parsed instanceof Map)) {
            throw new IllegalStateException("response body is JSON but not an object");
        }
        @SuppressWarnings("unchecked")
        Map<String, Object> map = (Map<String, Object>) parsed;
        return map;
    }

    private Charset charset() {
        String contentType = header("Content-Type").orElse(null);
        if (contentType != null) {
            for (String part : contentType.split(";")) {
                String trimmed = part.trim();
                if (trimmed.toLowerCase(Locale.ROOT).startsWith("charset=")) {
                    String name = trimmed.substring("charset=".length()).replace("\"", "").trim();
                    try {
                        return Charset.forName(name);
                    } catch (RuntimeException unsupported) {
                        return StandardCharsets.UTF_8;
                    }
                }
            }
        }
        return StandardCharsets.UTF_8;
    }

    @Override
    public String toString() {
        return "ProxyResponse{statusCode=" + statusCode + ", headers=" + headers.keySet()
                + ", body=" + body.length + " bytes}";
    }

    /**
     * Builder for {@link ProxyResponse}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private int statusCode;
        private Map<String, List<String>> headers;
        private byte[] body;

        private Builder() {
        }

        /**
         * Sets the status code.
         *
         * @param statusCode the status code
         * @return this builder
         */
        public Builder statusCode(int statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Sets the headers.
         *
         * @param headers map from header name to values; null means none
         * @return this builder
         */
        public Builder headers(Map<String, List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Sets the body.
         *
         * @param body the bytes; null means empty
         * @return this builder
         */
        public Builder body(byte[] body) {
            this.body = body;
            return this;
        }

        /**
         * Builds the response.
         *
         * @return the response
         */
        public ProxyResponse build() {
            return new ProxyResponse(this);
        }
    }
}
