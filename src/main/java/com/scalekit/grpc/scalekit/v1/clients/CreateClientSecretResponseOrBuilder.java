// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/clients/clients.proto

package com.scalekit.grpc.scalekit.v1.clients;

public interface CreateClientSecretResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.clients.CreateClientSecretResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string plain_secret = 1 [json_name = "plainSecret"];</code>
   * @return The plainSecret.
   */
  java.lang.String getPlainSecret();
  /**
   * <code>string plain_secret = 1 [json_name = "plainSecret"];</code>
   * @return The bytes for plainSecret.
   */
  com.google.protobuf.ByteString
      getPlainSecretBytes();

  /**
   * <code>.scalekit.v1.clients.ClientSecret secret = 2 [json_name = "secret"];</code>
   * @return Whether the secret field is set.
   */
  boolean hasSecret();
  /**
   * <code>.scalekit.v1.clients.ClientSecret secret = 2 [json_name = "secret"];</code>
   * @return The secret.
   */
  com.scalekit.grpc.scalekit.v1.clients.ClientSecret getSecret();
  /**
   * <code>.scalekit.v1.clients.ClientSecret secret = 2 [json_name = "secret"];</code>
   */
  com.scalekit.grpc.scalekit.v1.clients.ClientSecretOrBuilder getSecretOrBuilder();
}