// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/connections/connections.proto

package com.scalekit.grpc.scalekit.v1.connections;

/**
 * <pre>
 * enums all
 * </pre>
 *
 * Protobuf enum {@code scalekit.v1.connections.SAMLSigningOptions}
 */
public enum SAMLSigningOptions
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SAML_SIGNING_OPTIONS_UNSPECIFIED = 0;</code>
   */
  SAML_SIGNING_OPTIONS_UNSPECIFIED(0),
  /**
   * <code>NO_SIGNING = 1;</code>
   */
  NO_SIGNING(1),
  /**
   * <code>SAML_ONLY_RESPONSE_SIGNING = 2;</code>
   */
  SAML_ONLY_RESPONSE_SIGNING(2),
  /**
   * <code>SAML_ONLY_ASSERTION_SIGNING = 3;</code>
   */
  SAML_ONLY_ASSERTION_SIGNING(3),
  /**
   * <code>SAML_RESPONSE_ASSERTION_SIGNING = 4;</code>
   */
  SAML_RESPONSE_ASSERTION_SIGNING(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SAML_SIGNING_OPTIONS_UNSPECIFIED = 0;</code>
   */
  public static final int SAML_SIGNING_OPTIONS_UNSPECIFIED_VALUE = 0;
  /**
   * <code>NO_SIGNING = 1;</code>
   */
  public static final int NO_SIGNING_VALUE = 1;
  /**
   * <code>SAML_ONLY_RESPONSE_SIGNING = 2;</code>
   */
  public static final int SAML_ONLY_RESPONSE_SIGNING_VALUE = 2;
  /**
   * <code>SAML_ONLY_ASSERTION_SIGNING = 3;</code>
   */
  public static final int SAML_ONLY_ASSERTION_SIGNING_VALUE = 3;
  /**
   * <code>SAML_RESPONSE_ASSERTION_SIGNING = 4;</code>
   */
  public static final int SAML_RESPONSE_ASSERTION_SIGNING_VALUE = 4;


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
  public static SAMLSigningOptions valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SAMLSigningOptions forNumber(int value) {
    switch (value) {
      case 0: return SAML_SIGNING_OPTIONS_UNSPECIFIED;
      case 1: return NO_SIGNING;
      case 2: return SAML_ONLY_RESPONSE_SIGNING;
      case 3: return SAML_ONLY_ASSERTION_SIGNING;
      case 4: return SAML_RESPONSE_ASSERTION_SIGNING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SAMLSigningOptions>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SAMLSigningOptions> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SAMLSigningOptions>() {
          public SAMLSigningOptions findValueByNumber(int number) {
            return SAMLSigningOptions.forNumber(number);
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
    return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final SAMLSigningOptions[] VALUES = values();

  public static SAMLSigningOptions valueOf(
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

  private SAMLSigningOptions(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:scalekit.v1.connections.SAMLSigningOptions)
}
