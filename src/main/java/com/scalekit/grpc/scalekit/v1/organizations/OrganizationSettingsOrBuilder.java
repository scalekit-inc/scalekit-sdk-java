// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/organizations/organizations.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.organizations;

public interface OrganizationSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.organizations.OrganizationSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .scalekit.v1.organizations.OrganizationSettingsFeature features = 1 [json_name = "features", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  java.util.List<com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettingsFeature> 
      getFeaturesList();
  /**
   * <code>repeated .scalekit.v1.organizations.OrganizationSettingsFeature features = 1 [json_name = "features", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettingsFeature getFeatures(int index);
  /**
   * <code>repeated .scalekit.v1.organizations.OrganizationSettingsFeature features = 1 [json_name = "features", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  int getFeaturesCount();
  /**
   * <code>repeated .scalekit.v1.organizations.OrganizationSettingsFeature features = 1 [json_name = "features", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  java.util.List<? extends com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettingsFeatureOrBuilder> 
      getFeaturesOrBuilderList();
  /**
   * <code>repeated .scalekit.v1.organizations.OrganizationSettingsFeature features = 1 [json_name = "features", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettingsFeatureOrBuilder getFeaturesOrBuilder(
      int index);
}
