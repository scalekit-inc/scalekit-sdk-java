// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/directories/directories.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.directories;

/**
 * Protobuf type {@code scalekit.v1.directories.AssignRolesResponse}
 */
public final class AssignRolesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.directories.AssignRolesResponse)
    AssignRolesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssignRolesResponse.newBuilder() to construct.
  private AssignRolesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssignRolesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssignRolesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_AssignRolesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_AssignRolesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse.class, com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ROLE_ASSIGNMENTS_FIELD_NUMBER = 1;
  private com.scalekit.grpc.scalekit.v1.directories.RoleAssignments roleAssignments_;
  /**
   * <code>.scalekit.v1.directories.RoleAssignments role_assignments = 1 [json_name = "roleAssignments"];</code>
   * @return Whether the roleAssignments field is set.
   */
  @java.lang.Override
  public boolean hasRoleAssignments() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.scalekit.v1.directories.RoleAssignments role_assignments = 1 [json_name = "roleAssignments"];</code>
   * @return The roleAssignments.
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.directories.RoleAssignments getRoleAssignments() {
    return roleAssignments_ == null ? com.scalekit.grpc.scalekit.v1.directories.RoleAssignments.getDefaultInstance() : roleAssignments_;
  }
  /**
   * <code>.scalekit.v1.directories.RoleAssignments role_assignments = 1 [json_name = "roleAssignments"];</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.directories.RoleAssignmentsOrBuilder getRoleAssignmentsOrBuilder() {
    return roleAssignments_ == null ? com.scalekit.grpc.scalekit.v1.directories.RoleAssignments.getDefaultInstance() : roleAssignments_;
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
      output.writeMessage(1, getRoleAssignments());
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
        .computeMessageSize(1, getRoleAssignments());
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse other = (com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse) obj;

    if (hasRoleAssignments() != other.hasRoleAssignments()) return false;
    if (hasRoleAssignments()) {
      if (!getRoleAssignments()
          .equals(other.getRoleAssignments())) return false;
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
    if (hasRoleAssignments()) {
      hash = (37 * hash) + ROLE_ASSIGNMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getRoleAssignments().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse prototype) {
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
   * Protobuf type {@code scalekit.v1.directories.AssignRolesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.directories.AssignRolesResponse)
      com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_AssignRolesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_AssignRolesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse.class, com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse.newBuilder()
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
        getRoleAssignmentsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      roleAssignments_ = null;
      if (roleAssignmentsBuilder_ != null) {
        roleAssignmentsBuilder_.dispose();
        roleAssignmentsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_AssignRolesResponse_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse build() {
      com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse buildPartial() {
      com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse result = new com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.roleAssignments_ = roleAssignmentsBuilder_ == null
            ? roleAssignments_
            : roleAssignmentsBuilder_.build();
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse other) {
      if (other == com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse.getDefaultInstance()) return this;
      if (other.hasRoleAssignments()) {
        mergeRoleAssignments(other.getRoleAssignments());
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
                  getRoleAssignmentsFieldBuilder().getBuilder(),
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

    private com.scalekit.grpc.scalekit.v1.directories.RoleAssignments roleAssignments_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.directories.RoleAssignments, com.scalekit.grpc.scalekit.v1.directories.RoleAssignments.Builder, com.scalekit.grpc.scalekit.v1.directories.RoleAssignmentsOrBuilder> roleAssignmentsBuilder_;
    /**
     * <code>.scalekit.v1.directories.RoleAssignments role_assignments = 1 [json_name = "roleAssignments"];</code>
     * @return Whether the roleAssignments field is set.
     */
    public boolean hasRoleAssignments() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.scalekit.v1.directories.RoleAssignments role_assignments = 1 [json_name = "roleAssignments"];</code>
     * @return The roleAssignments.
     */
    public com.scalekit.grpc.scalekit.v1.directories.RoleAssignments getRoleAssignments() {
      if (roleAssignmentsBuilder_ == null) {
        return roleAssignments_ == null ? com.scalekit.grpc.scalekit.v1.directories.RoleAssignments.getDefaultInstance() : roleAssignments_;
      } else {
        return roleAssignmentsBuilder_.getMessage();
      }
    }
    /**
     * <code>.scalekit.v1.directories.RoleAssignments role_assignments = 1 [json_name = "roleAssignments"];</code>
     */
    public Builder setRoleAssignments(com.scalekit.grpc.scalekit.v1.directories.RoleAssignments value) {
      if (roleAssignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        roleAssignments_ = value;
      } else {
        roleAssignmentsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.directories.RoleAssignments role_assignments = 1 [json_name = "roleAssignments"];</code>
     */
    public Builder setRoleAssignments(
        com.scalekit.grpc.scalekit.v1.directories.RoleAssignments.Builder builderForValue) {
      if (roleAssignmentsBuilder_ == null) {
        roleAssignments_ = builderForValue.build();
      } else {
        roleAssignmentsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.directories.RoleAssignments role_assignments = 1 [json_name = "roleAssignments"];</code>
     */
    public Builder mergeRoleAssignments(com.scalekit.grpc.scalekit.v1.directories.RoleAssignments value) {
      if (roleAssignmentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          roleAssignments_ != null &&
          roleAssignments_ != com.scalekit.grpc.scalekit.v1.directories.RoleAssignments.getDefaultInstance()) {
          getRoleAssignmentsBuilder().mergeFrom(value);
        } else {
          roleAssignments_ = value;
        }
      } else {
        roleAssignmentsBuilder_.mergeFrom(value);
      }
      if (roleAssignments_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.scalekit.v1.directories.RoleAssignments role_assignments = 1 [json_name = "roleAssignments"];</code>
     */
    public Builder clearRoleAssignments() {
      bitField0_ = (bitField0_ & ~0x00000001);
      roleAssignments_ = null;
      if (roleAssignmentsBuilder_ != null) {
        roleAssignmentsBuilder_.dispose();
        roleAssignmentsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.directories.RoleAssignments role_assignments = 1 [json_name = "roleAssignments"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.directories.RoleAssignments.Builder getRoleAssignmentsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRoleAssignmentsFieldBuilder().getBuilder();
    }
    /**
     * <code>.scalekit.v1.directories.RoleAssignments role_assignments = 1 [json_name = "roleAssignments"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.directories.RoleAssignmentsOrBuilder getRoleAssignmentsOrBuilder() {
      if (roleAssignmentsBuilder_ != null) {
        return roleAssignmentsBuilder_.getMessageOrBuilder();
      } else {
        return roleAssignments_ == null ?
            com.scalekit.grpc.scalekit.v1.directories.RoleAssignments.getDefaultInstance() : roleAssignments_;
      }
    }
    /**
     * <code>.scalekit.v1.directories.RoleAssignments role_assignments = 1 [json_name = "roleAssignments"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.directories.RoleAssignments, com.scalekit.grpc.scalekit.v1.directories.RoleAssignments.Builder, com.scalekit.grpc.scalekit.v1.directories.RoleAssignmentsOrBuilder> 
        getRoleAssignmentsFieldBuilder() {
      if (roleAssignmentsBuilder_ == null) {
        roleAssignmentsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.directories.RoleAssignments, com.scalekit.grpc.scalekit.v1.directories.RoleAssignments.Builder, com.scalekit.grpc.scalekit.v1.directories.RoleAssignmentsOrBuilder>(
                getRoleAssignments(),
                getParentForChildren(),
                isClean());
        roleAssignments_ = null;
      }
      return roleAssignmentsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.directories.AssignRolesResponse)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.directories.AssignRolesResponse)
  private static final com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse();
  }

  public static com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssignRolesResponse>
      PARSER = new com.google.protobuf.AbstractParser<AssignRolesResponse>() {
    @java.lang.Override
    public AssignRolesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssignRolesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssignRolesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

