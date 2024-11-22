// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/directories/directories.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.directories;

/**
 * Protobuf type {@code scalekit.v1.directories.CreateDirectoryResponse}
 */
public final class CreateDirectoryResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.directories.CreateDirectoryResponse)
    CreateDirectoryResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateDirectoryResponse.newBuilder() to construct.
  private CreateDirectoryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateDirectoryResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateDirectoryResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_CreateDirectoryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_CreateDirectoryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse.class, com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse.Builder.class);
  }

  private int bitField0_;
  public static final int DIRECTORY_FIELD_NUMBER = 1;
  private com.scalekit.grpc.scalekit.v1.directories.Directory directory_;
  /**
   * <code>.scalekit.v1.directories.Directory directory = 1 [json_name = "directory", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the directory field is set.
   */
  @java.lang.Override
  public boolean hasDirectory() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.scalekit.v1.directories.Directory directory = 1 [json_name = "directory", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The directory.
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.directories.Directory getDirectory() {
    return directory_ == null ? com.scalekit.grpc.scalekit.v1.directories.Directory.getDefaultInstance() : directory_;
  }
  /**
   * <code>.scalekit.v1.directories.Directory directory = 1 [json_name = "directory", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.directories.DirectoryOrBuilder getDirectoryOrBuilder() {
    return directory_ == null ? com.scalekit.grpc.scalekit.v1.directories.Directory.getDefaultInstance() : directory_;
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
      output.writeMessage(1, getDirectory());
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
        .computeMessageSize(1, getDirectory());
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse other = (com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse) obj;

    if (hasDirectory() != other.hasDirectory()) return false;
    if (hasDirectory()) {
      if (!getDirectory()
          .equals(other.getDirectory())) return false;
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
    if (hasDirectory()) {
      hash = (37 * hash) + DIRECTORY_FIELD_NUMBER;
      hash = (53 * hash) + getDirectory().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse prototype) {
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
   * Protobuf type {@code scalekit.v1.directories.CreateDirectoryResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.directories.CreateDirectoryResponse)
      com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_CreateDirectoryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_CreateDirectoryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse.class, com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse.newBuilder()
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
        getDirectoryFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      directory_ = null;
      if (directoryBuilder_ != null) {
        directoryBuilder_.dispose();
        directoryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_CreateDirectoryResponse_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse build() {
      com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse buildPartial() {
      com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse result = new com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.directory_ = directoryBuilder_ == null
            ? directory_
            : directoryBuilder_.build();
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse other) {
      if (other == com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse.getDefaultInstance()) return this;
      if (other.hasDirectory()) {
        mergeDirectory(other.getDirectory());
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
                  getDirectoryFieldBuilder().getBuilder(),
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

    private com.scalekit.grpc.scalekit.v1.directories.Directory directory_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.directories.Directory, com.scalekit.grpc.scalekit.v1.directories.Directory.Builder, com.scalekit.grpc.scalekit.v1.directories.DirectoryOrBuilder> directoryBuilder_;
    /**
     * <code>.scalekit.v1.directories.Directory directory = 1 [json_name = "directory", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the directory field is set.
     */
    public boolean hasDirectory() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.scalekit.v1.directories.Directory directory = 1 [json_name = "directory", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The directory.
     */
    public com.scalekit.grpc.scalekit.v1.directories.Directory getDirectory() {
      if (directoryBuilder_ == null) {
        return directory_ == null ? com.scalekit.grpc.scalekit.v1.directories.Directory.getDefaultInstance() : directory_;
      } else {
        return directoryBuilder_.getMessage();
      }
    }
    /**
     * <code>.scalekit.v1.directories.Directory directory = 1 [json_name = "directory", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setDirectory(com.scalekit.grpc.scalekit.v1.directories.Directory value) {
      if (directoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        directory_ = value;
      } else {
        directoryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.directories.Directory directory = 1 [json_name = "directory", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setDirectory(
        com.scalekit.grpc.scalekit.v1.directories.Directory.Builder builderForValue) {
      if (directoryBuilder_ == null) {
        directory_ = builderForValue.build();
      } else {
        directoryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.directories.Directory directory = 1 [json_name = "directory", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder mergeDirectory(com.scalekit.grpc.scalekit.v1.directories.Directory value) {
      if (directoryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          directory_ != null &&
          directory_ != com.scalekit.grpc.scalekit.v1.directories.Directory.getDefaultInstance()) {
          getDirectoryBuilder().mergeFrom(value);
        } else {
          directory_ = value;
        }
      } else {
        directoryBuilder_.mergeFrom(value);
      }
      if (directory_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.scalekit.v1.directories.Directory directory = 1 [json_name = "directory", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder clearDirectory() {
      bitField0_ = (bitField0_ & ~0x00000001);
      directory_ = null;
      if (directoryBuilder_ != null) {
        directoryBuilder_.dispose();
        directoryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.directories.Directory directory = 1 [json_name = "directory", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.directories.Directory.Builder getDirectoryBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDirectoryFieldBuilder().getBuilder();
    }
    /**
     * <code>.scalekit.v1.directories.Directory directory = 1 [json_name = "directory", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.directories.DirectoryOrBuilder getDirectoryOrBuilder() {
      if (directoryBuilder_ != null) {
        return directoryBuilder_.getMessageOrBuilder();
      } else {
        return directory_ == null ?
            com.scalekit.grpc.scalekit.v1.directories.Directory.getDefaultInstance() : directory_;
      }
    }
    /**
     * <code>.scalekit.v1.directories.Directory directory = 1 [json_name = "directory", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.directories.Directory, com.scalekit.grpc.scalekit.v1.directories.Directory.Builder, com.scalekit.grpc.scalekit.v1.directories.DirectoryOrBuilder> 
        getDirectoryFieldBuilder() {
      if (directoryBuilder_ == null) {
        directoryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.directories.Directory, com.scalekit.grpc.scalekit.v1.directories.Directory.Builder, com.scalekit.grpc.scalekit.v1.directories.DirectoryOrBuilder>(
                getDirectory(),
                getParentForChildren(),
                isClean());
        directory_ = null;
      }
      return directoryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.directories.CreateDirectoryResponse)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.directories.CreateDirectoryResponse)
  private static final com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse();
  }

  public static com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDirectoryResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateDirectoryResponse>() {
    @java.lang.Override
    public CreateDirectoryResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDirectoryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDirectoryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

