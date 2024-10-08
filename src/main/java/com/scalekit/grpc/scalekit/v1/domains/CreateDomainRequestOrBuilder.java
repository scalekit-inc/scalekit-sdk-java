// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/domains/domains.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.domains;

public interface CreateDomainRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.domains.CreateDomainRequest)
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
   * <code>optional string connection_id = 3 [json_name = "connectionId"];</code>
   * @return Whether the connectionId field is set.
   */
  boolean hasConnectionId();
  /**
   * <code>optional string connection_id = 3 [json_name = "connectionId"];</code>
   * @return The connectionId.
   */
  java.lang.String getConnectionId();
  /**
   * <code>optional string connection_id = 3 [json_name = "connectionId"];</code>
   * @return The bytes for connectionId.
   */
  com.google.protobuf.ByteString
      getConnectionIdBytes();

  /**
   * <code>.scalekit.v1.domains.CreateDomain domain = 4 [json_name = "domain"];</code>
   * @return Whether the domain field is set.
   */
  boolean hasDomain();
  /**
   * <code>.scalekit.v1.domains.CreateDomain domain = 4 [json_name = "domain"];</code>
   * @return The domain.
   */
  com.scalekit.grpc.scalekit.v1.domains.CreateDomain getDomain();
  /**
   * <code>.scalekit.v1.domains.CreateDomain domain = 4 [json_name = "domain"];</code>
   */
  com.scalekit.grpc.scalekit.v1.domains.CreateDomainOrBuilder getDomainOrBuilder();

  com.scalekit.grpc.scalekit.v1.domains.CreateDomainRequest.IdentitiesCase getIdentitiesCase();
}
