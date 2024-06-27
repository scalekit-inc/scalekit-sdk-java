package com.scalekit.grpc.scalekit.v1.connections;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: scalekit/v1/connections/connections.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConnectionServiceGrpc {

  private ConnectionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.connections.ConnectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse> getCreateConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateConnection",
      requestType = com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse> getCreateConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse> getCreateConnectionMethod;
    if ((getCreateConnectionMethod = ConnectionServiceGrpc.getCreateConnectionMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getCreateConnectionMethod = ConnectionServiceGrpc.getCreateConnectionMethod) == null) {
          ConnectionServiceGrpc.getCreateConnectionMethod = getCreateConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("CreateConnection"))
              .build();
        }
      }
    }
    return getCreateConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse> getGetConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConnection",
      requestType = com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse> getGetConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse> getGetConnectionMethod;
    if ((getGetConnectionMethod = ConnectionServiceGrpc.getGetConnectionMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getGetConnectionMethod = ConnectionServiceGrpc.getGetConnectionMethod) == null) {
          ConnectionServiceGrpc.getGetConnectionMethod = getGetConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("GetConnection"))
              .build();
        }
      }
    }
    return getGetConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest,
      com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse> getListConnectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListConnections",
      requestType = com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest,
      com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse> getListConnectionsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest, com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse> getListConnectionsMethod;
    if ((getListConnectionsMethod = ConnectionServiceGrpc.getListConnectionsMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getListConnectionsMethod = ConnectionServiceGrpc.getListConnectionsMethod) == null) {
          ConnectionServiceGrpc.getListConnectionsMethod = getListConnectionsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest, com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListConnections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("ListConnections"))
              .build();
        }
      }
    }
    return getListConnectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse> getUpdateConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateConnection",
      requestType = com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse> getUpdateConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse> getUpdateConnectionMethod;
    if ((getUpdateConnectionMethod = ConnectionServiceGrpc.getUpdateConnectionMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getUpdateConnectionMethod = ConnectionServiceGrpc.getUpdateConnectionMethod) == null) {
          ConnectionServiceGrpc.getUpdateConnectionMethod = getUpdateConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("UpdateConnection"))
              .build();
        }
      }
    }
    return getUpdateConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest,
      com.google.protobuf.Empty> getDeleteConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteConnection",
      requestType = com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest,
      com.google.protobuf.Empty> getDeleteConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest, com.google.protobuf.Empty> getDeleteConnectionMethod;
    if ((getDeleteConnectionMethod = ConnectionServiceGrpc.getDeleteConnectionMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getDeleteConnectionMethod = ConnectionServiceGrpc.getDeleteConnectionMethod) == null) {
          ConnectionServiceGrpc.getDeleteConnectionMethod = getDeleteConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("DeleteConnection"))
              .build();
        }
      }
    }
    return getDeleteConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> getEnableConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableConnection",
      requestType = com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> getEnableConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> getEnableConnectionMethod;
    if ((getEnableConnectionMethod = ConnectionServiceGrpc.getEnableConnectionMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getEnableConnectionMethod = ConnectionServiceGrpc.getEnableConnectionMethod) == null) {
          ConnectionServiceGrpc.getEnableConnectionMethod = getEnableConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("EnableConnection"))
              .build();
        }
      }
    }
    return getEnableConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> getDisableConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableConnection",
      requestType = com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> getDisableConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> getDisableConnectionMethod;
    if ((getDisableConnectionMethod = ConnectionServiceGrpc.getDisableConnectionMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getDisableConnectionMethod = ConnectionServiceGrpc.getDisableConnectionMethod) == null) {
          ConnectionServiceGrpc.getDisableConnectionMethod = getDisableConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("DisableConnection"))
              .build();
        }
      }
    }
    return getDisableConnectionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConnectionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceStub>() {
        @java.lang.Override
        public ConnectionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectionServiceStub(channel, callOptions);
        }
      };
    return ConnectionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConnectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceBlockingStub>() {
        @java.lang.Override
        public ConnectionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectionServiceBlockingStub(channel, callOptions);
        }
      };
    return ConnectionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConnectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceFutureStub>() {
        @java.lang.Override
        public ConnectionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectionServiceFutureStub(channel, callOptions);
        }
      };
    return ConnectionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createConnection(com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateConnectionMethod(), responseObserver);
    }

    /**
     */
    default void getConnection(com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConnectionMethod(), responseObserver);
    }

    /**
     */
    default void listConnections(com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListConnectionsMethod(), responseObserver);
    }

    /**
     */
    default void updateConnection(com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateConnectionMethod(), responseObserver);
    }

    /**
     */
    default void deleteConnection(com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteConnectionMethod(), responseObserver);
    }

    /**
     */
    default void enableConnection(com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableConnectionMethod(), responseObserver);
    }

    /**
     */
    default void disableConnection(com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableConnectionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ConnectionService.
   */
  public static abstract class ConnectionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ConnectionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ConnectionService.
   */
  public static final class ConnectionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ConnectionServiceStub> {
    private ConnectionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectionServiceStub(channel, callOptions);
    }

    /**
     */
    public void createConnection(com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getConnection(com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listConnections(com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListConnectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateConnection(com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteConnection(com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableConnection(com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableConnection(com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableConnectionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ConnectionService.
   */
  public static final class ConnectionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ConnectionServiceBlockingStub> {
    private ConnectionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse createConnection(com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse getConnection(com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse listConnections(com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListConnectionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse updateConnection(com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteConnection(com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse enableConnection(com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse disableConnection(com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableConnectionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ConnectionService.
   */
  public static final class ConnectionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ConnectionServiceFutureStub> {
    private ConnectionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse> createConnection(
        com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse> getConnection(
        com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse> listConnections(
        com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListConnectionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse> updateConnection(
        com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteConnection(
        com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> enableConnection(
        com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> disableConnection(
        com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableConnectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CONNECTION = 0;
  private static final int METHODID_GET_CONNECTION = 1;
  private static final int METHODID_LIST_CONNECTIONS = 2;
  private static final int METHODID_UPDATE_CONNECTION = 3;
  private static final int METHODID_DELETE_CONNECTION = 4;
  private static final int METHODID_ENABLE_CONNECTION = 5;
  private static final int METHODID_DISABLE_CONNECTION = 6;

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
        case METHODID_CREATE_CONNECTION:
          serviceImpl.createConnection((com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse>) responseObserver);
          break;
        case METHODID_GET_CONNECTION:
          serviceImpl.getConnection((com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse>) responseObserver);
          break;
        case METHODID_LIST_CONNECTIONS:
          serviceImpl.listConnections((com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CONNECTION:
          serviceImpl.updateConnection((com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse>) responseObserver);
          break;
        case METHODID_DELETE_CONNECTION:
          serviceImpl.deleteConnection((com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ENABLE_CONNECTION:
          serviceImpl.enableConnection((com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse>) responseObserver);
          break;
        case METHODID_DISABLE_CONNECTION:
          serviceImpl.disableConnection((com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse>) responseObserver);
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
          getCreateConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest,
              com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse>(
                service, METHODID_CREATE_CONNECTION)))
        .addMethod(
          getGetConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest,
              com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse>(
                service, METHODID_GET_CONNECTION)))
        .addMethod(
          getListConnectionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest,
              com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse>(
                service, METHODID_LIST_CONNECTIONS)))
        .addMethod(
          getUpdateConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest,
              com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse>(
                service, METHODID_UPDATE_CONNECTION)))
        .addMethod(
          getDeleteConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_CONNECTION)))
        .addMethod(
          getEnableConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest,
              com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse>(
                service, METHODID_ENABLE_CONNECTION)))
        .addMethod(
          getDisableConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest,
              com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse>(
                service, METHODID_DISABLE_CONNECTION)))
        .build();
  }

  private static abstract class ConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConnectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConnectionService");
    }
  }

  private static final class ConnectionServiceFileDescriptorSupplier
      extends ConnectionServiceBaseDescriptorSupplier {
    ConnectionServiceFileDescriptorSupplier() {}
  }

  private static final class ConnectionServiceMethodDescriptorSupplier
      extends ConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ConnectionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ConnectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConnectionServiceFileDescriptorSupplier())
              .addMethod(getCreateConnectionMethod())
              .addMethod(getGetConnectionMethod())
              .addMethod(getListConnectionsMethod())
              .addMethod(getUpdateConnectionMethod())
              .addMethod(getDeleteConnectionMethod())
              .addMethod(getEnableConnectionMethod())
              .addMethod(getDisableConnectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
