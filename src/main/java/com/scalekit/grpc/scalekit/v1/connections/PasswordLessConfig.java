// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/connections/connections.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.connections;

/**
 * Protobuf type {@code scalekit.v1.connections.PasswordLessConfig}
 */
public final class PasswordLessConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.connections.PasswordLessConfig)
    PasswordLessConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PasswordLessConfig.newBuilder() to construct.
  private PasswordLessConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PasswordLessConfig() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PasswordLessConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_PasswordLessConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_PasswordLessConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig.class, com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig.Builder.class);
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <code>.scalekit.v1.connections.PasswordlessType type = 1 [json_name = "type", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.scalekit.v1.connections.PasswordlessType type = 1 [json_name = "type", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The type.
   */
  @java.lang.Override public com.scalekit.grpc.scalekit.v1.connections.PasswordlessType getType() {
    com.scalekit.grpc.scalekit.v1.connections.PasswordlessType result = com.scalekit.grpc.scalekit.v1.connections.PasswordlessType.forNumber(type_);
    return result == null ? com.scalekit.grpc.scalekit.v1.connections.PasswordlessType.UNRECOGNIZED : result;
  }

  public static final int FREQUENCY_FIELD_NUMBER = 2;
  private int frequency_ = 0;
  /**
   * <code>int32 frequency = 2 [json_name = "frequency", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The frequency.
   */
  @java.lang.Override
  public int getFrequency() {
    return frequency_;
  }

  public static final int VALIDITY_FIELD_NUMBER = 3;
  private com.google.protobuf.Duration validity_;
  /**
   * <code>.google.protobuf.Duration validity = 3 [json_name = "validity", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the validity field is set.
   */
  @java.lang.Override
  public boolean hasValidity() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.protobuf.Duration validity = 3 [json_name = "validity", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The validity.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getValidity() {
    return validity_ == null ? com.google.protobuf.Duration.getDefaultInstance() : validity_;
  }
  /**
   * <code>.google.protobuf.Duration validity = 3 [json_name = "validity", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getValidityOrBuilder() {
    return validity_ == null ? com.google.protobuf.Duration.getDefaultInstance() : validity_;
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
    if (type_ != com.scalekit.grpc.scalekit.v1.connections.PasswordlessType.PasswordlessType_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (frequency_ != 0) {
      output.writeInt32(2, frequency_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getValidity());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.scalekit.grpc.scalekit.v1.connections.PasswordlessType.PasswordlessType_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (frequency_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, frequency_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getValidity());
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig other = (com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig) obj;

    if (type_ != other.type_) return false;
    if (getFrequency()
        != other.getFrequency()) return false;
    if (hasValidity() != other.hasValidity()) return false;
    if (hasValidity()) {
      if (!getValidity()
          .equals(other.getValidity())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + FREQUENCY_FIELD_NUMBER;
    hash = (53 * hash) + getFrequency();
    if (hasValidity()) {
      hash = (37 * hash) + VALIDITY_FIELD_NUMBER;
      hash = (53 * hash) + getValidity().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig prototype) {
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
   * Protobuf type {@code scalekit.v1.connections.PasswordLessConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.connections.PasswordLessConfig)
      com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_PasswordLessConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_PasswordLessConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig.class, com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig.newBuilder()
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
        getValidityFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      type_ = 0;
      frequency_ = 0;
      validity_ = null;
      if (validityBuilder_ != null) {
        validityBuilder_.dispose();
        validityBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_PasswordLessConfig_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig build() {
      com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig buildPartial() {
      com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig result = new com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.frequency_ = frequency_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.validity_ = validityBuilder_ == null
            ? validity_
            : validityBuilder_.build();
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig other) {
      if (other == com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getFrequency() != 0) {
        setFrequency(other.getFrequency());
      }
      if (other.hasValidity()) {
        mergeValidity(other.getValidity());
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
              type_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              frequency_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getValidityFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private int type_ = 0;
    /**
     * <code>.scalekit.v1.connections.PasswordlessType type = 1 [json_name = "type", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.scalekit.v1.connections.PasswordlessType type = 1 [json_name = "type", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.connections.PasswordlessType type = 1 [json_name = "type", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The type.
     */
    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.PasswordlessType getType() {
      com.scalekit.grpc.scalekit.v1.connections.PasswordlessType result = com.scalekit.grpc.scalekit.v1.connections.PasswordlessType.forNumber(type_);
      return result == null ? com.scalekit.grpc.scalekit.v1.connections.PasswordlessType.UNRECOGNIZED : result;
    }
    /**
     * <code>.scalekit.v1.connections.PasswordlessType type = 1 [json_name = "type", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.scalekit.grpc.scalekit.v1.connections.PasswordlessType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.connections.PasswordlessType type = 1 [json_name = "type", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private int frequency_ ;
    /**
     * <code>int32 frequency = 2 [json_name = "frequency", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The frequency.
     */
    @java.lang.Override
    public int getFrequency() {
      return frequency_;
    }
    /**
     * <code>int32 frequency = 2 [json_name = "frequency", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The frequency to set.
     * @return This builder for chaining.
     */
    public Builder setFrequency(int value) {

      frequency_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 frequency = 2 [json_name = "frequency", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearFrequency() {
      bitField0_ = (bitField0_ & ~0x00000002);
      frequency_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration validity_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> validityBuilder_;
    /**
     * <code>.google.protobuf.Duration validity = 3 [json_name = "validity", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the validity field is set.
     */
    public boolean hasValidity() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.google.protobuf.Duration validity = 3 [json_name = "validity", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The validity.
     */
    public com.google.protobuf.Duration getValidity() {
      if (validityBuilder_ == null) {
        return validity_ == null ? com.google.protobuf.Duration.getDefaultInstance() : validity_;
      } else {
        return validityBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Duration validity = 3 [json_name = "validity", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setValidity(com.google.protobuf.Duration value) {
      if (validityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        validity_ = value;
      } else {
        validityBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration validity = 3 [json_name = "validity", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setValidity(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (validityBuilder_ == null) {
        validity_ = builderForValue.build();
      } else {
        validityBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration validity = 3 [json_name = "validity", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder mergeValidity(com.google.protobuf.Duration value) {
      if (validityBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          validity_ != null &&
          validity_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getValidityBuilder().mergeFrom(value);
        } else {
          validity_ = value;
        }
      } else {
        validityBuilder_.mergeFrom(value);
      }
      if (validity_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Duration validity = 3 [json_name = "validity", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder clearValidity() {
      bitField0_ = (bitField0_ & ~0x00000004);
      validity_ = null;
      if (validityBuilder_ != null) {
        validityBuilder_.dispose();
        validityBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration validity = 3 [json_name = "validity", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.google.protobuf.Duration.Builder getValidityBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getValidityFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Duration validity = 3 [json_name = "validity", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.google.protobuf.DurationOrBuilder getValidityOrBuilder() {
      if (validityBuilder_ != null) {
        return validityBuilder_.getMessageOrBuilder();
      } else {
        return validity_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : validity_;
      }
    }
    /**
     * <code>.google.protobuf.Duration validity = 3 [json_name = "validity", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getValidityFieldBuilder() {
      if (validityBuilder_ == null) {
        validityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getValidity(),
                getParentForChildren(),
                isClean());
        validity_ = null;
      }
      return validityBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.connections.PasswordLessConfig)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.connections.PasswordLessConfig)
  private static final com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig();
  }

  public static com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PasswordLessConfig>
      PARSER = new com.google.protobuf.AbstractParser<PasswordLessConfig>() {
    @java.lang.Override
    public PasswordLessConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<PasswordLessConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PasswordLessConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.connections.PasswordLessConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

