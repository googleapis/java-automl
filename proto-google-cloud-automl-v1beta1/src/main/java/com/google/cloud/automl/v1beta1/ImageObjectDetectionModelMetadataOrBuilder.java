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
// source: google/cloud/automl/v1beta1/image.proto

package com.google.cloud.automl.v1beta1;

public interface ImageObjectDetectionModelMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.ImageObjectDetectionModelMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Type of the model. The available values are:
   * *   `cloud-high-accuracy-1` - (default) A model to be used via prediction
   *               calls to AutoML API. Expected to have a higher latency, but
   *               should also have a higher prediction quality than other
   *               models.
   * *   `cloud-low-latency-1` -  A model to be used via prediction
   *               calls to AutoML API. Expected to have low latency, but may
   *               have lower prediction quality than other models.
   * </pre>
   *
   * <code>string model_type = 1;</code>
   *
   * @return The modelType.
   */
  java.lang.String getModelType();
  /**
   *
   *
   * <pre>
   * Optional. Type of the model. The available values are:
   * *   `cloud-high-accuracy-1` - (default) A model to be used via prediction
   *               calls to AutoML API. Expected to have a higher latency, but
   *               should also have a higher prediction quality than other
   *               models.
   * *   `cloud-low-latency-1` -  A model to be used via prediction
   *               calls to AutoML API. Expected to have low latency, but may
   *               have lower prediction quality than other models.
   * </pre>
   *
   * <code>string model_type = 1;</code>
   *
   * @return The bytes for modelType.
   */
  com.google.protobuf.ByteString getModelTypeBytes();

  /**
   *
   *
   * <pre>
   * Output only. The number of nodes this model is deployed on. A node is an
   * abstraction of a machine resource, which can handle online prediction QPS
   * as given in the qps_per_node field.
   * </pre>
   *
   * <code>int64 node_count = 3;</code>
   *
   * @return The nodeCount.
   */
  long getNodeCount();

  /**
   *
   *
   * <pre>
   * Output only. An approximate number of online prediction QPS that can
   * be supported by this model per each node on which it is deployed.
   * </pre>
   *
   * <code>double node_qps = 4;</code>
   *
   * @return The nodeQps.
   */
  double getNodeQps();

  /**
   *
   *
   * <pre>
   * Output only. The reason that this create model operation stopped,
   * e.g. `BUDGET_REACHED`, `MODEL_CONVERGED`.
   * </pre>
   *
   * <code>string stop_reason = 5;</code>
   *
   * @return The stopReason.
   */
  java.lang.String getStopReason();
  /**
   *
   *
   * <pre>
   * Output only. The reason that this create model operation stopped,
   * e.g. `BUDGET_REACHED`, `MODEL_CONVERGED`.
   * </pre>
   *
   * <code>string stop_reason = 5;</code>
   *
   * @return The bytes for stopReason.
   */
  com.google.protobuf.ByteString getStopReasonBytes();

  /**
   *
   *
   * <pre>
   * The train budget of creating this model, expressed in milli node
   * hours i.e. 1,000 value in this field means 1 node hour. The actual
   * `train_cost` will be equal or less than this value. If further model
   * training ceases to provide any improvements, it will stop without using
   * full budget and the stop_reason will be `MODEL_CONVERGED`.
   * Note, node_hour  = actual_hour * number_of_nodes_invovled.
   * For model type `cloud-high-accuracy-1`(default) and `cloud-low-latency-1`,
   * the train budget must be between 20,000 and 900,000 milli node hours,
   * inclusive. The default value is 216, 000 which represents one day in
   * wall time.
   * For model type `mobile-low-latency-1`, `mobile-versatile-1`,
   * `mobile-high-accuracy-1`, `mobile-core-ml-low-latency-1`,
   * `mobile-core-ml-versatile-1`, `mobile-core-ml-high-accuracy-1`, the train
   * budget must be between 1,000 and 100,000 milli node hours, inclusive.
   * The default value is 24, 000 which represents one day in wall time.
   * </pre>
   *
   * <code>int64 train_budget_milli_node_hours = 6;</code>
   *
   * @return The trainBudgetMilliNodeHours.
   */
  long getTrainBudgetMilliNodeHours();

  /**
   *
   *
   * <pre>
   * Output only. The actual train cost of creating this model, expressed in
   * milli node hours, i.e. 1,000 value in this field means 1 node hour.
   * Guaranteed to not exceed the train budget.
   * </pre>
   *
   * <code>int64 train_cost_milli_node_hours = 7;</code>
   *
   * @return The trainCostMilliNodeHours.
   */
  long getTrainCostMilliNodeHours();
}
