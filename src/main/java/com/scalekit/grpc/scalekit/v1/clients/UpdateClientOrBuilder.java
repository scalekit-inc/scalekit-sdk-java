// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/clients/clients.proto

package com.scalekit.grpc.scalekit.v1.clients;

public interface UpdateClientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.clients.UpdateClient)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string redirect_uris = 2 [json_name = "redirectUris", (.buf.validate.field) = { ... }</code>
   * @return A list containing the redirectUris.
   */
  java.util.List<java.lang.String>
      getRedirectUrisList();
  /**
   * <code>repeated string redirect_uris = 2 [json_name = "redirectUris", (.buf.validate.field) = { ... }</code>
   * @return The count of redirectUris.
   */
  int getRedirectUrisCount();
  /**
   * <code>repeated string redirect_uris = 2 [json_name = "redirectUris", (.buf.validate.field) = { ... }</code>
   * @param index The index of the element to return.
   * @return The redirectUris at the given index.
   */
  java.lang.String getRedirectUris(int index);
  /**
   * <code>repeated string redirect_uris = 2 [json_name = "redirectUris", (.buf.validate.field) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the redirectUris at the given index.
   */
  com.google.protobuf.ByteString
      getRedirectUrisBytes(int index);

  /**
   * <code>optional string default_redirect_uri = 3 [json_name = "defaultRedirectUri", (.buf.validate.field) = { ... }</code>
   * @return Whether the defaultRedirectUri field is set.
   */
  boolean hasDefaultRedirectUri();
  /**
   * <code>optional string default_redirect_uri = 3 [json_name = "defaultRedirectUri", (.buf.validate.field) = { ... }</code>
   * @return The defaultRedirectUri.
   */
  java.lang.String getDefaultRedirectUri();
  /**
   * <code>optional string default_redirect_uri = 3 [json_name = "defaultRedirectUri", (.buf.validate.field) = { ... }</code>
   * @return The bytes for defaultRedirectUri.
   */
  com.google.protobuf.ByteString
      getDefaultRedirectUriBytes();
}