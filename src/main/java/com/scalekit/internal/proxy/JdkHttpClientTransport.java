package com.scalekit.internal.proxy;

import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * {@link HttpTransport} on {@code java.net.http.HttpClient} (Java 11+), reached through method
 * handles on its public API so that the SDK still compiles for, and loads on, Java 8. Not part of
 * the public API.
 *
 * <p>HTTP/1.1 is pinned and redirects are off. Any method can be sent. The client's default retry
 * policy never resends non-idempotent methods. The deadline covers the whole exchange.
 */
public final class JdkHttpClientTransport implements HttpTransport {

    private static final Handles HANDLES = Handles.load();

    /** Longest deadline passed to the HTTP client; longer ones are capped to avoid overflow. */
    static final Duration MAX_TIMEOUT = Duration.ofDays(24);

    private final Object client;

    /**
     * Creates a transport with its own HTTP client.
     *
     * @throws IllegalStateException if {@code java.net.http} is not available; check
     *                               {@link #isAvailable()} first
     */
    public JdkHttpClientTransport() {
        if (HANDLES == null) {
            throw new IllegalStateException("java.net.http is not available on this runtime");
        }
        this.client = HANDLES.newClient();
    }

    /**
     * Returns whether {@code java.net.http} can be used on this runtime.
     *
     * @return true on Java 11+ when the module is resolved
     */
    public static boolean isAvailable() {
        return HANDLES != null;
    }

    @Override
    public boolean supportsMethod(String method) {
        return true;
    }

    @Override
    public HttpResult send(HttpCall call) throws IOException, InterruptedException {
        Duration timeout = call.timeout.compareTo(MAX_TIMEOUT) > 0 ? MAX_TIMEOUT : call.timeout;
        CompletableFuture<?> future = HANDLES.sendAsync(client, call, timeout);
        Object response;
        try {
            response = future.get(timeout.toNanos(), TimeUnit.NANOSECONDS);
        } catch (TimeoutException expired) {
            future.cancel(true);
            throw new TransportTimeoutException("timed out after " + call.timeout, expired);
        } catch (InterruptedException interrupted) {
            future.cancel(true);
            throw interrupted;
        } catch (ExecutionException failed) {
            Throwable cause = failed.getCause() == null ? failed : failed.getCause();
            if (isHttpTimeout(cause)) {
                throw new TransportTimeoutException("timed out after " + call.timeout, cause);
            }
            if (cause instanceof IOException) {
                throw (IOException) cause;
            }
            throw new IOException(cause.getMessage(), cause);
        }
        return HANDLES.toResult(response);
    }

    private static boolean isHttpTimeout(Throwable error) {
        for (Class<?> type = error.getClass(); type != null; type = type.getSuperclass()) {
            if ("java.net.http.HttpTimeoutException".equals(type.getName())) {
                return true;
            }
        }
        return false;
    }


    /** Method handles on the public {@code java.net.http} API. */
    private static final class Handles {
        private final MethodHandle clientNewBuilder;
        private final MethodHandle clientBuilderVersion;
        private final MethodHandle clientBuilderFollowRedirects;
        private final MethodHandle clientBuilderBuild;
        private final Object http11;
        private final Object redirectNever;
        private final MethodHandle requestNewBuilder;
        private final MethodHandle requestBuilderMethod;
        private final MethodHandle requestBuilderHeader;
        private final MethodHandle requestBuilderTimeout;
        private final MethodHandle requestBuilderBuild;
        private final MethodHandle publisherOfByteArray;
        private final MethodHandle publisherNoBody;
        private final Object byteArrayHandler;
        private final MethodHandle clientSendAsync;
        private final MethodHandle responseStatusCode;
        private final MethodHandle responseHeaders;
        private final MethodHandle headersMap;
        private final MethodHandle responseBody;

