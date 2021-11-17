// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1/io.proto

package com.google.cloud.automl.v1;

public interface BatchPredictInputConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.BatchPredictInputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   * <pre>
   * Required. The Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The gcsSource.
   */
  com.google.cloud.automl.v1.GcsSource getGcsSource();
  /**
   * <pre>
   * Required. The Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.GcsSource gcs_source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.automl.v1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  public com.google.cloud.automl.v1.BatchPredictInputConfig.SourceCase getSourceCase();
}