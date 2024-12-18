// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/connections/connections.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.connections;

/**
 * Protobuf type {@code scalekit.v1.connections.GetConnectionResponse}
 */
public final class GetConnectionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.connections.GetConnectionResponse)
    GetConnectionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetConnectionResponse.newBuilder() to construct.
  private GetConnectionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetConnectionResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetConnectionResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_GetConnectionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_GetConnectionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse.class, com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse.Builder.class);
  }

  private int bitField0_;
  public static final int CONNECTION_FIELD_NUMBER = 1;
  private com.scalekit.grpc.scalekit.v1.connections.Connection connection_;
  /**
   * <code>.scalekit.v1.connections.Connection connection = 1 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the connection field is set.
   */
  @java.lang.Override
  public boolean hasConnection() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.scalekit.v1.connections.Connection connection = 1 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The connection.
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.connections.Connection getConnection() {
    return connection_ == null ? com.scalekit.grpc.scalekit.v1.connections.Connection.getDefaultInstance() : connection_;
  }
  /**
   * <code>.scalekit.v1.connections.Connection connection = 1 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.connections.ConnectionOrBuilder getConnectionOrBuilder() {
    return connection_ == null ? com.scalekit.grpc.scalekit.v1.connections.Connection.getDefaultInstance() : connection_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getConnection());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getConnection());
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse other = (com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse) obj;

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
    if (hasConnection()) {
      hash = (37 * hash) + CONNECTION_FIELD_NUMBER;
      hash = (53 * hash) + getConnection().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse prototype) {
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
   * Protobuf type {@code scalekit.v1.connections.GetConnectionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.connections.GetConnectionResponse)
      com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_GetConnectionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_GetConnectionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse.class, com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse.newBuilder()
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
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_GetConnectionResponse_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse build() {
      com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse buildPartial() {
      com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse result = new com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse other) {
      if (other == com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse.getDefaultInstance()) return this;
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
              input.readMessage(
                  getConnectionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.scalekit.grpc.scalekit.v1.connections.Connection connection_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.connections.Connection, com.scalekit.grpc.scalekit.v1.connections.Connection.Builder, com.scalekit.grpc.scalekit.v1.connections.ConnectionOrBuilder> connectionBuilder_;
    /**
     * <code>.scalekit.v1.connections.Connection connection = 1 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the connection field is set.
     */
    public boolean hasConnection() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.scalekit.v1.connections.Connection connection = 1 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The connection.
     */
    public com.scalekit.grpc.scalekit.v1.connections.Connection getConnection() {
      if (connectionBuilder_ == null) {
        return connection_ == null ? com.scalekit.grpc.scalekit.v1.connections.Connection.getDefaultInstance() : connection_;
      } else {
        return connectionBuilder_.getMessage();
      }
    }
    /**
     * <code>.scalekit.v1.connections.Connection connection = 1 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setConnection(com.scalekit.grpc.scalekit.v1.connections.Connection value) {
      if (connectionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        connection_ = value;
      } else {
        connectionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.connections.Connection connection = 1 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setConnection(
        com.scalekit.grpc.scalekit.v1.connections.Connection.Builder builderForValue) {
      if (connectionBuilder_ == null) {
        connection_ = builderForValue.build();
      } else {
        connectionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.connections.Connection connection = 1 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder mergeConnection(com.scalekit.grpc.scalekit.v1.connections.Connection value) {
      if (connectionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          connection_ != null &&
          connection_ != com.scalekit.grpc.scalekit.v1.connections.Connection.getDefaultInstance()) {
          getConnectionBuilder().mergeFrom(value);
        } else {
          connection_ = value;
        }
      } else {
        connectionBuilder_.mergeFrom(value);
      }
      if (connection_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.scalekit.v1.connections.Connection connection = 1 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder clearConnection() {
      bitField0_ = (bitField0_ & ~0x00000001);
      connection_ = null;
      if (connectionBuilder_ != null) {
        connectionBuilder_.dispose();
        connectionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.connections.Connection connection = 1 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.connections.Connection.Builder getConnectionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getConnectionFieldBuilder().getBuilder();
    }
    /**
     * <code>.scalekit.v1.connections.Connection connection = 1 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.connections.ConnectionOrBuilder getConnectionOrBuilder() {
      if (connectionBuilder_ != null) {
        return connectionBuilder_.getMessageOrBuilder();
      } else {
        return connection_ == null ?
            com.scalekit.grpc.scalekit.v1.connections.Connection.getDefaultInstance() : connection_;
      }
    }
    /**
     * <code>.scalekit.v1.connections.Connection connection = 1 [json_name = "connection", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.connections.Connection, com.scalekit.grpc.scalekit.v1.connections.Connection.Builder, com.scalekit.grpc.scalekit.v1.connections.ConnectionOrBuilder> 
        getConnectionFieldBuilder() {
      if (connectionBuilder_ == null) {
        connectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.connections.Connection, com.scalekit.grpc.scalekit.v1.connections.Connection.Builder, com.scalekit.grpc.scalekit.v1.connections.ConnectionOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.connections.GetConnectionResponse)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.connections.GetConnectionResponse)
  private static final com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse();
  }

  public static com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetConnectionResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetConnectionResponse>() {
    @java.lang.Override
    public GetConnectionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetConnectionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetConnectionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

