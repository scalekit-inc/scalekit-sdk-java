package com.scalekit.grpc.scalekit.v1.members;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * For the first closed beta build, we are not exposing the ability to create members. So, most of the APIs will have
 * WORKSPACE auth scope. when we release the members UI, we need to update those APIs to WORKSPACE_SESSION scope.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/members/members.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MembersServiceGrpc {

  private MembersServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.members.MembersService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.CreateMemberRequest,
      com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse> getCreateMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMember",
      requestType = com.scalekit.grpc.scalekit.v1.members.CreateMemberRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.CreateMemberRequest,
      com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse> getCreateMemberMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.CreateMemberRequest, com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse> getCreateMemberMethod;
    if ((getCreateMemberMethod = MembersServiceGrpc.getCreateMemberMethod) == null) {
      synchronized (MembersServiceGrpc.class) {
        if ((getCreateMemberMethod = MembersServiceGrpc.getCreateMemberMethod) == null) {
          MembersServiceGrpc.getCreateMemberMethod = getCreateMemberMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.members.CreateMemberRequest, com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.CreateMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MembersServiceMethodDescriptorSupplier("CreateMember"))
              .build();
        }
      }
    }
    return getCreateMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.UpdateCurrentMemberRequest,
      com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse> getUpdateCurrentMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCurrentMember",
      requestType = com.scalekit.grpc.scalekit.v1.members.UpdateCurrentMemberRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.UpdateCurrentMemberRequest,
      com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse> getUpdateCurrentMemberMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.UpdateCurrentMemberRequest, com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse> getUpdateCurrentMemberMethod;
    if ((getUpdateCurrentMemberMethod = MembersServiceGrpc.getUpdateCurrentMemberMethod) == null) {
      synchronized (MembersServiceGrpc.class) {
        if ((getUpdateCurrentMemberMethod = MembersServiceGrpc.getUpdateCurrentMemberMethod) == null) {
          MembersServiceGrpc.getUpdateCurrentMemberMethod = getUpdateCurrentMemberMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.members.UpdateCurrentMemberRequest, com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCurrentMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.UpdateCurrentMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MembersServiceMethodDescriptorSupplier("UpdateCurrentMember"))
              .build();
        }
      }
    }
    return getUpdateCurrentMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.UpdateMemberRequest,
      com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse> getUpdateMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMember",
      requestType = com.scalekit.grpc.scalekit.v1.members.UpdateMemberRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.UpdateMemberRequest,
      com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse> getUpdateMemberMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.UpdateMemberRequest, com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse> getUpdateMemberMethod;
    if ((getUpdateMemberMethod = MembersServiceGrpc.getUpdateMemberMethod) == null) {
      synchronized (MembersServiceGrpc.class) {
        if ((getUpdateMemberMethod = MembersServiceGrpc.getUpdateMemberMethod) == null) {
          MembersServiceGrpc.getUpdateMemberMethod = getUpdateMemberMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.members.UpdateMemberRequest, com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.UpdateMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MembersServiceMethodDescriptorSupplier("UpdateMember"))
              .build();
        }
      }
    }
    return getUpdateMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.GetCurrentMemberRequest,
      com.scalekit.grpc.scalekit.v1.members.GetMemberResponse> getGetCurrentMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentMember",
      requestType = com.scalekit.grpc.scalekit.v1.members.GetCurrentMemberRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.members.GetMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.GetCurrentMemberRequest,
      com.scalekit.grpc.scalekit.v1.members.GetMemberResponse> getGetCurrentMemberMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.GetCurrentMemberRequest, com.scalekit.grpc.scalekit.v1.members.GetMemberResponse> getGetCurrentMemberMethod;
    if ((getGetCurrentMemberMethod = MembersServiceGrpc.getGetCurrentMemberMethod) == null) {
      synchronized (MembersServiceGrpc.class) {
        if ((getGetCurrentMemberMethod = MembersServiceGrpc.getGetCurrentMemberMethod) == null) {
          MembersServiceGrpc.getGetCurrentMemberMethod = getGetCurrentMemberMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.members.GetCurrentMemberRequest, com.scalekit.grpc.scalekit.v1.members.GetMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.GetCurrentMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.GetMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MembersServiceMethodDescriptorSupplier("GetCurrentMember"))
              .build();
        }
      }
    }
    return getGetCurrentMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.GetMemberRequest,
      com.scalekit.grpc.scalekit.v1.members.GetMemberResponse> getGetMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMember",
      requestType = com.scalekit.grpc.scalekit.v1.members.GetMemberRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.members.GetMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.GetMemberRequest,
      com.scalekit.grpc.scalekit.v1.members.GetMemberResponse> getGetMemberMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.GetMemberRequest, com.scalekit.grpc.scalekit.v1.members.GetMemberResponse> getGetMemberMethod;
    if ((getGetMemberMethod = MembersServiceGrpc.getGetMemberMethod) == null) {
      synchronized (MembersServiceGrpc.class) {
        if ((getGetMemberMethod = MembersServiceGrpc.getGetMemberMethod) == null) {
          MembersServiceGrpc.getGetMemberMethod = getGetMemberMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.members.GetMemberRequest, com.scalekit.grpc.scalekit.v1.members.GetMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.GetMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.GetMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MembersServiceMethodDescriptorSupplier("GetMember"))
              .build();
        }
      }
    }
    return getGetMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.ListMemberRequest,
      com.scalekit.grpc.scalekit.v1.members.ListMemberResponse> getListMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMembers",
      requestType = com.scalekit.grpc.scalekit.v1.members.ListMemberRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.members.ListMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.ListMemberRequest,
      com.scalekit.grpc.scalekit.v1.members.ListMemberResponse> getListMembersMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.ListMemberRequest, com.scalekit.grpc.scalekit.v1.members.ListMemberResponse> getListMembersMethod;
    if ((getListMembersMethod = MembersServiceGrpc.getListMembersMethod) == null) {
      synchronized (MembersServiceGrpc.class) {
        if ((getListMembersMethod = MembersServiceGrpc.getListMembersMethod) == null) {
          MembersServiceGrpc.getListMembersMethod = getListMembersMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.members.ListMemberRequest, com.scalekit.grpc.scalekit.v1.members.ListMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.ListMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.ListMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MembersServiceMethodDescriptorSupplier("ListMembers"))
              .build();
        }
      }
    }
    return getListMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.DeleteMemberRequest,
      com.google.protobuf.Empty> getDeleteMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMember",
      requestType = com.scalekit.grpc.scalekit.v1.members.DeleteMemberRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.DeleteMemberRequest,
      com.google.protobuf.Empty> getDeleteMemberMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.DeleteMemberRequest, com.google.protobuf.Empty> getDeleteMemberMethod;
    if ((getDeleteMemberMethod = MembersServiceGrpc.getDeleteMemberMethod) == null) {
      synchronized (MembersServiceGrpc.class) {
        if ((getDeleteMemberMethod = MembersServiceGrpc.getDeleteMemberMethod) == null) {
          MembersServiceGrpc.getDeleteMemberMethod = getDeleteMemberMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.members.DeleteMemberRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.DeleteMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MembersServiceMethodDescriptorSupplier("DeleteMember"))
              .build();
        }
      }
    }
    return getDeleteMemberMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MembersServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MembersServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MembersServiceStub>() {
        @java.lang.Override
        public MembersServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MembersServiceStub(channel, callOptions);
        }
      };
    return MembersServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MembersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MembersServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MembersServiceBlockingStub>() {
        @java.lang.Override
        public MembersServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MembersServiceBlockingStub(channel, callOptions);
        }
      };
    return MembersServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MembersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MembersServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MembersServiceFutureStub>() {
        @java.lang.Override
        public MembersServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MembersServiceFutureStub(channel, callOptions);
        }
      };
    return MembersServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * For the first closed beta build, we are not exposing the ability to create members. So, most of the APIs will have
   * WORKSPACE auth scope. when we release the members UI, we need to update those APIs to WORKSPACE_SESSION scope.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void createMember(com.scalekit.grpc.scalekit.v1.members.CreateMemberRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMemberMethod(), responseObserver);
    }

    /**
     */
    default void updateCurrentMember(com.scalekit.grpc.scalekit.v1.members.UpdateCurrentMemberRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCurrentMemberMethod(), responseObserver);
    }

    /**
     */
    default void updateMember(com.scalekit.grpc.scalekit.v1.members.UpdateMemberRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMemberMethod(), responseObserver);
    }

    /**
     */
    default void getCurrentMember(com.scalekit.grpc.scalekit.v1.members.GetCurrentMemberRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.GetMemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentMemberMethod(), responseObserver);
    }

    /**
     */
    default void getMember(com.scalekit.grpc.scalekit.v1.members.GetMemberRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.GetMemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMemberMethod(), responseObserver);
    }

    /**
     */
    default void listMembers(com.scalekit.grpc.scalekit.v1.members.ListMemberRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.ListMemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMembersMethod(), responseObserver);
    }

    /**
     */
    default void deleteMember(com.scalekit.grpc.scalekit.v1.members.DeleteMemberRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMemberMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MembersService.
   * <pre>
   * For the first closed beta build, we are not exposing the ability to create members. So, most of the APIs will have
   * WORKSPACE auth scope. when we release the members UI, we need to update those APIs to WORKSPACE_SESSION scope.
   * </pre>
   */
  public static abstract class MembersServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MembersServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MembersService.
   * <pre>
   * For the first closed beta build, we are not exposing the ability to create members. So, most of the APIs will have
   * WORKSPACE auth scope. when we release the members UI, we need to update those APIs to WORKSPACE_SESSION scope.
   * </pre>
   */
  public static final class MembersServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MembersServiceStub> {
    private MembersServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MembersServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MembersServiceStub(channel, callOptions);
    }

    /**
     */
    public void createMember(com.scalekit.grpc.scalekit.v1.members.CreateMemberRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCurrentMember(com.scalekit.grpc.scalekit.v1.members.UpdateCurrentMemberRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCurrentMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMember(com.scalekit.grpc.scalekit.v1.members.UpdateMemberRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCurrentMember(com.scalekit.grpc.scalekit.v1.members.GetCurrentMemberRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.GetMemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMember(com.scalekit.grpc.scalekit.v1.members.GetMemberRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.GetMemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listMembers(com.scalekit.grpc.scalekit.v1.members.ListMemberRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.ListMemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMember(com.scalekit.grpc.scalekit.v1.members.DeleteMemberRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMemberMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MembersService.
   * <pre>
   * For the first closed beta build, we are not exposing the ability to create members. So, most of the APIs will have
   * WORKSPACE auth scope. when we release the members UI, we need to update those APIs to WORKSPACE_SESSION scope.
   * </pre>
   */
  public static final class MembersServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MembersServiceBlockingStub> {
    private MembersServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MembersServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MembersServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse createMember(com.scalekit.grpc.scalekit.v1.members.CreateMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse updateCurrentMember(com.scalekit.grpc.scalekit.v1.members.UpdateCurrentMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCurrentMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse updateMember(com.scalekit.grpc.scalekit.v1.members.UpdateMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.members.GetMemberResponse getCurrentMember(com.scalekit.grpc.scalekit.v1.members.GetCurrentMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.members.GetMemberResponse getMember(com.scalekit.grpc.scalekit.v1.members.GetMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.members.ListMemberResponse listMembers(com.scalekit.grpc.scalekit.v1.members.ListMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMembersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteMember(com.scalekit.grpc.scalekit.v1.members.DeleteMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMemberMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MembersService.
   * <pre>
   * For the first closed beta build, we are not exposing the ability to create members. So, most of the APIs will have
   * WORKSPACE auth scope. when we release the members UI, we need to update those APIs to WORKSPACE_SESSION scope.
   * </pre>
   */
  public static final class MembersServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MembersServiceFutureStub> {
    private MembersServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MembersServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MembersServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse> createMember(
        com.scalekit.grpc.scalekit.v1.members.CreateMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse> updateCurrentMember(
        com.scalekit.grpc.scalekit.v1.members.UpdateCurrentMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCurrentMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse> updateMember(
        com.scalekit.grpc.scalekit.v1.members.UpdateMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.members.GetMemberResponse> getCurrentMember(
        com.scalekit.grpc.scalekit.v1.members.GetCurrentMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.members.GetMemberResponse> getMember(
        com.scalekit.grpc.scalekit.v1.members.GetMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.members.ListMemberResponse> listMembers(
        com.scalekit.grpc.scalekit.v1.members.ListMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMembersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteMember(
        com.scalekit.grpc.scalekit.v1.members.DeleteMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMemberMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_MEMBER = 0;
  private static final int METHODID_UPDATE_CURRENT_MEMBER = 1;
  private static final int METHODID_UPDATE_MEMBER = 2;
  private static final int METHODID_GET_CURRENT_MEMBER = 3;
  private static final int METHODID_GET_MEMBER = 4;
  private static final int METHODID_LIST_MEMBERS = 5;
  private static final int METHODID_DELETE_MEMBER = 6;

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
        case METHODID_CREATE_MEMBER:
          serviceImpl.createMember((com.scalekit.grpc.scalekit.v1.members.CreateMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CURRENT_MEMBER:
          serviceImpl.updateCurrentMember((com.scalekit.grpc.scalekit.v1.members.UpdateCurrentMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MEMBER:
          serviceImpl.updateMember((com.scalekit.grpc.scalekit.v1.members.UpdateMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENT_MEMBER:
          serviceImpl.getCurrentMember((com.scalekit.grpc.scalekit.v1.members.GetCurrentMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.GetMemberResponse>) responseObserver);
          break;
        case METHODID_GET_MEMBER:
          serviceImpl.getMember((com.scalekit.grpc.scalekit.v1.members.GetMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.GetMemberResponse>) responseObserver);
          break;
        case METHODID_LIST_MEMBERS:
          serviceImpl.listMembers((com.scalekit.grpc.scalekit.v1.members.ListMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.ListMemberResponse>) responseObserver);
          break;
        case METHODID_DELETE_MEMBER:
          serviceImpl.deleteMember((com.scalekit.grpc.scalekit.v1.members.DeleteMemberRequest) request,
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
          getCreateMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.members.CreateMemberRequest,
              com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse>(
                service, METHODID_CREATE_MEMBER)))
        .addMethod(
          getUpdateCurrentMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.members.UpdateCurrentMemberRequest,
              com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse>(
                service, METHODID_UPDATE_CURRENT_MEMBER)))
        .addMethod(
          getUpdateMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.members.UpdateMemberRequest,
              com.scalekit.grpc.scalekit.v1.members.UpdateMemberResponse>(
                service, METHODID_UPDATE_MEMBER)))
        .addMethod(
          getGetCurrentMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.members.GetCurrentMemberRequest,
              com.scalekit.grpc.scalekit.v1.members.GetMemberResponse>(
                service, METHODID_GET_CURRENT_MEMBER)))
        .addMethod(
          getGetMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.members.GetMemberRequest,
              com.scalekit.grpc.scalekit.v1.members.GetMemberResponse>(
                service, METHODID_GET_MEMBER)))
        .addMethod(
          getListMembersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.members.ListMemberRequest,
              com.scalekit.grpc.scalekit.v1.members.ListMemberResponse>(
                service, METHODID_LIST_MEMBERS)))
        .addMethod(
          getDeleteMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.members.DeleteMemberRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_MEMBER)))
        .build();
  }

  private static abstract class MembersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MembersServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.members.MembersProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MembersService");
    }
  }

  private static final class MembersServiceFileDescriptorSupplier
      extends MembersServiceBaseDescriptorSupplier {
    MembersServiceFileDescriptorSupplier() {}
  }

  private static final class MembersServiceMethodDescriptorSupplier
      extends MembersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MembersServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MembersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MembersServiceFileDescriptorSupplier())
              .addMethod(getCreateMemberMethod())
              .addMethod(getUpdateCurrentMemberMethod())
              .addMethod(getUpdateMemberMethod())
              .addMethod(getGetCurrentMemberMethod())
              .addMethod(getGetMemberMethod())
              .addMethod(getListMembersMethod())
              .addMethod(getDeleteMemberMethod())
              .build();
        }
      }
    }
    return result;
  }
}
