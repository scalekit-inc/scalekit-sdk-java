// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/environments/environments.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.environments;

public interface ListEnvironmentsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.environments.ListEnvironmentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <code>uint32 total_size = 2 [json_name = "totalSize"];</code>
   * @return The totalSize.
   */
  int getTotalSize();

  /**
   * <code>repeated .scalekit.v1.environments.Environment environments = 3 [json_name = "environments"];</code>
   */
  java.util.List<com.scalekit.grpc.scalekit.v1.environments.Environment> 
      getEnvironmentsList();
  /**
   * <code>repeated .scalekit.v1.environments.Environment environments = 3 [json_name = "environments"];</code>
   */
  com.scalekit.grpc.scalekit.v1.environments.Environment getEnvironments(int index);
  /**
   * <code>repeated .scalekit.v1.environments.Environment environments = 3 [json_name = "environments"];</code>
   */
  int getEnvironmentsCount();
  /**
   * <code>repeated .scalekit.v1.environments.Environment environments = 3 [json_name = "environments"];</code>
   */
  java.util.List<? extends com.scalekit.grpc.scalekit.v1.environments.EnvironmentOrBuilder> 
      getEnvironmentsOrBuilderList();
  /**
   * <code>repeated .scalekit.v1.environments.Environment environments = 3 [json_name = "environments"];</code>
   */
  com.scalekit.grpc.scalekit.v1.environments.EnvironmentOrBuilder getEnvironmentsOrBuilder(
      int index);
}
