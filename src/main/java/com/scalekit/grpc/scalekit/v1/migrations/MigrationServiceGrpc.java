package com.scalekit.grpc.scalekit.v1.migrations;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/migrations/migrations.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MigrationServiceGrpc {

  private MigrationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.migrations.MigrationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.migrations.MigrateFSARequest,
      com.scalekit.grpc.scalekit.v1.migrations.MigrationFSAResponse> getMigrateFSADataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MigrateFSAData",
      requestType = com.scalekit.grpc.scalekit.v1.migrations.MigrateFSARequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.migrations.MigrationFSAResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.migrations.MigrateFSARequest,
      com.scalekit.grpc.scalekit.v1.migrations.MigrationFSAResponse> getMigrateFSADataMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.migrations.MigrateFSARequest, com.scalekit.grpc.scalekit.v1.migrations.MigrationFSAResponse> getMigrateFSADataMethod;
    if ((getMigrateFSADataMethod = MigrationServiceGrpc.getMigrateFSADataMethod) == null) {
      synchronized (MigrationServiceGrpc.class) {
        if ((getMigrateFSADataMethod = MigrationServiceGrpc.getMigrateFSADataMethod) == null) {
          MigrationServiceGrpc.getMigrateFSADataMethod = getMigrateFSADataMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.migrations.MigrateFSARequest, com.scalekit.grpc.scalekit.v1.migrations.MigrationFSAResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MigrateFSAData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.migrations.MigrateFSARequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.migrations.MigrationFSAResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MigrationServiceMethodDescriptorSupplier("MigrateFSAData"))
              .build();
        }
      }
    }
    return getMigrateFSADataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MigrationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MigrationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MigrationServiceStub>() {
        @java.lang.Override
        public MigrationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MigrationServiceStub(channel, callOptions);
        }
      };
    return MigrationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MigrationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MigrationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MigrationServiceBlockingStub>() {
        @java.lang.Override
        public MigrationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MigrationServiceBlockingStub(channel, callOptions);
        }
      };
    return MigrationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MigrationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MigrationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MigrationServiceFutureStub>() {
        @java.lang.Override
        public MigrationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MigrationServiceFutureStub(channel, callOptions);
        }
      };
    return MigrationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void migrateFSAData(com.scalekit.grpc.scalekit.v1.migrations.MigrateFSARequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.migrations.MigrationFSAResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMigrateFSADataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MigrationService.
   */
  public static abstract class MigrationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MigrationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MigrationService.
   */
  public static final class MigrationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MigrationServiceStub> {
    private MigrationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MigrationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MigrationServiceStub(channel, callOptions);
    }

    /**
     */
    public void migrateFSAData(com.scalekit.grpc.scalekit.v1.migrations.MigrateFSARequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.migrations.MigrationFSAResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMigrateFSADataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MigrationService.
   */
  public static final class MigrationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MigrationServiceBlockingStub> {
    private MigrationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MigrationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MigrationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.migrations.MigrationFSAResponse migrateFSAData(com.scalekit.grpc.scalekit.v1.migrations.MigrateFSARequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMigrateFSADataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MigrationService.
   */
  public static final class MigrationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MigrationServiceFutureStub> {
    private MigrationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MigrationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MigrationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.migrations.MigrationFSAResponse> migrateFSAData(
        com.scalekit.grpc.scalekit.v1.migrations.MigrateFSARequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMigrateFSADataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MIGRATE_FSADATA = 0;

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
        case METHODID_MIGRATE_FSADATA:
          serviceImpl.migrateFSAData((com.scalekit.grpc.scalekit.v1.migrations.MigrateFSARequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.migrations.MigrationFSAResponse>) responseObserver);
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
          getMigrateFSADataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.migrations.MigrateFSARequest,
              com.scalekit.grpc.scalekit.v1.migrations.MigrationFSAResponse>(
                service, METHODID_MIGRATE_FSADATA)))
        .build();
  }

  private static abstract class MigrationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MigrationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.migrations.MigrationsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MigrationService");
    }
  }

  private static final class MigrationServiceFileDescriptorSupplier
      extends MigrationServiceBaseDescriptorSupplier {
    MigrationServiceFileDescriptorSupplier() {}
  }

  private static final class MigrationServiceMethodDescriptorSupplier
      extends MigrationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MigrationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MigrationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MigrationServiceFileDescriptorSupplier())
              .addMethod(getMigrateFSADataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
