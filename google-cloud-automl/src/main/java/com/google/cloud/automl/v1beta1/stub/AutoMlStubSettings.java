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

package com.google.cloud.automl.v1beta1.stub;

import static com.google.cloud.automl.v1beta1.AutoMlClient.ListColumnSpecsPagedResponse;
import static com.google.cloud.automl.v1beta1.AutoMlClient.ListDatasetsPagedResponse;
import static com.google.cloud.automl.v1beta1.AutoMlClient.ListModelEvaluationsPagedResponse;
import static com.google.cloud.automl.v1beta1.AutoMlClient.ListModelsPagedResponse;
import static com.google.cloud.automl.v1beta1.AutoMlClient.ListTableSpecsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.automl.v1beta1.AnnotationSpec;
import com.google.cloud.automl.v1beta1.ColumnSpec;
import com.google.cloud.automl.v1beta1.CreateDatasetRequest;
import com.google.cloud.automl.v1beta1.CreateModelRequest;
import com.google.cloud.automl.v1beta1.Dataset;
import com.google.cloud.automl.v1beta1.DeleteDatasetRequest;
import com.google.cloud.automl.v1beta1.DeleteModelRequest;
import com.google.cloud.automl.v1beta1.DeployModelRequest;
import com.google.cloud.automl.v1beta1.ExportDataRequest;
import com.google.cloud.automl.v1beta1.ExportEvaluatedExamplesRequest;
import com.google.cloud.automl.v1beta1.ExportModelRequest;
import com.google.cloud.automl.v1beta1.GetAnnotationSpecRequest;
import com.google.cloud.automl.v1beta1.GetColumnSpecRequest;
import com.google.cloud.automl.v1beta1.GetDatasetRequest;
import com.google.cloud.automl.v1beta1.GetModelEvaluationRequest;
import com.google.cloud.automl.v1beta1.GetModelRequest;
import com.google.cloud.automl.v1beta1.GetTableSpecRequest;
import com.google.cloud.automl.v1beta1.ImportDataRequest;
import com.google.cloud.automl.v1beta1.ListColumnSpecsRequest;
import com.google.cloud.automl.v1beta1.ListColumnSpecsResponse;
import com.google.cloud.automl.v1beta1.ListDatasetsRequest;
import com.google.cloud.automl.v1beta1.ListDatasetsResponse;
import com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest;
import com.google.cloud.automl.v1beta1.ListModelEvaluationsResponse;
import com.google.cloud.automl.v1beta1.ListModelsRequest;
import com.google.cloud.automl.v1beta1.ListModelsResponse;
import com.google.cloud.automl.v1beta1.ListTableSpecsRequest;
import com.google.cloud.automl.v1beta1.ListTableSpecsResponse;
import com.google.cloud.automl.v1beta1.Model;
import com.google.cloud.automl.v1beta1.ModelEvaluation;
import com.google.cloud.automl.v1beta1.OperationMetadata;
import com.google.cloud.automl.v1beta1.TableSpec;
import com.google.cloud.automl.v1beta1.UndeployModelRequest;
import com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest;
import com.google.cloud.automl.v1beta1.UpdateDatasetRequest;
import com.google.cloud.automl.v1beta1.UpdateTableSpecRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link AutoMlStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (automl.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of createDataset to 30 seconds:
 *
 * <pre>{@code
 * AutoMlStubSettings.Builder autoMlSettingsBuilder = AutoMlStubSettings.newBuilder();
 * autoMlSettingsBuilder
 *     .createDatasetSettings()
 *     .setRetrySettings(
 *         autoMlSettingsBuilder
 *             .createDatasetSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * AutoMlStubSettings autoMlSettings = autoMlSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class AutoMlStubSettings extends StubSettings<AutoMlStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<CreateDatasetRequest, Dataset> createDatasetSettings;
  private final UnaryCallSettings<GetDatasetRequest, Dataset> getDatasetSettings;
  private final PagedCallSettings<
          ListDatasetsRequest, ListDatasetsResponse, ListDatasetsPagedResponse>
      listDatasetsSettings;
  private final UnaryCallSettings<UpdateDatasetRequest, Dataset> updateDatasetSettings;
  private final UnaryCallSettings<DeleteDatasetRequest, Operation> deleteDatasetSettings;
  private final OperationCallSettings<DeleteDatasetRequest, Empty, OperationMetadata>
      deleteDatasetOperationSettings;
  private final UnaryCallSettings<ImportDataRequest, Operation> importDataSettings;
  private final OperationCallSettings<ImportDataRequest, Empty, OperationMetadata>
      importDataOperationSettings;
  private final UnaryCallSettings<ExportDataRequest, Operation> exportDataSettings;
  private final OperationCallSettings<ExportDataRequest, Empty, OperationMetadata>
      exportDataOperationSettings;
  private final UnaryCallSettings<GetAnnotationSpecRequest, AnnotationSpec>
      getAnnotationSpecSettings;
  private final UnaryCallSettings<GetTableSpecRequest, TableSpec> getTableSpecSettings;
  private final PagedCallSettings<
          ListTableSpecsRequest, ListTableSpecsResponse, ListTableSpecsPagedResponse>
      listTableSpecsSettings;
  private final UnaryCallSettings<UpdateTableSpecRequest, TableSpec> updateTableSpecSettings;
  private final UnaryCallSettings<GetColumnSpecRequest, ColumnSpec> getColumnSpecSettings;
  private final PagedCallSettings<
          ListColumnSpecsRequest, ListColumnSpecsResponse, ListColumnSpecsPagedResponse>
      listColumnSpecsSettings;
  private final UnaryCallSettings<UpdateColumnSpecRequest, ColumnSpec> updateColumnSpecSettings;
  private final UnaryCallSettings<CreateModelRequest, Operation> createModelSettings;
  private final OperationCallSettings<CreateModelRequest, Model, OperationMetadata>
      createModelOperationSettings;
  private final UnaryCallSettings<GetModelRequest, Model> getModelSettings;
  private final PagedCallSettings<ListModelsRequest, ListModelsResponse, ListModelsPagedResponse>
      listModelsSettings;
  private final UnaryCallSettings<DeleteModelRequest, Operation> deleteModelSettings;
  private final OperationCallSettings<DeleteModelRequest, Empty, OperationMetadata>
      deleteModelOperationSettings;
  private final UnaryCallSettings<DeployModelRequest, Operation> deployModelSettings;
  private final OperationCallSettings<DeployModelRequest, Empty, OperationMetadata>
      deployModelOperationSettings;
  private final UnaryCallSettings<UndeployModelRequest, Operation> undeployModelSettings;
  private final OperationCallSettings<UndeployModelRequest, Empty, OperationMetadata>
      undeployModelOperationSettings;
  private final UnaryCallSettings<ExportModelRequest, Operation> exportModelSettings;
  private final OperationCallSettings<ExportModelRequest, Empty, OperationMetadata>
      exportModelOperationSettings;
  private final UnaryCallSettings<ExportEvaluatedExamplesRequest, Operation>
      exportEvaluatedExamplesSettings;
  private final OperationCallSettings<ExportEvaluatedExamplesRequest, Empty, OperationMetadata>
      exportEvaluatedExamplesOperationSettings;
  private final UnaryCallSettings<GetModelEvaluationRequest, ModelEvaluation>
      getModelEvaluationSettings;
  private final PagedCallSettings<
          ListModelEvaluationsRequest,
          ListModelEvaluationsResponse,
          ListModelEvaluationsPagedResponse>
      listModelEvaluationsSettings;

  private static final PagedListDescriptor<ListDatasetsRequest, ListDatasetsResponse, Dataset>
      LIST_DATASETS_PAGE_STR_DESC =
          new PagedListDescriptor<ListDatasetsRequest, ListDatasetsResponse, Dataset>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListDatasetsRequest injectToken(ListDatasetsRequest payload, String token) {
              return ListDatasetsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListDatasetsRequest injectPageSize(ListDatasetsRequest payload, int pageSize) {
              return ListDatasetsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListDatasetsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListDatasetsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Dataset> extractResources(ListDatasetsResponse payload) {
              return Objects.isNull(payload.getDatasetsList())
                  ? ImmutableList.<Dataset>of()
                  : payload.getDatasetsList();
            }
          };

  private static final PagedListDescriptor<ListTableSpecsRequest, ListTableSpecsResponse, TableSpec>
      LIST_TABLE_SPECS_PAGE_STR_DESC =
          new PagedListDescriptor<ListTableSpecsRequest, ListTableSpecsResponse, TableSpec>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTableSpecsRequest injectToken(ListTableSpecsRequest payload, String token) {
              return ListTableSpecsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListTableSpecsRequest injectPageSize(
                ListTableSpecsRequest payload, int pageSize) {
              return ListTableSpecsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListTableSpecsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListTableSpecsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<TableSpec> extractResources(ListTableSpecsResponse payload) {
              return Objects.isNull(payload.getTableSpecsList())
                  ? ImmutableList.<TableSpec>of()
                  : payload.getTableSpecsList();
            }
          };

  private static final PagedListDescriptor<
          ListColumnSpecsRequest, ListColumnSpecsResponse, ColumnSpec>
      LIST_COLUMN_SPECS_PAGE_STR_DESC =
          new PagedListDescriptor<ListColumnSpecsRequest, ListColumnSpecsResponse, ColumnSpec>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListColumnSpecsRequest injectToken(
                ListColumnSpecsRequest payload, String token) {
              return ListColumnSpecsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListColumnSpecsRequest injectPageSize(
                ListColumnSpecsRequest payload, int pageSize) {
              return ListColumnSpecsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListColumnSpecsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListColumnSpecsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ColumnSpec> extractResources(ListColumnSpecsResponse payload) {
              return Objects.isNull(payload.getColumnSpecsList())
                  ? ImmutableList.<ColumnSpec>of()
                  : payload.getColumnSpecsList();
            }
          };

  private static final PagedListDescriptor<ListModelsRequest, ListModelsResponse, Model>
      LIST_MODELS_PAGE_STR_DESC =
          new PagedListDescriptor<ListModelsRequest, ListModelsResponse, Model>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListModelsRequest injectToken(ListModelsRequest payload, String token) {
              return ListModelsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListModelsRequest injectPageSize(ListModelsRequest payload, int pageSize) {
              return ListModelsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListModelsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListModelsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Model> extractResources(ListModelsResponse payload) {
              return Objects.isNull(payload.getModelList())
                  ? ImmutableList.<Model>of()
                  : payload.getModelList();
            }
          };

  private static final PagedListDescriptor<
          ListModelEvaluationsRequest, ListModelEvaluationsResponse, ModelEvaluation>
      LIST_MODEL_EVALUATIONS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListModelEvaluationsRequest, ListModelEvaluationsResponse, ModelEvaluation>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListModelEvaluationsRequest injectToken(
                ListModelEvaluationsRequest payload, String token) {
              return ListModelEvaluationsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListModelEvaluationsRequest injectPageSize(
                ListModelEvaluationsRequest payload, int pageSize) {
              return ListModelEvaluationsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListModelEvaluationsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListModelEvaluationsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ModelEvaluation> extractResources(
                ListModelEvaluationsResponse payload) {
              return Objects.isNull(payload.getModelEvaluationList())
                  ? ImmutableList.<ModelEvaluation>of()
                  : payload.getModelEvaluationList();
            }
          };

  private static final PagedListResponseFactory<
          ListDatasetsRequest, ListDatasetsResponse, ListDatasetsPagedResponse>
      LIST_DATASETS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListDatasetsRequest, ListDatasetsResponse, ListDatasetsPagedResponse>() {
            @Override
            public ApiFuture<ListDatasetsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListDatasetsRequest, ListDatasetsResponse> callable,
                ListDatasetsRequest request,
                ApiCallContext context,
                ApiFuture<ListDatasetsResponse> futureResponse) {
              PageContext<ListDatasetsRequest, ListDatasetsResponse, Dataset> pageContext =
                  PageContext.create(callable, LIST_DATASETS_PAGE_STR_DESC, request, context);
              return ListDatasetsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListTableSpecsRequest, ListTableSpecsResponse, ListTableSpecsPagedResponse>
      LIST_TABLE_SPECS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTableSpecsRequest, ListTableSpecsResponse, ListTableSpecsPagedResponse>() {
            @Override
            public ApiFuture<ListTableSpecsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTableSpecsRequest, ListTableSpecsResponse> callable,
                ListTableSpecsRequest request,
                ApiCallContext context,
                ApiFuture<ListTableSpecsResponse> futureResponse) {
              PageContext<ListTableSpecsRequest, ListTableSpecsResponse, TableSpec> pageContext =
                  PageContext.create(callable, LIST_TABLE_SPECS_PAGE_STR_DESC, request, context);
              return ListTableSpecsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListColumnSpecsRequest, ListColumnSpecsResponse, ListColumnSpecsPagedResponse>
      LIST_COLUMN_SPECS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListColumnSpecsRequest, ListColumnSpecsResponse, ListColumnSpecsPagedResponse>() {
            @Override
            public ApiFuture<ListColumnSpecsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListColumnSpecsRequest, ListColumnSpecsResponse> callable,
                ListColumnSpecsRequest request,
                ApiCallContext context,
                ApiFuture<ListColumnSpecsResponse> futureResponse) {
              PageContext<ListColumnSpecsRequest, ListColumnSpecsResponse, ColumnSpec> pageContext =
                  PageContext.create(callable, LIST_COLUMN_SPECS_PAGE_STR_DESC, request, context);
              return ListColumnSpecsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListModelsRequest, ListModelsResponse, ListModelsPagedResponse>
      LIST_MODELS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListModelsRequest, ListModelsResponse, ListModelsPagedResponse>() {
            @Override
            public ApiFuture<ListModelsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListModelsRequest, ListModelsResponse> callable,
                ListModelsRequest request,
                ApiCallContext context,
                ApiFuture<ListModelsResponse> futureResponse) {
              PageContext<ListModelsRequest, ListModelsResponse, Model> pageContext =
                  PageContext.create(callable, LIST_MODELS_PAGE_STR_DESC, request, context);
              return ListModelsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListModelEvaluationsRequest,
          ListModelEvaluationsResponse,
          ListModelEvaluationsPagedResponse>
      LIST_MODEL_EVALUATIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListModelEvaluationsRequest,
              ListModelEvaluationsResponse,
              ListModelEvaluationsPagedResponse>() {
            @Override
            public ApiFuture<ListModelEvaluationsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListModelEvaluationsRequest, ListModelEvaluationsResponse> callable,
                ListModelEvaluationsRequest request,
                ApiCallContext context,
                ApiFuture<ListModelEvaluationsResponse> futureResponse) {
              PageContext<
                      ListModelEvaluationsRequest, ListModelEvaluationsResponse, ModelEvaluation>
                  pageContext =
                      PageContext.create(
                          callable, LIST_MODEL_EVALUATIONS_PAGE_STR_DESC, request, context);
              return ListModelEvaluationsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to createDataset. */
  public UnaryCallSettings<CreateDatasetRequest, Dataset> createDatasetSettings() {
    return createDatasetSettings;
  }

  /** Returns the object with the settings used for calls to getDataset. */
  public UnaryCallSettings<GetDatasetRequest, Dataset> getDatasetSettings() {
    return getDatasetSettings;
  }

  /** Returns the object with the settings used for calls to listDatasets. */
  public PagedCallSettings<ListDatasetsRequest, ListDatasetsResponse, ListDatasetsPagedResponse>
      listDatasetsSettings() {
    return listDatasetsSettings;
  }

  /** Returns the object with the settings used for calls to updateDataset. */
  public UnaryCallSettings<UpdateDatasetRequest, Dataset> updateDatasetSettings() {
    return updateDatasetSettings;
  }

  /** Returns the object with the settings used for calls to deleteDataset. */
  public UnaryCallSettings<DeleteDatasetRequest, Operation> deleteDatasetSettings() {
    return deleteDatasetSettings;
  }

  /** Returns the object with the settings used for calls to deleteDataset. */
  public OperationCallSettings<DeleteDatasetRequest, Empty, OperationMetadata>
      deleteDatasetOperationSettings() {
    return deleteDatasetOperationSettings;
  }

  /** Returns the object with the settings used for calls to importData. */
  public UnaryCallSettings<ImportDataRequest, Operation> importDataSettings() {
    return importDataSettings;
  }

  /** Returns the object with the settings used for calls to importData. */
  public OperationCallSettings<ImportDataRequest, Empty, OperationMetadata>
      importDataOperationSettings() {
    return importDataOperationSettings;
  }

  /** Returns the object with the settings used for calls to exportData. */
  public UnaryCallSettings<ExportDataRequest, Operation> exportDataSettings() {
    return exportDataSettings;
  }

  /** Returns the object with the settings used for calls to exportData. */
  public OperationCallSettings<ExportDataRequest, Empty, OperationMetadata>
      exportDataOperationSettings() {
    return exportDataOperationSettings;
  }

  /** Returns the object with the settings used for calls to getAnnotationSpec. */
  public UnaryCallSettings<GetAnnotationSpecRequest, AnnotationSpec> getAnnotationSpecSettings() {
    return getAnnotationSpecSettings;
  }

  /** Returns the object with the settings used for calls to getTableSpec. */
  public UnaryCallSettings<GetTableSpecRequest, TableSpec> getTableSpecSettings() {
    return getTableSpecSettings;
  }

  /** Returns the object with the settings used for calls to listTableSpecs. */
  public PagedCallSettings<
          ListTableSpecsRequest, ListTableSpecsResponse, ListTableSpecsPagedResponse>
      listTableSpecsSettings() {
    return listTableSpecsSettings;
  }

  /** Returns the object with the settings used for calls to updateTableSpec. */
  public UnaryCallSettings<UpdateTableSpecRequest, TableSpec> updateTableSpecSettings() {
    return updateTableSpecSettings;
  }

  /** Returns the object with the settings used for calls to getColumnSpec. */
  public UnaryCallSettings<GetColumnSpecRequest, ColumnSpec> getColumnSpecSettings() {
    return getColumnSpecSettings;
  }

  /** Returns the object with the settings used for calls to listColumnSpecs. */
  public PagedCallSettings<
          ListColumnSpecsRequest, ListColumnSpecsResponse, ListColumnSpecsPagedResponse>
      listColumnSpecsSettings() {
    return listColumnSpecsSettings;
  }

  /** Returns the object with the settings used for calls to updateColumnSpec. */
  public UnaryCallSettings<UpdateColumnSpecRequest, ColumnSpec> updateColumnSpecSettings() {
    return updateColumnSpecSettings;
  }

  /** Returns the object with the settings used for calls to createModel. */
  public UnaryCallSettings<CreateModelRequest, Operation> createModelSettings() {
    return createModelSettings;
  }

  /** Returns the object with the settings used for calls to createModel. */
  public OperationCallSettings<CreateModelRequest, Model, OperationMetadata>
      createModelOperationSettings() {
    return createModelOperationSettings;
  }

  /** Returns the object with the settings used for calls to getModel. */
  public UnaryCallSettings<GetModelRequest, Model> getModelSettings() {
    return getModelSettings;
  }

  /** Returns the object with the settings used for calls to listModels. */
  public PagedCallSettings<ListModelsRequest, ListModelsResponse, ListModelsPagedResponse>
      listModelsSettings() {
    return listModelsSettings;
  }

  /** Returns the object with the settings used for calls to deleteModel. */
  public UnaryCallSettings<DeleteModelRequest, Operation> deleteModelSettings() {
    return deleteModelSettings;
  }

  /** Returns the object with the settings used for calls to deleteModel. */
  public OperationCallSettings<DeleteModelRequest, Empty, OperationMetadata>
      deleteModelOperationSettings() {
    return deleteModelOperationSettings;
  }

  /** Returns the object with the settings used for calls to deployModel. */
  public UnaryCallSettings<DeployModelRequest, Operation> deployModelSettings() {
    return deployModelSettings;
  }

  /** Returns the object with the settings used for calls to deployModel. */
  public OperationCallSettings<DeployModelRequest, Empty, OperationMetadata>
      deployModelOperationSettings() {
    return deployModelOperationSettings;
  }

  /** Returns the object with the settings used for calls to undeployModel. */
  public UnaryCallSettings<UndeployModelRequest, Operation> undeployModelSettings() {
    return undeployModelSettings;
  }

  /** Returns the object with the settings used for calls to undeployModel. */
  public OperationCallSettings<UndeployModelRequest, Empty, OperationMetadata>
      undeployModelOperationSettings() {
    return undeployModelOperationSettings;
  }

  /** Returns the object with the settings used for calls to exportModel. */
  public UnaryCallSettings<ExportModelRequest, Operation> exportModelSettings() {
    return exportModelSettings;
  }

  /** Returns the object with the settings used for calls to exportModel. */
  public OperationCallSettings<ExportModelRequest, Empty, OperationMetadata>
      exportModelOperationSettings() {
    return exportModelOperationSettings;
  }

  /** Returns the object with the settings used for calls to exportEvaluatedExamples. */
  public UnaryCallSettings<ExportEvaluatedExamplesRequest, Operation>
      exportEvaluatedExamplesSettings() {
    return exportEvaluatedExamplesSettings;
  }

  /** Returns the object with the settings used for calls to exportEvaluatedExamples. */
  public OperationCallSettings<ExportEvaluatedExamplesRequest, Empty, OperationMetadata>
      exportEvaluatedExamplesOperationSettings() {
    return exportEvaluatedExamplesOperationSettings;
  }

  /** Returns the object with the settings used for calls to getModelEvaluation. */
  public UnaryCallSettings<GetModelEvaluationRequest, ModelEvaluation>
      getModelEvaluationSettings() {
    return getModelEvaluationSettings;
  }

  /** Returns the object with the settings used for calls to listModelEvaluations. */
  public PagedCallSettings<
          ListModelEvaluationsRequest,
          ListModelEvaluationsResponse,
          ListModelEvaluationsPagedResponse>
      listModelEvaluationsSettings() {
    return listModelEvaluationsSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AutoMlStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcAutoMlStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "automl.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(AutoMlStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected AutoMlStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createDatasetSettings = settingsBuilder.createDatasetSettings().build();
    getDatasetSettings = settingsBuilder.getDatasetSettings().build();
    listDatasetsSettings = settingsBuilder.listDatasetsSettings().build();
    updateDatasetSettings = settingsBuilder.updateDatasetSettings().build();
    deleteDatasetSettings = settingsBuilder.deleteDatasetSettings().build();
    deleteDatasetOperationSettings = settingsBuilder.deleteDatasetOperationSettings().build();
    importDataSettings = settingsBuilder.importDataSettings().build();
    importDataOperationSettings = settingsBuilder.importDataOperationSettings().build();
    exportDataSettings = settingsBuilder.exportDataSettings().build();
    exportDataOperationSettings = settingsBuilder.exportDataOperationSettings().build();
    getAnnotationSpecSettings = settingsBuilder.getAnnotationSpecSettings().build();
    getTableSpecSettings = settingsBuilder.getTableSpecSettings().build();
    listTableSpecsSettings = settingsBuilder.listTableSpecsSettings().build();
    updateTableSpecSettings = settingsBuilder.updateTableSpecSettings().build();
    getColumnSpecSettings = settingsBuilder.getColumnSpecSettings().build();
    listColumnSpecsSettings = settingsBuilder.listColumnSpecsSettings().build();
    updateColumnSpecSettings = settingsBuilder.updateColumnSpecSettings().build();
    createModelSettings = settingsBuilder.createModelSettings().build();
    createModelOperationSettings = settingsBuilder.createModelOperationSettings().build();
    getModelSettings = settingsBuilder.getModelSettings().build();
    listModelsSettings = settingsBuilder.listModelsSettings().build();
    deleteModelSettings = settingsBuilder.deleteModelSettings().build();
    deleteModelOperationSettings = settingsBuilder.deleteModelOperationSettings().build();
    deployModelSettings = settingsBuilder.deployModelSettings().build();
    deployModelOperationSettings = settingsBuilder.deployModelOperationSettings().build();
    undeployModelSettings = settingsBuilder.undeployModelSettings().build();
    undeployModelOperationSettings = settingsBuilder.undeployModelOperationSettings().build();
    exportModelSettings = settingsBuilder.exportModelSettings().build();
    exportModelOperationSettings = settingsBuilder.exportModelOperationSettings().build();
    exportEvaluatedExamplesSettings = settingsBuilder.exportEvaluatedExamplesSettings().build();
    exportEvaluatedExamplesOperationSettings =
        settingsBuilder.exportEvaluatedExamplesOperationSettings().build();
    getModelEvaluationSettings = settingsBuilder.getModelEvaluationSettings().build();
    listModelEvaluationsSettings = settingsBuilder.listModelEvaluationsSettings().build();
  }

  /** Builder for AutoMlStubSettings. */
  public static class Builder extends StubSettings.Builder<AutoMlStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CreateDatasetRequest, Dataset> createDatasetSettings;
    private final UnaryCallSettings.Builder<GetDatasetRequest, Dataset> getDatasetSettings;
    private final PagedCallSettings.Builder<
            ListDatasetsRequest, ListDatasetsResponse, ListDatasetsPagedResponse>
        listDatasetsSettings;
    private final UnaryCallSettings.Builder<UpdateDatasetRequest, Dataset> updateDatasetSettings;
    private final UnaryCallSettings.Builder<DeleteDatasetRequest, Operation> deleteDatasetSettings;
    private final OperationCallSettings.Builder<DeleteDatasetRequest, Empty, OperationMetadata>
        deleteDatasetOperationSettings;
    private final UnaryCallSettings.Builder<ImportDataRequest, Operation> importDataSettings;
    private final OperationCallSettings.Builder<ImportDataRequest, Empty, OperationMetadata>
        importDataOperationSettings;
    private final UnaryCallSettings.Builder<ExportDataRequest, Operation> exportDataSettings;
    private final OperationCallSettings.Builder<ExportDataRequest, Empty, OperationMetadata>
        exportDataOperationSettings;
    private final UnaryCallSettings.Builder<GetAnnotationSpecRequest, AnnotationSpec>
        getAnnotationSpecSettings;
    private final UnaryCallSettings.Builder<GetTableSpecRequest, TableSpec> getTableSpecSettings;
    private final PagedCallSettings.Builder<
            ListTableSpecsRequest, ListTableSpecsResponse, ListTableSpecsPagedResponse>
        listTableSpecsSettings;
    private final UnaryCallSettings.Builder<UpdateTableSpecRequest, TableSpec>
        updateTableSpecSettings;
    private final UnaryCallSettings.Builder<GetColumnSpecRequest, ColumnSpec> getColumnSpecSettings;
    private final PagedCallSettings.Builder<
            ListColumnSpecsRequest, ListColumnSpecsResponse, ListColumnSpecsPagedResponse>
        listColumnSpecsSettings;
    private final UnaryCallSettings.Builder<UpdateColumnSpecRequest, ColumnSpec>
        updateColumnSpecSettings;
    private final UnaryCallSettings.Builder<CreateModelRequest, Operation> createModelSettings;
    private final OperationCallSettings.Builder<CreateModelRequest, Model, OperationMetadata>
        createModelOperationSettings;
    private final UnaryCallSettings.Builder<GetModelRequest, Model> getModelSettings;
    private final PagedCallSettings.Builder<
            ListModelsRequest, ListModelsResponse, ListModelsPagedResponse>
        listModelsSettings;
    private final UnaryCallSettings.Builder<DeleteModelRequest, Operation> deleteModelSettings;
    private final OperationCallSettings.Builder<DeleteModelRequest, Empty, OperationMetadata>
        deleteModelOperationSettings;
    private final UnaryCallSettings.Builder<DeployModelRequest, Operation> deployModelSettings;
    private final OperationCallSettings.Builder<DeployModelRequest, Empty, OperationMetadata>
        deployModelOperationSettings;
    private final UnaryCallSettings.Builder<UndeployModelRequest, Operation> undeployModelSettings;
    private final OperationCallSettings.Builder<UndeployModelRequest, Empty, OperationMetadata>
        undeployModelOperationSettings;
    private final UnaryCallSettings.Builder<ExportModelRequest, Operation> exportModelSettings;
    private final OperationCallSettings.Builder<ExportModelRequest, Empty, OperationMetadata>
        exportModelOperationSettings;
    private final UnaryCallSettings.Builder<ExportEvaluatedExamplesRequest, Operation>
        exportEvaluatedExamplesSettings;
    private final OperationCallSettings.Builder<
            ExportEvaluatedExamplesRequest, Empty, OperationMetadata>
        exportEvaluatedExamplesOperationSettings;
    private final UnaryCallSettings.Builder<GetModelEvaluationRequest, ModelEvaluation>
        getModelEvaluationSettings;
    private final PagedCallSettings.Builder<
            ListModelEvaluationsRequest,
            ListModelEvaluationsResponse,
            ListModelEvaluationsPagedResponse>
        listModelEvaluationsSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_1_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "retry_policy_2_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.UNAVAILABLE, StatusCode.Code.DEADLINE_EXCEEDED)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(5000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(5000L))
              .setTotalTimeout(Duration.ofMillis(5000L))
              .build();
      definitions.put("no_retry_1_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(5000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(5000L))
              .setTotalTimeout(Duration.ofMillis(5000L))
              .build();
      definitions.put("retry_policy_2_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createDatasetSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getDatasetSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listDatasetsSettings = PagedCallSettings.newBuilder(LIST_DATASETS_PAGE_STR_FACT);
      updateDatasetSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteDatasetSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteDatasetOperationSettings = OperationCallSettings.newBuilder();
      importDataSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      importDataOperationSettings = OperationCallSettings.newBuilder();
      exportDataSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      exportDataOperationSettings = OperationCallSettings.newBuilder();
      getAnnotationSpecSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getTableSpecSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listTableSpecsSettings = PagedCallSettings.newBuilder(LIST_TABLE_SPECS_PAGE_STR_FACT);
      updateTableSpecSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getColumnSpecSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listColumnSpecsSettings = PagedCallSettings.newBuilder(LIST_COLUMN_SPECS_PAGE_STR_FACT);
      updateColumnSpecSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createModelSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createModelOperationSettings = OperationCallSettings.newBuilder();
      getModelSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listModelsSettings = PagedCallSettings.newBuilder(LIST_MODELS_PAGE_STR_FACT);
      deleteModelSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteModelOperationSettings = OperationCallSettings.newBuilder();
      deployModelSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deployModelOperationSettings = OperationCallSettings.newBuilder();
      undeployModelSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      undeployModelOperationSettings = OperationCallSettings.newBuilder();
      exportModelSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      exportModelOperationSettings = OperationCallSettings.newBuilder();
      exportEvaluatedExamplesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      exportEvaluatedExamplesOperationSettings = OperationCallSettings.newBuilder();
      getModelEvaluationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listModelEvaluationsSettings =
          PagedCallSettings.newBuilder(LIST_MODEL_EVALUATIONS_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createDatasetSettings,
              getDatasetSettings,
              listDatasetsSettings,
              updateDatasetSettings,
              deleteDatasetSettings,
              importDataSettings,
              exportDataSettings,
              getAnnotationSpecSettings,
              getTableSpecSettings,
              listTableSpecsSettings,
              updateTableSpecSettings,
              getColumnSpecSettings,
              listColumnSpecsSettings,
              updateColumnSpecSettings,
              createModelSettings,
              getModelSettings,
              listModelsSettings,
              deleteModelSettings,
              deployModelSettings,
              undeployModelSettings,
              exportModelSettings,
              exportEvaluatedExamplesSettings,
              getModelEvaluationSettings,
              listModelEvaluationsSettings);
      initDefaults(this);
    }

    protected Builder(AutoMlStubSettings settings) {
      super(settings);

      createDatasetSettings = settings.createDatasetSettings.toBuilder();
      getDatasetSettings = settings.getDatasetSettings.toBuilder();
      listDatasetsSettings = settings.listDatasetsSettings.toBuilder();
      updateDatasetSettings = settings.updateDatasetSettings.toBuilder();
      deleteDatasetSettings = settings.deleteDatasetSettings.toBuilder();
      deleteDatasetOperationSettings = settings.deleteDatasetOperationSettings.toBuilder();
      importDataSettings = settings.importDataSettings.toBuilder();
      importDataOperationSettings = settings.importDataOperationSettings.toBuilder();
      exportDataSettings = settings.exportDataSettings.toBuilder();
      exportDataOperationSettings = settings.exportDataOperationSettings.toBuilder();
      getAnnotationSpecSettings = settings.getAnnotationSpecSettings.toBuilder();
      getTableSpecSettings = settings.getTableSpecSettings.toBuilder();
      listTableSpecsSettings = settings.listTableSpecsSettings.toBuilder();
      updateTableSpecSettings = settings.updateTableSpecSettings.toBuilder();
      getColumnSpecSettings = settings.getColumnSpecSettings.toBuilder();
      listColumnSpecsSettings = settings.listColumnSpecsSettings.toBuilder();
      updateColumnSpecSettings = settings.updateColumnSpecSettings.toBuilder();
      createModelSettings = settings.createModelSettings.toBuilder();
      createModelOperationSettings = settings.createModelOperationSettings.toBuilder();
      getModelSettings = settings.getModelSettings.toBuilder();
      listModelsSettings = settings.listModelsSettings.toBuilder();
      deleteModelSettings = settings.deleteModelSettings.toBuilder();
      deleteModelOperationSettings = settings.deleteModelOperationSettings.toBuilder();
      deployModelSettings = settings.deployModelSettings.toBuilder();
      deployModelOperationSettings = settings.deployModelOperationSettings.toBuilder();
      undeployModelSettings = settings.undeployModelSettings.toBuilder();
      undeployModelOperationSettings = settings.undeployModelOperationSettings.toBuilder();
      exportModelSettings = settings.exportModelSettings.toBuilder();
      exportModelOperationSettings = settings.exportModelOperationSettings.toBuilder();
      exportEvaluatedExamplesSettings = settings.exportEvaluatedExamplesSettings.toBuilder();
      exportEvaluatedExamplesOperationSettings =
          settings.exportEvaluatedExamplesOperationSettings.toBuilder();
      getModelEvaluationSettings = settings.getModelEvaluationSettings.toBuilder();
      listModelEvaluationsSettings = settings.listModelEvaluationsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createDatasetSettings,
              getDatasetSettings,
              listDatasetsSettings,
              updateDatasetSettings,
              deleteDatasetSettings,
              importDataSettings,
              exportDataSettings,
              getAnnotationSpecSettings,
              getTableSpecSettings,
              listTableSpecsSettings,
              updateTableSpecSettings,
              getColumnSpecSettings,
              listColumnSpecsSettings,
              updateColumnSpecSettings,
              createModelSettings,
              getModelSettings,
              listModelsSettings,
              deleteModelSettings,
              deployModelSettings,
              undeployModelSettings,
              exportModelSettings,
              exportEvaluatedExamplesSettings,
              getModelEvaluationSettings,
              listModelEvaluationsSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .createDatasetSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getDatasetSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .listDatasetsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .updateDatasetSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteDatasetSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .importDataSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .exportDataSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getAnnotationSpecSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .getTableSpecSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .listTableSpecsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .updateTableSpecSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getColumnSpecSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .listColumnSpecsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .updateColumnSpecSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .createModelSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getModelSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .listModelsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .deleteModelSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .deployModelSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .undeployModelSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .exportModelSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .exportEvaluatedExamplesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getModelEvaluationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"));

      builder
          .listModelEvaluationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteDatasetOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteDatasetRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .importDataOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<ImportDataRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .exportDataOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<ExportDataRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .createModelOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<CreateModelRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Model.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .deleteModelOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<DeleteModelRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_2_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_2_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .deployModelOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<DeployModelRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .undeployModelOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<UndeployModelRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .exportModelOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<ExportModelRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .exportEvaluatedExamplesOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ExportEvaluatedExamplesRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to createDataset. */
    public UnaryCallSettings.Builder<CreateDatasetRequest, Dataset> createDatasetSettings() {
      return createDatasetSettings;
    }

    /** Returns the builder for the settings used for calls to getDataset. */
    public UnaryCallSettings.Builder<GetDatasetRequest, Dataset> getDatasetSettings() {
      return getDatasetSettings;
    }

    /** Returns the builder for the settings used for calls to listDatasets. */
    public PagedCallSettings.Builder<
            ListDatasetsRequest, ListDatasetsResponse, ListDatasetsPagedResponse>
        listDatasetsSettings() {
      return listDatasetsSettings;
    }

    /** Returns the builder for the settings used for calls to updateDataset. */
    public UnaryCallSettings.Builder<UpdateDatasetRequest, Dataset> updateDatasetSettings() {
      return updateDatasetSettings;
    }

    /** Returns the builder for the settings used for calls to deleteDataset. */
    public UnaryCallSettings.Builder<DeleteDatasetRequest, Operation> deleteDatasetSettings() {
      return deleteDatasetSettings;
    }

    /** Returns the builder for the settings used for calls to deleteDataset. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DeleteDatasetRequest, Empty, OperationMetadata>
        deleteDatasetOperationSettings() {
      return deleteDatasetOperationSettings;
    }

    /** Returns the builder for the settings used for calls to importData. */
    public UnaryCallSettings.Builder<ImportDataRequest, Operation> importDataSettings() {
      return importDataSettings;
    }

    /** Returns the builder for the settings used for calls to importData. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<ImportDataRequest, Empty, OperationMetadata>
        importDataOperationSettings() {
      return importDataOperationSettings;
    }

    /** Returns the builder for the settings used for calls to exportData. */
    public UnaryCallSettings.Builder<ExportDataRequest, Operation> exportDataSettings() {
      return exportDataSettings;
    }

    /** Returns the builder for the settings used for calls to exportData. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<ExportDataRequest, Empty, OperationMetadata>
        exportDataOperationSettings() {
      return exportDataOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getAnnotationSpec. */
    public UnaryCallSettings.Builder<GetAnnotationSpecRequest, AnnotationSpec>
        getAnnotationSpecSettings() {
      return getAnnotationSpecSettings;
    }

    /** Returns the builder for the settings used for calls to getTableSpec. */
    public UnaryCallSettings.Builder<GetTableSpecRequest, TableSpec> getTableSpecSettings() {
      return getTableSpecSettings;
    }

    /** Returns the builder for the settings used for calls to listTableSpecs. */
    public PagedCallSettings.Builder<
            ListTableSpecsRequest, ListTableSpecsResponse, ListTableSpecsPagedResponse>
        listTableSpecsSettings() {
      return listTableSpecsSettings;
    }

    /** Returns the builder for the settings used for calls to updateTableSpec. */
    public UnaryCallSettings.Builder<UpdateTableSpecRequest, TableSpec> updateTableSpecSettings() {
      return updateTableSpecSettings;
    }

    /** Returns the builder for the settings used for calls to getColumnSpec. */
    public UnaryCallSettings.Builder<GetColumnSpecRequest, ColumnSpec> getColumnSpecSettings() {
      return getColumnSpecSettings;
    }

    /** Returns the builder for the settings used for calls to listColumnSpecs. */
    public PagedCallSettings.Builder<
            ListColumnSpecsRequest, ListColumnSpecsResponse, ListColumnSpecsPagedResponse>
        listColumnSpecsSettings() {
      return listColumnSpecsSettings;
    }

    /** Returns the builder for the settings used for calls to updateColumnSpec. */
    public UnaryCallSettings.Builder<UpdateColumnSpecRequest, ColumnSpec>
        updateColumnSpecSettings() {
      return updateColumnSpecSettings;
    }

    /** Returns the builder for the settings used for calls to createModel. */
    public UnaryCallSettings.Builder<CreateModelRequest, Operation> createModelSettings() {
      return createModelSettings;
    }

    /** Returns the builder for the settings used for calls to createModel. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<CreateModelRequest, Model, OperationMetadata>
        createModelOperationSettings() {
      return createModelOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getModel. */
    public UnaryCallSettings.Builder<GetModelRequest, Model> getModelSettings() {
      return getModelSettings;
    }

    /** Returns the builder for the settings used for calls to listModels. */
    public PagedCallSettings.Builder<ListModelsRequest, ListModelsResponse, ListModelsPagedResponse>
        listModelsSettings() {
      return listModelsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteModel. */
    public UnaryCallSettings.Builder<DeleteModelRequest, Operation> deleteModelSettings() {
      return deleteModelSettings;
    }

    /** Returns the builder for the settings used for calls to deleteModel. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DeleteModelRequest, Empty, OperationMetadata>
        deleteModelOperationSettings() {
      return deleteModelOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deployModel. */
    public UnaryCallSettings.Builder<DeployModelRequest, Operation> deployModelSettings() {
      return deployModelSettings;
    }

    /** Returns the builder for the settings used for calls to deployModel. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DeployModelRequest, Empty, OperationMetadata>
        deployModelOperationSettings() {
      return deployModelOperationSettings;
    }

    /** Returns the builder for the settings used for calls to undeployModel. */
    public UnaryCallSettings.Builder<UndeployModelRequest, Operation> undeployModelSettings() {
      return undeployModelSettings;
    }

    /** Returns the builder for the settings used for calls to undeployModel. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<UndeployModelRequest, Empty, OperationMetadata>
        undeployModelOperationSettings() {
      return undeployModelOperationSettings;
    }

    /** Returns the builder for the settings used for calls to exportModel. */
    public UnaryCallSettings.Builder<ExportModelRequest, Operation> exportModelSettings() {
      return exportModelSettings;
    }

    /** Returns the builder for the settings used for calls to exportModel. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<ExportModelRequest, Empty, OperationMetadata>
        exportModelOperationSettings() {
      return exportModelOperationSettings;
    }

    /** Returns the builder for the settings used for calls to exportEvaluatedExamples. */
    public UnaryCallSettings.Builder<ExportEvaluatedExamplesRequest, Operation>
        exportEvaluatedExamplesSettings() {
      return exportEvaluatedExamplesSettings;
    }

    /** Returns the builder for the settings used for calls to exportEvaluatedExamples. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<ExportEvaluatedExamplesRequest, Empty, OperationMetadata>
        exportEvaluatedExamplesOperationSettings() {
      return exportEvaluatedExamplesOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getModelEvaluation. */
    public UnaryCallSettings.Builder<GetModelEvaluationRequest, ModelEvaluation>
        getModelEvaluationSettings() {
      return getModelEvaluationSettings;
    }

    /** Returns the builder for the settings used for calls to listModelEvaluations. */
    public PagedCallSettings.Builder<
            ListModelEvaluationsRequest,
            ListModelEvaluationsResponse,
            ListModelEvaluationsPagedResponse>
        listModelEvaluationsSettings() {
      return listModelEvaluationsSettings;
    }

    @Override
    public AutoMlStubSettings build() throws IOException {
      return new AutoMlStubSettings(this);
    }
  }
}
