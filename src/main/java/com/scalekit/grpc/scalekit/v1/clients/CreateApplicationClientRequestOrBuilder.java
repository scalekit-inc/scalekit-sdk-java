// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/clients/clients.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.clients;

public interface CreateApplicationClientRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.clients.CreateApplicationClientRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string application_id = 1 [json_name = "applicationId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The applicationId.
   */
  java.lang.String getApplicationId();
  /**
   * <code>string application_id = 1 [json_name = "applicationId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for applicationId.
   */
  com.google.protobuf.ByteString
      getApplicationIdBytes();

  /**
   * <code>.scalekit.v1.clients.ApplicationClient client = 2 [json_name = "client", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the client field is set.
   */
  boolean hasClient();
  /**
   * <code>.scalekit.v1.clients.ApplicationClient client = 2 [json_name = "client", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The client.
   */
  com.scalekit.grpc.scalekit.v1.clients.ApplicationClient getClient();
  /**
   * <code>.scalekit.v1.clients.ApplicationClient client = 2 [json_name = "client", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.scalekit.grpc.scalekit.v1.clients.ApplicationClientOrBuilder getClientOrBuilder();
}
