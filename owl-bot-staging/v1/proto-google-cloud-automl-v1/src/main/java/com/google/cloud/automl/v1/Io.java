// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1/io.proto

package com.google.cloud.automl.v1;

public final class Io {
  private Io() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_InputConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_InputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_InputConfig_ParamsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_InputConfig_ParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_BatchPredictInputConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_BatchPredictInputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_DocumentInputConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_DocumentInputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_OutputConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_OutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_BatchPredictOutputConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_BatchPredictOutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_ModelExportOutputConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ModelExportOutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_ModelExportOutputConfig_ParamsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ModelExportOutputConfig_ParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_GcsSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_GcsDestination_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_GcsDestination_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037google/cloud/automl/v1/io.proto\022\026googl" +
      "e.cloud.automl.v1\032\037google/api/field_beha" +
      "vior.proto\"\300\001\n\013InputConfig\0227\n\ngcs_source" +
      "\030\001 \001(\0132!.google.cloud.automl.v1.GcsSourc" +
      "eH\000\022?\n\006params\030\002 \003(\0132/.google.cloud.autom" +
      "l.v1.InputConfig.ParamsEntry\032-\n\013ParamsEn" +
      "try\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\010\n\006s" +
      "ource\"a\n\027BatchPredictInputConfig\022<\n\ngcs_" +
      "source\030\001 \001(\0132!.google.cloud.automl.v1.Gc" +
      "sSourceB\003\340A\002H\000B\010\n\006source\"L\n\023DocumentInpu" +
      "tConfig\0225\n\ngcs_source\030\001 \001(\0132!.google.clo" +
      "ud.automl.v1.GcsSource\"e\n\014OutputConfig\022F" +
      "\n\017gcs_destination\030\001 \001(\0132&.google.cloud.a" +
      "utoml.v1.GcsDestinationB\003\340A\002H\000B\r\n\013destin" +
      "ation\"q\n\030BatchPredictOutputConfig\022F\n\017gcs" +
      "_destination\030\001 \001(\0132&.google.cloud.automl" +
      ".v1.GcsDestinationB\003\340A\002H\000B\r\n\013destination" +
      "\"\202\002\n\027ModelExportOutputConfig\022F\n\017gcs_dest" +
      "ination\030\001 \001(\0132&.google.cloud.automl.v1.G" +
      "csDestinationB\003\340A\002H\000\022\024\n\014model_format\030\004 \001" +
      "(\t\022K\n\006params\030\002 \003(\0132;.google.cloud.automl" +
      ".v1.ModelExportOutputConfig.ParamsEntry\032" +
      "-\n\013ParamsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001" +
      "(\t:\0028\001B\r\n\013destination\"$\n\tGcsSource\022\027\n\nin" +
      "put_uris\030\001 \003(\tB\003\340A\002\"0\n\016GcsDestination\022\036\n" +
      "\021output_uri_prefix\030\001 \001(\tB\003\340A\002B\240\001\n\032com.go" +
      "ogle.cloud.automl.v1P\001Z2cloud.google.com" +
      "/go/automl/apiv1/automlpb;automlpb\252\002\026Goo" +
      "gle.Cloud.AutoML.V1\312\002\026Google\\Cloud\\AutoM" +
      "l\\V1\352\002\031Google::Cloud::AutoML::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_cloud_automl_v1_InputConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_InputConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_InputConfig_descriptor,
        new java.lang.String[] { "GcsSource", "Params", "Source", });
    internal_static_google_cloud_automl_v1_InputConfig_ParamsEntry_descriptor =
      internal_static_google_cloud_automl_v1_InputConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1_InputConfig_ParamsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_InputConfig_ParamsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_automl_v1_BatchPredictInputConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1_BatchPredictInputConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_BatchPredictInputConfig_descriptor,
        new java.lang.String[] { "GcsSource", "Source", });
    internal_static_google_cloud_automl_v1_DocumentInputConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1_DocumentInputConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_DocumentInputConfig_descriptor,
        new java.lang.String[] { "GcsSource", });
    internal_static_google_cloud_automl_v1_OutputConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1_OutputConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_OutputConfig_descriptor,
        new java.lang.String[] { "GcsDestination", "Destination", });
    internal_static_google_cloud_automl_v1_BatchPredictOutputConfig_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_automl_v1_BatchPredictOutputConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_BatchPredictOutputConfig_descriptor,
        new java.lang.String[] { "GcsDestination", "Destination", });
    internal_static_google_cloud_automl_v1_ModelExportOutputConfig_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_automl_v1_ModelExportOutputConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_ModelExportOutputConfig_descriptor,
        new java.lang.String[] { "GcsDestination", "ModelFormat", "Params", "Destination", });
    internal_static_google_cloud_automl_v1_ModelExportOutputConfig_ParamsEntry_descriptor =
      internal_static_google_cloud_automl_v1_ModelExportOutputConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1_ModelExportOutputConfig_ParamsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_ModelExportOutputConfig_ParamsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_automl_v1_GcsSource_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_automl_v1_GcsSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_GcsSource_descriptor,
        new java.lang.String[] { "InputUris", });
    internal_static_google_cloud_automl_v1_GcsDestination_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_automl_v1_GcsDestination_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_GcsDestination_descriptor,
        new java.lang.String[] { "OutputUriPrefix", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
