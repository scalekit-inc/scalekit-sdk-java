// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/clients/clients.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.clients;

public interface CreateOrganizationClientRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.clients.CreateOrganizationClientRequest)
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
   * <code>.scalekit.v1.clients.OrganizationClient client = 2 [json_name = "client", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the client field is set.
   */
  boolean hasClient();
  /**
   * <code>.scalekit.v1.clients.OrganizationClient client = 2 [json_name = "client", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The client.
   */
  com.scalekit.grpc.scalekit.v1.clients.OrganizationClient getClient();
  /**
   * <code>.scalekit.v1.clients.OrganizationClient client = 2 [json_name = "client", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.scalekit.grpc.scalekit.v1.clients.OrganizationClientOrBuilder getClientOrBuilder();
}
