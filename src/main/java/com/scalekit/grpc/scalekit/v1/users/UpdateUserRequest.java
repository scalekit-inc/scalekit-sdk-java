// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/users/users.proto

package com.scalekit.grpc.scalekit.v1.users;

/**
 * Protobuf type {@code scalekit.v1.users.UpdateUserRequest}
 */
public final class UpdateUserRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.users.UpdateUserRequest)
    UpdateUserRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateUserRequest.newBuilder() to construct.
  private UpdateUserRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateUserRequest() {
    organizationId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateUserRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.users.UsersProto.internal_static_scalekit_v1_users_UpdateUserRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.users.UsersProto.internal_static_scalekit_v1_users_UpdateUserRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest.class, com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest.Builder.class);
  }

  private int identitiesCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object identities_;
  public enum IdentitiesCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ID(2),
    EXTERNAL_ID(3),
    IDENTITIES_NOT_SET(0);
    private final int value;
    private IdentitiesCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static IdentitiesCase valueOf(int value) {
      return forNumber(value);
    }

    public static IdentitiesCase forNumber(int value) {
      switch (value) {
        case 2: return ID;
        case 3: return EXTERNAL_ID;
        case 0: return IDENTITIES_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public IdentitiesCase
  getIdentitiesCase() {
    return IdentitiesCase.forNumber(
        identitiesCase_);
  }

  public static final int ORGANIZATION_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object organizationId_ = "";
  /**
   * <code>string organization_id = 1 [json_name = "organizationId"];</code>
   * @return The organizationId.
   */
  @java.lang.Override
  public java.lang.String getOrganizationId() {
    java.lang.Object ref = organizationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      organizationId_ = s;
      return s;
    }
  }
  /**
   * <code>string organization_id = 1 [json_name = "organizationId"];</code>
   * @return The bytes for organizationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrganizationIdBytes() {
    java.lang.Object ref = organizationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      organizationId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ID_FIELD_NUMBER = 2;
  /**
   * <code>string id = 2 [json_name = "id", (.buf.validate.field) = { ... }</code>
   * @return Whether the id field is set.
   */
  public boolean hasId() {
    return identitiesCase_ == 2;
  }
  /**
   * <code>string id = 2 [json_name = "id", (.buf.validate.field) = { ... }</code>
   * @return The id.
   */
  public java.lang.String getId() {
    java.lang.Object ref = "";
    if (identitiesCase_ == 2) {
      ref = identities_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (identitiesCase_ == 2) {
        identities_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string id = 2 [json_name = "id", (.buf.validate.field) = { ... }</code>
   * @return The bytes for id.
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = "";
    if (identitiesCase_ == 2) {
      ref = identities_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (identitiesCase_ == 2) {
        identities_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTERNAL_ID_FIELD_NUMBER = 3;
  /**
   * <code>string external_id = 3 [json_name = "externalId"];</code>
   * @return Whether the externalId field is set.
   */
  public boolean hasExternalId() {
    return identitiesCase_ == 3;
  }
  /**
   * <code>string external_id = 3 [json_name = "externalId"];</code>
   * @return The externalId.
   */
  public java.lang.String getExternalId() {
    java.lang.Object ref = "";
    if (identitiesCase_ == 3) {
      ref = identities_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (identitiesCase_ == 3) {
        identities_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string external_id = 3 [json_name = "externalId"];</code>
   * @return The bytes for externalId.
   */
  public com.google.protobuf.ByteString
      getExternalIdBytes() {
    java.lang.Object ref = "";
    if (identitiesCase_ == 3) {
      ref = identities_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (identitiesCase_ == 3) {
        identities_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_FIELD_NUMBER = 4;
  private com.scalekit.grpc.scalekit.v1.users.UpdateUser user_;
  /**
   * <code>.scalekit.v1.users.UpdateUser user = 4 [json_name = "user", (.buf.validate.field) = { ... }</code>
   * @return Whether the user field is set.
   */
  @java.lang.Override
  public boolean hasUser() {
    return user_ != null;
  }
  /**
   * <code>.scalekit.v1.users.UpdateUser user = 4 [json_name = "user", (.buf.validate.field) = { ... }</code>
   * @return The user.
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.users.UpdateUser getUser() {
    return user_ == null ? com.scalekit.grpc.scalekit.v1.users.UpdateUser.getDefaultInstance() : user_;
  }
  /**
   * <code>.scalekit.v1.users.UpdateUser user = 4 [json_name = "user", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.users.UpdateUserOrBuilder getUserOrBuilder() {
    return user_ == null ? com.scalekit.grpc.scalekit.v1.users.UpdateUser.getDefaultInstance() : user_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(organizationId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, organizationId_);
    }
    if (identitiesCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, identities_);
    }
    if (identitiesCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, identities_);
    }
    if (user_ != null) {
      output.writeMessage(4, getUser());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(organizationId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, organizationId_);
    }
    if (identitiesCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, identities_);
    }
    if (identitiesCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, identities_);
    }
    if (user_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getUser());
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest other = (com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest) obj;

    if (!getOrganizationId()
        .equals(other.getOrganizationId())) return false;
    if (hasUser() != other.hasUser()) return false;
    if (hasUser()) {
      if (!getUser()
          .equals(other.getUser())) return false;
    }
    if (!getIdentitiesCase().equals(other.getIdentitiesCase())) return false;
    switch (identitiesCase_) {
      case 2:
        if (!getId()
            .equals(other.getId())) return false;
        break;
      case 3:
        if (!getExternalId()
            .equals(other.getExternalId())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + ORGANIZATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOrganizationId().hashCode();
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    switch (identitiesCase_) {
      case 2:
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId().hashCode();
        break;
      case 3:
        hash = (37 * hash) + EXTERNAL_ID_FIELD_NUMBER;
        hash = (53 * hash) + getExternalId().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest prototype) {
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
   * Protobuf type {@code scalekit.v1.users.UpdateUserRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.users.UpdateUserRequest)
      com.scalekit.grpc.scalekit.v1.users.UpdateUserRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.users.UsersProto.internal_static_scalekit_v1_users_UpdateUserRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.users.UsersProto.internal_static_scalekit_v1_users_UpdateUserRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest.class, com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest.newBuilder()
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
      organizationId_ = "";
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      identitiesCase_ = 0;
      identities_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.users.UsersProto.internal_static_scalekit_v1_users_UpdateUserRequest_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest build() {
      com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest buildPartial() {
      com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest result = new com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.organizationId_ = organizationId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.user_ = userBuilder_ == null
            ? user_
            : userBuilder_.build();
      }
    }

    private void buildPartialOneofs(com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest result) {
      result.identitiesCase_ = identitiesCase_;
      result.identities_ = this.identities_;
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest other) {
      if (other == com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest.getDefaultInstance()) return this;
      if (!other.getOrganizationId().isEmpty()) {
        organizationId_ = other.organizationId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      switch (other.getIdentitiesCase()) {
        case ID: {
          identitiesCase_ = 2;
          identities_ = other.identities_;
          onChanged();
          break;
        }
        case EXTERNAL_ID: {
          identitiesCase_ = 3;
          identities_ = other.identities_;
          onChanged();
          break;
        }
        case IDENTITIES_NOT_SET: {
          break;
        }
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
              organizationId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              identitiesCase_ = 2;
              identities_ = s;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              identitiesCase_ = 3;
              identities_ = s;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getUserFieldBuilder().getBuilder(),
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
    private int identitiesCase_ = 0;
    private java.lang.Object identities_;
    public IdentitiesCase
        getIdentitiesCase() {
      return IdentitiesCase.forNumber(
          identitiesCase_);
    }

    public Builder clearIdentities() {
      identitiesCase_ = 0;
      identities_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object organizationId_ = "";
    /**
     * <code>string organization_id = 1 [json_name = "organizationId"];</code>
     * @return The organizationId.
     */
    public java.lang.String getOrganizationId() {
      java.lang.Object ref = organizationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        organizationId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string organization_id = 1 [json_name = "organizationId"];</code>
     * @return The bytes for organizationId.
     */
    public com.google.protobuf.ByteString
        getOrganizationIdBytes() {
      java.lang.Object ref = organizationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        organizationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string organization_id = 1 [json_name = "organizationId"];</code>
     * @param value The organizationId to set.
     * @return This builder for chaining.
     */
    public Builder setOrganizationId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      organizationId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string organization_id = 1 [json_name = "organizationId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrganizationId() {
      organizationId_ = getDefaultInstance().getOrganizationId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string organization_id = 1 [json_name = "organizationId"];</code>
     * @param value The bytes for organizationId to set.
     * @return This builder for chaining.
     */
    public Builder setOrganizationIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      organizationId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     * <code>string id = 2 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return identitiesCase_ == 2;
    }
    /**
     * <code>string id = 2 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @return The id.
     */
    @java.lang.Override
    public java.lang.String getId() {
      java.lang.Object ref = "";
      if (identitiesCase_ == 2) {
        ref = identities_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (identitiesCase_ == 2) {
          identities_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 2 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @return The bytes for id.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = "";
      if (identitiesCase_ == 2) {
        ref = identities_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (identitiesCase_ == 2) {
          identities_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 2 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      identitiesCase_ = 2;
      identities_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 2 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      if (identitiesCase_ == 2) {
        identitiesCase_ = 0;
        identities_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string id = 2 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      identitiesCase_ = 2;
      identities_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string external_id = 3 [json_name = "externalId"];</code>
     * @return Whether the externalId field is set.
     */
    @java.lang.Override
    public boolean hasExternalId() {
      return identitiesCase_ == 3;
    }
    /**
     * <code>string external_id = 3 [json_name = "externalId"];</code>
     * @return The externalId.
     */
    @java.lang.Override
    public java.lang.String getExternalId() {
      java.lang.Object ref = "";
      if (identitiesCase_ == 3) {
        ref = identities_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (identitiesCase_ == 3) {
          identities_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string external_id = 3 [json_name = "externalId"];</code>
     * @return The bytes for externalId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getExternalIdBytes() {
      java.lang.Object ref = "";
      if (identitiesCase_ == 3) {
        ref = identities_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (identitiesCase_ == 3) {
          identities_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string external_id = 3 [json_name = "externalId"];</code>
     * @param value The externalId to set.
     * @return This builder for chaining.
     */
    public Builder setExternalId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      identitiesCase_ = 3;
      identities_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string external_id = 3 [json_name = "externalId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExternalId() {
      if (identitiesCase_ == 3) {
        identitiesCase_ = 0;
        identities_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string external_id = 3 [json_name = "externalId"];</code>
     * @param value The bytes for externalId to set.
     * @return This builder for chaining.
     */
    public Builder setExternalIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      identitiesCase_ = 3;
      identities_ = value;
      onChanged();
      return this;
    }

    private com.scalekit.grpc.scalekit.v1.users.UpdateUser user_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.users.UpdateUser, com.scalekit.grpc.scalekit.v1.users.UpdateUser.Builder, com.scalekit.grpc.scalekit.v1.users.UpdateUserOrBuilder> userBuilder_;
    /**
     * <code>.scalekit.v1.users.UpdateUser user = 4 [json_name = "user", (.buf.validate.field) = { ... }</code>
     * @return Whether the user field is set.
     */
    public boolean hasUser() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.scalekit.v1.users.UpdateUser user = 4 [json_name = "user", (.buf.validate.field) = { ... }</code>
     * @return The user.
     */
    public com.scalekit.grpc.scalekit.v1.users.UpdateUser getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? com.scalekit.grpc.scalekit.v1.users.UpdateUser.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <code>.scalekit.v1.users.UpdateUser user = 4 [json_name = "user", (.buf.validate.field) = { ... }</code>
     */
    public Builder setUser(com.scalekit.grpc.scalekit.v1.users.UpdateUser value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
      } else {
        userBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.users.UpdateUser user = 4 [json_name = "user", (.buf.validate.field) = { ... }</code>
     */
    public Builder setUser(
        com.scalekit.grpc.scalekit.v1.users.UpdateUser.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.users.UpdateUser user = 4 [json_name = "user", (.buf.validate.field) = { ... }</code>
     */
    public Builder mergeUser(com.scalekit.grpc.scalekit.v1.users.UpdateUser value) {
      if (userBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          user_ != null &&
          user_ != com.scalekit.grpc.scalekit.v1.users.UpdateUser.getDefaultInstance()) {
          getUserBuilder().mergeFrom(value);
        } else {
          user_ = value;
        }
      } else {
        userBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.users.UpdateUser user = 4 [json_name = "user", (.buf.validate.field) = { ... }</code>
     */
    public Builder clearUser() {
      bitField0_ = (bitField0_ & ~0x00000008);
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.users.UpdateUser user = 4 [json_name = "user", (.buf.validate.field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.users.UpdateUser.Builder getUserBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <code>.scalekit.v1.users.UpdateUser user = 4 [json_name = "user", (.buf.validate.field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.users.UpdateUserOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            com.scalekit.grpc.scalekit.v1.users.UpdateUser.getDefaultInstance() : user_;
      }
    }
    /**
     * <code>.scalekit.v1.users.UpdateUser user = 4 [json_name = "user", (.buf.validate.field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.users.UpdateUser, com.scalekit.grpc.scalekit.v1.users.UpdateUser.Builder, com.scalekit.grpc.scalekit.v1.users.UpdateUserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.users.UpdateUser, com.scalekit.grpc.scalekit.v1.users.UpdateUser.Builder, com.scalekit.grpc.scalekit.v1.users.UpdateUserOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.users.UpdateUserRequest)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.users.UpdateUserRequest)
  private static final com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest();
  }

  public static com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateUserRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateUserRequest>() {
    @java.lang.Override
    public UpdateUserRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateUserRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateUserRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
