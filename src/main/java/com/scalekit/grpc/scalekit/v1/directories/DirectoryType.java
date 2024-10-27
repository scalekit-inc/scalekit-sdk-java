// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/directories/directories.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.directories;

/**
 * Protobuf enum {@code scalekit.v1.directories.DirectoryType}
 */
public enum DirectoryType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DIRECTORY_TYPE_UNSPECIFIED = 0;</code>
   */
  DIRECTORY_TYPE_UNSPECIFIED(0),
  /**
   * <code>SCIM = 1;</code>
   */
  SCIM(1),
  /**
   * <code>LDAP = 2;</code>
   */
  LDAP(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DIRECTORY_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int DIRECTORY_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>SCIM = 1;</code>
   */
  public static final int SCIM_VALUE = 1;
  /**
   * <code>LDAP = 2;</code>
   */
  public static final int LDAP_VALUE = 2;


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
  public static DirectoryType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DirectoryType forNumber(int value) {
    switch (value) {
      case 0: return DIRECTORY_TYPE_UNSPECIFIED;
      case 1: return SCIM;
      case 2: return LDAP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DirectoryType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DirectoryType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DirectoryType>() {
          public DirectoryType findValueByNumber(int number) {
            return DirectoryType.forNumber(number);
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
    return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final DirectoryType[] VALUES = values();

  public static DirectoryType valueOf(
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

  private DirectoryType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:scalekit.v1.directories.DirectoryType)
}
