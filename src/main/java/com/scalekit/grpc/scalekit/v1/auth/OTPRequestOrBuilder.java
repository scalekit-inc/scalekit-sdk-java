// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/auth/auth.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.auth;

public interface OTPRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.auth.OTPRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string code_challenge = 1 [json_name = "codeChallenge", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The codeChallenge.
   */
  java.lang.String getCodeChallenge();
  /**
   * <code>string code_challenge = 1 [json_name = "codeChallenge", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for codeChallenge.
   */
  com.google.protobuf.ByteString
      getCodeChallengeBytes();
}
