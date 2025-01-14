package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.api.DomainClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.domains.*;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.Deadline;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ScalekitDomainClient implements DomainClient {

    private final DomainServiceGrpc.DomainServiceBlockingStub domainStub;
    private final ScalekitCredentials credentials;

    public ScalekitDomainClient(ManagedChannel channel, ScalekitCredentials credentials) {
        try {
            this.credentials = credentials;
            this.domainStub = DomainServiceGrpc
                    .newBlockingStub(channel)
                    .withCallCredentials(credentials);
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }

    }


    /**
     * createDomain creates a new domain for the organization
     *
     * @param organizationId: The organization ID
     * @param domainName:     The domain name
     * @return Domain: The domain created
     */
    @Override
    public Domain createDomain(String organizationId, String domainName) {
        return RetryExecuter.executeWithRetry(() -> {
            CreateDomainResponse response = this.domainStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .createDomain(
                    CreateDomainRequest.newBuilder()
                            .setOrganizationId(organizationId)
                            .setDomain(CreateDomain.newBuilder()
                                    .setDomain(domainName)
                                    .build()
                            ).build()
            );
            return response.getDomain();
        }, this.credentials);
    }


    /**
     * getDomainById retrieves a domain by its ID
     *
     * @param organizationId: The organization ID
     * @param domainId:       The domain ID
     * @return Domain: The domain retrieved
     */

    @Override
    public Domain getDomainById(String organizationId, String domainId) {
        return RetryExecuter.executeWithRetry(() -> {
            GetDomainResponse response = this.domainStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .getDomain(
                    GetDomainRequest.newBuilder()
                            .setOrganizationId(organizationId)
                            .setId(domainId)
                            .build()
            );
            return response.getDomain();
        }, this.credentials);
    }

    /**
     * listDomainsByOrganizationId retrieves all domains for an organization
     *
     * @param organizationId: The organization ID
     * @return List of Domain: The list of domains retrieved
     */

    @Override
    public List<Domain> listDomainsByOrganizationId(String organizationId) {

        return RetryExecuter.executeWithRetry(() -> {
            ListDomainResponse response = this.domainStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .listDomains(
                    ListDomainRequest.newBuilder()
                            .setOrganizationId(organizationId)
                            .build());
            return response.getDomainsList();}, this.credentials);

    }
}