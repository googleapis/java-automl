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
// source: google/cloud/automl/v1beta1/io.proto

package com.google.cloud.automl.v1beta1;

public interface BatchPredictInputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.BatchPredictInputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.automl.v1beta1.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
   */
  com.google.cloud.automl.v1beta1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * The BigQuery location for the input content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BigQuerySource bigquery_source = 2;</code>
   *
   * @return Whether the bigquerySource field is set.
   */
  boolean hasBigquerySource();
  /**
   *
   *
   * <pre>
   * The BigQuery location for the input content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BigQuerySource bigquery_source = 2;</code>
   *
   * @return The bigquerySource.
   */
  com.google.cloud.automl.v1beta1.BigQuerySource getBigquerySource();
  /**
   *
   *
   * <pre>
   * The BigQuery location for the input content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BigQuerySource bigquery_source = 2;</code>
   */
  com.google.cloud.automl.v1beta1.BigQuerySourceOrBuilder getBigquerySourceOrBuilder();

  public com.google.cloud.automl.v1beta1.BatchPredictInputConfig.SourceCase getSourceCase();
}
