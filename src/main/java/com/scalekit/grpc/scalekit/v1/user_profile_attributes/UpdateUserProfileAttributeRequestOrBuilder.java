// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/user_profile_attributes/user_profile_attributes.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.user_profile_attributes;

public interface UpdateUserProfileAttributeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeRequest)
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
   * <code>.scalekit.v1.user_profile_attributes.UserProfileAttribute user_profile_attribute = 2 [json_name = "userProfileAttribute", (.buf.validate.field) = { ... }</code>
   * @return Whether the userProfileAttribute field is set.
   */
  boolean hasUserProfileAttribute();
  /**
   * <code>.scalekit.v1.user_profile_attributes.UserProfileAttribute user_profile_attribute = 2 [json_name = "userProfileAttribute", (.buf.validate.field) = { ... }</code>
   * @return The userProfileAttribute.
   */
  com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute getUserProfileAttribute();
  /**
   * <code>.scalekit.v1.user_profile_attributes.UserProfileAttribute user_profile_attribute = 2 [json_name = "userProfileAttribute", (.buf.validate.field) = { ... }</code>
   */
  com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttributeOrBuilder getUserProfileAttributeOrBuilder();
}
