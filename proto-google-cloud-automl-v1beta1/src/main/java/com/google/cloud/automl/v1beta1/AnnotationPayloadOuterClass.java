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
// source: google/cloud/automl/v1beta1/annotation_payload.proto

package com.google.cloud.automl.v1beta1;

public final class AnnotationPayloadOuterClass {
  private AnnotationPayloadOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_AnnotationPayload_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_AnnotationPayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/automl/v1beta1/annotation"
          + "_payload.proto\022\033google.cloud.automl.v1be"
          + "ta1\0320google/cloud/automl/v1beta1/classif"
          + "ication.proto\032+google/cloud/automl/v1bet"
          + "a1/detection.proto\032(google/cloud/automl/"
          + "v1beta1/tables.proto\0321google/cloud/autom"
          + "l/v1beta1/text_extraction.proto\0320google/"
          + "cloud/automl/v1beta1/text_sentiment.prot"
          + "o\032-google/cloud/automl/v1beta1/translati"
          + "on.proto\032\031google/protobuf/any.proto\032\034goo"
          + "gle/api/annotations.proto\"\346\005\n\021Annotation"
          + "Payload\022I\n\013translation\030\002 \001(\01322.google.cl"
          + "oud.automl.v1beta1.TranslationAnnotation"
          + "H\000\022O\n\016classification\030\003 \001(\01325.google.clou"
          + "d.automl.v1beta1.ClassificationAnnotatio"
          + "nH\000\022]\n\026image_object_detection\030\004 \001(\0132;.go"
          + "ogle.cloud.automl.v1beta1.ImageObjectDet"
          + "ectionAnnotationH\000\022Z\n\024video_classificati"
          + "on\030\t \001(\0132:.google.cloud.automl.v1beta1.V"
          + "ideoClassificationAnnotationH\000\022[\n\025video_"
          + "object_tracking\030\010 \001(\0132:.google.cloud.aut"
          + "oml.v1beta1.VideoObjectTrackingAnnotatio"
          + "nH\000\022P\n\017text_extraction\030\006 \001(\01325.google.cl"
          + "oud.automl.v1beta1.TextExtractionAnnotat"
          + "ionH\000\022N\n\016text_sentiment\030\007 \001(\01324.google.c"
          + "loud.automl.v1beta1.TextSentimentAnnotat"
          + "ionH\000\022?\n\006tables\030\n \001(\0132-.google.cloud.aut"
          + "oml.v1beta1.TablesAnnotationH\000\022\032\n\022annota"
          + "tion_spec_id\030\001 \001(\t\022\024\n\014display_name\030\005 \001(\t"
          + "B\010\n\006detailB\245\001\n\037com.google.cloud.automl.v"
          + "1beta1P\001ZAgoogle.golang.org/genproto/goo"
          + "gleapis/cloud/automl/v1beta1;automl\312\002\033Go"
          + "ogle\\Cloud\\AutoMl\\V1beta1\352\002\036Google::Clou"
          + "d::AutoML::V1beta1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.Detection.getDescriptor(),
          com.google.cloud.automl.v1beta1.Tables.getDescriptor(),
          com.google.cloud.automl.v1beta1.TextExtraction.getDescriptor(),
          com.google.cloud.automl.v1beta1.TextSentimentProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.TranslationProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_automl_v1beta1_AnnotationPayload_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_AnnotationPayload_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_AnnotationPayload_descriptor,
            new java.lang.String[] {
              "Translation",
              "Classification",
              "ImageObjectDetection",
              "VideoClassification",
              "VideoObjectTracking",
              "TextExtraction",
              "TextSentiment",
              "Tables",
              "AnnotationSpecId",
              "DisplayName",
              "Detail",
            });
    com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor();
    com.google.cloud.automl.v1beta1.Detection.getDescriptor();
    com.google.cloud.automl.v1beta1.Tables.getDescriptor();
    com.google.cloud.automl.v1beta1.TextExtraction.getDescriptor();
    com.google.cloud.automl.v1beta1.TextSentimentProto.getDescriptor();
    com.google.cloud.automl.v1beta1.TranslationProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
