package com.scalekit.grpc.scalekit.v1.auth.passwordless;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/auth/passwordless.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PasswordlessServiceGrpc {

  private PasswordlessServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.auth.passwordless.PasswordlessService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessRequest,
      com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse> getSendPasswordlessEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendPasswordlessEmail",
      requestType = com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessRequest,
      com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse> getSendPasswordlessEmailMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessRequest, com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse> getSendPasswordlessEmailMethod;
    if ((getSendPasswordlessEmailMethod = PasswordlessServiceGrpc.getSendPasswordlessEmailMethod) == null) {
      synchronized (PasswordlessServiceGrpc.class) {
        if ((getSendPasswordlessEmailMethod = PasswordlessServiceGrpc.getSendPasswordlessEmailMethod) == null) {
          PasswordlessServiceGrpc.getSendPasswordlessEmailMethod = getSendPasswordlessEmailMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessRequest, com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendPasswordlessEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PasswordlessServiceMethodDescriptorSupplier("SendPasswordlessEmail"))
              .build();
        }
      }
    }
    return getSendPasswordlessEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessRequest,
      com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessResponse> getVerifyPasswordlessEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyPasswordlessEmail",
      requestType = com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessRequest,
      com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessResponse> getVerifyPasswordlessEmailMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessRequest, com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessResponse> getVerifyPasswordlessEmailMethod;
    if ((getVerifyPasswordlessEmailMethod = PasswordlessServiceGrpc.getVerifyPasswordlessEmailMethod) == null) {
      synchronized (PasswordlessServiceGrpc.class) {
        if ((getVerifyPasswordlessEmailMethod = PasswordlessServiceGrpc.getVerifyPasswordlessEmailMethod) == null) {
          PasswordlessServiceGrpc.getVerifyPasswordlessEmailMethod = getVerifyPasswordlessEmailMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessRequest, com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyPasswordlessEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PasswordlessServiceMethodDescriptorSupplier("VerifyPasswordlessEmail"))
              .build();
        }
      }
    }
    return getVerifyPasswordlessEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.passwordless.ResendPasswordlessRequest,
      com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse> getResendPasswordlessEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResendPasswordlessEmail",
      requestType = com.scalekit.grpc.scalekit.v1.auth.passwordless.ResendPasswordlessRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.passwordless.ResendPasswordlessRequest,
      com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse> getResendPasswordlessEmailMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.passwordless.ResendPasswordlessRequest, com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse> getResendPasswordlessEmailMethod;
    if ((getResendPasswordlessEmailMethod = PasswordlessServiceGrpc.getResendPasswordlessEmailMethod) == null) {
      synchronized (PasswordlessServiceGrpc.class) {
        if ((getResendPasswordlessEmailMethod = PasswordlessServiceGrpc.getResendPasswordlessEmailMethod) == null) {
          PasswordlessServiceGrpc.getResendPasswordlessEmailMethod = getResendPasswordlessEmailMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.passwordless.ResendPasswordlessRequest, com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResendPasswordlessEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.passwordless.ResendPasswordlessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PasswordlessServiceMethodDescriptorSupplier("ResendPasswordlessEmail"))
              .build();
        }
      }
    }
    return getResendPasswordlessEmailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PasswordlessServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PasswordlessServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PasswordlessServiceStub>() {
        @java.lang.Override
        public PasswordlessServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PasswordlessServiceStub(channel, callOptions);
        }
      };
    return PasswordlessServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PasswordlessServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PasswordlessServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PasswordlessServiceBlockingStub>() {
        @java.lang.Override
        public PasswordlessServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PasswordlessServiceBlockingStub(channel, callOptions);
        }
      };
    return PasswordlessServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PasswordlessServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PasswordlessServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PasswordlessServiceFutureStub>() {
        @java.lang.Override
        public PasswordlessServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PasswordlessServiceFutureStub(channel, callOptions);
        }
      };
    return PasswordlessServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sendPasswordlessEmail(com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendPasswordlessEmailMethod(), responseObserver);
    }

    /**
     */
    default void verifyPasswordlessEmail(com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyPasswordlessEmailMethod(), responseObserver);
    }

    /**
     */
    default void resendPasswordlessEmail(com.scalekit.grpc.scalekit.v1.auth.passwordless.ResendPasswordlessRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResendPasswordlessEmailMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PasswordlessService.
   */
  public static abstract class PasswordlessServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PasswordlessServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PasswordlessService.
   */
  public static final class PasswordlessServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PasswordlessServiceStub> {
    private PasswordlessServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PasswordlessServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PasswordlessServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendPasswordlessEmail(com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendPasswordlessEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verifyPasswordlessEmail(com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyPasswordlessEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resendPasswordlessEmail(com.scalekit.grpc.scalekit.v1.auth.passwordless.ResendPasswordlessRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResendPasswordlessEmailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PasswordlessService.
   */
  public static final class PasswordlessServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PasswordlessServiceBlockingStub> {
    private PasswordlessServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PasswordlessServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PasswordlessServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse sendPasswordlessEmail(com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendPasswordlessEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessResponse verifyPasswordlessEmail(com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyPasswordlessEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse resendPasswordlessEmail(com.scalekit.grpc.scalekit.v1.auth.passwordless.ResendPasswordlessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResendPasswordlessEmailMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PasswordlessService.
   */
  public static final class PasswordlessServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PasswordlessServiceFutureStub> {
    private PasswordlessServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PasswordlessServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PasswordlessServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse> sendPasswordlessEmail(
        com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendPasswordlessEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessResponse> verifyPasswordlessEmail(
        com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyPasswordlessEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse> resendPasswordlessEmail(
        com.scalekit.grpc.scalekit.v1.auth.passwordless.ResendPasswordlessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResendPasswordlessEmailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_PASSWORDLESS_EMAIL = 0;
  private static final int METHODID_VERIFY_PASSWORDLESS_EMAIL = 1;
  private static final int METHODID_RESEND_PASSWORDLESS_EMAIL = 2;

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
        case METHODID_SEND_PASSWORDLESS_EMAIL:
          serviceImpl.sendPasswordlessEmail((com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse>) responseObserver);
          break;
        case METHODID_VERIFY_PASSWORDLESS_EMAIL:
          serviceImpl.verifyPasswordlessEmail((com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessResponse>) responseObserver);
          break;
        case METHODID_RESEND_PASSWORDLESS_EMAIL:
          serviceImpl.resendPasswordlessEmail((com.scalekit.grpc.scalekit.v1.auth.passwordless.ResendPasswordlessRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse>) responseObserver);
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
          getSendPasswordlessEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessRequest,
              com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse>(
                service, METHODID_SEND_PASSWORDLESS_EMAIL)))
        .addMethod(
          getVerifyPasswordlessEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessRequest,
              com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessResponse>(
                service, METHODID_VERIFY_PASSWORDLESS_EMAIL)))
        .addMethod(
          getResendPasswordlessEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.passwordless.ResendPasswordlessRequest,
              com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse>(
                service, METHODID_RESEND_PASSWORDLESS_EMAIL)))
        .build();
  }

  private static abstract class PasswordlessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PasswordlessServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.auth.passwordless.PasswordlessProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PasswordlessService");
    }
  }

  private static final class PasswordlessServiceFileDescriptorSupplier
      extends PasswordlessServiceBaseDescriptorSupplier {
    PasswordlessServiceFileDescriptorSupplier() {}
  }

  private static final class PasswordlessServiceMethodDescriptorSupplier
      extends PasswordlessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PasswordlessServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PasswordlessServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PasswordlessServiceFileDescriptorSupplier())
              .addMethod(getSendPasswordlessEmailMethod())
              .addMethod(getVerifyPasswordlessEmailMethod())
              .addMethod(getResendPasswordlessEmailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
