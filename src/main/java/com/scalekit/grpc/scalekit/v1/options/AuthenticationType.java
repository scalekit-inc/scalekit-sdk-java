// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/options/options.proto

package com.scalekit.grpc.scalekit.v1.options;

/**
 * Protobuf enum {@code scalekit.v1.options.AuthenticationType}
 */
public enum AuthenticationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * API is blocked / private  and default
   * </pre>
   *
   * <code>BLOCKED = 0;</code>
   */
  BLOCKED(0),
  /**
   * <pre>
   * API is open
   * </pre>
   *
   * <code>NONE = 1;</code>
   */
  NONE(1),
  /**
   * <pre>
   * workspace_id is in claims
   * </pre>
   *
   * <code>WORKSPACE = 64;</code>
   */
  WORKSPACE(64),
  /**
   * <pre>
   * claims has organisation ID
   * </pre>
   *
   * <code>CUSTOMER_PORTAL = 32;</code>
   */
  CUSTOMER_PORTAL(32),
  /**
   * <pre>
   * claims has UI in audience
   * </pre>
   *
   * <code>SESSION = 16;</code>
   */
  SESSION(16),
  /**
   * <pre>
   * workspace_id is in claims and UI in audience
   * </pre>
   *
   * <code>WORKSPACE_SESSION = 80;</code>
   */
  WORKSPACE_SESSION(80),
  /**
   * <pre>
   * workspace_id,organization_id is in claims and UI in audience
   * </pre>
   *
   * <code>WORKSPACE_SESSION_CUSTOMER_PORTAL = 112;</code>
   */
  WORKSPACE_SESSION_CUSTOMER_PORTAL(112),
  /**
   * <pre>
   * user_id is in claims
   * </pre>
   *
   * <code>USER = 8;</code>
   */
  USER(8),
  /**
   * <pre>
   * client Id is in subject
   * </pre>
   *
   * <code>CLIENT = 4;</code>
   */
  CLIENT(4),
  /**
   * <pre>
   * UI in audience or client Id is in subject
   * </pre>
   *
   * <code>SESSION_CLIENT = 20;</code>
   */
  SESSION_CLIENT(20),
  /**
   * <pre>
   * workspace_id is in claims, UI in audience and client Id is in subject
   * </pre>
   *
   * <code>WORKSPACE_SESSION_CLIENT = 84;</code>
   */
  WORKSPACE_SESSION_CLIENT(84),
  /**
   * <pre>
   * claims has organisation ID, UI in audience and client Id is in subject
   * </pre>
   *
   * <code>CUSTOMER_PORTAL_SESSION_CLIENT = 52;</code>
   */
  CUSTOMER_PORTAL_SESSION_CLIENT(52),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * API is blocked / private  and default
   * </pre>
   *
   * <code>BLOCKED = 0;</code>
   */
  public static final int BLOCKED_VALUE = 0;
  /**
   * <pre>
   * API is open
   * </pre>
   *
   * <code>NONE = 1;</code>
   */
  public static final int NONE_VALUE = 1;
  /**
   * <pre>
   * workspace_id is in claims
   * </pre>
   *
   * <code>WORKSPACE = 64;</code>
   */
  public static final int WORKSPACE_VALUE = 64;
  /**
   * <pre>
   * claims has organisation ID
   * </pre>
   *
   * <code>CUSTOMER_PORTAL = 32;</code>
   */
  public static final int CUSTOMER_PORTAL_VALUE = 32;
  /**
   * <pre>
   * claims has UI in audience
   * </pre>
   *
   * <code>SESSION = 16;</code>
   */
  public static final int SESSION_VALUE = 16;
  /**
   * <pre>
   * workspace_id is in claims and UI in audience
   * </pre>
   *
   * <code>WORKSPACE_SESSION = 80;</code>
   */
  public static final int WORKSPACE_SESSION_VALUE = 80;
  /**
   * <pre>
   * workspace_id,organization_id is in claims and UI in audience
   * </pre>
   *
   * <code>WORKSPACE_SESSION_CUSTOMER_PORTAL = 112;</code>
   */
  public static final int WORKSPACE_SESSION_CUSTOMER_PORTAL_VALUE = 112;
  /**
   * <pre>
   * user_id is in claims
   * </pre>
   *
   * <code>USER = 8;</code>
   */
  public static final int USER_VALUE = 8;
  /**
   * <pre>
   * client Id is in subject
   * </pre>
   *
   * <code>CLIENT = 4;</code>
   */
  public static final int CLIENT_VALUE = 4;
  /**
   * <pre>
   * UI in audience or client Id is in subject
   * </pre>
   *
   * <code>SESSION_CLIENT = 20;</code>
   */
  public static final int SESSION_CLIENT_VALUE = 20;
  /**
   * <pre>
   * workspace_id is in claims, UI in audience and client Id is in subject
   * </pre>
   *
   * <code>WORKSPACE_SESSION_CLIENT = 84;</code>
   */
  public static final int WORKSPACE_SESSION_CLIENT_VALUE = 84;
  /**
   * <pre>
   * claims has organisation ID, UI in audience and client Id is in subject
   * </pre>
   *
   * <code>CUSTOMER_PORTAL_SESSION_CLIENT = 52;</code>
   */
  public static final int CUSTOMER_PORTAL_SESSION_CLIENT_VALUE = 52;


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
  public static AuthenticationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AuthenticationType forNumber(int value) {
    switch (value) {
      case 0: return BLOCKED;
      case 1: return NONE;
      case 64: return WORKSPACE;
      case 32: return CUSTOMER_PORTAL;
      case 16: return SESSION;
      case 80: return WORKSPACE_SESSION;
      case 112: return WORKSPACE_SESSION_CUSTOMER_PORTAL;
      case 8: return USER;
      case 4: return CLIENT;
      case 20: return SESSION_CLIENT;
      case 84: return WORKSPACE_SESSION_CLIENT;
      case 52: return CUSTOMER_PORTAL_SESSION_CLIENT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AuthenticationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AuthenticationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AuthenticationType>() {
          public AuthenticationType findValueByNumber(int number) {
            return AuthenticationType.forNumber(number);
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
    return com.scalekit.grpc.scalekit.v1.options.OptionsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final AuthenticationType[] VALUES = values();

  public static AuthenticationType valueOf(
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

  private AuthenticationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:scalekit.v1.options.AuthenticationType)
}
