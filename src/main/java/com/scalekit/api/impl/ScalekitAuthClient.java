package com.scalekit.api.impl;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.scalekit.Environment;
import com.scalekit.api.AuthClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.internal.http.*;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jose4j.jwk.JsonWebKey;
import org.jose4j.jwk.JsonWebKeySet;
import org.jose4j.jwk.VerificationJwkSelector;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.consumer.InvalidJwtException;
import org.jose4j.jwt.consumer.JwtConsumer;
import org.jose4j.jwt.consumer.JwtConsumerBuilder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.*;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Map;

import static com.scalekit.internal.Constants.*;

public class ScalekitAuthClient implements AuthClient {

    private final CloseableHttpClient httpClient;
    private final ObjectMapper objectMapper;

    public ScalekitAuthClient() {

        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(5000)
                .setSocketTimeout(10000)
                .setConnectionRequestTimeout(5000)
                .build();

        // Create an HttpClient with the custom request configuration
         this.httpClient = HttpClients.custom()
                .setDefaultRequestConfig(requestConfig)
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
        try {
            // TODO Optimization - Cache the keys
            String keysJson = fetchJsonWebKeys();

            JsonWebKeySet jsonWebKeySet = new JsonWebKeySet(keysJson);

            JsonWebSignature jws = new JsonWebSignature();
            jws.setCompactSerialization(jwt);

            VerificationJwkSelector jwkSelector = new VerificationJwkSelector();
            JsonWebKey jwk = jwkSelector.select(jws, jsonWebKeySet.getJsonWebKeys());
            jws.setKey(jwk.getKey());

            //  verify the signature
            boolean isSignatureValid = jws.verifySignature();
            if (!isSignatureValid) {
                return false;
            }

            //  verify the expiry
            JwtConsumer jwtConsumer = new JwtConsumerBuilder()
                .setRequireExpirationTime()
                .setAllowedClockSkewInSeconds(30)
                .setSkipSignatureVerification() // Already verified above
                .setSkipDefaultAudienceValidation()
                .build();

            // This will throw an exception if the token is expired
            jwtConsumer.processToClaims(jwt);

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
        try {
            // TODO Optimization - Cache the keys
            String keysJson = fetchJsonWebKeys();

            JsonWebKeySet jsonWebKeySet = new JsonWebKeySet(keysJson);

            JsonWebSignature jws = new JsonWebSignature();
            jws.setCompactSerialization(jwt);

            VerificationJwkSelector jwkSelector = new VerificationJwkSelector();
            JsonWebKey jwk = jwkSelector.select(jws, jsonWebKeySet.getJsonWebKeys());
            jws.setKey(jwk.getKey());

            //  verify the signature
            boolean isSignatureValid = jws.verifySignature();
            if (!isSignatureValid) {
                throw new APIException("Invalid token signature");
            }

            //  verify the expiry and get claims
            JwtConsumer jwtConsumer = new JwtConsumerBuilder()
                .setRequireExpirationTime()
                .setAllowedClockSkewInSeconds(30)
                .setSkipSignatureVerification() // Already verified above
                .setSkipDefaultAudienceValidation()
                .build();

            // This will throw an exception if the token is expired
            JwtClaims jwtClaims = jwtConsumer.processToClaims(jwt);

            // Convert JWT claims to Map
            return objectMapper.readValue(jwtClaims.toJson(), new com.fasterxml.jackson.core.type.TypeReference<Map<String, Object>>() {});
        } catch (Exception e) {
            throw new APIException("Failed to validate token and get claims: " + e.getMessage());
        }
    }

    private String fetchJsonWebKeys() throws IOException {
        String url = Environment.defaultConfig().siteName + KEYS_ENDPOINT;

        HttpGet httpGet = new HttpGet(URI.create(url));

        try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
            if (response.getStatusLine().getStatusCode() != 200) {
                throw new IOException("Failed to fetch keys: " + EntityUtils.toString(response.getEntity()));
            }

            HttpEntity entity = response.getEntity();
            return EntityUtils.toString(entity, StandardCharsets.UTF_8);
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
        String url = environment.siteName+TOKEN_ENDPOINT;

        String form = requestData.entrySet()
                .stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.joining("&"));

        HttpPost httpPost = new HttpPost(URI.create(url));
        httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded");


        StringEntity entity = new StringEntity(form, StandardCharsets.UTF_8);
        httpPost.setEntity(entity);

        try (CloseableHttpResponse response = httpClient.execute(httpPost)) {
            // Check the response status
            if (response.getStatusLine().getStatusCode() != 200) {
                throw new IOException("Failed to authenticate: " + EntityUtils.toString(response.getEntity()));
            }

            // Parse the response body into AuthenticationResponse
            HttpEntity responseEntity = response.getEntity();
            String responseBody = EntityUtils.toString(responseEntity, StandardCharsets.UTF_8);
            return objectMapper.readValue(responseBody, AuthenticationResponse.class);
        }
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

    /**
     * Refreshes an access token using a refresh token
     * @param refreshToken The refresh token to use
     * @return AuthenticationResponse containing the new access token and refresh token
     * @throws APIException if the refresh token is invalid or expired
     */
    @Override
    public AuthenticationResponse refreshToken(String refreshToken) throws APIException {
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
