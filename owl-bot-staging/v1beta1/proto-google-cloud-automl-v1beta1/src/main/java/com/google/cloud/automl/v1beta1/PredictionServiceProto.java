// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/prediction_service.proto

package com.google.cloud.automl.v1beta1;

public final class PredictionServiceProto {
  private PredictionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_PredictRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_PredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_PredictRequest_ParamsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_PredictRequest_ParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_PredictResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_PredictResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_PredictResponse_MetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_PredictResponse_MetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_ParamsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_ParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_BatchPredictResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_BatchPredictResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_BatchPredictResult_MetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_BatchPredictResult_MetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/automl/v1beta1/prediction" +
      "_service.proto\022\033google.cloud.automl.v1be" +
      "ta1\032\034google/api/annotations.proto\032\027googl" +
      "e/api/client.proto\032\037google/api/field_beh" +
      "avior.proto\032\031google/api/resource.proto\0324" +
      "google/cloud/automl/v1beta1/annotation_p" +
      "ayload.proto\032,google/cloud/automl/v1beta" +
      "1/data_items.proto\032$google/cloud/automl/" +
      "v1beta1/io.proto\032,google/cloud/automl/v1" +
      "beta1/operations.proto\032#google/longrunni" +
      "ng/operations.proto\"\376\001\n\016PredictRequest\0221" +
      "\n\004name\030\001 \001(\tB#\340A\002\372A\035\n\033automl.googleapis." +
      "com/Model\022A\n\007payload\030\002 \001(\0132+.google.clou" +
      "d.automl.v1beta1.ExamplePayloadB\003\340A\002\022G\n\006" +
      "params\030\003 \003(\01327.google.cloud.automl.v1bet" +
      "a1.PredictRequest.ParamsEntry\032-\n\013ParamsE" +
      "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\232\002\n" +
      "\017PredictResponse\022?\n\007payload\030\001 \003(\0132..goog" +
      "le.cloud.automl.v1beta1.AnnotationPayloa" +
      "d\022G\n\022preprocessed_input\030\003 \001(\0132+.google.c" +
      "loud.automl.v1beta1.ExamplePayload\022L\n\010me" +
      "tadata\030\002 \003(\0132:.google.cloud.automl.v1bet" +
      "a1.PredictResponse.MetadataEntry\032/\n\rMeta" +
      "dataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028" +
      "\001\"\356\002\n\023BatchPredictRequest\0221\n\004name\030\001 \001(\tB" +
      "#\340A\002\372A\035\n\033automl.googleapis.com/Model\022O\n\014" +
      "input_config\030\003 \001(\01324.google.cloud.automl" +
      ".v1beta1.BatchPredictInputConfigB\003\340A\002\022Q\n" +
      "\routput_config\030\004 \001(\01325.google.cloud.auto" +
      "ml.v1beta1.BatchPredictOutputConfigB\003\340A\002" +
      "\022Q\n\006params\030\005 \003(\0132<.google.cloud.automl.v" +
      "1beta1.BatchPredictRequest.ParamsEntryB\003" +
      "\340A\002\032-\n\013ParamsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value" +
      "\030\002 \001(\t:\0028\001\"\226\001\n\022BatchPredictResult\022O\n\010met" +
      "adata\030\001 \003(\0132=.google.cloud.automl.v1beta" +
      "1.BatchPredictResult.MetadataEntry\032/\n\rMe" +
      "tadataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:" +
      "\0028\0012\236\004\n\021PredictionService\022\276\001\n\007Predict\022+." +
      "google.cloud.automl.v1beta1.PredictReque" +
      "st\032,.google.cloud.automl.v1beta1.Predict" +
      "Response\"X\202\323\344\223\002<\"7/v1beta1/{name=project" +
      "s/*/locations/*/models/*}:predict:\001*\332A\023n" +
      "ame,payload,params\022\374\001\n\014BatchPredict\0220.go" +
      "ogle.cloud.automl.v1beta1.BatchPredictRe" +
      "quest\032\035.google.longrunning.Operation\"\232\001\202" +
      "\323\344\223\002A\"</v1beta1/{name=projects/*/locatio" +
      "ns/*/models/*}:batchPredict:\001*\332A&name,in" +
      "put_config,output_config,params\312A\'\n\022Batc" +
      "hPredictResult\022\021OperationMetadata\032I\312A\025au" +
      "toml.googleapis.com\322A.https://www.google" +
      "apis.com/auth/cloud-platformB\275\001\n\037com.goo" +
      "gle.cloud.automl.v1beta1B\026PredictionServ" +
      "iceProtoP\001ZAgoogle.golang.org/genproto/g" +
      "oogleapis/cloud/automl/v1beta1;automl\312\002\033" +
      "Google\\Cloud\\AutoMl\\V1beta1\352\002\036Google::Cl" +
      "oud::AutoML::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.AnnotationPayloadOuterClass.getDescriptor(),
          com.google.cloud.automl.v1beta1.DataItems.getDescriptor(),
          com.google.cloud.automl.v1beta1.Io.getDescriptor(),
          com.google.cloud.automl.v1beta1.Operations.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
        });
    internal_static_google_cloud_automl_v1beta1_PredictRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_PredictRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_PredictRequest_descriptor,
        new java.lang.String[] { "Name", "Payload", "Params", });
    internal_static_google_cloud_automl_v1beta1_PredictRequest_ParamsEntry_descriptor =
      internal_static_google_cloud_automl_v1beta1_PredictRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_PredictRequest_ParamsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_PredictRequest_ParamsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_automl_v1beta1_PredictResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1beta1_PredictResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_PredictResponse_descriptor,
        new java.lang.String[] { "Payload", "PreprocessedInput", "Metadata", });
    internal_static_google_cloud_automl_v1beta1_PredictResponse_MetadataEntry_descriptor =
      internal_static_google_cloud_automl_v1beta1_PredictResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_PredictResponse_MetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_PredictResponse_MetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_descriptor,
        new java.lang.String[] { "Name", "InputConfig", "OutputConfig", "Params", });
    internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_ParamsEntry_descriptor =
      internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_ParamsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_BatchPredictRequest_ParamsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_automl_v1beta1_BatchPredictResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1beta1_BatchPredictResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_BatchPredictResult_descriptor,
        new java.lang.String[] { "Metadata", });
    internal_static_google_cloud_automl_v1beta1_BatchPredictResult_MetadataEntry_descriptor =
      internal_static_google_cloud_automl_v1beta1_BatchPredictResult_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_BatchPredictResult_MetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_BatchPredictResult_MetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.automl.v1beta1.AnnotationPayloadOuterClass.getDescriptor();
    com.google.cloud.automl.v1beta1.DataItems.getDescriptor();
    com.google.cloud.automl.v1beta1.Io.getDescriptor();
    com.google.cloud.automl.v1beta1.Operations.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
