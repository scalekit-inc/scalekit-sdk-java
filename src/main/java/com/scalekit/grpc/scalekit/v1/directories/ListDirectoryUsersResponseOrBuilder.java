// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/directories/directories.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.directories;

public interface ListDirectoryUsersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.directories.ListDirectoryUsersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .scalekit.v1.directories.DirectoryUser users = 1 [json_name = "users", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  java.util.List<com.scalekit.grpc.scalekit.v1.directories.DirectoryUser> 
      getUsersList();
  /**
   * <code>repeated .scalekit.v1.directories.DirectoryUser users = 1 [json_name = "users", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.scalekit.grpc.scalekit.v1.directories.DirectoryUser getUsers(int index);
  /**
   * <code>repeated .scalekit.v1.directories.DirectoryUser users = 1 [json_name = "users", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  int getUsersCount();
  /**
   * <code>repeated .scalekit.v1.directories.DirectoryUser users = 1 [json_name = "users", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  java.util.List<? extends com.scalekit.grpc.scalekit.v1.directories.DirectoryUserOrBuilder> 
      getUsersOrBuilderList();
  /**
   * <code>repeated .scalekit.v1.directories.DirectoryUser users = 1 [json_name = "users", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.scalekit.grpc.scalekit.v1.directories.DirectoryUserOrBuilder getUsersOrBuilder(
      int index);

  /**
   * <code>uint32 total_size = 2 [json_name = "totalSize", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The totalSize.
   */
  int getTotalSize();

  /**
   * <code>string next_page_token = 3 [json_name = "nextPageToken", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 3 [json_name = "nextPageToken", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <code>string prev_page_token = 4 [json_name = "prevPageToken", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The prevPageToken.
   */
  java.lang.String getPrevPageToken();
  /**
   * <code>string prev_page_token = 4 [json_name = "prevPageToken", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for prevPageToken.
   */
  com.google.protobuf.ByteString
      getPrevPageTokenBytes();
}
