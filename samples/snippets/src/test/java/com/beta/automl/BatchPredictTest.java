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

package com.beta.automl;

import static com.google.common.truth.Truth.assertThat;
import static junit.framework.TestCase.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.ExecutionException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
@SuppressWarnings("checkstyle:abbreviationaswordinname")
public class BatchPredictTest {
  private static final String PROJECT_ID = System.getenv("AUTOML_PROJECT_ID");
  private static final String BUCKET_ID = PROJECT_ID + "-lcm";
  private static final String MODEL_ID = "VCN0000000000000000000";
  private ByteArrayOutputStream bout;
  private PrintStream out;
  private PrintStream originalPrintStream;

  private static String requireEnvVar(String varName) {
    String value = System.getenv(varName);
    assertNotNull(
        "Environment variable " + varName + " is required to perform these tests.",
        System.getenv(varName));
    return value;
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("AUTOML_PROJECT_ID");
  }

  @Before
  public void setUp() {
    bout = new ByteArrayOutputStream();
    out = new PrintStream(bout);
    originalPrintStream = System.out;
    System.setOut(out);
  }

  @After
  public void tearDown() {
    // restores print statements in the original method
    System.out.flush();
    System.setOut(originalPrintStream);
  }

  @Test
  public void testBatchPredict() {
    // As batch prediction can take a long time. Try to batch predict on a model and confirm that
    // the model was not found, but other elements of the request were valid.
    try {
      String inputUri = String.format("gs://%s/entity-extraction/input.csv", BUCKET_ID);
      String outputUri = String.format("gs://%s/TEST_BATCH_PREDICT/", BUCKET_ID);
      BatchPredict.batchPredict(PROJECT_ID, MODEL_ID, inputUri, outputUri);
      String got = bout.toString();
      assertThat(got).contains("does not exist");
    } catch (IOException | ExecutionException | InterruptedException e) {
      assertThat(e.getMessage()).contains("does not exist");
    }
  }
}
