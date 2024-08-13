package com.scalekit.api.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.scalekit.Environment;
import com.scalekit.api.AuthClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.internal.http.*;
import org.jose4j.json.internal.json_simple.JSONObject;
import org.jose4j.jwk.JsonWebKey;
import org.jose4j.jwk.JsonWebKeySet;
import org.jose4j.jwk.VerificationJwkSelector;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.consumer.InvalidJwtException;
import org.jose4j.jwt.consumer.JwtConsumerBuilder;
import org.jose4j.keys.resolvers.JwksVerificationKeyResolver;
import org.jose4j.keys.resolvers.VerificationKeyResolver;
import org.jose4j.lang.JoseException;

import java.io.IOException;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

import static com.scalekit.internal.Constants.*;

public class ScalekitAuthClient implements AuthClient {

    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;
    private JsonWebKeySet jsonWebKeySet;

    public ScalekitAuthClient() {

        this.httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(3))
                .build();

        this.objectMapper = new ObjectMapper();
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    }


    public String getClientAccessToken(){
        Environment environment = Environment.defaultConfig();
        // params
        Map<String, String> parameters = new HashMap<>();
        parameters.put(GRANT_TYPE, CLIENT_CREDENTIALS);
        parameters.put(CLIENT_ID,environment.clientId);
        parameters.put(CLIENT_SECRET,environment.clientSecret);

        try {
            return authenticate(parameters).getAccessToken();
        }catch (InterruptedException | IOException | URISyntaxException e){
            throw new APIException(e.getMessage() + " Failed to Create Client Please check environment URL and credentials");
        }
    }

    public URL getAuthorizationUrl(String redirectUri, AuthorizationUrlOptions options){
        List<String> scopes = new ArrayList<>();
        scopes.add("openid");
        scopes.add("profile");
        scopes.add("email");

        if (options.getScopes() != null) {
            scopes = new ArrayList<>(options.getScopes());
        }

        StringJoiner qs = new StringJoiner("&");
        qs.add("response_type=code");
        qs.add("client_id=" + URLEncoder.encode(Environment.defaultConfig().clientId, StandardCharsets.UTF_8));
        qs.add("redirect_uri=" + URLEncoder.encode(redirectUri, StandardCharsets.UTF_8));
        qs.add("scope=" + URLEncoder.encode(String.join(" ", scopes), StandardCharsets.UTF_8));

        if (options.getState() != null && !options.getState().isEmpty()) {
            qs.add("state=" + URLEncoder.encode(options.getState(), StandardCharsets.UTF_8));
        }
        if (options.getNonce() != null && !options.getNonce().isEmpty()) {
            qs.add("nonce=" + URLEncoder.encode(options.getNonce(), StandardCharsets.UTF_8));
        }
        if (options.getLoginHint() != null && !options.getLoginHint().isEmpty()) {
            qs.add("login_hint=" + URLEncoder.encode(options.getLoginHint(), StandardCharsets.UTF_8));
        }
        if (options.getDomainHint() != null && !options.getDomainHint().isEmpty()) {
            qs.add("domain_hint=" + URLEncoder.encode(options.getDomainHint(), StandardCharsets.UTF_8));
            qs.add("domain=" + URLEncoder.encode(options.getDomainHint(), StandardCharsets.UTF_8));
        }
        if (options.getConnectionId() != null && !options.getConnectionId().isEmpty()) {
            qs.add("connection_id=" + URLEncoder.encode(options.getConnectionId(), StandardCharsets.UTF_8));
        }
        if (options.getOrganizationId() != null && !options.getOrganizationId().isEmpty()) {
            qs.add("organization_id=" + URLEncoder.encode(options.getOrganizationId(), StandardCharsets.UTF_8));
        }
        if (options.getCodeChallenge() != null && !options.getCodeChallenge().isEmpty()) {
            qs.add("code_challenge=" + URLEncoder.encode(options.getCodeChallenge(), StandardCharsets.UTF_8));
        }
        if (options.getCodeChallengeMethod() != null && !options.getCodeChallengeMethod().isEmpty()) {
            qs.add("code_challenge_method=" + URLEncoder.encode(options.getCodeChallengeMethod(), StandardCharsets.UTF_8));
        }
        if (options.getProvider() != null && !options.getProvider().isEmpty()) {
            qs.add("provider=" + URLEncoder.encode(options.getProvider(), StandardCharsets.UTF_8));
        }

        String urlString = String.format("%s/%s?%s", Environment.defaultConfig().siteName , AUTHORIZATION_ENDPOINT, qs);

        try {
            return URI.create(urlString).toURL();
        } catch (MalformedURLException e) {
            throw new APIException("Invalid URL" + urlString + e.getMessage());
        }
    }

    private JsonWebKeySet getJsonWebKeySet() {
        if (jsonWebKeySet != null) {
            return jsonWebKeySet;
        }

        // TODO: lock and try only once
        try {
            String keysJson = this.httpClient.send(
                    HttpRequest.newBuilder()
                            .uri(new URI(Environment.defaultConfig().siteName + KEYS_ENDPOINT))
                            .GET()
                            .build(),
                    HttpResponse.BodyHandlers.ofString()
            ).body();
            jsonWebKeySet = new JsonWebKeySet(keysJson);
            return jsonWebKeySet;
        } catch (IOException | URISyntaxException | JoseException  e) {
            throw new APIException("jwt keys fetch failed");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new APIException("jwt keys fetch failed");
        }
    }

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
            idTokenClaims = validateToken(response.getIdToken(), IdTokenClaims.class);
        } catch (IOException | URISyntaxException  e) {
            throw new APIException("Failed to authenticate with code: " + e.getMessage());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
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
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.joining("&"));

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(url))
                .header("Content-Type", "application/x-www-form-urlencoded")
                .POST(HttpRequest.BodyPublishers.ofString(form, StandardCharsets.UTF_8))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new IOException("Failed to authenticate: " + response.body());
        }

        return objectMapper.readValue(response.body(), AuthenticationResponse.class);
    }

    public IdpInitiatedLoginClaims getIdpInitiatedLoginClaims(String idpInitiatedLoginToken) throws APIException {
       return validateToken(idpInitiatedLoginToken, IdpInitiatedLoginClaims.class);
    }

    public boolean validateAccessToken(String jwt) {
        try {
            return validateToken(jwt, JSONObject.class) != null;
        } catch (APIException e) {
            return false;
        }
    }

    private <T> T validateToken(String token, Class<T> clazz) throws APIException {
        try {
            JsonWebSignature jws = new JsonWebSignature();
            jws.setCompactSerialization(token);
            VerificationJwkSelector jwkSelector = new VerificationJwkSelector();
            JsonWebKey jwk = jwkSelector.select(jws, getJsonWebKeySet().getJsonWebKeys());
            jws.setKey(jwk.getKey());
            if (!jws.verifySignature()) {
                throw new APIException("Token signature verification failed");
            }
            VerificationKeyResolver verificationKeyResolver = new JwksVerificationKeyResolver( getJsonWebKeySet().getJsonWebKeys());
            JwtConsumerBuilder jwtConsumerBuilder = new JwtConsumerBuilder()
                    .setVerificationKeyResolver(verificationKeyResolver)
                    .setExpectedIssuer(Environment.defaultConfig().siteName);
            JwtClaims claims = jwtConsumerBuilder.build().processToClaims(token);
            return objectMapper.readValue(
                    claims.toJson(),
                    clazz);
        } catch (InvalidJwtException | JoseException e) {
            throw new APIException("Token validation failed");
        } catch (JsonProcessingException e) {
            throw new APIException("JWT token json string to clazz conversion failed");
        }
    }
}
