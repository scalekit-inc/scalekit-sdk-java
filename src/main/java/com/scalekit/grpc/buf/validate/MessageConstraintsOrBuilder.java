// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/validate.proto

package com.scalekit.grpc.buf.validate;

public interface MessageConstraintsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.MessageConstraints)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * `disabled` is a boolean flag that, when set to true, nullifies any validation rules for this message.
   * This includes any fields within the message that would otherwise support validation.
   *
   * ```proto
   * message MyMessage {
   *   // validation will be bypassed for this message
   *   option (buf.validate.message).disabled = true;
   * }
   * ```
   * </pre>
   *
   * <code>optional bool disabled = 1 [json_name = "disabled"];</code>
   * @return Whether the disabled field is set.
   */
  boolean hasDisabled();
  /**
   * <pre>
   * `disabled` is a boolean flag that, when set to true, nullifies any validation rules for this message.
   * This includes any fields within the message that would otherwise support validation.
   *
   * ```proto
   * message MyMessage {
   *   // validation will be bypassed for this message
   *   option (buf.validate.message).disabled = true;
   * }
   * ```
   * </pre>
   *
   * <code>optional bool disabled = 1 [json_name = "disabled"];</code>
   * @return The disabled.
   */
  boolean getDisabled();

  /**
   * <pre>
   * `cel` is a repeated field of type Constraint. Each Constraint specifies a validation rule to be applied to this message.
   * These constraints are written in Common Expression Language (CEL) syntax. For more information on
   * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
   *
   *
   * ```proto
   * message MyMessage {
   *   // The field `foo` must be greater than 42.
   *   option (buf.validate.message).cel = {
   *     id: "my_message.value",
   *     message: "value must be greater than 42",
   *     expression: "this.foo &gt; 42",
   *   };
   *   optional int32 foo = 1;
   * }
   * ```
   * </pre>
   *
   * <code>repeated .buf.validate.Constraint cel = 3 [json_name = "cel"];</code>
   */
  java.util.List<com.scalekit.grpc.buf.validate.Constraint> 
      getCelList();
  /**
   * <pre>
   * `cel` is a repeated field of type Constraint. Each Constraint specifies a validation rule to be applied to this message.
   * These constraints are written in Common Expression Language (CEL) syntax. For more information on
   * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
   *
   *
   * ```proto
   * message MyMessage {
   *   // The field `foo` must be greater than 42.
   *   option (buf.validate.message).cel = {
   *     id: "my_message.value",
   *     message: "value must be greater than 42",
   *     expression: "this.foo &gt; 42",
   *   };
   *   optional int32 foo = 1;
   * }
   * ```
   * </pre>
   *
   * <code>repeated .buf.validate.Constraint cel = 3 [json_name = "cel"];</code>
   */
  com.scalekit.grpc.buf.validate.Constraint getCel(int index);
  /**
   * <pre>
   * `cel` is a repeated field of type Constraint. Each Constraint specifies a validation rule to be applied to this message.
   * These constraints are written in Common Expression Language (CEL) syntax. For more information on
   * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
   *
   *
   * ```proto
   * message MyMessage {
   *   // The field `foo` must be greater than 42.
   *   option (buf.validate.message).cel = {
   *     id: "my_message.value",
   *     message: "value must be greater than 42",
   *     expression: "this.foo &gt; 42",
   *   };
   *   optional int32 foo = 1;
   * }
   * ```
   * </pre>
   *
   * <code>repeated .buf.validate.Constraint cel = 3 [json_name = "cel"];</code>
   */
  int getCelCount();
  /**
   * <pre>
   * `cel` is a repeated field of type Constraint. Each Constraint specifies a validation rule to be applied to this message.
   * These constraints are written in Common Expression Language (CEL) syntax. For more information on
   * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
   *
   *
   * ```proto
   * message MyMessage {
   *   // The field `foo` must be greater than 42.
   *   option (buf.validate.message).cel = {
   *     id: "my_message.value",
   *     message: "value must be greater than 42",
   *     expression: "this.foo &gt; 42",
   *   };
   *   optional int32 foo = 1;
   * }
   * ```
   * </pre>
   *
   * <code>repeated .buf.validate.Constraint cel = 3 [json_name = "cel"];</code>
   */
  java.util.List<? extends com.scalekit.grpc.buf.validate.ConstraintOrBuilder> 
      getCelOrBuilderList();
  /**
   * <pre>
   * `cel` is a repeated field of type Constraint. Each Constraint specifies a validation rule to be applied to this message.
   * These constraints are written in Common Expression Language (CEL) syntax. For more information on
   * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
   *
   *
   * ```proto
   * message MyMessage {
   *   // The field `foo` must be greater than 42.
   *   option (buf.validate.message).cel = {
   *     id: "my_message.value",
   *     message: "value must be greater than 42",
   *     expression: "this.foo &gt; 42",
   *   };
   *   optional int32 foo = 1;
   * }
   * ```
   * </pre>
   *
   * <code>repeated .buf.validate.Constraint cel = 3 [json_name = "cel"];</code>
   */
  com.scalekit.grpc.buf.validate.ConstraintOrBuilder getCelOrBuilder(
      int index);
}
