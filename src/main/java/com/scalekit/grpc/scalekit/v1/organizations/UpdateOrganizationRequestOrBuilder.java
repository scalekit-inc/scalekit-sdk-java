// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/organizations/organizations.proto

package com.scalekit.grpc.scalekit.v1.organizations;

public interface UpdateOrganizationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.organizations.UpdateOrganizationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
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
   * <code>string external_id = 2 [json_name = "externalId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the externalId field is set.
   */
  boolean hasExternalId();
  /**
   * <code>string external_id = 2 [json_name = "externalId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The externalId.
   */
  java.lang.String getExternalId();
  /**
   * <code>string external_id = 2 [json_name = "externalId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for externalId.
   */
  com.google.protobuf.ByteString
      getExternalIdBytes();

  /**
   * <code>.scalekit.v1.organizations.UpdateOrganization organization = 3 [json_name = "organization", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the organization field is set.
   */
  boolean hasOrganization();
  /**
   * <code>.scalekit.v1.organizations.UpdateOrganization organization = 3 [json_name = "organization", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The organization.
   */
  com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganization getOrganization();
  /**
   * <code>.scalekit.v1.organizations.UpdateOrganization organization = 3 [json_name = "organization", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationOrBuilder getOrganizationOrBuilder();

  /**
   * <code>.google.protobuf.FieldMask update_mask = 99 [json_name = "updateMask"];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <code>.google.protobuf.FieldMask update_mask = 99 [json_name = "updateMask"];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <code>.google.protobuf.FieldMask update_mask = 99 [json_name = "updateMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationRequest.IdentitiesCase getIdentitiesCase();
}
