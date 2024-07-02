package com.scalekit;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.scalekit.api.ConnectionClient;
import com.scalekit.api.DomainClient;
import com.scalekit.api.OrganizationClient;
import com.scalekit.api.impl.ScalekitConnectionClient;
import com.scalekit.api.impl.ScalekitDomainClient;
import com.scalekit.api.impl.ScalekitOrganizationClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.internal.ScalekitCredentials;
import com.scalekit.internal.http.TokenResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static com.scalekit.internal.Constants.*;

public class ScalekitClient {
    private final OrganizationClient organizationClient;

    private final DomainClient domainClient;

    private final ConnectionClient connectionClient;

    public ScalekitClient(String siteName, String clientId, String clientSecret){

        Environment.configure(siteName,clientId,clientSecret);
        Environment environment = Environment.defaultConfig();
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

        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(3))
                .build();

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
            response = httpClient.send(request,  HttpResponse.BodyHandlers.ofString());
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
}
