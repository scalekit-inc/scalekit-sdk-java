// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/organizations/organizations.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.organizations;

public interface UpdateOrganizationSessionSettingsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.organizations.UpdateOrganizationSessionSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string environment_id = 2 [json_name = "environmentId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The environmentId.
   */
  java.lang.String getEnvironmentId();
  /**
   * <code>string environment_id = 2 [json_name = "environmentId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for environmentId.
   */
  com.google.protobuf.ByteString
      getEnvironmentIdBytes();

  /**
   * <code>.scalekit.v1.organizations.OrganizationSessionSettings session_settings = 3 [json_name = "sessionSettings", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the sessionSettings field is set.
   */
  boolean hasSessionSettings();
  /**
   * <code>.scalekit.v1.organizations.OrganizationSessionSettings session_settings = 3 [json_name = "sessionSettings", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The sessionSettings.
   */
  com.scalekit.grpc.scalekit.v1.organizations.OrganizationSessionSettings getSessionSettings();
  /**
   * <code>.scalekit.v1.organizations.OrganizationSessionSettings session_settings = 3 [json_name = "sessionSettings", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.scalekit.grpc.scalekit.v1.organizations.OrganizationSessionSettingsOrBuilder getSessionSettingsOrBuilder();
}
