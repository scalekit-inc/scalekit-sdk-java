package com.scalekit.internal.proxy;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * {@link HttpTransport} on {@link HttpURLConnection}, for Java 8 and for runtimes without the
 * {@code java.net.http} module. Not part of the public API.
 *
 * <ul>
 *   <li>Redirects are off.</li>
 *   <li>Every request with a body, and every POST, PUT, PATCH or non-standard method, uses
 *       fixed-length streaming. Without it the JDK may silently resend a request whose connection
 *       was reset, which would duplicate a non-idempotent call.</li>
 *   <li>Methods {@code HttpURLConnection} rejects, such as PATCH, are set by reflection, as
 *       several HTTP libraries do. That works on Java 8-15; on later runtimes the JDK's internals
 *       are closed and such methods are reported as unsupported before any I/O.</li>
 *   <li>The deadline applies to connecting and to each read.</li>
 *   <li>A 401 or 407 to a streamed request comes back without headers or body, because
 *       {@code HttpURLConnection} discards them in streaming mode.</li>
 * </ul>
 */
public final class UrlConnectionTransport implements HttpTransport {

    private static final Set<String> STANDARD_METHODS = Collections.unmodifiableSet(new HashSet<>(
            Arrays.asList("GET", "POST", "HEAD", "OPTIONS", "PUT", "DELETE", "TRACE")));

    /** Methods sent without a body unless the caller supplies one. */
    private static final Set<String> BODYLESS_BY_DEFAULT = Collections.unmodifiableSet(new HashSet<>(
            Arrays.asList("GET", "HEAD", "OPTIONS", "TRACE", "DELETE")));

    private static final boolean CUSTOM_METHODS_SUPPORTED = probeCustomMethods();

    @Override
    public boolean supportsMethod(String method) {
        return STANDARD_METHODS.contains(method) || CUSTOM_METHODS_SUPPORTED;
    }

    @Override
    public HttpResult send(HttpCall call) throws IOException {
        URL url = call.uri.toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        try {
            connection.setInstanceFollowRedirects(false);
            connection.setUseCaches(false);
            connection.setDoInput(true);
            int millis = timeoutMillis(call.timeout);
            connection.setConnectTimeout(millis);
            connection.setReadTimeout(millis);
            setMethod(connection, call.method);
            for (Map.Entry<String, String> header : call.headers) {
                connection.addRequestProperty(header.getKey(), header.getValue());
            }

            boolean streamed = call.body != null || !BODYLESS_BY_DEFAULT.contains(call.method);
            if (streamed) {
                byte[] body = call.body == null ? new byte[0] : call.body;
                connection.setDoOutput(true);
                connection.setFixedLengthStreamingMode(body.length);
                try (OutputStream out = connection.getOutputStream()) {
                    out.write(body);
                }
            }

            int status = connection.getResponseCode();
            Map<String, List<String>> headers = new LinkedHashMap<>();
            for (Map.Entry<String, List<String>> entry : connection.getHeaderFields().entrySet()) {
                if (entry.getKey() != null) {
                    headers.put(entry.getKey(), new ArrayList<>(entry.getValue()));
                }
            }
            InputStream in = status >= 400 ? connection.getErrorStream() : connection.getInputStream();
            if (in == null && streamed && (status == HttpURLConnection.HTTP_UNAUTHORIZED
                    || status == HttpURLConnection.HTTP_PROXY_AUTH)) {
                // In streaming mode HttpURLConnection drops the connection on a 401/407 and
                // discards the body; only the status survives.
                return new HttpResult(status, headers, new byte[0], false);
            }
            byte[] body = in == null ? new byte[0] : readAll(in);
            return new HttpResult(status, headers, body);
        } catch (HttpRetryException authChallenge) {
            // In streaming mode HttpURLConnection reports a 401 or 407 this way and discards the
            // response, so only the status is known.
            connection.disconnect();
            int status = authChallenge.responseCode();
            if (status == HttpURLConnection.HTTP_UNAUTHORIZED || status == HttpURLConnection.HTTP_PROXY_AUTH) {
                return new HttpResult(status, Collections.<String, List<String>>emptyMap(), new byte[0], false);
            }
            throw authChallenge;
        } catch (SocketTimeoutException timeout) {
            connection.disconnect();
            throw new TransportTimeoutException("timed out after " + call.timeout, timeout);
        } catch (IOException | RuntimeException failure) {
            connection.disconnect();
            throw failure;
        }
    }

    private static byte[] readAll(InputStream in) throws IOException {
        try (InputStream input = in) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buffer = new byte[8192];
            int read;
            while ((read = input.read(buffer)) != -1) {
                out.write(buffer, 0, read);
            }
            return out.toByteArray();
        }
    }

    private static int timeoutMillis(Duration timeout) {
        long millis;
        try {
            millis = timeout.toMillis();
        } catch (ArithmeticException overflow) {
            millis = Integer.MAX_VALUE;
        }
        // 0 would mean "no timeout" to HttpURLConnection.
        return (int) Math.max(1, Math.min(Integer.MAX_VALUE, millis));
    }

    static void setMethod(HttpURLConnection connection, String method) {
        try {
            connection.setRequestMethod(method);
            return;
        } catch (ProtocolException notStandard) {
            // HttpURLConnection only knows the standard methods; fall through to the workaround.
        }
        try {
            Field methodField = HttpURLConnection.class.getDeclaredField("method");
            methodField.setAccessible(true);
            methodField.set(connection, method);
            Object delegate = delegateOf(connection);
            if (delegate instanceof HttpURLConnection) {
                methodField.set(delegate, method);
            }
        } catch (Exception | LinkageError blocked) {
            throw new UnsupportedOperationException("This Java runtime cannot send HTTP " + method
                    + " requests without the java.net.http module; on Java 11 or later add --add-modules java.net.http",
                    blocked);
        }
    }

    // HTTPS connections wrap the connection that writes the request line in a "delegate" field.
    private static Object delegateOf(HttpURLConnection connection) throws IllegalAccessException {
        for (Class<?> type = connection.getClass(); type != null && type != HttpURLConnection.class;
             type = type.getSuperclass()) {
            try {
                Field delegateField = type.getDeclaredField("delegate");
                delegateField.setAccessible(true);
                return delegateField.get(connection);
            } catch (NoSuchFieldException absent) {
                // keep walking up
            }
        }
        return null;
    }

    private static boolean probeCustomMethods() {
        try {
            HttpURLConnection probe = (HttpURLConnection) new URL("http://localhost/").openConnection();
            setMethod(probe, "PATCH");
            return "PATCH".equals(probe.getRequestMethod());
        } catch (IOException | RuntimeException unsupported) {
            return false;
        }
    }
}
