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
// source: google/cloud/automl/v1beta1/tables.proto

package com.google.cloud.automl.v1beta1;

public final class Tables {
  private Tables() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_TargetColumnCorrelationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_TargetColumnCorrelationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TablesModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TablesModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TablesAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TablesAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TablesModelColumnInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TablesModelColumnInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/automl/v1beta1/tables.pro"
          + "to\022\033google.cloud.automl.v1beta1\032\034google/"
          + "api/annotations.proto\0320google/cloud/auto"
          + "ml/v1beta1/classification.proto\032-google/"
          + "cloud/automl/v1beta1/column_spec.proto\032,"
          + "google/cloud/automl/v1beta1/data_items.p"
          + "roto\032,google/cloud/automl/v1beta1/data_s"
          + "tats.proto\032(google/cloud/automl/v1beta1/"
          + "ranges.proto\032*google/cloud/automl/v1beta"
          + "1/temporal.proto\032\034google/protobuf/struct"
          + ".proto\032\037google/protobuf/timestamp.proto\""
          + "\260\003\n\025TablesDatasetMetadata\022\035\n\025primary_tab"
          + "le_spec_id\030\001 \001(\t\022\035\n\025target_column_spec_i"
          + "d\030\002 \001(\t\022\035\n\025weight_column_spec_id\030\003 \001(\t\022\035"
          + "\n\025ml_use_column_spec_id\030\004 \001(\t\022t\n\032target_"
          + "column_correlations\030\006 \003(\0132P.google.cloud"
          + ".automl.v1beta1.TablesDatasetMetadata.Ta"
          + "rgetColumnCorrelationsEntry\0225\n\021stats_upd"
          + "ate_time\030\007 \001(\0132\032.google.protobuf.Timesta"
          + "mp\032n\n\035TargetColumnCorrelationsEntry\022\013\n\003k"
          + "ey\030\001 \001(\t\022<\n\005value\030\002 \001(\0132-.google.cloud.a"
          + "utoml.v1beta1.CorrelationStats:\0028\001\"\226\004\n\023T"
          + "ablesModelMetadata\022-\n#optimization_objec"
          + "tive_recall_value\030\021 \001(\002H\000\0220\n&optimizatio"
          + "n_objective_precision_value\030\022 \001(\002H\000\022C\n\022t"
          + "arget_column_spec\030\002 \001(\0132\'.google.cloud.a"
          + "utoml.v1beta1.ColumnSpec\022K\n\032input_featur"
          + "e_column_specs\030\003 \003(\0132\'.google.cloud.auto"
          + "ml.v1beta1.ColumnSpec\022\036\n\026optimization_ob"
          + "jective\030\004 \001(\t\022T\n\030tables_model_column_inf"
          + "o\030\005 \003(\01322.google.cloud.automl.v1beta1.Ta"
          + "blesModelColumnInfo\022%\n\035train_budget_mill"
          + "i_node_hours\030\006 \001(\003\022#\n\033train_cost_milli_n"
          + "ode_hours\030\007 \001(\003\022\036\n\026disable_early_stoppin"
          + "g\030\014 \001(\010B*\n(additional_optimization_objec"
          + "tive_config\"\345\001\n\020TablesAnnotation\022\r\n\005scor"
          + "e\030\001 \001(\002\022E\n\023prediction_interval\030\004 \001(\0132(.g"
          + "oogle.cloud.automl.v1beta1.DoubleRange\022%"
          + "\n\005value\030\002 \001(\0132\026.google.protobuf.Value\022T\n"
          + "\030tables_model_column_info\030\003 \003(\01322.google"
          + ".cloud.automl.v1beta1.TablesModelColumnI"
          + "nfo\"j\n\025TablesModelColumnInfo\022\030\n\020column_s"
          + "pec_name\030\001 \001(\t\022\033\n\023column_display_name\030\002 "
          + "\001(\t\022\032\n\022feature_importance\030\003 \001(\002B\245\001\n\037com."
          + "google.cloud.automl.v1beta1P\001ZAgoogle.go"
          + "lang.org/genproto/googleapis/cloud/autom"
          + "l/v1beta1;automl\312\002\033Google\\Cloud\\AutoMl\\V"
          + "1beta1\352\002\036Google::Cloud::AutoML::V1beta1b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor(),
              com.google.cloud.automl.v1beta1.ColumnSpecOuterClass.getDescriptor(),
              com.google.cloud.automl.v1beta1.DataItems.getDescriptor(),
              com.google.cloud.automl.v1beta1.DataStatsOuterClass.getDescriptor(),
              com.google.cloud.automl.v1beta1.RangesProto.getDescriptor(),
              com.google.cloud.automl.v1beta1.Temporal.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_descriptor,
            new java.lang.String[] {
              "PrimaryTableSpecId",
              "TargetColumnSpecId",
              "WeightColumnSpecId",
              "MlUseColumnSpecId",
              "TargetColumnCorrelations",
              "StatsUpdateTime",
            });
    internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_TargetColumnCorrelationsEntry_descriptor =
        internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_TargetColumnCorrelationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_TargetColumnCorrelationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_automl_v1beta1_TablesModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1beta1_TablesModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TablesModelMetadata_descriptor,
            new java.lang.String[] {
              "OptimizationObjectiveRecallValue",
              "OptimizationObjectivePrecisionValue",
              "TargetColumnSpec",
              "InputFeatureColumnSpecs",
              "OptimizationObjective",
              "TablesModelColumnInfo",
              "TrainBudgetMilliNodeHours",
              "TrainCostMilliNodeHours",
              "DisableEarlyStopping",
              "AdditionalOptimizationObjectiveConfig",
            });
    internal_static_google_cloud_automl_v1beta1_TablesAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1beta1_TablesAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TablesAnnotation_descriptor,
            new java.lang.String[] {
              "Score", "PredictionInterval", "Value", "TablesModelColumnInfo",
            });
    internal_static_google_cloud_automl_v1beta1_TablesModelColumnInfo_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1beta1_TablesModelColumnInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TablesModelColumnInfo_descriptor,
            new java.lang.String[] {
              "ColumnSpecName", "ColumnDisplayName", "FeatureImportance",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor();
    com.google.cloud.automl.v1beta1.ColumnSpecOuterClass.getDescriptor();
    com.google.cloud.automl.v1beta1.DataItems.getDescriptor();
    com.google.cloud.automl.v1beta1.DataStatsOuterClass.getDescriptor();
    com.google.cloud.automl.v1beta1.RangesProto.getDescriptor();
    com.google.cloud.automl.v1beta1.Temporal.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
