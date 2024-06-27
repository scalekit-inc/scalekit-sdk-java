// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/clients/clients.proto

package com.scalekit.grpc.scalekit.v1.clients;

/**
 * Protobuf type {@code scalekit.v1.clients.UpdateClientSecretResponse}
 */
public final class UpdateClientSecretResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.clients.UpdateClientSecretResponse)
    UpdateClientSecretResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateClientSecretResponse.newBuilder() to construct.
  private UpdateClientSecretResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateClientSecretResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateClientSecretResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.clients.ClientsProto.internal_static_scalekit_v1_clients_UpdateClientSecretResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.clients.ClientsProto.internal_static_scalekit_v1_clients_UpdateClientSecretResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse.class, com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse.Builder.class);
  }

  public static final int SECRET_FIELD_NUMBER = 1;
  private com.scalekit.grpc.scalekit.v1.clients.ClientSecret secret_;
  /**
   * <code>.scalekit.v1.clients.ClientSecret secret = 1 [json_name = "secret"];</code>
   * @return Whether the secret field is set.
   */
  @java.lang.Override
  public boolean hasSecret() {
    return secret_ != null;
  }
  /**
   * <code>.scalekit.v1.clients.ClientSecret secret = 1 [json_name = "secret"];</code>
   * @return The secret.
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.clients.ClientSecret getSecret() {
    return secret_ == null ? com.scalekit.grpc.scalekit.v1.clients.ClientSecret.getDefaultInstance() : secret_;
  }
  /**
   * <code>.scalekit.v1.clients.ClientSecret secret = 1 [json_name = "secret"];</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.clients.ClientSecretOrBuilder getSecretOrBuilder() {
    return secret_ == null ? com.scalekit.grpc.scalekit.v1.clients.ClientSecret.getDefaultInstance() : secret_;
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
    if (secret_ != null) {
      output.writeMessage(1, getSecret());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (secret_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSecret());
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse other = (com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse) obj;

    if (hasSecret() != other.hasSecret()) return false;
    if (hasSecret()) {
      if (!getSecret()
          .equals(other.getSecret())) return false;
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
    if (hasSecret()) {
      hash = (37 * hash) + SECRET_FIELD_NUMBER;
      hash = (53 * hash) + getSecret().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse prototype) {
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
   * Protobuf type {@code scalekit.v1.clients.UpdateClientSecretResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.clients.UpdateClientSecretResponse)
      com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.clients.ClientsProto.internal_static_scalekit_v1_clients_UpdateClientSecretResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.clients.ClientsProto.internal_static_scalekit_v1_clients_UpdateClientSecretResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse.class, com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse.newBuilder()
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
      secret_ = null;
      if (secretBuilder_ != null) {
        secretBuilder_.dispose();
        secretBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.clients.ClientsProto.internal_static_scalekit_v1_clients_UpdateClientSecretResponse_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse build() {
      com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse buildPartial() {
      com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse result = new com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.secret_ = secretBuilder_ == null
            ? secret_
            : secretBuilder_.build();
      }
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse other) {
      if (other == com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse.getDefaultInstance()) return this;
      if (other.hasSecret()) {
        mergeSecret(other.getSecret());
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
                  getSecretFieldBuilder().getBuilder(),
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

    private com.scalekit.grpc.scalekit.v1.clients.ClientSecret secret_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.clients.ClientSecret, com.scalekit.grpc.scalekit.v1.clients.ClientSecret.Builder, com.scalekit.grpc.scalekit.v1.clients.ClientSecretOrBuilder> secretBuilder_;
    /**
     * <code>.scalekit.v1.clients.ClientSecret secret = 1 [json_name = "secret"];</code>
     * @return Whether the secret field is set.
     */
    public boolean hasSecret() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.scalekit.v1.clients.ClientSecret secret = 1 [json_name = "secret"];</code>
     * @return The secret.
     */
    public com.scalekit.grpc.scalekit.v1.clients.ClientSecret getSecret() {
      if (secretBuilder_ == null) {
        return secret_ == null ? com.scalekit.grpc.scalekit.v1.clients.ClientSecret.getDefaultInstance() : secret_;
      } else {
        return secretBuilder_.getMessage();
      }
    }
    /**
     * <code>.scalekit.v1.clients.ClientSecret secret = 1 [json_name = "secret"];</code>
     */
    public Builder setSecret(com.scalekit.grpc.scalekit.v1.clients.ClientSecret value) {
      if (secretBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        secret_ = value;
      } else {
        secretBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.clients.ClientSecret secret = 1 [json_name = "secret"];</code>
     */
    public Builder setSecret(
        com.scalekit.grpc.scalekit.v1.clients.ClientSecret.Builder builderForValue) {
      if (secretBuilder_ == null) {
        secret_ = builderForValue.build();
      } else {
        secretBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.clients.ClientSecret secret = 1 [json_name = "secret"];</code>
     */
    public Builder mergeSecret(com.scalekit.grpc.scalekit.v1.clients.ClientSecret value) {
      if (secretBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          secret_ != null &&
          secret_ != com.scalekit.grpc.scalekit.v1.clients.ClientSecret.getDefaultInstance()) {
          getSecretBuilder().mergeFrom(value);
        } else {
          secret_ = value;
        }
      } else {
        secretBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.clients.ClientSecret secret = 1 [json_name = "secret"];</code>
     */
    public Builder clearSecret() {
      bitField0_ = (bitField0_ & ~0x00000001);
      secret_ = null;
      if (secretBuilder_ != null) {
        secretBuilder_.dispose();
        secretBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.clients.ClientSecret secret = 1 [json_name = "secret"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.clients.ClientSecret.Builder getSecretBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSecretFieldBuilder().getBuilder();
    }
    /**
     * <code>.scalekit.v1.clients.ClientSecret secret = 1 [json_name = "secret"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.clients.ClientSecretOrBuilder getSecretOrBuilder() {
      if (secretBuilder_ != null) {
        return secretBuilder_.getMessageOrBuilder();
      } else {
        return secret_ == null ?
            com.scalekit.grpc.scalekit.v1.clients.ClientSecret.getDefaultInstance() : secret_;
      }
    }
    /**
     * <code>.scalekit.v1.clients.ClientSecret secret = 1 [json_name = "secret"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.clients.ClientSecret, com.scalekit.grpc.scalekit.v1.clients.ClientSecret.Builder, com.scalekit.grpc.scalekit.v1.clients.ClientSecretOrBuilder> 
        getSecretFieldBuilder() {
      if (secretBuilder_ == null) {
        secretBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.clients.ClientSecret, com.scalekit.grpc.scalekit.v1.clients.ClientSecret.Builder, com.scalekit.grpc.scalekit.v1.clients.ClientSecretOrBuilder>(
                getSecret(),
                getParentForChildren(),
                isClean());
        secret_ = null;
      }
      return secretBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.clients.UpdateClientSecretResponse)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.clients.UpdateClientSecretResponse)
  private static final com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse();
  }

  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateClientSecretResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateClientSecretResponse>() {
    @java.lang.Override
    public UpdateClientSecretResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateClientSecretResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateClientSecretResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
