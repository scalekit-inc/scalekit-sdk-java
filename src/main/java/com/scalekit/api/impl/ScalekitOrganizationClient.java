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

    /*
     * Create creates a new organization in Scalekit
     * @param organization: The organization to create
     * @return Organization: The organization created
     * @throws APIException: If an error occurs
     */
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

    /*
     * GetById retrieves an organization by its ID
     * @param id: The organizations ID
     * @return Organization: The organization retrieved
     * @throws APIException: If an error occurs
     */
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

    /*
     * GetByExternalId retrieves an organization by its external ID
     * @param externalId: The organizations external ID
     * @return Organization: The organization retrieved
     * @throws APIException: If an error occurs
     */
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

    /*
     * UpdateById updates an organization by its ID
     * @param id: The organizations ID
     * @param organization: The organization to update
     * @return Organization: The organization updated
     * @throws APIException: If an error occurs
     */
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

    /*
     * UpdateByExternalId updates an organization by its external ID
     * @param externalId: The organizations external ID
     * @param organization: The organization to update
     * @return Organization: The organization updated
     * @throws APIException: If an error occurs
     */
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

    /*
     * DeleteById deletes an organization by its ID returns nothing if successful
     * @param id: The organizations ID
     * @throws APIException: If an error occurs
     */
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

    /*
     * DeleteByExternalId deletes an organization by its external ID returns nothing if successful
     * @param externalId: The organizations external ID
     * @throws APIException: If an error occurs
     */
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

    /*
        * ListOrganizations retrieves a list of organizations
        * The response will have page token to retrieve the next page with the same size
        * <p>
        * @param pageSize: The number of organizations to retrieve default page size is 10
        * @param pageToken: The page token to retrieve the next page
        * @return ListOrganizationsResponse: The list of organizations retrieved
        * @throws APIException: If an error occurs
     */
    @Override
    public ListOrganizationsResponse ListOrganizations(int pageSize, String pageToken) {
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

    /*
        * GeneratePortalLink generates a portal link for an organization
        * @param organizationId: The organization ID
        * @return Link: The portal link generated
        * @throws APIException: If an error occurs
     */
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
