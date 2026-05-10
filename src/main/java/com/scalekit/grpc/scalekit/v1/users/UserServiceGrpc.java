package com.scalekit.grpc.scalekit.v1.users;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/users/users.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.users.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.GetUserRequest,
      com.scalekit.grpc.scalekit.v1.users.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = com.scalekit.grpc.scalekit.v1.users.GetUserRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.users.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.GetUserRequest,
      com.scalekit.grpc.scalekit.v1.users.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.GetUserRequest, com.scalekit.grpc.scalekit.v1.users.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.users.GetUserRequest, com.scalekit.grpc.scalekit.v1.users.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.GetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.ListUsersRequest,
      com.scalekit.grpc.scalekit.v1.users.ListUsersResponse> getListUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsers",
      requestType = com.scalekit.grpc.scalekit.v1.users.ListUsersRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.users.ListUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.ListUsersRequest,
      com.scalekit.grpc.scalekit.v1.users.ListUsersResponse> getListUsersMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.ListUsersRequest, com.scalekit.grpc.scalekit.v1.users.ListUsersResponse> getListUsersMethod;
    if ((getListUsersMethod = UserServiceGrpc.getListUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListUsersMethod = UserServiceGrpc.getListUsersMethod) == null) {
          UserServiceGrpc.getListUsersMethod = getListUsersMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.users.ListUsersRequest, com.scalekit.grpc.scalekit.v1.users.ListUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.ListUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.ListUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ListUsers"))
              .build();
        }
      }
    }
    return getListUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.SearchUsersRequest,
      com.scalekit.grpc.scalekit.v1.users.SearchUsersResponse> getSearchUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchUsers",
      requestType = com.scalekit.grpc.scalekit.v1.users.SearchUsersRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.users.SearchUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.SearchUsersRequest,
      com.scalekit.grpc.scalekit.v1.users.SearchUsersResponse> getSearchUsersMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.SearchUsersRequest, com.scalekit.grpc.scalekit.v1.users.SearchUsersResponse> getSearchUsersMethod;
    if ((getSearchUsersMethod = UserServiceGrpc.getSearchUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSearchUsersMethod = UserServiceGrpc.getSearchUsersMethod) == null) {
          UserServiceGrpc.getSearchUsersMethod = getSearchUsersMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.users.SearchUsersRequest, com.scalekit.grpc.scalekit.v1.users.SearchUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.SearchUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.SearchUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("SearchUsers"))
              .build();
        }
      }
    }
    return getSearchUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersRequest,
      com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersResponse> getSearchOrganizationUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchOrganizationUsers",
      requestType = com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersRequest,
      com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersResponse> getSearchOrganizationUsersMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersRequest, com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersResponse> getSearchOrganizationUsersMethod;
    if ((getSearchOrganizationUsersMethod = UserServiceGrpc.getSearchOrganizationUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSearchOrganizationUsersMethod = UserServiceGrpc.getSearchOrganizationUsersMethod) == null) {
          UserServiceGrpc.getSearchOrganizationUsersMethod = getSearchOrganizationUsersMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersRequest, com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchOrganizationUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("SearchOrganizationUsers"))
              .build();
        }
      }
    }
    return getSearchOrganizationUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest,
      com.scalekit.grpc.scalekit.v1.users.UpdateUserResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.users.UpdateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest,
      com.scalekit.grpc.scalekit.v1.users.UpdateUserResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest, com.scalekit.grpc.scalekit.v1.users.UpdateUserResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
          UserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest, com.scalekit.grpc.scalekit.v1.users.UpdateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.UpdateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.DeleteUserRequest,
      com.google.protobuf.Empty> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = com.scalekit.grpc.scalekit.v1.users.DeleteUserRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.DeleteUserRequest,
      com.google.protobuf.Empty> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.DeleteUserRequest, com.google.protobuf.Empty> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
          UserServiceGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.users.DeleteUserRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.DeleteUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.CreateMembershipRequest,
      com.scalekit.grpc.scalekit.v1.users.CreateMembershipResponse> getCreateMembershipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMembership",
      requestType = com.scalekit.grpc.scalekit.v1.users.CreateMembershipRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.users.CreateMembershipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.CreateMembershipRequest,
      com.scalekit.grpc.scalekit.v1.users.CreateMembershipResponse> getCreateMembershipMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.CreateMembershipRequest, com.scalekit.grpc.scalekit.v1.users.CreateMembershipResponse> getCreateMembershipMethod;
    if ((getCreateMembershipMethod = UserServiceGrpc.getCreateMembershipMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateMembershipMethod = UserServiceGrpc.getCreateMembershipMethod) == null) {
          UserServiceGrpc.getCreateMembershipMethod = getCreateMembershipMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.users.CreateMembershipRequest, com.scalekit.grpc.scalekit.v1.users.CreateMembershipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMembership"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.CreateMembershipRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.CreateMembershipResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateMembership"))
              .build();
        }
      }
    }
    return getCreateMembershipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.DeleteMembershipRequest,
      com.google.protobuf.Empty> getDeleteMembershipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMembership",
      requestType = com.scalekit.grpc.scalekit.v1.users.DeleteMembershipRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.DeleteMembershipRequest,
      com.google.protobuf.Empty> getDeleteMembershipMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.DeleteMembershipRequest, com.google.protobuf.Empty> getDeleteMembershipMethod;
    if ((getDeleteMembershipMethod = UserServiceGrpc.getDeleteMembershipMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteMembershipMethod = UserServiceGrpc.getDeleteMembershipMethod) == null) {
          UserServiceGrpc.getDeleteMembershipMethod = getDeleteMembershipMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.users.DeleteMembershipRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMembership"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.DeleteMembershipRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteMembership"))
              .build();
        }
      }
    }
    return getDeleteMembershipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.UpdateMembershipRequest,
      com.scalekit.grpc.scalekit.v1.users.UpdateMembershipResponse> getUpdateMembershipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMembership",
      requestType = com.scalekit.grpc.scalekit.v1.users.UpdateMembershipRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.users.UpdateMembershipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.UpdateMembershipRequest,
      com.scalekit.grpc.scalekit.v1.users.UpdateMembershipResponse> getUpdateMembershipMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.UpdateMembershipRequest, com.scalekit.grpc.scalekit.v1.users.UpdateMembershipResponse> getUpdateMembershipMethod;
    if ((getUpdateMembershipMethod = UserServiceGrpc.getUpdateMembershipMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateMembershipMethod = UserServiceGrpc.getUpdateMembershipMethod) == null) {
          UserServiceGrpc.getUpdateMembershipMethod = getUpdateMembershipMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.users.UpdateMembershipRequest, com.scalekit.grpc.scalekit.v1.users.UpdateMembershipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMembership"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.UpdateMembershipRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.UpdateMembershipResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateMembership"))
              .build();
        }
      }
    }
    return getUpdateMembershipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipRequest,
      com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipResponse> getCreateUserAndMembershipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUserAndMembership",
      requestType = com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipRequest,
      com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipResponse> getCreateUserAndMembershipMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipRequest, com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipResponse> getCreateUserAndMembershipMethod;
    if ((getCreateUserAndMembershipMethod = UserServiceGrpc.getCreateUserAndMembershipMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateUserAndMembershipMethod = UserServiceGrpc.getCreateUserAndMembershipMethod) == null) {
          UserServiceGrpc.getCreateUserAndMembershipMethod = getCreateUserAndMembershipMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipRequest, com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUserAndMembership"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateUserAndMembership"))
              .build();
        }
      }
    }
    return getCreateUserAndMembershipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersRequest,
      com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersResponse> getListOrganizationUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrganizationUsers",
      requestType = com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersRequest,
      com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersResponse> getListOrganizationUsersMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersRequest, com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersResponse> getListOrganizationUsersMethod;
    if ((getListOrganizationUsersMethod = UserServiceGrpc.getListOrganizationUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListOrganizationUsersMethod = UserServiceGrpc.getListOrganizationUsersMethod) == null) {
          UserServiceGrpc.getListOrganizationUsersMethod = getListOrganizationUsersMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersRequest, com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrganizationUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ListOrganizationUsers"))
              .build();
        }
      }
    }
    return getListOrganizationUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.ResendInviteRequest,
      com.scalekit.grpc.scalekit.v1.users.ResendInviteResponse> getResendInviteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResendInvite",
      requestType = com.scalekit.grpc.scalekit.v1.users.ResendInviteRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.users.ResendInviteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.ResendInviteRequest,
      com.scalekit.grpc.scalekit.v1.users.ResendInviteResponse> getResendInviteMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.ResendInviteRequest, com.scalekit.grpc.scalekit.v1.users.ResendInviteResponse> getResendInviteMethod;
    if ((getResendInviteMethod = UserServiceGrpc.getResendInviteMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getResendInviteMethod = UserServiceGrpc.getResendInviteMethod) == null) {
          UserServiceGrpc.getResendInviteMethod = getResendInviteMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.users.ResendInviteRequest, com.scalekit.grpc.scalekit.v1.users.ResendInviteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResendInvite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.ResendInviteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.ResendInviteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ResendInvite"))
              .build();
        }
      }
    }
    return getResendInviteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.ListUserRolesRequest,
      com.scalekit.grpc.scalekit.v1.users.ListUserRolesResponse> getListUserRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserRoles",
      requestType = com.scalekit.grpc.scalekit.v1.users.ListUserRolesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.users.ListUserRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.ListUserRolesRequest,
      com.scalekit.grpc.scalekit.v1.users.ListUserRolesResponse> getListUserRolesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.ListUserRolesRequest, com.scalekit.grpc.scalekit.v1.users.ListUserRolesResponse> getListUserRolesMethod;
    if ((getListUserRolesMethod = UserServiceGrpc.getListUserRolesMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListUserRolesMethod = UserServiceGrpc.getListUserRolesMethod) == null) {
          UserServiceGrpc.getListUserRolesMethod = getListUserRolesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.users.ListUserRolesRequest, com.scalekit.grpc.scalekit.v1.users.ListUserRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.ListUserRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.ListUserRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ListUserRoles"))
              .build();
        }
      }
    }
    return getListUserRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.AssignUserRolesRequest,
      com.scalekit.grpc.scalekit.v1.users.AssignUserRolesResponse> getAssignUserRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignUserRoles",
      requestType = com.scalekit.grpc.scalekit.v1.users.AssignUserRolesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.users.AssignUserRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.AssignUserRolesRequest,
      com.scalekit.grpc.scalekit.v1.users.AssignUserRolesResponse> getAssignUserRolesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.AssignUserRolesRequest, com.scalekit.grpc.scalekit.v1.users.AssignUserRolesResponse> getAssignUserRolesMethod;
    if ((getAssignUserRolesMethod = UserServiceGrpc.getAssignUserRolesMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAssignUserRolesMethod = UserServiceGrpc.getAssignUserRolesMethod) == null) {
          UserServiceGrpc.getAssignUserRolesMethod = getAssignUserRolesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.users.AssignUserRolesRequest, com.scalekit.grpc.scalekit.v1.users.AssignUserRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignUserRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.AssignUserRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.AssignUserRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AssignUserRoles"))
              .build();
        }
      }
    }
    return getAssignUserRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.RemoveUserRoleRequest,
      com.google.protobuf.Empty> getRemoveUserRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserRole",
      requestType = com.scalekit.grpc.scalekit.v1.users.RemoveUserRoleRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.RemoveUserRoleRequest,
      com.google.protobuf.Empty> getRemoveUserRoleMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.RemoveUserRoleRequest, com.google.protobuf.Empty> getRemoveUserRoleMethod;
    if ((getRemoveUserRoleMethod = UserServiceGrpc.getRemoveUserRoleMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRemoveUserRoleMethod = UserServiceGrpc.getRemoveUserRoleMethod) == null) {
          UserServiceGrpc.getRemoveUserRoleMethod = getRemoveUserRoleMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.users.RemoveUserRoleRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.RemoveUserRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RemoveUserRole"))
              .build();
        }
      }
    }
    return getRemoveUserRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsRequest,
      com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsResponse> getListUserPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserPermissions",
      requestType = com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsRequest,
      com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsResponse> getListUserPermissionsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsRequest, com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsResponse> getListUserPermissionsMethod;
    if ((getListUserPermissionsMethod = UserServiceGrpc.getListUserPermissionsMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListUserPermissionsMethod = UserServiceGrpc.getListUserPermissionsMethod) == null) {
          UserServiceGrpc.getListUserPermissionsMethod = getListUserPermissionsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsRequest, com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ListUserPermissions"))
              .build();
        }
      }
    }
    return getListUserPermissionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Users
     * </pre>
     */
    default void getUser(com.scalekit.grpc.scalekit.v1.users.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.GetUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    default void listUsers(com.scalekit.grpc.scalekit.v1.users.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.ListUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsersMethod(), responseObserver);
    }

    /**
     */
    default void searchUsers(com.scalekit.grpc.scalekit.v1.users.SearchUsersRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.SearchUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchUsersMethod(), responseObserver);
    }

    /**
     */
    default void searchOrganizationUsers(com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchOrganizationUsersMethod(), responseObserver);
    }

    /**
     */
    default void updateUser(com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    default void deleteUser(com.scalekit.grpc.scalekit.v1.users.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Memberships
     * </pre>
     */
    default void createMembership(com.scalekit.grpc.scalekit.v1.users.CreateMembershipRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.CreateMembershipResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMembershipMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO Check cascade behaviour currently its ignored
     * </pre>
     */
    default void deleteMembership(com.scalekit.grpc.scalekit.v1.users.DeleteMembershipRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMembershipMethod(), responseObserver);
    }

    /**
     */
    default void updateMembership(com.scalekit.grpc.scalekit.v1.users.UpdateMembershipRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.UpdateMembershipResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMembershipMethod(), responseObserver);
    }

    /**
     */
    default void createUserAndMembership(com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserAndMembershipMethod(), responseObserver);
    }

    /**
     * <pre>
     * only memberships of the organization
     * </pre>
     */
    default void listOrganizationUsers(com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrganizationUsersMethod(), responseObserver);
    }

    /**
     */
    default void resendInvite(com.scalekit.grpc.scalekit.v1.users.ResendInviteRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.ResendInviteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResendInviteMethod(), responseObserver);
    }

    /**
     * <pre>
     * User Role Management
     * </pre>
     */
    default void listUserRoles(com.scalekit.grpc.scalekit.v1.users.ListUserRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.ListUserRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUserRolesMethod(), responseObserver);
    }

    /**
     */
    default void assignUserRoles(com.scalekit.grpc.scalekit.v1.users.AssignUserRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.AssignUserRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignUserRolesMethod(), responseObserver);
    }

    /**
     */
    default void removeUserRole(com.scalekit.grpc.scalekit.v1.users.RemoveUserRoleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUserRoleMethod(), responseObserver);
    }

    /**
     */
    default void listUserPermissions(com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUserPermissionsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserService.
   */
  public static abstract class UserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserService.
   */
  public static final class UserServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Users
     * </pre>
     */
    public void getUser(com.scalekit.grpc.scalekit.v1.users.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.GetUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUsers(com.scalekit.grpc.scalekit.v1.users.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.ListUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchUsers(com.scalekit.grpc.scalekit.v1.users.SearchUsersRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.SearchUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchOrganizationUsers(com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchOrganizationUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(com.scalekit.grpc.scalekit.v1.users.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Memberships
     * </pre>
     */
    public void createMembership(com.scalekit.grpc.scalekit.v1.users.CreateMembershipRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.CreateMembershipResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMembershipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TODO Check cascade behaviour currently its ignored
     * </pre>
     */
    public void deleteMembership(com.scalekit.grpc.scalekit.v1.users.DeleteMembershipRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMembershipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMembership(com.scalekit.grpc.scalekit.v1.users.UpdateMembershipRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.UpdateMembershipResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMembershipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createUserAndMembership(com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserAndMembershipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * only memberships of the organization
     * </pre>
     */
    public void listOrganizationUsers(com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrganizationUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resendInvite(com.scalekit.grpc.scalekit.v1.users.ResendInviteRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.ResendInviteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResendInviteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * User Role Management
     * </pre>
     */
    public void listUserRoles(com.scalekit.grpc.scalekit.v1.users.ListUserRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.ListUserRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUserRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignUserRoles(com.scalekit.grpc.scalekit.v1.users.AssignUserRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.AssignUserRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignUserRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeUserRole(com.scalekit.grpc.scalekit.v1.users.RemoveUserRoleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUserRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUserPermissions(com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUserPermissionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserService.
   */
  public static final class UserServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Users
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.users.GetUserResponse getUser(com.scalekit.grpc.scalekit.v1.users.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.users.ListUsersResponse listUsers(com.scalekit.grpc.scalekit.v1.users.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.users.SearchUsersResponse searchUsers(com.scalekit.grpc.scalekit.v1.users.SearchUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersResponse searchOrganizationUsers(com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchOrganizationUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.users.UpdateUserResponse updateUser(com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteUser(com.scalekit.grpc.scalekit.v1.users.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Memberships
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.users.CreateMembershipResponse createMembership(com.scalekit.grpc.scalekit.v1.users.CreateMembershipRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMembershipMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO Check cascade behaviour currently its ignored
     * </pre>
     */
    public com.google.protobuf.Empty deleteMembership(com.scalekit.grpc.scalekit.v1.users.DeleteMembershipRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMembershipMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.users.UpdateMembershipResponse updateMembership(com.scalekit.grpc.scalekit.v1.users.UpdateMembershipRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMembershipMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipResponse createUserAndMembership(com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserAndMembershipMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * only memberships of the organization
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersResponse listOrganizationUsers(com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrganizationUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.users.ResendInviteResponse resendInvite(com.scalekit.grpc.scalekit.v1.users.ResendInviteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResendInviteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * User Role Management
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.users.ListUserRolesResponse listUserRoles(com.scalekit.grpc.scalekit.v1.users.ListUserRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUserRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.users.AssignUserRolesResponse assignUserRoles(com.scalekit.grpc.scalekit.v1.users.AssignUserRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignUserRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty removeUserRole(com.scalekit.grpc.scalekit.v1.users.RemoveUserRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUserRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsResponse listUserPermissions(com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUserPermissionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserService.
   */
  public static final class UserServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Users
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.users.GetUserResponse> getUser(
        com.scalekit.grpc.scalekit.v1.users.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.users.ListUsersResponse> listUsers(
        com.scalekit.grpc.scalekit.v1.users.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.users.SearchUsersResponse> searchUsers(
        com.scalekit.grpc.scalekit.v1.users.SearchUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersResponse> searchOrganizationUsers(
        com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchOrganizationUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.users.UpdateUserResponse> updateUser(
        com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteUser(
        com.scalekit.grpc.scalekit.v1.users.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Memberships
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.users.CreateMembershipResponse> createMembership(
        com.scalekit.grpc.scalekit.v1.users.CreateMembershipRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMembershipMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TODO Check cascade behaviour currently its ignored
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteMembership(
        com.scalekit.grpc.scalekit.v1.users.DeleteMembershipRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMembershipMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.users.UpdateMembershipResponse> updateMembership(
        com.scalekit.grpc.scalekit.v1.users.UpdateMembershipRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMembershipMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipResponse> createUserAndMembership(
        com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserAndMembershipMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * only memberships of the organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersResponse> listOrganizationUsers(
        com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrganizationUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.users.ResendInviteResponse> resendInvite(
        com.scalekit.grpc.scalekit.v1.users.ResendInviteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResendInviteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * User Role Management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.users.ListUserRolesResponse> listUserRoles(
        com.scalekit.grpc.scalekit.v1.users.ListUserRolesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUserRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.users.AssignUserRolesResponse> assignUserRoles(
        com.scalekit.grpc.scalekit.v1.users.AssignUserRolesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignUserRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> removeUserRole(
        com.scalekit.grpc.scalekit.v1.users.RemoveUserRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUserRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsResponse> listUserPermissions(
        com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUserPermissionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER = 0;
  private static final int METHODID_LIST_USERS = 1;
  private static final int METHODID_SEARCH_USERS = 2;
  private static final int METHODID_SEARCH_ORGANIZATION_USERS = 3;
  private static final int METHODID_UPDATE_USER = 4;
  private static final int METHODID_DELETE_USER = 5;
  private static final int METHODID_CREATE_MEMBERSHIP = 6;
  private static final int METHODID_DELETE_MEMBERSHIP = 7;
  private static final int METHODID_UPDATE_MEMBERSHIP = 8;
  private static final int METHODID_CREATE_USER_AND_MEMBERSHIP = 9;
  private static final int METHODID_LIST_ORGANIZATION_USERS = 10;
  private static final int METHODID_RESEND_INVITE = 11;
  private static final int METHODID_LIST_USER_ROLES = 12;
  private static final int METHODID_ASSIGN_USER_ROLES = 13;
  private static final int METHODID_REMOVE_USER_ROLE = 14;
  private static final int METHODID_LIST_USER_PERMISSIONS = 15;

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
        case METHODID_GET_USER:
          serviceImpl.getUser((com.scalekit.grpc.scalekit.v1.users.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.GetUserResponse>) responseObserver);
          break;
        case METHODID_LIST_USERS:
          serviceImpl.listUsers((com.scalekit.grpc.scalekit.v1.users.ListUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.ListUsersResponse>) responseObserver);
          break;
        case METHODID_SEARCH_USERS:
          serviceImpl.searchUsers((com.scalekit.grpc.scalekit.v1.users.SearchUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.SearchUsersResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ORGANIZATION_USERS:
          serviceImpl.searchOrganizationUsers((com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.UpdateUserResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.scalekit.grpc.scalekit.v1.users.DeleteUserRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_MEMBERSHIP:
          serviceImpl.createMembership((com.scalekit.grpc.scalekit.v1.users.CreateMembershipRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.CreateMembershipResponse>) responseObserver);
          break;
        case METHODID_DELETE_MEMBERSHIP:
          serviceImpl.deleteMembership((com.scalekit.grpc.scalekit.v1.users.DeleteMembershipRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_MEMBERSHIP:
          serviceImpl.updateMembership((com.scalekit.grpc.scalekit.v1.users.UpdateMembershipRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.UpdateMembershipResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER_AND_MEMBERSHIP:
          serviceImpl.createUserAndMembership((com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipResponse>) responseObserver);
          break;
        case METHODID_LIST_ORGANIZATION_USERS:
          serviceImpl.listOrganizationUsers((com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersResponse>) responseObserver);
          break;
        case METHODID_RESEND_INVITE:
          serviceImpl.resendInvite((com.scalekit.grpc.scalekit.v1.users.ResendInviteRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.ResendInviteResponse>) responseObserver);
          break;
        case METHODID_LIST_USER_ROLES:
          serviceImpl.listUserRoles((com.scalekit.grpc.scalekit.v1.users.ListUserRolesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.ListUserRolesResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_USER_ROLES:
          serviceImpl.assignUserRoles((com.scalekit.grpc.scalekit.v1.users.AssignUserRolesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.AssignUserRolesResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER_ROLE:
          serviceImpl.removeUserRole((com.scalekit.grpc.scalekit.v1.users.RemoveUserRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_USER_PERMISSIONS:
          serviceImpl.listUserPermissions((com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsResponse>) responseObserver);
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
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.users.GetUserRequest,
              com.scalekit.grpc.scalekit.v1.users.GetUserResponse>(
                service, METHODID_GET_USER)))
        .addMethod(
          getListUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.users.ListUsersRequest,
              com.scalekit.grpc.scalekit.v1.users.ListUsersResponse>(
                service, METHODID_LIST_USERS)))
        .addMethod(
          getSearchUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.users.SearchUsersRequest,
              com.scalekit.grpc.scalekit.v1.users.SearchUsersResponse>(
                service, METHODID_SEARCH_USERS)))
        .addMethod(
          getSearchOrganizationUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersRequest,
              com.scalekit.grpc.scalekit.v1.users.SearchOrganizationUsersResponse>(
                service, METHODID_SEARCH_ORGANIZATION_USERS)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.users.UpdateUserRequest,
              com.scalekit.grpc.scalekit.v1.users.UpdateUserResponse>(
                service, METHODID_UPDATE_USER)))
        .addMethod(
          getDeleteUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.users.DeleteUserRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_USER)))
        .addMethod(
          getCreateMembershipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.users.CreateMembershipRequest,
              com.scalekit.grpc.scalekit.v1.users.CreateMembershipResponse>(
                service, METHODID_CREATE_MEMBERSHIP)))
        .addMethod(
          getDeleteMembershipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.users.DeleteMembershipRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_MEMBERSHIP)))
        .addMethod(
          getUpdateMembershipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.users.UpdateMembershipRequest,
              com.scalekit.grpc.scalekit.v1.users.UpdateMembershipResponse>(
                service, METHODID_UPDATE_MEMBERSHIP)))
        .addMethod(
          getCreateUserAndMembershipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipRequest,
              com.scalekit.grpc.scalekit.v1.users.CreateUserAndMembershipResponse>(
                service, METHODID_CREATE_USER_AND_MEMBERSHIP)))
        .addMethod(
          getListOrganizationUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersRequest,
              com.scalekit.grpc.scalekit.v1.users.ListOrganizationUsersResponse>(
                service, METHODID_LIST_ORGANIZATION_USERS)))
        .addMethod(
          getResendInviteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.users.ResendInviteRequest,
              com.scalekit.grpc.scalekit.v1.users.ResendInviteResponse>(
                service, METHODID_RESEND_INVITE)))
        .addMethod(
          getListUserRolesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.users.ListUserRolesRequest,
              com.scalekit.grpc.scalekit.v1.users.ListUserRolesResponse>(
                service, METHODID_LIST_USER_ROLES)))
        .addMethod(
          getAssignUserRolesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.users.AssignUserRolesRequest,
              com.scalekit.grpc.scalekit.v1.users.AssignUserRolesResponse>(
                service, METHODID_ASSIGN_USER_ROLES)))
        .addMethod(
          getRemoveUserRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.users.RemoveUserRoleRequest,
              com.google.protobuf.Empty>(
                service, METHODID_REMOVE_USER_ROLE)))
        .addMethod(
          getListUserPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsRequest,
              com.scalekit.grpc.scalekit.v1.users.ListUserPermissionsResponse>(
                service, METHODID_LIST_USER_PERMISSIONS)))
        .build();
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.users.UsersProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetUserMethod())
              .addMethod(getListUsersMethod())
              .addMethod(getSearchUsersMethod())
              .addMethod(getSearchOrganizationUsersMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getCreateMembershipMethod())
              .addMethod(getDeleteMembershipMethod())
              .addMethod(getUpdateMembershipMethod())
              .addMethod(getCreateUserAndMembershipMethod())
              .addMethod(getListOrganizationUsersMethod())
              .addMethod(getResendInviteMethod())
              .addMethod(getListUserRolesMethod())
              .addMethod(getAssignUserRolesMethod())
              .addMethod(getRemoveUserRoleMethod())
              .addMethod(getListUserPermissionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
