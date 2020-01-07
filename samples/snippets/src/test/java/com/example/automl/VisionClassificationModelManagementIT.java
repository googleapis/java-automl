/*
 * Copyright 2019 Google LLC
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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.ExecutionException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

// Tests for Automl vision image classification models.
@RunWith(JUnit4.class)
@Ignore
public class VisionClassificationModelManagementIT {
  private static final String PROJECT_ID = System.getenv("AUTOML_PROJECT_ID");
  private static final String MODEL_ID = System.getenv("VISION_CLASSIFICATION_MODEL_ID");
  private ByteArrayOutputStream bout;
  private PrintStream out;

  private static void requireEnvVar(String varName) {
    assertNotNull(
            System.getenv(varName),
            "Environment variable '%s' is required to perform these tests.".format(varName)
    );
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("AUTOML_PROJECT_ID");
    requireEnvVar("VISION_CLASSIFICATION_MODEL_ID");
  }

  @Before
  public void setUp() {
    bout = new ByteArrayOutputStream();
    out = new PrintStream(bout);
    System.setOut(out);
  }

  @After
  public void tearDown() {
    System.setOut(null);
  }

  @Test
  public void testDeployUndeployModel()
      throws IOException, ExecutionException, InterruptedException {
    UndeployModel.undeployModel(PROJECT_ID, MODEL_ID);
    String got = bout.toString();
    assertThat(got).contains("Model undeployment finished");

    DeployModel.deployModel(PROJECT_ID, MODEL_ID);
    got = bout.toString();
    assertThat(got).contains("Model deployment finished");
  }

  @Test
  public void testDeployUndeployModelWithNodeCount()
      throws IOException, ExecutionException, InterruptedException {
    UndeployModel.undeployModel(PROJECT_ID, MODEL_ID);
    String got = bout.toString();
    assertThat(got).contains("Model undeployment finished");

    VisionClassificationDeployModelNodeCount.visionClassificationDeployModelNodeCount(
        PROJECT_ID, MODEL_ID);
    got = bout.toString();
    assertThat(got).contains("Model deployment finished");
  }
}