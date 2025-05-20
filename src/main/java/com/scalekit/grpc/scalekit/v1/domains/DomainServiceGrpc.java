package com.scalekit.grpc.scalekit.v1.domains;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/domains/domains.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DomainServiceGrpc {

  private DomainServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.domains.DomainService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.CreateDomainRequest,
      com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse> getCreateDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDomain",
      requestType = com.scalekit.grpc.scalekit.v1.domains.CreateDomainRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.CreateDomainRequest,
      com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse> getCreateDomainMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.CreateDomainRequest, com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse> getCreateDomainMethod;
    if ((getCreateDomainMethod = DomainServiceGrpc.getCreateDomainMethod) == null) {
      synchronized (DomainServiceGrpc.class) {
        if ((getCreateDomainMethod = DomainServiceGrpc.getCreateDomainMethod) == null) {
          DomainServiceGrpc.getCreateDomainMethod = getCreateDomainMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.domains.CreateDomainRequest, com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.domains.CreateDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainServiceMethodDescriptorSupplier("CreateDomain"))
              .build();
        }
      }
    }
    return getCreateDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.UpdateDomainRequest,
      com.scalekit.grpc.scalekit.v1.domains.UpdateDomainResponse> getUpdateDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDomain",
      requestType = com.scalekit.grpc.scalekit.v1.domains.UpdateDomainRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.domains.UpdateDomainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.UpdateDomainRequest,
      com.scalekit.grpc.scalekit.v1.domains.UpdateDomainResponse> getUpdateDomainMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.UpdateDomainRequest, com.scalekit.grpc.scalekit.v1.domains.UpdateDomainResponse> getUpdateDomainMethod;
    if ((getUpdateDomainMethod = DomainServiceGrpc.getUpdateDomainMethod) == null) {
      synchronized (DomainServiceGrpc.class) {
        if ((getUpdateDomainMethod = DomainServiceGrpc.getUpdateDomainMethod) == null) {
          DomainServiceGrpc.getUpdateDomainMethod = getUpdateDomainMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.domains.UpdateDomainRequest, com.scalekit.grpc.scalekit.v1.domains.UpdateDomainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.domains.UpdateDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.domains.UpdateDomainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainServiceMethodDescriptorSupplier("UpdateDomain"))
              .build();
        }
      }
    }
    return getUpdateDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.VerifyDomainRequest,
      com.google.protobuf.BoolValue> getVerifyDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyDomain",
      requestType = com.scalekit.grpc.scalekit.v1.domains.VerifyDomainRequest.class,
      responseType = com.google.protobuf.BoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.VerifyDomainRequest,
      com.google.protobuf.BoolValue> getVerifyDomainMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.VerifyDomainRequest, com.google.protobuf.BoolValue> getVerifyDomainMethod;
    if ((getVerifyDomainMethod = DomainServiceGrpc.getVerifyDomainMethod) == null) {
      synchronized (DomainServiceGrpc.class) {
        if ((getVerifyDomainMethod = DomainServiceGrpc.getVerifyDomainMethod) == null) {
          DomainServiceGrpc.getVerifyDomainMethod = getVerifyDomainMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.domains.VerifyDomainRequest, com.google.protobuf.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.domains.VerifyDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BoolValue.getDefaultInstance()))
              .setSchemaDescriptor(new DomainServiceMethodDescriptorSupplier("VerifyDomain"))
              .build();
        }
      }
    }
    return getVerifyDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.GetDomainRequest,
      com.scalekit.grpc.scalekit.v1.domains.GetDomainResponse> getGetDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDomain",
      requestType = com.scalekit.grpc.scalekit.v1.domains.GetDomainRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.domains.GetDomainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.GetDomainRequest,
      com.scalekit.grpc.scalekit.v1.domains.GetDomainResponse> getGetDomainMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.GetDomainRequest, com.scalekit.grpc.scalekit.v1.domains.GetDomainResponse> getGetDomainMethod;
    if ((getGetDomainMethod = DomainServiceGrpc.getGetDomainMethod) == null) {
      synchronized (DomainServiceGrpc.class) {
        if ((getGetDomainMethod = DomainServiceGrpc.getGetDomainMethod) == null) {
          DomainServiceGrpc.getGetDomainMethod = getGetDomainMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.domains.GetDomainRequest, com.scalekit.grpc.scalekit.v1.domains.GetDomainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.domains.GetDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.domains.GetDomainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainServiceMethodDescriptorSupplier("GetDomain"))
              .build();
        }
      }
    }
    return getGetDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.DeleteDomainRequest,
      com.google.protobuf.Empty> getDeleteDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDomain",
      requestType = com.scalekit.grpc.scalekit.v1.domains.DeleteDomainRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.DeleteDomainRequest,
      com.google.protobuf.Empty> getDeleteDomainMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.DeleteDomainRequest, com.google.protobuf.Empty> getDeleteDomainMethod;
    if ((getDeleteDomainMethod = DomainServiceGrpc.getDeleteDomainMethod) == null) {
      synchronized (DomainServiceGrpc.class) {
        if ((getDeleteDomainMethod = DomainServiceGrpc.getDeleteDomainMethod) == null) {
          DomainServiceGrpc.getDeleteDomainMethod = getDeleteDomainMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.domains.DeleteDomainRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.domains.DeleteDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DomainServiceMethodDescriptorSupplier("DeleteDomain"))
              .build();
        }
      }
    }
    return getDeleteDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.ListDomainRequest,
      com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse> getListDomainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDomains",
      requestType = com.scalekit.grpc.scalekit.v1.domains.ListDomainRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.ListDomainRequest,
      com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse> getListDomainsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.ListDomainRequest, com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse> getListDomainsMethod;
    if ((getListDomainsMethod = DomainServiceGrpc.getListDomainsMethod) == null) {
      synchronized (DomainServiceGrpc.class) {
        if ((getListDomainsMethod = DomainServiceGrpc.getListDomainsMethod) == null) {
          DomainServiceGrpc.getListDomainsMethod = getListDomainsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.domains.ListDomainRequest, com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDomains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.domains.ListDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainServiceMethodDescriptorSupplier("ListDomains"))
              .build();
        }
      }
    }
    return getListDomainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainRequest,
      com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainResponse> getListAuthorizedDomainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAuthorizedDomains",
      requestType = com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainRequest,
      com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainResponse> getListAuthorizedDomainsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainRequest, com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainResponse> getListAuthorizedDomainsMethod;
    if ((getListAuthorizedDomainsMethod = DomainServiceGrpc.getListAuthorizedDomainsMethod) == null) {
      synchronized (DomainServiceGrpc.class) {
        if ((getListAuthorizedDomainsMethod = DomainServiceGrpc.getListAuthorizedDomainsMethod) == null) {
          DomainServiceGrpc.getListAuthorizedDomainsMethod = getListAuthorizedDomainsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainRequest, com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAuthorizedDomains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainServiceMethodDescriptorSupplier("ListAuthorizedDomains"))
              .build();
        }
      }
    }
    return getListAuthorizedDomainsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DomainServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainServiceStub>() {
        @java.lang.Override
        public DomainServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainServiceStub(channel, callOptions);
        }
      };
    return DomainServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DomainServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainServiceBlockingStub>() {
        @java.lang.Override
        public DomainServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainServiceBlockingStub(channel, callOptions);
        }
      };
    return DomainServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DomainServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainServiceFutureStub>() {
        @java.lang.Override
        public DomainServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainServiceFutureStub(channel, callOptions);
        }
      };
    return DomainServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createDomain(com.scalekit.grpc.scalekit.v1.domains.CreateDomainRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDomainMethod(), responseObserver);
    }

    /**
     */
    default void updateDomain(com.scalekit.grpc.scalekit.v1.domains.UpdateDomainRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.domains.UpdateDomainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDomainMethod(), responseObserver);
    }

    /**
     */
    default void verifyDomain(com.scalekit.grpc.scalekit.v1.domains.VerifyDomainRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyDomainMethod(), responseObserver);
    }

    /**
     */
    default void getDomain(com.scalekit.grpc.scalekit.v1.domains.GetDomainRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.domains.GetDomainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDomainMethod(), responseObserver);
    }

    /**
     */
    default void deleteDomain(com.scalekit.grpc.scalekit.v1.domains.DeleteDomainRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDomainMethod(), responseObserver);
    }

    /**
     */
    default void listDomains(com.scalekit.grpc.scalekit.v1.domains.ListDomainRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDomainsMethod(), responseObserver);
    }

    /**
     */
    default void listAuthorizedDomains(com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAuthorizedDomainsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DomainService.
   */
  public static abstract class DomainServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DomainServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DomainService.
   */
  public static final class DomainServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DomainServiceStub> {
    private DomainServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainServiceStub(channel, callOptions);
    }

    /**
     */
    public void createDomain(com.scalekit.grpc.scalekit.v1.domains.CreateDomainRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDomain(com.scalekit.grpc.scalekit.v1.domains.UpdateDomainRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.domains.UpdateDomainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verifyDomain(com.scalekit.grpc.scalekit.v1.domains.VerifyDomainRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDomain(com.scalekit.grpc.scalekit.v1.domains.GetDomainRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.domains.GetDomainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDomain(com.scalekit.grpc.scalekit.v1.domains.DeleteDomainRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDomains(com.scalekit.grpc.scalekit.v1.domains.ListDomainRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDomainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAuthorizedDomains(com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAuthorizedDomainsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DomainService.
   */
  public static final class DomainServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DomainServiceBlockingStub> {
    private DomainServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse createDomain(com.scalekit.grpc.scalekit.v1.domains.CreateDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDomainMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.domains.UpdateDomainResponse updateDomain(com.scalekit.grpc.scalekit.v1.domains.UpdateDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDomainMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.BoolValue verifyDomain(com.scalekit.grpc.scalekit.v1.domains.VerifyDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyDomainMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.domains.GetDomainResponse getDomain(com.scalekit.grpc.scalekit.v1.domains.GetDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDomainMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteDomain(com.scalekit.grpc.scalekit.v1.domains.DeleteDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDomainMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse listDomains(com.scalekit.grpc.scalekit.v1.domains.ListDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDomainsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainResponse listAuthorizedDomains(com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAuthorizedDomainsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DomainService.
   */
  public static final class DomainServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DomainServiceFutureStub> {
    private DomainServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse> createDomain(
        com.scalekit.grpc.scalekit.v1.domains.CreateDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDomainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.domains.UpdateDomainResponse> updateDomain(
        com.scalekit.grpc.scalekit.v1.domains.UpdateDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDomainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> verifyDomain(
        com.scalekit.grpc.scalekit.v1.domains.VerifyDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyDomainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.domains.GetDomainResponse> getDomain(
        com.scalekit.grpc.scalekit.v1.domains.GetDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDomainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDomain(
        com.scalekit.grpc.scalekit.v1.domains.DeleteDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDomainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse> listDomains(
        com.scalekit.grpc.scalekit.v1.domains.ListDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDomainsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainResponse> listAuthorizedDomains(
        com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAuthorizedDomainsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DOMAIN = 0;
  private static final int METHODID_UPDATE_DOMAIN = 1;
  private static final int METHODID_VERIFY_DOMAIN = 2;
  private static final int METHODID_GET_DOMAIN = 3;
  private static final int METHODID_DELETE_DOMAIN = 4;
  private static final int METHODID_LIST_DOMAINS = 5;
  private static final int METHODID_LIST_AUTHORIZED_DOMAINS = 6;

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
        case METHODID_CREATE_DOMAIN:
          serviceImpl.createDomain((com.scalekit.grpc.scalekit.v1.domains.CreateDomainRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DOMAIN:
          serviceImpl.updateDomain((com.scalekit.grpc.scalekit.v1.domains.UpdateDomainRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.domains.UpdateDomainResponse>) responseObserver);
          break;
        case METHODID_VERIFY_DOMAIN:
          serviceImpl.verifyDomain((com.scalekit.grpc.scalekit.v1.domains.VerifyDomainRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
          break;
        case METHODID_GET_DOMAIN:
          serviceImpl.getDomain((com.scalekit.grpc.scalekit.v1.domains.GetDomainRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.domains.GetDomainResponse>) responseObserver);
          break;
        case METHODID_DELETE_DOMAIN:
          serviceImpl.deleteDomain((com.scalekit.grpc.scalekit.v1.domains.DeleteDomainRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_DOMAINS:
          serviceImpl.listDomains((com.scalekit.grpc.scalekit.v1.domains.ListDomainRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse>) responseObserver);
          break;
        case METHODID_LIST_AUTHORIZED_DOMAINS:
          serviceImpl.listAuthorizedDomains((com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainResponse>) responseObserver);
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
          getCreateDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.domains.CreateDomainRequest,
              com.scalekit.grpc.scalekit.v1.domains.CreateDomainResponse>(
                service, METHODID_CREATE_DOMAIN)))
        .addMethod(
          getUpdateDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.domains.UpdateDomainRequest,
              com.scalekit.grpc.scalekit.v1.domains.UpdateDomainResponse>(
                service, METHODID_UPDATE_DOMAIN)))
        .addMethod(
          getVerifyDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.domains.VerifyDomainRequest,
              com.google.protobuf.BoolValue>(
                service, METHODID_VERIFY_DOMAIN)))
        .addMethod(
          getGetDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.domains.GetDomainRequest,
              com.scalekit.grpc.scalekit.v1.domains.GetDomainResponse>(
                service, METHODID_GET_DOMAIN)))
        .addMethod(
          getDeleteDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.domains.DeleteDomainRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_DOMAIN)))
        .addMethod(
          getListDomainsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.domains.ListDomainRequest,
              com.scalekit.grpc.scalekit.v1.domains.ListDomainResponse>(
                service, METHODID_LIST_DOMAINS)))
        .addMethod(
          getListAuthorizedDomainsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainRequest,
              com.scalekit.grpc.scalekit.v1.domains.ListAuthorizedDomainResponse>(
                service, METHODID_LIST_AUTHORIZED_DOMAINS)))
        .build();
  }

  private static abstract class DomainServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DomainServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.domains.DomainsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DomainService");
    }
  }

  private static final class DomainServiceFileDescriptorSupplier
      extends DomainServiceBaseDescriptorSupplier {
    DomainServiceFileDescriptorSupplier() {}
  }

  private static final class DomainServiceMethodDescriptorSupplier
      extends DomainServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DomainServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DomainServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DomainServiceFileDescriptorSupplier())
              .addMethod(getCreateDomainMethod())
              .addMethod(getUpdateDomainMethod())
              .addMethod(getVerifyDomainMethod())
              .addMethod(getGetDomainMethod())
              .addMethod(getDeleteDomainMethod())
              .addMethod(getListDomainsMethod())
              .addMethod(getListAuthorizedDomainsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
