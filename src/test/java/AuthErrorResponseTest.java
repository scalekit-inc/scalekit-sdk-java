import com.scalekit.Environment;
import com.scalekit.api.impl.ScalekitAuthClient;
import com.scalekit.exceptions.APIException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * An error from the token endpoint keeps the server's OAuth error in the exception message,
 * including a 401, whose body HttpURLConnection discards for a streamed POST.
 *
 * Runs offline against a local socket that answers every request with a fixed response.
 */
public class AuthErrorResponseTest {

    private ServerSocket server;

    private void start(int status, String body) throws IOException {
        server = new ServerSocket(0);
        Thread acceptor = new Thread(() -> {
            while (!server.isClosed()) {
                try (Socket socket = server.accept()) {
                    BufferedReader reader = new BufferedReader(
                            new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                    String line;
                    int length = 0;
                    while ((line = reader.readLine()) != null && !line.isEmpty()) {
                        if (line.toLowerCase().startsWith("content-length:")) {
                            length = Integer.parseInt(line.substring(15).trim());
                        }
                    }
                    for (int i = 0; i < length; i++) {
                        reader.read();
                    }
                    byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
                    OutputStream out = socket.getOutputStream();
                    out.write(("HTTP/1.1 " + status + " Error\r\nContent-Type: application/json\r\nContent-Length: "
                            + bytes.length + "\r\nConnection: close\r\n\r\n").getBytes(StandardCharsets.US_ASCII));
                    out.write(bytes);
                    out.flush();
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
    void unauthorizedNamesInvalidClient() throws IOException {
        start(401, "{\"error\":\"invalid_client\"}");
        APIException e = assertThrows(APIException.class,
                () -> new ScalekitAuthClient().generateClientToken("cid", "wrong"));
        assertTrue(e.getMessage().contains("401") && e.getMessage().contains("invalid_client"), e.getMessage());
    }

    @Test
    void badRequestKeepsTheServerBody() throws IOException {
        start(400, "{\"error\":\"invalid_grant\",\"error_description\":\"invalid code\"}");
        APIException e = assertThrows(APIException.class,
                () -> new ScalekitAuthClient().generateClientToken("cid", "secret"));
        assertTrue(e.getMessage().contains("{\"error\":\"invalid_grant\",\"error_description\":\"invalid code\"}"), e.getMessage());
    }
}
