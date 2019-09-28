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
// source: google/cloud/automl/v1beta1/service.proto

package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for [AutoMl.UpdateColumnSpec][google.cloud.automl.v1beta1.AutoMl.UpdateColumnSpec]
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.UpdateColumnSpecRequest}
 */
public final class UpdateColumnSpecRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.UpdateColumnSpecRequest)
    UpdateColumnSpecRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateColumnSpecRequest.newBuilder() to construct.
  private UpdateColumnSpecRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateColumnSpecRequest() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateColumnSpecRequest(
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
              com.google.cloud.automl.v1beta1.ColumnSpec.Builder subBuilder = null;
              if (columnSpec_ != null) {
                subBuilder = columnSpec_.toBuilder();
              }
              columnSpec_ =
                  input.readMessage(
                      com.google.cloud.automl.v1beta1.ColumnSpec.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(columnSpec_);
                columnSpec_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
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
    return com.google.cloud.automl.v1beta1.AutoMlProto
        .internal_static_google_cloud_automl_v1beta1_UpdateColumnSpecRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.AutoMlProto
        .internal_static_google_cloud_automl_v1beta1_UpdateColumnSpecRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest.class,
            com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest.Builder.class);
  }

  public static final int COLUMN_SPEC_FIELD_NUMBER = 1;
  private com.google.cloud.automl.v1beta1.ColumnSpec columnSpec_;
  /**
   *
   *
   * <pre>
   * The column spec which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ColumnSpec column_spec = 1;</code>
   */
  public boolean hasColumnSpec() {
    return columnSpec_ != null;
  }
  /**
   *
   *
   * <pre>
   * The column spec which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ColumnSpec column_spec = 1;</code>
   */
  public com.google.cloud.automl.v1beta1.ColumnSpec getColumnSpec() {
    return columnSpec_ == null
        ? com.google.cloud.automl.v1beta1.ColumnSpec.getDefaultInstance()
        : columnSpec_;
  }
  /**
   *
   *
   * <pre>
   * The column spec which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ColumnSpec column_spec = 1;</code>
   */
  public com.google.cloud.automl.v1beta1.ColumnSpecOrBuilder getColumnSpecOrBuilder() {
    return getColumnSpec();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The update mask applies to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The update mask applies to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The update mask applies to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (columnSpec_ != null) {
      output.writeMessage(1, getColumnSpec());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (columnSpec_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getColumnSpec());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest other =
        (com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest) obj;

    if (hasColumnSpec() != other.hasColumnSpec()) return false;
    if (hasColumnSpec()) {
      if (!getColumnSpec().equals(other.getColumnSpec())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasColumnSpec()) {
      hash = (37 * hash) + COLUMN_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getColumnSpec().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest parseFrom(
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
      com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest prototype) {
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
   * Request message for [AutoMl.UpdateColumnSpec][google.cloud.automl.v1beta1.AutoMl.UpdateColumnSpec]
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.UpdateColumnSpecRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.UpdateColumnSpecRequest)
      com.google.cloud.automl.v1beta1.UpdateColumnSpecRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.AutoMlProto
          .internal_static_google_cloud_automl_v1beta1_UpdateColumnSpecRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.AutoMlProto
          .internal_static_google_cloud_automl_v1beta1_UpdateColumnSpecRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest.class,
              com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest.newBuilder()
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
      if (columnSpecBuilder_ == null) {
        columnSpec_ = null;
      } else {
        columnSpec_ = null;
        columnSpecBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.AutoMlProto
          .internal_static_google_cloud_automl_v1beta1_UpdateColumnSpecRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest build() {
      com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest buildPartial() {
      com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest result =
          new com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest(this);
      if (columnSpecBuilder_ == null) {
        result.columnSpec_ = columnSpec_;
      } else {
        result.columnSpec_ = columnSpecBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest) {
        return mergeFrom((com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest other) {
      if (other == com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest.getDefaultInstance())
        return this;
      if (other.hasColumnSpec()) {
        mergeColumnSpec(other.getColumnSpec());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.automl.v1beta1.ColumnSpec columnSpec_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.ColumnSpec,
            com.google.cloud.automl.v1beta1.ColumnSpec.Builder,
            com.google.cloud.automl.v1beta1.ColumnSpecOrBuilder>
        columnSpecBuilder_;
    /**
     *
     *
     * <pre>
     * The column spec which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ColumnSpec column_spec = 1;</code>
     */
    public boolean hasColumnSpec() {
      return columnSpecBuilder_ != null || columnSpec_ != null;
    }
    /**
     *
     *
     * <pre>
     * The column spec which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ColumnSpec column_spec = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.ColumnSpec getColumnSpec() {
      if (columnSpecBuilder_ == null) {
        return columnSpec_ == null
            ? com.google.cloud.automl.v1beta1.ColumnSpec.getDefaultInstance()
            : columnSpec_;
      } else {
        return columnSpecBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The column spec which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ColumnSpec column_spec = 1;</code>
     */
    public Builder setColumnSpec(com.google.cloud.automl.v1beta1.ColumnSpec value) {
      if (columnSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        columnSpec_ = value;
        onChanged();
      } else {
        columnSpecBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The column spec which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ColumnSpec column_spec = 1;</code>
     */
    public Builder setColumnSpec(
        com.google.cloud.automl.v1beta1.ColumnSpec.Builder builderForValue) {
      if (columnSpecBuilder_ == null) {
        columnSpec_ = builderForValue.build();
        onChanged();
      } else {
        columnSpecBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The column spec which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ColumnSpec column_spec = 1;</code>
     */
    public Builder mergeColumnSpec(com.google.cloud.automl.v1beta1.ColumnSpec value) {
      if (columnSpecBuilder_ == null) {
        if (columnSpec_ != null) {
          columnSpec_ =
              com.google.cloud.automl.v1beta1.ColumnSpec.newBuilder(columnSpec_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          columnSpec_ = value;
        }
        onChanged();
      } else {
        columnSpecBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The column spec which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ColumnSpec column_spec = 1;</code>
     */
    public Builder clearColumnSpec() {
      if (columnSpecBuilder_ == null) {
        columnSpec_ = null;
        onChanged();
      } else {
        columnSpec_ = null;
        columnSpecBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The column spec which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ColumnSpec column_spec = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.ColumnSpec.Builder getColumnSpecBuilder() {

      onChanged();
      return getColumnSpecFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The column spec which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ColumnSpec column_spec = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.ColumnSpecOrBuilder getColumnSpecOrBuilder() {
      if (columnSpecBuilder_ != null) {
        return columnSpecBuilder_.getMessageOrBuilder();
      } else {
        return columnSpec_ == null
            ? com.google.cloud.automl.v1beta1.ColumnSpec.getDefaultInstance()
            : columnSpec_;
      }
    }
    /**
     *
     *
     * <pre>
     * The column spec which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.ColumnSpec column_spec = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.ColumnSpec,
            com.google.cloud.automl.v1beta1.ColumnSpec.Builder,
            com.google.cloud.automl.v1beta1.ColumnSpecOrBuilder>
        getColumnSpecFieldBuilder() {
      if (columnSpecBuilder_ == null) {
        columnSpecBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.automl.v1beta1.ColumnSpec,
                com.google.cloud.automl.v1beta1.ColumnSpec.Builder,
                com.google.cloud.automl.v1beta1.ColumnSpecOrBuilder>(
                getColumnSpec(), getParentForChildren(), isClean());
        columnSpec_ = null;
      }
      return columnSpecBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.UpdateColumnSpecRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.UpdateColumnSpecRequest)
  private static final com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest();
  }

  public static com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateColumnSpecRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateColumnSpecRequest>() {
        @java.lang.Override
        public UpdateColumnSpecRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateColumnSpecRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateColumnSpecRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateColumnSpecRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
