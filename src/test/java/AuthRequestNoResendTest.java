import com.scalekit.Environment;
import com.scalekit.api.impl.ScalekitAuthClient;
import com.scalekit.exceptions.APIException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * A form POST to the token endpoint must be sent once, even when the server drops the
 * connection without answering. A silent resend could replay a single-use authorization code.
 *
 * Runs offline against a local socket that reads each request and closes the connection.
 */
public class AuthRequestNoResendTest {

    private ServerSocket server;
    private final AtomicInteger posts = new AtomicInteger();

    @BeforeEach
    void start() throws IOException {
        server = new ServerSocket(0);
        Thread acceptor = new Thread(() -> {
            while (!server.isClosed()) {
                try (Socket socket = server.accept()) {
                    BufferedReader reader = new BufferedReader(
                            new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                    String line = reader.readLine();
                    if (line != null && line.startsWith("POST")) {
                        posts.incrementAndGet();
                    }
                    while ((line = reader.readLine()) != null && !line.isEmpty()) {
                        // skip the headers, then close without a response
                    }
                } catch (IOException e) {
                    // server closed
                }
            }
        });
        acceptor.setDaemon(true);
        acceptor.start();
        Environment.configure("http://localhost:" + server.getLocalPort(), "cid", "secret");
    }

    @AfterEach
    void stop() throws IOException {
        server.close();
    }

    @Test
    void tokenRequestIsNotResentAfterConnectionReset() throws InterruptedException {
        ScalekitAuthClient auth = new ScalekitAuthClient();
        assertThrows(APIException.class, () -> auth.generateClientToken("cid", "secret"));
        Thread.sleep(200);
        assertEquals(1, posts.get());
    }
}
