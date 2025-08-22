package com.scalekit.grpc.scalekit.v1.auditlogs;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/auditlogs/auditlogs.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuditLogsServiceGrpc {

  private AuditLogsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.auditlogs.AuditLogsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogRequest,
      com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogResponse> getListAuthRequestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAuthRequests",
      requestType = com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogRequest,
      com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogResponse> getListAuthRequestsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogRequest, com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogResponse> getListAuthRequestsMethod;
    if ((getListAuthRequestsMethod = AuditLogsServiceGrpc.getListAuthRequestsMethod) == null) {
      synchronized (AuditLogsServiceGrpc.class) {
        if ((getListAuthRequestsMethod = AuditLogsServiceGrpc.getListAuthRequestsMethod) == null) {
          AuditLogsServiceGrpc.getListAuthRequestsMethod = getListAuthRequestsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogRequest, com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAuthRequests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuditLogsServiceMethodDescriptorSupplier("ListAuthRequests"))
              .build();
        }
      }
    }
    return getListAuthRequestsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuditLogsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuditLogsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuditLogsServiceStub>() {
        @java.lang.Override
        public AuditLogsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuditLogsServiceStub(channel, callOptions);
        }
      };
    return AuditLogsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuditLogsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuditLogsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuditLogsServiceBlockingStub>() {
        @java.lang.Override
        public AuditLogsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuditLogsServiceBlockingStub(channel, callOptions);
        }
      };
    return AuditLogsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuditLogsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuditLogsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuditLogsServiceFutureStub>() {
        @java.lang.Override
        public AuditLogsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuditLogsServiceFutureStub(channel, callOptions);
        }
      };
    return AuditLogsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void listAuthRequests(com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAuthRequestsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AuditLogsService.
   */
  public static abstract class AuditLogsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuditLogsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AuditLogsService.
   */
  public static final class AuditLogsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AuditLogsServiceStub> {
    private AuditLogsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuditLogsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuditLogsServiceStub(channel, callOptions);
    }

    /**
     */
    public void listAuthRequests(com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAuthRequestsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AuditLogsService.
   */
  public static final class AuditLogsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuditLogsServiceBlockingStub> {
    private AuditLogsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuditLogsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuditLogsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogResponse listAuthRequests(com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAuthRequestsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AuditLogsService.
   */
  public static final class AuditLogsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuditLogsServiceFutureStub> {
    private AuditLogsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuditLogsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuditLogsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogResponse> listAuthRequests(
        com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAuthRequestsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_AUTH_REQUESTS = 0;

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
        case METHODID_LIST_AUTH_REQUESTS:
          serviceImpl.listAuthRequests((com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogResponse>) responseObserver);
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
          getListAuthRequestsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogRequest,
              com.scalekit.grpc.scalekit.v1.auditlogs.ListAuthLogResponse>(
                service, METHODID_LIST_AUTH_REQUESTS)))
        .build();
  }

  private static abstract class AuditLogsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuditLogsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.auditlogs.AuditlogsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuditLogsService");
    }
  }

  private static final class AuditLogsServiceFileDescriptorSupplier
      extends AuditLogsServiceBaseDescriptorSupplier {
    AuditLogsServiceFileDescriptorSupplier() {}
  }

  private static final class AuditLogsServiceMethodDescriptorSupplier
      extends AuditLogsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AuditLogsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AuditLogsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuditLogsServiceFileDescriptorSupplier())
              .addMethod(getListAuthRequestsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
