/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/automl/v1/image.proto

package com.google.cloud.automl.v1;

/**
 *
 *
 * <pre>
 * Model deployment metadata specific to Image Object Detection.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata}
 */
public final class ImageObjectDetectionModelDeploymentMetadata
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata)
    ImageObjectDetectionModelDeploymentMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImageObjectDetectionModelDeploymentMetadata.newBuilder() to construct.
  private ImageObjectDetectionModelDeploymentMetadata(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImageObjectDetectionModelDeploymentMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImageObjectDetectionModelDeploymentMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ImageObjectDetectionModelDeploymentMetadata(
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
          case 8:
            {
              nodeCount_ = input.readInt64();
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
    return com.google.cloud.automl.v1.ImageProto
        .internal_static_google_cloud_automl_v1_ImageObjectDetectionModelDeploymentMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1.ImageProto
        .internal_static_google_cloud_automl_v1_ImageObjectDetectionModelDeploymentMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata.class,
            com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata.Builder.class);
  }

  public static final int NODE_COUNT_FIELD_NUMBER = 1;
  private long nodeCount_;
  /**
   *
   *
   * <pre>
   * Input only. The number of nodes to deploy the model on. A node is an
   * abstraction of a machine resource, which can handle online prediction QPS
   * as given in the model's
   * [qps_per_node][google.cloud.automl.v1.ImageObjectDetectionModelMetadata.qps_per_node].
   * Must be between 1 and 100, inclusive on both ends.
   * </pre>
   *
   * <code>int64 node_count = 1;</code>
   *
   * @return The nodeCount.
   */
  @java.lang.Override
  public long getNodeCount() {
    return nodeCount_;
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
    if (nodeCount_ != 0L) {
      output.writeInt64(1, nodeCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nodeCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, nodeCount_);
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
    if (!(obj instanceof com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata other =
        (com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata) obj;

    if (getNodeCount() != other.getNodeCount()) return false;
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
    hash = (37 * hash) + NODE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getNodeCount());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata parseFrom(
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
      com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata prototype) {
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
   * Model deployment metadata specific to Image Object Detection.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata)
      com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1.ImageProto
          .internal_static_google_cloud_automl_v1_ImageObjectDetectionModelDeploymentMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1.ImageProto
          .internal_static_google_cloud_automl_v1_ImageObjectDetectionModelDeploymentMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata.class,
              com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata.Builder.class);
    }

    // Construct using
    // com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata.newBuilder()
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
      nodeCount_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1.ImageProto
          .internal_static_google_cloud_automl_v1_ImageObjectDetectionModelDeploymentMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata
        getDefaultInstanceForType() {
      return com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata build() {
      com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata buildPartial() {
      com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata result =
          new com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata(this);
      result.nodeCount_ = nodeCount_;
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
      if (other instanceof com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata) {
        return mergeFrom(
            (com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata other) {
      if (other
          == com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata
              .getDefaultInstance()) return this;
      if (other.getNodeCount() != 0L) {
        setNodeCount(other.getNodeCount());
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
      com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long nodeCount_;
    /**
     *
     *
     * <pre>
     * Input only. The number of nodes to deploy the model on. A node is an
     * abstraction of a machine resource, which can handle online prediction QPS
     * as given in the model's
     * [qps_per_node][google.cloud.automl.v1.ImageObjectDetectionModelMetadata.qps_per_node].
     * Must be between 1 and 100, inclusive on both ends.
     * </pre>
     *
     * <code>int64 node_count = 1;</code>
     *
     * @return The nodeCount.
     */
    @java.lang.Override
    public long getNodeCount() {
      return nodeCount_;
    }
    /**
     *
     *
     * <pre>
     * Input only. The number of nodes to deploy the model on. A node is an
     * abstraction of a machine resource, which can handle online prediction QPS
     * as given in the model's
     * [qps_per_node][google.cloud.automl.v1.ImageObjectDetectionModelMetadata.qps_per_node].
     * Must be between 1 and 100, inclusive on both ends.
     * </pre>
     *
     * <code>int64 node_count = 1;</code>
     *
     * @param value The nodeCount to set.
     * @return This builder for chaining.
     */
    public Builder setNodeCount(long value) {

      nodeCount_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Input only. The number of nodes to deploy the model on. A node is an
     * abstraction of a machine resource, which can handle online prediction QPS
     * as given in the model's
     * [qps_per_node][google.cloud.automl.v1.ImageObjectDetectionModelMetadata.qps_per_node].
     * Must be between 1 and 100, inclusive on both ends.
     * </pre>
     *
     * <code>int64 node_count = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNodeCount() {

      nodeCount_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata)
  private static final com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata();
  }

  public static com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageObjectDetectionModelDeploymentMetadata>
      PARSER =
          new com.google.protobuf.AbstractParser<ImageObjectDetectionModelDeploymentMetadata>() {
            @java.lang.Override
            public ImageObjectDetectionModelDeploymentMetadata parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return new ImageObjectDetectionModelDeploymentMetadata(input, extensionRegistry);
            }
          };

  public static com.google.protobuf.Parser<ImageObjectDetectionModelDeploymentMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageObjectDetectionModelDeploymentMetadata>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
