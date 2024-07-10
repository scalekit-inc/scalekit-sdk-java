package com.scalekit.grpc.scalekit.v1.user_profile_attributes;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: scalekit/v1/user_profile_attributes/user_profile_attributes.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserProfileAttributeServiceGrpc {

  private UserProfileAttributeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.user_profile_attributes.UserProfileAttributeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeRequest,
      com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeResponse> getCreateUserProfileAttributeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUserProfileAttribute",
      requestType = com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeRequest,
      com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeResponse> getCreateUserProfileAttributeMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeRequest, com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeResponse> getCreateUserProfileAttributeMethod;
    if ((getCreateUserProfileAttributeMethod = UserProfileAttributeServiceGrpc.getCreateUserProfileAttributeMethod) == null) {
      synchronized (UserProfileAttributeServiceGrpc.class) {
        if ((getCreateUserProfileAttributeMethod = UserProfileAttributeServiceGrpc.getCreateUserProfileAttributeMethod) == null) {
          UserProfileAttributeServiceGrpc.getCreateUserProfileAttributeMethod = getCreateUserProfileAttributeMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeRequest, com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUserProfileAttribute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserProfileAttributeServiceMethodDescriptorSupplier("CreateUserProfileAttribute"))
              .build();
        }
      }
    }
    return getCreateUserProfileAttributeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.user_profile_attributes.ListUserProfileAttributesResponse> getListUserProfileAttributesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserProfileAttributes",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.scalekit.grpc.scalekit.v1.user_profile_attributes.ListUserProfileAttributesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.user_profile_attributes.ListUserProfileAttributesResponse> getListUserProfileAttributesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.user_profile_attributes.ListUserProfileAttributesResponse> getListUserProfileAttributesMethod;
    if ((getListUserProfileAttributesMethod = UserProfileAttributeServiceGrpc.getListUserProfileAttributesMethod) == null) {
      synchronized (UserProfileAttributeServiceGrpc.class) {
        if ((getListUserProfileAttributesMethod = UserProfileAttributeServiceGrpc.getListUserProfileAttributesMethod) == null) {
          UserProfileAttributeServiceGrpc.getListUserProfileAttributesMethod = getListUserProfileAttributesMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.user_profile_attributes.ListUserProfileAttributesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserProfileAttributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.user_profile_attributes.ListUserProfileAttributesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserProfileAttributeServiceMethodDescriptorSupplier("ListUserProfileAttributes"))
              .build();
        }
      }
    }
    return getListUserProfileAttributesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeRequest,
      com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse> getUpdateUserProfileAttributeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserProfileAttribute",
      requestType = com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeRequest,
      com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse> getUpdateUserProfileAttributeMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeRequest, com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse> getUpdateUserProfileAttributeMethod;
    if ((getUpdateUserProfileAttributeMethod = UserProfileAttributeServiceGrpc.getUpdateUserProfileAttributeMethod) == null) {
      synchronized (UserProfileAttributeServiceGrpc.class) {
        if ((getUpdateUserProfileAttributeMethod = UserProfileAttributeServiceGrpc.getUpdateUserProfileAttributeMethod) == null) {
          UserProfileAttributeServiceGrpc.getUpdateUserProfileAttributeMethod = getUpdateUserProfileAttributeMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeRequest, com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserProfileAttribute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserProfileAttributeServiceMethodDescriptorSupplier("UpdateUserProfileAttribute"))
              .build();
        }
      }
    }
    return getUpdateUserProfileAttributeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_profile_attributes.DeleteUserProfileAttributeRequest,
      com.google.protobuf.Empty> getDeleteUserProfileAttributeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUserProfileAttribute",
      requestType = com.scalekit.grpc.scalekit.v1.user_profile_attributes.DeleteUserProfileAttributeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_profile_attributes.DeleteUserProfileAttributeRequest,
      com.google.protobuf.Empty> getDeleteUserProfileAttributeMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_profile_attributes.DeleteUserProfileAttributeRequest, com.google.protobuf.Empty> getDeleteUserProfileAttributeMethod;
    if ((getDeleteUserProfileAttributeMethod = UserProfileAttributeServiceGrpc.getDeleteUserProfileAttributeMethod) == null) {
      synchronized (UserProfileAttributeServiceGrpc.class) {
        if ((getDeleteUserProfileAttributeMethod = UserProfileAttributeServiceGrpc.getDeleteUserProfileAttributeMethod) == null) {
          UserProfileAttributeServiceGrpc.getDeleteUserProfileAttributeMethod = getDeleteUserProfileAttributeMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.user_profile_attributes.DeleteUserProfileAttributeRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUserProfileAttribute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.user_profile_attributes.DeleteUserProfileAttributeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserProfileAttributeServiceMethodDescriptorSupplier("DeleteUserProfileAttribute"))
              .build();
        }
      }
    }
    return getDeleteUserProfileAttributeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserProfileAttributeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserProfileAttributeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserProfileAttributeServiceStub>() {
        @java.lang.Override
        public UserProfileAttributeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserProfileAttributeServiceStub(channel, callOptions);
        }
      };
    return UserProfileAttributeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserProfileAttributeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserProfileAttributeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserProfileAttributeServiceBlockingStub>() {
        @java.lang.Override
        public UserProfileAttributeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserProfileAttributeServiceBlockingStub(channel, callOptions);
        }
      };
    return UserProfileAttributeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserProfileAttributeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserProfileAttributeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserProfileAttributeServiceFutureStub>() {
        @java.lang.Override
        public UserProfileAttributeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserProfileAttributeServiceFutureStub(channel, callOptions);
        }
      };
    return UserProfileAttributeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createUserProfileAttribute(com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserProfileAttributeMethod(), responseObserver);
    }

    /**
     */
    default void listUserProfileAttributes(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_profile_attributes.ListUserProfileAttributesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUserProfileAttributesMethod(), responseObserver);
    }

    /**
     */
    default void updateUserProfileAttribute(com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserProfileAttributeMethod(), responseObserver);
    }

    /**
     */
    default void deleteUserProfileAttribute(com.scalekit.grpc.scalekit.v1.user_profile_attributes.DeleteUserProfileAttributeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserProfileAttributeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserProfileAttributeService.
   */
  public static abstract class UserProfileAttributeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserProfileAttributeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserProfileAttributeService.
   */
  public static final class UserProfileAttributeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserProfileAttributeServiceStub> {
    private UserProfileAttributeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserProfileAttributeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserProfileAttributeServiceStub(channel, callOptions);
    }

    /**
     */
    public void createUserProfileAttribute(com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserProfileAttributeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUserProfileAttributes(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_profile_attributes.ListUserProfileAttributesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUserProfileAttributesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUserProfileAttribute(com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserProfileAttributeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUserProfileAttribute(com.scalekit.grpc.scalekit.v1.user_profile_attributes.DeleteUserProfileAttributeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserProfileAttributeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserProfileAttributeService.
   */
  public static final class UserProfileAttributeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserProfileAttributeServiceBlockingStub> {
    private UserProfileAttributeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserProfileAttributeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserProfileAttributeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeResponse createUserProfileAttribute(com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserProfileAttributeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.user_profile_attributes.ListUserProfileAttributesResponse listUserProfileAttributes(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUserProfileAttributesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse updateUserProfileAttribute(com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserProfileAttributeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteUserProfileAttribute(com.scalekit.grpc.scalekit.v1.user_profile_attributes.DeleteUserProfileAttributeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserProfileAttributeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserProfileAttributeService.
   */
  public static final class UserProfileAttributeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserProfileAttributeServiceFutureStub> {
    private UserProfileAttributeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserProfileAttributeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserProfileAttributeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeResponse> createUserProfileAttribute(
        com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserProfileAttributeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.user_profile_attributes.ListUserProfileAttributesResponse> listUserProfileAttributes(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUserProfileAttributesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse> updateUserProfileAttribute(
        com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserProfileAttributeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteUserProfileAttribute(
        com.scalekit.grpc.scalekit.v1.user_profile_attributes.DeleteUserProfileAttributeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserProfileAttributeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER_PROFILE_ATTRIBUTE = 0;
  private static final int METHODID_LIST_USER_PROFILE_ATTRIBUTES = 1;
  private static final int METHODID_UPDATE_USER_PROFILE_ATTRIBUTE = 2;
  private static final int METHODID_DELETE_USER_PROFILE_ATTRIBUTE = 3;

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
        case METHODID_CREATE_USER_PROFILE_ATTRIBUTE:
          serviceImpl.createUserProfileAttribute((com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeResponse>) responseObserver);
          break;
        case METHODID_LIST_USER_PROFILE_ATTRIBUTES:
          serviceImpl.listUserProfileAttributes((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_profile_attributes.ListUserProfileAttributesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_PROFILE_ATTRIBUTE:
          serviceImpl.updateUserProfileAttribute((com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER_PROFILE_ATTRIBUTE:
          serviceImpl.deleteUserProfileAttribute((com.scalekit.grpc.scalekit.v1.user_profile_attributes.DeleteUserProfileAttributeRequest) request,
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
          getCreateUserProfileAttributeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeRequest,
              com.scalekit.grpc.scalekit.v1.user_profile_attributes.CreateUserProfileAttributeResponse>(
                service, METHODID_CREATE_USER_PROFILE_ATTRIBUTE)))
        .addMethod(
          getListUserProfileAttributesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.scalekit.grpc.scalekit.v1.user_profile_attributes.ListUserProfileAttributesResponse>(
                service, METHODID_LIST_USER_PROFILE_ATTRIBUTES)))
        .addMethod(
          getUpdateUserProfileAttributeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeRequest,
              com.scalekit.grpc.scalekit.v1.user_profile_attributes.UpdateUserProfileAttributeResponse>(
                service, METHODID_UPDATE_USER_PROFILE_ATTRIBUTE)))
        .addMethod(
          getDeleteUserProfileAttributeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.user_profile_attributes.DeleteUserProfileAttributeRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_USER_PROFILE_ATTRIBUTE)))
        .build();
  }

  private static abstract class UserProfileAttributeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserProfileAttributeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.user_profile_attributes.UserProfileAttributesProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserProfileAttributeService");
    }
  }

  private static final class UserProfileAttributeServiceFileDescriptorSupplier
      extends UserProfileAttributeServiceBaseDescriptorSupplier {
    UserProfileAttributeServiceFileDescriptorSupplier() {}
  }

  private static final class UserProfileAttributeServiceMethodDescriptorSupplier
      extends UserProfileAttributeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserProfileAttributeServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UserProfileAttributeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserProfileAttributeServiceFileDescriptorSupplier())
              .addMethod(getCreateUserProfileAttributeMethod())
              .addMethod(getListUserProfileAttributesMethod())
              .addMethod(getUpdateUserProfileAttributeMethod())
              .addMethod(getDeleteUserProfileAttributeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
