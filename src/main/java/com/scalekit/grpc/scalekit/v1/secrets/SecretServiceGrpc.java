package com.scalekit.grpc.scalekit.v1.secrets;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/secrets/secrets.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SecretServiceGrpc {

  private SecretServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.secrets.SecretService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.secrets.CreateSecretRequest,
      com.scalekit.grpc.scalekit.v1.secrets.CreateSecretResponse> getCreateSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSecret",
      requestType = com.scalekit.grpc.scalekit.v1.secrets.CreateSecretRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.secrets.CreateSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.secrets.CreateSecretRequest,
      com.scalekit.grpc.scalekit.v1.secrets.CreateSecretResponse> getCreateSecretMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.secrets.CreateSecretRequest, com.scalekit.grpc.scalekit.v1.secrets.CreateSecretResponse> getCreateSecretMethod;
    if ((getCreateSecretMethod = SecretServiceGrpc.getCreateSecretMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getCreateSecretMethod = SecretServiceGrpc.getCreateSecretMethod) == null) {
          SecretServiceGrpc.getCreateSecretMethod = getCreateSecretMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.secrets.CreateSecretRequest, com.scalekit.grpc.scalekit.v1.secrets.CreateSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.secrets.CreateSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.secrets.CreateSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("CreateSecret"))
              .build();
        }
      }
    }
    return getCreateSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.secrets.RotateSecretRequest,
      com.scalekit.grpc.scalekit.v1.secrets.RotateSecretResponse> getRotateSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RotateSecret",
      requestType = com.scalekit.grpc.scalekit.v1.secrets.RotateSecretRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.secrets.RotateSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.secrets.RotateSecretRequest,
      com.scalekit.grpc.scalekit.v1.secrets.RotateSecretResponse> getRotateSecretMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.secrets.RotateSecretRequest, com.scalekit.grpc.scalekit.v1.secrets.RotateSecretResponse> getRotateSecretMethod;
    if ((getRotateSecretMethod = SecretServiceGrpc.getRotateSecretMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getRotateSecretMethod = SecretServiceGrpc.getRotateSecretMethod) == null) {
          SecretServiceGrpc.getRotateSecretMethod = getRotateSecretMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.secrets.RotateSecretRequest, com.scalekit.grpc.scalekit.v1.secrets.RotateSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RotateSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.secrets.RotateSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.secrets.RotateSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("RotateSecret"))
              .build();
        }
      }
    }
    return getRotateSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.secrets.GetSecretRequest,
      com.scalekit.grpc.scalekit.v1.secrets.GetSecretResponse> getGetSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSecret",
      requestType = com.scalekit.grpc.scalekit.v1.secrets.GetSecretRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.secrets.GetSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.secrets.GetSecretRequest,
      com.scalekit.grpc.scalekit.v1.secrets.GetSecretResponse> getGetSecretMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.secrets.GetSecretRequest, com.scalekit.grpc.scalekit.v1.secrets.GetSecretResponse> getGetSecretMethod;
    if ((getGetSecretMethod = SecretServiceGrpc.getGetSecretMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getGetSecretMethod = SecretServiceGrpc.getGetSecretMethod) == null) {
          SecretServiceGrpc.getGetSecretMethod = getGetSecretMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.secrets.GetSecretRequest, com.scalekit.grpc.scalekit.v1.secrets.GetSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.secrets.GetSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.secrets.GetSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("GetSecret"))
              .build();
        }
      }
    }
    return getGetSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.secrets.ListSecretsRequest,
      com.scalekit.grpc.scalekit.v1.secrets.ListSecretsResponse> getListSecretsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSecrets",
      requestType = com.scalekit.grpc.scalekit.v1.secrets.ListSecretsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.secrets.ListSecretsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.secrets.ListSecretsRequest,
      com.scalekit.grpc.scalekit.v1.secrets.ListSecretsResponse> getListSecretsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.secrets.ListSecretsRequest, com.scalekit.grpc.scalekit.v1.secrets.ListSecretsResponse> getListSecretsMethod;
    if ((getListSecretsMethod = SecretServiceGrpc.getListSecretsMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getListSecretsMethod = SecretServiceGrpc.getListSecretsMethod) == null) {
          SecretServiceGrpc.getListSecretsMethod = getListSecretsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.secrets.ListSecretsRequest, com.scalekit.grpc.scalekit.v1.secrets.ListSecretsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSecrets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.secrets.ListSecretsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.secrets.ListSecretsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("ListSecrets"))
              .build();
        }
      }
    }
    return getListSecretsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.secrets.DeleteSecretRequest,
      com.google.protobuf.Empty> getDeleteSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSecret",
      requestType = com.scalekit.grpc.scalekit.v1.secrets.DeleteSecretRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.secrets.DeleteSecretRequest,
      com.google.protobuf.Empty> getDeleteSecretMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.secrets.DeleteSecretRequest, com.google.protobuf.Empty> getDeleteSecretMethod;
    if ((getDeleteSecretMethod = SecretServiceGrpc.getDeleteSecretMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getDeleteSecretMethod = SecretServiceGrpc.getDeleteSecretMethod) == null) {
          SecretServiceGrpc.getDeleteSecretMethod = getDeleteSecretMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.secrets.DeleteSecretRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.secrets.DeleteSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("DeleteSecret"))
              .build();
        }
      }
    }
    return getDeleteSecretMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecretServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecretServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecretServiceStub>() {
        @java.lang.Override
        public SecretServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecretServiceStub(channel, callOptions);
        }
      };
    return SecretServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecretServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecretServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecretServiceBlockingStub>() {
        @java.lang.Override
        public SecretServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecretServiceBlockingStub(channel, callOptions);
        }
      };
    return SecretServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecretServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecretServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecretServiceFutureStub>() {
        @java.lang.Override
        public SecretServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecretServiceFutureStub(channel, callOptions);
        }
      };
    return SecretServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createSecret(com.scalekit.grpc.scalekit.v1.secrets.CreateSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.secrets.CreateSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSecretMethod(), responseObserver);
    }

    /**
     */
    default void rotateSecret(com.scalekit.grpc.scalekit.v1.secrets.RotateSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.secrets.RotateSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRotateSecretMethod(), responseObserver);
    }

    /**
     */
    default void getSecret(com.scalekit.grpc.scalekit.v1.secrets.GetSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.secrets.GetSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSecretMethod(), responseObserver);
    }

    /**
     */
    default void listSecrets(com.scalekit.grpc.scalekit.v1.secrets.ListSecretsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.secrets.ListSecretsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSecretsMethod(), responseObserver);
    }

    /**
     */
    default void deleteSecret(com.scalekit.grpc.scalekit.v1.secrets.DeleteSecretRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSecretMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SecretService.
   */
  public static abstract class SecretServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SecretServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SecretService.
   */
  public static final class SecretServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SecretServiceStub> {
    private SecretServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecretServiceStub(channel, callOptions);
    }

    /**
     */
    public void createSecret(com.scalekit.grpc.scalekit.v1.secrets.CreateSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.secrets.CreateSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rotateSecret(com.scalekit.grpc.scalekit.v1.secrets.RotateSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.secrets.RotateSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRotateSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSecret(com.scalekit.grpc.scalekit.v1.secrets.GetSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.secrets.GetSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSecrets(com.scalekit.grpc.scalekit.v1.secrets.ListSecretsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.secrets.ListSecretsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSecretsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSecret(com.scalekit.grpc.scalekit.v1.secrets.DeleteSecretRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSecretMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SecretService.
   */
  public static final class SecretServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SecretServiceBlockingStub> {
    private SecretServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecretServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.secrets.CreateSecretResponse createSecret(com.scalekit.grpc.scalekit.v1.secrets.CreateSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSecretMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.secrets.RotateSecretResponse rotateSecret(com.scalekit.grpc.scalekit.v1.secrets.RotateSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRotateSecretMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.secrets.GetSecretResponse getSecret(com.scalekit.grpc.scalekit.v1.secrets.GetSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSecretMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.secrets.ListSecretsResponse listSecrets(com.scalekit.grpc.scalekit.v1.secrets.ListSecretsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSecretsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteSecret(com.scalekit.grpc.scalekit.v1.secrets.DeleteSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSecretMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SecretService.
   */
  public static final class SecretServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SecretServiceFutureStub> {
    private SecretServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecretServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.secrets.CreateSecretResponse> createSecret(
        com.scalekit.grpc.scalekit.v1.secrets.CreateSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSecretMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.secrets.RotateSecretResponse> rotateSecret(
        com.scalekit.grpc.scalekit.v1.secrets.RotateSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRotateSecretMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.secrets.GetSecretResponse> getSecret(
        com.scalekit.grpc.scalekit.v1.secrets.GetSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSecretMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.secrets.ListSecretsResponse> listSecrets(
        com.scalekit.grpc.scalekit.v1.secrets.ListSecretsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSecretsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSecret(
        com.scalekit.grpc.scalekit.v1.secrets.DeleteSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSecretMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SECRET = 0;
  private static final int METHODID_ROTATE_SECRET = 1;
  private static final int METHODID_GET_SECRET = 2;
  private static final int METHODID_LIST_SECRETS = 3;
  private static final int METHODID_DELETE_SECRET = 4;

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
        case METHODID_CREATE_SECRET:
          serviceImpl.createSecret((com.scalekit.grpc.scalekit.v1.secrets.CreateSecretRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.secrets.CreateSecretResponse>) responseObserver);
          break;
        case METHODID_ROTATE_SECRET:
          serviceImpl.rotateSecret((com.scalekit.grpc.scalekit.v1.secrets.RotateSecretRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.secrets.RotateSecretResponse>) responseObserver);
          break;
        case METHODID_GET_SECRET:
          serviceImpl.getSecret((com.scalekit.grpc.scalekit.v1.secrets.GetSecretRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.secrets.GetSecretResponse>) responseObserver);
          break;
        case METHODID_LIST_SECRETS:
          serviceImpl.listSecrets((com.scalekit.grpc.scalekit.v1.secrets.ListSecretsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.secrets.ListSecretsResponse>) responseObserver);
          break;
        case METHODID_DELETE_SECRET:
          serviceImpl.deleteSecret((com.scalekit.grpc.scalekit.v1.secrets.DeleteSecretRequest) request,
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
          getCreateSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.secrets.CreateSecretRequest,
              com.scalekit.grpc.scalekit.v1.secrets.CreateSecretResponse>(
                service, METHODID_CREATE_SECRET)))
        .addMethod(
          getRotateSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.secrets.RotateSecretRequest,
              com.scalekit.grpc.scalekit.v1.secrets.RotateSecretResponse>(
                service, METHODID_ROTATE_SECRET)))
        .addMethod(
          getGetSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.secrets.GetSecretRequest,
              com.scalekit.grpc.scalekit.v1.secrets.GetSecretResponse>(
                service, METHODID_GET_SECRET)))
        .addMethod(
          getListSecretsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.secrets.ListSecretsRequest,
              com.scalekit.grpc.scalekit.v1.secrets.ListSecretsResponse>(
                service, METHODID_LIST_SECRETS)))
        .addMethod(
          getDeleteSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.secrets.DeleteSecretRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_SECRET)))
        .build();
  }

  private static abstract class SecretServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecretServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.secrets.SecretsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecretService");
    }
  }

  private static final class SecretServiceFileDescriptorSupplier
      extends SecretServiceBaseDescriptorSupplier {
    SecretServiceFileDescriptorSupplier() {}
  }

  private static final class SecretServiceMethodDescriptorSupplier
      extends SecretServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SecretServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SecretServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecretServiceFileDescriptorSupplier())
              .addMethod(getCreateSecretMethod())
              .addMethod(getRotateSecretMethod())
              .addMethod(getGetSecretMethod())
              .addMethod(getListSecretsMethod())
              .addMethod(getDeleteSecretMethod())
              .build();
        }
      }
    }
    return result;
  }
}
