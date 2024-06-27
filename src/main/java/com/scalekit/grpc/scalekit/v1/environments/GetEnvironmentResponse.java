// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/environments/environments.proto

package com.scalekit.grpc.scalekit.v1.environments;

/**
 * Protobuf type {@code scalekit.v1.environments.GetEnvironmentResponse}
 */
public final class GetEnvironmentResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.environments.GetEnvironmentResponse)
    GetEnvironmentResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetEnvironmentResponse.newBuilder() to construct.
  private GetEnvironmentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetEnvironmentResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetEnvironmentResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.environments.EnvironmentsProto.internal_static_scalekit_v1_environments_GetEnvironmentResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.environments.EnvironmentsProto.internal_static_scalekit_v1_environments_GetEnvironmentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse.class, com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse.Builder.class);
  }

  public static final int ENVIRONMENT_FIELD_NUMBER = 1;
  private com.scalekit.grpc.scalekit.v1.environments.Environment environment_;
  /**
   * <code>.scalekit.v1.environments.Environment environment = 1 [json_name = "environment"];</code>
   * @return Whether the environment field is set.
   */
  @java.lang.Override
  public boolean hasEnvironment() {
    return environment_ != null;
  }
  /**
   * <code>.scalekit.v1.environments.Environment environment = 1 [json_name = "environment"];</code>
   * @return The environment.
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.environments.Environment getEnvironment() {
    return environment_ == null ? com.scalekit.grpc.scalekit.v1.environments.Environment.getDefaultInstance() : environment_;
  }
  /**
   * <code>.scalekit.v1.environments.Environment environment = 1 [json_name = "environment"];</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.environments.EnvironmentOrBuilder getEnvironmentOrBuilder() {
    return environment_ == null ? com.scalekit.grpc.scalekit.v1.environments.Environment.getDefaultInstance() : environment_;
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
    if (environment_ != null) {
      output.writeMessage(1, getEnvironment());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (environment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEnvironment());
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse other = (com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse) obj;

    if (hasEnvironment() != other.hasEnvironment()) return false;
    if (hasEnvironment()) {
      if (!getEnvironment()
          .equals(other.getEnvironment())) return false;
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
    if (hasEnvironment()) {
      hash = (37 * hash) + ENVIRONMENT_FIELD_NUMBER;
      hash = (53 * hash) + getEnvironment().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse prototype) {
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
   * Protobuf type {@code scalekit.v1.environments.GetEnvironmentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.environments.GetEnvironmentResponse)
      com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.environments.EnvironmentsProto.internal_static_scalekit_v1_environments_GetEnvironmentResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.environments.EnvironmentsProto.internal_static_scalekit_v1_environments_GetEnvironmentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse.class, com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse.newBuilder()
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
      environment_ = null;
      if (environmentBuilder_ != null) {
        environmentBuilder_.dispose();
        environmentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.environments.EnvironmentsProto.internal_static_scalekit_v1_environments_GetEnvironmentResponse_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse build() {
      com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse buildPartial() {
      com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse result = new com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.environment_ = environmentBuilder_ == null
            ? environment_
            : environmentBuilder_.build();
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse other) {
      if (other == com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse.getDefaultInstance()) return this;
      if (other.hasEnvironment()) {
        mergeEnvironment(other.getEnvironment());
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
                  getEnvironmentFieldBuilder().getBuilder(),
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

    private com.scalekit.grpc.scalekit.v1.environments.Environment environment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.environments.Environment, com.scalekit.grpc.scalekit.v1.environments.Environment.Builder, com.scalekit.grpc.scalekit.v1.environments.EnvironmentOrBuilder> environmentBuilder_;
    /**
     * <code>.scalekit.v1.environments.Environment environment = 1 [json_name = "environment"];</code>
     * @return Whether the environment field is set.
     */
    public boolean hasEnvironment() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.scalekit.v1.environments.Environment environment = 1 [json_name = "environment"];</code>
     * @return The environment.
     */
    public com.scalekit.grpc.scalekit.v1.environments.Environment getEnvironment() {
      if (environmentBuilder_ == null) {
        return environment_ == null ? com.scalekit.grpc.scalekit.v1.environments.Environment.getDefaultInstance() : environment_;
      } else {
        return environmentBuilder_.getMessage();
      }
    }
    /**
     * <code>.scalekit.v1.environments.Environment environment = 1 [json_name = "environment"];</code>
     */
    public Builder setEnvironment(com.scalekit.grpc.scalekit.v1.environments.Environment value) {
      if (environmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        environment_ = value;
      } else {
        environmentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.environments.Environment environment = 1 [json_name = "environment"];</code>
     */
    public Builder setEnvironment(
        com.scalekit.grpc.scalekit.v1.environments.Environment.Builder builderForValue) {
      if (environmentBuilder_ == null) {
        environment_ = builderForValue.build();
      } else {
        environmentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.environments.Environment environment = 1 [json_name = "environment"];</code>
     */
    public Builder mergeEnvironment(com.scalekit.grpc.scalekit.v1.environments.Environment value) {
      if (environmentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          environment_ != null &&
          environment_ != com.scalekit.grpc.scalekit.v1.environments.Environment.getDefaultInstance()) {
          getEnvironmentBuilder().mergeFrom(value);
        } else {
          environment_ = value;
        }
      } else {
        environmentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.environments.Environment environment = 1 [json_name = "environment"];</code>
     */
    public Builder clearEnvironment() {
      bitField0_ = (bitField0_ & ~0x00000001);
      environment_ = null;
      if (environmentBuilder_ != null) {
        environmentBuilder_.dispose();
        environmentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.environments.Environment environment = 1 [json_name = "environment"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.environments.Environment.Builder getEnvironmentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEnvironmentFieldBuilder().getBuilder();
    }
    /**
     * <code>.scalekit.v1.environments.Environment environment = 1 [json_name = "environment"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.environments.EnvironmentOrBuilder getEnvironmentOrBuilder() {
      if (environmentBuilder_ != null) {
        return environmentBuilder_.getMessageOrBuilder();
      } else {
        return environment_ == null ?
            com.scalekit.grpc.scalekit.v1.environments.Environment.getDefaultInstance() : environment_;
      }
    }
    /**
     * <code>.scalekit.v1.environments.Environment environment = 1 [json_name = "environment"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.environments.Environment, com.scalekit.grpc.scalekit.v1.environments.Environment.Builder, com.scalekit.grpc.scalekit.v1.environments.EnvironmentOrBuilder> 
        getEnvironmentFieldBuilder() {
      if (environmentBuilder_ == null) {
        environmentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.environments.Environment, com.scalekit.grpc.scalekit.v1.environments.Environment.Builder, com.scalekit.grpc.scalekit.v1.environments.EnvironmentOrBuilder>(
                getEnvironment(),
                getParentForChildren(),
                isClean());
        environment_ = null;
      }
      return environmentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.environments.GetEnvironmentResponse)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.environments.GetEnvironmentResponse)
  private static final com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse();
  }

  public static com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetEnvironmentResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetEnvironmentResponse>() {
    @java.lang.Override
    public GetEnvironmentResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetEnvironmentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetEnvironmentResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

