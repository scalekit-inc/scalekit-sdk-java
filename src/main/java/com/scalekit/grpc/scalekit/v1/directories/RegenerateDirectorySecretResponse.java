// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/directories/directories.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.directories;

/**
 * Protobuf type {@code scalekit.v1.directories.RegenerateDirectorySecretResponse}
 */
public final class RegenerateDirectorySecretResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.directories.RegenerateDirectorySecretResponse)
    RegenerateDirectorySecretResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegenerateDirectorySecretResponse.newBuilder() to construct.
  private RegenerateDirectorySecretResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegenerateDirectorySecretResponse() {
    plainSecret_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegenerateDirectorySecretResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_RegenerateDirectorySecretResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_RegenerateDirectorySecretResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse.class, com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse.Builder.class);
  }

  private int bitField0_;
  public static final int PLAIN_SECRET_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object plainSecret_ = "";
  /**
   * <code>string plain_secret = 1 [json_name = "plainSecret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The plainSecret.
   */
  @java.lang.Override
  public java.lang.String getPlainSecret() {
    java.lang.Object ref = plainSecret_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      plainSecret_ = s;
      return s;
    }
  }
  /**
   * <code>string plain_secret = 1 [json_name = "plainSecret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for plainSecret.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlainSecretBytes() {
    java.lang.Object ref = plainSecret_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      plainSecret_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECRET_FIELD_NUMBER = 2;
  private com.scalekit.grpc.scalekit.v1.directories.Secret secret_;
  /**
   * <code>.scalekit.v1.directories.Secret secret = 2 [json_name = "secret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the secret field is set.
   */
  @java.lang.Override
  public boolean hasSecret() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.scalekit.v1.directories.Secret secret = 2 [json_name = "secret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The secret.
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.directories.Secret getSecret() {
    return secret_ == null ? com.scalekit.grpc.scalekit.v1.directories.Secret.getDefaultInstance() : secret_;
  }
  /**
   * <code>.scalekit.v1.directories.Secret secret = 2 [json_name = "secret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.directories.SecretOrBuilder getSecretOrBuilder() {
    return secret_ == null ? com.scalekit.grpc.scalekit.v1.directories.Secret.getDefaultInstance() : secret_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(plainSecret_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, plainSecret_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getSecret());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(plainSecret_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, plainSecret_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSecret());
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse other = (com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse) obj;

    if (!getPlainSecret()
        .equals(other.getPlainSecret())) return false;
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
    hash = (37 * hash) + PLAIN_SECRET_FIELD_NUMBER;
    hash = (53 * hash) + getPlainSecret().hashCode();
    if (hasSecret()) {
      hash = (37 * hash) + SECRET_FIELD_NUMBER;
      hash = (53 * hash) + getSecret().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse prototype) {
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
   * Protobuf type {@code scalekit.v1.directories.RegenerateDirectorySecretResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.directories.RegenerateDirectorySecretResponse)
      com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_RegenerateDirectorySecretResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_RegenerateDirectorySecretResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse.class, com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse.newBuilder()
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
        getSecretFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      plainSecret_ = "";
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
      return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_RegenerateDirectorySecretResponse_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse build() {
      com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse buildPartial() {
      com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse result = new com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.plainSecret_ = plainSecret_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.secret_ = secretBuilder_ == null
            ? secret_
            : secretBuilder_.build();
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse other) {
      if (other == com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse.getDefaultInstance()) return this;
      if (!other.getPlainSecret().isEmpty()) {
        plainSecret_ = other.plainSecret_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
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
              plainSecret_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSecretFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object plainSecret_ = "";
    /**
     * <code>string plain_secret = 1 [json_name = "plainSecret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The plainSecret.
     */
    public java.lang.String getPlainSecret() {
      java.lang.Object ref = plainSecret_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        plainSecret_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string plain_secret = 1 [json_name = "plainSecret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The bytes for plainSecret.
     */
    public com.google.protobuf.ByteString
        getPlainSecretBytes() {
      java.lang.Object ref = plainSecret_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        plainSecret_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string plain_secret = 1 [json_name = "plainSecret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The plainSecret to set.
     * @return This builder for chaining.
     */
    public Builder setPlainSecret(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      plainSecret_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string plain_secret = 1 [json_name = "plainSecret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearPlainSecret() {
      plainSecret_ = getDefaultInstance().getPlainSecret();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string plain_secret = 1 [json_name = "plainSecret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for plainSecret to set.
     * @return This builder for chaining.
     */
    public Builder setPlainSecretBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      plainSecret_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.scalekit.grpc.scalekit.v1.directories.Secret secret_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.directories.Secret, com.scalekit.grpc.scalekit.v1.directories.Secret.Builder, com.scalekit.grpc.scalekit.v1.directories.SecretOrBuilder> secretBuilder_;
    /**
     * <code>.scalekit.v1.directories.Secret secret = 2 [json_name = "secret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the secret field is set.
     */
    public boolean hasSecret() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.scalekit.v1.directories.Secret secret = 2 [json_name = "secret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The secret.
     */
    public com.scalekit.grpc.scalekit.v1.directories.Secret getSecret() {
      if (secretBuilder_ == null) {
        return secret_ == null ? com.scalekit.grpc.scalekit.v1.directories.Secret.getDefaultInstance() : secret_;
      } else {
        return secretBuilder_.getMessage();
      }
    }
    /**
     * <code>.scalekit.v1.directories.Secret secret = 2 [json_name = "secret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setSecret(com.scalekit.grpc.scalekit.v1.directories.Secret value) {
      if (secretBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        secret_ = value;
      } else {
        secretBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.directories.Secret secret = 2 [json_name = "secret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setSecret(
        com.scalekit.grpc.scalekit.v1.directories.Secret.Builder builderForValue) {
      if (secretBuilder_ == null) {
        secret_ = builderForValue.build();
      } else {
        secretBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.directories.Secret secret = 2 [json_name = "secret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder mergeSecret(com.scalekit.grpc.scalekit.v1.directories.Secret value) {
      if (secretBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          secret_ != null &&
          secret_ != com.scalekit.grpc.scalekit.v1.directories.Secret.getDefaultInstance()) {
          getSecretBuilder().mergeFrom(value);
        } else {
          secret_ = value;
        }
      } else {
        secretBuilder_.mergeFrom(value);
      }
      if (secret_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.scalekit.v1.directories.Secret secret = 2 [json_name = "secret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder clearSecret() {
      bitField0_ = (bitField0_ & ~0x00000002);
      secret_ = null;
      if (secretBuilder_ != null) {
        secretBuilder_.dispose();
        secretBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.directories.Secret secret = 2 [json_name = "secret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.directories.Secret.Builder getSecretBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSecretFieldBuilder().getBuilder();
    }
    /**
     * <code>.scalekit.v1.directories.Secret secret = 2 [json_name = "secret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.directories.SecretOrBuilder getSecretOrBuilder() {
      if (secretBuilder_ != null) {
        return secretBuilder_.getMessageOrBuilder();
      } else {
        return secret_ == null ?
            com.scalekit.grpc.scalekit.v1.directories.Secret.getDefaultInstance() : secret_;
      }
    }
    /**
     * <code>.scalekit.v1.directories.Secret secret = 2 [json_name = "secret", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.directories.Secret, com.scalekit.grpc.scalekit.v1.directories.Secret.Builder, com.scalekit.grpc.scalekit.v1.directories.SecretOrBuilder> 
        getSecretFieldBuilder() {
      if (secretBuilder_ == null) {
        secretBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.directories.Secret, com.scalekit.grpc.scalekit.v1.directories.Secret.Builder, com.scalekit.grpc.scalekit.v1.directories.SecretOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.directories.RegenerateDirectorySecretResponse)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.directories.RegenerateDirectorySecretResponse)
  private static final com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse();
  }

  public static com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegenerateDirectorySecretResponse>
      PARSER = new com.google.protobuf.AbstractParser<RegenerateDirectorySecretResponse>() {
    @java.lang.Override
    public RegenerateDirectorySecretResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RegenerateDirectorySecretResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegenerateDirectorySecretResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

