// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/auth/auth.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.auth;

/**
 * Protobuf type {@code scalekit.v1.auth.ListAuthMethodsResponse}
 */
public final class ListAuthMethodsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.auth.ListAuthMethodsResponse)
    ListAuthMethodsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAuthMethodsResponse.newBuilder() to construct.
  private ListAuthMethodsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAuthMethodsResponse() {
    authMethods_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAuthMethodsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.auth.AuthProto.internal_static_scalekit_v1_auth_ListAuthMethodsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.auth.AuthProto.internal_static_scalekit_v1_auth_ListAuthMethodsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse.class, com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse.Builder.class);
  }

  public static final int AUTH_METHODS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.scalekit.grpc.scalekit.v1.auth.AuthMethod> authMethods_;
  /**
   * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
   */
  @java.lang.Override
  public java.util.List<com.scalekit.grpc.scalekit.v1.auth.AuthMethod> getAuthMethodsList() {
    return authMethods_;
  }
  /**
   * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.scalekit.grpc.scalekit.v1.auth.AuthMethodOrBuilder> 
      getAuthMethodsOrBuilderList() {
    return authMethods_;
  }
  /**
   * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
   */
  @java.lang.Override
  public int getAuthMethodsCount() {
    return authMethods_.size();
  }
  /**
   * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.auth.AuthMethod getAuthMethods(int index) {
    return authMethods_.get(index);
  }
  /**
   * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.auth.AuthMethodOrBuilder getAuthMethodsOrBuilder(
      int index) {
    return authMethods_.get(index);
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
    for (int i = 0; i < authMethods_.size(); i++) {
      output.writeMessage(1, authMethods_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < authMethods_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, authMethods_.get(i));
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse other = (com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse) obj;

    if (!getAuthMethodsList()
        .equals(other.getAuthMethodsList())) return false;
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
    if (getAuthMethodsCount() > 0) {
      hash = (37 * hash) + AUTH_METHODS_FIELD_NUMBER;
      hash = (53 * hash) + getAuthMethodsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse prototype) {
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
   * Protobuf type {@code scalekit.v1.auth.ListAuthMethodsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.auth.ListAuthMethodsResponse)
      com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.auth.AuthProto.internal_static_scalekit_v1_auth_ListAuthMethodsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.auth.AuthProto.internal_static_scalekit_v1_auth_ListAuthMethodsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse.class, com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse.newBuilder()
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
      if (authMethodsBuilder_ == null) {
        authMethods_ = java.util.Collections.emptyList();
      } else {
        authMethods_ = null;
        authMethodsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.auth.AuthProto.internal_static_scalekit_v1_auth_ListAuthMethodsResponse_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse build() {
      com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse buildPartial() {
      com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse result = new com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse result) {
      if (authMethodsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          authMethods_ = java.util.Collections.unmodifiableList(authMethods_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.authMethods_ = authMethods_;
      } else {
        result.authMethods_ = authMethodsBuilder_.build();
      }
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse result) {
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse other) {
      if (other == com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse.getDefaultInstance()) return this;
      if (authMethodsBuilder_ == null) {
        if (!other.authMethods_.isEmpty()) {
          if (authMethods_.isEmpty()) {
            authMethods_ = other.authMethods_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAuthMethodsIsMutable();
            authMethods_.addAll(other.authMethods_);
          }
          onChanged();
        }
      } else {
        if (!other.authMethods_.isEmpty()) {
          if (authMethodsBuilder_.isEmpty()) {
            authMethodsBuilder_.dispose();
            authMethodsBuilder_ = null;
            authMethods_ = other.authMethods_;
            bitField0_ = (bitField0_ & ~0x00000001);
            authMethodsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAuthMethodsFieldBuilder() : null;
          } else {
            authMethodsBuilder_.addAllMessages(other.authMethods_);
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
              com.scalekit.grpc.scalekit.v1.auth.AuthMethod m =
                  input.readMessage(
                      com.scalekit.grpc.scalekit.v1.auth.AuthMethod.parser(),
                      extensionRegistry);
              if (authMethodsBuilder_ == null) {
                ensureAuthMethodsIsMutable();
                authMethods_.add(m);
              } else {
                authMethodsBuilder_.addMessage(m);
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

    private java.util.List<com.scalekit.grpc.scalekit.v1.auth.AuthMethod> authMethods_ =
      java.util.Collections.emptyList();
    private void ensureAuthMethodsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        authMethods_ = new java.util.ArrayList<com.scalekit.grpc.scalekit.v1.auth.AuthMethod>(authMethods_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.auth.AuthMethod, com.scalekit.grpc.scalekit.v1.auth.AuthMethod.Builder, com.scalekit.grpc.scalekit.v1.auth.AuthMethodOrBuilder> authMethodsBuilder_;

    /**
     * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
     */
    public java.util.List<com.scalekit.grpc.scalekit.v1.auth.AuthMethod> getAuthMethodsList() {
      if (authMethodsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(authMethods_);
      } else {
        return authMethodsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
     */
    public int getAuthMethodsCount() {
      if (authMethodsBuilder_ == null) {
        return authMethods_.size();
      } else {
        return authMethodsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.auth.AuthMethod getAuthMethods(int index) {
      if (authMethodsBuilder_ == null) {
        return authMethods_.get(index);
      } else {
        return authMethodsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
     */
    public Builder setAuthMethods(
        int index, com.scalekit.grpc.scalekit.v1.auth.AuthMethod value) {
      if (authMethodsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAuthMethodsIsMutable();
        authMethods_.set(index, value);
        onChanged();
      } else {
        authMethodsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
     */
    public Builder setAuthMethods(
        int index, com.scalekit.grpc.scalekit.v1.auth.AuthMethod.Builder builderForValue) {
      if (authMethodsBuilder_ == null) {
        ensureAuthMethodsIsMutable();
        authMethods_.set(index, builderForValue.build());
        onChanged();
      } else {
        authMethodsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
     */
    public Builder addAuthMethods(com.scalekit.grpc.scalekit.v1.auth.AuthMethod value) {
      if (authMethodsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAuthMethodsIsMutable();
        authMethods_.add(value);
        onChanged();
      } else {
        authMethodsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
     */
    public Builder addAuthMethods(
        int index, com.scalekit.grpc.scalekit.v1.auth.AuthMethod value) {
      if (authMethodsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAuthMethodsIsMutable();
        authMethods_.add(index, value);
        onChanged();
      } else {
        authMethodsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
     */
    public Builder addAuthMethods(
        com.scalekit.grpc.scalekit.v1.auth.AuthMethod.Builder builderForValue) {
      if (authMethodsBuilder_ == null) {
        ensureAuthMethodsIsMutable();
        authMethods_.add(builderForValue.build());
        onChanged();
      } else {
        authMethodsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
     */
    public Builder addAuthMethods(
        int index, com.scalekit.grpc.scalekit.v1.auth.AuthMethod.Builder builderForValue) {
      if (authMethodsBuilder_ == null) {
        ensureAuthMethodsIsMutable();
        authMethods_.add(index, builderForValue.build());
        onChanged();
      } else {
        authMethodsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
     */
    public Builder addAllAuthMethods(
        java.lang.Iterable<? extends com.scalekit.grpc.scalekit.v1.auth.AuthMethod> values) {
      if (authMethodsBuilder_ == null) {
        ensureAuthMethodsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, authMethods_);
        onChanged();
      } else {
        authMethodsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
     */
    public Builder clearAuthMethods() {
      if (authMethodsBuilder_ == null) {
        authMethods_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        authMethodsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
     */
    public Builder removeAuthMethods(int index) {
      if (authMethodsBuilder_ == null) {
        ensureAuthMethodsIsMutable();
        authMethods_.remove(index);
        onChanged();
      } else {
        authMethodsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.auth.AuthMethod.Builder getAuthMethodsBuilder(
        int index) {
      return getAuthMethodsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.auth.AuthMethodOrBuilder getAuthMethodsOrBuilder(
        int index) {
      if (authMethodsBuilder_ == null) {
        return authMethods_.get(index);  } else {
        return authMethodsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
     */
    public java.util.List<? extends com.scalekit.grpc.scalekit.v1.auth.AuthMethodOrBuilder> 
         getAuthMethodsOrBuilderList() {
      if (authMethodsBuilder_ != null) {
        return authMethodsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(authMethods_);
      }
    }
    /**
     * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.auth.AuthMethod.Builder addAuthMethodsBuilder() {
      return getAuthMethodsFieldBuilder().addBuilder(
          com.scalekit.grpc.scalekit.v1.auth.AuthMethod.getDefaultInstance());
    }
    /**
     * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.auth.AuthMethod.Builder addAuthMethodsBuilder(
        int index) {
      return getAuthMethodsFieldBuilder().addBuilder(
          index, com.scalekit.grpc.scalekit.v1.auth.AuthMethod.getDefaultInstance());
    }
    /**
     * <code>repeated .scalekit.v1.auth.AuthMethod auth_methods = 1 [json_name = "authMethods"];</code>
     */
    public java.util.List<com.scalekit.grpc.scalekit.v1.auth.AuthMethod.Builder> 
         getAuthMethodsBuilderList() {
      return getAuthMethodsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.auth.AuthMethod, com.scalekit.grpc.scalekit.v1.auth.AuthMethod.Builder, com.scalekit.grpc.scalekit.v1.auth.AuthMethodOrBuilder> 
        getAuthMethodsFieldBuilder() {
      if (authMethodsBuilder_ == null) {
        authMethodsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.auth.AuthMethod, com.scalekit.grpc.scalekit.v1.auth.AuthMethod.Builder, com.scalekit.grpc.scalekit.v1.auth.AuthMethodOrBuilder>(
                authMethods_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        authMethods_ = null;
      }
      return authMethodsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.auth.ListAuthMethodsResponse)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.auth.ListAuthMethodsResponse)
  private static final com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse();
  }

  public static com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAuthMethodsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListAuthMethodsResponse>() {
    @java.lang.Override
    public ListAuthMethodsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAuthMethodsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAuthMethodsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

