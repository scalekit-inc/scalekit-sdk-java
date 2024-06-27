// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/user_profile_attributes/user_profile_attributes.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.user_profile_attributes;

/**
 * Protobuf enum {@code scalekit.v1.user_profile_attributes.UserProfileAttributeCategory}
 */
public enum UserProfileAttributeCategory
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNSPECIFIED_CATEGORY = 0;</code>
   */
  UNSPECIFIED_CATEGORY(0),
  /**
   * <code>STANDARD = 1;</code>
   */
  STANDARD(1),
  /**
   * <code>CUSTOM = 2;</code>
   */
  CUSTOM(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNSPECIFIED_CATEGORY = 0;</code>
   */
  public static final int UNSPECIFIED_CATEGORY_VALUE = 0;
  /**
   * <code>STANDARD = 1;</code>
   */
  public static final int STANDARD_VALUE = 1;
  /**
   * <code>CUSTOM = 2;</code>
   */
  public static final int CUSTOM_VALUE = 2;


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
  public static UserProfileAttributeCategory valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static UserProfileAttributeCategory forNumber(int value) {
    switch (value) {
      case 0: return UNSPECIFIED_CATEGORY;
      case 1: return STANDARD;
      case 2: return CUSTOM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UserProfileAttributeCategory>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      UserProfileAttributeCategory> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<UserProfileAttributeCategory>() {
          public UserProfileAttributeCategory findValueByNumber(int number) {
            return UserProfileAttributeCategory.forNumber(number);
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
    return com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttributesProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final UserProfileAttributeCategory[] VALUES = values();

  public static UserProfileAttributeCategory valueOf(
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

  private UserProfileAttributeCategory(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:scalekit.v1.user_profile_attributes.UserProfileAttributeCategory)
}

