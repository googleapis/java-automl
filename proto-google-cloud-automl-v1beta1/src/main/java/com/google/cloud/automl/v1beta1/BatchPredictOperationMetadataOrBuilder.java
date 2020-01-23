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
// source: google/cloud/automl/v1beta1/operations.proto

package com.google.cloud.automl.v1beta1;

public interface BatchPredictOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.BatchPredictOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The input config that was given upon starting this
   * batch predict operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BatchPredictInputConfig input_config = 1;</code>
   *
   * @return Whether the inputConfig field is set.
   */
  boolean hasInputConfig();
  /**
   *
   *
   * <pre>
   * Output only. The input config that was given upon starting this
   * batch predict operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BatchPredictInputConfig input_config = 1;</code>
   *
   * @return The inputConfig.
   */
  com.google.cloud.automl.v1beta1.BatchPredictInputConfig getInputConfig();
  /**
   *
   *
   * <pre>
   * Output only. The input config that was given upon starting this
   * batch predict operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BatchPredictInputConfig input_config = 1;</code>
   */
  com.google.cloud.automl.v1beta1.BatchPredictInputConfigOrBuilder getInputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Information further describing this batch predict's output.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.BatchPredictOperationMetadata.BatchPredictOutputInfo output_info = 2;
   * </code>
   *
   * @return Whether the outputInfo field is set.
   */
  boolean hasOutputInfo();
  /**
   *
   *
   * <pre>
   * Output only. Information further describing this batch predict's output.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.BatchPredictOperationMetadata.BatchPredictOutputInfo output_info = 2;
   * </code>
   *
   * @return The outputInfo.
   */
  com.google.cloud.automl.v1beta1.BatchPredictOperationMetadata.BatchPredictOutputInfo
      getOutputInfo();
  /**
   *
   *
   * <pre>
   * Output only. Information further describing this batch predict's output.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.BatchPredictOperationMetadata.BatchPredictOutputInfo output_info = 2;
   * </code>
   */
  com.google.cloud.automl.v1beta1.BatchPredictOperationMetadata.BatchPredictOutputInfoOrBuilder
      getOutputInfoOrBuilder();
}
