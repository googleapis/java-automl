// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1/service.proto

package com.google.cloud.automl.v1;

public interface ExportModelRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.ExportModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the model to export.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the model to export.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The desired output location and configuration.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ModelExportOutputConfig output_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   * <pre>
   * Required. The desired output location and configuration.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ModelExportOutputConfig output_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The outputConfig.
   */
  com.google.cloud.automl.v1.ModelExportOutputConfig getOutputConfig();
  /**
   * <pre>
   * Required. The desired output location and configuration.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ModelExportOutputConfig output_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.automl.v1.ModelExportOutputConfigOrBuilder getOutputConfigOrBuilder();
}
