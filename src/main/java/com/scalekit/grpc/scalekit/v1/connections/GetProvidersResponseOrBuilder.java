// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/connections/connections.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.connections;

public interface GetProvidersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.connections.GetProvidersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .scalekit.v1.connections.Provider providers = 1 [json_name = "providers"];</code>
   */
  java.util.List<com.scalekit.grpc.scalekit.v1.connections.Provider> 
      getProvidersList();
  /**
   * <code>repeated .scalekit.v1.connections.Provider providers = 1 [json_name = "providers"];</code>
   */
  com.scalekit.grpc.scalekit.v1.connections.Provider getProviders(int index);
  /**
   * <code>repeated .scalekit.v1.connections.Provider providers = 1 [json_name = "providers"];</code>
   */
  int getProvidersCount();
  /**
   * <code>repeated .scalekit.v1.connections.Provider providers = 1 [json_name = "providers"];</code>
   */
  java.util.List<? extends com.scalekit.grpc.scalekit.v1.connections.ProviderOrBuilder> 
      getProvidersOrBuilderList();
  /**
   * <code>repeated .scalekit.v1.connections.Provider providers = 1 [json_name = "providers"];</code>
   */
  com.scalekit.grpc.scalekit.v1.connections.ProviderOrBuilder getProvidersOrBuilder(
      int index);
}
