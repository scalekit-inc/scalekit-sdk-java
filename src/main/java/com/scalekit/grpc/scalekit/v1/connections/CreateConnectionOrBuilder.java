// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/connections/connections.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.connections;

public interface CreateConnectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.connections.CreateConnection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.scalekit.v1.connections.ConnectionProvider provider = 1 [json_name = "provider", (.buf.validate.field) = { ... }</code>
   * @return The enum numeric value on the wire for provider.
   */
  int getProviderValue();
  /**
   * <code>.scalekit.v1.connections.ConnectionProvider provider = 1 [json_name = "provider", (.buf.validate.field) = { ... }</code>
   * @return The provider.
   */
  com.scalekit.grpc.scalekit.v1.connections.ConnectionProvider getProvider();

  /**
   * <code>.scalekit.v1.connections.ConnectionType type = 2 [json_name = "type", (.buf.validate.field) = { ... }</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.scalekit.v1.connections.ConnectionType type = 2 [json_name = "type", (.buf.validate.field) = { ... }</code>
   * @return The type.
   */
  com.scalekit.grpc.scalekit.v1.connections.ConnectionType getType();
}
