// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generic-service.proto

package com.stb.grpc.model;

/**
 * Protobuf enum {@code com.stb.grpc.MessageType}
 */
public enum MessageType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TYPE0 = 0;</code>
   */
  TYPE0(0),
  /**
   * <code>TYPE1 = 1;</code>
   */
  TYPE1(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TYPE0 = 0;</code>
   */
  public static final int TYPE0_VALUE = 0;
  /**
   * <code>TYPE1 = 1;</code>
   */
  public static final int TYPE1_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MessageType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MessageType forNumber(int value) {
    switch (value) {
      case 0: return TYPE0;
      case 1: return TYPE1;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MessageType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MessageType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MessageType>() {
          public MessageType findValueByNumber(int number) {
            return MessageType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.stb.grpc.model.GenericServiceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final MessageType[] VALUES = values();

  public static MessageType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MessageType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.stb.grpc.MessageType)
}
