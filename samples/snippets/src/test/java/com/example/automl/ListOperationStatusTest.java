/*
 * Copyright 2020 Google LLC
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

package com.example.automl;

import static com.google.common.truth.Truth.assertThat;
import static junit.framework.TestCase.assertNotNull;

import com.google.cloud.automl.v1.AutoMlClient;
import com.google.cloud.automl.v1.LocationName;
import com.google.longrunning.ListOperationsRequest;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ListOperationStatusTest {
  private static final String PROJECT_ID = System.getenv("AUTOML_PROJECT_ID");
  private ByteArrayOutputStream bout;
  private PrintStream out;
  private PrintStream originalPrintStream;

  private static void requireEnvVar(String varName) {
    assertNotNull(
        System.getenv(varName),
        "Environment variable '%s' is required to perform these tests.".format(varName));
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("AUTOML_PROJECT_ID");
  }

  @Before
  public void setUp() throws IOException {
    bout = new ByteArrayOutputStream();
    out = new PrintStream(bout);
    originalPrintStream = System.out;
    System.setOut(out);

    // if the LRO status count more than 300, delete all operations.
    try (AutoMlClient client = AutoMlClient.create()) {
      OperationsClient operationsClient = client.getOperationsClient();
      LocationName projectLocation = LocationName.of(PROJECT_ID, "us-central1");
      ListOperationsRequest listRequest =
          ListOperationsRequest.newBuilder().setName(projectLocation.toString()).build();
      List<String> operationFullPathsToBeDeleted = new ArrayList<>();
      for (Operation operation : operationsClient.listOperations(listRequest).iterateAll()) {
        // collect unused operation into the list.
        operationFullPathsToBeDeleted.add(operation.getName());
      }

      if (operationFullPathsToBeDeleted.size() > 300) {
        for (String operationFullPath : operationFullPathsToBeDeleted) {
          // delete unused operations.
          operationsClient.deleteOperation(operationFullPath);
        }
      } else {
        // Clear the list since we wont anything with the list.
        operationFullPathsToBeDeleted.clear();
      }
    }
  }

  @After
  public void tearDown() {
    // restores print statements in the original method
    System.out.flush();
    System.setOut(originalPrintStream);
  }

  @Test
  public void testOperationStatus() throws IOException {
    ListOperationStatus.listOperationStatus(PROJECT_ID);
    String got = bout.toString();
    assertThat(got).contains("Operation details:");
  }
}
