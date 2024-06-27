// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/connections/connections.proto

package com.scalekit.grpc.scalekit.v1.connections;

/**
 * Protobuf type {@code scalekit.v1.connections.GetSAMLCertificateDetailsResponse}
 */
public final class GetSAMLCertificateDetailsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scalekit.v1.connections.GetSAMLCertificateDetailsResponse)
    GetSAMLCertificateDetailsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSAMLCertificateDetailsResponse.newBuilder() to construct.
  private GetSAMLCertificateDetailsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSAMLCertificateDetailsResponse() {
    text_ = "";
    subject_ = "";
    issuer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetSAMLCertificateDetailsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_GetSAMLCertificateDetailsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_GetSAMLCertificateDetailsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse.class, com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse.Builder.class);
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object text_ = "";
  /**
   * <code>string text = 1 [json_name = "text"];</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      text_ = s;
      return s;
    }
  }
  /**
   * <code>string text = 1 [json_name = "text"];</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      text_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NOT_AFTER_FIELD_NUMBER = 2;
  private long notAfter_ = 0L;
  /**
   * <code>int64 not_after = 2 [json_name = "notAfter"];</code>
   * @return The notAfter.
   */
  @java.lang.Override
  public long getNotAfter() {
    return notAfter_;
  }

  public static final int NOT_BEFORE_FIELD_NUMBER = 3;
  private long notBefore_ = 0L;
  /**
   * <code>int64 not_before = 3 [json_name = "notBefore"];</code>
   * @return The notBefore.
   */
  @java.lang.Override
  public long getNotBefore() {
    return notBefore_;
  }

  public static final int SUBJECT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subject_ = "";
  /**
   * <code>string subject = 4 [json_name = "subject"];</code>
   * @return The subject.
   */
  @java.lang.Override
  public java.lang.String getSubject() {
    java.lang.Object ref = subject_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subject_ = s;
      return s;
    }
  }
  /**
   * <code>string subject = 4 [json_name = "subject"];</code>
   * @return The bytes for subject.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubjectBytes() {
    java.lang.Object ref = subject_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subject_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISSUER_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object issuer_ = "";
  /**
   * <code>string issuer = 5 [json_name = "issuer"];</code>
   * @return The issuer.
   */
  @java.lang.Override
  public java.lang.String getIssuer() {
    java.lang.Object ref = issuer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      issuer_ = s;
      return s;
    }
  }
  /**
   * <code>string issuer = 5 [json_name = "issuer"];</code>
   * @return The bytes for issuer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIssuerBytes() {
    java.lang.Object ref = issuer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      issuer_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, text_);
    }
    if (notAfter_ != 0L) {
      output.writeInt64(2, notAfter_);
    }
    if (notBefore_ != 0L) {
      output.writeInt64(3, notBefore_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subject_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, subject_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(issuer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, issuer_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, text_);
    }
    if (notAfter_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, notAfter_);
    }
    if (notBefore_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, notBefore_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subject_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, subject_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(issuer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, issuer_);
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
    if (!(obj instanceof com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse other = (com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse) obj;

    if (!getText()
        .equals(other.getText())) return false;
    if (getNotAfter()
        != other.getNotAfter()) return false;
    if (getNotBefore()
        != other.getNotBefore()) return false;
    if (!getSubject()
        .equals(other.getSubject())) return false;
    if (!getIssuer()
        .equals(other.getIssuer())) return false;
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
    hash = (37 * hash) + TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getText().hashCode();
    hash = (37 * hash) + NOT_AFTER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNotAfter());
    hash = (37 * hash) + NOT_BEFORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNotBefore());
    hash = (37 * hash) + SUBJECT_FIELD_NUMBER;
    hash = (53 * hash) + getSubject().hashCode();
    hash = (37 * hash) + ISSUER_FIELD_NUMBER;
    hash = (53 * hash) + getIssuer().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse prototype) {
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
   * Protobuf type {@code scalekit.v1.connections.GetSAMLCertificateDetailsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scalekit.v1.connections.GetSAMLCertificateDetailsResponse)
      com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_GetSAMLCertificateDetailsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_GetSAMLCertificateDetailsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse.class, com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse.Builder.class);
    }

    // Construct using com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse.newBuilder()
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
      text_ = "";
      notAfter_ = 0L;
      notBefore_ = 0L;
      subject_ = "";
      issuer_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.internal_static_scalekit_v1_connections_GetSAMLCertificateDetailsResponse_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse getDefaultInstanceForType() {
      return com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse build() {
      com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse buildPartial() {
      com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse result = new com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.text_ = text_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.notAfter_ = notAfter_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.notBefore_ = notBefore_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.subject_ = subject_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.issuer_ = issuer_;
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
      if (other instanceof com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse) {
        return mergeFrom((com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse other) {
      if (other == com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse.getDefaultInstance()) return this;
      if (!other.getText().isEmpty()) {
        text_ = other.text_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getNotAfter() != 0L) {
        setNotAfter(other.getNotAfter());
      }
      if (other.getNotBefore() != 0L) {
        setNotBefore(other.getNotBefore());
      }
      if (!other.getSubject().isEmpty()) {
        subject_ = other.subject_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getIssuer().isEmpty()) {
        issuer_ = other.issuer_;
        bitField0_ |= 0x00000010;
        onChanged();
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
              text_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              notAfter_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              notBefore_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              subject_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              issuer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private java.lang.Object text_ = "";
    /**
     * <code>string text = 1 [json_name = "text"];</code>
     * @return The text.
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string text = 1 [json_name = "text"];</code>
     * @return The bytes for text.
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string text = 1 [json_name = "text"];</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      text_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string text = 1 [json_name = "text"];</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      text_ = getDefaultInstance().getText();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string text = 1 [json_name = "text"];</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      text_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long notAfter_ ;
    /**
     * <code>int64 not_after = 2 [json_name = "notAfter"];</code>
     * @return The notAfter.
     */
    @java.lang.Override
    public long getNotAfter() {
      return notAfter_;
    }
    /**
     * <code>int64 not_after = 2 [json_name = "notAfter"];</code>
     * @param value The notAfter to set.
     * @return This builder for chaining.
     */
    public Builder setNotAfter(long value) {

      notAfter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 not_after = 2 [json_name = "notAfter"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNotAfter() {
      bitField0_ = (bitField0_ & ~0x00000002);
      notAfter_ = 0L;
      onChanged();
      return this;
    }

    private long notBefore_ ;
    /**
     * <code>int64 not_before = 3 [json_name = "notBefore"];</code>
     * @return The notBefore.
     */
    @java.lang.Override
    public long getNotBefore() {
      return notBefore_;
    }
    /**
     * <code>int64 not_before = 3 [json_name = "notBefore"];</code>
     * @param value The notBefore to set.
     * @return This builder for chaining.
     */
    public Builder setNotBefore(long value) {

      notBefore_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 not_before = 3 [json_name = "notBefore"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNotBefore() {
      bitField0_ = (bitField0_ & ~0x00000004);
      notBefore_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object subject_ = "";
    /**
     * <code>string subject = 4 [json_name = "subject"];</code>
     * @return The subject.
     */
    public java.lang.String getSubject() {
      java.lang.Object ref = subject_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subject_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string subject = 4 [json_name = "subject"];</code>
     * @return The bytes for subject.
     */
    public com.google.protobuf.ByteString
        getSubjectBytes() {
      java.lang.Object ref = subject_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subject_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string subject = 4 [json_name = "subject"];</code>
     * @param value The subject to set.
     * @return This builder for chaining.
     */
    public Builder setSubject(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subject_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string subject = 4 [json_name = "subject"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubject() {
      subject_ = getDefaultInstance().getSubject();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string subject = 4 [json_name = "subject"];</code>
     * @param value The bytes for subject to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subject_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object issuer_ = "";
    /**
     * <code>string issuer = 5 [json_name = "issuer"];</code>
     * @return The issuer.
     */
    public java.lang.String getIssuer() {
      java.lang.Object ref = issuer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        issuer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string issuer = 5 [json_name = "issuer"];</code>
     * @return The bytes for issuer.
     */
    public com.google.protobuf.ByteString
        getIssuerBytes() {
      java.lang.Object ref = issuer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        issuer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string issuer = 5 [json_name = "issuer"];</code>
     * @param value The issuer to set.
     * @return This builder for chaining.
     */
    public Builder setIssuer(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      issuer_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string issuer = 5 [json_name = "issuer"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIssuer() {
      issuer_ = getDefaultInstance().getIssuer();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string issuer = 5 [json_name = "issuer"];</code>
     * @param value The bytes for issuer to set.
     * @return This builder for chaining.
     */
    public Builder setIssuerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      issuer_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:scalekit.v1.connections.GetSAMLCertificateDetailsResponse)
  }

  // @@protoc_insertion_point(class_scope:scalekit.v1.connections.GetSAMLCertificateDetailsResponse)
  private static final com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse();
  }

  public static com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSAMLCertificateDetailsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetSAMLCertificateDetailsResponse>() {
    @java.lang.Override
    public GetSAMLCertificateDetailsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetSAMLCertificateDetailsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSAMLCertificateDetailsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.scalekit.v1.connections.GetSAMLCertificateDetailsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

