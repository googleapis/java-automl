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
// source: google/cloud/automl/v1beta1/text_extraction.proto

package com.google.cloud.automl.v1beta1;

public interface TextExtractionEvaluationMetricsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.TextExtractionEvaluationMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The Area under precision recall curve metric.
   * </pre>
   *
   * <code>float au_prc = 1;</code>
   *
   * @return The auPrc.
   */
  float getAuPrc();

  /**
   *
   *
   * <pre>
   * Output only. Metrics that have confidence thresholds.
   * Precision-recall curve can be derived from it.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1beta1.TextExtractionEvaluationMetrics.ConfidenceMetricsEntry confidence_metrics_entries = 2;
   * </code>
   */
  java.util.List<
          com.google.cloud.automl.v1beta1.TextExtractionEvaluationMetrics.ConfidenceMetricsEntry>
      getConfidenceMetricsEntriesList();
  /**
   *
   *
   * <pre>
   * Output only. Metrics that have confidence thresholds.
   * Precision-recall curve can be derived from it.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1beta1.TextExtractionEvaluationMetrics.ConfidenceMetricsEntry confidence_metrics_entries = 2;
   * </code>
   */
  com.google.cloud.automl.v1beta1.TextExtractionEvaluationMetrics.ConfidenceMetricsEntry
      getConfidenceMetricsEntries(int index);
  /**
   *
   *
   * <pre>
   * Output only. Metrics that have confidence thresholds.
   * Precision-recall curve can be derived from it.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1beta1.TextExtractionEvaluationMetrics.ConfidenceMetricsEntry confidence_metrics_entries = 2;
   * </code>
   */
  int getConfidenceMetricsEntriesCount();
  /**
   *
   *
   * <pre>
   * Output only. Metrics that have confidence thresholds.
   * Precision-recall curve can be derived from it.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1beta1.TextExtractionEvaluationMetrics.ConfidenceMetricsEntry confidence_metrics_entries = 2;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.automl.v1beta1.TextExtractionEvaluationMetrics
                  .ConfidenceMetricsEntryOrBuilder>
      getConfidenceMetricsEntriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Metrics that have confidence thresholds.
   * Precision-recall curve can be derived from it.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.automl.v1beta1.TextExtractionEvaluationMetrics.ConfidenceMetricsEntry confidence_metrics_entries = 2;
   * </code>
   */
  com.google.cloud.automl.v1beta1.TextExtractionEvaluationMetrics.ConfidenceMetricsEntryOrBuilder
      getConfidenceMetricsEntriesOrBuilder(int index);
}
