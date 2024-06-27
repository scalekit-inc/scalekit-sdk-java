package com.scalekit.grpc.scalekit.v1.environments;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: scalekit/v1/environments/environments.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EnvironmentServiceGrpc {

  private EnvironmentServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.environments.EnvironmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentRequest,
      com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentResponse> getCreateEnvironmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEnvironment",
      requestType = com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentRequest,
      com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentResponse> getCreateEnvironmentMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentRequest, com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentResponse> getCreateEnvironmentMethod;
    if ((getCreateEnvironmentMethod = EnvironmentServiceGrpc.getCreateEnvironmentMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getCreateEnvironmentMethod = EnvironmentServiceGrpc.getCreateEnvironmentMethod) == null) {
          EnvironmentServiceGrpc.getCreateEnvironmentMethod = getCreateEnvironmentMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentRequest, com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEnvironment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("CreateEnvironment"))
              .build();
        }
      }
    }
    return getCreateEnvironmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentRequest,
      com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse> getUpdateEnvironmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEnvironment",
      requestType = com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentRequest,
      com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse> getUpdateEnvironmentMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentRequest, com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse> getUpdateEnvironmentMethod;
    if ((getUpdateEnvironmentMethod = EnvironmentServiceGrpc.getUpdateEnvironmentMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getUpdateEnvironmentMethod = EnvironmentServiceGrpc.getUpdateEnvironmentMethod) == null) {
          EnvironmentServiceGrpc.getUpdateEnvironmentMethod = getUpdateEnvironmentMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentRequest, com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEnvironment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("UpdateEnvironment"))
              .build();
        }
      }
    }
    return getUpdateEnvironmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest,
      com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse> getUpdateEnvironmentDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEnvironmentDomain",
      requestType = com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest,
      com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse> getUpdateEnvironmentDomainMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest, com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse> getUpdateEnvironmentDomainMethod;
    if ((getUpdateEnvironmentDomainMethod = EnvironmentServiceGrpc.getUpdateEnvironmentDomainMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getUpdateEnvironmentDomainMethod = EnvironmentServiceGrpc.getUpdateEnvironmentDomainMethod) == null) {
          EnvironmentServiceGrpc.getUpdateEnvironmentDomainMethod = getUpdateEnvironmentDomainMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest, com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEnvironmentDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("UpdateEnvironmentDomain"))
              .build();
        }
      }
    }
    return getUpdateEnvironmentDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse> getGetEnvironmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEnvironment",
      requestType = com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse> getGetEnvironmentMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest, com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse> getGetEnvironmentMethod;
    if ((getGetEnvironmentMethod = EnvironmentServiceGrpc.getGetEnvironmentMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getGetEnvironmentMethod = EnvironmentServiceGrpc.getGetEnvironmentMethod) == null) {
          EnvironmentServiceGrpc.getGetEnvironmentMethod = getGetEnvironmentMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest, com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnvironment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("GetEnvironment"))
              .build();
        }
      }
    }
    return getGetEnvironmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsRequest,
      com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsResponse> getListEnvironmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEnvironment",
      requestType = com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsRequest,
      com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsResponse> getListEnvironmentMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsRequest, com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsResponse> getListEnvironmentMethod;
    if ((getListEnvironmentMethod = EnvironmentServiceGrpc.getListEnvironmentMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getListEnvironmentMethod = EnvironmentServiceGrpc.getListEnvironmentMethod) == null) {
          EnvironmentServiceGrpc.getListEnvironmentMethod = getListEnvironmentMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsRequest, com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEnvironment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("ListEnvironment"))
              .build();
        }
      }
    }
    return getListEnvironmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.DeleteEnvironmentRequest,
      com.google.protobuf.Empty> getDeleteEnvironmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEnvironment",
      requestType = com.scalekit.grpc.scalekit.v1.environments.DeleteEnvironmentRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.DeleteEnvironmentRequest,
      com.google.protobuf.Empty> getDeleteEnvironmentMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.DeleteEnvironmentRequest, com.google.protobuf.Empty> getDeleteEnvironmentMethod;
    if ((getDeleteEnvironmentMethod = EnvironmentServiceGrpc.getDeleteEnvironmentMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getDeleteEnvironmentMethod = EnvironmentServiceGrpc.getDeleteEnvironmentMethod) == null) {
          EnvironmentServiceGrpc.getDeleteEnvironmentMethod = getDeleteEnvironmentMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.DeleteEnvironmentRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEnvironment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.DeleteEnvironmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("DeleteEnvironment"))
              .build();
        }
      }
    }
    return getDeleteEnvironmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsResponse> getGetRequiredDNSRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRequiredDNSRecords",
      requestType = com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsResponse> getGetRequiredDNSRecordsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest, com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsResponse> getGetRequiredDNSRecordsMethod;
    if ((getGetRequiredDNSRecordsMethod = EnvironmentServiceGrpc.getGetRequiredDNSRecordsMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getGetRequiredDNSRecordsMethod = EnvironmentServiceGrpc.getGetRequiredDNSRecordsMethod) == null) {
          EnvironmentServiceGrpc.getGetRequiredDNSRecordsMethod = getGetRequiredDNSRecordsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest, com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRequiredDNSRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("GetRequiredDNSRecords"))
              .build();
        }
      }
    }
    return getGetRequiredDNSRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest,
      com.google.protobuf.Empty> getVerifyDNSRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyDNSRecords",
      requestType = com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest,
      com.google.protobuf.Empty> getVerifyDNSRecordsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest, com.google.protobuf.Empty> getVerifyDNSRecordsMethod;
    if ((getVerifyDNSRecordsMethod = EnvironmentServiceGrpc.getVerifyDNSRecordsMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getVerifyDNSRecordsMethod = EnvironmentServiceGrpc.getVerifyDNSRecordsMethod) == null) {
          EnvironmentServiceGrpc.getVerifyDNSRecordsMethod = getVerifyDNSRecordsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyDNSRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("VerifyDNSRecords"))
              .build();
        }
      }
    }
    return getVerifyDNSRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainRequest,
      com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainResponse> getCreateCustomDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCustomDomain",
      requestType = com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainRequest,
      com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainResponse> getCreateCustomDomainMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainRequest, com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainResponse> getCreateCustomDomainMethod;
    if ((getCreateCustomDomainMethod = EnvironmentServiceGrpc.getCreateCustomDomainMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getCreateCustomDomainMethod = EnvironmentServiceGrpc.getCreateCustomDomainMethod) == null) {
          EnvironmentServiceGrpc.getCreateCustomDomainMethod = getCreateCustomDomainMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainRequest, com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCustomDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("CreateCustomDomain"))
              .build();
        }
      }
    }
    return getCreateCustomDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse> getCheckCustomDomainStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckCustomDomainStatus",
      requestType = com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse> getCheckCustomDomainStatusMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest, com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse> getCheckCustomDomainStatusMethod;
    if ((getCheckCustomDomainStatusMethod = EnvironmentServiceGrpc.getCheckCustomDomainStatusMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getCheckCustomDomainStatusMethod = EnvironmentServiceGrpc.getCheckCustomDomainStatusMethod) == null) {
          EnvironmentServiceGrpc.getCheckCustomDomainStatusMethod = getCheckCustomDomainStatusMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest, com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckCustomDomainStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("CheckCustomDomainStatus"))
              .build();
        }
      }
    }
    return getCheckCustomDomainStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationRequest,
      com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationResponse> getUpdatePortalCustomizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePortalCustomization",
      requestType = com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationRequest,
      com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationResponse> getUpdatePortalCustomizationMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationRequest, com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationResponse> getUpdatePortalCustomizationMethod;
    if ((getUpdatePortalCustomizationMethod = EnvironmentServiceGrpc.getUpdatePortalCustomizationMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getUpdatePortalCustomizationMethod = EnvironmentServiceGrpc.getUpdatePortalCustomizationMethod) == null) {
          EnvironmentServiceGrpc.getUpdatePortalCustomizationMethod = getUpdatePortalCustomizationMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationRequest, com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePortalCustomization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("UpdatePortalCustomization"))
              .build();
        }
      }
    }
    return getUpdatePortalCustomizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationResponse> getGetPortalCustomizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPortalCustomization",
      requestType = com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationResponse> getGetPortalCustomizationMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationRequest, com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationResponse> getGetPortalCustomizationMethod;
    if ((getGetPortalCustomizationMethod = EnvironmentServiceGrpc.getGetPortalCustomizationMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getGetPortalCustomizationMethod = EnvironmentServiceGrpc.getGetPortalCustomizationMethod) == null) {
          EnvironmentServiceGrpc.getGetPortalCustomizationMethod = getGetPortalCustomizationMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationRequest, com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPortalCustomization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("GetPortalCustomization"))
              .build();
        }
      }
    }
    return getGetPortalCustomizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlRequest,
      com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlResponse> getCreateAssetUploadURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAssetUploadURL",
      requestType = com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlRequest,
      com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlResponse> getCreateAssetUploadURLMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlRequest, com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlResponse> getCreateAssetUploadURLMethod;
    if ((getCreateAssetUploadURLMethod = EnvironmentServiceGrpc.getCreateAssetUploadURLMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getCreateAssetUploadURLMethod = EnvironmentServiceGrpc.getCreateAssetUploadURLMethod) == null) {
          EnvironmentServiceGrpc.getCreateAssetUploadURLMethod = getCreateAssetUploadURLMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlRequest, com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAssetUploadURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("CreateAssetUploadURL"))
              .build();
        }
      }
    }
    return getCreateAssetUploadURLMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EnvironmentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnvironmentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnvironmentServiceStub>() {
        @java.lang.Override
        public EnvironmentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnvironmentServiceStub(channel, callOptions);
        }
      };
    return EnvironmentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EnvironmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnvironmentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnvironmentServiceBlockingStub>() {
        @java.lang.Override
        public EnvironmentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnvironmentServiceBlockingStub(channel, callOptions);
        }
      };
    return EnvironmentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EnvironmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnvironmentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnvironmentServiceFutureStub>() {
        @java.lang.Override
        public EnvironmentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnvironmentServiceFutureStub(channel, callOptions);
        }
      };
    return EnvironmentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createEnvironment(com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEnvironmentMethod(), responseObserver);
    }

    /**
     */
    default void updateEnvironment(com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEnvironmentMethod(), responseObserver);
    }

    /**
     */
    default void updateEnvironmentDomain(com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEnvironmentDomainMethod(), responseObserver);
    }

    /**
     */
    default void getEnvironment(com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEnvironmentMethod(), responseObserver);
    }

    /**
     */
    default void listEnvironment(com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEnvironmentMethod(), responseObserver);
    }

    /**
     */
    default void deleteEnvironment(com.scalekit.grpc.scalekit.v1.environments.DeleteEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEnvironmentMethod(), responseObserver);
    }

    /**
     */
    default void getRequiredDNSRecords(com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRequiredDNSRecordsMethod(), responseObserver);
    }

    /**
     */
    default void verifyDNSRecords(com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyDNSRecordsMethod(), responseObserver);
    }

    /**
     */
    default void createCustomDomain(com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCustomDomainMethod(), responseObserver);
    }

    /**
     */
    default void checkCustomDomainStatus(com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckCustomDomainStatusMethod(), responseObserver);
    }

    /**
     */
    default void updatePortalCustomization(com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePortalCustomizationMethod(), responseObserver);
    }

    /**
     */
    default void getPortalCustomization(com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPortalCustomizationMethod(), responseObserver);
    }

    /**
     */
    default void createAssetUploadURL(com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAssetUploadURLMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EnvironmentService.
   */
  public static abstract class EnvironmentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EnvironmentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EnvironmentService.
   */
  public static final class EnvironmentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EnvironmentServiceStub> {
    private EnvironmentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnvironmentServiceStub(channel, callOptions);
    }

    /**
     */
    public void createEnvironment(com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEnvironmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEnvironment(com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEnvironmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEnvironmentDomain(com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEnvironmentDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEnvironment(com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEnvironmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listEnvironment(com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEnvironmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEnvironment(com.scalekit.grpc.scalekit.v1.environments.DeleteEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEnvironmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRequiredDNSRecords(com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRequiredDNSRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verifyDNSRecords(com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyDNSRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCustomDomain(com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCustomDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkCustomDomainStatus(com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckCustomDomainStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePortalCustomization(com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePortalCustomizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPortalCustomization(com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPortalCustomizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAssetUploadURL(com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAssetUploadURLMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EnvironmentService.
   */
  public static final class EnvironmentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EnvironmentServiceBlockingStub> {
    private EnvironmentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnvironmentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentResponse createEnvironment(com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEnvironmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse updateEnvironment(com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEnvironmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse updateEnvironmentDomain(com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEnvironmentDomainMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse getEnvironment(com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEnvironmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsResponse listEnvironment(com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEnvironmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteEnvironment(com.scalekit.grpc.scalekit.v1.environments.DeleteEnvironmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEnvironmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsResponse getRequiredDNSRecords(com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRequiredDNSRecordsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty verifyDNSRecords(com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyDNSRecordsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainResponse createCustomDomain(com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCustomDomainMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse checkCustomDomainStatus(com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckCustomDomainStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationResponse updatePortalCustomization(com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePortalCustomizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationResponse getPortalCustomization(com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPortalCustomizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlResponse createAssetUploadURL(com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAssetUploadURLMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EnvironmentService.
   */
  public static final class EnvironmentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EnvironmentServiceFutureStub> {
    private EnvironmentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnvironmentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentResponse> createEnvironment(
        com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEnvironmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse> updateEnvironment(
        com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEnvironmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse> updateEnvironmentDomain(
        com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEnvironmentDomainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse> getEnvironment(
        com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEnvironmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsResponse> listEnvironment(
        com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEnvironmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteEnvironment(
        com.scalekit.grpc.scalekit.v1.environments.DeleteEnvironmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEnvironmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsResponse> getRequiredDNSRecords(
        com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRequiredDNSRecordsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> verifyDNSRecords(
        com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyDNSRecordsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainResponse> createCustomDomain(
        com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCustomDomainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse> checkCustomDomainStatus(
        com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckCustomDomainStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationResponse> updatePortalCustomization(
        com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePortalCustomizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationResponse> getPortalCustomization(
        com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPortalCustomizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlResponse> createAssetUploadURL(
        com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAssetUploadURLMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ENVIRONMENT = 0;
  private static final int METHODID_UPDATE_ENVIRONMENT = 1;
  private static final int METHODID_UPDATE_ENVIRONMENT_DOMAIN = 2;
  private static final int METHODID_GET_ENVIRONMENT = 3;
  private static final int METHODID_LIST_ENVIRONMENT = 4;
  private static final int METHODID_DELETE_ENVIRONMENT = 5;
  private static final int METHODID_GET_REQUIRED_DNSRECORDS = 6;
  private static final int METHODID_VERIFY_DNSRECORDS = 7;
  private static final int METHODID_CREATE_CUSTOM_DOMAIN = 8;
  private static final int METHODID_CHECK_CUSTOM_DOMAIN_STATUS = 9;
  private static final int METHODID_UPDATE_PORTAL_CUSTOMIZATION = 10;
  private static final int METHODID_GET_PORTAL_CUSTOMIZATION = 11;
  private static final int METHODID_CREATE_ASSET_UPLOAD_URL = 12;

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
        case METHODID_CREATE_ENVIRONMENT:
          serviceImpl.createEnvironment((com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ENVIRONMENT:
          serviceImpl.updateEnvironment((com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ENVIRONMENT_DOMAIN:
          serviceImpl.updateEnvironmentDomain((com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse>) responseObserver);
          break;
        case METHODID_GET_ENVIRONMENT:
          serviceImpl.getEnvironment((com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse>) responseObserver);
          break;
        case METHODID_LIST_ENVIRONMENT:
          serviceImpl.listEnvironment((com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsResponse>) responseObserver);
          break;
        case METHODID_DELETE_ENVIRONMENT:
          serviceImpl.deleteEnvironment((com.scalekit.grpc.scalekit.v1.environments.DeleteEnvironmentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_REQUIRED_DNSRECORDS:
          serviceImpl.getRequiredDNSRecords((com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsResponse>) responseObserver);
          break;
        case METHODID_VERIFY_DNSRECORDS:
          serviceImpl.verifyDNSRecords((com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_CUSTOM_DOMAIN:
          serviceImpl.createCustomDomain((com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainResponse>) responseObserver);
          break;
        case METHODID_CHECK_CUSTOM_DOMAIN_STATUS:
          serviceImpl.checkCustomDomainStatus((com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PORTAL_CUSTOMIZATION:
          serviceImpl.updatePortalCustomization((com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationResponse>) responseObserver);
          break;
        case METHODID_GET_PORTAL_CUSTOMIZATION:
          serviceImpl.getPortalCustomization((com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationResponse>) responseObserver);
          break;
        case METHODID_CREATE_ASSET_UPLOAD_URL:
          serviceImpl.createAssetUploadURL((com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlResponse>) responseObserver);
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
          getCreateEnvironmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentRequest,
              com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentResponse>(
                service, METHODID_CREATE_ENVIRONMENT)))
        .addMethod(
          getUpdateEnvironmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentRequest,
              com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse>(
                service, METHODID_UPDATE_ENVIRONMENT)))
        .addMethod(
          getUpdateEnvironmentDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentDomainRequest,
              com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentResponse>(
                service, METHODID_UPDATE_ENVIRONMENT_DOMAIN)))
        .addMethod(
          getGetEnvironmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest,
              com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse>(
                service, METHODID_GET_ENVIRONMENT)))
        .addMethod(
          getListEnvironmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsRequest,
              com.scalekit.grpc.scalekit.v1.environments.ListEnvironmentsResponse>(
                service, METHODID_LIST_ENVIRONMENT)))
        .addMethod(
          getDeleteEnvironmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.DeleteEnvironmentRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ENVIRONMENT)))
        .addMethod(
          getGetRequiredDNSRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest,
              com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsResponse>(
                service, METHODID_GET_REQUIRED_DNSRECORDS)))
        .addMethod(
          getVerifyDNSRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.GetDNSRecordsRequest,
              com.google.protobuf.Empty>(
                service, METHODID_VERIFY_DNSRECORDS)))
        .addMethod(
          getCreateCustomDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainRequest,
              com.scalekit.grpc.scalekit.v1.environments.CreateCustomDomainResponse>(
                service, METHODID_CREATE_CUSTOM_DOMAIN)))
        .addMethod(
          getCheckCustomDomainStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentRequest,
              com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentResponse>(
                service, METHODID_CHECK_CUSTOM_DOMAIN_STATUS)))
        .addMethod(
          getUpdatePortalCustomizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationRequest,
              com.scalekit.grpc.scalekit.v1.environments.UpdatePortalCustomizationResponse>(
                service, METHODID_UPDATE_PORTAL_CUSTOMIZATION)))
        .addMethod(
          getGetPortalCustomizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationRequest,
              com.scalekit.grpc.scalekit.v1.environments.GetPortalCustomizationResponse>(
                service, METHODID_GET_PORTAL_CUSTOMIZATION)))
        .addMethod(
          getCreateAssetUploadURLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlRequest,
              com.scalekit.grpc.scalekit.v1.environments.CreateAssetUploadUrlResponse>(
                service, METHODID_CREATE_ASSET_UPLOAD_URL)))
        .build();
  }

  private static abstract class EnvironmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EnvironmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.environments.EnvironmentsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EnvironmentService");
    }
  }

  private static final class EnvironmentServiceFileDescriptorSupplier
      extends EnvironmentServiceBaseDescriptorSupplier {
    EnvironmentServiceFileDescriptorSupplier() {}
  }

  private static final class EnvironmentServiceMethodDescriptorSupplier
      extends EnvironmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EnvironmentServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EnvironmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EnvironmentServiceFileDescriptorSupplier())
              .addMethod(getCreateEnvironmentMethod())
              .addMethod(getUpdateEnvironmentMethod())
              .addMethod(getUpdateEnvironmentDomainMethod())
              .addMethod(getGetEnvironmentMethod())
              .addMethod(getListEnvironmentMethod())
              .addMethod(getDeleteEnvironmentMethod())
              .addMethod(getGetRequiredDNSRecordsMethod())
              .addMethod(getVerifyDNSRecordsMethod())
              .addMethod(getCreateCustomDomainMethod())
              .addMethod(getCheckCustomDomainStatusMethod())
              .addMethod(getUpdatePortalCustomizationMethod())
              .addMethod(getGetPortalCustomizationMethod())
              .addMethod(getCreateAssetUploadURLMethod())
              .build();
        }
      }
    }
    return result;
  }
}