        @SuppressWarnings({"unchecked", "rawtypes"})
        private Handles() throws Throwable {
            Class<?> httpClient = Class.forName("java.net.http.HttpClient");
            Class<?> clientBuilder = Class.forName("java.net.http.HttpClient$Builder");
            Class<?> version = Class.forName("java.net.http.HttpClient$Version");
            Class<?> redirect = Class.forName("java.net.http.HttpClient$Redirect");
            Class<?> httpRequest = Class.forName("java.net.http.HttpRequest");
            Class<?> requestBuilder = Class.forName("java.net.http.HttpRequest$Builder");
            Class<?> bodyPublisher = Class.forName("java.net.http.HttpRequest$BodyPublisher");
            Class<?> bodyPublishers = Class.forName("java.net.http.HttpRequest$BodyPublishers");
            Class<?> httpResponse = Class.forName("java.net.http.HttpResponse");
            Class<?> bodyHandler = Class.forName("java.net.http.HttpResponse$BodyHandler");
            Class<?> bodyHandlers = Class.forName("java.net.http.HttpResponse$BodyHandlers");
            Class<?> httpHeaders = Class.forName("java.net.http.HttpHeaders");
            MethodHandles.Lookup lookup = MethodHandles.publicLookup();

            clientNewBuilder = lookup.findStatic(httpClient, "newBuilder", MethodType.methodType(clientBuilder));
            clientBuilderVersion = lookup.findVirtual(clientBuilder, "version",
                    MethodType.methodType(clientBuilder, version));
            clientBuilderFollowRedirects = lookup.findVirtual(clientBuilder, "followRedirects",
                    MethodType.methodType(clientBuilder, redirect));
            clientBuilderBuild = lookup.findVirtual(clientBuilder, "build", MethodType.methodType(httpClient));
            http11 = Enum.valueOf((Class) version, "HTTP_1_1");
            redirectNever = Enum.valueOf((Class) redirect, "NEVER");

            requestNewBuilder = lookup.findStatic(httpRequest, "newBuilder",
                    MethodType.methodType(requestBuilder, URI.class));
            requestBuilderMethod = lookup.findVirtual(requestBuilder, "method",
                    MethodType.methodType(requestBuilder, String.class, bodyPublisher));
            requestBuilderHeader = lookup.findVirtual(requestBuilder, "header",
                    MethodType.methodType(requestBuilder, String.class, String.class));
            requestBuilderTimeout = lookup.findVirtual(requestBuilder, "timeout",
                    MethodType.methodType(requestBuilder, Duration.class));
            requestBuilderBuild = lookup.findVirtual(requestBuilder, "build", MethodType.methodType(httpRequest));
            publisherOfByteArray = lookup.findStatic(bodyPublishers, "ofByteArray",
                    MethodType.methodType(bodyPublisher, byte[].class));
            publisherNoBody = lookup.findStatic(bodyPublishers, "noBody", MethodType.methodType(bodyPublisher));
            byteArrayHandler = lookup.findStatic(bodyHandlers, "ofByteArray", MethodType.methodType(bodyHandler))
                    .invokeWithArguments();

            clientSendAsync = lookup.findVirtual(httpClient, "sendAsync",
                    MethodType.methodType(CompletableFuture.class, httpRequest, bodyHandler));
            responseStatusCode = lookup.findVirtual(httpResponse, "statusCode", MethodType.methodType(int.class));
            responseHeaders = lookup.findVirtual(httpResponse, "headers", MethodType.methodType(httpHeaders));
            headersMap = lookup.findVirtual(httpHeaders, "map", MethodType.methodType(Map.class));
            responseBody = lookup.findVirtual(httpResponse, "body", MethodType.methodType(Object.class));
        }

        static Handles load() {
            try {
                return new Handles();
            } catch (Throwable unavailable) {
                // Java 8, or a runtime without the java.net.http module.
                return null;
            }
        }

        Object newClient() {
            try {
                Object builder = clientNewBuilder.invokeWithArguments();
                builder = clientBuilderVersion.invokeWithArguments(builder, http11);
                builder = clientBuilderFollowRedirects.invokeWithArguments(builder, redirectNever);
                return clientBuilderBuild.invokeWithArguments(builder);
            } catch (Throwable failure) {
                throw new IllegalStateException("cannot create java.net.http.HttpClient", failure);
            }
        }

        CompletableFuture<?> sendAsync(Object client, HttpCall call, Duration timeout) throws IOException {
            Object request;
            try {
                Object builder = requestNewBuilder.invokeWithArguments(call.uri);
                Object publisher = call.body == null ? publisherNoBody.invokeWithArguments()
                        : publisherOfByteArray.invokeWithArguments((Object) call.body);
                builder = requestBuilderMethod.invokeWithArguments(builder, call.method, publisher);
                builder = requestBuilderTimeout.invokeWithArguments(builder, timeout);
                for (Map.Entry<String, String> header : call.headers) {
                    builder = requestBuilderHeader.invokeWithArguments(builder, header.getKey(), header.getValue());
                }
                request = requestBuilderBuild.invokeWithArguments(builder);
            } catch (RuntimeException | Error rethrown) {
                throw rethrown;
            } catch (Throwable failure) {
                throw new IOException("cannot build the request: " + failure.getMessage(), failure);
            }
            try {
                return (CompletableFuture<?>) clientSendAsync.invokeWithArguments(client, request, byteArrayHandler);
            } catch (RuntimeException | Error rethrown) {
                throw rethrown;
            } catch (Throwable failure) {
                throw new IOException("cannot send the request: " + failure.getMessage(), failure);
            }
        }

        @SuppressWarnings("unchecked")
        HttpResult toResult(Object response) throws IOException {
            try {
                int status = (Integer) responseStatusCode.invokeWithArguments(response);
                Object headers = responseHeaders.invokeWithArguments(response);
                Map<String, List<String>> map = (Map<String, List<String>>) headersMap.invokeWithArguments(headers);
                Map<String, List<String>> copy = new LinkedHashMap<>();
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    copy.put(entry.getKey(), new ArrayList<>(entry.getValue()));
                }
                Object body = responseBody.invokeWithArguments(response);
                return new HttpResult(status, copy, body == null ? new byte[0] : (byte[]) body);
            } catch (RuntimeException | Error rethrown) {
                throw rethrown;
            } catch (Throwable failure) {
                throw new IOException("cannot read the response: " + failure.getMessage(), failure);
            }
        }
    }
}
