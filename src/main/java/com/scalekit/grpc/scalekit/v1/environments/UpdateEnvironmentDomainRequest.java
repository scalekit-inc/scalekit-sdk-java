// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/environments/environments.proto

package com.scalekit.grpc.scalekit.v1.environments;

/**
 * Protobuf type {@code scalekit.v1.environments.UpdateEnvironmentDomainRequest}
 */
public final class UpdateEnvironmentDomainRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.environments.UpdateEnvironmentDomainRequest)
    UpdateEnvironmentDomainRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateEnvironmentDomainRequest.newBuilder() to construct.
  private UpdateEnvironmentDomainRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateEnvironmentDomainRequest() {
    id_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateEnvironmentDomainRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.environments.EnvironmentsProto.internal_static_scalekit_v1_environments_UpdateEnvironmentDomainRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.environments.EnvironmentsProto.internal_static_scalekit_v1_environments_UpdateEnvironmentDomainRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest.class, com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENVIRONMENT_FIELD_NUMBER = 2;
  private com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomain environment_;
  /**
   * <code>.scalekit.v1.environments.UpdateEnvironmentDomain environment = 2 [json_name = "environment", (.buf.validate.field) = { ... }</code>
   * @return Whether the environment field is set.
   */
  @java.lang.Override
  public boolean hasEnvironment() {
    return environment_ != null;
  }
  /**
   * <code>.scalekit.v1.environments.UpdateEnvironmentDomain environment = 2 [json_name = "environment", (.buf.validate.field) = { ... }</code>
   * @return The environment.
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomain getEnvironment() {
    return environment_ == null ? com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomain.getDefaultInstance() : environment_;
  }
  /**
   * <code>.scalekit.v1.environments.UpdateEnvironmentDomain environment = 2 [json_name = "environment", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainOrBuilder getEnvironmentOrBuilder() {
    return environment_ == null ? com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomain.getDefaultInstance() : environment_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (environment_ != null) {
      output.writeMessage(2, getEnvironment());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (environment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEnvironment());
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest other = (com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest) obj;

    if (!getId()
        .equals(other.getId())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (hasEnvironment()) {
      hash = (37 * hash) + ENVIRONMENT_FIELD_NUMBER;
      hash = (53 * hash) + getEnvironment().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest prototype) {
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
   * Protobuf type {@code scalekit.v1.environments.UpdateEnvironmentDomainRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.environments.UpdateEnvironmentDomainRequest)
      com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.environments.EnvironmentsProto.internal_static_scalekit_v1_environments_UpdateEnvironmentDomainRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.environments.EnvironmentsProto.internal_static_scalekit_v1_environments_UpdateEnvironmentDomainRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest.class, com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest.newBuilder()
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
      id_ = "";
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
      return com.scalekit.grpc.scalekit.v1.environments.EnvironmentsProto.internal_static_scalekit_v1_environments_UpdateEnvironmentDomainRequest_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest build() {
      com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest buildPartial() {
      com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest result = new com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest other) {
      if (other == com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
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
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getEnvironmentFieldBuilder().getBuilder(),
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

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomain environment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomain, com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomain.Builder, com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainOrBuilder> environmentBuilder_;
    /**
     * <code>.scalekit.v1.environments.UpdateEnvironmentDomain environment = 2 [json_name = "environment", (.buf.validate.field) = { ... }</code>
     * @return Whether the environment field is set.
     */
    public boolean hasEnvironment() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.scalekit.v1.environments.UpdateEnvironmentDomain environment = 2 [json_name = "environment", (.buf.validate.field) = { ... }</code>
     * @return The environment.
     */
    public com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomain getEnvironment() {
      if (environmentBuilder_ == null) {
        return environment_ == null ? com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomain.getDefaultInstance() : environment_;
      } else {
        return environmentBuilder_.getMessage();
      }
    }
    /**
     * <code>.scalekit.v1.environments.UpdateEnvironmentDomain environment = 2 [json_name = "environment", (.buf.validate.field) = { ... }</code>
     */
    public Builder setEnvironment(com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomain value) {
      if (environmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        environment_ = value;
      } else {
        environmentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.environments.UpdateEnvironmentDomain environment = 2 [json_name = "environment", (.buf.validate.field) = { ... }</code>
     */
    public Builder setEnvironment(
        com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomain.Builder builderForValue) {
      if (environmentBuilder_ == null) {
        environment_ = builderForValue.build();
      } else {
        environmentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.environments.UpdateEnvironmentDomain environment = 2 [json_name = "environment", (.buf.validate.field) = { ... }</code>
     */
    public Builder mergeEnvironment(com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomain value) {
      if (environmentBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          environment_ != null &&
          environment_ != com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomain.getDefaultInstance()) {
          getEnvironmentBuilder().mergeFrom(value);
        } else {
          environment_ = value;
        }
      } else {
        environmentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.environments.UpdateEnvironmentDomain environment = 2 [json_name = "environment", (.buf.validate.field) = { ... }</code>
     */
    public Builder clearEnvironment() {
      bitField0_ = (bitField0_ & ~0x00000002);
      environment_ = null;
      if (environmentBuilder_ != null) {
        environmentBuilder_.dispose();
        environmentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.environments.UpdateEnvironmentDomain environment = 2 [json_name = "environment", (.buf.validate.field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomain.Builder getEnvironmentBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEnvironmentFieldBuilder().getBuilder();
    }
    /**
     * <code>.scalekit.v1.environments.UpdateEnvironmentDomain environment = 2 [json_name = "environment", (.buf.validate.field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainOrBuilder getEnvironmentOrBuilder() {
      if (environmentBuilder_ != null) {
        return environmentBuilder_.getMessageOrBuilder();
      } else {
        return environment_ == null ?
            com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomain.getDefaultInstance() : environment_;
      }
    }
    /**
     * <code>.scalekit.v1.environments.UpdateEnvironmentDomain environment = 2 [json_name = "environment", (.buf.validate.field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomain, com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomain.Builder, com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainOrBuilder> 
        getEnvironmentFieldBuilder() {
      if (environmentBuilder_ == null) {
        environmentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomain, com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomain.Builder, com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.environments.UpdateEnvironmentDomainRequest)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.environments.UpdateEnvironmentDomainRequest)
  private static final com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest();
  }

  public static com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateEnvironmentDomainRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateEnvironmentDomainRequest>() {
    @java.lang.Override
    public UpdateEnvironmentDomainRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateEnvironmentDomainRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateEnvironmentDomainRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

