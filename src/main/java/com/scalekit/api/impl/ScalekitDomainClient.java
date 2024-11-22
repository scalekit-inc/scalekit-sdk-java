package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.api.DomainClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.domains.*;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.Deadline;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ScalekitDomainClient implements DomainClient {

    private final DomainServiceGrpc.DomainServiceBlockingStub domainStub;

    public ScalekitDomainClient(ManagedChannel channel, ScalekitCredentials credentials){
        try {
            this.domainStub =  DomainServiceGrpc
                    .newBlockingStub(channel)
                    .withDeadline(Deadline.after(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS))
                    .withCallCredentials(credentials);
        }
        catch (StatusRuntimeException e){
            throw new APIException(e);
        }

    }


    /**
        * createDomain creates a new domain for the organization
        * @param organizationId: The organization ID
        * @param domainName: The domain name
        * @return Domain: The domain created
        * @throws APIException: If an error occurs
     */
    @Override
    public Domain createDomain(String organizationId, String domainName) {
        CreateDomainRequest request = CreateDomainRequest.newBuilder()
                .setOrganizationId(organizationId)
                .setDomain(CreateDomain.newBuilder()
                        .setDomain(domainName)
                        .build()
                ).build();

        try {
            CreateDomainResponse response = domainStub.createDomain(request);
            return response.getDomain();
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }


    /**
        * getDomainById retrieves a domain by its ID
        * @param organizationId: The organization ID
        * @param domainId: The domain ID
        * @return Domain: The domain retrieved
        * @throws APIException: If an error occurs
     */

    @Override
    public Domain getDomainById(String organizationId, String domainId) {
        GetDomainRequest request = GetDomainRequest.newBuilder()
                .setOrganizationId(organizationId)
                .setId(domainId)
                .build();

        try {
            GetDomainResponse response = domainStub.getDomain(request);
            return response.getDomain();
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }

    /**
        * listDomainsByOrganizationId retrieves all domains for an organization
        * @param organizationId: The organization ID
        * @return List<Domain>: The list of domains retrieved
        * @throws APIException: If an error occurs
     */

    @Override
    public List<Domain> listDomainsByOrganizationId(String organizationId) {
        ListDomainRequest request = ListDomainRequest.newBuilder()
                .setOrganizationId(organizationId)
                .build();

        try {
            ListDomainResponse response = domainStub.listDomains(request);
            return response.getDomainsList();
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }

}
