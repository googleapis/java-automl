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

public final class ImageProto {
  private ImageProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ImageClassificationDatasetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ImageClassificationDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ImageObjectDetectionDatasetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ImageObjectDetectionDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ImageClassificationModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ImageClassificationModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ImageObjectDetectionModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ImageObjectDetectionModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ImageClassificationModelDeploymentMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ImageClassificationModelDeploymentMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ImageObjectDetectionModelDeploymentMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ImageObjectDetectionModelDeploymentMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\"google/cloud/automl/v1/image.proto\022\026go"
          + "ogle.cloud.automl.v1\032\031google/api/resourc"
          + "e.proto\032,google/cloud/automl/v1/annotati"
          + "on_spec.proto\032+google/cloud/automl/v1/cl"
          + "assification.proto\032\037google/protobuf/time"
          + "stamp.proto\032\034google/api/annotations.prot"
          + "o\"m\n\"ImageClassificationDatasetMetadata\022"
          + "G\n\023classification_type\030\001 \001(\0162*.google.cl"
          + "oud.automl.v1.ClassificationType\"%\n#Imag"
          + "eObjectDetectionDatasetMetadata\"\324\001\n Imag"
          + "eClassificationModelMetadata\022\025\n\rbase_mod"
          + "el_id\030\001 \001(\t\022%\n\035train_budget_milli_node_h"
          + "ours\030\020 \001(\003\022#\n\033train_cost_milli_node_hour"
          + "s\030\021 \001(\003\022\023\n\013stop_reason\030\005 \001(\t\022\022\n\nmodel_ty"
          + "pe\030\007 \001(\t\022\020\n\010node_qps\030\r \001(\001\022\022\n\nnode_count"
          + "\030\016 \001(\003\"\276\001\n!ImageObjectDetectionModelMeta"
          + "data\022\022\n\nmodel_type\030\001 \001(\t\022\022\n\nnode_count\030\003"
          + " \001(\003\022\020\n\010node_qps\030\004 \001(\001\022\023\n\013stop_reason\030\005 "
          + "\001(\t\022%\n\035train_budget_milli_node_hours\030\006 \001"
          + "(\003\022#\n\033train_cost_milli_node_hours\030\007 \001(\003\""
          + "@\n*ImageClassificationModelDeploymentMet"
          + "adata\022\022\n\nnode_count\030\001 \001(\003\"A\n+ImageObject"
          + "DetectionModelDeploymentMetadata\022\022\n\nnode"
          + "_count\030\001 \001(\003B\266\001\n\032com.google.cloud.automl"
          + ".v1B\nImageProtoP\001Z<google.golang.org/gen"
          + "proto/googleapis/cloud/automl/v1;automl\252"
          + "\002\026Google.Cloud.AutoML.V1\312\002\026Google\\Cloud\\"
          + "AutoMl\\V1\352\002\031Google::Cloud::AutoML::V1b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.automl.v1.AnnotationSpecOuterClass.getDescriptor(),
              com.google.cloud.automl.v1.ClassificationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1_ImageClassificationDatasetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_ImageClassificationDatasetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ImageClassificationDatasetMetadata_descriptor,
            new java.lang.String[] {
              "ClassificationType",
            });
    internal_static_google_cloud_automl_v1_ImageObjectDetectionDatasetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1_ImageObjectDetectionDatasetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ImageObjectDetectionDatasetMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1_ImageClassificationModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1_ImageClassificationModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ImageClassificationModelMetadata_descriptor,
            new java.lang.String[] {
              "BaseModelId",
              "TrainBudgetMilliNodeHours",
              "TrainCostMilliNodeHours",
              "StopReason",
              "ModelType",
              "NodeQps",
              "NodeCount",
            });
    internal_static_google_cloud_automl_v1_ImageObjectDetectionModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1_ImageObjectDetectionModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ImageObjectDetectionModelMetadata_descriptor,
            new java.lang.String[] {
              "ModelType",
              "NodeCount",
              "NodeQps",
              "StopReason",
              "TrainBudgetMilliNodeHours",
              "TrainCostMilliNodeHours",
            });
    internal_static_google_cloud_automl_v1_ImageClassificationModelDeploymentMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_automl_v1_ImageClassificationModelDeploymentMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ImageClassificationModelDeploymentMetadata_descriptor,
            new java.lang.String[] {
              "NodeCount",
            });
    internal_static_google_cloud_automl_v1_ImageObjectDetectionModelDeploymentMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_automl_v1_ImageObjectDetectionModelDeploymentMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ImageObjectDetectionModelDeploymentMetadata_descriptor,
            new java.lang.String[] {
              "NodeCount",
            });
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.automl.v1.AnnotationSpecOuterClass.getDescriptor();
    com.google.cloud.automl.v1.ClassificationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
