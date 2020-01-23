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

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 *
 *
 * <pre>
 * AutoML Server API.
 * The resource names are assigned by the server.
 * The server never reuses names that it has created after the resources with
 * those names are deleted.
 * An ID of a resource is the last element of the item's resource name. For
 * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`, then
 * the id for the item is `{dataset_id}`.
 * Currently the only supported `location_id` is "us-central1".
 * On any input that is documented to expect a string parameter in
 * snake_case or kebab-case, either of those cases is accepted.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/cloud/automl/v1/service.proto")
public final class AutoMlGrpc {

  private AutoMlGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.automl.v1.AutoMl";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateDatasetMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.CreateDatasetRequest, com.google.longrunning.Operation>
      METHOD_CREATE_DATASET = getCreateDatasetMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.CreateDatasetRequest, com.google.longrunning.Operation>
      getCreateDatasetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.CreateDatasetRequest, com.google.longrunning.Operation>
      getCreateDatasetMethod() {
    return getCreateDatasetMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.CreateDatasetRequest, com.google.longrunning.Operation>
      getCreateDatasetMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1.CreateDatasetRequest, com.google.longrunning.Operation>
        getCreateDatasetMethod;
    if ((getCreateDatasetMethod = AutoMlGrpc.getCreateDatasetMethod) == null) {
      synchronized (AutoMlGrpc.class) {
        if ((getCreateDatasetMethod = AutoMlGrpc.getCreateDatasetMethod) == null) {
          AutoMlGrpc.getCreateDatasetMethod =
              getCreateDatasetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1.CreateDatasetRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName("google.cloud.automl.v1.AutoMl", "CreateDataset"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.CreateDatasetRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new AutoMlMethodDescriptorSupplier("CreateDataset"))
                      .build();
        }
      }
    }
    return getCreateDatasetMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetDatasetMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetDatasetRequest, com.google.cloud.automl.v1.Dataset>
      METHOD_GET_DATASET = getGetDatasetMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetDatasetRequest, com.google.cloud.automl.v1.Dataset>
      getGetDatasetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetDatasetRequest, com.google.cloud.automl.v1.Dataset>
      getGetDatasetMethod() {
    return getGetDatasetMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetDatasetRequest, com.google.cloud.automl.v1.Dataset>
      getGetDatasetMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1.GetDatasetRequest, com.google.cloud.automl.v1.Dataset>
        getGetDatasetMethod;
    if ((getGetDatasetMethod = AutoMlGrpc.getGetDatasetMethod) == null) {
      synchronized (AutoMlGrpc.class) {
        if ((getGetDatasetMethod = AutoMlGrpc.getGetDatasetMethod) == null) {
          AutoMlGrpc.getGetDatasetMethod =
              getGetDatasetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1.GetDatasetRequest,
                          com.google.cloud.automl.v1.Dataset>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName("google.cloud.automl.v1.AutoMl", "GetDataset"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.GetDatasetRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.Dataset.getDefaultInstance()))
                      .setSchemaDescriptor(new AutoMlMethodDescriptorSupplier("GetDataset"))
                      .build();
        }
      }
    }
    return getGetDatasetMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListDatasetsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ListDatasetsRequest,
          com.google.cloud.automl.v1.ListDatasetsResponse>
      METHOD_LIST_DATASETS = getListDatasetsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ListDatasetsRequest,
          com.google.cloud.automl.v1.ListDatasetsResponse>
      getListDatasetsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ListDatasetsRequest,
          com.google.cloud.automl.v1.ListDatasetsResponse>
      getListDatasetsMethod() {
    return getListDatasetsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ListDatasetsRequest,
          com.google.cloud.automl.v1.ListDatasetsResponse>
      getListDatasetsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1.ListDatasetsRequest,
            com.google.cloud.automl.v1.ListDatasetsResponse>
        getListDatasetsMethod;
    if ((getListDatasetsMethod = AutoMlGrpc.getListDatasetsMethod) == null) {
      synchronized (AutoMlGrpc.class) {
        if ((getListDatasetsMethod = AutoMlGrpc.getListDatasetsMethod) == null) {
          AutoMlGrpc.getListDatasetsMethod =
              getListDatasetsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1.ListDatasetsRequest,
                          com.google.cloud.automl.v1.ListDatasetsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName("google.cloud.automl.v1.AutoMl", "ListDatasets"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.ListDatasetsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.ListDatasetsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(new AutoMlMethodDescriptorSupplier("ListDatasets"))
                      .build();
        }
      }
    }
    return getListDatasetsMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateDatasetMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.UpdateDatasetRequest, com.google.cloud.automl.v1.Dataset>
      METHOD_UPDATE_DATASET = getUpdateDatasetMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.UpdateDatasetRequest, com.google.cloud.automl.v1.Dataset>
      getUpdateDatasetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.UpdateDatasetRequest, com.google.cloud.automl.v1.Dataset>
      getUpdateDatasetMethod() {
    return getUpdateDatasetMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.UpdateDatasetRequest, com.google.cloud.automl.v1.Dataset>
      getUpdateDatasetMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1.UpdateDatasetRequest, com.google.cloud.automl.v1.Dataset>
        getUpdateDatasetMethod;
    if ((getUpdateDatasetMethod = AutoMlGrpc.getUpdateDatasetMethod) == null) {
      synchronized (AutoMlGrpc.class) {
        if ((getUpdateDatasetMethod = AutoMlGrpc.getUpdateDatasetMethod) == null) {
          AutoMlGrpc.getUpdateDatasetMethod =
              getUpdateDatasetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1.UpdateDatasetRequest,
                          com.google.cloud.automl.v1.Dataset>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName("google.cloud.automl.v1.AutoMl", "UpdateDataset"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.UpdateDatasetRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.Dataset.getDefaultInstance()))
                      .setSchemaDescriptor(new AutoMlMethodDescriptorSupplier("UpdateDataset"))
                      .build();
        }
      }
    }
    return getUpdateDatasetMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteDatasetMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.DeleteDatasetRequest, com.google.longrunning.Operation>
      METHOD_DELETE_DATASET = getDeleteDatasetMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.DeleteDatasetRequest, com.google.longrunning.Operation>
      getDeleteDatasetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.DeleteDatasetRequest, com.google.longrunning.Operation>
      getDeleteDatasetMethod() {
    return getDeleteDatasetMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.DeleteDatasetRequest, com.google.longrunning.Operation>
      getDeleteDatasetMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1.DeleteDatasetRequest, com.google.longrunning.Operation>
        getDeleteDatasetMethod;
    if ((getDeleteDatasetMethod = AutoMlGrpc.getDeleteDatasetMethod) == null) {
      synchronized (AutoMlGrpc.class) {
        if ((getDeleteDatasetMethod = AutoMlGrpc.getDeleteDatasetMethod) == null) {
          AutoMlGrpc.getDeleteDatasetMethod =
              getDeleteDatasetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1.DeleteDatasetRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName("google.cloud.automl.v1.AutoMl", "DeleteDataset"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.DeleteDatasetRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new AutoMlMethodDescriptorSupplier("DeleteDataset"))
                      .build();
        }
      }
    }
    return getDeleteDatasetMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getImportDataMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ImportDataRequest, com.google.longrunning.Operation>
      METHOD_IMPORT_DATA = getImportDataMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ImportDataRequest, com.google.longrunning.Operation>
      getImportDataMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ImportDataRequest, com.google.longrunning.Operation>
      getImportDataMethod() {
    return getImportDataMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ImportDataRequest, com.google.longrunning.Operation>
      getImportDataMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1.ImportDataRequest, com.google.longrunning.Operation>
        getImportDataMethod;
    if ((getImportDataMethod = AutoMlGrpc.getImportDataMethod) == null) {
      synchronized (AutoMlGrpc.class) {
        if ((getImportDataMethod = AutoMlGrpc.getImportDataMethod) == null) {
          AutoMlGrpc.getImportDataMethod =
              getImportDataMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1.ImportDataRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName("google.cloud.automl.v1.AutoMl", "ImportData"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.ImportDataRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new AutoMlMethodDescriptorSupplier("ImportData"))
                      .build();
        }
      }
    }
    return getImportDataMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getExportDataMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ExportDataRequest, com.google.longrunning.Operation>
      METHOD_EXPORT_DATA = getExportDataMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ExportDataRequest, com.google.longrunning.Operation>
      getExportDataMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ExportDataRequest, com.google.longrunning.Operation>
      getExportDataMethod() {
    return getExportDataMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ExportDataRequest, com.google.longrunning.Operation>
      getExportDataMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1.ExportDataRequest, com.google.longrunning.Operation>
        getExportDataMethod;
    if ((getExportDataMethod = AutoMlGrpc.getExportDataMethod) == null) {
      synchronized (AutoMlGrpc.class) {
        if ((getExportDataMethod = AutoMlGrpc.getExportDataMethod) == null) {
          AutoMlGrpc.getExportDataMethod =
              getExportDataMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1.ExportDataRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName("google.cloud.automl.v1.AutoMl", "ExportData"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.ExportDataRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new AutoMlMethodDescriptorSupplier("ExportData"))
                      .build();
        }
      }
    }
    return getExportDataMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAnnotationSpecMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetAnnotationSpecRequest,
          com.google.cloud.automl.v1.AnnotationSpec>
      METHOD_GET_ANNOTATION_SPEC = getGetAnnotationSpecMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetAnnotationSpecRequest,
          com.google.cloud.automl.v1.AnnotationSpec>
      getGetAnnotationSpecMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetAnnotationSpecRequest,
          com.google.cloud.automl.v1.AnnotationSpec>
      getGetAnnotationSpecMethod() {
    return getGetAnnotationSpecMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetAnnotationSpecRequest,
          com.google.cloud.automl.v1.AnnotationSpec>
      getGetAnnotationSpecMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1.GetAnnotationSpecRequest,
            com.google.cloud.automl.v1.AnnotationSpec>
        getGetAnnotationSpecMethod;
    if ((getGetAnnotationSpecMethod = AutoMlGrpc.getGetAnnotationSpecMethod) == null) {
      synchronized (AutoMlGrpc.class) {
        if ((getGetAnnotationSpecMethod = AutoMlGrpc.getGetAnnotationSpecMethod) == null) {
          AutoMlGrpc.getGetAnnotationSpecMethod =
              getGetAnnotationSpecMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1.GetAnnotationSpecRequest,
                          com.google.cloud.automl.v1.AnnotationSpec>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.automl.v1.AutoMl", "GetAnnotationSpec"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.GetAnnotationSpecRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.AnnotationSpec.getDefaultInstance()))
                      .setSchemaDescriptor(new AutoMlMethodDescriptorSupplier("GetAnnotationSpec"))
                      .build();
        }
      }
    }
    return getGetAnnotationSpecMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateModelMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.CreateModelRequest, com.google.longrunning.Operation>
      METHOD_CREATE_MODEL = getCreateModelMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.CreateModelRequest, com.google.longrunning.Operation>
      getCreateModelMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.CreateModelRequest, com.google.longrunning.Operation>
      getCreateModelMethod() {
    return getCreateModelMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.CreateModelRequest, com.google.longrunning.Operation>
      getCreateModelMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1.CreateModelRequest, com.google.longrunning.Operation>
        getCreateModelMethod;
    if ((getCreateModelMethod = AutoMlGrpc.getCreateModelMethod) == null) {
      synchronized (AutoMlGrpc.class) {
        if ((getCreateModelMethod = AutoMlGrpc.getCreateModelMethod) == null) {
          AutoMlGrpc.getCreateModelMethod =
              getCreateModelMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1.CreateModelRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName("google.cloud.automl.v1.AutoMl", "CreateModel"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.CreateModelRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new AutoMlMethodDescriptorSupplier("CreateModel"))
                      .build();
        }
      }
    }
    return getCreateModelMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetModelMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetModelRequest, com.google.cloud.automl.v1.Model>
      METHOD_GET_MODEL = getGetModelMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetModelRequest, com.google.cloud.automl.v1.Model>
      getGetModelMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetModelRequest, com.google.cloud.automl.v1.Model>
      getGetModelMethod() {
    return getGetModelMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetModelRequest, com.google.cloud.automl.v1.Model>
      getGetModelMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1.GetModelRequest, com.google.cloud.automl.v1.Model>
        getGetModelMethod;
    if ((getGetModelMethod = AutoMlGrpc.getGetModelMethod) == null) {
      synchronized (AutoMlGrpc.class) {
        if ((getGetModelMethod = AutoMlGrpc.getGetModelMethod) == null) {
          AutoMlGrpc.getGetModelMethod =
              getGetModelMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1.GetModelRequest,
                          com.google.cloud.automl.v1.Model>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName("google.cloud.automl.v1.AutoMl", "GetModel"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.GetModelRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.Model.getDefaultInstance()))
                      .setSchemaDescriptor(new AutoMlMethodDescriptorSupplier("GetModel"))
                      .build();
        }
      }
    }
    return getGetModelMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListModelsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ListModelsRequest,
          com.google.cloud.automl.v1.ListModelsResponse>
      METHOD_LIST_MODELS = getListModelsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ListModelsRequest,
          com.google.cloud.automl.v1.ListModelsResponse>
      getListModelsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ListModelsRequest,
          com.google.cloud.automl.v1.ListModelsResponse>
      getListModelsMethod() {
    return getListModelsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ListModelsRequest,
          com.google.cloud.automl.v1.ListModelsResponse>
      getListModelsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1.ListModelsRequest,
            com.google.cloud.automl.v1.ListModelsResponse>
        getListModelsMethod;
    if ((getListModelsMethod = AutoMlGrpc.getListModelsMethod) == null) {
      synchronized (AutoMlGrpc.class) {
        if ((getListModelsMethod = AutoMlGrpc.getListModelsMethod) == null) {
          AutoMlGrpc.getListModelsMethod =
              getListModelsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1.ListModelsRequest,
                          com.google.cloud.automl.v1.ListModelsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName("google.cloud.automl.v1.AutoMl", "ListModels"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.ListModelsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.ListModelsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(new AutoMlMethodDescriptorSupplier("ListModels"))
                      .build();
        }
      }
    }
    return getListModelsMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteModelMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.DeleteModelRequest, com.google.longrunning.Operation>
      METHOD_DELETE_MODEL = getDeleteModelMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.DeleteModelRequest, com.google.longrunning.Operation>
      getDeleteModelMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.DeleteModelRequest, com.google.longrunning.Operation>
      getDeleteModelMethod() {
    return getDeleteModelMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.DeleteModelRequest, com.google.longrunning.Operation>
      getDeleteModelMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1.DeleteModelRequest, com.google.longrunning.Operation>
        getDeleteModelMethod;
    if ((getDeleteModelMethod = AutoMlGrpc.getDeleteModelMethod) == null) {
      synchronized (AutoMlGrpc.class) {
        if ((getDeleteModelMethod = AutoMlGrpc.getDeleteModelMethod) == null) {
          AutoMlGrpc.getDeleteModelMethod =
              getDeleteModelMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1.DeleteModelRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName("google.cloud.automl.v1.AutoMl", "DeleteModel"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.DeleteModelRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new AutoMlMethodDescriptorSupplier("DeleteModel"))
                      .build();
        }
      }
    }
    return getDeleteModelMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateModelMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.UpdateModelRequest, com.google.cloud.automl.v1.Model>
      METHOD_UPDATE_MODEL = getUpdateModelMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.UpdateModelRequest, com.google.cloud.automl.v1.Model>
      getUpdateModelMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.UpdateModelRequest, com.google.cloud.automl.v1.Model>
      getUpdateModelMethod() {
    return getUpdateModelMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.UpdateModelRequest, com.google.cloud.automl.v1.Model>
      getUpdateModelMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1.UpdateModelRequest, com.google.cloud.automl.v1.Model>
        getUpdateModelMethod;
    if ((getUpdateModelMethod = AutoMlGrpc.getUpdateModelMethod) == null) {
      synchronized (AutoMlGrpc.class) {
        if ((getUpdateModelMethod = AutoMlGrpc.getUpdateModelMethod) == null) {
          AutoMlGrpc.getUpdateModelMethod =
              getUpdateModelMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1.UpdateModelRequest,
                          com.google.cloud.automl.v1.Model>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName("google.cloud.automl.v1.AutoMl", "UpdateModel"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.UpdateModelRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.Model.getDefaultInstance()))
                      .setSchemaDescriptor(new AutoMlMethodDescriptorSupplier("UpdateModel"))
                      .build();
        }
      }
    }
    return getUpdateModelMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeployModelMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.DeployModelRequest, com.google.longrunning.Operation>
      METHOD_DEPLOY_MODEL = getDeployModelMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.DeployModelRequest, com.google.longrunning.Operation>
      getDeployModelMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.DeployModelRequest, com.google.longrunning.Operation>
      getDeployModelMethod() {
    return getDeployModelMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.DeployModelRequest, com.google.longrunning.Operation>
      getDeployModelMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1.DeployModelRequest, com.google.longrunning.Operation>
        getDeployModelMethod;
    if ((getDeployModelMethod = AutoMlGrpc.getDeployModelMethod) == null) {
      synchronized (AutoMlGrpc.class) {
        if ((getDeployModelMethod = AutoMlGrpc.getDeployModelMethod) == null) {
          AutoMlGrpc.getDeployModelMethod =
              getDeployModelMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1.DeployModelRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName("google.cloud.automl.v1.AutoMl", "DeployModel"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.DeployModelRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new AutoMlMethodDescriptorSupplier("DeployModel"))
                      .build();
        }
      }
    }
    return getDeployModelMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUndeployModelMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.UndeployModelRequest, com.google.longrunning.Operation>
      METHOD_UNDEPLOY_MODEL = getUndeployModelMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.UndeployModelRequest, com.google.longrunning.Operation>
      getUndeployModelMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.UndeployModelRequest, com.google.longrunning.Operation>
      getUndeployModelMethod() {
    return getUndeployModelMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.UndeployModelRequest, com.google.longrunning.Operation>
      getUndeployModelMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1.UndeployModelRequest, com.google.longrunning.Operation>
        getUndeployModelMethod;
    if ((getUndeployModelMethod = AutoMlGrpc.getUndeployModelMethod) == null) {
      synchronized (AutoMlGrpc.class) {
        if ((getUndeployModelMethod = AutoMlGrpc.getUndeployModelMethod) == null) {
          AutoMlGrpc.getUndeployModelMethod =
              getUndeployModelMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1.UndeployModelRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName("google.cloud.automl.v1.AutoMl", "UndeployModel"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.UndeployModelRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new AutoMlMethodDescriptorSupplier("UndeployModel"))
                      .build();
        }
      }
    }
    return getUndeployModelMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getExportModelMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ExportModelRequest, com.google.longrunning.Operation>
      METHOD_EXPORT_MODEL = getExportModelMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ExportModelRequest, com.google.longrunning.Operation>
      getExportModelMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ExportModelRequest, com.google.longrunning.Operation>
      getExportModelMethod() {
    return getExportModelMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ExportModelRequest, com.google.longrunning.Operation>
      getExportModelMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1.ExportModelRequest, com.google.longrunning.Operation>
        getExportModelMethod;
    if ((getExportModelMethod = AutoMlGrpc.getExportModelMethod) == null) {
      synchronized (AutoMlGrpc.class) {
        if ((getExportModelMethod = AutoMlGrpc.getExportModelMethod) == null) {
          AutoMlGrpc.getExportModelMethod =
              getExportModelMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1.ExportModelRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName("google.cloud.automl.v1.AutoMl", "ExportModel"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.ExportModelRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new AutoMlMethodDescriptorSupplier("ExportModel"))
                      .build();
        }
      }
    }
    return getExportModelMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetModelEvaluationMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetModelEvaluationRequest,
          com.google.cloud.automl.v1.ModelEvaluation>
      METHOD_GET_MODEL_EVALUATION = getGetModelEvaluationMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetModelEvaluationRequest,
          com.google.cloud.automl.v1.ModelEvaluation>
      getGetModelEvaluationMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetModelEvaluationRequest,
          com.google.cloud.automl.v1.ModelEvaluation>
      getGetModelEvaluationMethod() {
    return getGetModelEvaluationMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetModelEvaluationRequest,
          com.google.cloud.automl.v1.ModelEvaluation>
      getGetModelEvaluationMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1.GetModelEvaluationRequest,
            com.google.cloud.automl.v1.ModelEvaluation>
        getGetModelEvaluationMethod;
    if ((getGetModelEvaluationMethod = AutoMlGrpc.getGetModelEvaluationMethod) == null) {
      synchronized (AutoMlGrpc.class) {
        if ((getGetModelEvaluationMethod = AutoMlGrpc.getGetModelEvaluationMethod) == null) {
          AutoMlGrpc.getGetModelEvaluationMethod =
              getGetModelEvaluationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1.GetModelEvaluationRequest,
                          com.google.cloud.automl.v1.ModelEvaluation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.automl.v1.AutoMl", "GetModelEvaluation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.GetModelEvaluationRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.ModelEvaluation.getDefaultInstance()))
                      .setSchemaDescriptor(new AutoMlMethodDescriptorSupplier("GetModelEvaluation"))
                      .build();
        }
      }
    }
    return getGetModelEvaluationMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListModelEvaluationsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ListModelEvaluationsRequest,
          com.google.cloud.automl.v1.ListModelEvaluationsResponse>
      METHOD_LIST_MODEL_EVALUATIONS = getListModelEvaluationsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ListModelEvaluationsRequest,
          com.google.cloud.automl.v1.ListModelEvaluationsResponse>
      getListModelEvaluationsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ListModelEvaluationsRequest,
          com.google.cloud.automl.v1.ListModelEvaluationsResponse>
      getListModelEvaluationsMethod() {
    return getListModelEvaluationsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ListModelEvaluationsRequest,
          com.google.cloud.automl.v1.ListModelEvaluationsResponse>
      getListModelEvaluationsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1.ListModelEvaluationsRequest,
            com.google.cloud.automl.v1.ListModelEvaluationsResponse>
        getListModelEvaluationsMethod;
    if ((getListModelEvaluationsMethod = AutoMlGrpc.getListModelEvaluationsMethod) == null) {
      synchronized (AutoMlGrpc.class) {
        if ((getListModelEvaluationsMethod = AutoMlGrpc.getListModelEvaluationsMethod) == null) {
          AutoMlGrpc.getListModelEvaluationsMethod =
              getListModelEvaluationsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1.ListModelEvaluationsRequest,
                          com.google.cloud.automl.v1.ListModelEvaluationsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.automl.v1.AutoMl", "ListModelEvaluations"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.ListModelEvaluationsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1.ListModelEvaluationsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new AutoMlMethodDescriptorSupplier("ListModelEvaluations"))
                      .build();
        }
      }
    }
    return getListModelEvaluationsMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static AutoMlStub newStub(io.grpc.Channel channel) {
    return new AutoMlStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AutoMlBlockingStub newBlockingStub(io.grpc.Channel channel) {
    return new AutoMlBlockingStub(channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static AutoMlFutureStub newFutureStub(io.grpc.Channel channel) {
    return new AutoMlFutureStub(channel);
  }

  /**
   *
   *
   * <pre>
   * AutoML Server API.
   * The resource names are assigned by the server.
   * The server never reuses names that it has created after the resources with
   * those names are deleted.
   * An ID of a resource is the last element of the item's resource name. For
   * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`, then
   * the id for the item is `{dataset_id}`.
   * Currently the only supported `location_id` is "us-central1".
   * On any input that is documented to expect a string parameter in
   * snake_case or kebab-case, either of those cases is accepted.
   * </pre>
   */
  public abstract static class AutoMlImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Creates a dataset.
     * </pre>
     */
    public void createDataset(
        com.google.cloud.automl.v1.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateDatasetMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a dataset.
     * </pre>
     */
    public void getDataset(
        com.google.cloud.automl.v1.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Dataset> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDatasetMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists datasets in a project.
     * </pre>
     */
    public void listDatasets(
        com.google.cloud.automl.v1.ListDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ListDatasetsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListDatasetsMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a dataset.
     * </pre>
     */
    public void updateDataset(
        com.google.cloud.automl.v1.UpdateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Dataset> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateDatasetMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a dataset and all of its contents.
     * Returns empty response in the
     * [response][google.longrunning.Operation.response] field when it completes,
     * and `delete_details` in the
     * [metadata][google.longrunning.Operation.metadata] field.
     * </pre>
     */
    public void deleteDataset(
        com.google.cloud.automl.v1.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteDatasetMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Imports data into a dataset.
     * </pre>
     */
    public void importData(
        com.google.cloud.automl.v1.ImportDataRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getImportDataMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Exports dataset's data to the provided output location.
     * Returns an empty response in the
     * [response][google.longrunning.Operation.response] field when it completes.
     * </pre>
     */
    public void exportData(
        com.google.cloud.automl.v1.ExportDataRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getExportDataMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets an annotation spec.
     * </pre>
     */
    public void getAnnotationSpec(
        com.google.cloud.automl.v1.GetAnnotationSpecRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.AnnotationSpec> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAnnotationSpecMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a model.
     * Returns a Model in the [response][google.longrunning.Operation.response]
     * field when it completes.
     * When you create a model, several model evaluations are created for it:
     * a global evaluation, and one evaluation for each annotation spec.
     * </pre>
     */
    public void createModel(
        com.google.cloud.automl.v1.CreateModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateModelMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a model.
     * </pre>
     */
    public void getModel(
        com.google.cloud.automl.v1.GetModelRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Model> responseObserver) {
      asyncUnimplementedUnaryCall(getGetModelMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists models.
     * </pre>
     */
    public void listModels(
        com.google.cloud.automl.v1.ListModelsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ListModelsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListModelsMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a model.
     * Returns `google.protobuf.Empty` in the
     * [response][google.longrunning.Operation.response] field when it completes,
     * and `delete_details` in the
     * [metadata][google.longrunning.Operation.metadata] field.
     * </pre>
     */
    public void deleteModel(
        com.google.cloud.automl.v1.DeleteModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteModelMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a model.
     * </pre>
     */
    public void updateModel(
        com.google.cloud.automl.v1.UpdateModelRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Model> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateModelMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deploys a model. If a model is already deployed, deploying it with the
     * same parameters has no effect. Deploying with different parametrs
     * (as e.g. changing
     * [node_number][google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata.node_number])
     *  will reset the deployment state without pausing the model's availability.
     * Only applicable for Text Classification, Image Object Detection; all other
     * domains manage deployment automatically.
     * Returns an empty response in the
     * [response][google.longrunning.Operation.response] field when it completes.
     * </pre>
     */
    public void deployModel(
        com.google.cloud.automl.v1.DeployModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeployModelMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Undeploys a model. If the model is not deployed this method has no effect.
     * Only applicable for Text Classification, Image Object Detection;
     * all other domains manage deployment automatically.
     * Returns an empty response in the
     * [response][google.longrunning.Operation.response] field when it completes.
     * </pre>
     */
    public void undeployModel(
        com.google.cloud.automl.v1.UndeployModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUndeployModelMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Exports a trained, "export-able", model to a user specified Google Cloud
     * Storage location. A model is considered export-able if and only if it has
     * an export format defined for it in
     * [ModelExportOutputConfig][google.cloud.automl.v1.ModelExportOutputConfig].
     * Returns an empty response in the
     * [response][google.longrunning.Operation.response] field when it completes.
     * </pre>
     */
    public void exportModel(
        com.google.cloud.automl.v1.ExportModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getExportModelMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a model evaluation.
     * </pre>
     */
    public void getModelEvaluation(
        com.google.cloud.automl.v1.GetModelEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ModelEvaluation> responseObserver) {
      asyncUnimplementedUnaryCall(getGetModelEvaluationMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists model evaluations.
     * </pre>
     */
    public void listModelEvaluations(
        com.google.cloud.automl.v1.ListModelEvaluationsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ListModelEvaluationsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListModelEvaluationsMethodHelper(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getCreateDatasetMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.CreateDatasetRequest,
                      com.google.longrunning.Operation>(this, METHODID_CREATE_DATASET)))
          .addMethod(
              getGetDatasetMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.GetDatasetRequest,
                      com.google.cloud.automl.v1.Dataset>(this, METHODID_GET_DATASET)))
          .addMethod(
              getListDatasetsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.ListDatasetsRequest,
                      com.google.cloud.automl.v1.ListDatasetsResponse>(
                      this, METHODID_LIST_DATASETS)))
          .addMethod(
              getUpdateDatasetMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.UpdateDatasetRequest,
                      com.google.cloud.automl.v1.Dataset>(this, METHODID_UPDATE_DATASET)))
          .addMethod(
              getDeleteDatasetMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.DeleteDatasetRequest,
                      com.google.longrunning.Operation>(this, METHODID_DELETE_DATASET)))
          .addMethod(
              getImportDataMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.ImportDataRequest,
                      com.google.longrunning.Operation>(this, METHODID_IMPORT_DATA)))
          .addMethod(
              getExportDataMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.ExportDataRequest,
                      com.google.longrunning.Operation>(this, METHODID_EXPORT_DATA)))
          .addMethod(
              getGetAnnotationSpecMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.GetAnnotationSpecRequest,
                      com.google.cloud.automl.v1.AnnotationSpec>(
                      this, METHODID_GET_ANNOTATION_SPEC)))
          .addMethod(
              getCreateModelMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.CreateModelRequest,
                      com.google.longrunning.Operation>(this, METHODID_CREATE_MODEL)))
          .addMethod(
              getGetModelMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.GetModelRequest, com.google.cloud.automl.v1.Model>(
                      this, METHODID_GET_MODEL)))
          .addMethod(
              getListModelsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.ListModelsRequest,
                      com.google.cloud.automl.v1.ListModelsResponse>(this, METHODID_LIST_MODELS)))
          .addMethod(
              getDeleteModelMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.DeleteModelRequest,
                      com.google.longrunning.Operation>(this, METHODID_DELETE_MODEL)))
          .addMethod(
              getUpdateModelMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.UpdateModelRequest,
                      com.google.cloud.automl.v1.Model>(this, METHODID_UPDATE_MODEL)))
          .addMethod(
              getDeployModelMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.DeployModelRequest,
                      com.google.longrunning.Operation>(this, METHODID_DEPLOY_MODEL)))
          .addMethod(
              getUndeployModelMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.UndeployModelRequest,
                      com.google.longrunning.Operation>(this, METHODID_UNDEPLOY_MODEL)))
          .addMethod(
              getExportModelMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.ExportModelRequest,
                      com.google.longrunning.Operation>(this, METHODID_EXPORT_MODEL)))
          .addMethod(
              getGetModelEvaluationMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.GetModelEvaluationRequest,
                      com.google.cloud.automl.v1.ModelEvaluation>(
                      this, METHODID_GET_MODEL_EVALUATION)))
          .addMethod(
              getListModelEvaluationsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.ListModelEvaluationsRequest,
                      com.google.cloud.automl.v1.ListModelEvaluationsResponse>(
                      this, METHODID_LIST_MODEL_EVALUATIONS)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * AutoML Server API.
   * The resource names are assigned by the server.
   * The server never reuses names that it has created after the resources with
   * those names are deleted.
   * An ID of a resource is the last element of the item's resource name. For
   * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`, then
   * the id for the item is `{dataset_id}`.
   * Currently the only supported `location_id` is "us-central1".
   * On any input that is documented to expect a string parameter in
   * snake_case or kebab-case, either of those cases is accepted.
   * </pre>
   */
  public static final class AutoMlStub extends io.grpc.stub.AbstractStub<AutoMlStub> {
    private AutoMlStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AutoMlStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AutoMlStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AutoMlStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates a dataset.
     * </pre>
     */
    public void createDataset(
        com.google.cloud.automl.v1.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateDatasetMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a dataset.
     * </pre>
     */
    public void getDataset(
        com.google.cloud.automl.v1.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Dataset> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDatasetMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists datasets in a project.
     * </pre>
     */
    public void listDatasets(
        com.google.cloud.automl.v1.ListDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ListDatasetsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDatasetsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a dataset.
     * </pre>
     */
    public void updateDataset(
        com.google.cloud.automl.v1.UpdateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Dataset> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateDatasetMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a dataset and all of its contents.
     * Returns empty response in the
     * [response][google.longrunning.Operation.response] field when it completes,
     * and `delete_details` in the
     * [metadata][google.longrunning.Operation.metadata] field.
     * </pre>
     */
    public void deleteDataset(
        com.google.cloud.automl.v1.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteDatasetMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Imports data into a dataset.
     * </pre>
     */
    public void importData(
        com.google.cloud.automl.v1.ImportDataRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getImportDataMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Exports dataset's data to the provided output location.
     * Returns an empty response in the
     * [response][google.longrunning.Operation.response] field when it completes.
     * </pre>
     */
    public void exportData(
        com.google.cloud.automl.v1.ExportDataRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExportDataMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets an annotation spec.
     * </pre>
     */
    public void getAnnotationSpec(
        com.google.cloud.automl.v1.GetAnnotationSpecRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.AnnotationSpec> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAnnotationSpecMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a model.
     * Returns a Model in the [response][google.longrunning.Operation.response]
     * field when it completes.
     * When you create a model, several model evaluations are created for it:
     * a global evaluation, and one evaluation for each annotation spec.
     * </pre>
     */
    public void createModel(
        com.google.cloud.automl.v1.CreateModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateModelMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a model.
     * </pre>
     */
    public void getModel(
        com.google.cloud.automl.v1.GetModelRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Model> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetModelMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists models.
     * </pre>
     */
    public void listModels(
        com.google.cloud.automl.v1.ListModelsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ListModelsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListModelsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a model.
     * Returns `google.protobuf.Empty` in the
     * [response][google.longrunning.Operation.response] field when it completes,
     * and `delete_details` in the
     * [metadata][google.longrunning.Operation.metadata] field.
     * </pre>
     */
    public void deleteModel(
        com.google.cloud.automl.v1.DeleteModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteModelMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a model.
     * </pre>
     */
    public void updateModel(
        com.google.cloud.automl.v1.UpdateModelRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Model> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateModelMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deploys a model. If a model is already deployed, deploying it with the
     * same parameters has no effect. Deploying with different parametrs
     * (as e.g. changing
     * [node_number][google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata.node_number])
     *  will reset the deployment state without pausing the model's availability.
     * Only applicable for Text Classification, Image Object Detection; all other
     * domains manage deployment automatically.
     * Returns an empty response in the
     * [response][google.longrunning.Operation.response] field when it completes.
     * </pre>
     */
    public void deployModel(
        com.google.cloud.automl.v1.DeployModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeployModelMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Undeploys a model. If the model is not deployed this method has no effect.
     * Only applicable for Text Classification, Image Object Detection;
     * all other domains manage deployment automatically.
     * Returns an empty response in the
     * [response][google.longrunning.Operation.response] field when it completes.
     * </pre>
     */
    public void undeployModel(
        com.google.cloud.automl.v1.UndeployModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUndeployModelMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Exports a trained, "export-able", model to a user specified Google Cloud
     * Storage location. A model is considered export-able if and only if it has
     * an export format defined for it in
     * [ModelExportOutputConfig][google.cloud.automl.v1.ModelExportOutputConfig].
     * Returns an empty response in the
     * [response][google.longrunning.Operation.response] field when it completes.
     * </pre>
     */
    public void exportModel(
        com.google.cloud.automl.v1.ExportModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExportModelMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a model evaluation.
     * </pre>
     */
    public void getModelEvaluation(
        com.google.cloud.automl.v1.GetModelEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ModelEvaluation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetModelEvaluationMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists model evaluations.
     * </pre>
     */
    public void listModelEvaluations(
        com.google.cloud.automl.v1.ListModelEvaluationsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ListModelEvaluationsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListModelEvaluationsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * AutoML Server API.
   * The resource names are assigned by the server.
   * The server never reuses names that it has created after the resources with
   * those names are deleted.
   * An ID of a resource is the last element of the item's resource name. For
   * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`, then
   * the id for the item is `{dataset_id}`.
   * Currently the only supported `location_id` is "us-central1".
   * On any input that is documented to expect a string parameter in
   * snake_case or kebab-case, either of those cases is accepted.
   * </pre>
   */
  public static final class AutoMlBlockingStub
      extends io.grpc.stub.AbstractStub<AutoMlBlockingStub> {
    private AutoMlBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AutoMlBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AutoMlBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AutoMlBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates a dataset.
     * </pre>
     */
    public com.google.longrunning.Operation createDataset(
        com.google.cloud.automl.v1.CreateDatasetRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateDatasetMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a dataset.
     * </pre>
     */
    public com.google.cloud.automl.v1.Dataset getDataset(
        com.google.cloud.automl.v1.GetDatasetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDatasetMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists datasets in a project.
     * </pre>
     */
    public com.google.cloud.automl.v1.ListDatasetsResponse listDatasets(
        com.google.cloud.automl.v1.ListDatasetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListDatasetsMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a dataset.
     * </pre>
     */
    public com.google.cloud.automl.v1.Dataset updateDataset(
        com.google.cloud.automl.v1.UpdateDatasetRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateDatasetMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a dataset and all of its contents.
     * Returns empty response in the
     * [response][google.longrunning.Operation.response] field when it completes,
     * and `delete_details` in the
     * [metadata][google.longrunning.Operation.metadata] field.
     * </pre>
     */
    public com.google.longrunning.Operation deleteDataset(
        com.google.cloud.automl.v1.DeleteDatasetRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteDatasetMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Imports data into a dataset.
     * </pre>
     */
    public com.google.longrunning.Operation importData(
        com.google.cloud.automl.v1.ImportDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getImportDataMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Exports dataset's data to the provided output location.
     * Returns an empty response in the
     * [response][google.longrunning.Operation.response] field when it completes.
     * </pre>
     */
    public com.google.longrunning.Operation exportData(
        com.google.cloud.automl.v1.ExportDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getExportDataMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets an annotation spec.
     * </pre>
     */
    public com.google.cloud.automl.v1.AnnotationSpec getAnnotationSpec(
        com.google.cloud.automl.v1.GetAnnotationSpecRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAnnotationSpecMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a model.
     * Returns a Model in the [response][google.longrunning.Operation.response]
     * field when it completes.
     * When you create a model, several model evaluations are created for it:
     * a global evaluation, and one evaluation for each annotation spec.
     * </pre>
     */
    public com.google.longrunning.Operation createModel(
        com.google.cloud.automl.v1.CreateModelRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateModelMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a model.
     * </pre>
     */
    public com.google.cloud.automl.v1.Model getModel(
        com.google.cloud.automl.v1.GetModelRequest request) {
      return blockingUnaryCall(getChannel(), getGetModelMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists models.
     * </pre>
     */
    public com.google.cloud.automl.v1.ListModelsResponse listModels(
        com.google.cloud.automl.v1.ListModelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListModelsMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a model.
     * Returns `google.protobuf.Empty` in the
     * [response][google.longrunning.Operation.response] field when it completes,
     * and `delete_details` in the
     * [metadata][google.longrunning.Operation.metadata] field.
     * </pre>
     */
    public com.google.longrunning.Operation deleteModel(
        com.google.cloud.automl.v1.DeleteModelRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteModelMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a model.
     * </pre>
     */
    public com.google.cloud.automl.v1.Model updateModel(
        com.google.cloud.automl.v1.UpdateModelRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateModelMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deploys a model. If a model is already deployed, deploying it with the
     * same parameters has no effect. Deploying with different parametrs
     * (as e.g. changing
     * [node_number][google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata.node_number])
     *  will reset the deployment state without pausing the model's availability.
     * Only applicable for Text Classification, Image Object Detection; all other
     * domains manage deployment automatically.
     * Returns an empty response in the
     * [response][google.longrunning.Operation.response] field when it completes.
     * </pre>
     */
    public com.google.longrunning.Operation deployModel(
        com.google.cloud.automl.v1.DeployModelRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeployModelMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Undeploys a model. If the model is not deployed this method has no effect.
     * Only applicable for Text Classification, Image Object Detection;
     * all other domains manage deployment automatically.
     * Returns an empty response in the
     * [response][google.longrunning.Operation.response] field when it completes.
     * </pre>
     */
    public com.google.longrunning.Operation undeployModel(
        com.google.cloud.automl.v1.UndeployModelRequest request) {
      return blockingUnaryCall(
          getChannel(), getUndeployModelMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Exports a trained, "export-able", model to a user specified Google Cloud
     * Storage location. A model is considered export-able if and only if it has
     * an export format defined for it in
     * [ModelExportOutputConfig][google.cloud.automl.v1.ModelExportOutputConfig].
     * Returns an empty response in the
     * [response][google.longrunning.Operation.response] field when it completes.
     * </pre>
     */
    public com.google.longrunning.Operation exportModel(
        com.google.cloud.automl.v1.ExportModelRequest request) {
      return blockingUnaryCall(
          getChannel(), getExportModelMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a model evaluation.
     * </pre>
     */
    public com.google.cloud.automl.v1.ModelEvaluation getModelEvaluation(
        com.google.cloud.automl.v1.GetModelEvaluationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetModelEvaluationMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists model evaluations.
     * </pre>
     */
    public com.google.cloud.automl.v1.ListModelEvaluationsResponse listModelEvaluations(
        com.google.cloud.automl.v1.ListModelEvaluationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListModelEvaluationsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * AutoML Server API.
   * The resource names are assigned by the server.
   * The server never reuses names that it has created after the resources with
   * those names are deleted.
   * An ID of a resource is the last element of the item's resource name. For
   * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`, then
   * the id for the item is `{dataset_id}`.
   * Currently the only supported `location_id` is "us-central1".
   * On any input that is documented to expect a string parameter in
   * snake_case or kebab-case, either of those cases is accepted.
   * </pre>
   */
  public static final class AutoMlFutureStub extends io.grpc.stub.AbstractStub<AutoMlFutureStub> {
    private AutoMlFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AutoMlFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AutoMlFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AutoMlFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates a dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        createDataset(com.google.cloud.automl.v1.CreateDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateDatasetMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.automl.v1.Dataset>
        getDataset(com.google.cloud.automl.v1.GetDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDatasetMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists datasets in a project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.automl.v1.ListDatasetsResponse>
        listDatasets(com.google.cloud.automl.v1.ListDatasetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListDatasetsMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.automl.v1.Dataset>
        updateDataset(com.google.cloud.automl.v1.UpdateDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateDatasetMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a dataset and all of its contents.
     * Returns empty response in the
     * [response][google.longrunning.Operation.response] field when it completes,
     * and `delete_details` in the
     * [metadata][google.longrunning.Operation.metadata] field.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deleteDataset(com.google.cloud.automl.v1.DeleteDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteDatasetMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Imports data into a dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        importData(com.google.cloud.automl.v1.ImportDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getImportDataMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Exports dataset's data to the provided output location.
     * Returns an empty response in the
     * [response][google.longrunning.Operation.response] field when it completes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        exportData(com.google.cloud.automl.v1.ExportDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExportDataMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets an annotation spec.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.automl.v1.AnnotationSpec>
        getAnnotationSpec(com.google.cloud.automl.v1.GetAnnotationSpecRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAnnotationSpecMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a model.
     * Returns a Model in the [response][google.longrunning.Operation.response]
     * field when it completes.
     * When you create a model, several model evaluations are created for it:
     * a global evaluation, and one evaluation for each annotation spec.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        createModel(com.google.cloud.automl.v1.CreateModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateModelMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.automl.v1.Model>
        getModel(com.google.cloud.automl.v1.GetModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetModelMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists models.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.automl.v1.ListModelsResponse>
        listModels(com.google.cloud.automl.v1.ListModelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListModelsMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a model.
     * Returns `google.protobuf.Empty` in the
     * [response][google.longrunning.Operation.response] field when it completes,
     * and `delete_details` in the
     * [metadata][google.longrunning.Operation.metadata] field.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deleteModel(com.google.cloud.automl.v1.DeleteModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteModelMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.automl.v1.Model>
        updateModel(com.google.cloud.automl.v1.UpdateModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateModelMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deploys a model. If a model is already deployed, deploying it with the
     * same parameters has no effect. Deploying with different parametrs
     * (as e.g. changing
     * [node_number][google.cloud.automl.v1.ImageObjectDetectionModelDeploymentMetadata.node_number])
     *  will reset the deployment state without pausing the model's availability.
     * Only applicable for Text Classification, Image Object Detection; all other
     * domains manage deployment automatically.
     * Returns an empty response in the
     * [response][google.longrunning.Operation.response] field when it completes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deployModel(com.google.cloud.automl.v1.DeployModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeployModelMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Undeploys a model. If the model is not deployed this method has no effect.
     * Only applicable for Text Classification, Image Object Detection;
     * all other domains manage deployment automatically.
     * Returns an empty response in the
     * [response][google.longrunning.Operation.response] field when it completes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        undeployModel(com.google.cloud.automl.v1.UndeployModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUndeployModelMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Exports a trained, "export-able", model to a user specified Google Cloud
     * Storage location. A model is considered export-able if and only if it has
     * an export format defined for it in
     * [ModelExportOutputConfig][google.cloud.automl.v1.ModelExportOutputConfig].
     * Returns an empty response in the
     * [response][google.longrunning.Operation.response] field when it completes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        exportModel(com.google.cloud.automl.v1.ExportModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExportModelMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a model evaluation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.automl.v1.ModelEvaluation>
        getModelEvaluation(com.google.cloud.automl.v1.GetModelEvaluationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetModelEvaluationMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists model evaluations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.automl.v1.ListModelEvaluationsResponse>
        listModelEvaluations(com.google.cloud.automl.v1.ListModelEvaluationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListModelEvaluationsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DATASET = 0;
  private static final int METHODID_GET_DATASET = 1;
  private static final int METHODID_LIST_DATASETS = 2;
  private static final int METHODID_UPDATE_DATASET = 3;
  private static final int METHODID_DELETE_DATASET = 4;
  private static final int METHODID_IMPORT_DATA = 5;
  private static final int METHODID_EXPORT_DATA = 6;
  private static final int METHODID_GET_ANNOTATION_SPEC = 7;
  private static final int METHODID_CREATE_MODEL = 8;
  private static final int METHODID_GET_MODEL = 9;
  private static final int METHODID_LIST_MODELS = 10;
  private static final int METHODID_DELETE_MODEL = 11;
  private static final int METHODID_UPDATE_MODEL = 12;
  private static final int METHODID_DEPLOY_MODEL = 13;
  private static final int METHODID_UNDEPLOY_MODEL = 14;
  private static final int METHODID_EXPORT_MODEL = 15;
  private static final int METHODID_GET_MODEL_EVALUATION = 16;
  private static final int METHODID_LIST_MODEL_EVALUATIONS = 17;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AutoMlImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AutoMlImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_DATASET:
          serviceImpl.createDataset(
              (com.google.cloud.automl.v1.CreateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_DATASET:
          serviceImpl.getDataset(
              (com.google.cloud.automl.v1.GetDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Dataset>) responseObserver);
          break;
        case METHODID_LIST_DATASETS:
          serviceImpl.listDatasets(
              (com.google.cloud.automl.v1.ListDatasetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ListDatasetsResponse>)
                  responseObserver);
          break;
        case METHODID_UPDATE_DATASET:
          serviceImpl.updateDataset(
              (com.google.cloud.automl.v1.UpdateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Dataset>) responseObserver);
          break;
        case METHODID_DELETE_DATASET:
          serviceImpl.deleteDataset(
              (com.google.cloud.automl.v1.DeleteDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_IMPORT_DATA:
          serviceImpl.importData(
              (com.google.cloud.automl.v1.ImportDataRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_EXPORT_DATA:
          serviceImpl.exportData(
              (com.google.cloud.automl.v1.ExportDataRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_ANNOTATION_SPEC:
          serviceImpl.getAnnotationSpec(
              (com.google.cloud.automl.v1.GetAnnotationSpecRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.AnnotationSpec>)
                  responseObserver);
          break;
        case METHODID_CREATE_MODEL:
          serviceImpl.createModel(
              (com.google.cloud.automl.v1.CreateModelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_MODEL:
          serviceImpl.getModel(
              (com.google.cloud.automl.v1.GetModelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Model>) responseObserver);
          break;
        case METHODID_LIST_MODELS:
          serviceImpl.listModels(
              (com.google.cloud.automl.v1.ListModelsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ListModelsResponse>)
                  responseObserver);
          break;
        case METHODID_DELETE_MODEL:
          serviceImpl.deleteModel(
              (com.google.cloud.automl.v1.DeleteModelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_MODEL:
          serviceImpl.updateModel(
              (com.google.cloud.automl.v1.UpdateModelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Model>) responseObserver);
          break;
        case METHODID_DEPLOY_MODEL:
          serviceImpl.deployModel(
              (com.google.cloud.automl.v1.DeployModelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_UNDEPLOY_MODEL:
          serviceImpl.undeployModel(
              (com.google.cloud.automl.v1.UndeployModelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_EXPORT_MODEL:
          serviceImpl.exportModel(
              (com.google.cloud.automl.v1.ExportModelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_MODEL_EVALUATION:
          serviceImpl.getModelEvaluation(
              (com.google.cloud.automl.v1.GetModelEvaluationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ModelEvaluation>)
                  responseObserver);
          break;
        case METHODID_LIST_MODEL_EVALUATIONS:
          serviceImpl.listModelEvaluations(
              (com.google.cloud.automl.v1.ListModelEvaluationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ListModelEvaluationsResponse>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class AutoMlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AutoMlBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.automl.v1.AutoMlProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AutoMl");
    }
  }

  private static final class AutoMlFileDescriptorSupplier extends AutoMlBaseDescriptorSupplier {
    AutoMlFileDescriptorSupplier() {}
  }

  private static final class AutoMlMethodDescriptorSupplier extends AutoMlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AutoMlMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AutoMlGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new AutoMlFileDescriptorSupplier())
                      .addMethod(getCreateDatasetMethodHelper())
                      .addMethod(getGetDatasetMethodHelper())
                      .addMethod(getListDatasetsMethodHelper())
                      .addMethod(getUpdateDatasetMethodHelper())
                      .addMethod(getDeleteDatasetMethodHelper())
                      .addMethod(getImportDataMethodHelper())
                      .addMethod(getExportDataMethodHelper())
                      .addMethod(getGetAnnotationSpecMethodHelper())
                      .addMethod(getCreateModelMethodHelper())
                      .addMethod(getGetModelMethodHelper())
                      .addMethod(getListModelsMethodHelper())
                      .addMethod(getDeleteModelMethodHelper())
                      .addMethod(getUpdateModelMethodHelper())
                      .addMethod(getDeployModelMethodHelper())
                      .addMethod(getUndeployModelMethodHelper())
                      .addMethod(getExportModelMethodHelper())
                      .addMethod(getGetModelEvaluationMethodHelper())
                      .addMethod(getListModelEvaluationsMethodHelper())
                      .build();
        }
      }
    }
    return result;
  }
}
