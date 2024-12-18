package com.scalekit.api.impl;

import com.google.protobuf.Timestamp;
import com.scalekit.Environment;
import com.scalekit.api.DirectoryClient;
import com.scalekit.api.util.ListDirectoryGroupResponse;
import com.scalekit.api.util.ListDirectoryResourceOptions;
import com.scalekit.api.util.ListDirectoryUserResponse;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.directories.*;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.Deadline;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class ScalekitDirectoryClient implements DirectoryClient {

    private final DirectoryServiceGrpc.DirectoryServiceBlockingStub directoryStub;

    public ScalekitDirectoryClient(ManagedChannel channel, ScalekitCredentials credentials){
        try {
            this.directoryStub =  DirectoryServiceGrpc
                    .newBlockingStub(channel)
                    .withCallCredentials(credentials)
                    .withDeadline(Deadline.after(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS))
            ;
        }
        catch (StatusRuntimeException e){
            throw new RuntimeException("Error creating Directory client", e);
        }

    }



    /**
     * Retrieves a directory by its ID and organization ID.
     *
     * @param directoryId The ID of the directory.
     * @param organizationId The ID of the organization.
     * @return The directory retrieved.
     * @throws APIException If an error occurs.
     */
    @Override
    public Directory getDirectory(String directoryId, String organizationId) {
        GetDirectoryRequest request = GetDirectoryRequest.newBuilder()
                .setId(directoryId)
                .setOrganizationId(organizationId)
                .build();

        try {
            return directoryStub.getDirectory(request).getDirectory();
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }

    /**
     * Lists all directories for a given organization ID.
     *
     * @param organizationId The ID of the organization.
     * @return The list of directories.
     * @throws APIException If an error occurs.
     */
    @Override
    public ListDirectoriesResponse listDirectories(String organizationId) {
        ListDirectoriesRequest request = ListDirectoriesRequest.newBuilder()
                .setOrganizationId(organizationId)
                .build();

        try {
            return directoryStub.listDirectories(request);
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }


    /**
     * Lists all users in a directory with specified options.
     *
     * @param directoryId The ID of the directory.
     * @param organizationId The ID of the organization.
     * @param options The options for listing directory users.
     * @return The list of directory users.
     * @throws APIException If an error occurs.
     */
    @Override
    public ListDirectoryUserResponse listDirectoryUsers(String directoryId, String organizationId, ListDirectoryResourceOptions options) {


        options = validateOptions(options);

        ListDirectoryUsersRequest request = ListDirectoryUsersRequest.newBuilder()
                .setDirectoryId(directoryId)
                .setPageSize(options.getPageSize())
                .setPageToken(options.getPageToken())
                .setOrganizationId(organizationId)
                .setIncludeDetail(options.isIncludeDetail())
                .setUpdatedAfter(options.getUpdatedAfter())
                .build();

        try {
            ListDirectoryUsersResponse grpcListDirectoryUsersResponse = directoryStub.listDirectoryUsers(request);
            return new ListDirectoryUserResponse(grpcListDirectoryUsersResponse);
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }


    /**
     * Lists all groups in a directory with specified options.
     *
     * @param directoryId The ID of the directory.
     * @param organizationId The ID of the organization.
     * @param options The options for listing directory groups.
     * @return The list of directory groups.
     * @throws APIException If an error occurs.
     */
    @Override
    public ListDirectoryGroupResponse listDirectoryGroups(String directoryId, String organizationId, ListDirectoryResourceOptions options) {
        options = validateOptions(options);
        ListDirectoryGroupsRequest request = ListDirectoryGroupsRequest.newBuilder()
                .setDirectoryId(directoryId)
                .setPageSize(options.getPageSize())
                .setPageToken(options.getPageToken())
                .setIncludeDetail(options.isIncludeDetail())
                .setOrganizationId(organizationId)
                .build();

        try {
            ListDirectoryGroupsResponse response = directoryStub.listDirectoryGroups(request);
            return new ListDirectoryGroupResponse(response);
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }


    /**
     * Enables a directory by its ID and organization ID.
     *
     * @param directoryId The ID of the directory.
     * @param organizationId The ID of the organization.
     * @return The response after enabling the directory.
     * @throws APIException If an error occurs.
     */
    @Override
    public ToggleDirectoryResponse enableDirectory(String directoryId, String organizationId) {
        ToggleDirectoryRequest request = ToggleDirectoryRequest.newBuilder()
                .setId(directoryId)
                .setOrganizationId(organizationId)
                .build();
        try {
            return directoryStub.enableDirectory(request);
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }

    }


    /**
     * Disables a directory by its ID and organization ID.
     *
     * @param directoryId The ID of the directory.
     * @param organizationId The ID of the organization.
     * @return The response after disabling the directory.
     * @throws APIException If an error occurs.
     */
    @Override
    public ToggleDirectoryResponse disableDirectory(String directoryId, String organizationId) {
        ToggleDirectoryRequest request = ToggleDirectoryRequest.newBuilder()
                .setId(directoryId)
                .setOrganizationId(organizationId)
                .build();
        try {
            return directoryStub.disableDirectory(request);
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }

    /**
     * Retrieves the primary directory for a given organization ID.
     *
     * @param organizationId The ID of the organization.
     * @return The primary directory.
     * @throws APIException If an error occurs.
     */
    @Override
    public Directory getPrimaryDirectoryByOrganizationId(String organizationId) {

       ListDirectoriesResponse response = listDirectories(organizationId);
       if (response.getDirectoriesCount() == 0){
           throw new APIException("Directory does not exist for organization");
       }
         return response.getDirectories(0);
    }


    private ListDirectoryResourceOptions validateOptions(ListDirectoryResourceOptions options){
        if (Objects.isNull(options)){
            options = new ListDirectoryResourceOptions();
        }

        if (Objects.isNull(options.getUpdatedAfter())){
            options.setUpdatedAfter(Timestamp.newBuilder().getDefaultInstanceForType());
        }

        if (Objects.isNull(options.getPageToken())){
            options.setPageToken("");
        }
        return options;
    }

}
