// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/members/members.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.members;

public interface UpdateMemberOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.members.UpdateMember)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .scalekit.v1.members.MemberRole role = 5 [json_name = "role"];</code>
   * @return Whether the role field is set.
   */
  boolean hasRole();
  /**
   * <code>optional .scalekit.v1.members.MemberRole role = 5 [json_name = "role"];</code>
   * @return The enum numeric value on the wire for role.
   */
  int getRoleValue();
  /**
   * <code>optional .scalekit.v1.members.MemberRole role = 5 [json_name = "role"];</code>
   * @return The role.
   */
  com.scalekit.grpc.scalekit.v1.members.MemberRole getRole();

  /**
   * <code>optional string first_name = 6 [json_name = "firstName", (.buf.validate.field) = { ... }</code>
   * @return Whether the firstName field is set.
   */
  boolean hasFirstName();
  /**
   * <code>optional string first_name = 6 [json_name = "firstName", (.buf.validate.field) = { ... }</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>optional string first_name = 6 [json_name = "firstName", (.buf.validate.field) = { ... }</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>optional string last_name = 7 [json_name = "lastName", (.buf.validate.field) = { ... }</code>
   * @return Whether the lastName field is set.
   */
  boolean hasLastName();
  /**
   * <code>optional string last_name = 7 [json_name = "lastName", (.buf.validate.field) = { ... }</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>optional string last_name = 7 [json_name = "lastName", (.buf.validate.field) = { ... }</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>map&lt;string, string&gt; metadata = 9 [json_name = "metadata", (.buf.validate.field) = { ... }</code>
   */
  int getMetadataCount();
  /**
   * <code>map&lt;string, string&gt; metadata = 9 [json_name = "metadata", (.buf.validate.field) = { ... }</code>
   */
  boolean containsMetadata(
      java.lang.String key);
  /**
   * Use {@link #getMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMetadata();
  /**
   * <code>map&lt;string, string&gt; metadata = 9 [json_name = "metadata", (.buf.validate.field) = { ... }</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetadataMap();
  /**
   * <code>map&lt;string, string&gt; metadata = 9 [json_name = "metadata", (.buf.validate.field) = { ... }</code>
   */
  /* nullable */
java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; metadata = 9 [json_name = "metadata", (.buf.validate.field) = { ... }</code>
   */
  java.lang.String getMetadataOrThrow(
      java.lang.String key);
}
