// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/organizations/organizations.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.organizations;

public interface UpdateOrganizationSettingsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.organizations.UpdateOrganizationSettingsRequest)
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
   * <code>.scalekit.v1.organizations.OrganizationSettings settings = 2 [json_name = "settings", (.buf.validate.field) = { ... }</code>
   * @return Whether the settings field is set.
   */
  boolean hasSettings();
  /**
   * <code>.scalekit.v1.organizations.OrganizationSettings settings = 2 [json_name = "settings", (.buf.validate.field) = { ... }</code>
   * @return The settings.
   */
  com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings getSettings();
  /**
   * <code>.scalekit.v1.organizations.OrganizationSettings settings = 2 [json_name = "settings", (.buf.validate.field) = { ... }</code>
   */
  com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettingsOrBuilder getSettingsOrBuilder();
}