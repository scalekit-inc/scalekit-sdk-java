// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/organizations/organizations.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.organizations;

/**
 * Protobuf type {@code scalekit.v1.organizations.UpdateOrganizationSettingsRequest}
 */
public final class UpdateOrganizationSettingsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.organizations.UpdateOrganizationSettingsRequest)
    UpdateOrganizationSettingsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateOrganizationSettingsRequest.newBuilder() to construct.
  private UpdateOrganizationSettingsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateOrganizationSettingsRequest() {
    id_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateOrganizationSettingsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.organizations.OrganizationsProto.internal_static_scalekit_v1_organizations_UpdateOrganizationSettingsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.organizations.OrganizationsProto.internal_static_scalekit_v1_organizations_UpdateOrganizationSettingsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest.class, com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <code>string id = 1 [json_name = "id", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
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
   * <code>string id = 1 [json_name = "id", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
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

  public static final int SETTINGS_FIELD_NUMBER = 2;
  private com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings settings_;
  /**
   * <code>.scalekit.v1.organizations.OrganizationSettings settings = 2 [json_name = "settings", (.buf.validate.field) = { ... }</code>
   * @return Whether the settings field is set.
   */
  @java.lang.Override
  public boolean hasSettings() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.scalekit.v1.organizations.OrganizationSettings settings = 2 [json_name = "settings", (.buf.validate.field) = { ... }</code>
   * @return The settings.
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings getSettings() {
    return settings_ == null ? com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings.getDefaultInstance() : settings_;
  }
  /**
   * <code>.scalekit.v1.organizations.OrganizationSettings settings = 2 [json_name = "settings", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettingsOrBuilder getSettingsOrBuilder() {
    return settings_ == null ? com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings.getDefaultInstance() : settings_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getSettings());
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSettings());
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest other = (com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (hasSettings() != other.hasSettings()) return false;
    if (hasSettings()) {
      if (!getSettings()
          .equals(other.getSettings())) return false;
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
    if (hasSettings()) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettings().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest prototype) {
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
   * Protobuf type {@code scalekit.v1.organizations.UpdateOrganizationSettingsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.organizations.UpdateOrganizationSettingsRequest)
      com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.organizations.OrganizationsProto.internal_static_scalekit_v1_organizations_UpdateOrganizationSettingsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.organizations.OrganizationsProto.internal_static_scalekit_v1_organizations_UpdateOrganizationSettingsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest.class, com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest.newBuilder()
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
        getSettingsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = "";
      settings_ = null;
      if (settingsBuilder_ != null) {
        settingsBuilder_.dispose();
        settingsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.organizations.OrganizationsProto.internal_static_scalekit_v1_organizations_UpdateOrganizationSettingsRequest_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest build() {
      com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest buildPartial() {
      com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest result = new com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.settings_ = settingsBuilder_ == null
            ? settings_
            : settingsBuilder_.build();
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest other) {
      if (other == com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSettings()) {
        mergeSettings(other.getSettings());
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
                  getSettingsFieldBuilder().getBuilder(),
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
     * <code>string id = 1 [json_name = "id", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
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
     * <code>string id = 1 [json_name = "id", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
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
     * <code>string id = 1 [json_name = "id", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
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
     * <code>string id = 1 [json_name = "id", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1 [json_name = "id", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
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

    private com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings settings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings, com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings.Builder, com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettingsOrBuilder> settingsBuilder_;
    /**
     * <code>.scalekit.v1.organizations.OrganizationSettings settings = 2 [json_name = "settings", (.buf.validate.field) = { ... }</code>
     * @return Whether the settings field is set.
     */
    public boolean hasSettings() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.scalekit.v1.organizations.OrganizationSettings settings = 2 [json_name = "settings", (.buf.validate.field) = { ... }</code>
     * @return The settings.
     */
    public com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings getSettings() {
      if (settingsBuilder_ == null) {
        return settings_ == null ? com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings.getDefaultInstance() : settings_;
      } else {
        return settingsBuilder_.getMessage();
      }
    }
    /**
     * <code>.scalekit.v1.organizations.OrganizationSettings settings = 2 [json_name = "settings", (.buf.validate.field) = { ... }</code>
     */
    public Builder setSettings(com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        settings_ = value;
      } else {
        settingsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.organizations.OrganizationSettings settings = 2 [json_name = "settings", (.buf.validate.field) = { ... }</code>
     */
    public Builder setSettings(
        com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        settings_ = builderForValue.build();
      } else {
        settingsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.organizations.OrganizationSettings settings = 2 [json_name = "settings", (.buf.validate.field) = { ... }</code>
     */
    public Builder mergeSettings(com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings value) {
      if (settingsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          settings_ != null &&
          settings_ != com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings.getDefaultInstance()) {
          getSettingsBuilder().mergeFrom(value);
        } else {
          settings_ = value;
        }
      } else {
        settingsBuilder_.mergeFrom(value);
      }
      if (settings_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.scalekit.v1.organizations.OrganizationSettings settings = 2 [json_name = "settings", (.buf.validate.field) = { ... }</code>
     */
    public Builder clearSettings() {
      bitField0_ = (bitField0_ & ~0x00000002);
      settings_ = null;
      if (settingsBuilder_ != null) {
        settingsBuilder_.dispose();
        settingsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.organizations.OrganizationSettings settings = 2 [json_name = "settings", (.buf.validate.field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings.Builder getSettingsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>.scalekit.v1.organizations.OrganizationSettings settings = 2 [json_name = "settings", (.buf.validate.field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettingsOrBuilder getSettingsOrBuilder() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilder();
      } else {
        return settings_ == null ?
            com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings.getDefaultInstance() : settings_;
      }
    }
    /**
     * <code>.scalekit.v1.organizations.OrganizationSettings settings = 2 [json_name = "settings", (.buf.validate.field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings, com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings.Builder, com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettingsOrBuilder> 
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings, com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettings.Builder, com.scalekit.grpc.scalekit.v1.organizations.OrganizationSettingsOrBuilder>(
                getSettings(),
                getParentForChildren(),
                isClean());
        settings_ = null;
      }
      return settingsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.organizations.UpdateOrganizationSettingsRequest)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.organizations.UpdateOrganizationSettingsRequest)
  private static final com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest();
  }

  public static com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateOrganizationSettingsRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateOrganizationSettingsRequest>() {
    @java.lang.Override
    public UpdateOrganizationSettingsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateOrganizationSettingsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateOrganizationSettingsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationSettingsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
