// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/directories/directories.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.directories;

public interface ListDirectoryGroupsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.directories.ListDirectoryGroupsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string organization_id = 1 [json_name = "organizationId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The organizationId.
   */
  java.lang.String getOrganizationId();
  /**
   * <code>string organization_id = 1 [json_name = "organizationId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for organizationId.
   */
  com.google.protobuf.ByteString
      getOrganizationIdBytes();

  /**
   * <code>string directory_id = 2 [json_name = "directoryId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The directoryId.
   */
  java.lang.String getDirectoryId();
  /**
   * <code>string directory_id = 2 [json_name = "directoryId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for directoryId.
   */
  com.google.protobuf.ByteString
      getDirectoryIdBytes();

  /**
   * <code>uint32 page_size = 3 [json_name = "pageSize", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <code>string page_token = 4 [json_name = "pageToken", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <code>string page_token = 4 [json_name = "pageToken", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <code>optional .google.protobuf.Timestamp updated_after = 5 [json_name = "updatedAfter", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the updatedAfter field is set.
   */
  boolean hasUpdatedAfter();
  /**
   * <code>optional .google.protobuf.Timestamp updated_after = 5 [json_name = "updatedAfter", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The updatedAfter.
   */
  com.google.protobuf.Timestamp getUpdatedAfter();
  /**
   * <code>optional .google.protobuf.Timestamp updated_after = 5 [json_name = "updatedAfter", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAfterOrBuilder();

  /**
   * <code>optional bool include_detail = 6 [json_name = "includeDetail", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the includeDetail field is set.
   */
  boolean hasIncludeDetail();
  /**
   * <code>optional bool include_detail = 6 [json_name = "includeDetail", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The includeDetail.
   */
  boolean getIncludeDetail();
}
