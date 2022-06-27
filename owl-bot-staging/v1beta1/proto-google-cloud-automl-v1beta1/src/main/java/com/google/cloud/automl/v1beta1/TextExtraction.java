// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/text_extraction.proto

package com.google.cloud.automl.v1beta1;

public final class TextExtraction {
  private TextExtraction() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_TextExtractionAnnotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextExtractionAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_ConfidenceMetricsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_ConfidenceMetricsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/automl/v1beta1/text_extra" +
      "ction.proto\022\033google.cloud.automl.v1beta1" +
      "\032.google/cloud/automl/v1beta1/text_segme" +
      "nt.proto\032\034google/api/annotations.proto\"y" +
      "\n\030TextExtractionAnnotation\022@\n\014text_segme" +
      "nt\030\003 \001(\0132(.google.cloud.automl.v1beta1.T" +
      "extSegmentH\000\022\r\n\005score\030\001 \001(\002B\014\n\nannotatio" +
      "n\"\227\002\n\037TextExtractionEvaluationMetrics\022\016\n" +
      "\006au_prc\030\001 \001(\002\022w\n\032confidence_metrics_entr" +
      "ies\030\002 \003(\0132S.google.cloud.automl.v1beta1." +
      "TextExtractionEvaluationMetrics.Confiden" +
      "ceMetricsEntry\032k\n\026ConfidenceMetricsEntry" +
      "\022\034\n\024confidence_threshold\030\001 \001(\002\022\016\n\006recall" +
      "\030\003 \001(\002\022\021\n\tprecision\030\004 \001(\002\022\020\n\010f1_score\030\005 " +
      "\001(\002B\245\001\n\037com.google.cloud.automl.v1beta1P" +
      "\001ZAgoogle.golang.org/genproto/googleapis" +
      "/cloud/automl/v1beta1;automl\312\002\033Google\\Cl" +
      "oud\\AutoMl\\V1beta1\352\002\036Google::Cloud::Auto" +
      "ML::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.automl.v1beta1.TextSegmentProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_automl_v1beta1_TextExtractionAnnotation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_TextExtractionAnnotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_TextExtractionAnnotation_descriptor,
        new java.lang.String[] { "TextSegment", "Score", "Annotation", });
    internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_descriptor,
        new java.lang.String[] { "AuPrc", "ConfidenceMetricsEntries", });
    internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_ConfidenceMetricsEntry_descriptor =
      internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_ConfidenceMetricsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_ConfidenceMetricsEntry_descriptor,
        new java.lang.String[] { "ConfidenceThreshold", "Recall", "Precision", "F1Score", });
    com.google.cloud.automl.v1beta1.TextSegmentProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
