// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/expression.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.buf.validate;

public final class ExpressionProto {
  private ExpressionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_Constraint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_Constraint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_Violations_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_Violations_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_Violation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_Violation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035buf/validate/expression.proto\022\014buf.val" +
      "idate\"V\n\nConstraint\022\016\n\002id\030\001 \001(\tR\002id\022\030\n\007m" +
      "essage\030\002 \001(\tR\007message\022\036\n\nexpression\030\003 \001(" +
      "\tR\nexpression\"E\n\nViolations\0227\n\nviolation" +
      "s\030\001 \003(\0132\027.buf.validate.ViolationR\nviolat" +
      "ions\"\202\001\n\tViolation\022\035\n\nfield_path\030\001 \001(\tR\t" +
      "fieldPath\022#\n\rconstraint_id\030\002 \001(\tR\014constr" +
      "aintId\022\030\n\007message\030\003 \001(\tR\007message\022\027\n\007for_" +
      "key\030\004 \001(\010R\006forKeyB\313\001\n\036com.scalekit.grpc." +
      "buf.validateB\017ExpressionProtoP\001ZGbuf.bui" +
      "ld/gen/go/bufbuild/protovalidate/protoco" +
      "lbuffers/go/buf/validate\242\002\003BVX\252\002\014Buf.Val" +
      "idate\312\002\014Buf\\Validate\342\002\030Buf\\Validate\\GPBM" +
      "etadata\352\002\rBuf::Validateb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_buf_validate_Constraint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_buf_validate_Constraint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_Constraint_descriptor,
        new java.lang.String[] { "Id", "Message", "Expression", });
    internal_static_buf_validate_Violations_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_buf_validate_Violations_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_Violations_descriptor,
        new java.lang.String[] { "Violations", });
    internal_static_buf_validate_Violation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_buf_validate_Violation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_Violation_descriptor,
        new java.lang.String[] { "FieldPath", "ConstraintId", "Message", "ForKey", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
