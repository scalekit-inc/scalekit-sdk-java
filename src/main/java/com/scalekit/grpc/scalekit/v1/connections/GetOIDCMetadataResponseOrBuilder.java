// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/connections/connections.proto

package com.scalekit.grpc.scalekit.v1.connections;

public interface GetOIDCMetadataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.connections.GetOIDCMetadataResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string issuer = 1 [json_name = "issuer"];</code>
   * @return The issuer.
   */
  java.lang.String getIssuer();
  /**
   * <code>string issuer = 1 [json_name = "issuer"];</code>
   * @return The bytes for issuer.
   */
  com.google.protobuf.ByteString
      getIssuerBytes();

  /**
   * <code>string authorization_endpoint = 2 [json_name = "authorizationEndpoint"];</code>
   * @return The authorizationEndpoint.
   */
  java.lang.String getAuthorizationEndpoint();
  /**
   * <code>string authorization_endpoint = 2 [json_name = "authorizationEndpoint"];</code>
   * @return The bytes for authorizationEndpoint.
   */
  com.google.protobuf.ByteString
      getAuthorizationEndpointBytes();

  /**
   * <code>string token_endpoint = 3 [json_name = "tokenEndpoint"];</code>
   * @return The tokenEndpoint.
   */
  java.lang.String getTokenEndpoint();
  /**
   * <code>string token_endpoint = 3 [json_name = "tokenEndpoint"];</code>
   * @return The bytes for tokenEndpoint.
   */
  com.google.protobuf.ByteString
      getTokenEndpointBytes();

  /**
   * <code>string userinfo_endpoint = 4 [json_name = "userinfoEndpoint"];</code>
   * @return The userinfoEndpoint.
   */
  java.lang.String getUserinfoEndpoint();
  /**
   * <code>string userinfo_endpoint = 4 [json_name = "userinfoEndpoint"];</code>
   * @return The bytes for userinfoEndpoint.
   */
  com.google.protobuf.ByteString
      getUserinfoEndpointBytes();

  /**
   * <code>string jwks_uri = 5 [json_name = "jwksUri"];</code>
   * @return The jwksUri.
   */
  java.lang.String getJwksUri();
  /**
   * <code>string jwks_uri = 5 [json_name = "jwksUri"];</code>
   * @return The bytes for jwksUri.
   */
  com.google.protobuf.ByteString
      getJwksUriBytes();
}
