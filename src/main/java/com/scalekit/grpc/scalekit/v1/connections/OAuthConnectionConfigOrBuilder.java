// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/connections/connections.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.connections;

public interface OAuthConnectionConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.connections.OAuthConnectionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.StringValue authorize_uri = 3 [json_name = "authorizeUri", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the authorizeUri field is set.
   */
  boolean hasAuthorizeUri();
  /**
   * <code>.google.protobuf.StringValue authorize_uri = 3 [json_name = "authorizeUri", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The authorizeUri.
   */
  com.google.protobuf.StringValue getAuthorizeUri();
  /**
   * <code>.google.protobuf.StringValue authorize_uri = 3 [json_name = "authorizeUri", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getAuthorizeUriOrBuilder();

  /**
   * <code>.google.protobuf.StringValue token_uri = 4 [json_name = "tokenUri", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the tokenUri field is set.
   */
  boolean hasTokenUri();
  /**
   * <code>.google.protobuf.StringValue token_uri = 4 [json_name = "tokenUri", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The tokenUri.
   */
  com.google.protobuf.StringValue getTokenUri();
  /**
   * <code>.google.protobuf.StringValue token_uri = 4 [json_name = "tokenUri", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getTokenUriOrBuilder();

  /**
   * <code>.google.protobuf.StringValue user_info_uri = 5 [json_name = "userInfoUri", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the userInfoUri field is set.
   */
  boolean hasUserInfoUri();
  /**
   * <code>.google.protobuf.StringValue user_info_uri = 5 [json_name = "userInfoUri", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The userInfoUri.
   */
  com.google.protobuf.StringValue getUserInfoUri();
  /**
   * <code>.google.protobuf.StringValue user_info_uri = 5 [json_name = "userInfoUri", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getUserInfoUriOrBuilder();

  /**
   * <code>.google.protobuf.StringValue client_id = 8 [json_name = "clientId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the clientId field is set.
   */
  boolean hasClientId();
  /**
   * <code>.google.protobuf.StringValue client_id = 8 [json_name = "clientId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The clientId.
   */
  com.google.protobuf.StringValue getClientId();
  /**
   * <code>.google.protobuf.StringValue client_id = 8 [json_name = "clientId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getClientIdOrBuilder();

  /**
   * <code>.google.protobuf.StringValue client_secret = 9 [json_name = "clientSecret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the clientSecret field is set.
   */
  boolean hasClientSecret();
  /**
   * <code>.google.protobuf.StringValue client_secret = 9 [json_name = "clientSecret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The clientSecret.
   */
  com.google.protobuf.StringValue getClientSecret();
  /**
   * <code>.google.protobuf.StringValue client_secret = 9 [json_name = "clientSecret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getClientSecretOrBuilder();

  /**
   * <code>repeated string scopes = 10 [json_name = "scopes", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return A list containing the scopes.
   */
  java.util.List<java.lang.String>
      getScopesList();
  /**
   * <code>repeated string scopes = 10 [json_name = "scopes", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The count of scopes.
   */
  int getScopesCount();
  /**
   * <code>repeated string scopes = 10 [json_name = "scopes", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @param index The index of the element to return.
   * @return The scopes at the given index.
   */
  java.lang.String getScopes(int index);
  /**
   * <code>repeated string scopes = 10 [json_name = "scopes", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the scopes at the given index.
   */
  com.google.protobuf.ByteString
      getScopesBytes(int index);

  /**
   * <code>string redirect_uri = 12 [json_name = "redirectUri", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The redirectUri.
   */
  java.lang.String getRedirectUri();
  /**
   * <code>string redirect_uri = 12 [json_name = "redirectUri", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for redirectUri.
   */
  com.google.protobuf.ByteString
      getRedirectUriBytes();

  /**
   * <code>.google.protobuf.BoolValue pkce_enabled = 13 [json_name = "pkceEnabled", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the pkceEnabled field is set.
   */
  boolean hasPkceEnabled();
  /**
   * <code>.google.protobuf.BoolValue pkce_enabled = 13 [json_name = "pkceEnabled", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The pkceEnabled.
   */
  com.google.protobuf.BoolValue getPkceEnabled();
  /**
   * <code>.google.protobuf.BoolValue pkce_enabled = 13 [json_name = "pkceEnabled", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.BoolValueOrBuilder getPkceEnabledOrBuilder();

  /**
   * <code>.google.protobuf.StringValue prompt = 14 [json_name = "prompt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the prompt field is set.
   */
  boolean hasPrompt();
  /**
   * <code>.google.protobuf.StringValue prompt = 14 [json_name = "prompt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The prompt.
   */
  com.google.protobuf.StringValue getPrompt();
  /**
   * <code>.google.protobuf.StringValue prompt = 14 [json_name = "prompt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getPromptOrBuilder();

  /**
   * <code>.google.protobuf.BoolValue use_platform_creds = 15 [json_name = "usePlatformCreds", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the usePlatformCreds field is set.
   */
  boolean hasUsePlatformCreds();
  /**
   * <code>.google.protobuf.BoolValue use_platform_creds = 15 [json_name = "usePlatformCreds", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The usePlatformCreds.
   */
  com.google.protobuf.BoolValue getUsePlatformCreds();
  /**
   * <code>.google.protobuf.BoolValue use_platform_creds = 15 [json_name = "usePlatformCreds", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.BoolValueOrBuilder getUsePlatformCredsOrBuilder();
}
