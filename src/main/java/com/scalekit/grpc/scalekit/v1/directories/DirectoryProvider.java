// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/directories/directories.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.directories;

/**
 * Protobuf enum {@code scalekit.v1.directories.DirectoryProvider}
 */
public enum DirectoryProvider
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DIRECTORY_PROVIDER_UNSPECIFIED = 0;</code>
   */
  DIRECTORY_PROVIDER_UNSPECIFIED(0),
  /**
   * <code>OKTA = 1;</code>
   */
  OKTA(1),
  /**
   * <code>GOOGLE = 2;</code>
   */
  GOOGLE(2),
  /**
   * <code>MICROSOFT_AD = 3;</code>
   */
  MICROSOFT_AD(3),
  /**
   * <code>AUTH0 = 4;</code>
   */
  AUTH0(4),
  /**
   * <code>ONELOGIN = 5;</code>
   */
  ONELOGIN(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DIRECTORY_PROVIDER_UNSPECIFIED = 0;</code>
   */
  public static final int DIRECTORY_PROVIDER_UNSPECIFIED_VALUE = 0;
  /**
   * <code>OKTA = 1;</code>
   */
  public static final int OKTA_VALUE = 1;
  /**
   * <code>GOOGLE = 2;</code>
   */
  public static final int GOOGLE_VALUE = 2;
  /**
   * <code>MICROSOFT_AD = 3;</code>
   */
  public static final int MICROSOFT_AD_VALUE = 3;
  /**
   * <code>AUTH0 = 4;</code>
   */
  public static final int AUTH0_VALUE = 4;
  /**
   * <code>ONELOGIN = 5;</code>
   */
  public static final int ONELOGIN_VALUE = 5;


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
  public static DirectoryProvider valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DirectoryProvider forNumber(int value) {
    switch (value) {
      case 0: return DIRECTORY_PROVIDER_UNSPECIFIED;
      case 1: return OKTA;
      case 2: return GOOGLE;
      case 3: return MICROSOFT_AD;
      case 4: return AUTH0;
      case 5: return ONELOGIN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DirectoryProvider>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DirectoryProvider> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DirectoryProvider>() {
          public DirectoryProvider findValueByNumber(int number) {
            return DirectoryProvider.forNumber(number);
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
    return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final DirectoryProvider[] VALUES = values();

  public static DirectoryProvider valueOf(
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

  private DirectoryProvider(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:scalekit.v1.directories.DirectoryProvider)
}
