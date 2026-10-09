package com.scalekit.models.proxy;

import com.scalekit.internal.JsonCodec;
import com.scalekit.internal.JsonValues;
import com.scalekit.internal.Preconditions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * An HTTP request sent to a third-party API through Scalekit's proxy with
 * {@link com.scalekit.api.ActionsClient#request(ProxyRequest)}. Scalekit adds the connected
 * account's credentials, so the request never carries them.
 *
 * <pre>{@code
 * ProxyRequest request = ProxyRequest.builder("gmail", "user_123", "/gmail/v1/users/me/messages")
 *         .queryParam("maxResults", "10")
 *         .build();
 *
 * ProxyRequest post = ProxyRequest.builder("slack", "user_123", "/api/chat.postMessage")
 *         .method("POST")
 *         .jsonBody(Collections.singletonMap("text", "hello"))
 *         .build();
 * }</pre>
 *
 * <p>Rules checked by {@link Builder#build()}, before any network call:
 * <ul>
 *   <li>{@code connectionName}, {@code identifier} and {@code path} are required; the first two
 *       are trimmed and a leading {@code /} is added to the path when missing;</li>
 *   <li>header values, {@code connectionName} and {@code identifier} contain only printable
 *       US-ASCII characters (and tab), because HTTP clients do not send other characters
 *       reliably: {@code java.net.http} replaces them with {@code ?};</li>
 *   <li>the path has no {@code #} and no {@code .} or {@code ..} segments, also after
 *       percent-decoding and with {@code \} read as {@code /} (so {@code %2e%2e},
 *       {@code a%2F..%2Fb} and {@code a\..\b} are rejected), so that the request cannot resolve
 *       outside {@code <environment URL>/proxy/};</li>
 *   <li>at most one body ({@code jsonBody}, {@code formBody} or {@code rawBody}), and none on
 *       {@code GET} or {@code HEAD};</li>
 *   <li>the headers {@code Host}, {@code Content-Length}, {@code Connection}, {@code Expect} and
 *       {@code Upgrade} cannot be set; the HTTP client manages them;</li>
 *   <li>the timeout is positive.</li>
 * </ul>
 * The SDK sets the {@code Authorization}, {@code connection_name} and {@code identifier} headers
 * itself; headers with those names given here are ignored. A {@code Content-Type} header given
 * here wins over the one implied by the body.
 *
 * <p>Immutable and thread-safe. {@link #toString()} prints neither header values nor the body.
 *
 * @since 2.6.0
 */
public final class ProxyRequest {

    /** Default deadline for a proxied request: 60 seconds, the same as for running a tool. */
    public static final Duration DEFAULT_TIMEOUT = Duration.ofSeconds(60);

    private static final Set<String> RESTRICTED_HEADERS = Collections.unmodifiableSet(new HashSet<>(
            Arrays.asList("host", "content-length", "connection", "expect", "upgrade")));

    private final String connectionName;
    private final String identifier;
    private final String path;
    private final String method;
    private final Map<String, List<String>> queryParams;
    private final Map<String, List<String>> headers;
    private final byte[] body;
    private final String contentType;
    private final Duration timeout;

    private ProxyRequest(Builder builder) {
        this.connectionName = checkHeaderValue(Preconditions.requireNonBlank(builder.connectionName, "connectionName"),
                "connectionName");
        this.identifier = checkHeaderValue(Preconditions.requireNonBlank(builder.identifier, "identifier"),
                "identifier");
        String rawPath = Preconditions.requireNonBlank(builder.path, "path");
        this.path = checkPath(rawPath.startsWith("/") ? rawPath : "/" + rawPath);
        this.method = checkMethod(builder.method);
        this.queryParams = freeze(builder.queryParams);
        this.headers = freeze(builder.headers);
        this.timeout = Preconditions.requirePositive(builder.timeout, "timeout");

        int bodies = (builder.jsonBody != null ? 1 : 0) + (builder.formBody != null ? 1 : 0)
                + (builder.rawBody != null ? 1 : 0);
        if (bodies > 1) {
            throw new IllegalArgumentException("set at most one of jsonBody, formBody and rawBody");
        }
        if (bodies == 1 && ("GET".equals(method) || "HEAD".equals(method))) {
            throw new IllegalArgumentException(method + " requests cannot have a body");
        }
        if (builder.jsonBody != null) {
            this.body = JsonCodec.encode(builder.jsonBody);
            this.contentType = "application/json";
        } else if (builder.formBody != null) {
            this.body = encodeForm(builder.formBody).getBytes(StandardCharsets.UTF_8);
            this.contentType = "application/x-www-form-urlencoded";
        } else if (builder.rawBody != null) {
            this.body = builder.rawBody.clone();
            this.contentType = builder.rawContentType;
        } else {
            this.body = null;
            this.contentType = null;
        }
    }

    /**
     * Returns a new builder.
     *
     * @param connectionName the connection whose account the request uses, for example {@code "gmail"}
     * @param identifier     your identifier for the account's owner
     * @param path           the path on the provider's API, for example {@code "/gmail/v1/users/me/profile"};
     *                       it may include a query string
     * @return the builder
     */
    public static Builder builder(String connectionName, String identifier, String path) {
        return new Builder(connectionName, identifier, path);
    }

    /**
     * Returns the connection name.
     *
     * @return the trimmed name
     */
    public String connectionName() {
        return connectionName;
    }

    /**
     * Returns the identifier.
     *
     * @return the trimmed identifier
     */
    public String identifier() {
        return identifier;
    }

    /**
     * Returns the path, starting with {@code /}.
     *
     * @return the path
     */
    public String path() {
        return path;
    }

    /**
     * Returns the HTTP method, upper-cased.
     *
     * @return the method
     */
    public String method() {
        return method;
    }

    /**
     * Returns the query parameters, in the order they were added.
     *
     * @return an unmodifiable map from name to values
     */
    public Map<String, List<String>> queryParams() {
        return queryParams;
    }

    /**
     * Returns the headers, in the order they were added.
     *
     * @return an unmodifiable map from name to values
     */
    public Map<String, List<String>> headers() {
        return headers;
    }

    /**
     * Returns the encoded body.
     *
     * @return a copy of the body bytes, or empty when the request has no body
     */
    public Optional<byte[]> body() {
        return body == null ? Optional.<byte[]>empty() : Optional.of(body.clone());
    }

    /**
     * Returns the content type implied by the body.
     *
     * @return the content type, or empty when the request has no body
     */
    public Optional<String> contentType() {
        return Optional.ofNullable(contentType);
    }

    /**
     * Returns the deadline for the request.
     *
     * @return the deadline; {@link #DEFAULT_TIMEOUT} unless set
     */
    public Duration timeout() {
        return timeout;
    }

    @Override
    public String toString() {
        return "ProxyRequest{method=" + method + ", connectionName=" + connectionName + ", identifier=" + identifier
                + ", path=" + path + ", queryParams=" + queryParams.keySet() + ", headers=" + headers.keySet()
                + ", body=" + (body == null ? "none" : body.length + " bytes") + ", timeout=" + timeout + "}";
    }

    private static String checkMethod(String method) {
        if (method == null || method.isEmpty()) {
            throw new IllegalArgumentException("method is required");
        }
        String upper = method.toUpperCase(Locale.ROOT);
        if (!isToken(upper)) {
            throw new IllegalArgumentException("method is not a valid HTTP method: " + method);
        }
        if ("CONNECT".equals(upper)) {
            throw new IllegalArgumentException("CONNECT is not supported");
        }
        return upper;
    }

    /**
     * Header values must be printable US-ASCII (or tab): java.net.http writes any other
     * character as '?' and HttpURLConnection's result depends on the platform charset, so the
     * server would see a different value. Reject them before any request instead.
     */
    static String checkHeaderValue(String value, String name) {
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (c > 0x7E || (c < 0x20 && c != '\t')) {
                throw new IllegalArgumentException(name + " must contain only printable US-ASCII characters");
            }
        }
        return value;
    }

    /**
     * Rejects a fragment, which HTTP clients never send (it would also swallow the query
     * parameters), and "." or ".." segments (also percent-encoded or separated by a backslash),
     * which servers may resolve against the proxy prefix.
     */
    static String checkPath(String path) {
        if (path.indexOf('#') >= 0) {
            throw new IllegalArgumentException("path must not contain '#'; percent-encode it as %23");
        }
        int query = path.indexOf('?');
        String pathOnly = query >= 0 ? path.substring(0, query) : path;
        if (Preconditions.hasDotSegment(pathOnly)) {
            throw new IllegalArgumentException("path must not contain \".\" or \"..\" segments, also when "
                    + "percent-decoded or separated by '\\': " + path);
        }
        return path;
    }

    static boolean isToken(String value) {
        if (value.isEmpty()) {
            return false;
        }
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            boolean ok = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')
                    || "!#$%&'*+-.^_`|~".indexOf(c) >= 0;
            if (!ok) {
                return false;
            }
        }
        return true;
    }

    private static Map<String, List<String>> freeze(Map<String, List<String>> source) {
        Map<String, List<String>> copy = new LinkedHashMap<>();
        for (Map.Entry<String, List<String>> entry : source.entrySet()) {
            copy.put(entry.getKey(), Collections.unmodifiableList(new ArrayList<>(entry.getValue())));
        }
        return Collections.unmodifiableMap(copy);
    }

    private static String encodeForm(Map<String, String> form) {
        StringBuilder encoded = new StringBuilder();
        for (Map.Entry<String, String> entry : form.entrySet()) {
            if (encoded.length() > 0) {
                encoded.append('&');
            }
            encoded.append(formEncode(entry.getKey())).append('=').append(formEncode(entry.getValue()));
        }
        return encoded.toString();
    }

    private static String formEncode(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException impossible) {
            throw new IllegalStateException(impossible);
        }
    }

    /**
     * Builder for {@link ProxyRequest}.
     *
     * @since 2.6.0
     */
    public static final class Builder {
        private final String connectionName;
        private final String identifier;
        private final String path;
        private String method = "GET";
        private final Map<String, List<String>> queryParams = new LinkedHashMap<>();
        private final Map<String, List<String>> headers = new LinkedHashMap<>();
        private Object jsonBody;
        private Map<String, String> formBody;
        private byte[] rawBody;
        private String rawContentType;
        private Duration timeout = DEFAULT_TIMEOUT;

        private Builder(String connectionName, String identifier, String path) {
            this.connectionName = connectionName;
            this.identifier = identifier;
            this.path = path;
        }

        /**
         * Sets the HTTP method. Any method is accepted, including {@code PATCH}; it is upper-cased.
         *
         * @param method the method; defaults to {@code GET}
         * @return this builder
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * Adds a query parameter. Call it again with the same name to send several values. Names
         * and values are URL-encoded by the SDK.
         *
         * @param name  the parameter name
         * @param value the parameter value
         * @return this builder
         * @throws IllegalArgumentException if {@code name} or {@code value} is null
         */
        public Builder queryParam(String name, String value) {
            if (name == null || value == null) {
                throw new IllegalArgumentException("query parameter name and value must not be null");
            }
            List<String> values = queryParams.get(name);
            if (values == null) {
                values = new ArrayList<>();
                queryParams.put(name, values);
            }
            values.add(value);
            return this;
        }

        /**
         * Adds several query parameters.
         *
         * @param params the parameters
         * @return this builder
         * @throws IllegalArgumentException if a name or value is null
         */
        public Builder queryParams(Map<String, String> params) {
            if (params != null) {
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    queryParam(entry.getKey(), entry.getValue());
                }
            }
            return this;
        }

        /**
         * Adds a header. Call it again with the same name to send several values.
         *
         * @param name  the header name
         * @param value the header value
         * @return this builder
         * @throws IllegalArgumentException if the name is not a valid header name or is one the
         *                                  HTTP client manages, or the value is null or contains
         *                                  a control character or a character outside printable
         *                                  US-ASCII
         */
        public Builder header(String name, String value) {
            if (name == null || !isToken(name)) {
                throw new IllegalArgumentException("invalid header name: " + name);
            }
            if (RESTRICTED_HEADERS.contains(name.toLowerCase(Locale.ROOT))) {
                throw new IllegalArgumentException("header " + name + " cannot be set; the HTTP client manages it");
            }
            if (value == null) {
                throw new IllegalArgumentException("invalid value for header " + name);
            }
            checkHeaderValue(value, "header " + name);
            List<String> values = headers.get(name);
            if (values == null) {
                values = new ArrayList<>();
                headers.put(name, values);
            }
            values.add(value);
            return this;
        }

        /**
         * Adds several headers.
         *
         * @param headers the headers
         * @return this builder
         * @throws IllegalArgumentException under the same conditions as {@link #header(String, String)}
         */
        public Builder headers(Map<String, String> headers) {
            if (headers != null) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    header(entry.getKey(), entry.getValue());
                }
            }
            return this;
        }

        /**
         * Sets a JSON body, sent as {@code application/json}. Accepts a {@code Map<String, ?>} or a
         * List/array of JSON-compatible values (String, Number, Boolean, null, maps, lists).
         * Objects of your own classes are not serialized; convert them to maps first.
         *
         * @param body the body
         * @return this builder
         * @throws IllegalArgumentException if the body is not a map or list, or holds a value that
         *                                  is not JSON-compatible
         */
        public Builder jsonBody(Object body) {
            if (body == null) {
                throw new IllegalArgumentException("jsonBody must not be null");
            }
            Object copy = JsonValues.copyValue(body, "jsonBody");
            if (!(copy instanceof Map) && !(copy instanceof List)) {
                throw new IllegalArgumentException("jsonBody must be a Map, a List or an array; use rawBody for other content");
            }
            this.jsonBody = copy;
            return this;
        }

        /**
         * Sets a form body, sent as {@code application/x-www-form-urlencoded}.
         *
         * @param form the form fields
         * @return this builder
         * @throws IllegalArgumentException if the form is null or holds a null key or value
         */
        public Builder formBody(Map<String, String> form) {
            if (form == null) {
                throw new IllegalArgumentException("formBody must not be null");
            }
            this.formBody = Preconditions.copyStringMap(form, "formBody");
            return this;
        }

        /**
         * Sets a body of raw bytes.
         *
         * @param body        the bytes
         * @param contentType the content type, for example {@code application/xml}
         * @return this builder
         * @throws IllegalArgumentException if the body is null or the content type is blank
         */
        public Builder rawBody(byte[] body, String contentType) {
            if (body == null) {
                throw new IllegalArgumentException("rawBody must not be null");
            }
            this.rawContentType = Preconditions.requireNonBlank(contentType, "contentType");
            this.rawBody = body.clone();
            return this;
        }

        /**
         * Sets the deadline for the request. On Java 8 it applies to connecting and to each read
         * rather than to the whole exchange.
         *
         * @param timeout a positive duration; defaults to {@link #DEFAULT_TIMEOUT}
         * @return this builder
         */
        public Builder timeout(Duration timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * Builds the request.
         *
         * @return the request
         * @throws IllegalArgumentException if a rule in the class description is broken
         */
        public ProxyRequest build() {
            return new ProxyRequest(this);
        }
    }
}
