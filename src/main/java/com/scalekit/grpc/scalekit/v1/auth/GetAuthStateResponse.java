// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/auth/auth.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.auth;

/**
 * Protobuf type {@code scalekit.v1.auth.GetAuthStateResponse}
 */
public final class GetAuthStateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.auth.GetAuthStateResponse)
    GetAuthStateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAuthStateResponse.newBuilder() to construct.
  private GetAuthStateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAuthStateResponse() {
    authState_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAuthStateResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.auth.AuthProto.internal_static_scalekit_v1_auth_GetAuthStateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.auth.AuthProto.internal_static_scalekit_v1_auth_GetAuthStateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse.class, com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse.Builder.class);
  }

  public static final int AUTH_STATE_FIELD_NUMBER = 1;
  private int authState_ = 0;
  /**
   * <code>.scalekit.v1.auth.AuthState auth_state = 1 [json_name = "authState"];</code>
   * @return The enum numeric value on the wire for authState.
   */
  @java.lang.Override public int getAuthStateValue() {
    return authState_;
  }
  /**
   * <code>.scalekit.v1.auth.AuthState auth_state = 1 [json_name = "authState"];</code>
   * @return The authState.
   */
  @java.lang.Override public com.scalekit.grpc.scalekit.v1.auth.AuthState getAuthState() {
    com.scalekit.grpc.scalekit.v1.auth.AuthState result = com.scalekit.grpc.scalekit.v1.auth.AuthState.forNumber(authState_);
    return result == null ? com.scalekit.grpc.scalekit.v1.auth.AuthState.UNRECOGNIZED : result;
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
    if (authState_ != com.scalekit.grpc.scalekit.v1.auth.AuthState.AUTHENTICATION.getNumber()) {
      output.writeEnum(1, authState_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (authState_ != com.scalekit.grpc.scalekit.v1.auth.AuthState.AUTHENTICATION.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, authState_);
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse other = (com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse) obj;

    if (authState_ != other.authState_) return false;
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
    hash = (37 * hash) + AUTH_STATE_FIELD_NUMBER;
    hash = (53 * hash) + authState_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse prototype) {
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
   * Protobuf type {@code scalekit.v1.auth.GetAuthStateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.auth.GetAuthStateResponse)
      com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.auth.AuthProto.internal_static_scalekit_v1_auth_GetAuthStateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.auth.AuthProto.internal_static_scalekit_v1_auth_GetAuthStateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse.class, com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse.newBuilder()
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
      authState_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.auth.AuthProto.internal_static_scalekit_v1_auth_GetAuthStateResponse_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse build() {
      com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse buildPartial() {
      com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse result = new com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.authState_ = authState_;
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse other) {
      if (other == com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse.getDefaultInstance()) return this;
      if (other.authState_ != 0) {
        setAuthStateValue(other.getAuthStateValue());
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
            case 8: {
              authState_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int authState_ = 0;
    /**
     * <code>.scalekit.v1.auth.AuthState auth_state = 1 [json_name = "authState"];</code>
     * @return The enum numeric value on the wire for authState.
     */
    @java.lang.Override public int getAuthStateValue() {
      return authState_;
    }
    /**
     * <code>.scalekit.v1.auth.AuthState auth_state = 1 [json_name = "authState"];</code>
     * @param value The enum numeric value on the wire for authState to set.
     * @return This builder for chaining.
     */
    public Builder setAuthStateValue(int value) {
      authState_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.auth.AuthState auth_state = 1 [json_name = "authState"];</code>
     * @return The authState.
     */
    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.auth.AuthState getAuthState() {
      com.scalekit.grpc.scalekit.v1.auth.AuthState result = com.scalekit.grpc.scalekit.v1.auth.AuthState.forNumber(authState_);
      return result == null ? com.scalekit.grpc.scalekit.v1.auth.AuthState.UNRECOGNIZED : result;
    }
    /**
     * <code>.scalekit.v1.auth.AuthState auth_state = 1 [json_name = "authState"];</code>
     * @param value The authState to set.
     * @return This builder for chaining.
     */
    public Builder setAuthState(com.scalekit.grpc.scalekit.v1.auth.AuthState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      authState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.auth.AuthState auth_state = 1 [json_name = "authState"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      authState_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.auth.GetAuthStateResponse)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.auth.GetAuthStateResponse)
  private static final com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse();
  }

  public static com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAuthStateResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAuthStateResponse>() {
    @java.lang.Override
    public GetAuthStateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetAuthStateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAuthStateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

