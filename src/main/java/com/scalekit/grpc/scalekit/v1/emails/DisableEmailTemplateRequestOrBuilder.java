// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/emails/emails.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.emails;

public interface DisableEmailTemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.emails.DisableEmailTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

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
   * <code>string template_id = 2 [json_name = "templateId", (.buf.validate.field) = { ... }</code>
   * @return The templateId.
   */
  java.lang.String getTemplateId();
  /**
   * <code>string template_id = 2 [json_name = "templateId", (.buf.validate.field) = { ... }</code>
   * @return The bytes for templateId.
   */
  com.google.protobuf.ByteString
      getTemplateIdBytes();
}
