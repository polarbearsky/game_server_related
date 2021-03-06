// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerCustomMsg.proto

package com.netty.game.server.msg;

public final class ServerCustomMsg {
  private ServerCustomMsg() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CustomMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CustomMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>required int32 type = 1;</code>
     */
    int getType();

    /**
     * <code>required int32 action = 2;</code>
     */
    boolean hasAction();
    /**
     * <code>required int32 action = 2;</code>
     */
    int getAction();

    /**
     * <code>required string cmd = 3;</code>
     */
    boolean hasCmd();
    /**
     * <code>required string cmd = 3;</code>
     */
    java.lang.String getCmd();
    /**
     * <code>required string cmd = 3;</code>
     */
    com.google.protobuf.ByteString
        getCmdBytes();

    /**
     * <code>optional bytes params = 4;</code>
     */
    boolean hasParams();
    /**
     * <code>optional bytes params = 4;</code>
     */
    com.google.protobuf.ByteString getParams();
  }
  /**
   * Protobuf type {@code CustomMsg}
   */
  public static final class CustomMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:CustomMsg)
      CustomMsgOrBuilder {
    // Use CustomMsg.newBuilder() to construct.
    private CustomMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private CustomMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final CustomMsg defaultInstance;
    public static CustomMsg getDefaultInstance() {
      return defaultInstance;
    }

    public CustomMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private CustomMsg(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              type_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              action_ = input.readInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              cmd_ = bs;
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              params_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.netty.game.server.msg.ServerCustomMsg.internal_static_CustomMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.netty.game.server.msg.ServerCustomMsg.internal_static_CustomMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.netty.game.server.msg.ServerCustomMsg.CustomMsg.class, com.netty.game.server.msg.ServerCustomMsg.CustomMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<CustomMsg> PARSER =
        new com.google.protobuf.AbstractParser<CustomMsg>() {
      public CustomMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CustomMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<CustomMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>required int32 type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 type = 1;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int ACTION_FIELD_NUMBER = 2;
    private int action_;
    /**
     * <code>required int32 action = 2;</code>
     */
    public boolean hasAction() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 action = 2;</code>
     */
    public int getAction() {
      return action_;
    }

    public static final int CMD_FIELD_NUMBER = 3;
    private java.lang.Object cmd_;
    /**
     * <code>required string cmd = 3;</code>
     */
    public boolean hasCmd() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string cmd = 3;</code>
     */
    public java.lang.String getCmd() {
      java.lang.Object ref = cmd_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          cmd_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string cmd = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCmdBytes() {
      java.lang.Object ref = cmd_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cmd_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PARAMS_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString params_;
    /**
     * <code>optional bytes params = 4;</code>
     */
    public boolean hasParams() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bytes params = 4;</code>
     */
    public com.google.protobuf.ByteString getParams() {
      return params_;
    }

    private void initFields() {
      type_ = 0;
      action_ = 0;
      cmd_ = "";
      params_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAction()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCmd()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, action_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getCmdBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, params_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, action_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getCmdBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, params_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.netty.game.server.msg.ServerCustomMsg.CustomMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.netty.game.server.msg.ServerCustomMsg.CustomMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.netty.game.server.msg.ServerCustomMsg.CustomMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.netty.game.server.msg.ServerCustomMsg.CustomMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.netty.game.server.msg.ServerCustomMsg.CustomMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.netty.game.server.msg.ServerCustomMsg.CustomMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.netty.game.server.msg.ServerCustomMsg.CustomMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.netty.game.server.msg.ServerCustomMsg.CustomMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.netty.game.server.msg.ServerCustomMsg.CustomMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.netty.game.server.msg.ServerCustomMsg.CustomMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.netty.game.server.msg.ServerCustomMsg.CustomMsg prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CustomMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CustomMsg)
        com.netty.game.server.msg.ServerCustomMsg.CustomMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.netty.game.server.msg.ServerCustomMsg.internal_static_CustomMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.netty.game.server.msg.ServerCustomMsg.internal_static_CustomMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.netty.game.server.msg.ServerCustomMsg.CustomMsg.class, com.netty.game.server.msg.ServerCustomMsg.CustomMsg.Builder.class);
      }

      // Construct using com.netty.game.server.msg.ServerCustomMsg.CustomMsg.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        action_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        cmd_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        params_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.netty.game.server.msg.ServerCustomMsg.internal_static_CustomMsg_descriptor;
      }

      public com.netty.game.server.msg.ServerCustomMsg.CustomMsg getDefaultInstanceForType() {
        return com.netty.game.server.msg.ServerCustomMsg.CustomMsg.getDefaultInstance();
      }

      public com.netty.game.server.msg.ServerCustomMsg.CustomMsg build() {
        com.netty.game.server.msg.ServerCustomMsg.CustomMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.netty.game.server.msg.ServerCustomMsg.CustomMsg buildPartial() {
        com.netty.game.server.msg.ServerCustomMsg.CustomMsg result = new com.netty.game.server.msg.ServerCustomMsg.CustomMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.action_ = action_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.cmd_ = cmd_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.params_ = params_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.netty.game.server.msg.ServerCustomMsg.CustomMsg) {
          return mergeFrom((com.netty.game.server.msg.ServerCustomMsg.CustomMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.netty.game.server.msg.ServerCustomMsg.CustomMsg other) {
        if (other == com.netty.game.server.msg.ServerCustomMsg.CustomMsg.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasAction()) {
          setAction(other.getAction());
        }
        if (other.hasCmd()) {
          bitField0_ |= 0x00000004;
          cmd_ = other.cmd_;
          onChanged();
        }
        if (other.hasParams()) {
          setParams(other.getParams());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        if (!hasAction()) {
          
          return false;
        }
        if (!hasCmd()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.netty.game.server.msg.ServerCustomMsg.CustomMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.netty.game.server.msg.ServerCustomMsg.CustomMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int type_ ;
      /**
       * <code>required int32 type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 type = 1;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>required int32 type = 1;</code>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }

      private int action_ ;
      /**
       * <code>required int32 action = 2;</code>
       */
      public boolean hasAction() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 action = 2;</code>
       */
      public int getAction() {
        return action_;
      }
      /**
       * <code>required int32 action = 2;</code>
       */
      public Builder setAction(int value) {
        bitField0_ |= 0x00000002;
        action_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 action = 2;</code>
       */
      public Builder clearAction() {
        bitField0_ = (bitField0_ & ~0x00000002);
        action_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object cmd_ = "";
      /**
       * <code>required string cmd = 3;</code>
       */
      public boolean hasCmd() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string cmd = 3;</code>
       */
      public java.lang.String getCmd() {
        java.lang.Object ref = cmd_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            cmd_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string cmd = 3;</code>
       */
      public com.google.protobuf.ByteString
          getCmdBytes() {
        java.lang.Object ref = cmd_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          cmd_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string cmd = 3;</code>
       */
      public Builder setCmd(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        cmd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string cmd = 3;</code>
       */
      public Builder clearCmd() {
        bitField0_ = (bitField0_ & ~0x00000004);
        cmd_ = getDefaultInstance().getCmd();
        onChanged();
        return this;
      }
      /**
       * <code>required string cmd = 3;</code>
       */
      public Builder setCmdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        cmd_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString params_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes params = 4;</code>
       */
      public boolean hasParams() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional bytes params = 4;</code>
       */
      public com.google.protobuf.ByteString getParams() {
        return params_;
      }
      /**
       * <code>optional bytes params = 4;</code>
       */
      public Builder setParams(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        params_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes params = 4;</code>
       */
      public Builder clearParams() {
        bitField0_ = (bitField0_ & ~0x00000008);
        params_ = getDefaultInstance().getParams();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:CustomMsg)
    }

    static {
      defaultInstance = new CustomMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:CustomMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CustomMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_CustomMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ServerCustomMsg.proto\"F\n\tCustomMsg\022\014\n\004" +
      "type\030\001 \002(\005\022\016\n\006action\030\002 \002(\005\022\013\n\003cmd\030\003 \002(\t\022" +
      "\016\n\006params\030\004 \001(\014B,\n\031com.netty.game.server" +
      ".msgB\017ServerCustomMsg"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_CustomMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CustomMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_CustomMsg_descriptor,
        new java.lang.String[] { "Type", "Action", "Cmd", "Params", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
