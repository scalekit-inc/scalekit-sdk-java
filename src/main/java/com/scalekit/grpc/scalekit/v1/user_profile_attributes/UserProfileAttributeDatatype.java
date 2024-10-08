// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/user_profile_attributes/user_profile_attributes.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.user_profile_attributes;

/**
 * Protobuf enum {@code scalekit.v1.user_profile_attributes.UserProfileAttributeDatatype}
 */
public enum UserProfileAttributeDatatype
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNSPECIFIED_DATATYPE = 0;</code>
   */
  UNSPECIFIED_DATATYPE(0),
  /**
   * <code>STRING = 1;</code>
   */
  STRING(1),
  /**
   * <code>NUMBER = 2;</code>
   */
  NUMBER(2),
  /**
   * <code>BOOL = 3;</code>
   */
  BOOL(3),
  /**
   * <code>ARRAY = 4;</code>
   */
  ARRAY(4),
  /**
   * <code>OBJECT = 5;</code>
   */
  OBJECT(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNSPECIFIED_DATATYPE = 0;</code>
   */
  public static final int UNSPECIFIED_DATATYPE_VALUE = 0;
  /**
   * <code>STRING = 1;</code>
   */
  public static final int STRING_VALUE = 1;
  /**
   * <code>NUMBER = 2;</code>
   */
  public static final int NUMBER_VALUE = 2;
  /**
   * <code>BOOL = 3;</code>
   */
  public static final int BOOL_VALUE = 3;
  /**
   * <code>ARRAY = 4;</code>
   */
  public static final int ARRAY_VALUE = 4;
  /**
   * <code>OBJECT = 5;</code>
   */
  public static final int OBJECT_VALUE = 5;


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
  public static UserProfileAttributeDatatype valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static UserProfileAttributeDatatype forNumber(int value) {
    switch (value) {
      case 0: return UNSPECIFIED_DATATYPE;
      case 1: return STRING;
      case 2: return NUMBER;
      case 3: return BOOL;
      case 4: return ARRAY;
      case 5: return OBJECT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UserProfileAttributeDatatype>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      UserProfileAttributeDatatype> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<UserProfileAttributeDatatype>() {
          public UserProfileAttributeDatatype findValueByNumber(int number) {
            return UserProfileAttributeDatatype.forNumber(number);
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
    return com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttributesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final UserProfileAttributeDatatype[] VALUES = values();

  public static UserProfileAttributeDatatype valueOf(
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

  private UserProfileAttributeDatatype(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:scalekit.v1.user_profile_attributes.UserProfileAttributeDatatype)
}

