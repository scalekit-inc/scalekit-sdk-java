import com.scalekit.ScalekitClient;
import com.scalekit.api.PasswordlessClient;
import com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse;
import com.scalekit.grpc.scalekit.v1.auth.passwordless.TemplateType;
import com.scalekit.internal.http.SendPasswordlessOptions;
import com.scalekit.internal.http.VerifyPasswordlessOptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordlessTests {

    private static ScalekitClient client;
    private static PasswordlessClient passwordlessClient;

    @BeforeAll
    static void init() {
        // Init client
        String environmentUrl = System.getenv("SCALEKIT_ENVIRONMENT_URL");
        String clientId = System.getenv("SCALEKIT_CLIENT_ID");
        String apiSecret = System.getenv("SCALEKIT_CLIENT_SECRET");

        client = new ScalekitClient(environmentUrl, clientId, apiSecret);
        passwordlessClient = client.passwordless();
    }

    @Test
    public void testSendPasswordlessEmailWithDefaultOptions() {
        // Test sending passwordless email with default options
        String testEmail = "test@example.com";
        
        SendPasswordlessResponse response = passwordlessClient.sendPasswordlessEmail(testEmail);
        
        assertNotNull(response);
        assertNotNull(response.getAuthRequestId());
        assertTrue(response.getExpiresAt() > 0);
        assertTrue(response.getExpiresIn() > 0);
        assertNotNull(response.getPasswordlessType());
    }

    @Test
    public void testSendPasswordlessEmailWithCustomOptions() {
        // Test sending passwordless email with custom options
        String testEmail = "test@example.com";
        
        SendPasswordlessOptions options = new SendPasswordlessOptions();
        options.setTemplate(TemplateType.SIGNIN);
        options.setState("test-state");
        options.setMagiclinkAuthUri("https://example.com/auth");
        options.setExpiresIn(7200); // 2 hours
        options.setTemplateVariables(new HashMap<>());
        
        SendPasswordlessResponse response = passwordlessClient.sendPasswordlessEmail(testEmail, options);
        
        assertNotNull(response);
        assertNotNull(response.getAuthRequestId());
        assertTrue(response.getExpiresAt() > 0);
        assertTrue(response.getExpiresIn() > 0);
        assertNotNull(response.getPasswordlessType());
    }

    @Test
    public void testSendPasswordlessEmailWithTemplateVariables() {
        // Test sending passwordless email with template variables
        String testEmail = "test@example.com";
        
        Map<String, String> templateVariables = new HashMap<>();
        templateVariables.put("company_name", "Test Company");
        templateVariables.put("app_name", "Test App");
        
        SendPasswordlessOptions options = new SendPasswordlessOptions();
        options.setTemplate(TemplateType.SIGNUP);
        options.setTemplateVariables(templateVariables);
        
        SendPasswordlessResponse response = passwordlessClient.sendPasswordlessEmail(testEmail, options);
        
        assertNotNull(response);
        assertNotNull(response.getAuthRequestId());
        assertTrue(response.getExpiresAt() > 0);
        assertTrue(response.getExpiresIn() > 0);
        assertNotNull(response.getPasswordlessType());
    }

    @Test
    public void testSendPasswordlessEmailWithInvalidEmail() {
        // Test sending passwordless email with invalid email
        assertThrows(IllegalArgumentException.class, () -> {
            passwordlessClient.sendPasswordlessEmail(null);
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            passwordlessClient.sendPasswordlessEmail("");
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            passwordlessClient.sendPasswordlessEmail("   ");
        });
    }

    @Test
    public void testResendPasswordlessEmail() {
        // First send a passwordless email to get an auth request ID
        String testEmail = "test@example.com";
        SendPasswordlessResponse originalResponse = passwordlessClient.sendPasswordlessEmail(testEmail);
        
        assertNotNull(originalResponse);
        assertNotNull(originalResponse.getAuthRequestId());
        
        // Now resend the passwordless email
        SendPasswordlessResponse resendResponse = passwordlessClient.resendPasswordlessEmail(originalResponse.getAuthRequestId());
        
        assertNotNull(resendResponse);
        assertNotNull(resendResponse.getAuthRequestId());
        assertTrue(resendResponse.getExpiresAt() > 0);
        assertTrue(resendResponse.getExpiresIn() > 0);
        assertNotNull(resendResponse.getPasswordlessType());
        
        // The new auth request ID should be different from the original
        assertNotEquals(originalResponse.getAuthRequestId(), resendResponse.getAuthRequestId());
    }

    @Test
    public void testResendPasswordlessEmailWithInvalidAuthRequestId() {
        // Test resending passwordless email with invalid auth request ID
        assertThrows(IllegalArgumentException.class, () -> {
            passwordlessClient.resendPasswordlessEmail(null);
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            passwordlessClient.resendPasswordlessEmail("");
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            passwordlessClient.resendPasswordlessEmail("   ");
        });
    }

    @Test
    public void testVerifyPasswordlessOptionsCreation() {
        // Test creating options with code
        VerifyPasswordlessOptions codeOptions = new VerifyPasswordlessOptions();
        codeOptions.setCode("123456");
        assertEquals("123456", codeOptions.getCode());
        assertNull(codeOptions.getLinkToken());
        
        // Test creating options with link token
        VerifyPasswordlessOptions linkOptions = new VerifyPasswordlessOptions();
        linkOptions.setLinkToken("link-token-123");
        assertEquals("link-token-123", linkOptions.getLinkToken());
        assertNull(linkOptions.getCode());
        
        // Test creating options with both
        VerifyPasswordlessOptions bothOptions = new VerifyPasswordlessOptions();
        bothOptions.setCode("123456");
        bothOptions.setLinkToken("link-token-123");
        assertEquals("123456", bothOptions.getCode());
        assertEquals("link-token-123", bothOptions.getLinkToken());
    }

    @Test
    public void testVerifyPasswordlessEmailWithInvalidCredential() {
        // Test verifying with null credential
        assertThrows(IllegalArgumentException.class, () -> {
            passwordlessClient.verifyPasswordlessEmail(null);
        });
        
        // Test verifying with empty credential
        VerifyPasswordlessOptions emptyOptions = new VerifyPasswordlessOptions();
        assertThrows(IllegalArgumentException.class, () -> {
            passwordlessClient.verifyPasswordlessEmail(emptyOptions);
        });
        
        // Test verifying with both code and linkToken null
        VerifyPasswordlessOptions nullOptions = new VerifyPasswordlessOptions();
        nullOptions.setCode(null);
        nullOptions.setLinkToken(null);
        assertThrows(IllegalArgumentException.class, () -> {
            passwordlessClient.verifyPasswordlessEmail(nullOptions);
        });
    }
} 