// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/connections/connections.proto

package com.scalekit.grpc.scalekit.v1.connections;

/**
 * Protobuf enum {@code scalekit.v1.connections.ConnectionProvider}
 */
public enum ConnectionProvider
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CONNECTION_PROVIDER_UNSPECIFIED = 0;</code>
   */
  CONNECTION_PROVIDER_UNSPECIFIED(0),
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
  /**
   * <code>PING_IDENTITY = 6;</code>
   */
  PING_IDENTITY(6),
  /**
   * <code>JUMPCLOUD = 7;</code>
   */
  JUMPCLOUD(7),
  /**
   * <code>CUSTOM = 8;</code>
   */
  CUSTOM(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CONNECTION_PROVIDER_UNSPECIFIED = 0;</code>
   */
  public static final int CONNECTION_PROVIDER_UNSPECIFIED_VALUE = 0;
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
  /**
   * <code>PING_IDENTITY = 6;</code>
   */
  public static final int PING_IDENTITY_VALUE = 6;
  /**
   * <code>JUMPCLOUD = 7;</code>
   */
  public static final int JUMPCLOUD_VALUE = 7;
  /**
   * <code>CUSTOM = 8;</code>
   */
  public static final int CUSTOM_VALUE = 8;


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
  public static ConnectionProvider valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ConnectionProvider forNumber(int value) {
    switch (value) {
      case 0: return CONNECTION_PROVIDER_UNSPECIFIED;
      case 1: return OKTA;
      case 2: return GOOGLE;
      case 3: return MICROSOFT_AD;
      case 4: return AUTH0;
      case 5: return ONELOGIN;
      case 6: return PING_IDENTITY;
      case 7: return JUMPCLOUD;
      case 8: return CUSTOM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ConnectionProvider>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ConnectionProvider> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ConnectionProvider>() {
          public ConnectionProvider findValueByNumber(int number) {
            return ConnectionProvider.forNumber(number);
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
    return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.getDescriptor().getEnumTypes().get(8);
  }

  private static final ConnectionProvider[] VALUES = values();

  public static ConnectionProvider valueOf(
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

  private ConnectionProvider(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:scalekit.v1.connections.ConnectionProvider)
}
