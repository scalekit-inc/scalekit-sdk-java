// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/organizations/organizations.proto

package com.scalekit.grpc.scalekit.v1.organizations;

public interface SearchOrganizationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.organizations.SearchOrganizationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string query = 1 [json_name = "query", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   * <code>string query = 1 [json_name = "query", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <code>uint32 page_size = 2 [json_name = "pageSize", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <code>string page_token = 3 [json_name = "pageToken"];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <code>string page_token = 3 [json_name = "pageToken"];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
