// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/user_attributes/user_attributes.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.user_attributes;

public interface UserAttributeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.user_attributes.UserAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string key = 1 [json_name = "key", (.buf.validate.field) = { ... }</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 1 [json_name = "key", (.buf.validate.field) = { ... }</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>bool enabled = 2 [json_name = "enabled"];</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <code>bool required = 3 [json_name = "required"];</code>
   * @return The required.
   */
  boolean getRequired();

  /**
   * <code>string label = 4 [json_name = "label", (.buf.validate.field) = { ... }</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <code>string label = 4 [json_name = "label", (.buf.validate.field) = { ... }</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <code>.scalekit.v1.user_attributes.UserAttributeDatatype datatype = 5 [json_name = "datatype", (.buf.validate.field) = { ... }</code>
   * @return The enum numeric value on the wire for datatype.
   */
  int getDatatypeValue();
  /**
   * <code>.scalekit.v1.user_attributes.UserAttributeDatatype datatype = 5 [json_name = "datatype", (.buf.validate.field) = { ... }</code>
   * @return The datatype.
   */
  com.scalekit.grpc.scalekit.v1.user_attributes.UserAttributeDatatype getDatatype();

  /**
   * <code>.scalekit.v1.user_attributes.UserAttributeCategory category = 6 [json_name = "category", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for category.
   */
  int getCategoryValue();
  /**
   * <code>.scalekit.v1.user_attributes.UserAttributeCategory category = 6 [json_name = "category", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The category.
   */
  com.scalekit.grpc.scalekit.v1.user_attributes.UserAttributeCategory getCategory();

  /**
   * <code>.scalekit.v1.user_attributes.SSOUserAdditionInfo sso_addition_info = 7 [json_name = "ssoAdditionInfo"];</code>
   * @return Whether the ssoAdditionInfo field is set.
   */
  boolean hasSsoAdditionInfo();
  /**
   * <code>.scalekit.v1.user_attributes.SSOUserAdditionInfo sso_addition_info = 7 [json_name = "ssoAdditionInfo"];</code>
   * @return The ssoAdditionInfo.
   */
  com.scalekit.grpc.scalekit.v1.user_attributes.SSOUserAdditionInfo getSsoAdditionInfo();
  /**
   * <code>.scalekit.v1.user_attributes.SSOUserAdditionInfo sso_addition_info = 7 [json_name = "ssoAdditionInfo"];</code>
   */
  com.scalekit.grpc.scalekit.v1.user_attributes.SSOUserAdditionInfoOrBuilder getSsoAdditionInfoOrBuilder();

  /**
   * <code>.scalekit.v1.user_attributes.DirectoryUserAdditionalInfo directory_user_additional_info = 8 [json_name = "directoryUserAdditionalInfo"];</code>
   * @return Whether the directoryUserAdditionalInfo field is set.
   */
  boolean hasDirectoryUserAdditionalInfo();
  /**
   * <code>.scalekit.v1.user_attributes.DirectoryUserAdditionalInfo directory_user_additional_info = 8 [json_name = "directoryUserAdditionalInfo"];</code>
   * @return The directoryUserAdditionalInfo.
   */
  com.scalekit.grpc.scalekit.v1.user_attributes.DirectoryUserAdditionalInfo getDirectoryUserAdditionalInfo();
  /**
   * <code>.scalekit.v1.user_attributes.DirectoryUserAdditionalInfo directory_user_additional_info = 8 [json_name = "directoryUserAdditionalInfo"];</code>
   */
  com.scalekit.grpc.scalekit.v1.user_attributes.DirectoryUserAdditionalInfoOrBuilder getDirectoryUserAdditionalInfoOrBuilder();

  com.scalekit.grpc.scalekit.v1.user_attributes.UserAttribute.AdditionalInfoCase getAdditionalInfoCase();
}
