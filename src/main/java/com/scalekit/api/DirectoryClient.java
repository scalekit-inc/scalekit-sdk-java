package com.scalekit.api;

import com.scalekit.api.util.ListDirectoryGroupResponse;
import com.scalekit.api.util.ListDirectoryResourceOptions;
import com.scalekit.api.util.ListDirectoryUserResponse;
import com.scalekit.grpc.scalekit.v1.directories.*;

public interface DirectoryClient {

    Directory getDirectory(String directoryId, String organizationId);

    ListDirectoriesResponse listDirectories(String organizationId);

    ListDirectoryUserResponse listDirectoryUsers(String directoryId, String organizationId, ListDirectoryResourceOptions options);

    ListDirectoryGroupResponse listDirectoryGroups(String directoryId, String organizationId, ListDirectoryResourceOptions options);

    ToggleDirectoryResponse enableDirectory(String directoryId, String organizationId);

    ToggleDirectoryResponse  disableDirectory(String directoryId, String organizationId);

    Directory getPrimaryDirectoryByOrganizationId(String organizationId);

    Directory createDirectory(String organizationId, CreateDirectory directory);
}
