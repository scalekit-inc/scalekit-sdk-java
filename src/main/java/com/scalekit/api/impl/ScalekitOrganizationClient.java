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
import java.util.Objects;
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

    /**
     * create creates a new organization in Scalekit
     * @param organization: The organization to create
     * @return Organization: The organization created
     */
    @Override
    public Organization create(CreateOrganization organization) {
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

    /**
     * getById retrieves an organization by its ID
     * @param id: The organizations ID
     * @return Organization: The organization retrieved
     */
    @Override
    public Organization getById(String id) {
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

    /**
     * getByExternalId retrieves an organization by its external ID
     * @param externalId: The organizations external ID
     * @return Organization: The organization retrieved
     */
    @Override
    public Organization getByExternalId(String externalId) {
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

    /**
     * updateById updates an organization by its ID
     * @param id: The organizations ID
     * @param organization: The organization to update
     * @return Organization: The organization updated
     */
    @Override
    public Organization updateById(String id, UpdateOrganization organization) {

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

    /**
     * updateByExternalId updates an organization by its external ID
     * @param externalId: The organizations external ID
     * @param organization: The organization to update
     * @return Organization: The organization updated
     */
    @Override
    public Organization updateByExternalId(String externalId, UpdateOrganization organization) {
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

    /**
     * deleteById deletes an organization by its ID returns nothing if successful
     * @param id: The organizations ID
     */
    @Override
    public void deleteById(String id) {
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

    /**
     * deleteByExternalId deletes an organization by its external ID returns nothing if successful
     * @param externalId: The organizations external ID
     */
    @Override
    public void deleteByExternalId(String externalId) {

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

    /**
        * distOrganizations retrieves a list of organizations
        * The response will have page token to retrieve the next page with the same size
        * <p>
        * @param pageSize: The number of organizations to retrieve default page size is 10
        * @param pageToken: The page token to retrieve the next page
        * @return ListOrganizationsResponse: The list of organizations retrieved
     */
    @Override
    public ListOrganizationsResponse listOrganizations(int pageSize, String pageToken) {
        if(Objects.isNull(pageToken)) {
            pageToken = "";
        }
        if (pageSize <= 0) {
            pageSize = 10;
        }
        try {
            return this.organizationStub.listOrganization(
                    ListOrganizationsRequest.newBuilder()
                            .setPageSize(pageSize)
                            .setPageToken(pageToken)
                            .build()
            );
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }

    /**
        * generatePortalLink generates a portal link for an organization
        * @param organizationId: The organization ID
        * @return Link: The portal link generate
     */
    @Override
    public Link generatePortalLink(String organizationId) {
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

    /**
        * updateOrganizationSettings updates the settings for an organization
        * @param organizationId: The organization ID
        * @param settings: The settings to update
        * @return Organization: The organization updated
     */
    @Override
    public Organization updateOrganizationSettings(String organizationId, List<OrganizationSettingsFeature> settings) {
        UpdateOrganizationSettingsRequest request = UpdateOrganizationSettingsRequest.newBuilder()
                .setId(organizationId)
                .setSettings(OrganizationSettings.newBuilder().addAllFeatures(settings))
                .build();
        try {
            GetOrganizationResponse  response = this.organizationStub.updateOrganizationSettings(request);
            return response.getOrganization();
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }
}
