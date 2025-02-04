// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/directories/directories.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.directories;

/**
 * Protobuf enum {@code scalekit.v1.directories.DirectoryStatus}
 */
public enum DirectoryStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DIRECTORY_STATUS_UNSPECIFIED = 0;</code>
   */
  DIRECTORY_STATUS_UNSPECIFIED(0),
  /**
   * <code>DRAFT = 1;</code>
   */
  DRAFT(1),
  /**
   * <code>IN_PROGRESS = 2;</code>
   */
  IN_PROGRESS(2),
  /**
   * <code>COMPLETED = 3;</code>
   */
  COMPLETED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DIRECTORY_STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int DIRECTORY_STATUS_UNSPECIFIED_VALUE = 0;
  /**
   * <code>DRAFT = 1;</code>
   */
  public static final int DRAFT_VALUE = 1;
  /**
   * <code>IN_PROGRESS = 2;</code>
   */
  public static final int IN_PROGRESS_VALUE = 2;
  /**
   * <code>COMPLETED = 3;</code>
   */
  public static final int COMPLETED_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static DirectoryStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DirectoryStatus forNumber(int value) {
    switch (value) {
      case 0: return DIRECTORY_STATUS_UNSPECIFIED;
      case 1: return DRAFT;
      case 2: return IN_PROGRESS;
      case 3: return COMPLETED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DirectoryStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DirectoryStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DirectoryStatus>() {
          public DirectoryStatus findValueByNumber(int number) {
            return DirectoryStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final DirectoryStatus[] VALUES = values();

  public static DirectoryStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DirectoryStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:scalekit.v1.directories.DirectoryStatus)
}

