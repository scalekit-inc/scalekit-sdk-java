package com.scalekit.internal.proxy;

import com.scalekit.exceptions.AuthenticationException;
import com.scalekit.exceptions.ProxyException;
import com.scalekit.exceptions.ScalekitConnectionException;
import com.scalekit.exceptions.ScalekitTimeoutException;
import com.scalekit.internal.Constants;
import com.scalekit.internal.ScalekitCredentials;
import com.scalekit.models.proxy.ProxyRequest;
import com.scalekit.models.proxy.ProxyResponse;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Supplier;

/**
 * Sends {@link ProxyRequest}s to {@code <environment URL>/proxy<path>} with the client's access
 * token. Not part of the public API.
 *
 * <ul>
 *   <li>The token comes from the shared {@link ScalekitCredentials} cache and is fetched on a cold
 *       start.</li>
 *   <li>A 401 with a JSON content type whose body is exactly {@code {"detail", "code"}} with
 *       {@code "code": "UNAUTHORIZED"} is Scalekit rejecting the token before anything is
 *       forwarded: the token is refreshed and the request sent once more, but only when the
 *       refresh produced a different token (the credentials' 5-second refresh debounce can
 *       prevent that). Any other 401 came from the upstream API and is never resent.</li>
 *   <li>Nothing else is retried.</li>
 * </ul>
 */
public final class ProxyExecutor {

    private static final String UNAUTHORIZED_CODE = "UNAUTHORIZED";

    private final String baseUrl;
    private final ScalekitCredentials credentials;
    private final Supplier<HttpTransport> transportFactory;
    private final ReentrantLock transportLock = new ReentrantLock();
    private volatile HttpTransport transport;

    /**
     * Creates an executor that picks the best transport for the runtime on first use.
     *
     * @param environmentUrl the environment URL
     * @param credentials    the client's credentials
     */
    public ProxyExecutor(String environmentUrl, ScalekitCredentials credentials) {
        this(environmentUrl, credentials, ProxyExecutor::defaultTransport);
    }

    /**
     * Creates an executor with a specific transport.
     *
     * @param environmentUrl   the environment URL
     * @param credentials      the client's credentials
     * @param transportFactory creates the transport on first use
     */
    public ProxyExecutor(String environmentUrl, ScalekitCredentials credentials,
                         Supplier<HttpTransport> transportFactory) {
        String url = environmentUrl == null ? "" : environmentUrl.trim();
        while (url.endsWith("/")) {
            url = url.substring(0, url.length() - 1);
        }
        this.baseUrl = url;
        this.credentials = credentials;
        this.transportFactory = transportFactory;
    }

    /**
     * Returns the transport for this runtime: {@code java.net.http} when available, otherwise
     * {@code HttpURLConnection}.
     *
     * @return a new transport
     */
    public static HttpTransport defaultTransport() {
        return JdkHttpClientTransport.isAvailable() ? new JdkHttpClientTransport() : new UrlConnectionTransport();
    }

    /**
     * Sends a request.
     *
     * @param request the request
     * @return the response, for statuses below 400
     * @throws IllegalArgumentException      if {@code request} is null or its path is not a valid URI path
     * @throws UnsupportedOperationException if the runtime cannot send the method
     * @throws ProxyException                for statuses of 400 and above
     * @throws AuthenticationException       if no access token can be obtained
     * @throws ScalekitTimeoutException      if the deadline passes
     * @throws ScalekitConnectionException   if the exchange fails or the thread is interrupted
     */
    public ProxyResponse execute(ProxyRequest request) {
        if (request == null) {
            throw new IllegalArgumentException("request is required");
        }
        HttpTransport http = transport();
        if (!http.supportsMethod(request.method())) {
            throw new UnsupportedOperationException("This Java runtime cannot send HTTP " + request.method()
                    + " requests without the java.net.http module; on Java 11 or later add --add-modules java.net.http");
        }
        URI uri = buildUri(request);
        if (Thread.currentThread().isInterrupted()) {
            throw new ScalekitConnectionException("proxy request not sent: the thread is interrupted",
                    new InterruptedException());
        }

        String token = currentToken();
        HttpResult result = send(http, request, uri, token);
        if (result.status == 401) {
            if (isScalekitUnauthorized(result)) {
                String refreshed = refreshToken();
                if (refreshed != null && !refreshed.equals(token)) {
                    result = send(http, request, uri, refreshed);
                }
            } else if (!result.bodyAvailable) {
                // The transport could not read the body, so the 401 cannot be attributed. Never
                // resend; refresh the token so that a stale one does not fail the next call too.
                try {
                    refreshToken();
                } catch (AuthenticationException ignored) {
                    // The 401 below is the error the caller needs to see.
                }
            }
        }

        ProxyResponse response = ProxyResponse.builder()
                .statusCode(result.status)
                .headers(result.headers)
                .body(result.body)
                .build();
        if (result.status >= 400) {
            throw new ProxyException(response);
        }
        return response;
    }

    private HttpTransport transport() {
        HttpTransport current = transport;
        if (current == null) {
            transportLock.lock();
            try {
                current = transport;
                if (current == null) {
                    current = transportFactory.get();
                    transport = current;
                }
            } finally {
                transportLock.unlock();
            }
        }
        return current;
    }

