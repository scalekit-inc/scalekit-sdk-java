package com.scalekit.api.impl;

import com.google.protobuf.Timestamp;
import com.scalekit.Environment;
import com.scalekit.api.DirectoryClient;
import com.scalekit.api.util.ListDirectoryGroupResponse;
import com.scalekit.api.util.ListDirectoryResourceOptions;
import com.scalekit.api.util.ListDirectoryUserResponse;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.directories.*;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class ScalekitDirectoryClient implements DirectoryClient {

    private final DirectoryServiceGrpc.DirectoryServiceBlockingStub directoryStub;
    private final ScalekitCredentials credentials;

    public ScalekitDirectoryClient(ManagedChannel channel, ScalekitCredentials credentials){
        try {
            this.credentials = credentials;
            this.directoryStub =  DirectoryServiceGrpc
                    .newBlockingStub(channel)
                    .withCallCredentials(credentials);
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
        return RetryExecuter.executeWithRetry(() -> {
            GetDirectoryResponse response = this.directoryStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .getDirectory(
                    GetDirectoryRequest.newBuilder()
                            .setId(directoryId)
                            .setOrganizationId(organizationId)
                            .build()
            );
            return response.getDirectory();
        },this.credentials);
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
        return RetryExecuter.executeWithRetry(() -> this.directoryStub
                .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                .listDirectories(
                ListDirectoriesRequest.newBuilder()
                        .setOrganizationId(organizationId)
                        .build()
        ),this.credentials);
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

        ListDirectoryResourceOptions finalOptions = options;
        return RetryExecuter.executeWithRetry(() -> {
            ListDirectoryUsersRequest request = ListDirectoryUsersRequest.newBuilder()
                    .setDirectoryId(directoryId)
                    .setPageSize(finalOptions.getPageSize())
                    .setPageToken(finalOptions.getPageToken())
                    .setOrganizationId(organizationId)
                    .setIncludeDetail(finalOptions.isIncludeDetail())
                    .setUpdatedAfter(finalOptions.getUpdatedAfter())
                    .build();
            ListDirectoryUsersResponse grpcListDirectoryUsersResponse = directoryStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .listDirectoryUsers(request);
            return new ListDirectoryUserResponse(grpcListDirectoryUsersResponse);
        },this.credentials);
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
        ListDirectoryResourceOptions finalOptions = options;
        return RetryExecuter.executeWithRetry(() -> {
            ListDirectoryGroupsRequest request = ListDirectoryGroupsRequest.newBuilder()
                    .setDirectoryId(directoryId)
                    .setPageSize(finalOptions.getPageSize())
                    .setPageToken(finalOptions.getPageToken())
                    .setIncludeDetail(finalOptions.isIncludeDetail())
                    .setOrganizationId(organizationId)
                    .build();
            ListDirectoryGroupsResponse grpcListDirectoryGroupsResponse = directoryStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .listDirectoryGroups(request);
            return new ListDirectoryGroupResponse(grpcListDirectoryGroupsResponse);
        },this.credentials);
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

       return RetryExecuter.executeWithRetry(() -> {
            ToggleDirectoryRequest request = ToggleDirectoryRequest.newBuilder()
                    .setId(directoryId)
                    .setOrganizationId(organizationId)
                    .build();
            return directoryStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .enableDirectory(request);
        },this.credentials);

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
        return RetryExecuter.executeWithRetry(() -> {
            ToggleDirectoryRequest request = ToggleDirectoryRequest.newBuilder()
                    .setId(directoryId)
                    .setOrganizationId(organizationId)
                    .build();
            return directoryStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .disableDirectory(request);
        },this.credentials);
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

    /**
     * createDirectory creates a new directory in Scalekit
     * @param organizationId: The ID of the organization.
     * @param directory: The directory to create
     * @return Directory: The directory created
     */
    @Override
    public Directory createDirectory(String organizationId, CreateDirectory directory) {

        return RetryExecuter.executeWithRetry(() -> {
            CreateDirectoryResponse response = this.directoryStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .createDirectory(
                    CreateDirectoryRequest.newBuilder()
                            .setOrganizationId(organizationId)
                            .setDirectory(
                                    CreateDirectory.newBuilder()
                                            .setDirectoryProvider(directory.getDirectoryProvider())
                                            .setDirectoryType(
                                                        // use SCIM by default
                                                        directory.getDirectoryType() == DirectoryType.DIRECTORY_TYPE_UNSPECIFIED?
                                                        DirectoryType.SCIM:
                                                        directory.getDirectoryType())
                                            .build()
                            ).build()
            );
            return response.getDirectory();
        },this.credentials);
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
