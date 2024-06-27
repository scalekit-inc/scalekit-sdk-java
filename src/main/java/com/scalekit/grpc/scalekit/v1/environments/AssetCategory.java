// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/environments/environments.proto

package com.scalekit.grpc.scalekit.v1.environments;

/**
 * <pre>
 * can be extended to support more asset types
 * </pre>
 *
 * Protobuf enum {@code scalekit.v1.environments.AssetCategory}
 */
public enum AssetCategory
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ASSET_CATEGORY_UNSPECIFIED = 0;</code>
   */
  ASSET_CATEGORY_UNSPECIFIED(0),
  /**
   * <code>PORTAL_CUSTOMIZATION_IMAGE = 1;</code>
   */
  PORTAL_CUSTOMIZATION_IMAGE(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ASSET_CATEGORY_UNSPECIFIED = 0;</code>
   */
  public static final int ASSET_CATEGORY_UNSPECIFIED_VALUE = 0;
  /**
   * <code>PORTAL_CUSTOMIZATION_IMAGE = 1;</code>
   */
  public static final int PORTAL_CUSTOMIZATION_IMAGE_VALUE = 1;


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
  public static AssetCategory valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AssetCategory forNumber(int value) {
    switch (value) {
      case 0: return ASSET_CATEGORY_UNSPECIFIED;
      case 1: return PORTAL_CUSTOMIZATION_IMAGE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AssetCategory>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AssetCategory> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AssetCategory>() {
          public AssetCategory findValueByNumber(int number) {
            return AssetCategory.forNumber(number);
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
    return com.scalekit.grpc.scalekit.v1.environments.EnvironmentsProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final AssetCategory[] VALUES = values();

  public static AssetCategory valueOf(
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

  private AssetCategory(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:scalekit.v1.environments.AssetCategory)
}

