// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/directories/directories.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.directories;

public interface UpdateDirectoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.directories.UpdateDirectory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 2 [json_name = "name", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2 [json_name = "name", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.scalekit.v1.directories.DirectoryType directory_type = 3 [json_name = "directoryType", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enum numeric value on the wire for directoryType.
   */
  int getDirectoryTypeValue();
  /**
   * <code>.scalekit.v1.directories.DirectoryType directory_type = 3 [json_name = "directoryType", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The directoryType.
   */
  com.scalekit.grpc.scalekit.v1.directories.DirectoryType getDirectoryType();

  /**
   * <code>bool enabled = 7 [json_name = "enabled", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <code>.scalekit.v1.directories.DirectoryProvider directory_provider = 8 [json_name = "directoryProvider", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enum numeric value on the wire for directoryProvider.
   */
  int getDirectoryProviderValue();
  /**
   * <code>.scalekit.v1.directories.DirectoryProvider directory_provider = 8 [json_name = "directoryProvider", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The directoryProvider.
   */
  com.scalekit.grpc.scalekit.v1.directories.DirectoryProvider getDirectoryProvider();

  /**
   * <code>.scalekit.v1.directories.DirectoryStatus status = 9 [json_name = "status", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.scalekit.v1.directories.DirectoryStatus status = 9 [json_name = "status", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The status.
   */
  com.scalekit.grpc.scalekit.v1.directories.DirectoryStatus getStatus();

  /**
   * <code>repeated .scalekit.v1.directories.DirectoryMapping mappings = 10 [json_name = "mappings"];</code>
   */
  java.util.List<com.scalekit.grpc.scalekit.v1.directories.DirectoryMapping> 
      getMappingsList();
  /**
   * <code>repeated .scalekit.v1.directories.DirectoryMapping mappings = 10 [json_name = "mappings"];</code>
   */
  com.scalekit.grpc.scalekit.v1.directories.DirectoryMapping getMappings(int index);
  /**
   * <code>repeated .scalekit.v1.directories.DirectoryMapping mappings = 10 [json_name = "mappings"];</code>
   */
  int getMappingsCount();
  /**
   * <code>repeated .scalekit.v1.directories.DirectoryMapping mappings = 10 [json_name = "mappings"];</code>
   */
  java.util.List<? extends com.scalekit.grpc.scalekit.v1.directories.DirectoryMappingOrBuilder> 
      getMappingsOrBuilderList();
  /**
   * <code>repeated .scalekit.v1.directories.DirectoryMapping mappings = 10 [json_name = "mappings"];</code>
   */
  com.scalekit.grpc.scalekit.v1.directories.DirectoryMappingOrBuilder getMappingsOrBuilder(
      int index);
}
