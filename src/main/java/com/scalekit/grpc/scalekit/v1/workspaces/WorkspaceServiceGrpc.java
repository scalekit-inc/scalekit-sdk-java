package com.scalekit.grpc.scalekit.v1.workspaces;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/workspaces/workspaces.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WorkspaceServiceGrpc {

  private WorkspaceServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.workspaces.WorkspaceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceResponse> getCreateWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWorkspace",
      requestType = com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceResponse> getCreateWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest, com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceResponse> getCreateWorkspaceMethod;
    if ((getCreateWorkspaceMethod = WorkspaceServiceGrpc.getCreateWorkspaceMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getCreateWorkspaceMethod = WorkspaceServiceGrpc.getCreateWorkspaceMethod) == null) {
          WorkspaceServiceGrpc.getCreateWorkspaceMethod = getCreateWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest, com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("CreateWorkspace"))
              .build();
        }
      }
    }
    return getCreateWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse> getGetWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWorkspace",
      requestType = com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse> getGetWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceRequest, com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse> getGetWorkspaceMethod;
    if ((getGetWorkspaceMethod = WorkspaceServiceGrpc.getGetWorkspaceMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getGetWorkspaceMethod = WorkspaceServiceGrpc.getGetWorkspaceMethod) == null) {
          WorkspaceServiceGrpc.getGetWorkspaceMethod = getGetWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceRequest, com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("GetWorkspace"))
              .build();
        }
      }
    }
    return getGetWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetCurrentWorkspaceRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse> getGetCurrentWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentWorkspace",
      requestType = com.scalekit.grpc.scalekit.v1.workspaces.GetCurrentWorkspaceRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetCurrentWorkspaceRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse> getGetCurrentWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetCurrentWorkspaceRequest, com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse> getGetCurrentWorkspaceMethod;
    if ((getGetCurrentWorkspaceMethod = WorkspaceServiceGrpc.getGetCurrentWorkspaceMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getGetCurrentWorkspaceMethod = WorkspaceServiceGrpc.getGetCurrentWorkspaceMethod) == null) {
          WorkspaceServiceGrpc.getGetCurrentWorkspaceMethod = getGetCurrentWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.workspaces.GetCurrentWorkspaceRequest, com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.GetCurrentWorkspaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("GetCurrentWorkspace"))
              .build();
        }
      }
    }
    return getGetCurrentWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse> getUpdateWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWorkspace",
      requestType = com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse> getUpdateWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceRequest, com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse> getUpdateWorkspaceMethod;
    if ((getUpdateWorkspaceMethod = WorkspaceServiceGrpc.getUpdateWorkspaceMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getUpdateWorkspaceMethod = WorkspaceServiceGrpc.getUpdateWorkspaceMethod) == null) {
          WorkspaceServiceGrpc.getUpdateWorkspaceMethod = getUpdateWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceRequest, com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("UpdateWorkspace"))
              .build();
        }
      }
    }
    return getUpdateWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.OnboardWorkspaceRequest,
      com.google.protobuf.Empty> getOnboardWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnboardWorkspace",
      requestType = com.scalekit.grpc.scalekit.v1.workspaces.OnboardWorkspaceRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.OnboardWorkspaceRequest,
      com.google.protobuf.Empty> getOnboardWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.OnboardWorkspaceRequest, com.google.protobuf.Empty> getOnboardWorkspaceMethod;
    if ((getOnboardWorkspaceMethod = WorkspaceServiceGrpc.getOnboardWorkspaceMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getOnboardWorkspaceMethod = WorkspaceServiceGrpc.getOnboardWorkspaceMethod) == null) {
          WorkspaceServiceGrpc.getOnboardWorkspaceMethod = getOnboardWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.workspaces.OnboardWorkspaceRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnboardWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.OnboardWorkspaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("OnboardWorkspace"))
              .build();
        }
      }
    }
    return getOnboardWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.UpdateCurrentWorkspaceRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse> getUpdateCurrentWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCurrentWorkspace",
      requestType = com.scalekit.grpc.scalekit.v1.workspaces.UpdateCurrentWorkspaceRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.UpdateCurrentWorkspaceRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse> getUpdateCurrentWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.UpdateCurrentWorkspaceRequest, com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse> getUpdateCurrentWorkspaceMethod;
    if ((getUpdateCurrentWorkspaceMethod = WorkspaceServiceGrpc.getUpdateCurrentWorkspaceMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getUpdateCurrentWorkspaceMethod = WorkspaceServiceGrpc.getUpdateCurrentWorkspaceMethod) == null) {
          WorkspaceServiceGrpc.getUpdateCurrentWorkspaceMethod = getUpdateCurrentWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.workspaces.UpdateCurrentWorkspaceRequest, com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCurrentWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.UpdateCurrentWorkspaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("UpdateCurrentWorkspace"))
              .build();
        }
      }
    }
    return getUpdateCurrentWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsResponse> getGetWorkspaceSubscriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWorkspaceSubscriptions",
      requestType = com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsResponse> getGetWorkspaceSubscriptionsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsRequest, com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsResponse> getGetWorkspaceSubscriptionsMethod;
    if ((getGetWorkspaceSubscriptionsMethod = WorkspaceServiceGrpc.getGetWorkspaceSubscriptionsMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getGetWorkspaceSubscriptionsMethod = WorkspaceServiceGrpc.getGetWorkspaceSubscriptionsMethod) == null) {
          WorkspaceServiceGrpc.getGetWorkspaceSubscriptionsMethod = getGetWorkspaceSubscriptionsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsRequest, com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWorkspaceSubscriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("GetWorkspaceSubscriptions"))
              .build();
        }
      }
    }
    return getGetWorkspaceSubscriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableResponse> getGetWorkspacePricingTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWorkspacePricingTable",
      requestType = com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableResponse> getGetWorkspacePricingTableMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableRequest, com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableResponse> getGetWorkspacePricingTableMethod;
    if ((getGetWorkspacePricingTableMethod = WorkspaceServiceGrpc.getGetWorkspacePricingTableMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getGetWorkspacePricingTableMethod = WorkspaceServiceGrpc.getGetWorkspacePricingTableMethod) == null) {
          WorkspaceServiceGrpc.getGetWorkspacePricingTableMethod = getGetWorkspacePricingTableMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableRequest, com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWorkspacePricingTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("GetWorkspacePricingTable"))
              .build();
        }
      }
    }
    return getGetWorkspacePricingTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalResponse> getGetBillingPortalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillingPortal",
      requestType = com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalResponse> getGetBillingPortalMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalRequest, com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalResponse> getGetBillingPortalMethod;
    if ((getGetBillingPortalMethod = WorkspaceServiceGrpc.getGetBillingPortalMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getGetBillingPortalMethod = WorkspaceServiceGrpc.getGetBillingPortalMethod) == null) {
          WorkspaceServiceGrpc.getGetBillingPortalMethod = getGetBillingPortalMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalRequest, com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBillingPortal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("GetBillingPortal"))
              .build();
        }
      }
    }
    return getGetBillingPortalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoResponse> getGetBillingInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillingInfo",
      requestType = com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoResponse> getGetBillingInfoMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoRequest, com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoResponse> getGetBillingInfoMethod;
    if ((getGetBillingInfoMethod = WorkspaceServiceGrpc.getGetBillingInfoMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getGetBillingInfoMethod = WorkspaceServiceGrpc.getGetBillingInfoMethod) == null) {
          WorkspaceServiceGrpc.getGetBillingInfoMethod = getGetBillingInfoMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoRequest, com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBillingInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("GetBillingInfo"))
              .build();
        }
      }
    }
    return getGetBillingInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageResponse> getGetProductUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductUsage",
      requestType = com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageResponse> getGetProductUsageMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageRequest, com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageResponse> getGetProductUsageMethod;
    if ((getGetProductUsageMethod = WorkspaceServiceGrpc.getGetProductUsageMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getGetProductUsageMethod = WorkspaceServiceGrpc.getGetProductUsageMethod) == null) {
          WorkspaceServiceGrpc.getGetProductUsageMethod = getGetProductUsageMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageRequest, com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("GetProductUsage"))
              .build();
        }
      }
    }
    return getGetProductUsageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogResponse> getGetProductCatalogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductCatalog",
      requestType = com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogResponse> getGetProductCatalogMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogRequest, com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogResponse> getGetProductCatalogMethod;
    if ((getGetProductCatalogMethod = WorkspaceServiceGrpc.getGetProductCatalogMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getGetProductCatalogMethod = WorkspaceServiceGrpc.getGetProductCatalogMethod) == null) {
          WorkspaceServiceGrpc.getGetProductCatalogMethod = getGetProductCatalogMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogRequest, com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductCatalog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("GetProductCatalog"))
              .build();
        }
      }
    }
    return getGetProductCatalogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionResponse> getAddSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSubscription",
      requestType = com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionResponse> getAddSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionRequest, com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionResponse> getAddSubscriptionMethod;
    if ((getAddSubscriptionMethod = WorkspaceServiceGrpc.getAddSubscriptionMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getAddSubscriptionMethod = WorkspaceServiceGrpc.getAddSubscriptionMethod) == null) {
          WorkspaceServiceGrpc.getAddSubscriptionMethod = getAddSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionRequest, com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("AddSubscription"))
              .build();
        }
      }
    }
    return getAddSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionResponse> getCreateCheckoutSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCheckoutSession",
      requestType = com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionResponse> getCreateCheckoutSessionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionRequest, com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionResponse> getCreateCheckoutSessionMethod;
    if ((getCreateCheckoutSessionMethod = WorkspaceServiceGrpc.getCreateCheckoutSessionMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getCreateCheckoutSessionMethod = WorkspaceServiceGrpc.getCreateCheckoutSessionMethod) == null) {
          WorkspaceServiceGrpc.getCreateCheckoutSessionMethod = getCreateCheckoutSessionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionRequest, com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCheckoutSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("CreateCheckoutSession"))
              .build();
        }
      }
    }
    return getCreateCheckoutSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextResponse> getUpdateWorkspaceContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWorkspaceContext",
      requestType = com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextRequest,
      com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextResponse> getUpdateWorkspaceContextMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextRequest, com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextResponse> getUpdateWorkspaceContextMethod;
    if ((getUpdateWorkspaceContextMethod = WorkspaceServiceGrpc.getUpdateWorkspaceContextMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getUpdateWorkspaceContextMethod = WorkspaceServiceGrpc.getUpdateWorkspaceContextMethod) == null) {
          WorkspaceServiceGrpc.getUpdateWorkspaceContextMethod = getUpdateWorkspaceContextMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextRequest, com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWorkspaceContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("UpdateWorkspaceContext"))
              .build();
        }
      }
    }
    return getUpdateWorkspaceContextMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkspaceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkspaceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkspaceServiceStub>() {
        @java.lang.Override
        public WorkspaceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkspaceServiceStub(channel, callOptions);
        }
      };
    return WorkspaceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkspaceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkspaceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkspaceServiceBlockingStub>() {
        @java.lang.Override
        public WorkspaceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkspaceServiceBlockingStub(channel, callOptions);
        }
      };
    return WorkspaceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkspaceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkspaceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkspaceServiceFutureStub>() {
        @java.lang.Override
        public WorkspaceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkspaceServiceFutureStub(channel, callOptions);
        }
      };
    return WorkspaceServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWorkspaceMethod(), responseObserver);
    }

    /**
     */
    default void getWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWorkspaceMethod(), responseObserver);
    }

    /**
     */
    default void getCurrentWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.GetCurrentWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentWorkspaceMethod(), responseObserver);
    }

    /**
     */
    default void updateWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWorkspaceMethod(), responseObserver);
    }

    /**
     */
    default void onboardWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.OnboardWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnboardWorkspaceMethod(), responseObserver);
    }

    /**
     */
    default void updateCurrentWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.UpdateCurrentWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCurrentWorkspaceMethod(), responseObserver);
    }

    /**
     */
    default void getWorkspaceSubscriptions(com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWorkspaceSubscriptionsMethod(), responseObserver);
    }

    /**
     */
    default void getWorkspacePricingTable(com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWorkspacePricingTableMethod(), responseObserver);
    }

    /**
     */
    default void getBillingPortal(com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBillingPortalMethod(), responseObserver);
    }

    /**
     */
    default void getBillingInfo(com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBillingInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves current product usage and tiered pricing for the current preview billing period.
     * Primary action: Provide dynamic, in-period usage metrics and per-product pricing breakdown for charge preview.
     * Use cases: Show customers an estimate of charges before final invoicing; display usage details per product/feature.
     * Request: GetProductUsageRequest (workspace context/session); supports filtering by product/feature where applicable.
     * Response: GetProductUsageResponse:
     *   - line_items: per-product entries with usage counts (units), measurement granularity (e.g., requests, seats, GB), and aggregation window.
     *   - pricing_tiers: tiered structure for each line item (thresholds, unit_price per tier, effective applied tier), and computed effective_price.
     *   - totals: preview period monetary amounts (subtotal, taxes, discounts/credits, total) in minor units with currency.
     *   - notes: indicators for metered vs seat-based products, and whether usage is still accumulating.
     * Behavior and differences vs GetProductCatalog:
     *   - Invoice preview vs final: values are estimates until the billing period closes; final invoice may differ due to late-reported usage or adjustments.
     *   - Dynamic vs static: GetProductUsage reflects actual/accumulating usage and applied tiers for the current period; GetProductCatalog exposes static product/pricing definitions without usage.
     *   - Use pricing_tiers and effective_price to explain how the preview total was derived per product (including cross-tier allocations).
     *   - Late or batched usage may update line_items before finalization; clients should refresh periodically for up-to-date previews.
     * Returns payment methods, plan, last invoice, current invoice period, etc.
     * </pre>
     */
    default void getProductUsage(com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductUsageMethod(), responseObserver);
    }

    /**
     */
    default void getProductCatalog(com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductCatalogMethod(), responseObserver);
    }

    /**
     */
    default void addSubscription(com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a checkout session for the current workspace's billing operations.
     * Primary action: Establish a client-facing checkout experience to start, update, or complete billing
     *                 actions such as subscriptions, plan changes, trials, add-ons, and one-time payments.
     * Use cases:
     *   - Initiate payment collection when upgrading/downgrading plans or adding paid features.
     *   - Set up a new subscription or resume an incomplete payment.
     *   - Collect payment method for future charges (setup mode) prior to enabling paid features.
     *   - Start a one-time payment flow for metered usage or add-on purchases.
     * Request (CreateCheckoutSessionRequest):
     *   - mode: Required. One of {SUBSCRIPTION | PAYMENT | SETUP}. Determines the billing flow:
     *       * SUBSCRIPTION: Creates/updates a workspace subscription; may require payment method.
     *       * PAYMENT: Creates a one-time payment intent for immediate charge.
     *       * SETUP: Collects a payment method for future use without immediate charge.
     *   - items: Optional. Line items or price identifiers; required when mode=SUBSCRIPTION or PAYMENT.
     *            Each item must include a valid price_id and quantity &gt; 0. Prices must be active.
     *   - return_url: Optional. URL to redirect the client after successful completion or cancellation.
     *                 Must be HTTPS and belong to an allowed domain; max length constraints apply.
     *   - success_url: Optional. Explicit success redirect for hosted checkout; must be HTTPS and allowed.
     *   - ui_mode: Optional. One of {EMBEDDED | HOSTED | CUSTOM}. Controls client integration modality.
     *   - metadata: Optional. Key-value pairs (string) for audit/correlation; keys/values length limited.
     *   - customer_id / workspace_id: Optional. If omitted, inferred from the authenticated workspace session.
     * Validation rules:
     *   - Authentication: Requires WORKSPACE_CLIENT. Caller must be authorized for billing actions.
     *   - For SUBSCRIPTION/PAYMENT: items must be present and valid; unsupported/archived prices are rejected.
     *   - URLs (return_url/success_url) must match allowed origins; invalid URLs are rejected.
     *   - Only one active session per workspace per identical parameter set is allowed (idempotency).
     * Response (CreateCheckoutSessionResponse):
     *   - session_id: Identifier of the created checkout session; use to query status or resume flow.
     *   - client_secret: Secret for client-side SDKs (e.g., embedded UI). Treat as sensitive; never log.
     *   - url: Hosted checkout URL when ui_mode=HOSTED or CUSTOM; omitted for EMBEDDED flows.
     *   - mode: Echoes the requested mode for clarity.
     *   - expires_at: UTC timestamp when the session becomes invalid (e.g., 24 hours from creation).
     *   - status: Initial session status (e.g., CREATED). May be polled for updates via billing status RPCs.
     * Behavior notes:
     *   - Idempotency: Repeated calls with identical parameters within the expiration window return
     *                  the existing session (same session_id). Parameter differences create new sessions.
     *   - Security: client_secret is required for embedded checkout initialization; do not expose publicly.
     *   - URL population: url is provided only for HOSTED/CUSTOM UI modes; EMBEDDED flows rely on client_secret.
     *   - Expiration: Sessions expire after a fixed window; clients must complete the flow before expires_at.
     *   - Retries: Safe to retry on transient errors; if parameters match, the same session is returned.
     * Side effects:
     *   - Creates a Stripe Checkout/Payment/Setup Session depending on mode and items.
     *   - May create or update customer records, subscriptions, payment intents, and attach payment methods.
     *   - Hosted session URLs are short-lived and will be invalid after expiration.
     * </pre>
     */
    default void createCheckoutSession(com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCheckoutSessionMethod(), responseObserver);
    }

    /**
     */
    default void updateWorkspaceContext(com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWorkspaceContextMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WorkspaceService.
   */
  public static abstract class WorkspaceServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WorkspaceServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WorkspaceService.
   */
  public static final class WorkspaceServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WorkspaceServiceStub> {
    private WorkspaceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkspaceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkspaceServiceStub(channel, callOptions);
    }

    /**
     */
    public void createWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCurrentWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.GetCurrentWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onboardWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.OnboardWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnboardWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCurrentWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.UpdateCurrentWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCurrentWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWorkspaceSubscriptions(com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWorkspaceSubscriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWorkspacePricingTable(com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWorkspacePricingTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBillingPortal(com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBillingPortalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBillingInfo(com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBillingInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves current product usage and tiered pricing for the current preview billing period.
     * Primary action: Provide dynamic, in-period usage metrics and per-product pricing breakdown for charge preview.
     * Use cases: Show customers an estimate of charges before final invoicing; display usage details per product/feature.
     * Request: GetProductUsageRequest (workspace context/session); supports filtering by product/feature where applicable.
     * Response: GetProductUsageResponse:
     *   - line_items: per-product entries with usage counts (units), measurement granularity (e.g., requests, seats, GB), and aggregation window.
     *   - pricing_tiers: tiered structure for each line item (thresholds, unit_price per tier, effective applied tier), and computed effective_price.
     *   - totals: preview period monetary amounts (subtotal, taxes, discounts/credits, total) in minor units with currency.
     *   - notes: indicators for metered vs seat-based products, and whether usage is still accumulating.
     * Behavior and differences vs GetProductCatalog:
     *   - Invoice preview vs final: values are estimates until the billing period closes; final invoice may differ due to late-reported usage or adjustments.
     *   - Dynamic vs static: GetProductUsage reflects actual/accumulating usage and applied tiers for the current period; GetProductCatalog exposes static product/pricing definitions without usage.
     *   - Use pricing_tiers and effective_price to explain how the preview total was derived per product (including cross-tier allocations).
     *   - Late or batched usage may update line_items before finalization; clients should refresh periodically for up-to-date previews.
     * Returns payment methods, plan, last invoice, current invoice period, etc.
     * </pre>
     */
    public void getProductUsage(com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductUsageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductCatalog(com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductCatalogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSubscription(com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a checkout session for the current workspace's billing operations.
     * Primary action: Establish a client-facing checkout experience to start, update, or complete billing
     *                 actions such as subscriptions, plan changes, trials, add-ons, and one-time payments.
     * Use cases:
     *   - Initiate payment collection when upgrading/downgrading plans or adding paid features.
     *   - Set up a new subscription or resume an incomplete payment.
     *   - Collect payment method for future charges (setup mode) prior to enabling paid features.
     *   - Start a one-time payment flow for metered usage or add-on purchases.
     * Request (CreateCheckoutSessionRequest):
     *   - mode: Required. One of {SUBSCRIPTION | PAYMENT | SETUP}. Determines the billing flow:
     *       * SUBSCRIPTION: Creates/updates a workspace subscription; may require payment method.
     *       * PAYMENT: Creates a one-time payment intent for immediate charge.
     *       * SETUP: Collects a payment method for future use without immediate charge.
     *   - items: Optional. Line items or price identifiers; required when mode=SUBSCRIPTION or PAYMENT.
     *            Each item must include a valid price_id and quantity &gt; 0. Prices must be active.
     *   - return_url: Optional. URL to redirect the client after successful completion or cancellation.
     *                 Must be HTTPS and belong to an allowed domain; max length constraints apply.
     *   - success_url: Optional. Explicit success redirect for hosted checkout; must be HTTPS and allowed.
     *   - ui_mode: Optional. One of {EMBEDDED | HOSTED | CUSTOM}. Controls client integration modality.
     *   - metadata: Optional. Key-value pairs (string) for audit/correlation; keys/values length limited.
     *   - customer_id / workspace_id: Optional. If omitted, inferred from the authenticated workspace session.
     * Validation rules:
     *   - Authentication: Requires WORKSPACE_CLIENT. Caller must be authorized for billing actions.
     *   - For SUBSCRIPTION/PAYMENT: items must be present and valid; unsupported/archived prices are rejected.
     *   - URLs (return_url/success_url) must match allowed origins; invalid URLs are rejected.
     *   - Only one active session per workspace per identical parameter set is allowed (idempotency).
     * Response (CreateCheckoutSessionResponse):
     *   - session_id: Identifier of the created checkout session; use to query status or resume flow.
     *   - client_secret: Secret for client-side SDKs (e.g., embedded UI). Treat as sensitive; never log.
     *   - url: Hosted checkout URL when ui_mode=HOSTED or CUSTOM; omitted for EMBEDDED flows.
     *   - mode: Echoes the requested mode for clarity.
     *   - expires_at: UTC timestamp when the session becomes invalid (e.g., 24 hours from creation).
     *   - status: Initial session status (e.g., CREATED). May be polled for updates via billing status RPCs.
     * Behavior notes:
     *   - Idempotency: Repeated calls with identical parameters within the expiration window return
     *                  the existing session (same session_id). Parameter differences create new sessions.
     *   - Security: client_secret is required for embedded checkout initialization; do not expose publicly.
     *   - URL population: url is provided only for HOSTED/CUSTOM UI modes; EMBEDDED flows rely on client_secret.
     *   - Expiration: Sessions expire after a fixed window; clients must complete the flow before expires_at.
     *   - Retries: Safe to retry on transient errors; if parameters match, the same session is returned.
     * Side effects:
     *   - Creates a Stripe Checkout/Payment/Setup Session depending on mode and items.
     *   - May create or update customer records, subscriptions, payment intents, and attach payment methods.
     *   - Hosted session URLs are short-lived and will be invalid after expiration.
     * </pre>
     */
    public void createCheckoutSession(com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCheckoutSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateWorkspaceContext(com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWorkspaceContextMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WorkspaceService.
   */
  public static final class WorkspaceServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WorkspaceServiceBlockingStub> {
    private WorkspaceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkspaceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkspaceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceResponse createWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse getWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse getCurrentWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.GetCurrentWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse updateWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty onboardWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.OnboardWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnboardWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse updateCurrentWorkspace(com.scalekit.grpc.scalekit.v1.workspaces.UpdateCurrentWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCurrentWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsResponse getWorkspaceSubscriptions(com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWorkspaceSubscriptionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableResponse getWorkspacePricingTable(com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWorkspacePricingTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalResponse getBillingPortal(com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBillingPortalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoResponse getBillingInfo(com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBillingInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves current product usage and tiered pricing for the current preview billing period.
     * Primary action: Provide dynamic, in-period usage metrics and per-product pricing breakdown for charge preview.
     * Use cases: Show customers an estimate of charges before final invoicing; display usage details per product/feature.
     * Request: GetProductUsageRequest (workspace context/session); supports filtering by product/feature where applicable.
     * Response: GetProductUsageResponse:
     *   - line_items: per-product entries with usage counts (units), measurement granularity (e.g., requests, seats, GB), and aggregation window.
     *   - pricing_tiers: tiered structure for each line item (thresholds, unit_price per tier, effective applied tier), and computed effective_price.
     *   - totals: preview period monetary amounts (subtotal, taxes, discounts/credits, total) in minor units with currency.
     *   - notes: indicators for metered vs seat-based products, and whether usage is still accumulating.
     * Behavior and differences vs GetProductCatalog:
     *   - Invoice preview vs final: values are estimates until the billing period closes; final invoice may differ due to late-reported usage or adjustments.
     *   - Dynamic vs static: GetProductUsage reflects actual/accumulating usage and applied tiers for the current period; GetProductCatalog exposes static product/pricing definitions without usage.
     *   - Use pricing_tiers and effective_price to explain how the preview total was derived per product (including cross-tier allocations).
     *   - Late or batched usage may update line_items before finalization; clients should refresh periodically for up-to-date previews.
     * Returns payment methods, plan, last invoice, current invoice period, etc.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageResponse getProductUsage(com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductUsageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogResponse getProductCatalog(com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductCatalogMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionResponse addSubscription(com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a checkout session for the current workspace's billing operations.
     * Primary action: Establish a client-facing checkout experience to start, update, or complete billing
     *                 actions such as subscriptions, plan changes, trials, add-ons, and one-time payments.
     * Use cases:
     *   - Initiate payment collection when upgrading/downgrading plans or adding paid features.
     *   - Set up a new subscription or resume an incomplete payment.
     *   - Collect payment method for future charges (setup mode) prior to enabling paid features.
     *   - Start a one-time payment flow for metered usage or add-on purchases.
     * Request (CreateCheckoutSessionRequest):
     *   - mode: Required. One of {SUBSCRIPTION | PAYMENT | SETUP}. Determines the billing flow:
     *       * SUBSCRIPTION: Creates/updates a workspace subscription; may require payment method.
     *       * PAYMENT: Creates a one-time payment intent for immediate charge.
     *       * SETUP: Collects a payment method for future use without immediate charge.
     *   - items: Optional. Line items or price identifiers; required when mode=SUBSCRIPTION or PAYMENT.
     *            Each item must include a valid price_id and quantity &gt; 0. Prices must be active.
     *   - return_url: Optional. URL to redirect the client after successful completion or cancellation.
     *                 Must be HTTPS and belong to an allowed domain; max length constraints apply.
     *   - success_url: Optional. Explicit success redirect for hosted checkout; must be HTTPS and allowed.
     *   - ui_mode: Optional. One of {EMBEDDED | HOSTED | CUSTOM}. Controls client integration modality.
     *   - metadata: Optional. Key-value pairs (string) for audit/correlation; keys/values length limited.
     *   - customer_id / workspace_id: Optional. If omitted, inferred from the authenticated workspace session.
     * Validation rules:
     *   - Authentication: Requires WORKSPACE_CLIENT. Caller must be authorized for billing actions.
     *   - For SUBSCRIPTION/PAYMENT: items must be present and valid; unsupported/archived prices are rejected.
     *   - URLs (return_url/success_url) must match allowed origins; invalid URLs are rejected.
     *   - Only one active session per workspace per identical parameter set is allowed (idempotency).
     * Response (CreateCheckoutSessionResponse):
     *   - session_id: Identifier of the created checkout session; use to query status or resume flow.
     *   - client_secret: Secret for client-side SDKs (e.g., embedded UI). Treat as sensitive; never log.
     *   - url: Hosted checkout URL when ui_mode=HOSTED or CUSTOM; omitted for EMBEDDED flows.
     *   - mode: Echoes the requested mode for clarity.
     *   - expires_at: UTC timestamp when the session becomes invalid (e.g., 24 hours from creation).
     *   - status: Initial session status (e.g., CREATED). May be polled for updates via billing status RPCs.
     * Behavior notes:
     *   - Idempotency: Repeated calls with identical parameters within the expiration window return
     *                  the existing session (same session_id). Parameter differences create new sessions.
     *   - Security: client_secret is required for embedded checkout initialization; do not expose publicly.
     *   - URL population: url is provided only for HOSTED/CUSTOM UI modes; EMBEDDED flows rely on client_secret.
     *   - Expiration: Sessions expire after a fixed window; clients must complete the flow before expires_at.
     *   - Retries: Safe to retry on transient errors; if parameters match, the same session is returned.
     * Side effects:
     *   - Creates a Stripe Checkout/Payment/Setup Session depending on mode and items.
     *   - May create or update customer records, subscriptions, payment intents, and attach payment methods.
     *   - Hosted session URLs are short-lived and will be invalid after expiration.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionResponse createCheckoutSession(com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCheckoutSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextResponse updateWorkspaceContext(com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWorkspaceContextMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WorkspaceService.
   */
  public static final class WorkspaceServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WorkspaceServiceFutureStub> {
    private WorkspaceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkspaceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkspaceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceResponse> createWorkspace(
        com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse> getWorkspace(
        com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse> getCurrentWorkspace(
        com.scalekit.grpc.scalekit.v1.workspaces.GetCurrentWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse> updateWorkspace(
        com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> onboardWorkspace(
        com.scalekit.grpc.scalekit.v1.workspaces.OnboardWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnboardWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse> updateCurrentWorkspace(
        com.scalekit.grpc.scalekit.v1.workspaces.UpdateCurrentWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCurrentWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsResponse> getWorkspaceSubscriptions(
        com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWorkspaceSubscriptionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableResponse> getWorkspacePricingTable(
        com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWorkspacePricingTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalResponse> getBillingPortal(
        com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBillingPortalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoResponse> getBillingInfo(
        com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBillingInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves current product usage and tiered pricing for the current preview billing period.
     * Primary action: Provide dynamic, in-period usage metrics and per-product pricing breakdown for charge preview.
     * Use cases: Show customers an estimate of charges before final invoicing; display usage details per product/feature.
     * Request: GetProductUsageRequest (workspace context/session); supports filtering by product/feature where applicable.
     * Response: GetProductUsageResponse:
     *   - line_items: per-product entries with usage counts (units), measurement granularity (e.g., requests, seats, GB), and aggregation window.
     *   - pricing_tiers: tiered structure for each line item (thresholds, unit_price per tier, effective applied tier), and computed effective_price.
     *   - totals: preview period monetary amounts (subtotal, taxes, discounts/credits, total) in minor units with currency.
     *   - notes: indicators for metered vs seat-based products, and whether usage is still accumulating.
     * Behavior and differences vs GetProductCatalog:
     *   - Invoice preview vs final: values are estimates until the billing period closes; final invoice may differ due to late-reported usage or adjustments.
     *   - Dynamic vs static: GetProductUsage reflects actual/accumulating usage and applied tiers for the current period; GetProductCatalog exposes static product/pricing definitions without usage.
     *   - Use pricing_tiers and effective_price to explain how the preview total was derived per product (including cross-tier allocations).
     *   - Late or batched usage may update line_items before finalization; clients should refresh periodically for up-to-date previews.
     * Returns payment methods, plan, last invoice, current invoice period, etc.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageResponse> getProductUsage(
        com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductUsageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogResponse> getProductCatalog(
        com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductCatalogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionResponse> addSubscription(
        com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a checkout session for the current workspace's billing operations.
     * Primary action: Establish a client-facing checkout experience to start, update, or complete billing
     *                 actions such as subscriptions, plan changes, trials, add-ons, and one-time payments.
     * Use cases:
     *   - Initiate payment collection when upgrading/downgrading plans or adding paid features.
     *   - Set up a new subscription or resume an incomplete payment.
     *   - Collect payment method for future charges (setup mode) prior to enabling paid features.
     *   - Start a one-time payment flow for metered usage or add-on purchases.
     * Request (CreateCheckoutSessionRequest):
     *   - mode: Required. One of {SUBSCRIPTION | PAYMENT | SETUP}. Determines the billing flow:
     *       * SUBSCRIPTION: Creates/updates a workspace subscription; may require payment method.
     *       * PAYMENT: Creates a one-time payment intent for immediate charge.
     *       * SETUP: Collects a payment method for future use without immediate charge.
     *   - items: Optional. Line items or price identifiers; required when mode=SUBSCRIPTION or PAYMENT.
     *            Each item must include a valid price_id and quantity &gt; 0. Prices must be active.
     *   - return_url: Optional. URL to redirect the client after successful completion or cancellation.
     *                 Must be HTTPS and belong to an allowed domain; max length constraints apply.
     *   - success_url: Optional. Explicit success redirect for hosted checkout; must be HTTPS and allowed.
     *   - ui_mode: Optional. One of {EMBEDDED | HOSTED | CUSTOM}. Controls client integration modality.
     *   - metadata: Optional. Key-value pairs (string) for audit/correlation; keys/values length limited.
     *   - customer_id / workspace_id: Optional. If omitted, inferred from the authenticated workspace session.
     * Validation rules:
     *   - Authentication: Requires WORKSPACE_CLIENT. Caller must be authorized for billing actions.
     *   - For SUBSCRIPTION/PAYMENT: items must be present and valid; unsupported/archived prices are rejected.
     *   - URLs (return_url/success_url) must match allowed origins; invalid URLs are rejected.
     *   - Only one active session per workspace per identical parameter set is allowed (idempotency).
     * Response (CreateCheckoutSessionResponse):
     *   - session_id: Identifier of the created checkout session; use to query status or resume flow.
     *   - client_secret: Secret for client-side SDKs (e.g., embedded UI). Treat as sensitive; never log.
     *   - url: Hosted checkout URL when ui_mode=HOSTED or CUSTOM; omitted for EMBEDDED flows.
     *   - mode: Echoes the requested mode for clarity.
     *   - expires_at: UTC timestamp when the session becomes invalid (e.g., 24 hours from creation).
     *   - status: Initial session status (e.g., CREATED). May be polled for updates via billing status RPCs.
     * Behavior notes:
     *   - Idempotency: Repeated calls with identical parameters within the expiration window return
     *                  the existing session (same session_id). Parameter differences create new sessions.
     *   - Security: client_secret is required for embedded checkout initialization; do not expose publicly.
     *   - URL population: url is provided only for HOSTED/CUSTOM UI modes; EMBEDDED flows rely on client_secret.
     *   - Expiration: Sessions expire after a fixed window; clients must complete the flow before expires_at.
     *   - Retries: Safe to retry on transient errors; if parameters match, the same session is returned.
     * Side effects:
     *   - Creates a Stripe Checkout/Payment/Setup Session depending on mode and items.
     *   - May create or update customer records, subscriptions, payment intents, and attach payment methods.
     *   - Hosted session URLs are short-lived and will be invalid after expiration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionResponse> createCheckoutSession(
        com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCheckoutSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextResponse> updateWorkspaceContext(
        com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWorkspaceContextMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_WORKSPACE = 0;
  private static final int METHODID_GET_WORKSPACE = 1;
  private static final int METHODID_GET_CURRENT_WORKSPACE = 2;
  private static final int METHODID_UPDATE_WORKSPACE = 3;
  private static final int METHODID_ONBOARD_WORKSPACE = 4;
  private static final int METHODID_UPDATE_CURRENT_WORKSPACE = 5;
  private static final int METHODID_GET_WORKSPACE_SUBSCRIPTIONS = 6;
  private static final int METHODID_GET_WORKSPACE_PRICING_TABLE = 7;
  private static final int METHODID_GET_BILLING_PORTAL = 8;
  private static final int METHODID_GET_BILLING_INFO = 9;
  private static final int METHODID_GET_PRODUCT_USAGE = 10;
  private static final int METHODID_GET_PRODUCT_CATALOG = 11;
  private static final int METHODID_ADD_SUBSCRIPTION = 12;
  private static final int METHODID_CREATE_CHECKOUT_SESSION = 13;
  private static final int METHODID_UPDATE_WORKSPACE_CONTEXT = 14;

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
        case METHODID_CREATE_WORKSPACE:
          serviceImpl.createWorkspace((com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceResponse>) responseObserver);
          break;
        case METHODID_GET_WORKSPACE:
          serviceImpl.getWorkspace((com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENT_WORKSPACE:
          serviceImpl.getCurrentWorkspace((com.scalekit.grpc.scalekit.v1.workspaces.GetCurrentWorkspaceRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse>) responseObserver);
          break;
        case METHODID_UPDATE_WORKSPACE:
          serviceImpl.updateWorkspace((com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse>) responseObserver);
          break;
        case METHODID_ONBOARD_WORKSPACE:
          serviceImpl.onboardWorkspace((com.scalekit.grpc.scalekit.v1.workspaces.OnboardWorkspaceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_CURRENT_WORKSPACE:
          serviceImpl.updateCurrentWorkspace((com.scalekit.grpc.scalekit.v1.workspaces.UpdateCurrentWorkspaceRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse>) responseObserver);
          break;
        case METHODID_GET_WORKSPACE_SUBSCRIPTIONS:
          serviceImpl.getWorkspaceSubscriptions((com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsResponse>) responseObserver);
          break;
        case METHODID_GET_WORKSPACE_PRICING_TABLE:
          serviceImpl.getWorkspacePricingTable((com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableResponse>) responseObserver);
          break;
        case METHODID_GET_BILLING_PORTAL:
          serviceImpl.getBillingPortal((com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalResponse>) responseObserver);
          break;
        case METHODID_GET_BILLING_INFO:
          serviceImpl.getBillingInfo((com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_USAGE:
          serviceImpl.getProductUsage((com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_CATALOG:
          serviceImpl.getProductCatalog((com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogResponse>) responseObserver);
          break;
        case METHODID_ADD_SUBSCRIPTION:
          serviceImpl.addSubscription((com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionResponse>) responseObserver);
          break;
        case METHODID_CREATE_CHECKOUT_SESSION:
          serviceImpl.createCheckoutSession((com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_WORKSPACE_CONTEXT:
          serviceImpl.updateWorkspaceContext((com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextResponse>) responseObserver);
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
          getCreateWorkspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceRequest,
              com.scalekit.grpc.scalekit.v1.workspaces.CreateWorkspaceResponse>(
                service, METHODID_CREATE_WORKSPACE)))
        .addMethod(
          getGetWorkspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceRequest,
              com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse>(
                service, METHODID_GET_WORKSPACE)))
        .addMethod(
          getGetCurrentWorkspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.workspaces.GetCurrentWorkspaceRequest,
              com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceResponse>(
                service, METHODID_GET_CURRENT_WORKSPACE)))
        .addMethod(
          getUpdateWorkspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceRequest,
              com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse>(
                service, METHODID_UPDATE_WORKSPACE)))
        .addMethod(
          getOnboardWorkspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.workspaces.OnboardWorkspaceRequest,
              com.google.protobuf.Empty>(
                service, METHODID_ONBOARD_WORKSPACE)))
        .addMethod(
          getUpdateCurrentWorkspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.workspaces.UpdateCurrentWorkspaceRequest,
              com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceResponse>(
                service, METHODID_UPDATE_CURRENT_WORKSPACE)))
        .addMethod(
          getGetWorkspaceSubscriptionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsRequest,
              com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspaceSubscriptionsResponse>(
                service, METHODID_GET_WORKSPACE_SUBSCRIPTIONS)))
        .addMethod(
          getGetWorkspacePricingTableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableRequest,
              com.scalekit.grpc.scalekit.v1.workspaces.GetWorkspacePricingTableResponse>(
                service, METHODID_GET_WORKSPACE_PRICING_TABLE)))
        .addMethod(
          getGetBillingPortalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalRequest,
              com.scalekit.grpc.scalekit.v1.workspaces.GetBillingPortalResponse>(
                service, METHODID_GET_BILLING_PORTAL)))
        .addMethod(
          getGetBillingInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoRequest,
              com.scalekit.grpc.scalekit.v1.workspaces.GetBillingInfoResponse>(
                service, METHODID_GET_BILLING_INFO)))
        .addMethod(
          getGetProductUsageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageRequest,
              com.scalekit.grpc.scalekit.v1.workspaces.GetProductUsageResponse>(
                service, METHODID_GET_PRODUCT_USAGE)))
        .addMethod(
          getGetProductCatalogMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogRequest,
              com.scalekit.grpc.scalekit.v1.workspaces.GetProductCatalogResponse>(
                service, METHODID_GET_PRODUCT_CATALOG)))
        .addMethod(
          getAddSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionRequest,
              com.scalekit.grpc.scalekit.v1.workspaces.AddSubscriptionResponse>(
                service, METHODID_ADD_SUBSCRIPTION)))
        .addMethod(
          getCreateCheckoutSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionRequest,
              com.scalekit.grpc.scalekit.v1.workspaces.CreateCheckoutSessionResponse>(
                service, METHODID_CREATE_CHECKOUT_SESSION)))
        .addMethod(
          getUpdateWorkspaceContextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextRequest,
              com.scalekit.grpc.scalekit.v1.workspaces.UpdateWorkspaceContextResponse>(
                service, METHODID_UPDATE_WORKSPACE_CONTEXT)))
        .build();
  }

  private static abstract class WorkspaceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkspaceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.workspaces.WorkspacesProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkspaceService");
    }
  }

  private static final class WorkspaceServiceFileDescriptorSupplier
      extends WorkspaceServiceBaseDescriptorSupplier {
    WorkspaceServiceFileDescriptorSupplier() {}
  }

  private static final class WorkspaceServiceMethodDescriptorSupplier
      extends WorkspaceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WorkspaceServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WorkspaceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkspaceServiceFileDescriptorSupplier())
              .addMethod(getCreateWorkspaceMethod())
              .addMethod(getGetWorkspaceMethod())
              .addMethod(getGetCurrentWorkspaceMethod())
              .addMethod(getUpdateWorkspaceMethod())
              .addMethod(getOnboardWorkspaceMethod())
              .addMethod(getUpdateCurrentWorkspaceMethod())
              .addMethod(getGetWorkspaceSubscriptionsMethod())
              .addMethod(getGetWorkspacePricingTableMethod())
              .addMethod(getGetBillingPortalMethod())
              .addMethod(getGetBillingInfoMethod())
              .addMethod(getGetProductUsageMethod())
              .addMethod(getGetProductCatalogMethod())
              .addMethod(getAddSubscriptionMethod())
              .addMethod(getCreateCheckoutSessionMethod())
              .addMethod(getUpdateWorkspaceContextMethod())
              .build();
        }
      }
    }
    return result;
  }
}
