package com.scalekit.grpc.scalekit.v1.interceptors;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/interceptors/interceptors.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InterceptorServiceGrpc {

  private InterceptorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.interceptors.InterceptorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorRequest,
      com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorResponse> getCreateInterceptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateInterceptor",
      requestType = com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorRequest,
      com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorResponse> getCreateInterceptorMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorRequest, com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorResponse> getCreateInterceptorMethod;
    if ((getCreateInterceptorMethod = InterceptorServiceGrpc.getCreateInterceptorMethod) == null) {
      synchronized (InterceptorServiceGrpc.class) {
        if ((getCreateInterceptorMethod = InterceptorServiceGrpc.getCreateInterceptorMethod) == null) {
          InterceptorServiceGrpc.getCreateInterceptorMethod = getCreateInterceptorMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorRequest, com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateInterceptor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InterceptorServiceMethodDescriptorSupplier("CreateInterceptor"))
              .build();
        }
      }
    }
    return getCreateInterceptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorRequest,
      com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorResponse> getGetInterceptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInterceptor",
      requestType = com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorRequest,
      com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorResponse> getGetInterceptorMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorRequest, com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorResponse> getGetInterceptorMethod;
    if ((getGetInterceptorMethod = InterceptorServiceGrpc.getGetInterceptorMethod) == null) {
      synchronized (InterceptorServiceGrpc.class) {
        if ((getGetInterceptorMethod = InterceptorServiceGrpc.getGetInterceptorMethod) == null) {
          InterceptorServiceGrpc.getGetInterceptorMethod = getGetInterceptorMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorRequest, com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInterceptor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InterceptorServiceMethodDescriptorSupplier("GetInterceptor"))
              .build();
        }
      }
    }
    return getGetInterceptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsRequest,
      com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsResponse> getListInterceptorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInterceptors",
      requestType = com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsRequest,
      com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsResponse> getListInterceptorsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsRequest, com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsResponse> getListInterceptorsMethod;
    if ((getListInterceptorsMethod = InterceptorServiceGrpc.getListInterceptorsMethod) == null) {
      synchronized (InterceptorServiceGrpc.class) {
        if ((getListInterceptorsMethod = InterceptorServiceGrpc.getListInterceptorsMethod) == null) {
          InterceptorServiceGrpc.getListInterceptorsMethod = getListInterceptorsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsRequest, com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInterceptors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InterceptorServiceMethodDescriptorSupplier("ListInterceptors"))
              .build();
        }
      }
    }
    return getListInterceptorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorRequest,
      com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorResponse> getUpdateInterceptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInterceptor",
      requestType = com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorRequest,
      com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorResponse> getUpdateInterceptorMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorRequest, com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorResponse> getUpdateInterceptorMethod;
    if ((getUpdateInterceptorMethod = InterceptorServiceGrpc.getUpdateInterceptorMethod) == null) {
      synchronized (InterceptorServiceGrpc.class) {
        if ((getUpdateInterceptorMethod = InterceptorServiceGrpc.getUpdateInterceptorMethod) == null) {
          InterceptorServiceGrpc.getUpdateInterceptorMethod = getUpdateInterceptorMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorRequest, com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInterceptor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InterceptorServiceMethodDescriptorSupplier("UpdateInterceptor"))
              .build();
        }
      }
    }
    return getUpdateInterceptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.DeleteInterceptorRequest,
      com.google.protobuf.Empty> getDeleteInterceptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInterceptor",
      requestType = com.scalekit.grpc.scalekit.v1.interceptors.DeleteInterceptorRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.DeleteInterceptorRequest,
      com.google.protobuf.Empty> getDeleteInterceptorMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.DeleteInterceptorRequest, com.google.protobuf.Empty> getDeleteInterceptorMethod;
    if ((getDeleteInterceptorMethod = InterceptorServiceGrpc.getDeleteInterceptorMethod) == null) {
      synchronized (InterceptorServiceGrpc.class) {
        if ((getDeleteInterceptorMethod = InterceptorServiceGrpc.getDeleteInterceptorMethod) == null) {
          InterceptorServiceGrpc.getDeleteInterceptorMethod = getDeleteInterceptorMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.interceptors.DeleteInterceptorRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInterceptor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.interceptors.DeleteInterceptorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new InterceptorServiceMethodDescriptorSupplier("DeleteInterceptor"))
              .build();
        }
      }
    }
    return getDeleteInterceptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.EnableInterceptorRequest,
      com.google.protobuf.Empty> getEnableInterceptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableInterceptor",
      requestType = com.scalekit.grpc.scalekit.v1.interceptors.EnableInterceptorRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.EnableInterceptorRequest,
      com.google.protobuf.Empty> getEnableInterceptorMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.EnableInterceptorRequest, com.google.protobuf.Empty> getEnableInterceptorMethod;
    if ((getEnableInterceptorMethod = InterceptorServiceGrpc.getEnableInterceptorMethod) == null) {
      synchronized (InterceptorServiceGrpc.class) {
        if ((getEnableInterceptorMethod = InterceptorServiceGrpc.getEnableInterceptorMethod) == null) {
          InterceptorServiceGrpc.getEnableInterceptorMethod = getEnableInterceptorMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.interceptors.EnableInterceptorRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableInterceptor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.interceptors.EnableInterceptorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new InterceptorServiceMethodDescriptorSupplier("EnableInterceptor"))
              .build();
        }
      }
    }
    return getEnableInterceptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.DisableInterceptorRequest,
      com.google.protobuf.Empty> getDisableInterceptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableInterceptor",
      requestType = com.scalekit.grpc.scalekit.v1.interceptors.DisableInterceptorRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.DisableInterceptorRequest,
      com.google.protobuf.Empty> getDisableInterceptorMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.DisableInterceptorRequest, com.google.protobuf.Empty> getDisableInterceptorMethod;
    if ((getDisableInterceptorMethod = InterceptorServiceGrpc.getDisableInterceptorMethod) == null) {
      synchronized (InterceptorServiceGrpc.class) {
        if ((getDisableInterceptorMethod = InterceptorServiceGrpc.getDisableInterceptorMethod) == null) {
          InterceptorServiceGrpc.getDisableInterceptorMethod = getDisableInterceptorMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.interceptors.DisableInterceptorRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableInterceptor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.interceptors.DisableInterceptorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new InterceptorServiceMethodDescriptorSupplier("DisableInterceptor"))
              .build();
        }
      }
    }
    return getDisableInterceptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorRequest,
      com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorResponse> getTestInterceptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestInterceptor",
      requestType = com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorRequest,
      com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorResponse> getTestInterceptorMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorRequest, com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorResponse> getTestInterceptorMethod;
    if ((getTestInterceptorMethod = InterceptorServiceGrpc.getTestInterceptorMethod) == null) {
      synchronized (InterceptorServiceGrpc.class) {
        if ((getTestInterceptorMethod = InterceptorServiceGrpc.getTestInterceptorMethod) == null) {
          InterceptorServiceGrpc.getTestInterceptorMethod = getTestInterceptorMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorRequest, com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestInterceptor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InterceptorServiceMethodDescriptorSupplier("TestInterceptor"))
              .build();
        }
      }
    }
    return getTestInterceptorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InterceptorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InterceptorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InterceptorServiceStub>() {
        @java.lang.Override
        public InterceptorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InterceptorServiceStub(channel, callOptions);
        }
      };
    return InterceptorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InterceptorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InterceptorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InterceptorServiceBlockingStub>() {
        @java.lang.Override
        public InterceptorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InterceptorServiceBlockingStub(channel, callOptions);
        }
      };
    return InterceptorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InterceptorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InterceptorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InterceptorServiceFutureStub>() {
        @java.lang.Override
        public InterceptorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InterceptorServiceFutureStub(channel, callOptions);
        }
      };
    return InterceptorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateInterceptorMethod(), responseObserver);
    }

    /**
     */
    default void getInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInterceptorMethod(), responseObserver);
    }

    /**
     */
    default void listInterceptors(com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInterceptorsMethod(), responseObserver);
    }

    /**
     */
    default void updateInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateInterceptorMethod(), responseObserver);
    }

    /**
     */
    default void deleteInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.DeleteInterceptorRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteInterceptorMethod(), responseObserver);
    }

    /**
     */
    default void enableInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.EnableInterceptorRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableInterceptorMethod(), responseObserver);
    }

    /**
     */
    default void disableInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.DisableInterceptorRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableInterceptorMethod(), responseObserver);
    }

    /**
     */
    default void testInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestInterceptorMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InterceptorService.
   */
  public static abstract class InterceptorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InterceptorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InterceptorService.
   */
  public static final class InterceptorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InterceptorServiceStub> {
    private InterceptorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InterceptorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InterceptorServiceStub(channel, callOptions);
    }

    /**
     */
    public void createInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateInterceptorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInterceptorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listInterceptors(com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInterceptorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateInterceptorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.DeleteInterceptorRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteInterceptorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.EnableInterceptorRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableInterceptorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.DisableInterceptorRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableInterceptorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestInterceptorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InterceptorService.
   */
  public static final class InterceptorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InterceptorServiceBlockingStub> {
    private InterceptorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InterceptorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InterceptorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorResponse createInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateInterceptorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorResponse getInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInterceptorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsResponse listInterceptors(com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInterceptorsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorResponse updateInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateInterceptorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.DeleteInterceptorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteInterceptorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty enableInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.EnableInterceptorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableInterceptorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty disableInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.DisableInterceptorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableInterceptorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorResponse testInterceptor(com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestInterceptorMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InterceptorService.
   */
  public static final class InterceptorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InterceptorServiceFutureStub> {
    private InterceptorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InterceptorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InterceptorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorResponse> createInterceptor(
        com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateInterceptorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorResponse> getInterceptor(
        com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInterceptorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsResponse> listInterceptors(
        com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInterceptorsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorResponse> updateInterceptor(
        com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateInterceptorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteInterceptor(
        com.scalekit.grpc.scalekit.v1.interceptors.DeleteInterceptorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteInterceptorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> enableInterceptor(
        com.scalekit.grpc.scalekit.v1.interceptors.EnableInterceptorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableInterceptorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> disableInterceptor(
        com.scalekit.grpc.scalekit.v1.interceptors.DisableInterceptorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableInterceptorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorResponse> testInterceptor(
        com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestInterceptorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_INTERCEPTOR = 0;
  private static final int METHODID_GET_INTERCEPTOR = 1;
  private static final int METHODID_LIST_INTERCEPTORS = 2;
  private static final int METHODID_UPDATE_INTERCEPTOR = 3;
  private static final int METHODID_DELETE_INTERCEPTOR = 4;
  private static final int METHODID_ENABLE_INTERCEPTOR = 5;
  private static final int METHODID_DISABLE_INTERCEPTOR = 6;
  private static final int METHODID_TEST_INTERCEPTOR = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_INTERCEPTOR:
          serviceImpl.createInterceptor((com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorResponse>) responseObserver);
          break;
        case METHODID_GET_INTERCEPTOR:
          serviceImpl.getInterceptor((com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorResponse>) responseObserver);
          break;
        case METHODID_LIST_INTERCEPTORS:
          serviceImpl.listInterceptors((com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_INTERCEPTOR:
          serviceImpl.updateInterceptor((com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorResponse>) responseObserver);
          break;
        case METHODID_DELETE_INTERCEPTOR:
          serviceImpl.deleteInterceptor((com.scalekit.grpc.scalekit.v1.interceptors.DeleteInterceptorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ENABLE_INTERCEPTOR:
          serviceImpl.enableInterceptor((com.scalekit.grpc.scalekit.v1.interceptors.EnableInterceptorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DISABLE_INTERCEPTOR:
          serviceImpl.disableInterceptor((com.scalekit.grpc.scalekit.v1.interceptors.DisableInterceptorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_TEST_INTERCEPTOR:
          serviceImpl.testInterceptor((com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateInterceptorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorRequest,
              com.scalekit.grpc.scalekit.v1.interceptors.CreateInterceptorResponse>(
                service, METHODID_CREATE_INTERCEPTOR)))
        .addMethod(
          getGetInterceptorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorRequest,
              com.scalekit.grpc.scalekit.v1.interceptors.GetInterceptorResponse>(
                service, METHODID_GET_INTERCEPTOR)))
        .addMethod(
          getListInterceptorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsRequest,
              com.scalekit.grpc.scalekit.v1.interceptors.ListInterceptorsResponse>(
                service, METHODID_LIST_INTERCEPTORS)))
        .addMethod(
          getUpdateInterceptorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorRequest,
              com.scalekit.grpc.scalekit.v1.interceptors.UpdateInterceptorResponse>(
                service, METHODID_UPDATE_INTERCEPTOR)))
        .addMethod(
          getDeleteInterceptorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.interceptors.DeleteInterceptorRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_INTERCEPTOR)))
        .addMethod(
          getEnableInterceptorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.interceptors.EnableInterceptorRequest,
              com.google.protobuf.Empty>(
                service, METHODID_ENABLE_INTERCEPTOR)))
        .addMethod(
          getDisableInterceptorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.interceptors.DisableInterceptorRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DISABLE_INTERCEPTOR)))
        .addMethod(
          getTestInterceptorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorRequest,
              com.scalekit.grpc.scalekit.v1.interceptors.TestInterceptorResponse>(
                service, METHODID_TEST_INTERCEPTOR)))
        .build();
  }

  private static abstract class InterceptorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InterceptorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.interceptors.InterceptorsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InterceptorService");
    }
  }

  private static final class InterceptorServiceFileDescriptorSupplier
      extends InterceptorServiceBaseDescriptorSupplier {
    InterceptorServiceFileDescriptorSupplier() {}
  }

  private static final class InterceptorServiceMethodDescriptorSupplier
      extends InterceptorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    InterceptorServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (InterceptorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InterceptorServiceFileDescriptorSupplier())
              .addMethod(getCreateInterceptorMethod())
              .addMethod(getGetInterceptorMethod())
              .addMethod(getListInterceptorsMethod())
              .addMethod(getUpdateInterceptorMethod())
              .addMethod(getDeleteInterceptorMethod())
              .addMethod(getEnableInterceptorMethod())
              .addMethod(getDisableInterceptorMethod())
              .addMethod(getTestInterceptorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
