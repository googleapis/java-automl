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

/*
 * This application demonstrates how to perform basic operations on prediction
 * with the Google AutoML Vision API.
 *
 * For more information, the documentation at
 * https://cloud.google.com/vision/automl/docs.
 */

package com.google.cloud.vision;

// Imports the Google Cloud client library
import com.google.cloud.automl.v1beta1.AnnotationPayload;
import com.google.cloud.automl.v1beta1.ExamplePayload;
import com.google.cloud.automl.v1beta1.Image;
import com.google.cloud.automl.v1beta1.ModelName;
import com.google.cloud.automl.v1beta1.PredictResponse;
import com.google.cloud.automl.v1beta1.PredictionServiceClient;
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;

/**
 * Google Cloud AutoML Vision API sample application. Example usage: mvn package exec:java
 * -Dexec.mainClass ='com.google.cloud.vision.samples.automl.PredictionApi' -Dexec.args='predict
 * [modelId] [path-to-image] [scoreThreshold]'
 */
public class PredictionApi {

  // [START automl_vision_predict]
  /**
   * Demonstrates using the AutoML client to predict an image.
   *
   * @param projectId the Id of the project.
   * @param computeRegion the Region name.
   * @param modelId the Id of the model which will be used for text classification.
   * @param filePath the Local text file path of the content to be classified.
   * @param scoreThreshold the Confidence score. Only classifications with confidence score above
   *     scoreThreshold are displayed.
   */
  static void predict(
      String projectId,
      String computeRegion,
      String modelId,
      String filePath,
      String scoreThreshold) {

    // Instantiate client for prediction service.
    try (PredictionServiceClient predictionClient = PredictionServiceClient.create()) {

      // Get the full path of the model.
      ModelName name = ModelName.of(projectId, computeRegion, modelId);

      // Read the image and assign to payload.
      ByteString content = ByteString.copyFrom(Files.readAllBytes(Paths.get(filePath)));
      Image image = Image.newBuilder().setImageBytes(content).build();
      ExamplePayload examplePayload = ExamplePayload.newBuilder().setImage(image).build();

      // Additional parameters that can be provided for prediction e.g. Score Threshold
      Map<String, String> params = new HashMap<>();
      if (scoreThreshold != null) {
        params.put("score_threshold", scoreThreshold);
      }
      // Perform the AutoML Prediction request
      PredictResponse response = predictionClient.predict(name, examplePayload, params);

      System.out.println("Prediction results:");
      for (AnnotationPayload annotationPayload : response.getPayloadList()) {
        System.out.println("Predicted class name :" + annotationPayload.getDisplayName());
        System.out.println(
            "Predicted class score :" + annotationPayload.getClassification().getScore());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  // [END automl_vision_predict]

  public static void main(String[] args) {
    argsHelper(args);
  }

  static void argsHelper(String[] args) {
    ArgumentParser parser =
        ArgumentParsers.newFor("PredictionApi")
            .build()
            .defaultHelp(true)
            .description("Prediction API Operation");

    parser.addArgument("modelId").required(true);
    parser.addArgument("filePath").required(true);
    parser.addArgument("scoreThreshold").nargs("?").type(String.class).setDefault("");

    String projectId = System.getenv("GOOGLE_CLOUD_PROJECT");
    String computeRegion = System.getenv("REGION_NAME");

    if (projectId == null || computeRegion == null) {
      System.out.println("Set `GOOGLE_CLOUD_PROJECT` and `REGION_NAME` as specified in the README");
      System.exit(-1);
    }

    try {
      Namespace ns = parser.parseArgs(args);
      predict(
          projectId,
          computeRegion,
          ns.getString("modelId"),
          ns.getString("filePath"),
          ns.getString("scoreThreshold"));
    } catch (ArgumentParserException e) {
      parser.handleError(e);
    }
  }
}
