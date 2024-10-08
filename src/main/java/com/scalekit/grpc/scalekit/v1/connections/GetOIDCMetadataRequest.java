// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/connections/connections.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.connections;

/**
 * Protobuf type {@code scalekit.v1.connections.GetOIDCMetadataRequest}
 */
public final class GetOIDCMetadataRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.connections.GetOIDCMetadataRequest)
    GetOIDCMetadataRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetOIDCMetadataRequest.newBuilder() to construct.
  private GetOIDCMetadataRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetOIDCMetadataRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetOIDCMetadataRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_GetOIDCMetadataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_GetOIDCMetadataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest.class, com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest.Builder.class);
  }

  private int bitField0_;
  public static final int METADATA_FIELD_NUMBER = 1;
  private com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequest metadata_;
  /**
   * <code>.scalekit.v1.connections.OIDCMetadataRequest metadata = 1 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.scalekit.v1.connections.OIDCMetadataRequest metadata = 1 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequest getMetadata() {
    return metadata_ == null ? com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequest.getDefaultInstance() : metadata_;
  }
  /**
   * <code>.scalekit.v1.connections.OIDCMetadataRequest metadata = 1 [json_name = "metadata"];</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequestOrBuilder getMetadataOrBuilder() {
    return metadata_ == null ? com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequest.getDefaultInstance() : metadata_;
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
      output.writeMessage(1, getMetadata());
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
        .computeMessageSize(1, getMetadata());
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest other = (com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest) obj;

    if (hasMetadata() != other.hasMetadata()) return false;
    if (hasMetadata()) {
      if (!getMetadata()
          .equals(other.getMetadata())) return false;
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
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest prototype) {
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
   * Protobuf type {@code scalekit.v1.connections.GetOIDCMetadataRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.connections.GetOIDCMetadataRequest)
      com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_GetOIDCMetadataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_GetOIDCMetadataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest.class, com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest.newBuilder()
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
        getMetadataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_GetOIDCMetadataRequest_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest build() {
      com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest buildPartial() {
      com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest result = new com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.metadata_ = metadataBuilder_ == null
            ? metadata_
            : metadataBuilder_.build();
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest other) {
      if (other == com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest.getDefaultInstance()) return this;
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
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
                  getMetadataFieldBuilder().getBuilder(),
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

    private com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequest metadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequest, com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequest.Builder, com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequestOrBuilder> metadataBuilder_;
    /**
     * <code>.scalekit.v1.connections.OIDCMetadataRequest metadata = 1 [json_name = "metadata"];</code>
     * @return Whether the metadata field is set.
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.scalekit.v1.connections.OIDCMetadataRequest metadata = 1 [json_name = "metadata"];</code>
     * @return The metadata.
     */
    public com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequest getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null ? com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequest.getDefaultInstance() : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     * <code>.scalekit.v1.connections.OIDCMetadataRequest metadata = 1 [json_name = "metadata"];</code>
     */
    public Builder setMetadata(com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequest value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
      } else {
        metadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.connections.OIDCMetadataRequest metadata = 1 [json_name = "metadata"];</code>
     */
    public Builder setMetadata(
        com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequest.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.connections.OIDCMetadataRequest metadata = 1 [json_name = "metadata"];</code>
     */
    public Builder mergeMetadata(com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequest value) {
      if (metadataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          metadata_ != null &&
          metadata_ != com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequest.getDefaultInstance()) {
          getMetadataBuilder().mergeFrom(value);
        } else {
          metadata_ = value;
        }
      } else {
        metadataBuilder_.mergeFrom(value);
      }
      if (metadata_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.scalekit.v1.connections.OIDCMetadataRequest metadata = 1 [json_name = "metadata"];</code>
     */
    public Builder clearMetadata() {
      bitField0_ = (bitField0_ & ~0x00000001);
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.connections.OIDCMetadataRequest metadata = 1 [json_name = "metadata"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequest.Builder getMetadataBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <code>.scalekit.v1.connections.OIDCMetadataRequest metadata = 1 [json_name = "metadata"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequestOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null ?
            com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequest.getDefaultInstance() : metadata_;
      }
    }
    /**
     * <code>.scalekit.v1.connections.OIDCMetadataRequest metadata = 1 [json_name = "metadata"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequest, com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequest.Builder, com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequestOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequest, com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequest.Builder, com.scalekit.grpc.scalekit.v1.connections.OIDCMetadataRequestOrBuilder>(
                getMetadata(),
                getParentForChildren(),
                isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.connections.GetOIDCMetadataRequest)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.connections.GetOIDCMetadataRequest)
  private static final com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest();
  }

  public static com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetOIDCMetadataRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetOIDCMetadataRequest>() {
    @java.lang.Override
    public GetOIDCMetadataRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetOIDCMetadataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetOIDCMetadataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.connections.GetOIDCMetadataRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

