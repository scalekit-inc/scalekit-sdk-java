import com.scalekit.Environment;
import com.scalekit.api.impl.ScalekitAuthClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.internal.http.TokenValidationOptions;
import com.sun.net.httpserver.HttpServer;
import org.jose4j.jwk.JsonWebKeySet;
import org.jose4j.jwk.RsaJsonWebKey;
import org.jose4j.jwk.RsaJwkGenerator;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.NumericDate;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Multi-issuer validation: a token is valid if its iss claim exactly equals ANY
 * accepted issuer (the legacy single {@code issuer} and/or any entry of {@code issuers}).
 * Nothing configured / null / empty issuers skips the check; a non-empty issuers
 * list is always enforced (even with blank entries), so it fails closed.
 *
 * Runs offline: signing keys are served from a local HTTP server that stands in
 * for the environment's /keys endpoint, and tokens are signed locally.
 */
public class MultiIssuerTokenValidationTest {

    private static final String ENV_URL = "https://acme.scalekit.cloud";
    private static final String BASE = ENV_URL;
    private static final String RESOURCE = ENV_URL + "/resources/res_123";

    private static RsaJsonWebKey signingKey;
    private static HttpServer jwksServer;
    private static ScalekitAuthClient auth;

    @BeforeAll
    static void init() throws Exception {
        signingKey = RsaJwkGenerator.generateJwk(2048);
        signingKey.setKeyId("test-key-1");

        byte[] jwks = new JsonWebKeySet(signingKey).toJson().getBytes(StandardCharsets.UTF_8);
        jwksServer = HttpServer.create(new InetSocketAddress("localhost", 0), 0);
        jwksServer.createContext("/keys", exchange -> {
            exchange.getResponseHeaders().add("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, jwks.length);
            exchange.getResponseBody().write(jwks);
            exchange.close();
        });
        jwksServer.start();

        Environment.configure("http://localhost:" + jwksServer.getAddress().getPort(), "cid", "secret");
        auth = new ScalekitAuthClient();
    }

    @AfterAll
    static void tearDown() {
        jwksServer.stop(0);
    }

    private static String signWithIssuer(String iss) throws Exception {
        JwtClaims claims = new JwtClaims();
        claims.setIssuer(iss);
        claims.setSubject("user_1");
        claims.setExpirationTime(NumericDate.fromSeconds(NumericDate.now().getValue() + 600));

        JsonWebSignature jws = new JsonWebSignature();
        jws.setPayload(claims.toJson());
        jws.setKey(signingKey.getPrivateKey());
        jws.setKeyIdHeaderValue(signingKey.getKeyId());
        jws.setAlgorithmHeaderValue(AlgorithmIdentifiers.RSA_USING_SHA256);
        return jws.getCompactSerialization();
    }

    private static TokenValidationOptions opts(List<String> issuers) {
        return TokenValidationOptions.builder().issuers(issuers).build();
    }

    /** Both variants must agree, so every case is asserted against each. */
    private static void assertValid(String token, List<String> issuer) {
        assertTrue(auth.validateAccessToken(token, opts(issuer)), "validateAccessToken");
        Map<String, Object> claims = auth.validateAccessTokenAndGetClaims(token, opts(issuer));
        assertEquals("user_1", claims.get("sub"), "validateAccessTokenAndGetClaims");
    }

    private static void assertRejected(String token, List<String> issuer) {
        assertThrows(APIException.class, () -> auth.validateAccessToken(token, opts(issuer)));
        assertThrows(APIException.class, () -> auth.validateAccessTokenAndGetClaims(token, opts(issuer)));
    }

    @Test
    void singleIssuerMatches() throws Exception {
        assertValid(signWithIssuer(BASE), Collections.singletonList(BASE));
    }

    @Test
    void singleIssuerMismatchIsRejected() throws Exception {
        assertRejected(signWithIssuer(BASE), Collections.singletonList(RESOURCE));
    }

    @Test
    void listMatchesFirstEntry() throws Exception {
        assertValid(signWithIssuer(BASE), Arrays.asList(BASE, RESOURCE));
    }

    @Test
    void listMatchesSecondEntryForResourceScopedToken() throws Exception {
        assertValid(signWithIssuer(RESOURCE), Arrays.asList(BASE, RESOURCE));
    }

    @Test
    void listMatchingNoEntryIsRejected() throws Exception {
        assertRejected(signWithIssuer(ENV_URL + "/resources/res_other"), Arrays.asList(BASE, RESOURCE));
    }

    @Test
    void matchingIsExactWithNoTrailingSlashNormalization() throws Exception {
        assertRejected(signWithIssuer(BASE + "/"), Collections.singletonList(BASE));
    }

    @Test
    void nullIssuerSkipsCheck() throws Exception {
        assertValid(signWithIssuer(RESOURCE), null);
    }

    @Test
    void emptyListSkipsCheck() throws Exception {
        assertValid(signWithIssuer(RESOURCE), Collections.<String>emptyList());
    }

    @Test
    void nullOptionsSkipsCheck() throws Exception {
        String token = signWithIssuer(RESOURCE);
        assertTrue(auth.validateAccessToken(token, null));
        assertEquals("user_1", auth.validateAccessTokenAndGetClaims(token, null).get("sub"));
    }

    // --- legacy single-string builder is unchanged (non-breaking) ---

    @Test
    void legacySingleIssuerStringStillWorks() throws Exception {
        TokenValidationOptions match = TokenValidationOptions.builder().issuer(BASE).build();
        TokenValidationOptions mismatch = TokenValidationOptions.builder().issuer(RESOURCE).build();
        String token = signWithIssuer(BASE);
        assertTrue(auth.validateAccessToken(token, match));
        assertEquals("user_1", auth.validateAccessTokenAndGetClaims(token, match).get("sub"));
        assertThrows(APIException.class, () -> auth.validateAccessToken(token, mismatch));
        assertThrows(APIException.class, () -> auth.validateAccessTokenAndGetClaims(token, mismatch));
    }

    @Test
    void legacyBlankIssuerStringStillSkipsCheck() throws Exception {
        TokenValidationOptions blank = TokenValidationOptions.builder().issuer("").build();
        assertTrue(auth.validateAccessToken(signWithIssuer(RESOURCE), blank));
    }

    @Test
    void issuerAndIssuersCombineAnyOf() throws Exception {
        TokenValidationOptions both = TokenValidationOptions.builder()
                .issuer(BASE).issuers(Collections.singletonList(RESOURCE)).build();
        assertTrue(auth.validateAccessToken(signWithIssuer(BASE), both));
        assertTrue(auth.validateAccessToken(signWithIssuer(RESOURCE), both));
        assertThrows(APIException.class,
                () -> auth.validateAccessToken(signWithIssuer("https://evil.example.com"), both));
    }

    @Test
    void blankIssuerStringDoesNotDisableNonEmptyIssuers() throws Exception {
        TokenValidationOptions opts = TokenValidationOptions.builder()
                .issuer("").issuers(Collections.singletonList(BASE)).build();
        assertThrows(APIException.class, () -> auth.validateAccessToken(signWithIssuer(RESOURCE), opts));
        assertTrue(auth.validateAccessToken(signWithIssuer(BASE), opts));
    }

    @Test
    void oneArgVariantsStillWorkWithoutOptions() throws Exception {
        String token = signWithIssuer(RESOURCE);
        assertTrue(auth.validateAccessToken(token));
        assertEquals("user_1", auth.validateAccessTokenAndGetClaims(token).get("sub"));
    }

    @Test
    void blankOnlyListFailsClosedInsteadOfSkipping() throws Exception {
        assertRejected(signWithIssuer(RESOURCE), Collections.singletonList(""));
    }

    @Test
    void blankEntriesAreHarmlessAlongsideRealOnes() throws Exception {
        assertValid(signWithIssuer(RESOURCE), Arrays.asList("", RESOURCE));
        assertRejected(signWithIssuer(RESOURCE), Arrays.asList("", BASE));
    }
}
