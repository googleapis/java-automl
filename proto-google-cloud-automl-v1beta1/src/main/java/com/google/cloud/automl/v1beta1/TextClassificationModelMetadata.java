/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/text.proto

package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * Model metadata that is specific to text classification.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.TextClassificationModelMetadata}
 */
public final class TextClassificationModelMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.TextClassificationModelMetadata)
    TextClassificationModelMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TextClassificationModelMetadata.newBuilder() to construct.
  private TextClassificationModelMetadata(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TextClassificationModelMetadata() {
    classificationType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TextClassificationModelMetadata(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 24:
            {
              int rawValue = input.readEnum();

              classificationType_ = rawValue;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1beta1.TextProto
        .internal_static_google_cloud_automl_v1beta1_TextClassificationModelMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.TextProto
        .internal_static_google_cloud_automl_v1beta1_TextClassificationModelMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.TextClassificationModelMetadata.class,
            com.google.cloud.automl.v1beta1.TextClassificationModelMetadata.Builder.class);
  }

  public static final int CLASSIFICATION_TYPE_FIELD_NUMBER = 3;
  private int classificationType_;
  /**
   *
   *
   * <pre>
   * Output only. Classification type of the dataset used to train this model.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 3;</code>
   */
  public int getClassificationTypeValue() {
    return classificationType_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Classification type of the dataset used to train this model.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 3;</code>
   */
  public com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType
      getClassificationType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType result =
        com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType.valueOf(
            classificationType_);
    return result == null
        ? com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType.UNRECOGNIZED
        : result;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (classificationType_
        != com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType
            .CLASSIFICATION_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, classificationType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (classificationType_
        != com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType
            .CLASSIFICATION_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, classificationType_);
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.TextClassificationModelMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.TextClassificationModelMetadata other =
        (com.google.cloud.automl.v1beta1.TextClassificationModelMetadata) obj;

    if (classificationType_ != other.classificationType_) return false;
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
    hash = (37 * hash) + CLASSIFICATION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + classificationType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.TextClassificationModelMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TextClassificationModelMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextClassificationModelMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TextClassificationModelMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextClassificationModelMetadata parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TextClassificationModelMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextClassificationModelMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TextClassificationModelMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextClassificationModelMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TextClassificationModelMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextClassificationModelMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TextClassificationModelMetadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.automl.v1beta1.TextClassificationModelMetadata prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Model metadata that is specific to text classification.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.TextClassificationModelMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.TextClassificationModelMetadata)
      com.google.cloud.automl.v1beta1.TextClassificationModelMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.TextProto
          .internal_static_google_cloud_automl_v1beta1_TextClassificationModelMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.TextProto
          .internal_static_google_cloud_automl_v1beta1_TextClassificationModelMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.TextClassificationModelMetadata.class,
              com.google.cloud.automl.v1beta1.TextClassificationModelMetadata.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.TextClassificationModelMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      classificationType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.TextProto
          .internal_static_google_cloud_automl_v1beta1_TextClassificationModelMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TextClassificationModelMetadata
        getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.TextClassificationModelMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TextClassificationModelMetadata build() {
      com.google.cloud.automl.v1beta1.TextClassificationModelMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TextClassificationModelMetadata buildPartial() {
      com.google.cloud.automl.v1beta1.TextClassificationModelMetadata result =
          new com.google.cloud.automl.v1beta1.TextClassificationModelMetadata(this);
      result.classificationType_ = classificationType_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.automl.v1beta1.TextClassificationModelMetadata) {
        return mergeFrom((com.google.cloud.automl.v1beta1.TextClassificationModelMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.automl.v1beta1.TextClassificationModelMetadata other) {
      if (other
          == com.google.cloud.automl.v1beta1.TextClassificationModelMetadata.getDefaultInstance())
        return this;
      if (other.classificationType_ != 0) {
        setClassificationTypeValue(other.getClassificationTypeValue());
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
      com.google.cloud.automl.v1beta1.TextClassificationModelMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.automl.v1beta1.TextClassificationModelMetadata)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int classificationType_ = 0;
    /**
     *
     *
     * <pre>
     * Output only. Classification type of the dataset used to train this model.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 3;</code>
     */
    public int getClassificationTypeValue() {
      return classificationType_;
    }
    /**
     *
     *
     * <pre>
     * Output only. Classification type of the dataset used to train this model.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 3;</code>
     */
    public Builder setClassificationTypeValue(int value) {
      classificationType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Classification type of the dataset used to train this model.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 3;</code>
     */
    public com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType
        getClassificationType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType result =
          com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType.valueOf(
              classificationType_);
      return result == null
          ? com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Output only. Classification type of the dataset used to train this model.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 3;</code>
     */
    public Builder setClassificationType(
        com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      classificationType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Classification type of the dataset used to train this model.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 3;</code>
     */
    public Builder clearClassificationType() {

      classificationType_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.TextClassificationModelMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.TextClassificationModelMetadata)
  private static final com.google.cloud.automl.v1beta1.TextClassificationModelMetadata
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.TextClassificationModelMetadata();
  }

  public static com.google.cloud.automl.v1beta1.TextClassificationModelMetadata
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextClassificationModelMetadata> PARSER =
      new com.google.protobuf.AbstractParser<TextClassificationModelMetadata>() {
        @java.lang.Override
        public TextClassificationModelMetadata parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TextClassificationModelMetadata(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TextClassificationModelMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextClassificationModelMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.TextClassificationModelMetadata
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
