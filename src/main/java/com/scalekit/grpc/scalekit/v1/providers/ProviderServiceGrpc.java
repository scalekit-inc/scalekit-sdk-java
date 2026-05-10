package com.scalekit.grpc.scalekit.v1.providers;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/providers/providers.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProviderServiceGrpc {

  private ProviderServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.providers.ProviderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.providers.CreateProviderRequest,
      com.scalekit.grpc.scalekit.v1.providers.CreateProviderResponse> getCreateProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProvider",
      requestType = com.scalekit.grpc.scalekit.v1.providers.CreateProviderRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.providers.CreateProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.providers.CreateProviderRequest,
      com.scalekit.grpc.scalekit.v1.providers.CreateProviderResponse> getCreateProviderMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.providers.CreateProviderRequest, com.scalekit.grpc.scalekit.v1.providers.CreateProviderResponse> getCreateProviderMethod;
    if ((getCreateProviderMethod = ProviderServiceGrpc.getCreateProviderMethod) == null) {
      synchronized (ProviderServiceGrpc.class) {
        if ((getCreateProviderMethod = ProviderServiceGrpc.getCreateProviderMethod) == null) {
          ProviderServiceGrpc.getCreateProviderMethod = getCreateProviderMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.providers.CreateProviderRequest, com.scalekit.grpc.scalekit.v1.providers.CreateProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.providers.CreateProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.providers.CreateProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderServiceMethodDescriptorSupplier("CreateProvider"))
              .build();
        }
      }
    }
    return getCreateProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.providers.UpdateProviderRequest,
      com.scalekit.grpc.scalekit.v1.providers.UpdateProviderResponse> getUpdateProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProvider",
      requestType = com.scalekit.grpc.scalekit.v1.providers.UpdateProviderRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.providers.UpdateProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.providers.UpdateProviderRequest,
      com.scalekit.grpc.scalekit.v1.providers.UpdateProviderResponse> getUpdateProviderMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.providers.UpdateProviderRequest, com.scalekit.grpc.scalekit.v1.providers.UpdateProviderResponse> getUpdateProviderMethod;
    if ((getUpdateProviderMethod = ProviderServiceGrpc.getUpdateProviderMethod) == null) {
      synchronized (ProviderServiceGrpc.class) {
        if ((getUpdateProviderMethod = ProviderServiceGrpc.getUpdateProviderMethod) == null) {
          ProviderServiceGrpc.getUpdateProviderMethod = getUpdateProviderMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.providers.UpdateProviderRequest, com.scalekit.grpc.scalekit.v1.providers.UpdateProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.providers.UpdateProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.providers.UpdateProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderServiceMethodDescriptorSupplier("UpdateProvider"))
              .build();
        }
      }
    }
    return getUpdateProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.providers.DeleteProviderRequest,
      com.scalekit.grpc.scalekit.v1.providers.DeleteProviderResponse> getDeleteProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProvider",
      requestType = com.scalekit.grpc.scalekit.v1.providers.DeleteProviderRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.providers.DeleteProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.providers.DeleteProviderRequest,
      com.scalekit.grpc.scalekit.v1.providers.DeleteProviderResponse> getDeleteProviderMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.providers.DeleteProviderRequest, com.scalekit.grpc.scalekit.v1.providers.DeleteProviderResponse> getDeleteProviderMethod;
    if ((getDeleteProviderMethod = ProviderServiceGrpc.getDeleteProviderMethod) == null) {
      synchronized (ProviderServiceGrpc.class) {
        if ((getDeleteProviderMethod = ProviderServiceGrpc.getDeleteProviderMethod) == null) {
          ProviderServiceGrpc.getDeleteProviderMethod = getDeleteProviderMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.providers.DeleteProviderRequest, com.scalekit.grpc.scalekit.v1.providers.DeleteProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.providers.DeleteProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.providers.DeleteProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderServiceMethodDescriptorSupplier("DeleteProvider"))
              .build();
        }
      }
    }
    return getDeleteProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.providers.ListProvidersRequest,
      com.scalekit.grpc.scalekit.v1.providers.ListProvidersResponse> getListProvidersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProviders",
      requestType = com.scalekit.grpc.scalekit.v1.providers.ListProvidersRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.providers.ListProvidersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.providers.ListProvidersRequest,
      com.scalekit.grpc.scalekit.v1.providers.ListProvidersResponse> getListProvidersMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.providers.ListProvidersRequest, com.scalekit.grpc.scalekit.v1.providers.ListProvidersResponse> getListProvidersMethod;
    if ((getListProvidersMethod = ProviderServiceGrpc.getListProvidersMethod) == null) {
      synchronized (ProviderServiceGrpc.class) {
        if ((getListProvidersMethod = ProviderServiceGrpc.getListProvidersMethod) == null) {
          ProviderServiceGrpc.getListProvidersMethod = getListProvidersMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.providers.ListProvidersRequest, com.scalekit.grpc.scalekit.v1.providers.ListProvidersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProviders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.providers.ListProvidersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.providers.ListProvidersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderServiceMethodDescriptorSupplier("ListProviders"))
              .build();
        }
      }
    }
    return getListProvidersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProviderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProviderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProviderServiceStub>() {
        @java.lang.Override
        public ProviderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProviderServiceStub(channel, callOptions);
        }
      };
    return ProviderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProviderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProviderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProviderServiceBlockingStub>() {
        @java.lang.Override
        public ProviderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProviderServiceBlockingStub(channel, callOptions);
        }
      };
    return ProviderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProviderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProviderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProviderServiceFutureStub>() {
        @java.lang.Override
        public ProviderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProviderServiceFutureStub(channel, callOptions);
        }
      };
    return ProviderServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void createProvider(com.scalekit.grpc.scalekit.v1.providers.CreateProviderRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.providers.CreateProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProviderMethod(), responseObserver);
    }

    /**
     */
    default void updateProvider(com.scalekit.grpc.scalekit.v1.providers.UpdateProviderRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.providers.UpdateProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProviderMethod(), responseObserver);
    }

    /**
     */
    default void deleteProvider(com.scalekit.grpc.scalekit.v1.providers.DeleteProviderRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.providers.DeleteProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProviderMethod(), responseObserver);
    }

    /**
     */
    default void listProviders(com.scalekit.grpc.scalekit.v1.providers.ListProvidersRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.providers.ListProvidersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProvidersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProviderService.
   * <pre>
   * Service definition
   * </pre>
   */
  public static abstract class ProviderServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProviderServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProviderService.
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class ProviderServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProviderServiceStub> {
    private ProviderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProviderServiceStub(channel, callOptions);
    }

    /**
     */
    public void createProvider(com.scalekit.grpc.scalekit.v1.providers.CreateProviderRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.providers.CreateProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProvider(com.scalekit.grpc.scalekit.v1.providers.UpdateProviderRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.providers.UpdateProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProvider(com.scalekit.grpc.scalekit.v1.providers.DeleteProviderRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.providers.DeleteProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listProviders(com.scalekit.grpc.scalekit.v1.providers.ListProvidersRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.providers.ListProvidersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProvidersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProviderService.
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class ProviderServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProviderServiceBlockingStub> {
    private ProviderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProviderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.providers.CreateProviderResponse createProvider(com.scalekit.grpc.scalekit.v1.providers.CreateProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.providers.UpdateProviderResponse updateProvider(com.scalekit.grpc.scalekit.v1.providers.UpdateProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.providers.DeleteProviderResponse deleteProvider(com.scalekit.grpc.scalekit.v1.providers.DeleteProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.providers.ListProvidersResponse listProviders(com.scalekit.grpc.scalekit.v1.providers.ListProvidersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProvidersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProviderService.
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class ProviderServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProviderServiceFutureStub> {
    private ProviderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProviderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.providers.CreateProviderResponse> createProvider(
        com.scalekit.grpc.scalekit.v1.providers.CreateProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.providers.UpdateProviderResponse> updateProvider(
        com.scalekit.grpc.scalekit.v1.providers.UpdateProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.providers.DeleteProviderResponse> deleteProvider(
        com.scalekit.grpc.scalekit.v1.providers.DeleteProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.providers.ListProvidersResponse> listProviders(
        com.scalekit.grpc.scalekit.v1.providers.ListProvidersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProvidersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROVIDER = 0;
  private static final int METHODID_UPDATE_PROVIDER = 1;
  private static final int METHODID_DELETE_PROVIDER = 2;
  private static final int METHODID_LIST_PROVIDERS = 3;

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
        case METHODID_CREATE_PROVIDER:
          serviceImpl.createProvider((com.scalekit.grpc.scalekit.v1.providers.CreateProviderRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.providers.CreateProviderResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROVIDER:
          serviceImpl.updateProvider((com.scalekit.grpc.scalekit.v1.providers.UpdateProviderRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.providers.UpdateProviderResponse>) responseObserver);
          break;
        case METHODID_DELETE_PROVIDER:
          serviceImpl.deleteProvider((com.scalekit.grpc.scalekit.v1.providers.DeleteProviderRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.providers.DeleteProviderResponse>) responseObserver);
          break;
        case METHODID_LIST_PROVIDERS:
          serviceImpl.listProviders((com.scalekit.grpc.scalekit.v1.providers.ListProvidersRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.providers.ListProvidersResponse>) responseObserver);
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
          getCreateProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.providers.CreateProviderRequest,
              com.scalekit.grpc.scalekit.v1.providers.CreateProviderResponse>(
                service, METHODID_CREATE_PROVIDER)))
        .addMethod(
          getUpdateProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.providers.UpdateProviderRequest,
              com.scalekit.grpc.scalekit.v1.providers.UpdateProviderResponse>(
                service, METHODID_UPDATE_PROVIDER)))
        .addMethod(
          getDeleteProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.providers.DeleteProviderRequest,
              com.scalekit.grpc.scalekit.v1.providers.DeleteProviderResponse>(
                service, METHODID_DELETE_PROVIDER)))
        .addMethod(
          getListProvidersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.providers.ListProvidersRequest,
              com.scalekit.grpc.scalekit.v1.providers.ListProvidersResponse>(
                service, METHODID_LIST_PROVIDERS)))
        .build();
  }

  private static abstract class ProviderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProviderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.providers.ProvidersProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProviderService");
    }
  }

  private static final class ProviderServiceFileDescriptorSupplier
      extends ProviderServiceBaseDescriptorSupplier {
    ProviderServiceFileDescriptorSupplier() {}
  }

  private static final class ProviderServiceMethodDescriptorSupplier
      extends ProviderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProviderServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProviderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProviderServiceFileDescriptorSupplier())
              .addMethod(getCreateProviderMethod())
              .addMethod(getUpdateProviderMethod())
              .addMethod(getDeleteProviderMethod())
              .addMethod(getListProvidersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
