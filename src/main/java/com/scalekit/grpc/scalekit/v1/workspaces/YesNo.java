// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/workspaces/workspaces.proto

package com.scalekit.grpc.scalekit.v1.workspaces;

/**
 * Protobuf enum {@code scalekit.v1.workspaces.YesNo}
 */
public enum YesNo
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>YES = 0;</code>
   */
  YES(0),
  /**
   * <code>NO = 1;</code>
   */
  NO(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>YES = 0;</code>
   */
  public static final int YES_VALUE = 0;
  /**
   * <code>NO = 1;</code>
   */
  public static final int NO_VALUE = 1;


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
  public static YesNo valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static YesNo forNumber(int value) {
    switch (value) {
      case 0: return YES;
      case 1: return NO;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<YesNo>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      YesNo> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<YesNo>() {
          public YesNo findValueByNumber(int number) {
            return YesNo.forNumber(number);
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
    return com.scalekit.grpc.scalekit.v1.workspaces.WorkspacesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final YesNo[] VALUES = values();

  public static YesNo valueOf(
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

  private YesNo(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:scalekit.v1.workspaces.YesNo)
}

