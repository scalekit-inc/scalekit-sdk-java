// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/domains/domains.proto

package com.scalekit.grpc.scalekit.v1.domains;

public interface GetDomainRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.domains.GetDomainRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string organization_id = 1 [json_name = "organizationId", (.buf.validate.field) = { ... }</code>
   * @return Whether the organizationId field is set.
   */
  boolean hasOrganizationId();
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
   * <code>string external_id = 2 [json_name = "externalId", (.buf.validate.field) = { ... }</code>
   * @return Whether the externalId field is set.
   */
  boolean hasExternalId();
  /**
   * <code>string external_id = 2 [json_name = "externalId", (.buf.validate.field) = { ... }</code>
   * @return The externalId.
   */
  java.lang.String getExternalId();
  /**
   * <code>string external_id = 2 [json_name = "externalId", (.buf.validate.field) = { ... }</code>
   * @return The bytes for externalId.
   */
  com.google.protobuf.ByteString
      getExternalIdBytes();

  /**
   * <code>string id = 3 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 3 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  com.scalekit.grpc.scalekit.v1.domains.GetDomainRequest.IdentitiesCase getIdentitiesCase();
}