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
// source: google/cloud/automl/v1beta1/text_segment.proto

package com.google.cloud.automl.v1beta1;

public interface TextSegmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.TextSegment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The content of the TextSegment.
   * </pre>
   *
   * <code>string content = 3;</code>
   *
   * @return The content.
   */
  java.lang.String getContent();
  /**
   *
   *
   * <pre>
   * Output only. The content of the TextSegment.
   * </pre>
   *
   * <code>string content = 3;</code>
   *
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString getContentBytes();

  /**
   *
   *
   * <pre>
   * Required. Zero-based character index of the first character of the text
   * segment (counting characters from the beginning of the text).
   * </pre>
   *
   * <code>int64 start_offset = 1;</code>
   *
   * @return The startOffset.
   */
  long getStartOffset();

  /**
   *
   *
   * <pre>
   * Required. Zero-based character index of the first character past the end of
   * the text segment (counting character from the beginning of the text).
   * The character at the end_offset is NOT included in the text segment.
   * </pre>
   *
   * <code>int64 end_offset = 2;</code>
   *
   * @return The endOffset.
   */
  long getEndOffset();
}
