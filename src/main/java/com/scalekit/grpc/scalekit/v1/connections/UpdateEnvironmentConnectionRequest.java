// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/connections/connections.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.connections;

/**
 * Protobuf type {@code scalekit.v1.connections.UpdateEnvironmentConnectionRequest}
 */
public final class UpdateEnvironmentConnectionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.connections.UpdateEnvironmentConnectionRequest)
    UpdateEnvironmentConnectionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateEnvironmentConnectionRequest.newBuilder() to construct.
  private UpdateEnvironmentConnectionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateEnvironmentConnectionRequest() {
    connectionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateEnvironmentConnectionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_UpdateEnvironmentConnectionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_UpdateEnvironmentConnectionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest.class, com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest.Builder.class);
  }

  private int bitField0_;
  public static final int CONNECTION_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object connectionId_ = "";
  /**
   * <code>string connection_id = 1 [json_name = "connectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The connectionId.
   */
  @java.lang.Override
  public java.lang.String getConnectionId() {
    java.lang.Object ref = connectionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      connectionId_ = s;
      return s;
    }
  }
  /**
   * <code>string connection_id = 1 [json_name = "connectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for connectionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConnectionIdBytes() {
    java.lang.Object ref = connectionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      connectionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONNECTION_FIELD_NUMBER = 3;
  private com.scalekit.grpc.scalekit.v1.connections.UpdateConnection connection_;
  /**
   * <code>.scalekit.v1.connections.UpdateConnection connection = 3 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the connection field is set.
   */
  @java.lang.Override
  public boolean hasConnection() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.scalekit.v1.connections.UpdateConnection connection = 3 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The connection.
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.connections.UpdateConnection getConnection() {
    return connection_ == null ? com.scalekit.grpc.scalekit.v1.connections.UpdateConnection.getDefaultInstance() : connection_;
  }
  /**
   * <code>.scalekit.v1.connections.UpdateConnection connection = 3 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionOrBuilder getConnectionOrBuilder() {
    return connection_ == null ? com.scalekit.grpc.scalekit.v1.connections.UpdateConnection.getDefaultInstance() : connection_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(connectionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, connectionId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getConnection());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(connectionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, connectionId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getConnection());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest other = (com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest) obj;

    if (!getConnectionId()
        .equals(other.getConnectionId())) return false;
    if (hasConnection() != other.hasConnection()) return false;
    if (hasConnection()) {
      if (!getConnection()
          .equals(other.getConnection())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CONNECTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConnectionId().hashCode();
    if (hasConnection()) {
      hash = (37 * hash) + CONNECTION_FIELD_NUMBER;
      hash = (53 * hash) + getConnection().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code scalekit.v1.connections.UpdateEnvironmentConnectionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.connections.UpdateEnvironmentConnectionRequest)
      com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_UpdateEnvironmentConnectionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_UpdateEnvironmentConnectionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest.class, com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getConnectionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      connectionId_ = "";
      connection_ = null;
      if (connectionBuilder_ != null) {
        connectionBuilder_.dispose();
        connectionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_UpdateEnvironmentConnectionRequest_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest build() {
      com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest buildPartial() {
      com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest result = new com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.connectionId_ = connectionId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.connection_ = connectionBuilder_ == null
            ? connection_
            : connectionBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest other) {
      if (other == com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest.getDefaultInstance()) return this;
      if (!other.getConnectionId().isEmpty()) {
        connectionId_ = other.connectionId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasConnection()) {
        mergeConnection(other.getConnection());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              connectionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 26: {
              input.readMessage(
                  getConnectionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object connectionId_ = "";
    /**
     * <code>string connection_id = 1 [json_name = "connectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The connectionId.
     */
    public java.lang.String getConnectionId() {
      java.lang.Object ref = connectionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        connectionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string connection_id = 1 [json_name = "connectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The bytes for connectionId.
     */
    public com.google.protobuf.ByteString
        getConnectionIdBytes() {
      java.lang.Object ref = connectionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        connectionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string connection_id = 1 [json_name = "connectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The connectionId to set.
     * @return This builder for chaining.
     */
    public Builder setConnectionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      connectionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string connection_id = 1 [json_name = "connectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearConnectionId() {
      connectionId_ = getDefaultInstance().getConnectionId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string connection_id = 1 [json_name = "connectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for connectionId to set.
     * @return This builder for chaining.
     */
    public Builder setConnectionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      connectionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.scalekit.grpc.scalekit.v1.connections.UpdateConnection connection_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.connections.UpdateConnection, com.scalekit.grpc.scalekit.v1.connections.UpdateConnection.Builder, com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionOrBuilder> connectionBuilder_;
    /**
     * <code>.scalekit.v1.connections.UpdateConnection connection = 3 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the connection field is set.
     */
    public boolean hasConnection() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.scalekit.v1.connections.UpdateConnection connection = 3 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The connection.
     */
    public com.scalekit.grpc.scalekit.v1.connections.UpdateConnection getConnection() {
      if (connectionBuilder_ == null) {
        return connection_ == null ? com.scalekit.grpc.scalekit.v1.connections.UpdateConnection.getDefaultInstance() : connection_;
      } else {
        return connectionBuilder_.getMessage();
      }
    }
    /**
     * <code>.scalekit.v1.connections.UpdateConnection connection = 3 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setConnection(com.scalekit.grpc.scalekit.v1.connections.UpdateConnection value) {
      if (connectionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        connection_ = value;
      } else {
        connectionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.connections.UpdateConnection connection = 3 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setConnection(
        com.scalekit.grpc.scalekit.v1.connections.UpdateConnection.Builder builderForValue) {
      if (connectionBuilder_ == null) {
        connection_ = builderForValue.build();
      } else {
        connectionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.connections.UpdateConnection connection = 3 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder mergeConnection(com.scalekit.grpc.scalekit.v1.connections.UpdateConnection value) {
      if (connectionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          connection_ != null &&
          connection_ != com.scalekit.grpc.scalekit.v1.connections.UpdateConnection.getDefaultInstance()) {
          getConnectionBuilder().mergeFrom(value);
        } else {
          connection_ = value;
        }
      } else {
        connectionBuilder_.mergeFrom(value);
      }
      if (connection_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.scalekit.v1.connections.UpdateConnection connection = 3 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder clearConnection() {
      bitField0_ = (bitField0_ & ~0x00000002);
      connection_ = null;
      if (connectionBuilder_ != null) {
        connectionBuilder_.dispose();
        connectionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.connections.UpdateConnection connection = 3 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.connections.UpdateConnection.Builder getConnectionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getConnectionFieldBuilder().getBuilder();
    }
    /**
     * <code>.scalekit.v1.connections.UpdateConnection connection = 3 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionOrBuilder getConnectionOrBuilder() {
      if (connectionBuilder_ != null) {
        return connectionBuilder_.getMessageOrBuilder();
      } else {
        return connection_ == null ?
            com.scalekit.grpc.scalekit.v1.connections.UpdateConnection.getDefaultInstance() : connection_;
      }
    }
    /**
     * <code>.scalekit.v1.connections.UpdateConnection connection = 3 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.connections.UpdateConnection, com.scalekit.grpc.scalekit.v1.connections.UpdateConnection.Builder, com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionOrBuilder> 
        getConnectionFieldBuilder() {
      if (connectionBuilder_ == null) {
        connectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.connections.UpdateConnection, com.scalekit.grpc.scalekit.v1.connections.UpdateConnection.Builder, com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionOrBuilder>(
                getConnection(),
                getParentForChildren(),
                isClean());
        connection_ = null;
      }
      return connectionBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:scalekit.v1.connections.UpdateEnvironmentConnectionRequest)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.connections.UpdateEnvironmentConnectionRequest)
  private static final com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest();
  }

  public static com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateEnvironmentConnectionRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateEnvironmentConnectionRequest>() {
    @java.lang.Override
    public UpdateEnvironmentConnectionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<UpdateEnvironmentConnectionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateEnvironmentConnectionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
