// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/connections/connections.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.connections;

public interface ListOrganizationConnectionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.connections.ListOrganizationConnectionsResponse)
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
   * <code>string prev_page_token = 3 [json_name = "prevPageToken"];</code>
   * @return The prevPageToken.
   */
  java.lang.String getPrevPageToken();
  /**
   * <code>string prev_page_token = 3 [json_name = "prevPageToken"];</code>
   * @return The bytes for prevPageToken.
   */
  com.google.protobuf.ByteString
      getPrevPageTokenBytes();

  /**
   * <code>repeated .scalekit.v1.connections.ListConnection connections = 4 [json_name = "connections", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  java.util.List<com.scalekit.grpc.scalekit.v1.connections.ListConnection> 
      getConnectionsList();
  /**
   * <code>repeated .scalekit.v1.connections.ListConnection connections = 4 [json_name = "connections", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.scalekit.grpc.scalekit.v1.connections.ListConnection getConnections(int index);
  /**
   * <code>repeated .scalekit.v1.connections.ListConnection connections = 4 [json_name = "connections", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  int getConnectionsCount();
  /**
   * <code>repeated .scalekit.v1.connections.ListConnection connections = 4 [json_name = "connections", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  java.util.List<? extends com.scalekit.grpc.scalekit.v1.connections.ListConnectionOrBuilder> 
      getConnectionsOrBuilderList();
  /**
   * <code>repeated .scalekit.v1.connections.ListConnection connections = 4 [json_name = "connections", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.scalekit.grpc.scalekit.v1.connections.ListConnectionOrBuilder getConnectionsOrBuilder(
      int index);
}
