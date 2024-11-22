// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/validate.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.buf.validate;

public interface FieldConstraintsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.FieldConstraints)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * `cel` is a repeated field used to represent a textual expression
   * in the Common Expression Language (CEL) syntax. For more information on
   * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
   *
   * ```proto
   * message MyMessage {
   *   // The field `value` must be greater than 42.
   *   optional int32 value = 1 [(buf.validate.field).cel = {
   *     id: "my_message.value",
   *     message: "value must be greater than 42",
   *     expression: "this &gt; 42",
   *   }];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .buf.validate.Constraint cel = 23 [json_name = "cel"];</code>
   */
  java.util.List<com.scalekit.grpc.buf.validate.Constraint> 
      getCelList();
  /**
   * <pre>
   * `cel` is a repeated field used to represent a textual expression
   * in the Common Expression Language (CEL) syntax. For more information on
   * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
   *
   * ```proto
   * message MyMessage {
   *   // The field `value` must be greater than 42.
   *   optional int32 value = 1 [(buf.validate.field).cel = {
   *     id: "my_message.value",
   *     message: "value must be greater than 42",
   *     expression: "this &gt; 42",
   *   }];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .buf.validate.Constraint cel = 23 [json_name = "cel"];</code>
   */
  com.scalekit.grpc.buf.validate.Constraint getCel(int index);
  /**
   * <pre>
   * `cel` is a repeated field used to represent a textual expression
   * in the Common Expression Language (CEL) syntax. For more information on
   * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
   *
   * ```proto
   * message MyMessage {
   *   // The field `value` must be greater than 42.
   *   optional int32 value = 1 [(buf.validate.field).cel = {
   *     id: "my_message.value",
   *     message: "value must be greater than 42",
   *     expression: "this &gt; 42",
   *   }];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .buf.validate.Constraint cel = 23 [json_name = "cel"];</code>
   */
  int getCelCount();
  /**
   * <pre>
   * `cel` is a repeated field used to represent a textual expression
   * in the Common Expression Language (CEL) syntax. For more information on
   * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
   *
   * ```proto
   * message MyMessage {
   *   // The field `value` must be greater than 42.
   *   optional int32 value = 1 [(buf.validate.field).cel = {
   *     id: "my_message.value",
   *     message: "value must be greater than 42",
   *     expression: "this &gt; 42",
   *   }];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .buf.validate.Constraint cel = 23 [json_name = "cel"];</code>
   */
  java.util.List<? extends com.scalekit.grpc.buf.validate.ConstraintOrBuilder> 
      getCelOrBuilderList();
  /**
   * <pre>
   * `cel` is a repeated field used to represent a textual expression
   * in the Common Expression Language (CEL) syntax. For more information on
   * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
   *
   * ```proto
   * message MyMessage {
   *   // The field `value` must be greater than 42.
   *   optional int32 value = 1 [(buf.validate.field).cel = {
   *     id: "my_message.value",
   *     message: "value must be greater than 42",
   *     expression: "this &gt; 42",
   *   }];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .buf.validate.Constraint cel = 23 [json_name = "cel"];</code>
   */
  com.scalekit.grpc.buf.validate.ConstraintOrBuilder getCelOrBuilder(
      int index);

  /**
   * <pre>
   * If `required` is true, the field must be populated. A populated field can be
   * described as "serialized in the wire format," which includes:
   *
   * - the following "nullable" fields must be explicitly set to be considered populated:
   *   - singular message fields (whose fields may be unpopulated/default values)
   *   - member fields of a oneof (may be their default value)
   *   - proto3 optional fields (may be their default value)
   *   - proto2 scalar fields (both optional and required)
   * - proto3 scalar fields must be non-zero to be considered populated
   * - repeated and map fields must be non-empty to be considered populated
   *
   * ```proto
   * message MyMessage {
   *   // The field `value` must be set to a non-null value.
   *   optional MyOtherMessage value = 1 [(buf.validate.field).required = true];
   * }
   * ```
   * </pre>
   *
   * <code>optional bool required = 25 [json_name = "required"];</code>
   * @return Whether the required field is set.
   */
  boolean hasRequired();
  /**
   * <pre>
   * If `required` is true, the field must be populated. A populated field can be
   * described as "serialized in the wire format," which includes:
   *
   * - the following "nullable" fields must be explicitly set to be considered populated:
   *   - singular message fields (whose fields may be unpopulated/default values)
   *   - member fields of a oneof (may be their default value)
   *   - proto3 optional fields (may be their default value)
   *   - proto2 scalar fields (both optional and required)
   * - proto3 scalar fields must be non-zero to be considered populated
   * - repeated and map fields must be non-empty to be considered populated
   *
   * ```proto
   * message MyMessage {
   *   // The field `value` must be set to a non-null value.
   *   optional MyOtherMessage value = 1 [(buf.validate.field).required = true];
   * }
   * ```
   * </pre>
   *
   * <code>optional bool required = 25 [json_name = "required"];</code>
   * @return The required.
   */
  boolean getRequired();

  /**
   * <pre>
   * Skip validation on the field if its value matches the specified criteria.
   * See Ignore enum for details.
   *
   * ```proto
   * message UpdateRequest {
   *   // The uri rule only applies if the field is populated and not an empty
   *   // string.
   *   optional string url = 1 [
   *     (buf.validate.field).ignore = IGNORE_IF_DEFAULT_VALUE,
   *     (buf.validate.field).string.uri = true,
   *   ];
   * }
   * ```
   * </pre>
   *
   * <code>optional .buf.validate.Ignore ignore = 27 [json_name = "ignore"];</code>
   * @return Whether the ignore field is set.
   */
  boolean hasIgnore();
  /**
   * <pre>
   * Skip validation on the field if its value matches the specified criteria.
   * See Ignore enum for details.
   *
   * ```proto
   * message UpdateRequest {
   *   // The uri rule only applies if the field is populated and not an empty
   *   // string.
   *   optional string url = 1 [
   *     (buf.validate.field).ignore = IGNORE_IF_DEFAULT_VALUE,
   *     (buf.validate.field).string.uri = true,
   *   ];
   * }
   * ```
   * </pre>
   *
   * <code>optional .buf.validate.Ignore ignore = 27 [json_name = "ignore"];</code>
   * @return The ignore.
   */
  com.scalekit.grpc.buf.validate.Ignore getIgnore();

  /**
   * <pre>
   * Scalar Field Types
   * </pre>
   *
   * <code>.buf.validate.FloatRules float = 1 [json_name = "float"];</code>
   * @return Whether the float field is set.
   */
  boolean hasFloat();
  /**
   * <pre>
   * Scalar Field Types
   * </pre>
   *
   * <code>.buf.validate.FloatRules float = 1 [json_name = "float"];</code>
   * @return The float.
   */
  com.scalekit.grpc.buf.validate.FloatRules getFloat();
  /**
   * <pre>
   * Scalar Field Types
   * </pre>
   *
   * <code>.buf.validate.FloatRules float = 1 [json_name = "float"];</code>
   */
  com.scalekit.grpc.buf.validate.FloatRulesOrBuilder getFloatOrBuilder();

  /**
   * <code>.buf.validate.DoubleRules double = 2 [json_name = "double"];</code>
   * @return Whether the double field is set.
   */
  boolean hasDouble();
  /**
   * <code>.buf.validate.DoubleRules double = 2 [json_name = "double"];</code>
   * @return The double.
   */
  com.scalekit.grpc.buf.validate.DoubleRules getDouble();
  /**
   * <code>.buf.validate.DoubleRules double = 2 [json_name = "double"];</code>
   */
  com.scalekit.grpc.buf.validate.DoubleRulesOrBuilder getDoubleOrBuilder();

  /**
   * <code>.buf.validate.Int32Rules int32 = 3 [json_name = "int32"];</code>
   * @return Whether the int32 field is set.
   */
  boolean hasInt32();
  /**
   * <code>.buf.validate.Int32Rules int32 = 3 [json_name = "int32"];</code>
   * @return The int32.
   */
  com.scalekit.grpc.buf.validate.Int32Rules getInt32();
  /**
   * <code>.buf.validate.Int32Rules int32 = 3 [json_name = "int32"];</code>
   */
  com.scalekit.grpc.buf.validate.Int32RulesOrBuilder getInt32OrBuilder();

  /**
   * <code>.buf.validate.Int64Rules int64 = 4 [json_name = "int64"];</code>
   * @return Whether the int64 field is set.
   */
  boolean hasInt64();
  /**
   * <code>.buf.validate.Int64Rules int64 = 4 [json_name = "int64"];</code>
   * @return The int64.
   */
  com.scalekit.grpc.buf.validate.Int64Rules getInt64();
  /**
   * <code>.buf.validate.Int64Rules int64 = 4 [json_name = "int64"];</code>
   */
  com.scalekit.grpc.buf.validate.Int64RulesOrBuilder getInt64OrBuilder();

  /**
   * <code>.buf.validate.UInt32Rules uint32 = 5 [json_name = "uint32"];</code>
   * @return Whether the uint32 field is set.
   */
  boolean hasUint32();
  /**
   * <code>.buf.validate.UInt32Rules uint32 = 5 [json_name = "uint32"];</code>
   * @return The uint32.
   */
  com.scalekit.grpc.buf.validate.UInt32Rules getUint32();
  /**
   * <code>.buf.validate.UInt32Rules uint32 = 5 [json_name = "uint32"];</code>
   */
  com.scalekit.grpc.buf.validate.UInt32RulesOrBuilder getUint32OrBuilder();

  /**
   * <code>.buf.validate.UInt64Rules uint64 = 6 [json_name = "uint64"];</code>
   * @return Whether the uint64 field is set.
   */
  boolean hasUint64();
  /**
   * <code>.buf.validate.UInt64Rules uint64 = 6 [json_name = "uint64"];</code>
   * @return The uint64.
   */
  com.scalekit.grpc.buf.validate.UInt64Rules getUint64();
  /**
   * <code>.buf.validate.UInt64Rules uint64 = 6 [json_name = "uint64"];</code>
   */
  com.scalekit.grpc.buf.validate.UInt64RulesOrBuilder getUint64OrBuilder();

  /**
   * <code>.buf.validate.SInt32Rules sint32 = 7 [json_name = "sint32"];</code>
   * @return Whether the sint32 field is set.
   */
  boolean hasSint32();
  /**
   * <code>.buf.validate.SInt32Rules sint32 = 7 [json_name = "sint32"];</code>
   * @return The sint32.
   */
  com.scalekit.grpc.buf.validate.SInt32Rules getSint32();
  /**
   * <code>.buf.validate.SInt32Rules sint32 = 7 [json_name = "sint32"];</code>
   */
  com.scalekit.grpc.buf.validate.SInt32RulesOrBuilder getSint32OrBuilder();

  /**
   * <code>.buf.validate.SInt64Rules sint64 = 8 [json_name = "sint64"];</code>
   * @return Whether the sint64 field is set.
   */
  boolean hasSint64();
  /**
   * <code>.buf.validate.SInt64Rules sint64 = 8 [json_name = "sint64"];</code>
   * @return The sint64.
   */
  com.scalekit.grpc.buf.validate.SInt64Rules getSint64();
  /**
   * <code>.buf.validate.SInt64Rules sint64 = 8 [json_name = "sint64"];</code>
   */
  com.scalekit.grpc.buf.validate.SInt64RulesOrBuilder getSint64OrBuilder();

  /**
   * <code>.buf.validate.Fixed32Rules fixed32 = 9 [json_name = "fixed32"];</code>
   * @return Whether the fixed32 field is set.
   */
  boolean hasFixed32();
  /**
   * <code>.buf.validate.Fixed32Rules fixed32 = 9 [json_name = "fixed32"];</code>
   * @return The fixed32.
   */
  com.scalekit.grpc.buf.validate.Fixed32Rules getFixed32();
  /**
   * <code>.buf.validate.Fixed32Rules fixed32 = 9 [json_name = "fixed32"];</code>
   */
  com.scalekit.grpc.buf.validate.Fixed32RulesOrBuilder getFixed32OrBuilder();

  /**
   * <code>.buf.validate.Fixed64Rules fixed64 = 10 [json_name = "fixed64"];</code>
   * @return Whether the fixed64 field is set.
   */
  boolean hasFixed64();
  /**
   * <code>.buf.validate.Fixed64Rules fixed64 = 10 [json_name = "fixed64"];</code>
   * @return The fixed64.
   */
  com.scalekit.grpc.buf.validate.Fixed64Rules getFixed64();
  /**
   * <code>.buf.validate.Fixed64Rules fixed64 = 10 [json_name = "fixed64"];</code>
   */
  com.scalekit.grpc.buf.validate.Fixed64RulesOrBuilder getFixed64OrBuilder();

  /**
   * <code>.buf.validate.SFixed32Rules sfixed32 = 11 [json_name = "sfixed32"];</code>
   * @return Whether the sfixed32 field is set.
   */
  boolean hasSfixed32();
  /**
   * <code>.buf.validate.SFixed32Rules sfixed32 = 11 [json_name = "sfixed32"];</code>
   * @return The sfixed32.
   */
  com.scalekit.grpc.buf.validate.SFixed32Rules getSfixed32();
  /**
   * <code>.buf.validate.SFixed32Rules sfixed32 = 11 [json_name = "sfixed32"];</code>
   */
  com.scalekit.grpc.buf.validate.SFixed32RulesOrBuilder getSfixed32OrBuilder();

  /**
   * <code>.buf.validate.SFixed64Rules sfixed64 = 12 [json_name = "sfixed64"];</code>
   * @return Whether the sfixed64 field is set.
   */
  boolean hasSfixed64();
  /**
   * <code>.buf.validate.SFixed64Rules sfixed64 = 12 [json_name = "sfixed64"];</code>
   * @return The sfixed64.
   */
  com.scalekit.grpc.buf.validate.SFixed64Rules getSfixed64();
  /**
   * <code>.buf.validate.SFixed64Rules sfixed64 = 12 [json_name = "sfixed64"];</code>
   */
  com.scalekit.grpc.buf.validate.SFixed64RulesOrBuilder getSfixed64OrBuilder();

  /**
   * <code>.buf.validate.BoolRules bool = 13 [json_name = "bool"];</code>
   * @return Whether the bool field is set.
   */
  boolean hasBool();
  /**
   * <code>.buf.validate.BoolRules bool = 13 [json_name = "bool"];</code>
   * @return The bool.
   */
  com.scalekit.grpc.buf.validate.BoolRules getBool();
  /**
   * <code>.buf.validate.BoolRules bool = 13 [json_name = "bool"];</code>
   */
  com.scalekit.grpc.buf.validate.BoolRulesOrBuilder getBoolOrBuilder();

  /**
   * <code>.buf.validate.StringRules string = 14 [json_name = "string"];</code>
   * @return Whether the string field is set.
   */
  boolean hasString();
  /**
   * <code>.buf.validate.StringRules string = 14 [json_name = "string"];</code>
   * @return The string.
   */
  com.scalekit.grpc.buf.validate.StringRules getString();
  /**
   * <code>.buf.validate.StringRules string = 14 [json_name = "string"];</code>
   */
  com.scalekit.grpc.buf.validate.StringRulesOrBuilder getStringOrBuilder();

  /**
   * <code>.buf.validate.BytesRules bytes = 15 [json_name = "bytes"];</code>
   * @return Whether the bytes field is set.
   */
  boolean hasBytes();
  /**
   * <code>.buf.validate.BytesRules bytes = 15 [json_name = "bytes"];</code>
   * @return The bytes.
   */
  com.scalekit.grpc.buf.validate.BytesRules getBytes();
  /**
   * <code>.buf.validate.BytesRules bytes = 15 [json_name = "bytes"];</code>
   */
  com.scalekit.grpc.buf.validate.BytesRulesOrBuilder getBytesOrBuilder();

  /**
   * <pre>
   * Complex Field Types
   * </pre>
   *
   * <code>.buf.validate.EnumRules enum = 16 [json_name = "enum"];</code>
   * @return Whether the enum field is set.
   */
  boolean hasEnum();
  /**
   * <pre>
   * Complex Field Types
   * </pre>
   *
   * <code>.buf.validate.EnumRules enum = 16 [json_name = "enum"];</code>
   * @return The enum.
   */
  com.scalekit.grpc.buf.validate.EnumRules getEnum();
  /**
   * <pre>
   * Complex Field Types
   * </pre>
   *
   * <code>.buf.validate.EnumRules enum = 16 [json_name = "enum"];</code>
   */
  com.scalekit.grpc.buf.validate.EnumRulesOrBuilder getEnumOrBuilder();

  /**
   * <code>.buf.validate.RepeatedRules repeated = 18 [json_name = "repeated"];</code>
   * @return Whether the repeated field is set.
   */
  boolean hasRepeated();
  /**
   * <code>.buf.validate.RepeatedRules repeated = 18 [json_name = "repeated"];</code>
   * @return The repeated.
   */
  com.scalekit.grpc.buf.validate.RepeatedRules getRepeated();
  /**
   * <code>.buf.validate.RepeatedRules repeated = 18 [json_name = "repeated"];</code>
   */
  com.scalekit.grpc.buf.validate.RepeatedRulesOrBuilder getRepeatedOrBuilder();

  /**
   * <code>.buf.validate.MapRules map = 19 [json_name = "map"];</code>
   * @return Whether the map field is set.
   */
  boolean hasMap();
  /**
   * <code>.buf.validate.MapRules map = 19 [json_name = "map"];</code>
   * @return The map.
   */
  com.scalekit.grpc.buf.validate.MapRules getMap();
  /**
   * <code>.buf.validate.MapRules map = 19 [json_name = "map"];</code>
   */
  com.scalekit.grpc.buf.validate.MapRulesOrBuilder getMapOrBuilder();

  /**
   * <pre>
   * Well-Known Field Types
   * </pre>
   *
   * <code>.buf.validate.AnyRules any = 20 [json_name = "any"];</code>
   * @return Whether the any field is set.
   */
  boolean hasAny();
  /**
   * <pre>
   * Well-Known Field Types
   * </pre>
   *
   * <code>.buf.validate.AnyRules any = 20 [json_name = "any"];</code>
   * @return The any.
   */
  com.scalekit.grpc.buf.validate.AnyRules getAny();
  /**
   * <pre>
   * Well-Known Field Types
   * </pre>
   *
   * <code>.buf.validate.AnyRules any = 20 [json_name = "any"];</code>
   */
  com.scalekit.grpc.buf.validate.AnyRulesOrBuilder getAnyOrBuilder();

  /**
   * <code>.buf.validate.DurationRules duration = 21 [json_name = "duration"];</code>
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   * <code>.buf.validate.DurationRules duration = 21 [json_name = "duration"];</code>
   * @return The duration.
   */
  com.scalekit.grpc.buf.validate.DurationRules getDuration();
  /**
   * <code>.buf.validate.DurationRules duration = 21 [json_name = "duration"];</code>
   */
  com.scalekit.grpc.buf.validate.DurationRulesOrBuilder getDurationOrBuilder();

  /**
   * <code>.buf.validate.TimestampRules timestamp = 22 [json_name = "timestamp"];</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <code>.buf.validate.TimestampRules timestamp = 22 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  com.scalekit.grpc.buf.validate.TimestampRules getTimestamp();
  /**
   * <code>.buf.validate.TimestampRules timestamp = 22 [json_name = "timestamp"];</code>
   */
  com.scalekit.grpc.buf.validate.TimestampRulesOrBuilder getTimestampOrBuilder();

  /**
   * <pre>
   * DEPRECATED: use ignore=IGNORE_ALWAYS instead. TODO: remove this field pre-v1.
   * </pre>
   *
   * <code>optional bool skipped = 24 [json_name = "skipped", deprecated = true];</code>
   * @deprecated buf.validate.FieldConstraints.skipped is deprecated.
   *     See buf/validate/validate.proto;l=245
   * @return Whether the skipped field is set.
   */
  @java.lang.Deprecated boolean hasSkipped();
  /**
   * <pre>
   * DEPRECATED: use ignore=IGNORE_ALWAYS instead. TODO: remove this field pre-v1.
   * </pre>
   *
   * <code>optional bool skipped = 24 [json_name = "skipped", deprecated = true];</code>
   * @deprecated buf.validate.FieldConstraints.skipped is deprecated.
   *     See buf/validate/validate.proto;l=245
   * @return The skipped.
   */
  @java.lang.Deprecated boolean getSkipped();

  /**
   * <pre>
   * DEPRECATED: use ignore=IGNORE_IF_UNPOPULATED instead. TODO: remove this field pre-v1.
   * </pre>
   *
   * <code>optional bool ignore_empty = 26 [json_name = "ignoreEmpty", deprecated = true];</code>
   * @deprecated buf.validate.FieldConstraints.ignore_empty is deprecated.
   *     See buf/validate/validate.proto;l=247
   * @return Whether the ignoreEmpty field is set.
   */
  @java.lang.Deprecated boolean hasIgnoreEmpty();
  /**
   * <pre>
   * DEPRECATED: use ignore=IGNORE_IF_UNPOPULATED instead. TODO: remove this field pre-v1.
   * </pre>
   *
   * <code>optional bool ignore_empty = 26 [json_name = "ignoreEmpty", deprecated = true];</code>
   * @deprecated buf.validate.FieldConstraints.ignore_empty is deprecated.
   *     See buf/validate/validate.proto;l=247
   * @return The ignoreEmpty.
   */
  @java.lang.Deprecated boolean getIgnoreEmpty();

  com.scalekit.grpc.buf.validate.FieldConstraints.TypeCase getTypeCase();
}
