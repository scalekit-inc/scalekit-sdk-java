// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/clients/clients.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.clients;

public interface ClientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.clients.Client)
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
   * <code>string keyId = 2 [json_name = "keyId"];</code>
   * @return The keyId.
   */
  java.lang.String getKeyId();
  /**
   * <code>string keyId = 2 [json_name = "keyId"];</code>
   * @return The bytes for keyId.
   */
  com.google.protobuf.ByteString
      getKeyIdBytes();

  /**
   * <code>.google.protobuf.Timestamp create_time = 3 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 3 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 3 [json_name = "createTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp update_time = 4 [json_name = "updateTime"];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <code>.google.protobuf.Timestamp update_time = 4 [json_name = "updateTime"];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <code>.google.protobuf.Timestamp update_time = 4 [json_name = "updateTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <code>repeated string redirect_uris = 5 [json_name = "redirectUris"];</code>
   * @return A list containing the redirectUris.
   */
  java.util.List<java.lang.String>
      getRedirectUrisList();
  /**
   * <code>repeated string redirect_uris = 5 [json_name = "redirectUris"];</code>
   * @return The count of redirectUris.
   */
  int getRedirectUrisCount();
  /**
   * <code>repeated string redirect_uris = 5 [json_name = "redirectUris"];</code>
   * @param index The index of the element to return.
   * @return The redirectUris at the given index.
   */
  java.lang.String getRedirectUris(int index);
  /**
   * <code>repeated string redirect_uris = 5 [json_name = "redirectUris"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the redirectUris at the given index.
   */
  com.google.protobuf.ByteString
      getRedirectUrisBytes(int index);

  /**
   * <code>string default_redirect_uri = 6 [json_name = "defaultRedirectUri"];</code>
   * @return The defaultRedirectUri.
   */
  java.lang.String getDefaultRedirectUri();
  /**
   * <code>string default_redirect_uri = 6 [json_name = "defaultRedirectUri"];</code>
   * @return The bytes for defaultRedirectUri.
   */
  com.google.protobuf.ByteString
      getDefaultRedirectUriBytes();

  /**
   * <code>repeated .scalekit.v1.clients.ClientSecret secrets = 7 [json_name = "secrets"];</code>
   */
  java.util.List<com.scalekit.grpc.scalekit.v1.clients.ClientSecret> 
      getSecretsList();
  /**
   * <code>repeated .scalekit.v1.clients.ClientSecret secrets = 7 [json_name = "secrets"];</code>
   */
  com.scalekit.grpc.scalekit.v1.clients.ClientSecret getSecrets(int index);
  /**
   * <code>repeated .scalekit.v1.clients.ClientSecret secrets = 7 [json_name = "secrets"];</code>
   */
  int getSecretsCount();
  /**
   * <code>repeated .scalekit.v1.clients.ClientSecret secrets = 7 [json_name = "secrets"];</code>
   */
  java.util.List<? extends com.scalekit.grpc.scalekit.v1.clients.ClientSecretOrBuilder> 
      getSecretsOrBuilderList();
  /**
   * <code>repeated .scalekit.v1.clients.ClientSecret secrets = 7 [json_name = "secrets"];</code>
   */
  com.scalekit.grpc.scalekit.v1.clients.ClientSecretOrBuilder getSecretsOrBuilder(
      int index);
}
