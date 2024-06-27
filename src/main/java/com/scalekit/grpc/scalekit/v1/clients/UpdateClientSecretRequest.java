// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/clients/clients.proto

package com.scalekit.grpc.scalekit.v1.clients;

/**
 * Protobuf type {@code scalekit.v1.clients.UpdateClientSecretRequest}
 */
public final class UpdateClientSecretRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.clients.UpdateClientSecretRequest)
    UpdateClientSecretRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateClientSecretRequest.newBuilder() to construct.
  private UpdateClientSecretRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateClientSecretRequest() {
    clientId_ = "";
    secretId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateClientSecretRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.clients.ClientsProto.internal_static_scalekit_v1_clients_UpdateClientSecretRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.clients.ClientsProto.internal_static_scalekit_v1_clients_UpdateClientSecretRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest.class, com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest.Builder.class);
  }

  public static final int CLIENT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clientId_ = "";
  /**
   * <code>string client_id = 1 [json_name = "clientId", (.buf.validate.field) = { ... }</code>
   * @return The clientId.
   */
  @java.lang.Override
  public java.lang.String getClientId() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientId_ = s;
      return s;
    }
  }
  /**
   * <code>string client_id = 1 [json_name = "clientId", (.buf.validate.field) = { ... }</code>
   * @return The bytes for clientId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientIdBytes() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECRET_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object secretId_ = "";
  /**
   * <code>string secret_id = 2 [json_name = "secretId", (.buf.validate.field) = { ... }</code>
   * @return The secretId.
   */
  @java.lang.Override
  public java.lang.String getSecretId() {
    java.lang.Object ref = secretId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      secretId_ = s;
      return s;
    }
  }
  /**
   * <code>string secret_id = 2 [json_name = "secretId", (.buf.validate.field) = { ... }</code>
   * @return The bytes for secretId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSecretIdBytes() {
    java.lang.Object ref = secretId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      secretId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECRET_FIELD_NUMBER = 3;
  private com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecret secret_;
  /**
   * <code>.scalekit.v1.clients.UpdateClientSecret secret = 3 [json_name = "secret", (.buf.validate.field) = { ... }</code>
   * @return Whether the secret field is set.
   */
  @java.lang.Override
  public boolean hasSecret() {
    return secret_ != null;
  }
  /**
   * <code>.scalekit.v1.clients.UpdateClientSecret secret = 3 [json_name = "secret", (.buf.validate.field) = { ... }</code>
   * @return The secret.
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecret getSecret() {
    return secret_ == null ? com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecret.getDefaultInstance() : secret_;
  }
  /**
   * <code>.scalekit.v1.clients.UpdateClientSecret secret = 3 [json_name = "secret", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretOrBuilder getSecretOrBuilder() {
    return secret_ == null ? com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecret.getDefaultInstance() : secret_;
  }

  public static final int MASK_FIELD_NUMBER = 4;
  private com.google.protobuf.FieldMask mask_;
  /**
   * <code>.google.protobuf.FieldMask mask = 4 [json_name = "mask"];</code>
   * @return Whether the mask field is set.
   */
  @java.lang.Override
  public boolean hasMask() {
    return mask_ != null;
  }
  /**
   * <code>.google.protobuf.FieldMask mask = 4 [json_name = "mask"];</code>
   * @return The mask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getMask() {
    return mask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : mask_;
  }
  /**
   * <code>.google.protobuf.FieldMask mask = 4 [json_name = "mask"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getMaskOrBuilder() {
    return mask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : mask_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clientId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secretId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, secretId_);
    }
    if (secret_ != null) {
      output.writeMessage(3, getSecret());
    }
    if (mask_ != null) {
      output.writeMessage(4, getMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secretId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, secretId_);
    }
    if (secret_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSecret());
    }
    if (mask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getMask());
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest other = (com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest) obj;

    if (!getClientId()
        .equals(other.getClientId())) return false;
    if (!getSecretId()
        .equals(other.getSecretId())) return false;
    if (hasSecret() != other.hasSecret()) return false;
    if (hasSecret()) {
      if (!getSecret()
          .equals(other.getSecret())) return false;
    }
    if (hasMask() != other.hasMask()) return false;
    if (hasMask()) {
      if (!getMask()
          .equals(other.getMask())) return false;
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
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    hash = (37 * hash) + SECRET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSecretId().hashCode();
    if (hasSecret()) {
      hash = (37 * hash) + SECRET_FIELD_NUMBER;
      hash = (53 * hash) + getSecret().hashCode();
    }
    if (hasMask()) {
      hash = (37 * hash) + MASK_FIELD_NUMBER;
      hash = (53 * hash) + getMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest prototype) {
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
   * Protobuf type {@code scalekit.v1.clients.UpdateClientSecretRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.clients.UpdateClientSecretRequest)
      com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.clients.ClientsProto.internal_static_scalekit_v1_clients_UpdateClientSecretRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.clients.ClientsProto.internal_static_scalekit_v1_clients_UpdateClientSecretRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest.class, com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest.newBuilder()
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
      clientId_ = "";
      secretId_ = "";
      secret_ = null;
      if (secretBuilder_ != null) {
        secretBuilder_.dispose();
        secretBuilder_ = null;
      }
      mask_ = null;
      if (maskBuilder_ != null) {
        maskBuilder_.dispose();
        maskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.clients.ClientsProto.internal_static_scalekit_v1_clients_UpdateClientSecretRequest_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest build() {
      com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest buildPartial() {
      com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest result = new com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clientId_ = clientId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.secretId_ = secretId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.secret_ = secretBuilder_ == null
            ? secret_
            : secretBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.mask_ = maskBuilder_ == null
            ? mask_
            : maskBuilder_.build();
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest other) {
      if (other == com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest.getDefaultInstance()) return this;
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSecretId().isEmpty()) {
        secretId_ = other.secretId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasSecret()) {
        mergeSecret(other.getSecret());
      }
      if (other.hasMask()) {
        mergeMask(other.getMask());
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
              clientId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              secretId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getSecretFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object clientId_ = "";
    /**
     * <code>string client_id = 1 [json_name = "clientId", (.buf.validate.field) = { ... }</code>
     * @return The clientId.
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string client_id = 1 [json_name = "clientId", (.buf.validate.field) = { ... }</code>
     * @return The bytes for clientId.
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string client_id = 1 [json_name = "clientId", (.buf.validate.field) = { ... }</code>
     * @param value The clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      clientId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string client_id = 1 [json_name = "clientId", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearClientId() {
      clientId_ = getDefaultInstance().getClientId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string client_id = 1 [json_name = "clientId", (.buf.validate.field) = { ... }</code>
     * @param value The bytes for clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clientId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object secretId_ = "";
    /**
     * <code>string secret_id = 2 [json_name = "secretId", (.buf.validate.field) = { ... }</code>
     * @return The secretId.
     */
    public java.lang.String getSecretId() {
      java.lang.Object ref = secretId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        secretId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string secret_id = 2 [json_name = "secretId", (.buf.validate.field) = { ... }</code>
     * @return The bytes for secretId.
     */
    public com.google.protobuf.ByteString
        getSecretIdBytes() {
      java.lang.Object ref = secretId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        secretId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string secret_id = 2 [json_name = "secretId", (.buf.validate.field) = { ... }</code>
     * @param value The secretId to set.
     * @return This builder for chaining.
     */
    public Builder setSecretId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      secretId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string secret_id = 2 [json_name = "secretId", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearSecretId() {
      secretId_ = getDefaultInstance().getSecretId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string secret_id = 2 [json_name = "secretId", (.buf.validate.field) = { ... }</code>
     * @param value The bytes for secretId to set.
     * @return This builder for chaining.
     */
    public Builder setSecretIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      secretId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecret secret_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecret, com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecret.Builder, com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretOrBuilder> secretBuilder_;
    /**
     * <code>.scalekit.v1.clients.UpdateClientSecret secret = 3 [json_name = "secret", (.buf.validate.field) = { ... }</code>
     * @return Whether the secret field is set.
     */
    public boolean hasSecret() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.scalekit.v1.clients.UpdateClientSecret secret = 3 [json_name = "secret", (.buf.validate.field) = { ... }</code>
     * @return The secret.
     */
    public com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecret getSecret() {
      if (secretBuilder_ == null) {
        return secret_ == null ? com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecret.getDefaultInstance() : secret_;
      } else {
        return secretBuilder_.getMessage();
      }
    }
    /**
     * <code>.scalekit.v1.clients.UpdateClientSecret secret = 3 [json_name = "secret", (.buf.validate.field) = { ... }</code>
     */
    public Builder setSecret(com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecret value) {
      if (secretBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        secret_ = value;
      } else {
        secretBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.clients.UpdateClientSecret secret = 3 [json_name = "secret", (.buf.validate.field) = { ... }</code>
     */
    public Builder setSecret(
        com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecret.Builder builderForValue) {
      if (secretBuilder_ == null) {
        secret_ = builderForValue.build();
      } else {
        secretBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.clients.UpdateClientSecret secret = 3 [json_name = "secret", (.buf.validate.field) = { ... }</code>
     */
    public Builder mergeSecret(com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecret value) {
      if (secretBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          secret_ != null &&
          secret_ != com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecret.getDefaultInstance()) {
          getSecretBuilder().mergeFrom(value);
        } else {
          secret_ = value;
        }
      } else {
        secretBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.clients.UpdateClientSecret secret = 3 [json_name = "secret", (.buf.validate.field) = { ... }</code>
     */
    public Builder clearSecret() {
      bitField0_ = (bitField0_ & ~0x00000004);
      secret_ = null;
      if (secretBuilder_ != null) {
        secretBuilder_.dispose();
        secretBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.clients.UpdateClientSecret secret = 3 [json_name = "secret", (.buf.validate.field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecret.Builder getSecretBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getSecretFieldBuilder().getBuilder();
    }
    /**
     * <code>.scalekit.v1.clients.UpdateClientSecret secret = 3 [json_name = "secret", (.buf.validate.field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretOrBuilder getSecretOrBuilder() {
      if (secretBuilder_ != null) {
        return secretBuilder_.getMessageOrBuilder();
      } else {
        return secret_ == null ?
            com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecret.getDefaultInstance() : secret_;
      }
    }
    /**
     * <code>.scalekit.v1.clients.UpdateClientSecret secret = 3 [json_name = "secret", (.buf.validate.field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecret, com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecret.Builder, com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretOrBuilder> 
        getSecretFieldBuilder() {
      if (secretBuilder_ == null) {
        secretBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecret, com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecret.Builder, com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretOrBuilder>(
                getSecret(),
                getParentForChildren(),
                isClean());
        secret_ = null;
      }
      return secretBuilder_;
    }

    private com.google.protobuf.FieldMask mask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> maskBuilder_;
    /**
     * <code>.google.protobuf.FieldMask mask = 4 [json_name = "mask"];</code>
     * @return Whether the mask field is set.
     */
    public boolean hasMask() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.google.protobuf.FieldMask mask = 4 [json_name = "mask"];</code>
     * @return The mask.
     */
    public com.google.protobuf.FieldMask getMask() {
      if (maskBuilder_ == null) {
        return mask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : mask_;
      } else {
        return maskBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.FieldMask mask = 4 [json_name = "mask"];</code>
     */
    public Builder setMask(com.google.protobuf.FieldMask value) {
      if (maskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mask_ = value;
      } else {
        maskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask mask = 4 [json_name = "mask"];</code>
     */
    public Builder setMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (maskBuilder_ == null) {
        mask_ = builderForValue.build();
      } else {
        maskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask mask = 4 [json_name = "mask"];</code>
     */
    public Builder mergeMask(com.google.protobuf.FieldMask value) {
      if (maskBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          mask_ != null &&
          mask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getMaskBuilder().mergeFrom(value);
        } else {
          mask_ = value;
        }
      } else {
        maskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask mask = 4 [json_name = "mask"];</code>
     */
    public Builder clearMask() {
      bitField0_ = (bitField0_ & ~0x00000008);
      mask_ = null;
      if (maskBuilder_ != null) {
        maskBuilder_.dispose();
        maskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask mask = 4 [json_name = "mask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getMaskBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getMaskFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.FieldMask mask = 4 [json_name = "mask"];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getMaskOrBuilder() {
      if (maskBuilder_ != null) {
        return maskBuilder_.getMessageOrBuilder();
      } else {
        return mask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : mask_;
      }
    }
    /**
     * <code>.google.protobuf.FieldMask mask = 4 [json_name = "mask"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getMaskFieldBuilder() {
      if (maskBuilder_ == null) {
        maskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getMask(),
                getParentForChildren(),
                isClean());
        mask_ = null;
      }
      return maskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.clients.UpdateClientSecretRequest)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.clients.UpdateClientSecretRequest)
  private static final com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest();
  }

  public static com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateClientSecretRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateClientSecretRequest>() {
    @java.lang.Override
    public UpdateClientSecretRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateClientSecretRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateClientSecretRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

