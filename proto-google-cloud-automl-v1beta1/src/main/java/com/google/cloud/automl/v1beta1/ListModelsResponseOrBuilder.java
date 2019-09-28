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
// source: google/cloud/automl/v1beta1/service.proto

package com.google.cloud.automl.v1beta1;

public interface ListModelsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.ListModelsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
   */
  java.util.List<com.google.cloud.automl.v1beta1.Model> getModelList();
  /**
   *
   *
   * <pre>
   * List of models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
   */
  com.google.cloud.automl.v1beta1.Model getModel(int index);
  /**
   *
   *
   * <pre>
   * List of models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
   */
  int getModelCount();
  /**
   *
   *
   * <pre>
   * List of models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
   */
  java.util.List<? extends com.google.cloud.automl.v1beta1.ModelOrBuilder> getModelOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of models in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Model model = 1;</code>
   */
  com.google.cloud.automl.v1beta1.ModelOrBuilder getModelOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListModelsRequest.page_token][google.cloud.automl.v1beta1.ListModelsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListModelsRequest.page_token][google.cloud.automl.v1beta1.ListModelsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
