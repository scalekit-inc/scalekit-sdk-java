// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/organizations/organizations.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.organizations;

public interface OrganizationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.organizations.Organization)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id
   * </pre>
   *
   * <code>string id = 1 [json_name = "id", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Id
   * </pre>
   *
   * <code>string id = 1 [json_name = "id", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Created Time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [json_name = "createTime", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Created Time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [json_name = "createTime", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Created Time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [json_name = "createTime", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Updated time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Updated time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Updated time
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Name of the org to be used in display
   * </pre>
   *
   * <code>string display_name = 4 [json_name = "displayName", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Name of the org to be used in display
   * </pre>
   *
   * <code>string display_name = 4 [json_name = "displayName", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Optional regioncode
   * </pre>
   *
   * <code>.scalekit.v1.commons.RegionCode region_code = 5 [json_name = "regionCode", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enum numeric value on the wire for regionCode.
   */
  int getRegionCodeValue();
  /**
   * <pre>
   * Optional regioncode
   * </pre>
   *
   * <code>.scalekit.v1.commons.RegionCode region_code = 5 [json_name = "regionCode", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The regionCode.
   */
  com.scalekit.grpc.scalekit.v1.commons.RegionCode getRegionCode();

  /**
   * <pre>
   * External Id is useful to store a unique identifier for a given Org that. The unique Identifier can be the id of your tenant / org in your SaaSApp
   * </pre>
   *
   * <code>optional string external_id = 6 [json_name = "externalId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the externalId field is set.
   */
  boolean hasExternalId();
  /**
   * <pre>
   * External Id is useful to store a unique identifier for a given Org that. The unique Identifier can be the id of your tenant / org in your SaaSApp
   * </pre>
   *
   * <code>optional string external_id = 6 [json_name = "externalId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The externalId.
   */
  java.lang.String getExternalId();
  /**
   * <pre>
   * External Id is useful to store a unique identifier for a given Org that. The unique Identifier can be the id of your tenant / org in your SaaSApp
   * </pre>
   *
   * <code>optional string external_id = 6 [json_name = "externalId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for externalId.
   */
  com.google.protobuf.ByteString
      getExternalIdBytes();

  /**
   * <pre>
   * Key value pairs extension attributes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 7 [json_name = "metadata", (.buf.validate.field) = { ... }</code>
   */
  int getMetadataCount();
  /**
   * <pre>
   * Key value pairs extension attributes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 7 [json_name = "metadata", (.buf.validate.field) = { ... }</code>
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
   * <pre>
   * Key value pairs extension attributes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 7 [json_name = "metadata", (.buf.validate.field) = { ... }</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetadataMap();
  /**
   * <pre>
   * Key value pairs extension attributes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 7 [json_name = "metadata", (.buf.validate.field) = { ... }</code>
   */
  /* nullable */
java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Key value pairs extension attributes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 7 [json_name = "metadata", (.buf.validate.field) = { ... }</code>
   */
  java.lang.String getMetadataOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Organization Settings
   * </pre>
   *
   * <code>.scalekit.v1.organizations.OrganizationSettings settings = 8 [json_name = "settings"];</code>
   * @return Whether the settings field is set.
   */
  boolean hasSettings();
  /**
   * <pre>
   * Organization Settings
   * </pre>
   *
   * <code>.scalekit.v1.organizations.OrganizationSettings settings = 8 [json_name = "settings"];</code>
   * @return The settings.
   */
  com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings getSettings();
  /**
   * <pre>
   * Organization Settings
   * </pre>
   *
   * <code>.scalekit.v1.organizations.OrganizationSettings settings = 8 [json_name = "settings"];</code>
   */
  com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettingsOrBuilder getSettingsOrBuilder();
}
