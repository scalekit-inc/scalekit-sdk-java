package com.scalekit.api.impl;

import com.google.protobuf.Timestamp;
import com.scalekit.Environment;
import com.scalekit.api.DirectoryClient;
import com.scalekit.api.ListDirectoryResourceOptions;
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

    @Override
    public ListDirectoryUsersResponse listDirectoryUsers(String directoryId, String organizationId, ListDirectoryResourceOptions options) {


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
            return directoryStub.listDirectoryUsers(request);
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }

    @Override
    public ListDirectoryGroupsResponse listDirectoryGroups(String directoryId, String organizationId, ListDirectoryResourceOptions options) {
        options = validateOptions(options);
        ListDirectoryGroupsRequest request = ListDirectoryGroupsRequest.newBuilder()
                .setDirectoryId(directoryId)
                .setPageSize(options.getPageSize())
                .setPageToken(options.getPageToken())
                .setIncludeDetail(options.isIncludeDetail())
                .setOrganizationId(organizationId)
                .build();

        try {
            return directoryStub.listDirectoryGroups(request);
        } catch (StatusRuntimeException e) {
            throw new APIException(e);
        }
    }

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

    @Override
    public Directory getPrimaryDirectoryByOrganizationId(String OrganizationId) {

       ListDirectoriesResponse response = listDirectories(OrganizationId);
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
