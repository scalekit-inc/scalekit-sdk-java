// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/connections/connections.proto

package com.scalekit.grpc.scalekit.v1.connections;

/**
 * Protobuf type {@code scalekit.v1.connections.ListConnectionsResponse}
 */
public final class ListConnectionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.connections.ListConnectionsResponse)
    ListConnectionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListConnectionsResponse.newBuilder() to construct.
  private ListConnectionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListConnectionsResponse() {
    connections_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListConnectionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_ListConnectionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_ListConnectionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse.class, com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse.Builder.class);
  }

  public static final int CONNECTIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.scalekit.grpc.scalekit.v1.connections.ListConnection> connections_;
  /**
   * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
   */
  @java.lang.Override
  public java.util.List<com.scalekit.grpc.scalekit.v1.connections.ListConnection> getConnectionsList() {
    return connections_;
  }
  /**
   * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.scalekit.grpc.scalekit.v1.connections.ListConnectionOrBuilder> 
      getConnectionsOrBuilderList() {
    return connections_;
  }
  /**
   * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
   */
  @java.lang.Override
  public int getConnectionsCount() {
    return connections_.size();
  }
  /**
   * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.connections.ListConnection getConnections(int index) {
    return connections_.get(index);
  }
  /**
   * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.connections.ListConnectionOrBuilder getConnectionsOrBuilder(
      int index) {
    return connections_.get(index);
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
    for (int i = 0; i < connections_.size(); i++) {
      output.writeMessage(1, connections_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < connections_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, connections_.get(i));
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse other = (com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse) obj;

    if (!getConnectionsList()
        .equals(other.getConnectionsList())) return false;
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
    if (getConnectionsCount() > 0) {
      hash = (37 * hash) + CONNECTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getConnectionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse prototype) {
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
   * Protobuf type {@code scalekit.v1.connections.ListConnectionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.connections.ListConnectionsResponse)
      com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_ListConnectionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_ListConnectionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse.class, com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (connectionsBuilder_ == null) {
        connections_ = java.util.Collections.emptyList();
      } else {
        connections_ = null;
        connectionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_ListConnectionsResponse_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse build() {
      com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse buildPartial() {
      com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse result = new com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse result) {
      if (connectionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          connections_ = java.util.Collections.unmodifiableList(connections_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.connections_ = connections_;
      } else {
        result.connections_ = connectionsBuilder_.build();
      }
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse other) {
      if (other == com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse.getDefaultInstance()) return this;
      if (connectionsBuilder_ == null) {
        if (!other.connections_.isEmpty()) {
          if (connections_.isEmpty()) {
            connections_ = other.connections_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConnectionsIsMutable();
            connections_.addAll(other.connections_);
          }
          onChanged();
        }
      } else {
        if (!other.connections_.isEmpty()) {
          if (connectionsBuilder_.isEmpty()) {
            connectionsBuilder_.dispose();
            connectionsBuilder_ = null;
            connections_ = other.connections_;
            bitField0_ = (bitField0_ & ~0x00000001);
            connectionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getConnectionsFieldBuilder() : null;
          } else {
            connectionsBuilder_.addAllMessages(other.connections_);
          }
        }
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
              com.scalekit.grpc.scalekit.v1.connections.ListConnection m =
                  input.readMessage(
                      com.scalekit.grpc.scalekit.v1.connections.ListConnection.parser(),
                      extensionRegistry);
              if (connectionsBuilder_ == null) {
                ensureConnectionsIsMutable();
                connections_.add(m);
              } else {
                connectionsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.scalekit.grpc.scalekit.v1.connections.ListConnection> connections_ =
      java.util.Collections.emptyList();
    private void ensureConnectionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        connections_ = new java.util.ArrayList<com.scalekit.grpc.scalekit.v1.connections.ListConnection>(connections_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.connections.ListConnection, com.scalekit.grpc.scalekit.v1.connections.ListConnection.Builder, com.scalekit.grpc.scalekit.v1.connections.ListConnectionOrBuilder> connectionsBuilder_;

    /**
     * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
     */
    public java.util.List<com.scalekit.grpc.scalekit.v1.connections.ListConnection> getConnectionsList() {
      if (connectionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(connections_);
      } else {
        return connectionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
     */
    public int getConnectionsCount() {
      if (connectionsBuilder_ == null) {
        return connections_.size();
      } else {
        return connectionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.connections.ListConnection getConnections(int index) {
      if (connectionsBuilder_ == null) {
        return connections_.get(index);
      } else {
        return connectionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
     */
    public Builder setConnections(
        int index, com.scalekit.grpc.scalekit.v1.connections.ListConnection value) {
      if (connectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConnectionsIsMutable();
        connections_.set(index, value);
        onChanged();
      } else {
        connectionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
     */
    public Builder setConnections(
        int index, com.scalekit.grpc.scalekit.v1.connections.ListConnection.Builder builderForValue) {
      if (connectionsBuilder_ == null) {
        ensureConnectionsIsMutable();
        connections_.set(index, builderForValue.build());
        onChanged();
      } else {
        connectionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
     */
    public Builder addConnections(com.scalekit.grpc.scalekit.v1.connections.ListConnection value) {
      if (connectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConnectionsIsMutable();
        connections_.add(value);
        onChanged();
      } else {
        connectionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
     */
    public Builder addConnections(
        int index, com.scalekit.grpc.scalekit.v1.connections.ListConnection value) {
      if (connectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConnectionsIsMutable();
        connections_.add(index, value);
        onChanged();
      } else {
        connectionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
     */
    public Builder addConnections(
        com.scalekit.grpc.scalekit.v1.connections.ListConnection.Builder builderForValue) {
      if (connectionsBuilder_ == null) {
        ensureConnectionsIsMutable();
        connections_.add(builderForValue.build());
        onChanged();
      } else {
        connectionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
     */
    public Builder addConnections(
        int index, com.scalekit.grpc.scalekit.v1.connections.ListConnection.Builder builderForValue) {
      if (connectionsBuilder_ == null) {
        ensureConnectionsIsMutable();
        connections_.add(index, builderForValue.build());
        onChanged();
      } else {
        connectionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
     */
    public Builder addAllConnections(
        java.lang.Iterable<? extends com.scalekit.grpc.scalekit.v1.connections.ListConnection> values) {
      if (connectionsBuilder_ == null) {
        ensureConnectionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, connections_);
        onChanged();
      } else {
        connectionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
     */
    public Builder clearConnections() {
      if (connectionsBuilder_ == null) {
        connections_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        connectionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
     */
    public Builder removeConnections(int index) {
      if (connectionsBuilder_ == null) {
        ensureConnectionsIsMutable();
        connections_.remove(index);
        onChanged();
      } else {
        connectionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.connections.ListConnection.Builder getConnectionsBuilder(
        int index) {
      return getConnectionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.connections.ListConnectionOrBuilder getConnectionsOrBuilder(
        int index) {
      if (connectionsBuilder_ == null) {
        return connections_.get(index);  } else {
        return connectionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
     */
    public java.util.List<? extends com.scalekit.grpc.scalekit.v1.connections.ListConnectionOrBuilder> 
         getConnectionsOrBuilderList() {
      if (connectionsBuilder_ != null) {
        return connectionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(connections_);
      }
    }
    /**
     * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.connections.ListConnection.Builder addConnectionsBuilder() {
      return getConnectionsFieldBuilder().addBuilder(
          com.scalekit.grpc.scalekit.v1.connections.ListConnection.getDefaultInstance());
    }
    /**
     * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.connections.ListConnection.Builder addConnectionsBuilder(
        int index) {
      return getConnectionsFieldBuilder().addBuilder(
          index, com.scalekit.grpc.scalekit.v1.connections.ListConnection.getDefaultInstance());
    }
    /**
     * <code>repeated .scalekit.v1.connections.ListConnection connections = 1 [json_name = "connections"];</code>
     */
    public java.util.List<com.scalekit.grpc.scalekit.v1.connections.ListConnection.Builder> 
         getConnectionsBuilderList() {
      return getConnectionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.connections.ListConnection, com.scalekit.grpc.scalekit.v1.connections.ListConnection.Builder, com.scalekit.grpc.scalekit.v1.connections.ListConnectionOrBuilder> 
        getConnectionsFieldBuilder() {
      if (connectionsBuilder_ == null) {
        connectionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.connections.ListConnection, com.scalekit.grpc.scalekit.v1.connections.ListConnection.Builder, com.scalekit.grpc.scalekit.v1.connections.ListConnectionOrBuilder>(
                connections_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        connections_ = null;
      }
      return connectionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.connections.ListConnectionsResponse)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.connections.ListConnectionsResponse)
  private static final com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse();
  }

  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListConnectionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListConnectionsResponse>() {
    @java.lang.Override
    public ListConnectionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListConnectionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListConnectionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

