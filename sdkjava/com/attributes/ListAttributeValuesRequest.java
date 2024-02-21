// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: policy/attributes/attributes.proto

// Protobuf Java Version: 3.25.3
package com.attributes;

/**
 * Protobuf type {@code attributes.ListAttributeValuesRequest}
 */
public final class ListAttributeValuesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:attributes.ListAttributeValuesRequest)
    ListAttributeValuesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAttributeValuesRequest.newBuilder() to construct.
  private ListAttributeValuesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAttributeValuesRequest() {
    attributeId_ = "";
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAttributeValuesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.attributes.AttributesProto.internal_static_attributes_ListAttributeValuesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.attributes.AttributesProto.internal_static_attributes_ListAttributeValuesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.attributes.ListAttributeValuesRequest.class, com.attributes.ListAttributeValuesRequest.Builder.class);
  }

  public static final int ATTRIBUTE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object attributeId_ = "";
  /**
   * <code>string attribute_id = 1 [json_name = "attributeId", (.buf.validate.field) = { ... }</code>
   * @return The attributeId.
   */
  @java.lang.Override
  public java.lang.String getAttributeId() {
    java.lang.Object ref = attributeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      attributeId_ = s;
      return s;
    }
  }
  /**
   * <code>string attribute_id = 1 [json_name = "attributeId", (.buf.validate.field) = { ... }</code>
   * @return The bytes for attributeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAttributeIdBytes() {
    java.lang.Object ref = attributeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      attributeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private int state_ = 0;
  /**
   * <pre>
   * ACTIVE by default when not specified
   * </pre>
   *
   * <code>.common.ActiveStateEnum state = 2 [json_name = "state"];</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <pre>
   * ACTIVE by default when not specified
   * </pre>
   *
   * <code>.common.ActiveStateEnum state = 2 [json_name = "state"];</code>
   * @return The state.
   */
  @java.lang.Override public com.common.ActiveStateEnum getState() {
    com.common.ActiveStateEnum result = com.common.ActiveStateEnum.forNumber(state_);
    return result == null ? com.common.ActiveStateEnum.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attributeId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, attributeId_);
    }
    if (state_ != com.common.ActiveStateEnum.ACTIVE_STATE_ENUM_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, state_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attributeId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, attributeId_);
    }
    if (state_ != com.common.ActiveStateEnum.ACTIVE_STATE_ENUM_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, state_);
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
    if (!(obj instanceof com.attributes.ListAttributeValuesRequest)) {
      return super.equals(obj);
    }
    com.attributes.ListAttributeValuesRequest other = (com.attributes.ListAttributeValuesRequest) obj;

    if (!getAttributeId()
        .equals(other.getAttributeId())) return false;
    if (state_ != other.state_) return false;
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
    hash = (37 * hash) + ATTRIBUTE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAttributeId().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.attributes.ListAttributeValuesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.attributes.ListAttributeValuesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.attributes.ListAttributeValuesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.attributes.ListAttributeValuesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.attributes.ListAttributeValuesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.attributes.ListAttributeValuesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.attributes.ListAttributeValuesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.attributes.ListAttributeValuesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.attributes.ListAttributeValuesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.attributes.ListAttributeValuesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.attributes.ListAttributeValuesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.attributes.ListAttributeValuesRequest parseFrom(
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
  public static Builder newBuilder(com.attributes.ListAttributeValuesRequest prototype) {
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
   * Protobuf type {@code attributes.ListAttributeValuesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:attributes.ListAttributeValuesRequest)
      com.attributes.ListAttributeValuesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.attributes.AttributesProto.internal_static_attributes_ListAttributeValuesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.attributes.AttributesProto.internal_static_attributes_ListAttributeValuesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.attributes.ListAttributeValuesRequest.class, com.attributes.ListAttributeValuesRequest.Builder.class);
    }

    // Construct using com.attributes.ListAttributeValuesRequest.newBuilder()
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
      attributeId_ = "";
      state_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.attributes.AttributesProto.internal_static_attributes_ListAttributeValuesRequest_descriptor;
    }

    @java.lang.Override
    public com.attributes.ListAttributeValuesRequest getDefaultInstanceForType() {
      return com.attributes.ListAttributeValuesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.attributes.ListAttributeValuesRequest build() {
      com.attributes.ListAttributeValuesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.attributes.ListAttributeValuesRequest buildPartial() {
      com.attributes.ListAttributeValuesRequest result = new com.attributes.ListAttributeValuesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.attributes.ListAttributeValuesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.attributeId_ = attributeId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.state_ = state_;
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
      if (other instanceof com.attributes.ListAttributeValuesRequest) {
        return mergeFrom((com.attributes.ListAttributeValuesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.attributes.ListAttributeValuesRequest other) {
      if (other == com.attributes.ListAttributeValuesRequest.getDefaultInstance()) return this;
      if (!other.getAttributeId().isEmpty()) {
        attributeId_ = other.attributeId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
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
              attributeId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              state_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.lang.Object attributeId_ = "";
    /**
     * <code>string attribute_id = 1 [json_name = "attributeId", (.buf.validate.field) = { ... }</code>
     * @return The attributeId.
     */
    public java.lang.String getAttributeId() {
      java.lang.Object ref = attributeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        attributeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string attribute_id = 1 [json_name = "attributeId", (.buf.validate.field) = { ... }</code>
     * @return The bytes for attributeId.
     */
    public com.google.protobuf.ByteString
        getAttributeIdBytes() {
      java.lang.Object ref = attributeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        attributeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string attribute_id = 1 [json_name = "attributeId", (.buf.validate.field) = { ... }</code>
     * @param value The attributeId to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      attributeId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string attribute_id = 1 [json_name = "attributeId", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearAttributeId() {
      attributeId_ = getDefaultInstance().getAttributeId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string attribute_id = 1 [json_name = "attributeId", (.buf.validate.field) = { ... }</code>
     * @param value The bytes for attributeId to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      attributeId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int state_ = 0;
    /**
     * <pre>
     * ACTIVE by default when not specified
     * </pre>
     *
     * <code>.common.ActiveStateEnum state = 2 [json_name = "state"];</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <pre>
     * ACTIVE by default when not specified
     * </pre>
     *
     * <code>.common.ActiveStateEnum state = 2 [json_name = "state"];</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ACTIVE by default when not specified
     * </pre>
     *
     * <code>.common.ActiveStateEnum state = 2 [json_name = "state"];</code>
     * @return The state.
     */
    @java.lang.Override
    public com.common.ActiveStateEnum getState() {
      com.common.ActiveStateEnum result = com.common.ActiveStateEnum.forNumber(state_);
      return result == null ? com.common.ActiveStateEnum.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * ACTIVE by default when not specified
     * </pre>
     *
     * <code>.common.ActiveStateEnum state = 2 [json_name = "state"];</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.common.ActiveStateEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ACTIVE by default when not specified
     * </pre>
     *
     * <code>.common.ActiveStateEnum state = 2 [json_name = "state"];</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      state_ = 0;
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


    // @@protoc_insertion_point(builder_scope:attributes.ListAttributeValuesRequest)
  }

  // @@protoc_insertion_point(class_scope:attributes.ListAttributeValuesRequest)
  private static final com.attributes.ListAttributeValuesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.attributes.ListAttributeValuesRequest();
  }

  public static com.attributes.ListAttributeValuesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAttributeValuesRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListAttributeValuesRequest>() {
    @java.lang.Override
    public ListAttributeValuesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAttributeValuesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAttributeValuesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.attributes.ListAttributeValuesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

