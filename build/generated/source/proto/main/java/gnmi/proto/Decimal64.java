// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gnmi/gnmi.proto

package gnmi.proto;

/**
 * <pre>
 * Decimal64 is used to encode a fixed precision decimal number. The value
 * is expressed as a set of digits with the precision specifying the
 * number of digits following the decimal point in the digit set.
 * </pre>
 *
 * Protobuf type {@code gnmi.Decimal64}
 */
public final class Decimal64 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gnmi.Decimal64)
    Decimal64OrBuilder {
private static final long serialVersionUID = 0L;
  // Use Decimal64.newBuilder() to construct.
  private Decimal64(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Decimal64() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Decimal64();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Decimal64(
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

            digits_ = input.readInt64();
            break;
          }
          case 16: {

            precision_ = input.readUInt32();
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
    return gnmi.proto.GnmiProto.internal_static_gnmi_Decimal64_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return gnmi.proto.GnmiProto.internal_static_gnmi_Decimal64_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            gnmi.proto.Decimal64.class, gnmi.proto.Decimal64.Builder.class);
  }

  public static final int DIGITS_FIELD_NUMBER = 1;
  private long digits_;
  /**
   * <pre>
   * Set of digits.
   * </pre>
   *
   * <code>int64 digits = 1;</code>
   * @return The digits.
   */
  @java.lang.Override
  public long getDigits() {
    return digits_;
  }

  public static final int PRECISION_FIELD_NUMBER = 2;
  private int precision_;
  /**
   * <pre>
   * Number of digits following the decimal point.
   * </pre>
   *
   * <code>uint32 precision = 2;</code>
   * @return The precision.
   */
  @java.lang.Override
  public int getPrecision() {
    return precision_;
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
    if (digits_ != 0L) {
      output.writeInt64(1, digits_);
    }
    if (precision_ != 0) {
      output.writeUInt32(2, precision_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (digits_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, digits_);
    }
    if (precision_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, precision_);
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
    if (!(obj instanceof gnmi.proto.Decimal64)) {
      return super.equals(obj);
    }
    gnmi.proto.Decimal64 other = (gnmi.proto.Decimal64) obj;

    if (getDigits()
        != other.getDigits()) return false;
    if (getPrecision()
        != other.getPrecision()) return false;
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
    hash = (37 * hash) + DIGITS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDigits());
    hash = (37 * hash) + PRECISION_FIELD_NUMBER;
    hash = (53 * hash) + getPrecision();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static gnmi.proto.Decimal64 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gnmi.proto.Decimal64 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gnmi.proto.Decimal64 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gnmi.proto.Decimal64 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gnmi.proto.Decimal64 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gnmi.proto.Decimal64 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gnmi.proto.Decimal64 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static gnmi.proto.Decimal64 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static gnmi.proto.Decimal64 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static gnmi.proto.Decimal64 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static gnmi.proto.Decimal64 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static gnmi.proto.Decimal64 parseFrom(
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
  public static Builder newBuilder(gnmi.proto.Decimal64 prototype) {
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
   * Decimal64 is used to encode a fixed precision decimal number. The value
   * is expressed as a set of digits with the precision specifying the
   * number of digits following the decimal point in the digit set.
   * </pre>
   *
   * Protobuf type {@code gnmi.Decimal64}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gnmi.Decimal64)
      gnmi.proto.Decimal64OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gnmi.proto.GnmiProto.internal_static_gnmi_Decimal64_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gnmi.proto.GnmiProto.internal_static_gnmi_Decimal64_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gnmi.proto.Decimal64.class, gnmi.proto.Decimal64.Builder.class);
    }

    // Construct using gnmi.proto.Decimal64.newBuilder()
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
      digits_ = 0L;

      precision_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return gnmi.proto.GnmiProto.internal_static_gnmi_Decimal64_descriptor;
    }

    @java.lang.Override
    public gnmi.proto.Decimal64 getDefaultInstanceForType() {
      return gnmi.proto.Decimal64.getDefaultInstance();
    }

    @java.lang.Override
    public gnmi.proto.Decimal64 build() {
      gnmi.proto.Decimal64 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public gnmi.proto.Decimal64 buildPartial() {
      gnmi.proto.Decimal64 result = new gnmi.proto.Decimal64(this);
      result.digits_ = digits_;
      result.precision_ = precision_;
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
      if (other instanceof gnmi.proto.Decimal64) {
        return mergeFrom((gnmi.proto.Decimal64)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(gnmi.proto.Decimal64 other) {
      if (other == gnmi.proto.Decimal64.getDefaultInstance()) return this;
      if (other.getDigits() != 0L) {
        setDigits(other.getDigits());
      }
      if (other.getPrecision() != 0) {
        setPrecision(other.getPrecision());
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
      gnmi.proto.Decimal64 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (gnmi.proto.Decimal64) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long digits_ ;
    /**
     * <pre>
     * Set of digits.
     * </pre>
     *
     * <code>int64 digits = 1;</code>
     * @return The digits.
     */
    @java.lang.Override
    public long getDigits() {
      return digits_;
    }
    /**
     * <pre>
     * Set of digits.
     * </pre>
     *
     * <code>int64 digits = 1;</code>
     * @param value The digits to set.
     * @return This builder for chaining.
     */
    public Builder setDigits(long value) {
      
      digits_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Set of digits.
     * </pre>
     *
     * <code>int64 digits = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDigits() {
      
      digits_ = 0L;
      onChanged();
      return this;
    }

    private int precision_ ;
    /**
     * <pre>
     * Number of digits following the decimal point.
     * </pre>
     *
     * <code>uint32 precision = 2;</code>
     * @return The precision.
     */
    @java.lang.Override
    public int getPrecision() {
      return precision_;
    }
    /**
     * <pre>
     * Number of digits following the decimal point.
     * </pre>
     *
     * <code>uint32 precision = 2;</code>
     * @param value The precision to set.
     * @return This builder for chaining.
     */
    public Builder setPrecision(int value) {
      
      precision_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of digits following the decimal point.
     * </pre>
     *
     * <code>uint32 precision = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrecision() {
      
      precision_ = 0;
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


    // @@protoc_insertion_point(builder_scope:gnmi.Decimal64)
  }

  // @@protoc_insertion_point(class_scope:gnmi.Decimal64)
  private static final gnmi.proto.Decimal64 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new gnmi.proto.Decimal64();
  }

  public static gnmi.proto.Decimal64 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Decimal64>
      PARSER = new com.google.protobuf.AbstractParser<Decimal64>() {
    @java.lang.Override
    public Decimal64 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Decimal64(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Decimal64> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Decimal64> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public gnmi.proto.Decimal64 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

