package com.scalekit.grpc.scalekit.v1.tools;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/tools/tools.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ToolServiceGrpc {

  private ToolServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.tools.ToolService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.CreateToolRequest,
      com.scalekit.grpc.scalekit.v1.tools.CreateToolResponse> getCreateToolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTool",
      requestType = com.scalekit.grpc.scalekit.v1.tools.CreateToolRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.tools.CreateToolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.CreateToolRequest,
      com.scalekit.grpc.scalekit.v1.tools.CreateToolResponse> getCreateToolMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.CreateToolRequest, com.scalekit.grpc.scalekit.v1.tools.CreateToolResponse> getCreateToolMethod;
    if ((getCreateToolMethod = ToolServiceGrpc.getCreateToolMethod) == null) {
      synchronized (ToolServiceGrpc.class) {
        if ((getCreateToolMethod = ToolServiceGrpc.getCreateToolMethod) == null) {
          ToolServiceGrpc.getCreateToolMethod = getCreateToolMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.tools.CreateToolRequest, com.scalekit.grpc.scalekit.v1.tools.CreateToolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tools.CreateToolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tools.CreateToolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ToolServiceMethodDescriptorSupplier("CreateTool"))
              .build();
        }
      }
    }
    return getCreateToolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.ListToolsRequest,
      com.scalekit.grpc.scalekit.v1.tools.ListToolsResponse> getListToolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTools",
      requestType = com.scalekit.grpc.scalekit.v1.tools.ListToolsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.tools.ListToolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.ListToolsRequest,
      com.scalekit.grpc.scalekit.v1.tools.ListToolsResponse> getListToolsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.ListToolsRequest, com.scalekit.grpc.scalekit.v1.tools.ListToolsResponse> getListToolsMethod;
    if ((getListToolsMethod = ToolServiceGrpc.getListToolsMethod) == null) {
      synchronized (ToolServiceGrpc.class) {
        if ((getListToolsMethod = ToolServiceGrpc.getListToolsMethod) == null) {
          ToolServiceGrpc.getListToolsMethod = getListToolsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.tools.ListToolsRequest, com.scalekit.grpc.scalekit.v1.tools.ListToolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tools.ListToolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tools.ListToolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ToolServiceMethodDescriptorSupplier("ListTools"))
              .build();
        }
      }
    }
    return getListToolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsRequest,
      com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsResponse> getListScopedToolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListScopedTools",
      requestType = com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsRequest,
      com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsResponse> getListScopedToolsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsRequest, com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsResponse> getListScopedToolsMethod;
    if ((getListScopedToolsMethod = ToolServiceGrpc.getListScopedToolsMethod) == null) {
      synchronized (ToolServiceGrpc.class) {
        if ((getListScopedToolsMethod = ToolServiceGrpc.getListScopedToolsMethod) == null) {
          ToolServiceGrpc.getListScopedToolsMethod = getListScopedToolsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsRequest, com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListScopedTools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ToolServiceMethodDescriptorSupplier("ListScopedTools"))
              .build();
        }
      }
    }
    return getListScopedToolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultRequest,
      com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultResponse> getSetToolDefaultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetToolDefault",
      requestType = com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultRequest,
      com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultResponse> getSetToolDefaultMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultRequest, com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultResponse> getSetToolDefaultMethod;
    if ((getSetToolDefaultMethod = ToolServiceGrpc.getSetToolDefaultMethod) == null) {
      synchronized (ToolServiceGrpc.class) {
        if ((getSetToolDefaultMethod = ToolServiceGrpc.getSetToolDefaultMethod) == null) {
          ToolServiceGrpc.getSetToolDefaultMethod = getSetToolDefaultMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultRequest, com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetToolDefault"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ToolServiceMethodDescriptorSupplier("SetToolDefault"))
              .build();
        }
      }
    }
    return getSetToolDefaultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.UpdateToolRequest,
      com.scalekit.grpc.scalekit.v1.tools.UpdateToolResponse> getUpdateToolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTool",
      requestType = com.scalekit.grpc.scalekit.v1.tools.UpdateToolRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.tools.UpdateToolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.UpdateToolRequest,
      com.scalekit.grpc.scalekit.v1.tools.UpdateToolResponse> getUpdateToolMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.UpdateToolRequest, com.scalekit.grpc.scalekit.v1.tools.UpdateToolResponse> getUpdateToolMethod;
    if ((getUpdateToolMethod = ToolServiceGrpc.getUpdateToolMethod) == null) {
      synchronized (ToolServiceGrpc.class) {
        if ((getUpdateToolMethod = ToolServiceGrpc.getUpdateToolMethod) == null) {
          ToolServiceGrpc.getUpdateToolMethod = getUpdateToolMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.tools.UpdateToolRequest, com.scalekit.grpc.scalekit.v1.tools.UpdateToolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tools.UpdateToolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tools.UpdateToolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ToolServiceMethodDescriptorSupplier("UpdateTool"))
              .build();
        }
      }
    }
    return getUpdateToolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.DeleteToolRequest,
      com.google.protobuf.Empty> getDeleteToolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTool",
      requestType = com.scalekit.grpc.scalekit.v1.tools.DeleteToolRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.DeleteToolRequest,
      com.google.protobuf.Empty> getDeleteToolMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.DeleteToolRequest, com.google.protobuf.Empty> getDeleteToolMethod;
    if ((getDeleteToolMethod = ToolServiceGrpc.getDeleteToolMethod) == null) {
      synchronized (ToolServiceGrpc.class) {
        if ((getDeleteToolMethod = ToolServiceGrpc.getDeleteToolMethod) == null) {
          ToolServiceGrpc.getDeleteToolMethod = getDeleteToolMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.tools.DeleteToolRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tools.DeleteToolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ToolServiceMethodDescriptorSupplier("DeleteTool"))
              .build();
        }
      }
    }
    return getDeleteToolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.ExecuteToolRequest,
      com.scalekit.grpc.scalekit.v1.tools.ExecuteToolResponse> getExecuteToolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteTool",
      requestType = com.scalekit.grpc.scalekit.v1.tools.ExecuteToolRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.tools.ExecuteToolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.ExecuteToolRequest,
      com.scalekit.grpc.scalekit.v1.tools.ExecuteToolResponse> getExecuteToolMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tools.ExecuteToolRequest, com.scalekit.grpc.scalekit.v1.tools.ExecuteToolResponse> getExecuteToolMethod;
    if ((getExecuteToolMethod = ToolServiceGrpc.getExecuteToolMethod) == null) {
      synchronized (ToolServiceGrpc.class) {
        if ((getExecuteToolMethod = ToolServiceGrpc.getExecuteToolMethod) == null) {
          ToolServiceGrpc.getExecuteToolMethod = getExecuteToolMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.tools.ExecuteToolRequest, com.scalekit.grpc.scalekit.v1.tools.ExecuteToolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteTool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tools.ExecuteToolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tools.ExecuteToolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ToolServiceMethodDescriptorSupplier("ExecuteTool"))
              .build();
        }
      }
    }
    return getExecuteToolMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ToolServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ToolServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ToolServiceStub>() {
        @java.lang.Override
        public ToolServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ToolServiceStub(channel, callOptions);
        }
      };
    return ToolServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ToolServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ToolServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ToolServiceBlockingStub>() {
        @java.lang.Override
        public ToolServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ToolServiceBlockingStub(channel, callOptions);
        }
      };
    return ToolServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ToolServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ToolServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ToolServiceFutureStub>() {
        @java.lang.Override
        public ToolServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ToolServiceFutureStub(channel, callOptions);
        }
      };
    return ToolServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createTool(com.scalekit.grpc.scalekit.v1.tools.CreateToolRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tools.CreateToolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateToolMethod(), responseObserver);
    }

    /**
     */
    default void listTools(com.scalekit.grpc.scalekit.v1.tools.ListToolsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tools.ListToolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListToolsMethod(), responseObserver);
    }

    /**
     */
    default void listScopedTools(com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListScopedToolsMethod(), responseObserver);
    }

    /**
     */
    default void setToolDefault(com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetToolDefaultMethod(), responseObserver);
    }

    /**
     */
    default void updateTool(com.scalekit.grpc.scalekit.v1.tools.UpdateToolRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tools.UpdateToolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateToolMethod(), responseObserver);
    }

    /**
     */
    default void deleteTool(com.scalekit.grpc.scalekit.v1.tools.DeleteToolRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteToolMethod(), responseObserver);
    }

    /**
     */
    default void executeTool(com.scalekit.grpc.scalekit.v1.tools.ExecuteToolRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tools.ExecuteToolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteToolMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ToolService.
   */
  public static abstract class ToolServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ToolServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ToolService.
   */
  public static final class ToolServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ToolServiceStub> {
    private ToolServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToolServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ToolServiceStub(channel, callOptions);
    }

    /**
     */
    public void createTool(com.scalekit.grpc.scalekit.v1.tools.CreateToolRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tools.CreateToolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateToolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTools(com.scalekit.grpc.scalekit.v1.tools.ListToolsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tools.ListToolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListToolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listScopedTools(com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListScopedToolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setToolDefault(com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetToolDefaultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTool(com.scalekit.grpc.scalekit.v1.tools.UpdateToolRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tools.UpdateToolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateToolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTool(com.scalekit.grpc.scalekit.v1.tools.DeleteToolRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteToolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void executeTool(com.scalekit.grpc.scalekit.v1.tools.ExecuteToolRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tools.ExecuteToolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteToolMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ToolService.
   */
  public static final class ToolServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ToolServiceBlockingStub> {
    private ToolServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToolServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ToolServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.tools.CreateToolResponse createTool(com.scalekit.grpc.scalekit.v1.tools.CreateToolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateToolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.tools.ListToolsResponse listTools(com.scalekit.grpc.scalekit.v1.tools.ListToolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListToolsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsResponse listScopedTools(com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListScopedToolsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultResponse setToolDefault(com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetToolDefaultMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.tools.UpdateToolResponse updateTool(com.scalekit.grpc.scalekit.v1.tools.UpdateToolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateToolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteTool(com.scalekit.grpc.scalekit.v1.tools.DeleteToolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteToolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.tools.ExecuteToolResponse executeTool(com.scalekit.grpc.scalekit.v1.tools.ExecuteToolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteToolMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ToolService.
   */
  public static final class ToolServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ToolServiceFutureStub> {
    private ToolServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToolServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ToolServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.tools.CreateToolResponse> createTool(
        com.scalekit.grpc.scalekit.v1.tools.CreateToolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateToolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.tools.ListToolsResponse> listTools(
        com.scalekit.grpc.scalekit.v1.tools.ListToolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListToolsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsResponse> listScopedTools(
        com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListScopedToolsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultResponse> setToolDefault(
        com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetToolDefaultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.tools.UpdateToolResponse> updateTool(
        com.scalekit.grpc.scalekit.v1.tools.UpdateToolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateToolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTool(
        com.scalekit.grpc.scalekit.v1.tools.DeleteToolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteToolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.tools.ExecuteToolResponse> executeTool(
        com.scalekit.grpc.scalekit.v1.tools.ExecuteToolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteToolMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TOOL = 0;
  private static final int METHODID_LIST_TOOLS = 1;
  private static final int METHODID_LIST_SCOPED_TOOLS = 2;
  private static final int METHODID_SET_TOOL_DEFAULT = 3;
  private static final int METHODID_UPDATE_TOOL = 4;
  private static final int METHODID_DELETE_TOOL = 5;
  private static final int METHODID_EXECUTE_TOOL = 6;

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
        case METHODID_CREATE_TOOL:
          serviceImpl.createTool((com.scalekit.grpc.scalekit.v1.tools.CreateToolRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tools.CreateToolResponse>) responseObserver);
          break;
        case METHODID_LIST_TOOLS:
          serviceImpl.listTools((com.scalekit.grpc.scalekit.v1.tools.ListToolsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tools.ListToolsResponse>) responseObserver);
          break;
        case METHODID_LIST_SCOPED_TOOLS:
          serviceImpl.listScopedTools((com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsResponse>) responseObserver);
          break;
        case METHODID_SET_TOOL_DEFAULT:
          serviceImpl.setToolDefault((com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TOOL:
          serviceImpl.updateTool((com.scalekit.grpc.scalekit.v1.tools.UpdateToolRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tools.UpdateToolResponse>) responseObserver);
          break;
        case METHODID_DELETE_TOOL:
          serviceImpl.deleteTool((com.scalekit.grpc.scalekit.v1.tools.DeleteToolRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_EXECUTE_TOOL:
          serviceImpl.executeTool((com.scalekit.grpc.scalekit.v1.tools.ExecuteToolRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tools.ExecuteToolResponse>) responseObserver);
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
          getCreateToolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.tools.CreateToolRequest,
              com.scalekit.grpc.scalekit.v1.tools.CreateToolResponse>(
                service, METHODID_CREATE_TOOL)))
        .addMethod(
          getListToolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.tools.ListToolsRequest,
              com.scalekit.grpc.scalekit.v1.tools.ListToolsResponse>(
                service, METHODID_LIST_TOOLS)))
        .addMethod(
          getListScopedToolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsRequest,
              com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsResponse>(
                service, METHODID_LIST_SCOPED_TOOLS)))
        .addMethod(
          getSetToolDefaultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultRequest,
              com.scalekit.grpc.scalekit.v1.tools.SetToolDefaultResponse>(
                service, METHODID_SET_TOOL_DEFAULT)))
        .addMethod(
          getUpdateToolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.tools.UpdateToolRequest,
              com.scalekit.grpc.scalekit.v1.tools.UpdateToolResponse>(
                service, METHODID_UPDATE_TOOL)))
        .addMethod(
          getDeleteToolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.tools.DeleteToolRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_TOOL)))
        .addMethod(
          getExecuteToolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.tools.ExecuteToolRequest,
              com.scalekit.grpc.scalekit.v1.tools.ExecuteToolResponse>(
                service, METHODID_EXECUTE_TOOL)))
        .build();
  }

  private static abstract class ToolServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ToolServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.tools.ToolsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ToolService");
    }
  }

  private static final class ToolServiceFileDescriptorSupplier
      extends ToolServiceBaseDescriptorSupplier {
    ToolServiceFileDescriptorSupplier() {}
  }

  private static final class ToolServiceMethodDescriptorSupplier
      extends ToolServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ToolServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ToolServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ToolServiceFileDescriptorSupplier())
              .addMethod(getCreateToolMethod())
              .addMethod(getListToolsMethod())
              .addMethod(getListScopedToolsMethod())
              .addMethod(getSetToolDefaultMethod())
              .addMethod(getUpdateToolMethod())
              .addMethod(getDeleteToolMethod())
              .addMethod(getExecuteToolMethod())
              .build();
        }
      }
    }
    return result;
  }
}
