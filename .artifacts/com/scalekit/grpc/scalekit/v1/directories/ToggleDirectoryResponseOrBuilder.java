// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/directories/directories.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.directories;

public interface ToggleDirectoryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.directories.ToggleDirectoryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool enabled = 1 [json_name = "enabled", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <code>optional string error_message = 2 [json_name = "errorMessage", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the errorMessage field is set.
   */
  boolean hasErrorMessage();
  /**
   * <code>optional string error_message = 2 [json_name = "errorMessage", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   * <code>optional string error_message = 2 [json_name = "errorMessage", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();
}
