// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/data_items.proto

package com.google.cloud.automl.v1beta1;

public final class DataItems {
  private DataItems() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_Image_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_Image_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_TextSnippet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextSnippet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_DocumentDimensions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_DocumentDimensions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_Document_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_Document_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_Document_Layout_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_Document_Layout_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_Row_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_Row_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_ExamplePayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ExamplePayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/automl/v1beta1/data_items" +
      ".proto\022\033google.cloud.automl.v1beta1\032*goo" +
      "gle/cloud/automl/v1beta1/geometry.proto\032" +
      "$google/cloud/automl/v1beta1/io.proto\032*g" +
      "oogle/cloud/automl/v1beta1/temporal.prot" +
      "o\032.google/cloud/automl/v1beta1/text_segm" +
      "ent.proto\032\034google/protobuf/struct.proto\"" +
      "\177\n\005Image\022\025\n\013image_bytes\030\001 \001(\014H\000\022@\n\014input" +
      "_config\030\006 \001(\0132(.google.cloud.automl.v1be" +
      "ta1.InputConfigH\000\022\025\n\rthumbnail_uri\030\004 \001(\t" +
      "B\006\n\004data\"F\n\013TextSnippet\022\017\n\007content\030\001 \001(\t" +
      "\022\021\n\tmime_type\030\002 \001(\t\022\023\n\013content_uri\030\004 \001(\t" +
      "\"\357\001\n\022DocumentDimensions\022S\n\004unit\030\001 \001(\0162E." +
      "google.cloud.automl.v1beta1.DocumentDime" +
      "nsions.DocumentDimensionUnit\022\r\n\005width\030\002 " +
      "\001(\002\022\016\n\006height\030\003 \001(\002\"e\n\025DocumentDimension" +
      "Unit\022\'\n#DOCUMENT_DIMENSION_UNIT_UNSPECIF" +
      "IED\020\000\022\010\n\004INCH\020\001\022\016\n\nCENTIMETER\020\002\022\t\n\005POINT" +
      "\020\003\"\371\005\n\010Document\022F\n\014input_config\030\001 \001(\01320." +
      "google.cloud.automl.v1beta1.DocumentInpu" +
      "tConfig\022?\n\rdocument_text\030\002 \001(\0132(.google." +
      "cloud.automl.v1beta1.TextSnippet\022<\n\006layo" +
      "ut\030\003 \003(\0132,.google.cloud.automl.v1beta1.D" +
      "ocument.Layout\022L\n\023document_dimensions\030\004 " +
      "\001(\0132/.google.cloud.automl.v1beta1.Docume" +
      "ntDimensions\022\022\n\npage_count\030\005 \001(\005\032\303\003\n\006Lay" +
      "out\022>\n\014text_segment\030\001 \001(\0132(.google.cloud" +
      ".automl.v1beta1.TextSegment\022\023\n\013page_numb" +
      "er\030\002 \001(\005\022@\n\rbounding_poly\030\003 \001(\0132).google" +
      ".cloud.automl.v1beta1.BoundingPoly\022W\n\021te" +
      "xt_segment_type\030\004 \001(\0162<.google.cloud.aut" +
      "oml.v1beta1.Document.Layout.TextSegmentT" +
      "ype\"\310\001\n\017TextSegmentType\022!\n\035TEXT_SEGMENT_" +
      "TYPE_UNSPECIFIED\020\000\022\t\n\005TOKEN\020\001\022\r\n\tPARAGRA" +
      "PH\020\002\022\016\n\nFORM_FIELD\020\003\022\023\n\017FORM_FIELD_NAME\020" +
      "\004\022\027\n\023FORM_FIELD_CONTENTS\020\005\022\t\n\005TABLE\020\006\022\020\n" +
      "\014TABLE_HEADER\020\007\022\r\n\tTABLE_ROW\020\010\022\016\n\nTABLE_" +
      "CELL\020\t\"F\n\003Row\022\027\n\017column_spec_ids\030\002 \003(\t\022&" +
      "\n\006values\030\003 \003(\0132\026.google.protobuf.Value\"\376" +
      "\001\n\016ExamplePayload\0223\n\005image\030\001 \001(\0132\".googl" +
      "e.cloud.automl.v1beta1.ImageH\000\022@\n\014text_s" +
      "nippet\030\002 \001(\0132(.google.cloud.automl.v1bet" +
      "a1.TextSnippetH\000\0229\n\010document\030\004 \001(\0132%.goo" +
      "gle.cloud.automl.v1beta1.DocumentH\000\022/\n\003r" +
      "ow\030\003 \001(\0132 .google.cloud.automl.v1beta1.R" +
      "owH\000B\t\n\007payloadB\233\001\n\037com.google.cloud.aut" +
      "oml.v1beta1P\001Z7cloud.google.com/go/autom" +
      "l/apiv1beta1/automlpb;automlpb\312\002\033Google\\" +
      "Cloud\\AutoMl\\V1beta1\352\002\036Google::Cloud::Au" +
      "toML::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.automl.v1beta1.Geometry.getDescriptor(),
          com.google.cloud.automl.v1beta1.Io.getDescriptor(),
          com.google.cloud.automl.v1beta1.Temporal.getDescriptor(),
          com.google.cloud.automl.v1beta1.TextSegmentProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_cloud_automl_v1beta1_Image_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_Image_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_Image_descriptor,
        new java.lang.String[] { "ImageBytes", "InputConfig", "ThumbnailUri", "Data", });
    internal_static_google_cloud_automl_v1beta1_TextSnippet_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1beta1_TextSnippet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_TextSnippet_descriptor,
        new java.lang.String[] { "Content", "MimeType", "ContentUri", });
    internal_static_google_cloud_automl_v1beta1_DocumentDimensions_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1beta1_DocumentDimensions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_DocumentDimensions_descriptor,
        new java.lang.String[] { "Unit", "Width", "Height", });
    internal_static_google_cloud_automl_v1beta1_Document_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1beta1_Document_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_Document_descriptor,
        new java.lang.String[] { "InputConfig", "DocumentText", "Layout", "DocumentDimensions", "PageCount", });
    internal_static_google_cloud_automl_v1beta1_Document_Layout_descriptor =
      internal_static_google_cloud_automl_v1beta1_Document_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_Document_Layout_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_Document_Layout_descriptor,
        new java.lang.String[] { "TextSegment", "PageNumber", "BoundingPoly", "TextSegmentType", });
    internal_static_google_cloud_automl_v1beta1_Row_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_automl_v1beta1_Row_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_Row_descriptor,
        new java.lang.String[] { "ColumnSpecIds", "Values", });
    internal_static_google_cloud_automl_v1beta1_ExamplePayload_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_automl_v1beta1_ExamplePayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_ExamplePayload_descriptor,
        new java.lang.String[] { "Image", "TextSnippet", "Document", "Row", "Payload", });
    com.google.cloud.automl.v1beta1.Geometry.getDescriptor();
    com.google.cloud.automl.v1beta1.Io.getDescriptor();
    com.google.cloud.automl.v1beta1.Temporal.getDescriptor();
    com.google.cloud.automl.v1beta1.TextSegmentProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
