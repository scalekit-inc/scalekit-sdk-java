// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/clients/clients.proto

package com.scalekit.grpc.scalekit.v1.clients;

public interface DeleteClientSecretRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.clients.DeleteClientSecretRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string client_id = 1 [json_name = "clientId", (.buf.validate.field) = { ... }</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <code>string client_id = 1 [json_name = "clientId", (.buf.validate.field) = { ... }</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>string secret_id = 2 [json_name = "secretId", (.buf.validate.field) = { ... }</code>
   * @return The secretId.
   */
  java.lang.String getSecretId();
  /**
   * <code>string secret_id = 2 [json_name = "secretId", (.buf.validate.field) = { ... }</code>
   * @return The bytes for secretId.
   */
  com.google.protobuf.ByteString
      getSecretIdBytes();
}
