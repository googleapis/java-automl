// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1/geometry.proto

package com.google.cloud.automl.v1;

public final class Geometry {
  private Geometry() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_NormalizedVertex_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_NormalizedVertex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1_BoundingPoly_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_BoundingPoly_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/automl/v1/geometry.proto\022" +
      "\026google.cloud.automl.v1\"(\n\020NormalizedVer" +
      "tex\022\t\n\001x\030\001 \001(\002\022\t\n\001y\030\002 \001(\002\"U\n\014BoundingPol" +
      "y\022E\n\023normalized_vertices\030\002 \003(\0132(.google." +
      "cloud.automl.v1.NormalizedVertexB\252\001\n\032com" +
      ".google.cloud.automl.v1P\001Z<google.golang" +
      ".org/genproto/googleapis/cloud/automl/v1" +
      ";automl\252\002\026Google.Cloud.AutoML.V1\312\002\026Googl" +
      "e\\Cloud\\AutoMl\\V1\352\002\031Google::Cloud::AutoM" +
      "L::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_automl_v1_NormalizedVertex_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_NormalizedVertex_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_NormalizedVertex_descriptor,
        new java.lang.String[] { "X", "Y", });
    internal_static_google_cloud_automl_v1_BoundingPoly_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1_BoundingPoly_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1_BoundingPoly_descriptor,
        new java.lang.String[] { "NormalizedVertices", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
