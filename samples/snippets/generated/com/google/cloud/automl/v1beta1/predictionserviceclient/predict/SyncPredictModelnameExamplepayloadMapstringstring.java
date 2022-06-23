/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.automl.v1beta1.samples;

// [START automl_v1beta1_generated_predictionserviceclient_predict_modelnameexamplepayloadmapstringstring_sync]
import com.google.cloud.automl.v1beta1.ExamplePayload;
import com.google.cloud.automl.v1beta1.ModelName;
import com.google.cloud.automl.v1beta1.PredictResponse;
import com.google.cloud.automl.v1beta1.PredictionServiceClient;
import java.util.HashMap;
import java.util.Map;

public class SyncPredictModelnameExamplepayloadMapstringstring {

  public static void main(String[] args) throws Exception {
    syncPredictModelnameExamplepayloadMapstringstring();
  }

  public static void syncPredictModelnameExamplepayloadMapstringstring() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (PredictionServiceClient predictionServiceClient = PredictionServiceClient.create()) {
      ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
      ExamplePayload payload = ExamplePayload.newBuilder().build();
      Map<String, String> params = new HashMap<>();
      PredictResponse response = predictionServiceClient.predict(name, payload, params);
    }
  }
}
// [END automl_v1beta1_generated_predictionserviceclient_predict_modelnameexamplepayloadmapstringstring_sync]
