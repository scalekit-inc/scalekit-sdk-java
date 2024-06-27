// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/organizations/organizations.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.organizations;

/**
 * Protobuf type {@code scalekit.v1.organizations.SearchOrganizationsResponse}
 */
public final class SearchOrganizationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.organizations.SearchOrganizationsResponse)
    SearchOrganizationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchOrganizationsResponse.newBuilder() to construct.
  private SearchOrganizationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchOrganizationsResponse() {
    nextPageToken_ = "";
    organizations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchOrganizationsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.organizations.OrganizationsProto.internal_static_scalekit_v1_organizations_SearchOrganizationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.organizations.OrganizationsProto.internal_static_scalekit_v1_organizations_SearchOrganizationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse.class, com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse.Builder.class);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTAL_SIZE_FIELD_NUMBER = 2;
  private int totalSize_ = 0;
  /**
   * <code>uint32 total_size = 2 [json_name = "totalSize"];</code>
   * @return The totalSize.
   */
  @java.lang.Override
  public int getTotalSize() {
    return totalSize_;
  }

  public static final int ORGANIZATIONS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<com.scalekit.grpc.scalekit.v1.organizations.Organization> organizations_;
  /**
   * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
   */
  @java.lang.Override
  public java.util.List<com.scalekit.grpc.scalekit.v1.organizations.Organization> getOrganizationsList() {
    return organizations_;
  }
  /**
   * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.scalekit.grpc.scalekit.v1.organizations.OrganizationOrBuilder> 
      getOrganizationsOrBuilderList() {
    return organizations_;
  }
  /**
   * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
   */
  @java.lang.Override
  public int getOrganizationsCount() {
    return organizations_.size();
  }
  /**
   * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.organizations.Organization getOrganizations(int index) {
    return organizations_.get(index);
  }
  /**
   * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.organizations.OrganizationOrBuilder getOrganizationsOrBuilder(
      int index) {
    return organizations_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nextPageToken_);
    }
    if (totalSize_ != 0) {
      output.writeUInt32(2, totalSize_);
    }
    for (int i = 0; i < organizations_.size(); i++) {
      output.writeMessage(3, organizations_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nextPageToken_);
    }
    if (totalSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, totalSize_);
    }
    for (int i = 0; i < organizations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, organizations_.get(i));
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse other = (com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse) obj;

    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
    if (getTotalSize()
        != other.getTotalSize()) return false;
    if (!getOrganizationsList()
        .equals(other.getOrganizationsList())) return false;
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
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (37 * hash) + TOTAL_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getTotalSize();
    if (getOrganizationsCount() > 0) {
      hash = (37 * hash) + ORGANIZATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOrganizationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse prototype) {
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
   * Protobuf type {@code scalekit.v1.organizations.SearchOrganizationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.organizations.SearchOrganizationsResponse)
      com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.organizations.OrganizationsProto.internal_static_scalekit_v1_organizations_SearchOrganizationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.organizations.OrganizationsProto.internal_static_scalekit_v1_organizations_SearchOrganizationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse.class, com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse.newBuilder()
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
      nextPageToken_ = "";
      totalSize_ = 0;
      if (organizationsBuilder_ == null) {
        organizations_ = java.util.Collections.emptyList();
      } else {
        organizations_ = null;
        organizationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.organizations.OrganizationsProto.internal_static_scalekit_v1_organizations_SearchOrganizationsResponse_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse build() {
      com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse buildPartial() {
      com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse result = new com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse result) {
      if (organizationsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          organizations_ = java.util.Collections.unmodifiableList(organizations_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.organizations_ = organizations_;
      } else {
        result.organizations_ = organizationsBuilder_.build();
      }
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.totalSize_ = totalSize_;
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse other) {
      if (other == com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse.getDefaultInstance()) return this;
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getTotalSize() != 0) {
        setTotalSize(other.getTotalSize());
      }
      if (organizationsBuilder_ == null) {
        if (!other.organizations_.isEmpty()) {
          if (organizations_.isEmpty()) {
            organizations_ = other.organizations_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureOrganizationsIsMutable();
            organizations_.addAll(other.organizations_);
          }
          onChanged();
        }
      } else {
        if (!other.organizations_.isEmpty()) {
          if (organizationsBuilder_.isEmpty()) {
            organizationsBuilder_.dispose();
            organizationsBuilder_ = null;
            organizations_ = other.organizations_;
            bitField0_ = (bitField0_ & ~0x00000004);
            organizationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOrganizationsFieldBuilder() : null;
          } else {
            organizationsBuilder_.addAllMessages(other.organizations_);
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
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              totalSize_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              com.scalekit.grpc.scalekit.v1.organizations.Organization m =
                  input.readMessage(
                      com.scalekit.grpc.scalekit.v1.organizations.Organization.parser(),
                      extensionRegistry);
              if (organizationsBuilder_ == null) {
                ensureOrganizationsIsMutable();
                organizations_.add(m);
              } else {
                organizationsBuilder_.addMessage(m);
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

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 1 [json_name = "nextPageToken"];</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int totalSize_ ;
    /**
     * <code>uint32 total_size = 2 [json_name = "totalSize"];</code>
     * @return The totalSize.
     */
    @java.lang.Override
    public int getTotalSize() {
      return totalSize_;
    }
    /**
     * <code>uint32 total_size = 2 [json_name = "totalSize"];</code>
     * @param value The totalSize to set.
     * @return This builder for chaining.
     */
    public Builder setTotalSize(int value) {

      totalSize_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 total_size = 2 [json_name = "totalSize"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalSize() {
      bitField0_ = (bitField0_ & ~0x00000002);
      totalSize_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.scalekit.grpc.scalekit.v1.organizations.Organization> organizations_ =
      java.util.Collections.emptyList();
    private void ensureOrganizationsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        organizations_ = new java.util.ArrayList<com.scalekit.grpc.scalekit.v1.organizations.Organization>(organizations_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.organizations.Organization, com.scalekit.grpc.scalekit.v1.organizations.Organization.Builder, com.scalekit.grpc.scalekit.v1.organizations.OrganizationOrBuilder> organizationsBuilder_;

    /**
     * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
     */
    public java.util.List<com.scalekit.grpc.scalekit.v1.organizations.Organization> getOrganizationsList() {
      if (organizationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(organizations_);
      } else {
        return organizationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
     */
    public int getOrganizationsCount() {
      if (organizationsBuilder_ == null) {
        return organizations_.size();
      } else {
        return organizationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.organizations.Organization getOrganizations(int index) {
      if (organizationsBuilder_ == null) {
        return organizations_.get(index);
      } else {
        return organizationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
     */
    public Builder setOrganizations(
        int index, com.scalekit.grpc.scalekit.v1.organizations.Organization value) {
      if (organizationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrganizationsIsMutable();
        organizations_.set(index, value);
        onChanged();
      } else {
        organizationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
     */
    public Builder setOrganizations(
        int index, com.scalekit.grpc.scalekit.v1.organizations.Organization.Builder builderForValue) {
      if (organizationsBuilder_ == null) {
        ensureOrganizationsIsMutable();
        organizations_.set(index, builderForValue.build());
        onChanged();
      } else {
        organizationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
     */
    public Builder addOrganizations(com.scalekit.grpc.scalekit.v1.organizations.Organization value) {
      if (organizationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrganizationsIsMutable();
        organizations_.add(value);
        onChanged();
      } else {
        organizationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
     */
    public Builder addOrganizations(
        int index, com.scalekit.grpc.scalekit.v1.organizations.Organization value) {
      if (organizationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrganizationsIsMutable();
        organizations_.add(index, value);
        onChanged();
      } else {
        organizationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
     */
    public Builder addOrganizations(
        com.scalekit.grpc.scalekit.v1.organizations.Organization.Builder builderForValue) {
      if (organizationsBuilder_ == null) {
        ensureOrganizationsIsMutable();
        organizations_.add(builderForValue.build());
        onChanged();
      } else {
        organizationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
     */
    public Builder addOrganizations(
        int index, com.scalekit.grpc.scalekit.v1.organizations.Organization.Builder builderForValue) {
      if (organizationsBuilder_ == null) {
        ensureOrganizationsIsMutable();
        organizations_.add(index, builderForValue.build());
        onChanged();
      } else {
        organizationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
     */
    public Builder addAllOrganizations(
        java.lang.Iterable<? extends com.scalekit.grpc.scalekit.v1.organizations.Organization> values) {
      if (organizationsBuilder_ == null) {
        ensureOrganizationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, organizations_);
        onChanged();
      } else {
        organizationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
     */
    public Builder clearOrganizations() {
      if (organizationsBuilder_ == null) {
        organizations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        organizationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
     */
    public Builder removeOrganizations(int index) {
      if (organizationsBuilder_ == null) {
        ensureOrganizationsIsMutable();
        organizations_.remove(index);
        onChanged();
      } else {
        organizationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.organizations.Organization.Builder getOrganizationsBuilder(
        int index) {
      return getOrganizationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.organizations.OrganizationOrBuilder getOrganizationsOrBuilder(
        int index) {
      if (organizationsBuilder_ == null) {
        return organizations_.get(index);  } else {
        return organizationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
     */
    public java.util.List<? extends com.scalekit.grpc.scalekit.v1.organizations.OrganizationOrBuilder> 
         getOrganizationsOrBuilderList() {
      if (organizationsBuilder_ != null) {
        return organizationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(organizations_);
      }
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.organizations.Organization.Builder addOrganizationsBuilder() {
      return getOrganizationsFieldBuilder().addBuilder(
          com.scalekit.grpc.scalekit.v1.organizations.Organization.getDefaultInstance());
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.organizations.Organization.Builder addOrganizationsBuilder(
        int index) {
      return getOrganizationsFieldBuilder().addBuilder(
          index, com.scalekit.grpc.scalekit.v1.organizations.Organization.getDefaultInstance());
    }
    /**
     * <code>repeated .scalekit.v1.organizations.Organization organizations = 3 [json_name = "organizations"];</code>
     */
    public java.util.List<com.scalekit.grpc.scalekit.v1.organizations.Organization.Builder> 
         getOrganizationsBuilderList() {
      return getOrganizationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.organizations.Organization, com.scalekit.grpc.scalekit.v1.organizations.Organization.Builder, com.scalekit.grpc.scalekit.v1.organizations.OrganizationOrBuilder> 
        getOrganizationsFieldBuilder() {
      if (organizationsBuilder_ == null) {
        organizationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.organizations.Organization, com.scalekit.grpc.scalekit.v1.organizations.Organization.Builder, com.scalekit.grpc.scalekit.v1.organizations.OrganizationOrBuilder>(
                organizations_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        organizations_ = null;
      }
      return organizationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.organizations.SearchOrganizationsResponse)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.organizations.SearchOrganizationsResponse)
  private static final com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse();
  }

  public static com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchOrganizationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<SearchOrganizationsResponse>() {
    @java.lang.Override
    public SearchOrganizationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchOrganizationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchOrganizationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

