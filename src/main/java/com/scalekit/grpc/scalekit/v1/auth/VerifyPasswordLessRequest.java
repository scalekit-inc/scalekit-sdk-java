// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/auth/auth.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.auth;

/**
 * Protobuf type {@code scalekit.v1.auth.VerifyPasswordLessRequest}
 */
public final class VerifyPasswordLessRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.auth.VerifyPasswordLessRequest)
    VerifyPasswordLessRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VerifyPasswordLessRequest.newBuilder() to construct.
  private VerifyPasswordLessRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VerifyPasswordLessRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VerifyPasswordLessRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.auth.AuthProto.internal_static_scalekit_v1_auth_VerifyPasswordLessRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.auth.AuthProto.internal_static_scalekit_v1_auth_VerifyPasswordLessRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest.class, com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest.Builder.class);
  }

  private int bitField0_;
  public static final int OTP_REQ_FIELD_NUMBER = 2;
  private com.scalekit.grpc.scalekit.v1.auth.OTPRequest otpReq_;
  /**
   * <code>.scalekit.v1.auth.OTPRequest otp_req = 2 [json_name = "otpReq"];</code>
   * @return Whether the otpReq field is set.
   */
  @java.lang.Override
  public boolean hasOtpReq() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.scalekit.v1.auth.OTPRequest otp_req = 2 [json_name = "otpReq"];</code>
   * @return The otpReq.
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.auth.OTPRequest getOtpReq() {
    return otpReq_ == null ? com.scalekit.grpc.scalekit.v1.auth.OTPRequest.getDefaultInstance() : otpReq_;
  }
  /**
   * <code>.scalekit.v1.auth.OTPRequest otp_req = 2 [json_name = "otpReq"];</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.auth.OTPRequestOrBuilder getOtpReqOrBuilder() {
    return otpReq_ == null ? com.scalekit.grpc.scalekit.v1.auth.OTPRequest.getDefaultInstance() : otpReq_;
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
      output.writeMessage(2, getOtpReq());
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
        .computeMessageSize(2, getOtpReq());
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest other = (com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest) obj;

    if (hasOtpReq() != other.hasOtpReq()) return false;
    if (hasOtpReq()) {
      if (!getOtpReq()
          .equals(other.getOtpReq())) return false;
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
    if (hasOtpReq()) {
      hash = (37 * hash) + OTP_REQ_FIELD_NUMBER;
      hash = (53 * hash) + getOtpReq().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest prototype) {
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
   * Protobuf type {@code scalekit.v1.auth.VerifyPasswordLessRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.auth.VerifyPasswordLessRequest)
      com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.auth.AuthProto.internal_static_scalekit_v1_auth_VerifyPasswordLessRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.auth.AuthProto.internal_static_scalekit_v1_auth_VerifyPasswordLessRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest.class, com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest.newBuilder()
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
        getOtpReqFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      otpReq_ = null;
      if (otpReqBuilder_ != null) {
        otpReqBuilder_.dispose();
        otpReqBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.auth.AuthProto.internal_static_scalekit_v1_auth_VerifyPasswordLessRequest_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest build() {
      com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest buildPartial() {
      com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest result = new com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.otpReq_ = otpReqBuilder_ == null
            ? otpReq_
            : otpReqBuilder_.build();
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest other) {
      if (other == com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest.getDefaultInstance()) return this;
      if (other.hasOtpReq()) {
        mergeOtpReq(other.getOtpReq());
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
            case 18: {
              input.readMessage(
                  getOtpReqFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.scalekit.grpc.scalekit.v1.auth.OTPRequest otpReq_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.auth.OTPRequest, com.scalekit.grpc.scalekit.v1.auth.OTPRequest.Builder, com.scalekit.grpc.scalekit.v1.auth.OTPRequestOrBuilder> otpReqBuilder_;
    /**
     * <code>.scalekit.v1.auth.OTPRequest otp_req = 2 [json_name = "otpReq"];</code>
     * @return Whether the otpReq field is set.
     */
    public boolean hasOtpReq() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.scalekit.v1.auth.OTPRequest otp_req = 2 [json_name = "otpReq"];</code>
     * @return The otpReq.
     */
    public com.scalekit.grpc.scalekit.v1.auth.OTPRequest getOtpReq() {
      if (otpReqBuilder_ == null) {
        return otpReq_ == null ? com.scalekit.grpc.scalekit.v1.auth.OTPRequest.getDefaultInstance() : otpReq_;
      } else {
        return otpReqBuilder_.getMessage();
      }
    }
    /**
     * <code>.scalekit.v1.auth.OTPRequest otp_req = 2 [json_name = "otpReq"];</code>
     */
    public Builder setOtpReq(com.scalekit.grpc.scalekit.v1.auth.OTPRequest value) {
      if (otpReqBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        otpReq_ = value;
      } else {
        otpReqBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.auth.OTPRequest otp_req = 2 [json_name = "otpReq"];</code>
     */
    public Builder setOtpReq(
        com.scalekit.grpc.scalekit.v1.auth.OTPRequest.Builder builderForValue) {
      if (otpReqBuilder_ == null) {
        otpReq_ = builderForValue.build();
      } else {
        otpReqBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.auth.OTPRequest otp_req = 2 [json_name = "otpReq"];</code>
     */
    public Builder mergeOtpReq(com.scalekit.grpc.scalekit.v1.auth.OTPRequest value) {
      if (otpReqBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          otpReq_ != null &&
          otpReq_ != com.scalekit.grpc.scalekit.v1.auth.OTPRequest.getDefaultInstance()) {
          getOtpReqBuilder().mergeFrom(value);
        } else {
          otpReq_ = value;
        }
      } else {
        otpReqBuilder_.mergeFrom(value);
      }
      if (otpReq_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.scalekit.v1.auth.OTPRequest otp_req = 2 [json_name = "otpReq"];</code>
     */
    public Builder clearOtpReq() {
      bitField0_ = (bitField0_ & ~0x00000001);
      otpReq_ = null;
      if (otpReqBuilder_ != null) {
        otpReqBuilder_.dispose();
        otpReqBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.auth.OTPRequest otp_req = 2 [json_name = "otpReq"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.auth.OTPRequest.Builder getOtpReqBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getOtpReqFieldBuilder().getBuilder();
    }
    /**
     * <code>.scalekit.v1.auth.OTPRequest otp_req = 2 [json_name = "otpReq"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.auth.OTPRequestOrBuilder getOtpReqOrBuilder() {
      if (otpReqBuilder_ != null) {
        return otpReqBuilder_.getMessageOrBuilder();
      } else {
        return otpReq_ == null ?
            com.scalekit.grpc.scalekit.v1.auth.OTPRequest.getDefaultInstance() : otpReq_;
      }
    }
    /**
     * <code>.scalekit.v1.auth.OTPRequest otp_req = 2 [json_name = "otpReq"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.auth.OTPRequest, com.scalekit.grpc.scalekit.v1.auth.OTPRequest.Builder, com.scalekit.grpc.scalekit.v1.auth.OTPRequestOrBuilder> 
        getOtpReqFieldBuilder() {
      if (otpReqBuilder_ == null) {
        otpReqBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.auth.OTPRequest, com.scalekit.grpc.scalekit.v1.auth.OTPRequest.Builder, com.scalekit.grpc.scalekit.v1.auth.OTPRequestOrBuilder>(
                getOtpReq(),
                getParentForChildren(),
                isClean());
        otpReq_ = null;
      }
      return otpReqBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.auth.VerifyPasswordLessRequest)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.auth.VerifyPasswordLessRequest)
  private static final com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest();
  }

  public static com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VerifyPasswordLessRequest>
      PARSER = new com.google.protobuf.AbstractParser<VerifyPasswordLessRequest>() {
    @java.lang.Override
    public VerifyPasswordLessRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<VerifyPasswordLessRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VerifyPasswordLessRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

