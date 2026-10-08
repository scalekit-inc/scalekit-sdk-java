package com.scalekit.internal.proxy;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** A JDK HttpServer that records requests and replies from a script. Test code only. */
public final class StubHttpServer implements AutoCloseable {

    /** A recorded request. */
    public static final class Recorded {
        public final String method;
        public final String uri;
        public final Headers headers;
        public final byte[] body;

        Recorded(String method, String uri, Headers headers, byte[] body) {
            this.method = method;
            this.uri = uri;
            this.headers = headers;
            this.body = body;
        }

        public String bodyText() {
            return new String(body, StandardCharsets.UTF_8);
        }
    }

    /** A scripted reply. */
    public static final class Reply {
        final int status;
        final String body;
        final String[] headers;
        final long delayMillis;

        public Reply(int status, String body, long delayMillis, String... headers) {
            this.status = status;
            this.body = body;
            this.headers = headers;
            this.delayMillis = delayMillis;
        }
    }

    private final HttpServer server;
    private final ExecutorService executor = Executors.newCachedThreadPool();
    private final Deque<Reply> replies = new ArrayDeque<>();
    private final List<Recorded> proxyRequests = Collections.synchronizedList(new ArrayList<Recorded>());
    private final List<Recorded> tokenRequests = Collections.synchronizedList(new ArrayList<Recorded>());
    private volatile int tokenCounter;
    private volatile int tokenStatus = 200;

    public StubHttpServer() throws IOException {
        server = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
        server.setExecutor(executor);
        server.createContext("/oauth/token", exchange -> {
            tokenRequests.add(record(exchange));
            int count = ++tokenCounter;
            if (tokenStatus != 200) {
                respond(exchange, new Reply(tokenStatus, "{\"error\":\"invalid_client\"}", 0));
                return;
            }
            respond(exchange, new Reply(200, "{\"access_token\":\"token-" + count + "\",\"token_type\":\"Bearer\"}", 0,
                    "Content-Type", "application/json"));
        });
        server.createContext("/", exchange -> {
            proxyRequests.add(record(exchange));
            Reply reply;
            synchronized (replies) {
                reply = replies.poll();
            }
            respond(exchange, reply == null ? new Reply(200, "{}", 0, "Content-Type", "application/json") : reply);
        });
        server.start();
    }

    public String baseUrl() {
        return "http://127.0.0.1:" + server.getAddress().getPort();
    }

    public void enqueue(Reply... scripted) {
        synchronized (replies) {
            Collections.addAll(replies, scripted);
        }
    }

    public void failTokenRequests(int status) {
        this.tokenStatus = status;
    }

    public List<Recorded> proxyRequests() {
        return new ArrayList<>(proxyRequests);
    }

    public List<Recorded> tokenRequests() {
        return new ArrayList<>(tokenRequests);
    }

    private static Recorded record(HttpExchange exchange) throws IOException {
        ByteArrayOutputStream body = new ByteArrayOutputStream();
        try (InputStream in = exchange.getRequestBody()) {
            byte[] buffer = new byte[4096];
            int read;
            while ((read = in.read(buffer)) != -1) {
                body.write(buffer, 0, read);
            }
        }
        return new Recorded(exchange.getRequestMethod(), exchange.getRequestURI().toString(),
                exchange.getRequestHeaders(), body.toByteArray());
    }

    private static void respond(HttpExchange exchange, Reply reply) throws IOException {
        try {
            if (reply.delayMillis > 0) {
                try {
                    Thread.sleep(reply.delayMillis);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            for (int i = 0; i + 1 < reply.headers.length; i += 2) {
                exchange.getResponseHeaders().add(reply.headers[i], reply.headers[i + 1]);
            }
            byte[] bytes = reply.body.getBytes(StandardCharsets.UTF_8);
            boolean noBody = "HEAD".equals(exchange.getRequestMethod()) || reply.status == 204 || reply.status == 304;
            exchange.sendResponseHeaders(reply.status, noBody ? -1 : (bytes.length == 0 ? -1 : bytes.length));
            if (!noBody && bytes.length > 0) {
                try (OutputStream out = exchange.getResponseBody()) {
                    out.write(bytes);
                }
            }
        } catch (IOException clientWentAway) {
            // The client timed out; nothing to do.
        } finally {
            exchange.close();
        }
    }

    @Override
    public void close() {
        server.stop(0);
        executor.shutdownNow();
    }
}
