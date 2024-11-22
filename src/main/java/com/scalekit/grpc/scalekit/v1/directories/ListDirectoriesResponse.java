// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/directories/directories.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.directories;

/**
 * Protobuf type {@code scalekit.v1.directories.ListDirectoriesResponse}
 */
public final class ListDirectoriesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.directories.ListDirectoriesResponse)
    ListDirectoriesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDirectoriesResponse.newBuilder() to construct.
  private ListDirectoriesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDirectoriesResponse() {
    directories_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListDirectoriesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_ListDirectoriesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_ListDirectoriesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse.class, com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse.Builder.class);
  }

  public static final int DIRECTORIES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.scalekit.grpc.scalekit.v1.directories.Directory> directories_;
  /**
   * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<com.scalekit.grpc.scalekit.v1.directories.Directory> getDirectoriesList() {
    return directories_;
  }
  /**
   * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.scalekit.grpc.scalekit.v1.directories.DirectoryOrBuilder> 
      getDirectoriesOrBuilderList() {
    return directories_;
  }
  /**
   * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  @java.lang.Override
  public int getDirectoriesCount() {
    return directories_.size();
  }
  /**
   * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.directories.Directory getDirectories(int index) {
    return directories_.get(index);
  }
  /**
   * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.directories.DirectoryOrBuilder getDirectoriesOrBuilder(
      int index) {
    return directories_.get(index);
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
    for (int i = 0; i < directories_.size(); i++) {
      output.writeMessage(1, directories_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < directories_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, directories_.get(i));
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse other = (com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse) obj;

    if (!getDirectoriesList()
        .equals(other.getDirectoriesList())) return false;
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
    if (getDirectoriesCount() > 0) {
      hash = (37 * hash) + DIRECTORIES_FIELD_NUMBER;
      hash = (53 * hash) + getDirectoriesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse prototype) {
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
   * Protobuf type {@code scalekit.v1.directories.ListDirectoriesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.directories.ListDirectoriesResponse)
      com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_ListDirectoriesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_ListDirectoriesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse.class, com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse.newBuilder()
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
      if (directoriesBuilder_ == null) {
        directories_ = java.util.Collections.emptyList();
      } else {
        directories_ = null;
        directoriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.internal_static_scalekit_v1_directories_ListDirectoriesResponse_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse build() {
      com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse buildPartial() {
      com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse result = new com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse result) {
      if (directoriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          directories_ = java.util.Collections.unmodifiableList(directories_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.directories_ = directories_;
      } else {
        result.directories_ = directoriesBuilder_.build();
      }
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse other) {
      if (other == com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse.getDefaultInstance()) return this;
      if (directoriesBuilder_ == null) {
        if (!other.directories_.isEmpty()) {
          if (directories_.isEmpty()) {
            directories_ = other.directories_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDirectoriesIsMutable();
            directories_.addAll(other.directories_);
          }
          onChanged();
        }
      } else {
        if (!other.directories_.isEmpty()) {
          if (directoriesBuilder_.isEmpty()) {
            directoriesBuilder_.dispose();
            directoriesBuilder_ = null;
            directories_ = other.directories_;
            bitField0_ = (bitField0_ & ~0x00000001);
            directoriesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDirectoriesFieldBuilder() : null;
          } else {
            directoriesBuilder_.addAllMessages(other.directories_);
          }
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
              com.scalekit.grpc.scalekit.v1.directories.Directory m =
                  input.readMessage(
                      com.scalekit.grpc.scalekit.v1.directories.Directory.parser(),
                      extensionRegistry);
              if (directoriesBuilder_ == null) {
                ensureDirectoriesIsMutable();
                directories_.add(m);
              } else {
                directoriesBuilder_.addMessage(m);
              }
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

    private java.util.List<com.scalekit.grpc.scalekit.v1.directories.Directory> directories_ =
      java.util.Collections.emptyList();
    private void ensureDirectoriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        directories_ = new java.util.ArrayList<com.scalekit.grpc.scalekit.v1.directories.Directory>(directories_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.directories.Directory, com.scalekit.grpc.scalekit.v1.directories.Directory.Builder, com.scalekit.grpc.scalekit.v1.directories.DirectoryOrBuilder> directoriesBuilder_;

    /**
     * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public java.util.List<com.scalekit.grpc.scalekit.v1.directories.Directory> getDirectoriesList() {
      if (directoriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(directories_);
      } else {
        return directoriesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public int getDirectoriesCount() {
      if (directoriesBuilder_ == null) {
        return directories_.size();
      } else {
        return directoriesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.directories.Directory getDirectories(int index) {
      if (directoriesBuilder_ == null) {
        return directories_.get(index);
      } else {
        return directoriesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setDirectories(
        int index, com.scalekit.grpc.scalekit.v1.directories.Directory value) {
      if (directoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDirectoriesIsMutable();
        directories_.set(index, value);
        onChanged();
      } else {
        directoriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setDirectories(
        int index, com.scalekit.grpc.scalekit.v1.directories.Directory.Builder builderForValue) {
      if (directoriesBuilder_ == null) {
        ensureDirectoriesIsMutable();
        directories_.set(index, builderForValue.build());
        onChanged();
      } else {
        directoriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder addDirectories(com.scalekit.grpc.scalekit.v1.directories.Directory value) {
      if (directoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDirectoriesIsMutable();
        directories_.add(value);
        onChanged();
      } else {
        directoriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder addDirectories(
        int index, com.scalekit.grpc.scalekit.v1.directories.Directory value) {
      if (directoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDirectoriesIsMutable();
        directories_.add(index, value);
        onChanged();
      } else {
        directoriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder addDirectories(
        com.scalekit.grpc.scalekit.v1.directories.Directory.Builder builderForValue) {
      if (directoriesBuilder_ == null) {
        ensureDirectoriesIsMutable();
        directories_.add(builderForValue.build());
        onChanged();
      } else {
        directoriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder addDirectories(
        int index, com.scalekit.grpc.scalekit.v1.directories.Directory.Builder builderForValue) {
      if (directoriesBuilder_ == null) {
        ensureDirectoriesIsMutable();
        directories_.add(index, builderForValue.build());
        onChanged();
      } else {
        directoriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder addAllDirectories(
        java.lang.Iterable<? extends com.scalekit.grpc.scalekit.v1.directories.Directory> values) {
      if (directoriesBuilder_ == null) {
        ensureDirectoriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, directories_);
        onChanged();
      } else {
        directoriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder clearDirectories() {
      if (directoriesBuilder_ == null) {
        directories_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        directoriesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder removeDirectories(int index) {
      if (directoriesBuilder_ == null) {
        ensureDirectoriesIsMutable();
        directories_.remove(index);
        onChanged();
      } else {
        directoriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.directories.Directory.Builder getDirectoriesBuilder(
        int index) {
      return getDirectoriesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.directories.DirectoryOrBuilder getDirectoriesOrBuilder(
        int index) {
      if (directoriesBuilder_ == null) {
        return directories_.get(index);  } else {
        return directoriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public java.util.List<? extends com.scalekit.grpc.scalekit.v1.directories.DirectoryOrBuilder> 
         getDirectoriesOrBuilderList() {
      if (directoriesBuilder_ != null) {
        return directoriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(directories_);
      }
    }
    /**
     * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.directories.Directory.Builder addDirectoriesBuilder() {
      return getDirectoriesFieldBuilder().addBuilder(
          com.scalekit.grpc.scalekit.v1.directories.Directory.getDefaultInstance());
    }
    /**
     * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.directories.Directory.Builder addDirectoriesBuilder(
        int index) {
      return getDirectoriesFieldBuilder().addBuilder(
          index, com.scalekit.grpc.scalekit.v1.directories.Directory.getDefaultInstance());
    }
    /**
     * <code>repeated .scalekit.v1.directories.Directory directories = 1 [json_name = "directories", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public java.util.List<com.scalekit.grpc.scalekit.v1.directories.Directory.Builder> 
         getDirectoriesBuilderList() {
      return getDirectoriesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.directories.Directory, com.scalekit.grpc.scalekit.v1.directories.Directory.Builder, com.scalekit.grpc.scalekit.v1.directories.DirectoryOrBuilder> 
        getDirectoriesFieldBuilder() {
      if (directoriesBuilder_ == null) {
        directoriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.directories.Directory, com.scalekit.grpc.scalekit.v1.directories.Directory.Builder, com.scalekit.grpc.scalekit.v1.directories.DirectoryOrBuilder>(
                directories_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        directories_ = null;
      }
      return directoriesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.directories.ListDirectoriesResponse)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.directories.ListDirectoriesResponse)
  private static final com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse();
  }

  public static com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDirectoriesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListDirectoriesResponse>() {
    @java.lang.Override
    public ListDirectoriesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListDirectoriesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDirectoriesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

