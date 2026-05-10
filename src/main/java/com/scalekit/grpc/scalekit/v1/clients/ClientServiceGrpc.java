package com.scalekit.grpc.scalekit.v1.clients;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/clients/clients.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClientServiceGrpc {

  private ClientServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.clients.ClientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest,
      com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse> getListClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListClient",
      requestType = com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest,
      com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse> getListClientMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest, com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse> getListClientMethod;
    if ((getListClientMethod = ClientServiceGrpc.getListClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getListClientMethod = ClientServiceGrpc.getListClientMethod) == null) {
          ClientServiceGrpc.getListClientMethod = getListClientMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest, com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("ListClient"))
              .build();
        }
      }
    }
    return getListClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.GetClientResponse> getGetClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClient",
      requestType = com.scalekit.grpc.scalekit.v1.clients.GetClientRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.GetClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.GetClientResponse> getGetClientMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetClientRequest, com.scalekit.grpc.scalekit.v1.clients.GetClientResponse> getGetClientMethod;
    if ((getGetClientMethod = ClientServiceGrpc.getGetClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getGetClientMethod = ClientServiceGrpc.getGetClientMethod) == null) {
          ClientServiceGrpc.getGetClientMethod = getGetClientMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.GetClientRequest, com.scalekit.grpc.scalekit.v1.clients.GetClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.GetClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.GetClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("GetClient"))
              .build();
        }
      }
    }
    return getGetClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse> getUpdateClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateClient",
      requestType = com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse> getUpdateClientMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest, com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse> getUpdateClientMethod;
    if ((getUpdateClientMethod = ClientServiceGrpc.getUpdateClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getUpdateClientMethod = ClientServiceGrpc.getUpdateClientMethod) == null) {
          ClientServiceGrpc.getUpdateClientMethod = getUpdateClientMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest, com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("UpdateClient"))
              .build();
        }
      }
    }
    return getUpdateClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest,
      com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse> getCreateClientSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateClientSecret",
      requestType = com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest,
      com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse> getCreateClientSecretMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest, com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse> getCreateClientSecretMethod;
    if ((getCreateClientSecretMethod = ClientServiceGrpc.getCreateClientSecretMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getCreateClientSecretMethod = ClientServiceGrpc.getCreateClientSecretMethod) == null) {
          ClientServiceGrpc.getCreateClientSecretMethod = getCreateClientSecretMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest, com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateClientSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("CreateClientSecret"))
              .build();
        }
      }
    }
    return getCreateClientSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest,
      com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse> getUpdateClientSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateClientSecret",
      requestType = com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest,
      com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse> getUpdateClientSecretMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest, com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse> getUpdateClientSecretMethod;
    if ((getUpdateClientSecretMethod = ClientServiceGrpc.getUpdateClientSecretMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getUpdateClientSecretMethod = ClientServiceGrpc.getUpdateClientSecretMethod) == null) {
          ClientServiceGrpc.getUpdateClientSecretMethod = getUpdateClientSecretMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest, com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateClientSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("UpdateClientSecret"))
              .build();
        }
      }
    }
    return getUpdateClientSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest,
      com.google.protobuf.Empty> getDeleteClientSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteClientSecret",
      requestType = com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest,
      com.google.protobuf.Empty> getDeleteClientSecretMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest, com.google.protobuf.Empty> getDeleteClientSecretMethod;
    if ((getDeleteClientSecretMethod = ClientServiceGrpc.getDeleteClientSecretMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getDeleteClientSecretMethod = ClientServiceGrpc.getDeleteClientSecretMethod) == null) {
          ClientServiceGrpc.getDeleteClientSecretMethod = getDeleteClientSecretMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteClientSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("DeleteClientSecret"))
              .build();
        }
      }
    }
    return getDeleteClientSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientResponse> getCreateOrganizationClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrganizationClient",
      requestType = com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientResponse> getCreateOrganizationClientMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientRequest, com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientResponse> getCreateOrganizationClientMethod;
    if ((getCreateOrganizationClientMethod = ClientServiceGrpc.getCreateOrganizationClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getCreateOrganizationClientMethod = ClientServiceGrpc.getCreateOrganizationClientMethod) == null) {
          ClientServiceGrpc.getCreateOrganizationClientMethod = getCreateOrganizationClientMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientRequest, com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrganizationClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("CreateOrganizationClient"))
              .build();
        }
      }
    }
    return getCreateOrganizationClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientResponse> getGetOrganizationClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizationClient",
      requestType = com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientResponse> getGetOrganizationClientMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientRequest, com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientResponse> getGetOrganizationClientMethod;
    if ((getGetOrganizationClientMethod = ClientServiceGrpc.getGetOrganizationClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getGetOrganizationClientMethod = ClientServiceGrpc.getGetOrganizationClientMethod) == null) {
          ClientServiceGrpc.getGetOrganizationClientMethod = getGetOrganizationClientMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientRequest, com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganizationClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("GetOrganizationClient"))
              .build();
        }
      }
    }
    return getGetOrganizationClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretRequest,
      com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretResponse> getCreateOrganizationClientSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrganizationClientSecret",
      requestType = com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretRequest,
      com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretResponse> getCreateOrganizationClientSecretMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretRequest, com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretResponse> getCreateOrganizationClientSecretMethod;
    if ((getCreateOrganizationClientSecretMethod = ClientServiceGrpc.getCreateOrganizationClientSecretMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getCreateOrganizationClientSecretMethod = ClientServiceGrpc.getCreateOrganizationClientSecretMethod) == null) {
          ClientServiceGrpc.getCreateOrganizationClientSecretMethod = getCreateOrganizationClientSecretMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretRequest, com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrganizationClientSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("CreateOrganizationClientSecret"))
              .build();
        }
      }
    }
    return getCreateOrganizationClientSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientSecretRequest,
      com.google.protobuf.Empty> getDeleteOrganizationClientSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOrganizationClientSecret",
      requestType = com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientSecretRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientSecretRequest,
      com.google.protobuf.Empty> getDeleteOrganizationClientSecretMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientSecretRequest, com.google.protobuf.Empty> getDeleteOrganizationClientSecretMethod;
    if ((getDeleteOrganizationClientSecretMethod = ClientServiceGrpc.getDeleteOrganizationClientSecretMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getDeleteOrganizationClientSecretMethod = ClientServiceGrpc.getDeleteOrganizationClientSecretMethod) == null) {
          ClientServiceGrpc.getDeleteOrganizationClientSecretMethod = getDeleteOrganizationClientSecretMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientSecretRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOrganizationClientSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("DeleteOrganizationClientSecret"))
              .build();
        }
      }
    }
    return getDeleteOrganizationClientSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientResponse> getUpdateOrganizationClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganizationClient",
      requestType = com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientResponse> getUpdateOrganizationClientMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientRequest, com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientResponse> getUpdateOrganizationClientMethod;
    if ((getUpdateOrganizationClientMethod = ClientServiceGrpc.getUpdateOrganizationClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getUpdateOrganizationClientMethod = ClientServiceGrpc.getUpdateOrganizationClientMethod) == null) {
          ClientServiceGrpc.getUpdateOrganizationClientMethod = getUpdateOrganizationClientMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientRequest, com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganizationClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("UpdateOrganizationClient"))
              .build();
        }
      }
    }
    return getUpdateOrganizationClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientRequest,
      com.google.protobuf.Empty> getDeleteOrganizationClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOrganizationClient",
      requestType = com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientRequest,
      com.google.protobuf.Empty> getDeleteOrganizationClientMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientRequest, com.google.protobuf.Empty> getDeleteOrganizationClientMethod;
    if ((getDeleteOrganizationClientMethod = ClientServiceGrpc.getDeleteOrganizationClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getDeleteOrganizationClientMethod = ClientServiceGrpc.getDeleteOrganizationClientMethod) == null) {
          ClientServiceGrpc.getDeleteOrganizationClientMethod = getDeleteOrganizationClientMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOrganizationClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("DeleteOrganizationClient"))
              .build();
        }
      }
    }
    return getDeleteOrganizationClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsRequest,
      com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsResponse> getListOrganizationClientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrganizationClients",
      requestType = com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsRequest,
      com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsResponse> getListOrganizationClientsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsRequest, com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsResponse> getListOrganizationClientsMethod;
    if ((getListOrganizationClientsMethod = ClientServiceGrpc.getListOrganizationClientsMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getListOrganizationClientsMethod = ClientServiceGrpc.getListOrganizationClientsMethod) == null) {
          ClientServiceGrpc.getListOrganizationClientsMethod = getListOrganizationClientsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsRequest, com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrganizationClients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("ListOrganizationClients"))
              .build();
        }
      }
    }
    return getListOrganizationClientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateResourceRequest,
      com.scalekit.grpc.scalekit.v1.clients.CreateResourceResponse> getCreateResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateResource",
      requestType = com.scalekit.grpc.scalekit.v1.clients.CreateResourceRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.CreateResourceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateResourceRequest,
      com.scalekit.grpc.scalekit.v1.clients.CreateResourceResponse> getCreateResourceMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateResourceRequest, com.scalekit.grpc.scalekit.v1.clients.CreateResourceResponse> getCreateResourceMethod;
    if ((getCreateResourceMethod = ClientServiceGrpc.getCreateResourceMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getCreateResourceMethod = ClientServiceGrpc.getCreateResourceMethod) == null) {
          ClientServiceGrpc.getCreateResourceMethod = getCreateResourceMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.CreateResourceRequest, com.scalekit.grpc.scalekit.v1.clients.CreateResourceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.CreateResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.CreateResourceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("CreateResource"))
              .build();
        }
      }
    }
    return getCreateResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetResourceRequest,
      com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse> getGetResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetResource",
      requestType = com.scalekit.grpc.scalekit.v1.clients.GetResourceRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetResourceRequest,
      com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse> getGetResourceMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetResourceRequest, com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse> getGetResourceMethod;
    if ((getGetResourceMethod = ClientServiceGrpc.getGetResourceMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getGetResourceMethod = ClientServiceGrpc.getGetResourceMethod) == null) {
          ClientServiceGrpc.getGetResourceMethod = getGetResourceMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.GetResourceRequest, com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.GetResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("GetResource"))
              .build();
        }
      }
    }
    return getGetResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListResourcesRequest,
      com.scalekit.grpc.scalekit.v1.clients.ListResourcesResponse> getListResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListResources",
      requestType = com.scalekit.grpc.scalekit.v1.clients.ListResourcesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.ListResourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListResourcesRequest,
      com.scalekit.grpc.scalekit.v1.clients.ListResourcesResponse> getListResourcesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListResourcesRequest, com.scalekit.grpc.scalekit.v1.clients.ListResourcesResponse> getListResourcesMethod;
    if ((getListResourcesMethod = ClientServiceGrpc.getListResourcesMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getListResourcesMethod = ClientServiceGrpc.getListResourcesMethod) == null) {
          ClientServiceGrpc.getListResourcesMethod = getListResourcesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.ListResourcesRequest, com.scalekit.grpc.scalekit.v1.clients.ListResourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.ListResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.ListResourcesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("ListResources"))
              .build();
        }
      }
    }
    return getListResourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateResourceRequest,
      com.scalekit.grpc.scalekit.v1.clients.UpdateResourceResponse> getUpdateResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateResource",
      requestType = com.scalekit.grpc.scalekit.v1.clients.UpdateResourceRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.UpdateResourceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateResourceRequest,
      com.scalekit.grpc.scalekit.v1.clients.UpdateResourceResponse> getUpdateResourceMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateResourceRequest, com.scalekit.grpc.scalekit.v1.clients.UpdateResourceResponse> getUpdateResourceMethod;
    if ((getUpdateResourceMethod = ClientServiceGrpc.getUpdateResourceMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getUpdateResourceMethod = ClientServiceGrpc.getUpdateResourceMethod) == null) {
          ClientServiceGrpc.getUpdateResourceMethod = getUpdateResourceMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.UpdateResourceRequest, com.scalekit.grpc.scalekit.v1.clients.UpdateResourceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.UpdateResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.UpdateResourceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("UpdateResource"))
              .build();
        }
      }
    }
    return getUpdateResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteResourceRequest,
      com.google.protobuf.Empty> getDeleteResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteResource",
      requestType = com.scalekit.grpc.scalekit.v1.clients.DeleteResourceRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteResourceRequest,
      com.google.protobuf.Empty> getDeleteResourceMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteResourceRequest, com.google.protobuf.Empty> getDeleteResourceMethod;
    if ((getDeleteResourceMethod = ClientServiceGrpc.getDeleteResourceMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getDeleteResourceMethod = ClientServiceGrpc.getDeleteResourceMethod) == null) {
          ClientServiceGrpc.getDeleteResourceMethod = getDeleteResourceMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.DeleteResourceRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.DeleteResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("DeleteResource"))
              .build();
        }
      }
    }
    return getDeleteResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteResourceProviderRequest,
      com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse> getDeleteResourceProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteResourceProvider",
      requestType = com.scalekit.grpc.scalekit.v1.clients.DeleteResourceProviderRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteResourceProviderRequest,
      com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse> getDeleteResourceProviderMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteResourceProviderRequest, com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse> getDeleteResourceProviderMethod;
    if ((getDeleteResourceProviderMethod = ClientServiceGrpc.getDeleteResourceProviderMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getDeleteResourceProviderMethod = ClientServiceGrpc.getDeleteResourceProviderMethod) == null) {
          ClientServiceGrpc.getDeleteResourceProviderMethod = getDeleteResourceProviderMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.DeleteResourceProviderRequest, com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteResourceProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.DeleteResourceProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("DeleteResourceProvider"))
              .build();
        }
      }
    }
    return getDeleteResourceProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientResponse> getCreateResourceClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateResourceClient",
      requestType = com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientResponse> getCreateResourceClientMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientRequest, com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientResponse> getCreateResourceClientMethod;
    if ((getCreateResourceClientMethod = ClientServiceGrpc.getCreateResourceClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getCreateResourceClientMethod = ClientServiceGrpc.getCreateResourceClientMethod) == null) {
          ClientServiceGrpc.getCreateResourceClientMethod = getCreateResourceClientMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientRequest, com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateResourceClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("CreateResourceClient"))
              .build();
        }
      }
    }
    return getCreateResourceClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientResponse> getUpdateResourceClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateResourceClient",
      requestType = com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientResponse> getUpdateResourceClientMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientRequest, com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientResponse> getUpdateResourceClientMethod;
    if ((getUpdateResourceClientMethod = ClientServiceGrpc.getUpdateResourceClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getUpdateResourceClientMethod = ClientServiceGrpc.getUpdateResourceClientMethod) == null) {
          ClientServiceGrpc.getUpdateResourceClientMethod = getUpdateResourceClientMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientRequest, com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateResourceClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("UpdateResourceClient"))
              .build();
        }
      }
    }
    return getUpdateResourceClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetResourceClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.GetResourceClientResponse> getGetResourceClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetResourceClient",
      requestType = com.scalekit.grpc.scalekit.v1.clients.GetResourceClientRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.GetResourceClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetResourceClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.GetResourceClientResponse> getGetResourceClientMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetResourceClientRequest, com.scalekit.grpc.scalekit.v1.clients.GetResourceClientResponse> getGetResourceClientMethod;
    if ((getGetResourceClientMethod = ClientServiceGrpc.getGetResourceClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getGetResourceClientMethod = ClientServiceGrpc.getGetResourceClientMethod) == null) {
          ClientServiceGrpc.getGetResourceClientMethod = getGetResourceClientMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.GetResourceClientRequest, com.scalekit.grpc.scalekit.v1.clients.GetResourceClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetResourceClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.GetResourceClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.GetResourceClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("GetResourceClient"))
              .build();
        }
      }
    }
    return getGetResourceClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsRequest,
      com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsResponse> getListResourceClientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListResourceClients",
      requestType = com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsRequest,
      com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsResponse> getListResourceClientsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsRequest, com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsResponse> getListResourceClientsMethod;
    if ((getListResourceClientsMethod = ClientServiceGrpc.getListResourceClientsMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getListResourceClientsMethod = ClientServiceGrpc.getListResourceClientsMethod) == null) {
          ClientServiceGrpc.getListResourceClientsMethod = getListResourceClientsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsRequest, com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListResourceClients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("ListResourceClients"))
              .build();
        }
      }
    }
    return getListResourceClientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientResponse> getDeleteResourceClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteResourceClient",
      requestType = com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientResponse> getDeleteResourceClientMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientRequest, com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientResponse> getDeleteResourceClientMethod;
    if ((getDeleteResourceClientMethod = ClientServiceGrpc.getDeleteResourceClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getDeleteResourceClientMethod = ClientServiceGrpc.getDeleteResourceClientMethod) == null) {
          ClientServiceGrpc.getDeleteResourceClientMethod = getDeleteResourceClientMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientRequest, com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteResourceClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("DeleteResourceClient"))
              .build();
        }
      }
    }
    return getDeleteResourceClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.RegisterClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.RegisterClientResponse> getRegisterClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterClient",
      requestType = com.scalekit.grpc.scalekit.v1.clients.RegisterClientRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.RegisterClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.RegisterClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.RegisterClientResponse> getRegisterClientMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.RegisterClientRequest, com.scalekit.grpc.scalekit.v1.clients.RegisterClientResponse> getRegisterClientMethod;
    if ((getRegisterClientMethod = ClientServiceGrpc.getRegisterClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getRegisterClientMethod = ClientServiceGrpc.getRegisterClientMethod) == null) {
          ClientServiceGrpc.getRegisterClientMethod = getRegisterClientMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.RegisterClientRequest, com.scalekit.grpc.scalekit.v1.clients.RegisterClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.RegisterClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.RegisterClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("RegisterClient"))
              .build();
        }
      }
    }
    return getRegisterClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateScopeRequest,
      com.scalekit.grpc.scalekit.v1.clients.CreateScopeResponse> getCreateScopeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateScope",
      requestType = com.scalekit.grpc.scalekit.v1.clients.CreateScopeRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.CreateScopeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateScopeRequest,
      com.scalekit.grpc.scalekit.v1.clients.CreateScopeResponse> getCreateScopeMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateScopeRequest, com.scalekit.grpc.scalekit.v1.clients.CreateScopeResponse> getCreateScopeMethod;
    if ((getCreateScopeMethod = ClientServiceGrpc.getCreateScopeMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getCreateScopeMethod = ClientServiceGrpc.getCreateScopeMethod) == null) {
          ClientServiceGrpc.getCreateScopeMethod = getCreateScopeMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.CreateScopeRequest, com.scalekit.grpc.scalekit.v1.clients.CreateScopeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateScope"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.CreateScopeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.CreateScopeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("CreateScope"))
              .build();
        }
      }
    }
    return getCreateScopeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListScopesRequest,
      com.scalekit.grpc.scalekit.v1.clients.ListScopesResponse> getListScopesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListScopes",
      requestType = com.scalekit.grpc.scalekit.v1.clients.ListScopesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.ListScopesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListScopesRequest,
      com.scalekit.grpc.scalekit.v1.clients.ListScopesResponse> getListScopesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListScopesRequest, com.scalekit.grpc.scalekit.v1.clients.ListScopesResponse> getListScopesMethod;
    if ((getListScopesMethod = ClientServiceGrpc.getListScopesMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getListScopesMethod = ClientServiceGrpc.getListScopesMethod) == null) {
          ClientServiceGrpc.getListScopesMethod = getListScopesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.ListScopesRequest, com.scalekit.grpc.scalekit.v1.clients.ListScopesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListScopes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.ListScopesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.ListScopesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("ListScopes"))
              .build();
        }
      }
    }
    return getListScopesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateScopeRequest,
      com.scalekit.grpc.scalekit.v1.clients.UpdateScopeResponse> getUpdateScopeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateScope",
      requestType = com.scalekit.grpc.scalekit.v1.clients.UpdateScopeRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.UpdateScopeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateScopeRequest,
      com.scalekit.grpc.scalekit.v1.clients.UpdateScopeResponse> getUpdateScopeMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateScopeRequest, com.scalekit.grpc.scalekit.v1.clients.UpdateScopeResponse> getUpdateScopeMethod;
    if ((getUpdateScopeMethod = ClientServiceGrpc.getUpdateScopeMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getUpdateScopeMethod = ClientServiceGrpc.getUpdateScopeMethod) == null) {
          ClientServiceGrpc.getUpdateScopeMethod = getUpdateScopeMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.UpdateScopeRequest, com.scalekit.grpc.scalekit.v1.clients.UpdateScopeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateScope"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.UpdateScopeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.UpdateScopeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("UpdateScope"))
              .build();
        }
      }
    }
    return getUpdateScopeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteScopeRequest,
      com.google.protobuf.Empty> getDeleteScopeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteScope",
      requestType = com.scalekit.grpc.scalekit.v1.clients.DeleteScopeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteScopeRequest,
      com.google.protobuf.Empty> getDeleteScopeMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.DeleteScopeRequest, com.google.protobuf.Empty> getDeleteScopeMethod;
    if ((getDeleteScopeMethod = ClientServiceGrpc.getDeleteScopeMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getDeleteScopeMethod = ClientServiceGrpc.getDeleteScopeMethod) == null) {
          ClientServiceGrpc.getDeleteScopeMethod = getDeleteScopeMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.DeleteScopeRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteScope"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.DeleteScopeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("DeleteScope"))
              .build();
        }
      }
    }
    return getDeleteScopeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.clients.GetConsentDetailsResponse> getGetConsentDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConsentDetails",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.GetConsentDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.clients.GetConsentDetailsResponse> getGetConsentDetailsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.clients.GetConsentDetailsResponse> getGetConsentDetailsMethod;
    if ((getGetConsentDetailsMethod = ClientServiceGrpc.getGetConsentDetailsMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getGetConsentDetailsMethod = ClientServiceGrpc.getGetConsentDetailsMethod) == null) {
          ClientServiceGrpc.getGetConsentDetailsMethod = getGetConsentDetailsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.clients.GetConsentDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConsentDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.GetConsentDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("GetConsentDetails"))
              .build();
        }
      }
    }
    return getGetConsentDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentRequest,
      com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentResponse> getRevokeUserConsentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeUserConsent",
      requestType = com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentRequest,
      com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentResponse> getRevokeUserConsentMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentRequest, com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentResponse> getRevokeUserConsentMethod;
    if ((getRevokeUserConsentMethod = ClientServiceGrpc.getRevokeUserConsentMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getRevokeUserConsentMethod = ClientServiceGrpc.getRevokeUserConsentMethod) == null) {
          ClientServiceGrpc.getRevokeUserConsentMethod = getRevokeUserConsentMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentRequest, com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeUserConsent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("RevokeUserConsent"))
              .build();
        }
      }
    }
    return getRevokeUserConsentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionRequest,
      com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionResponse> getEnsureResourceConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnsureResourceConnection",
      requestType = com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionRequest,
      com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionResponse> getEnsureResourceConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionRequest, com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionResponse> getEnsureResourceConnectionMethod;
    if ((getEnsureResourceConnectionMethod = ClientServiceGrpc.getEnsureResourceConnectionMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getEnsureResourceConnectionMethod = ClientServiceGrpc.getEnsureResourceConnectionMethod) == null) {
          ClientServiceGrpc.getEnsureResourceConnectionMethod = getEnsureResourceConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionRequest, com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnsureResourceConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("EnsureResourceConnection"))
              .build();
        }
      }
    }
    return getEnsureResourceConnectionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientServiceStub>() {
        @java.lang.Override
        public ClientServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientServiceStub(channel, callOptions);
        }
      };
    return ClientServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientServiceBlockingStub>() {
        @java.lang.Override
        public ClientServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientServiceBlockingStub(channel, callOptions);
        }
      };
    return ClientServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientServiceFutureStub>() {
        @java.lang.Override
        public ClientServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientServiceFutureStub(channel, callOptions);
        }
      };
    return ClientServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void listClient(com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListClientMethod(), responseObserver);
    }

    /**
     */
    default void getClient(com.scalekit.grpc.scalekit.v1.clients.GetClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClientMethod(), responseObserver);
    }

    /**
     */
    default void updateClient(com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateClientMethod(), responseObserver);
    }

    /**
     */
    default void createClientSecret(com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateClientSecretMethod(), responseObserver);
    }

    /**
     */
    default void updateClientSecret(com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateClientSecretMethod(), responseObserver);
    }

    /**
     */
    default void deleteClientSecret(com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteClientSecretMethod(), responseObserver);
    }

    /**
     */
    default void createOrganizationClient(com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrganizationClientMethod(), responseObserver);
    }

    /**
     */
    default void getOrganizationClient(com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationClientMethod(), responseObserver);
    }

    /**
     */
    default void createOrganizationClientSecret(com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrganizationClientSecretMethod(), responseObserver);
    }

    /**
     */
    default void deleteOrganizationClientSecret(com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientSecretRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOrganizationClientSecretMethod(), responseObserver);
    }

    /**
     */
    default void updateOrganizationClient(com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationClientMethod(), responseObserver);
    }

    /**
     */
    default void deleteOrganizationClient(com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOrganizationClientMethod(), responseObserver);
    }

    /**
     */
    default void listOrganizationClients(com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrganizationClientsMethod(), responseObserver);
    }

    /**
     */
    default void createResource(com.scalekit.grpc.scalekit.v1.clients.CreateResourceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateResourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateResourceMethod(), responseObserver);
    }

    /**
     */
    default void getResource(com.scalekit.grpc.scalekit.v1.clients.GetResourceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetResourceMethod(), responseObserver);
    }

    /**
     */
    default void listResources(com.scalekit.grpc.scalekit.v1.clients.ListResourcesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListResourcesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListResourcesMethod(), responseObserver);
    }

    /**
     */
    default void updateResource(com.scalekit.grpc.scalekit.v1.clients.UpdateResourceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateResourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateResourceMethod(), responseObserver);
    }

    /**
     */
    default void deleteResource(com.scalekit.grpc.scalekit.v1.clients.DeleteResourceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteResourceMethod(), responseObserver);
    }

    /**
     */
    default void deleteResourceProvider(com.scalekit.grpc.scalekit.v1.clients.DeleteResourceProviderRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteResourceProviderMethod(), responseObserver);
    }

    /**
     */
    default void createResourceClient(com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateResourceClientMethod(), responseObserver);
    }

    /**
     */
    default void updateResourceClient(com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateResourceClientMethod(), responseObserver);
    }

    /**
     */
    default void getResourceClient(com.scalekit.grpc.scalekit.v1.clients.GetResourceClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetResourceClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetResourceClientMethod(), responseObserver);
    }

    /**
     */
    default void listResourceClients(com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListResourceClientsMethod(), responseObserver);
    }

    /**
     */
    default void deleteResourceClient(com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteResourceClientMethod(), responseObserver);
    }

    /**
     */
    default void registerClient(com.scalekit.grpc.scalekit.v1.clients.RegisterClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.RegisterClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterClientMethod(), responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    default void createScope(com.scalekit.grpc.scalekit.v1.clients.CreateScopeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateScopeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateScopeMethod(), responseObserver);
    }

    /**
     */
    default void listScopes(com.scalekit.grpc.scalekit.v1.clients.ListScopesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListScopesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListScopesMethod(), responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    default void updateScope(com.scalekit.grpc.scalekit.v1.clients.UpdateScopeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateScopeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateScopeMethod(), responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    default void deleteScope(com.scalekit.grpc.scalekit.v1.clients.DeleteScopeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteScopeMethod(), responseObserver);
    }

    /**
     */
    default void getConsentDetails(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetConsentDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConsentDetailsMethod(), responseObserver);
    }

    /**
     */
    default void revokeUserConsent(com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeUserConsentMethod(), responseObserver);
    }

    /**
     */
    default void ensureResourceConnection(com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnsureResourceConnectionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ClientService.
   */
  public static abstract class ClientServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ClientServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ClientService.
   */
  public static final class ClientServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ClientServiceStub> {
    private ClientServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientServiceStub(channel, callOptions);
    }

    /**
     */
    public void listClient(com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClient(com.scalekit.grpc.scalekit.v1.clients.GetClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateClient(com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createClientSecret(com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateClientSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateClientSecret(com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateClientSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteClientSecret(com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteClientSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createOrganizationClient(com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrganizationClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrganizationClient(com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createOrganizationClientSecret(com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrganizationClientSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOrganizationClientSecret(com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientSecretRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOrganizationClientSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOrganizationClient(com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOrganizationClient(com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOrganizationClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOrganizationClients(com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrganizationClientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createResource(com.scalekit.grpc.scalekit.v1.clients.CreateResourceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateResourceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getResource(com.scalekit.grpc.scalekit.v1.clients.GetResourceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listResources(com.scalekit.grpc.scalekit.v1.clients.ListResourcesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListResourcesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListResourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateResource(com.scalekit.grpc.scalekit.v1.clients.UpdateResourceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateResourceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteResource(com.scalekit.grpc.scalekit.v1.clients.DeleteResourceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteResourceProvider(com.scalekit.grpc.scalekit.v1.clients.DeleteResourceProviderRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteResourceProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createResourceClient(com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateResourceClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateResourceClient(com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateResourceClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getResourceClient(com.scalekit.grpc.scalekit.v1.clients.GetResourceClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetResourceClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetResourceClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listResourceClients(com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListResourceClientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteResourceClient(com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteResourceClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerClient(com.scalekit.grpc.scalekit.v1.clients.RegisterClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.RegisterClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    public void createScope(com.scalekit.grpc.scalekit.v1.clients.CreateScopeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateScopeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateScopeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listScopes(com.scalekit.grpc.scalekit.v1.clients.ListScopesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListScopesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListScopesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    public void updateScope(com.scalekit.grpc.scalekit.v1.clients.UpdateScopeRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateScopeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateScopeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    public void deleteScope(com.scalekit.grpc.scalekit.v1.clients.DeleteScopeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteScopeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getConsentDetails(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetConsentDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConsentDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void revokeUserConsent(com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeUserConsentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ensureResourceConnection(com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnsureResourceConnectionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ClientService.
   */
  public static final class ClientServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ClientServiceBlockingStub> {
    private ClientServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse listClient(com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.GetClientResponse getClient(com.scalekit.grpc.scalekit.v1.clients.GetClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse updateClient(com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse createClientSecret(com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateClientSecretMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse updateClientSecret(com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateClientSecretMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteClientSecret(com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteClientSecretMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientResponse createOrganizationClient(com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrganizationClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientResponse getOrganizationClient(com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretResponse createOrganizationClientSecret(com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrganizationClientSecretMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteOrganizationClientSecret(com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOrganizationClientSecretMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientResponse updateOrganizationClient(com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteOrganizationClient(com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOrganizationClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsResponse listOrganizationClients(com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrganizationClientsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.CreateResourceResponse createResource(com.scalekit.grpc.scalekit.v1.clients.CreateResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse getResource(com.scalekit.grpc.scalekit.v1.clients.GetResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.ListResourcesResponse listResources(com.scalekit.grpc.scalekit.v1.clients.ListResourcesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListResourcesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.UpdateResourceResponse updateResource(com.scalekit.grpc.scalekit.v1.clients.UpdateResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteResource(com.scalekit.grpc.scalekit.v1.clients.DeleteResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse deleteResourceProvider(com.scalekit.grpc.scalekit.v1.clients.DeleteResourceProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteResourceProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientResponse createResourceClient(com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateResourceClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientResponse updateResourceClient(com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateResourceClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.GetResourceClientResponse getResourceClient(com.scalekit.grpc.scalekit.v1.clients.GetResourceClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetResourceClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsResponse listResourceClients(com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListResourceClientsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientResponse deleteResourceClient(com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteResourceClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.RegisterClientResponse registerClient(com.scalekit.grpc.scalekit.v1.clients.RegisterClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterClientMethod(), getCallOptions(), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.scalekit.grpc.scalekit.v1.clients.CreateScopeResponse createScope(com.scalekit.grpc.scalekit.v1.clients.CreateScopeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateScopeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.ListScopesResponse listScopes(com.scalekit.grpc.scalekit.v1.clients.ListScopesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListScopesMethod(), getCallOptions(), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.scalekit.grpc.scalekit.v1.clients.UpdateScopeResponse updateScope(com.scalekit.grpc.scalekit.v1.clients.UpdateScopeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateScopeMethod(), getCallOptions(), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.google.protobuf.Empty deleteScope(com.scalekit.grpc.scalekit.v1.clients.DeleteScopeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteScopeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.GetConsentDetailsResponse getConsentDetails(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConsentDetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentResponse revokeUserConsent(com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeUserConsentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionResponse ensureResourceConnection(com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnsureResourceConnectionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ClientService.
   */
  public static final class ClientServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ClientServiceFutureStub> {
    private ClientServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse> listClient(
        com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.GetClientResponse> getClient(
        com.scalekit.grpc.scalekit.v1.clients.GetClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse> updateClient(
        com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse> createClientSecret(
        com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateClientSecretMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse> updateClientSecret(
        com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateClientSecretMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteClientSecret(
        com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteClientSecretMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientResponse> createOrganizationClient(
        com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrganizationClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientResponse> getOrganizationClient(
        com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretResponse> createOrganizationClientSecret(
        com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrganizationClientSecretMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteOrganizationClientSecret(
        com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOrganizationClientSecretMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientResponse> updateOrganizationClient(
        com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteOrganizationClient(
        com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOrganizationClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsResponse> listOrganizationClients(
        com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrganizationClientsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.CreateResourceResponse> createResource(
        com.scalekit.grpc.scalekit.v1.clients.CreateResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse> getResource(
        com.scalekit.grpc.scalekit.v1.clients.GetResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.ListResourcesResponse> listResources(
        com.scalekit.grpc.scalekit.v1.clients.ListResourcesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListResourcesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.UpdateResourceResponse> updateResource(
        com.scalekit.grpc.scalekit.v1.clients.UpdateResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteResource(
        com.scalekit.grpc.scalekit.v1.clients.DeleteResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse> deleteResourceProvider(
        com.scalekit.grpc.scalekit.v1.clients.DeleteResourceProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteResourceProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientResponse> createResourceClient(
        com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateResourceClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientResponse> updateResourceClient(
        com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateResourceClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.GetResourceClientResponse> getResourceClient(
        com.scalekit.grpc.scalekit.v1.clients.GetResourceClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetResourceClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsResponse> listResourceClients(
        com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListResourceClientsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientResponse> deleteResourceClient(
        com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteResourceClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.RegisterClientResponse> registerClient(
        com.scalekit.grpc.scalekit.v1.clients.RegisterClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterClientMethod(), getCallOptions()), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.CreateScopeResponse> createScope(
        com.scalekit.grpc.scalekit.v1.clients.CreateScopeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateScopeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.ListScopesResponse> listScopes(
        com.scalekit.grpc.scalekit.v1.clients.ListScopesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListScopesMethod(), getCallOptions()), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.UpdateScopeResponse> updateScope(
        com.scalekit.grpc.scalekit.v1.clients.UpdateScopeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateScopeMethod(), getCallOptions()), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteScope(
        com.scalekit.grpc.scalekit.v1.clients.DeleteScopeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteScopeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.GetConsentDetailsResponse> getConsentDetails(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConsentDetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentResponse> revokeUserConsent(
        com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeUserConsentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionResponse> ensureResourceConnection(
        com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnsureResourceConnectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_CLIENT = 0;
  private static final int METHODID_GET_CLIENT = 1;
  private static final int METHODID_UPDATE_CLIENT = 2;
  private static final int METHODID_CREATE_CLIENT_SECRET = 3;
  private static final int METHODID_UPDATE_CLIENT_SECRET = 4;
  private static final int METHODID_DELETE_CLIENT_SECRET = 5;
  private static final int METHODID_CREATE_ORGANIZATION_CLIENT = 6;
  private static final int METHODID_GET_ORGANIZATION_CLIENT = 7;
  private static final int METHODID_CREATE_ORGANIZATION_CLIENT_SECRET = 8;
  private static final int METHODID_DELETE_ORGANIZATION_CLIENT_SECRET = 9;
  private static final int METHODID_UPDATE_ORGANIZATION_CLIENT = 10;
  private static final int METHODID_DELETE_ORGANIZATION_CLIENT = 11;
  private static final int METHODID_LIST_ORGANIZATION_CLIENTS = 12;
  private static final int METHODID_CREATE_RESOURCE = 13;
  private static final int METHODID_GET_RESOURCE = 14;
  private static final int METHODID_LIST_RESOURCES = 15;
  private static final int METHODID_UPDATE_RESOURCE = 16;
  private static final int METHODID_DELETE_RESOURCE = 17;
  private static final int METHODID_DELETE_RESOURCE_PROVIDER = 18;
  private static final int METHODID_CREATE_RESOURCE_CLIENT = 19;
  private static final int METHODID_UPDATE_RESOURCE_CLIENT = 20;
  private static final int METHODID_GET_RESOURCE_CLIENT = 21;
  private static final int METHODID_LIST_RESOURCE_CLIENTS = 22;
  private static final int METHODID_DELETE_RESOURCE_CLIENT = 23;
  private static final int METHODID_REGISTER_CLIENT = 24;
  private static final int METHODID_CREATE_SCOPE = 25;
  private static final int METHODID_LIST_SCOPES = 26;
  private static final int METHODID_UPDATE_SCOPE = 27;
  private static final int METHODID_DELETE_SCOPE = 28;
  private static final int METHODID_GET_CONSENT_DETAILS = 29;
  private static final int METHODID_REVOKE_USER_CONSENT = 30;
  private static final int METHODID_ENSURE_RESOURCE_CONNECTION = 31;

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
        case METHODID_LIST_CLIENT:
          serviceImpl.listClient((com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse>) responseObserver);
          break;
        case METHODID_GET_CLIENT:
          serviceImpl.getClient((com.scalekit.grpc.scalekit.v1.clients.GetClientRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetClientResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CLIENT:
          serviceImpl.updateClient((com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse>) responseObserver);
          break;
        case METHODID_CREATE_CLIENT_SECRET:
          serviceImpl.createClientSecret((com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CLIENT_SECRET:
          serviceImpl.updateClientSecret((com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse>) responseObserver);
          break;
        case METHODID_DELETE_CLIENT_SECRET:
          serviceImpl.deleteClientSecret((com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_ORGANIZATION_CLIENT:
          serviceImpl.createOrganizationClient((com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION_CLIENT:
          serviceImpl.getOrganizationClient((com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientResponse>) responseObserver);
          break;
        case METHODID_CREATE_ORGANIZATION_CLIENT_SECRET:
          serviceImpl.createOrganizationClientSecret((com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretResponse>) responseObserver);
          break;
        case METHODID_DELETE_ORGANIZATION_CLIENT_SECRET:
          serviceImpl.deleteOrganizationClientSecret((com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientSecretRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION_CLIENT:
          serviceImpl.updateOrganizationClient((com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientResponse>) responseObserver);
          break;
        case METHODID_DELETE_ORGANIZATION_CLIENT:
          serviceImpl.deleteOrganizationClient((com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_ORGANIZATION_CLIENTS:
          serviceImpl.listOrganizationClients((com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsResponse>) responseObserver);
          break;
        case METHODID_CREATE_RESOURCE:
          serviceImpl.createResource((com.scalekit.grpc.scalekit.v1.clients.CreateResourceRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateResourceResponse>) responseObserver);
          break;
        case METHODID_GET_RESOURCE:
          serviceImpl.getResource((com.scalekit.grpc.scalekit.v1.clients.GetResourceRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse>) responseObserver);
          break;
        case METHODID_LIST_RESOURCES:
          serviceImpl.listResources((com.scalekit.grpc.scalekit.v1.clients.ListResourcesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListResourcesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RESOURCE:
          serviceImpl.updateResource((com.scalekit.grpc.scalekit.v1.clients.UpdateResourceRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateResourceResponse>) responseObserver);
          break;
        case METHODID_DELETE_RESOURCE:
          serviceImpl.deleteResource((com.scalekit.grpc.scalekit.v1.clients.DeleteResourceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_RESOURCE_PROVIDER:
          serviceImpl.deleteResourceProvider((com.scalekit.grpc.scalekit.v1.clients.DeleteResourceProviderRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse>) responseObserver);
          break;
        case METHODID_CREATE_RESOURCE_CLIENT:
          serviceImpl.createResourceClient((com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RESOURCE_CLIENT:
          serviceImpl.updateResourceClient((com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientResponse>) responseObserver);
          break;
        case METHODID_GET_RESOURCE_CLIENT:
          serviceImpl.getResourceClient((com.scalekit.grpc.scalekit.v1.clients.GetResourceClientRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetResourceClientResponse>) responseObserver);
          break;
        case METHODID_LIST_RESOURCE_CLIENTS:
          serviceImpl.listResourceClients((com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsResponse>) responseObserver);
          break;
        case METHODID_DELETE_RESOURCE_CLIENT:
          serviceImpl.deleteResourceClient((com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientResponse>) responseObserver);
          break;
        case METHODID_REGISTER_CLIENT:
          serviceImpl.registerClient((com.scalekit.grpc.scalekit.v1.clients.RegisterClientRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.RegisterClientResponse>) responseObserver);
          break;
        case METHODID_CREATE_SCOPE:
          serviceImpl.createScope((com.scalekit.grpc.scalekit.v1.clients.CreateScopeRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateScopeResponse>) responseObserver);
          break;
        case METHODID_LIST_SCOPES:
          serviceImpl.listScopes((com.scalekit.grpc.scalekit.v1.clients.ListScopesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListScopesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SCOPE:
          serviceImpl.updateScope((com.scalekit.grpc.scalekit.v1.clients.UpdateScopeRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateScopeResponse>) responseObserver);
          break;
        case METHODID_DELETE_SCOPE:
          serviceImpl.deleteScope((com.scalekit.grpc.scalekit.v1.clients.DeleteScopeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_CONSENT_DETAILS:
          serviceImpl.getConsentDetails((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetConsentDetailsResponse>) responseObserver);
          break;
        case METHODID_REVOKE_USER_CONSENT:
          serviceImpl.revokeUserConsent((com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentResponse>) responseObserver);
          break;
        case METHODID_ENSURE_RESOURCE_CONNECTION:
          serviceImpl.ensureResourceConnection((com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionResponse>) responseObserver);
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
          getListClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.ListClientsRequest,
              com.scalekit.grpc.scalekit.v1.clients.ListClientsResponse>(
                service, METHODID_LIST_CLIENT)))
        .addMethod(
          getGetClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.GetClientRequest,
              com.scalekit.grpc.scalekit.v1.clients.GetClientResponse>(
                service, METHODID_GET_CLIENT)))
        .addMethod(
          getUpdateClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.UpdateClientRequest,
              com.scalekit.grpc.scalekit.v1.clients.UpdateClientResponse>(
                service, METHODID_UPDATE_CLIENT)))
        .addMethod(
          getCreateClientSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretRequest,
              com.scalekit.grpc.scalekit.v1.clients.CreateClientSecretResponse>(
                service, METHODID_CREATE_CLIENT_SECRET)))
        .addMethod(
          getUpdateClientSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretRequest,
              com.scalekit.grpc.scalekit.v1.clients.UpdateClientSecretResponse>(
                service, METHODID_UPDATE_CLIENT_SECRET)))
        .addMethod(
          getDeleteClientSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.DeleteClientSecretRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_CLIENT_SECRET)))
        .addMethod(
          getCreateOrganizationClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientRequest,
              com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientResponse>(
                service, METHODID_CREATE_ORGANIZATION_CLIENT)))
        .addMethod(
          getGetOrganizationClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientRequest,
              com.scalekit.grpc.scalekit.v1.clients.GetOrganizationClientResponse>(
                service, METHODID_GET_ORGANIZATION_CLIENT)))
        .addMethod(
          getCreateOrganizationClientSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretRequest,
              com.scalekit.grpc.scalekit.v1.clients.CreateOrganizationClientSecretResponse>(
                service, METHODID_CREATE_ORGANIZATION_CLIENT_SECRET)))
        .addMethod(
          getDeleteOrganizationClientSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientSecretRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ORGANIZATION_CLIENT_SECRET)))
        .addMethod(
          getUpdateOrganizationClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientRequest,
              com.scalekit.grpc.scalekit.v1.clients.UpdateOrganizationClientResponse>(
                service, METHODID_UPDATE_ORGANIZATION_CLIENT)))
        .addMethod(
          getDeleteOrganizationClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.DeleteOrganizationClientRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ORGANIZATION_CLIENT)))
        .addMethod(
          getListOrganizationClientsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsRequest,
              com.scalekit.grpc.scalekit.v1.clients.ListOrganizationClientsResponse>(
                service, METHODID_LIST_ORGANIZATION_CLIENTS)))
        .addMethod(
          getCreateResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.CreateResourceRequest,
              com.scalekit.grpc.scalekit.v1.clients.CreateResourceResponse>(
                service, METHODID_CREATE_RESOURCE)))
        .addMethod(
          getGetResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.GetResourceRequest,
              com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse>(
                service, METHODID_GET_RESOURCE)))
        .addMethod(
          getListResourcesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.ListResourcesRequest,
              com.scalekit.grpc.scalekit.v1.clients.ListResourcesResponse>(
                service, METHODID_LIST_RESOURCES)))
        .addMethod(
          getUpdateResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.UpdateResourceRequest,
              com.scalekit.grpc.scalekit.v1.clients.UpdateResourceResponse>(
                service, METHODID_UPDATE_RESOURCE)))
        .addMethod(
          getDeleteResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.DeleteResourceRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_RESOURCE)))
        .addMethod(
          getDeleteResourceProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.DeleteResourceProviderRequest,
              com.scalekit.grpc.scalekit.v1.clients.GetResourceResponse>(
                service, METHODID_DELETE_RESOURCE_PROVIDER)))
        .addMethod(
          getCreateResourceClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientRequest,
              com.scalekit.grpc.scalekit.v1.clients.CreateResourceClientResponse>(
                service, METHODID_CREATE_RESOURCE_CLIENT)))
        .addMethod(
          getUpdateResourceClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientRequest,
              com.scalekit.grpc.scalekit.v1.clients.UpdateResourceClientResponse>(
                service, METHODID_UPDATE_RESOURCE_CLIENT)))
        .addMethod(
          getGetResourceClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.GetResourceClientRequest,
              com.scalekit.grpc.scalekit.v1.clients.GetResourceClientResponse>(
                service, METHODID_GET_RESOURCE_CLIENT)))
        .addMethod(
          getListResourceClientsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsRequest,
              com.scalekit.grpc.scalekit.v1.clients.ListResourceClientsResponse>(
                service, METHODID_LIST_RESOURCE_CLIENTS)))
        .addMethod(
          getDeleteResourceClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientRequest,
              com.scalekit.grpc.scalekit.v1.clients.DeleteResourceClientResponse>(
                service, METHODID_DELETE_RESOURCE_CLIENT)))
        .addMethod(
          getRegisterClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.RegisterClientRequest,
              com.scalekit.grpc.scalekit.v1.clients.RegisterClientResponse>(
                service, METHODID_REGISTER_CLIENT)))
        .addMethod(
          getCreateScopeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.CreateScopeRequest,
              com.scalekit.grpc.scalekit.v1.clients.CreateScopeResponse>(
                service, METHODID_CREATE_SCOPE)))
        .addMethod(
          getListScopesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.ListScopesRequest,
              com.scalekit.grpc.scalekit.v1.clients.ListScopesResponse>(
                service, METHODID_LIST_SCOPES)))
        .addMethod(
          getUpdateScopeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.UpdateScopeRequest,
              com.scalekit.grpc.scalekit.v1.clients.UpdateScopeResponse>(
                service, METHODID_UPDATE_SCOPE)))
        .addMethod(
          getDeleteScopeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.DeleteScopeRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_SCOPE)))
        .addMethod(
          getGetConsentDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.scalekit.grpc.scalekit.v1.clients.GetConsentDetailsResponse>(
                service, METHODID_GET_CONSENT_DETAILS)))
        .addMethod(
          getRevokeUserConsentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentRequest,
              com.scalekit.grpc.scalekit.v1.clients.RevokeUserConsentResponse>(
                service, METHODID_REVOKE_USER_CONSENT)))
        .addMethod(
          getEnsureResourceConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionRequest,
              com.scalekit.grpc.scalekit.v1.clients.EnsureResourceConnectionResponse>(
                service, METHODID_ENSURE_RESOURCE_CONNECTION)))
        .build();
  }

  private static abstract class ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.clients.ClientsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientService");
    }
  }

  private static final class ClientServiceFileDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier {
    ClientServiceFileDescriptorSupplier() {}
  }

  private static final class ClientServiceMethodDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ClientServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ClientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientServiceFileDescriptorSupplier())
              .addMethod(getListClientMethod())
              .addMethod(getGetClientMethod())
              .addMethod(getUpdateClientMethod())
              .addMethod(getCreateClientSecretMethod())
              .addMethod(getUpdateClientSecretMethod())
              .addMethod(getDeleteClientSecretMethod())
              .addMethod(getCreateOrganizationClientMethod())
              .addMethod(getGetOrganizationClientMethod())
              .addMethod(getCreateOrganizationClientSecretMethod())
              .addMethod(getDeleteOrganizationClientSecretMethod())
              .addMethod(getUpdateOrganizationClientMethod())
              .addMethod(getDeleteOrganizationClientMethod())
              .addMethod(getListOrganizationClientsMethod())
              .addMethod(getCreateResourceMethod())
              .addMethod(getGetResourceMethod())
              .addMethod(getListResourcesMethod())
              .addMethod(getUpdateResourceMethod())
              .addMethod(getDeleteResourceMethod())
              .addMethod(getDeleteResourceProviderMethod())
              .addMethod(getCreateResourceClientMethod())
              .addMethod(getUpdateResourceClientMethod())
              .addMethod(getGetResourceClientMethod())
              .addMethod(getListResourceClientsMethod())
              .addMethod(getDeleteResourceClientMethod())
              .addMethod(getRegisterClientMethod())
              .addMethod(getCreateScopeMethod())
              .addMethod(getListScopesMethod())
              .addMethod(getUpdateScopeMethod())
              .addMethod(getDeleteScopeMethod())
              .addMethod(getGetConsentDetailsMethod())
              .addMethod(getRevokeUserConsentMethod())
              .addMethod(getEnsureResourceConnectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
