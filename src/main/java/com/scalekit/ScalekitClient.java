package com.scalekit;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.scalekit.api.ConnectionClient;
import com.scalekit.api.DomainClient;
import com.scalekit.api.OrganizationClient;
import com.scalekit.api.impl.ScalekitConnectionClient;
import com.scalekit.api.impl.ScalekitDomainClient;
import com.scalekit.api.impl.ScalekitOrganizationClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.internal.ScalekitCredentials;
import com.scalekit.internal.http.AuthenticationResponse;
import com.scalekit.internal.http.AuthorizationUrlOptions;
import com.scalekit.internal.http.TokenResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.StringJoiner;

import static com.scalekit.internal.Constants.*;

public class ScalekitClient {
    private final OrganizationClient organizationClient;

    private final DomainClient domainClient;

    private final ConnectionClient connectionClient;

    private final  HttpClient httpClient;

    public ScalekitClient(String siteName, String clientId, String clientSecret){

        Environment.configure(siteName,clientId,clientSecret);
        Environment environment = Environment.defaultConfig();

        this.httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(3))
                .build();


        String token = getToken();
        ScalekitCredentials credentials = new ScalekitCredentials(token);

        // Managed channel automatically handles channel closing
        ManagedChannel channel = ManagedChannelBuilder.forAddress(environment.siteName, 443)
                .userAgent("scalekit-sdk-java/" + version)
                .build();


        // Initialize all clients
        organizationClient = new ScalekitOrganizationClient(channel, credentials);
        domainClient = new ScalekitDomainClient(channel, credentials);
        connectionClient = new ScalekitConnectionClient(channel, credentials);

    }

    public OrganizationClient Organizations() {
        return this.organizationClient;
    }

    public DomainClient Domains() {
        return this.domainClient;
    }

    public ConnectionClient Connections() {
        return this.connectionClient;
    }

    public URL GetAuthorizationUrl(String redirectUri, AuthorizationUrlOptions options){
        List<String> scopes = new ArrayList<>();
        scopes.add("openid");
        scopes.add("profile");

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

        String urlString = String.format("%s/%s?%s", Environment.defaultConfig().siteName , "authorize", qs);

        try {
            return new URL(urlString);
        } catch (MalformedURLException e) {
            throw new APIException("Invalid URL" + urlString + e.getMessage());
        }
    }

    private String getToken(){

        Environment environment = Environment.defaultConfig();
        String url = "https://"+environment.siteName+"/oauth/token";
        ObjectMapper mapper = new ObjectMapper();

        // params
        Map<String, String> parameters = new HashMap<>();
        parameters.put(GRANT_TYPE, "client_credentials");
        parameters.put(CLIENT_ID,environment.clientId);
        parameters.put(CLIENT_SECRET,environment.clientSecret);

        TokenResponse tokenResponse;
        HttpResponse<String> response;


        String form = parameters.entrySet()
                .stream()
                .map(e -> e.getKey() + "=" + URLEncoder.encode(e.getValue(), StandardCharsets.UTF_8))
                .collect(Collectors.joining("&"));

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .POST(HttpRequest.BodyPublishers.ofString(form))
                .header("Content-Type", "application/x-www-form-urlencoded")
                .build();


        try {
            response = this.httpClient.send(request,  HttpResponse.BodyHandlers.ofString());
             int status = response.statusCode();
            if(status != 200){
                String message = "Invalid Credentials or Site Name";
                throw new APIException(message + ":" + response.body());
            }
            tokenResponse = mapper.readValue(response.body(), TokenResponse.class);
            return tokenResponse.getAccessToken();
        }catch (InterruptedException | IOException e){
           throw new APIException(e.getMessage());
        }
    }


    public AuthenticationResponse authenticate(Map<String, String> requestData) throws IOException, InterruptedException, URISyntaxException {
        String form = requestData.entrySet()
                .stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.joining("&"));

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI( Environment.defaultConfig().siteName + "/" + TOKEN_ENDPOINT))
                .header("Content-Type", "application/x-www-form-urlencoded")
                .POST(HttpRequest.BodyPublishers.ofString(form, StandardCharsets.UTF_8))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new IOException("Failed to authenticate: " + response.body());
        }

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.readValue(response.body(), AuthenticationResponse.class);
    }

}
