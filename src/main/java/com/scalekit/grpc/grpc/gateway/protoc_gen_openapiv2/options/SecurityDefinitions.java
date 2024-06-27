// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoc-gen-openapiv2/options/openapiv2.proto

package com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options;

/**
 * <pre>
 * `SecurityDefinitions` is a representation of OpenAPI v2 specification's
 * Security Definitions object.
 *
 * See: https://github.com/OAI/OpenAPI-Specification/blob/3.0.0/versions/2.0.md#securityDefinitionsObject
 *
 * A declaration of the security schemes available to be used in the
 * specification. This does not enforce the security schemes on the operations
 * and only serves to provide the relevant details for each scheme.
 * </pre>
 *
 * Protobuf type {@code grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions}
 */
public final class SecurityDefinitions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions)
    SecurityDefinitionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SecurityDefinitions.newBuilder() to construct.
  private SecurityDefinitions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SecurityDefinitions() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SecurityDefinitions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_SecurityDefinitions_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetSecurity();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_SecurityDefinitions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions.class, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions.Builder.class);
  }

  public static final int SECURITY_FIELD_NUMBER = 1;
  private static final class SecurityDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme>newDefaultInstance(
                com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_SecurityDefinitions_SecurityEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme> security_;
  private com.google.protobuf.MapField<java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme>
  internalGetSecurity() {
    if (security_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          SecurityDefaultEntryHolder.defaultEntry);
    }
    return security_;
  }
  public int getSecurityCount() {
    return internalGetSecurity().getMap().size();
  }
  /**
   * <pre>
   * A single security scheme definition, mapping a "name" to the scheme it
   * defines.
   * </pre>
   *
   * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme&gt; security = 1 [json_name = "security"];</code>
   */
  @java.lang.Override
  public boolean containsSecurity(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetSecurity().getMap().containsKey(key);
  }
  /**
   * Use {@link #getSecurityMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme> getSecurity() {
    return getSecurityMap();
  }
  /**
   * <pre>
   * A single security scheme definition, mapping a "name" to the scheme it
   * defines.
   * </pre>
   *
   * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme&gt; security = 1 [json_name = "security"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme> getSecurityMap() {
    return internalGetSecurity().getMap();
  }
  /**
   * <pre>
   * A single security scheme definition, mapping a "name" to the scheme it
   * defines.
   * </pre>
   *
   * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme&gt; security = 1 [json_name = "security"];</code>
   */
  @java.lang.Override
  public /* nullable */
