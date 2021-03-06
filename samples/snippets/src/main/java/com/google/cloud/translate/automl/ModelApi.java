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

package com.google.cloud.translate.automl;

// Imports the Google Cloud client library
import com.google.cloud.automl.v1.AutoMlClient;
import com.google.cloud.automl.v1.ListModelsRequest;
import com.google.cloud.automl.v1.LocationName;
import com.google.cloud.automl.v1.Model;
import com.google.longrunning.Operation;
import java.io.IOException;
import java.io.PrintStream;
import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;
import net.sourceforge.argparse4j.inf.Subparser;
import net.sourceforge.argparse4j.inf.Subparsers;

/**
 * Google Cloud AutoML Translate API sample application. Example usage: mvn package exec:java
 * -Dexec.mainClass ='com.example.translate.ModelApi' -Dexec.args='create_model [datasetId]
 * test_model'
 */
public class ModelApi {

  // [START automl_translate_list_models]
  /**
   * Demonstrates using the AutoML client to list all models.
   *
   * @param projectId the Id of the project.
   * @param computeRegion the Region name.
   * @param filter the filter expression.
   * @throws IOException on Input/Output errors.
   */
  public static void listModels(String projectId, String computeRegion, String filter)
      throws IOException {
    // Instantiates a client
    try (AutoMlClient client = AutoMlClient.create()) {

      // A resource that represents Google Cloud Platform location.
      LocationName projectLocation = LocationName.of(projectId, computeRegion);

      // Create list models request.
      ListModelsRequest listModlesRequest =
          ListModelsRequest.newBuilder()
              .setParent(projectLocation.toString())
              .setFilter(filter)
              .build();

      // List all the models available in the region by applying filter.
      System.out.println("List of models:");
      for (Model model : client.listModels(listModlesRequest).iterateAll()) {
        // Display the model information.
        System.out.println(String.format("Model name: %s", model.getName()));
        System.out.println(
            String.format(
                "Model id: %s", model.getName().split("/")[model.getName().split("/").length - 1]));
        System.out.println(String.format("Model display name: %s", model.getDisplayName()));
        System.out.println("Model create time:");
        System.out.println(String.format("\tseconds: %s", model.getCreateTime().getSeconds()));
        System.out.println(String.format("\tnanos: %s", model.getCreateTime().getNanos()));
        System.out.println(String.format("Model deployment state: %s", model.getDeploymentState()));
      }
    }
  }
  // [END automl_translate_list_models]

  // [START automl_translate_get_operation_status]
  /**
   * Demonstrates using the AutoML client to get operation status.
   *
   * @param operationFullId Full name of a operation. For example, the name of your operation is
   *     projects/[projectId]/locations/us-central1/operations/[operationId].
   * @throws IOException on Input/Output errors.
   */
  private static void getOperationStatus(String operationFullId) throws IOException {
    // Instantiates a client
    try (AutoMlClient client = AutoMlClient.create()) {

      // Get the latest state of a long-running operation.
      Operation response = client.getOperationsClient().getOperation(operationFullId);

      System.out.println(String.format("Operation status: %s", response));
    }
  }
  // [END automl_translate_get_operation_status]

  public static void main(String[] args) throws Exception {
    ModelApi modelApi = new ModelApi();
    modelApi.argsHelper(args, System.out);
  }

  public static void argsHelper(String[] args, PrintStream out) throws Exception {

    ArgumentParser parser =
        ArgumentParsers.newFor("ModelApi")
            .build()
            .defaultHelp(true)
            .description("Model API operations");
    Subparsers subparsers = parser.addSubparsers().dest("command");

    Subparser listModelParser = subparsers.addParser("list_models");
    listModelParser.addArgument("filter").nargs("?").setDefault("");

    Subparser getOperationStatusParser = subparsers.addParser("get_operation_status");
    getOperationStatusParser.addArgument("operationFullId");

    String projectId = System.getenv("PROJECT_ID");
    String computeRegion = System.getenv("REGION_NAME");

    Namespace ns = null;
    try {
      ns = parser.parseArgs(args);
      if (ns.get("command").equals("list_models")) {
        listModels(projectId, computeRegion, ns.getString("filter"));
      }
      if (ns.get("command").equals("get_operation_status")) {
        getOperationStatus(ns.getString("operationFullId"));
      }
    } catch (ArgumentParserException e) {
      parser.handleError(e);
    }
  }
}
