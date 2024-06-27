// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/organizations/organizations.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.organizations;

public interface ListOrganizationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.organizations.ListOrganizationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <code>uint32 total_size = 2 [json_name = "totalSize"];</code>
   * @return The totalSize.
   */
  int getTotalSize();

  /**
   * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
   */
  java.util.List<com.scalekit.grpc.scalekit.v1.organizations.Organization> 
      getOrganizationsList();
  /**
   * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
   */
  com.scalekit.grpc.scalekit.v1.organizations.Organization getOrganizations(int index);
  /**
   * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
   */
  int getOrganizationsCount();
  /**
   * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
   */
  java.util.List<? extends com.scalekit.grpc.scalekit.v1.organizations.OrganizationOrBuilder> 
      getOrganizationsOrBuilderList();
  /**
   * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
   */
  com.scalekit.grpc.scalekit.v1.organizations.OrganizationOrBuilder getOrganizationsOrBuilder(
      int index);
}
