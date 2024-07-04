package com.scalekit;

import com.scalekit.api.AuthClient;
import com.scalekit.api.ConnectionClient;
import com.scalekit.api.DomainClient;
import com.scalekit.api.OrganizationClient;
import com.scalekit.api.impl.ScalekitAuthClient;
import com.scalekit.api.impl.ScalekitConnectionClient;
import com.scalekit.api.impl.ScalekitDomainClient;
import com.scalekit.api.impl.ScalekitOrganizationClient;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import static com.scalekit.internal.Constants.*;

public class ScalekitClient {
    private final OrganizationClient organizationClient;

    private final DomainClient domainClient;

    private final ConnectionClient connectionClient;

    private final ScalekitAuthClient authenticationClient;

    public ScalekitClient(String siteName, String clientId, String clientSecret){

        Environment.configure(siteName,clientId,clientSecret);
        Environment environment = Environment.defaultConfig();


        authenticationClient = new ScalekitAuthClient();
        String token = authenticationClient.getClientAccessToken();
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

}
