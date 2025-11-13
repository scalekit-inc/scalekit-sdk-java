package com.scalekit.grpc.scalekit.v1.connections;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/connections/connections.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConnectionServiceGrpc {

  private ConnectionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.connections.ConnectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.CreateEnvironmentConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse> getCreateEnvironmentConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEnvironmentConnection",
      requestType = com.scalekit.grpc.scalekit.v1.connections.CreateEnvironmentConnectionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.CreateEnvironmentConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse> getCreateEnvironmentConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.CreateEnvironmentConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse> getCreateEnvironmentConnectionMethod;
    if ((getCreateEnvironmentConnectionMethod = ConnectionServiceGrpc.getCreateEnvironmentConnectionMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getCreateEnvironmentConnectionMethod = ConnectionServiceGrpc.getCreateEnvironmentConnectionMethod) == null) {
          ConnectionServiceGrpc.getCreateEnvironmentConnectionMethod = getCreateEnvironmentConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.CreateEnvironmentConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEnvironmentConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.CreateEnvironmentConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("CreateEnvironmentConnection"))
              .build();
        }
      }
    }
    return getCreateEnvironmentConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse> getCreateConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateConnection",
      requestType = com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse> getCreateConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse> getCreateConnectionMethod;
    if ((getCreateConnectionMethod = ConnectionServiceGrpc.getCreateConnectionMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getCreateConnectionMethod = ConnectionServiceGrpc.getCreateConnectionMethod) == null) {
          ConnectionServiceGrpc.getCreateConnectionMethod = getCreateConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("CreateConnection"))
              .build();
        }
      }
    }
    return getCreateConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionResponse> getAssignDomainsToConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignDomainsToConnection",
      requestType = com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionResponse> getAssignDomainsToConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionResponse> getAssignDomainsToConnectionMethod;
    if ((getAssignDomainsToConnectionMethod = ConnectionServiceGrpc.getAssignDomainsToConnectionMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getAssignDomainsToConnectionMethod = ConnectionServiceGrpc.getAssignDomainsToConnectionMethod) == null) {
          ConnectionServiceGrpc.getAssignDomainsToConnectionMethod = getAssignDomainsToConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignDomainsToConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("AssignDomainsToConnection"))
              .build();
        }
      }
    }
    return getAssignDomainsToConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.GetEnvironmentConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse> getGetEnvironmentConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEnvironmentConnection",
      requestType = com.scalekit.grpc.scalekit.v1.connections.GetEnvironmentConnectionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.GetEnvironmentConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse> getGetEnvironmentConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.GetEnvironmentConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse> getGetEnvironmentConnectionMethod;
    if ((getGetEnvironmentConnectionMethod = ConnectionServiceGrpc.getGetEnvironmentConnectionMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getGetEnvironmentConnectionMethod = ConnectionServiceGrpc.getGetEnvironmentConnectionMethod) == null) {
          ConnectionServiceGrpc.getGetEnvironmentConnectionMethod = getGetEnvironmentConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.GetEnvironmentConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnvironmentConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.GetEnvironmentConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("GetEnvironmentConnection"))
              .build();
        }
      }
    }
    return getGetEnvironmentConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse> getGetConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConnection",
      requestType = com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse> getGetConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse> getGetConnectionMethod;
    if ((getGetConnectionMethod = ConnectionServiceGrpc.getGetConnectionMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getGetConnectionMethod = ConnectionServiceGrpc.getGetConnectionMethod) == null) {
          ConnectionServiceGrpc.getGetConnectionMethod = getGetConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("GetConnection"))
              .build();
        }
      }
    }
    return getGetConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest,
      com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse> getListConnectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListConnections",
      requestType = com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest,
      com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse> getListConnectionsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest, com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse> getListConnectionsMethod;
    if ((getListConnectionsMethod = ConnectionServiceGrpc.getListConnectionsMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getListConnectionsMethod = ConnectionServiceGrpc.getListConnectionsMethod) == null) {
          ConnectionServiceGrpc.getListConnectionsMethod = getListConnectionsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest, com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListConnections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("ListConnections"))
              .build();
        }
      }
    }
    return getListConnectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsRequest,
      com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsResponse> getListOrganizationConnectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrganizationConnections",
      requestType = com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsRequest,
      com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsResponse> getListOrganizationConnectionsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsRequest, com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsResponse> getListOrganizationConnectionsMethod;
    if ((getListOrganizationConnectionsMethod = ConnectionServiceGrpc.getListOrganizationConnectionsMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getListOrganizationConnectionsMethod = ConnectionServiceGrpc.getListOrganizationConnectionsMethod) == null) {
          ConnectionServiceGrpc.getListOrganizationConnectionsMethod = getListOrganizationConnectionsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsRequest, com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrganizationConnections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("ListOrganizationConnections"))
              .build();
        }
      }
    }
    return getListOrganizationConnectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsRequest,
      com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsResponse> getSearchOrganizationConnectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchOrganizationConnections",
      requestType = com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsRequest,
      com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsResponse> getSearchOrganizationConnectionsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsRequest, com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsResponse> getSearchOrganizationConnectionsMethod;
    if ((getSearchOrganizationConnectionsMethod = ConnectionServiceGrpc.getSearchOrganizationConnectionsMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getSearchOrganizationConnectionsMethod = ConnectionServiceGrpc.getSearchOrganizationConnectionsMethod) == null) {
          ConnectionServiceGrpc.getSearchOrganizationConnectionsMethod = getSearchOrganizationConnectionsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsRequest, com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchOrganizationConnections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("SearchOrganizationConnections"))
              .build();
        }
      }
    }
    return getSearchOrganizationConnectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse> getUpdateEnvironmentConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEnvironmentConnection",
      requestType = com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse> getUpdateEnvironmentConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse> getUpdateEnvironmentConnectionMethod;
    if ((getUpdateEnvironmentConnectionMethod = ConnectionServiceGrpc.getUpdateEnvironmentConnectionMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getUpdateEnvironmentConnectionMethod = ConnectionServiceGrpc.getUpdateEnvironmentConnectionMethod) == null) {
          ConnectionServiceGrpc.getUpdateEnvironmentConnectionMethod = getUpdateEnvironmentConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEnvironmentConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("UpdateEnvironmentConnection"))
              .build();
        }
      }
    }
    return getUpdateEnvironmentConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse> getUpdateConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateConnection",
      requestType = com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse> getUpdateConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse> getUpdateConnectionMethod;
    if ((getUpdateConnectionMethod = ConnectionServiceGrpc.getUpdateConnectionMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getUpdateConnectionMethod = ConnectionServiceGrpc.getUpdateConnectionMethod) == null) {
          ConnectionServiceGrpc.getUpdateConnectionMethod = getUpdateConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("UpdateConnection"))
              .build();
        }
      }
    }
    return getUpdateConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.DeleteEnvironmentConnectionRequest,
      com.google.protobuf.Empty> getDeleteEnvironmentConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEnvironmentConnection",
      requestType = com.scalekit.grpc.scalekit.v1.connections.DeleteEnvironmentConnectionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.DeleteEnvironmentConnectionRequest,
      com.google.protobuf.Empty> getDeleteEnvironmentConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.DeleteEnvironmentConnectionRequest, com.google.protobuf.Empty> getDeleteEnvironmentConnectionMethod;
    if ((getDeleteEnvironmentConnectionMethod = ConnectionServiceGrpc.getDeleteEnvironmentConnectionMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getDeleteEnvironmentConnectionMethod = ConnectionServiceGrpc.getDeleteEnvironmentConnectionMethod) == null) {
          ConnectionServiceGrpc.getDeleteEnvironmentConnectionMethod = getDeleteEnvironmentConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.DeleteEnvironmentConnectionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEnvironmentConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.DeleteEnvironmentConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("DeleteEnvironmentConnection"))
              .build();
        }
      }
    }
    return getDeleteEnvironmentConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest,
      com.google.protobuf.Empty> getDeleteConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteConnection",
      requestType = com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest,
      com.google.protobuf.Empty> getDeleteConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest, com.google.protobuf.Empty> getDeleteConnectionMethod;
    if ((getDeleteConnectionMethod = ConnectionServiceGrpc.getDeleteConnectionMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getDeleteConnectionMethod = ConnectionServiceGrpc.getDeleteConnectionMethod) == null) {
          ConnectionServiceGrpc.getDeleteConnectionMethod = getDeleteConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("DeleteConnection"))
              .build();
        }
      }
    }
    return getDeleteConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> getEnableEnvironmentConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableEnvironmentConnection",
      requestType = com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> getEnableEnvironmentConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> getEnableEnvironmentConnectionMethod;
    if ((getEnableEnvironmentConnectionMethod = ConnectionServiceGrpc.getEnableEnvironmentConnectionMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getEnableEnvironmentConnectionMethod = ConnectionServiceGrpc.getEnableEnvironmentConnectionMethod) == null) {
          ConnectionServiceGrpc.getEnableEnvironmentConnectionMethod = getEnableEnvironmentConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableEnvironmentConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("EnableEnvironmentConnection"))
              .build();
        }
      }
    }
    return getEnableEnvironmentConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> getEnableConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableConnection",
      requestType = com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> getEnableConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> getEnableConnectionMethod;
    if ((getEnableConnectionMethod = ConnectionServiceGrpc.getEnableConnectionMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getEnableConnectionMethod = ConnectionServiceGrpc.getEnableConnectionMethod) == null) {
          ConnectionServiceGrpc.getEnableConnectionMethod = getEnableConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("EnableConnection"))
              .build();
        }
      }
    }
    return getEnableConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> getDisableEnvironmentConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableEnvironmentConnection",
      requestType = com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> getDisableEnvironmentConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> getDisableEnvironmentConnectionMethod;
    if ((getDisableEnvironmentConnectionMethod = ConnectionServiceGrpc.getDisableEnvironmentConnectionMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getDisableEnvironmentConnectionMethod = ConnectionServiceGrpc.getDisableEnvironmentConnectionMethod) == null) {
          ConnectionServiceGrpc.getDisableEnvironmentConnectionMethod = getDisableEnvironmentConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableEnvironmentConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("DisableEnvironmentConnection"))
              .build();
        }
      }
    }
    return getDisableEnvironmentConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> getDisableConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableConnection",
      requestType = com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest,
      com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> getDisableConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> getDisableConnectionMethod;
    if ((getDisableConnectionMethod = ConnectionServiceGrpc.getDisableConnectionMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getDisableConnectionMethod = ConnectionServiceGrpc.getDisableConnectionMethod) == null) {
          ConnectionServiceGrpc.getDisableConnectionMethod = getDisableConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest, com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("DisableConnection"))
              .build();
        }
      }
    }
    return getDisableConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultRequest,
      com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultResponse> getGetConnectionTestResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConnectionTestResult",
      requestType = com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultRequest,
      com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultResponse> getGetConnectionTestResultMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultRequest, com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultResponse> getGetConnectionTestResultMethod;
    if ((getGetConnectionTestResultMethod = ConnectionServiceGrpc.getGetConnectionTestResultMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getGetConnectionTestResultMethod = ConnectionServiceGrpc.getGetConnectionTestResultMethod) == null) {
          ConnectionServiceGrpc.getGetConnectionTestResultMethod = getGetConnectionTestResultMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultRequest, com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConnectionTestResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("GetConnectionTestResult"))
              .build();
        }
      }
    }
    return getGetConnectionTestResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsRequest,
      com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsResponse> getListAppConnectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAppConnections",
      requestType = com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsRequest,
      com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsResponse> getListAppConnectionsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsRequest, com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsResponse> getListAppConnectionsMethod;
    if ((getListAppConnectionsMethod = ConnectionServiceGrpc.getListAppConnectionsMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getListAppConnectionsMethod = ConnectionServiceGrpc.getListAppConnectionsMethod) == null) {
          ConnectionServiceGrpc.getListAppConnectionsMethod = getListAppConnectionsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsRequest, com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAppConnections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("ListAppConnections"))
              .build();
        }
      }
    }
    return getListAppConnectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsRequest,
      com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsResponse> getUpdateConnectionUserManagementSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateConnectionUserManagementSettings",
      requestType = com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsRequest,
      com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsResponse> getUpdateConnectionUserManagementSettingsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsRequest, com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsResponse> getUpdateConnectionUserManagementSettingsMethod;
    if ((getUpdateConnectionUserManagementSettingsMethod = ConnectionServiceGrpc.getUpdateConnectionUserManagementSettingsMethod) == null) {
      synchronized (ConnectionServiceGrpc.class) {
        if ((getUpdateConnectionUserManagementSettingsMethod = ConnectionServiceGrpc.getUpdateConnectionUserManagementSettingsMethod) == null) {
          ConnectionServiceGrpc.getUpdateConnectionUserManagementSettingsMethod = getUpdateConnectionUserManagementSettingsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsRequest, com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateConnectionUserManagementSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectionServiceMethodDescriptorSupplier("UpdateConnectionUserManagementSettings"))
              .build();
        }
      }
    }
    return getUpdateConnectionUserManagementSettingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConnectionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceStub>() {
        @java.lang.Override
        public ConnectionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectionServiceStub(channel, callOptions);
        }
      };
    return ConnectionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConnectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceBlockingStub>() {
        @java.lang.Override
        public ConnectionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectionServiceBlockingStub(channel, callOptions);
        }
      };
    return ConnectionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConnectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectionServiceFutureStub>() {
        @java.lang.Override
        public ConnectionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectionServiceFutureStub(channel, callOptions);
        }
      };
    return ConnectionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createEnvironmentConnection(com.scalekit.grpc.scalekit.v1.connections.CreateEnvironmentConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEnvironmentConnectionMethod(), responseObserver);
    }

    /**
     */
    default void createConnection(com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateConnectionMethod(), responseObserver);
    }

    /**
     */
    default void assignDomainsToConnection(com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignDomainsToConnectionMethod(), responseObserver);
    }

    /**
     */
    default void getEnvironmentConnection(com.scalekit.grpc.scalekit.v1.connections.GetEnvironmentConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEnvironmentConnectionMethod(), responseObserver);
    }

    /**
     */
    default void getConnection(com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConnectionMethod(), responseObserver);
    }

    /**
     */
    default void listConnections(com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListConnectionsMethod(), responseObserver);
    }

    /**
     */
    default void listOrganizationConnections(com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrganizationConnectionsMethod(), responseObserver);
    }

    /**
     */
    default void searchOrganizationConnections(com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchOrganizationConnectionsMethod(), responseObserver);
    }

    /**
     */
    default void updateEnvironmentConnection(com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEnvironmentConnectionMethod(), responseObserver);
    }

    /**
     */
    default void updateConnection(com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateConnectionMethod(), responseObserver);
    }

    /**
     */
    default void deleteEnvironmentConnection(com.scalekit.grpc.scalekit.v1.connections.DeleteEnvironmentConnectionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEnvironmentConnectionMethod(), responseObserver);
    }

    /**
     */
    default void deleteConnection(com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteConnectionMethod(), responseObserver);
    }

    /**
     */
    default void enableEnvironmentConnection(com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableEnvironmentConnectionMethod(), responseObserver);
    }

    /**
     */
    default void enableConnection(com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableConnectionMethod(), responseObserver);
    }

    /**
     */
    default void disableEnvironmentConnection(com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableEnvironmentConnectionMethod(), responseObserver);
    }

    /**
     */
    default void disableConnection(com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableConnectionMethod(), responseObserver);
    }

    /**
     */
    default void getConnectionTestResult(com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConnectionTestResultMethod(), responseObserver);
    }

    /**
     */
    default void listAppConnections(com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAppConnectionsMethod(), responseObserver);
    }

    /**
     */
    default void updateConnectionUserManagementSettings(com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateConnectionUserManagementSettingsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ConnectionService.
   */
  public static abstract class ConnectionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ConnectionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ConnectionService.
   */
  public static final class ConnectionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ConnectionServiceStub> {
    private ConnectionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectionServiceStub(channel, callOptions);
    }

    /**
     */
    public void createEnvironmentConnection(com.scalekit.grpc.scalekit.v1.connections.CreateEnvironmentConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEnvironmentConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createConnection(com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignDomainsToConnection(com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignDomainsToConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEnvironmentConnection(com.scalekit.grpc.scalekit.v1.connections.GetEnvironmentConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEnvironmentConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getConnection(com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listConnections(com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListConnectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOrganizationConnections(com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrganizationConnectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchOrganizationConnections(com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchOrganizationConnectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEnvironmentConnection(com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEnvironmentConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateConnection(com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEnvironmentConnection(com.scalekit.grpc.scalekit.v1.connections.DeleteEnvironmentConnectionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEnvironmentConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteConnection(com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableEnvironmentConnection(com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableEnvironmentConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableConnection(com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableEnvironmentConnection(com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableEnvironmentConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableConnection(com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getConnectionTestResult(com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConnectionTestResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAppConnections(com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAppConnectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateConnectionUserManagementSettings(com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateConnectionUserManagementSettingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ConnectionService.
   */
  public static final class ConnectionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ConnectionServiceBlockingStub> {
    private ConnectionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse createEnvironmentConnection(com.scalekit.grpc.scalekit.v1.connections.CreateEnvironmentConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEnvironmentConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse createConnection(com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionResponse assignDomainsToConnection(com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignDomainsToConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse getEnvironmentConnection(com.scalekit.grpc.scalekit.v1.connections.GetEnvironmentConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEnvironmentConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse getConnection(com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse listConnections(com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListConnectionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsResponse listOrganizationConnections(com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrganizationConnectionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsResponse searchOrganizationConnections(com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchOrganizationConnectionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse updateEnvironmentConnection(com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEnvironmentConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse updateConnection(com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteEnvironmentConnection(com.scalekit.grpc.scalekit.v1.connections.DeleteEnvironmentConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEnvironmentConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteConnection(com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse enableEnvironmentConnection(com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableEnvironmentConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse enableConnection(com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse disableEnvironmentConnection(com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableEnvironmentConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse disableConnection(com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultResponse getConnectionTestResult(com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConnectionTestResultMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsResponse listAppConnections(com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAppConnectionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsResponse updateConnectionUserManagementSettings(com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateConnectionUserManagementSettingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ConnectionService.
   */
  public static final class ConnectionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ConnectionServiceFutureStub> {
    private ConnectionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse> createEnvironmentConnection(
        com.scalekit.grpc.scalekit.v1.connections.CreateEnvironmentConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEnvironmentConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse> createConnection(
        com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionResponse> assignDomainsToConnection(
        com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignDomainsToConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse> getEnvironmentConnection(
        com.scalekit.grpc.scalekit.v1.connections.GetEnvironmentConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEnvironmentConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse> getConnection(
        com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse> listConnections(
        com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListConnectionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsResponse> listOrganizationConnections(
        com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrganizationConnectionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsResponse> searchOrganizationConnections(
        com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchOrganizationConnectionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse> updateEnvironmentConnection(
        com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEnvironmentConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse> updateConnection(
        com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteEnvironmentConnection(
        com.scalekit.grpc.scalekit.v1.connections.DeleteEnvironmentConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEnvironmentConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteConnection(
        com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> enableEnvironmentConnection(
        com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableEnvironmentConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> enableConnection(
        com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> disableEnvironmentConnection(
        com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableEnvironmentConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse> disableConnection(
        com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultResponse> getConnectionTestResult(
        com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConnectionTestResultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsResponse> listAppConnections(
        com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAppConnectionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsResponse> updateConnectionUserManagementSettings(
        com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateConnectionUserManagementSettingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ENVIRONMENT_CONNECTION = 0;
  private static final int METHODID_CREATE_CONNECTION = 1;
  private static final int METHODID_ASSIGN_DOMAINS_TO_CONNECTION = 2;
  private static final int METHODID_GET_ENVIRONMENT_CONNECTION = 3;
  private static final int METHODID_GET_CONNECTION = 4;
  private static final int METHODID_LIST_CONNECTIONS = 5;
  private static final int METHODID_LIST_ORGANIZATION_CONNECTIONS = 6;
  private static final int METHODID_SEARCH_ORGANIZATION_CONNECTIONS = 7;
  private static final int METHODID_UPDATE_ENVIRONMENT_CONNECTION = 8;
  private static final int METHODID_UPDATE_CONNECTION = 9;
  private static final int METHODID_DELETE_ENVIRONMENT_CONNECTION = 10;
  private static final int METHODID_DELETE_CONNECTION = 11;
  private static final int METHODID_ENABLE_ENVIRONMENT_CONNECTION = 12;
  private static final int METHODID_ENABLE_CONNECTION = 13;
  private static final int METHODID_DISABLE_ENVIRONMENT_CONNECTION = 14;
  private static final int METHODID_DISABLE_CONNECTION = 15;
  private static final int METHODID_GET_CONNECTION_TEST_RESULT = 16;
  private static final int METHODID_LIST_APP_CONNECTIONS = 17;
  private static final int METHODID_UPDATE_CONNECTION_USER_MANAGEMENT_SETTINGS = 18;

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
        case METHODID_CREATE_ENVIRONMENT_CONNECTION:
          serviceImpl.createEnvironmentConnection((com.scalekit.grpc.scalekit.v1.connections.CreateEnvironmentConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse>) responseObserver);
          break;
        case METHODID_CREATE_CONNECTION:
          serviceImpl.createConnection((com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_DOMAINS_TO_CONNECTION:
          serviceImpl.assignDomainsToConnection((com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionResponse>) responseObserver);
          break;
        case METHODID_GET_ENVIRONMENT_CONNECTION:
          serviceImpl.getEnvironmentConnection((com.scalekit.grpc.scalekit.v1.connections.GetEnvironmentConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse>) responseObserver);
          break;
        case METHODID_GET_CONNECTION:
          serviceImpl.getConnection((com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse>) responseObserver);
          break;
        case METHODID_LIST_CONNECTIONS:
          serviceImpl.listConnections((com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse>) responseObserver);
          break;
        case METHODID_LIST_ORGANIZATION_CONNECTIONS:
          serviceImpl.listOrganizationConnections((com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ORGANIZATION_CONNECTIONS:
          serviceImpl.searchOrganizationConnections((com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ENVIRONMENT_CONNECTION:
          serviceImpl.updateEnvironmentConnection((com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CONNECTION:
          serviceImpl.updateConnection((com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse>) responseObserver);
          break;
        case METHODID_DELETE_ENVIRONMENT_CONNECTION:
          serviceImpl.deleteEnvironmentConnection((com.scalekit.grpc.scalekit.v1.connections.DeleteEnvironmentConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_CONNECTION:
          serviceImpl.deleteConnection((com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ENABLE_ENVIRONMENT_CONNECTION:
          serviceImpl.enableEnvironmentConnection((com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse>) responseObserver);
          break;
        case METHODID_ENABLE_CONNECTION:
          serviceImpl.enableConnection((com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse>) responseObserver);
          break;
        case METHODID_DISABLE_ENVIRONMENT_CONNECTION:
          serviceImpl.disableEnvironmentConnection((com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse>) responseObserver);
          break;
        case METHODID_DISABLE_CONNECTION:
          serviceImpl.disableConnection((com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse>) responseObserver);
          break;
        case METHODID_GET_CONNECTION_TEST_RESULT:
          serviceImpl.getConnectionTestResult((com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultResponse>) responseObserver);
          break;
        case METHODID_LIST_APP_CONNECTIONS:
          serviceImpl.listAppConnections((com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CONNECTION_USER_MANAGEMENT_SETTINGS:
          serviceImpl.updateConnectionUserManagementSettings((com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsResponse>) responseObserver);
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
          getCreateEnvironmentConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.CreateEnvironmentConnectionRequest,
              com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse>(
                service, METHODID_CREATE_ENVIRONMENT_CONNECTION)))
        .addMethod(
          getCreateConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.CreateConnectionRequest,
              com.scalekit.grpc.scalekit.v1.connections.CreateConnectionResponse>(
                service, METHODID_CREATE_CONNECTION)))
        .addMethod(
          getAssignDomainsToConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionRequest,
              com.scalekit.grpc.scalekit.v1.connections.AssignDomainsToConnectionResponse>(
                service, METHODID_ASSIGN_DOMAINS_TO_CONNECTION)))
        .addMethod(
          getGetEnvironmentConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.GetEnvironmentConnectionRequest,
              com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse>(
                service, METHODID_GET_ENVIRONMENT_CONNECTION)))
        .addMethod(
          getGetConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.GetConnectionRequest,
              com.scalekit.grpc.scalekit.v1.connections.GetConnectionResponse>(
                service, METHODID_GET_CONNECTION)))
        .addMethod(
          getListConnectionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.ListConnectionsRequest,
              com.scalekit.grpc.scalekit.v1.connections.ListConnectionsResponse>(
                service, METHODID_LIST_CONNECTIONS)))
        .addMethod(
          getListOrganizationConnectionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsRequest,
              com.scalekit.grpc.scalekit.v1.connections.ListOrganizationConnectionsResponse>(
                service, METHODID_LIST_ORGANIZATION_CONNECTIONS)))
        .addMethod(
          getSearchOrganizationConnectionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsRequest,
              com.scalekit.grpc.scalekit.v1.connections.SearchOrganizationConnectionsResponse>(
                service, METHODID_SEARCH_ORGANIZATION_CONNECTIONS)))
        .addMethod(
          getUpdateEnvironmentConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.UpdateEnvironmentConnectionRequest,
              com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse>(
                service, METHODID_UPDATE_ENVIRONMENT_CONNECTION)))
        .addMethod(
          getUpdateConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionRequest,
              com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionResponse>(
                service, METHODID_UPDATE_CONNECTION)))
        .addMethod(
          getDeleteEnvironmentConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.DeleteEnvironmentConnectionRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ENVIRONMENT_CONNECTION)))
        .addMethod(
          getDeleteConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.DeleteConnectionRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_CONNECTION)))
        .addMethod(
          getEnableEnvironmentConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest,
              com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse>(
                service, METHODID_ENABLE_ENVIRONMENT_CONNECTION)))
        .addMethod(
          getEnableConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest,
              com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse>(
                service, METHODID_ENABLE_CONNECTION)))
        .addMethod(
          getDisableEnvironmentConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.ToggleEnvironmentConnectionRequest,
              com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse>(
                service, METHODID_DISABLE_ENVIRONMENT_CONNECTION)))
        .addMethod(
          getDisableConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionRequest,
              com.scalekit.grpc.scalekit.v1.connections.ToggleConnectionResponse>(
                service, METHODID_DISABLE_CONNECTION)))
        .addMethod(
          getGetConnectionTestResultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultRequest,
              com.scalekit.grpc.scalekit.v1.connections.GetConnectionTestResultResponse>(
                service, METHODID_GET_CONNECTION_TEST_RESULT)))
        .addMethod(
          getListAppConnectionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsRequest,
              com.scalekit.grpc.scalekit.v1.connections.ListAppConnectionsResponse>(
                service, METHODID_LIST_APP_CONNECTIONS)))
        .addMethod(
          getUpdateConnectionUserManagementSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsRequest,
              com.scalekit.grpc.scalekit.v1.connections.UpdateConnectionUserManagementSettingsResponse>(
                service, METHODID_UPDATE_CONNECTION_USER_MANAGEMENT_SETTINGS)))
        .build();
  }

  private static abstract class ConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConnectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.connections.ConnectionsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConnectionService");
    }
  }

  private static final class ConnectionServiceFileDescriptorSupplier
      extends ConnectionServiceBaseDescriptorSupplier {
    ConnectionServiceFileDescriptorSupplier() {}
  }

  private static final class ConnectionServiceMethodDescriptorSupplier
      extends ConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ConnectionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ConnectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConnectionServiceFileDescriptorSupplier())
              .addMethod(getCreateEnvironmentConnectionMethod())
              .addMethod(getCreateConnectionMethod())
              .addMethod(getAssignDomainsToConnectionMethod())
              .addMethod(getGetEnvironmentConnectionMethod())
              .addMethod(getGetConnectionMethod())
              .addMethod(getListConnectionsMethod())
              .addMethod(getListOrganizationConnectionsMethod())
              .addMethod(getSearchOrganizationConnectionsMethod())
              .addMethod(getUpdateEnvironmentConnectionMethod())
              .addMethod(getUpdateConnectionMethod())
              .addMethod(getDeleteEnvironmentConnectionMethod())
              .addMethod(getDeleteConnectionMethod())
              .addMethod(getEnableEnvironmentConnectionMethod())
              .addMethod(getEnableConnectionMethod())
              .addMethod(getDisableEnvironmentConnectionMethod())
              .addMethod(getDisableConnectionMethod())
              .addMethod(getGetConnectionTestResultMethod())
              .addMethod(getListAppConnectionsMethod())
              .addMethod(getUpdateConnectionUserManagementSettingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
