// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/workspaces/workspaces.proto

package com.scalekit.grpc.scalekit.v1.workspaces;

public interface CreateWorkspaceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.workspaces.CreateWorkspaceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.scalekit.v1.workspaces.Workspace workspace = 1 [json_name = "workspace"];</code>
   * @return Whether the workspace field is set.
   */
  boolean hasWorkspace();
  /**
   * <code>.scalekit.v1.workspaces.Workspace workspace = 1 [json_name = "workspace"];</code>
   * @return The workspace.
   */
  com.scalekit.grpc.scalekit.v1.workspaces.Workspace getWorkspace();
  /**
   * <code>.scalekit.v1.workspaces.Workspace workspace = 1 [json_name = "workspace"];</code>
   */
  com.scalekit.grpc.scalekit.v1.workspaces.WorkspaceOrBuilder getWorkspaceOrBuilder();

  /**
   * <code>string link = 2 [json_name = "link"];</code>
   * @return The link.
   */
  java.lang.String getLink();
  /**
   * <code>string link = 2 [json_name = "link"];</code>
   * @return The bytes for link.
   */
  com.google.protobuf.ByteString
      getLinkBytes();
}
