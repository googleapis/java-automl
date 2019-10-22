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
// source: google/cloud/automl/v1/service.proto

package com.google.cloud.automl.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [AutoMl.ExportModel][google.cloud.automl.v1.AutoMl.ExportModel]. Models need
 * to be enabled for exporting, otherwise an error code will be returned.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1.ExportModelRequest}
 */
public final class ExportModelRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1.ExportModelRequest)
    ExportModelRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExportModelRequest.newBuilder() to construct.
  private ExportModelRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExportModelRequest() {
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ExportModelRequest(
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
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 26:
            {
              com.google.cloud.automl.v1.ModelExportOutputConfig.Builder subBuilder = null;
              if (outputConfig_ != null) {
                subBuilder = outputConfig_.toBuilder();
              }
              outputConfig_ =
                  input.readMessage(
                      com.google.cloud.automl.v1.ModelExportOutputConfig.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(outputConfig_);
                outputConfig_ = subBuilder.buildPartial();
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
    return com.google.cloud.automl.v1.AutoMlProto
        .internal_static_google_cloud_automl_v1_ExportModelRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1.AutoMlProto
        .internal_static_google_cloud_automl_v1_ExportModelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1.ExportModelRequest.class,
            com.google.cloud.automl.v1.ExportModelRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the model to export.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the model to export.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OUTPUT_CONFIG_FIELD_NUMBER = 3;
  private com.google.cloud.automl.v1.ModelExportOutputConfig outputConfig_;
  /**
   *
   *
   * <pre>
   * Required. The desired output location and configuration.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ModelExportOutputConfig output_config = 3;</code>
   */
  public boolean hasOutputConfig() {
    return outputConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The desired output location and configuration.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ModelExportOutputConfig output_config = 3;</code>
   */
  public com.google.cloud.automl.v1.ModelExportOutputConfig getOutputConfig() {
    return outputConfig_ == null
        ? com.google.cloud.automl.v1.ModelExportOutputConfig.getDefaultInstance()
        : outputConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. The desired output location and configuration.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ModelExportOutputConfig output_config = 3;</code>
   */
  public com.google.cloud.automl.v1.ModelExportOutputConfigOrBuilder getOutputConfigOrBuilder() {
    return getOutputConfig();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (outputConfig_ != null) {
      output.writeMessage(3, getOutputConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (outputConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getOutputConfig());
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
    if (!(obj instanceof com.google.cloud.automl.v1.ExportModelRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1.ExportModelRequest other =
        (com.google.cloud.automl.v1.ExportModelRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasOutputConfig() != other.hasOutputConfig()) return false;
    if (hasOutputConfig()) {
      if (!getOutputConfig().equals(other.getOutputConfig())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasOutputConfig()) {
      hash = (37 * hash) + OUTPUT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getOutputConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1.ExportModelRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.ExportModelRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ExportModelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.ExportModelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ExportModelRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.ExportModelRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ExportModelRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.ExportModelRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ExportModelRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.ExportModelRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.ExportModelRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.ExportModelRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.automl.v1.ExportModelRequest prototype) {
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
   * Request message for
   * [AutoMl.ExportModel][google.cloud.automl.v1.AutoMl.ExportModel]. Models need
   * to be enabled for exporting, otherwise an error code will be returned.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1.ExportModelRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1.ExportModelRequest)
      com.google.cloud.automl.v1.ExportModelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1.AutoMlProto
          .internal_static_google_cloud_automl_v1_ExportModelRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1.AutoMlProto
          .internal_static_google_cloud_automl_v1_ExportModelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1.ExportModelRequest.class,
              com.google.cloud.automl.v1.ExportModelRequest.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1.ExportModelRequest.newBuilder()
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
      name_ = "";

      if (outputConfigBuilder_ == null) {
        outputConfig_ = null;
      } else {
        outputConfig_ = null;
        outputConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1.AutoMlProto
          .internal_static_google_cloud_automl_v1_ExportModelRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.ExportModelRequest getDefaultInstanceForType() {
      return com.google.cloud.automl.v1.ExportModelRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.ExportModelRequest build() {
      com.google.cloud.automl.v1.ExportModelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.ExportModelRequest buildPartial() {
      com.google.cloud.automl.v1.ExportModelRequest result =
          new com.google.cloud.automl.v1.ExportModelRequest(this);
      result.name_ = name_;
      if (outputConfigBuilder_ == null) {
        result.outputConfig_ = outputConfig_;
      } else {
        result.outputConfig_ = outputConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.automl.v1.ExportModelRequest) {
        return mergeFrom((com.google.cloud.automl.v1.ExportModelRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1.ExportModelRequest other) {
      if (other == com.google.cloud.automl.v1.ExportModelRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasOutputConfig()) {
        mergeOutputConfig(other.getOutputConfig());
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
      com.google.cloud.automl.v1.ExportModelRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.automl.v1.ExportModelRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the model to export.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the model to export.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the model to export.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the model to export.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the model to export.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.automl.v1.ModelExportOutputConfig outputConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1.ModelExportOutputConfig,
            com.google.cloud.automl.v1.ModelExportOutputConfig.Builder,
            com.google.cloud.automl.v1.ModelExportOutputConfigOrBuilder>
        outputConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The desired output location and configuration.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.ModelExportOutputConfig output_config = 3;</code>
     */
    public boolean hasOutputConfig() {
      return outputConfigBuilder_ != null || outputConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The desired output location and configuration.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.ModelExportOutputConfig output_config = 3;</code>
     */
    public com.google.cloud.automl.v1.ModelExportOutputConfig getOutputConfig() {
      if (outputConfigBuilder_ == null) {
        return outputConfig_ == null
            ? com.google.cloud.automl.v1.ModelExportOutputConfig.getDefaultInstance()
            : outputConfig_;
      } else {
        return outputConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The desired output location and configuration.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.ModelExportOutputConfig output_config = 3;</code>
     */
    public Builder setOutputConfig(com.google.cloud.automl.v1.ModelExportOutputConfig value) {
      if (outputConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        outputConfig_ = value;
        onChanged();
      } else {
        outputConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The desired output location and configuration.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.ModelExportOutputConfig output_config = 3;</code>
     */
    public Builder setOutputConfig(
        com.google.cloud.automl.v1.ModelExportOutputConfig.Builder builderForValue) {
      if (outputConfigBuilder_ == null) {
        outputConfig_ = builderForValue.build();
        onChanged();
      } else {
        outputConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The desired output location and configuration.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.ModelExportOutputConfig output_config = 3;</code>
     */
    public Builder mergeOutputConfig(com.google.cloud.automl.v1.ModelExportOutputConfig value) {
      if (outputConfigBuilder_ == null) {
        if (outputConfig_ != null) {
          outputConfig_ =
              com.google.cloud.automl.v1.ModelExportOutputConfig.newBuilder(outputConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          outputConfig_ = value;
        }
        onChanged();
      } else {
        outputConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The desired output location and configuration.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.ModelExportOutputConfig output_config = 3;</code>
     */
    public Builder clearOutputConfig() {
      if (outputConfigBuilder_ == null) {
        outputConfig_ = null;
        onChanged();
      } else {
        outputConfig_ = null;
        outputConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The desired output location and configuration.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.ModelExportOutputConfig output_config = 3;</code>
     */
    public com.google.cloud.automl.v1.ModelExportOutputConfig.Builder getOutputConfigBuilder() {

      onChanged();
      return getOutputConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The desired output location and configuration.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.ModelExportOutputConfig output_config = 3;</code>
     */
    public com.google.cloud.automl.v1.ModelExportOutputConfigOrBuilder getOutputConfigOrBuilder() {
      if (outputConfigBuilder_ != null) {
        return outputConfigBuilder_.getMessageOrBuilder();
      } else {
        return outputConfig_ == null
            ? com.google.cloud.automl.v1.ModelExportOutputConfig.getDefaultInstance()
            : outputConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The desired output location and configuration.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.ModelExportOutputConfig output_config = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1.ModelExportOutputConfig,
            com.google.cloud.automl.v1.ModelExportOutputConfig.Builder,
            com.google.cloud.automl.v1.ModelExportOutputConfigOrBuilder>
        getOutputConfigFieldBuilder() {
      if (outputConfigBuilder_ == null) {
        outputConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.automl.v1.ModelExportOutputConfig,
                com.google.cloud.automl.v1.ModelExportOutputConfig.Builder,
                com.google.cloud.automl.v1.ModelExportOutputConfigOrBuilder>(
                getOutputConfig(), getParentForChildren(), isClean());
        outputConfig_ = null;
      }
      return outputConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1.ExportModelRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1.ExportModelRequest)
  private static final com.google.cloud.automl.v1.ExportModelRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1.ExportModelRequest();
  }

  public static com.google.cloud.automl.v1.ExportModelRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportModelRequest> PARSER =
      new com.google.protobuf.AbstractParser<ExportModelRequest>() {
        @java.lang.Override
        public ExportModelRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ExportModelRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ExportModelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportModelRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1.ExportModelRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
