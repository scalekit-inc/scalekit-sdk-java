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
              .build();
        }
      }
    }
    return result;
  }
}
