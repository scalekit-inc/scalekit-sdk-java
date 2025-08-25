package com.scalekit.grpc.scalekit.v1.mcp;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/mcp/mcp.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class McpServiceGrpc {

  private McpServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.mcp.McpService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest,
      com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse> getCreateMcpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMcp",
      requestType = com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest,
      com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse> getCreateMcpMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest, com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse> getCreateMcpMethod;
    if ((getCreateMcpMethod = McpServiceGrpc.getCreateMcpMethod) == null) {
      synchronized (McpServiceGrpc.class) {
        if ((getCreateMcpMethod = McpServiceGrpc.getCreateMcpMethod) == null) {
          McpServiceGrpc.getCreateMcpMethod = getCreateMcpMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest, com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMcp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpServiceMethodDescriptorSupplier("CreateMcp"))
              .build();
        }
      }
    }
    return getCreateMcpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest,
      com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse> getGetMcpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMcp",
      requestType = com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest,
      com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse> getGetMcpMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest, com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse> getGetMcpMethod;
    if ((getGetMcpMethod = McpServiceGrpc.getGetMcpMethod) == null) {
      synchronized (McpServiceGrpc.class) {
        if ((getGetMcpMethod = McpServiceGrpc.getGetMcpMethod) == null) {
          McpServiceGrpc.getGetMcpMethod = getGetMcpMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest, com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMcp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpServiceMethodDescriptorSupplier("GetMcp"))
              .build();
        }
      }
    }
    return getGetMcpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest,
      com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse> getListMcpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMcp",
      requestType = com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest,
      com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse> getListMcpMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest, com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse> getListMcpMethod;
    if ((getListMcpMethod = McpServiceGrpc.getListMcpMethod) == null) {
      synchronized (McpServiceGrpc.class) {
        if ((getListMcpMethod = McpServiceGrpc.getListMcpMethod) == null) {
          McpServiceGrpc.getListMcpMethod = getListMcpMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest, com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMcp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpServiceMethodDescriptorSupplier("ListMcp"))
              .build();
        }
      }
    }
    return getListMcpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest,
      com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse> getDeleteMcpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMcp",
      requestType = com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest,
      com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse> getDeleteMcpMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest, com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse> getDeleteMcpMethod;
    if ((getDeleteMcpMethod = McpServiceGrpc.getDeleteMcpMethod) == null) {
      synchronized (McpServiceGrpc.class) {
        if ((getDeleteMcpMethod = McpServiceGrpc.getDeleteMcpMethod) == null) {
          McpServiceGrpc.getDeleteMcpMethod = getDeleteMcpMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest, com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMcp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpServiceMethodDescriptorSupplier("DeleteMcp"))
              .build();
        }
      }
    }
    return getDeleteMcpMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static McpServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<McpServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<McpServiceStub>() {
        @java.lang.Override
        public McpServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new McpServiceStub(channel, callOptions);
        }
      };
    return McpServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static McpServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<McpServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<McpServiceBlockingStub>() {
        @java.lang.Override
        public McpServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new McpServiceBlockingStub(channel, callOptions);
        }
      };
    return McpServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static McpServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<McpServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<McpServiceFutureStub>() {
        @java.lang.Override
        public McpServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new McpServiceFutureStub(channel, callOptions);
        }
      };
    return McpServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createMcp(com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMcpMethod(), responseObserver);
    }

    /**
     */
    default void getMcp(com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMcpMethod(), responseObserver);
    }

    /**
     */
    default void listMcp(com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMcpMethod(), responseObserver);
    }

    /**
     */
    default void deleteMcp(com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMcpMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service McpService.
   */
  public static abstract class McpServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return McpServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service McpService.
   */
  public static final class McpServiceStub
      extends io.grpc.stub.AbstractAsyncStub<McpServiceStub> {
    private McpServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected McpServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new McpServiceStub(channel, callOptions);
    }

    /**
     */
    public void createMcp(com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMcpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMcp(com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMcpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listMcp(com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMcpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMcp(com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMcpMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service McpService.
   */
  public static final class McpServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<McpServiceBlockingStub> {
    private McpServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected McpServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new McpServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse createMcp(com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMcpMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse getMcp(com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMcpMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse listMcp(com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMcpMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse deleteMcp(com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMcpMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service McpService.
   */
  public static final class McpServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<McpServiceFutureStub> {
    private McpServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected McpServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new McpServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse> createMcp(
        com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMcpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse> getMcp(
        com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMcpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse> listMcp(
        com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMcpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse> deleteMcp(
        com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMcpMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_MCP = 0;
  private static final int METHODID_GET_MCP = 1;
  private static final int METHODID_LIST_MCP = 2;
  private static final int METHODID_DELETE_MCP = 3;

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
        case METHODID_CREATE_MCP:
          serviceImpl.createMcp((com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse>) responseObserver);
          break;
        case METHODID_GET_MCP:
          serviceImpl.getMcp((com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse>) responseObserver);
          break;
        case METHODID_LIST_MCP:
          serviceImpl.listMcp((com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse>) responseObserver);
          break;
        case METHODID_DELETE_MCP:
          serviceImpl.deleteMcp((com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse>) responseObserver);
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
          getCreateMcpMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest,
              com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse>(
                service, METHODID_CREATE_MCP)))
        .addMethod(
          getGetMcpMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest,
              com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse>(
                service, METHODID_GET_MCP)))
        .addMethod(
          getListMcpMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest,
              com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse>(
                service, METHODID_LIST_MCP)))
        .addMethod(
          getDeleteMcpMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest,
              com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse>(
                service, METHODID_DELETE_MCP)))
        .build();
  }

  private static abstract class McpServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    McpServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.mcp.McpProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("McpService");
    }
  }

  private static final class McpServiceFileDescriptorSupplier
      extends McpServiceBaseDescriptorSupplier {
    McpServiceFileDescriptorSupplier() {}
  }

  private static final class McpServiceMethodDescriptorSupplier
      extends McpServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    McpServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (McpServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new McpServiceFileDescriptorSupplier())
              .addMethod(getCreateMcpMethod())
              .addMethod(getGetMcpMethod())
              .addMethod(getListMcpMethod())
              .addMethod(getDeleteMcpMethod())
              .build();
        }
      }
    }
    return result;
  }
}
