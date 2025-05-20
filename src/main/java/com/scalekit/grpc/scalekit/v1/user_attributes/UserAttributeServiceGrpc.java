package com.scalekit.grpc.scalekit.v1.user_attributes;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/user_attributes/user_attributes.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserAttributeServiceGrpc {

  private UserAttributeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.user_attributes.UserAttributeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest,
      com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse> getCreateSsoUserAttributeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSsoUserAttribute",
      requestType = com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest,
      com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse> getCreateSsoUserAttributeMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest, com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse> getCreateSsoUserAttributeMethod;
    if ((getCreateSsoUserAttributeMethod = UserAttributeServiceGrpc.getCreateSsoUserAttributeMethod) == null) {
      synchronized (UserAttributeServiceGrpc.class) {
        if ((getCreateSsoUserAttributeMethod = UserAttributeServiceGrpc.getCreateSsoUserAttributeMethod) == null) {
          UserAttributeServiceGrpc.getCreateSsoUserAttributeMethod = getCreateSsoUserAttributeMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest, com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSsoUserAttribute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAttributeServiceMethodDescriptorSupplier("CreateSsoUserAttribute"))
              .build();
        }
      }
    }
    return getCreateSsoUserAttributeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse> getListSsoUserAttributesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSsoUserAttributes",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse> getListSsoUserAttributesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse> getListSsoUserAttributesMethod;
    if ((getListSsoUserAttributesMethod = UserAttributeServiceGrpc.getListSsoUserAttributesMethod) == null) {
      synchronized (UserAttributeServiceGrpc.class) {
        if ((getListSsoUserAttributesMethod = UserAttributeServiceGrpc.getListSsoUserAttributesMethod) == null) {
          UserAttributeServiceGrpc.getListSsoUserAttributesMethod = getListSsoUserAttributesMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSsoUserAttributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAttributeServiceMethodDescriptorSupplier("ListSsoUserAttributes"))
              .build();
        }
      }
    }
    return getListSsoUserAttributesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest,
      com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse> getUpdateSsoUserAttributeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSsoUserAttribute",
      requestType = com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest,
      com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse> getUpdateSsoUserAttributeMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest, com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse> getUpdateSsoUserAttributeMethod;
    if ((getUpdateSsoUserAttributeMethod = UserAttributeServiceGrpc.getUpdateSsoUserAttributeMethod) == null) {
      synchronized (UserAttributeServiceGrpc.class) {
        if ((getUpdateSsoUserAttributeMethod = UserAttributeServiceGrpc.getUpdateSsoUserAttributeMethod) == null) {
          UserAttributeServiceGrpc.getUpdateSsoUserAttributeMethod = getUpdateSsoUserAttributeMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest, com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSsoUserAttribute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAttributeServiceMethodDescriptorSupplier("UpdateSsoUserAttribute"))
              .build();
        }
      }
    }
    return getUpdateSsoUserAttributeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest,
      com.google.protobuf.Empty> getDeleteSsoUserAttributeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSsoUserAttribute",
      requestType = com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest,
      com.google.protobuf.Empty> getDeleteSsoUserAttributeMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest, com.google.protobuf.Empty> getDeleteSsoUserAttributeMethod;
    if ((getDeleteSsoUserAttributeMethod = UserAttributeServiceGrpc.getDeleteSsoUserAttributeMethod) == null) {
      synchronized (UserAttributeServiceGrpc.class) {
        if ((getDeleteSsoUserAttributeMethod = UserAttributeServiceGrpc.getDeleteSsoUserAttributeMethod) == null) {
          UserAttributeServiceGrpc.getDeleteSsoUserAttributeMethod = getDeleteSsoUserAttributeMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSsoUserAttribute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserAttributeServiceMethodDescriptorSupplier("DeleteSsoUserAttribute"))
              .build();
        }
      }
    }
    return getDeleteSsoUserAttributeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest,
      com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse> getCreateDirectoryUserAttributeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDirectoryUserAttribute",
      requestType = com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest,
      com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse> getCreateDirectoryUserAttributeMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest, com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse> getCreateDirectoryUserAttributeMethod;
    if ((getCreateDirectoryUserAttributeMethod = UserAttributeServiceGrpc.getCreateDirectoryUserAttributeMethod) == null) {
      synchronized (UserAttributeServiceGrpc.class) {
        if ((getCreateDirectoryUserAttributeMethod = UserAttributeServiceGrpc.getCreateDirectoryUserAttributeMethod) == null) {
          UserAttributeServiceGrpc.getCreateDirectoryUserAttributeMethod = getCreateDirectoryUserAttributeMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest, com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDirectoryUserAttribute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAttributeServiceMethodDescriptorSupplier("CreateDirectoryUserAttribute"))
              .build();
        }
      }
    }
    return getCreateDirectoryUserAttributeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse> getListDirectoryUserAttributesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDirectoryUserAttributes",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse> getListDirectoryUserAttributesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse> getListDirectoryUserAttributesMethod;
    if ((getListDirectoryUserAttributesMethod = UserAttributeServiceGrpc.getListDirectoryUserAttributesMethod) == null) {
      synchronized (UserAttributeServiceGrpc.class) {
        if ((getListDirectoryUserAttributesMethod = UserAttributeServiceGrpc.getListDirectoryUserAttributesMethod) == null) {
          UserAttributeServiceGrpc.getListDirectoryUserAttributesMethod = getListDirectoryUserAttributesMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDirectoryUserAttributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAttributeServiceMethodDescriptorSupplier("ListDirectoryUserAttributes"))
              .build();
        }
      }
    }
    return getListDirectoryUserAttributesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest,
      com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse> getUpdateDirectoryUserAttributeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDirectoryUserAttribute",
      requestType = com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest,
      com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse> getUpdateDirectoryUserAttributeMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest, com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse> getUpdateDirectoryUserAttributeMethod;
    if ((getUpdateDirectoryUserAttributeMethod = UserAttributeServiceGrpc.getUpdateDirectoryUserAttributeMethod) == null) {
      synchronized (UserAttributeServiceGrpc.class) {
        if ((getUpdateDirectoryUserAttributeMethod = UserAttributeServiceGrpc.getUpdateDirectoryUserAttributeMethod) == null) {
          UserAttributeServiceGrpc.getUpdateDirectoryUserAttributeMethod = getUpdateDirectoryUserAttributeMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest, com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDirectoryUserAttribute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAttributeServiceMethodDescriptorSupplier("UpdateDirectoryUserAttribute"))
              .build();
        }
      }
    }
    return getUpdateDirectoryUserAttributeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest,
      com.google.protobuf.Empty> getDeleteDirectoryUserAttributeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDirectoryUserAttribute",
      requestType = com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest,
      com.google.protobuf.Empty> getDeleteDirectoryUserAttributeMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest, com.google.protobuf.Empty> getDeleteDirectoryUserAttributeMethod;
    if ((getDeleteDirectoryUserAttributeMethod = UserAttributeServiceGrpc.getDeleteDirectoryUserAttributeMethod) == null) {
      synchronized (UserAttributeServiceGrpc.class) {
        if ((getDeleteDirectoryUserAttributeMethod = UserAttributeServiceGrpc.getDeleteDirectoryUserAttributeMethod) == null) {
          UserAttributeServiceGrpc.getDeleteDirectoryUserAttributeMethod = getDeleteDirectoryUserAttributeMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDirectoryUserAttribute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserAttributeServiceMethodDescriptorSupplier("DeleteDirectoryUserAttribute"))
              .build();
        }
      }
    }
    return getDeleteDirectoryUserAttributeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserAttributeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAttributeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAttributeServiceStub>() {
        @java.lang.Override
        public UserAttributeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAttributeServiceStub(channel, callOptions);
        }
      };
    return UserAttributeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserAttributeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAttributeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAttributeServiceBlockingStub>() {
        @java.lang.Override
        public UserAttributeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAttributeServiceBlockingStub(channel, callOptions);
        }
      };
    return UserAttributeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserAttributeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAttributeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAttributeServiceFutureStub>() {
        @java.lang.Override
        public UserAttributeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAttributeServiceFutureStub(channel, callOptions);
        }
      };
    return UserAttributeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createSsoUserAttribute(com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSsoUserAttributeMethod(), responseObserver);
    }

    /**
     */
    default void listSsoUserAttributes(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSsoUserAttributesMethod(), responseObserver);
    }

    /**
     */
    default void updateSsoUserAttribute(com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSsoUserAttributeMethod(), responseObserver);
    }

    /**
     */
    default void deleteSsoUserAttribute(com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSsoUserAttributeMethod(), responseObserver);
    }

    /**
     */
    default void createDirectoryUserAttribute(com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDirectoryUserAttributeMethod(), responseObserver);
    }

    /**
     */
    default void listDirectoryUserAttributes(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDirectoryUserAttributesMethod(), responseObserver);
    }

    /**
     */
    default void updateDirectoryUserAttribute(com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDirectoryUserAttributeMethod(), responseObserver);
    }

    /**
     */
    default void deleteDirectoryUserAttribute(com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDirectoryUserAttributeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserAttributeService.
   */
  public static abstract class UserAttributeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserAttributeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserAttributeService.
   */
  public static final class UserAttributeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserAttributeServiceStub> {
    private UserAttributeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAttributeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAttributeServiceStub(channel, callOptions);
    }

    /**
     */
    public void createSsoUserAttribute(com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSsoUserAttributeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSsoUserAttributes(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSsoUserAttributesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSsoUserAttribute(com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSsoUserAttributeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSsoUserAttribute(com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSsoUserAttributeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createDirectoryUserAttribute(com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDirectoryUserAttributeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDirectoryUserAttributes(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDirectoryUserAttributesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDirectoryUserAttribute(com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDirectoryUserAttributeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDirectoryUserAttribute(com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDirectoryUserAttributeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserAttributeService.
   */
  public static final class UserAttributeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserAttributeServiceBlockingStub> {
    private UserAttributeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAttributeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAttributeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse createSsoUserAttribute(com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSsoUserAttributeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse listSsoUserAttributes(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSsoUserAttributesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse updateSsoUserAttribute(com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSsoUserAttributeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteSsoUserAttribute(com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSsoUserAttributeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse createDirectoryUserAttribute(com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDirectoryUserAttributeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse listDirectoryUserAttributes(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDirectoryUserAttributesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse updateDirectoryUserAttribute(com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDirectoryUserAttributeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteDirectoryUserAttribute(com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDirectoryUserAttributeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserAttributeService.
   */
  public static final class UserAttributeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserAttributeServiceFutureStub> {
    private UserAttributeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAttributeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAttributeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse> createSsoUserAttribute(
        com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSsoUserAttributeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse> listSsoUserAttributes(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSsoUserAttributesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse> updateSsoUserAttribute(
        com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSsoUserAttributeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSsoUserAttribute(
        com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSsoUserAttributeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse> createDirectoryUserAttribute(
        com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDirectoryUserAttributeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse> listDirectoryUserAttributes(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDirectoryUserAttributesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse> updateDirectoryUserAttribute(
        com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDirectoryUserAttributeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDirectoryUserAttribute(
        com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDirectoryUserAttributeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SSO_USER_ATTRIBUTE = 0;
  private static final int METHODID_LIST_SSO_USER_ATTRIBUTES = 1;
  private static final int METHODID_UPDATE_SSO_USER_ATTRIBUTE = 2;
  private static final int METHODID_DELETE_SSO_USER_ATTRIBUTE = 3;
  private static final int METHODID_CREATE_DIRECTORY_USER_ATTRIBUTE = 4;
  private static final int METHODID_LIST_DIRECTORY_USER_ATTRIBUTES = 5;
  private static final int METHODID_UPDATE_DIRECTORY_USER_ATTRIBUTE = 6;
  private static final int METHODID_DELETE_DIRECTORY_USER_ATTRIBUTE = 7;

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
        case METHODID_CREATE_SSO_USER_ATTRIBUTE:
          serviceImpl.createSsoUserAttribute((com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse>) responseObserver);
          break;
        case METHODID_LIST_SSO_USER_ATTRIBUTES:
          serviceImpl.listSsoUserAttributes((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SSO_USER_ATTRIBUTE:
          serviceImpl.updateSsoUserAttribute((com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse>) responseObserver);
          break;
        case METHODID_DELETE_SSO_USER_ATTRIBUTE:
          serviceImpl.deleteSsoUserAttribute((com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_DIRECTORY_USER_ATTRIBUTE:
          serviceImpl.createDirectoryUserAttribute((com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse>) responseObserver);
          break;
        case METHODID_LIST_DIRECTORY_USER_ATTRIBUTES:
          serviceImpl.listDirectoryUserAttributes((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DIRECTORY_USER_ATTRIBUTE:
          serviceImpl.updateDirectoryUserAttribute((com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse>) responseObserver);
          break;
        case METHODID_DELETE_DIRECTORY_USER_ATTRIBUTE:
          serviceImpl.deleteDirectoryUserAttribute((com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest) request,
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
          getCreateSsoUserAttributeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest,
              com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse>(
                service, METHODID_CREATE_SSO_USER_ATTRIBUTE)))
        .addMethod(
          getListSsoUserAttributesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse>(
                service, METHODID_LIST_SSO_USER_ATTRIBUTES)))
        .addMethod(
          getUpdateSsoUserAttributeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest,
              com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse>(
                service, METHODID_UPDATE_SSO_USER_ATTRIBUTE)))
        .addMethod(
          getDeleteSsoUserAttributeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_SSO_USER_ATTRIBUTE)))
        .addMethod(
          getCreateDirectoryUserAttributeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeRequest,
              com.scalekit.grpc.scalekit.v1.user_attributes.CreateUserAttributeResponse>(
                service, METHODID_CREATE_DIRECTORY_USER_ATTRIBUTE)))
        .addMethod(
          getListDirectoryUserAttributesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.scalekit.grpc.scalekit.v1.user_attributes.ListUserAttributesResponse>(
                service, METHODID_LIST_DIRECTORY_USER_ATTRIBUTES)))
        .addMethod(
          getUpdateDirectoryUserAttributeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeRequest,
              com.scalekit.grpc.scalekit.v1.user_attributes.UpdateUserAttributeResponse>(
                service, METHODID_UPDATE_DIRECTORY_USER_ATTRIBUTE)))
        .addMethod(
          getDeleteDirectoryUserAttributeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.user_attributes.DeleteUserAttributeRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_DIRECTORY_USER_ATTRIBUTE)))
        .build();
  }

  private static abstract class UserAttributeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserAttributeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.user_attributes.UserAttributesProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserAttributeService");
    }
  }

  private static final class UserAttributeServiceFileDescriptorSupplier
      extends UserAttributeServiceBaseDescriptorSupplier {
    UserAttributeServiceFileDescriptorSupplier() {}
  }

  private static final class UserAttributeServiceMethodDescriptorSupplier
      extends UserAttributeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserAttributeServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UserAttributeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserAttributeServiceFileDescriptorSupplier())
              .addMethod(getCreateSsoUserAttributeMethod())
              .addMethod(getListSsoUserAttributesMethod())
              .addMethod(getUpdateSsoUserAttributeMethod())
              .addMethod(getDeleteSsoUserAttributeMethod())
              .addMethod(getCreateDirectoryUserAttributeMethod())
              .addMethod(getListDirectoryUserAttributesMethod())
              .addMethod(getUpdateDirectoryUserAttributeMethod())
              .addMethod(getDeleteDirectoryUserAttributeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
