// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/validate.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.buf.validate;

public interface ViolationsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.Violations)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
   * </pre>
   *
   * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
   */
  java.util.List<com.scalekit.grpc.buf.validate.Violation> 
      getViolationsList();
  /**
   * <pre>
   * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
   * </pre>
   *
   * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
   */
  com.scalekit.grpc.buf.validate.Violation getViolations(int index);
  /**
   * <pre>
   * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
   * </pre>
   *
   * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
   */
  int getViolationsCount();
  /**
   * <pre>
   * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
   * </pre>
   *
   * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
   */
  java.util.List<? extends com.scalekit.grpc.buf.validate.ViolationOrBuilder> 
      getViolationsOrBuilderList();
  /**
   * <pre>
   * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
   * </pre>
   *
   * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
   */
  com.scalekit.grpc.buf.validate.ViolationOrBuilder getViolationsOrBuilder(
      int index);
}