    private String currentToken() {
        String token = credentials.getToken();
        if (token != null) {
            return token;
        }
        token = refreshToken();
        if (token == null) {
            throw new AuthenticationException("Failed to obtain a Scalekit access token", null);
        }
        return token;
    }

    private String refreshToken() {
        try {
            credentials.updateCredentials();
        } catch (RuntimeException e) {
            Throwable cause = e.getCause() != null ? e.getCause() : e;
            throw new AuthenticationException("Failed to obtain a Scalekit access token: " + cause.getMessage(), e);
        }
        return credentials.getToken();
    }

    private HttpResult send(HttpTransport http, ProxyRequest request, URI uri, String token) {
        HttpCall call = new HttpCall(request.method(), uri, headers(request, token), request.body().orElse(null),
                request.timeout());
        try {
            return http.send(call);
        } catch (TransportTimeoutException e) {
            throw new ScalekitTimeoutException("proxy request timed out after " + request.timeout(), e);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new ScalekitConnectionException("proxy request interrupted", e);
        } catch (IOException e) {
            throw new ScalekitConnectionException("proxy request failed: " + e.getMessage(), e);
        }
    }

    private static List<Map.Entry<String, String>> headers(ProxyRequest request, String token) {
        List<Map.Entry<String, String>> headers = new ArrayList<>();
        boolean hasContentType = false;
        boolean hasUserAgent = false;
        for (Map.Entry<String, List<String>> header : request.headers().entrySet()) {
            String name = header.getKey().toLowerCase(Locale.ROOT);
            if ("authorization".equals(name) || "connection_name".equals(name) || "identifier".equals(name)) {
                continue;
            }
            hasContentType |= "content-type".equals(name);
            hasUserAgent |= "user-agent".equals(name);
            for (String value : header.getValue()) {
                headers.add(entry(header.getKey(), value));
            }
        }
        if (!hasContentType && request.contentType().isPresent()) {
            headers.add(entry("Content-Type", request.contentType().get()));
        }
        if (!hasUserAgent) {
            headers.add(entry("User-Agent", "scalekit-sdk-java/" + Constants.version));
        }
        headers.add(entry("Authorization", Constants.BEARER_TYPE + " " + token));
        headers.add(entry("connection_name", request.connectionName()));
        headers.add(entry("identifier", request.identifier()));
        return headers;
    }

    private static Map.Entry<String, String> entry(String name, String value) {
        return new AbstractMap.SimpleImmutableEntry<>(name, value);
    }

    private URI buildUri(ProxyRequest request) {
        StringBuilder url = new StringBuilder(baseUrl).append("/proxy").append(encodePath(request.path()));
        char separator = request.path().indexOf('?') >= 0 ? '&' : '?';
        for (Map.Entry<String, List<String>> param : request.queryParams().entrySet()) {
            for (String value : param.getValue()) {
                url.append(separator).append(encodeComponent(param.getKey())).append('=').append(encodeComponent(value));
                separator = '&';
            }
        }
        return URI.create(url.toString());
    }

    /** Percent-encodes characters that may not appear in a URI, keeping existing escapes. */
    static String encodePath(String path) {
        StringBuilder encoded = new StringBuilder(path.length());
        byte[] bytes = path.getBytes(StandardCharsets.UTF_8);
        for (byte b : bytes) {
            int c = b & 0xff;
            if (c < 0x80 && isUriChar((char) c)) {
                encoded.append((char) c);
            } else {
                encoded.append('%').append(Character.toUpperCase(Character.forDigit(c >> 4, 16)))
                        .append(Character.toUpperCase(Character.forDigit(c & 0xf, 16)));
            }
        }
        return encoded.toString();
    }

    private static boolean isUriChar(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')
                || "-._~:/?#@!$&'()*+,;=%".indexOf(c) >= 0;
    }

    private static String encodeComponent(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.name()).replace("+", "%20");
        } catch (UnsupportedEncodingException impossible) {
            throw new IllegalStateException(impossible);
        }
    }

    /**
     * Returns whether a 401 is Scalekit's own rejection of the access token: a JSON response whose
     * body is exactly {@code {"detail": ..., "code": "UNAUTHORIZED"}}. Anything else, including a
     * look-alike body with extra keys or a non-JSON content type, is treated as the upstream API's
     * and never resent.
     */
    static boolean isScalekitUnauthorized(HttpResult result) {
        if (!result.bodyAvailable || result.body.length == 0) {
            return false;
        }
        ProxyResponse parsed = ProxyResponse.builder().headers(result.headers).body(result.body).build();
        if (!isJson(parsed.header("Content-Type").orElse(null))) {
            return false;
        }
        Map<String, Object> body;
        try {
            body = parsed.bodyAsJsonObject();
        } catch (IllegalStateException notJsonObject) {
            return false;
        }
        return body.size() == 2 && body.containsKey("detail") && UNAUTHORIZED_CODE.equals(body.get("code"));
    }

    private static boolean isJson(String contentType) {
        if (contentType == null) {
            return false;
        }
        String mediaType = contentType.split(";", 2)[0].trim().toLowerCase(Locale.ROOT);
        return "application/json".equals(mediaType) || mediaType.endsWith("+json");
    }
}
