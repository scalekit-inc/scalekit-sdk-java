// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/directories/directories.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.directories;

public interface SecretOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.directories.Secret)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.google.protobuf.Timestamp create_time = 2 [json_name = "createTime", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 2 [json_name = "createTime", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 2 [json_name = "createTime", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <code>string secret_suffix = 4 [json_name = "secretSuffix", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The secretSuffix.
   */
  java.lang.String getSecretSuffix();
  /**
   * <code>string secret_suffix = 4 [json_name = "secretSuffix", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for secretSuffix.
   */
  com.google.protobuf.ByteString
      getSecretSuffixBytes();

  /**
   * <code>.scalekit.v1.directories.SecretStatus status = 5 [json_name = "status", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.scalekit.v1.directories.SecretStatus status = 5 [json_name = "status", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The status.
   */
  com.scalekit.grpc.scalekit.v1.directories.SecretStatus getStatus();

  /**
   * <code>.google.protobuf.Timestamp expire_time = 6 [json_name = "expireTime", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   * <code>.google.protobuf.Timestamp expire_time = 6 [json_name = "expireTime", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   * <code>.google.protobuf.Timestamp expire_time = 6 [json_name = "expireTime", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp last_used_time = 7 [json_name = "lastUsedTime", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the lastUsedTime field is set.
   */
  boolean hasLastUsedTime();
  /**
   * <code>.google.protobuf.Timestamp last_used_time = 7 [json_name = "lastUsedTime", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The lastUsedTime.
   */
  com.google.protobuf.Timestamp getLastUsedTime();
  /**
   * <code>.google.protobuf.Timestamp last_used_time = 7 [json_name = "lastUsedTime", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUsedTimeOrBuilder();

  /**
   * <code>string directory_id = 9 [json_name = "directoryId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The directoryId.
   */
  java.lang.String getDirectoryId();
  /**
   * <code>string directory_id = 9 [json_name = "directoryId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for directoryId.
   */
  com.google.protobuf.ByteString
      getDirectoryIdBytes();
}
