// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/organizations/organizations.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.organizations;

public interface CreateOrganizationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.organizations.CreateOrganizationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Organization details
   * </pre>
   *
   * <code>.scalekit.v1.organizations.CreateOrganization organization = 1 [json_name = "organization", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the organization field is set.
   */
  boolean hasOrganization();
  /**
   * <pre>
   * Organization details
   * </pre>
   *
   * <code>.scalekit.v1.organizations.CreateOrganization organization = 1 [json_name = "organization", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The organization.
   */
  com.scalekit.grpc.scalekit.v1.organizations.CreateOrganization getOrganization();
  /**
   * <pre>
   * Organization details
   * </pre>
   *
   * <code>.scalekit.v1.organizations.CreateOrganization organization = 1 [json_name = "organization", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationOrBuilder getOrganizationOrBuilder();
}
