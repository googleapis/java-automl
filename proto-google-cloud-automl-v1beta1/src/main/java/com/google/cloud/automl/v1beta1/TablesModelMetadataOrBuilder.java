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
// source: google/cloud/automl/v1beta1/tables.proto

package com.google.cloud.automl.v1beta1;

public interface TablesModelMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.TablesModelMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required when optimization_objective is "MAXIMIZE_PRECISION_AT_RECALL".
   * Must be between 0 and 1, inclusive.
   * </pre>
   *
   * <code>float optimization_objective_recall_value = 17;</code>
   */
  float getOptimizationObjectiveRecallValue();

  /**
   *
   *
   * <pre>
   * Required when optimization_objective is "MAXIMIZE_RECALL_AT_PRECISION".
   * Must be between 0 and 1, inclusive.
   * </pre>
   *
   * <code>float optimization_objective_precision_value = 18;</code>
   */
  float getOptimizationObjectivePrecisionValue();

  /**
   *
   *
   * <pre>
   * Column spec of the dataset's primary table's column the model is
   * predicting. Snapshotted when model creation started.
   * Only 3 fields are used:
   * name - May be set on CreateModel, if it's not then the ColumnSpec
   *        corresponding to the current target_column_spec_id of the dataset
   *        the model is trained from is used.
   *        If neither is set, CreateModel will error.
   * display_name - Output only.
   * data_type - Output only.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ColumnSpec target_column_spec = 2;</code>
   */
  boolean hasTargetColumnSpec();
  /**
   *
   *
   * <pre>
   * Column spec of the dataset's primary table's column the model is
   * predicting. Snapshotted when model creation started.
   * Only 3 fields are used:
   * name - May be set on CreateModel, if it's not then the ColumnSpec
   *        corresponding to the current target_column_spec_id of the dataset
   *        the model is trained from is used.
   *        If neither is set, CreateModel will error.
   * display_name - Output only.
   * data_type - Output only.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ColumnSpec target_column_spec = 2;</code>
   */
  com.google.cloud.automl.v1beta1.ColumnSpec getTargetColumnSpec();
  /**
   *
   *
   * <pre>
   * Column spec of the dataset's primary table's column the model is
   * predicting. Snapshotted when model creation started.
   * Only 3 fields are used:
   * name - May be set on CreateModel, if it's not then the ColumnSpec
   *        corresponding to the current target_column_spec_id of the dataset
   *        the model is trained from is used.
   *        If neither is set, CreateModel will error.
   * display_name - Output only.
   * data_type - Output only.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ColumnSpec target_column_spec = 2;</code>
   */
  com.google.cloud.automl.v1beta1.ColumnSpecOrBuilder getTargetColumnSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Column specs of the dataset's primary table's columns, on which
   * the model is trained and which are used as the input for predictions.
   * The
   * [target_column][google.cloud.automl.v1beta1.TablesModelMetadata.target_column_spec]
   * as well as, according to dataset's state upon model creation,
   * [weight_column][google.cloud.automl.v1beta1.TablesDatasetMetadata.weight_column_spec_id],
   * and
   * [ml_use_column][google.cloud.automl.v1beta1.TablesDatasetMetadata.ml_use_column_spec_id]
   * must never be included here.
   * Only 3 fields are used:
   * * name - May be set on CreateModel, if set only the columns specified are
   *   used, otherwise all primary table's columns (except the ones listed
   *   above) are used for the training and prediction input.
   * * display_name - Output only.
   * * data_type - Output only.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.ColumnSpec input_feature_column_specs = 3;</code>
   */
  java.util.List<com.google.cloud.automl.v1beta1.ColumnSpec> getInputFeatureColumnSpecsList();
  /**
   *
   *
   * <pre>
   * Column specs of the dataset's primary table's columns, on which
   * the model is trained and which are used as the input for predictions.
   * The
   * [target_column][google.cloud.automl.v1beta1.TablesModelMetadata.target_column_spec]
   * as well as, according to dataset's state upon model creation,
   * [weight_column][google.cloud.automl.v1beta1.TablesDatasetMetadata.weight_column_spec_id],
   * and
   * [ml_use_column][google.cloud.automl.v1beta1.TablesDatasetMetadata.ml_use_column_spec_id]
   * must never be included here.
   * Only 3 fields are used:
   * * name - May be set on CreateModel, if set only the columns specified are
   *   used, otherwise all primary table's columns (except the ones listed
   *   above) are used for the training and prediction input.
   * * display_name - Output only.
   * * data_type - Output only.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.ColumnSpec input_feature_column_specs = 3;</code>
   */
  com.google.cloud.automl.v1beta1.ColumnSpec getInputFeatureColumnSpecs(int index);
  /**
   *
   *
   * <pre>
   * Column specs of the dataset's primary table's columns, on which
   * the model is trained and which are used as the input for predictions.
   * The
   * [target_column][google.cloud.automl.v1beta1.TablesModelMetadata.target_column_spec]
   * as well as, according to dataset's state upon model creation,
   * [weight_column][google.cloud.automl.v1beta1.TablesDatasetMetadata.weight_column_spec_id],
   * and
   * [ml_use_column][google.cloud.automl.v1beta1.TablesDatasetMetadata.ml_use_column_spec_id]
   * must never be included here.
   * Only 3 fields are used:
   * * name - May be set on CreateModel, if set only the columns specified are
   *   used, otherwise all primary table's columns (except the ones listed
   *   above) are used for the training and prediction input.
   * * display_name - Output only.
   * * data_type - Output only.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.ColumnSpec input_feature_column_specs = 3;</code>
   */
  int getInputFeatureColumnSpecsCount();
  /**
   *
   *
   * <pre>
   * Column specs of the dataset's primary table's columns, on which
   * the model is trained and which are used as the input for predictions.
   * The
   * [target_column][google.cloud.automl.v1beta1.TablesModelMetadata.target_column_spec]
   * as well as, according to dataset's state upon model creation,
   * [weight_column][google.cloud.automl.v1beta1.TablesDatasetMetadata.weight_column_spec_id],
   * and
   * [ml_use_column][google.cloud.automl.v1beta1.TablesDatasetMetadata.ml_use_column_spec_id]
   * must never be included here.
   * Only 3 fields are used:
   * * name - May be set on CreateModel, if set only the columns specified are
   *   used, otherwise all primary table's columns (except the ones listed
   *   above) are used for the training and prediction input.
   * * display_name - Output only.
   * * data_type - Output only.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.ColumnSpec input_feature_column_specs = 3;</code>
   */
  java.util.List<? extends com.google.cloud.automl.v1beta1.ColumnSpecOrBuilder>
      getInputFeatureColumnSpecsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Column specs of the dataset's primary table's columns, on which
   * the model is trained and which are used as the input for predictions.
   * The
   * [target_column][google.cloud.automl.v1beta1.TablesModelMetadata.target_column_spec]
   * as well as, according to dataset's state upon model creation,
   * [weight_column][google.cloud.automl.v1beta1.TablesDatasetMetadata.weight_column_spec_id],
   * and
   * [ml_use_column][google.cloud.automl.v1beta1.TablesDatasetMetadata.ml_use_column_spec_id]
   * must never be included here.
   * Only 3 fields are used:
   * * name - May be set on CreateModel, if set only the columns specified are
   *   used, otherwise all primary table's columns (except the ones listed
   *   above) are used for the training and prediction input.
   * * display_name - Output only.
   * * data_type - Output only.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.ColumnSpec input_feature_column_specs = 3;</code>
   */
  com.google.cloud.automl.v1beta1.ColumnSpecOrBuilder getInputFeatureColumnSpecsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Objective function the model is optimizing towards. The training process
   * creates a model that maximizes/minimizes the value of the objective
   * function over the validation set.
   * The supported optimization objectives depend on the prediction type.
   * If the field is not set, a default objective function is used.
   * CLASSIFICATION_BINARY:
   *   "MAXIMIZE_AU_ROC" (default) - Maximize the area under the receiver
   *                                 operating characteristic (ROC) curve.
   *   "MINIMIZE_LOG_LOSS" - Minimize log loss.
   *   "MAXIMIZE_AU_PRC" - Maximize the area under the precision-recall curve.
   *   "MAXIMIZE_PRECISION_AT_RECALL" - Maximize precision for a specified
   *                                   recall value.
   *   "MAXIMIZE_RECALL_AT_PRECISION" - Maximize recall for a specified
   *                                    precision value.
   * CLASSIFICATION_MULTI_CLASS :
   *   "MINIMIZE_LOG_LOSS" (default) - Minimize log loss.
   * REGRESSION:
   *   "MINIMIZE_RMSE" (default) - Minimize root-mean-squared error (RMSE).
   *   "MINIMIZE_MAE" - Minimize mean-absolute error (MAE).
   *   "MINIMIZE_RMSLE" - Minimize root-mean-squared log error (RMSLE).
   * </pre>
   *
   * <code>string optimization_objective = 4;</code>
   */
  java.lang.String getOptimizationObjective();
  /**
   *
   *
   * <pre>
   * Objective function the model is optimizing towards. The training process
   * creates a model that maximizes/minimizes the value of the objective
   * function over the validation set.
   * The supported optimization objectives depend on the prediction type.
   * If the field is not set, a default objective function is used.
   * CLASSIFICATION_BINARY:
   *   "MAXIMIZE_AU_ROC" (default) - Maximize the area under the receiver
   *                                 operating characteristic (ROC) curve.
   *   "MINIMIZE_LOG_LOSS" - Minimize log loss.
   *   "MAXIMIZE_AU_PRC" - Maximize the area under the precision-recall curve.
   *   "MAXIMIZE_PRECISION_AT_RECALL" - Maximize precision for a specified
   *                                   recall value.
   *   "MAXIMIZE_RECALL_AT_PRECISION" - Maximize recall for a specified
   *                                    precision value.
   * CLASSIFICATION_MULTI_CLASS :
   *   "MINIMIZE_LOG_LOSS" (default) - Minimize log loss.
   * REGRESSION:
   *   "MINIMIZE_RMSE" (default) - Minimize root-mean-squared error (RMSE).
   *   "MINIMIZE_MAE" - Minimize mean-absolute error (MAE).
   *   "MINIMIZE_RMSLE" - Minimize root-mean-squared log error (RMSLE).
   * </pre>
   *
   * <code>string optimization_objective = 4;</code>
   */
  com.google.protobuf.ByteString getOptimizationObjectiveBytes();

  /**
   *
   *
   * <pre>
   * Output only. Auxiliary information for each of the
   * input_feature_column_specs with respect to this particular model.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.TablesModelColumnInfo tables_model_column_info = 5;
   * </code>
   */
  java.util.List<com.google.cloud.automl.v1beta1.TablesModelColumnInfo>
      getTablesModelColumnInfoList();
  /**
   *
   *
   * <pre>
   * Output only. Auxiliary information for each of the
   * input_feature_column_specs with respect to this particular model.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.TablesModelColumnInfo tables_model_column_info = 5;
   * </code>
   */
  com.google.cloud.automl.v1beta1.TablesModelColumnInfo getTablesModelColumnInfo(int index);
  /**
   *
   *
   * <pre>
   * Output only. Auxiliary information for each of the
   * input_feature_column_specs with respect to this particular model.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.TablesModelColumnInfo tables_model_column_info = 5;
   * </code>
   */
  int getTablesModelColumnInfoCount();
  /**
   *
   *
   * <pre>
   * Output only. Auxiliary information for each of the
   * input_feature_column_specs with respect to this particular model.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.TablesModelColumnInfo tables_model_column_info = 5;
   * </code>
   */
  java.util.List<? extends com.google.cloud.automl.v1beta1.TablesModelColumnInfoOrBuilder>
      getTablesModelColumnInfoOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Auxiliary information for each of the
   * input_feature_column_specs with respect to this particular model.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.TablesModelColumnInfo tables_model_column_info = 5;
   * </code>
   */
  com.google.cloud.automl.v1beta1.TablesModelColumnInfoOrBuilder getTablesModelColumnInfoOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Required. The train budget of creating this model, expressed in milli node
   * hours i.e. 1,000 value in this field means 1 node hour.
   * The training cost of the model will not exceed this budget. The final cost
   * will be attempted to be close to the budget, though may end up being (even)
   * noticeably smaller - at the backend's discretion. This especially may
   * happen when further model training ceases to provide any improvements.
   * If the budget is set to a value known to be insufficient to train a
   * model for the given dataset, the training won't be attempted and
   * will error.
   * The train budget must be between 1,000 and 72,000 milli node hours,
   * inclusive.
   * </pre>
   *
   * <code>int64 train_budget_milli_node_hours = 6;</code>
   */
  long getTrainBudgetMilliNodeHours();

  /**
   *
   *
   * <pre>
   * Output only. The actual training cost of the model, expressed in milli
   * node hours, i.e. 1,000 value in this field means 1 node hour. Guaranteed
   * to not exceed the train budget.
   * </pre>
   *
   * <code>int64 train_cost_milli_node_hours = 7;</code>
   */
  long getTrainCostMilliNodeHours();

  /**
   *
   *
   * <pre>
   * Use the entire training budget. This disables the early stopping feature.
   * By default, the early stopping feature is enabled, which means that AutoML
   * Tables might stop training before the entire training budget has been used.
   * </pre>
   *
   * <code>bool disable_early_stopping = 12;</code>
   */
  boolean getDisableEarlyStopping();

  public com.google.cloud.automl.v1beta1.TablesModelMetadata
          .AdditionalOptimizationObjectiveConfigCase
      getAdditionalOptimizationObjectiveConfigCase();
}
