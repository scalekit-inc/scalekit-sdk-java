package com.scalekit.grpc.scalekit.v1.clients;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: scalekit/v1/clients/clients.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClientServiceGrpc {

  private ClientServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.clients.ClientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest,
      com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse> getListClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListClient",
      requestType = com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest,
      com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse> getListClientMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest, com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse> getListClientMethod;
    if ((getListClientMethod = ClientServiceGrpc.getListClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getListClientMethod = ClientServiceGrpc.getListClientMethod) == null) {
          ClientServiceGrpc.getListClientMethod = getListClientMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest, com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("ListClient"))
              .build();
        }
      }
    }
    return getListClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.GetClientResponse> getGetClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClient",
      requestType = com.scalekit.grpc.scalekit.v1.clients.GetClientRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.GetClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.GetClientResponse> getGetClientMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetClientRequest, com.scalekit.grpc.scalekit.v1.clients.GetClientResponse> getGetClientMethod;
    if ((getGetClientMethod = ClientServiceGrpc.getGetClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getGetClientMethod = ClientServiceGrpc.getGetClientMethod) == null) {
          ClientServiceGrpc.getGetClientMethod = getGetClientMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.GetClientRequest, com.scalekit.grpc.scalekit.v1.clients.GetClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.GetClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.GetClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("GetClient"))
              .build();
        }
      }
    }
    return getGetClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse> getUpdateClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateClient",
      requestType = com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse> getUpdateClientMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest, com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse> getUpdateClientMethod;
    if ((getUpdateClientMethod = ClientServiceGrpc.getUpdateClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getUpdateClientMethod = ClientServiceGrpc.getUpdateClientMethod) == null) {
          ClientServiceGrpc.getUpdateClientMethod = getUpdateClientMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest, com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("UpdateClient"))
              .build();
        }
      }
    }
    return getUpdateClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest,
      com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse> getCreateClientSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateClientSecret",
      requestType = com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest,
      com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse> getCreateClientSecretMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest, com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse> getCreateClientSecretMethod;
    if ((getCreateClientSecretMethod = ClientServiceGrpc.getCreateClientSecretMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getCreateClientSecretMethod = ClientServiceGrpc.getCreateClientSecretMethod) == null) {
          ClientServiceGrpc.getCreateClientSecretMethod = getCreateClientSecretMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest, com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateClientSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("CreateClientSecret"))
              .build();
        }
      }
    }
    return getCreateClientSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest,
      com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse> getUpdateClientSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateClientSecret",
      requestType = com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest,
      com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse> getUpdateClientSecretMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest, com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse> getUpdateClientSecretMethod;
    if ((getUpdateClientSecretMethod = ClientServiceGrpc.getUpdateClientSecretMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getUpdateClientSecretMethod = ClientServiceGrpc.getUpdateClientSecretMethod) == null) {
          ClientServiceGrpc.getUpdateClientSecretMethod = getUpdateClientSecretMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest, com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateClientSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("UpdateClientSecret"))
              .build();
        }
      }
    }
    return getUpdateClientSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest,
      com.google.protobuf.Empty> getDeleteClientSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteClientSecret",
      requestType = com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest,
      com.google.protobuf.Empty> getDeleteClientSecretMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest, com.google.protobuf.Empty> getDeleteClientSecretMethod;
    if ((getDeleteClientSecretMethod = ClientServiceGrpc.getDeleteClientSecretMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getDeleteClientSecretMethod = ClientServiceGrpc.getDeleteClientSecretMethod) == null) {
          ClientServiceGrpc.getDeleteClientSecretMethod = getDeleteClientSecretMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteClientSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("DeleteClientSecret"))
              .build();
        }
      }
    }
    return getDeleteClientSecretMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientServiceStub>() {
        @java.lang.Override
        public ClientServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientServiceStub(channel, callOptions);
        }
      };
    return ClientServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientServiceBlockingStub>() {
        @java.lang.Override
        public ClientServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientServiceBlockingStub(channel, callOptions);
        }
      };
    return ClientServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientServiceFutureStub>() {
        @java.lang.Override
        public ClientServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientServiceFutureStub(channel, callOptions);
        }
      };
    return ClientServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void listClient(com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListClientMethod(), responseObserver);
    }

    /**
     */
    default void getClient(com.scalekit.grpc.scalekit.v1.clients.GetClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClientMethod(), responseObserver);
    }

    /**
     */
    default void updateClient(com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateClientMethod(), responseObserver);
    }

    /**
     */
    default void createClientSecret(com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateClientSecretMethod(), responseObserver);
    }

    /**
     */
    default void updateClientSecret(com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateClientSecretMethod(), responseObserver);
    }

    /**
     */
    default void deleteClientSecret(com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteClientSecretMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ClientService.
   */
  public static abstract class ClientServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ClientServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ClientService.
   */
  public static final class ClientServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ClientServiceStub> {
    private ClientServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientServiceStub(channel, callOptions);
    }

    /**
     */
    public void listClient(com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClient(com.scalekit.grpc.scalekit.v1.clients.GetClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateClient(com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createClientSecret(com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateClientSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateClientSecret(com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateClientSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteClientSecret(com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteClientSecretMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ClientService.
   */
  public static final class ClientServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ClientServiceBlockingStub> {
    private ClientServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse listClient(com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.GetClientResponse getClient(com.scalekit.grpc.scalekit.v1.clients.GetClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse updateClient(com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse createClientSecret(com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateClientSecretMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse updateClientSecret(com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateClientSecretMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteClientSecret(com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteClientSecretMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ClientService.
   */
  public static final class ClientServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ClientServiceFutureStub> {
    private ClientServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse> listClient(
        com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.GetClientResponse> getClient(
        com.scalekit.grpc.scalekit.v1.clients.GetClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse> updateClient(
        com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse> createClientSecret(
        com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateClientSecretMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse> updateClientSecret(
        com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateClientSecretMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteClientSecret(
        com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteClientSecretMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_CLIENT = 0;
  private static final int METHODID_GET_CLIENT = 1;
  private static final int METHODID_UPDATE_CLIENT = 2;
  private static final int METHODID_CREATE_CLIENT_SECRET = 3;
  private static final int METHODID_UPDATE_CLIENT_SECRET = 4;
  private static final int METHODID_DELETE_CLIENT_SECRET = 5;

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
        case METHODID_LIST_CLIENT:
          serviceImpl.listClient((com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse>) responseObserver);
          break;
        case METHODID_GET_CLIENT:
          serviceImpl.getClient((com.scalekit.grpc.scalekit.v1.clients.GetClientRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetClientResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CLIENT:
          serviceImpl.updateClient((com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse>) responseObserver);
          break;
        case METHODID_CREATE_CLIENT_SECRET:
          serviceImpl.createClientSecret((com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CLIENT_SECRET:
          serviceImpl.updateClientSecret((com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse>) responseObserver);
          break;
        case METHODID_DELETE_CLIENT_SECRET:
          serviceImpl.deleteClientSecret((com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
          getListClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest,
              com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse>(
                service, METHODID_LIST_CLIENT)))
        .addMethod(
          getGetClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.GetClientRequest,
              com.scalekit.grpc.scalekit.v1.clients.GetClientResponse>(
                service, METHODID_GET_CLIENT)))
        .addMethod(
          getUpdateClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest,
              com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse>(
                service, METHODID_UPDATE_CLIENT)))
        .addMethod(
          getCreateClientSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest,
              com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse>(
                service, METHODID_CREATE_CLIENT_SECRET)))
        .addMethod(
          getUpdateClientSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest,
              com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse>(
                service, METHODID_UPDATE_CLIENT_SECRET)))
        .addMethod(
          getDeleteClientSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_CLIENT_SECRET)))
        .build();
  }

  private static abstract class ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.clients.ClientsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientService");
    }
  }

  private static final class ClientServiceFileDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier {
    ClientServiceFileDescriptorSupplier() {}
  }

  private static final class ClientServiceMethodDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ClientServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ClientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientServiceFileDescriptorSupplier())
              .addMethod(getListClientMethod())
              .addMethod(getGetClientMethod())
              .addMethod(getUpdateClientMethod())
              .addMethod(getCreateClientSecretMethod())
              .addMethod(getUpdateClientSecretMethod())
              .addMethod(getDeleteClientSecretMethod())
              .build();
        }
      }
    }
    return result;
  }
}
