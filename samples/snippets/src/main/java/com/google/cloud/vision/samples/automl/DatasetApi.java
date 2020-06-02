/*
 * Copyright 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.vision.samples.automl;

// Imports the Google Cloud client library
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.automl.v1beta1.AutoMlClient;
import com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType;
import com.google.cloud.automl.v1beta1.Dataset;
import com.google.cloud.automl.v1beta1.DatasetName;
import com.google.cloud.automl.v1beta1.GcsDestination;
import com.google.cloud.automl.v1beta1.GcsSource;
import com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata;
import com.google.cloud.automl.v1beta1.InputConfig;
import com.google.cloud.automl.v1beta1.ListDatasetsRequest;
import com.google.cloud.automl.v1beta1.LocationName;
import com.google.cloud.automl.v1beta1.OperationMetadata;
import com.google.cloud.automl.v1beta1.OutputConfig;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;
import net.sourceforge.argparse4j.inf.Subparser;
import net.sourceforge.argparse4j.inf.Subparsers;

/**
 * Google Cloud AutoML Vision API sample application. Example usage: mvn package exec:java
 * -Dexec.mainClass ='com.google.cloud.vision.samples.automl.DatasetAPI' -Dexec.args='create_dataset
 * test_dataset'
 */
public class DatasetApi {

