// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/environments/environments.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.environments;

public interface UpdateFeaturesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.environments.UpdateFeaturesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>repeated .scalekit.v1.environments.EnvironmentFeature features = 2 [json_name = "features", (.buf.validate.field) = { ... }</code>
   */
  java.util.List<com.scalekit.grpc.scalekit.v1.environments.EnvironmentFeature> 
      getFeaturesList();
  /**
   * <code>repeated .scalekit.v1.environments.EnvironmentFeature features = 2 [json_name = "features", (.buf.validate.field) = { ... }</code>
   */
  com.scalekit.grpc.scalekit.v1.environments.EnvironmentFeature getFeatures(int index);
  /**
   * <code>repeated .scalekit.v1.environments.EnvironmentFeature features = 2 [json_name = "features", (.buf.validate.field) = { ... }</code>
   */
  int getFeaturesCount();
  /**
   * <code>repeated .scalekit.v1.environments.EnvironmentFeature features = 2 [json_name = "features", (.buf.validate.field) = { ... }</code>
   */
  java.util.List<? extends com.scalekit.grpc.scalekit.v1.environments.EnvironmentFeatureOrBuilder> 
      getFeaturesOrBuilderList();
  /**
   * <code>repeated .scalekit.v1.environments.EnvironmentFeature features = 2 [json_name = "features", (.buf.validate.field) = { ... }</code>
   */
  com.scalekit.grpc.scalekit.v1.environments.EnvironmentFeatureOrBuilder getFeaturesOrBuilder(
      int index);
}
