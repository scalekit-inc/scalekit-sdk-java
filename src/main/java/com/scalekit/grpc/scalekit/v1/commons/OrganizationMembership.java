// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/commons/commons.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.commons;

/**
 * Protobuf type {@code scalekit.v1.commons.OrganizationMembership}
 */
public final class OrganizationMembership extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.commons.OrganizationMembership)
    OrganizationMembershipOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrganizationMembership.newBuilder() to construct.
  private OrganizationMembership(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrganizationMembership() {
    id_ = "";
    membershipStatus_ = 0;
    role_ = 0;
    name_ = "";
    primaryIdentityProvider_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OrganizationMembership();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.commons.CommonsProto.internal_static_scalekit_v1_commons_OrganizationMembership_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.commons.CommonsProto.internal_static_scalekit_v1_commons_OrganizationMembership_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership.class, com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <code>string id = 1 [json_name = "id"];</code>
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
   * <code>string id = 1 [json_name = "id"];</code>
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

  public static final int MEMBERSHIP_STATUS_FIELD_NUMBER = 2;
  private int membershipStatus_ = 0;
  /**
   * <code>.scalekit.v1.commons.UserStatus membership_status = 2 [json_name = "membershipStatus"];</code>
   * @return The enum numeric value on the wire for membershipStatus.
   */
  @java.lang.Override public int getMembershipStatusValue() {
    return membershipStatus_;
  }
  /**
   * <code>.scalekit.v1.commons.UserStatus membership_status = 2 [json_name = "membershipStatus"];</code>
   * @return The membershipStatus.
   */
  @java.lang.Override public com.scalekit.grpc.scalekit.v1.commons.UserStatus getMembershipStatus() {
    com.scalekit.grpc.scalekit.v1.commons.UserStatus result = com.scalekit.grpc.scalekit.v1.commons.UserStatus.forNumber(membershipStatus_);
    return result == null ? com.scalekit.grpc.scalekit.v1.commons.UserStatus.UNRECOGNIZED : result;
  }

  public static final int ROLE_FIELD_NUMBER = 3;
  private int role_ = 0;
  /**
   * <code>.scalekit.v1.commons.MembershipRole role = 3 [json_name = "role"];</code>
   * @return The enum numeric value on the wire for role.
   */
  @java.lang.Override public int getRoleValue() {
    return role_;
  }
  /**
   * <code>.scalekit.v1.commons.MembershipRole role = 3 [json_name = "role"];</code>
   * @return The role.
   */
  @java.lang.Override public com.scalekit.grpc.scalekit.v1.commons.MembershipRole getRole() {
    com.scalekit.grpc.scalekit.v1.commons.MembershipRole result = com.scalekit.grpc.scalekit.v1.commons.MembershipRole.forNumber(role_);
    return result == null ? com.scalekit.grpc.scalekit.v1.commons.MembershipRole.UNRECOGNIZED : result;
  }

  public static final int NAME_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>optional string name = 4 [json_name = "name"];</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string name = 4 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>optional string name = 4 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRIMARY_IDENTITY_PROVIDER_FIELD_NUMBER = 5;
  private int primaryIdentityProvider_ = 0;
  /**
   * <code>.scalekit.v1.commons.IdentityProviderType primary_identity_provider = 5 [json_name = "primaryIdentityProvider"];</code>
   * @return The enum numeric value on the wire for primaryIdentityProvider.
   */
  @java.lang.Override public int getPrimaryIdentityProviderValue() {
    return primaryIdentityProvider_;
  }
  /**
   * <code>.scalekit.v1.commons.IdentityProviderType primary_identity_provider = 5 [json_name = "primaryIdentityProvider"];</code>
   * @return The primaryIdentityProvider.
   */
  @java.lang.Override public com.scalekit.grpc.scalekit.v1.commons.IdentityProviderType getPrimaryIdentityProvider() {
    com.scalekit.grpc.scalekit.v1.commons.IdentityProviderType result = com.scalekit.grpc.scalekit.v1.commons.IdentityProviderType.forNumber(primaryIdentityProvider_);
    return result == null ? com.scalekit.grpc.scalekit.v1.commons.IdentityProviderType.UNRECOGNIZED : result;
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
    if (membershipStatus_ != com.scalekit.grpc.scalekit.v1.commons.UserStatus.USER_STATUS_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, membershipStatus_);
    }
    if (role_ != com.scalekit.grpc.scalekit.v1.commons.MembershipRole.MEMBERSHIP_ROLE_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, role_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, name_);
    }
    if (primaryIdentityProvider_ != com.scalekit.grpc.scalekit.v1.commons.IdentityProviderType.IDENTITY_PROVIDER_UNSPECIFIED.getNumber()) {
      output.writeEnum(5, primaryIdentityProvider_);
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
    if (membershipStatus_ != com.scalekit.grpc.scalekit.v1.commons.UserStatus.USER_STATUS_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, membershipStatus_);
    }
    if (role_ != com.scalekit.grpc.scalekit.v1.commons.MembershipRole.MEMBERSHIP_ROLE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, role_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, name_);
    }
    if (primaryIdentityProvider_ != com.scalekit.grpc.scalekit.v1.commons.IdentityProviderType.IDENTITY_PROVIDER_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, primaryIdentityProvider_);
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership other = (com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (membershipStatus_ != other.membershipStatus_) return false;
    if (role_ != other.role_) return false;
    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
    if (primaryIdentityProvider_ != other.primaryIdentityProvider_) return false;
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
    hash = (37 * hash) + MEMBERSHIP_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + membershipStatus_;
    hash = (37 * hash) + ROLE_FIELD_NUMBER;
    hash = (53 * hash) + role_;
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    hash = (37 * hash) + PRIMARY_IDENTITY_PROVIDER_FIELD_NUMBER;
    hash = (53 * hash) + primaryIdentityProvider_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership prototype) {
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
   * Protobuf type {@code scalekit.v1.commons.OrganizationMembership}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.commons.OrganizationMembership)
      com.scalekit.grpc.scalekit.v1.commons.OrganizationMembershipOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.commons.CommonsProto.internal_static_scalekit_v1_commons_OrganizationMembership_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.commons.CommonsProto.internal_static_scalekit_v1_commons_OrganizationMembership_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership.class, com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership.newBuilder()
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
      membershipStatus_ = 0;
      role_ = 0;
      name_ = "";
      primaryIdentityProvider_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.commons.CommonsProto.internal_static_scalekit_v1_commons_OrganizationMembership_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership build() {
      com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership buildPartial() {
      com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership result = new com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.membershipStatus_ = membershipStatus_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.role_ = role_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.name_ = name_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.primaryIdentityProvider_ = primaryIdentityProvider_;
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership other) {
      if (other == com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.membershipStatus_ != 0) {
        setMembershipStatusValue(other.getMembershipStatusValue());
      }
      if (other.role_ != 0) {
        setRoleValue(other.getRoleValue());
      }
      if (other.hasName()) {
        name_ = other.name_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.primaryIdentityProvider_ != 0) {
        setPrimaryIdentityProviderValue(other.getPrimaryIdentityProviderValue());
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
            case 16: {
              membershipStatus_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              role_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              primaryIdentityProvider_ = input.readEnum();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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
     * <code>string id = 1 [json_name = "id"];</code>
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
     * <code>string id = 1 [json_name = "id"];</code>
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
     * <code>string id = 1 [json_name = "id"];</code>
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
     * <code>string id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1 [json_name = "id"];</code>
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

    private int membershipStatus_ = 0;
    /**
     * <code>.scalekit.v1.commons.UserStatus membership_status = 2 [json_name = "membershipStatus"];</code>
     * @return The enum numeric value on the wire for membershipStatus.
     */
    @java.lang.Override public int getMembershipStatusValue() {
      return membershipStatus_;
    }
    /**
     * <code>.scalekit.v1.commons.UserStatus membership_status = 2 [json_name = "membershipStatus"];</code>
     * @param value The enum numeric value on the wire for membershipStatus to set.
     * @return This builder for chaining.
     */
    public Builder setMembershipStatusValue(int value) {
      membershipStatus_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.commons.UserStatus membership_status = 2 [json_name = "membershipStatus"];</code>
     * @return The membershipStatus.
     */
    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.commons.UserStatus getMembershipStatus() {
      com.scalekit.grpc.scalekit.v1.commons.UserStatus result = com.scalekit.grpc.scalekit.v1.commons.UserStatus.forNumber(membershipStatus_);
      return result == null ? com.scalekit.grpc.scalekit.v1.commons.UserStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.scalekit.v1.commons.UserStatus membership_status = 2 [json_name = "membershipStatus"];</code>
     * @param value The membershipStatus to set.
     * @return This builder for chaining.
     */
    public Builder setMembershipStatus(com.scalekit.grpc.scalekit.v1.commons.UserStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      membershipStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.commons.UserStatus membership_status = 2 [json_name = "membershipStatus"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMembershipStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
      membershipStatus_ = 0;
      onChanged();
      return this;
    }

    private int role_ = 0;
    /**
     * <code>.scalekit.v1.commons.MembershipRole role = 3 [json_name = "role"];</code>
     * @return The enum numeric value on the wire for role.
     */
    @java.lang.Override public int getRoleValue() {
      return role_;
    }
    /**
     * <code>.scalekit.v1.commons.MembershipRole role = 3 [json_name = "role"];</code>
     * @param value The enum numeric value on the wire for role to set.
     * @return This builder for chaining.
     */
    public Builder setRoleValue(int value) {
      role_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.commons.MembershipRole role = 3 [json_name = "role"];</code>
     * @return The role.
     */
    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.commons.MembershipRole getRole() {
      com.scalekit.grpc.scalekit.v1.commons.MembershipRole result = com.scalekit.grpc.scalekit.v1.commons.MembershipRole.forNumber(role_);
      return result == null ? com.scalekit.grpc.scalekit.v1.commons.MembershipRole.UNRECOGNIZED : result;
    }
    /**
     * <code>.scalekit.v1.commons.MembershipRole role = 3 [json_name = "role"];</code>
     * @param value The role to set.
     * @return This builder for chaining.
     */
    public Builder setRole(com.scalekit.grpc.scalekit.v1.commons.MembershipRole value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      role_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.commons.MembershipRole role = 3 [json_name = "role"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRole() {
      bitField0_ = (bitField0_ & ~0x00000004);
      role_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 4 [json_name = "name"];</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional string name = 4 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 4 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 4 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 4 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 4 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private int primaryIdentityProvider_ = 0;
    /**
     * <code>.scalekit.v1.commons.IdentityProviderType primary_identity_provider = 5 [json_name = "primaryIdentityProvider"];</code>
     * @return The enum numeric value on the wire for primaryIdentityProvider.
     */
    @java.lang.Override public int getPrimaryIdentityProviderValue() {
      return primaryIdentityProvider_;
    }
    /**
     * <code>.scalekit.v1.commons.IdentityProviderType primary_identity_provider = 5 [json_name = "primaryIdentityProvider"];</code>
     * @param value The enum numeric value on the wire for primaryIdentityProvider to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryIdentityProviderValue(int value) {
      primaryIdentityProvider_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.commons.IdentityProviderType primary_identity_provider = 5 [json_name = "primaryIdentityProvider"];</code>
     * @return The primaryIdentityProvider.
     */
    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.commons.IdentityProviderType getPrimaryIdentityProvider() {
      com.scalekit.grpc.scalekit.v1.commons.IdentityProviderType result = com.scalekit.grpc.scalekit.v1.commons.IdentityProviderType.forNumber(primaryIdentityProvider_);
      return result == null ? com.scalekit.grpc.scalekit.v1.commons.IdentityProviderType.UNRECOGNIZED : result;
    }
    /**
     * <code>.scalekit.v1.commons.IdentityProviderType primary_identity_provider = 5 [json_name = "primaryIdentityProvider"];</code>
     * @param value The primaryIdentityProvider to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryIdentityProvider(com.scalekit.grpc.scalekit.v1.commons.IdentityProviderType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      primaryIdentityProvider_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.commons.IdentityProviderType primary_identity_provider = 5 [json_name = "primaryIdentityProvider"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPrimaryIdentityProvider() {
      bitField0_ = (bitField0_ & ~0x00000010);
      primaryIdentityProvider_ = 0;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.commons.OrganizationMembership)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.commons.OrganizationMembership)
  private static final com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership();
  }

  public static com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrganizationMembership>
      PARSER = new com.google.protobuf.AbstractParser<OrganizationMembership>() {
    @java.lang.Override
    public OrganizationMembership parsePartialFrom(
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

  public static com.google.protobuf.Parser<OrganizationMembership> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrganizationMembership> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.commons.OrganizationMembership getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

