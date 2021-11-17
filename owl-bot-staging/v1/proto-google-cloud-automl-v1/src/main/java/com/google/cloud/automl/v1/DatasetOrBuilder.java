// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1/dataset.proto

package com.google.cloud.automl.v1;

public interface DatasetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.Dataset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Metadata for a dataset used for translation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TranslationDatasetMetadata translation_dataset_metadata = 23;</code>
   * @return Whether the translationDatasetMetadata field is set.
   */
  boolean hasTranslationDatasetMetadata();
  /**
   * <pre>
   * Metadata for a dataset used for translation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TranslationDatasetMetadata translation_dataset_metadata = 23;</code>
   * @return The translationDatasetMetadata.
   */
  com.google.cloud.automl.v1.TranslationDatasetMetadata getTranslationDatasetMetadata();
  /**
   * <pre>
   * Metadata for a dataset used for translation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TranslationDatasetMetadata translation_dataset_metadata = 23;</code>
   */
  com.google.cloud.automl.v1.TranslationDatasetMetadataOrBuilder getTranslationDatasetMetadataOrBuilder();

  /**
   * <pre>
   * Metadata for a dataset used for image classification.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ImageClassificationDatasetMetadata image_classification_dataset_metadata = 24;</code>
   * @return Whether the imageClassificationDatasetMetadata field is set.
   */
  boolean hasImageClassificationDatasetMetadata();
  /**
   * <pre>
   * Metadata for a dataset used for image classification.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ImageClassificationDatasetMetadata image_classification_dataset_metadata = 24;</code>
   * @return The imageClassificationDatasetMetadata.
   */
  com.google.cloud.automl.v1.ImageClassificationDatasetMetadata getImageClassificationDatasetMetadata();
  /**
   * <pre>
   * Metadata for a dataset used for image classification.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ImageClassificationDatasetMetadata image_classification_dataset_metadata = 24;</code>
   */
  com.google.cloud.automl.v1.ImageClassificationDatasetMetadataOrBuilder getImageClassificationDatasetMetadataOrBuilder();

  /**
   * <pre>
   * Metadata for a dataset used for text classification.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextClassificationDatasetMetadata text_classification_dataset_metadata = 25;</code>
   * @return Whether the textClassificationDatasetMetadata field is set.
   */
  boolean hasTextClassificationDatasetMetadata();
  /**
   * <pre>
   * Metadata for a dataset used for text classification.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextClassificationDatasetMetadata text_classification_dataset_metadata = 25;</code>
   * @return The textClassificationDatasetMetadata.
   */
  com.google.cloud.automl.v1.TextClassificationDatasetMetadata getTextClassificationDatasetMetadata();
  /**
   * <pre>
   * Metadata for a dataset used for text classification.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextClassificationDatasetMetadata text_classification_dataset_metadata = 25;</code>
   */
  com.google.cloud.automl.v1.TextClassificationDatasetMetadataOrBuilder getTextClassificationDatasetMetadataOrBuilder();

  /**
   * <pre>
   * Metadata for a dataset used for image object detection.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ImageObjectDetectionDatasetMetadata image_object_detection_dataset_metadata = 26;</code>
   * @return Whether the imageObjectDetectionDatasetMetadata field is set.
   */
  boolean hasImageObjectDetectionDatasetMetadata();
  /**
   * <pre>
   * Metadata for a dataset used for image object detection.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ImageObjectDetectionDatasetMetadata image_object_detection_dataset_metadata = 26;</code>
   * @return The imageObjectDetectionDatasetMetadata.
   */
  com.google.cloud.automl.v1.ImageObjectDetectionDatasetMetadata getImageObjectDetectionDatasetMetadata();
  /**
   * <pre>
   * Metadata for a dataset used for image object detection.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ImageObjectDetectionDatasetMetadata image_object_detection_dataset_metadata = 26;</code>
   */
  com.google.cloud.automl.v1.ImageObjectDetectionDatasetMetadataOrBuilder getImageObjectDetectionDatasetMetadataOrBuilder();

  /**
   * <pre>
   * Metadata for a dataset used for text extraction.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextExtractionDatasetMetadata text_extraction_dataset_metadata = 28;</code>
   * @return Whether the textExtractionDatasetMetadata field is set.
   */
  boolean hasTextExtractionDatasetMetadata();
  /**
   * <pre>
   * Metadata for a dataset used for text extraction.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextExtractionDatasetMetadata text_extraction_dataset_metadata = 28;</code>
   * @return The textExtractionDatasetMetadata.
   */
  com.google.cloud.automl.v1.TextExtractionDatasetMetadata getTextExtractionDatasetMetadata();
  /**
   * <pre>
   * Metadata for a dataset used for text extraction.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextExtractionDatasetMetadata text_extraction_dataset_metadata = 28;</code>
   */
  com.google.cloud.automl.v1.TextExtractionDatasetMetadataOrBuilder getTextExtractionDatasetMetadataOrBuilder();

  /**
   * <pre>
   * Metadata for a dataset used for text sentiment.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextSentimentDatasetMetadata text_sentiment_dataset_metadata = 30;</code>
   * @return Whether the textSentimentDatasetMetadata field is set.
   */
  boolean hasTextSentimentDatasetMetadata();
  /**
   * <pre>
   * Metadata for a dataset used for text sentiment.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextSentimentDatasetMetadata text_sentiment_dataset_metadata = 30;</code>
   * @return The textSentimentDatasetMetadata.
   */
  com.google.cloud.automl.v1.TextSentimentDatasetMetadata getTextSentimentDatasetMetadata();
  /**
   * <pre>
   * Metadata for a dataset used for text sentiment.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextSentimentDatasetMetadata text_sentiment_dataset_metadata = 30;</code>
   */
  com.google.cloud.automl.v1.TextSentimentDatasetMetadataOrBuilder getTextSentimentDatasetMetadataOrBuilder();

  /**
   * <pre>
   * Output only. The resource name of the dataset.
   * Form: `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The resource name of the dataset.
   * Form: `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The name of the dataset to show in the interface. The name can be
   * up to 32 characters long and can consist only of ASCII Latin letters A-Z
   * and a-z, underscores
   * (_), and ASCII digits 0-9.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. The name of the dataset to show in the interface. The name can be
   * up to 32 characters long and can consist only of ASCII Latin letters A-Z
   * and a-z, underscores
   * (_), and ASCII digits 0-9.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * User-provided description of the dataset. The description can be up to
   * 25000 characters long.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * User-provided description of the dataset. The description can be up to
   * 25000 characters long.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Output only. The number of examples in the dataset.
   * </pre>
   *
   * <code>int32 example_count = 21;</code>
   * @return The exampleCount.
   */
  int getExampleCount();

  /**
   * <pre>
   * Output only. Timestamp when this dataset was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 14;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when this dataset was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 14;</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when this dataset was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 14;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 17;</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 17;</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();

  /**
   * <pre>
   * Optional. The labels with user-defined metadata to organize your dataset.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 39;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Optional. The labels with user-defined metadata to organize your dataset.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 39;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Optional. The labels with user-defined metadata to organize your dataset.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 39;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Optional. The labels with user-defined metadata to organize your dataset.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 39;</code>
   */

  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. The labels with user-defined metadata to organize your dataset.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 39;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  public com.google.cloud.automl.v1.Dataset.DatasetMetadataCase getDatasetMetadataCase();
}