package com.scalekit.grpc.scalekit.v1.agentkit_logs;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/agentkit_logs/agentkit_analytics.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AgentkitAnalyticsServiceGrpc {

  private AgentkitAnalyticsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.agentkit_logs.AgentkitAnalyticsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.agentkit_logs.GetOverviewStatsRequest,
      com.scalekit.grpc.scalekit.v1.agentkit_logs.OverviewStats> getGetOverviewStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOverviewStats",
      requestType = com.scalekit.grpc.scalekit.v1.agentkit_logs.GetOverviewStatsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.agentkit_logs.OverviewStats.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.agentkit_logs.GetOverviewStatsRequest,
      com.scalekit.grpc.scalekit.v1.agentkit_logs.OverviewStats> getGetOverviewStatsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.agentkit_logs.GetOverviewStatsRequest, com.scalekit.grpc.scalekit.v1.agentkit_logs.OverviewStats> getGetOverviewStatsMethod;
    if ((getGetOverviewStatsMethod = AgentkitAnalyticsServiceGrpc.getGetOverviewStatsMethod) == null) {
      synchronized (AgentkitAnalyticsServiceGrpc.class) {
        if ((getGetOverviewStatsMethod = AgentkitAnalyticsServiceGrpc.getGetOverviewStatsMethod) == null) {
          AgentkitAnalyticsServiceGrpc.getGetOverviewStatsMethod = getGetOverviewStatsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.agentkit_logs.GetOverviewStatsRequest, com.scalekit.grpc.scalekit.v1.agentkit_logs.OverviewStats>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOverviewStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.agentkit_logs.GetOverviewStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.agentkit_logs.OverviewStats.getDefaultInstance()))
              .setSchemaDescriptor(new AgentkitAnalyticsServiceMethodDescriptorSupplier("GetOverviewStats"))
              .build();
        }
      }
    }
    return getGetOverviewStatsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AgentkitAnalyticsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentkitAnalyticsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentkitAnalyticsServiceStub>() {
        @java.lang.Override
        public AgentkitAnalyticsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentkitAnalyticsServiceStub(channel, callOptions);
        }
      };
    return AgentkitAnalyticsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentkitAnalyticsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentkitAnalyticsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentkitAnalyticsServiceBlockingStub>() {
        @java.lang.Override
        public AgentkitAnalyticsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentkitAnalyticsServiceBlockingStub(channel, callOptions);
        }
      };
    return AgentkitAnalyticsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgentkitAnalyticsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentkitAnalyticsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentkitAnalyticsServiceFutureStub>() {
        @java.lang.Override
        public AgentkitAnalyticsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentkitAnalyticsServiceFutureStub(channel, callOptions);
        }
      };
    return AgentkitAnalyticsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getOverviewStats(com.scalekit.grpc.scalekit.v1.agentkit_logs.GetOverviewStatsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.agentkit_logs.OverviewStats> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOverviewStatsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AgentkitAnalyticsService.
   */
  public static abstract class AgentkitAnalyticsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AgentkitAnalyticsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AgentkitAnalyticsService.
   */
  public static final class AgentkitAnalyticsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AgentkitAnalyticsServiceStub> {
    private AgentkitAnalyticsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentkitAnalyticsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentkitAnalyticsServiceStub(channel, callOptions);
    }

    /**
     */
    public void getOverviewStats(com.scalekit.grpc.scalekit.v1.agentkit_logs.GetOverviewStatsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.agentkit_logs.OverviewStats> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOverviewStatsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AgentkitAnalyticsService.
   */
  public static final class AgentkitAnalyticsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AgentkitAnalyticsServiceBlockingStub> {
    private AgentkitAnalyticsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentkitAnalyticsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentkitAnalyticsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.agentkit_logs.OverviewStats getOverviewStats(com.scalekit.grpc.scalekit.v1.agentkit_logs.GetOverviewStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOverviewStatsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AgentkitAnalyticsService.
   */
  public static final class AgentkitAnalyticsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AgentkitAnalyticsServiceFutureStub> {
    private AgentkitAnalyticsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentkitAnalyticsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentkitAnalyticsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.agentkit_logs.OverviewStats> getOverviewStats(
        com.scalekit.grpc.scalekit.v1.agentkit_logs.GetOverviewStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOverviewStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_OVERVIEW_STATS = 0;

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
        case METHODID_GET_OVERVIEW_STATS:
          serviceImpl.getOverviewStats((com.scalekit.grpc.scalekit.v1.agentkit_logs.GetOverviewStatsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.agentkit_logs.OverviewStats>) responseObserver);
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
          getGetOverviewStatsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.agentkit_logs.GetOverviewStatsRequest,
              com.scalekit.grpc.scalekit.v1.agentkit_logs.OverviewStats>(
                service, METHODID_GET_OVERVIEW_STATS)))
        .build();
  }

  private static abstract class AgentkitAnalyticsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AgentkitAnalyticsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.agentkit_logs.AgentkitAnalyticsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AgentkitAnalyticsService");
    }
  }

  private static final class AgentkitAnalyticsServiceFileDescriptorSupplier
      extends AgentkitAnalyticsServiceBaseDescriptorSupplier {
    AgentkitAnalyticsServiceFileDescriptorSupplier() {}
  }

  private static final class AgentkitAnalyticsServiceMethodDescriptorSupplier
      extends AgentkitAnalyticsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AgentkitAnalyticsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AgentkitAnalyticsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AgentkitAnalyticsServiceFileDescriptorSupplier())
              .addMethod(getGetOverviewStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
