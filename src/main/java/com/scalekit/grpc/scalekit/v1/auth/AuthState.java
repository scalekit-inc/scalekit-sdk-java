// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/auth/auth.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.auth;

/**
 * Protobuf enum {@code scalekit.v1.auth.AuthState}
 */
public enum AuthState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>AUTHENTICATION = 0;</code>
   */
  AUTHENTICATION(0),
  /**
   * <code>ORGANIZATION_SWITCHER = 1;</code>
   */
  ORGANIZATION_SWITCHER(1),
  /**
   * <code>ORGANIZATION_SWITCHER_SIGNUP = 2;</code>
   */
  ORGANIZATION_SWITCHER_SIGNUP(2),
  /**
   * <code>ORGANIZATION_SIGNUP = 3;</code>
   */
  ORGANIZATION_SIGNUP(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>AUTHENTICATION = 0;</code>
   */
  public static final int AUTHENTICATION_VALUE = 0;
  /**
   * <code>ORGANIZATION_SWITCHER = 1;</code>
   */
  public static final int ORGANIZATION_SWITCHER_VALUE = 1;
  /**
   * <code>ORGANIZATION_SWITCHER_SIGNUP = 2;</code>
   */
  public static final int ORGANIZATION_SWITCHER_SIGNUP_VALUE = 2;
  /**
   * <code>ORGANIZATION_SIGNUP = 3;</code>
   */
  public static final int ORGANIZATION_SIGNUP_VALUE = 3;


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
  public static AuthState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AuthState forNumber(int value) {
    switch (value) {
      case 0: return AUTHENTICATION;
      case 1: return ORGANIZATION_SWITCHER;
      case 2: return ORGANIZATION_SWITCHER_SIGNUP;
      case 3: return ORGANIZATION_SIGNUP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AuthState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AuthState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AuthState>() {
          public AuthState findValueByNumber(int number) {
            return AuthState.forNumber(number);
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
    return com.scalekit.grpc.scalekit.v1.auth.AuthProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final AuthState[] VALUES = values();

  public static AuthState valueOf(
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

  private AuthState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:scalekit.v1.auth.AuthState)
}

