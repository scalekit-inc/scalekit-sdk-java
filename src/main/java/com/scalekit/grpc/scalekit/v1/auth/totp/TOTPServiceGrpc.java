package com.scalekit.grpc.scalekit.v1.auth.totp;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/auth/totp.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TOTPServiceGrpc {

  private TOTPServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.auth.totp.TOTPService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationRequest,
      com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationResponse> getRegisterTOTPMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterTOTP",
      requestType = com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationRequest,
      com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationResponse> getRegisterTOTPMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationRequest, com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationResponse> getRegisterTOTPMethod;
    if ((getRegisterTOTPMethod = TOTPServiceGrpc.getRegisterTOTPMethod) == null) {
      synchronized (TOTPServiceGrpc.class) {
        if ((getRegisterTOTPMethod = TOTPServiceGrpc.getRegisterTOTPMethod) == null) {
          TOTPServiceGrpc.getRegisterTOTPMethod = getRegisterTOTPMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationRequest, com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterTOTP"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TOTPServiceMethodDescriptorSupplier("RegisterTOTP"))
              .build();
        }
      }
    }
    return getRegisterTOTPMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPRequest,
      com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPResponse> getEnableTOTPMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableTOTP",
      requestType = com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPRequest,
      com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPResponse> getEnableTOTPMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPRequest, com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPResponse> getEnableTOTPMethod;
    if ((getEnableTOTPMethod = TOTPServiceGrpc.getEnableTOTPMethod) == null) {
      synchronized (TOTPServiceGrpc.class) {
        if ((getEnableTOTPMethod = TOTPServiceGrpc.getEnableTOTPMethod) == null) {
          TOTPServiceGrpc.getEnableTOTPMethod = getEnableTOTPMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPRequest, com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableTOTP"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TOTPServiceMethodDescriptorSupplier("EnableTOTP"))
              .build();
        }
      }
    }
    return getEnableTOTPMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.totp.VerifyUserCodeRequest,
      com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse> getVerifyUserCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyUserCode",
      requestType = com.scalekit.grpc.scalekit.v1.auth.totp.VerifyUserCodeRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.totp.VerifyUserCodeRequest,
      com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse> getVerifyUserCodeMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.totp.VerifyUserCodeRequest, com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse> getVerifyUserCodeMethod;
    if ((getVerifyUserCodeMethod = TOTPServiceGrpc.getVerifyUserCodeMethod) == null) {
      synchronized (TOTPServiceGrpc.class) {
        if ((getVerifyUserCodeMethod = TOTPServiceGrpc.getVerifyUserCodeMethod) == null) {
          TOTPServiceGrpc.getVerifyUserCodeMethod = getVerifyUserCodeMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.totp.VerifyUserCodeRequest, com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyUserCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.totp.VerifyUserCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TOTPServiceMethodDescriptorSupplier("VerifyUserCode"))
              .build();
        }
      }
    }
    return getVerifyUserCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.totp.VerifyRegistrationCodeRequest,
      com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse> getVerifyRegistrationCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyRegistrationCode",
      requestType = com.scalekit.grpc.scalekit.v1.auth.totp.VerifyRegistrationCodeRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.totp.VerifyRegistrationCodeRequest,
      com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse> getVerifyRegistrationCodeMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.totp.VerifyRegistrationCodeRequest, com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse> getVerifyRegistrationCodeMethod;
    if ((getVerifyRegistrationCodeMethod = TOTPServiceGrpc.getVerifyRegistrationCodeMethod) == null) {
      synchronized (TOTPServiceGrpc.class) {
        if ((getVerifyRegistrationCodeMethod = TOTPServiceGrpc.getVerifyRegistrationCodeMethod) == null) {
          TOTPServiceGrpc.getVerifyRegistrationCodeMethod = getVerifyRegistrationCodeMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.totp.VerifyRegistrationCodeRequest, com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyRegistrationCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.totp.VerifyRegistrationCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TOTPServiceMethodDescriptorSupplier("VerifyRegistrationCode"))
              .build();
        }
      }
    }
    return getVerifyRegistrationCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.totp.DisableRegistrationTOTPRequest,
      com.google.protobuf.Empty> getDisableTOTPMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableTOTP",
      requestType = com.scalekit.grpc.scalekit.v1.auth.totp.DisableRegistrationTOTPRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.totp.DisableRegistrationTOTPRequest,
      com.google.protobuf.Empty> getDisableTOTPMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.totp.DisableRegistrationTOTPRequest, com.google.protobuf.Empty> getDisableTOTPMethod;
    if ((getDisableTOTPMethod = TOTPServiceGrpc.getDisableTOTPMethod) == null) {
      synchronized (TOTPServiceGrpc.class) {
        if ((getDisableTOTPMethod = TOTPServiceGrpc.getDisableTOTPMethod) == null) {
          TOTPServiceGrpc.getDisableTOTPMethod = getDisableTOTPMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.totp.DisableRegistrationTOTPRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableTOTP"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.totp.DisableRegistrationTOTPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TOTPServiceMethodDescriptorSupplier("DisableTOTP"))
              .build();
        }
      }
    }
    return getDisableTOTPMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TOTPServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TOTPServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TOTPServiceStub>() {
        @java.lang.Override
        public TOTPServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TOTPServiceStub(channel, callOptions);
        }
      };
    return TOTPServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TOTPServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TOTPServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TOTPServiceBlockingStub>() {
        @java.lang.Override
        public TOTPServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TOTPServiceBlockingStub(channel, callOptions);
        }
      };
    return TOTPServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TOTPServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TOTPServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TOTPServiceFutureStub>() {
        @java.lang.Override
        public TOTPServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TOTPServiceFutureStub(channel, callOptions);
        }
      };
    return TOTPServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Enable TOTP for a user
     * </pre>
     */
    default void registerTOTP(com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterTOTPMethod(), responseObserver);
    }

    /**
     */
    default void enableTOTP(com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableTOTPMethod(), responseObserver);
    }

    /**
     * <pre>
     * Verify TOTP code for a user
     * </pre>
     */
    default void verifyUserCode(com.scalekit.grpc.scalekit.v1.auth.totp.VerifyUserCodeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyUserCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Verify TOTP code for a registration
     * </pre>
     */
    default void verifyRegistrationCode(com.scalekit.grpc.scalekit.v1.auth.totp.VerifyRegistrationCodeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyRegistrationCodeMethod(), responseObserver);
    }

    /**
     */
    default void disableTOTP(com.scalekit.grpc.scalekit.v1.auth.totp.DisableRegistrationTOTPRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableTOTPMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TOTPService.
   */
  public static abstract class TOTPServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TOTPServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TOTPService.
   */
  public static final class TOTPServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TOTPServiceStub> {
    private TOTPServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TOTPServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TOTPServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enable TOTP for a user
     * </pre>
     */
    public void registerTOTP(com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterTOTPMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableTOTP(com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableTOTPMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Verify TOTP code for a user
     * </pre>
     */
    public void verifyUserCode(com.scalekit.grpc.scalekit.v1.auth.totp.VerifyUserCodeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyUserCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Verify TOTP code for a registration
     * </pre>
     */
    public void verifyRegistrationCode(com.scalekit.grpc.scalekit.v1.auth.totp.VerifyRegistrationCodeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyRegistrationCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableTOTP(com.scalekit.grpc.scalekit.v1.auth.totp.DisableRegistrationTOTPRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableTOTPMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TOTPService.
   */
  public static final class TOTPServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TOTPServiceBlockingStub> {
    private TOTPServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TOTPServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TOTPServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enable TOTP for a user
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationResponse registerTOTP(com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterTOTPMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPResponse enableTOTP(com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableTOTPMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Verify TOTP code for a user
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse verifyUserCode(com.scalekit.grpc.scalekit.v1.auth.totp.VerifyUserCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyUserCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Verify TOTP code for a registration
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse verifyRegistrationCode(com.scalekit.grpc.scalekit.v1.auth.totp.VerifyRegistrationCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyRegistrationCodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty disableTOTP(com.scalekit.grpc.scalekit.v1.auth.totp.DisableRegistrationTOTPRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableTOTPMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TOTPService.
   */
  public static final class TOTPServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TOTPServiceFutureStub> {
    private TOTPServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TOTPServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TOTPServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enable TOTP for a user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationResponse> registerTOTP(
        com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterTOTPMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPResponse> enableTOTP(
        com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableTOTPMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Verify TOTP code for a user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse> verifyUserCode(
        com.scalekit.grpc.scalekit.v1.auth.totp.VerifyUserCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyUserCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Verify TOTP code for a registration
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse> verifyRegistrationCode(
        com.scalekit.grpc.scalekit.v1.auth.totp.VerifyRegistrationCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyRegistrationCodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> disableTOTP(
        com.scalekit.grpc.scalekit.v1.auth.totp.DisableRegistrationTOTPRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableTOTPMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_TOTP = 0;
  private static final int METHODID_ENABLE_TOTP = 1;
  private static final int METHODID_VERIFY_USER_CODE = 2;
  private static final int METHODID_VERIFY_REGISTRATION_CODE = 3;
  private static final int METHODID_DISABLE_TOTP = 4;

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
        case METHODID_REGISTER_TOTP:
          serviceImpl.registerTOTP((com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationResponse>) responseObserver);
          break;
        case METHODID_ENABLE_TOTP:
          serviceImpl.enableTOTP((com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPResponse>) responseObserver);
          break;
        case METHODID_VERIFY_USER_CODE:
          serviceImpl.verifyUserCode((com.scalekit.grpc.scalekit.v1.auth.totp.VerifyUserCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse>) responseObserver);
          break;
        case METHODID_VERIFY_REGISTRATION_CODE:
          serviceImpl.verifyRegistrationCode((com.scalekit.grpc.scalekit.v1.auth.totp.VerifyRegistrationCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse>) responseObserver);
          break;
        case METHODID_DISABLE_TOTP:
          serviceImpl.disableTOTP((com.scalekit.grpc.scalekit.v1.auth.totp.DisableRegistrationTOTPRequest) request,
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
          getRegisterTOTPMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationRequest,
              com.scalekit.grpc.scalekit.v1.auth.totp.TOTPRegistrationResponse>(
                service, METHODID_REGISTER_TOTP)))
        .addMethod(
          getEnableTOTPMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPRequest,
              com.scalekit.grpc.scalekit.v1.auth.totp.EnableRegistrationTOTPResponse>(
                service, METHODID_ENABLE_TOTP)))
        .addMethod(
          getVerifyUserCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.totp.VerifyUserCodeRequest,
              com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse>(
                service, METHODID_VERIFY_USER_CODE)))
        .addMethod(
          getVerifyRegistrationCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.totp.VerifyRegistrationCodeRequest,
              com.scalekit.grpc.scalekit.v1.auth.totp.VerifyCodeResponse>(
                service, METHODID_VERIFY_REGISTRATION_CODE)))
        .addMethod(
          getDisableTOTPMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.totp.DisableRegistrationTOTPRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DISABLE_TOTP)))
        .build();
  }

  private static abstract class TOTPServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TOTPServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.auth.totp.TotpProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TOTPService");
    }
  }

  private static final class TOTPServiceFileDescriptorSupplier
      extends TOTPServiceBaseDescriptorSupplier {
    TOTPServiceFileDescriptorSupplier() {}
  }

  private static final class TOTPServiceMethodDescriptorSupplier
      extends TOTPServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TOTPServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TOTPServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TOTPServiceFileDescriptorSupplier())
              .addMethod(getRegisterTOTPMethod())
              .addMethod(getEnableTOTPMethod())
              .addMethod(getVerifyUserCodeMethod())
              .addMethod(getVerifyRegistrationCodeMethod())
              .addMethod(getDisableTOTPMethod())
              .build();
        }
      }
    }
    return result;
  }
}
