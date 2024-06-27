// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/workspaces/workspaces.proto

package com.scalekit.grpc.scalekit.v1.workspaces;

/**
 * Protobuf type {@code scalekit.v1.workspaces.CreateWorkspaceRequest}
 */
public final class CreateWorkspaceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.workspaces.CreateWorkspaceRequest)
    CreateWorkspaceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateWorkspaceRequest.newBuilder() to construct.
  private CreateWorkspaceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateWorkspaceRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateWorkspaceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.workspaces.WorkspacesProto.internal_static_scalekit_v1_workspaces_CreateWorkspaceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.workspaces.WorkspacesProto.internal_static_scalekit_v1_workspaces_CreateWorkspaceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest.class, com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest.Builder.class);
  }

  public static final int WORKSPACE_FIELD_NUMBER = 1;
  private com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspace workspace_;
  /**
   * <code>.scalekit.v1.workspaces.CreateWorkspace workspace = 1 [json_name = "workspace", (.buf.validate.field) = { ... }</code>
   * @return Whether the workspace field is set.
   */
  @java.lang.Override
  public boolean hasWorkspace() {
    return workspace_ != null;
  }
  /**
   * <code>.scalekit.v1.workspaces.CreateWorkspace workspace = 1 [json_name = "workspace", (.buf.validate.field) = { ... }</code>
   * @return The workspace.
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspace getWorkspace() {
    return workspace_ == null ? com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspace.getDefaultInstance() : workspace_;
  }
  /**
   * <code>.scalekit.v1.workspaces.CreateWorkspace workspace = 1 [json_name = "workspace", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceOrBuilder getWorkspaceOrBuilder() {
    return workspace_ == null ? com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspace.getDefaultInstance() : workspace_;
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
    if (workspace_ != null) {
      output.writeMessage(1, getWorkspace());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (workspace_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getWorkspace());
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest other = (com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest) obj;

    if (hasWorkspace() != other.hasWorkspace()) return false;
    if (hasWorkspace()) {
      if (!getWorkspace()
          .equals(other.getWorkspace())) return false;
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
    if (hasWorkspace()) {
      hash = (37 * hash) + WORKSPACE_FIELD_NUMBER;
      hash = (53 * hash) + getWorkspace().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest prototype) {
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
   * Protobuf type {@code scalekit.v1.workspaces.CreateWorkspaceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.workspaces.CreateWorkspaceRequest)
      com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.workspaces.WorkspacesProto.internal_static_scalekit_v1_workspaces_CreateWorkspaceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.workspaces.WorkspacesProto.internal_static_scalekit_v1_workspaces_CreateWorkspaceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest.class, com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest.newBuilder()
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
      workspace_ = null;
      if (workspaceBuilder_ != null) {
        workspaceBuilder_.dispose();
        workspaceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.workspaces.WorkspacesProto.internal_static_scalekit_v1_workspaces_CreateWorkspaceRequest_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest build() {
      com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest buildPartial() {
      com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest result = new com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.workspace_ = workspaceBuilder_ == null
            ? workspace_
            : workspaceBuilder_.build();
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest other) {
      if (other == com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest.getDefaultInstance()) return this;
      if (other.hasWorkspace()) {
        mergeWorkspace(other.getWorkspace());
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
                  getWorkspaceFieldBuilder().getBuilder(),
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

    private com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspace workspace_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspace, com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspace.Builder, com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceOrBuilder> workspaceBuilder_;
    /**
     * <code>.scalekit.v1.workspaces.CreateWorkspace workspace = 1 [json_name = "workspace", (.buf.validate.field) = { ... }</code>
     * @return Whether the workspace field is set.
     */
    public boolean hasWorkspace() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.scalekit.v1.workspaces.CreateWorkspace workspace = 1 [json_name = "workspace", (.buf.validate.field) = { ... }</code>
     * @return The workspace.
     */
    public com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspace getWorkspace() {
      if (workspaceBuilder_ == null) {
        return workspace_ == null ? com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspace.getDefaultInstance() : workspace_;
      } else {
        return workspaceBuilder_.getMessage();
      }
    }
    /**
     * <code>.scalekit.v1.workspaces.CreateWorkspace workspace = 1 [json_name = "workspace", (.buf.validate.field) = { ... }</code>
     */
    public Builder setWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspace value) {
      if (workspaceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workspace_ = value;
      } else {
        workspaceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.workspaces.CreateWorkspace workspace = 1 [json_name = "workspace", (.buf.validate.field) = { ... }</code>
     */
    public Builder setWorkspace(
        com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspace.Builder builderForValue) {
      if (workspaceBuilder_ == null) {
        workspace_ = builderForValue.build();
      } else {
        workspaceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.workspaces.CreateWorkspace workspace = 1 [json_name = "workspace", (.buf.validate.field) = { ... }</code>
     */
    public Builder mergeWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspace value) {
      if (workspaceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          workspace_ != null &&
          workspace_ != com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspace.getDefaultInstance()) {
          getWorkspaceBuilder().mergeFrom(value);
        } else {
          workspace_ = value;
        }
      } else {
        workspaceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.workspaces.CreateWorkspace workspace = 1 [json_name = "workspace", (.buf.validate.field) = { ... }</code>
     */
    public Builder clearWorkspace() {
      bitField0_ = (bitField0_ & ~0x00000001);
      workspace_ = null;
      if (workspaceBuilder_ != null) {
        workspaceBuilder_.dispose();
        workspaceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.workspaces.CreateWorkspace workspace = 1 [json_name = "workspace", (.buf.validate.field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspace.Builder getWorkspaceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWorkspaceFieldBuilder().getBuilder();
    }
    /**
     * <code>.scalekit.v1.workspaces.CreateWorkspace workspace = 1 [json_name = "workspace", (.buf.validate.field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceOrBuilder getWorkspaceOrBuilder() {
      if (workspaceBuilder_ != null) {
        return workspaceBuilder_.getMessageOrBuilder();
      } else {
        return workspace_ == null ?
            com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspace.getDefaultInstance() : workspace_;
      }
    }
    /**
     * <code>.scalekit.v1.workspaces.CreateWorkspace workspace = 1 [json_name = "workspace", (.buf.validate.field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspace, com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspace.Builder, com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceOrBuilder> 
        getWorkspaceFieldBuilder() {
      if (workspaceBuilder_ == null) {
        workspaceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspace, com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspace.Builder, com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceOrBuilder>(
                getWorkspace(),
                getParentForChildren(),
                isClean());
        workspace_ = null;
      }
      return workspaceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.workspaces.CreateWorkspaceRequest)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.workspaces.CreateWorkspaceRequest)
  private static final com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest();
  }

  public static com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateWorkspaceRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateWorkspaceRequest>() {
    @java.lang.Override
    public CreateWorkspaceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateWorkspaceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateWorkspaceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

