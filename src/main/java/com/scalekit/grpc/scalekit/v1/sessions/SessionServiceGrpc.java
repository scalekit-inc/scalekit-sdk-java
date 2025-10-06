package com.scalekit.grpc.scalekit.v1.sessions;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/sessions/sessions.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SessionServiceGrpc {

  private SessionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.sessions.SessionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.sessions.SessionDetailsRequest,
      com.scalekit.grpc.scalekit.v1.sessions.SessionDetails> getGetSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSession",
      requestType = com.scalekit.grpc.scalekit.v1.sessions.SessionDetailsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.sessions.SessionDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.sessions.SessionDetailsRequest,
      com.scalekit.grpc.scalekit.v1.sessions.SessionDetails> getGetSessionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.sessions.SessionDetailsRequest, com.scalekit.grpc.scalekit.v1.sessions.SessionDetails> getGetSessionMethod;
    if ((getGetSessionMethod = SessionServiceGrpc.getGetSessionMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getGetSessionMethod = SessionServiceGrpc.getGetSessionMethod) == null) {
          SessionServiceGrpc.getGetSessionMethod = getGetSessionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.sessions.SessionDetailsRequest, com.scalekit.grpc.scalekit.v1.sessions.SessionDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.sessions.SessionDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.sessions.SessionDetails.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("GetSession"))
              .build();
        }
      }
    }
    return getGetSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionRequest,
      com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionResponse> getRevokeSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeSession",
      requestType = com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionRequest,
      com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionResponse> getRevokeSessionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionRequest, com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionResponse> getRevokeSessionMethod;
    if ((getRevokeSessionMethod = SessionServiceGrpc.getRevokeSessionMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getRevokeSessionMethod = SessionServiceGrpc.getRevokeSessionMethod) == null) {
          SessionServiceGrpc.getRevokeSessionMethod = getRevokeSessionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionRequest, com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("RevokeSession"))
              .build();
        }
      }
    }
    return getRevokeSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetailsRequest,
      com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetails> getGetUserSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserSessions",
      requestType = com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetailsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetailsRequest,
      com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetails> getGetUserSessionsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetailsRequest, com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetails> getGetUserSessionsMethod;
    if ((getGetUserSessionsMethod = SessionServiceGrpc.getGetUserSessionsMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getGetUserSessionsMethod = SessionServiceGrpc.getGetUserSessionsMethod) == null) {
          SessionServiceGrpc.getGetUserSessionsMethod = getGetUserSessionsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetailsRequest, com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetails.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("GetUserSessions"))
              .build();
        }
      }
    }
    return getGetUserSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsRequest,
      com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsResponse> getRevokeAllUserSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeAllUserSessions",
      requestType = com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsRequest,
      com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsResponse> getRevokeAllUserSessionsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsRequest, com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsResponse> getRevokeAllUserSessionsMethod;
    if ((getRevokeAllUserSessionsMethod = SessionServiceGrpc.getRevokeAllUserSessionsMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getRevokeAllUserSessionsMethod = SessionServiceGrpc.getRevokeAllUserSessionsMethod) == null) {
          SessionServiceGrpc.getRevokeAllUserSessionsMethod = getRevokeAllUserSessionsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsRequest, com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeAllUserSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("RevokeAllUserSessions"))
              .build();
        }
      }
    }
    return getRevokeAllUserSessionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SessionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionServiceStub>() {
        @java.lang.Override
        public SessionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionServiceStub(channel, callOptions);
        }
      };
    return SessionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SessionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionServiceBlockingStub>() {
        @java.lang.Override
        public SessionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionServiceBlockingStub(channel, callOptions);
        }
      };
    return SessionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SessionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionServiceFutureStub>() {
        @java.lang.Override
        public SessionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionServiceFutureStub(channel, callOptions);
        }
      };
    return SessionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getSession(com.scalekit.grpc.scalekit.v1.sessions.SessionDetailsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.sessions.SessionDetails> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSessionMethod(), responseObserver);
    }

    /**
     */
    default void revokeSession(com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeSessionMethod(), responseObserver);
    }

    /**
     */
    default void getUserSessions(com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetailsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetails> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserSessionsMethod(), responseObserver);
    }

    /**
     */
    default void revokeAllUserSessions(com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeAllUserSessionsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SessionService.
   */
  public static abstract class SessionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SessionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SessionService.
   */
  public static final class SessionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SessionServiceStub> {
    private SessionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionServiceStub(channel, callOptions);
    }

    /**
     */
    public void getSession(com.scalekit.grpc.scalekit.v1.sessions.SessionDetailsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.sessions.SessionDetails> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void revokeSession(com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserSessions(com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetailsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetails> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void revokeAllUserSessions(com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeAllUserSessionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SessionService.
   */
  public static final class SessionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SessionServiceBlockingStub> {
    private SessionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.sessions.SessionDetails getSession(com.scalekit.grpc.scalekit.v1.sessions.SessionDetailsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionResponse revokeSession(com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetails getUserSessions(com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetailsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserSessionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsResponse revokeAllUserSessions(com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeAllUserSessionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SessionService.
   */
  public static final class SessionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SessionServiceFutureStub> {
    private SessionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.sessions.SessionDetails> getSession(
        com.scalekit.grpc.scalekit.v1.sessions.SessionDetailsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionResponse> revokeSession(
        com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetails> getUserSessions(
        com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetailsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserSessionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsResponse> revokeAllUserSessions(
        com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeAllUserSessionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SESSION = 0;
  private static final int METHODID_REVOKE_SESSION = 1;
  private static final int METHODID_GET_USER_SESSIONS = 2;
  private static final int METHODID_REVOKE_ALL_USER_SESSIONS = 3;

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
        case METHODID_GET_SESSION:
          serviceImpl.getSession((com.scalekit.grpc.scalekit.v1.sessions.SessionDetailsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.sessions.SessionDetails>) responseObserver);
          break;
        case METHODID_REVOKE_SESSION:
          serviceImpl.revokeSession((com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionResponse>) responseObserver);
          break;
        case METHODID_GET_USER_SESSIONS:
          serviceImpl.getUserSessions((com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetailsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetails>) responseObserver);
          break;
        case METHODID_REVOKE_ALL_USER_SESSIONS:
          serviceImpl.revokeAllUserSessions((com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsResponse>) responseObserver);
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
          getGetSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.sessions.SessionDetailsRequest,
              com.scalekit.grpc.scalekit.v1.sessions.SessionDetails>(
                service, METHODID_GET_SESSION)))
        .addMethod(
          getRevokeSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionRequest,
              com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionResponse>(
                service, METHODID_REVOKE_SESSION)))
        .addMethod(
          getGetUserSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetailsRequest,
              com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetails>(
                service, METHODID_GET_USER_SESSIONS)))
        .addMethod(
          getRevokeAllUserSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsRequest,
              com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsResponse>(
                service, METHODID_REVOKE_ALL_USER_SESSIONS)))
        .build();
  }

  private static abstract class SessionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SessionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.sessions.SessionsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SessionService");
    }
  }

  private static final class SessionServiceFileDescriptorSupplier
      extends SessionServiceBaseDescriptorSupplier {
    SessionServiceFileDescriptorSupplier() {}
  }

  private static final class SessionServiceMethodDescriptorSupplier
      extends SessionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SessionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SessionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SessionServiceFileDescriptorSupplier())
              .addMethod(getGetSessionMethod())
              .addMethod(getRevokeSessionMethod())
              .addMethod(getGetUserSessionsMethod())
              .addMethod(getRevokeAllUserSessionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
