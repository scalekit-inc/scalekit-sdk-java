// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/connections/connections.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.connections;

/**
 * Protobuf enum {@code scalekit.v1.connections.TokenAuthType}
 */
public enum TokenAuthType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TOKEN_AUTH_TYPE_UNSPECIFIED = 0;</code>
   */
  TOKEN_AUTH_TYPE_UNSPECIFIED(0),
  /**
   * <code>URL_PARAMS = 1;</code>
   */
  URL_PARAMS(1),
  /**
   * <code>BASIC_AUTH = 2;</code>
   */
  BASIC_AUTH(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TOKEN_AUTH_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int TOKEN_AUTH_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>URL_PARAMS = 1;</code>
   */
  public static final int URL_PARAMS_VALUE = 1;
  /**
   * <code>BASIC_AUTH = 2;</code>
   */
  public static final int BASIC_AUTH_VALUE = 2;


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
  public static TokenAuthType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TokenAuthType forNumber(int value) {
    switch (value) {
      case 0: return TOKEN_AUTH_TYPE_UNSPECIFIED;
      case 1: return URL_PARAMS;
      case 2: return BASIC_AUTH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TokenAuthType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TokenAuthType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TokenAuthType>() {
          public TokenAuthType findValueByNumber(int number) {
            return TokenAuthType.forNumber(number);
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
    return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.getDescriptor().getEnumTypes().get(4);
  }

  private static final TokenAuthType[] VALUES = values();

  public static TokenAuthType valueOf(
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

  private TokenAuthType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:scalekit.v1.connections.TokenAuthType)
}

