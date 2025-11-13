package com.scalekit.grpc.scalekit.v1.mcp;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/mcp/mcp.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class McpServiceGrpc {

  private McpServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.mcp.McpService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest,
      com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse> getCreateMcpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMcp",
      requestType = com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest,
      com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse> getCreateMcpMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest, com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse> getCreateMcpMethod;
    if ((getCreateMcpMethod = McpServiceGrpc.getCreateMcpMethod) == null) {
      synchronized (McpServiceGrpc.class) {
        if ((getCreateMcpMethod = McpServiceGrpc.getCreateMcpMethod) == null) {
          McpServiceGrpc.getCreateMcpMethod = getCreateMcpMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest, com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMcp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpServiceMethodDescriptorSupplier("CreateMcp"))
              .build();
        }
      }
    }
    return getCreateMcpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest,
      com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse> getGetMcpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMcp",
      requestType = com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest,
      com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse> getGetMcpMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest, com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse> getGetMcpMethod;
    if ((getGetMcpMethod = McpServiceGrpc.getGetMcpMethod) == null) {
      synchronized (McpServiceGrpc.class) {
        if ((getGetMcpMethod = McpServiceGrpc.getGetMcpMethod) == null) {
          McpServiceGrpc.getGetMcpMethod = getGetMcpMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest, com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMcp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpServiceMethodDescriptorSupplier("GetMcp"))
              .build();
        }
      }
    }
    return getGetMcpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest,
      com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse> getListMcpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMcp",
      requestType = com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest,
      com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse> getListMcpMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest, com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse> getListMcpMethod;
    if ((getListMcpMethod = McpServiceGrpc.getListMcpMethod) == null) {
      synchronized (McpServiceGrpc.class) {
        if ((getListMcpMethod = McpServiceGrpc.getListMcpMethod) == null) {
          McpServiceGrpc.getListMcpMethod = getListMcpMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest, com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMcp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpServiceMethodDescriptorSupplier("ListMcp"))
              .build();
        }
      }
    }
    return getListMcpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest,
      com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse> getDeleteMcpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMcp",
      requestType = com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest,
      com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse> getDeleteMcpMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest, com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse> getDeleteMcpMethod;
    if ((getDeleteMcpMethod = McpServiceGrpc.getDeleteMcpMethod) == null) {
      synchronized (McpServiceGrpc.class) {
        if ((getDeleteMcpMethod = McpServiceGrpc.getDeleteMcpMethod) == null) {
          McpServiceGrpc.getDeleteMcpMethod = getDeleteMcpMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest, com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMcp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpServiceMethodDescriptorSupplier("DeleteMcp"))
              .build();
        }
      }
    }
    return getDeleteMcpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigRequest,
      com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigResponse> getCreateMcpConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMcpConfig",
      requestType = com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigRequest,
      com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigResponse> getCreateMcpConfigMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigRequest, com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigResponse> getCreateMcpConfigMethod;
    if ((getCreateMcpConfigMethod = McpServiceGrpc.getCreateMcpConfigMethod) == null) {
      synchronized (McpServiceGrpc.class) {
        if ((getCreateMcpConfigMethod = McpServiceGrpc.getCreateMcpConfigMethod) == null) {
          McpServiceGrpc.getCreateMcpConfigMethod = getCreateMcpConfigMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigRequest, com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMcpConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpServiceMethodDescriptorSupplier("CreateMcpConfig"))
              .build();
        }
      }
    }
    return getCreateMcpConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigRequest,
      com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigResponse> getUpdateMcpConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMcpConfig",
      requestType = com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigRequest,
      com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigResponse> getUpdateMcpConfigMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigRequest, com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigResponse> getUpdateMcpConfigMethod;
    if ((getUpdateMcpConfigMethod = McpServiceGrpc.getUpdateMcpConfigMethod) == null) {
      synchronized (McpServiceGrpc.class) {
        if ((getUpdateMcpConfigMethod = McpServiceGrpc.getUpdateMcpConfigMethod) == null) {
          McpServiceGrpc.getUpdateMcpConfigMethod = getUpdateMcpConfigMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigRequest, com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMcpConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpServiceMethodDescriptorSupplier("UpdateMcpConfig"))
              .build();
        }
      }
    }
    return getUpdateMcpConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsRequest,
      com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsResponse> getListMcpConfigsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMcpConfigs",
      requestType = com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsRequest,
      com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsResponse> getListMcpConfigsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsRequest, com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsResponse> getListMcpConfigsMethod;
    if ((getListMcpConfigsMethod = McpServiceGrpc.getListMcpConfigsMethod) == null) {
      synchronized (McpServiceGrpc.class) {
        if ((getListMcpConfigsMethod = McpServiceGrpc.getListMcpConfigsMethod) == null) {
          McpServiceGrpc.getListMcpConfigsMethod = getListMcpConfigsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsRequest, com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMcpConfigs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpServiceMethodDescriptorSupplier("ListMcpConfigs"))
              .build();
        }
      }
    }
    return getListMcpConfigsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigRequest,
      com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigResponse> getGetMcpConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMcpConfig",
      requestType = com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigRequest,
      com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigResponse> getGetMcpConfigMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigRequest, com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigResponse> getGetMcpConfigMethod;
    if ((getGetMcpConfigMethod = McpServiceGrpc.getGetMcpConfigMethod) == null) {
      synchronized (McpServiceGrpc.class) {
        if ((getGetMcpConfigMethod = McpServiceGrpc.getGetMcpConfigMethod) == null) {
          McpServiceGrpc.getGetMcpConfigMethod = getGetMcpConfigMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigRequest, com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMcpConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpServiceMethodDescriptorSupplier("GetMcpConfig"))
              .build();
        }
      }
    }
    return getGetMcpConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigRequest,
      com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigResponse> getDeleteMcpConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMcpConfig",
      requestType = com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigRequest,
      com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigResponse> getDeleteMcpConfigMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigRequest, com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigResponse> getDeleteMcpConfigMethod;
    if ((getDeleteMcpConfigMethod = McpServiceGrpc.getDeleteMcpConfigMethod) == null) {
      synchronized (McpServiceGrpc.class) {
        if ((getDeleteMcpConfigMethod = McpServiceGrpc.getDeleteMcpConfigMethod) == null) {
          McpServiceGrpc.getDeleteMcpConfigMethod = getDeleteMcpConfigMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigRequest, com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMcpConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpServiceMethodDescriptorSupplier("DeleteMcpConfig"))
              .build();
        }
      }
    }
    return getDeleteMcpConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceRequest,
      com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceResponse> getEnsureMcpInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnsureMcpInstance",
      requestType = com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceRequest,
      com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceResponse> getEnsureMcpInstanceMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceRequest, com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceResponse> getEnsureMcpInstanceMethod;
    if ((getEnsureMcpInstanceMethod = McpServiceGrpc.getEnsureMcpInstanceMethod) == null) {
      synchronized (McpServiceGrpc.class) {
        if ((getEnsureMcpInstanceMethod = McpServiceGrpc.getEnsureMcpInstanceMethod) == null) {
          McpServiceGrpc.getEnsureMcpInstanceMethod = getEnsureMcpInstanceMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceRequest, com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnsureMcpInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpServiceMethodDescriptorSupplier("EnsureMcpInstance"))
              .build();
        }
      }
    }
    return getEnsureMcpInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesRequest,
      com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesResponse> getListMcpInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMcpInstances",
      requestType = com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesRequest,
      com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesResponse> getListMcpInstancesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesRequest, com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesResponse> getListMcpInstancesMethod;
    if ((getListMcpInstancesMethod = McpServiceGrpc.getListMcpInstancesMethod) == null) {
      synchronized (McpServiceGrpc.class) {
        if ((getListMcpInstancesMethod = McpServiceGrpc.getListMcpInstancesMethod) == null) {
          McpServiceGrpc.getListMcpInstancesMethod = getListMcpInstancesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesRequest, com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMcpInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpServiceMethodDescriptorSupplier("ListMcpInstances"))
              .build();
        }
      }
    }
    return getListMcpInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceRequest,
      com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceResponse> getDeleteMcpInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMcpInstance",
      requestType = com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceRequest,
      com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceResponse> getDeleteMcpInstanceMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceRequest, com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceResponse> getDeleteMcpInstanceMethod;
    if ((getDeleteMcpInstanceMethod = McpServiceGrpc.getDeleteMcpInstanceMethod) == null) {
      synchronized (McpServiceGrpc.class) {
        if ((getDeleteMcpInstanceMethod = McpServiceGrpc.getDeleteMcpInstanceMethod) == null) {
          McpServiceGrpc.getDeleteMcpInstanceMethod = getDeleteMcpInstanceMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceRequest, com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMcpInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpServiceMethodDescriptorSupplier("DeleteMcpInstance"))
              .build();
        }
      }
    }
    return getDeleteMcpInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceRequest,
      com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceResponse> getUpdateMcpInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMcpInstance",
      requestType = com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceRequest,
      com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceResponse> getUpdateMcpInstanceMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceRequest, com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceResponse> getUpdateMcpInstanceMethod;
    if ((getUpdateMcpInstanceMethod = McpServiceGrpc.getUpdateMcpInstanceMethod) == null) {
      synchronized (McpServiceGrpc.class) {
        if ((getUpdateMcpInstanceMethod = McpServiceGrpc.getUpdateMcpInstanceMethod) == null) {
          McpServiceGrpc.getUpdateMcpInstanceMethod = getUpdateMcpInstanceMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceRequest, com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMcpInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpServiceMethodDescriptorSupplier("UpdateMcpInstance"))
              .build();
        }
      }
    }
    return getUpdateMcpInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceRequest,
      com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceResponse> getGetMcpInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMcpInstance",
      requestType = com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceRequest,
      com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceResponse> getGetMcpInstanceMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceRequest, com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceResponse> getGetMcpInstanceMethod;
    if ((getGetMcpInstanceMethod = McpServiceGrpc.getGetMcpInstanceMethod) == null) {
      synchronized (McpServiceGrpc.class) {
        if ((getGetMcpInstanceMethod = McpServiceGrpc.getGetMcpInstanceMethod) == null) {
          McpServiceGrpc.getGetMcpInstanceMethod = getGetMcpInstanceMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceRequest, com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMcpInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpServiceMethodDescriptorSupplier("GetMcpInstance"))
              .build();
        }
      }
    }
    return getGetMcpInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateRequest,
      com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateResponse> getGetMcpInstanceAuthStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMcpInstanceAuthState",
      requestType = com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateRequest,
      com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateResponse> getGetMcpInstanceAuthStateMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateRequest, com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateResponse> getGetMcpInstanceAuthStateMethod;
    if ((getGetMcpInstanceAuthStateMethod = McpServiceGrpc.getGetMcpInstanceAuthStateMethod) == null) {
      synchronized (McpServiceGrpc.class) {
        if ((getGetMcpInstanceAuthStateMethod = McpServiceGrpc.getGetMcpInstanceAuthStateMethod) == null) {
          McpServiceGrpc.getGetMcpInstanceAuthStateMethod = getGetMcpInstanceAuthStateMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateRequest, com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMcpInstanceAuthState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new McpServiceMethodDescriptorSupplier("GetMcpInstanceAuthState"))
              .build();
        }
      }
    }
    return getGetMcpInstanceAuthStateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static McpServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<McpServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<McpServiceStub>() {
        @java.lang.Override
        public McpServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new McpServiceStub(channel, callOptions);
        }
      };
    return McpServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static McpServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<McpServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<McpServiceBlockingStub>() {
        @java.lang.Override
        public McpServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new McpServiceBlockingStub(channel, callOptions);
        }
      };
    return McpServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static McpServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<McpServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<McpServiceFutureStub>() {
        @java.lang.Override
        public McpServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new McpServiceFutureStub(channel, callOptions);
        }
      };
    return McpServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createMcp(com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMcpMethod(), responseObserver);
    }

    /**
     */
    default void getMcp(com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMcpMethod(), responseObserver);
    }

    /**
     */
    default void listMcp(com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMcpMethod(), responseObserver);
    }

    /**
     */
    default void deleteMcp(com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMcpMethod(), responseObserver);
    }

    /**
     */
    default void createMcpConfig(com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMcpConfigMethod(), responseObserver);
    }

    /**
     */
    default void updateMcpConfig(com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMcpConfigMethod(), responseObserver);
    }

    /**
     */
    default void listMcpConfigs(com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMcpConfigsMethod(), responseObserver);
    }

    /**
     */
    default void getMcpConfig(com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMcpConfigMethod(), responseObserver);
    }

    /**
     */
    default void deleteMcpConfig(com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMcpConfigMethod(), responseObserver);
    }

    /**
     */
    default void ensureMcpInstance(com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnsureMcpInstanceMethod(), responseObserver);
    }

    /**
     */
    default void listMcpInstances(com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMcpInstancesMethod(), responseObserver);
    }

    /**
     */
    default void deleteMcpInstance(com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMcpInstanceMethod(), responseObserver);
    }

    /**
     */
    default void updateMcpInstance(com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMcpInstanceMethod(), responseObserver);
    }

    /**
     */
    default void getMcpInstance(com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMcpInstanceMethod(), responseObserver);
    }

    /**
     */
    default void getMcpInstanceAuthState(com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMcpInstanceAuthStateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service McpService.
   */
  public static abstract class McpServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return McpServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service McpService.
   */
  public static final class McpServiceStub
      extends io.grpc.stub.AbstractAsyncStub<McpServiceStub> {
    private McpServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected McpServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new McpServiceStub(channel, callOptions);
    }

    /**
     */
    public void createMcp(com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMcpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMcp(com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMcpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listMcp(com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMcpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMcp(com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMcpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createMcpConfig(com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMcpConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMcpConfig(com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMcpConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listMcpConfigs(com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMcpConfigsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMcpConfig(com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMcpConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMcpConfig(com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMcpConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ensureMcpInstance(com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnsureMcpInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listMcpInstances(com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMcpInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMcpInstance(com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMcpInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMcpInstance(com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMcpInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMcpInstance(com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMcpInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMcpInstanceAuthState(com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMcpInstanceAuthStateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service McpService.
   */
  public static final class McpServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<McpServiceBlockingStub> {
    private McpServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected McpServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new McpServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse createMcp(com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMcpMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse getMcp(com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMcpMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse listMcp(com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMcpMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse deleteMcp(com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMcpMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigResponse createMcpConfig(com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMcpConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigResponse updateMcpConfig(com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMcpConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsResponse listMcpConfigs(com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMcpConfigsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigResponse getMcpConfig(com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMcpConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigResponse deleteMcpConfig(com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMcpConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceResponse ensureMcpInstance(com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnsureMcpInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesResponse listMcpInstances(com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMcpInstancesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceResponse deleteMcpInstance(com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMcpInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceResponse updateMcpInstance(com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMcpInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceResponse getMcpInstance(com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMcpInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateResponse getMcpInstanceAuthState(com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMcpInstanceAuthStateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service McpService.
   */
  public static final class McpServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<McpServiceFutureStub> {
    private McpServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected McpServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new McpServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse> createMcp(
        com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMcpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse> getMcp(
        com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMcpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse> listMcp(
        com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMcpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse> deleteMcp(
        com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMcpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigResponse> createMcpConfig(
        com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMcpConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigResponse> updateMcpConfig(
        com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMcpConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsResponse> listMcpConfigs(
        com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMcpConfigsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigResponse> getMcpConfig(
        com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMcpConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigResponse> deleteMcpConfig(
        com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMcpConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceResponse> ensureMcpInstance(
        com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnsureMcpInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesResponse> listMcpInstances(
        com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMcpInstancesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceResponse> deleteMcpInstance(
        com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMcpInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceResponse> updateMcpInstance(
        com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMcpInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceResponse> getMcpInstance(
        com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMcpInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateResponse> getMcpInstanceAuthState(
        com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMcpInstanceAuthStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_MCP = 0;
  private static final int METHODID_GET_MCP = 1;
  private static final int METHODID_LIST_MCP = 2;
  private static final int METHODID_DELETE_MCP = 3;
  private static final int METHODID_CREATE_MCP_CONFIG = 4;
  private static final int METHODID_UPDATE_MCP_CONFIG = 5;
  private static final int METHODID_LIST_MCP_CONFIGS = 6;
  private static final int METHODID_GET_MCP_CONFIG = 7;
  private static final int METHODID_DELETE_MCP_CONFIG = 8;
  private static final int METHODID_ENSURE_MCP_INSTANCE = 9;
  private static final int METHODID_LIST_MCP_INSTANCES = 10;
  private static final int METHODID_DELETE_MCP_INSTANCE = 11;
  private static final int METHODID_UPDATE_MCP_INSTANCE = 12;
  private static final int METHODID_GET_MCP_INSTANCE = 13;
  private static final int METHODID_GET_MCP_INSTANCE_AUTH_STATE = 14;

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
        case METHODID_CREATE_MCP:
          serviceImpl.createMcp((com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse>) responseObserver);
          break;
        case METHODID_GET_MCP:
          serviceImpl.getMcp((com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse>) responseObserver);
          break;
        case METHODID_LIST_MCP:
          serviceImpl.listMcp((com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse>) responseObserver);
          break;
        case METHODID_DELETE_MCP:
          serviceImpl.deleteMcp((com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse>) responseObserver);
          break;
        case METHODID_CREATE_MCP_CONFIG:
          serviceImpl.createMcpConfig((com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MCP_CONFIG:
          serviceImpl.updateMcpConfig((com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigResponse>) responseObserver);
          break;
        case METHODID_LIST_MCP_CONFIGS:
          serviceImpl.listMcpConfigs((com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsResponse>) responseObserver);
          break;
        case METHODID_GET_MCP_CONFIG:
          serviceImpl.getMcpConfig((com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigResponse>) responseObserver);
          break;
        case METHODID_DELETE_MCP_CONFIG:
          serviceImpl.deleteMcpConfig((com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigResponse>) responseObserver);
          break;
        case METHODID_ENSURE_MCP_INSTANCE:
          serviceImpl.ensureMcpInstance((com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceResponse>) responseObserver);
          break;
        case METHODID_LIST_MCP_INSTANCES:
          serviceImpl.listMcpInstances((com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesResponse>) responseObserver);
          break;
        case METHODID_DELETE_MCP_INSTANCE:
          serviceImpl.deleteMcpInstance((com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MCP_INSTANCE:
          serviceImpl.updateMcpInstance((com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceResponse>) responseObserver);
          break;
        case METHODID_GET_MCP_INSTANCE:
          serviceImpl.getMcpInstance((com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceResponse>) responseObserver);
          break;
        case METHODID_GET_MCP_INSTANCE_AUTH_STATE:
          serviceImpl.getMcpInstanceAuthState((com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateResponse>) responseObserver);
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
          getCreateMcpMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.mcp.CreateMcpRequest,
              com.scalekit.grpc.scalekit.v1.mcp.CreateMcpResponse>(
                service, METHODID_CREATE_MCP)))
        .addMethod(
          getGetMcpMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.mcp.GetMcpRequest,
              com.scalekit.grpc.scalekit.v1.mcp.GetMcpResponse>(
                service, METHODID_GET_MCP)))
        .addMethod(
          getListMcpMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.mcp.ListMcpRequest,
              com.scalekit.grpc.scalekit.v1.mcp.ListMcpResponse>(
                service, METHODID_LIST_MCP)))
        .addMethod(
          getDeleteMcpMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpRequest,
              com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpResponse>(
                service, METHODID_DELETE_MCP)))
        .addMethod(
          getCreateMcpConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigRequest,
              com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigResponse>(
                service, METHODID_CREATE_MCP_CONFIG)))
        .addMethod(
          getUpdateMcpConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigRequest,
              com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigResponse>(
                service, METHODID_UPDATE_MCP_CONFIG)))
        .addMethod(
          getListMcpConfigsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsRequest,
              com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsResponse>(
                service, METHODID_LIST_MCP_CONFIGS)))
        .addMethod(
          getGetMcpConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigRequest,
              com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigResponse>(
                service, METHODID_GET_MCP_CONFIG)))
        .addMethod(
          getDeleteMcpConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigRequest,
              com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigResponse>(
                service, METHODID_DELETE_MCP_CONFIG)))
        .addMethod(
          getEnsureMcpInstanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceRequest,
              com.scalekit.grpc.scalekit.v1.mcp.EnsureMcpInstanceResponse>(
                service, METHODID_ENSURE_MCP_INSTANCE)))
        .addMethod(
          getListMcpInstancesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesRequest,
              com.scalekit.grpc.scalekit.v1.mcp.ListMcpInstancesResponse>(
                service, METHODID_LIST_MCP_INSTANCES)))
        .addMethod(
          getDeleteMcpInstanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceRequest,
              com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpInstanceResponse>(
                service, METHODID_DELETE_MCP_INSTANCE)))
        .addMethod(
          getUpdateMcpInstanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceRequest,
              com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpInstanceResponse>(
                service, METHODID_UPDATE_MCP_INSTANCE)))
        .addMethod(
          getGetMcpInstanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceRequest,
              com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceResponse>(
                service, METHODID_GET_MCP_INSTANCE)))
        .addMethod(
          getGetMcpInstanceAuthStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateRequest,
              com.scalekit.grpc.scalekit.v1.mcp.GetMcpInstanceAuthStateResponse>(
                service, METHODID_GET_MCP_INSTANCE_AUTH_STATE)))
        .build();
  }

  private static abstract class McpServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    McpServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.mcp.McpProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("McpService");
    }
  }

  private static final class McpServiceFileDescriptorSupplier
      extends McpServiceBaseDescriptorSupplier {
    McpServiceFileDescriptorSupplier() {}
  }

  private static final class McpServiceMethodDescriptorSupplier
      extends McpServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    McpServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (McpServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new McpServiceFileDescriptorSupplier())
              .addMethod(getCreateMcpMethod())
              .addMethod(getGetMcpMethod())
              .addMethod(getListMcpMethod())
              .addMethod(getDeleteMcpMethod())
              .addMethod(getCreateMcpConfigMethod())
              .addMethod(getUpdateMcpConfigMethod())
              .addMethod(getListMcpConfigsMethod())
              .addMethod(getGetMcpConfigMethod())
              .addMethod(getDeleteMcpConfigMethod())
              .addMethod(getEnsureMcpInstanceMethod())
              .addMethod(getListMcpInstancesMethod())
              .addMethod(getDeleteMcpInstanceMethod())
              .addMethod(getUpdateMcpInstanceMethod())
              .addMethod(getGetMcpInstanceMethod())
              .addMethod(getGetMcpInstanceAuthStateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
