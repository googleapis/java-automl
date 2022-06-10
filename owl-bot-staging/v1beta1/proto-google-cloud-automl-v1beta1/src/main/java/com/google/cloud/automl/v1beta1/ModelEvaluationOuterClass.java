// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/model_evaluation.proto

package com.google.cloud.automl.v1beta1;

public final class ModelEvaluationOuterClass {
  private ModelEvaluationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_ModelEvaluation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ModelEvaluation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/automl/v1beta1/model_eval" +
      "uation.proto\022\033google.cloud.automl.v1beta" +
      "1\032\031google/api/resource.proto\0320google/clo" +
      "ud/automl/v1beta1/classification.proto\032+" +
      "google/cloud/automl/v1beta1/detection.pr" +
      "oto\032,google/cloud/automl/v1beta1/regress" +
      "ion.proto\032(google/cloud/automl/v1beta1/t" +
      "ables.proto\0321google/cloud/automl/v1beta1" +
      "/text_extraction.proto\0320google/cloud/aut" +
      "oml/v1beta1/text_sentiment.proto\032-google" +
      "/cloud/automl/v1beta1/translation.proto\032" +
      "\037google/protobuf/timestamp.proto\032\034google" +
      "/api/annotations.proto\"\261\010\n\017ModelEvaluati" +
      "on\022i\n!classification_evaluation_metrics\030" +
      "\010 \001(\0132<.google.cloud.automl.v1beta1.Clas" +
      "sificationEvaluationMetricsH\000\022a\n\035regress" +
      "ion_evaluation_metrics\030\030 \001(\01328.google.cl" +
      "oud.automl.v1beta1.RegressionEvaluationM" +
      "etricsH\000\022c\n\036translation_evaluation_metri" +
      "cs\030\t \001(\01329.google.cloud.automl.v1beta1.T" +
      "ranslationEvaluationMetricsH\000\022w\n)image_o" +
      "bject_detection_evaluation_metrics\030\014 \001(\013" +
      "2B.google.cloud.automl.v1beta1.ImageObje" +
      "ctDetectionEvaluationMetricsH\000\022u\n(video_" +
      "object_tracking_evaluation_metrics\030\016 \001(\013" +
      "2A.google.cloud.automl.v1beta1.VideoObje" +
      "ctTrackingEvaluationMetricsH\000\022h\n!text_se" +
      "ntiment_evaluation_metrics\030\013 \001(\0132;.googl" +
      "e.cloud.automl.v1beta1.TextSentimentEval" +
      "uationMetricsH\000\022j\n\"text_extraction_evalu" +
      "ation_metrics\030\r \001(\0132<.google.cloud.autom" +
      "l.v1beta1.TextExtractionEvaluationMetric" +
      "sH\000\022\014\n\004name\030\001 \001(\t\022\032\n\022annotation_spec_id\030" +
      "\002 \001(\t\022\024\n\014display_name\030\017 \001(\t\022/\n\013create_ti" +
      "me\030\005 \001(\0132\032.google.protobuf.Timestamp\022\037\n\027" +
      "evaluated_example_count\030\006 \001(\005:\207\001\352A\203\001\n%au" +
      "toml.googleapis.com/ModelEvaluation\022Zpro" +
      "jects/{project}/locations/{location}/mod" +
      "els/{model}/modelEvaluations/{model_eval" +
      "uation}B\t\n\007metricsB\245\001\n\037com.google.cloud." +
      "automl.v1beta1P\001ZAgoogle.golang.org/genp" +
      "roto/googleapis/cloud/automl/v1beta1;aut" +
      "oml\312\002\033Google\\Cloud\\AutoMl\\V1beta1\352\002\036Goog" +
      "le::Cloud::AutoML::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.Detection.getDescriptor(),
          com.google.cloud.automl.v1beta1.RegressionProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.Tables.getDescriptor(),
          com.google.cloud.automl.v1beta1.TextExtraction.getDescriptor(),
          com.google.cloud.automl.v1beta1.TextSentimentProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.TranslationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_automl_v1beta1_ModelEvaluation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_ModelEvaluation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_ModelEvaluation_descriptor,
        new java.lang.String[] { "ClassificationEvaluationMetrics", "RegressionEvaluationMetrics", "TranslationEvaluationMetrics", "ImageObjectDetectionEvaluationMetrics", "VideoObjectTrackingEvaluationMetrics", "TextSentimentEvaluationMetrics", "TextExtractionEvaluationMetrics", "Name", "AnnotationSpecId", "DisplayName", "CreateTime", "EvaluatedExampleCount", "Metrics", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor();
    com.google.cloud.automl.v1beta1.Detection.getDescriptor();
    com.google.cloud.automl.v1beta1.RegressionProto.getDescriptor();
    com.google.cloud.automl.v1beta1.Tables.getDescriptor();
    com.google.cloud.automl.v1beta1.TextExtraction.getDescriptor();
    com.google.cloud.automl.v1beta1.TextSentimentProto.getDescriptor();
    com.google.cloud.automl.v1beta1.TranslationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
