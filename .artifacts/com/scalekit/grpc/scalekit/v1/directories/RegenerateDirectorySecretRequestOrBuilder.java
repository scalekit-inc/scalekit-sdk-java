// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/directories/directories.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.directories;

public interface RegenerateDirectorySecretRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.directories.RegenerateDirectorySecretRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string organization_id = 1 [json_name = "organizationId", (.buf.validate.field) = { ... }</code>
   * @return The organizationId.
   */
  java.lang.String getOrganizationId();
  /**
   * <code>string organization_id = 1 [json_name = "organizationId", (.buf.validate.field) = { ... }</code>
   * @return The bytes for organizationId.
   */
  com.google.protobuf.ByteString
      getOrganizationIdBytes();

  /**
   * <code>string directory_id = 2 [json_name = "directoryId", (.buf.validate.field) = { ... }</code>
   * @return The directoryId.
   */
  java.lang.String getDirectoryId();
  /**
   * <code>string directory_id = 2 [json_name = "directoryId", (.buf.validate.field) = { ... }</code>
   * @return The bytes for directoryId.
   */
  com.google.protobuf.ByteString
      getDirectoryIdBytes();
}
