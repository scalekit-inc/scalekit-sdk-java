// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/clients/clients.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.clients;

/**
 * Protobuf enum {@code scalekit.v1.clients.ApplicationType}
 */
public enum ApplicationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>APPLICATION_TYPE_UNSPECIFIED = 0;</code>
   */
  APPLICATION_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * Web application
   * </pre>
   *
   * <code>WEB = 1;</code>
   */
  WEB(1),
  /**
   * <pre>
   * Mobile application
   * </pre>
   *
   * <code>MOBILE = 2;</code>
   */
  MOBILE(2),
  /**
   * <pre>
   * Desktop application
   * </pre>
   *
   * <code>DESKTOP = 3;</code>
   */
  DESKTOP(3),
  /**
   * <pre>
   * Server application OR Microservices
   * </pre>
   *
   * <code>SERVER = 4;</code>
   */
  SERVER(4),
  /**
   * <pre>
   * Model Context Protocol Server
   * </pre>
   *
   * <code>MCP_SERVER = 5;</code>
   */
  MCP_SERVER(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>APPLICATION_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int APPLICATION_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Web application
   * </pre>
   *
   * <code>WEB = 1;</code>
   */
  public static final int WEB_VALUE = 1;
  /**
   * <pre>
   * Mobile application
   * </pre>
   *
   * <code>MOBILE = 2;</code>
   */
  public static final int MOBILE_VALUE = 2;
  /**
   * <pre>
   * Desktop application
   * </pre>
   *
   * <code>DESKTOP = 3;</code>
   */
  public static final int DESKTOP_VALUE = 3;
  /**
   * <pre>
   * Server application OR Microservices
   * </pre>
   *
   * <code>SERVER = 4;</code>
   */
  public static final int SERVER_VALUE = 4;
  /**
   * <pre>
   * Model Context Protocol Server
   * </pre>
   *
   * <code>MCP_SERVER = 5;</code>
   */
  public static final int MCP_SERVER_VALUE = 5;


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
  public static ApplicationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ApplicationType forNumber(int value) {
    switch (value) {
      case 0: return APPLICATION_TYPE_UNSPECIFIED;
      case 1: return WEB;
      case 2: return MOBILE;
      case 3: return DESKTOP;
      case 4: return SERVER;
      case 5: return MCP_SERVER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ApplicationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ApplicationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ApplicationType>() {
          public ApplicationType findValueByNumber(int number) {
            return ApplicationType.forNumber(number);
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
    return com.scalekit.grpc.scalekit.v1.clients.ClientsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ApplicationType[] VALUES = values();

  public static ApplicationType valueOf(
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

  private ApplicationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:scalekit.v1.clients.ApplicationType)
}

