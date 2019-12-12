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
// source: google/cloud/automl/v1beta1/image.proto

package com.google.cloud.automl.v1beta1;

public interface ImageObjectDetectionModelDeploymentMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.ImageObjectDetectionModelDeploymentMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Input only. The number of nodes to deploy the model on. A node is an
   * abstraction of a machine resource, which can handle online prediction QPS
   * as given in the model's
   * [qps_per_node][google.cloud.automl.v1beta1.ImageObjectDetectionModelMetadata.qps_per_node].
   * Must be between 1 and 100, inclusive on both ends.
   * </pre>
   *
   * <code>int64 node_count = 1;</code>
   *
   * @return The nodeCount.
   */
  long getNodeCount();
}
