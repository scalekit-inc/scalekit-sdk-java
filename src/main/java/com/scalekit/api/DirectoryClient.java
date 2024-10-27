package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.directories.*;

public interface DirectoryClient {

    ListDirectoriesResponse listDirectories(String organizationId);

    ListDirectoryUsersResponse listDirectoryUsers(String directoryId, String organizationId, ListDirectoryResourceOptions options);

    ListDirectoryGroupsResponse listDirectoryGroups(String directoryId, String organizationId, ListDirectoryResourceOptions options);

    ToggleDirectoryResponse enableDirectory(String directoryId, String organizationId);

    ToggleDirectoryResponse  disableDirectory(String directoryId, String organizationId);

}
