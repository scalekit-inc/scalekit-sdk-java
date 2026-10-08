package com.scalekit.api.impl;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.scalekit.Environment;
import com.scalekit.api.AuthClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.internal.http.*;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.factories.DefaultJWSVerifierFactory;
import com.nimbusds.jose.jwk.AsymmetricJWK;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKMatcher;
import com.nimbusds.jose.jwk.JWKSelector;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jwt.JWT;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.JWTParser;
import com.nimbusds.jwt.SignedJWT;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.text.ParseException;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Map;

import static com.scalekit.internal.Constants.*;

public class ScalekitAuthClient implements AuthClient {

    private static final int CONNECT_TIMEOUT_MILLIS = 5000;
    private static final int READ_TIMEOUT_MILLIS = 10000;

    private final ObjectMapper objectMapper;

    public ScalekitAuthClient() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }


    public String generateClientToken(String clientId, String clientSecret) {
        if (clientId == null || clientId.trim().isEmpty()) {
            throw new IllegalArgumentException("clientId must not be null or blank");
        }
        if (clientSecret == null || clientSecret.trim().isEmpty()) {
            throw new IllegalArgumentException("clientSecret must not be null or blank");
        }
        Map<String, String> parameters = new HashMap<>();
        parameters.put(GRANT_TYPE, CLIENT_CREDENTIALS);
        parameters.put(CLIENT_ID, clientId);
        parameters.put(CLIENT_SECRET, clientSecret);

        try {
            return authenticate(parameters).getAccessToken();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new APIException("Failed to generate client token: thread was interrupted", e);
        } catch (IOException | URISyntaxException e) {
            throw new APIException("Failed to generate client token: " + e.getMessage(), e);
        }
    }

    public String getClientAccessToken() {
        Environment environment = Environment.defaultConfig();
        return generateClientToken(environment.clientId, environment.clientSecret);
    }


    /**
     * getAuthorizationUrl generates an authorization URL
     * @param redirectUri: The redirect URI
     * @param options: The AuthorizationUrlOptions
     * @return URL: The authorization URL
     */
    public URL getAuthorizationUrl(String redirectUri, AuthorizationUrlOptions options) {
        List<String> scopes = new ArrayList<>();
        scopes.add("openid");
        scopes.add("profile");
        scopes.add("email");

        if (options.getScopes() != null) {
            scopes = new ArrayList<>(options.getScopes());
        }

        StringJoiner qs = new StringJoiner("&");

        try {
            qs.add("response_type=code");
            qs.add("client_id=" + URLEncoder.encode(Environment.defaultConfig().clientId, StandardCharsets.UTF_8.name()));
            qs.add("redirect_uri=" + URLEncoder.encode(redirectUri, StandardCharsets.UTF_8.name()));
            qs.add("scope=" + URLEncoder.encode(String.join(" ", scopes), StandardCharsets.UTF_8.name()));

            if (options.getState() != null && !options.getState().isEmpty()) {
                qs.add("state=" + URLEncoder.encode(options.getState(), StandardCharsets.UTF_8.name()));
            }
            if (options.getNonce() != null && !options.getNonce().isEmpty()) {
                qs.add("nonce=" + URLEncoder.encode(options.getNonce(), StandardCharsets.UTF_8.name()));
            }
            if (options.getLoginHint() != null && !options.getLoginHint().isEmpty()) {
                qs.add("login_hint=" + URLEncoder.encode(options.getLoginHint(), StandardCharsets.UTF_8.name()));
            }
            if (options.getDomainHint() != null && !options.getDomainHint().isEmpty()) {
                qs.add("domain_hint=" + URLEncoder.encode(options.getDomainHint(), StandardCharsets.UTF_8.name()));
                qs.add("domain=" + URLEncoder.encode(options.getDomainHint(), StandardCharsets.UTF_8.name()));
            }
            if (options.getConnectionId() != null && !options.getConnectionId().isEmpty()) {
                qs.add("connection_id=" + URLEncoder.encode(options.getConnectionId(), StandardCharsets.UTF_8.name()));
            }
            if (options.getOrganizationId() != null && !options.getOrganizationId().isEmpty()) {
                qs.add("organization_id=" + URLEncoder.encode(options.getOrganizationId(), StandardCharsets.UTF_8.name()));
            }
            if (options.getCodeChallenge() != null && !options.getCodeChallenge().isEmpty()) {
                qs.add("code_challenge=" + URLEncoder.encode(options.getCodeChallenge(), StandardCharsets.UTF_8.name()));
            }
            if (options.getCodeChallengeMethod() != null && !options.getCodeChallengeMethod().isEmpty()) {
                qs.add("code_challenge_method=" + URLEncoder.encode(options.getCodeChallengeMethod(), StandardCharsets.UTF_8.name()));
            }
            if (options.getProvider() != null && !options.getProvider().isEmpty()) {
                qs.add("provider=" + URLEncoder.encode(options.getProvider(), StandardCharsets.UTF_8.name()));
            }
            if (options.getPrompt() != null && !options.getPrompt().isEmpty()) {
                qs.add("prompt=" + URLEncoder.encode(options.getPrompt(), StandardCharsets.UTF_8.name()));
            }

            String urlString = String.format("%s/%s?%s", Environment.defaultConfig().siteName , AUTHORIZATION_ENDPOINT, qs);

            return new URL(urlString);
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            throw new APIException("Invalid URL" + redirectUri + e.getMessage());
        }
    }

    /**
     * validateAccessToken validates an access token
     * @param jwt: The JWT token
     * @return boolean: True if the token is valid
     */
    public boolean validateAccessToken(String jwt) throws APIException {
        return validateAccessToken(jwt, null);
    }

    /**
     * validateAccessToken validates an access token, optionally enforcing the
     * expected issuer and audience.
     * <p>
     * Returns {@code false} when the signature does not verify. Any other failure
     * (expired token, or an issuer/audience mismatch when the option is set) is
     * thrown as an {@link APIException} rather than returned as {@code false}.
     * @param jwt: The JWT token
     * @param options: Optional issuer/audience validation options (may be null)
     * @return boolean: True if the token is valid
     * @throws APIException if the token is expired or fails an issuer/audience check
     */
    public boolean validateAccessToken(String jwt, TokenValidationOptions options) throws APIException {
        try {
            // TODO Optimization - Cache the keys
            SignedJWT signedJwt = SignedJWT.parse(jwt);

            //  verify the signature
            if (!verifySignature(signedJwt, fetchJsonWebKeys())) {
                return false;
            }

            // Throws if the token is expired or fails issuer/audience checks
            verifyClaims(signedJwt.getJWTClaimsSet(), options);

            return true;
        } catch (Exception e) {
            throw new APIException("Failed to validate token: " + e.getMessage());
        }
    }

    /**
     * validateAccessTokenAndGetClaims validates an access token and returns the decoded claims
     * @param jwt: The JWT token
     * @return a Map&lt;String, Object&gt; containing the decoded claims from the token
     */
    public Map<String, Object> validateAccessTokenAndGetClaims(String jwt) throws APIException {
        return validateAccessTokenAndGetClaims(jwt, null);
    }

    /**
     * validateAccessTokenAndGetClaims validates an access token, optionally enforcing the
     * expected issuer(s) and audience, and returns the decoded claims. The token is valid if
     * its issuer equals the {@code issuer} value of {@link TokenValidationOptions},
     * or any entry of its {@code issuers} list.
     * @param jwt: The JWT token
     * @param options: Optional issuer/audience validation options (may be null)
     * @return a Map&lt;String, Object&gt; containing the decoded claims from the token
     * @throws APIException if the signature is invalid, the token is expired, or it fails an issuer/audience check
     */
    public Map<String, Object> validateAccessTokenAndGetClaims(String jwt, TokenValidationOptions options) throws APIException {
        try {
            // TODO Optimization - Cache the keys
            SignedJWT signedJwt = SignedJWT.parse(jwt);

            //  verify the signature
            if (!verifySignature(signedJwt, fetchJsonWebKeys())) {
                throw new APIException("Invalid token signature");
            }

            // Throws if the token is expired or fails issuer/audience checks
            verifyClaims(signedJwt.getJWTClaimsSet(), options);

            // Convert the claims to a Map from the payload JSON as sent, so value types
            // (for example integer timestamps and a single-string aud) are kept as-is
            return objectMapper.readValue(signedJwt.getPayload().toString(), new com.fasterxml.jackson.core.type.TypeReference<Map<String, Object>>() {});
        } catch (Exception e) {
            throw new APIException("Failed to validate token and get claims: " + e.getMessage());
        }
    }

    /** Allowed clock skew, in seconds, when checking exp and nbf of access tokens. */
    private static final long ACCESS_TOKEN_CLOCK_SKEW_SECONDS = 30;

    /** Thrown when a token's claims fail validation. */
    private static final class InvalidTokenException extends Exception {
        InvalidTokenException(String message) {
            super(message);
        }
    }

    /**
     * Verifies the token's signature against the environment's JSON Web Key Set.
     * Candidate keys are those matching the token's kid (when present) and its algorithm's
     * key type; the signature is valid if any candidate verifies it.
     * @return false when no candidate key verifies the signature
     * @throws InvalidTokenException when the key set has no key that can verify this token
     */
    private static boolean verifySignature(SignedJWT signedJwt, String keysJson)
            throws ParseException, JOSEException, InvalidTokenException {
        JWSHeader header = signedJwt.getHeader();
        JWKMatcher matcher = JWKMatcher.forJWSHeader(header);
        List<JWK> candidates = matcher == null
                ? Collections.<JWK>emptyList()
                : new JWKSelector(matcher).select(JWKSet.parse(keysJson));
        if (candidates.isEmpty()) {
            throw new InvalidTokenException("No matching key found for kid " + header.getKeyID()
                    + " and alg " + header.getAlgorithm());
        }
        DefaultJWSVerifierFactory verifierFactory = new DefaultJWSVerifierFactory();
        for (JWK jwk : candidates) {
            if (!(jwk instanceof AsymmetricJWK)) {
                continue;
            }
            JWSVerifier verifier = verifierFactory.createJWSVerifier(header, ((AsymmetricJWK) jwk).toPublicKey());
            if (signedJwt.verify(verifier)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks the claims shared by validateAccessToken and validateAccessTokenAndGetClaims so
     * both apply identical rules: exp is required, exp/nbf are checked with a 30 second
     * clock skew, iat must not be after exp, and issuer/audience are enforced when configured. The signature is verified
     * by the caller before this runs.
     */
    private static void verifyClaims(JWTClaimsSet claims, TokenValidationOptions options) throws InvalidTokenException {
        if (claims.getExpirationTime() == null) {
            throw new InvalidTokenException("No Expiration Time (exp) claim present");
        }
        verifyTimes(claims, ACCESS_TOKEN_CLOCK_SKEW_SECONDS);

        // The accepted set is issuer (when non-empty) plus every entry of issuers. The check is
        // skipped only when that set is empty because nothing was configured; a non-empty
        // issuers list is always enforced, even when its entries are blank, so it fails closed.
        // The token is valid if its iss exactly equals ANY accepted entry, and a token without
        // an iss claim is rejected.
        if (options != null) {
            List<String> accepted = new ArrayList<>();
            if (options.getIssuer() != null && !options.getIssuer().isEmpty()) {
                accepted.add(options.getIssuer());
            }
            if (options.getIssuers() != null) {
                accepted.addAll(options.getIssuers());
            }
            if (!accepted.isEmpty()) {
                String issuer = claims.getIssuer();
                if (issuer == null) {
                    throw new InvalidTokenException("No Issuer (iss) claim present but was expecting one of " + accepted);
                }
                if (!accepted.contains(issuer)) {
                    throw new InvalidTokenException("Issuer (iss) claim value (" + issuer + ") doesn't match expected value of " + accepted);
                }
            }
        }

        // The token is valid if any of its aud values is one of the expected audiences
        if (options != null && options.getAudience() != null && !options.getAudience().isEmpty()) {
            List<String> audience = claims.getAudience();
            if (audience == null || audience.isEmpty()) {
                throw new InvalidTokenException("No Audience (aud) claim present");
            }
            if (Collections.disjoint(audience, options.getAudience())) {
                throw new InvalidTokenException("Audience (aud) claim " + audience + " doesn't contain an acceptable identifier. Expected one of " + options.getAudience());
            }
        }
    }

    /** Rejects a token that is expired or not yet valid (allowing the given clock skew), or whose iat is after its exp. */
    private static void verifyTimes(JWTClaimsSet claims, long skewSeconds) throws InvalidTokenException {
        long now = System.currentTimeMillis();
        long skewMillis = skewSeconds * 1000;
        Date exp = claims.getExpirationTime();
        if (exp != null && now - skewMillis >= exp.getTime()) {
            throw new InvalidTokenException("The JWT is no longer valid - the evaluation time is on or after the Expiration Time (exp=" + exp.getTime() / 1000 + ")");
        }
        Date nbf = claims.getNotBeforeTime();
        if (nbf != null && now + skewMillis < nbf.getTime()) {
            throw new InvalidTokenException("The JWT is not yet valid as the evaluation time is before the Not Before (nbf=" + nbf.getTime() / 1000 + ")");
        }
        // iat is not compared with the current time; it is only rejected when it is after exp
        Date iat = claims.getIssueTime();
        if (iat != null && exp != null && iat.getTime() > exp.getTime()) {
            throw new InvalidTokenException("The Issued At (iat=" + iat.getTime() / 1000 + ") is after the Expiration Time (exp=" + exp.getTime() / 1000 + ")");
        }
    }

    /**
     * Decodes a signed token's payload without verifying its signature, for tokens that were
     * already verified or that come straight from the Scalekit token endpoint over TLS.
     * exp and nbf are still checked (with no clock skew), and iat must not be after exp, when present.
     * @return the payload JSON as sent
     */
    private static String decodeVerifiedPayload(String token) throws ParseException, InvalidTokenException {
        JWT jwt = JWTParser.parse(token);
        if (!(jwt instanceof SignedJWT)) {
            throw new InvalidTokenException("The JWT is not signed");
        }
        verifyTimes(jwt.getJWTClaimsSet(), 0);
        return ((SignedJWT) jwt).getPayload().toString();
    }

    private String fetchJsonWebKeys() throws IOException {
        String url = Environment.defaultConfig().siteName + KEYS_ENDPOINT;
        return sendRequest(url, null, "Failed to fetch keys: ");
    }

    /**
     * Sends a GET, or a form POST when {@code formBody} is non-null, using the JDK's
     * HttpURLConnection (which reuses connections through HTTP keep-alive).
     * @return the response body
     * @throws IOException if the request fails or the status is not 200; the message is
     *         {@code errorPrefix} followed by the response body
     */
    private static String sendRequest(String url, String formBody, String errorPrefix) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setConnectTimeout(CONNECT_TIMEOUT_MILLIS);
        connection.setReadTimeout(READ_TIMEOUT_MILLIS);
        if (formBody != null) {
            byte[] bytes = formBody.getBytes(StandardCharsets.UTF_8);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setDoOutput(true);
            // Streaming mode stops the JDK from silently re-sending the POST after a connection
            // reset (sun.net.http.retryPost), which would replay a single-use authorization code.
            connection.setFixedLengthStreamingMode(bytes.length);
            try (OutputStream out = connection.getOutputStream()) {
                out.write(bytes);
            }
        }

        int status = connection.getResponseCode();
        // Read the body fully, including on errors, so the connection can be reused
        String body = readFully(status >= 400 ? connection.getErrorStream() : connection.getInputStream());
        if (status != 200) {
            throw new IOException(errorPrefix + body);
        }
        return body;
    }

    private static String readFully(InputStream in) throws IOException {
        if (in == null) {
            return "";
        }
        try (InputStream stream = in) {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            byte[] chunk = new byte[8192];
            int read;
            while ((read = stream.read(chunk)) != -1) {
                buffer.write(chunk, 0, read);
            }
            return new String(buffer.toByteArray(), StandardCharsets.UTF_8);
        }
    }

    /**
     * authenticateWithCode authenticates with a code
     * @param code: The code
     * @param redirectUri: The redirect URI
     * @param options: The AuthenticationOptions
     * @return AuthenticationResponse: The authentication response
     */
    public AuthenticationResponse authenticateWithCode(String code, String redirectUri, AuthenticationOptions options) {
        if (code == null || code.isEmpty() || redirectUri == null || redirectUri.isEmpty()) {
            throw new APIException("code and redirect uri are required");
        }

        Map<String, String> params = new HashMap<>();
        params.put("code", code);
        params.put("redirect_uri", redirectUri);
        params.put("grant_type", AUTHORIZATION_CODE);
        params.put("client_id", Environment.defaultConfig().clientId);
        params.put("client_secret",Environment.defaultConfig().clientSecret);
        if (options.getCodeVerifier() != null && !options.getCodeVerifier().isEmpty()) {
            params.put("code_verifier", options.getCodeVerifier());
        }
        AuthenticationResponse response;
        IdTokenClaims idTokenClaims;

        try {
            response = authenticate(params);

            idTokenClaims = objectMapper.readValue(decodeVerifiedPayload(response.getIdToken()), IdTokenClaims.class);
        } catch (IOException | InterruptedException | URISyntaxException | ParseException | InvalidTokenException e) {
            throw new APIException("Failed to authenticate with code: " + e.getMessage());
        }

        AuthenticationResponse authenticationResponse = new AuthenticationResponse();
        authenticationResponse.setAccessToken(response.getAccessToken());
        authenticationResponse.setIdToken(response.getIdToken());
        authenticationResponse.setIdTokenClaims(idTokenClaims);
        return authenticationResponse;
    }



    private AuthenticationResponse authenticate(Map<String, String> requestData) throws IOException, InterruptedException, URISyntaxException {

        Environment environment = Environment.defaultConfig();
        String url = environment.siteName+TOKEN_ENDPOINT;

        String form = requestData.entrySet()
                .stream()
                .map(entry -> {
                    try {
                        return URLEncoder.encode(entry.getKey(), StandardCharsets.UTF_8.name())
                                + "="
                                + URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8.name());
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException(e); // UTF-8 is always supported
                    }
                })
                .collect(Collectors.joining("&"));

        String responseBody = sendRequest(url, form, "Failed to authenticate: ");
        return objectMapper.readValue(responseBody, AuthenticationResponse.class);
    }

    /**
     * getIdpInitiatedLoginClaims gets the claims from an idpInitiatedLoginToken
     * @param idpInitiatedLoginToken: The idpInitiatedLoginToken
     * @return IdpInitiatedLoginClaims: The claims
     */
    public IdpInitiatedLoginClaims getIdpInitiatedLoginClaims(String idpInitiatedLoginToken) throws APIException {
        try {
            boolean isTokenValid = validateAccessToken(idpInitiatedLoginToken);
            if (!isTokenValid) {
                throw new APIException("Invalid idpInitiatedLoginToken");
            }
            return objectMapper.readValue(
                    decodeVerifiedPayload(idpInitiatedLoginToken),
                    IdpInitiatedLoginClaims.class);
        } catch (IOException | ParseException | InvalidTokenException e) {
            throw new APIException("Failed to verify and consume idpInitiatedLoginToken, error: " + e.getMessage());
        }
    }

    /**
     * Refreshes an access token using a refresh token
     * @param refreshToken The refresh token to use
     * @return AuthenticationResponse containing the new access token and refresh token
     * @throws APIException if the refresh token is invalid or expired
     */
    @Override
    public AuthenticationResponse refreshAccessToken(String refreshToken) throws APIException {
        if (refreshToken == null || refreshToken.isEmpty()) {
            throw new APIException("refresh token is required");
        }

        Map<String, String> params = new HashMap<>();
        params.put("refresh_token", refreshToken);
        params.put("grant_type", "refresh_token");
        params.put("client_id", Environment.defaultConfig().clientId);
        params.put("client_secret", Environment.defaultConfig().clientSecret);

        try {
            return authenticate(params);
        } catch (IOException | InterruptedException | URISyntaxException e) {
            throw new APIException("Failed to refresh token: " + e.getMessage());
        }
    }

    /**
     * getLogoutUrl generates a logout URL
     * @param options: The LogoutUrlOptions
     * @return URL: The logout URL
     */
    public URL getLogoutUrl(LogoutUrlOptions options) {
        StringJoiner qs = new StringJoiner("&");

        try {
            if (options.getIdTokenHint() != null && !options.getIdTokenHint().isEmpty()) {
                qs.add("id_token_hint=" + URLEncoder.encode(options.getIdTokenHint(), StandardCharsets.UTF_8.name()));
            }

            if (options.getPostLogoutRedirectUri() != null && !options.getPostLogoutRedirectUri().isEmpty()) {
                qs.add("post_logout_redirect_uri=" + URLEncoder.encode(options.getPostLogoutRedirectUri(), StandardCharsets.UTF_8.name()));
            }

            if (options.getState() != null && !options.getState().isEmpty()) {
                qs.add("state=" + URLEncoder.encode(options.getState(), StandardCharsets.UTF_8.name()));
            }

            String urlString = String.format("%s/%s?%s", Environment.defaultConfig().siteName, LOGOUT_ENDPOINT, qs);
            return new URL(urlString);
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            throw new APIException("Invalid URL: " + e.getMessage());
        }
    }
}
