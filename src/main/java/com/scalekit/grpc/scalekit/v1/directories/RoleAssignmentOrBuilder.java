// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/directories/directories.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.directories;

public interface RoleAssignmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.directories.RoleAssignment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string group_id = 1 [json_name = "groupId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The groupId.
   */
  java.lang.String getGroupId();
  /**
   * <code>string group_id = 1 [json_name = "groupId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for groupId.
   */
  com.google.protobuf.ByteString
      getGroupIdBytes();

  /**
   * <code>string role_name = 2 [json_name = "roleName", (.buf.validate.field) = { ... }</code>
   * @return The roleName.
   */
  java.lang.String getRoleName();
  /**
   * <code>string role_name = 2 [json_name = "roleName", (.buf.validate.field) = { ... }</code>
   * @return The bytes for roleName.
   */
  com.google.protobuf.ByteString
      getRoleNameBytes();

  /**
   * <code>string role_id = 3 [json_name = "roleId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The roleId.
   */
  java.lang.String getRoleId();
  /**
   * <code>string role_id = 3 [json_name = "roleId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for roleId.
   */
  com.google.protobuf.ByteString
      getRoleIdBytes();
}
