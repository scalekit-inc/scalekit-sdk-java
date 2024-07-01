package com.scalekit.api.impl;

import com.scalekit.api.DomainClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.domains.*;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;

import java.util.List;

public class ScalekitDomainClient implements DomainClient {

    private final DomainServiceGrpc.DomainServiceBlockingStub domainStub;

    public ScalekitDomainClient(ManagedChannel channel, ScalekitCredentials credentials){
        try {
            this.domainStub =  DomainServiceGrpc
                    .newBlockingStub(channel)
                    .withCallCredentials(credentials);
        }
        catch (StatusRuntimeException e){
            throw new APIException(e);
        }

    }

    @Override
    public Domain CreateDomain(String organizationId, String domainName) {
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

    @Override
    public Domain GetDomainById(String organizationId, String domainId) {
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

    @Override
    public List<Domain> ListDomainsByOrganizationId(String organizationId) {
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
