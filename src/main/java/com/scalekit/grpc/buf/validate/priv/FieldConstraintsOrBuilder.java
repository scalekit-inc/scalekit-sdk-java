// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/priv/private.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.buf.validate.priv;

public interface FieldConstraintsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.priv.FieldConstraints)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
   */
  java.util.List<com.scalekit.grpc.buf.validate.priv.Constraint> 
      getCelList();
  /**
   * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
   */
  com.scalekit.grpc.buf.validate.priv.Constraint getCel(int index);
  /**
   * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
   */
  int getCelCount();
  /**
   * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
   */
  java.util.List<? extends com.scalekit.grpc.buf.validate.priv.ConstraintOrBuilder> 
      getCelOrBuilderList();
  /**
   * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
   */
  com.scalekit.grpc.buf.validate.priv.ConstraintOrBuilder getCelOrBuilder(
      int index);
}
