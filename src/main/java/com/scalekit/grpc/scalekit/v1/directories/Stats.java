// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/directories/directories.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.directories;

/**
 * Protobuf type {@code scalekit.v1.directories.Stats}
 */
public final class Stats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.directories.Stats)
    StatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Stats.newBuilder() to construct.
  private Stats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Stats() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Stats();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_Stats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_Stats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.directories.Stats.class, com.scalekit.grpc.scalekit.v1.directories.Stats.Builder.class);
  }

  private int bitField0_;
  public static final int TOTAL_USERS_FIELD_NUMBER = 1;
  private int totalUsers_ = 0;
  /**
   * <code>int32 total_users = 1 [json_name = "totalUsers", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The totalUsers.
   */
  @java.lang.Override
  public int getTotalUsers() {
    return totalUsers_;
  }

  public static final int TOTAL_GROUPS_FIELD_NUMBER = 2;
  private int totalGroups_ = 0;
  /**
   * <code>int32 total_groups = 2 [json_name = "totalGroups", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The totalGroups.
   */
  @java.lang.Override
  public int getTotalGroups() {
    return totalGroups_;
  }

  public static final int GROUP_UPDATED_AT_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp groupUpdatedAt_;
  /**
   * <code>.google.protobuf.Timestamp group_updated_at = 3 [json_name = "groupUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the groupUpdatedAt field is set.
   */
  @java.lang.Override
  public boolean hasGroupUpdatedAt() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.protobuf.Timestamp group_updated_at = 3 [json_name = "groupUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The groupUpdatedAt.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getGroupUpdatedAt() {
    return groupUpdatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : groupUpdatedAt_;
  }
  /**
   * <code>.google.protobuf.Timestamp group_updated_at = 3 [json_name = "groupUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getGroupUpdatedAtOrBuilder() {
    return groupUpdatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : groupUpdatedAt_;
  }

  public static final int USER_UPDATED_AT_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp userUpdatedAt_;
  /**
   * <code>.google.protobuf.Timestamp user_updated_at = 4 [json_name = "userUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the userUpdatedAt field is set.
   */
  @java.lang.Override
  public boolean hasUserUpdatedAt() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.google.protobuf.Timestamp user_updated_at = 4 [json_name = "userUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The userUpdatedAt.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUserUpdatedAt() {
    return userUpdatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : userUpdatedAt_;
  }
  /**
   * <code>.google.protobuf.Timestamp user_updated_at = 4 [json_name = "userUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUserUpdatedAtOrBuilder() {
    return userUpdatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : userUpdatedAt_;
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
    if (totalUsers_ != 0) {
      output.writeInt32(1, totalUsers_);
    }
    if (totalGroups_ != 0) {
      output.writeInt32(2, totalGroups_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getGroupUpdatedAt());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(4, getUserUpdatedAt());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (totalUsers_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, totalUsers_);
    }
    if (totalGroups_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, totalGroups_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getGroupUpdatedAt());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getUserUpdatedAt());
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.directories.Stats)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.directories.Stats other = (com.scalekit.grpc.scalekit.v1.directories.Stats) obj;

    if (getTotalUsers()
        != other.getTotalUsers()) return false;
    if (getTotalGroups()
        != other.getTotalGroups()) return false;
    if (hasGroupUpdatedAt() != other.hasGroupUpdatedAt()) return false;
    if (hasGroupUpdatedAt()) {
      if (!getGroupUpdatedAt()
          .equals(other.getGroupUpdatedAt())) return false;
    }
    if (hasUserUpdatedAt() != other.hasUserUpdatedAt()) return false;
    if (hasUserUpdatedAt()) {
      if (!getUserUpdatedAt()
          .equals(other.getUserUpdatedAt())) return false;
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
    hash = (37 * hash) + TOTAL_USERS_FIELD_NUMBER;
    hash = (53 * hash) + getTotalUsers();
    hash = (37 * hash) + TOTAL_GROUPS_FIELD_NUMBER;
    hash = (53 * hash) + getTotalGroups();
    if (hasGroupUpdatedAt()) {
      hash = (37 * hash) + GROUP_UPDATED_AT_FIELD_NUMBER;
      hash = (53 * hash) + getGroupUpdatedAt().hashCode();
    }
    if (hasUserUpdatedAt()) {
      hash = (37 * hash) + USER_UPDATED_AT_FIELD_NUMBER;
      hash = (53 * hash) + getUserUpdatedAt().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.directories.Stats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.Stats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.Stats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.Stats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.Stats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.Stats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.Stats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.Stats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.directories.Stats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.directories.Stats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.Stats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.Stats parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.directories.Stats prototype) {
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
   * Protobuf type {@code scalekit.v1.directories.Stats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.directories.Stats)
      com.scalekit.grpc.scalekit.v1.directories.StatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_Stats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_Stats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.directories.Stats.class, com.scalekit.grpc.scalekit.v1.directories.Stats.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.directories.Stats.newBuilder()
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
        getGroupUpdatedAtFieldBuilder();
        getUserUpdatedAtFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      totalUsers_ = 0;
      totalGroups_ = 0;
      groupUpdatedAt_ = null;
      if (groupUpdatedAtBuilder_ != null) {
        groupUpdatedAtBuilder_.dispose();
        groupUpdatedAtBuilder_ = null;
      }
      userUpdatedAt_ = null;
      if (userUpdatedAtBuilder_ != null) {
        userUpdatedAtBuilder_.dispose();
        userUpdatedAtBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_Stats_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.directories.Stats getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.directories.Stats.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.directories.Stats build() {
      com.scalekit.grpc.scalekit.v1.directories.Stats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.directories.Stats buildPartial() {
      com.scalekit.grpc.scalekit.v1.directories.Stats result = new com.scalekit.grpc.scalekit.v1.directories.Stats(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.directories.Stats result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.totalUsers_ = totalUsers_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.totalGroups_ = totalGroups_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.groupUpdatedAt_ = groupUpdatedAtBuilder_ == null
            ? groupUpdatedAt_
            : groupUpdatedAtBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.userUpdatedAt_ = userUpdatedAtBuilder_ == null
            ? userUpdatedAt_
            : userUpdatedAtBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.directories.Stats) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.directories.Stats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.directories.Stats other) {
      if (other == com.scalekit.grpc.scalekit.v1.directories.Stats.getDefaultInstance()) return this;
      if (other.getTotalUsers() != 0) {
        setTotalUsers(other.getTotalUsers());
      }
      if (other.getTotalGroups() != 0) {
        setTotalGroups(other.getTotalGroups());
      }
      if (other.hasGroupUpdatedAt()) {
        mergeGroupUpdatedAt(other.getGroupUpdatedAt());
      }
      if (other.hasUserUpdatedAt()) {
        mergeUserUpdatedAt(other.getUserUpdatedAt());
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
              totalUsers_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              totalGroups_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getGroupUpdatedAtFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getUserUpdatedAtFieldBuilder().getBuilder(),
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
    private int bitField0_;

    private int totalUsers_ ;
    /**
     * <code>int32 total_users = 1 [json_name = "totalUsers", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The totalUsers.
     */
    @java.lang.Override
    public int getTotalUsers() {
      return totalUsers_;
    }
    /**
     * <code>int32 total_users = 1 [json_name = "totalUsers", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The totalUsers to set.
     * @return This builder for chaining.
     */
    public Builder setTotalUsers(int value) {

      totalUsers_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 total_users = 1 [json_name = "totalUsers", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalUsers() {
      bitField0_ = (bitField0_ & ~0x00000001);
      totalUsers_ = 0;
      onChanged();
      return this;
    }

    private int totalGroups_ ;
    /**
     * <code>int32 total_groups = 2 [json_name = "totalGroups", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The totalGroups.
     */
    @java.lang.Override
    public int getTotalGroups() {
      return totalGroups_;
    }
    /**
     * <code>int32 total_groups = 2 [json_name = "totalGroups", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The totalGroups to set.
     * @return This builder for chaining.
     */
    public Builder setTotalGroups(int value) {

      totalGroups_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 total_groups = 2 [json_name = "totalGroups", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalGroups() {
      bitField0_ = (bitField0_ & ~0x00000002);
      totalGroups_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp groupUpdatedAt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> groupUpdatedAtBuilder_;
    /**
     * <code>.google.protobuf.Timestamp group_updated_at = 3 [json_name = "groupUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the groupUpdatedAt field is set.
     */
    public boolean hasGroupUpdatedAt() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp group_updated_at = 3 [json_name = "groupUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The groupUpdatedAt.
     */
    public com.google.protobuf.Timestamp getGroupUpdatedAt() {
      if (groupUpdatedAtBuilder_ == null) {
        return groupUpdatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : groupUpdatedAt_;
      } else {
        return groupUpdatedAtBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp group_updated_at = 3 [json_name = "groupUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setGroupUpdatedAt(com.google.protobuf.Timestamp value) {
      if (groupUpdatedAtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        groupUpdatedAt_ = value;
      } else {
        groupUpdatedAtBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp group_updated_at = 3 [json_name = "groupUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setGroupUpdatedAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (groupUpdatedAtBuilder_ == null) {
        groupUpdatedAt_ = builderForValue.build();
      } else {
        groupUpdatedAtBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp group_updated_at = 3 [json_name = "groupUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder mergeGroupUpdatedAt(com.google.protobuf.Timestamp value) {
      if (groupUpdatedAtBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          groupUpdatedAt_ != null &&
          groupUpdatedAt_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getGroupUpdatedAtBuilder().mergeFrom(value);
        } else {
          groupUpdatedAt_ = value;
        }
      } else {
        groupUpdatedAtBuilder_.mergeFrom(value);
      }
      if (groupUpdatedAt_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp group_updated_at = 3 [json_name = "groupUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder clearGroupUpdatedAt() {
      bitField0_ = (bitField0_ & ~0x00000004);
      groupUpdatedAt_ = null;
      if (groupUpdatedAtBuilder_ != null) {
        groupUpdatedAtBuilder_.dispose();
        groupUpdatedAtBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp group_updated_at = 3 [json_name = "groupUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.google.protobuf.Timestamp.Builder getGroupUpdatedAtBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getGroupUpdatedAtFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp group_updated_at = 3 [json_name = "groupUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.google.protobuf.TimestampOrBuilder getGroupUpdatedAtOrBuilder() {
      if (groupUpdatedAtBuilder_ != null) {
        return groupUpdatedAtBuilder_.getMessageOrBuilder();
      } else {
        return groupUpdatedAt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : groupUpdatedAt_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp group_updated_at = 3 [json_name = "groupUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getGroupUpdatedAtFieldBuilder() {
      if (groupUpdatedAtBuilder_ == null) {
        groupUpdatedAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getGroupUpdatedAt(),
                getParentForChildren(),
                isClean());
        groupUpdatedAt_ = null;
      }
      return groupUpdatedAtBuilder_;
    }

    private com.google.protobuf.Timestamp userUpdatedAt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> userUpdatedAtBuilder_;
    /**
     * <code>.google.protobuf.Timestamp user_updated_at = 4 [json_name = "userUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the userUpdatedAt field is set.
     */
    public boolean hasUserUpdatedAt() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp user_updated_at = 4 [json_name = "userUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The userUpdatedAt.
     */
    public com.google.protobuf.Timestamp getUserUpdatedAt() {
      if (userUpdatedAtBuilder_ == null) {
        return userUpdatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : userUpdatedAt_;
      } else {
        return userUpdatedAtBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp user_updated_at = 4 [json_name = "userUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setUserUpdatedAt(com.google.protobuf.Timestamp value) {
      if (userUpdatedAtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userUpdatedAt_ = value;
      } else {
        userUpdatedAtBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp user_updated_at = 4 [json_name = "userUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setUserUpdatedAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (userUpdatedAtBuilder_ == null) {
        userUpdatedAt_ = builderForValue.build();
      } else {
        userUpdatedAtBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp user_updated_at = 4 [json_name = "userUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder mergeUserUpdatedAt(com.google.protobuf.Timestamp value) {
      if (userUpdatedAtBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          userUpdatedAt_ != null &&
          userUpdatedAt_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getUserUpdatedAtBuilder().mergeFrom(value);
        } else {
          userUpdatedAt_ = value;
        }
      } else {
        userUpdatedAtBuilder_.mergeFrom(value);
      }
      if (userUpdatedAt_ != null) {
        bitField0_ |= 0x00000008;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp user_updated_at = 4 [json_name = "userUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder clearUserUpdatedAt() {
      bitField0_ = (bitField0_ & ~0x00000008);
      userUpdatedAt_ = null;
      if (userUpdatedAtBuilder_ != null) {
        userUpdatedAtBuilder_.dispose();
        userUpdatedAtBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp user_updated_at = 4 [json_name = "userUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.google.protobuf.Timestamp.Builder getUserUpdatedAtBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getUserUpdatedAtFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp user_updated_at = 4 [json_name = "userUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUserUpdatedAtOrBuilder() {
      if (userUpdatedAtBuilder_ != null) {
        return userUpdatedAtBuilder_.getMessageOrBuilder();
      } else {
        return userUpdatedAt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : userUpdatedAt_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp user_updated_at = 4 [json_name = "userUpdatedAt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getUserUpdatedAtFieldBuilder() {
      if (userUpdatedAtBuilder_ == null) {
        userUpdatedAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getUserUpdatedAt(),
                getParentForChildren(),
                isClean());
        userUpdatedAt_ = null;
      }
      return userUpdatedAtBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.directories.Stats)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.directories.Stats)
  private static final com.scalekit.grpc.scalekit.v1.directories.Stats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.directories.Stats();
  }

  public static com.scalekit.grpc.scalekit.v1.directories.Stats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Stats>
      PARSER = new com.google.protobuf.AbstractParser<Stats>() {
    @java.lang.Override
    public Stats parsePartialFrom(
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

  public static com.google.protobuf.Parser<Stats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Stats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.directories.Stats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
