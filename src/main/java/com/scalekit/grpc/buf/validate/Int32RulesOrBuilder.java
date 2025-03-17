// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/validate.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.buf.validate;

public interface Int32RulesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.Int32Rules)
    com.google.protobuf.GeneratedMessageV3.
        ExtendableMessageOrBuilder<Int32Rules> {

  /**
   * <pre>
   * `const` requires the field value to exactly match the specified value. If
   * the field value doesn't match, an error message is generated.
   *
   * ```proto
   * message MyInt32 {
   *   // value must equal 42
   *   int32 value = 1 [(buf.validate.field).int32.const = 42];
   * }
   * ```
   * </pre>
   *
   * <code>optional int32 const = 1 [json_name = "const", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the const field is set.
   */
  boolean hasConst();
  /**
   * <pre>
   * `const` requires the field value to exactly match the specified value. If
   * the field value doesn't match, an error message is generated.
   *
   * ```proto
   * message MyInt32 {
   *   // value must equal 42
   *   int32 value = 1 [(buf.validate.field).int32.const = 42];
   * }
   * ```
   * </pre>
   *
   * <code>optional int32 const = 1 [json_name = "const", (.buf.validate.predefined) = { ... }</code>
   * @return The const.
   */
  int getConst();

  /**
   * <pre>
   * `lt` requires the field value to be less than the specified value (field
   * &lt; value). If the field value is equal to or greater than the specified
   * value, an error message is generated.
   *
   * ```proto
   * message MyInt32 {
   *   // value must be less than 10
   *   int32 value = 1 [(buf.validate.field).int32.lt = 10];
   * }
   * ```
   * </pre>
   *
   * <code>int32 lt = 2 [json_name = "lt", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the lt field is set.
   */
  boolean hasLt();
  /**
   * <pre>
   * `lt` requires the field value to be less than the specified value (field
   * &lt; value). If the field value is equal to or greater than the specified
   * value, an error message is generated.
   *
   * ```proto
   * message MyInt32 {
   *   // value must be less than 10
   *   int32 value = 1 [(buf.validate.field).int32.lt = 10];
   * }
   * ```
   * </pre>
   *
   * <code>int32 lt = 2 [json_name = "lt", (.buf.validate.predefined) = { ... }</code>
   * @return The lt.
   */
  int getLt();

  /**
   * <pre>
   * `lte` requires the field value to be less than or equal to the specified
   * value (field &lt;= value). If the field value is greater than the specified
   * value, an error message is generated.
   *
   * ```proto
   * message MyInt32 {
   *   // value must be less than or equal to 10
   *   int32 value = 1 [(buf.validate.field).int32.lte = 10];
   * }
   * ```
   * </pre>
   *
   * <code>int32 lte = 3 [json_name = "lte", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the lte field is set.
   */
  boolean hasLte();
  /**
   * <pre>
   * `lte` requires the field value to be less than or equal to the specified
   * value (field &lt;= value). If the field value is greater than the specified
   * value, an error message is generated.
   *
   * ```proto
   * message MyInt32 {
   *   // value must be less than or equal to 10
   *   int32 value = 1 [(buf.validate.field).int32.lte = 10];
   * }
   * ```
   * </pre>
   *
   * <code>int32 lte = 3 [json_name = "lte", (.buf.validate.predefined) = { ... }</code>
   * @return The lte.
   */
  int getLte();

  /**
   * <pre>
   * `gt` requires the field value to be greater than the specified value
   * (exclusive). If the value of `gt` is larger than a specified `lt` or
   * `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MyInt32 {
   *   // value must be greater than 5 [int32.gt]
   *   int32 value = 1 [(buf.validate.field).int32.gt = 5];
   *
   *   // value must be greater than 5 and less than 10 [int32.gt_lt]
   *   int32 other_value = 2 [(buf.validate.field).int32 = { gt: 5, lt: 10 }];
   *
   *   // value must be greater than 10 or less than 5 [int32.gt_lt_exclusive]
   *   int32 another_value = 3 [(buf.validate.field).int32 = { gt: 10, lt: 5 }];
   * }
   * ```
   * </pre>
   *
   * <code>int32 gt = 4 [json_name = "gt", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the gt field is set.
   */
  boolean hasGt();
  /**
   * <pre>
   * `gt` requires the field value to be greater than the specified value
   * (exclusive). If the value of `gt` is larger than a specified `lt` or
   * `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MyInt32 {
   *   // value must be greater than 5 [int32.gt]
   *   int32 value = 1 [(buf.validate.field).int32.gt = 5];
   *
   *   // value must be greater than 5 and less than 10 [int32.gt_lt]
   *   int32 other_value = 2 [(buf.validate.field).int32 = { gt: 5, lt: 10 }];
   *
   *   // value must be greater than 10 or less than 5 [int32.gt_lt_exclusive]
   *   int32 another_value = 3 [(buf.validate.field).int32 = { gt: 10, lt: 5 }];
   * }
   * ```
   * </pre>
   *
   * <code>int32 gt = 4 [json_name = "gt", (.buf.validate.predefined) = { ... }</code>
   * @return The gt.
   */
  int getGt();

  /**
   * <pre>
   * `gte` requires the field value to be greater than or equal to the specified value
   * (exclusive). If the value of `gte` is larger than a specified `lt` or
   * `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MyInt32 {
   *   // value must be greater than or equal to 5 [int32.gte]
   *   int32 value = 1 [(buf.validate.field).int32.gte = 5];
   *
   *   // value must be greater than or equal to 5 and less than 10 [int32.gte_lt]
   *   int32 other_value = 2 [(buf.validate.field).int32 = { gte: 5, lt: 10 }];
   *
   *   // value must be greater than or equal to 10 or less than 5 [int32.gte_lt_exclusive]
   *   int32 another_value = 3 [(buf.validate.field).int32 = { gte: 10, lt: 5 }];
   * }
   * ```
   * </pre>
   *
   * <code>int32 gte = 5 [json_name = "gte", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the gte field is set.
   */
  boolean hasGte();
  /**
   * <pre>
   * `gte` requires the field value to be greater than or equal to the specified value
   * (exclusive). If the value of `gte` is larger than a specified `lt` or
   * `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MyInt32 {
   *   // value must be greater than or equal to 5 [int32.gte]
   *   int32 value = 1 [(buf.validate.field).int32.gte = 5];
   *
   *   // value must be greater than or equal to 5 and less than 10 [int32.gte_lt]
   *   int32 other_value = 2 [(buf.validate.field).int32 = { gte: 5, lt: 10 }];
   *
   *   // value must be greater than or equal to 10 or less than 5 [int32.gte_lt_exclusive]
   *   int32 another_value = 3 [(buf.validate.field).int32 = { gte: 10, lt: 5 }];
   * }
   * ```
   * </pre>
   *
   * <code>int32 gte = 5 [json_name = "gte", (.buf.validate.predefined) = { ... }</code>
   * @return The gte.
   */
  int getGte();

  /**
   * <pre>
   * `in` requires the field value to be equal to one of the specified values.
   * If the field value isn't one of the specified values, an error message is
   * generated.
   *
   * ```proto
   * message MyInt32 {
   *   // value must be in list [1, 2, 3]
   *   int32 value = 1 [(buf.validate.field).int32 = { in: [1, 2, 3] }];
   * }
   * ```
   * </pre>
   *
   * <code>repeated int32 in = 6 [json_name = "in", (.buf.validate.predefined) = { ... }</code>
   * @return A list containing the in.
   */
  java.util.List<java.lang.Integer> getInList();
  /**
   * <pre>
   * `in` requires the field value to be equal to one of the specified values.
   * If the field value isn't one of the specified values, an error message is
   * generated.
   *
   * ```proto
   * message MyInt32 {
   *   // value must be in list [1, 2, 3]
   *   int32 value = 1 [(buf.validate.field).int32 = { in: [1, 2, 3] }];
   * }
   * ```
   * </pre>
   *
   * <code>repeated int32 in = 6 [json_name = "in", (.buf.validate.predefined) = { ... }</code>
   * @return The count of in.
   */
  int getInCount();
  /**
   * <pre>
   * `in` requires the field value to be equal to one of the specified values.
   * If the field value isn't one of the specified values, an error message is
   * generated.
   *
   * ```proto
   * message MyInt32 {
   *   // value must be in list [1, 2, 3]
   *   int32 value = 1 [(buf.validate.field).int32 = { in: [1, 2, 3] }];
   * }
   * ```
   * </pre>
   *
   * <code>repeated int32 in = 6 [json_name = "in", (.buf.validate.predefined) = { ... }</code>
   * @param index The index of the element to return.
   * @return The in at the given index.
   */
  int getIn(int index);

  /**
   * <pre>
   * `not_in` requires the field value to not be equal to any of the specified
   * values. If the field value is one of the specified values, an error message
   * is generated.
   *
   * ```proto
   * message MyInt32 {
   *   // value must not be in list [1, 2, 3]
   *   int32 value = 1 [(buf.validate.field).int32 = { not_in: [1, 2, 3] }];
   * }
   * ```
   * </pre>
   *
   * <code>repeated int32 not_in = 7 [json_name = "notIn", (.buf.validate.predefined) = { ... }</code>
   * @return A list containing the notIn.
   */
  java.util.List<java.lang.Integer> getNotInList();
  /**
   * <pre>
   * `not_in` requires the field value to not be equal to any of the specified
   * values. If the field value is one of the specified values, an error message
   * is generated.
   *
   * ```proto
   * message MyInt32 {
   *   // value must not be in list [1, 2, 3]
   *   int32 value = 1 [(buf.validate.field).int32 = { not_in: [1, 2, 3] }];
   * }
   * ```
   * </pre>
   *
   * <code>repeated int32 not_in = 7 [json_name = "notIn", (.buf.validate.predefined) = { ... }</code>
   * @return The count of notIn.
   */
  int getNotInCount();
  /**
   * <pre>
   * `not_in` requires the field value to not be equal to any of the specified
   * values. If the field value is one of the specified values, an error message
   * is generated.
   *
   * ```proto
   * message MyInt32 {
   *   // value must not be in list [1, 2, 3]
   *   int32 value = 1 [(buf.validate.field).int32 = { not_in: [1, 2, 3] }];
   * }
   * ```
   * </pre>
   *
   * <code>repeated int32 not_in = 7 [json_name = "notIn", (.buf.validate.predefined) = { ... }</code>
   * @param index The index of the element to return.
   * @return The notIn at the given index.
   */
  int getNotIn(int index);

  /**
   * <pre>
   * `example` specifies values that the field may have. These values SHOULD
   * conform to other constraints. `example` values will not impact validation
   * but may be used as helpful guidance on how to populate the given field.
   *
   * ```proto
   * message MyInt32 {
   *   int32 value = 1 [
   *     (buf.validate.field).int32.example = 1,
   *     (buf.validate.field).int32.example = -10
   *   ];
   * }
   * ```
   * </pre>
   *
   * <code>repeated int32 example = 8 [json_name = "example", (.buf.validate.predefined) = { ... }</code>
   * @return A list containing the example.
   */
  java.util.List<java.lang.Integer> getExampleList();
  /**
   * <pre>
   * `example` specifies values that the field may have. These values SHOULD
   * conform to other constraints. `example` values will not impact validation
   * but may be used as helpful guidance on how to populate the given field.
   *
   * ```proto
   * message MyInt32 {
   *   int32 value = 1 [
   *     (buf.validate.field).int32.example = 1,
   *     (buf.validate.field).int32.example = -10
   *   ];
   * }
   * ```
   * </pre>
   *
   * <code>repeated int32 example = 8 [json_name = "example", (.buf.validate.predefined) = { ... }</code>
   * @return The count of example.
   */
  int getExampleCount();
  /**
   * <pre>
   * `example` specifies values that the field may have. These values SHOULD
   * conform to other constraints. `example` values will not impact validation
   * but may be used as helpful guidance on how to populate the given field.
   *
   * ```proto
   * message MyInt32 {
   *   int32 value = 1 [
   *     (buf.validate.field).int32.example = 1,
   *     (buf.validate.field).int32.example = -10
   *   ];
   * }
   * ```
   * </pre>
   *
   * <code>repeated int32 example = 8 [json_name = "example", (.buf.validate.predefined) = { ... }</code>
   * @param index The index of the element to return.
   * @return The example at the given index.
   */
  int getExample(int index);

  com.scalekit.grpc.buf.validate.Int32Rules.LessThanCase getLessThanCase();

  com.scalekit.grpc.buf.validate.Int32Rules.GreaterThanCase getGreaterThanCase();
}
