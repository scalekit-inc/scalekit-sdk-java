package com.scalekit.grpc.scalekit.v1.members;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * For the first closed beta build, we are not exposing the ability to create members. So, most of the APIs will have
 * WORKSPACE auth scope. when we release the members UI, we need to update those APIs to WORKSPACE scope.
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

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.InviteMemberRequest,
      com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse> getInviteMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InviteMember",
      requestType = com.scalekit.grpc.scalekit.v1.members.InviteMemberRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.InviteMemberRequest,
      com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse> getInviteMemberMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.InviteMemberRequest, com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse> getInviteMemberMethod;
    if ((getInviteMemberMethod = MembersServiceGrpc.getInviteMemberMethod) == null) {
      synchronized (MembersServiceGrpc.class) {
        if ((getInviteMemberMethod = MembersServiceGrpc.getInviteMemberMethod) == null) {
          MembersServiceGrpc.getInviteMemberMethod = getInviteMemberMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.members.InviteMemberRequest, com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InviteMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.InviteMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MembersServiceMethodDescriptorSupplier("InviteMember"))
              .build();
        }
      }
    }
    return getInviteMemberMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleRequest,
      com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleResponse> getAssignDashboardRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignDashboardRole",
      requestType = com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleRequest,
      com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleResponse> getAssignDashboardRoleMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleRequest, com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleResponse> getAssignDashboardRoleMethod;
    if ((getAssignDashboardRoleMethod = MembersServiceGrpc.getAssignDashboardRoleMethod) == null) {
      synchronized (MembersServiceGrpc.class) {
        if ((getAssignDashboardRoleMethod = MembersServiceGrpc.getAssignDashboardRoleMethod) == null) {
          MembersServiceGrpc.getAssignDashboardRoleMethod = getAssignDashboardRoleMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleRequest, com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignDashboardRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MembersServiceMethodDescriptorSupplier("AssignDashboardRole"))
              .build();
        }
      }
    }
    return getAssignDashboardRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleRequest,
      com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleResponse> getSetDashboardEnvironmentRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDashboardEnvironmentRole",
      requestType = com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleRequest,
      com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleResponse> getSetDashboardEnvironmentRoleMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleRequest, com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleResponse> getSetDashboardEnvironmentRoleMethod;
    if ((getSetDashboardEnvironmentRoleMethod = MembersServiceGrpc.getSetDashboardEnvironmentRoleMethod) == null) {
      synchronized (MembersServiceGrpc.class) {
        if ((getSetDashboardEnvironmentRoleMethod = MembersServiceGrpc.getSetDashboardEnvironmentRoleMethod) == null) {
          MembersServiceGrpc.getSetDashboardEnvironmentRoleMethod = getSetDashboardEnvironmentRoleMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleRequest, com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetDashboardEnvironmentRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MembersServiceMethodDescriptorSupplier("SetDashboardEnvironmentRole"))
              .build();
        }
      }
    }
    return getSetDashboardEnvironmentRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleRequest,
      com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleResponse> getClearDashboardEnvironmentRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearDashboardEnvironmentRole",
      requestType = com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleRequest,
      com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleResponse> getClearDashboardEnvironmentRoleMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleRequest, com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleResponse> getClearDashboardEnvironmentRoleMethod;
    if ((getClearDashboardEnvironmentRoleMethod = MembersServiceGrpc.getClearDashboardEnvironmentRoleMethod) == null) {
      synchronized (MembersServiceGrpc.class) {
        if ((getClearDashboardEnvironmentRoleMethod = MembersServiceGrpc.getClearDashboardEnvironmentRoleMethod) == null) {
          MembersServiceGrpc.getClearDashboardEnvironmentRoleMethod = getClearDashboardEnvironmentRoleMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleRequest, com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClearDashboardEnvironmentRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MembersServiceMethodDescriptorSupplier("ClearDashboardEnvironmentRole"))
              .build();
        }
      }
    }
    return getClearDashboardEnvironmentRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesRequest,
      com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesResponse> getListDashboardMemberEnvironmentRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDashboardMemberEnvironmentRoles",
      requestType = com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesRequest,
      com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesResponse> getListDashboardMemberEnvironmentRolesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesRequest, com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesResponse> getListDashboardMemberEnvironmentRolesMethod;
    if ((getListDashboardMemberEnvironmentRolesMethod = MembersServiceGrpc.getListDashboardMemberEnvironmentRolesMethod) == null) {
      synchronized (MembersServiceGrpc.class) {
        if ((getListDashboardMemberEnvironmentRolesMethod = MembersServiceGrpc.getListDashboardMemberEnvironmentRolesMethod) == null) {
          MembersServiceGrpc.getListDashboardMemberEnvironmentRolesMethod = getListDashboardMemberEnvironmentRolesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesRequest, com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDashboardMemberEnvironmentRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MembersServiceMethodDescriptorSupplier("ListDashboardMemberEnvironmentRoles"))
              .build();
        }
      }
    }
    return getListDashboardMemberEnvironmentRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesRequest,
      com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesResponse> getListDashboardRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDashboardRoles",
      requestType = com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesRequest,
      com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesResponse> getListDashboardRolesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesRequest, com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesResponse> getListDashboardRolesMethod;
    if ((getListDashboardRolesMethod = MembersServiceGrpc.getListDashboardRolesMethod) == null) {
      synchronized (MembersServiceGrpc.class) {
        if ((getListDashboardRolesMethod = MembersServiceGrpc.getListDashboardRolesMethod) == null) {
          MembersServiceGrpc.getListDashboardRolesMethod = getListDashboardRolesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesRequest, com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDashboardRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MembersServiceMethodDescriptorSupplier("ListDashboardRoles"))
              .build();
        }
      }
    }
    return getListDashboardRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsRequest,
      com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsResponse> getListDashboardPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDashboardPermissions",
      requestType = com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsRequest,
      com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsResponse> getListDashboardPermissionsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsRequest, com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsResponse> getListDashboardPermissionsMethod;
    if ((getListDashboardPermissionsMethod = MembersServiceGrpc.getListDashboardPermissionsMethod) == null) {
      synchronized (MembersServiceGrpc.class) {
        if ((getListDashboardPermissionsMethod = MembersServiceGrpc.getListDashboardPermissionsMethod) == null) {
          MembersServiceGrpc.getListDashboardPermissionsMethod = getListDashboardPermissionsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsRequest, com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDashboardPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MembersServiceMethodDescriptorSupplier("ListDashboardPermissions"))
              .build();
        }
      }
    }
    return getListDashboardPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleRequest,
      com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleResponse> getCreateDashboardRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDashboardRole",
      requestType = com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleRequest,
      com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleResponse> getCreateDashboardRoleMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleRequest, com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleResponse> getCreateDashboardRoleMethod;
    if ((getCreateDashboardRoleMethod = MembersServiceGrpc.getCreateDashboardRoleMethod) == null) {
      synchronized (MembersServiceGrpc.class) {
        if ((getCreateDashboardRoleMethod = MembersServiceGrpc.getCreateDashboardRoleMethod) == null) {
          MembersServiceGrpc.getCreateDashboardRoleMethod = getCreateDashboardRoleMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleRequest, com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDashboardRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MembersServiceMethodDescriptorSupplier("CreateDashboardRole"))
              .build();
        }
      }
    }
    return getCreateDashboardRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleRequest,
      com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleResponse> getUpdateDashboardRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDashboardRole",
      requestType = com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleRequest,
      com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleResponse> getUpdateDashboardRoleMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleRequest, com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleResponse> getUpdateDashboardRoleMethod;
    if ((getUpdateDashboardRoleMethod = MembersServiceGrpc.getUpdateDashboardRoleMethod) == null) {
      synchronized (MembersServiceGrpc.class) {
        if ((getUpdateDashboardRoleMethod = MembersServiceGrpc.getUpdateDashboardRoleMethod) == null) {
          MembersServiceGrpc.getUpdateDashboardRoleMethod = getUpdateDashboardRoleMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleRequest, com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDashboardRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MembersServiceMethodDescriptorSupplier("UpdateDashboardRole"))
              .build();
        }
      }
    }
    return getUpdateDashboardRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleRequest,
      com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleResponse> getDeleteDashboardRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDashboardRole",
      requestType = com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleRequest,
      com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleResponse> getDeleteDashboardRoleMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleRequest, com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleResponse> getDeleteDashboardRoleMethod;
    if ((getDeleteDashboardRoleMethod = MembersServiceGrpc.getDeleteDashboardRoleMethod) == null) {
      synchronized (MembersServiceGrpc.class) {
        if ((getDeleteDashboardRoleMethod = MembersServiceGrpc.getDeleteDashboardRoleMethod) == null) {
          MembersServiceGrpc.getDeleteDashboardRoleMethod = getDeleteDashboardRoleMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleRequest, com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDashboardRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MembersServiceMethodDescriptorSupplier("DeleteDashboardRole"))
              .build();
        }
      }
    }
    return getDeleteDashboardRoleMethod;
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
   * WORKSPACE auth scope. when we release the members UI, we need to update those APIs to WORKSPACE scope.
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
     * <pre>
     * Invite one teammate to the caller's workspace by email address, and nothing else.
     * WHY THIS IS NOT AN (agent_tool) ANNOTATION ON CreateMember, because that is the
     * obvious thing to try and it does not work. A gated write's approval-card summary must
     * name every request field the model can set (protoc-gen-agenttool's
     * checkWriteSummaryCoversRequest), and CreateMemberRequest embeds the SHARED Member
     * message, whose exposed fields include `id` and `role`. Neither has an honest place in
     * an invite sentence — CreateMember ignores both — and neither can be hidden, because
     * `agent_field` applies to reads and writes alike and list_workspace_members is
     * described to the model as returning exactly "id, email, name, and role". So the two
     * legal answers per field are both unavailable, and the remedy the tool system
     * prescribes for that is the one taken here: a purpose-specific RPC whose request holds
     * only what the tool is allowed to choose.
     * It is a thin front for CreateMember, not a second implementation: no dashboard role is
     * assigned (an invited member resolves to No Access until AssignDashboardRole runs),
     * which is also the safe default for a write an LLM proposed.
     * </pre>
     */
    default void inviteMember(com.scalekit.grpc.scalekit.v1.members.InviteMemberRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInviteMemberMethod(), responseObserver);
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

    /**
     */
    default void assignDashboardRole(com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignDashboardRoleMethod(), responseObserver);
    }

    /**
     */
    default void setDashboardEnvironmentRole(com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetDashboardEnvironmentRoleMethod(), responseObserver);
    }

    /**
     */
    default void clearDashboardEnvironmentRole(com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearDashboardEnvironmentRoleMethod(), responseObserver);
    }

    /**
     */
    default void listDashboardMemberEnvironmentRoles(com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDashboardMemberEnvironmentRolesMethod(), responseObserver);
    }

    /**
     */
    default void listDashboardRoles(com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDashboardRolesMethod(), responseObserver);
    }

    /**
     */
    default void listDashboardPermissions(com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDashboardPermissionsMethod(), responseObserver);
    }

    /**
     */
    default void createDashboardRole(com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDashboardRoleMethod(), responseObserver);
    }

    /**
     */
    default void updateDashboardRole(com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDashboardRoleMethod(), responseObserver);
    }

    /**
     */
    default void deleteDashboardRole(com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDashboardRoleMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MembersService.
   * <pre>
   * For the first closed beta build, we are not exposing the ability to create members. So, most of the APIs will have
   * WORKSPACE auth scope. when we release the members UI, we need to update those APIs to WORKSPACE scope.
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
   * WORKSPACE auth scope. when we release the members UI, we need to update those APIs to WORKSPACE scope.
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
     * <pre>
     * Invite one teammate to the caller's workspace by email address, and nothing else.
     * WHY THIS IS NOT AN (agent_tool) ANNOTATION ON CreateMember, because that is the
     * obvious thing to try and it does not work. A gated write's approval-card summary must
     * name every request field the model can set (protoc-gen-agenttool's
     * checkWriteSummaryCoversRequest), and CreateMemberRequest embeds the SHARED Member
     * message, whose exposed fields include `id` and `role`. Neither has an honest place in
     * an invite sentence — CreateMember ignores both — and neither can be hidden, because
     * `agent_field` applies to reads and writes alike and list_workspace_members is
     * described to the model as returning exactly "id, email, name, and role". So the two
     * legal answers per field are both unavailable, and the remedy the tool system
     * prescribes for that is the one taken here: a purpose-specific RPC whose request holds
     * only what the tool is allowed to choose.
     * It is a thin front for CreateMember, not a second implementation: no dashboard role is
     * assigned (an invited member resolves to No Access until AssignDashboardRole runs),
     * which is also the safe default for a write an LLM proposed.
     * </pre>
     */
    public void inviteMember(com.scalekit.grpc.scalekit.v1.members.InviteMemberRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInviteMemberMethod(), getCallOptions()), request, responseObserver);
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

    /**
     */
    public void assignDashboardRole(com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignDashboardRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setDashboardEnvironmentRole(com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetDashboardEnvironmentRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clearDashboardEnvironmentRole(com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearDashboardEnvironmentRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDashboardMemberEnvironmentRoles(com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDashboardMemberEnvironmentRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDashboardRoles(com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDashboardRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDashboardPermissions(com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDashboardPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createDashboardRole(com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDashboardRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDashboardRole(com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDashboardRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDashboardRole(com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDashboardRoleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MembersService.
   * <pre>
   * For the first closed beta build, we are not exposing the ability to create members. So, most of the APIs will have
   * WORKSPACE auth scope. when we release the members UI, we need to update those APIs to WORKSPACE scope.
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
     * <pre>
     * Invite one teammate to the caller's workspace by email address, and nothing else.
     * WHY THIS IS NOT AN (agent_tool) ANNOTATION ON CreateMember, because that is the
     * obvious thing to try and it does not work. A gated write's approval-card summary must
     * name every request field the model can set (protoc-gen-agenttool's
     * checkWriteSummaryCoversRequest), and CreateMemberRequest embeds the SHARED Member
     * message, whose exposed fields include `id` and `role`. Neither has an honest place in
     * an invite sentence — CreateMember ignores both — and neither can be hidden, because
     * `agent_field` applies to reads and writes alike and list_workspace_members is
     * described to the model as returning exactly "id, email, name, and role". So the two
     * legal answers per field are both unavailable, and the remedy the tool system
     * prescribes for that is the one taken here: a purpose-specific RPC whose request holds
     * only what the tool is allowed to choose.
     * It is a thin front for CreateMember, not a second implementation: no dashboard role is
     * assigned (an invited member resolves to No Access until AssignDashboardRole runs),
     * which is also the safe default for a write an LLM proposed.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse inviteMember(com.scalekit.grpc.scalekit.v1.members.InviteMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInviteMemberMethod(), getCallOptions(), request);
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

    /**
     */
    public com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleResponse assignDashboardRole(com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignDashboardRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleResponse setDashboardEnvironmentRole(com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetDashboardEnvironmentRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleResponse clearDashboardEnvironmentRole(com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearDashboardEnvironmentRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesResponse listDashboardMemberEnvironmentRoles(com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDashboardMemberEnvironmentRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesResponse listDashboardRoles(com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDashboardRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsResponse listDashboardPermissions(com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDashboardPermissionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleResponse createDashboardRole(com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDashboardRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleResponse updateDashboardRole(com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDashboardRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleResponse deleteDashboardRole(com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDashboardRoleMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MembersService.
   * <pre>
   * For the first closed beta build, we are not exposing the ability to create members. So, most of the APIs will have
   * WORKSPACE auth scope. when we release the members UI, we need to update those APIs to WORKSPACE scope.
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
     * <pre>
     * Invite one teammate to the caller's workspace by email address, and nothing else.
     * WHY THIS IS NOT AN (agent_tool) ANNOTATION ON CreateMember, because that is the
     * obvious thing to try and it does not work. A gated write's approval-card summary must
     * name every request field the model can set (protoc-gen-agenttool's
     * checkWriteSummaryCoversRequest), and CreateMemberRequest embeds the SHARED Member
     * message, whose exposed fields include `id` and `role`. Neither has an honest place in
     * an invite sentence — CreateMember ignores both — and neither can be hidden, because
     * `agent_field` applies to reads and writes alike and list_workspace_members is
     * described to the model as returning exactly "id, email, name, and role". So the two
     * legal answers per field are both unavailable, and the remedy the tool system
     * prescribes for that is the one taken here: a purpose-specific RPC whose request holds
     * only what the tool is allowed to choose.
     * It is a thin front for CreateMember, not a second implementation: no dashboard role is
     * assigned (an invited member resolves to No Access until AssignDashboardRole runs),
     * which is also the safe default for a write an LLM proposed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse> inviteMember(
        com.scalekit.grpc.scalekit.v1.members.InviteMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInviteMemberMethod(), getCallOptions()), request);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleResponse> assignDashboardRole(
        com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignDashboardRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleResponse> setDashboardEnvironmentRole(
        com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetDashboardEnvironmentRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleResponse> clearDashboardEnvironmentRole(
        com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearDashboardEnvironmentRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesResponse> listDashboardMemberEnvironmentRoles(
        com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDashboardMemberEnvironmentRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesResponse> listDashboardRoles(
        com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDashboardRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsResponse> listDashboardPermissions(
        com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDashboardPermissionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleResponse> createDashboardRole(
        com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDashboardRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleResponse> updateDashboardRole(
        com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDashboardRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleResponse> deleteDashboardRole(
        com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDashboardRoleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_MEMBER = 0;
  private static final int METHODID_INVITE_MEMBER = 1;
  private static final int METHODID_UPDATE_CURRENT_MEMBER = 2;
  private static final int METHODID_UPDATE_MEMBER = 3;
  private static final int METHODID_GET_CURRENT_MEMBER = 4;
  private static final int METHODID_GET_MEMBER = 5;
  private static final int METHODID_LIST_MEMBERS = 6;
  private static final int METHODID_DELETE_MEMBER = 7;
  private static final int METHODID_ASSIGN_DASHBOARD_ROLE = 8;
  private static final int METHODID_SET_DASHBOARD_ENVIRONMENT_ROLE = 9;
  private static final int METHODID_CLEAR_DASHBOARD_ENVIRONMENT_ROLE = 10;
  private static final int METHODID_LIST_DASHBOARD_MEMBER_ENVIRONMENT_ROLES = 11;
  private static final int METHODID_LIST_DASHBOARD_ROLES = 12;
  private static final int METHODID_LIST_DASHBOARD_PERMISSIONS = 13;
  private static final int METHODID_CREATE_DASHBOARD_ROLE = 14;
  private static final int METHODID_UPDATE_DASHBOARD_ROLE = 15;
  private static final int METHODID_DELETE_DASHBOARD_ROLE = 16;

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
        case METHODID_INVITE_MEMBER:
          serviceImpl.inviteMember((com.scalekit.grpc.scalekit.v1.members.InviteMemberRequest) request,
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
        case METHODID_ASSIGN_DASHBOARD_ROLE:
          serviceImpl.assignDashboardRole((com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleResponse>) responseObserver);
          break;
        case METHODID_SET_DASHBOARD_ENVIRONMENT_ROLE:
          serviceImpl.setDashboardEnvironmentRole((com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleResponse>) responseObserver);
          break;
        case METHODID_CLEAR_DASHBOARD_ENVIRONMENT_ROLE:
          serviceImpl.clearDashboardEnvironmentRole((com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleResponse>) responseObserver);
          break;
        case METHODID_LIST_DASHBOARD_MEMBER_ENVIRONMENT_ROLES:
          serviceImpl.listDashboardMemberEnvironmentRoles((com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesResponse>) responseObserver);
          break;
        case METHODID_LIST_DASHBOARD_ROLES:
          serviceImpl.listDashboardRoles((com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesResponse>) responseObserver);
          break;
        case METHODID_LIST_DASHBOARD_PERMISSIONS:
          serviceImpl.listDashboardPermissions((com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsResponse>) responseObserver);
          break;
        case METHODID_CREATE_DASHBOARD_ROLE:
          serviceImpl.createDashboardRole((com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DASHBOARD_ROLE:
          serviceImpl.updateDashboardRole((com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleResponse>) responseObserver);
          break;
        case METHODID_DELETE_DASHBOARD_ROLE:
          serviceImpl.deleteDashboardRole((com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleResponse>) responseObserver);
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
          getInviteMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.members.InviteMemberRequest,
              com.scalekit.grpc.scalekit.v1.members.CreateMemberResponse>(
                service, METHODID_INVITE_MEMBER)))
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
        .addMethod(
          getAssignDashboardRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleRequest,
              com.scalekit.grpc.scalekit.v1.members.AssignDashboardRoleResponse>(
                service, METHODID_ASSIGN_DASHBOARD_ROLE)))
        .addMethod(
          getSetDashboardEnvironmentRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleRequest,
              com.scalekit.grpc.scalekit.v1.members.SetDashboardEnvironmentRoleResponse>(
                service, METHODID_SET_DASHBOARD_ENVIRONMENT_ROLE)))
        .addMethod(
          getClearDashboardEnvironmentRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleRequest,
              com.scalekit.grpc.scalekit.v1.members.ClearDashboardEnvironmentRoleResponse>(
                service, METHODID_CLEAR_DASHBOARD_ENVIRONMENT_ROLE)))
        .addMethod(
          getListDashboardMemberEnvironmentRolesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesRequest,
              com.scalekit.grpc.scalekit.v1.members.ListDashboardMemberEnvironmentRolesResponse>(
                service, METHODID_LIST_DASHBOARD_MEMBER_ENVIRONMENT_ROLES)))
        .addMethod(
          getListDashboardRolesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesRequest,
              com.scalekit.grpc.scalekit.v1.members.ListDashboardRolesResponse>(
                service, METHODID_LIST_DASHBOARD_ROLES)))
        .addMethod(
          getListDashboardPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsRequest,
              com.scalekit.grpc.scalekit.v1.members.ListDashboardPermissionsResponse>(
                service, METHODID_LIST_DASHBOARD_PERMISSIONS)))
        .addMethod(
          getCreateDashboardRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleRequest,
              com.scalekit.grpc.scalekit.v1.members.CreateDashboardRoleResponse>(
                service, METHODID_CREATE_DASHBOARD_ROLE)))
        .addMethod(
          getUpdateDashboardRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleRequest,
              com.scalekit.grpc.scalekit.v1.members.UpdateDashboardRoleResponse>(
                service, METHODID_UPDATE_DASHBOARD_ROLE)))
        .addMethod(
          getDeleteDashboardRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleRequest,
              com.scalekit.grpc.scalekit.v1.members.DeleteDashboardRoleResponse>(
                service, METHODID_DELETE_DASHBOARD_ROLE)))
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
              .addMethod(getInviteMemberMethod())
              .addMethod(getUpdateCurrentMemberMethod())
              .addMethod(getUpdateMemberMethod())
              .addMethod(getGetCurrentMemberMethod())
              .addMethod(getGetMemberMethod())
              .addMethod(getListMembersMethod())
              .addMethod(getDeleteMemberMethod())
              .addMethod(getAssignDashboardRoleMethod())
              .addMethod(getSetDashboardEnvironmentRoleMethod())
              .addMethod(getClearDashboardEnvironmentRoleMethod())
              .addMethod(getListDashboardMemberEnvironmentRolesMethod())
              .addMethod(getListDashboardRolesMethod())
              .addMethod(getListDashboardPermissionsMethod())
              .addMethod(getCreateDashboardRoleMethod())
              .addMethod(getUpdateDashboardRoleMethod())
              .addMethod(getDeleteDashboardRoleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
