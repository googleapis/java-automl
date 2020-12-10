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
package com.google.cloud.automl.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/automl/v1beta1/prediction_service.proto")
public final class PredictionServiceGrpc {

  private PredictionServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.automl.v1beta1.PredictionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1beta1.PredictRequest,
          com.google.cloud.automl.v1beta1.PredictResponse>
      getPredictMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Predict",
      requestType = com.google.cloud.automl.v1beta1.PredictRequest.class,
      responseType = com.google.cloud.automl.v1beta1.PredictResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1beta1.PredictRequest,
          com.google.cloud.automl.v1beta1.PredictResponse>
      getPredictMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1beta1.PredictRequest,
            com.google.cloud.automl.v1beta1.PredictResponse>
        getPredictMethod;
    if ((getPredictMethod = PredictionServiceGrpc.getPredictMethod) == null) {
      synchronized (PredictionServiceGrpc.class) {
        if ((getPredictMethod = PredictionServiceGrpc.getPredictMethod) == null) {
          PredictionServiceGrpc.getPredictMethod =
              getPredictMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1beta1.PredictRequest,
                          com.google.cloud.automl.v1beta1.PredictResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Predict"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1beta1.PredictRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1beta1.PredictResponse.getDefaultInstance()))
                      .setSchemaDescriptor(new PredictionServiceMethodDescriptorSupplier("Predict"))
                      .build();
        }
      }
    }
    return getPredictMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1beta1.BatchPredictRequest, com.google.longrunning.Operation>
      getBatchPredictMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchPredict",
      requestType = com.google.cloud.automl.v1beta1.BatchPredictRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.automl.v1beta1.BatchPredictRequest, com.google.longrunning.Operation>
      getBatchPredictMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.automl.v1beta1.BatchPredictRequest, com.google.longrunning.Operation>
        getBatchPredictMethod;
    if ((getBatchPredictMethod = PredictionServiceGrpc.getBatchPredictMethod) == null) {
      synchronized (PredictionServiceGrpc.class) {
        if ((getBatchPredictMethod = PredictionServiceGrpc.getBatchPredictMethod) == null) {
          PredictionServiceGrpc.getBatchPredictMethod =
              getBatchPredictMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.automl.v1beta1.BatchPredictRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchPredict"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.automl.v1beta1.BatchPredictRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new PredictionServiceMethodDescriptorSupplier("BatchPredict"))
                      .build();
        }
      }
    }
    return getBatchPredictMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static PredictionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictionServiceStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<PredictionServiceStub>() {
          @java.lang.Override
          public PredictionServiceStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new PredictionServiceStub(channel, callOptions);
          }
        };
    return PredictionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PredictionServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictionServiceBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<PredictionServiceBlockingStub>() {
          @java.lang.Override
          public PredictionServiceBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new PredictionServiceBlockingStub(channel, callOptions);
          }
        };
    return PredictionServiceBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static PredictionServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictionServiceFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<PredictionServiceFutureStub>() {
          @java.lang.Override
          public PredictionServiceFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new PredictionServiceFutureStub(channel, callOptions);
          }
        };
    return PredictionServiceFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class PredictionServiceImplBase implements io.grpc.BindableService {

    /** */
    public void predict(
        com.google.cloud.automl.v1beta1.PredictRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1beta1.PredictResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getPredictMethod(), responseObserver);
    }

    /** */
    public void batchPredict(
        com.google.cloud.automl.v1beta1.BatchPredictRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getBatchPredictMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getPredictMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1beta1.PredictRequest,
                      com.google.cloud.automl.v1beta1.PredictResponse>(this, METHODID_PREDICT)))
          .addMethod(
              getBatchPredictMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.automl.v1beta1.BatchPredictRequest,
                      com.google.longrunning.Operation>(this, METHODID_BATCH_PREDICT)))
          .build();
    }
  }

  /** */
  public static final class PredictionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PredictionServiceStub> {
    private PredictionServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictionServiceStub(channel, callOptions);
    }

    /** */
    public void predict(
        com.google.cloud.automl.v1beta1.PredictRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.automl.v1beta1.PredictResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPredictMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void batchPredict(
        com.google.cloud.automl.v1beta1.BatchPredictRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBatchPredictMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class PredictionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PredictionServiceBlockingStub> {
    private PredictionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictionServiceBlockingStub(channel, callOptions);
    }

    /** */
    public com.google.cloud.automl.v1beta1.PredictResponse predict(
        com.google.cloud.automl.v1beta1.PredictRequest request) {
      return blockingUnaryCall(getChannel(), getPredictMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation batchPredict(
        com.google.cloud.automl.v1beta1.BatchPredictRequest request) {
      return blockingUnaryCall(getChannel(), getBatchPredictMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class PredictionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PredictionServiceFutureStub> {
    private PredictionServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictionServiceFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.automl.v1beta1.PredictResponse>
        predict(com.google.cloud.automl.v1beta1.PredictRequest request) {
      return futureUnaryCall(getChannel().newCall(getPredictMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        batchPredict(com.google.cloud.automl.v1beta1.BatchPredictRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBatchPredictMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PREDICT = 0;
  private static final int METHODID_BATCH_PREDICT = 1;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PredictionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PredictionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PREDICT:
          serviceImpl.predict(
              (com.google.cloud.automl.v1beta1.PredictRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.automl.v1beta1.PredictResponse>)
                  responseObserver);
          break;
        case METHODID_BATCH_PREDICT:
          serviceImpl.batchPredict(
              (com.google.cloud.automl.v1beta1.BatchPredictRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
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

  private abstract static class PredictionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PredictionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.automl.v1beta1.PredictionServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PredictionService");
    }
  }

  private static final class PredictionServiceFileDescriptorSupplier
      extends PredictionServiceBaseDescriptorSupplier {
    PredictionServiceFileDescriptorSupplier() {}
  }

  private static final class PredictionServiceMethodDescriptorSupplier
      extends PredictionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PredictionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PredictionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new PredictionServiceFileDescriptorSupplier())
                      .addMethod(getPredictMethod())
                      .addMethod(getBatchPredictMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
