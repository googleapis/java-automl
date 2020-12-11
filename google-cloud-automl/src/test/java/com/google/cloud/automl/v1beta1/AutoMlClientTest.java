/*
 * Copyright 2020 Google LLC
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

package com.google.cloud.automl.v1beta1;

import static com.google.cloud.automl.v1beta1.AutoMlClient.ListColumnSpecsPagedResponse;
import static com.google.cloud.automl.v1beta1.AutoMlClient.ListDatasetsPagedResponse;
import static com.google.cloud.automl.v1beta1.AutoMlClient.ListModelEvaluationsPagedResponse;
import static com.google.cloud.automl.v1beta1.AutoMlClient.ListModelsPagedResponse;
import static com.google.cloud.automl.v1beta1.AutoMlClient.ListTableSpecsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import com.google.protobuf.Timestamp;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class AutoMlClientTest {
  private static MockServiceHelper mockServiceHelper;
  private AutoMlClient client;
  private static MockAutoMl mockAutoMl;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAutoMl = new MockAutoMl();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockAutoMl));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    AutoMlSettings settings =
        AutoMlSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AutoMlClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void createDatasetTest() throws Exception {
    Dataset expectedResponse =
        Dataset.newBuilder()
            .setName(DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString())
            .setDisplayName("display_name1615086568")
            .setDescription("description-1724546052")
            .setExampleCount(1517063674)
            .setCreateTime(Timestamp.newBuilder().build())
            .setEtag("etag3123477")
            .build();
    mockAutoMl.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    Dataset dataset = Dataset.newBuilder().build();

    Dataset actualResponse = client.createDataset(parent, dataset);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateDatasetRequest actualRequest = ((CreateDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(dataset, actualRequest.getDataset());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createDatasetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      Dataset dataset = Dataset.newBuilder().build();
      client.createDataset(parent, dataset);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createDatasetTest2() throws Exception {
    Dataset expectedResponse =
        Dataset.newBuilder()
            .setName(DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString())
            .setDisplayName("display_name1615086568")
            .setDescription("description-1724546052")
            .setExampleCount(1517063674)
            .setCreateTime(Timestamp.newBuilder().build())
            .setEtag("etag3123477")
            .build();
    mockAutoMl.addResponse(expectedResponse);

    String parent = "parent-995424086";
    Dataset dataset = Dataset.newBuilder().build();

    Dataset actualResponse = client.createDataset(parent, dataset);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateDatasetRequest actualRequest = ((CreateDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(dataset, actualRequest.getDataset());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createDatasetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String parent = "parent-995424086";
      Dataset dataset = Dataset.newBuilder().build();
      client.createDataset(parent, dataset);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getDatasetTest() throws Exception {
    Dataset expectedResponse =
        Dataset.newBuilder()
            .setName(DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString())
            .setDisplayName("display_name1615086568")
            .setDescription("description-1724546052")
            .setExampleCount(1517063674)
            .setCreateTime(Timestamp.newBuilder().build())
            .setEtag("etag3123477")
            .build();
    mockAutoMl.addResponse(expectedResponse);

    DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");

    Dataset actualResponse = client.getDataset(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDatasetRequest actualRequest = ((GetDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDatasetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
      client.getDataset(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getDatasetTest2() throws Exception {
    Dataset expectedResponse =
        Dataset.newBuilder()
            .setName(DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString())
            .setDisplayName("display_name1615086568")
            .setDescription("description-1724546052")
            .setExampleCount(1517063674)
            .setCreateTime(Timestamp.newBuilder().build())
            .setEtag("etag3123477")
            .build();
    mockAutoMl.addResponse(expectedResponse);

    String name = "name3373707";

    Dataset actualResponse = client.getDataset(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDatasetRequest actualRequest = ((GetDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDatasetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String name = "name3373707";
      client.getDataset(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listDatasetsTest() throws Exception {
    Dataset responsesElement = Dataset.newBuilder().build();
    ListDatasetsResponse expectedResponse =
        ListDatasetsResponse.newBuilder()
            .setNextPageToken("")
            .addAllDatasets(Arrays.asList(responsesElement))
            .build();
    mockAutoMl.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListDatasetsPagedResponse pagedListResponse = client.listDatasets(parent);

    List<Dataset> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getDatasetsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListDatasetsRequest actualRequest = ((ListDatasetsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listDatasetsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listDatasets(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listDatasetsTest2() throws Exception {
    Dataset responsesElement = Dataset.newBuilder().build();
    ListDatasetsResponse expectedResponse =
        ListDatasetsResponse.newBuilder()
            .setNextPageToken("")
            .addAllDatasets(Arrays.asList(responsesElement))
            .build();
    mockAutoMl.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListDatasetsPagedResponse pagedListResponse = client.listDatasets(parent);

    List<Dataset> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getDatasetsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListDatasetsRequest actualRequest = ((ListDatasetsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listDatasetsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listDatasets(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateDatasetTest() throws Exception {
    Dataset expectedResponse =
        Dataset.newBuilder()
            .setName(DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString())
            .setDisplayName("display_name1615086568")
            .setDescription("description-1724546052")
            .setExampleCount(1517063674)
            .setCreateTime(Timestamp.newBuilder().build())
            .setEtag("etag3123477")
            .build();
    mockAutoMl.addResponse(expectedResponse);

    Dataset dataset = Dataset.newBuilder().build();

    Dataset actualResponse = client.updateDataset(dataset);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateDatasetRequest actualRequest = ((UpdateDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(dataset, actualRequest.getDataset());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateDatasetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      Dataset dataset = Dataset.newBuilder().build();
      client.updateDataset(dataset);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteDatasetTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteDatasetTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoMl.addResponse(resultOperation);

    DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");

    client.deleteDatasetAsync(name).get();

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteDatasetRequest actualRequest = ((DeleteDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteDatasetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
      client.deleteDatasetAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void deleteDatasetTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteDatasetTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoMl.addResponse(resultOperation);

    String name = "name3373707";

    client.deleteDatasetAsync(name).get();

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteDatasetRequest actualRequest = ((DeleteDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteDatasetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String name = "name3373707";
      client.deleteDatasetAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void importDataTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("importDataTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoMl.addResponse(resultOperation);

    DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
    InputConfig inputConfig = InputConfig.newBuilder().build();

    client.importDataAsync(name, inputConfig).get();

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ImportDataRequest actualRequest = ((ImportDataRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertEquals(inputConfig, actualRequest.getInputConfig());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void importDataExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
      InputConfig inputConfig = InputConfig.newBuilder().build();
      client.importDataAsync(name, inputConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void importDataTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("importDataTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoMl.addResponse(resultOperation);

    String name = "name3373707";
    InputConfig inputConfig = InputConfig.newBuilder().build();

    client.importDataAsync(name, inputConfig).get();

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ImportDataRequest actualRequest = ((ImportDataRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertEquals(inputConfig, actualRequest.getInputConfig());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void importDataExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String name = "name3373707";
      InputConfig inputConfig = InputConfig.newBuilder().build();
      client.importDataAsync(name, inputConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void exportDataTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("exportDataTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoMl.addResponse(resultOperation);

    DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
    OutputConfig outputConfig = OutputConfig.newBuilder().build();

    client.exportDataAsync(name, outputConfig).get();

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ExportDataRequest actualRequest = ((ExportDataRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertEquals(outputConfig, actualRequest.getOutputConfig());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void exportDataExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
      OutputConfig outputConfig = OutputConfig.newBuilder().build();
      client.exportDataAsync(name, outputConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void exportDataTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("exportDataTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoMl.addResponse(resultOperation);

    String name = "name3373707";
    OutputConfig outputConfig = OutputConfig.newBuilder().build();

    client.exportDataAsync(name, outputConfig).get();

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ExportDataRequest actualRequest = ((ExportDataRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertEquals(outputConfig, actualRequest.getOutputConfig());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void exportDataExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String name = "name3373707";
      OutputConfig outputConfig = OutputConfig.newBuilder().build();
      client.exportDataAsync(name, outputConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void getAnnotationSpecTest() throws Exception {
    AnnotationSpec expectedResponse =
        AnnotationSpec.newBuilder()
            .setName(
                AnnotationSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[ANNOTATION_SPEC]")
                    .toString())
            .setDisplayName("display_name1615086568")
            .setExampleCount(1517063674)
            .build();
    mockAutoMl.addResponse(expectedResponse);

    AnnotationSpecName name =
        AnnotationSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[ANNOTATION_SPEC]");

    AnnotationSpec actualResponse = client.getAnnotationSpec(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAnnotationSpecRequest actualRequest = ((GetAnnotationSpecRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAnnotationSpecExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      AnnotationSpecName name =
          AnnotationSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[ANNOTATION_SPEC]");
      client.getAnnotationSpec(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAnnotationSpecTest2() throws Exception {
    AnnotationSpec expectedResponse =
        AnnotationSpec.newBuilder()
            .setName(
                AnnotationSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[ANNOTATION_SPEC]")
                    .toString())
            .setDisplayName("display_name1615086568")
            .setExampleCount(1517063674)
            .build();
    mockAutoMl.addResponse(expectedResponse);

    String name = "name3373707";

    AnnotationSpec actualResponse = client.getAnnotationSpec(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAnnotationSpecRequest actualRequest = ((GetAnnotationSpecRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAnnotationSpecExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String name = "name3373707";
      client.getAnnotationSpec(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getTableSpecTest() throws Exception {
    TableSpec expectedResponse =
        TableSpec.newBuilder()
            .setName(
                TableSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]").toString())
            .setTimeColumnSpecId("time_column_spec_id1558734824")
            .setRowCount(1340416618)
            .setValidRowCount(-406068761)
            .setColumnCount(-122671386)
            .addAllInputConfigs(new ArrayList<InputConfig>())
            .setEtag("etag3123477")
            .build();
    mockAutoMl.addResponse(expectedResponse);

    TableSpecName name = TableSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]");

    TableSpec actualResponse = client.getTableSpec(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetTableSpecRequest actualRequest = ((GetTableSpecRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getTableSpecExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      TableSpecName name = TableSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]");
      client.getTableSpec(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getTableSpecTest2() throws Exception {
    TableSpec expectedResponse =
        TableSpec.newBuilder()
            .setName(
                TableSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]").toString())
            .setTimeColumnSpecId("time_column_spec_id1558734824")
            .setRowCount(1340416618)
            .setValidRowCount(-406068761)
            .setColumnCount(-122671386)
            .addAllInputConfigs(new ArrayList<InputConfig>())
            .setEtag("etag3123477")
            .build();
    mockAutoMl.addResponse(expectedResponse);

    String name = "name3373707";

    TableSpec actualResponse = client.getTableSpec(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetTableSpecRequest actualRequest = ((GetTableSpecRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getTableSpecExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String name = "name3373707";
      client.getTableSpec(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listTableSpecsTest() throws Exception {
    TableSpec responsesElement = TableSpec.newBuilder().build();
    ListTableSpecsResponse expectedResponse =
        ListTableSpecsResponse.newBuilder()
            .setNextPageToken("")
            .addAllTableSpecs(Arrays.asList(responsesElement))
            .build();
    mockAutoMl.addResponse(expectedResponse);

    DatasetName parent = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");

    ListTableSpecsPagedResponse pagedListResponse = client.listTableSpecs(parent);

    List<TableSpec> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getTableSpecsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListTableSpecsRequest actualRequest = ((ListTableSpecsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listTableSpecsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      DatasetName parent = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
      client.listTableSpecs(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listTableSpecsTest2() throws Exception {
    TableSpec responsesElement = TableSpec.newBuilder().build();
    ListTableSpecsResponse expectedResponse =
        ListTableSpecsResponse.newBuilder()
            .setNextPageToken("")
            .addAllTableSpecs(Arrays.asList(responsesElement))
            .build();
    mockAutoMl.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListTableSpecsPagedResponse pagedListResponse = client.listTableSpecs(parent);

    List<TableSpec> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getTableSpecsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListTableSpecsRequest actualRequest = ((ListTableSpecsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listTableSpecsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listTableSpecs(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateTableSpecTest() throws Exception {
    TableSpec expectedResponse =
        TableSpec.newBuilder()
            .setName(
                TableSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]").toString())
            .setTimeColumnSpecId("time_column_spec_id1558734824")
            .setRowCount(1340416618)
            .setValidRowCount(-406068761)
            .setColumnCount(-122671386)
            .addAllInputConfigs(new ArrayList<InputConfig>())
            .setEtag("etag3123477")
            .build();
    mockAutoMl.addResponse(expectedResponse);

    TableSpec tableSpec = TableSpec.newBuilder().build();

    TableSpec actualResponse = client.updateTableSpec(tableSpec);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateTableSpecRequest actualRequest = ((UpdateTableSpecRequest) actualRequests.get(0));

    Assert.assertEquals(tableSpec, actualRequest.getTableSpec());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateTableSpecExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      TableSpec tableSpec = TableSpec.newBuilder().build();
      client.updateTableSpec(tableSpec);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getColumnSpecTest() throws Exception {
    ColumnSpec expectedResponse =
        ColumnSpec.newBuilder()
            .setName(
                ColumnSpecName.of(
                        "[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]", "[COLUMN_SPEC]")
                    .toString())
            .setDataType(DataType.newBuilder().build())
            .setDisplayName("display_name1615086568")
            .setDataStats(DataStats.newBuilder().build())
            .addAllTopCorrelatedColumns(new ArrayList<ColumnSpec.CorrelatedColumn>())
            .setEtag("etag3123477")
            .build();
    mockAutoMl.addResponse(expectedResponse);

    ColumnSpecName name =
        ColumnSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]", "[COLUMN_SPEC]");

    ColumnSpec actualResponse = client.getColumnSpec(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetColumnSpecRequest actualRequest = ((GetColumnSpecRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getColumnSpecExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      ColumnSpecName name =
          ColumnSpecName.of(
              "[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]", "[COLUMN_SPEC]");
      client.getColumnSpec(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getColumnSpecTest2() throws Exception {
    ColumnSpec expectedResponse =
        ColumnSpec.newBuilder()
            .setName(
                ColumnSpecName.of(
                        "[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]", "[COLUMN_SPEC]")
                    .toString())
            .setDataType(DataType.newBuilder().build())
            .setDisplayName("display_name1615086568")
            .setDataStats(DataStats.newBuilder().build())
            .addAllTopCorrelatedColumns(new ArrayList<ColumnSpec.CorrelatedColumn>())
            .setEtag("etag3123477")
            .build();
    mockAutoMl.addResponse(expectedResponse);

    String name = "name3373707";

    ColumnSpec actualResponse = client.getColumnSpec(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetColumnSpecRequest actualRequest = ((GetColumnSpecRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getColumnSpecExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String name = "name3373707";
      client.getColumnSpec(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listColumnSpecsTest() throws Exception {
    ColumnSpec responsesElement = ColumnSpec.newBuilder().build();
    ListColumnSpecsResponse expectedResponse =
        ListColumnSpecsResponse.newBuilder()
            .setNextPageToken("")
            .addAllColumnSpecs(Arrays.asList(responsesElement))
            .build();
    mockAutoMl.addResponse(expectedResponse);

    TableSpecName parent = TableSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]");

    ListColumnSpecsPagedResponse pagedListResponse = client.listColumnSpecs(parent);

    List<ColumnSpec> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getColumnSpecsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListColumnSpecsRequest actualRequest = ((ListColumnSpecsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listColumnSpecsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      TableSpecName parent =
          TableSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]");
      client.listColumnSpecs(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listColumnSpecsTest2() throws Exception {
    ColumnSpec responsesElement = ColumnSpec.newBuilder().build();
    ListColumnSpecsResponse expectedResponse =
        ListColumnSpecsResponse.newBuilder()
            .setNextPageToken("")
            .addAllColumnSpecs(Arrays.asList(responsesElement))
            .build();
    mockAutoMl.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListColumnSpecsPagedResponse pagedListResponse = client.listColumnSpecs(parent);

    List<ColumnSpec> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getColumnSpecsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListColumnSpecsRequest actualRequest = ((ListColumnSpecsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listColumnSpecsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listColumnSpecs(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateColumnSpecTest() throws Exception {
    ColumnSpec expectedResponse =
        ColumnSpec.newBuilder()
            .setName(
                ColumnSpecName.of(
                        "[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]", "[COLUMN_SPEC]")
                    .toString())
            .setDataType(DataType.newBuilder().build())
            .setDisplayName("display_name1615086568")
            .setDataStats(DataStats.newBuilder().build())
            .addAllTopCorrelatedColumns(new ArrayList<ColumnSpec.CorrelatedColumn>())
            .setEtag("etag3123477")
            .build();
    mockAutoMl.addResponse(expectedResponse);

    ColumnSpec columnSpec = ColumnSpec.newBuilder().build();

    ColumnSpec actualResponse = client.updateColumnSpec(columnSpec);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateColumnSpecRequest actualRequest = ((UpdateColumnSpecRequest) actualRequests.get(0));

    Assert.assertEquals(columnSpec, actualRequest.getColumnSpec());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateColumnSpecExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      ColumnSpec columnSpec = ColumnSpec.newBuilder().build();
      client.updateColumnSpec(columnSpec);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createModelTest() throws Exception {
    Model expectedResponse =
        Model.newBuilder()
            .setName(ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]").toString())
            .setDisplayName("display_name1615086568")
            .setDatasetId("dataset_id-2115646910")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoMl.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    Model model = Model.newBuilder().build();

    Model actualResponse = client.createModelAsync(parent, model).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateModelRequest actualRequest = ((CreateModelRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(model, actualRequest.getModel());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createModelExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      Model model = Model.newBuilder().build();
      client.createModelAsync(parent, model).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createModelTest2() throws Exception {
    Model expectedResponse =
        Model.newBuilder()
            .setName(ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]").toString())
            .setDisplayName("display_name1615086568")
            .setDatasetId("dataset_id-2115646910")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoMl.addResponse(resultOperation);

    String parent = "parent-995424086";
    Model model = Model.newBuilder().build();

    Model actualResponse = client.createModelAsync(parent, model).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateModelRequest actualRequest = ((CreateModelRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(model, actualRequest.getModel());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createModelExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String parent = "parent-995424086";
      Model model = Model.newBuilder().build();
      client.createModelAsync(parent, model).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void getModelTest() throws Exception {
    Model expectedResponse =
        Model.newBuilder()
            .setName(ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]").toString())
            .setDisplayName("display_name1615086568")
            .setDatasetId("dataset_id-2115646910")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockAutoMl.addResponse(expectedResponse);

    ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");

    Model actualResponse = client.getModel(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetModelRequest actualRequest = ((GetModelRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getModelExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
      client.getModel(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getModelTest2() throws Exception {
    Model expectedResponse =
        Model.newBuilder()
            .setName(ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]").toString())
            .setDisplayName("display_name1615086568")
            .setDatasetId("dataset_id-2115646910")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockAutoMl.addResponse(expectedResponse);

    String name = "name3373707";

    Model actualResponse = client.getModel(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetModelRequest actualRequest = ((GetModelRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getModelExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String name = "name3373707";
      client.getModel(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listModelsTest() throws Exception {
    Model responsesElement = Model.newBuilder().build();
    ListModelsResponse expectedResponse =
        ListModelsResponse.newBuilder()
            .setNextPageToken("")
            .addAllModel(Arrays.asList(responsesElement))
            .build();
    mockAutoMl.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListModelsPagedResponse pagedListResponse = client.listModels(parent);

    List<Model> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getModelList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListModelsRequest actualRequest = ((ListModelsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listModelsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listModels(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listModelsTest2() throws Exception {
    Model responsesElement = Model.newBuilder().build();
    ListModelsResponse expectedResponse =
        ListModelsResponse.newBuilder()
            .setNextPageToken("")
            .addAllModel(Arrays.asList(responsesElement))
            .build();
    mockAutoMl.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListModelsPagedResponse pagedListResponse = client.listModels(parent);

    List<Model> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getModelList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListModelsRequest actualRequest = ((ListModelsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listModelsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listModels(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteModelTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoMl.addResponse(resultOperation);

    ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");

    client.deleteModelAsync(name).get();

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteModelRequest actualRequest = ((DeleteModelRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteModelExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
      client.deleteModelAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void deleteModelTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoMl.addResponse(resultOperation);

    String name = "name3373707";

    client.deleteModelAsync(name).get();

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteModelRequest actualRequest = ((DeleteModelRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteModelExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String name = "name3373707";
      client.deleteModelAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void deployModelTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deployModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoMl.addResponse(resultOperation);

    ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");

    client.deployModelAsync(name).get();

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeployModelRequest actualRequest = ((DeployModelRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deployModelExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
      client.deployModelAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void deployModelTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deployModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoMl.addResponse(resultOperation);

    String name = "name3373707";

    client.deployModelAsync(name).get();

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeployModelRequest actualRequest = ((DeployModelRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deployModelExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String name = "name3373707";
      client.deployModelAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void undeployModelTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("undeployModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoMl.addResponse(resultOperation);

    ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");

    client.undeployModelAsync(name).get();

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UndeployModelRequest actualRequest = ((UndeployModelRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void undeployModelExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
      client.undeployModelAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void undeployModelTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("undeployModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoMl.addResponse(resultOperation);

    String name = "name3373707";

    client.undeployModelAsync(name).get();

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UndeployModelRequest actualRequest = ((UndeployModelRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void undeployModelExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String name = "name3373707";
      client.undeployModelAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void exportModelTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("exportModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoMl.addResponse(resultOperation);

    ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
    ModelExportOutputConfig outputConfig = ModelExportOutputConfig.newBuilder().build();

    client.exportModelAsync(name, outputConfig).get();

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ExportModelRequest actualRequest = ((ExportModelRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertEquals(outputConfig, actualRequest.getOutputConfig());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void exportModelExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
      ModelExportOutputConfig outputConfig = ModelExportOutputConfig.newBuilder().build();
      client.exportModelAsync(name, outputConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void exportModelTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("exportModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoMl.addResponse(resultOperation);

    String name = "name3373707";
    ModelExportOutputConfig outputConfig = ModelExportOutputConfig.newBuilder().build();

    client.exportModelAsync(name, outputConfig).get();

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ExportModelRequest actualRequest = ((ExportModelRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertEquals(outputConfig, actualRequest.getOutputConfig());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void exportModelExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String name = "name3373707";
      ModelExportOutputConfig outputConfig = ModelExportOutputConfig.newBuilder().build();
      client.exportModelAsync(name, outputConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void exportEvaluatedExamplesTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("exportEvaluatedExamplesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoMl.addResponse(resultOperation);

    ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
    ExportEvaluatedExamplesOutputConfig outputConfig =
        ExportEvaluatedExamplesOutputConfig.newBuilder().build();

    client.exportEvaluatedExamplesAsync(name, outputConfig).get();

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ExportEvaluatedExamplesRequest actualRequest =
        ((ExportEvaluatedExamplesRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertEquals(outputConfig, actualRequest.getOutputConfig());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void exportEvaluatedExamplesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
      ExportEvaluatedExamplesOutputConfig outputConfig =
          ExportEvaluatedExamplesOutputConfig.newBuilder().build();
      client.exportEvaluatedExamplesAsync(name, outputConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void exportEvaluatedExamplesTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("exportEvaluatedExamplesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockAutoMl.addResponse(resultOperation);

    String name = "name3373707";
    ExportEvaluatedExamplesOutputConfig outputConfig =
        ExportEvaluatedExamplesOutputConfig.newBuilder().build();

    client.exportEvaluatedExamplesAsync(name, outputConfig).get();

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ExportEvaluatedExamplesRequest actualRequest =
        ((ExportEvaluatedExamplesRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertEquals(outputConfig, actualRequest.getOutputConfig());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void exportEvaluatedExamplesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String name = "name3373707";
      ExportEvaluatedExamplesOutputConfig outputConfig =
          ExportEvaluatedExamplesOutputConfig.newBuilder().build();
      client.exportEvaluatedExamplesAsync(name, outputConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void getModelEvaluationTest() throws Exception {
    ModelEvaluation expectedResponse =
        ModelEvaluation.newBuilder()
            .setName(
                ModelEvaluationName.of("[PROJECT]", "[LOCATION]", "[MODEL]", "[MODEL_EVALUATION]")
                    .toString())
            .setAnnotationSpecId("annotation_spec_id60690191")
            .setDisplayName("display_name1615086568")
            .setCreateTime(Timestamp.newBuilder().build())
            .setEvaluatedExampleCount(277565350)
            .build();
    mockAutoMl.addResponse(expectedResponse);

    ModelEvaluationName name =
        ModelEvaluationName.of("[PROJECT]", "[LOCATION]", "[MODEL]", "[MODEL_EVALUATION]");

    ModelEvaluation actualResponse = client.getModelEvaluation(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetModelEvaluationRequest actualRequest = ((GetModelEvaluationRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getModelEvaluationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      ModelEvaluationName name =
          ModelEvaluationName.of("[PROJECT]", "[LOCATION]", "[MODEL]", "[MODEL_EVALUATION]");
      client.getModelEvaluation(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getModelEvaluationTest2() throws Exception {
    ModelEvaluation expectedResponse =
        ModelEvaluation.newBuilder()
            .setName(
                ModelEvaluationName.of("[PROJECT]", "[LOCATION]", "[MODEL]", "[MODEL_EVALUATION]")
                    .toString())
            .setAnnotationSpecId("annotation_spec_id60690191")
            .setDisplayName("display_name1615086568")
            .setCreateTime(Timestamp.newBuilder().build())
            .setEvaluatedExampleCount(277565350)
            .build();
    mockAutoMl.addResponse(expectedResponse);

    String name = "name3373707";

    ModelEvaluation actualResponse = client.getModelEvaluation(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetModelEvaluationRequest actualRequest = ((GetModelEvaluationRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getModelEvaluationExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String name = "name3373707";
      client.getModelEvaluation(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listModelEvaluationsTest() throws Exception {
    ModelEvaluation responsesElement = ModelEvaluation.newBuilder().build();
    ListModelEvaluationsResponse expectedResponse =
        ListModelEvaluationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllModelEvaluation(Arrays.asList(responsesElement))
            .build();
    mockAutoMl.addResponse(expectedResponse);

    ModelName parent = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");

    ListModelEvaluationsPagedResponse pagedListResponse = client.listModelEvaluations(parent);

    List<ModelEvaluation> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getModelEvaluationList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListModelEvaluationsRequest actualRequest =
        ((ListModelEvaluationsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listModelEvaluationsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      ModelName parent = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
      client.listModelEvaluations(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listModelEvaluationsTest2() throws Exception {
    ModelEvaluation responsesElement = ModelEvaluation.newBuilder().build();
    ListModelEvaluationsResponse expectedResponse =
        ListModelEvaluationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllModelEvaluation(Arrays.asList(responsesElement))
            .build();
    mockAutoMl.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListModelEvaluationsPagedResponse pagedListResponse = client.listModelEvaluations(parent);

    List<ModelEvaluation> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getModelEvaluationList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAutoMl.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListModelEvaluationsRequest actualRequest =
        ((ListModelEvaluationsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listModelEvaluationsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutoMl.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listModelEvaluations(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
