package com.scalekit.grpc.scalekit.v1.directories;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/directories/directories.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DirectoryServiceGrpc {

  private DirectoryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.directories.DirectoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryRequest,
      com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse> getCreateDirectoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDirectory",
      requestType = com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryRequest,
      com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse> getCreateDirectoryMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryRequest, com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse> getCreateDirectoryMethod;
    if ((getCreateDirectoryMethod = DirectoryServiceGrpc.getCreateDirectoryMethod) == null) {
      synchronized (DirectoryServiceGrpc.class) {
        if ((getCreateDirectoryMethod = DirectoryServiceGrpc.getCreateDirectoryMethod) == null) {
          DirectoryServiceGrpc.getCreateDirectoryMethod = getCreateDirectoryMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryRequest, com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDirectory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DirectoryServiceMethodDescriptorSupplier("CreateDirectory"))
              .build();
        }
      }
    }
    return getCreateDirectoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.DeleteDirectoryRequest,
      com.google.protobuf.Empty> getDeleteDirectoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDirectory",
      requestType = com.scalekit.grpc.scalekit.v1.directories.DeleteDirectoryRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.DeleteDirectoryRequest,
      com.google.protobuf.Empty> getDeleteDirectoryMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.DeleteDirectoryRequest, com.google.protobuf.Empty> getDeleteDirectoryMethod;
    if ((getDeleteDirectoryMethod = DirectoryServiceGrpc.getDeleteDirectoryMethod) == null) {
      synchronized (DirectoryServiceGrpc.class) {
        if ((getDeleteDirectoryMethod = DirectoryServiceGrpc.getDeleteDirectoryMethod) == null) {
          DirectoryServiceGrpc.getDeleteDirectoryMethod = getDeleteDirectoryMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.directories.DeleteDirectoryRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDirectory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.DeleteDirectoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DirectoryServiceMethodDescriptorSupplier("DeleteDirectory"))
              .build();
        }
      }
    }
    return getDeleteDirectoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryRequest,
      com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryResponse> getUpdateDirectoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDirectory",
      requestType = com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryRequest,
      com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryResponse> getUpdateDirectoryMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryRequest, com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryResponse> getUpdateDirectoryMethod;
    if ((getUpdateDirectoryMethod = DirectoryServiceGrpc.getUpdateDirectoryMethod) == null) {
      synchronized (DirectoryServiceGrpc.class) {
        if ((getUpdateDirectoryMethod = DirectoryServiceGrpc.getUpdateDirectoryMethod) == null) {
          DirectoryServiceGrpc.getUpdateDirectoryMethod = getUpdateDirectoryMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryRequest, com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDirectory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DirectoryServiceMethodDescriptorSupplier("UpdateDirectory"))
              .build();
        }
      }
    }
    return getUpdateDirectoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.AssignGroupsForDirectoryRequest,
      com.google.protobuf.Empty> getAssignGroupsForDirectoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignGroupsForDirectory",
      requestType = com.scalekit.grpc.scalekit.v1.directories.AssignGroupsForDirectoryRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.AssignGroupsForDirectoryRequest,
      com.google.protobuf.Empty> getAssignGroupsForDirectoryMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.AssignGroupsForDirectoryRequest, com.google.protobuf.Empty> getAssignGroupsForDirectoryMethod;
    if ((getAssignGroupsForDirectoryMethod = DirectoryServiceGrpc.getAssignGroupsForDirectoryMethod) == null) {
      synchronized (DirectoryServiceGrpc.class) {
        if ((getAssignGroupsForDirectoryMethod = DirectoryServiceGrpc.getAssignGroupsForDirectoryMethod) == null) {
          DirectoryServiceGrpc.getAssignGroupsForDirectoryMethod = getAssignGroupsForDirectoryMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.directories.AssignGroupsForDirectoryRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignGroupsForDirectory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.AssignGroupsForDirectoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DirectoryServiceMethodDescriptorSupplier("AssignGroupsForDirectory"))
              .build();
        }
      }
    }
    return getAssignGroupsForDirectoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.AssignRolesRequest,
      com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse> getAssignRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignRoles",
      requestType = com.scalekit.grpc.scalekit.v1.directories.AssignRolesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.AssignRolesRequest,
      com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse> getAssignRolesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.AssignRolesRequest, com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse> getAssignRolesMethod;
    if ((getAssignRolesMethod = DirectoryServiceGrpc.getAssignRolesMethod) == null) {
      synchronized (DirectoryServiceGrpc.class) {
        if ((getAssignRolesMethod = DirectoryServiceGrpc.getAssignRolesMethod) == null) {
          DirectoryServiceGrpc.getAssignRolesMethod = getAssignRolesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.directories.AssignRolesRequest, com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.AssignRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DirectoryServiceMethodDescriptorSupplier("AssignRoles"))
              .build();
        }
      }
    }
    return getAssignRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesRequest,
      com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesResponse> getUpdateAttributesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAttributes",
      requestType = com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesRequest,
      com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesResponse> getUpdateAttributesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesRequest, com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesResponse> getUpdateAttributesMethod;
    if ((getUpdateAttributesMethod = DirectoryServiceGrpc.getUpdateAttributesMethod) == null) {
      synchronized (DirectoryServiceGrpc.class) {
        if ((getUpdateAttributesMethod = DirectoryServiceGrpc.getUpdateAttributesMethod) == null) {
          DirectoryServiceGrpc.getUpdateAttributesMethod = getUpdateAttributesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesRequest, com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAttributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DirectoryServiceMethodDescriptorSupplier("UpdateAttributes"))
              .build();
        }
      }
    }
    return getUpdateAttributesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.GetDirectoryRequest,
      com.scalekit.grpc.scalekit.v1.directories.GetDirectoryResponse> getGetDirectoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDirectory",
      requestType = com.scalekit.grpc.scalekit.v1.directories.GetDirectoryRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.directories.GetDirectoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.GetDirectoryRequest,
      com.scalekit.grpc.scalekit.v1.directories.GetDirectoryResponse> getGetDirectoryMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.GetDirectoryRequest, com.scalekit.grpc.scalekit.v1.directories.GetDirectoryResponse> getGetDirectoryMethod;
    if ((getGetDirectoryMethod = DirectoryServiceGrpc.getGetDirectoryMethod) == null) {
      synchronized (DirectoryServiceGrpc.class) {
        if ((getGetDirectoryMethod = DirectoryServiceGrpc.getGetDirectoryMethod) == null) {
          DirectoryServiceGrpc.getGetDirectoryMethod = getGetDirectoryMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.directories.GetDirectoryRequest, com.scalekit.grpc.scalekit.v1.directories.GetDirectoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDirectory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.GetDirectoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.GetDirectoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DirectoryServiceMethodDescriptorSupplier("GetDirectory"))
              .build();
        }
      }
    }
    return getGetDirectoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesRequest,
      com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse> getListDirectoriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDirectories",
      requestType = com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesRequest,
      com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse> getListDirectoriesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesRequest, com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse> getListDirectoriesMethod;
    if ((getListDirectoriesMethod = DirectoryServiceGrpc.getListDirectoriesMethod) == null) {
      synchronized (DirectoryServiceGrpc.class) {
        if ((getListDirectoriesMethod = DirectoryServiceGrpc.getListDirectoriesMethod) == null) {
          DirectoryServiceGrpc.getListDirectoriesMethod = getListDirectoriesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesRequest, com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDirectories"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DirectoryServiceMethodDescriptorSupplier("ListDirectories"))
              .build();
        }
      }
    }
    return getListDirectoriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest,
      com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse> getEnableDirectoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableDirectory",
      requestType = com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest,
      com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse> getEnableDirectoryMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest, com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse> getEnableDirectoryMethod;
    if ((getEnableDirectoryMethod = DirectoryServiceGrpc.getEnableDirectoryMethod) == null) {
      synchronized (DirectoryServiceGrpc.class) {
        if ((getEnableDirectoryMethod = DirectoryServiceGrpc.getEnableDirectoryMethod) == null) {
          DirectoryServiceGrpc.getEnableDirectoryMethod = getEnableDirectoryMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest, com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableDirectory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DirectoryServiceMethodDescriptorSupplier("EnableDirectory"))
              .build();
        }
      }
    }
    return getEnableDirectoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest,
      com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse> getDisableDirectoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableDirectory",
      requestType = com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest,
      com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse> getDisableDirectoryMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest, com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse> getDisableDirectoryMethod;
    if ((getDisableDirectoryMethod = DirectoryServiceGrpc.getDisableDirectoryMethod) == null) {
      synchronized (DirectoryServiceGrpc.class) {
        if ((getDisableDirectoryMethod = DirectoryServiceGrpc.getDisableDirectoryMethod) == null) {
          DirectoryServiceGrpc.getDisableDirectoryMethod = getDisableDirectoryMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest, com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableDirectory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DirectoryServiceMethodDescriptorSupplier("DisableDirectory"))
              .build();
        }
      }
    }
    return getDisableDirectoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersRequest,
      com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersResponse> getListDirectoryUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDirectoryUsers",
      requestType = com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersRequest,
      com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersResponse> getListDirectoryUsersMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersRequest, com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersResponse> getListDirectoryUsersMethod;
    if ((getListDirectoryUsersMethod = DirectoryServiceGrpc.getListDirectoryUsersMethod) == null) {
      synchronized (DirectoryServiceGrpc.class) {
        if ((getListDirectoryUsersMethod = DirectoryServiceGrpc.getListDirectoryUsersMethod) == null) {
          DirectoryServiceGrpc.getListDirectoryUsersMethod = getListDirectoryUsersMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersRequest, com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDirectoryUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DirectoryServiceMethodDescriptorSupplier("ListDirectoryUsers"))
              .build();
        }
      }
    }
    return getListDirectoryUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsRequest,
      com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse> getListDirectoryGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDirectoryGroups",
      requestType = com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsRequest,
      com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse> getListDirectoryGroupsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsRequest, com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse> getListDirectoryGroupsMethod;
    if ((getListDirectoryGroupsMethod = DirectoryServiceGrpc.getListDirectoryGroupsMethod) == null) {
      synchronized (DirectoryServiceGrpc.class) {
        if ((getListDirectoryGroupsMethod = DirectoryServiceGrpc.getListDirectoryGroupsMethod) == null) {
          DirectoryServiceGrpc.getListDirectoryGroupsMethod = getListDirectoryGroupsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsRequest, com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDirectoryGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DirectoryServiceMethodDescriptorSupplier("ListDirectoryGroups"))
              .build();
        }
      }
    }
    return getListDirectoryGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsSummaryRequest,
      com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse> getListDirectoryGroupsSummaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDirectoryGroupsSummary",
      requestType = com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsSummaryRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsSummaryRequest,
      com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse> getListDirectoryGroupsSummaryMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsSummaryRequest, com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse> getListDirectoryGroupsSummaryMethod;
    if ((getListDirectoryGroupsSummaryMethod = DirectoryServiceGrpc.getListDirectoryGroupsSummaryMethod) == null) {
      synchronized (DirectoryServiceGrpc.class) {
        if ((getListDirectoryGroupsSummaryMethod = DirectoryServiceGrpc.getListDirectoryGroupsSummaryMethod) == null) {
          DirectoryServiceGrpc.getListDirectoryGroupsSummaryMethod = getListDirectoryGroupsSummaryMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsSummaryRequest, com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDirectoryGroupsSummary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsSummaryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DirectoryServiceMethodDescriptorSupplier("ListDirectoryGroupsSummary"))
              .build();
        }
      }
    }
    return getListDirectoryGroupsSummaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretRequest,
      com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretResponse> getCreateDirectorySecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDirectorySecret",
      requestType = com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretRequest,
      com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretResponse> getCreateDirectorySecretMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretRequest, com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretResponse> getCreateDirectorySecretMethod;
    if ((getCreateDirectorySecretMethod = DirectoryServiceGrpc.getCreateDirectorySecretMethod) == null) {
      synchronized (DirectoryServiceGrpc.class) {
        if ((getCreateDirectorySecretMethod = DirectoryServiceGrpc.getCreateDirectorySecretMethod) == null) {
          DirectoryServiceGrpc.getCreateDirectorySecretMethod = getCreateDirectorySecretMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretRequest, com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDirectorySecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DirectoryServiceMethodDescriptorSupplier("CreateDirectorySecret"))
              .build();
        }
      }
    }
    return getCreateDirectorySecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretRequest,
      com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse> getRegenerateDirectorySecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegenerateDirectorySecret",
      requestType = com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretRequest,
      com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse> getRegenerateDirectorySecretMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretRequest, com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse> getRegenerateDirectorySecretMethod;
    if ((getRegenerateDirectorySecretMethod = DirectoryServiceGrpc.getRegenerateDirectorySecretMethod) == null) {
      synchronized (DirectoryServiceGrpc.class) {
        if ((getRegenerateDirectorySecretMethod = DirectoryServiceGrpc.getRegenerateDirectorySecretMethod) == null) {
          DirectoryServiceGrpc.getRegenerateDirectorySecretMethod = getRegenerateDirectorySecretMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretRequest, com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegenerateDirectorySecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DirectoryServiceMethodDescriptorSupplier("RegenerateDirectorySecret"))
              .build();
        }
      }
    }
    return getRegenerateDirectorySecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.TriggerDirectorySyncRequest,
      com.google.protobuf.Empty> getTriggerDirectorySyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerDirectorySync",
      requestType = com.scalekit.grpc.scalekit.v1.directories.TriggerDirectorySyncRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.TriggerDirectorySyncRequest,
      com.google.protobuf.Empty> getTriggerDirectorySyncMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.directories.TriggerDirectorySyncRequest, com.google.protobuf.Empty> getTriggerDirectorySyncMethod;
    if ((getTriggerDirectorySyncMethod = DirectoryServiceGrpc.getTriggerDirectorySyncMethod) == null) {
      synchronized (DirectoryServiceGrpc.class) {
        if ((getTriggerDirectorySyncMethod = DirectoryServiceGrpc.getTriggerDirectorySyncMethod) == null) {
          DirectoryServiceGrpc.getTriggerDirectorySyncMethod = getTriggerDirectorySyncMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.directories.TriggerDirectorySyncRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerDirectorySync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.directories.TriggerDirectorySyncRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DirectoryServiceMethodDescriptorSupplier("TriggerDirectorySync"))
              .build();
        }
      }
    }
    return getTriggerDirectorySyncMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DirectoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DirectoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DirectoryServiceStub>() {
        @java.lang.Override
        public DirectoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DirectoryServiceStub(channel, callOptions);
        }
      };
    return DirectoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DirectoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DirectoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DirectoryServiceBlockingStub>() {
        @java.lang.Override
        public DirectoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DirectoryServiceBlockingStub(channel, callOptions);
        }
      };
    return DirectoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DirectoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DirectoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DirectoryServiceFutureStub>() {
        @java.lang.Override
        public DirectoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DirectoryServiceFutureStub(channel, callOptions);
        }
      };
    return DirectoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createDirectory(com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDirectoryMethod(), responseObserver);
    }

    /**
     */
    default void deleteDirectory(com.scalekit.grpc.scalekit.v1.directories.DeleteDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDirectoryMethod(), responseObserver);
    }

    /**
     */
    default void updateDirectory(com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDirectoryMethod(), responseObserver);
    }

    /**
     */
    default void assignGroupsForDirectory(com.scalekit.grpc.scalekit.v1.directories.AssignGroupsForDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignGroupsForDirectoryMethod(), responseObserver);
    }

    /**
     */
    default void assignRoles(com.scalekit.grpc.scalekit.v1.directories.AssignRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignRolesMethod(), responseObserver);
    }

    /**
     */
    default void updateAttributes(com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAttributesMethod(), responseObserver);
    }

    /**
     */
    default void getDirectory(com.scalekit.grpc.scalekit.v1.directories.GetDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.GetDirectoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDirectoryMethod(), responseObserver);
    }

    /**
     */
    default void listDirectories(com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDirectoriesMethod(), responseObserver);
    }

    /**
     */
    default void enableDirectory(com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableDirectoryMethod(), responseObserver);
    }

    /**
     */
    default void disableDirectory(com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableDirectoryMethod(), responseObserver);
    }

    /**
     */
    default void listDirectoryUsers(com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDirectoryUsersMethod(), responseObserver);
    }

    /**
     */
    default void listDirectoryGroups(com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDirectoryGroupsMethod(), responseObserver);
    }

    /**
     */
    default void listDirectoryGroupsSummary(com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsSummaryRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDirectoryGroupsSummaryMethod(), responseObserver);
    }

    /**
     */
    default void createDirectorySecret(com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDirectorySecretMethod(), responseObserver);
    }

    /**
     */
    default void regenerateDirectorySecret(com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegenerateDirectorySecretMethod(), responseObserver);
    }

    /**
     */
    default void triggerDirectorySync(com.scalekit.grpc.scalekit.v1.directories.TriggerDirectorySyncRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTriggerDirectorySyncMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DirectoryService.
   */
  public static abstract class DirectoryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DirectoryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DirectoryService.
   */
  public static final class DirectoryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DirectoryServiceStub> {
    private DirectoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DirectoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DirectoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void createDirectory(com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDirectoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDirectory(com.scalekit.grpc.scalekit.v1.directories.DeleteDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDirectoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDirectory(com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDirectoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignGroupsForDirectory(com.scalekit.grpc.scalekit.v1.directories.AssignGroupsForDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignGroupsForDirectoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignRoles(com.scalekit.grpc.scalekit.v1.directories.AssignRolesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAttributes(com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAttributesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDirectory(com.scalekit.grpc.scalekit.v1.directories.GetDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.GetDirectoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDirectoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDirectories(com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDirectoriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableDirectory(com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableDirectoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableDirectory(com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableDirectoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDirectoryUsers(com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDirectoryUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDirectoryGroups(com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDirectoryGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDirectoryGroupsSummary(com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsSummaryRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDirectoryGroupsSummaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createDirectorySecret(com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDirectorySecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void regenerateDirectorySecret(com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegenerateDirectorySecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void triggerDirectorySync(com.scalekit.grpc.scalekit.v1.directories.TriggerDirectorySyncRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTriggerDirectorySyncMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DirectoryService.
   */
  public static final class DirectoryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DirectoryServiceBlockingStub> {
    private DirectoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DirectoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DirectoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse createDirectory(com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDirectoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteDirectory(com.scalekit.grpc.scalekit.v1.directories.DeleteDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDirectoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryResponse updateDirectory(com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDirectoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty assignGroupsForDirectory(com.scalekit.grpc.scalekit.v1.directories.AssignGroupsForDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignGroupsForDirectoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse assignRoles(com.scalekit.grpc.scalekit.v1.directories.AssignRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesResponse updateAttributes(com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAttributesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.directories.GetDirectoryResponse getDirectory(com.scalekit.grpc.scalekit.v1.directories.GetDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDirectoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse listDirectories(com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDirectoriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse enableDirectory(com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableDirectoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse disableDirectory(com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableDirectoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersResponse listDirectoryUsers(com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDirectoryUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse listDirectoryGroups(com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDirectoryGroupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse listDirectoryGroupsSummary(com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsSummaryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDirectoryGroupsSummaryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretResponse createDirectorySecret(com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDirectorySecretMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse regenerateDirectorySecret(com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegenerateDirectorySecretMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty triggerDirectorySync(com.scalekit.grpc.scalekit.v1.directories.TriggerDirectorySyncRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTriggerDirectorySyncMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DirectoryService.
   */
  public static final class DirectoryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DirectoryServiceFutureStub> {
    private DirectoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DirectoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DirectoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse> createDirectory(
        com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDirectoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDirectory(
        com.scalekit.grpc.scalekit.v1.directories.DeleteDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDirectoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryResponse> updateDirectory(
        com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDirectoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> assignGroupsForDirectory(
        com.scalekit.grpc.scalekit.v1.directories.AssignGroupsForDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignGroupsForDirectoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse> assignRoles(
        com.scalekit.grpc.scalekit.v1.directories.AssignRolesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesResponse> updateAttributes(
        com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAttributesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.directories.GetDirectoryResponse> getDirectory(
        com.scalekit.grpc.scalekit.v1.directories.GetDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDirectoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse> listDirectories(
        com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDirectoriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse> enableDirectory(
        com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableDirectoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse> disableDirectory(
        com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableDirectoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersResponse> listDirectoryUsers(
        com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDirectoryUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse> listDirectoryGroups(
        com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDirectoryGroupsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse> listDirectoryGroupsSummary(
        com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsSummaryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDirectoryGroupsSummaryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretResponse> createDirectorySecret(
        com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDirectorySecretMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse> regenerateDirectorySecret(
        com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegenerateDirectorySecretMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> triggerDirectorySync(
        com.scalekit.grpc.scalekit.v1.directories.TriggerDirectorySyncRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTriggerDirectorySyncMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DIRECTORY = 0;
  private static final int METHODID_DELETE_DIRECTORY = 1;
  private static final int METHODID_UPDATE_DIRECTORY = 2;
  private static final int METHODID_ASSIGN_GROUPS_FOR_DIRECTORY = 3;
  private static final int METHODID_ASSIGN_ROLES = 4;
  private static final int METHODID_UPDATE_ATTRIBUTES = 5;
  private static final int METHODID_GET_DIRECTORY = 6;
  private static final int METHODID_LIST_DIRECTORIES = 7;
  private static final int METHODID_ENABLE_DIRECTORY = 8;
  private static final int METHODID_DISABLE_DIRECTORY = 9;
  private static final int METHODID_LIST_DIRECTORY_USERS = 10;
  private static final int METHODID_LIST_DIRECTORY_GROUPS = 11;
  private static final int METHODID_LIST_DIRECTORY_GROUPS_SUMMARY = 12;
  private static final int METHODID_CREATE_DIRECTORY_SECRET = 13;
  private static final int METHODID_REGENERATE_DIRECTORY_SECRET = 14;
  private static final int METHODID_TRIGGER_DIRECTORY_SYNC = 15;

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
        case METHODID_CREATE_DIRECTORY:
          serviceImpl.createDirectory((com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse>) responseObserver);
          break;
        case METHODID_DELETE_DIRECTORY:
          serviceImpl.deleteDirectory((com.scalekit.grpc.scalekit.v1.directories.DeleteDirectoryRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_DIRECTORY:
          serviceImpl.updateDirectory((com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_GROUPS_FOR_DIRECTORY:
          serviceImpl.assignGroupsForDirectory((com.scalekit.grpc.scalekit.v1.directories.AssignGroupsForDirectoryRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ASSIGN_ROLES:
          serviceImpl.assignRoles((com.scalekit.grpc.scalekit.v1.directories.AssignRolesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ATTRIBUTES:
          serviceImpl.updateAttributes((com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesResponse>) responseObserver);
          break;
        case METHODID_GET_DIRECTORY:
          serviceImpl.getDirectory((com.scalekit.grpc.scalekit.v1.directories.GetDirectoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.GetDirectoryResponse>) responseObserver);
          break;
        case METHODID_LIST_DIRECTORIES:
          serviceImpl.listDirectories((com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse>) responseObserver);
          break;
        case METHODID_ENABLE_DIRECTORY:
          serviceImpl.enableDirectory((com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse>) responseObserver);
          break;
        case METHODID_DISABLE_DIRECTORY:
          serviceImpl.disableDirectory((com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse>) responseObserver);
          break;
        case METHODID_LIST_DIRECTORY_USERS:
          serviceImpl.listDirectoryUsers((com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersResponse>) responseObserver);
          break;
        case METHODID_LIST_DIRECTORY_GROUPS:
          serviceImpl.listDirectoryGroups((com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse>) responseObserver);
          break;
        case METHODID_LIST_DIRECTORY_GROUPS_SUMMARY:
          serviceImpl.listDirectoryGroupsSummary((com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsSummaryRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE_DIRECTORY_SECRET:
          serviceImpl.createDirectorySecret((com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretResponse>) responseObserver);
          break;
        case METHODID_REGENERATE_DIRECTORY_SECRET:
          serviceImpl.regenerateDirectorySecret((com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse>) responseObserver);
          break;
        case METHODID_TRIGGER_DIRECTORY_SYNC:
          serviceImpl.triggerDirectorySync((com.scalekit.grpc.scalekit.v1.directories.TriggerDirectorySyncRequest) request,
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
          getCreateDirectoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryRequest,
              com.scalekit.grpc.scalekit.v1.directories.CreateDirectoryResponse>(
                service, METHODID_CREATE_DIRECTORY)))
        .addMethod(
          getDeleteDirectoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.directories.DeleteDirectoryRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_DIRECTORY)))
        .addMethod(
          getUpdateDirectoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryRequest,
              com.scalekit.grpc.scalekit.v1.directories.UpdateDirectoryResponse>(
                service, METHODID_UPDATE_DIRECTORY)))
        .addMethod(
          getAssignGroupsForDirectoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.directories.AssignGroupsForDirectoryRequest,
              com.google.protobuf.Empty>(
                service, METHODID_ASSIGN_GROUPS_FOR_DIRECTORY)))
        .addMethod(
          getAssignRolesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.directories.AssignRolesRequest,
              com.scalekit.grpc.scalekit.v1.directories.AssignRolesResponse>(
                service, METHODID_ASSIGN_ROLES)))
        .addMethod(
          getUpdateAttributesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesRequest,
              com.scalekit.grpc.scalekit.v1.directories.UpdateAttributesResponse>(
                service, METHODID_UPDATE_ATTRIBUTES)))
        .addMethod(
          getGetDirectoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.directories.GetDirectoryRequest,
              com.scalekit.grpc.scalekit.v1.directories.GetDirectoryResponse>(
                service, METHODID_GET_DIRECTORY)))
        .addMethod(
          getListDirectoriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesRequest,
              com.scalekit.grpc.scalekit.v1.directories.ListDirectoriesResponse>(
                service, METHODID_LIST_DIRECTORIES)))
        .addMethod(
          getEnableDirectoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest,
              com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse>(
                service, METHODID_ENABLE_DIRECTORY)))
        .addMethod(
          getDisableDirectoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryRequest,
              com.scalekit.grpc.scalekit.v1.directories.ToggleDirectoryResponse>(
                service, METHODID_DISABLE_DIRECTORY)))
        .addMethod(
          getListDirectoryUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersRequest,
              com.scalekit.grpc.scalekit.v1.directories.ListDirectoryUsersResponse>(
                service, METHODID_LIST_DIRECTORY_USERS)))
        .addMethod(
          getListDirectoryGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsRequest,
              com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse>(
                service, METHODID_LIST_DIRECTORY_GROUPS)))
        .addMethod(
          getListDirectoryGroupsSummaryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsSummaryRequest,
              com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse>(
                service, METHODID_LIST_DIRECTORY_GROUPS_SUMMARY)))
        .addMethod(
          getCreateDirectorySecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretRequest,
              com.scalekit.grpc.scalekit.v1.directories.CreateDirectorySecretResponse>(
                service, METHODID_CREATE_DIRECTORY_SECRET)))
        .addMethod(
          getRegenerateDirectorySecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretRequest,
              com.scalekit.grpc.scalekit.v1.directories.RegenerateDirectorySecretResponse>(
                service, METHODID_REGENERATE_DIRECTORY_SECRET)))
        .addMethod(
          getTriggerDirectorySyncMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.directories.TriggerDirectorySyncRequest,
              com.google.protobuf.Empty>(
                service, METHODID_TRIGGER_DIRECTORY_SYNC)))
        .build();
  }

  private static abstract class DirectoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DirectoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.directories.DirectoriesProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DirectoryService");
    }
  }

  private static final class DirectoryServiceFileDescriptorSupplier
      extends DirectoryServiceBaseDescriptorSupplier {
    DirectoryServiceFileDescriptorSupplier() {}
  }

  private static final class DirectoryServiceMethodDescriptorSupplier
      extends DirectoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DirectoryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DirectoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DirectoryServiceFileDescriptorSupplier())
              .addMethod(getCreateDirectoryMethod())
              .addMethod(getDeleteDirectoryMethod())
              .addMethod(getUpdateDirectoryMethod())
              .addMethod(getAssignGroupsForDirectoryMethod())
              .addMethod(getAssignRolesMethod())
              .addMethod(getUpdateAttributesMethod())
              .addMethod(getGetDirectoryMethod())
              .addMethod(getListDirectoriesMethod())
              .addMethod(getEnableDirectoryMethod())
              .addMethod(getDisableDirectoryMethod())
              .addMethod(getListDirectoryUsersMethod())
              .addMethod(getListDirectoryGroupsMethod())
              .addMethod(getListDirectoryGroupsSummaryMethod())
              .addMethod(getCreateDirectorySecretMethod())
              .addMethod(getRegenerateDirectorySecretMethod())
              .addMethod(getTriggerDirectorySyncMethod())
              .build();
        }
      }
    }
    return result;
  }
}
