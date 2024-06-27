// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/users/users.proto

package com.scalekit.grpc.scalekit.v1.users;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.users.User)
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
   * <code>.google.protobuf.Timestamp create_time = 2 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 2 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 2 [json_name = "createTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime"];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime"];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <code>string first_name = 4 [json_name = "firstName", (.buf.validate.field) = { ... }</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>string first_name = 4 [json_name = "firstName", (.buf.validate.field) = { ... }</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string last_name = 5 [json_name = "lastName", (.buf.validate.field) = { ... }</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string last_name = 5 [json_name = "lastName", (.buf.validate.field) = { ... }</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>string email = 6 [json_name = "email", (.buf.validate.field) = { ... }</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 6 [json_name = "email", (.buf.validate.field) = { ... }</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>optional string external_id = 7 [json_name = "externalId"];</code>
   * @return Whether the externalId field is set.
   */
  boolean hasExternalId();
  /**
   * <code>optional string external_id = 7 [json_name = "externalId"];</code>
   * @return The externalId.
   */
  java.lang.String getExternalId();
  /**
   * <code>optional string external_id = 7 [json_name = "externalId"];</code>
   * @return The bytes for externalId.
   */
  com.google.protobuf.ByteString
      getExternalIdBytes();

  /**
   * <code>map&lt;string, string&gt; metadata = 8 [json_name = "metadata", (.buf.validate.field) = { ... }</code>
   */
  int getMetadataCount();
  /**
   * <code>map&lt;string, string&gt; metadata = 8 [json_name = "metadata", (.buf.validate.field) = { ... }</code>
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
   * <code>map&lt;string, string&gt; metadata = 8 [json_name = "metadata", (.buf.validate.field) = { ... }</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetadataMap();
  /**
   * <code>map&lt;string, string&gt; metadata = 8 [json_name = "metadata", (.buf.validate.field) = { ... }</code>
   */
  /* nullable */
java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; metadata = 8 [json_name = "metadata", (.buf.validate.field) = { ... }</code>
   */
  java.lang.String getMetadataOrThrow(
      java.lang.String key);
}
