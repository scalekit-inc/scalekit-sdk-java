package com.scalekit.grpc.scalekit.v1.tokens;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ApiTokenService provides API token management operations
 * for secure authentication of external systems and applications.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/tokens/tokens.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ApiTokenServiceGrpc {

  private ApiTokenServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.tokens.ApiTokenService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tokens.CreateTokenRequest,
      com.scalekit.grpc.scalekit.v1.tokens.CreateTokenResponse> getCreateTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateToken",
      requestType = com.scalekit.grpc.scalekit.v1.tokens.CreateTokenRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.tokens.CreateTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tokens.CreateTokenRequest,
      com.scalekit.grpc.scalekit.v1.tokens.CreateTokenResponse> getCreateTokenMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tokens.CreateTokenRequest, com.scalekit.grpc.scalekit.v1.tokens.CreateTokenResponse> getCreateTokenMethod;
    if ((getCreateTokenMethod = ApiTokenServiceGrpc.getCreateTokenMethod) == null) {
      synchronized (ApiTokenServiceGrpc.class) {
        if ((getCreateTokenMethod = ApiTokenServiceGrpc.getCreateTokenMethod) == null) {
          ApiTokenServiceGrpc.getCreateTokenMethod = getCreateTokenMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.tokens.CreateTokenRequest, com.scalekit.grpc.scalekit.v1.tokens.CreateTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tokens.CreateTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tokens.CreateTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiTokenServiceMethodDescriptorSupplier("CreateToken"))
              .build();
        }
      }
    }
    return getCreateTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenRequest,
      com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenResponse> getValidateTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateToken",
      requestType = com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenRequest,
      com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenResponse> getValidateTokenMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenRequest, com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenResponse> getValidateTokenMethod;
    if ((getValidateTokenMethod = ApiTokenServiceGrpc.getValidateTokenMethod) == null) {
      synchronized (ApiTokenServiceGrpc.class) {
        if ((getValidateTokenMethod = ApiTokenServiceGrpc.getValidateTokenMethod) == null) {
          ApiTokenServiceGrpc.getValidateTokenMethod = getValidateTokenMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenRequest, com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiTokenServiceMethodDescriptorSupplier("ValidateToken"))
              .build();
        }
      }
    }
    return getValidateTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tokens.InvalidateTokenRequest,
      com.google.protobuf.Empty> getInvalidateTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InvalidateToken",
      requestType = com.scalekit.grpc.scalekit.v1.tokens.InvalidateTokenRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tokens.InvalidateTokenRequest,
      com.google.protobuf.Empty> getInvalidateTokenMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tokens.InvalidateTokenRequest, com.google.protobuf.Empty> getInvalidateTokenMethod;
    if ((getInvalidateTokenMethod = ApiTokenServiceGrpc.getInvalidateTokenMethod) == null) {
      synchronized (ApiTokenServiceGrpc.class) {
        if ((getInvalidateTokenMethod = ApiTokenServiceGrpc.getInvalidateTokenMethod) == null) {
          ApiTokenServiceGrpc.getInvalidateTokenMethod = getInvalidateTokenMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.tokens.InvalidateTokenRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InvalidateToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tokens.InvalidateTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ApiTokenServiceMethodDescriptorSupplier("InvalidateToken"))
              .build();
        }
      }
    }
    return getInvalidateTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tokens.ListTokensRequest,
      com.scalekit.grpc.scalekit.v1.tokens.ListTokensResponse> getListTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTokens",
      requestType = com.scalekit.grpc.scalekit.v1.tokens.ListTokensRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.tokens.ListTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tokens.ListTokensRequest,
      com.scalekit.grpc.scalekit.v1.tokens.ListTokensResponse> getListTokensMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tokens.ListTokensRequest, com.scalekit.grpc.scalekit.v1.tokens.ListTokensResponse> getListTokensMethod;
    if ((getListTokensMethod = ApiTokenServiceGrpc.getListTokensMethod) == null) {
      synchronized (ApiTokenServiceGrpc.class) {
        if ((getListTokensMethod = ApiTokenServiceGrpc.getListTokensMethod) == null) {
          ApiTokenServiceGrpc.getListTokensMethod = getListTokensMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.tokens.ListTokensRequest, com.scalekit.grpc.scalekit.v1.tokens.ListTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tokens.ListTokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tokens.ListTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiTokenServiceMethodDescriptorSupplier("ListTokens"))
              .build();
        }
      }
    }
    return getListTokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenRequest,
      com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenResponse> getUpdateTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateToken",
      requestType = com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenRequest,
      com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenResponse> getUpdateTokenMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenRequest, com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenResponse> getUpdateTokenMethod;
    if ((getUpdateTokenMethod = ApiTokenServiceGrpc.getUpdateTokenMethod) == null) {
      synchronized (ApiTokenServiceGrpc.class) {
        if ((getUpdateTokenMethod = ApiTokenServiceGrpc.getUpdateTokenMethod) == null) {
          ApiTokenServiceGrpc.getUpdateTokenMethod = getUpdateTokenMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenRequest, com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiTokenServiceMethodDescriptorSupplier("UpdateToken"))
              .build();
        }
      }
    }
    return getUpdateTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tokens.FetchTokenRequest,
      com.scalekit.grpc.scalekit.v1.tokens.FetchTokenResponse> getFetchTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchToken",
      requestType = com.scalekit.grpc.scalekit.v1.tokens.FetchTokenRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.tokens.FetchTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tokens.FetchTokenRequest,
      com.scalekit.grpc.scalekit.v1.tokens.FetchTokenResponse> getFetchTokenMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.tokens.FetchTokenRequest, com.scalekit.grpc.scalekit.v1.tokens.FetchTokenResponse> getFetchTokenMethod;
    if ((getFetchTokenMethod = ApiTokenServiceGrpc.getFetchTokenMethod) == null) {
      synchronized (ApiTokenServiceGrpc.class) {
        if ((getFetchTokenMethod = ApiTokenServiceGrpc.getFetchTokenMethod) == null) {
          ApiTokenServiceGrpc.getFetchTokenMethod = getFetchTokenMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.tokens.FetchTokenRequest, com.scalekit.grpc.scalekit.v1.tokens.FetchTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tokens.FetchTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.tokens.FetchTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApiTokenServiceMethodDescriptorSupplier("FetchToken"))
              .build();
        }
      }
    }
    return getFetchTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApiTokenServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApiTokenServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApiTokenServiceStub>() {
        @java.lang.Override
        public ApiTokenServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApiTokenServiceStub(channel, callOptions);
        }
      };
    return ApiTokenServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApiTokenServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApiTokenServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApiTokenServiceBlockingStub>() {
        @java.lang.Override
        public ApiTokenServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApiTokenServiceBlockingStub(channel, callOptions);
        }
      };
    return ApiTokenServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApiTokenServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApiTokenServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApiTokenServiceFutureStub>() {
        @java.lang.Override
        public ApiTokenServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApiTokenServiceFutureStub(channel, callOptions);
        }
      };
    return ApiTokenServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ApiTokenService provides API token management operations
   * for secure authentication of external systems and applications.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateToken generates a new API token for an organization or user.
     * Returns an opaque token string and token claims.
     * </pre>
     */
    default void createToken(com.scalekit.grpc.scalekit.v1.tokens.CreateTokenRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tokens.CreateTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidateToken verifies an API token and returns associated context.
     * </pre>
     */
    default void validateToken(com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * InvalidateToken marks an API token as deleted (soft delete for audit).
     * </pre>
     */
    default void invalidateToken(com.scalekit.grpc.scalekit.v1.tokens.InvalidateTokenRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInvalidateTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListTokens retrieves API tokens for an organization or user with pagination.
     * </pre>
     */
    default void listTokens(com.scalekit.grpc.scalekit.v1.tokens.ListTokensRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tokens.ListTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTokensMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateToken updates the custom claims and description of an existing token
     * </pre>
     */
    default void updateToken(com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * We dont wan to expose token fetch . So making the authentication empty. This would block the request.
     * </pre>
     */
    default void fetchToken(com.scalekit.grpc.scalekit.v1.tokens.FetchTokenRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tokens.FetchTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFetchTokenMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ApiTokenService.
   * <pre>
   * ApiTokenService provides API token management operations
   * for secure authentication of external systems and applications.
   * </pre>
   */
  public static abstract class ApiTokenServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ApiTokenServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ApiTokenService.
   * <pre>
   * ApiTokenService provides API token management operations
   * for secure authentication of external systems and applications.
   * </pre>
   */
  public static final class ApiTokenServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ApiTokenServiceStub> {
    private ApiTokenServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiTokenServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApiTokenServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateToken generates a new API token for an organization or user.
     * Returns an opaque token string and token claims.
     * </pre>
     */
    public void createToken(com.scalekit.grpc.scalekit.v1.tokens.CreateTokenRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tokens.CreateTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidateToken verifies an API token and returns associated context.
     * </pre>
     */
    public void validateToken(com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * InvalidateToken marks an API token as deleted (soft delete for audit).
     * </pre>
     */
    public void invalidateToken(com.scalekit.grpc.scalekit.v1.tokens.InvalidateTokenRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInvalidateTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListTokens retrieves API tokens for an organization or user with pagination.
     * </pre>
     */
    public void listTokens(com.scalekit.grpc.scalekit.v1.tokens.ListTokensRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tokens.ListTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateToken updates the custom claims and description of an existing token
     * </pre>
     */
    public void updateToken(com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * We dont wan to expose token fetch . So making the authentication empty. This would block the request.
     * </pre>
     */
    public void fetchToken(com.scalekit.grpc.scalekit.v1.tokens.FetchTokenRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tokens.FetchTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ApiTokenService.
   * <pre>
   * ApiTokenService provides API token management operations
   * for secure authentication of external systems and applications.
   * </pre>
   */
  public static final class ApiTokenServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ApiTokenServiceBlockingStub> {
    private ApiTokenServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiTokenServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApiTokenServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateToken generates a new API token for an organization or user.
     * Returns an opaque token string and token claims.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.tokens.CreateTokenResponse createToken(com.scalekit.grpc.scalekit.v1.tokens.CreateTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidateToken verifies an API token and returns associated context.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenResponse validateToken(com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * InvalidateToken marks an API token as deleted (soft delete for audit).
     * </pre>
     */
    public com.google.protobuf.Empty invalidateToken(com.scalekit.grpc.scalekit.v1.tokens.InvalidateTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInvalidateTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListTokens retrieves API tokens for an organization or user with pagination.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.tokens.ListTokensResponse listTokens(com.scalekit.grpc.scalekit.v1.tokens.ListTokensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTokensMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateToken updates the custom claims and description of an existing token
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenResponse updateToken(com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * We dont wan to expose token fetch . So making the authentication empty. This would block the request.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.tokens.FetchTokenResponse fetchToken(com.scalekit.grpc.scalekit.v1.tokens.FetchTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ApiTokenService.
   * <pre>
   * ApiTokenService provides API token management operations
   * for secure authentication of external systems and applications.
   * </pre>
   */
  public static final class ApiTokenServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ApiTokenServiceFutureStub> {
    private ApiTokenServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiTokenServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApiTokenServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateToken generates a new API token for an organization or user.
     * Returns an opaque token string and token claims.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.tokens.CreateTokenResponse> createToken(
        com.scalekit.grpc.scalekit.v1.tokens.CreateTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidateToken verifies an API token and returns associated context.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenResponse> validateToken(
        com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * InvalidateToken marks an API token as deleted (soft delete for audit).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> invalidateToken(
        com.scalekit.grpc.scalekit.v1.tokens.InvalidateTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInvalidateTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListTokens retrieves API tokens for an organization or user with pagination.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.tokens.ListTokensResponse> listTokens(
        com.scalekit.grpc.scalekit.v1.tokens.ListTokensRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTokensMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateToken updates the custom claims and description of an existing token
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenResponse> updateToken(
        com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * We dont wan to expose token fetch . So making the authentication empty. This would block the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.tokens.FetchTokenResponse> fetchToken(
        com.scalekit.grpc.scalekit.v1.tokens.FetchTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TOKEN = 0;
  private static final int METHODID_VALIDATE_TOKEN = 1;
  private static final int METHODID_INVALIDATE_TOKEN = 2;
  private static final int METHODID_LIST_TOKENS = 3;
  private static final int METHODID_UPDATE_TOKEN = 4;
  private static final int METHODID_FETCH_TOKEN = 5;

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
        case METHODID_CREATE_TOKEN:
          serviceImpl.createToken((com.scalekit.grpc.scalekit.v1.tokens.CreateTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tokens.CreateTokenResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_TOKEN:
          serviceImpl.validateToken((com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenResponse>) responseObserver);
          break;
        case METHODID_INVALIDATE_TOKEN:
          serviceImpl.invalidateToken((com.scalekit.grpc.scalekit.v1.tokens.InvalidateTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_TOKENS:
          serviceImpl.listTokens((com.scalekit.grpc.scalekit.v1.tokens.ListTokensRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tokens.ListTokensResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TOKEN:
          serviceImpl.updateToken((com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenResponse>) responseObserver);
          break;
        case METHODID_FETCH_TOKEN:
          serviceImpl.fetchToken((com.scalekit.grpc.scalekit.v1.tokens.FetchTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.tokens.FetchTokenResponse>) responseObserver);
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
          getCreateTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.tokens.CreateTokenRequest,
              com.scalekit.grpc.scalekit.v1.tokens.CreateTokenResponse>(
                service, METHODID_CREATE_TOKEN)))
        .addMethod(
          getValidateTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenRequest,
              com.scalekit.grpc.scalekit.v1.tokens.ValidateTokenResponse>(
                service, METHODID_VALIDATE_TOKEN)))
        .addMethod(
          getInvalidateTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.tokens.InvalidateTokenRequest,
              com.google.protobuf.Empty>(
                service, METHODID_INVALIDATE_TOKEN)))
        .addMethod(
          getListTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.tokens.ListTokensRequest,
              com.scalekit.grpc.scalekit.v1.tokens.ListTokensResponse>(
                service, METHODID_LIST_TOKENS)))
        .addMethod(
          getUpdateTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenRequest,
              com.scalekit.grpc.scalekit.v1.tokens.UpdateTokenResponse>(
                service, METHODID_UPDATE_TOKEN)))
        .addMethod(
          getFetchTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.tokens.FetchTokenRequest,
              com.scalekit.grpc.scalekit.v1.tokens.FetchTokenResponse>(
                service, METHODID_FETCH_TOKEN)))
        .build();
  }

  private static abstract class ApiTokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApiTokenServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.tokens.TokensProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApiTokenService");
    }
  }

  private static final class ApiTokenServiceFileDescriptorSupplier
      extends ApiTokenServiceBaseDescriptorSupplier {
    ApiTokenServiceFileDescriptorSupplier() {}
  }

  private static final class ApiTokenServiceMethodDescriptorSupplier
      extends ApiTokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ApiTokenServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ApiTokenServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApiTokenServiceFileDescriptorSupplier())
              .addMethod(getCreateTokenMethod())
              .addMethod(getValidateTokenMethod())
              .addMethod(getInvalidateTokenMethod())
              .addMethod(getListTokensMethod())
              .addMethod(getUpdateTokenMethod())
              .addMethod(getFetchTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
