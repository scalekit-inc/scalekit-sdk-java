// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/environments/environments.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.environments;

/**
 * Protobuf type {@code scalekit.v1.environments.AssetSettings}
 */
public final class AssetSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.environments.AssetSettings)
    AssetSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetSettings.newBuilder() to construct.
  private AssetSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetSettings() {
    category_ = 0;
    extension_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.environments.EnvironmentsProto.internal_static_scalekit_v1_environments_AssetSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.environments.EnvironmentsProto.internal_static_scalekit_v1_environments_AssetSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.environments.AssetSettings.class, com.scalekit.grpc.scalekit.v1.environments.AssetSettings.Builder.class);
  }

  public static final int CATEGORY_FIELD_NUMBER = 1;
  private int category_ = 0;
  /**
   * <code>.scalekit.v1.environments.AssetCategory category = 1 [json_name = "category", (.buf.validate.field) = { ... }</code>
   * @return The enum numeric value on the wire for category.
   */
  @java.lang.Override public int getCategoryValue() {
    return category_;
  }
  /**
   * <code>.scalekit.v1.environments.AssetCategory category = 1 [json_name = "category", (.buf.validate.field) = { ... }</code>
   * @return The category.
   */
  @java.lang.Override public com.scalekit.grpc.scalekit.v1.environments.AssetCategory getCategory() {
    com.scalekit.grpc.scalekit.v1.environments.AssetCategory result = com.scalekit.grpc.scalekit.v1.environments.AssetCategory.forNumber(category_);
    return result == null ? com.scalekit.grpc.scalekit.v1.environments.AssetCategory.UNRECOGNIZED : result;
  }

  public static final int EXTENSION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object extension_ = "";
  /**
   * <code>string extension = 2 [json_name = "extension", (.buf.validate.field) = { ... }</code>
   * @return The extension.
   */
  @java.lang.Override
  public java.lang.String getExtension() {
    java.lang.Object ref = extension_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      extension_ = s;
      return s;
    }
  }
  /**
   * <code>string extension = 2 [json_name = "extension", (.buf.validate.field) = { ... }</code>
   * @return The bytes for extension.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExtensionBytes() {
    java.lang.Object ref = extension_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      extension_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (category_ != com.scalekit.grpc.scalekit.v1.environments.AssetCategory.ASSET_CATEGORY_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, category_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(extension_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, extension_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (category_ != com.scalekit.grpc.scalekit.v1.environments.AssetCategory.ASSET_CATEGORY_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, category_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(extension_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, extension_);
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.environments.AssetSettings)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.environments.AssetSettings other = (com.scalekit.grpc.scalekit.v1.environments.AssetSettings) obj;

    if (category_ != other.category_) return false;
    if (!getExtension()
        .equals(other.getExtension())) return false;
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
    hash = (37 * hash) + CATEGORY_FIELD_NUMBER;
    hash = (53 * hash) + category_;
    hash = (37 * hash) + EXTENSION_FIELD_NUMBER;
    hash = (53 * hash) + getExtension().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.environments.AssetSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.AssetSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.AssetSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.AssetSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.AssetSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.AssetSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.AssetSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.AssetSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.environments.AssetSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.environments.AssetSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.AssetSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.environments.AssetSettings parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.environments.AssetSettings prototype) {
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
   * Protobuf type {@code scalekit.v1.environments.AssetSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.environments.AssetSettings)
      com.scalekit.grpc.scalekit.v1.environments.AssetSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.environments.EnvironmentsProto.internal_static_scalekit_v1_environments_AssetSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.environments.EnvironmentsProto.internal_static_scalekit_v1_environments_AssetSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.environments.AssetSettings.class, com.scalekit.grpc.scalekit.v1.environments.AssetSettings.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.environments.AssetSettings.newBuilder()
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
      category_ = 0;
      extension_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.environments.EnvironmentsProto.internal_static_scalekit_v1_environments_AssetSettings_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.environments.AssetSettings getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.environments.AssetSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.environments.AssetSettings build() {
      com.scalekit.grpc.scalekit.v1.environments.AssetSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.environments.AssetSettings buildPartial() {
      com.scalekit.grpc.scalekit.v1.environments.AssetSettings result = new com.scalekit.grpc.scalekit.v1.environments.AssetSettings(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.environments.AssetSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.category_ = category_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.extension_ = extension_;
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.environments.AssetSettings) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.environments.AssetSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.environments.AssetSettings other) {
      if (other == com.scalekit.grpc.scalekit.v1.environments.AssetSettings.getDefaultInstance()) return this;
      if (other.category_ != 0) {
        setCategoryValue(other.getCategoryValue());
      }
      if (!other.getExtension().isEmpty()) {
        extension_ = other.extension_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              category_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              extension_ = input.readStringRequireUtf8();
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

    private int category_ = 0;
    /**
     * <code>.scalekit.v1.environments.AssetCategory category = 1 [json_name = "category", (.buf.validate.field) = { ... }</code>
     * @return The enum numeric value on the wire for category.
     */
    @java.lang.Override public int getCategoryValue() {
      return category_;
    }
    /**
     * <code>.scalekit.v1.environments.AssetCategory category = 1 [json_name = "category", (.buf.validate.field) = { ... }</code>
     * @param value The enum numeric value on the wire for category to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryValue(int value) {
      category_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.environments.AssetCategory category = 1 [json_name = "category", (.buf.validate.field) = { ... }</code>
     * @return The category.
     */
    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.environments.AssetCategory getCategory() {
      com.scalekit.grpc.scalekit.v1.environments.AssetCategory result = com.scalekit.grpc.scalekit.v1.environments.AssetCategory.forNumber(category_);
      return result == null ? com.scalekit.grpc.scalekit.v1.environments.AssetCategory.UNRECOGNIZED : result;
    }
    /**
     * <code>.scalekit.v1.environments.AssetCategory category = 1 [json_name = "category", (.buf.validate.field) = { ... }</code>
     * @param value The category to set.
     * @return This builder for chaining.
     */
    public Builder setCategory(com.scalekit.grpc.scalekit.v1.environments.AssetCategory value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      category_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.environments.AssetCategory category = 1 [json_name = "category", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearCategory() {
      bitField0_ = (bitField0_ & ~0x00000001);
      category_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object extension_ = "";
    /**
     * <code>string extension = 2 [json_name = "extension", (.buf.validate.field) = { ... }</code>
     * @return The extension.
     */
    public java.lang.String getExtension() {
      java.lang.Object ref = extension_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        extension_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string extension = 2 [json_name = "extension", (.buf.validate.field) = { ... }</code>
     * @return The bytes for extension.
     */
    public com.google.protobuf.ByteString
        getExtensionBytes() {
      java.lang.Object ref = extension_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        extension_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string extension = 2 [json_name = "extension", (.buf.validate.field) = { ... }</code>
     * @param value The extension to set.
     * @return This builder for chaining.
     */
    public Builder setExtension(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      extension_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string extension = 2 [json_name = "extension", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearExtension() {
      extension_ = getDefaultInstance().getExtension();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string extension = 2 [json_name = "extension", (.buf.validate.field) = { ... }</code>
     * @param value The bytes for extension to set.
     * @return This builder for chaining.
     */
    public Builder setExtensionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      extension_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.environments.AssetSettings)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.environments.AssetSettings)
  private static final com.scalekit.grpc.scalekit.v1.environments.AssetSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.environments.AssetSettings();
  }

  public static com.scalekit.grpc.scalekit.v1.environments.AssetSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetSettings>
      PARSER = new com.google.protobuf.AbstractParser<AssetSettings>() {
    @java.lang.Override
    public AssetSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssetSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.environments.AssetSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

