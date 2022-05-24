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
// source: google/cloud/automl/v1/text_sentiment.proto

package com.google.cloud.automl.v1;

public final class TextSentimentProto {
  private TextSentimentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_TextSentimentAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_TextSentimentAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_TextSentimentEvaluationMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_TextSentimentEvaluationMetrics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/automl/v1/text_sentiment."
          + "proto\022\026google.cloud.automl.v1\032+google/cl"
          + "oud/automl/v1/classification.proto\",\n\027Te"
          + "xtSentimentAnnotation\022\021\n\tsentiment\030\001 \001(\005"
          + "\"\240\002\n\036TextSentimentEvaluationMetrics\022\021\n\tp"
          + "recision\030\001 \001(\002\022\016\n\006recall\030\002 \001(\002\022\020\n\010f1_sco"
          + "re\030\003 \001(\002\022\033\n\023mean_absolute_error\030\004 \001(\002\022\032\n"
          + "\022mean_squared_error\030\005 \001(\002\022\024\n\014linear_kapp"
          + "a\030\006 \001(\002\022\027\n\017quadratic_kappa\030\007 \001(\002\022a\n\020conf"
          + "usion_matrix\030\010 \001(\0132G.google.cloud.automl"
          + ".v1.ClassificationEvaluationMetrics.Conf"
          + "usionMatrixB\276\001\n\032com.google.cloud.automl."
          + "v1B\022TextSentimentProtoP\001Z<google.golang."
          + "org/genproto/googleapis/cloud/automl/v1;"
          + "automl\252\002\026Google.Cloud.AutoML.V1\312\002\026Google"
          + "\\Cloud\\AutoMl\\V1\352\002\031Google::Cloud::AutoML"
          + "::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.automl.v1.ClassificationProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1_TextSentimentAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_TextSentimentAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_TextSentimentAnnotation_descriptor,
            new java.lang.String[] {
              "Sentiment",
            });
    internal_static_google_cloud_automl_v1_TextSentimentEvaluationMetrics_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1_TextSentimentEvaluationMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_TextSentimentEvaluationMetrics_descriptor,
            new java.lang.String[] {
              "Precision",
              "Recall",
              "F1Score",
              "MeanAbsoluteError",
              "MeanSquaredError",
              "LinearKappa",
              "QuadraticKappa",
              "ConfusionMatrix",
            });
    com.google.cloud.automl.v1.ClassificationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
