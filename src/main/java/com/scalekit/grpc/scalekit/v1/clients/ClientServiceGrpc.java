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

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateApplicationRequest,
      com.scalekit.grpc.scalekit.v1.clients.CreateApplicationResponse> getCreateApplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateApplication",
      requestType = com.scalekit.grpc.scalekit.v1.clients.CreateApplicationRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.CreateApplicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateApplicationRequest,
      com.scalekit.grpc.scalekit.v1.clients.CreateApplicationResponse> getCreateApplicationMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateApplicationRequest, com.scalekit.grpc.scalekit.v1.clients.CreateApplicationResponse> getCreateApplicationMethod;
    if ((getCreateApplicationMethod = ClientServiceGrpc.getCreateApplicationMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getCreateApplicationMethod = ClientServiceGrpc.getCreateApplicationMethod) == null) {
          ClientServiceGrpc.getCreateApplicationMethod = getCreateApplicationMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.CreateApplicationRequest, com.scalekit.grpc.scalekit.v1.clients.CreateApplicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateApplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.CreateApplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.CreateApplicationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("CreateApplication"))
              .build();
        }
      }
    }
    return getCreateApplicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetApplicationRequest,
      com.scalekit.grpc.scalekit.v1.clients.GetApplicationResponse> getGetApplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetApplication",
      requestType = com.scalekit.grpc.scalekit.v1.clients.GetApplicationRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.GetApplicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetApplicationRequest,
      com.scalekit.grpc.scalekit.v1.clients.GetApplicationResponse> getGetApplicationMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetApplicationRequest, com.scalekit.grpc.scalekit.v1.clients.GetApplicationResponse> getGetApplicationMethod;
    if ((getGetApplicationMethod = ClientServiceGrpc.getGetApplicationMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getGetApplicationMethod = ClientServiceGrpc.getGetApplicationMethod) == null) {
          ClientServiceGrpc.getGetApplicationMethod = getGetApplicationMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.GetApplicationRequest, com.scalekit.grpc.scalekit.v1.clients.GetApplicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetApplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.GetApplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.GetApplicationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("GetApplication"))
              .build();
        }
      }
    }
    return getGetApplicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListApplicationsRequest,
      com.scalekit.grpc.scalekit.v1.clients.ListApplicationsResponse> getListApplicationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListApplications",
      requestType = com.scalekit.grpc.scalekit.v1.clients.ListApplicationsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.ListApplicationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListApplicationsRequest,
      com.scalekit.grpc.scalekit.v1.clients.ListApplicationsResponse> getListApplicationsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.ListApplicationsRequest, com.scalekit.grpc.scalekit.v1.clients.ListApplicationsResponse> getListApplicationsMethod;
    if ((getListApplicationsMethod = ClientServiceGrpc.getListApplicationsMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getListApplicationsMethod = ClientServiceGrpc.getListApplicationsMethod) == null) {
          ClientServiceGrpc.getListApplicationsMethod = getListApplicationsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.ListApplicationsRequest, com.scalekit.grpc.scalekit.v1.clients.ListApplicationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListApplications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.ListApplicationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.ListApplicationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("ListApplications"))
              .build();
        }
      }
    }
    return getListApplicationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationRequest,
      com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationResponse> getUpdateApplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateApplication",
      requestType = com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationRequest,
      com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationResponse> getUpdateApplicationMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationRequest, com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationResponse> getUpdateApplicationMethod;
    if ((getUpdateApplicationMethod = ClientServiceGrpc.getUpdateApplicationMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getUpdateApplicationMethod = ClientServiceGrpc.getUpdateApplicationMethod) == null) {
          ClientServiceGrpc.getUpdateApplicationMethod = getUpdateApplicationMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationRequest, com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateApplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("UpdateApplication"))
              .build();
        }
      }
    }
    return getUpdateApplicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientResponse> getCreateApplicationClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateApplicationClient",
      requestType = com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientResponse> getCreateApplicationClientMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientRequest, com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientResponse> getCreateApplicationClientMethod;
    if ((getCreateApplicationClientMethod = ClientServiceGrpc.getCreateApplicationClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getCreateApplicationClientMethod = ClientServiceGrpc.getCreateApplicationClientMethod) == null) {
          ClientServiceGrpc.getCreateApplicationClientMethod = getCreateApplicationClientMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientRequest, com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateApplicationClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("CreateApplicationClient"))
              .build();
        }
      }
    }
    return getCreateApplicationClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientResponse> getGetApplicationClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetApplicationClient",
      requestType = com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientRequest,
      com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientResponse> getGetApplicationClientMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientRequest, com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientResponse> getGetApplicationClientMethod;
    if ((getGetApplicationClientMethod = ClientServiceGrpc.getGetApplicationClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getGetApplicationClientMethod = ClientServiceGrpc.getGetApplicationClientMethod) == null) {
          ClientServiceGrpc.getGetApplicationClientMethod = getGetApplicationClientMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientRequest, com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetApplicationClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("GetApplicationClient"))
              .build();
        }
      }
    }
    return getGetApplicationClientMethod;
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
    default void createApplication(com.scalekit.grpc.scalekit.v1.clients.CreateApplicationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateApplicationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateApplicationMethod(), responseObserver);
    }

    /**
     */
    default void getApplication(com.scalekit.grpc.scalekit.v1.clients.GetApplicationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetApplicationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetApplicationMethod(), responseObserver);
    }

    /**
     */
    default void listApplications(com.scalekit.grpc.scalekit.v1.clients.ListApplicationsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListApplicationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListApplicationsMethod(), responseObserver);
    }

    /**
     */
    default void updateApplication(com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateApplicationMethod(), responseObserver);
    }

    /**
     */
    default void createApplicationClient(com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateApplicationClientMethod(), responseObserver);
    }

    /**
     */
    default void getApplicationClient(com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetApplicationClientMethod(), responseObserver);
    }

    /**
     */
    default void registerClient(com.scalekit.grpc.scalekit.v1.clients.RegisterClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.RegisterClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterClientMethod(), responseObserver);
    }

    /**
     */
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
    default void getConsentDetails(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetConsentDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConsentDetailsMethod(), responseObserver);
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
    public void createApplication(com.scalekit.grpc.scalekit.v1.clients.CreateApplicationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateApplicationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateApplicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getApplication(com.scalekit.grpc.scalekit.v1.clients.GetApplicationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetApplicationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetApplicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listApplications(com.scalekit.grpc.scalekit.v1.clients.ListApplicationsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListApplicationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListApplicationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateApplication(com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateApplicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createApplicationClient(com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateApplicationClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getApplicationClient(com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetApplicationClientMethod(), getCallOptions()), request, responseObserver);
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
    public void getConsentDetails(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetConsentDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConsentDetailsMethod(), getCallOptions()), request, responseObserver);
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
    public com.scalekit.grpc.scalekit.v1.clients.CreateApplicationResponse createApplication(com.scalekit.grpc.scalekit.v1.clients.CreateApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateApplicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.GetApplicationResponse getApplication(com.scalekit.grpc.scalekit.v1.clients.GetApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetApplicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.ListApplicationsResponse listApplications(com.scalekit.grpc.scalekit.v1.clients.ListApplicationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListApplicationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationResponse updateApplication(com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateApplicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientResponse createApplicationClient(com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateApplicationClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientResponse getApplicationClient(com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetApplicationClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.clients.RegisterClientResponse registerClient(com.scalekit.grpc.scalekit.v1.clients.RegisterClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterClientMethod(), getCallOptions(), request);
    }

    /**
     */
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
    public com.scalekit.grpc.scalekit.v1.clients.GetConsentDetailsResponse getConsentDetails(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConsentDetailsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.CreateApplicationResponse> createApplication(
        com.scalekit.grpc.scalekit.v1.clients.CreateApplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateApplicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.GetApplicationResponse> getApplication(
        com.scalekit.grpc.scalekit.v1.clients.GetApplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetApplicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.ListApplicationsResponse> listApplications(
        com.scalekit.grpc.scalekit.v1.clients.ListApplicationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListApplicationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationResponse> updateApplication(
        com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateApplicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientResponse> createApplicationClient(
        com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateApplicationClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientResponse> getApplicationClient(
        com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetApplicationClientMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.clients.GetConsentDetailsResponse> getConsentDetails(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConsentDetailsMethod(), getCallOptions()), request);
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
  private static final int METHODID_CREATE_APPLICATION = 12;
  private static final int METHODID_GET_APPLICATION = 13;
  private static final int METHODID_LIST_APPLICATIONS = 14;
  private static final int METHODID_UPDATE_APPLICATION = 15;
  private static final int METHODID_CREATE_APPLICATION_CLIENT = 16;
  private static final int METHODID_GET_APPLICATION_CLIENT = 17;
  private static final int METHODID_REGISTER_CLIENT = 18;
  private static final int METHODID_CREATE_SCOPE = 19;
  private static final int METHODID_LIST_SCOPES = 20;
  private static final int METHODID_GET_CONSENT_DETAILS = 21;

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
        case METHODID_CREATE_APPLICATION:
          serviceImpl.createApplication((com.scalekit.grpc.scalekit.v1.clients.CreateApplicationRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateApplicationResponse>) responseObserver);
          break;
        case METHODID_GET_APPLICATION:
          serviceImpl.getApplication((com.scalekit.grpc.scalekit.v1.clients.GetApplicationRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetApplicationResponse>) responseObserver);
          break;
        case METHODID_LIST_APPLICATIONS:
          serviceImpl.listApplications((com.scalekit.grpc.scalekit.v1.clients.ListApplicationsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.ListApplicationsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_APPLICATION:
          serviceImpl.updateApplication((com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationResponse>) responseObserver);
          break;
        case METHODID_CREATE_APPLICATION_CLIENT:
          serviceImpl.createApplicationClient((com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientResponse>) responseObserver);
          break;
        case METHODID_GET_APPLICATION_CLIENT:
          serviceImpl.getApplicationClient((com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientResponse>) responseObserver);
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
        case METHODID_GET_CONSENT_DETAILS:
          serviceImpl.getConsentDetails((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.clients.GetConsentDetailsResponse>) responseObserver);
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
          getCreateApplicationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.CreateApplicationRequest,
              com.scalekit.grpc.scalekit.v1.clients.CreateApplicationResponse>(
                service, METHODID_CREATE_APPLICATION)))
        .addMethod(
          getGetApplicationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.GetApplicationRequest,
              com.scalekit.grpc.scalekit.v1.clients.GetApplicationResponse>(
                service, METHODID_GET_APPLICATION)))
        .addMethod(
          getListApplicationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.ListApplicationsRequest,
              com.scalekit.grpc.scalekit.v1.clients.ListApplicationsResponse>(
                service, METHODID_LIST_APPLICATIONS)))
        .addMethod(
          getUpdateApplicationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationRequest,
              com.scalekit.grpc.scalekit.v1.clients.UpdateApplicationResponse>(
                service, METHODID_UPDATE_APPLICATION)))
        .addMethod(
          getCreateApplicationClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientRequest,
              com.scalekit.grpc.scalekit.v1.clients.CreateApplicationClientResponse>(
                service, METHODID_CREATE_APPLICATION_CLIENT)))
        .addMethod(
          getGetApplicationClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientRequest,
              com.scalekit.grpc.scalekit.v1.clients.GetApplicationClientResponse>(
                service, METHODID_GET_APPLICATION_CLIENT)))
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
          getGetConsentDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.scalekit.grpc.scalekit.v1.clients.GetConsentDetailsResponse>(
                service, METHODID_GET_CONSENT_DETAILS)))
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
              .addMethod(getCreateApplicationMethod())
              .addMethod(getGetApplicationMethod())
              .addMethod(getListApplicationsMethod())
              .addMethod(getUpdateApplicationMethod())
              .addMethod(getCreateApplicationClientMethod())
              .addMethod(getGetApplicationClientMethod())
              .addMethod(getRegisterClientMethod())
              .addMethod(getCreateScopeMethod())
              .addMethod(getListScopesMethod())
              .addMethod(getGetConsentDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
