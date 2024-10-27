package com.scalekit;

import com.scalekit.api.*;
import com.scalekit.api.impl.*;
import com.scalekit.exceptions.APIException;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import static com.scalekit.internal.Constants.*;

public class ScalekitClient {
    private final OrganizationClient organizationClient;

    private final DomainClient domainClient;

    private final ConnectionClient connectionClient;

    private final ScalekitAuthClient authenticationClient;

    private final DirectoryClient directoryClient ;

    public ScalekitClient(String siteName, String clientId, String clientSecret) {

        Environment.configure(siteName,clientId,clientSecret);
        Environment environment = Environment.defaultConfig();


        authenticationClient = new ScalekitAuthClient();
        String token = authenticationClient.getClientAccessToken();
        ScalekitCredentials credentials = new ScalekitCredentials(token);
        try {
            URL url = URI.create(environment.siteName).toURL();
            // Managed channel automatically handles channel closing
            ManagedChannel channel = ManagedChannelBuilder.forAddress(url.getAuthority(), 443)
                    .userAgent("scalekit-sdk-java/" + version)
                    .build();

            // Initialize all clients
            organizationClient = new ScalekitOrganizationClient(channel, credentials);
            domainClient = new ScalekitDomainClient(channel, credentials);
            connectionClient = new ScalekitConnectionClient(channel, credentials);
            directoryClient = new ScalekitDirectoryClient(channel, credentials);

        } catch (MalformedURLException e) {
            throw new APIException("invalid environment URL, error:" + e.getMessage());
        }



    }

    public OrganizationClient organizations() {
        return this.organizationClient;
    }

    public DomainClient domains() {
        return this.domainClient;
    }

    public ConnectionClient connections() {
        return this.connectionClient;
    }

    public AuthClient authentication() {
        return this.authenticationClient;
    }

    public DirectoryClient directories() {
        return this.directoryClient;
    }

}
