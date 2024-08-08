package com.scalekit.api.impl;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.scalekit.Environment;
import com.scalekit.api.AuthClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.internal.http.*;
import org.jose4j.jwa.AlgorithmConstraints;
import org.jose4j.jwk.JsonWebKey;
import org.jose4j.jwk.JsonWebKeySet;
import org.jose4j.jwk.VerificationJwkSelector;

import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.consumer.InvalidJwtException;
import org.jose4j.jwt.consumer.JwtConsumer;
import org.jose4j.jwt.consumer.JwtConsumerBuilder;
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

        String urlString = String.format("https://%s/%s?%s", Environment.defaultConfig().siteName , AUTHORIZATION_ENDPOINT, qs);

        try {
            return new URL(urlString);
        } catch (MalformedURLException e) {
            throw new APIException("Invalid URL" + urlString + e.getMessage());
        }
    }

    public boolean validateAccessToken(String jwt) throws APIException{
        try {
            // TODO Optimization - Cache the keys
            String keysJson = this.httpClient.send(
                    HttpRequest.newBuilder()
                            .uri(new URI("https://" + Environment.defaultConfig().siteName + KEYS_ENDPOINT))
                            .GET()
                            .build(),
                    HttpResponse.BodyHandlers.ofString()
            ).body();

            JsonWebKeySet jsonWebKeySet = new JsonWebKeySet(keysJson);
            JsonWebSignature jws = new JsonWebSignature();
            jws.setCompactSerialization(jwt);
            VerificationJwkSelector jwkSelector = new VerificationJwkSelector();
            JsonWebKey jwk = jwkSelector.select(jws, jsonWebKeySet.getJsonWebKeys());
            jws.setKey(jwk.getKey());
            return jws.verifySignature();
        } catch (URISyntaxException | IOException | InterruptedException | JoseException e) {
            throw new APIException("Failed to validate token:"+e.getMessage());
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
            JwtConsumer jwtConsumer = new JwtConsumerBuilder()
                    .setSkipSignatureVerification()
                    .setSkipDefaultAudienceValidation()
                    .build();

            JwtClaims jwtClaims = jwtConsumer.processToClaims(response.getIdToken());

            idTokenClaims = objectMapper.readValue(jwtClaims.toJson(), IdTokenClaims.class);
        } catch (IOException | InterruptedException | URISyntaxException | InvalidJwtException e) {
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
        String url = "https://"+environment.siteName+TOKEN_ENDPOINT;

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
        try {
            boolean isTokenValid = validateAccessToken(idpInitiatedLoginToken);
            if (!isTokenValid) {
                throw new APIException("Invalid idpInitiatedLoginToken");
            }
            JwtConsumer jwtConsumer = new JwtConsumerBuilder()
                    .setSkipSignatureVerification()
                    .setSkipDefaultAudienceValidation()
                    .build();
            JwtClaims jwtClaims = jwtConsumer.processToClaims(idpInitiatedLoginToken);

            return objectMapper.readValue(
                    jwtClaims.toJson(),
                    IdpInitiatedLoginClaims.class);
        } catch (IOException | InvalidJwtException e) {
            throw new APIException("Failed to verify and consume idpInitiatedLoginToken, error: " + e.getMessage());
        }
    }
}
