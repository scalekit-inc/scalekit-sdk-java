package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse;
import com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse;
import com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersResponse;

public interface DirectoryClient {

    ListDirectoriesResponse listDirectories(String organizationId);

    ListDirectoryUsersResponse listDirectoryUsers(String directoryId, String organizationId, ListDirectoryResourceOptions options);

    ListDirectoryGroupsResponse listDirectoryGroups(String directoryId, String organizationId, ListDirectoryResourceOptions options);


}
