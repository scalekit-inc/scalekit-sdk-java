import com.scalekit.Environment;
import com.scalekit.api.AuthClient;
import com.scalekit.api.PasswordlessClient;
import com.scalekit.api.impl.ScalekitPasswordlessClient;
import com.scalekit.grpc.scalekit.v1.auth.passwordless.PasswordlessServiceGrpc;
import com.scalekit.grpc.scalekit.v1.auth.passwordless.PasswordlessType;
import com.scalekit.grpc.scalekit.v1.auth.passwordless.ResendPasswordlessRequest;
import com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessRequest;
import com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse;
import com.scalekit.grpc.scalekit.v1.auth.passwordless.TemplateType;
import com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessRequest;
import com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessResponse;
import com.scalekit.internal.ScalekitCredentials;
import com.scalekit.internal.http.SendPasswordlessOptions;
import com.scalekit.internal.http.VerifyPasswordlessOptions;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class PasswordlessTests {

    private static PasswordlessClient passwordlessClient;
    private static FakePasswordlessService fakeService;
    private static Server server;
    private static ManagedChannel channel;

    @BeforeAll
    static void init() throws IOException {
        Environment.configure("https://test.scalekit.local", "test-client-id", "test-client-secret");

        fakeService = new FakePasswordlessService();
        server = ServerBuilder.forPort(0)
                .addService(fakeService)
                .build()
                .start();

        channel = ManagedChannelBuilder.forAddress("localhost", server.getPort())
                .usePlaintext()
                .build();

        AuthClient authClient = Mockito.mock(AuthClient.class);
        when(authClient.getClientAccessToken()).thenReturn("test-access-token");

        ScalekitCredentials credentials = new ScalekitCredentials(authClient);
        passwordlessClient = new ScalekitPasswordlessClient(channel, credentials);
    }

    @AfterAll
    static void cleanup() throws InterruptedException {
        if (channel != null) {
            channel.shutdownNow();
            channel.awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS);
        }
        if (server != null) {
            server.shutdownNow();
            server.awaitTermination();
        }
    }

    @Test
    public void testSendPasswordlessEmailWithDefaultOptions() {
        String testEmail = "test@example.com";

        SendPasswordlessOptions options = new SendPasswordlessOptions();
        options.setMagiclinkAuthUri("https://example.com/auth/callback");

        SendPasswordlessResponse response = passwordlessClient.sendPasswordlessEmail(testEmail, options);

        assertNotNull(response);
        assertNotNull(response.getAuthRequestId());
        assertTrue(response.getExpiresAt() > 0);
        assertTrue(response.getExpiresIn() > 0);
        assertNotNull(response.getPasswordlessType());

        assertNotNull(fakeService.lastSendRequest);
        assertEquals(testEmail, fakeService.lastSendRequest.getEmail());
        assertEquals("https://example.com/auth/callback", fakeService.lastSendRequest.getMagiclinkAuthUri());
    }

    @Test
    public void testSendPasswordlessEmailWithCustomOptions() {
        String testEmail = "test@example.com";

        SendPasswordlessOptions options = new SendPasswordlessOptions();
        options.setTemplate(TemplateType.SIGNIN);
        options.setState("test-state");
        options.setMagiclinkAuthUri("https://example.com/auth");
        options.setExpiresIn(7200);
        options.setTemplateVariables(new HashMap<>());

        SendPasswordlessResponse response = passwordlessClient.sendPasswordlessEmail(testEmail, options);

        assertNotNull(response);
        assertNotNull(response.getAuthRequestId());
        assertTrue(response.getExpiresAt() > 0);
        assertTrue(response.getExpiresIn() > 0);
        assertNotNull(response.getPasswordlessType());

        assertNotNull(fakeService.lastSendRequest);
        assertEquals(TemplateType.SIGNIN, fakeService.lastSendRequest.getTemplate());
        assertEquals("test-state", fakeService.lastSendRequest.getState());
        assertEquals("https://example.com/auth", fakeService.lastSendRequest.getMagiclinkAuthUri());
        assertEquals(7200, fakeService.lastSendRequest.getExpiresIn());
    }

    @Test
    public void testSendPasswordlessEmailWithTemplateVariables() {
        String testEmail = "test@example.com";

        Map<String, String> templateVariables = new HashMap<>();
        templateVariables.put("company_name", "Test Company");
        templateVariables.put("app_name", "Test App");

        SendPasswordlessOptions options = new SendPasswordlessOptions();
        options.setTemplate(TemplateType.SIGNUP);
        options.setTemplateVariables(templateVariables);
        options.setMagiclinkAuthUri("https://example.com/auth/callback");

        SendPasswordlessResponse response = passwordlessClient.sendPasswordlessEmail(testEmail, options);

        assertNotNull(response);
        assertNotNull(response.getAuthRequestId());
        assertTrue(response.getExpiresAt() > 0);
        assertTrue(response.getExpiresIn() > 0);
        assertNotNull(response.getPasswordlessType());

        assertNotNull(fakeService.lastSendRequest);
        assertEquals(TemplateType.SIGNUP, fakeService.lastSendRequest.getTemplate());
        assertEquals("Test Company", fakeService.lastSendRequest.getTemplateVariablesMap().get("company_name"));
        assertEquals("Test App", fakeService.lastSendRequest.getTemplateVariablesMap().get("app_name"));
    }

    @Test
    public void testSendPasswordlessEmailWithInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> passwordlessClient.sendPasswordlessEmail(null));
        assertThrows(IllegalArgumentException.class, () -> passwordlessClient.sendPasswordlessEmail(""));
        assertThrows(IllegalArgumentException.class, () -> passwordlessClient.sendPasswordlessEmail("   "));
    }

    @Test
    public void testResendPasswordlessEmail() {
        String testEmail = "test@example.com";

        SendPasswordlessOptions options = new SendPasswordlessOptions();
        options.setMagiclinkAuthUri("https://example.com/auth/callback");

        SendPasswordlessResponse originalResponse = passwordlessClient.sendPasswordlessEmail(testEmail, options);

        assertNotNull(originalResponse);
        assertNotNull(originalResponse.getAuthRequestId());

        SendPasswordlessResponse resendResponse = passwordlessClient.resendPasswordlessEmail(originalResponse.getAuthRequestId());

        assertNotNull(resendResponse);
        assertNotNull(resendResponse.getAuthRequestId());
        assertTrue(resendResponse.getExpiresAt() > 0);
        assertTrue(resendResponse.getExpiresIn() > 0);
        assertNotNull(resendResponse.getPasswordlessType());
        assertEquals(originalResponse.getAuthRequestId(), resendResponse.getAuthRequestId());

        assertNotNull(fakeService.lastResendRequest);
        assertEquals(originalResponse.getAuthRequestId(), fakeService.lastResendRequest.getAuthRequestId());
    }

    @Test
    public void testResendPasswordlessEmailWithInvalidAuthRequestId() {
        assertThrows(IllegalArgumentException.class, () -> passwordlessClient.resendPasswordlessEmail(null));
        assertThrows(IllegalArgumentException.class, () -> passwordlessClient.resendPasswordlessEmail(""));
        assertThrows(IllegalArgumentException.class, () -> passwordlessClient.resendPasswordlessEmail("   "));
    }

    @Test
    public void testVerifyPasswordlessEmailWithInvalidCredential() {
        assertThrows(IllegalArgumentException.class, () -> passwordlessClient.verifyPasswordlessEmail(null));

        VerifyPasswordlessOptions emptyOptions = new VerifyPasswordlessOptions();
        assertThrows(IllegalArgumentException.class, () -> passwordlessClient.verifyPasswordlessEmail(emptyOptions));

        VerifyPasswordlessOptions nullOptions = new VerifyPasswordlessOptions();
        nullOptions.setCode(null);
        nullOptions.setLinkToken(null);
        assertThrows(IllegalArgumentException.class, () -> passwordlessClient.verifyPasswordlessEmail(nullOptions));
    }

    private static class FakePasswordlessService extends PasswordlessServiceGrpc.PasswordlessServiceImplBase {
        private volatile SendPasswordlessRequest lastSendRequest;
        private volatile ResendPasswordlessRequest lastResendRequest;

        @Override
        public void sendPasswordlessEmail(SendPasswordlessRequest request, StreamObserver<SendPasswordlessResponse> responseObserver) {
            lastSendRequest = request;
            SendPasswordlessResponse response = SendPasswordlessResponse.newBuilder()
                    .setAuthRequestId("test-auth-request-id")
                    .setExpiresAt((System.currentTimeMillis() / 1000L) + 3600)
                    .setExpiresIn(request.getExpiresIn() > 0 ? request.getExpiresIn() : 3600)
                    .setPasswordlessType(PasswordlessType.LINK)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void resendPasswordlessEmail(ResendPasswordlessRequest request, StreamObserver<SendPasswordlessResponse> responseObserver) {
            lastResendRequest = request;
            SendPasswordlessResponse response = SendPasswordlessResponse.newBuilder()
                    .setAuthRequestId(request.getAuthRequestId())
                    .setExpiresAt((System.currentTimeMillis() / 1000L) + 3600)
                    .setExpiresIn(3600)
                    .setPasswordlessType(PasswordlessType.LINK)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void verifyPasswordlessEmail(VerifyPasswordLessRequest request, StreamObserver<VerifyPasswordLessResponse> responseObserver) {
            VerifyPasswordLessResponse response = VerifyPasswordLessResponse.newBuilder()
                    .setEmail("test@example.com")
                    .setPasswordlessType(PasswordlessType.LINK)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

}
