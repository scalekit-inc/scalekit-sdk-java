// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/user_profile_attributes/user_profile_attributes.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.user_profile_attributes;

/**
 * Protobuf type {@code scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse}
 */
public final class UpdateUserProfileAttributeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse)
    UpdateUserProfileAttributeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateUserProfileAttributeResponse.newBuilder() to construct.
  private UpdateUserProfileAttributeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateUserProfileAttributeResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateUserProfileAttributeResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttributesProto.internal_static_scalekit_v1_user_profile_attributes_UpdateUserProfileAttributeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttributesProto.internal_static_scalekit_v1_user_profile_attributes_UpdateUserProfileAttributeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse.class, com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse.Builder.class);
  }

  private int bitField0_;
  public static final int USER_PROFILE_ATTRIBUTE_FIELD_NUMBER = 1;
  private com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute userProfileAttribute_;
  /**
   * <code>.scalekit.v1.user_profile_attributes.UserProfileAttribute user_profile_attribute = 1 [json_name = "userProfileAttribute"];</code>
   * @return Whether the userProfileAttribute field is set.
   */
  @java.lang.Override
  public boolean hasUserProfileAttribute() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.scalekit.v1.user_profile_attributes.UserProfileAttribute user_profile_attribute = 1 [json_name = "userProfileAttribute"];</code>
   * @return The userProfileAttribute.
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute getUserProfileAttribute() {
    return userProfileAttribute_ == null ? com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute.getDefaultInstance() : userProfileAttribute_;
  }
  /**
   * <code>.scalekit.v1.user_profile_attributes.UserProfileAttribute user_profile_attribute = 1 [json_name = "userProfileAttribute"];</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttributeOrBuilder getUserProfileAttributeOrBuilder() {
    return userProfileAttribute_ == null ? com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute.getDefaultInstance() : userProfileAttribute_;
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
      output.writeMessage(1, getUserProfileAttribute());
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
        .computeMessageSize(1, getUserProfileAttribute());
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse other = (com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse) obj;

    if (hasUserProfileAttribute() != other.hasUserProfileAttribute()) return false;
    if (hasUserProfileAttribute()) {
      if (!getUserProfileAttribute()
          .equals(other.getUserProfileAttribute())) return false;
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
    if (hasUserProfileAttribute()) {
      hash = (37 * hash) + USER_PROFILE_ATTRIBUTE_FIELD_NUMBER;
      hash = (53 * hash) + getUserProfileAttribute().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse prototype) {
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
   * Protobuf type {@code scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse)
      com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttributesProto.internal_static_scalekit_v1_user_profile_attributes_UpdateUserProfileAttributeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttributesProto.internal_static_scalekit_v1_user_profile_attributes_UpdateUserProfileAttributeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse.class, com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse.newBuilder()
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
        getUserProfileAttributeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      userProfileAttribute_ = null;
      if (userProfileAttributeBuilder_ != null) {
        userProfileAttributeBuilder_.dispose();
        userProfileAttributeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttributesProto.internal_static_scalekit_v1_user_profile_attributes_UpdateUserProfileAttributeResponse_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse build() {
      com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse buildPartial() {
      com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse result = new com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userProfileAttribute_ = userProfileAttributeBuilder_ == null
            ? userProfileAttribute_
            : userProfileAttributeBuilder_.build();
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse other) {
      if (other == com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse.getDefaultInstance()) return this;
      if (other.hasUserProfileAttribute()) {
        mergeUserProfileAttribute(other.getUserProfileAttribute());
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
                  getUserProfileAttributeFieldBuilder().getBuilder(),
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

    private com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute userProfileAttribute_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute, com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute.Builder, com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttributeOrBuilder> userProfileAttributeBuilder_;
    /**
     * <code>.scalekit.v1.user_profile_attributes.UserProfileAttribute user_profile_attribute = 1 [json_name = "userProfileAttribute"];</code>
     * @return Whether the userProfileAttribute field is set.
     */
    public boolean hasUserProfileAttribute() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.scalekit.v1.user_profile_attributes.UserProfileAttribute user_profile_attribute = 1 [json_name = "userProfileAttribute"];</code>
     * @return The userProfileAttribute.
     */
    public com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute getUserProfileAttribute() {
      if (userProfileAttributeBuilder_ == null) {
        return userProfileAttribute_ == null ? com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute.getDefaultInstance() : userProfileAttribute_;
      } else {
        return userProfileAttributeBuilder_.getMessage();
      }
    }
    /**
     * <code>.scalekit.v1.user_profile_attributes.UserProfileAttribute user_profile_attribute = 1 [json_name = "userProfileAttribute"];</code>
     */
    public Builder setUserProfileAttribute(com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute value) {
      if (userProfileAttributeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userProfileAttribute_ = value;
      } else {
        userProfileAttributeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.user_profile_attributes.UserProfileAttribute user_profile_attribute = 1 [json_name = "userProfileAttribute"];</code>
     */
    public Builder setUserProfileAttribute(
        com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute.Builder builderForValue) {
      if (userProfileAttributeBuilder_ == null) {
        userProfileAttribute_ = builderForValue.build();
      } else {
        userProfileAttributeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.user_profile_attributes.UserProfileAttribute user_profile_attribute = 1 [json_name = "userProfileAttribute"];</code>
     */
    public Builder mergeUserProfileAttribute(com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute value) {
      if (userProfileAttributeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          userProfileAttribute_ != null &&
          userProfileAttribute_ != com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute.getDefaultInstance()) {
          getUserProfileAttributeBuilder().mergeFrom(value);
        } else {
          userProfileAttribute_ = value;
        }
      } else {
        userProfileAttributeBuilder_.mergeFrom(value);
      }
      if (userProfileAttribute_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.scalekit.v1.user_profile_attributes.UserProfileAttribute user_profile_attribute = 1 [json_name = "userProfileAttribute"];</code>
     */
    public Builder clearUserProfileAttribute() {
      bitField0_ = (bitField0_ & ~0x00000001);
      userProfileAttribute_ = null;
      if (userProfileAttributeBuilder_ != null) {
        userProfileAttributeBuilder_.dispose();
        userProfileAttributeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.user_profile_attributes.UserProfileAttribute user_profile_attribute = 1 [json_name = "userProfileAttribute"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute.Builder getUserProfileAttributeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUserProfileAttributeFieldBuilder().getBuilder();
    }
    /**
     * <code>.scalekit.v1.user_profile_attributes.UserProfileAttribute user_profile_attribute = 1 [json_name = "userProfileAttribute"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttributeOrBuilder getUserProfileAttributeOrBuilder() {
      if (userProfileAttributeBuilder_ != null) {
        return userProfileAttributeBuilder_.getMessageOrBuilder();
      } else {
        return userProfileAttribute_ == null ?
            com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute.getDefaultInstance() : userProfileAttribute_;
      }
    }
    /**
     * <code>.scalekit.v1.user_profile_attributes.UserProfileAttribute user_profile_attribute = 1 [json_name = "userProfileAttribute"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute, com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute.Builder, com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttributeOrBuilder> 
        getUserProfileAttributeFieldBuilder() {
      if (userProfileAttributeBuilder_ == null) {
        userProfileAttributeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute, com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttribute.Builder, com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttributeOrBuilder>(
                getUserProfileAttribute(),
                getParentForChildren(),
                isClean());
        userProfileAttribute_ = null;
      }
      return userProfileAttributeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse)
  private static final com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse();
  }

  public static com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateUserProfileAttributeResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateUserProfileAttributeResponse>() {
    @java.lang.Override
    public UpdateUserProfileAttributeResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateUserProfileAttributeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateUserProfileAttributeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

