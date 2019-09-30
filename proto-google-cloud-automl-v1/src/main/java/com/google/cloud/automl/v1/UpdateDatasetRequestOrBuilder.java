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
// source: google/cloud/automl/v1/service.proto

package com.google.cloud.automl.v1;

public interface UpdateDatasetRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.UpdateDatasetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The dataset which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.Dataset dataset = 1;</code>
   */
  boolean hasDataset();
  /**
   *
   *
   * <pre>
   * The dataset which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.Dataset dataset = 1;</code>
   */
  com.google.cloud.automl.v1.Dataset getDataset();
  /**
   *
   *
   * <pre>
   * The dataset which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.Dataset dataset = 1;</code>
   */
  com.google.cloud.automl.v1.DatasetOrBuilder getDatasetOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
