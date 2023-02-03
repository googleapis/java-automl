// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1/model_evaluation.proto

package com.google.cloud.automl.v1;

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
    internal_static_google_cloud_automl_v1_ModelEvaluation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ModelEvaluation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/automl/v1/model_evaluatio" +
      "n.proto\022\026google.cloud.automl.v1\032\031google/" +
      "api/resource.proto\032+google/cloud/automl/" +
      "v1/classification.proto\032&google/cloud/au" +
      "toml/v1/detection.proto\032,google/cloud/au" +
      "toml/v1/text_extraction.proto\032+google/cl" +
      "oud/automl/v1/text_sentiment.proto\032(goog" +
      "le/cloud/automl/v1/translation.proto\032\037go" +
      "ogle/protobuf/timestamp.proto\"\276\006\n\017ModelE" +
      "valuation\022d\n!classification_evaluation_m" +
      "etrics\030\010 \001(\01327.google.cloud.automl.v1.Cl" +
      "assificationEvaluationMetricsH\000\022^\n\036trans" +
      "lation_evaluation_metrics\030\t \001(\01324.google" +
      ".cloud.automl.v1.TranslationEvaluationMe" +
      "tricsH\000\022r\n)image_object_detection_evalua" +
      "tion_metrics\030\014 \001(\0132=.google.cloud.automl" +
      ".v1.ImageObjectDetectionEvaluationMetric" +
      "sH\000\022c\n!text_sentiment_evaluation_metrics" +
      "\030\013 \001(\01326.google.cloud.automl.v1.TextSent" +
      "imentEvaluationMetricsH\000\022e\n\"text_extract" +
      "ion_evaluation_metrics\030\r \001(\01327.google.cl" +
      "oud.automl.v1.TextExtractionEvaluationMe" +
      "tricsH\000\022\014\n\004name\030\001 \001(\t\022\032\n\022annotation_spec" +
      "_id\030\002 \001(\t\022\024\n\014display_name\030\017 \001(\t\022/\n\013creat" +
      "e_time\030\005 \001(\0132\032.google.protobuf.Timestamp" +
      "\022\037\n\027evaluated_example_count\030\006 \001(\005:\207\001\352A\203\001" +
      "\n%automl.googleapis.com/ModelEvaluation\022" +
      "Zprojects/{project}/locations/{location}" +
      "/models/{model}/modelEvaluations/{model_" +
      "evaluation}B\t\n\007metricsB\240\001\n\032com.google.cl" +
      "oud.automl.v1P\001Z2cloud.google.com/go/aut" +
      "oml/apiv1/automlpb;automlpb\252\002\026Google.Clo" +
      "ud.AutoML.V1\312\002\026Google\\Cloud\\AutoMl\\V1\352\002\031" +
      "Google::Cloud::AutoML::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.automl.v1.ClassificationProto.getDescriptor(),
          com.google.cloud.automl.v1.Detection.getDescriptor(),
          com.google.cloud.automl.v1.TextExtraction.getDescriptor(),
          com.google.cloud.automl.v1.TextSentimentProto.getDescriptor(),
          com.google.cloud.automl.v1.TranslationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_automl_v1_ModelEvaluation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_ModelEvaluation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_ModelEvaluation_descriptor,
        new java.lang.String[] { "ClassificationEvaluationMetrics", "TranslationEvaluationMetrics", "ImageObjectDetectionEvaluationMetrics", "TextSentimentEvaluationMetrics", "TextExtractionEvaluationMetrics", "Name", "AnnotationSpecId", "DisplayName", "CreateTime", "EvaluatedExampleCount", "Metrics", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.automl.v1.ClassificationProto.getDescriptor();
    com.google.cloud.automl.v1.Detection.getDescriptor();
    com.google.cloud.automl.v1.TextExtraction.getDescriptor();
    com.google.cloud.automl.v1.TextSentimentProto.getDescriptor();
    com.google.cloud.automl.v1.TranslationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
