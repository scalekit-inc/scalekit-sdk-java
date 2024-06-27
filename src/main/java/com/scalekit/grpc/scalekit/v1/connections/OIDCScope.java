// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/connections/connections.proto

package com.scalekit.grpc.scalekit.v1.connections;

/**
 * Protobuf enum {@code scalekit.v1.connections.OIDCScope}
 */
public enum OIDCScope
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OIDC_SCOPE_UNSPECIFIED = 0;</code>
   */
  OIDC_SCOPE_UNSPECIFIED(0),
  /**
   * <code>openid = 1;</code>
   */
  openid(1),
  /**
   * <code>profile = 2;</code>
   */
  profile(2),
  /**
   * <code>email = 3;</code>
   */
  email(3),
  /**
   * <code>address = 4;</code>
   */
  address(4),
  /**
   * <code>phone = 5;</code>
   */
  phone(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OIDC_SCOPE_UNSPECIFIED = 0;</code>
   */
  public static final int OIDC_SCOPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>openid = 1;</code>
   */
  public static final int openid_VALUE = 1;
  /**
   * <code>profile = 2;</code>
   */
  public static final int profile_VALUE = 2;
  /**
   * <code>email = 3;</code>
   */
  public static final int email_VALUE = 3;
  /**
   * <code>address = 4;</code>
   */
  public static final int address_VALUE = 4;
  /**
   * <code>phone = 5;</code>
   */
  public static final int phone_VALUE = 5;


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
  public static OIDCScope valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OIDCScope forNumber(int value) {
    switch (value) {
      case 0: return OIDC_SCOPE_UNSPECIFIED;
      case 1: return openid;
      case 2: return profile;
      case 3: return email;
      case 4: return address;
      case 5: return phone;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OIDCScope>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OIDCScope> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OIDCScope>() {
          public OIDCScope findValueByNumber(int number) {
            return OIDCScope.forNumber(number);
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
    return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.getDescriptor().getEnumTypes().get(5);
  }

  private static final OIDCScope[] VALUES = values();

  public static OIDCScope valueOf(
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

  private OIDCScope(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:scalekit.v1.connections.OIDCScope)
}

