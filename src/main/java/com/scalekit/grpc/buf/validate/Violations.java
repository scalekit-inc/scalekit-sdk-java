// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/validate.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.buf.validate;

/**
 * <pre>
 * `Violations` is a collection of `Violation` messages. This message type is returned by
 * protovalidate when a proto message fails to meet the requirements set by the `Constraint` validation rules.
 * Each individual violation is represented by a `Violation` message.
 * </pre>
 *
 * Protobuf type {@code buf.validate.Violations}
 */
public final class Violations extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:buf.validate.Violations)
    ViolationsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Violations.newBuilder() to construct.
  private Violations(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Violations() {
    violations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Violations();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.buf.validate.ValidateProto.internal_static_buf_validate_Violations_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.buf.validate.ValidateProto.internal_static_buf_validate_Violations_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.buf.validate.Violations.class, com.scalekit.grpc.buf.validate.Violations.Builder.class);
  }

  public static final int VIOLATIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.scalekit.grpc.buf.validate.Violation> violations_;
  /**
   * <pre>
   * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
   * </pre>
   *
   * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
   */
  @java.lang.Override
  public java.util.List<com.scalekit.grpc.buf.validate.Violation> getViolationsList() {
    return violations_;
  }
  /**
   * <pre>
   * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
   * </pre>
   *
   * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.scalekit.grpc.buf.validate.ViolationOrBuilder> 
      getViolationsOrBuilderList() {
    return violations_;
  }
  /**
   * <pre>
   * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
   * </pre>
   *
   * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
   */
  @java.lang.Override
  public int getViolationsCount() {
    return violations_.size();
  }
  /**
   * <pre>
   * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
   * </pre>
   *
   * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.buf.validate.Violation getViolations(int index) {
    return violations_.get(index);
  }
  /**
   * <pre>
   * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
   * </pre>
   *
   * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.buf.validate.ViolationOrBuilder getViolationsOrBuilder(
      int index) {
    return violations_.get(index);
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
    for (int i = 0; i < violations_.size(); i++) {
      output.writeMessage(1, violations_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < violations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, violations_.get(i));
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
    if (!(obj instanceof com.scalekit.grpc.buf.validate.Violations)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.buf.validate.Violations other = (com.scalekit.grpc.buf.validate.Violations) obj;

    if (!getViolationsList()
        .equals(other.getViolationsList())) return false;
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
    if (getViolationsCount() > 0) {
      hash = (37 * hash) + VIOLATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getViolationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.buf.validate.Violations parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.buf.validate.Violations parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.buf.validate.Violations parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.buf.validate.Violations parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.buf.validate.Violations parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.buf.validate.Violations parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.buf.validate.Violations parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.buf.validate.Violations parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.buf.validate.Violations parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.buf.validate.Violations parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.buf.validate.Violations parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.buf.validate.Violations parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.buf.validate.Violations prototype) {
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
   * <pre>
   * `Violations` is a collection of `Violation` messages. This message type is returned by
   * protovalidate when a proto message fails to meet the requirements set by the `Constraint` validation rules.
   * Each individual violation is represented by a `Violation` message.
   * </pre>
   *
   * Protobuf type {@code buf.validate.Violations}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.Violations)
      com.scalekit.grpc.buf.validate.ViolationsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.buf.validate.ValidateProto.internal_static_buf_validate_Violations_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.buf.validate.ValidateProto.internal_static_buf_validate_Violations_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.buf.validate.Violations.class, com.scalekit.grpc.buf.validate.Violations.Builder.class);
    }

    // Construct using com.scalekit.grpc.buf.validate.Violations.newBuilder()
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
      if (violationsBuilder_ == null) {
        violations_ = java.util.Collections.emptyList();
      } else {
        violations_ = null;
        violationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.buf.validate.ValidateProto.internal_static_buf_validate_Violations_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.buf.validate.Violations getDefaultInstanceForType() {
      return com.scalekit.grpc.buf.validate.Violations.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.buf.validate.Violations build() {
      com.scalekit.grpc.buf.validate.Violations result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.buf.validate.Violations buildPartial() {
      com.scalekit.grpc.buf.validate.Violations result = new com.scalekit.grpc.buf.validate.Violations(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.scalekit.grpc.buf.validate.Violations result) {
      if (violationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          violations_ = java.util.Collections.unmodifiableList(violations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.violations_ = violations_;
      } else {
        result.violations_ = violationsBuilder_.build();
      }
    }

    private void buildPartial0(com.scalekit.grpc.buf.validate.Violations result) {
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
      if (other instanceof com.scalekit.grpc.buf.validate.Violations) {
        return mergeFrom((com.scalekit.grpc.buf.validate.Violations)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.buf.validate.Violations other) {
      if (other == com.scalekit.grpc.buf.validate.Violations.getDefaultInstance()) return this;
      if (violationsBuilder_ == null) {
        if (!other.violations_.isEmpty()) {
          if (violations_.isEmpty()) {
            violations_ = other.violations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureViolationsIsMutable();
            violations_.addAll(other.violations_);
          }
          onChanged();
        }
      } else {
        if (!other.violations_.isEmpty()) {
          if (violationsBuilder_.isEmpty()) {
            violationsBuilder_.dispose();
            violationsBuilder_ = null;
            violations_ = other.violations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            violationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getViolationsFieldBuilder() : null;
          } else {
            violationsBuilder_.addAllMessages(other.violations_);
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
              com.scalekit.grpc.buf.validate.Violation m =
                  input.readMessage(
                      com.scalekit.grpc.buf.validate.Violation.PARSER,
                      extensionRegistry);
              if (violationsBuilder_ == null) {
                ensureViolationsIsMutable();
                violations_.add(m);
              } else {
                violationsBuilder_.addMessage(m);
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

    private java.util.List<com.scalekit.grpc.buf.validate.Violation> violations_ =
      java.util.Collections.emptyList();
    private void ensureViolationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        violations_ = new java.util.ArrayList<com.scalekit.grpc.buf.validate.Violation>(violations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalekit.grpc.buf.validate.Violation, com.scalekit.grpc.buf.validate.Violation.Builder, com.scalekit.grpc.buf.validate.ViolationOrBuilder> violationsBuilder_;

    /**
     * <pre>
     * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
     * </pre>
     *
     * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
     */
    public java.util.List<com.scalekit.grpc.buf.validate.Violation> getViolationsList() {
      if (violationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(violations_);
      } else {
        return violationsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
     * </pre>
     *
     * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
     */
    public int getViolationsCount() {
      if (violationsBuilder_ == null) {
        return violations_.size();
      } else {
        return violationsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
     * </pre>
     *
     * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
     */
    public com.scalekit.grpc.buf.validate.Violation getViolations(int index) {
      if (violationsBuilder_ == null) {
        return violations_.get(index);
      } else {
        return violationsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
     * </pre>
     *
     * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
     */
    public Builder setViolations(
        int index, com.scalekit.grpc.buf.validate.Violation value) {
      if (violationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureViolationsIsMutable();
        violations_.set(index, value);
        onChanged();
      } else {
        violationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
     * </pre>
     *
     * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
     */
    public Builder setViolations(
        int index, com.scalekit.grpc.buf.validate.Violation.Builder builderForValue) {
      if (violationsBuilder_ == null) {
        ensureViolationsIsMutable();
        violations_.set(index, builderForValue.build());
        onChanged();
      } else {
        violationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
     * </pre>
     *
     * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
     */
    public Builder addViolations(com.scalekit.grpc.buf.validate.Violation value) {
      if (violationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureViolationsIsMutable();
        violations_.add(value);
        onChanged();
      } else {
        violationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
     * </pre>
     *
     * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
     */
    public Builder addViolations(
        int index, com.scalekit.grpc.buf.validate.Violation value) {
      if (violationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureViolationsIsMutable();
        violations_.add(index, value);
        onChanged();
      } else {
        violationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
     * </pre>
     *
     * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
     */
    public Builder addViolations(
        com.scalekit.grpc.buf.validate.Violation.Builder builderForValue) {
      if (violationsBuilder_ == null) {
        ensureViolationsIsMutable();
        violations_.add(builderForValue.build());
        onChanged();
      } else {
        violationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
     * </pre>
     *
     * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
     */
    public Builder addViolations(
        int index, com.scalekit.grpc.buf.validate.Violation.Builder builderForValue) {
      if (violationsBuilder_ == null) {
        ensureViolationsIsMutable();
        violations_.add(index, builderForValue.build());
        onChanged();
      } else {
        violationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
     * </pre>
     *
     * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
     */
    public Builder addAllViolations(
        java.lang.Iterable<? extends com.scalekit.grpc.buf.validate.Violation> values) {
      if (violationsBuilder_ == null) {
        ensureViolationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, violations_);
        onChanged();
      } else {
        violationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
     * </pre>
     *
     * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
     */
    public Builder clearViolations() {
      if (violationsBuilder_ == null) {
        violations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        violationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
     * </pre>
     *
     * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
     */
    public Builder removeViolations(int index) {
      if (violationsBuilder_ == null) {
        ensureViolationsIsMutable();
        violations_.remove(index);
        onChanged();
      } else {
        violationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
     * </pre>
     *
     * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
     */
    public com.scalekit.grpc.buf.validate.Violation.Builder getViolationsBuilder(
        int index) {
      return getViolationsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
     * </pre>
     *
     * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
     */
    public com.scalekit.grpc.buf.validate.ViolationOrBuilder getViolationsOrBuilder(
        int index) {
      if (violationsBuilder_ == null) {
        return violations_.get(index);  } else {
        return violationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
     * </pre>
     *
     * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
     */
    public java.util.List<? extends com.scalekit.grpc.buf.validate.ViolationOrBuilder> 
         getViolationsOrBuilderList() {
      if (violationsBuilder_ != null) {
        return violationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(violations_);
      }
    }
    /**
     * <pre>
     * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
     * </pre>
     *
     * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
     */
    public com.scalekit.grpc.buf.validate.Violation.Builder addViolationsBuilder() {
      return getViolationsFieldBuilder().addBuilder(
          com.scalekit.grpc.buf.validate.Violation.getDefaultInstance());
    }
    /**
     * <pre>
     * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
     * </pre>
     *
     * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
     */
    public com.scalekit.grpc.buf.validate.Violation.Builder addViolationsBuilder(
        int index) {
      return getViolationsFieldBuilder().addBuilder(
          index, com.scalekit.grpc.buf.validate.Violation.getDefaultInstance());
    }
    /**
     * <pre>
     * `violations` is a repeated field that contains all the `Violation` messages corresponding to the violations detected.
     * </pre>
     *
     * <code>repeated .buf.validate.Violation violations = 1 [json_name = "violations"];</code>
     */
    public java.util.List<com.scalekit.grpc.buf.validate.Violation.Builder> 
         getViolationsBuilderList() {
      return getViolationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.scalekit.grpc.buf.validate.Violation, com.scalekit.grpc.buf.validate.Violation.Builder, com.scalekit.grpc.buf.validate.ViolationOrBuilder> 
        getViolationsFieldBuilder() {
      if (violationsBuilder_ == null) {
        violationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.scalekit.grpc.buf.validate.Violation, com.scalekit.grpc.buf.validate.Violation.Builder, com.scalekit.grpc.buf.validate.ViolationOrBuilder>(
                violations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        violations_ = null;
      }
      return violationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:buf.validate.Violations)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.Violations)
  private static final com.scalekit.grpc.buf.validate.Violations DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.buf.validate.Violations();
  }

  public static com.scalekit.grpc.buf.validate.Violations getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<Violations>
      PARSER = new com.google.protobuf.AbstractParser<Violations>() {
    @java.lang.Override
    public Violations parsePartialFrom(
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

  public static com.google.protobuf.Parser<Violations> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Violations> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.buf.validate.Violations getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

