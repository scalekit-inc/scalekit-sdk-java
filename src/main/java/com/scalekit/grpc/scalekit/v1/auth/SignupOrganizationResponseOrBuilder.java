// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/auth/auth.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.auth;

public interface SignupOrganizationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.auth.SignupOrganizationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string organization_id = 1 [json_name = "organizationId"];</code>
   * @return The organizationId.
   */
  java.lang.String getOrganizationId();
  /**
   * <code>string organization_id = 1 [json_name = "organizationId"];</code>
   * @return The bytes for organizationId.
   */
  com.google.protobuf.ByteString
      getOrganizationIdBytes();

  /**
   * <code>string organization_name = 2 [json_name = "organizationName"];</code>
   * @return The organizationName.
   */
  java.lang.String getOrganizationName();
  /**
   * <code>string organization_name = 2 [json_name = "organizationName"];</code>
   * @return The bytes for organizationName.
   */
  com.google.protobuf.ByteString
      getOrganizationNameBytes();
}
