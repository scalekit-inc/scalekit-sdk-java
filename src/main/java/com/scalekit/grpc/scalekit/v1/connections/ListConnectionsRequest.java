// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/connections/connections.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.connections;

/**
 * Protobuf type {@code scalekit.v1.connections.ListConnectionsRequest}
 */
public final class ListConnectionsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.connections.ListConnectionsRequest)
    ListConnectionsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListConnectionsRequest.newBuilder() to construct.
  private ListConnectionsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListConnectionsRequest() {
    include_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListConnectionsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_ListConnectionsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_ListConnectionsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest.class, com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest.Builder.class);
  }

  private int bitField0_;
  private int identitiesCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object identities_;
  public enum IdentitiesCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ORGANIZATION_ID(1),
    EXTERNAL_ID(2),
    DOMAIN(3),
    IDENTITIES_NOT_SET(0);
    private final int value;
    private IdentitiesCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static IdentitiesCase valueOf(int value) {
      return forNumber(value);
    }

    public static IdentitiesCase forNumber(int value) {
      switch (value) {
        case 1: return ORGANIZATION_ID;
        case 2: return EXTERNAL_ID;
        case 3: return DOMAIN;
        case 0: return IDENTITIES_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public IdentitiesCase
  getIdentitiesCase() {
    return IdentitiesCase.forNumber(
        identitiesCase_);
  }

  public static final int ORGANIZATION_ID_FIELD_NUMBER = 1;
  /**
   * <code>string organization_id = 1 [json_name = "organizationId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the organizationId field is set.
   */
  public boolean hasOrganizationId() {
    return identitiesCase_ == 1;
  }
  /**
   * <code>string organization_id = 1 [json_name = "organizationId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The organizationId.
   */
  public java.lang.String getOrganizationId() {
    java.lang.Object ref = "";
    if (identitiesCase_ == 1) {
      ref = identities_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (identitiesCase_ == 1) {
        identities_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string organization_id = 1 [json_name = "organizationId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for organizationId.
   */
  public com.google.protobuf.ByteString
      getOrganizationIdBytes() {
    java.lang.Object ref = "";
    if (identitiesCase_ == 1) {
      ref = identities_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (identitiesCase_ == 1) {
        identities_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTERNAL_ID_FIELD_NUMBER = 2;
  /**
   * <code>string external_id = 2 [json_name = "externalId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the externalId field is set.
   */
  public boolean hasExternalId() {
    return identitiesCase_ == 2;
  }
  /**
   * <code>string external_id = 2 [json_name = "externalId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The externalId.
   */
  public java.lang.String getExternalId() {
    java.lang.Object ref = "";
    if (identitiesCase_ == 2) {
      ref = identities_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (identitiesCase_ == 2) {
        identities_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string external_id = 2 [json_name = "externalId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for externalId.
   */
  public com.google.protobuf.ByteString
      getExternalIdBytes() {
    java.lang.Object ref = "";
    if (identitiesCase_ == 2) {
      ref = identities_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (identitiesCase_ == 2) {
        identities_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOMAIN_FIELD_NUMBER = 3;
  /**
   * <code>string domain = 3 [json_name = "domain", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the domain field is set.
   */
  public boolean hasDomain() {
    return identitiesCase_ == 3;
  }
  /**
   * <code>string domain = 3 [json_name = "domain", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The domain.
   */
  public java.lang.String getDomain() {
    java.lang.Object ref = "";
    if (identitiesCase_ == 3) {
      ref = identities_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (identitiesCase_ == 3) {
        identities_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string domain = 3 [json_name = "domain", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for domain.
   */
  public com.google.protobuf.ByteString
      getDomainBytes() {
    java.lang.Object ref = "";
    if (identitiesCase_ == 3) {
      ref = identities_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (identitiesCase_ == 3) {
        identities_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INCLUDE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object include_ = "";
  /**
   * <code>optional string include = 4 [json_name = "include"];</code>
   * @return Whether the include field is set.
   */
  @java.lang.Override
  public boolean hasInclude() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string include = 4 [json_name = "include"];</code>
   * @return The include.
   */
  @java.lang.Override
  public java.lang.String getInclude() {
    java.lang.Object ref = include_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      include_ = s;
      return s;
    }
  }
  /**
   * <code>optional string include = 4 [json_name = "include"];</code>
   * @return The bytes for include.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIncludeBytes() {
    java.lang.Object ref = include_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      include_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (identitiesCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, identities_);
    }
    if (identitiesCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, identities_);
    }
    if (identitiesCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, identities_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, include_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (identitiesCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, identities_);
    }
    if (identitiesCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, identities_);
    }
    if (identitiesCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, identities_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, include_);
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest other = (com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest) obj;

    if (hasInclude() != other.hasInclude()) return false;
    if (hasInclude()) {
      if (!getInclude()
          .equals(other.getInclude())) return false;
    }
    if (!getIdentitiesCase().equals(other.getIdentitiesCase())) return false;
    switch (identitiesCase_) {
      case 1:
        if (!getOrganizationId()
            .equals(other.getOrganizationId())) return false;
        break;
      case 2:
        if (!getExternalId()
            .equals(other.getExternalId())) return false;
        break;
      case 3:
        if (!getDomain()
            .equals(other.getDomain())) return false;
        break;
      case 0:
      default:
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
    if (hasInclude()) {
      hash = (37 * hash) + INCLUDE_FIELD_NUMBER;
      hash = (53 * hash) + getInclude().hashCode();
    }
    switch (identitiesCase_) {
      case 1:
        hash = (37 * hash) + ORGANIZATION_ID_FIELD_NUMBER;
        hash = (53 * hash) + getOrganizationId().hashCode();
        break;
      case 2:
        hash = (37 * hash) + EXTERNAL_ID_FIELD_NUMBER;
        hash = (53 * hash) + getExternalId().hashCode();
        break;
      case 3:
        hash = (37 * hash) + DOMAIN_FIELD_NUMBER;
        hash = (53 * hash) + getDomain().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest prototype) {
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
   * Protobuf type {@code scalekit.v1.connections.ListConnectionsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.connections.ListConnectionsRequest)
      com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_ListConnectionsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_ListConnectionsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest.class, com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest.newBuilder()
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
      include_ = "";
      identitiesCase_ = 0;
      identities_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_ListConnectionsRequest_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest build() {
      com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest buildPartial() {
      com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest result = new com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.include_ = include_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    private void buildPartialOneofs(com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest result) {
      result.identitiesCase_ = identitiesCase_;
      result.identities_ = this.identities_;
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest other) {
      if (other == com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest.getDefaultInstance()) return this;
      if (other.hasInclude()) {
        include_ = other.include_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      switch (other.getIdentitiesCase()) {
        case ORGANIZATION_ID: {
          identitiesCase_ = 1;
          identities_ = other.identities_;
          onChanged();
          break;
        }
        case EXTERNAL_ID: {
          identitiesCase_ = 2;
          identities_ = other.identities_;
          onChanged();
          break;
        }
        case DOMAIN: {
          identitiesCase_ = 3;
          identities_ = other.identities_;
          onChanged();
          break;
        }
        case IDENTITIES_NOT_SET: {
          break;
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
              java.lang.String s = input.readStringRequireUtf8();
              identitiesCase_ = 1;
              identities_ = s;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              identitiesCase_ = 2;
              identities_ = s;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              identitiesCase_ = 3;
              identities_ = s;
              break;
            } // case 26
            case 34: {
              include_ = input.readStringRequireUtf8();
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
    private int identitiesCase_ = 0;
    private java.lang.Object identities_;
    public IdentitiesCase
        getIdentitiesCase() {
      return IdentitiesCase.forNumber(
          identitiesCase_);
    }

    public Builder clearIdentities() {
      identitiesCase_ = 0;
      identities_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <code>string organization_id = 1 [json_name = "organizationId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the organizationId field is set.
     */
    @java.lang.Override
    public boolean hasOrganizationId() {
      return identitiesCase_ == 1;
    }
    /**
     * <code>string organization_id = 1 [json_name = "organizationId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The organizationId.
     */
    @java.lang.Override
    public java.lang.String getOrganizationId() {
      java.lang.Object ref = "";
      if (identitiesCase_ == 1) {
        ref = identities_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (identitiesCase_ == 1) {
          identities_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string organization_id = 1 [json_name = "organizationId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The bytes for organizationId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getOrganizationIdBytes() {
      java.lang.Object ref = "";
      if (identitiesCase_ == 1) {
        ref = identities_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (identitiesCase_ == 1) {
          identities_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string organization_id = 1 [json_name = "organizationId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The organizationId to set.
     * @return This builder for chaining.
     */
    public Builder setOrganizationId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      identitiesCase_ = 1;
      identities_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string organization_id = 1 [json_name = "organizationId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearOrganizationId() {
      if (identitiesCase_ == 1) {
        identitiesCase_ = 0;
        identities_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string organization_id = 1 [json_name = "organizationId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for organizationId to set.
     * @return This builder for chaining.
     */
    public Builder setOrganizationIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      identitiesCase_ = 1;
      identities_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string external_id = 2 [json_name = "externalId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the externalId field is set.
     */
    @java.lang.Override
    public boolean hasExternalId() {
      return identitiesCase_ == 2;
    }
    /**
     * <code>string external_id = 2 [json_name = "externalId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The externalId.
     */
    @java.lang.Override
    public java.lang.String getExternalId() {
      java.lang.Object ref = "";
      if (identitiesCase_ == 2) {
        ref = identities_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (identitiesCase_ == 2) {
          identities_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string external_id = 2 [json_name = "externalId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The bytes for externalId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getExternalIdBytes() {
      java.lang.Object ref = "";
      if (identitiesCase_ == 2) {
        ref = identities_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (identitiesCase_ == 2) {
          identities_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string external_id = 2 [json_name = "externalId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The externalId to set.
     * @return This builder for chaining.
     */
    public Builder setExternalId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      identitiesCase_ = 2;
      identities_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string external_id = 2 [json_name = "externalId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearExternalId() {
      if (identitiesCase_ == 2) {
        identitiesCase_ = 0;
        identities_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string external_id = 2 [json_name = "externalId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for externalId to set.
     * @return This builder for chaining.
     */
    public Builder setExternalIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      identitiesCase_ = 2;
      identities_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string domain = 3 [json_name = "domain", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return Whether the domain field is set.
     */
    @java.lang.Override
    public boolean hasDomain() {
      return identitiesCase_ == 3;
    }
    /**
     * <code>string domain = 3 [json_name = "domain", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The domain.
     */
    @java.lang.Override
    public java.lang.String getDomain() {
      java.lang.Object ref = "";
      if (identitiesCase_ == 3) {
        ref = identities_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (identitiesCase_ == 3) {
          identities_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string domain = 3 [json_name = "domain", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The bytes for domain.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDomainBytes() {
      java.lang.Object ref = "";
      if (identitiesCase_ == 3) {
        ref = identities_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (identitiesCase_ == 3) {
          identities_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string domain = 3 [json_name = "domain", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The domain to set.
     * @return This builder for chaining.
     */
    public Builder setDomain(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      identitiesCase_ = 3;
      identities_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string domain = 3 [json_name = "domain", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearDomain() {
      if (identitiesCase_ == 3) {
        identitiesCase_ = 0;
        identities_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string domain = 3 [json_name = "domain", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for domain to set.
     * @return This builder for chaining.
     */
    public Builder setDomainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      identitiesCase_ = 3;
      identities_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object include_ = "";
    /**
     * <code>optional string include = 4 [json_name = "include"];</code>
     * @return Whether the include field is set.
     */
    public boolean hasInclude() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional string include = 4 [json_name = "include"];</code>
     * @return The include.
     */
    public java.lang.String getInclude() {
      java.lang.Object ref = include_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        include_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string include = 4 [json_name = "include"];</code>
     * @return The bytes for include.
     */
    public com.google.protobuf.ByteString
        getIncludeBytes() {
      java.lang.Object ref = include_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        include_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string include = 4 [json_name = "include"];</code>
     * @param value The include to set.
     * @return This builder for chaining.
     */
    public Builder setInclude(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      include_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional string include = 4 [json_name = "include"];</code>
     * @return This builder for chaining.
     */
    public Builder clearInclude() {
      include_ = getDefaultInstance().getInclude();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>optional string include = 4 [json_name = "include"];</code>
     * @param value The bytes for include to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      include_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.connections.ListConnectionsRequest)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.connections.ListConnectionsRequest)
  private static final com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest();
  }

  public static com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListConnectionsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListConnectionsRequest>() {
    @java.lang.Override
    public ListConnectionsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListConnectionsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListConnectionsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

