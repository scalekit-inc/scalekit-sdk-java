// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/commons/commons.proto

package com.scalekit.grpc.scalekit.v1.commons;

/**
 * Protobuf enum {@code scalekit.v1.commons.EnvironmentType}
 */
public enum EnvironmentType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ENVIRONMENT_TYPE_UNSPECIFIED = 0;</code>
   */
  ENVIRONMENT_TYPE_UNSPECIFIED(0),
  /**
   * <code>PRD = 1;</code>
   */
  PRD(1),
  /**
   * <code>DEV = 2;</code>
   */
  DEV(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ENVIRONMENT_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int ENVIRONMENT_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>PRD = 1;</code>
   */
  public static final int PRD_VALUE = 1;
  /**
   * <code>DEV = 2;</code>
   */
  public static final int DEV_VALUE = 2;


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
  public static EnvironmentType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EnvironmentType forNumber(int value) {
    switch (value) {
      case 0: return ENVIRONMENT_TYPE_UNSPECIFIED;
      case 1: return PRD;
      case 2: return DEV;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EnvironmentType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EnvironmentType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EnvironmentType>() {
          public EnvironmentType findValueByNumber(int number) {
            return EnvironmentType.forNumber(number);
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
    return com.scalekit.grpc.scalekit.v1.commons.CommonsProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final EnvironmentType[] VALUES = values();

  public static EnvironmentType valueOf(
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

  private EnvironmentType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:scalekit.v1.commons.EnvironmentType)
}
