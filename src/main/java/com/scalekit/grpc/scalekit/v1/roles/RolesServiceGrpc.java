package com.scalekit.grpc.scalekit.v1.roles;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/roles/roles.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RolesServiceGrpc {

  private RolesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.roles.RolesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.CreateRoleRequest,
      com.scalekit.grpc.scalekit.v1.roles.CreateRoleResponse> getCreateRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRole",
      requestType = com.scalekit.grpc.scalekit.v1.roles.CreateRoleRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.roles.CreateRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.CreateRoleRequest,
      com.scalekit.grpc.scalekit.v1.roles.CreateRoleResponse> getCreateRoleMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.CreateRoleRequest, com.scalekit.grpc.scalekit.v1.roles.CreateRoleResponse> getCreateRoleMethod;
    if ((getCreateRoleMethod = RolesServiceGrpc.getCreateRoleMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getCreateRoleMethod = RolesServiceGrpc.getCreateRoleMethod) == null) {
          RolesServiceGrpc.getCreateRoleMethod = getCreateRoleMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.CreateRoleRequest, com.scalekit.grpc.scalekit.v1.roles.CreateRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.CreateRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.CreateRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("CreateRole"))
              .build();
        }
      }
    }
    return getCreateRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.UpdateRoleRequest,
      com.scalekit.grpc.scalekit.v1.roles.UpdateRoleResponse> getUpdateRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRole",
      requestType = com.scalekit.grpc.scalekit.v1.roles.UpdateRoleRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.roles.UpdateRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.UpdateRoleRequest,
      com.scalekit.grpc.scalekit.v1.roles.UpdateRoleResponse> getUpdateRoleMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.UpdateRoleRequest, com.scalekit.grpc.scalekit.v1.roles.UpdateRoleResponse> getUpdateRoleMethod;
    if ((getUpdateRoleMethod = RolesServiceGrpc.getUpdateRoleMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getUpdateRoleMethod = RolesServiceGrpc.getUpdateRoleMethod) == null) {
          RolesServiceGrpc.getUpdateRoleMethod = getUpdateRoleMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.UpdateRoleRequest, com.scalekit.grpc.scalekit.v1.roles.UpdateRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.UpdateRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.UpdateRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("UpdateRole"))
              .build();
        }
      }
    }
    return getUpdateRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.GetRoleRequest,
      com.scalekit.grpc.scalekit.v1.roles.GetRoleResponse> getGetRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRole",
      requestType = com.scalekit.grpc.scalekit.v1.roles.GetRoleRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.roles.GetRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.GetRoleRequest,
      com.scalekit.grpc.scalekit.v1.roles.GetRoleResponse> getGetRoleMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.GetRoleRequest, com.scalekit.grpc.scalekit.v1.roles.GetRoleResponse> getGetRoleMethod;
    if ((getGetRoleMethod = RolesServiceGrpc.getGetRoleMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getGetRoleMethod = RolesServiceGrpc.getGetRoleMethod) == null) {
          RolesServiceGrpc.getGetRoleMethod = getGetRoleMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.GetRoleRequest, com.scalekit.grpc.scalekit.v1.roles.GetRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.GetRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.GetRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("GetRole"))
              .build();
        }
      }
    }
    return getGetRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.ListRolesRequest,
      com.scalekit.grpc.scalekit.v1.roles.ListRolesResponse> getListRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRoles",
      requestType = com.scalekit.grpc.scalekit.v1.roles.ListRolesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.roles.ListRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.ListRolesRequest,
      com.scalekit.grpc.scalekit.v1.roles.ListRolesResponse> getListRolesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.ListRolesRequest, com.scalekit.grpc.scalekit.v1.roles.ListRolesResponse> getListRolesMethod;
    if ((getListRolesMethod = RolesServiceGrpc.getListRolesMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getListRolesMethod = RolesServiceGrpc.getListRolesMethod) == null) {
          RolesServiceGrpc.getListRolesMethod = getListRolesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.ListRolesRequest, com.scalekit.grpc.scalekit.v1.roles.ListRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.ListRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.ListRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("ListRoles"))
              .build();
        }
      }
    }
    return getListRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.DeleteRoleRequest,
      com.google.protobuf.Empty> getDeleteRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRole",
      requestType = com.scalekit.grpc.scalekit.v1.roles.DeleteRoleRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.DeleteRoleRequest,
      com.google.protobuf.Empty> getDeleteRoleMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.DeleteRoleRequest, com.google.protobuf.Empty> getDeleteRoleMethod;
    if ((getDeleteRoleMethod = RolesServiceGrpc.getDeleteRoleMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getDeleteRoleMethod = RolesServiceGrpc.getDeleteRoleMethod) == null) {
          RolesServiceGrpc.getDeleteRoleMethod = getDeleteRoleMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.DeleteRoleRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.DeleteRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("DeleteRole"))
              .build();
        }
      }
    }
    return getDeleteRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleRequest,
      com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleResponse> getCreateOrganizationRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrganizationRole",
      requestType = com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleRequest,
      com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleResponse> getCreateOrganizationRoleMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleRequest, com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleResponse> getCreateOrganizationRoleMethod;
    if ((getCreateOrganizationRoleMethod = RolesServiceGrpc.getCreateOrganizationRoleMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getCreateOrganizationRoleMethod = RolesServiceGrpc.getCreateOrganizationRoleMethod) == null) {
          RolesServiceGrpc.getCreateOrganizationRoleMethod = getCreateOrganizationRoleMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleRequest, com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrganizationRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("CreateOrganizationRole"))
              .build();
        }
      }
    }
    return getCreateOrganizationRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleRequest,
      com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleResponse> getUpdateOrganizationRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganizationRole",
      requestType = com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleRequest,
      com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleResponse> getUpdateOrganizationRoleMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleRequest, com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleResponse> getUpdateOrganizationRoleMethod;
    if ((getUpdateOrganizationRoleMethod = RolesServiceGrpc.getUpdateOrganizationRoleMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getUpdateOrganizationRoleMethod = RolesServiceGrpc.getUpdateOrganizationRoleMethod) == null) {
          RolesServiceGrpc.getUpdateOrganizationRoleMethod = getUpdateOrganizationRoleMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleRequest, com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganizationRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("UpdateOrganizationRole"))
              .build();
        }
      }
    }
    return getUpdateOrganizationRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleRequest,
      com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleResponse> getGetOrganizationRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizationRole",
      requestType = com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleRequest,
      com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleResponse> getGetOrganizationRoleMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleRequest, com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleResponse> getGetOrganizationRoleMethod;
    if ((getGetOrganizationRoleMethod = RolesServiceGrpc.getGetOrganizationRoleMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getGetOrganizationRoleMethod = RolesServiceGrpc.getGetOrganizationRoleMethod) == null) {
          RolesServiceGrpc.getGetOrganizationRoleMethod = getGetOrganizationRoleMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleRequest, com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganizationRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("GetOrganizationRole"))
              .build();
        }
      }
    }
    return getGetOrganizationRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesRequest,
      com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesResponse> getListOrganizationRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrganizationRoles",
      requestType = com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesRequest,
      com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesResponse> getListOrganizationRolesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesRequest, com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesResponse> getListOrganizationRolesMethod;
    if ((getListOrganizationRolesMethod = RolesServiceGrpc.getListOrganizationRolesMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getListOrganizationRolesMethod = RolesServiceGrpc.getListOrganizationRolesMethod) == null) {
          RolesServiceGrpc.getListOrganizationRolesMethod = getListOrganizationRolesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesRequest, com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrganizationRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("ListOrganizationRoles"))
              .build();
        }
      }
    }
    return getListOrganizationRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.DeleteOrganizationRoleRequest,
      com.google.protobuf.Empty> getDeleteOrganizationRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOrganizationRole",
      requestType = com.scalekit.grpc.scalekit.v1.roles.DeleteOrganizationRoleRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.DeleteOrganizationRoleRequest,
      com.google.protobuf.Empty> getDeleteOrganizationRoleMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.DeleteOrganizationRoleRequest, com.google.protobuf.Empty> getDeleteOrganizationRoleMethod;
    if ((getDeleteOrganizationRoleMethod = RolesServiceGrpc.getDeleteOrganizationRoleMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getDeleteOrganizationRoleMethod = RolesServiceGrpc.getDeleteOrganizationRoleMethod) == null) {
          RolesServiceGrpc.getDeleteOrganizationRoleMethod = getDeleteOrganizationRoleMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.DeleteOrganizationRoleRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOrganizationRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.DeleteOrganizationRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("DeleteOrganizationRole"))
              .build();
        }
      }
    }
    return getDeleteOrganizationRoleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RolesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RolesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RolesServiceStub>() {
        @java.lang.Override
        public RolesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RolesServiceStub(channel, callOptions);
        }
      };
    return RolesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RolesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RolesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RolesServiceBlockingStub>() {
        @java.lang.Override
        public RolesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RolesServiceBlockingStub(channel, callOptions);
        }
      };
    return RolesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RolesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RolesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RolesServiceFutureStub>() {
        @java.lang.Override
        public RolesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RolesServiceFutureStub(channel, callOptions);
        }
      };
    return RolesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createRole(com.scalekit.grpc.scalekit.v1.roles.CreateRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.CreateRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRoleMethod(), responseObserver);
    }

    /**
     */
    default void updateRole(com.scalekit.grpc.scalekit.v1.roles.UpdateRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.UpdateRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRoleMethod(), responseObserver);
    }

    /**
     */
    default void getRole(com.scalekit.grpc.scalekit.v1.roles.GetRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.GetRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRoleMethod(), responseObserver);
    }

    /**
     */
    default void listRoles(com.scalekit.grpc.scalekit.v1.roles.ListRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.ListRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRolesMethod(), responseObserver);
    }

    /**
     */
    default void deleteRole(com.scalekit.grpc.scalekit.v1.roles.DeleteRoleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRoleMethod(), responseObserver);
    }

    /**
     */
    default void createOrganizationRole(com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrganizationRoleMethod(), responseObserver);
    }

    /**
     */
    default void updateOrganizationRole(com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationRoleMethod(), responseObserver);
    }

    /**
     */
    default void getOrganizationRole(com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationRoleMethod(), responseObserver);
    }

    /**
     */
    default void listOrganizationRoles(com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrganizationRolesMethod(), responseObserver);
    }

    /**
     */
    default void deleteOrganizationRole(com.scalekit.grpc.scalekit.v1.roles.DeleteOrganizationRoleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOrganizationRoleMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RolesService.
   */
  public static abstract class RolesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RolesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RolesService.
   */
  public static final class RolesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RolesServiceStub> {
    private RolesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RolesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RolesServiceStub(channel, callOptions);
    }

    /**
     */
    public void createRole(com.scalekit.grpc.scalekit.v1.roles.CreateRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.CreateRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRole(com.scalekit.grpc.scalekit.v1.roles.UpdateRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.UpdateRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRole(com.scalekit.grpc.scalekit.v1.roles.GetRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.GetRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listRoles(com.scalekit.grpc.scalekit.v1.roles.ListRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.ListRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRole(com.scalekit.grpc.scalekit.v1.roles.DeleteRoleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createOrganizationRole(com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrganizationRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOrganizationRole(com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrganizationRole(com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOrganizationRoles(com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrganizationRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOrganizationRole(com.scalekit.grpc.scalekit.v1.roles.DeleteOrganizationRoleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOrganizationRoleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RolesService.
   */
  public static final class RolesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RolesServiceBlockingStub> {
    private RolesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RolesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RolesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.roles.CreateRoleResponse createRole(com.scalekit.grpc.scalekit.v1.roles.CreateRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.roles.UpdateRoleResponse updateRole(com.scalekit.grpc.scalekit.v1.roles.UpdateRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.roles.GetRoleResponse getRole(com.scalekit.grpc.scalekit.v1.roles.GetRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.roles.ListRolesResponse listRoles(com.scalekit.grpc.scalekit.v1.roles.ListRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteRole(com.scalekit.grpc.scalekit.v1.roles.DeleteRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleResponse createOrganizationRole(com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrganizationRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleResponse updateOrganizationRole(com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleResponse getOrganizationRole(com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesResponse listOrganizationRoles(com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrganizationRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteOrganizationRole(com.scalekit.grpc.scalekit.v1.roles.DeleteOrganizationRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOrganizationRoleMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RolesService.
   */
  public static final class RolesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RolesServiceFutureStub> {
    private RolesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RolesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RolesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.roles.CreateRoleResponse> createRole(
        com.scalekit.grpc.scalekit.v1.roles.CreateRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.roles.UpdateRoleResponse> updateRole(
        com.scalekit.grpc.scalekit.v1.roles.UpdateRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.roles.GetRoleResponse> getRole(
        com.scalekit.grpc.scalekit.v1.roles.GetRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.roles.ListRolesResponse> listRoles(
        com.scalekit.grpc.scalekit.v1.roles.ListRolesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteRole(
        com.scalekit.grpc.scalekit.v1.roles.DeleteRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleResponse> createOrganizationRole(
        com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrganizationRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleResponse> updateOrganizationRole(
        com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleResponse> getOrganizationRole(
        com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesResponse> listOrganizationRoles(
        com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrganizationRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteOrganizationRole(
        com.scalekit.grpc.scalekit.v1.roles.DeleteOrganizationRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOrganizationRoleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ROLE = 0;
  private static final int METHODID_UPDATE_ROLE = 1;
  private static final int METHODID_GET_ROLE = 2;
  private static final int METHODID_LIST_ROLES = 3;
  private static final int METHODID_DELETE_ROLE = 4;
  private static final int METHODID_CREATE_ORGANIZATION_ROLE = 5;
  private static final int METHODID_UPDATE_ORGANIZATION_ROLE = 6;
  private static final int METHODID_GET_ORGANIZATION_ROLE = 7;
  private static final int METHODID_LIST_ORGANIZATION_ROLES = 8;
  private static final int METHODID_DELETE_ORGANIZATION_ROLE = 9;

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
        case METHODID_CREATE_ROLE:
          serviceImpl.createRole((com.scalekit.grpc.scalekit.v1.roles.CreateRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.CreateRoleResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROLE:
          serviceImpl.updateRole((com.scalekit.grpc.scalekit.v1.roles.UpdateRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.UpdateRoleResponse>) responseObserver);
          break;
        case METHODID_GET_ROLE:
          serviceImpl.getRole((com.scalekit.grpc.scalekit.v1.roles.GetRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.GetRoleResponse>) responseObserver);
          break;
        case METHODID_LIST_ROLES:
          serviceImpl.listRoles((com.scalekit.grpc.scalekit.v1.roles.ListRolesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.ListRolesResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROLE:
          serviceImpl.deleteRole((com.scalekit.grpc.scalekit.v1.roles.DeleteRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_ORGANIZATION_ROLE:
          serviceImpl.createOrganizationRole((com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION_ROLE:
          serviceImpl.updateOrganizationRole((com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION_ROLE:
          serviceImpl.getOrganizationRole((com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleResponse>) responseObserver);
          break;
        case METHODID_LIST_ORGANIZATION_ROLES:
          serviceImpl.listOrganizationRoles((com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesResponse>) responseObserver);
          break;
        case METHODID_DELETE_ORGANIZATION_ROLE:
          serviceImpl.deleteOrganizationRole((com.scalekit.grpc.scalekit.v1.roles.DeleteOrganizationRoleRequest) request,
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
          getCreateRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.CreateRoleRequest,
              com.scalekit.grpc.scalekit.v1.roles.CreateRoleResponse>(
                service, METHODID_CREATE_ROLE)))
        .addMethod(
          getUpdateRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.UpdateRoleRequest,
              com.scalekit.grpc.scalekit.v1.roles.UpdateRoleResponse>(
                service, METHODID_UPDATE_ROLE)))
        .addMethod(
          getGetRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.GetRoleRequest,
              com.scalekit.grpc.scalekit.v1.roles.GetRoleResponse>(
                service, METHODID_GET_ROLE)))
        .addMethod(
          getListRolesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.ListRolesRequest,
              com.scalekit.grpc.scalekit.v1.roles.ListRolesResponse>(
                service, METHODID_LIST_ROLES)))
        .addMethod(
          getDeleteRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.DeleteRoleRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ROLE)))
        .addMethod(
          getCreateOrganizationRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleRequest,
              com.scalekit.grpc.scalekit.v1.roles.CreateOrganizationRoleResponse>(
                service, METHODID_CREATE_ORGANIZATION_ROLE)))
        .addMethod(
          getUpdateOrganizationRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleRequest,
              com.scalekit.grpc.scalekit.v1.roles.UpdateOrganizationRoleResponse>(
                service, METHODID_UPDATE_ORGANIZATION_ROLE)))
        .addMethod(
          getGetOrganizationRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleRequest,
              com.scalekit.grpc.scalekit.v1.roles.GetOrganizationRoleResponse>(
                service, METHODID_GET_ORGANIZATION_ROLE)))
        .addMethod(
          getListOrganizationRolesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesRequest,
              com.scalekit.grpc.scalekit.v1.roles.ListOrganizationRolesResponse>(
                service, METHODID_LIST_ORGANIZATION_ROLES)))
        .addMethod(
          getDeleteOrganizationRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.DeleteOrganizationRoleRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ORGANIZATION_ROLE)))
        .build();
  }

  private static abstract class RolesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RolesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.roles.RolesProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RolesService");
    }
  }

  private static final class RolesServiceFileDescriptorSupplier
      extends RolesServiceBaseDescriptorSupplier {
    RolesServiceFileDescriptorSupplier() {}
  }

  private static final class RolesServiceMethodDescriptorSupplier
      extends RolesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RolesServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RolesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RolesServiceFileDescriptorSupplier())
              .addMethod(getCreateRoleMethod())
              .addMethod(getUpdateRoleMethod())
              .addMethod(getGetRoleMethod())
              .addMethod(getListRolesMethod())
              .addMethod(getDeleteRoleMethod())
              .addMethod(getCreateOrganizationRoleMethod())
              .addMethod(getUpdateOrganizationRoleMethod())
              .addMethod(getGetOrganizationRoleMethod())
              .addMethod(getListOrganizationRolesMethod())
              .addMethod(getDeleteOrganizationRoleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
