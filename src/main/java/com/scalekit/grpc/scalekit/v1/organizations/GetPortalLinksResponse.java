// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/organizations/organizations.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.organizations;

/**
 * Protobuf type {@code scalekit.v1.organizations.GetPortalLinksResponse}
 */
public final class GetPortalLinksResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.organizations.GetPortalLinksResponse)
    GetPortalLinksResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPortalLinksResponse.newBuilder() to construct.
  private GetPortalLinksResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPortalLinksResponse() {
    links_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPortalLinksResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.organizations.OrganizationsProto.internal_static_scalekit_v1_organizations_GetPortalLinksResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.organizations.OrganizationsProto.internal_static_scalekit_v1_organizations_GetPortalLinksResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse.class, com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse.Builder.class);
  }

  public static final int LINKS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.scalekit.grpc.scalekit.v1.organizations.Link> links_;
  /**
   * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<com.scalekit.grpc.scalekit.v1.organizations.Link> getLinksList() {
    return links_;
  }
  /**
   * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.scalekit.grpc.scalekit.v1.organizations.LinkOrBuilder> 
      getLinksOrBuilderList() {
    return links_;
  }
  /**
   * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  @java.lang.Override
  public int getLinksCount() {
    return links_.size();
  }
  /**
   * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.organizations.Link getLinks(int index) {
    return links_.get(index);
  }
  /**
   * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.organizations.LinkOrBuilder getLinksOrBuilder(
      int index) {
    return links_.get(index);
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
    for (int i = 0; i < links_.size(); i++) {
      output.writeMessage(1, links_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < links_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, links_.get(i));
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse other = (com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse) obj;

    if (!getLinksList()
        .equals(other.getLinksList())) return false;
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
    if (getLinksCount() > 0) {
      hash = (37 * hash) + LINKS_FIELD_NUMBER;
      hash = (53 * hash) + getLinksList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse prototype) {
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
   * Protobuf type {@code scalekit.v1.organizations.GetPortalLinksResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.organizations.GetPortalLinksResponse)
      com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.organizations.OrganizationsProto.internal_static_scalekit_v1_organizations_GetPortalLinksResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.organizations.OrganizationsProto.internal_static_scalekit_v1_organizations_GetPortalLinksResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse.class, com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse.newBuilder()
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
      if (linksBuilder_ == null) {
        links_ = java.util.Collections.emptyList();
      } else {
        links_ = null;
        linksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.organizations.OrganizationsProto.internal_static_scalekit_v1_organizations_GetPortalLinksResponse_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse build() {
      com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse buildPartial() {
      com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse result = new com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse result) {
      if (linksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          links_ = java.util.Collections.unmodifiableList(links_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.links_ = links_;
      } else {
        result.links_ = linksBuilder_.build();
      }
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse result) {
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse other) {
      if (other == com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse.getDefaultInstance()) return this;
      if (linksBuilder_ == null) {
        if (!other.links_.isEmpty()) {
          if (links_.isEmpty()) {
            links_ = other.links_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLinksIsMutable();
            links_.addAll(other.links_);
          }
          onChanged();
        }
      } else {
        if (!other.links_.isEmpty()) {
          if (linksBuilder_.isEmpty()) {
            linksBuilder_.dispose();
            linksBuilder_ = null;
            links_ = other.links_;
            bitField0_ = (bitField0_ & ~0x00000001);
            linksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLinksFieldBuilder() : null;
          } else {
            linksBuilder_.addAllMessages(other.links_);
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
              com.scalekit.grpc.scalekit.v1.organizations.Link m =
                  input.readMessage(
                      com.scalekit.grpc.scalekit.v1.organizations.Link.parser(),
                      extensionRegistry);
              if (linksBuilder_ == null) {
                ensureLinksIsMutable();
                links_.add(m);
              } else {
                linksBuilder_.addMessage(m);
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

    private java.util.List<com.scalekit.grpc.scalekit.v1.organizations.Link> links_ =
      java.util.Collections.emptyList();
    private void ensureLinksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        links_ = new java.util.ArrayList<com.scalekit.grpc.scalekit.v1.organizations.Link>(links_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.organizations.Link, com.scalekit.grpc.scalekit.v1.organizations.Link.Builder, com.scalekit.grpc.scalekit.v1.organizations.LinkOrBuilder> linksBuilder_;

    /**
     * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public java.util.List<com.scalekit.grpc.scalekit.v1.organizations.Link> getLinksList() {
      if (linksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(links_);
      } else {
        return linksBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public int getLinksCount() {
      if (linksBuilder_ == null) {
        return links_.size();
      } else {
        return linksBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.organizations.Link getLinks(int index) {
      if (linksBuilder_ == null) {
        return links_.get(index);
      } else {
        return linksBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setLinks(
        int index, com.scalekit.grpc.scalekit.v1.organizations.Link value) {
      if (linksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinksIsMutable();
        links_.set(index, value);
        onChanged();
      } else {
        linksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder setLinks(
        int index, com.scalekit.grpc.scalekit.v1.organizations.Link.Builder builderForValue) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.set(index, builderForValue.build());
        onChanged();
      } else {
        linksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder addLinks(com.scalekit.grpc.scalekit.v1.organizations.Link value) {
      if (linksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinksIsMutable();
        links_.add(value);
        onChanged();
      } else {
        linksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder addLinks(
        int index, com.scalekit.grpc.scalekit.v1.organizations.Link value) {
      if (linksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinksIsMutable();
        links_.add(index, value);
        onChanged();
      } else {
        linksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder addLinks(
        com.scalekit.grpc.scalekit.v1.organizations.Link.Builder builderForValue) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.add(builderForValue.build());
        onChanged();
      } else {
        linksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder addLinks(
        int index, com.scalekit.grpc.scalekit.v1.organizations.Link.Builder builderForValue) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.add(index, builderForValue.build());
        onChanged();
      } else {
        linksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder addAllLinks(
        java.lang.Iterable<? extends com.scalekit.grpc.scalekit.v1.organizations.Link> values) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, links_);
        onChanged();
      } else {
        linksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder clearLinks() {
      if (linksBuilder_ == null) {
        links_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        linksBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public Builder removeLinks(int index) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.remove(index);
        onChanged();
      } else {
        linksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.organizations.Link.Builder getLinksBuilder(
        int index) {
      return getLinksFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.organizations.LinkOrBuilder getLinksOrBuilder(
        int index) {
      if (linksBuilder_ == null) {
        return links_.get(index);  } else {
        return linksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public java.util.List<? extends com.scalekit.grpc.scalekit.v1.organizations.LinkOrBuilder> 
         getLinksOrBuilderList() {
      if (linksBuilder_ != null) {
        return linksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(links_);
      }
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.organizations.Link.Builder addLinksBuilder() {
      return getLinksFieldBuilder().addBuilder(
          com.scalekit.grpc.scalekit.v1.organizations.Link.getDefaultInstance());
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public com.scalekit.grpc.scalekit.v1.organizations.Link.Builder addLinksBuilder(
        int index) {
      return getLinksFieldBuilder().addBuilder(
          index, com.scalekit.grpc.scalekit.v1.organizations.Link.getDefaultInstance());
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Link links = 1 [json_name = "links", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     */
    public java.util.List<com.scalekit.grpc.scalekit.v1.organizations.Link.Builder> 
         getLinksBuilderList() {
      return getLinksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.organizations.Link, com.scalekit.grpc.scalekit.v1.organizations.Link.Builder, com.scalekit.grpc.scalekit.v1.organizations.LinkOrBuilder> 
        getLinksFieldBuilder() {
      if (linksBuilder_ == null) {
        linksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.organizations.Link, com.scalekit.grpc.scalekit.v1.organizations.Link.Builder, com.scalekit.grpc.scalekit.v1.organizations.LinkOrBuilder>(
                links_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        links_ = null;
      }
      return linksBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.organizations.GetPortalLinksResponse)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.organizations.GetPortalLinksResponse)
  private static final com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse();
  }

  public static com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPortalLinksResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetPortalLinksResponse>() {
    @java.lang.Override
    public GetPortalLinksResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetPortalLinksResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPortalLinksResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

