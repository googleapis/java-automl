/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.automl.v1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.automl.v1.stub.AutoMlStub;
import com.google.cloud.automl.v1.stub.AutoMlStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: AutoML Server API.
 *
 * <p>The resource names are assigned by the server. The server never reuses names that it has
 * created after the resources with those names are deleted.
 *
 * <p>An ID of a resource is the last element of the item's resource name. For
 * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`, then the id for the item
 * is `{dataset_id}`.
 *
 * <p>Currently the only supported `location_id` is "us-central1".
 *
 * <p>On any input that is documented to expect a string parameter in snake_case or kebab-case,
 * either of those cases is accepted.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
 *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
 *   Dataset response = autoMlClient.getDataset(name);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the autoMlClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of AutoMlSettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * AutoMlSettings autoMlSettings =
 *     AutoMlSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AutoMlClient autoMlClient =
 *     AutoMlClient.create(autoMlSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * AutoMlSettings autoMlSettings =
 *     AutoMlSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AutoMlClient autoMlClient =
 *     AutoMlClient.create(autoMlSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class AutoMlClient implements BackgroundResource {
  private final AutoMlSettings settings;
  private final AutoMlStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of AutoMlClient with default settings. */
  public static final AutoMlClient create() throws IOException {
    return create(AutoMlSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AutoMlClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AutoMlClient create(AutoMlSettings settings) throws IOException {
    return new AutoMlClient(settings);
  }

  /**
   * Constructs an instance of AutoMlClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use AutoMlSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AutoMlClient create(AutoMlStub stub) {
    return new AutoMlClient(stub);
  }

  /**
   * Constructs an instance of AutoMlClient, using the given settings. This is protected so that it
   * is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected AutoMlClient(AutoMlSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AutoMlStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AutoMlClient(AutoMlStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final AutoMlSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AutoMlStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a dataset.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   Dataset dataset = Dataset.newBuilder().build();
   *   Dataset response = autoMlClient.createDatasetAsync(parent, dataset).get();
   * }
   * </code></pre>
   *
   * @param parent Required. The resource name of the project to create the dataset for.
   * @param dataset Required. The dataset to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Dataset, OperationMetadata> createDatasetAsync(
      LocationName parent, Dataset dataset) {
    CreateDatasetRequest request =
        CreateDatasetRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setDataset(dataset)
            .build();
    return createDatasetAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a dataset.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   Dataset dataset = Dataset.newBuilder().build();
   *   Dataset response = autoMlClient.createDatasetAsync(parent.toString(), dataset).get();
   * }
   * </code></pre>
   *
   * @param parent Required. The resource name of the project to create the dataset for.
   * @param dataset Required. The dataset to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Dataset, OperationMetadata> createDatasetAsync(
      String parent, Dataset dataset) {
    CreateDatasetRequest request =
        CreateDatasetRequest.newBuilder().setParent(parent).setDataset(dataset).build();
    return createDatasetAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a dataset.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   Dataset dataset = Dataset.newBuilder().build();
   *   CreateDatasetRequest request = CreateDatasetRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setDataset(dataset)
   *     .build();
   *   Dataset response = autoMlClient.createDatasetAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Dataset, OperationMetadata> createDatasetAsync(
      CreateDatasetRequest request) {
    return createDatasetOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a dataset.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   Dataset dataset = Dataset.newBuilder().build();
   *   CreateDatasetRequest request = CreateDatasetRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setDataset(dataset)
   *     .build();
   *   OperationFuture&lt;Dataset, OperationMetadata&gt; future = autoMlClient.createDatasetOperationCallable().futureCall(request);
   *   // Do something
   *   Dataset response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<CreateDatasetRequest, Dataset, OperationMetadata>
      createDatasetOperationCallable() {
    return stub.createDatasetOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a dataset.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   Dataset dataset = Dataset.newBuilder().build();
   *   CreateDatasetRequest request = CreateDatasetRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setDataset(dataset)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = autoMlClient.createDatasetCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateDatasetRequest, Operation> createDatasetCallable() {
    return stub.createDatasetCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a dataset.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
   *   Dataset response = autoMlClient.getDataset(name);
   * }
   * </code></pre>
   *
   * @param name Required. The resource name of the dataset to retrieve.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Dataset getDataset(DatasetName name) {
    GetDatasetRequest request =
        GetDatasetRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getDataset(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a dataset.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
   *   Dataset response = autoMlClient.getDataset(name.toString());
   * }
   * </code></pre>
   *
   * @param name Required. The resource name of the dataset to retrieve.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Dataset getDataset(String name) {
    GetDatasetRequest request = GetDatasetRequest.newBuilder().setName(name).build();
    return getDataset(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a dataset.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
   *   GetDatasetRequest request = GetDatasetRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   Dataset response = autoMlClient.getDataset(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Dataset getDataset(GetDatasetRequest request) {
    return getDatasetCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a dataset.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
   *   GetDatasetRequest request = GetDatasetRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Dataset&gt; future = autoMlClient.getDatasetCallable().futureCall(request);
   *   // Do something
   *   Dataset response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetDatasetRequest, Dataset> getDatasetCallable() {
    return stub.getDatasetCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists datasets in a project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (Dataset element : autoMlClient.listDatasets(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. The resource name of the project from which to list datasets.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListDatasetsPagedResponse listDatasets(LocationName parent) {
    ListDatasetsRequest request =
        ListDatasetsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listDatasets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists datasets in a project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (Dataset element : autoMlClient.listDatasets(parent.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. The resource name of the project from which to list datasets.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListDatasetsPagedResponse listDatasets(String parent) {
    ListDatasetsRequest request = ListDatasetsRequest.newBuilder().setParent(parent).build();
    return listDatasets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists datasets in a project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   ListDatasetsRequest request = ListDatasetsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   for (Dataset element : autoMlClient.listDatasets(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListDatasetsPagedResponse listDatasets(ListDatasetsRequest request) {
    return listDatasetsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists datasets in a project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   ListDatasetsRequest request = ListDatasetsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   ApiFuture&lt;ListDatasetsPagedResponse&gt; future = autoMlClient.listDatasetsPagedCallable().futureCall(request);
   *   // Do something
   *   for (Dataset element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListDatasetsRequest, ListDatasetsPagedResponse>
      listDatasetsPagedCallable() {
    return stub.listDatasetsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists datasets in a project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   ListDatasetsRequest request = ListDatasetsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   while (true) {
   *     ListDatasetsResponse response = autoMlClient.listDatasetsCallable().call(request);
   *     for (Dataset element : response.getDatasetsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListDatasetsRequest, ListDatasetsResponse> listDatasetsCallable() {
    return stub.listDatasetsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a dataset.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   Dataset dataset = Dataset.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Dataset response = autoMlClient.updateDataset(dataset, updateMask);
   * }
   * </code></pre>
   *
   * @param dataset Required. The dataset which replaces the resource on the server.
   * @param updateMask Required. The update mask applies to the resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Dataset updateDataset(Dataset dataset, FieldMask updateMask) {
    UpdateDatasetRequest request =
        UpdateDatasetRequest.newBuilder().setDataset(dataset).setUpdateMask(updateMask).build();
    return updateDataset(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a dataset.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   Dataset dataset = Dataset.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   UpdateDatasetRequest request = UpdateDatasetRequest.newBuilder()
   *     .setDataset(dataset)
   *     .setUpdateMask(updateMask)
   *     .build();
   *   Dataset response = autoMlClient.updateDataset(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Dataset updateDataset(UpdateDatasetRequest request) {
    return updateDatasetCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a dataset.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   Dataset dataset = Dataset.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   UpdateDatasetRequest request = UpdateDatasetRequest.newBuilder()
   *     .setDataset(dataset)
   *     .setUpdateMask(updateMask)
   *     .build();
   *   ApiFuture&lt;Dataset&gt; future = autoMlClient.updateDatasetCallable().futureCall(request);
   *   // Do something
   *   Dataset response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateDatasetRequest, Dataset> updateDatasetCallable() {
    return stub.updateDatasetCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a dataset and all of its contents. Returns empty response in the
   * [response][google.longrunning.Operation.response] field when it completes, and `delete_details`
   * in the [metadata][google.longrunning.Operation.metadata] field.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
   *   autoMlClient.deleteDatasetAsync(name).get();
   * }
   * </code></pre>
   *
   * @param name Required. The resource name of the dataset to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> deleteDatasetAsync(DatasetName name) {
    DeleteDatasetRequest request =
        DeleteDatasetRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return deleteDatasetAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a dataset and all of its contents. Returns empty response in the
   * [response][google.longrunning.Operation.response] field when it completes, and `delete_details`
   * in the [metadata][google.longrunning.Operation.metadata] field.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
   *   autoMlClient.deleteDatasetAsync(name.toString()).get();
   * }
   * </code></pre>
   *
   * @param name Required. The resource name of the dataset to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> deleteDatasetAsync(String name) {
    DeleteDatasetRequest request = DeleteDatasetRequest.newBuilder().setName(name).build();
    return deleteDatasetAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a dataset and all of its contents. Returns empty response in the
   * [response][google.longrunning.Operation.response] field when it completes, and `delete_details`
   * in the [metadata][google.longrunning.Operation.metadata] field.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
   *   DeleteDatasetRequest request = DeleteDatasetRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   autoMlClient.deleteDatasetAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> deleteDatasetAsync(
      DeleteDatasetRequest request) {
    return deleteDatasetOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a dataset and all of its contents. Returns empty response in the
   * [response][google.longrunning.Operation.response] field when it completes, and `delete_details`
   * in the [metadata][google.longrunning.Operation.metadata] field.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
   *   DeleteDatasetRequest request = DeleteDatasetRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   OperationFuture&lt;Empty, OperationMetadata&gt; future = autoMlClient.deleteDatasetOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<DeleteDatasetRequest, Empty, OperationMetadata>
      deleteDatasetOperationCallable() {
    return stub.deleteDatasetOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a dataset and all of its contents. Returns empty response in the
   * [response][google.longrunning.Operation.response] field when it completes, and `delete_details`
   * in the [metadata][google.longrunning.Operation.metadata] field.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
   *   DeleteDatasetRequest request = DeleteDatasetRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = autoMlClient.deleteDatasetCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteDatasetRequest, Operation> deleteDatasetCallable() {
    return stub.deleteDatasetCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Imports data into a dataset. For Tables this method can only be called on an empty Dataset.
   *
   * <p>For Tables: &#42; A [schema_inference_version][google.cloud.automl.v1.InputConfig.params]
   * parameter must be explicitly set. Returns an empty response in the
   * [response][google.longrunning.Operation.response] field when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
   *   InputConfig inputConfig = InputConfig.newBuilder().build();
   *   autoMlClient.importDataAsync(name, inputConfig).get();
   * }
   * </code></pre>
   *
   * @param name Required. Dataset name. Dataset must already exist. All imported annotations and
   *     examples will be added.
   * @param inputConfig Required. The desired input location and its domain specific semantics, if
   *     any.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> importDataAsync(
      DatasetName name, InputConfig inputConfig) {
    ImportDataRequest request =
        ImportDataRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setInputConfig(inputConfig)
            .build();
    return importDataAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Imports data into a dataset. For Tables this method can only be called on an empty Dataset.
   *
   * <p>For Tables: &#42; A [schema_inference_version][google.cloud.automl.v1.InputConfig.params]
   * parameter must be explicitly set. Returns an empty response in the
   * [response][google.longrunning.Operation.response] field when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
   *   InputConfig inputConfig = InputConfig.newBuilder().build();
   *   autoMlClient.importDataAsync(name.toString(), inputConfig).get();
   * }
   * </code></pre>
   *
   * @param name Required. Dataset name. Dataset must already exist. All imported annotations and
   *     examples will be added.
   * @param inputConfig Required. The desired input location and its domain specific semantics, if
   *     any.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> importDataAsync(
      String name, InputConfig inputConfig) {
    ImportDataRequest request =
        ImportDataRequest.newBuilder().setName(name).setInputConfig(inputConfig).build();
    return importDataAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Imports data into a dataset. For Tables this method can only be called on an empty Dataset.
   *
   * <p>For Tables: &#42; A [schema_inference_version][google.cloud.automl.v1.InputConfig.params]
   * parameter must be explicitly set. Returns an empty response in the
   * [response][google.longrunning.Operation.response] field when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
   *   InputConfig inputConfig = InputConfig.newBuilder().build();
   *   ImportDataRequest request = ImportDataRequest.newBuilder()
   *     .setName(name.toString())
   *     .setInputConfig(inputConfig)
   *     .build();
   *   autoMlClient.importDataAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> importDataAsync(
      ImportDataRequest request) {
    return importDataOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Imports data into a dataset. For Tables this method can only be called on an empty Dataset.
   *
   * <p>For Tables: &#42; A [schema_inference_version][google.cloud.automl.v1.InputConfig.params]
   * parameter must be explicitly set. Returns an empty response in the
   * [response][google.longrunning.Operation.response] field when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
   *   InputConfig inputConfig = InputConfig.newBuilder().build();
   *   ImportDataRequest request = ImportDataRequest.newBuilder()
   *     .setName(name.toString())
   *     .setInputConfig(inputConfig)
   *     .build();
   *   OperationFuture&lt;Empty, OperationMetadata&gt; future = autoMlClient.importDataOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<ImportDataRequest, Empty, OperationMetadata>
      importDataOperationCallable() {
    return stub.importDataOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Imports data into a dataset. For Tables this method can only be called on an empty Dataset.
   *
   * <p>For Tables: &#42; A [schema_inference_version][google.cloud.automl.v1.InputConfig.params]
   * parameter must be explicitly set. Returns an empty response in the
   * [response][google.longrunning.Operation.response] field when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
   *   InputConfig inputConfig = InputConfig.newBuilder().build();
   *   ImportDataRequest request = ImportDataRequest.newBuilder()
   *     .setName(name.toString())
   *     .setInputConfig(inputConfig)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = autoMlClient.importDataCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<ImportDataRequest, Operation> importDataCallable() {
    return stub.importDataCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Exports dataset's data to the provided output location. Returns an empty response in the
   * [response][google.longrunning.Operation.response] field when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
   *   OutputConfig outputConfig = OutputConfig.newBuilder().build();
   *   autoMlClient.exportDataAsync(name, outputConfig).get();
   * }
   * </code></pre>
   *
   * @param name Required. The resource name of the dataset.
   * @param outputConfig Required. The desired output location.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> exportDataAsync(
      DatasetName name, OutputConfig outputConfig) {
    ExportDataRequest request =
        ExportDataRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setOutputConfig(outputConfig)
            .build();
    return exportDataAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Exports dataset's data to the provided output location. Returns an empty response in the
   * [response][google.longrunning.Operation.response] field when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
   *   OutputConfig outputConfig = OutputConfig.newBuilder().build();
   *   autoMlClient.exportDataAsync(name.toString(), outputConfig).get();
   * }
   * </code></pre>
   *
   * @param name Required. The resource name of the dataset.
   * @param outputConfig Required. The desired output location.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> exportDataAsync(
      String name, OutputConfig outputConfig) {
    ExportDataRequest request =
        ExportDataRequest.newBuilder().setName(name).setOutputConfig(outputConfig).build();
    return exportDataAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Exports dataset's data to the provided output location. Returns an empty response in the
   * [response][google.longrunning.Operation.response] field when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
   *   OutputConfig outputConfig = OutputConfig.newBuilder().build();
   *   ExportDataRequest request = ExportDataRequest.newBuilder()
   *     .setName(name.toString())
   *     .setOutputConfig(outputConfig)
   *     .build();
   *   autoMlClient.exportDataAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> exportDataAsync(
      ExportDataRequest request) {
    return exportDataOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Exports dataset's data to the provided output location. Returns an empty response in the
   * [response][google.longrunning.Operation.response] field when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
   *   OutputConfig outputConfig = OutputConfig.newBuilder().build();
   *   ExportDataRequest request = ExportDataRequest.newBuilder()
   *     .setName(name.toString())
   *     .setOutputConfig(outputConfig)
   *     .build();
   *   OperationFuture&lt;Empty, OperationMetadata&gt; future = autoMlClient.exportDataOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<ExportDataRequest, Empty, OperationMetadata>
      exportDataOperationCallable() {
    return stub.exportDataOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Exports dataset's data to the provided output location. Returns an empty response in the
   * [response][google.longrunning.Operation.response] field when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
   *   OutputConfig outputConfig = OutputConfig.newBuilder().build();
   *   ExportDataRequest request = ExportDataRequest.newBuilder()
   *     .setName(name.toString())
   *     .setOutputConfig(outputConfig)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = autoMlClient.exportDataCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<ExportDataRequest, Operation> exportDataCallable() {
    return stub.exportDataCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets an annotation spec.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   AnnotationSpecName name = AnnotationSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[ANNOTATION_SPEC]");
   *   AnnotationSpec response = autoMlClient.getAnnotationSpec(name);
   * }
   * </code></pre>
   *
   * @param name Required. The resource name of the annotation spec to retrieve.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AnnotationSpec getAnnotationSpec(AnnotationSpecName name) {
    GetAnnotationSpecRequest request =
        GetAnnotationSpecRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getAnnotationSpec(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets an annotation spec.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   AnnotationSpecName name = AnnotationSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[ANNOTATION_SPEC]");
   *   AnnotationSpec response = autoMlClient.getAnnotationSpec(name.toString());
   * }
   * </code></pre>
   *
   * @param name Required. The resource name of the annotation spec to retrieve.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AnnotationSpec getAnnotationSpec(String name) {
    GetAnnotationSpecRequest request = GetAnnotationSpecRequest.newBuilder().setName(name).build();
    return getAnnotationSpec(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets an annotation spec.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   AnnotationSpecName name = AnnotationSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[ANNOTATION_SPEC]");
   *   GetAnnotationSpecRequest request = GetAnnotationSpecRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   AnnotationSpec response = autoMlClient.getAnnotationSpec(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AnnotationSpec getAnnotationSpec(GetAnnotationSpecRequest request) {
    return getAnnotationSpecCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets an annotation spec.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   AnnotationSpecName name = AnnotationSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[ANNOTATION_SPEC]");
   *   GetAnnotationSpecRequest request = GetAnnotationSpecRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;AnnotationSpec&gt; future = autoMlClient.getAnnotationSpecCallable().futureCall(request);
   *   // Do something
   *   AnnotationSpec response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetAnnotationSpecRequest, AnnotationSpec> getAnnotationSpecCallable() {
    return stub.getAnnotationSpecCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a model. Returns a Model in the [response][google.longrunning.Operation.response] field
   * when it completes. When you create a model, several model evaluations are created for it: a
   * global evaluation, and one evaluation for each annotation spec.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   Model model = Model.newBuilder().build();
   *   Model response = autoMlClient.createModelAsync(parent, model).get();
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the parent project where the model is being created.
   * @param model Required. The model to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Model, OperationMetadata> createModelAsync(
      LocationName parent, Model model) {
    CreateModelRequest request =
        CreateModelRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setModel(model)
            .build();
    return createModelAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a model. Returns a Model in the [response][google.longrunning.Operation.response] field
   * when it completes. When you create a model, several model evaluations are created for it: a
   * global evaluation, and one evaluation for each annotation spec.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   Model model = Model.newBuilder().build();
   *   Model response = autoMlClient.createModelAsync(parent.toString(), model).get();
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the parent project where the model is being created.
   * @param model Required. The model to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Model, OperationMetadata> createModelAsync(
      String parent, Model model) {
    CreateModelRequest request =
        CreateModelRequest.newBuilder().setParent(parent).setModel(model).build();
    return createModelAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a model. Returns a Model in the [response][google.longrunning.Operation.response] field
   * when it completes. When you create a model, several model evaluations are created for it: a
   * global evaluation, and one evaluation for each annotation spec.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   Model model = Model.newBuilder().build();
   *   CreateModelRequest request = CreateModelRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setModel(model)
   *     .build();
   *   Model response = autoMlClient.createModelAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Model, OperationMetadata> createModelAsync(
      CreateModelRequest request) {
    return createModelOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a model. Returns a Model in the [response][google.longrunning.Operation.response] field
   * when it completes. When you create a model, several model evaluations are created for it: a
   * global evaluation, and one evaluation for each annotation spec.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   Model model = Model.newBuilder().build();
   *   CreateModelRequest request = CreateModelRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setModel(model)
   *     .build();
   *   OperationFuture&lt;Model, OperationMetadata&gt; future = autoMlClient.createModelOperationCallable().futureCall(request);
   *   // Do something
   *   Model response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<CreateModelRequest, Model, OperationMetadata>
      createModelOperationCallable() {
    return stub.createModelOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a model. Returns a Model in the [response][google.longrunning.Operation.response] field
   * when it completes. When you create a model, several model evaluations are created for it: a
   * global evaluation, and one evaluation for each annotation spec.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   Model model = Model.newBuilder().build();
   *   CreateModelRequest request = CreateModelRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setModel(model)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = autoMlClient.createModelCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateModelRequest, Operation> createModelCallable() {
    return stub.createModelCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a model.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   Model response = autoMlClient.getModel(name);
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the model.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Model getModel(ModelName name) {
    GetModelRequest request =
        GetModelRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getModel(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a model.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   Model response = autoMlClient.getModel(name.toString());
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the model.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Model getModel(String name) {
    GetModelRequest request = GetModelRequest.newBuilder().setName(name).build();
    return getModel(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a model.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   GetModelRequest request = GetModelRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   Model response = autoMlClient.getModel(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Model getModel(GetModelRequest request) {
    return getModelCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a model.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   GetModelRequest request = GetModelRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Model&gt; future = autoMlClient.getModelCallable().futureCall(request);
   *   // Do something
   *   Model response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetModelRequest, Model> getModelCallable() {
    return stub.getModelCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists models.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (Model element : autoMlClient.listModels(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the project, from which to list the models.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListModelsPagedResponse listModels(LocationName parent) {
    ListModelsRequest request =
        ListModelsRequest.newBuilder().setParent(parent == null ? null : parent.toString()).build();
    return listModels(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists models.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (Model element : autoMlClient.listModels(parent.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the project, from which to list the models.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListModelsPagedResponse listModels(String parent) {
    ListModelsRequest request = ListModelsRequest.newBuilder().setParent(parent).build();
    return listModels(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists models.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   ListModelsRequest request = ListModelsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   for (Model element : autoMlClient.listModels(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListModelsPagedResponse listModels(ListModelsRequest request) {
    return listModelsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists models.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   ListModelsRequest request = ListModelsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   ApiFuture&lt;ListModelsPagedResponse&gt; future = autoMlClient.listModelsPagedCallable().futureCall(request);
   *   // Do something
   *   for (Model element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListModelsRequest, ListModelsPagedResponse> listModelsPagedCallable() {
    return stub.listModelsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists models.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   ListModelsRequest request = ListModelsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   while (true) {
   *     ListModelsResponse response = autoMlClient.listModelsCallable().call(request);
   *     for (Model element : response.getModelList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListModelsRequest, ListModelsResponse> listModelsCallable() {
    return stub.listModelsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a model. Returns `google.protobuf.Empty` in the
   * [response][google.longrunning.Operation.response] field when it completes, and `delete_details`
   * in the [metadata][google.longrunning.Operation.metadata] field.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   autoMlClient.deleteModelAsync(name).get();
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the model being deleted.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> deleteModelAsync(ModelName name) {
    DeleteModelRequest request =
        DeleteModelRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return deleteModelAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a model. Returns `google.protobuf.Empty` in the
   * [response][google.longrunning.Operation.response] field when it completes, and `delete_details`
   * in the [metadata][google.longrunning.Operation.metadata] field.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   autoMlClient.deleteModelAsync(name.toString()).get();
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the model being deleted.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> deleteModelAsync(String name) {
    DeleteModelRequest request = DeleteModelRequest.newBuilder().setName(name).build();
    return deleteModelAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a model. Returns `google.protobuf.Empty` in the
   * [response][google.longrunning.Operation.response] field when it completes, and `delete_details`
   * in the [metadata][google.longrunning.Operation.metadata] field.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   DeleteModelRequest request = DeleteModelRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   autoMlClient.deleteModelAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> deleteModelAsync(
      DeleteModelRequest request) {
    return deleteModelOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a model. Returns `google.protobuf.Empty` in the
   * [response][google.longrunning.Operation.response] field when it completes, and `delete_details`
   * in the [metadata][google.longrunning.Operation.metadata] field.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   DeleteModelRequest request = DeleteModelRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   OperationFuture&lt;Empty, OperationMetadata&gt; future = autoMlClient.deleteModelOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<DeleteModelRequest, Empty, OperationMetadata>
      deleteModelOperationCallable() {
    return stub.deleteModelOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a model. Returns `google.protobuf.Empty` in the
   * [response][google.longrunning.Operation.response] field when it completes, and `delete_details`
   * in the [metadata][google.longrunning.Operation.metadata] field.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   DeleteModelRequest request = DeleteModelRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = autoMlClient.deleteModelCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteModelRequest, Operation> deleteModelCallable() {
    return stub.deleteModelCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a model.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   Model model = Model.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Model response = autoMlClient.updateModel(model, updateMask);
   * }
   * </code></pre>
   *
   * @param model Required. The model which replaces the resource on the server.
   * @param updateMask Required. The update mask applies to the resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Model updateModel(Model model, FieldMask updateMask) {
    UpdateModelRequest request =
        UpdateModelRequest.newBuilder().setModel(model).setUpdateMask(updateMask).build();
    return updateModel(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a model.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   Model model = Model.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   UpdateModelRequest request = UpdateModelRequest.newBuilder()
   *     .setModel(model)
   *     .setUpdateMask(updateMask)
   *     .build();
   *   Model response = autoMlClient.updateModel(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Model updateModel(UpdateModelRequest request) {
    return updateModelCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a model.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   Model model = Model.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   UpdateModelRequest request = UpdateModelRequest.newBuilder()
   *     .setModel(model)
   *     .setUpdateMask(updateMask)
   *     .build();
   *   ApiFuture&lt;Model&gt; future = autoMlClient.updateModelCallable().futureCall(request);
   *   // Do something
   *   Model response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateModelRequest, Model> updateModelCallable() {
    return stub.updateModelCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deploys a model. If a model is already deployed, deploying it with the same parameters has no
   * effect. Deploying with different parametrs (as e.g. changing
   *
   * <p>[node_number][google.cloud.automl.v1p1beta.ImageObjectDetectionModelDeploymentMetadata.node_number])
   * will reset the deployment state without pausing the model's availability.
   *
   * <p>Only applicable for Text Classification, Image Object Detection , Tables, and Image
   * Segmentation; all other domains manage deployment automatically.
   *
   * <p>Returns an empty response in the [response][google.longrunning.Operation.response] field
   * when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   autoMlClient.deployModelAsync(name).get();
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the model to deploy.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> deployModelAsync(ModelName name) {
    DeployModelRequest request =
        DeployModelRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return deployModelAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deploys a model. If a model is already deployed, deploying it with the same parameters has no
   * effect. Deploying with different parametrs (as e.g. changing
   *
   * <p>[node_number][google.cloud.automl.v1p1beta.ImageObjectDetectionModelDeploymentMetadata.node_number])
   * will reset the deployment state without pausing the model's availability.
   *
   * <p>Only applicable for Text Classification, Image Object Detection , Tables, and Image
   * Segmentation; all other domains manage deployment automatically.
   *
   * <p>Returns an empty response in the [response][google.longrunning.Operation.response] field
   * when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   autoMlClient.deployModelAsync(name.toString()).get();
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the model to deploy.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> deployModelAsync(String name) {
    DeployModelRequest request = DeployModelRequest.newBuilder().setName(name).build();
    return deployModelAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deploys a model. If a model is already deployed, deploying it with the same parameters has no
   * effect. Deploying with different parametrs (as e.g. changing
   *
   * <p>[node_number][google.cloud.automl.v1p1beta.ImageObjectDetectionModelDeploymentMetadata.node_number])
   * will reset the deployment state without pausing the model's availability.
   *
   * <p>Only applicable for Text Classification, Image Object Detection , Tables, and Image
   * Segmentation; all other domains manage deployment automatically.
   *
   * <p>Returns an empty response in the [response][google.longrunning.Operation.response] field
   * when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   DeployModelRequest request = DeployModelRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   autoMlClient.deployModelAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> deployModelAsync(
      DeployModelRequest request) {
    return deployModelOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deploys a model. If a model is already deployed, deploying it with the same parameters has no
   * effect. Deploying with different parametrs (as e.g. changing
   *
   * <p>[node_number][google.cloud.automl.v1p1beta.ImageObjectDetectionModelDeploymentMetadata.node_number])
   * will reset the deployment state without pausing the model's availability.
   *
   * <p>Only applicable for Text Classification, Image Object Detection , Tables, and Image
   * Segmentation; all other domains manage deployment automatically.
   *
   * <p>Returns an empty response in the [response][google.longrunning.Operation.response] field
   * when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   DeployModelRequest request = DeployModelRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   OperationFuture&lt;Empty, OperationMetadata&gt; future = autoMlClient.deployModelOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<DeployModelRequest, Empty, OperationMetadata>
      deployModelOperationCallable() {
    return stub.deployModelOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deploys a model. If a model is already deployed, deploying it with the same parameters has no
   * effect. Deploying with different parametrs (as e.g. changing
   *
   * <p>[node_number][google.cloud.automl.v1p1beta.ImageObjectDetectionModelDeploymentMetadata.node_number])
   * will reset the deployment state without pausing the model's availability.
   *
   * <p>Only applicable for Text Classification, Image Object Detection , Tables, and Image
   * Segmentation; all other domains manage deployment automatically.
   *
   * <p>Returns an empty response in the [response][google.longrunning.Operation.response] field
   * when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   DeployModelRequest request = DeployModelRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = autoMlClient.deployModelCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeployModelRequest, Operation> deployModelCallable() {
    return stub.deployModelCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Undeploys a model. If the model is not deployed this method has no effect.
   *
   * <p>Only applicable for Text Classification, Image Object Detection and Tables; all other
   * domains manage deployment automatically.
   *
   * <p>Returns an empty response in the [response][google.longrunning.Operation.response] field
   * when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   autoMlClient.undeployModelAsync(name).get();
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the model to undeploy.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> undeployModelAsync(ModelName name) {
    UndeployModelRequest request =
        UndeployModelRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return undeployModelAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Undeploys a model. If the model is not deployed this method has no effect.
   *
   * <p>Only applicable for Text Classification, Image Object Detection and Tables; all other
   * domains manage deployment automatically.
   *
   * <p>Returns an empty response in the [response][google.longrunning.Operation.response] field
   * when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   autoMlClient.undeployModelAsync(name.toString()).get();
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the model to undeploy.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> undeployModelAsync(String name) {
    UndeployModelRequest request = UndeployModelRequest.newBuilder().setName(name).build();
    return undeployModelAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Undeploys a model. If the model is not deployed this method has no effect.
   *
   * <p>Only applicable for Text Classification, Image Object Detection and Tables; all other
   * domains manage deployment automatically.
   *
   * <p>Returns an empty response in the [response][google.longrunning.Operation.response] field
   * when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   UndeployModelRequest request = UndeployModelRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   autoMlClient.undeployModelAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> undeployModelAsync(
      UndeployModelRequest request) {
    return undeployModelOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Undeploys a model. If the model is not deployed this method has no effect.
   *
   * <p>Only applicable for Text Classification, Image Object Detection and Tables; all other
   * domains manage deployment automatically.
   *
   * <p>Returns an empty response in the [response][google.longrunning.Operation.response] field
   * when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   UndeployModelRequest request = UndeployModelRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   OperationFuture&lt;Empty, OperationMetadata&gt; future = autoMlClient.undeployModelOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<UndeployModelRequest, Empty, OperationMetadata>
      undeployModelOperationCallable() {
    return stub.undeployModelOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Undeploys a model. If the model is not deployed this method has no effect.
   *
   * <p>Only applicable for Text Classification, Image Object Detection and Tables; all other
   * domains manage deployment automatically.
   *
   * <p>Returns an empty response in the [response][google.longrunning.Operation.response] field
   * when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   UndeployModelRequest request = UndeployModelRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = autoMlClient.undeployModelCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UndeployModelRequest, Operation> undeployModelCallable() {
    return stub.undeployModelCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Exports a trained, "export-able", model to a user specified Google Cloud Storage location. A
   * model is considered export-able if and only if it has an export format defined for it in
   * [ModelExportOutputConfig][google.cloud.automl.v1.ModelExportOutputConfig].
   *
   * <p>Returns an empty response in the [response][google.longrunning.Operation.response] field
   * when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   ModelExportOutputConfig outputConfig = ModelExportOutputConfig.newBuilder().build();
   *   autoMlClient.exportModelAsync(name, outputConfig).get();
   * }
   * </code></pre>
   *
   * @param name Required. The resource name of the model to export.
   * @param outputConfig Required. The desired output location and configuration.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> exportModelAsync(
      ModelName name, ModelExportOutputConfig outputConfig) {
    ExportModelRequest request =
        ExportModelRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setOutputConfig(outputConfig)
            .build();
    return exportModelAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Exports a trained, "export-able", model to a user specified Google Cloud Storage location. A
   * model is considered export-able if and only if it has an export format defined for it in
   * [ModelExportOutputConfig][google.cloud.automl.v1.ModelExportOutputConfig].
   *
   * <p>Returns an empty response in the [response][google.longrunning.Operation.response] field
   * when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   ModelExportOutputConfig outputConfig = ModelExportOutputConfig.newBuilder().build();
   *   autoMlClient.exportModelAsync(name.toString(), outputConfig).get();
   * }
   * </code></pre>
   *
   * @param name Required. The resource name of the model to export.
   * @param outputConfig Required. The desired output location and configuration.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> exportModelAsync(
      String name, ModelExportOutputConfig outputConfig) {
    ExportModelRequest request =
        ExportModelRequest.newBuilder().setName(name).setOutputConfig(outputConfig).build();
    return exportModelAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Exports a trained, "export-able", model to a user specified Google Cloud Storage location. A
   * model is considered export-able if and only if it has an export format defined for it in
   * [ModelExportOutputConfig][google.cloud.automl.v1.ModelExportOutputConfig].
   *
   * <p>Returns an empty response in the [response][google.longrunning.Operation.response] field
   * when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   ModelExportOutputConfig outputConfig = ModelExportOutputConfig.newBuilder().build();
   *   ExportModelRequest request = ExportModelRequest.newBuilder()
   *     .setName(name.toString())
   *     .setOutputConfig(outputConfig)
   *     .build();
   *   autoMlClient.exportModelAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, OperationMetadata> exportModelAsync(
      ExportModelRequest request) {
    return exportModelOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Exports a trained, "export-able", model to a user specified Google Cloud Storage location. A
   * model is considered export-able if and only if it has an export format defined for it in
   * [ModelExportOutputConfig][google.cloud.automl.v1.ModelExportOutputConfig].
   *
   * <p>Returns an empty response in the [response][google.longrunning.Operation.response] field
   * when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   ModelExportOutputConfig outputConfig = ModelExportOutputConfig.newBuilder().build();
   *   ExportModelRequest request = ExportModelRequest.newBuilder()
   *     .setName(name.toString())
   *     .setOutputConfig(outputConfig)
   *     .build();
   *   OperationFuture&lt;Empty, OperationMetadata&gt; future = autoMlClient.exportModelOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<ExportModelRequest, Empty, OperationMetadata>
      exportModelOperationCallable() {
    return stub.exportModelOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Exports a trained, "export-able", model to a user specified Google Cloud Storage location. A
   * model is considered export-able if and only if it has an export format defined for it in
   * [ModelExportOutputConfig][google.cloud.automl.v1.ModelExportOutputConfig].
   *
   * <p>Returns an empty response in the [response][google.longrunning.Operation.response] field
   * when it completes.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   ModelExportOutputConfig outputConfig = ModelExportOutputConfig.newBuilder().build();
   *   ExportModelRequest request = ExportModelRequest.newBuilder()
   *     .setName(name.toString())
   *     .setOutputConfig(outputConfig)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = autoMlClient.exportModelCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<ExportModelRequest, Operation> exportModelCallable() {
    return stub.exportModelCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a model evaluation.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelEvaluationName name = ModelEvaluationName.of("[PROJECT]", "[LOCATION]", "[MODEL]", "[MODEL_EVALUATION]");
   *   ModelEvaluation response = autoMlClient.getModelEvaluation(name);
   * }
   * </code></pre>
   *
   * @param name Required. Resource name for the model evaluation.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ModelEvaluation getModelEvaluation(ModelEvaluationName name) {
    GetModelEvaluationRequest request =
        GetModelEvaluationRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getModelEvaluation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a model evaluation.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelEvaluationName name = ModelEvaluationName.of("[PROJECT]", "[LOCATION]", "[MODEL]", "[MODEL_EVALUATION]");
   *   ModelEvaluation response = autoMlClient.getModelEvaluation(name.toString());
   * }
   * </code></pre>
   *
   * @param name Required. Resource name for the model evaluation.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ModelEvaluation getModelEvaluation(String name) {
    GetModelEvaluationRequest request =
        GetModelEvaluationRequest.newBuilder().setName(name).build();
    return getModelEvaluation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a model evaluation.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelEvaluationName name = ModelEvaluationName.of("[PROJECT]", "[LOCATION]", "[MODEL]", "[MODEL_EVALUATION]");
   *   GetModelEvaluationRequest request = GetModelEvaluationRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ModelEvaluation response = autoMlClient.getModelEvaluation(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ModelEvaluation getModelEvaluation(GetModelEvaluationRequest request) {
    return getModelEvaluationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a model evaluation.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelEvaluationName name = ModelEvaluationName.of("[PROJECT]", "[LOCATION]", "[MODEL]", "[MODEL_EVALUATION]");
   *   GetModelEvaluationRequest request = GetModelEvaluationRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;ModelEvaluation&gt; future = autoMlClient.getModelEvaluationCallable().futureCall(request);
   *   // Do something
   *   ModelEvaluation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetModelEvaluationRequest, ModelEvaluation>
      getModelEvaluationCallable() {
    return stub.getModelEvaluationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists model evaluations.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName parent = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   String filter = "";
   *   for (ModelEvaluation element : autoMlClient.listModelEvaluations(parent, filter).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the model to list the model evaluations for. If
   *     modelId is set as "-", this will list model evaluations from across all models of the
   *     parent location.
   * @param filter Required. An expression for filtering the results of the request.
   *     <p>&#42; `annotation_spec_id` - for =, != or existence. See example below for the last.
   *     <p>Some examples of using the filter are:
   *     <p>&#42; `annotation_spec_id!=4` --&gt; The model evaluation was done for annotation spec
   *     with ID different than 4. &#42; `NOT annotation_spec_id:&#42;` --&gt; The model evaluation
   *     was done for aggregate of all annotation specs.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListModelEvaluationsPagedResponse listModelEvaluations(
      ModelName parent, String filter) {
    ListModelEvaluationsRequest request =
        ListModelEvaluationsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setFilter(filter)
            .build();
    return listModelEvaluations(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists model evaluations.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName parent = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   String filter = "";
   *   for (ModelEvaluation element : autoMlClient.listModelEvaluations(parent.toString(), filter).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the model to list the model evaluations for. If
   *     modelId is set as "-", this will list model evaluations from across all models of the
   *     parent location.
   * @param filter Required. An expression for filtering the results of the request.
   *     <p>&#42; `annotation_spec_id` - for =, != or existence. See example below for the last.
   *     <p>Some examples of using the filter are:
   *     <p>&#42; `annotation_spec_id!=4` --&gt; The model evaluation was done for annotation spec
   *     with ID different than 4. &#42; `NOT annotation_spec_id:&#42;` --&gt; The model evaluation
   *     was done for aggregate of all annotation specs.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListModelEvaluationsPagedResponse listModelEvaluations(
      String parent, String filter) {
    ListModelEvaluationsRequest request =
        ListModelEvaluationsRequest.newBuilder().setParent(parent).setFilter(filter).build();
    return listModelEvaluations(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists model evaluations.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName parent = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   String filter = "";
   *   ListModelEvaluationsRequest request = ListModelEvaluationsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setFilter(filter)
   *     .build();
   *   for (ModelEvaluation element : autoMlClient.listModelEvaluations(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListModelEvaluationsPagedResponse listModelEvaluations(
      ListModelEvaluationsRequest request) {
    return listModelEvaluationsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists model evaluations.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName parent = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   String filter = "";
   *   ListModelEvaluationsRequest request = ListModelEvaluationsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setFilter(filter)
   *     .build();
   *   ApiFuture&lt;ListModelEvaluationsPagedResponse&gt; future = autoMlClient.listModelEvaluationsPagedCallable().futureCall(request);
   *   // Do something
   *   for (ModelEvaluation element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListModelEvaluationsRequest, ListModelEvaluationsPagedResponse>
      listModelEvaluationsPagedCallable() {
    return stub.listModelEvaluationsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists model evaluations.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
   *   ModelName parent = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
   *   String filter = "";
   *   ListModelEvaluationsRequest request = ListModelEvaluationsRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setFilter(filter)
   *     .build();
   *   while (true) {
   *     ListModelEvaluationsResponse response = autoMlClient.listModelEvaluationsCallable().call(request);
   *     for (ModelEvaluation element : response.getModelEvaluationList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListModelEvaluationsRequest, ListModelEvaluationsResponse>
      listModelEvaluationsCallable() {
    return stub.listModelEvaluationsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListDatasetsPagedResponse
      extends AbstractPagedListResponse<
          ListDatasetsRequest,
          ListDatasetsResponse,
          Dataset,
          ListDatasetsPage,
          ListDatasetsFixedSizeCollection> {

    public static ApiFuture<ListDatasetsPagedResponse> createAsync(
        PageContext<ListDatasetsRequest, ListDatasetsResponse, Dataset> context,
        ApiFuture<ListDatasetsResponse> futureResponse) {
      ApiFuture<ListDatasetsPage> futurePage =
          ListDatasetsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListDatasetsPage, ListDatasetsPagedResponse>() {
            @Override
            public ListDatasetsPagedResponse apply(ListDatasetsPage input) {
              return new ListDatasetsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListDatasetsPagedResponse(ListDatasetsPage page) {
      super(page, ListDatasetsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListDatasetsPage
      extends AbstractPage<ListDatasetsRequest, ListDatasetsResponse, Dataset, ListDatasetsPage> {

    private ListDatasetsPage(
        PageContext<ListDatasetsRequest, ListDatasetsResponse, Dataset> context,
        ListDatasetsResponse response) {
      super(context, response);
    }

    private static ListDatasetsPage createEmptyPage() {
      return new ListDatasetsPage(null, null);
    }

    @Override
    protected ListDatasetsPage createPage(
        PageContext<ListDatasetsRequest, ListDatasetsResponse, Dataset> context,
        ListDatasetsResponse response) {
      return new ListDatasetsPage(context, response);
    }

    @Override
    public ApiFuture<ListDatasetsPage> createPageAsync(
        PageContext<ListDatasetsRequest, ListDatasetsResponse, Dataset> context,
        ApiFuture<ListDatasetsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListDatasetsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListDatasetsRequest,
          ListDatasetsResponse,
          Dataset,
          ListDatasetsPage,
          ListDatasetsFixedSizeCollection> {

    private ListDatasetsFixedSizeCollection(List<ListDatasetsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListDatasetsFixedSizeCollection createEmptyCollection() {
      return new ListDatasetsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListDatasetsFixedSizeCollection createCollection(
        List<ListDatasetsPage> pages, int collectionSize) {
      return new ListDatasetsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListModelsPagedResponse
      extends AbstractPagedListResponse<
          ListModelsRequest,
          ListModelsResponse,
          Model,
          ListModelsPage,
          ListModelsFixedSizeCollection> {

    public static ApiFuture<ListModelsPagedResponse> createAsync(
        PageContext<ListModelsRequest, ListModelsResponse, Model> context,
        ApiFuture<ListModelsResponse> futureResponse) {
      ApiFuture<ListModelsPage> futurePage =
          ListModelsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListModelsPage, ListModelsPagedResponse>() {
            @Override
            public ListModelsPagedResponse apply(ListModelsPage input) {
              return new ListModelsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListModelsPagedResponse(ListModelsPage page) {
      super(page, ListModelsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListModelsPage
      extends AbstractPage<ListModelsRequest, ListModelsResponse, Model, ListModelsPage> {

    private ListModelsPage(
        PageContext<ListModelsRequest, ListModelsResponse, Model> context,
        ListModelsResponse response) {
      super(context, response);
    }

    private static ListModelsPage createEmptyPage() {
      return new ListModelsPage(null, null);
    }

    @Override
    protected ListModelsPage createPage(
        PageContext<ListModelsRequest, ListModelsResponse, Model> context,
        ListModelsResponse response) {
      return new ListModelsPage(context, response);
    }

    @Override
    public ApiFuture<ListModelsPage> createPageAsync(
        PageContext<ListModelsRequest, ListModelsResponse, Model> context,
        ApiFuture<ListModelsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListModelsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListModelsRequest,
          ListModelsResponse,
          Model,
          ListModelsPage,
          ListModelsFixedSizeCollection> {

    private ListModelsFixedSizeCollection(List<ListModelsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListModelsFixedSizeCollection createEmptyCollection() {
      return new ListModelsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListModelsFixedSizeCollection createCollection(
        List<ListModelsPage> pages, int collectionSize) {
      return new ListModelsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListModelEvaluationsPagedResponse
      extends AbstractPagedListResponse<
          ListModelEvaluationsRequest,
          ListModelEvaluationsResponse,
          ModelEvaluation,
          ListModelEvaluationsPage,
          ListModelEvaluationsFixedSizeCollection> {

    public static ApiFuture<ListModelEvaluationsPagedResponse> createAsync(
        PageContext<ListModelEvaluationsRequest, ListModelEvaluationsResponse, ModelEvaluation>
            context,
        ApiFuture<ListModelEvaluationsResponse> futureResponse) {
      ApiFuture<ListModelEvaluationsPage> futurePage =
          ListModelEvaluationsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListModelEvaluationsPage, ListModelEvaluationsPagedResponse>() {
            @Override
            public ListModelEvaluationsPagedResponse apply(ListModelEvaluationsPage input) {
              return new ListModelEvaluationsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListModelEvaluationsPagedResponse(ListModelEvaluationsPage page) {
      super(page, ListModelEvaluationsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListModelEvaluationsPage
      extends AbstractPage<
          ListModelEvaluationsRequest,
          ListModelEvaluationsResponse,
          ModelEvaluation,
          ListModelEvaluationsPage> {

    private ListModelEvaluationsPage(
        PageContext<ListModelEvaluationsRequest, ListModelEvaluationsResponse, ModelEvaluation>
            context,
        ListModelEvaluationsResponse response) {
      super(context, response);
    }

    private static ListModelEvaluationsPage createEmptyPage() {
      return new ListModelEvaluationsPage(null, null);
    }

    @Override
    protected ListModelEvaluationsPage createPage(
        PageContext<ListModelEvaluationsRequest, ListModelEvaluationsResponse, ModelEvaluation>
            context,
        ListModelEvaluationsResponse response) {
      return new ListModelEvaluationsPage(context, response);
    }

    @Override
    public ApiFuture<ListModelEvaluationsPage> createPageAsync(
        PageContext<ListModelEvaluationsRequest, ListModelEvaluationsResponse, ModelEvaluation>
            context,
        ApiFuture<ListModelEvaluationsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListModelEvaluationsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListModelEvaluationsRequest,
          ListModelEvaluationsResponse,
          ModelEvaluation,
          ListModelEvaluationsPage,
          ListModelEvaluationsFixedSizeCollection> {

    private ListModelEvaluationsFixedSizeCollection(
        List<ListModelEvaluationsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListModelEvaluationsFixedSizeCollection createEmptyCollection() {
      return new ListModelEvaluationsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListModelEvaluationsFixedSizeCollection createCollection(
        List<ListModelEvaluationsPage> pages, int collectionSize) {
      return new ListModelEvaluationsFixedSizeCollection(pages, collectionSize);
    }
  }
}