com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme getSecurityOrDefault(
      java.lang.String key,
      /* nullable */
com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme> map =
        internalGetSecurity().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * A single security scheme definition, mapping a "name" to the scheme it
   * defines.
   * </pre>
   *
   * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme&gt; security = 1 [json_name = "security"];</code>
   */
  @java.lang.Override
  public com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme getSecurityOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme> map =
        internalGetSecurity().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetSecurity(),
        SecurityDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme> entry
         : internalGetSecurity().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme>
      security__ = SecurityDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, security__);
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
    if (!(obj instanceof com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions)) {
      return super.equals(obj);
    }
    com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions other = (com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions) obj;

    if (!internalGetSecurity().equals(
        other.internalGetSecurity())) return false;
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
    if (!internalGetSecurity().getMap().isEmpty()) {
      hash = (37 * hash) + SECURITY_FIELD_NUMBER;
      hash = (53 * hash) + internalGetSecurity().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions parseFrom(
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
  public static Builder newBuilder(com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions prototype) {
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
   * `SecurityDefinitions` is a representation of OpenAPI v2 specification's
   * Security Definitions object.
   *
   * See: https://github.com/OAI/OpenAPI-Specification/blob/3.0.0/versions/2.0.md#securityDefinitionsObject
   *
   * A declaration of the security schemes available to be used in the
   * specification. This does not enforce the security schemes on the operations
   * and only serves to provide the relevant details for each scheme.
   * </pre>
   *
   * Protobuf type {@code grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions)
      com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_SecurityDefinitions_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetSecurity();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableSecurity();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_SecurityDefinitions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions.class, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions.Builder.class);
    }

    // Construct using com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions.newBuilder()
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
      internalGetMutableSecurity().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_SecurityDefinitions_descriptor;
    }

    @java.lang.Override
    public com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions getDefaultInstanceForType() {
      return com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions.getDefaultInstance();
    }

    @java.lang.Override
    public com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions build() {
      com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions buildPartial() {
      com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions result = new com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.security_ = internalGetSecurity();
        result.security_.makeImmutable();
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
      if (other instanceof com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions) {
        return mergeFrom((com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions other) {
      if (other == com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions.getDefaultInstance()) return this;
      internalGetMutableSecurity().mergeFrom(
          other.internalGetSecurity());
      bitField0_ |= 0x00000001;
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
              com.google.protobuf.MapEntry<java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme>
              security__ = input.readMessage(
                  SecurityDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableSecurity().getMutableMap().put(
                  security__.getKey(), security__.getValue());
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

    private com.google.protobuf.MapField<
        java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme> security_;
    private com.google.protobuf.MapField<java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme>
        internalGetSecurity() {
      if (security_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SecurityDefaultEntryHolder.defaultEntry);
      }
      return security_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme>
        internalGetMutableSecurity() {
      if (security_ == null) {
        security_ = com.google.protobuf.MapField.newMapField(
            SecurityDefaultEntryHolder.defaultEntry);
      }
      if (!security_.isMutable()) {
        security_ = security_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return security_;
    }
    public int getSecurityCount() {
      return internalGetSecurity().getMap().size();
    }
    /**
     * <pre>
     * A single security scheme definition, mapping a "name" to the scheme it
     * defines.
     * </pre>
     *
     * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme&gt; security = 1 [json_name = "security"];</code>
     */
    @java.lang.Override
    public boolean containsSecurity(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetSecurity().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSecurityMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme> getSecurity() {
      return getSecurityMap();
    }
    /**
     * <pre>
     * A single security scheme definition, mapping a "name" to the scheme it
     * defines.
     * </pre>
     *
     * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme&gt; security = 1 [json_name = "security"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme> getSecurityMap() {
      return internalGetSecurity().getMap();
    }
    /**
     * <pre>
     * A single security scheme definition, mapping a "name" to the scheme it
     * defines.
     * </pre>
     *
     * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme&gt; security = 1 [json_name = "security"];</code>
     */
    @java.lang.Override
    public /* nullable */
com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme getSecurityOrDefault(
        java.lang.String key,
        /* nullable */
com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme> map =
          internalGetSecurity().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * A single security scheme definition, mapping a "name" to the scheme it
     * defines.
     * </pre>
     *
     * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme&gt; security = 1 [json_name = "security"];</code>
     */
    @java.lang.Override
    public com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme getSecurityOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme> map =
          internalGetSecurity().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearSecurity() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableSecurity().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * A single security scheme definition, mapping a "name" to the scheme it
     * defines.
     * </pre>
     *
     * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme&gt; security = 1 [json_name = "security"];</code>
     */
    public Builder removeSecurity(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableSecurity().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme>
        getMutableSecurity() {
      bitField0_ |= 0x00000001;
      return internalGetMutableSecurity().getMutableMap();
    }
    /**
     * <pre>
     * A single security scheme definition, mapping a "name" to the scheme it
     * defines.
     * </pre>
     *
     * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme&gt; security = 1 [json_name = "security"];</code>
     */
    public Builder putSecurity(
        java.lang.String key,
        com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableSecurity().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * A single security scheme definition, mapping a "name" to the scheme it
     * defines.
     * </pre>
     *
     * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme&gt; security = 1 [json_name = "security"];</code>
     */
    public Builder putAllSecurity(
        java.util.Map<java.lang.String, com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityScheme> values) {
      internalGetMutableSecurity().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions)
  }

  // @@protoc_insertion_point(class_scope:grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions)
  private static final com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions();
  }

  public static com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecurityDefinitions>
      PARSER = new com.google.protobuf.AbstractParser<SecurityDefinitions>() {
    @java.lang.Override
    public SecurityDefinitions parsePartialFrom(
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

  public static com.google.protobuf.Parser<SecurityDefinitions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecurityDefinitions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scalekit.grpc.grpc.gateway.protoc_gen_openapiv2.options.SecurityDefinitions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

