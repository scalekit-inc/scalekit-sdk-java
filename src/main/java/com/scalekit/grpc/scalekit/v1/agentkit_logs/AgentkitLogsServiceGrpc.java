package com.scalekit.grpc.scalekit.v1.agentkit_logs;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/agentkit_logs/agentkit_logs.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AgentkitLogsServiceGrpc {

  private AgentkitLogsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.agentkit_logs.AgentkitLogsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsRequest,
      com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsResponse> getListToolCallLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListToolCallLogs",
      requestType = com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsRequest,
      com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsResponse> getListToolCallLogsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsRequest, com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsResponse> getListToolCallLogsMethod;
    if ((getListToolCallLogsMethod = AgentkitLogsServiceGrpc.getListToolCallLogsMethod) == null) {
      synchronized (AgentkitLogsServiceGrpc.class) {
        if ((getListToolCallLogsMethod = AgentkitLogsServiceGrpc.getListToolCallLogsMethod) == null) {
          AgentkitLogsServiceGrpc.getListToolCallLogsMethod = getListToolCallLogsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsRequest, com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListToolCallLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentkitLogsServiceMethodDescriptorSupplier("ListToolCallLogs"))
              .build();
        }
      }
    }
    return getListToolCallLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.agentkit_logs.GetToolCallLogRequest,
      com.scalekit.grpc.scalekit.v1.agentkit_logs.ToolCallLog> getGetToolCallLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetToolCallLog",
      requestType = com.scalekit.grpc.scalekit.v1.agentkit_logs.GetToolCallLogRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.agentkit_logs.ToolCallLog.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.agentkit_logs.GetToolCallLogRequest,
      com.scalekit.grpc.scalekit.v1.agentkit_logs.ToolCallLog> getGetToolCallLogMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.agentkit_logs.GetToolCallLogRequest, com.scalekit.grpc.scalekit.v1.agentkit_logs.ToolCallLog> getGetToolCallLogMethod;
    if ((getGetToolCallLogMethod = AgentkitLogsServiceGrpc.getGetToolCallLogMethod) == null) {
      synchronized (AgentkitLogsServiceGrpc.class) {
        if ((getGetToolCallLogMethod = AgentkitLogsServiceGrpc.getGetToolCallLogMethod) == null) {
          AgentkitLogsServiceGrpc.getGetToolCallLogMethod = getGetToolCallLogMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.agentkit_logs.GetToolCallLogRequest, com.scalekit.grpc.scalekit.v1.agentkit_logs.ToolCallLog>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetToolCallLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.agentkit_logs.GetToolCallLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.agentkit_logs.ToolCallLog.getDefaultInstance()))
              .setSchemaDescriptor(new AgentkitLogsServiceMethodDescriptorSupplier("GetToolCallLog"))
              .build();
        }
      }
    }
    return getGetToolCallLogMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AgentkitLogsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentkitLogsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentkitLogsServiceStub>() {
        @java.lang.Override
        public AgentkitLogsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentkitLogsServiceStub(channel, callOptions);
        }
      };
    return AgentkitLogsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentkitLogsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentkitLogsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentkitLogsServiceBlockingStub>() {
        @java.lang.Override
        public AgentkitLogsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentkitLogsServiceBlockingStub(channel, callOptions);
        }
      };
    return AgentkitLogsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgentkitLogsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentkitLogsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentkitLogsServiceFutureStub>() {
        @java.lang.Override
        public AgentkitLogsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentkitLogsServiceFutureStub(channel, callOptions);
        }
      };
    return AgentkitLogsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void listToolCallLogs(com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListToolCallLogsMethod(), responseObserver);
    }

    /**
     */
    default void getToolCallLog(com.scalekit.grpc.scalekit.v1.agentkit_logs.GetToolCallLogRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.agentkit_logs.ToolCallLog> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetToolCallLogMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AgentkitLogsService.
   */
  public static abstract class AgentkitLogsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AgentkitLogsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AgentkitLogsService.
   */
  public static final class AgentkitLogsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AgentkitLogsServiceStub> {
    private AgentkitLogsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentkitLogsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentkitLogsServiceStub(channel, callOptions);
    }

    /**
     */
    public void listToolCallLogs(com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListToolCallLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getToolCallLog(com.scalekit.grpc.scalekit.v1.agentkit_logs.GetToolCallLogRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.agentkit_logs.ToolCallLog> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetToolCallLogMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AgentkitLogsService.
   */
  public static final class AgentkitLogsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AgentkitLogsServiceBlockingStub> {
    private AgentkitLogsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentkitLogsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentkitLogsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsResponse listToolCallLogs(com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListToolCallLogsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.agentkit_logs.ToolCallLog getToolCallLog(com.scalekit.grpc.scalekit.v1.agentkit_logs.GetToolCallLogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetToolCallLogMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AgentkitLogsService.
   */
  public static final class AgentkitLogsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AgentkitLogsServiceFutureStub> {
    private AgentkitLogsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentkitLogsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentkitLogsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsResponse> listToolCallLogs(
        com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListToolCallLogsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.agentkit_logs.ToolCallLog> getToolCallLog(
        com.scalekit.grpc.scalekit.v1.agentkit_logs.GetToolCallLogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetToolCallLogMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_TOOL_CALL_LOGS = 0;
  private static final int METHODID_GET_TOOL_CALL_LOG = 1;

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
        case METHODID_LIST_TOOL_CALL_LOGS:
          serviceImpl.listToolCallLogs((com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsResponse>) responseObserver);
          break;
        case METHODID_GET_TOOL_CALL_LOG:
          serviceImpl.getToolCallLog((com.scalekit.grpc.scalekit.v1.agentkit_logs.GetToolCallLogRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.agentkit_logs.ToolCallLog>) responseObserver);
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
          getListToolCallLogsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsRequest,
              com.scalekit.grpc.scalekit.v1.agentkit_logs.ListToolCallLogsResponse>(
                service, METHODID_LIST_TOOL_CALL_LOGS)))
        .addMethod(
          getGetToolCallLogMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.agentkit_logs.GetToolCallLogRequest,
              com.scalekit.grpc.scalekit.v1.agentkit_logs.ToolCallLog>(
                service, METHODID_GET_TOOL_CALL_LOG)))
        .build();
  }

  private static abstract class AgentkitLogsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AgentkitLogsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.agentkit_logs.AgentkitLogsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AgentkitLogsService");
    }
  }

  private static final class AgentkitLogsServiceFileDescriptorSupplier
      extends AgentkitLogsServiceBaseDescriptorSupplier {
    AgentkitLogsServiceFileDescriptorSupplier() {}
  }

  private static final class AgentkitLogsServiceMethodDescriptorSupplier
      extends AgentkitLogsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AgentkitLogsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AgentkitLogsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AgentkitLogsServiceFileDescriptorSupplier())
              .addMethod(getListToolCallLogsMethod())
              .addMethod(getGetToolCallLogMethod())
              .build();
        }
      }
    }
    return result;
  }
}