  // [START automl_vision_create_dataset]
  /**
   * Demonstrates using the AutoML client to create a dataset
   *
   * @param projectId the Google Cloud Project ID.
   * @param computeRegion the Region name. (e.g., "us-central1")
   * @param datasetName the name of the dataset to be created.
   * @param multiLabel the type of classification problem. Set to FALSE by default. False -
   *     MULTICLASS , True - MULTILABEL
   */
  static void createDataset(
      String projectId, String computeRegion, String datasetName, boolean multiLabel) {

    // Instantiates a client
    try (AutoMlClient client = AutoMlClient.create()) {
      // A resource that represents Google Cloud Platform location.
      LocationName projectLocation = LocationName.of(projectId, computeRegion);

      // Classification type assigned based on multiLabel value.
      ClassificationType classificationType =
          multiLabel ? ClassificationType.MULTILABEL : ClassificationType.MULTICLASS;

      // Specify the image classification type for the dataset.
      ImageClassificationDatasetMetadata imageClassificationDatasetMetadata =
          ImageClassificationDatasetMetadata.newBuilder()
              .setClassificationType(classificationType)
              .build();

      // Set dataset with dataset name and set the dataset metadata.
      Dataset myDataset =
          Dataset.newBuilder()
              .setDisplayName(datasetName)
              .setImageClassificationDatasetMetadata(imageClassificationDatasetMetadata)
              .build();

      // Create dataset with the dataset metadata in the region.
      Dataset dataset = client.createDataset(projectLocation, myDataset);

      // Display the dataset information
      System.out.println(String.format("Dataset name: %s", dataset.getName()));
      System.out.println(
          String.format(
              "Dataset id: %s",
              dataset.getName().split("/")[dataset.getName().split("/").length - 1]));
      System.out.println(String.format("Dataset display name: %s", dataset.getDisplayName()));
      System.out.println("Image classification dataset specification:");
      System.out.print(String.format("\t%s", dataset.getImageClassificationDatasetMetadata()));
      System.out.println(String.format("Dataset example count: %d", dataset.getExampleCount()));
      System.out.println("Dataset create time:");
      System.out.println(String.format("\tseconds: %s", dataset.getCreateTime().getSeconds()));
      System.out.println(String.format("\tnanos: %s", dataset.getCreateTime().getNanos()));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  // [END automl_vision_create_dataset]

  // [START automl_vision_list_datasets]
  /**
   * Demonstrates using the AutoML client to list all datasets.
   *
   * @param projectId the Id of the project.
   * @param computeRegion the Region name.
   * @param filter the Filter expression.
   */
  static void listDatasets(String projectId, String computeRegion, String filter) {
    // Instantiates a client
    try (AutoMlClient client = AutoMlClient.create()) {

      // A resource that represents Google Cloud Platform location.
      LocationName projectLocation = LocationName.of(projectId, computeRegion);

      // Build the List datasets request
      ListDatasetsRequest request =
          ListDatasetsRequest.newBuilder()
              .setParent(projectLocation.toString())
              .setFilter(filter)
              .build();

      // List all the datasets available in the region by applying the filter.
      System.out.print("List of datasets:");
      for (Dataset dataset : client.listDatasets(request).iterateAll()) {
        // Display the dataset information
        System.out.println(String.format("\nDataset name: %s", dataset.getName()));
        System.out.println(
            String.format(
                "Dataset id: %s",
                dataset.getName().split("/")[dataset.getName().split("/").length - 1]));
        System.out.println(String.format("Dataset display name: %s", dataset.getDisplayName()));
        System.out.println("Image classification dataset specification:");
        System.out.print(String.format("\t%s", dataset.getImageClassificationDatasetMetadata()));
        System.out.println(String.format("Dataset example count: %d", dataset.getExampleCount()));
        System.out.println("Dataset create time:");
        System.out.println(String.format("\tseconds: %s", dataset.getCreateTime().getSeconds()));
        System.out.println(String.format("\tnanos: %s", dataset.getCreateTime().getNanos()));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  // [END automl_vision_list_datasets]

  // [START automl_vision_get_dataset]
  /**
   * Demonstrates using the AutoML client to get a dataset by ID.
   *
   * @param projectId the Id of the project.
   * @param computeRegion the Region name.
   * @param datasetId the Id of the dataset.
   */
  static void getDataset(String projectId, String computeRegion, String datasetId) {
    // Instantiates a client
    try (AutoMlClient client = AutoMlClient.create()) {

      // Get the complete path of the dataset.
      DatasetName datasetFullId = DatasetName.of(projectId, computeRegion, datasetId);

      // Get all the information about a given dataset.
      Dataset dataset = client.getDataset(datasetFullId);

      // Display the dataset information.
      System.out.println(String.format("Dataset name: %s", dataset.getName()));
      System.out.println(
          String.format(
              "Dataset id: %s",
              dataset.getName().split("/")[dataset.getName().split("/").length - 1]));
      System.out.println(String.format("Dataset display name: %s", dataset.getDisplayName()));
      System.out.println("Image classification dataset specification:");
      System.out.print(String.format("\t%s", dataset.getImageClassificationDatasetMetadata()));
      System.out.println(String.format("Dataset example count: %d", dataset.getExampleCount()));
      System.out.println("Dataset create time:");
      System.out.println(String.format("\tseconds: %s", dataset.getCreateTime().getSeconds()));
      System.out.println(String.format("\tnanos: %s", dataset.getCreateTime().getNanos()));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  // [END automl_vision_get_dataset]

  // [START automl_vision_import_data]
  /**
   * Demonstrates using the AutoML client to import labeled images.
   *
   * @param projectId the Id of the project.
   * @param computeRegion the Region name.
   * @param datasetId the Id of the dataset to which the training data will be imported.
   * @param path the Google Cloud Storage URIs. Target files must be in AutoML vision CSV format.
   */
  static void importData(String projectId, String computeRegion, String datasetId, String path) {
    // Instantiates a client
    try (AutoMlClient client = AutoMlClient.create()) {

      // Get the complete path of the dataset.
      DatasetName datasetFullId = DatasetName.of(projectId, computeRegion, datasetId);

      GcsSource.Builder gcsSource = GcsSource.newBuilder();

      // Get multiple training data files to be imported
      String[] inputUris = path.split(",");
      for (String inputUri : inputUris) {
        gcsSource.addInputUris(inputUri);
      }

      // Import data from the input URI
      InputConfig inputConfig = InputConfig.newBuilder().setGcsSource(gcsSource).build();
      System.out.println("Processing import...");

      // Start the import job
      OperationFuture<Empty, OperationMetadata> operation =
          client.importDataAsync(datasetFullId, inputConfig);

      // More info on gax longrunning Operation:
      // http://googleapis.github.io/gax-java/1.4.1/apidocs/com/google/api/gax/grpc/OperationFuture.html
      System.out.format("Operation name: %s%n", operation.getName());

      // If you want to wait for the operation to finish, adjust the timeout appropriately. The
      // operation will still run if you choose not to wait for it to complete. You can check the
      // status of your operation using the operation's name.
      Empty response = operation.get(5, TimeUnit.MINUTES);
      System.out.format("Dataset imported. %s%n", response);
    } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
      e.printStackTrace();
    }
  }
  // [END automl_vision_import_data]

  // [START automl_vision_export_data]
  /**
   * Demonstrates using the AutoML client to export a dataset to a Google Cloud Storage bucket.
   *
   * @param projectId the Id of the project.
   * @param computeRegion the Region name.
   * @param datasetId the Id of the dataset.
   * @param gcsUri the Destination URI (Google Cloud Storage)
   */
  static void exportData(String projectId, String computeRegion, String datasetId, String gcsUri) {
    // Instantiates a client
    try (AutoMlClient client = AutoMlClient.create()) {

      // Get the complete path of the dataset.
      DatasetName datasetFullId = DatasetName.of(projectId, computeRegion, datasetId);

      // Set the output URI
      GcsDestination gcsDestination =
          GcsDestination.newBuilder().setOutputUriPrefix(gcsUri).build();

      // Export the dataset to the output URI.
      OutputConfig outputConfig =
          OutputConfig.newBuilder().setGcsDestination(gcsDestination).build();
      System.out.println("Processing export...");

      Empty response = client.exportDataAsync(datasetFullId, outputConfig).get();
      System.out.println(String.format("Dataset exported. %s", response));
    } catch (IOException | InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
  }
  // [END automl_vision_export_data]

  // [START automl_vision_delete_dataset]
  /**
   * Delete a dataset.
   *
   * @param projectId the Id of the project.
   * @param computeRegion the Region name.
   * @param datasetId the Id of the dataset.
   */
  static void deleteDataset(String projectId, String computeRegion, String datasetId) {
    // Instantiates a client
    try (AutoMlClient client = AutoMlClient.create()) {

      // Get the complete path of the dataset.
      DatasetName datasetFullId = DatasetName.of(projectId, computeRegion, datasetId);

      // Delete a dataset.
      Empty response = client.deleteDatasetAsync(datasetFullId).get();

      System.out.println(String.format("Dataset deleted. %s", response));
    } catch (IOException | InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
  }
  // [END automl_vision_delete_dataset]

  public static void main(String[] args) {
    argsHelper(args);
  }

  static void argsHelper(String[] args) {
    ArgumentParser parser =
        ArgumentParsers.newFor("DatasetApi")
            .build()
            .defaultHelp(true)
            .description("Dataset API operations.");
    Subparsers subparsers = parser.addSubparsers().dest("command");

    Subparser createDatasetParser = subparsers.addParser("create_dataset");
    createDatasetParser.addArgument("datasetName");
    createDatasetParser
        .addArgument("multiLabel")
        .nargs("?")
        .type(Boolean.class)
        .choices(Boolean.FALSE, Boolean.TRUE)
        .setDefault(Boolean.FALSE);

    Subparser listDatasetsParser = subparsers.addParser("list_datasets");
    listDatasetsParser
        .addArgument("filter")
        .nargs("?")
        .setDefault("imageClassificationDatasetMetadata:*");

    Subparser getDatasetParser = subparsers.addParser("get_dataset");
    getDatasetParser.addArgument("datasetId");

    Subparser importDataParser = subparsers.addParser("import_data");
    importDataParser.addArgument("datasetId");
    importDataParser.addArgument("path");

    Subparser exportDataParser = subparsers.addParser("export_data");
    exportDataParser.addArgument("datasetId");
    exportDataParser.addArgument("gcsUri");

    Subparser deleteDatasetParser = subparsers.addParser("delete_dataset");
    deleteDatasetParser.addArgument("datasetId");

    String projectId = System.getenv("GOOGLE_CLOUD_PROJECT");
    String computeRegion = System.getenv("REGION_NAME");

    if (projectId == null || computeRegion == null) {
      System.out.println("Set `GOOGLE_CLOUD_PROJECT` and `REGION_NAME` as specified in the README");
      System.exit(-1);
    }

    try {
      Namespace ns = parser.parseArgs(args);

      if (ns.get("command").equals("create_dataset")) {
        createDataset(
            projectId, computeRegion, ns.getString("datasetName"), ns.getBoolean("multiLabel"));
      }
      if (ns.get("command").equals("list_datasets")) {
        listDatasets(projectId, computeRegion, ns.getString("filter"));
      }
      if (ns.get("command").equals("get_dataset")) {
        getDataset(projectId, computeRegion, ns.getString("datasetId"));
      }
      if (ns.get("command").equals("import_data")) {
        importData(projectId, computeRegion, ns.getString("datasetId"), ns.getString("path"));
      }
      if (ns.get("command").equals("export_data")) {
        exportData(projectId, computeRegion, ns.getString("datasetId"), ns.getString("gcsUri"));
      }
      if (ns.get("command").equals("delete_dataset")) {
        deleteDataset(projectId, computeRegion, ns.getString("datasetId"));
      }

    } catch (ArgumentParserException e) {
      parser.handleError(e);
    }
  }
}
