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

// [START automl_v1beta1_generated_automlclient_getmodelevaluation_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.automl.v1beta1.AutoMlClient;
import com.google.cloud.automl.v1beta1.GetModelEvaluationRequest;
import com.google.cloud.automl.v1beta1.ModelEvaluation;
import com.google.cloud.automl.v1beta1.ModelEvaluationName;

public class AsyncGetModelEvaluation {

  public static void main(String[] args) throws Exception {
    asyncGetModelEvaluation();
  }

  public static void asyncGetModelEvaluation() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AutoMlClient autoMlClient = AutoMlClient.create()) {
      GetModelEvaluationRequest request =
          GetModelEvaluationRequest.newBuilder()
              .setName(
                  ModelEvaluationName.of("[PROJECT]", "[LOCATION]", "[MODEL]", "[MODEL_EVALUATION]")
                      .toString())
              .build();
      ApiFuture<ModelEvaluation> future =
          autoMlClient.getModelEvaluationCallable().futureCall(request);
      // Do something.
      ModelEvaluation response = future.get();
    }
  }
}
// [END automl_v1beta1_generated_automlclient_getmodelevaluation_async]
