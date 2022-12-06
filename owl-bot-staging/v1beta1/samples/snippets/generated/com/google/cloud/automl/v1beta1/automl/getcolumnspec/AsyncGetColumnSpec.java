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

// [START automl_v1beta1_generated_AutoMl_GetColumnSpec_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.automl.v1beta1.AutoMlClient;
import com.google.cloud.automl.v1beta1.ColumnSpec;
import com.google.cloud.automl.v1beta1.ColumnSpecName;
import com.google.cloud.automl.v1beta1.GetColumnSpecRequest;
import com.google.protobuf.FieldMask;

public class AsyncGetColumnSpec {

  public static void main(String[] args) throws Exception {
    asyncGetColumnSpec();
  }

  public static void asyncGetColumnSpec() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AutoMlClient autoMlClient = AutoMlClient.create()) {
      GetColumnSpecRequest request =
          GetColumnSpecRequest.newBuilder()
              .setName(
                  ColumnSpecName.of(
                          "[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]", "[COLUMN_SPEC]")
                      .toString())
              .setFieldMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<ColumnSpec> future = autoMlClient.getColumnSpecCallable().futureCall(request);
      // Do something.
      ColumnSpec response = future.get();
    }
  }
}
// [END automl_v1beta1_generated_AutoMl_GetColumnSpec_async]
