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
// source: google/cloud/automl/v1/text.proto

package com.google.cloud.automl.v1;

public final class TextProto {
  private TextProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_TextClassificationDatasetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_TextClassificationDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_TextClassificationModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_TextClassificationModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_TextExtractionDatasetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_TextExtractionDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_TextExtractionModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_TextExtractionModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_TextSentimentDatasetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_TextSentimentDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_TextSentimentModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_TextSentimentModelMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n!google/cloud/automl/v1/text.proto\022\026goo"
          + "gle.cloud.automl.v1\032\034google/api/annotati"
          + "ons.proto\032+google/cloud/automl/v1/classi"
          + "fication.proto\"l\n!TextClassificationData"
          + "setMetadata\022G\n\023classification_type\030\001 \001(\016"
          + "2*.google.cloud.automl.v1.Classification"
          + "Type\"j\n\037TextClassificationModelMetadata\022"
          + "G\n\023classification_type\030\003 \001(\0162*.google.cl"
          + "oud.automl.v1.ClassificationType\"\037\n\035Text"
          + "ExtractionDatasetMetadata\"\035\n\033TextExtract"
          + "ionModelMetadata\"5\n\034TextSentimentDataset"
          + "Metadata\022\025\n\rsentiment_max\030\001 \001(\005\"\034\n\032TextS"
          + "entimentModelMetadataB\265\001\n\032com.google.clo"
          + "ud.automl.v1B\tTextProtoP\001Z<google.golang"
          + ".org/genproto/googleapis/cloud/automl/v1"
          + ";automl\252\002\026Google.Cloud.AutoML.V1\312\002\026Googl"
          + "e\\Cloud\\AutoMl\\V1\352\002\031Google::Cloud::AutoM"
          + "L::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.cloud.automl.v1.ClassificationProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1_TextClassificationDatasetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_TextClassificationDatasetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_TextClassificationDatasetMetadata_descriptor,
            new java.lang.String[] {
              "ClassificationType",
            });
    internal_static_google_cloud_automl_v1_TextClassificationModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1_TextClassificationModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_TextClassificationModelMetadata_descriptor,
            new java.lang.String[] {
              "ClassificationType",
            });
    internal_static_google_cloud_automl_v1_TextExtractionDatasetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1_TextExtractionDatasetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_TextExtractionDatasetMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1_TextExtractionModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1_TextExtractionModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_TextExtractionModelMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1_TextSentimentDatasetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_automl_v1_TextSentimentDatasetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_TextSentimentDatasetMetadata_descriptor,
            new java.lang.String[] {
              "SentimentMax",
            });
    internal_static_google_cloud_automl_v1_TextSentimentModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_automl_v1_TextSentimentModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_TextSentimentModelMetadata_descriptor,
            new java.lang.String[] {});
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.automl.v1.ClassificationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
