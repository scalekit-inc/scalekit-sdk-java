package com.scalekit.api.impl;

import com.scalekit.api.OrganizationClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.organizations.*;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;




public class ScalekitOrganizationClient implements OrganizationClient {

    private final OrganizationServiceGrpc.OrganizationServiceBlockingStub organizationStub;

    public ScalekitOrganizationClient(ManagedChannel channel, ScalekitCredentials credentials){
        try {
            this.organizationStub =  OrganizationServiceGrpc
                    .newBlockingStub(channel)
                    .withCallCredentials(credentials);
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

}
