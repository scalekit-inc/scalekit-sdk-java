// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/organizations/organizations.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.organizations;

public interface ListOrganizationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.organizations.ListOrganizationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 page_size = 1 [json_name = "pageSize", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <code>string page_token = 2 [json_name = "pageToken", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <code>string page_token = 2 [json_name = "pageToken", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
