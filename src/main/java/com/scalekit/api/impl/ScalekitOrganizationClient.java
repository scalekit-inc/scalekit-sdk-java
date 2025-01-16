package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.api.OrganizationClient;
import com.scalekit.grpc.scalekit.v1.organizations.*;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;


public class ScalekitOrganizationClient implements OrganizationClient {

    private final OrganizationServiceGrpc.OrganizationServiceBlockingStub organizationStub;
    private final ScalekitCredentials credentials;

    public ScalekitOrganizationClient(ManagedChannel channel, ScalekitCredentials credentials){
        try {
            this.credentials = credentials;
            this.organizationStub =  OrganizationServiceGrpc
                    .newBlockingStub(channel)
                    .withCallCredentials(this.credentials);

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
        return RetryExecuter.executeWithRetry(() -> {
            CreateOrganizationResponse response = this.organizationStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .createOrganization(
                    CreateOrganizationRequest.newBuilder()
                            .setOrganization(organization)
                            .build()
            );
            return response.getOrganization();
        },this.credentials);

    }

    /**
     * getById retrieves an organization by its ID
     * @param id: The organizations ID
     * @return Organization: The organization retrieved
     */
    @Override
    public Organization getById(String id) {
        return RetryExecuter.executeWithRetry(() -> {
            GetOrganizationResponse response = this.organizationStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                            .getOrganization(
                    GetOrganizationRequest.newBuilder()
                            .setId(id)
                            .build()
            );
            return response.getOrganization();
        },this.credentials);



    }

    /**
     * getByExternalId retrieves an organization by its external ID
     * @param externalId: The organizations external ID
     * @return Organization: The organization retrieved
     */
    @Override
    public Organization getByExternalId(String externalId) {
        return RetryExecuter.executeWithRetry(() -> {
            GetOrganizationResponse response = this.organizationStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                            .getOrganization(
                    GetOrganizationRequest.newBuilder()
                            .setExternalId(externalId)
                            .build()
            );
            return response.getOrganization();
        },this.credentials);

    }

    /**
     * updateById updates an organization by its ID
     * @param id: The organizations ID
     * @param organization: The organization to update
     * @return Organization: The organization updated
     */
    @Override
    public Organization updateById(String id, UpdateOrganization organization) {
        return RetryExecuter.executeWithRetry(() -> {
            UpdateOrganizationResponse response = this.organizationStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .updateOrganization(
                    UpdateOrganizationRequest.newBuilder()
                            .setOrganization(organization)
                            .setId(id)
                            .build()
            );
            return response.getOrganization();
        },this.credentials);
    }

    /**
     * updateByExternalId updates an organization by its external ID
     * @param externalId: The organizations external ID
     * @param organization: The organization to update
     * @return Organization: The organization updated
     */
    @Override
    public Organization updateByExternalId(String externalId, UpdateOrganization organization) {
        return RetryExecuter.executeWithRetry(() -> {
            UpdateOrganizationResponse response = this.organizationStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .updateOrganization(
                    UpdateOrganizationRequest.newBuilder()
                            .setOrganization(organization)
                            .setExternalId(externalId)
                            .build()
            );
            return response.getOrganization();
        },this.credentials);
    }

    /**
     * deleteById deletes an organization by its ID returns nothing if successful
     * @param id: The organizations ID
     */
    @Override
    public void deleteById(String id) {
        RetryExecuter.executeWithRetry(() -> {
            this.organizationStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .deleteOrganization(
                    DeleteOrganizationRequest.newBuilder()
                            .setId(id)
                            .build()
            );
            return null;
        },this.credentials);
    }

    /**
     * deleteByExternalId deletes an organization by its external ID returns nothing if successful
     * @param externalId: The organizations external ID
     */
    @Override
    public void deleteByExternalId(String externalId) {

      RetryExecuter.executeWithRetry(() -> {
            this.organizationStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .deleteOrganization(
                    DeleteOrganizationRequest.newBuilder()
                            .setExternalId(externalId)
                            .build()
            );
            return null;
        },this.credentials);

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
    public ListOrganizationsResponse listOrganizations( int pageSize, String pageToken) {
        String finalPageToken = pageToken;
        int finalPageSize = pageSize;
        if (Objects.isNull(finalPageToken)) {
            finalPageToken = "";
        }
        if (finalPageSize <= 0) {
            finalPageSize = 10;
        }
        final String effectivePageToken = finalPageToken;
        final int effectivePageSize = finalPageSize;
        return RetryExecuter.executeWithRetry(() -> {
            ListOrganizationsRequest request = ListOrganizationsRequest.newBuilder()
                    .setPageSize(effectivePageSize)
                    .setPageToken(effectivePageToken)
                    .build();
            return this.organizationStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .listOrganization(request);
        },this.credentials);
    }

    /**
        * generatePortalLink generates a portal link for an organization
        * @param organizationId: The organization ID
        * @return Link: The portal link generate
     */
    @Override
    public Link generatePortalLink(String organizationId) {
       return generatePortalLink(organizationId, Collections.emptyList());
    }


    /**
     * generatePortalLink generates a portal link for an organization
     * @param organizationId: The organization ID
     * @param features: The features for which the portal link is generated
     * @return Link: The portal link generate
     */
    @Override
    public Link generatePortalLink(String organizationId, List<Feature> features) {
        return RetryExecuter.executeWithRetry(() -> {
            GeneratePortalLinkRequest request = GeneratePortalLinkRequest.newBuilder()
                    .setId(organizationId)
                    .addAllFeatures(features)
                    .build();
            GeneratePortalLinkResponse response = this.organizationStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .generatePortalLink(request);
            return response.getLink();
        },this.credentials);
    }


    /**
        * updateOrganizationSettings updates the settings for an organization
        * @param organizationId: The organization ID
        * @param settings: The settings to update
        * @return Organization: The organization updated
     */
    @Override
    public Organization updateOrganizationSettings(String organizationId, List<OrganizationSettingsFeature> settings) {
        return RetryExecuter.executeWithRetry(() -> {
            UpdateOrganizationSettingsRequest request = UpdateOrganizationSettingsRequest.newBuilder()
                    .setId(organizationId)
                    .setSettings(OrganizationSettings.newBuilder().addAllFeatures(settings))
                    .build();
            GetOrganizationResponse  response = this.organizationStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .updateOrganizationSettings(request);
            return response.getOrganization();
        },this.credentials);
    }


}
