// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/domains/domains.proto

package com.scalekit.grpc.scalekit.v1.domains;

public interface DeleteDomainRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.domains.DeleteDomainRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string organization_id = 2 [json_name = "organizationId", (.buf.validate.field) = { ... }</code>
   * @return Whether the organizationId field is set.
   */
  boolean hasOrganizationId();
  /**
   * <code>string organization_id = 2 [json_name = "organizationId", (.buf.validate.field) = { ... }</code>
   * @return The organizationId.
   */
  java.lang.String getOrganizationId();
  /**
   * <code>string organization_id = 2 [json_name = "organizationId", (.buf.validate.field) = { ... }</code>
   * @return The bytes for organizationId.
   */
  com.google.protobuf.ByteString
      getOrganizationIdBytes();

  /**
   * <code>string external_id = 3 [json_name = "externalId", (.buf.validate.field) = { ... }</code>
   * @return Whether the externalId field is set.
   */
  boolean hasExternalId();
  /**
   * <code>string external_id = 3 [json_name = "externalId", (.buf.validate.field) = { ... }</code>
   * @return The externalId.
   */
  java.lang.String getExternalId();
  /**
   * <code>string external_id = 3 [json_name = "externalId", (.buf.validate.field) = { ... }</code>
   * @return The bytes for externalId.
   */
  com.google.protobuf.ByteString
      getExternalIdBytes();

  /**
   * <code>optional string connection_id = 4 [json_name = "connectionId"];</code>
   * @return Whether the connectionId field is set.
   */
  boolean hasConnectionId();
  /**
   * <code>optional string connection_id = 4 [json_name = "connectionId"];</code>
   * @return The connectionId.
   */
  java.lang.String getConnectionId();
  /**
   * <code>optional string connection_id = 4 [json_name = "connectionId"];</code>
   * @return The bytes for connectionId.
   */
  com.google.protobuf.ByteString
      getConnectionIdBytes();

  com.scalekit.grpc.scalekit.v1.domains.DeleteDomainRequest.IdentitiesCase getIdentitiesCase();
}
