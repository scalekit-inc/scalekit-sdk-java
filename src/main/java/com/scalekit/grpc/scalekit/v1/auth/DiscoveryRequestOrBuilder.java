// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/auth/auth.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.auth;

public interface DiscoveryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.auth.DiscoveryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string email = 1 [json_name = "email", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 1 [json_name = "email", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>.scalekit.v1.auth.Intent intent = 2 [json_name = "intent", (.buf.validate.field) = { ... }</code>
   * @return The enum numeric value on the wire for intent.
   */
  int getIntentValue();
  /**
   * <code>.scalekit.v1.auth.Intent intent = 2 [json_name = "intent", (.buf.validate.field) = { ... }</code>
   * @return The intent.
   */
  com.scalekit.grpc.scalekit.v1.auth.Intent getIntent();
}
