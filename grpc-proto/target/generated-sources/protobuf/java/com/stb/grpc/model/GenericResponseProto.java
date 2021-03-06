// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generic-service.proto

package com.stb.grpc.model;

/**
 * Protobuf type {@code com.stb.grpc.GenericResponseProto}
 */
public final class GenericResponseProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.stb.grpc.GenericResponseProto)
    GenericResponseProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenericResponseProto.newBuilder() to construct.
  private GenericResponseProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenericResponseProto() {
    messageType_ = 0;
    payload_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenericResponseProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GenericResponseProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            messageType_ = rawValue;
            break;
          }
          case 18: {

            payload_ = input.readBytes();
            break;
          }
          case 26: {
            com.stb.grpc.common.ResponseStatusProto.Builder subBuilder = null;
            if (responseStatus_ != null) {
              subBuilder = responseStatus_.toBuilder();
            }
            responseStatus_ = input.readMessage(com.stb.grpc.common.ResponseStatusProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(responseStatus_);
              responseStatus_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stb.grpc.model.GenericServiceProto.internal_static_com_stb_grpc_GenericResponseProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stb.grpc.model.GenericServiceProto.internal_static_com_stb_grpc_GenericResponseProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stb.grpc.model.GenericResponseProto.class, com.stb.grpc.model.GenericResponseProto.Builder.class);
  }

  public static final int MESSAGETYPE_FIELD_NUMBER = 1;
  private int messageType_;
  /**
   * <code>.com.stb.grpc.MessageType messageType = 1;</code>
   * @return The enum numeric value on the wire for messageType.
   */
  @java.lang.Override public int getMessageTypeValue() {
    return messageType_;
  }
  /**
   * <code>.com.stb.grpc.MessageType messageType = 1;</code>
   * @return The messageType.
   */
  @java.lang.Override public com.stb.grpc.model.MessageType getMessageType() {
    @SuppressWarnings("deprecation")
    com.stb.grpc.model.MessageType result = com.stb.grpc.model.MessageType.valueOf(messageType_);
    return result == null ? com.stb.grpc.model.MessageType.UNRECOGNIZED : result;
  }

  public static final int PAYLOAD_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString payload_;
  /**
   * <code>bytes payload = 2;</code>
   * @return The payload.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPayload() {
    return payload_;
  }

  public static final int RESPONSESTATUS_FIELD_NUMBER = 3;
  private com.stb.grpc.common.ResponseStatusProto responseStatus_;
  /**
   * <code>.com.stb.grpc.ResponseStatusProto responseStatus = 3;</code>
   * @return Whether the responseStatus field is set.
   */
  @java.lang.Override
  public boolean hasResponseStatus() {
    return responseStatus_ != null;
  }
  /**
   * <code>.com.stb.grpc.ResponseStatusProto responseStatus = 3;</code>
   * @return The responseStatus.
   */
  @java.lang.Override
  public com.stb.grpc.common.ResponseStatusProto getResponseStatus() {
    return responseStatus_ == null ? com.stb.grpc.common.ResponseStatusProto.getDefaultInstance() : responseStatus_;
  }
  /**
   * <code>.com.stb.grpc.ResponseStatusProto responseStatus = 3;</code>
   */
  @java.lang.Override
  public com.stb.grpc.common.ResponseStatusProtoOrBuilder getResponseStatusOrBuilder() {
    return getResponseStatus();
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
    if (messageType_ != com.stb.grpc.model.MessageType.TYPE0.getNumber()) {
      output.writeEnum(1, messageType_);
    }
    if (!payload_.isEmpty()) {
      output.writeBytes(2, payload_);
    }
    if (responseStatus_ != null) {
      output.writeMessage(3, getResponseStatus());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (messageType_ != com.stb.grpc.model.MessageType.TYPE0.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, messageType_);
    }
    if (!payload_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, payload_);
    }
    if (responseStatus_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getResponseStatus());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.stb.grpc.model.GenericResponseProto)) {
      return super.equals(obj);
    }
    com.stb.grpc.model.GenericResponseProto other = (com.stb.grpc.model.GenericResponseProto) obj;

    if (messageType_ != other.messageType_) return false;
    if (!getPayload()
        .equals(other.getPayload())) return false;
    if (hasResponseStatus() != other.hasResponseStatus()) return false;
    if (hasResponseStatus()) {
      if (!getResponseStatus()
          .equals(other.getResponseStatus())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MESSAGETYPE_FIELD_NUMBER;
    hash = (53 * hash) + messageType_;
    hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getPayload().hashCode();
    if (hasResponseStatus()) {
      hash = (37 * hash) + RESPONSESTATUS_FIELD_NUMBER;
      hash = (53 * hash) + getResponseStatus().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stb.grpc.model.GenericResponseProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stb.grpc.model.GenericResponseProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stb.grpc.model.GenericResponseProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stb.grpc.model.GenericResponseProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stb.grpc.model.GenericResponseProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stb.grpc.model.GenericResponseProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stb.grpc.model.GenericResponseProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stb.grpc.model.GenericResponseProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stb.grpc.model.GenericResponseProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.stb.grpc.model.GenericResponseProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stb.grpc.model.GenericResponseProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stb.grpc.model.GenericResponseProto parseFrom(
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
  public static Builder newBuilder(com.stb.grpc.model.GenericResponseProto prototype) {
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
   * Protobuf type {@code com.stb.grpc.GenericResponseProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.stb.grpc.GenericResponseProto)
      com.stb.grpc.model.GenericResponseProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stb.grpc.model.GenericServiceProto.internal_static_com_stb_grpc_GenericResponseProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stb.grpc.model.GenericServiceProto.internal_static_com_stb_grpc_GenericResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stb.grpc.model.GenericResponseProto.class, com.stb.grpc.model.GenericResponseProto.Builder.class);
    }

    // Construct using com.stb.grpc.model.GenericResponseProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      messageType_ = 0;

      payload_ = com.google.protobuf.ByteString.EMPTY;

      if (responseStatusBuilder_ == null) {
        responseStatus_ = null;
      } else {
        responseStatus_ = null;
        responseStatusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stb.grpc.model.GenericServiceProto.internal_static_com_stb_grpc_GenericResponseProto_descriptor;
    }

    @java.lang.Override
    public com.stb.grpc.model.GenericResponseProto getDefaultInstanceForType() {
      return com.stb.grpc.model.GenericResponseProto.getDefaultInstance();
    }

    @java.lang.Override
    public com.stb.grpc.model.GenericResponseProto build() {
      com.stb.grpc.model.GenericResponseProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stb.grpc.model.GenericResponseProto buildPartial() {
      com.stb.grpc.model.GenericResponseProto result = new com.stb.grpc.model.GenericResponseProto(this);
      result.messageType_ = messageType_;
      result.payload_ = payload_;
      if (responseStatusBuilder_ == null) {
        result.responseStatus_ = responseStatus_;
      } else {
        result.responseStatus_ = responseStatusBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.stb.grpc.model.GenericResponseProto) {
        return mergeFrom((com.stb.grpc.model.GenericResponseProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stb.grpc.model.GenericResponseProto other) {
      if (other == com.stb.grpc.model.GenericResponseProto.getDefaultInstance()) return this;
      if (other.messageType_ != 0) {
        setMessageTypeValue(other.getMessageTypeValue());
      }
      if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
        setPayload(other.getPayload());
      }
      if (other.hasResponseStatus()) {
        mergeResponseStatus(other.getResponseStatus());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.stb.grpc.model.GenericResponseProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.stb.grpc.model.GenericResponseProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int messageType_ = 0;
    /**
     * <code>.com.stb.grpc.MessageType messageType = 1;</code>
     * @return The enum numeric value on the wire for messageType.
     */
    @java.lang.Override public int getMessageTypeValue() {
      return messageType_;
    }
    /**
     * <code>.com.stb.grpc.MessageType messageType = 1;</code>
     * @param value The enum numeric value on the wire for messageType to set.
     * @return This builder for chaining.
     */
    public Builder setMessageTypeValue(int value) {
      
      messageType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.stb.grpc.MessageType messageType = 1;</code>
     * @return The messageType.
     */
    @java.lang.Override
    public com.stb.grpc.model.MessageType getMessageType() {
      @SuppressWarnings("deprecation")
      com.stb.grpc.model.MessageType result = com.stb.grpc.model.MessageType.valueOf(messageType_);
      return result == null ? com.stb.grpc.model.MessageType.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.stb.grpc.MessageType messageType = 1;</code>
     * @param value The messageType to set.
     * @return This builder for chaining.
     */
    public Builder setMessageType(com.stb.grpc.model.MessageType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      messageType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.stb.grpc.MessageType messageType = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessageType() {
      
      messageType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes payload = 2;</code>
     * @return The payload.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }
    /**
     * <code>bytes payload = 2;</code>
     * @param value The payload to set.
     * @return This builder for chaining.
     */
    public Builder setPayload(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      payload_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes payload = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPayload() {
      
      payload_ = getDefaultInstance().getPayload();
      onChanged();
      return this;
    }

    private com.stb.grpc.common.ResponseStatusProto responseStatus_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stb.grpc.common.ResponseStatusProto, com.stb.grpc.common.ResponseStatusProto.Builder, com.stb.grpc.common.ResponseStatusProtoOrBuilder> responseStatusBuilder_;
    /**
     * <code>.com.stb.grpc.ResponseStatusProto responseStatus = 3;</code>
     * @return Whether the responseStatus field is set.
     */
    public boolean hasResponseStatus() {
      return responseStatusBuilder_ != null || responseStatus_ != null;
    }
    /**
     * <code>.com.stb.grpc.ResponseStatusProto responseStatus = 3;</code>
     * @return The responseStatus.
     */
    public com.stb.grpc.common.ResponseStatusProto getResponseStatus() {
      if (responseStatusBuilder_ == null) {
        return responseStatus_ == null ? com.stb.grpc.common.ResponseStatusProto.getDefaultInstance() : responseStatus_;
      } else {
        return responseStatusBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.stb.grpc.ResponseStatusProto responseStatus = 3;</code>
     */
    public Builder setResponseStatus(com.stb.grpc.common.ResponseStatusProto value) {
      if (responseStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        responseStatus_ = value;
        onChanged();
      } else {
        responseStatusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.stb.grpc.ResponseStatusProto responseStatus = 3;</code>
     */
    public Builder setResponseStatus(
        com.stb.grpc.common.ResponseStatusProto.Builder builderForValue) {
      if (responseStatusBuilder_ == null) {
        responseStatus_ = builderForValue.build();
        onChanged();
      } else {
        responseStatusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.stb.grpc.ResponseStatusProto responseStatus = 3;</code>
     */
    public Builder mergeResponseStatus(com.stb.grpc.common.ResponseStatusProto value) {
      if (responseStatusBuilder_ == null) {
        if (responseStatus_ != null) {
          responseStatus_ =
            com.stb.grpc.common.ResponseStatusProto.newBuilder(responseStatus_).mergeFrom(value).buildPartial();
        } else {
          responseStatus_ = value;
        }
        onChanged();
      } else {
        responseStatusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.stb.grpc.ResponseStatusProto responseStatus = 3;</code>
     */
    public Builder clearResponseStatus() {
      if (responseStatusBuilder_ == null) {
        responseStatus_ = null;
        onChanged();
      } else {
        responseStatus_ = null;
        responseStatusBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.stb.grpc.ResponseStatusProto responseStatus = 3;</code>
     */
    public com.stb.grpc.common.ResponseStatusProto.Builder getResponseStatusBuilder() {
      
      onChanged();
      return getResponseStatusFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.stb.grpc.ResponseStatusProto responseStatus = 3;</code>
     */
    public com.stb.grpc.common.ResponseStatusProtoOrBuilder getResponseStatusOrBuilder() {
      if (responseStatusBuilder_ != null) {
        return responseStatusBuilder_.getMessageOrBuilder();
      } else {
        return responseStatus_ == null ?
            com.stb.grpc.common.ResponseStatusProto.getDefaultInstance() : responseStatus_;
      }
    }
    /**
     * <code>.com.stb.grpc.ResponseStatusProto responseStatus = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stb.grpc.common.ResponseStatusProto, com.stb.grpc.common.ResponseStatusProto.Builder, com.stb.grpc.common.ResponseStatusProtoOrBuilder> 
        getResponseStatusFieldBuilder() {
      if (responseStatusBuilder_ == null) {
        responseStatusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.stb.grpc.common.ResponseStatusProto, com.stb.grpc.common.ResponseStatusProto.Builder, com.stb.grpc.common.ResponseStatusProtoOrBuilder>(
                getResponseStatus(),
                getParentForChildren(),
                isClean());
        responseStatus_ = null;
      }
      return responseStatusBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.stb.grpc.GenericResponseProto)
  }

  // @@protoc_insertion_point(class_scope:com.stb.grpc.GenericResponseProto)
  private static final com.stb.grpc.model.GenericResponseProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stb.grpc.model.GenericResponseProto();
  }

  public static com.stb.grpc.model.GenericResponseProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenericResponseProto>
      PARSER = new com.google.protobuf.AbstractParser<GenericResponseProto>() {
    @java.lang.Override
    public GenericResponseProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GenericResponseProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GenericResponseProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenericResponseProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stb.grpc.model.GenericResponseProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

