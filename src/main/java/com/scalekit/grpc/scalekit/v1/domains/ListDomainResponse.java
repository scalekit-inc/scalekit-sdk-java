// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/domains/domains.proto

package com.scalekit.grpc.scalekit.v1.domains;

/**
 * Protobuf type {@code scalekit.v1.domains.ListDomainResponse}
 */
public final class ListDomainResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.domains.ListDomainResponse)
    ListDomainResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDomainResponse.newBuilder() to construct.
  private ListDomainResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDomainResponse() {
    domains_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListDomainResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.domains.DomainsProto.internal_static_scalekit_v1_domains_ListDomainResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.domains.DomainsProto.internal_static_scalekit_v1_domains_ListDomainResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse.class, com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse.Builder.class);
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 1;
  private int pageSize_ = 0;
  /**
   * <code>int32 page_size = 1 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_NUMBER_FIELD_NUMBER = 2;
  private int pageNumber_ = 0;
  /**
   * <code>int32 page_number = 2 [json_name = "pageNumber"];</code>
   * @return The pageNumber.
   */
  @java.lang.Override
  public int getPageNumber() {
    return pageNumber_;
  }

  public static final int DOMAINS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<com.scalekit.grpc.scalekit.v1.domains.Domain> domains_;
  /**
   * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
   */
  @java.lang.Override
  public java.util.List<com.scalekit.grpc.scalekit.v1.domains.Domain> getDomainsList() {
    return domains_;
  }
  /**
   * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.scalekit.grpc.scalekit.v1.domains.DomainOrBuilder> 
      getDomainsOrBuilderList() {
    return domains_;
  }
  /**
   * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
   */
  @java.lang.Override
  public int getDomainsCount() {
    return domains_.size();
  }
  /**
   * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.domains.Domain getDomains(int index) {
    return domains_.get(index);
  }
  /**
   * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.domains.DomainOrBuilder getDomainsOrBuilder(
      int index) {
    return domains_.get(index);
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
    if (pageSize_ != 0) {
      output.writeInt32(1, pageSize_);
    }
    if (pageNumber_ != 0) {
      output.writeInt32(2, pageNumber_);
    }
    for (int i = 0; i < domains_.size(); i++) {
      output.writeMessage(3, domains_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, pageSize_);
    }
    if (pageNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pageNumber_);
    }
    for (int i = 0; i < domains_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, domains_.get(i));
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse other = (com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse) obj;

    if (getPageSize()
        != other.getPageSize()) return false;
    if (getPageNumber()
        != other.getPageNumber()) return false;
    if (!getDomainsList()
        .equals(other.getDomainsList())) return false;
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
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getPageNumber();
    if (getDomainsCount() > 0) {
      hash = (37 * hash) + DOMAINS_FIELD_NUMBER;
      hash = (53 * hash) + getDomainsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse prototype) {
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
   * Protobuf type {@code scalekit.v1.domains.ListDomainResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.domains.ListDomainResponse)
      com.scalekit.grpc.scalekit.v1.domains.ListDomainResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.domains.DomainsProto.internal_static_scalekit_v1_domains_ListDomainResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.domains.DomainsProto.internal_static_scalekit_v1_domains_ListDomainResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse.class, com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse.newBuilder()
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
      pageSize_ = 0;
      pageNumber_ = 0;
      if (domainsBuilder_ == null) {
        domains_ = java.util.Collections.emptyList();
      } else {
        domains_ = null;
        domainsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.domains.DomainsProto.internal_static_scalekit_v1_domains_ListDomainResponse_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse build() {
      com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse buildPartial() {
      com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse result = new com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse result) {
      if (domainsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          domains_ = java.util.Collections.unmodifiableList(domains_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.domains_ = domains_;
      } else {
        result.domains_ = domainsBuilder_.build();
      }
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pageSize_ = pageSize_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pageNumber_ = pageNumber_;
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse other) {
      if (other == com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse.getDefaultInstance()) return this;
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (other.getPageNumber() != 0) {
        setPageNumber(other.getPageNumber());
      }
      if (domainsBuilder_ == null) {
        if (!other.domains_.isEmpty()) {
          if (domains_.isEmpty()) {
            domains_ = other.domains_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureDomainsIsMutable();
            domains_.addAll(other.domains_);
          }
          onChanged();
        }
      } else {
        if (!other.domains_.isEmpty()) {
          if (domainsBuilder_.isEmpty()) {
            domainsBuilder_.dispose();
            domainsBuilder_ = null;
            domains_ = other.domains_;
            bitField0_ = (bitField0_ & ~0x00000004);
            domainsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDomainsFieldBuilder() : null;
          } else {
            domainsBuilder_.addAllMessages(other.domains_);
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
            case 8: {
              pageSize_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              pageNumber_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              com.scalekit.grpc.scalekit.v1.domains.Domain m =
                  input.readMessage(
                      com.scalekit.grpc.scalekit.v1.domains.Domain.parser(),
                      extensionRegistry);
              if (domainsBuilder_ == null) {
                ensureDomainsIsMutable();
                domains_.add(m);
              } else {
                domainsBuilder_.addMessage(m);
              }
              break;
            } // case 26
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

    private int pageSize_ ;
    /**
     * <code>int32 page_size = 1 [json_name = "pageSize"];</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <code>int32 page_size = 1 [json_name = "pageSize"];</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {

      pageSize_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page_size = 1 [json_name = "pageSize"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private int pageNumber_ ;
    /**
     * <code>int32 page_number = 2 [json_name = "pageNumber"];</code>
     * @return The pageNumber.
     */
    @java.lang.Override
    public int getPageNumber() {
      return pageNumber_;
    }
    /**
     * <code>int32 page_number = 2 [json_name = "pageNumber"];</code>
     * @param value The pageNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPageNumber(int value) {

      pageNumber_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page_number = 2 [json_name = "pageNumber"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPageNumber() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pageNumber_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.scalekit.grpc.scalekit.v1.domains.Domain> domains_ =
      java.util.Collections.emptyList();
    private void ensureDomainsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        domains_ = new java.util.ArrayList<com.scalekit.grpc.scalekit.v1.domains.Domain>(domains_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.domains.Domain, com.scalekit.grpc.scalekit.v1.domains.Domain.Builder, com.scalekit.grpc.scalekit.v1.domains.DomainOrBuilder> domainsBuilder_;

    /**
     * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
     */
    public java.util.List<com.scalekit.grpc.scalekit.v1.domains.Domain> getDomainsList() {
      if (domainsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(domains_);
      } else {
        return domainsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
     */
    public int getDomainsCount() {
      if (domainsBuilder_ == null) {
        return domains_.size();
      } else {
        return domainsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.domains.Domain getDomains(int index) {
      if (domainsBuilder_ == null) {
        return domains_.get(index);
      } else {
        return domainsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
     */
    public Builder setDomains(
        int index, com.scalekit.grpc.scalekit.v1.domains.Domain value) {
      if (domainsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDomainsIsMutable();
        domains_.set(index, value);
        onChanged();
      } else {
        domainsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
     */
    public Builder setDomains(
        int index, com.scalekit.grpc.scalekit.v1.domains.Domain.Builder builderForValue) {
      if (domainsBuilder_ == null) {
        ensureDomainsIsMutable();
        domains_.set(index, builderForValue.build());
        onChanged();
      } else {
        domainsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
     */
    public Builder addDomains(com.scalekit.grpc.scalekit.v1.domains.Domain value) {
      if (domainsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDomainsIsMutable();
        domains_.add(value);
        onChanged();
      } else {
        domainsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
     */
    public Builder addDomains(
        int index, com.scalekit.grpc.scalekit.v1.domains.Domain value) {
      if (domainsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDomainsIsMutable();
        domains_.add(index, value);
        onChanged();
      } else {
        domainsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
     */
    public Builder addDomains(
        com.scalekit.grpc.scalekit.v1.domains.Domain.Builder builderForValue) {
      if (domainsBuilder_ == null) {
        ensureDomainsIsMutable();
        domains_.add(builderForValue.build());
        onChanged();
      } else {
        domainsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
     */
    public Builder addDomains(
        int index, com.scalekit.grpc.scalekit.v1.domains.Domain.Builder builderForValue) {
      if (domainsBuilder_ == null) {
        ensureDomainsIsMutable();
        domains_.add(index, builderForValue.build());
        onChanged();
      } else {
        domainsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
     */
    public Builder addAllDomains(
        java.lang.Iterable<? extends com.scalekit.grpc.scalekit.v1.domains.Domain> values) {
      if (domainsBuilder_ == null) {
        ensureDomainsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, domains_);
        onChanged();
      } else {
        domainsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
     */
    public Builder clearDomains() {
      if (domainsBuilder_ == null) {
        domains_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        domainsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
     */
    public Builder removeDomains(int index) {
      if (domainsBuilder_ == null) {
        ensureDomainsIsMutable();
        domains_.remove(index);
        onChanged();
      } else {
        domainsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.domains.Domain.Builder getDomainsBuilder(
        int index) {
      return getDomainsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.domains.DomainOrBuilder getDomainsOrBuilder(
        int index) {
      if (domainsBuilder_ == null) {
        return domains_.get(index);  } else {
        return domainsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
     */
    public java.util.List<? extends com.scalekit.grpc.scalekit.v1.domains.DomainOrBuilder> 
         getDomainsOrBuilderList() {
      if (domainsBuilder_ != null) {
        return domainsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(domains_);
      }
    }
    /**
     * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.domains.Domain.Builder addDomainsBuilder() {
      return getDomainsFieldBuilder().addBuilder(
          com.scalekit.grpc.scalekit.v1.domains.Domain.getDefaultInstance());
    }
    /**
     * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.domains.Domain.Builder addDomainsBuilder(
        int index) {
      return getDomainsFieldBuilder().addBuilder(
          index, com.scalekit.grpc.scalekit.v1.domains.Domain.getDefaultInstance());
    }
    /**
     * <code>repeated .scalekit.v1.domains.Domain domains = 3 [json_name = "domains"];</code>
     */
    public java.util.List<com.scalekit.grpc.scalekit.v1.domains.Domain.Builder> 
         getDomainsBuilderList() {
      return getDomainsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.domains.Domain, com.scalekit.grpc.scalekit.v1.domains.Domain.Builder, com.scalekit.grpc.scalekit.v1.domains.DomainOrBuilder> 
        getDomainsFieldBuilder() {
      if (domainsBuilder_ == null) {
        domainsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.domains.Domain, com.scalekit.grpc.scalekit.v1.domains.Domain.Builder, com.scalekit.grpc.scalekit.v1.domains.DomainOrBuilder>(
                domains_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        domains_ = null;
      }
      return domainsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.domains.ListDomainResponse)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.domains.ListDomainResponse)
  private static final com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse();
  }

  public static com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDomainResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListDomainResponse>() {
    @java.lang.Override
    public ListDomainResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListDomainResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDomainResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
