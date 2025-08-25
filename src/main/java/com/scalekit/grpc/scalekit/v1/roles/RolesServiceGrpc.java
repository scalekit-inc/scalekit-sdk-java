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

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountRequest,
      com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountResponse> getGetRoleUsersCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoleUsersCount",
      requestType = com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountRequest,
      com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountResponse> getGetRoleUsersCountMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountRequest, com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountResponse> getGetRoleUsersCountMethod;
    if ((getGetRoleUsersCountMethod = RolesServiceGrpc.getGetRoleUsersCountMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getGetRoleUsersCountMethod = RolesServiceGrpc.getGetRoleUsersCountMethod) == null) {
          RolesServiceGrpc.getGetRoleUsersCountMethod = getGetRoleUsersCountMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountRequest, com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRoleUsersCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("GetRoleUsersCount"))
              .build();
        }
      }
    }
    return getGetRoleUsersCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesRequest,
      com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesResponse> getUpdateDefaultRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDefaultRoles",
      requestType = com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesRequest,
      com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesResponse> getUpdateDefaultRolesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesRequest, com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesResponse> getUpdateDefaultRolesMethod;
    if ((getUpdateDefaultRolesMethod = RolesServiceGrpc.getUpdateDefaultRolesMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getUpdateDefaultRolesMethod = RolesServiceGrpc.getUpdateDefaultRolesMethod) == null) {
          RolesServiceGrpc.getUpdateDefaultRolesMethod = getUpdateDefaultRolesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesRequest, com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDefaultRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("UpdateDefaultRoles"))
              .build();
        }
      }
    }
    return getUpdateDefaultRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesRequest,
      com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesResponse> getUpdateDefaultOrganizationRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDefaultOrganizationRoles",
      requestType = com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesRequest,
      com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesResponse> getUpdateDefaultOrganizationRolesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesRequest, com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesResponse> getUpdateDefaultOrganizationRolesMethod;
    if ((getUpdateDefaultOrganizationRolesMethod = RolesServiceGrpc.getUpdateDefaultOrganizationRolesMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getUpdateDefaultOrganizationRolesMethod = RolesServiceGrpc.getUpdateDefaultOrganizationRolesMethod) == null) {
          RolesServiceGrpc.getUpdateDefaultOrganizationRolesMethod = getUpdateDefaultOrganizationRolesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesRequest, com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDefaultOrganizationRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("UpdateDefaultOrganizationRoles"))
              .build();
        }
      }
    }
    return getUpdateDefaultOrganizationRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesRequest,
      com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesResponse> getListDependentRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDependentRoles",
      requestType = com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesRequest,
      com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesResponse> getListDependentRolesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesRequest, com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesResponse> getListDependentRolesMethod;
    if ((getListDependentRolesMethod = RolesServiceGrpc.getListDependentRolesMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getListDependentRolesMethod = RolesServiceGrpc.getListDependentRolesMethod) == null) {
          RolesServiceGrpc.getListDependentRolesMethod = getListDependentRolesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesRequest, com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDependentRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("ListDependentRoles"))
              .build();
        }
      }
    }
    return getListDependentRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.DeleteRoleBaseRequest,
      com.google.protobuf.Empty> getDeleteRoleBaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRoleBase",
      requestType = com.scalekit.grpc.scalekit.v1.roles.DeleteRoleBaseRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.DeleteRoleBaseRequest,
      com.google.protobuf.Empty> getDeleteRoleBaseMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.DeleteRoleBaseRequest, com.google.protobuf.Empty> getDeleteRoleBaseMethod;
    if ((getDeleteRoleBaseMethod = RolesServiceGrpc.getDeleteRoleBaseMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getDeleteRoleBaseMethod = RolesServiceGrpc.getDeleteRoleBaseMethod) == null) {
          RolesServiceGrpc.getDeleteRoleBaseMethod = getDeleteRoleBaseMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.DeleteRoleBaseRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRoleBase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.DeleteRoleBaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("DeleteRoleBase"))
              .build();
        }
      }
    }
    return getDeleteRoleBaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.CreatePermissionRequest,
      com.scalekit.grpc.scalekit.v1.roles.CreatePermissionResponse> getCreatePermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePermission",
      requestType = com.scalekit.grpc.scalekit.v1.roles.CreatePermissionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.roles.CreatePermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.CreatePermissionRequest,
      com.scalekit.grpc.scalekit.v1.roles.CreatePermissionResponse> getCreatePermissionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.CreatePermissionRequest, com.scalekit.grpc.scalekit.v1.roles.CreatePermissionResponse> getCreatePermissionMethod;
    if ((getCreatePermissionMethod = RolesServiceGrpc.getCreatePermissionMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getCreatePermissionMethod = RolesServiceGrpc.getCreatePermissionMethod) == null) {
          RolesServiceGrpc.getCreatePermissionMethod = getCreatePermissionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.CreatePermissionRequest, com.scalekit.grpc.scalekit.v1.roles.CreatePermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.CreatePermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.CreatePermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("CreatePermission"))
              .build();
        }
      }
    }
    return getCreatePermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.GetPermissionRequest,
      com.scalekit.grpc.scalekit.v1.roles.GetPermissionResponse> getGetPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPermission",
      requestType = com.scalekit.grpc.scalekit.v1.roles.GetPermissionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.roles.GetPermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.GetPermissionRequest,
      com.scalekit.grpc.scalekit.v1.roles.GetPermissionResponse> getGetPermissionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.GetPermissionRequest, com.scalekit.grpc.scalekit.v1.roles.GetPermissionResponse> getGetPermissionMethod;
    if ((getGetPermissionMethod = RolesServiceGrpc.getGetPermissionMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getGetPermissionMethod = RolesServiceGrpc.getGetPermissionMethod) == null) {
          RolesServiceGrpc.getGetPermissionMethod = getGetPermissionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.GetPermissionRequest, com.scalekit.grpc.scalekit.v1.roles.GetPermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.GetPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.GetPermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("GetPermission"))
              .build();
        }
      }
    }
    return getGetPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionRequest,
      com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionResponse> getUpdatePermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePermission",
      requestType = com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionRequest,
      com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionResponse> getUpdatePermissionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionRequest, com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionResponse> getUpdatePermissionMethod;
    if ((getUpdatePermissionMethod = RolesServiceGrpc.getUpdatePermissionMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getUpdatePermissionMethod = RolesServiceGrpc.getUpdatePermissionMethod) == null) {
          RolesServiceGrpc.getUpdatePermissionMethod = getUpdatePermissionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionRequest, com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("UpdatePermission"))
              .build();
        }
      }
    }
    return getUpdatePermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.ListPermissionsRequest,
      com.scalekit.grpc.scalekit.v1.roles.ListPermissionsResponse> getListPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPermissions",
      requestType = com.scalekit.grpc.scalekit.v1.roles.ListPermissionsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.roles.ListPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.ListPermissionsRequest,
      com.scalekit.grpc.scalekit.v1.roles.ListPermissionsResponse> getListPermissionsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.ListPermissionsRequest, com.scalekit.grpc.scalekit.v1.roles.ListPermissionsResponse> getListPermissionsMethod;
    if ((getListPermissionsMethod = RolesServiceGrpc.getListPermissionsMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getListPermissionsMethod = RolesServiceGrpc.getListPermissionsMethod) == null) {
          RolesServiceGrpc.getListPermissionsMethod = getListPermissionsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.ListPermissionsRequest, com.scalekit.grpc.scalekit.v1.roles.ListPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.ListPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.ListPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("ListPermissions"))
              .build();
        }
      }
    }
    return getListPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.DeletePermissionRequest,
      com.google.protobuf.Empty> getDeletePermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePermission",
      requestType = com.scalekit.grpc.scalekit.v1.roles.DeletePermissionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.DeletePermissionRequest,
      com.google.protobuf.Empty> getDeletePermissionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.DeletePermissionRequest, com.google.protobuf.Empty> getDeletePermissionMethod;
    if ((getDeletePermissionMethod = RolesServiceGrpc.getDeletePermissionMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getDeletePermissionMethod = RolesServiceGrpc.getDeletePermissionMethod) == null) {
          RolesServiceGrpc.getDeletePermissionMethod = getDeletePermissionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.DeletePermissionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.DeletePermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("DeletePermission"))
              .build();
        }
      }
    }
    return getDeletePermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsRequest,
      com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsResponse> getListRolePermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRolePermissions",
      requestType = com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsRequest,
      com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsResponse> getListRolePermissionsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsRequest, com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsResponse> getListRolePermissionsMethod;
    if ((getListRolePermissionsMethod = RolesServiceGrpc.getListRolePermissionsMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getListRolePermissionsMethod = RolesServiceGrpc.getListRolePermissionsMethod) == null) {
          RolesServiceGrpc.getListRolePermissionsMethod = getListRolePermissionsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsRequest, com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRolePermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("ListRolePermissions"))
              .build();
        }
      }
    }
    return getListRolePermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleRequest,
      com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleResponse> getAddPermissionsToRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPermissionsToRole",
      requestType = com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleRequest,
      com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleResponse> getAddPermissionsToRoleMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleRequest, com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleResponse> getAddPermissionsToRoleMethod;
    if ((getAddPermissionsToRoleMethod = RolesServiceGrpc.getAddPermissionsToRoleMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getAddPermissionsToRoleMethod = RolesServiceGrpc.getAddPermissionsToRoleMethod) == null) {
          RolesServiceGrpc.getAddPermissionsToRoleMethod = getAddPermissionsToRoleMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleRequest, com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPermissionsToRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("AddPermissionsToRole"))
              .build();
        }
      }
    }
    return getAddPermissionsToRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.RemovePermissionFromRoleRequest,
      com.google.protobuf.Empty> getRemovePermissionFromRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePermissionFromRole",
      requestType = com.scalekit.grpc.scalekit.v1.roles.RemovePermissionFromRoleRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.RemovePermissionFromRoleRequest,
      com.google.protobuf.Empty> getRemovePermissionFromRoleMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.RemovePermissionFromRoleRequest, com.google.protobuf.Empty> getRemovePermissionFromRoleMethod;
    if ((getRemovePermissionFromRoleMethod = RolesServiceGrpc.getRemovePermissionFromRoleMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getRemovePermissionFromRoleMethod = RolesServiceGrpc.getRemovePermissionFromRoleMethod) == null) {
          RolesServiceGrpc.getRemovePermissionFromRoleMethod = getRemovePermissionFromRoleMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.RemovePermissionFromRoleRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemovePermissionFromRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.RemovePermissionFromRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("RemovePermissionFromRole"))
              .build();
        }
      }
    }
    return getRemovePermissionFromRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsRequest,
      com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsResponse> getListEffectiveRolePermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEffectiveRolePermissions",
      requestType = com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsRequest,
      com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsResponse> getListEffectiveRolePermissionsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsRequest, com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsResponse> getListEffectiveRolePermissionsMethod;
    if ((getListEffectiveRolePermissionsMethod = RolesServiceGrpc.getListEffectiveRolePermissionsMethod) == null) {
      synchronized (RolesServiceGrpc.class) {
        if ((getListEffectiveRolePermissionsMethod = RolesServiceGrpc.getListEffectiveRolePermissionsMethod) == null) {
          RolesServiceGrpc.getListEffectiveRolePermissionsMethod = getListEffectiveRolePermissionsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsRequest, com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEffectiveRolePermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RolesServiceMethodDescriptorSupplier("ListEffectiveRolePermissions"))
              .build();
        }
      }
    }
    return getListEffectiveRolePermissionsMethod;
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

    /**
     */
    default void getRoleUsersCount(com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRoleUsersCountMethod(), responseObserver);
    }

    /**
     */
    default void updateDefaultRoles(com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDefaultRolesMethod(), responseObserver);
    }

    /**
     */
    default void updateDefaultOrganizationRoles(com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDefaultOrganizationRolesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Role Hierarchy Management RPCs
     * </pre>
     */
    default void listDependentRoles(com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDependentRolesMethod(), responseObserver);
    }

    /**
     */
    default void deleteRoleBase(com.scalekit.grpc.scalekit.v1.roles.DeleteRoleBaseRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRoleBaseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Permission Management RPCs
     * </pre>
     */
    default void createPermission(com.scalekit.grpc.scalekit.v1.roles.CreatePermissionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.CreatePermissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePermissionMethod(), responseObserver);
    }

    /**
     */
    default void getPermission(com.scalekit.grpc.scalekit.v1.roles.GetPermissionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.GetPermissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPermissionMethod(), responseObserver);
    }

    /**
     */
    default void updatePermission(com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePermissionMethod(), responseObserver);
    }

    /**
     */
    default void listPermissions(com.scalekit.grpc.scalekit.v1.roles.ListPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.ListPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPermissionsMethod(), responseObserver);
    }

    /**
     */
    default void deletePermission(com.scalekit.grpc.scalekit.v1.roles.DeletePermissionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Role-Permission Management RPCs
     * </pre>
     */
    default void listRolePermissions(com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRolePermissionsMethod(), responseObserver);
    }

    /**
     */
    default void addPermissionsToRole(com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPermissionsToRoleMethod(), responseObserver);
    }

    /**
     */
    default void removePermissionFromRole(com.scalekit.grpc.scalekit.v1.roles.RemovePermissionFromRoleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemovePermissionFromRoleMethod(), responseObserver);
    }

    /**
     */
    default void listEffectiveRolePermissions(com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEffectiveRolePermissionsMethod(), responseObserver);
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

    /**
     */
    public void getRoleUsersCount(com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRoleUsersCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDefaultRoles(com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDefaultRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDefaultOrganizationRoles(com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDefaultOrganizationRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Role Hierarchy Management RPCs
     * </pre>
     */
    public void listDependentRoles(com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDependentRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRoleBase(com.scalekit.grpc.scalekit.v1.roles.DeleteRoleBaseRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRoleBaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Permission Management RPCs
     * </pre>
     */
    public void createPermission(com.scalekit.grpc.scalekit.v1.roles.CreatePermissionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.CreatePermissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPermission(com.scalekit.grpc.scalekit.v1.roles.GetPermissionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.GetPermissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePermission(com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPermissions(com.scalekit.grpc.scalekit.v1.roles.ListPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.ListPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePermission(com.scalekit.grpc.scalekit.v1.roles.DeletePermissionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Role-Permission Management RPCs
     * </pre>
     */
    public void listRolePermissions(com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRolePermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPermissionsToRole(com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPermissionsToRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removePermissionFromRole(com.scalekit.grpc.scalekit.v1.roles.RemovePermissionFromRoleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemovePermissionFromRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listEffectiveRolePermissions(com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEffectiveRolePermissionsMethod(), getCallOptions()), request, responseObserver);
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

    /**
     */
    public com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountResponse getRoleUsersCount(com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRoleUsersCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesResponse updateDefaultRoles(com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDefaultRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesResponse updateDefaultOrganizationRoles(com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDefaultOrganizationRolesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Role Hierarchy Management RPCs
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesResponse listDependentRoles(com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDependentRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteRoleBase(com.scalekit.grpc.scalekit.v1.roles.DeleteRoleBaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRoleBaseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Permission Management RPCs
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.roles.CreatePermissionResponse createPermission(com.scalekit.grpc.scalekit.v1.roles.CreatePermissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePermissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.roles.GetPermissionResponse getPermission(com.scalekit.grpc.scalekit.v1.roles.GetPermissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPermissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionResponse updatePermission(com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePermissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.roles.ListPermissionsResponse listPermissions(com.scalekit.grpc.scalekit.v1.roles.ListPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPermissionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deletePermission(com.scalekit.grpc.scalekit.v1.roles.DeletePermissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Role-Permission Management RPCs
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsResponse listRolePermissions(com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRolePermissionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleResponse addPermissionsToRole(com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPermissionsToRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty removePermissionFromRole(com.scalekit.grpc.scalekit.v1.roles.RemovePermissionFromRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemovePermissionFromRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsResponse listEffectiveRolePermissions(com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEffectiveRolePermissionsMethod(), getCallOptions(), request);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountResponse> getRoleUsersCount(
        com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRoleUsersCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesResponse> updateDefaultRoles(
        com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDefaultRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesResponse> updateDefaultOrganizationRoles(
        com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDefaultOrganizationRolesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Role Hierarchy Management RPCs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesResponse> listDependentRoles(
        com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDependentRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteRoleBase(
        com.scalekit.grpc.scalekit.v1.roles.DeleteRoleBaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRoleBaseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Permission Management RPCs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.roles.CreatePermissionResponse> createPermission(
        com.scalekit.grpc.scalekit.v1.roles.CreatePermissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePermissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.roles.GetPermissionResponse> getPermission(
        com.scalekit.grpc.scalekit.v1.roles.GetPermissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPermissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionResponse> updatePermission(
        com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePermissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.roles.ListPermissionsResponse> listPermissions(
        com.scalekit.grpc.scalekit.v1.roles.ListPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPermissionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deletePermission(
        com.scalekit.grpc.scalekit.v1.roles.DeletePermissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Role-Permission Management RPCs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsResponse> listRolePermissions(
        com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRolePermissionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleResponse> addPermissionsToRole(
        com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPermissionsToRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> removePermissionFromRole(
        com.scalekit.grpc.scalekit.v1.roles.RemovePermissionFromRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemovePermissionFromRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsResponse> listEffectiveRolePermissions(
        com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEffectiveRolePermissionsMethod(), getCallOptions()), request);
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
  private static final int METHODID_GET_ROLE_USERS_COUNT = 10;
  private static final int METHODID_UPDATE_DEFAULT_ROLES = 11;
  private static final int METHODID_UPDATE_DEFAULT_ORGANIZATION_ROLES = 12;
  private static final int METHODID_LIST_DEPENDENT_ROLES = 13;
  private static final int METHODID_DELETE_ROLE_BASE = 14;
  private static final int METHODID_CREATE_PERMISSION = 15;
  private static final int METHODID_GET_PERMISSION = 16;
  private static final int METHODID_UPDATE_PERMISSION = 17;
  private static final int METHODID_LIST_PERMISSIONS = 18;
  private static final int METHODID_DELETE_PERMISSION = 19;
  private static final int METHODID_LIST_ROLE_PERMISSIONS = 20;
  private static final int METHODID_ADD_PERMISSIONS_TO_ROLE = 21;
  private static final int METHODID_REMOVE_PERMISSION_FROM_ROLE = 22;
  private static final int METHODID_LIST_EFFECTIVE_ROLE_PERMISSIONS = 23;

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
        case METHODID_GET_ROLE_USERS_COUNT:
          serviceImpl.getRoleUsersCount((com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DEFAULT_ROLES:
          serviceImpl.updateDefaultRoles((com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DEFAULT_ORGANIZATION_ROLES:
          serviceImpl.updateDefaultOrganizationRoles((com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesResponse>) responseObserver);
          break;
        case METHODID_LIST_DEPENDENT_ROLES:
          serviceImpl.listDependentRoles((com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROLE_BASE:
          serviceImpl.deleteRoleBase((com.scalekit.grpc.scalekit.v1.roles.DeleteRoleBaseRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_PERMISSION:
          serviceImpl.createPermission((com.scalekit.grpc.scalekit.v1.roles.CreatePermissionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.CreatePermissionResponse>) responseObserver);
          break;
        case METHODID_GET_PERMISSION:
          serviceImpl.getPermission((com.scalekit.grpc.scalekit.v1.roles.GetPermissionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.GetPermissionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PERMISSION:
          serviceImpl.updatePermission((com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionResponse>) responseObserver);
          break;
        case METHODID_LIST_PERMISSIONS:
          serviceImpl.listPermissions((com.scalekit.grpc.scalekit.v1.roles.ListPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.ListPermissionsResponse>) responseObserver);
          break;
        case METHODID_DELETE_PERMISSION:
          serviceImpl.deletePermission((com.scalekit.grpc.scalekit.v1.roles.DeletePermissionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_ROLE_PERMISSIONS:
          serviceImpl.listRolePermissions((com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsResponse>) responseObserver);
          break;
        case METHODID_ADD_PERMISSIONS_TO_ROLE:
          serviceImpl.addPermissionsToRole((com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleResponse>) responseObserver);
          break;
        case METHODID_REMOVE_PERMISSION_FROM_ROLE:
          serviceImpl.removePermissionFromRole((com.scalekit.grpc.scalekit.v1.roles.RemovePermissionFromRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_EFFECTIVE_ROLE_PERMISSIONS:
          serviceImpl.listEffectiveRolePermissions((com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsResponse>) responseObserver);
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
        .addMethod(
          getGetRoleUsersCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountRequest,
              com.scalekit.grpc.scalekit.v1.roles.GetRoleUsersCountResponse>(
                service, METHODID_GET_ROLE_USERS_COUNT)))
        .addMethod(
          getUpdateDefaultRolesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesRequest,
              com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultRolesResponse>(
                service, METHODID_UPDATE_DEFAULT_ROLES)))
        .addMethod(
          getUpdateDefaultOrganizationRolesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesRequest,
              com.scalekit.grpc.scalekit.v1.roles.UpdateDefaultOrganizationRolesResponse>(
                service, METHODID_UPDATE_DEFAULT_ORGANIZATION_ROLES)))
        .addMethod(
          getListDependentRolesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesRequest,
              com.scalekit.grpc.scalekit.v1.roles.ListDependentRolesResponse>(
                service, METHODID_LIST_DEPENDENT_ROLES)))
        .addMethod(
          getDeleteRoleBaseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.DeleteRoleBaseRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ROLE_BASE)))
        .addMethod(
          getCreatePermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.CreatePermissionRequest,
              com.scalekit.grpc.scalekit.v1.roles.CreatePermissionResponse>(
                service, METHODID_CREATE_PERMISSION)))
        .addMethod(
          getGetPermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.GetPermissionRequest,
              com.scalekit.grpc.scalekit.v1.roles.GetPermissionResponse>(
                service, METHODID_GET_PERMISSION)))
        .addMethod(
          getUpdatePermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionRequest,
              com.scalekit.grpc.scalekit.v1.roles.UpdatePermissionResponse>(
                service, METHODID_UPDATE_PERMISSION)))
        .addMethod(
          getListPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.ListPermissionsRequest,
              com.scalekit.grpc.scalekit.v1.roles.ListPermissionsResponse>(
                service, METHODID_LIST_PERMISSIONS)))
        .addMethod(
          getDeletePermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.DeletePermissionRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_PERMISSION)))
        .addMethod(
          getListRolePermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsRequest,
              com.scalekit.grpc.scalekit.v1.roles.ListRolePermissionsResponse>(
                service, METHODID_LIST_ROLE_PERMISSIONS)))
        .addMethod(
          getAddPermissionsToRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleRequest,
              com.scalekit.grpc.scalekit.v1.roles.AddPermissionsToRoleResponse>(
                service, METHODID_ADD_PERMISSIONS_TO_ROLE)))
        .addMethod(
          getRemovePermissionFromRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.RemovePermissionFromRoleRequest,
              com.google.protobuf.Empty>(
                service, METHODID_REMOVE_PERMISSION_FROM_ROLE)))
        .addMethod(
          getListEffectiveRolePermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsRequest,
              com.scalekit.grpc.scalekit.v1.roles.ListEffectiveRolePermissionsResponse>(
                service, METHODID_LIST_EFFECTIVE_ROLE_PERMISSIONS)))
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
              .addMethod(getGetRoleUsersCountMethod())
              .addMethod(getUpdateDefaultRolesMethod())
              .addMethod(getUpdateDefaultOrganizationRolesMethod())
              .addMethod(getListDependentRolesMethod())
              .addMethod(getDeleteRoleBaseMethod())
              .addMethod(getCreatePermissionMethod())
              .addMethod(getGetPermissionMethod())
              .addMethod(getUpdatePermissionMethod())
              .addMethod(getListPermissionsMethod())
              .addMethod(getDeletePermissionMethod())
              .addMethod(getListRolePermissionsMethod())
              .addMethod(getAddPermissionsToRoleMethod())
              .addMethod(getRemovePermissionFromRoleMethod())
              .addMethod(getListEffectiveRolePermissionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
