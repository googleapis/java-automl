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
// source: google/cloud/automl/v1/service.proto

package com.google.cloud.automl.v1;

/**
 *
 *
 * <pre>
 * Request message for [AutoMl.CreateModel][google.cloud.automl.v1.AutoMl.CreateModel].
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1.CreateModelRequest}
 */
public final class CreateModelRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1.CreateModelRequest)
    CreateModelRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateModelRequest.newBuilder() to construct.
  private CreateModelRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateModelRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateModelRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1.AutoMlProto
        .internal_static_google_cloud_automl_v1_CreateModelRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1.AutoMlProto
        .internal_static_google_cloud_automl_v1_CreateModelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1.CreateModelRequest.class,
            com.google.cloud.automl.v1.CreateModelRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. Resource name of the parent project where the model is being created.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Resource name of the parent project where the model is being created.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODEL_FIELD_NUMBER = 4;
  private com.google.cloud.automl.v1.Model model_;
  /**
   *
   *
   * <pre>
   * Required. The model to create.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.Model model = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the model field is set.
   */
  @java.lang.Override
  public boolean hasModel() {
    return model_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The model to create.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.Model model = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The model.
   */
  @java.lang.Override
  public com.google.cloud.automl.v1.Model getModel() {
    return model_ == null ? com.google.cloud.automl.v1.Model.getDefaultInstance() : model_;
  }
  /**
   *
   *
   * <pre>
   * Required. The model to create.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.Model model = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.automl.v1.ModelOrBuilder getModelOrBuilder() {
    return getModel();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (model_ != null) {
      output.writeMessage(4, getModel());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (model_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getModel());
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
    if (!(obj instanceof com.google.cloud.automl.v1.CreateModelRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1.CreateModelRequest other =
        (com.google.cloud.automl.v1.CreateModelRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasModel() != other.hasModel()) return false;
    if (hasModel()) {
      if (!getModel().equals(other.getModel())) return false;
    }
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasModel()) {
      hash = (37 * hash) + MODEL_FIELD_NUMBER;
      hash = (53 * hash) + getModel().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1.CreateModelRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.CreateModelRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.CreateModelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.CreateModelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.CreateModelRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.CreateModelRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.CreateModelRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.CreateModelRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.CreateModelRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.CreateModelRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.CreateModelRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.CreateModelRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.automl.v1.CreateModelRequest prototype) {
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
   * Request message for [AutoMl.CreateModel][google.cloud.automl.v1.AutoMl.CreateModel].
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1.CreateModelRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1.CreateModelRequest)
      com.google.cloud.automl.v1.CreateModelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1.AutoMlProto
          .internal_static_google_cloud_automl_v1_CreateModelRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1.AutoMlProto
          .internal_static_google_cloud_automl_v1_CreateModelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1.CreateModelRequest.class,
              com.google.cloud.automl.v1.CreateModelRequest.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1.CreateModelRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (modelBuilder_ == null) {
        model_ = null;
      } else {
        model_ = null;
        modelBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1.AutoMlProto
          .internal_static_google_cloud_automl_v1_CreateModelRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.CreateModelRequest getDefaultInstanceForType() {
      return com.google.cloud.automl.v1.CreateModelRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.CreateModelRequest build() {
      com.google.cloud.automl.v1.CreateModelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.CreateModelRequest buildPartial() {
      com.google.cloud.automl.v1.CreateModelRequest result =
          new com.google.cloud.automl.v1.CreateModelRequest(this);
      result.parent_ = parent_;
      if (modelBuilder_ == null) {
        result.model_ = model_;
      } else {
        result.model_ = modelBuilder_.build();
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
      if (other instanceof com.google.cloud.automl.v1.CreateModelRequest) {
        return mergeFrom((com.google.cloud.automl.v1.CreateModelRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1.CreateModelRequest other) {
      if (other == com.google.cloud.automl.v1.CreateModelRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasModel()) {
        mergeModel(other.getModel());
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
            case 10:
              {
                parent_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 34:
              {
                input.readMessage(getModelFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 34
            default:
              {
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Resource name of the parent project where the model is being created.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the parent project where the model is being created.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the parent project where the model is being created.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the parent project where the model is being created.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the parent project where the model is being created.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.automl.v1.Model model_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1.Model,
            com.google.cloud.automl.v1.Model.Builder,
            com.google.cloud.automl.v1.ModelOrBuilder>
        modelBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The model to create.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.Model model = 4 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the model field is set.
     */
    public boolean hasModel() {
      return modelBuilder_ != null || model_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The model to create.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.Model model = 4 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The model.
     */
    public com.google.cloud.automl.v1.Model getModel() {
      if (modelBuilder_ == null) {
        return model_ == null ? com.google.cloud.automl.v1.Model.getDefaultInstance() : model_;
      } else {
        return modelBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The model to create.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.Model model = 4 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setModel(com.google.cloud.automl.v1.Model value) {
      if (modelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        model_ = value;
        onChanged();
      } else {
        modelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The model to create.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.Model model = 4 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setModel(com.google.cloud.automl.v1.Model.Builder builderForValue) {
      if (modelBuilder_ == null) {
        model_ = builderForValue.build();
        onChanged();
      } else {
        modelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The model to create.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.Model model = 4 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeModel(com.google.cloud.automl.v1.Model value) {
      if (modelBuilder_ == null) {
        if (model_ != null) {
          model_ =
              com.google.cloud.automl.v1.Model.newBuilder(model_).mergeFrom(value).buildPartial();
        } else {
          model_ = value;
        }
        onChanged();
      } else {
        modelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The model to create.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.Model model = 4 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearModel() {
      if (modelBuilder_ == null) {
        model_ = null;
        onChanged();
      } else {
        model_ = null;
        modelBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The model to create.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.Model model = 4 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.automl.v1.Model.Builder getModelBuilder() {

      onChanged();
      return getModelFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The model to create.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.Model model = 4 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.automl.v1.ModelOrBuilder getModelOrBuilder() {
      if (modelBuilder_ != null) {
        return modelBuilder_.getMessageOrBuilder();
      } else {
        return model_ == null ? com.google.cloud.automl.v1.Model.getDefaultInstance() : model_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The model to create.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.Model model = 4 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1.Model,
            com.google.cloud.automl.v1.Model.Builder,
            com.google.cloud.automl.v1.ModelOrBuilder>
        getModelFieldBuilder() {
      if (modelBuilder_ == null) {
        modelBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.automl.v1.Model,
                com.google.cloud.automl.v1.Model.Builder,
                com.google.cloud.automl.v1.ModelOrBuilder>(
                getModel(), getParentForChildren(), isClean());
        model_ = null;
      }
      return modelBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1.CreateModelRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1.CreateModelRequest)
  private static final com.google.cloud.automl.v1.CreateModelRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1.CreateModelRequest();
  }

  public static com.google.cloud.automl.v1.CreateModelRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateModelRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateModelRequest>() {
        @java.lang.Override
        public CreateModelRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateModelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateModelRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1.CreateModelRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
