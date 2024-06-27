// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/commons/commons.proto

package com.scalekit.grpc.scalekit.v1.commons;

/**
 * Protobuf enum {@code scalekit.v1.commons.RegionCode}
 */
public enum RegionCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   *
   *If the region code is unspecified the selected region will automatically be decided based on the origin of the call.
   * </pre>
   *
   * <code>REGION_CODE_UNSPECIFIED = 0;</code>
   */
  REGION_CODE_UNSPECIFIED(0),
  /**
   * <code>US = 1;</code>
   */
  US(1),
  /**
   * <code>EU = 2;</code>
   */
  EU(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   *
   *If the region code is unspecified the selected region will automatically be decided based on the origin of the call.
   * </pre>
   *
   * <code>REGION_CODE_UNSPECIFIED = 0;</code>
   */
  public static final int REGION_CODE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>US = 1;</code>
   */
  public static final int US_VALUE = 1;
  /**
   * <code>EU = 2;</code>
   */
  public static final int EU_VALUE = 2;


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
  public static RegionCode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RegionCode forNumber(int value) {
    switch (value) {
      case 0: return REGION_CODE_UNSPECIFIED;
      case 1: return US;
      case 2: return EU;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RegionCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RegionCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RegionCode>() {
          public RegionCode findValueByNumber(int number) {
            return RegionCode.forNumber(number);
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
    return com.scalekit.grpc.scalekit.v1.commons.CommonsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final RegionCode[] VALUES = values();

  public static RegionCode valueOf(
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

  private RegionCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:scalekit.v1.commons.RegionCode)
}

