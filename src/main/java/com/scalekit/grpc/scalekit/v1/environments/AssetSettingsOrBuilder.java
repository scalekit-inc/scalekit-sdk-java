// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/environments/environments.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.environments;

public interface AssetSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.environments.AssetSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.scalekit.v1.environments.AssetCategory category = 1 [json_name = "category", (.buf.validate.field) = { ... }</code>
   * @return The enum numeric value on the wire for category.
   */
  int getCategoryValue();
  /**
   * <code>.scalekit.v1.environments.AssetCategory category = 1 [json_name = "category", (.buf.validate.field) = { ... }</code>
   * @return The category.
   */
  com.scalekit.grpc.scalekit.v1.environments.AssetCategory getCategory();

  /**
   * <code>string extension = 2 [json_name = "extension", (.buf.validate.field) = { ... }</code>
   * @return The extension.
   */
  java.lang.String getExtension();
  /**
   * <code>string extension = 2 [json_name = "extension", (.buf.validate.field) = { ... }</code>
   * @return The bytes for extension.
   */
  com.google.protobuf.ByteString
      getExtensionBytes();
}
