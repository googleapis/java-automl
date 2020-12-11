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

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/automl/v1/service.proto")
public final class AutoMlGrpc {

  private AutoMlGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.automl.v1.AutoMl";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.CreateDatasetRequest, com.google.longrunning.Operation>
      getCreateDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDataset",
      requestType = com.google.cloud.automl.v1.CreateDatasetRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.CreateDatasetRequest, com.google.longrunning.Operation>
      getCreateDatasetMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDataset"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetDatasetRequest, com.google.cloud.automl.v1.Dataset>
      getGetDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDataset",
      requestType = com.google.cloud.automl.v1.GetDatasetRequest.class,
      responseType = com.google.cloud.automl.v1.Dataset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetDatasetRequest, com.google.cloud.automl.v1.Dataset>
      getGetDatasetMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDataset"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ListDatasetsRequest,
          com.google.cloud.automl.v1.ListDatasetsResponse>
      getListDatasetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDatasets",
      requestType = com.google.cloud.automl.v1.ListDatasetsRequest.class,
      responseType = com.google.cloud.automl.v1.ListDatasetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ListDatasetsRequest,
          com.google.cloud.automl.v1.ListDatasetsResponse>
      getListDatasetsMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDatasets"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.UpdateDatasetRequest, com.google.cloud.automl.v1.Dataset>
      getUpdateDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDataset",
      requestType = com.google.cloud.automl.v1.UpdateDatasetRequest.class,
      responseType = com.google.cloud.automl.v1.Dataset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.UpdateDatasetRequest, com.google.cloud.automl.v1.Dataset>
      getUpdateDatasetMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDataset"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.DeleteDatasetRequest, com.google.longrunning.Operation>
      getDeleteDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDataset",
      requestType = com.google.cloud.automl.v1.DeleteDatasetRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.DeleteDatasetRequest, com.google.longrunning.Operation>
      getDeleteDatasetMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDataset"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ImportDataRequest, com.google.longrunning.Operation>
      getImportDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportData",
      requestType = com.google.cloud.automl.v1.ImportDataRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ImportDataRequest, com.google.longrunning.Operation>
      getImportDataMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportData"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ExportDataRequest, com.google.longrunning.Operation>
      getExportDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportData",
      requestType = com.google.cloud.automl.v1.ExportDataRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ExportDataRequest, com.google.longrunning.Operation>
      getExportDataMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportData"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetAnnotationSpecRequest,
          com.google.cloud.automl.v1.AnnotationSpec>
      getGetAnnotationSpecMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnnotationSpec",
      requestType = com.google.cloud.automl.v1.GetAnnotationSpecRequest.class,
      responseType = com.google.cloud.automl.v1.AnnotationSpec.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetAnnotationSpecRequest,
          com.google.cloud.automl.v1.AnnotationSpec>
      getGetAnnotationSpecMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnnotationSpec"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.CreateModelRequest, com.google.longrunning.Operation>
      getCreateModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateModel",
      requestType = com.google.cloud.automl.v1.CreateModelRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.CreateModelRequest, com.google.longrunning.Operation>
      getCreateModelMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateModel"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetModelRequest, com.google.cloud.automl.v1.Model>
      getGetModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModel",
      requestType = com.google.cloud.automl.v1.GetModelRequest.class,
      responseType = com.google.cloud.automl.v1.Model.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetModelRequest, com.google.cloud.automl.v1.Model>
      getGetModelMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModel"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ListModelsRequest,
          com.google.cloud.automl.v1.ListModelsResponse>
      getListModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModels",
      requestType = com.google.cloud.automl.v1.ListModelsRequest.class,
      responseType = com.google.cloud.automl.v1.ListModelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ListModelsRequest,
          com.google.cloud.automl.v1.ListModelsResponse>
      getListModelsMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListModels"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.DeleteModelRequest, com.google.longrunning.Operation>
      getDeleteModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteModel",
      requestType = com.google.cloud.automl.v1.DeleteModelRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.DeleteModelRequest, com.google.longrunning.Operation>
      getDeleteModelMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteModel"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.UpdateModelRequest, com.google.cloud.automl.v1.Model>
      getUpdateModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateModel",
      requestType = com.google.cloud.automl.v1.UpdateModelRequest.class,
      responseType = com.google.cloud.automl.v1.Model.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.UpdateModelRequest, com.google.cloud.automl.v1.Model>
      getUpdateModelMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateModel"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.DeployModelRequest, com.google.longrunning.Operation>
      getDeployModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeployModel",
      requestType = com.google.cloud.automl.v1.DeployModelRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.DeployModelRequest, com.google.longrunning.Operation>
      getDeployModelMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeployModel"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.UndeployModelRequest, com.google.longrunning.Operation>
      getUndeployModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UndeployModel",
      requestType = com.google.cloud.automl.v1.UndeployModelRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.UndeployModelRequest, com.google.longrunning.Operation>
      getUndeployModelMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UndeployModel"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ExportModelRequest, com.google.longrunning.Operation>
      getExportModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportModel",
      requestType = com.google.cloud.automl.v1.ExportModelRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ExportModelRequest, com.google.longrunning.Operation>
      getExportModelMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportModel"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetModelEvaluationRequest,
          com.google.cloud.automl.v1.ModelEvaluation>
      getGetModelEvaluationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModelEvaluation",
      requestType = com.google.cloud.automl.v1.GetModelEvaluationRequest.class,
      responseType = com.google.cloud.automl.v1.ModelEvaluation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.GetModelEvaluationRequest,
          com.google.cloud.automl.v1.ModelEvaluation>
      getGetModelEvaluationMethod() {
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
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModelEvaluation"))
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

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ListModelEvaluationsRequest,
          com.google.cloud.automl.v1.ListModelEvaluationsResponse>
      getListModelEvaluationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListModelEvaluations",
      requestType = com.google.cloud.automl.v1.ListModelEvaluationsRequest.class,
      responseType = com.google.cloud.automl.v1.ListModelEvaluationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1.ListModelEvaluationsRequest,
          com.google.cloud.automl.v1.ListModelEvaluationsResponse>
      getListModelEvaluationsMethod() {
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
                          generateFullMethodName(SERVICE_NAME, "ListModelEvaluations"))
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
    io.grpc.stub.AbstractStub.StubFactory<AutoMlStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<AutoMlStub>() {
          @java.lang.Override
          public AutoMlStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AutoMlStub(channel, callOptions);
          }
        };
    return AutoMlStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AutoMlBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AutoMlBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<AutoMlBlockingStub>() {
          @java.lang.Override
          public AutoMlBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AutoMlBlockingStub(channel, callOptions);
          }
        };
    return AutoMlBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static AutoMlFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AutoMlFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<AutoMlFutureStub>() {
          @java.lang.Override
          public AutoMlFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AutoMlFutureStub(channel, callOptions);
          }
        };
    return AutoMlFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class AutoMlImplBase implements io.grpc.BindableService {

    /** */
    public void createDataset(
        com.google.cloud.automl.v1.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateDatasetMethod(), responseObserver);
    }

    /** */
    public void getDataset(
        com.google.cloud.automl.v1.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Dataset> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDatasetMethod(), responseObserver);
    }

    /** */
    public void listDatasets(
        com.google.cloud.automl.v1.ListDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ListDatasetsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListDatasetsMethod(), responseObserver);
    }

    /** */
    public void updateDataset(
        com.google.cloud.automl.v1.UpdateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Dataset> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateDatasetMethod(), responseObserver);
    }

    /** */
    public void deleteDataset(
        com.google.cloud.automl.v1.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteDatasetMethod(), responseObserver);
    }

    /** */
    public void importData(
        com.google.cloud.automl.v1.ImportDataRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getImportDataMethod(), responseObserver);
    }

    /** */
    public void exportData(
        com.google.cloud.automl.v1.ExportDataRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getExportDataMethod(), responseObserver);
    }

    /** */
    public void getAnnotationSpec(
        com.google.cloud.automl.v1.GetAnnotationSpecRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.AnnotationSpec> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAnnotationSpecMethod(), responseObserver);
    }

    /** */
    public void createModel(
        com.google.cloud.automl.v1.CreateModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateModelMethod(), responseObserver);
    }

    /** */
    public void getModel(
        com.google.cloud.automl.v1.GetModelRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Model> responseObserver) {
      asyncUnimplementedUnaryCall(getGetModelMethod(), responseObserver);
    }

    /** */
    public void listModels(
        com.google.cloud.automl.v1.ListModelsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ListModelsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListModelsMethod(), responseObserver);
    }

    /** */
    public void deleteModel(
        com.google.cloud.automl.v1.DeleteModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteModelMethod(), responseObserver);
    }

    /** */
    public void updateModel(
        com.google.cloud.automl.v1.UpdateModelRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Model> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateModelMethod(), responseObserver);
    }

    /** */
    public void deployModel(
        com.google.cloud.automl.v1.DeployModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeployModelMethod(), responseObserver);
    }

    /** */
    public void undeployModel(
        com.google.cloud.automl.v1.UndeployModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUndeployModelMethod(), responseObserver);
    }

    /** */
    public void exportModel(
        com.google.cloud.automl.v1.ExportModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getExportModelMethod(), responseObserver);
    }

    /** */
    public void getModelEvaluation(
        com.google.cloud.automl.v1.GetModelEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ModelEvaluation> responseObserver) {
      asyncUnimplementedUnaryCall(getGetModelEvaluationMethod(), responseObserver);
    }

    /** */
    public void listModelEvaluations(
        com.google.cloud.automl.v1.ListModelEvaluationsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ListModelEvaluationsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListModelEvaluationsMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getCreateDatasetMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.CreateDatasetRequest,
                      com.google.longrunning.Operation>(this, METHODID_CREATE_DATASET)))
          .addMethod(
              getGetDatasetMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.GetDatasetRequest,
                      com.google.cloud.automl.v1.Dataset>(this, METHODID_GET_DATASET)))
          .addMethod(
              getListDatasetsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.ListDatasetsRequest,
                      com.google.cloud.automl.v1.ListDatasetsResponse>(
                      this, METHODID_LIST_DATASETS)))
          .addMethod(
              getUpdateDatasetMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.UpdateDatasetRequest,
                      com.google.cloud.automl.v1.Dataset>(this, METHODID_UPDATE_DATASET)))
          .addMethod(
              getDeleteDatasetMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.DeleteDatasetRequest,
                      com.google.longrunning.Operation>(this, METHODID_DELETE_DATASET)))
          .addMethod(
              getImportDataMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.ImportDataRequest,
                      com.google.longrunning.Operation>(this, METHODID_IMPORT_DATA)))
          .addMethod(
              getExportDataMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.ExportDataRequest,
                      com.google.longrunning.Operation>(this, METHODID_EXPORT_DATA)))
          .addMethod(
              getGetAnnotationSpecMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.GetAnnotationSpecRequest,
                      com.google.cloud.automl.v1.AnnotationSpec>(
                      this, METHODID_GET_ANNOTATION_SPEC)))
          .addMethod(
              getCreateModelMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.CreateModelRequest,
                      com.google.longrunning.Operation>(this, METHODID_CREATE_MODEL)))
          .addMethod(
              getGetModelMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.GetModelRequest, com.google.cloud.automl.v1.Model>(
                      this, METHODID_GET_MODEL)))
          .addMethod(
              getListModelsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.ListModelsRequest,
                      com.google.cloud.automl.v1.ListModelsResponse>(this, METHODID_LIST_MODELS)))
          .addMethod(
              getDeleteModelMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.DeleteModelRequest,
                      com.google.longrunning.Operation>(this, METHODID_DELETE_MODEL)))
          .addMethod(
              getUpdateModelMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.UpdateModelRequest,
                      com.google.cloud.automl.v1.Model>(this, METHODID_UPDATE_MODEL)))
          .addMethod(
              getDeployModelMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.DeployModelRequest,
                      com.google.longrunning.Operation>(this, METHODID_DEPLOY_MODEL)))
          .addMethod(
              getUndeployModelMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.UndeployModelRequest,
                      com.google.longrunning.Operation>(this, METHODID_UNDEPLOY_MODEL)))
          .addMethod(
              getExportModelMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.ExportModelRequest,
                      com.google.longrunning.Operation>(this, METHODID_EXPORT_MODEL)))
          .addMethod(
              getGetModelEvaluationMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.GetModelEvaluationRequest,
                      com.google.cloud.automl.v1.ModelEvaluation>(
                      this, METHODID_GET_MODEL_EVALUATION)))
          .addMethod(
              getListModelEvaluationsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1.ListModelEvaluationsRequest,
                      com.google.cloud.automl.v1.ListModelEvaluationsResponse>(
                      this, METHODID_LIST_MODEL_EVALUATIONS)))
          .build();
    }
  }

  /** */
  public static final class AutoMlStub extends io.grpc.stub.AbstractAsyncStub<AutoMlStub> {
    private AutoMlStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AutoMlStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AutoMlStub(channel, callOptions);
    }

    /** */
    public void createDataset(
        com.google.cloud.automl.v1.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateDatasetMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getDataset(
        com.google.cloud.automl.v1.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Dataset> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void listDatasets(
        com.google.cloud.automl.v1.ListDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ListDatasetsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDatasetsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void updateDataset(
        com.google.cloud.automl.v1.UpdateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Dataset> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateDatasetMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void deleteDataset(
        com.google.cloud.automl.v1.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteDatasetMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void importData(
        com.google.cloud.automl.v1.ImportDataRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getImportDataMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void exportData(
        com.google.cloud.automl.v1.ExportDataRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExportDataMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void getAnnotationSpec(
        com.google.cloud.automl.v1.GetAnnotationSpecRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.AnnotationSpec> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAnnotationSpecMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void createModel(
        com.google.cloud.automl.v1.CreateModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateModelMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getModel(
        com.google.cloud.automl.v1.GetModelRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Model> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetModelMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void listModels(
        com.google.cloud.automl.v1.ListModelsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ListModelsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListModelsMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void deleteModel(
        com.google.cloud.automl.v1.DeleteModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteModelMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void updateModel(
        com.google.cloud.automl.v1.UpdateModelRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.Model> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateModelMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void deployModel(
        com.google.cloud.automl.v1.DeployModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeployModelMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void undeployModel(
        com.google.cloud.automl.v1.UndeployModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUndeployModelMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void exportModel(
        com.google.cloud.automl.v1.ExportModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExportModelMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getModelEvaluation(
        com.google.cloud.automl.v1.GetModelEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ModelEvaluation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetModelEvaluationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void listModelEvaluations(
        com.google.cloud.automl.v1.ListModelEvaluationsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1.ListModelEvaluationsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListModelEvaluationsMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class AutoMlBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AutoMlBlockingStub> {
    private AutoMlBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AutoMlBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AutoMlBlockingStub(channel, callOptions);
    }

    /** */
    public com.google.longrunning.Operation createDataset(
        com.google.cloud.automl.v1.CreateDatasetRequest request) {
      return blockingUnaryCall(getChannel(), getCreateDatasetMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.automl.v1.Dataset getDataset(
        com.google.cloud.automl.v1.GetDatasetRequest request) {
      return blockingUnaryCall(getChannel(), getGetDatasetMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.automl.v1.ListDatasetsResponse listDatasets(
        com.google.cloud.automl.v1.ListDatasetsRequest request) {
      return blockingUnaryCall(getChannel(), getListDatasetsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.automl.v1.Dataset updateDataset(
        com.google.cloud.automl.v1.UpdateDatasetRequest request) {
      return blockingUnaryCall(getChannel(), getUpdateDatasetMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation deleteDataset(
        com.google.cloud.automl.v1.DeleteDatasetRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteDatasetMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation importData(
        com.google.cloud.automl.v1.ImportDataRequest request) {
      return blockingUnaryCall(getChannel(), getImportDataMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation exportData(
        com.google.cloud.automl.v1.ExportDataRequest request) {
      return blockingUnaryCall(getChannel(), getExportDataMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.automl.v1.AnnotationSpec getAnnotationSpec(
        com.google.cloud.automl.v1.GetAnnotationSpecRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAnnotationSpecMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation createModel(
        com.google.cloud.automl.v1.CreateModelRequest request) {
      return blockingUnaryCall(getChannel(), getCreateModelMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.automl.v1.Model getModel(
        com.google.cloud.automl.v1.GetModelRequest request) {
      return blockingUnaryCall(getChannel(), getGetModelMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.automl.v1.ListModelsResponse listModels(
        com.google.cloud.automl.v1.ListModelsRequest request) {
      return blockingUnaryCall(getChannel(), getListModelsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation deleteModel(
        com.google.cloud.automl.v1.DeleteModelRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteModelMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.automl.v1.Model updateModel(
        com.google.cloud.automl.v1.UpdateModelRequest request) {
      return blockingUnaryCall(getChannel(), getUpdateModelMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation deployModel(
        com.google.cloud.automl.v1.DeployModelRequest request) {
      return blockingUnaryCall(getChannel(), getDeployModelMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation undeployModel(
        com.google.cloud.automl.v1.UndeployModelRequest request) {
      return blockingUnaryCall(getChannel(), getUndeployModelMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation exportModel(
        com.google.cloud.automl.v1.ExportModelRequest request) {
      return blockingUnaryCall(getChannel(), getExportModelMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.automl.v1.ModelEvaluation getModelEvaluation(
        com.google.cloud.automl.v1.GetModelEvaluationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetModelEvaluationMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.automl.v1.ListModelEvaluationsResponse listModelEvaluations(
        com.google.cloud.automl.v1.ListModelEvaluationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListModelEvaluationsMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class AutoMlFutureStub
      extends io.grpc.stub.AbstractFutureStub<AutoMlFutureStub> {
    private AutoMlFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AutoMlFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AutoMlFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        createDataset(com.google.cloud.automl.v1.CreateDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateDatasetMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.automl.v1.Dataset>
        getDataset(com.google.cloud.automl.v1.GetDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDatasetMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.automl.v1.ListDatasetsResponse>
        listDatasets(com.google.cloud.automl.v1.ListDatasetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListDatasetsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.automl.v1.Dataset>
        updateDataset(com.google.cloud.automl.v1.UpdateDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateDatasetMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deleteDataset(com.google.cloud.automl.v1.DeleteDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteDatasetMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        importData(com.google.cloud.automl.v1.ImportDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getImportDataMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        exportData(com.google.cloud.automl.v1.ExportDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExportDataMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.automl.v1.AnnotationSpec>
        getAnnotationSpec(com.google.cloud.automl.v1.GetAnnotationSpecRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAnnotationSpecMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        createModel(com.google.cloud.automl.v1.CreateModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateModelMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.automl.v1.Model>
        getModel(com.google.cloud.automl.v1.GetModelRequest request) {
      return futureUnaryCall(getChannel().newCall(getGetModelMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.automl.v1.ListModelsResponse>
        listModels(com.google.cloud.automl.v1.ListModelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListModelsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deleteModel(com.google.cloud.automl.v1.DeleteModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteModelMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.automl.v1.Model>
        updateModel(com.google.cloud.automl.v1.UpdateModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateModelMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deployModel(com.google.cloud.automl.v1.DeployModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeployModelMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        undeployModel(com.google.cloud.automl.v1.UndeployModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUndeployModelMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        exportModel(com.google.cloud.automl.v1.ExportModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExportModelMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.automl.v1.ModelEvaluation>
        getModelEvaluation(com.google.cloud.automl.v1.GetModelEvaluationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetModelEvaluationMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.automl.v1.ListModelEvaluationsResponse>
        listModelEvaluations(com.google.cloud.automl.v1.ListModelEvaluationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListModelEvaluationsMethod(), getCallOptions()), request);
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
                      .addMethod(getCreateDatasetMethod())
                      .addMethod(getGetDatasetMethod())
                      .addMethod(getListDatasetsMethod())
                      .addMethod(getUpdateDatasetMethod())
                      .addMethod(getDeleteDatasetMethod())
                      .addMethod(getImportDataMethod())
                      .addMethod(getExportDataMethod())
                      .addMethod(getGetAnnotationSpecMethod())
                      .addMethod(getCreateModelMethod())
                      .addMethod(getGetModelMethod())
                      .addMethod(getListModelsMethod())
                      .addMethod(getDeleteModelMethod())
                      .addMethod(getUpdateModelMethod())
                      .addMethod(getDeployModelMethod())
                      .addMethod(getUndeployModelMethod())
                      .addMethod(getExportModelMethod())
                      .addMethod(getGetModelEvaluationMethod())
                      .addMethod(getListModelEvaluationsMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
