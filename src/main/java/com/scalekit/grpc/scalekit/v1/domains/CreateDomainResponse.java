// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/domains/domains.proto

package com.scalekit.grpc.scalekit.v1.domains;

/**
 * Protobuf type {@code scalekit.v1.domains.CreateDomainResponse}
 */
public final class CreateDomainResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.domains.CreateDomainResponse)
    CreateDomainResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateDomainResponse.newBuilder() to construct.
  private CreateDomainResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateDomainResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateDomainResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.domains.DomainsProto.internal_static_scalekit_v1_domains_CreateDomainResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.domains.DomainsProto.internal_static_scalekit_v1_domains_CreateDomainResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse.class, com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse.Builder.class);
  }

  public static final int DOMAIN_FIELD_NUMBER = 1;
  private com.scalekit.grpc.scalekit.v1.domains.Domain domain_;
  /**
   * <code>.scalekit.v1.domains.Domain domain = 1 [json_name = "domain"];</code>
   * @return Whether the domain field is set.
   */
  @java.lang.Override
  public boolean hasDomain() {
    return domain_ != null;
  }
  /**
   * <code>.scalekit.v1.domains.Domain domain = 1 [json_name = "domain"];</code>
   * @return The domain.
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.domains.Domain getDomain() {
    return domain_ == null ? com.scalekit.grpc.scalekit.v1.domains.Domain.getDefaultInstance() : domain_;
  }
  /**
   * <code>.scalekit.v1.domains.Domain domain = 1 [json_name = "domain"];</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.domains.DomainOrBuilder getDomainOrBuilder() {
    return domain_ == null ? com.scalekit.grpc.scalekit.v1.domains.Domain.getDefaultInstance() : domain_;
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
    if (domain_ != null) {
      output.writeMessage(1, getDomain());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (domain_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDomain());
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse other = (com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse) obj;

    if (hasDomain() != other.hasDomain()) return false;
    if (hasDomain()) {
      if (!getDomain()
          .equals(other.getDomain())) return false;
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
    if (hasDomain()) {
      hash = (37 * hash) + DOMAIN_FIELD_NUMBER;
      hash = (53 * hash) + getDomain().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse prototype) {
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
   * Protobuf type {@code scalekit.v1.domains.CreateDomainResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.domains.CreateDomainResponse)
      com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.domains.DomainsProto.internal_static_scalekit_v1_domains_CreateDomainResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.domains.DomainsProto.internal_static_scalekit_v1_domains_CreateDomainResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse.class, com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse.newBuilder()
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
      domain_ = null;
      if (domainBuilder_ != null) {
        domainBuilder_.dispose();
        domainBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.domains.DomainsProto.internal_static_scalekit_v1_domains_CreateDomainResponse_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse build() {
      com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse buildPartial() {
      com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse result = new com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.domain_ = domainBuilder_ == null
            ? domain_
            : domainBuilder_.build();
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse other) {
      if (other == com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse.getDefaultInstance()) return this;
      if (other.hasDomain()) {
        mergeDomain(other.getDomain());
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
                  getDomainFieldBuilder().getBuilder(),
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

    private com.scalekit.grpc.scalekit.v1.domains.Domain domain_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.domains.Domain, com.scalekit.grpc.scalekit.v1.domains.Domain.Builder, com.scalekit.grpc.scalekit.v1.domains.DomainOrBuilder> domainBuilder_;
    /**
     * <code>.scalekit.v1.domains.Domain domain = 1 [json_name = "domain"];</code>
     * @return Whether the domain field is set.
     */
    public boolean hasDomain() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.scalekit.v1.domains.Domain domain = 1 [json_name = "domain"];</code>
     * @return The domain.
     */
    public com.scalekit.grpc.scalekit.v1.domains.Domain getDomain() {
      if (domainBuilder_ == null) {
        return domain_ == null ? com.scalekit.grpc.scalekit.v1.domains.Domain.getDefaultInstance() : domain_;
      } else {
        return domainBuilder_.getMessage();
      }
    }
    /**
     * <code>.scalekit.v1.domains.Domain domain = 1 [json_name = "domain"];</code>
     */
    public Builder setDomain(com.scalekit.grpc.scalekit.v1.domains.Domain value) {
      if (domainBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        domain_ = value;
      } else {
        domainBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.domains.Domain domain = 1 [json_name = "domain"];</code>
     */
    public Builder setDomain(
        com.scalekit.grpc.scalekit.v1.domains.Domain.Builder builderForValue) {
      if (domainBuilder_ == null) {
        domain_ = builderForValue.build();
      } else {
        domainBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.domains.Domain domain = 1 [json_name = "domain"];</code>
     */
    public Builder mergeDomain(com.scalekit.grpc.scalekit.v1.domains.Domain value) {
      if (domainBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          domain_ != null &&
          domain_ != com.scalekit.grpc.scalekit.v1.domains.Domain.getDefaultInstance()) {
          getDomainBuilder().mergeFrom(value);
        } else {
          domain_ = value;
        }
      } else {
        domainBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.domains.Domain domain = 1 [json_name = "domain"];</code>
     */
    public Builder clearDomain() {
      bitField0_ = (bitField0_ & ~0x00000001);
      domain_ = null;
      if (domainBuilder_ != null) {
        domainBuilder_.dispose();
        domainBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.scalekit.v1.domains.Domain domain = 1 [json_name = "domain"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.domains.Domain.Builder getDomainBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDomainFieldBuilder().getBuilder();
    }
    /**
     * <code>.scalekit.v1.domains.Domain domain = 1 [json_name = "domain"];</code>
     */
    public com.scalekit.grpc.scalekit.v1.domains.DomainOrBuilder getDomainOrBuilder() {
      if (domainBuilder_ != null) {
        return domainBuilder_.getMessageOrBuilder();
      } else {
        return domain_ == null ?
            com.scalekit.grpc.scalekit.v1.domains.Domain.getDefaultInstance() : domain_;
      }
    }
    /**
     * <code>.scalekit.v1.domains.Domain domain = 1 [json_name = "domain"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.scalekit.grpc.scalekit.v1.domains.Domain, com.scalekit.grpc.scalekit.v1.domains.Domain.Builder, com.scalekit.grpc.scalekit.v1.domains.DomainOrBuilder> 
        getDomainFieldBuilder() {
      if (domainBuilder_ == null) {
        domainBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.scalekit.grpc.scalekit.v1.domains.Domain, com.scalekit.grpc.scalekit.v1.domains.Domain.Builder, com.scalekit.grpc.scalekit.v1.domains.DomainOrBuilder>(
                getDomain(),
                getParentForChildren(),
                isClean());
        domain_ = null;
      }
      return domainBuilder_;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.domains.CreateDomainResponse)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.domains.CreateDomainResponse)
  private static final com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse();
  }

  public static com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDomainResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateDomainResponse>() {
    @java.lang.Override
    public CreateDomainResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDomainResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDomainResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
