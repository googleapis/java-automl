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
// source: google/cloud/automl/v1/io.proto

package com.google.cloud.automl.v1;

/**
 *
 *
 * <pre>
 * Input configuration of an [Document][google.cloud.automl.v1.Image].
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1.ImageInputConfig}
 */
public final class ImageInputConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1.ImageInputConfig)
    ImageInputConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImageInputConfig.newBuilder() to construct.
  private ImageInputConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImageInputConfig() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ImageInputConfig(
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
          case 10:
            {
              com.google.cloud.automl.v1.GcsSource.Builder subBuilder = null;
              if (gcsSource_ != null) {
                subBuilder = gcsSource_.toBuilder();
              }
              gcsSource_ =
                  input.readMessage(
                      com.google.cloud.automl.v1.GcsSource.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(gcsSource_);
                gcsSource_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.automl.v1.Io
        .internal_static_google_cloud_automl_v1_ImageInputConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1.Io
        .internal_static_google_cloud_automl_v1_ImageInputConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1.ImageInputConfig.class,
            com.google.cloud.automl.v1.ImageInputConfig.Builder.class);
  }

  public static final int GCS_SOURCE_FIELD_NUMBER = 1;
  private com.google.cloud.automl.v1.GcsSource gcsSource_;
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location of the document file. Only a single path
   * should be given.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
   */
  public boolean hasGcsSource() {
    return gcsSource_ != null;
  }
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location of the document file. Only a single path
   * should be given.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
   */
  public com.google.cloud.automl.v1.GcsSource getGcsSource() {
    return gcsSource_ == null
        ? com.google.cloud.automl.v1.GcsSource.getDefaultInstance()
        : gcsSource_;
  }
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location of the document file. Only a single path
   * should be given.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
   */
  public com.google.cloud.automl.v1.GcsSourceOrBuilder getGcsSourceOrBuilder() {
    return getGcsSource();
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
    if (gcsSource_ != null) {
      output.writeMessage(1, getGcsSource());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gcsSource_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getGcsSource());
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
    if (!(obj instanceof com.google.cloud.automl.v1.ImageInputConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1.ImageInputConfig other =
        (com.google.cloud.automl.v1.ImageInputConfig) obj;

    if (hasGcsSource() != other.hasGcsSource()) return false;
    if (hasGcsSource()) {
      if (!getGcsSource().equals(other.getGcsSource())) return false;
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
    if (hasGcsSource()) {
      hash = (37 * hash) + GCS_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getGcsSource().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1.ImageInputConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.ImageInputConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ImageInputConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.ImageInputConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ImageInputConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.ImageInputConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ImageInputConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.ImageInputConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ImageInputConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.ImageInputConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ImageInputConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.ImageInputConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.automl.v1.ImageInputConfig prototype) {
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
   * Input configuration of an [Document][google.cloud.automl.v1.Image].
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1.ImageInputConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1.ImageInputConfig)
      com.google.cloud.automl.v1.ImageInputConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1.Io
          .internal_static_google_cloud_automl_v1_ImageInputConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1.Io
          .internal_static_google_cloud_automl_v1_ImageInputConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1.ImageInputConfig.class,
              com.google.cloud.automl.v1.ImageInputConfig.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1.ImageInputConfig.newBuilder()
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
      if (gcsSourceBuilder_ == null) {
        gcsSource_ = null;
      } else {
        gcsSource_ = null;
        gcsSourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1.Io
          .internal_static_google_cloud_automl_v1_ImageInputConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.ImageInputConfig getDefaultInstanceForType() {
      return com.google.cloud.automl.v1.ImageInputConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.ImageInputConfig build() {
      com.google.cloud.automl.v1.ImageInputConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.ImageInputConfig buildPartial() {
      com.google.cloud.automl.v1.ImageInputConfig result =
          new com.google.cloud.automl.v1.ImageInputConfig(this);
      if (gcsSourceBuilder_ == null) {
        result.gcsSource_ = gcsSource_;
      } else {
        result.gcsSource_ = gcsSourceBuilder_.build();
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
      if (other instanceof com.google.cloud.automl.v1.ImageInputConfig) {
        return mergeFrom((com.google.cloud.automl.v1.ImageInputConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1.ImageInputConfig other) {
      if (other == com.google.cloud.automl.v1.ImageInputConfig.getDefaultInstance()) return this;
      if (other.hasGcsSource()) {
        mergeGcsSource(other.getGcsSource());
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
      com.google.cloud.automl.v1.ImageInputConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.automl.v1.ImageInputConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.automl.v1.GcsSource gcsSource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1.GcsSource,
            com.google.cloud.automl.v1.GcsSource.Builder,
            com.google.cloud.automl.v1.GcsSourceOrBuilder>
        gcsSourceBuilder_;
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location of the document file. Only a single path
     * should be given.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
     */
    public boolean hasGcsSource() {
      return gcsSourceBuilder_ != null || gcsSource_ != null;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location of the document file. Only a single path
     * should be given.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
     */
    public com.google.cloud.automl.v1.GcsSource getGcsSource() {
      if (gcsSourceBuilder_ == null) {
        return gcsSource_ == null
            ? com.google.cloud.automl.v1.GcsSource.getDefaultInstance()
            : gcsSource_;
      } else {
        return gcsSourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location of the document file. Only a single path
     * should be given.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
     */
    public Builder setGcsSource(com.google.cloud.automl.v1.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gcsSource_ = value;
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location of the document file. Only a single path
     * should be given.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
     */
    public Builder setGcsSource(com.google.cloud.automl.v1.GcsSource.Builder builderForValue) {
      if (gcsSourceBuilder_ == null) {
        gcsSource_ = builderForValue.build();
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location of the document file. Only a single path
     * should be given.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
     */
    public Builder mergeGcsSource(com.google.cloud.automl.v1.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (gcsSource_ != null) {
          gcsSource_ =
              com.google.cloud.automl.v1.GcsSource.newBuilder(gcsSource_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          gcsSource_ = value;
        }
        onChanged();
      } else {
        gcsSourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location of the document file. Only a single path
     * should be given.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
     */
    public Builder clearGcsSource() {
      if (gcsSourceBuilder_ == null) {
        gcsSource_ = null;
        onChanged();
      } else {
        gcsSource_ = null;
        gcsSourceBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location of the document file. Only a single path
     * should be given.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
     */
    public com.google.cloud.automl.v1.GcsSource.Builder getGcsSourceBuilder() {

      onChanged();
      return getGcsSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location of the document file. Only a single path
     * should be given.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
     */
    public com.google.cloud.automl.v1.GcsSourceOrBuilder getGcsSourceOrBuilder() {
      if (gcsSourceBuilder_ != null) {
        return gcsSourceBuilder_.getMessageOrBuilder();
      } else {
        return gcsSource_ == null
            ? com.google.cloud.automl.v1.GcsSource.getDefaultInstance()
            : gcsSource_;
      }
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location of the document file. Only a single path
     * should be given.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1.GcsSource,
            com.google.cloud.automl.v1.GcsSource.Builder,
            com.google.cloud.automl.v1.GcsSourceOrBuilder>
        getGcsSourceFieldBuilder() {
      if (gcsSourceBuilder_ == null) {
        gcsSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.automl.v1.GcsSource,
                com.google.cloud.automl.v1.GcsSource.Builder,
                com.google.cloud.automl.v1.GcsSourceOrBuilder>(
                getGcsSource(), getParentForChildren(), isClean());
        gcsSource_ = null;
      }
      return gcsSourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1.ImageInputConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1.ImageInputConfig)
  private static final com.google.cloud.automl.v1.ImageInputConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1.ImageInputConfig();
  }

  public static com.google.cloud.automl.v1.ImageInputConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageInputConfig> PARSER =
      new com.google.protobuf.AbstractParser<ImageInputConfig>() {
        @java.lang.Override
        public ImageInputConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ImageInputConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ImageInputConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageInputConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1.ImageInputConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
