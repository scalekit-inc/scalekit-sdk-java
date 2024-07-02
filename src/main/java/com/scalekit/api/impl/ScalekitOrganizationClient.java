package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.api.OrganizationClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.organizations.*;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.Deadline;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class ScalekitOrganizationClient implements OrganizationClient {

    private final OrganizationServiceGrpc.OrganizationServiceBlockingStub organizationStub;

    public ScalekitOrganizationClient(ManagedChannel channel, ScalekitCredentials credentials){
        try {
            this.organizationStub =  OrganizationServiceGrpc
                    .newBlockingStub(channel)
                    .withCallCredentials(credentials)
                    .withDeadline(Deadline.after(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS))
            ;
        }
        catch (StatusRuntimeException e){
            throw new RuntimeException("Error creating Organization client", e);
        }

    }

    @Override
    public Organization Create(CreateOrganization organization) {
        try {
            CreateOrganizationResponse response = this.organizationStub.createOrganization(
                    CreateOrganizationRequest.newBuilder()
                            .setOrganization(organization)
                            .build()
            );
            return response.getOrganization();
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }

    }

    @Override
    public Organization GetById(String id) {
        try {
            GetOrganizationResponse response = this.organizationStub.getOrganization(
                    GetOrganizationRequest.newBuilder()
                            .setId(id)
                            .build()
            );
            return response.getOrganization();
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }



    }

    @Override
    public Organization GetByExternalId(String externalId) {
        try {
            GetOrganizationResponse response = this.organizationStub.getOrganization(
                    GetOrganizationRequest.newBuilder()
                            .setExternalId(externalId)
                            .build()
            );

            return response.getOrganization();
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }

    }

    @Override
    public Organization UpdateById(String id, UpdateOrganization organization) {

        try {
            UpdateOrganizationResponse response = this.organizationStub.updateOrganization(
                    UpdateOrganizationRequest.newBuilder()
                            .setOrganization(organization)
                            .setId(id)
                            .build()
            );

            return response.getOrganization();
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }

    @Override
    public Organization UpdateByExternalId(String externalId, UpdateOrganization organization) {
        try {
            UpdateOrganizationResponse response = this.organizationStub.updateOrganization(
                    UpdateOrganizationRequest.newBuilder()
                            .setOrganization(organization)
                            .setExternalId(externalId)
                            .build()
            );
            return response.getOrganization();

        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }

    @Override
    public void DeleteById(String id) {
        try {
            this.organizationStub.deleteOrganization(
                    DeleteOrganizationRequest.newBuilder()
                            .setId(id)
                            .build()
            );
        }catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }

    @Override
    public void DeleteByExternalId(String externalId) {

        try {
            this.organizationStub.deleteOrganization(
                    DeleteOrganizationRequest.newBuilder()
                            .setExternalId(externalId)
                            .build()
            );
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }

    }

    @Override
    public List<Organization> GetOrganizations() {
        try {
            ListOrganizationsResponse response = this.organizationStub.listOrganization(
                    ListOrganizationsRequest.newBuilder()
                            .build()
            );
            return response.getOrganizationsList();
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }

    @Override
    public Link GeneratePortalLink(String organizationId) {
        GeneratePortalLinkRequest request = GeneratePortalLinkRequest.newBuilder()
                .setId(organizationId)
                .build();

        try {
            GeneratePortalLinkResponse response = this.organizationStub.generatePortalLink(request);
            return response.getLink();
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }



}
