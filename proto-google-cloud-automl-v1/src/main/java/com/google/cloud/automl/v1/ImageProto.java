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
          + "ogle.cloud.automl.v1\032\034google/api/annotat"
          + "ions.proto\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\032,google/c"
          + "loud/automl/v1/annotation_spec.proto\032+go"
          + "ogle/cloud/automl/v1/classification.prot"
          + "o\032\037google/protobuf/timestamp.proto\"r\n\"Im"
          + "ageClassificationDatasetMetadata\022L\n\023clas"
          + "sification_type\030\001 \001(\0162*.google.cloud.aut"
          + "oml.v1.ClassificationTypeB\003\340A\002\"%\n#ImageO"
          + "bjectDetectionDatasetMetadata\"\367\001\n ImageC"
          + "lassificationModelMetadata\022\032\n\rbase_model"
          + "_id\030\001 \001(\tB\003\340A\001\022*\n\035train_budget_milli_nod"
          + "e_hours\030\020 \001(\003B\003\340A\001\022(\n\033train_cost_milli_n"
          + "ode_hours\030\021 \001(\003B\003\340A\003\022\030\n\013stop_reason\030\005 \001("
          + "\tB\003\340A\003\022\027\n\nmodel_type\030\007 \001(\tB\003\340A\001\022\025\n\010node_"
          + "qps\030\r \001(\001B\003\340A\003\022\027\n\nnode_count\030\016 \001(\003B\003\340A\003\""
          + "\334\001\n!ImageObjectDetectionModelMetadata\022\027\n"
          + "\nmodel_type\030\001 \001(\tB\003\340A\001\022\027\n\nnode_count\030\003 \001"
          + "(\003B\003\340A\003\022\025\n\010node_qps\030\004 \001(\001B\003\340A\003\022\030\n\013stop_r"
          + "eason\030\005 \001(\tB\003\340A\003\022*\n\035train_budget_milli_n"
          + "ode_hours\030\006 \001(\003B\003\340A\001\022(\n\033train_cost_milli"
          + "_node_hours\030\007 \001(\003B\003\340A\003\"E\n*ImageClassific"
          + "ationModelDeploymentMetadata\022\027\n\nnode_cou"
          + "nt\030\001 \001(\003B\003\340A\004\"F\n+ImageObjectDetectionMod"
          + "elDeploymentMetadata\022\027\n\nnode_count\030\001 \001(\003"
          + "B\003\340A\004B\266\001\n\032com.google.cloud.automl.v1B\nIm"
          + "ageProtoP\001Z<google.golang.org/genproto/g"
          + "oogleapis/cloud/automl/v1;automl\252\002\026Googl"
          + "e.Cloud.AutoML.V1\312\002\026Google\\Cloud\\AutoMl\\"
          + "V1\352\002\031Google::Cloud::AutoML::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.automl.v1.AnnotationSpecOuterClass.getDescriptor(),
              com.google.cloud.automl.v1.ClassificationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
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
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.automl.v1.AnnotationSpecOuterClass.getDescriptor();
    com.google.cloud.automl.v1.ClassificationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
