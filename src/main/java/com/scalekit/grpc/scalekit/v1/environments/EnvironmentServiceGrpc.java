package com.scalekit.grpc.scalekit.v1.environments;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
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

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateRequest,
      com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateResponse> getGenerateNewSamlCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateNewSamlCertificate",
      requestType = com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateRequest,
      com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateResponse> getGenerateNewSamlCertificateMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateRequest, com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateResponse> getGenerateNewSamlCertificateMethod;
    if ((getGenerateNewSamlCertificateMethod = EnvironmentServiceGrpc.getGenerateNewSamlCertificateMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getGenerateNewSamlCertificateMethod = EnvironmentServiceGrpc.getGenerateNewSamlCertificateMethod) == null) {
          EnvironmentServiceGrpc.getGenerateNewSamlCertificateMethod = getGenerateNewSamlCertificateMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateRequest, com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateNewSamlCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("GenerateNewSamlCertificate"))
              .build();
        }
      }
    }
    return getGenerateNewSamlCertificateMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdateFeaturesRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse> getUpdateFeaturesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFeatures",
      requestType = com.scalekit.grpc.scalekit.v1.environments.UpdateFeaturesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdateFeaturesRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse> getUpdateFeaturesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdateFeaturesRequest, com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse> getUpdateFeaturesMethod;
    if ((getUpdateFeaturesMethod = EnvironmentServiceGrpc.getUpdateFeaturesMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getUpdateFeaturesMethod = EnvironmentServiceGrpc.getUpdateFeaturesMethod) == null) {
          EnvironmentServiceGrpc.getUpdateFeaturesMethod = getUpdateFeaturesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.UpdateFeaturesRequest, com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFeatures"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.UpdateFeaturesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("UpdateFeatures"))
              .build();
        }
      }
    }
    return getUpdateFeaturesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.EnableFSAFeatureRequest,
      com.google.protobuf.Empty> getEnableFSAFeatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableFSAFeature",
      requestType = com.scalekit.grpc.scalekit.v1.environments.EnableFSAFeatureRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.EnableFSAFeatureRequest,
      com.google.protobuf.Empty> getEnableFSAFeatureMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.EnableFSAFeatureRequest, com.google.protobuf.Empty> getEnableFSAFeatureMethod;
    if ((getEnableFSAFeatureMethod = EnvironmentServiceGrpc.getEnableFSAFeatureMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getEnableFSAFeatureMethod = EnvironmentServiceGrpc.getEnableFSAFeatureMethod) == null) {
          EnvironmentServiceGrpc.getEnableFSAFeatureMethod = getEnableFSAFeatureMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.EnableFSAFeatureRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableFSAFeature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.EnableFSAFeatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("EnableFSAFeature"))
              .build();
        }
      }
    }
    return getEnableFSAFeatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getDisableFSAFeatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableFSAFeature",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getDisableFSAFeatureMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getDisableFSAFeatureMethod;
    if ((getDisableFSAFeatureMethod = EnvironmentServiceGrpc.getDisableFSAFeatureMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getDisableFSAFeatureMethod = EnvironmentServiceGrpc.getDisableFSAFeatureMethod) == null) {
          EnvironmentServiceGrpc.getDisableFSAFeatureMethod = getDisableFSAFeatureMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableFSAFeature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("DisableFSAFeature"))
              .build();
        }
      }
    }
    return getDisableFSAFeatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.EnableFeatureRequest,
      com.google.protobuf.Empty> getEnableFeatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableFeature",
      requestType = com.scalekit.grpc.scalekit.v1.environments.EnableFeatureRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.EnableFeatureRequest,
      com.google.protobuf.Empty> getEnableFeatureMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.EnableFeatureRequest, com.google.protobuf.Empty> getEnableFeatureMethod;
    if ((getEnableFeatureMethod = EnvironmentServiceGrpc.getEnableFeatureMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getEnableFeatureMethod = EnvironmentServiceGrpc.getEnableFeatureMethod) == null) {
          EnvironmentServiceGrpc.getEnableFeatureMethod = getEnableFeatureMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.EnableFeatureRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableFeature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.EnableFeatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("EnableFeature"))
              .build();
        }
      }
    }
    return getEnableFeatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.DisableFeatureRequest,
      com.google.protobuf.Empty> getDisableFeatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableFeature",
      requestType = com.scalekit.grpc.scalekit.v1.environments.DisableFeatureRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.DisableFeatureRequest,
      com.google.protobuf.Empty> getDisableFeatureMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.DisableFeatureRequest, com.google.protobuf.Empty> getDisableFeatureMethod;
    if ((getDisableFeatureMethod = EnvironmentServiceGrpc.getDisableFeatureMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getDisableFeatureMethod = EnvironmentServiceGrpc.getDisableFeatureMethod) == null) {
          EnvironmentServiceGrpc.getDisableFeatureMethod = getDisableFeatureMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.DisableFeatureRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableFeature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.DisableFeatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("DisableFeature"))
              .build();
        }
      }
    }
    return getDisableFeatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetFeaturesRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse> getGetFeaturesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeatures",
      requestType = com.scalekit.grpc.scalekit.v1.environments.GetFeaturesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetFeaturesRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse> getGetFeaturesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetFeaturesRequest, com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse> getGetFeaturesMethod;
    if ((getGetFeaturesMethod = EnvironmentServiceGrpc.getGetFeaturesMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getGetFeaturesMethod = EnvironmentServiceGrpc.getGetFeaturesMethod) == null) {
          EnvironmentServiceGrpc.getGetFeaturesMethod = getGetFeaturesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.GetFeaturesRequest, com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeatures"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetFeaturesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("GetFeatures"))
              .build();
        }
      }
    }
    return getGetFeaturesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsRequest,
      com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsResponse> getCreateEnvironmentSessionSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEnvironmentSessionSettings",
      requestType = com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsRequest,
      com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsResponse> getCreateEnvironmentSessionSettingsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsRequest, com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsResponse> getCreateEnvironmentSessionSettingsMethod;
    if ((getCreateEnvironmentSessionSettingsMethod = EnvironmentServiceGrpc.getCreateEnvironmentSessionSettingsMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getCreateEnvironmentSessionSettingsMethod = EnvironmentServiceGrpc.getCreateEnvironmentSessionSettingsMethod) == null) {
          EnvironmentServiceGrpc.getCreateEnvironmentSessionSettingsMethod = getCreateEnvironmentSessionSettingsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsRequest, com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEnvironmentSessionSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("CreateEnvironmentSessionSettings"))
              .build();
        }
      }
    }
    return getCreateEnvironmentSessionSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementRequest,
      com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementResponse> getCreateEnvironmentUserManagementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEnvironmentUserManagement",
      requestType = com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementRequest,
      com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementResponse> getCreateEnvironmentUserManagementMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementRequest, com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementResponse> getCreateEnvironmentUserManagementMethod;
    if ((getCreateEnvironmentUserManagementMethod = EnvironmentServiceGrpc.getCreateEnvironmentUserManagementMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getCreateEnvironmentUserManagementMethod = EnvironmentServiceGrpc.getCreateEnvironmentUserManagementMethod) == null) {
          EnvironmentServiceGrpc.getCreateEnvironmentUserManagementMethod = getCreateEnvironmentUserManagementMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementRequest, com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEnvironmentUserManagement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("CreateEnvironmentUserManagement"))
              .build();
        }
      }
    }
    return getCreateEnvironmentUserManagementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsResponse> getGetEnvironmentSessionSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEnvironmentSessionSettings",
      requestType = com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsResponse> getGetEnvironmentSessionSettingsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsRequest, com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsResponse> getGetEnvironmentSessionSettingsMethod;
    if ((getGetEnvironmentSessionSettingsMethod = EnvironmentServiceGrpc.getGetEnvironmentSessionSettingsMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getGetEnvironmentSessionSettingsMethod = EnvironmentServiceGrpc.getGetEnvironmentSessionSettingsMethod) == null) {
          EnvironmentServiceGrpc.getGetEnvironmentSessionSettingsMethod = getGetEnvironmentSessionSettingsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsRequest, com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnvironmentSessionSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("GetEnvironmentSessionSettings"))
              .build();
        }
      }
    }
    return getGetEnvironmentSessionSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementResponse> getGetEnvironmentUserManagementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEnvironmentUserManagement",
      requestType = com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementResponse> getGetEnvironmentUserManagementMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementRequest, com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementResponse> getGetEnvironmentUserManagementMethod;
    if ((getGetEnvironmentUserManagementMethod = EnvironmentServiceGrpc.getGetEnvironmentUserManagementMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getGetEnvironmentUserManagementMethod = EnvironmentServiceGrpc.getGetEnvironmentUserManagementMethod) == null) {
          EnvironmentServiceGrpc.getGetEnvironmentUserManagementMethod = getGetEnvironmentUserManagementMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementRequest, com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnvironmentUserManagement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("GetEnvironmentUserManagement"))
              .build();
        }
      }
    }
    return getGetEnvironmentUserManagementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsRequest,
      com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsResponse> getUpdateEnvironmentSessionSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEnvironmentSessionSettings",
      requestType = com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsRequest,
      com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsResponse> getUpdateEnvironmentSessionSettingsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsRequest, com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsResponse> getUpdateEnvironmentSessionSettingsMethod;
    if ((getUpdateEnvironmentSessionSettingsMethod = EnvironmentServiceGrpc.getUpdateEnvironmentSessionSettingsMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getUpdateEnvironmentSessionSettingsMethod = EnvironmentServiceGrpc.getUpdateEnvironmentSessionSettingsMethod) == null) {
          EnvironmentServiceGrpc.getUpdateEnvironmentSessionSettingsMethod = getUpdateEnvironmentSessionSettingsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsRequest, com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEnvironmentSessionSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("UpdateEnvironmentSessionSettings"))
              .build();
        }
      }
    }
    return getUpdateEnvironmentSessionSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementRequest,
      com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementResponse> getUpdateEnvironmentUserManagementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEnvironmentUserManagement",
      requestType = com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementRequest,
      com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementResponse> getUpdateEnvironmentUserManagementMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementRequest, com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementResponse> getUpdateEnvironmentUserManagementMethod;
    if ((getUpdateEnvironmentUserManagementMethod = EnvironmentServiceGrpc.getUpdateEnvironmentUserManagementMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getUpdateEnvironmentUserManagementMethod = EnvironmentServiceGrpc.getUpdateEnvironmentUserManagementMethod) == null) {
          EnvironmentServiceGrpc.getUpdateEnvironmentUserManagementMethod = getUpdateEnvironmentUserManagementMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementRequest, com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEnvironmentUserManagement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("UpdateEnvironmentUserManagement"))
              .build();
        }
      }
    }
    return getUpdateEnvironmentUserManagementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetContextRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetContextResponse> getGetContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContext",
      requestType = com.scalekit.grpc.scalekit.v1.environments.GetContextRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.GetContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetContextRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetContextResponse> getGetContextMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetContextRequest, com.scalekit.grpc.scalekit.v1.environments.GetContextResponse> getGetContextMethod;
    if ((getGetContextMethod = EnvironmentServiceGrpc.getGetContextMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getGetContextMethod = EnvironmentServiceGrpc.getGetContextMethod) == null) {
          EnvironmentServiceGrpc.getGetContextMethod = getGetContextMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.GetContextRequest, com.scalekit.grpc.scalekit.v1.environments.GetContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetContextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetContextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("GetContext"))
              .build();
        }
      }
    }
    return getGetContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdateContextRequest,
      com.google.protobuf.Empty> getUpdateContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateContext",
      requestType = com.scalekit.grpc.scalekit.v1.environments.UpdateContextRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdateContextRequest,
      com.google.protobuf.Empty> getUpdateContextMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.UpdateContextRequest, com.google.protobuf.Empty> getUpdateContextMethod;
    if ((getUpdateContextMethod = EnvironmentServiceGrpc.getUpdateContextMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getUpdateContextMethod = EnvironmentServiceGrpc.getUpdateContextMethod) == null) {
          EnvironmentServiceGrpc.getUpdateContextMethod = getUpdateContextMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.UpdateContextRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.UpdateContextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("UpdateContext"))
              .build();
        }
      }
    }
    return getUpdateContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionResponse> getGetCurrentSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentSession",
      requestType = com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionRequest,
      com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionResponse> getGetCurrentSessionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionRequest, com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionResponse> getGetCurrentSessionMethod;
    if ((getGetCurrentSessionMethod = EnvironmentServiceGrpc.getGetCurrentSessionMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getGetCurrentSessionMethod = EnvironmentServiceGrpc.getGetCurrentSessionMethod) == null) {
          EnvironmentServiceGrpc.getGetCurrentSessionMethod = getGetCurrentSessionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionRequest, com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("GetCurrentSession"))
              .build();
        }
      }
    }
    return getGetCurrentSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceRequest,
      com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceResponse> getGetScalekitResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetScalekitResources",
      requestType = com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceRequest,
      com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceResponse> getGetScalekitResourcesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceRequest, com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceResponse> getGetScalekitResourcesMethod;
    if ((getGetScalekitResourcesMethod = EnvironmentServiceGrpc.getGetScalekitResourcesMethod) == null) {
      synchronized (EnvironmentServiceGrpc.class) {
        if ((getGetScalekitResourcesMethod = EnvironmentServiceGrpc.getGetScalekitResourcesMethod) == null) {
          EnvironmentServiceGrpc.getGetScalekitResourcesMethod = getGetScalekitResourcesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceRequest, com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetScalekitResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentServiceMethodDescriptorSupplier("GetScalekitResources"))
              .build();
        }
      }
    }
    return getGetScalekitResourcesMethod;
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
    default void generateNewSamlCertificate(com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateNewSamlCertificateMethod(), responseObserver);
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

    /**
     */
    default void updateFeatures(com.scalekit.grpc.scalekit.v1.environments.UpdateFeaturesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFeaturesMethod(), responseObserver);
    }

    /**
     */
    default void enableFSAFeature(com.scalekit.grpc.scalekit.v1.environments.EnableFSAFeatureRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableFSAFeatureMethod(), responseObserver);
    }

    /**
     */
    default void disableFSAFeature(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableFSAFeatureMethod(), responseObserver);
    }

    /**
     */
    default void enableFeature(com.scalekit.grpc.scalekit.v1.environments.EnableFeatureRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableFeatureMethod(), responseObserver);
    }

    /**
     */
    default void disableFeature(com.scalekit.grpc.scalekit.v1.environments.DisableFeatureRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableFeatureMethod(), responseObserver);
    }

    /**
     */
    default void getFeatures(com.scalekit.grpc.scalekit.v1.environments.GetFeaturesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFeaturesMethod(), responseObserver);
    }

    /**
     */
    default void createEnvironmentSessionSettings(com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEnvironmentSessionSettingsMethod(), responseObserver);
    }

    /**
     */
    default void createEnvironmentUserManagement(com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEnvironmentUserManagementMethod(), responseObserver);
    }

    /**
     */
    default void getEnvironmentSessionSettings(com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEnvironmentSessionSettingsMethod(), responseObserver);
    }

    /**
     */
    default void getEnvironmentUserManagement(com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEnvironmentUserManagementMethod(), responseObserver);
    }

    /**
     */
    default void updateEnvironmentSessionSettings(com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEnvironmentSessionSettingsMethod(), responseObserver);
    }

    /**
     */
    default void updateEnvironmentUserManagement(com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEnvironmentUserManagementMethod(), responseObserver);
    }

    /**
     */
    default void getContext(com.scalekit.grpc.scalekit.v1.environments.GetContextRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetContextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetContextMethod(), responseObserver);
    }

    /**
     */
    default void updateContext(com.scalekit.grpc.scalekit.v1.environments.UpdateContextRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateContextMethod(), responseObserver);
    }

    /**
     */
    default void getCurrentSession(com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentSessionMethod(), responseObserver);
    }

    /**
     */
    default void getScalekitResources(com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetScalekitResourcesMethod(), responseObserver);
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
    public void generateNewSamlCertificate(com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateNewSamlCertificateMethod(), getCallOptions()), request, responseObserver);
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

    /**
     */
    public void updateFeatures(com.scalekit.grpc.scalekit.v1.environments.UpdateFeaturesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFeaturesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableFSAFeature(com.scalekit.grpc.scalekit.v1.environments.EnableFSAFeatureRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableFSAFeatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableFSAFeature(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableFSAFeatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableFeature(com.scalekit.grpc.scalekit.v1.environments.EnableFeatureRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableFeatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableFeature(com.scalekit.grpc.scalekit.v1.environments.DisableFeatureRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableFeatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFeatures(com.scalekit.grpc.scalekit.v1.environments.GetFeaturesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFeaturesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createEnvironmentSessionSettings(com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEnvironmentSessionSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createEnvironmentUserManagement(com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEnvironmentUserManagementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEnvironmentSessionSettings(com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEnvironmentSessionSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEnvironmentUserManagement(com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEnvironmentUserManagementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEnvironmentSessionSettings(com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEnvironmentSessionSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEnvironmentUserManagement(com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEnvironmentUserManagementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getContext(com.scalekit.grpc.scalekit.v1.environments.GetContextRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetContextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateContext(com.scalekit.grpc.scalekit.v1.environments.UpdateContextRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCurrentSession(com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getScalekitResources(com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetScalekitResourcesMethod(), getCallOptions()), request, responseObserver);
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
    public com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateResponse generateNewSamlCertificate(com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateNewSamlCertificateMethod(), getCallOptions(), request);
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

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse updateFeatures(com.scalekit.grpc.scalekit.v1.environments.UpdateFeaturesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFeaturesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty enableFSAFeature(com.scalekit.grpc.scalekit.v1.environments.EnableFSAFeatureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableFSAFeatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty disableFSAFeature(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableFSAFeatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty enableFeature(com.scalekit.grpc.scalekit.v1.environments.EnableFeatureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableFeatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty disableFeature(com.scalekit.grpc.scalekit.v1.environments.DisableFeatureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableFeatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse getFeatures(com.scalekit.grpc.scalekit.v1.environments.GetFeaturesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFeaturesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsResponse createEnvironmentSessionSettings(com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEnvironmentSessionSettingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementResponse createEnvironmentUserManagement(com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEnvironmentUserManagementMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsResponse getEnvironmentSessionSettings(com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEnvironmentSessionSettingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementResponse getEnvironmentUserManagement(com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEnvironmentUserManagementMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsResponse updateEnvironmentSessionSettings(com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEnvironmentSessionSettingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementResponse updateEnvironmentUserManagement(com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEnvironmentUserManagementMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.GetContextResponse getContext(com.scalekit.grpc.scalekit.v1.environments.GetContextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetContextMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateContext(com.scalekit.grpc.scalekit.v1.environments.UpdateContextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateContextMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionResponse getCurrentSession(com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceResponse getScalekitResources(com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetScalekitResourcesMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateResponse> generateNewSamlCertificate(
        com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateNewSamlCertificateMethod(), getCallOptions()), request);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse> updateFeatures(
        com.scalekit.grpc.scalekit.v1.environments.UpdateFeaturesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFeaturesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> enableFSAFeature(
        com.scalekit.grpc.scalekit.v1.environments.EnableFSAFeatureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableFSAFeatureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> disableFSAFeature(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableFSAFeatureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> enableFeature(
        com.scalekit.grpc.scalekit.v1.environments.EnableFeatureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableFeatureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> disableFeature(
        com.scalekit.grpc.scalekit.v1.environments.DisableFeatureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableFeatureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse> getFeatures(
        com.scalekit.grpc.scalekit.v1.environments.GetFeaturesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFeaturesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsResponse> createEnvironmentSessionSettings(
        com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEnvironmentSessionSettingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementResponse> createEnvironmentUserManagement(
        com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEnvironmentUserManagementMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsResponse> getEnvironmentSessionSettings(
        com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEnvironmentSessionSettingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementResponse> getEnvironmentUserManagement(
        com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEnvironmentUserManagementMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsResponse> updateEnvironmentSessionSettings(
        com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEnvironmentSessionSettingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementResponse> updateEnvironmentUserManagement(
        com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEnvironmentUserManagementMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.GetContextResponse> getContext(
        com.scalekit.grpc.scalekit.v1.environments.GetContextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetContextMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateContext(
        com.scalekit.grpc.scalekit.v1.environments.UpdateContextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateContextMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionResponse> getCurrentSession(
        com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceResponse> getScalekitResources(
        com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetScalekitResourcesMethod(), getCallOptions()), request);
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
  private static final int METHODID_GENERATE_NEW_SAML_CERTIFICATE = 10;
  private static final int METHODID_UPDATE_PORTAL_CUSTOMIZATION = 11;
  private static final int METHODID_GET_PORTAL_CUSTOMIZATION = 12;
  private static final int METHODID_CREATE_ASSET_UPLOAD_URL = 13;
  private static final int METHODID_UPDATE_FEATURES = 14;
  private static final int METHODID_ENABLE_FSAFEATURE = 15;
  private static final int METHODID_DISABLE_FSAFEATURE = 16;
  private static final int METHODID_ENABLE_FEATURE = 17;
  private static final int METHODID_DISABLE_FEATURE = 18;
  private static final int METHODID_GET_FEATURES = 19;
  private static final int METHODID_CREATE_ENVIRONMENT_SESSION_SETTINGS = 20;
  private static final int METHODID_CREATE_ENVIRONMENT_USER_MANAGEMENT = 21;
  private static final int METHODID_GET_ENVIRONMENT_SESSION_SETTINGS = 22;
  private static final int METHODID_GET_ENVIRONMENT_USER_MANAGEMENT = 23;
  private static final int METHODID_UPDATE_ENVIRONMENT_SESSION_SETTINGS = 24;
  private static final int METHODID_UPDATE_ENVIRONMENT_USER_MANAGEMENT = 25;
  private static final int METHODID_GET_CONTEXT = 26;
  private static final int METHODID_UPDATE_CONTEXT = 27;
  private static final int METHODID_GET_CURRENT_SESSION = 28;
  private static final int METHODID_GET_SCALEKIT_RESOURCES = 29;

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
        case METHODID_GENERATE_NEW_SAML_CERTIFICATE:
          serviceImpl.generateNewSamlCertificate((com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateResponse>) responseObserver);
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
        case METHODID_UPDATE_FEATURES:
          serviceImpl.updateFeatures((com.scalekit.grpc.scalekit.v1.environments.UpdateFeaturesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse>) responseObserver);
          break;
        case METHODID_ENABLE_FSAFEATURE:
          serviceImpl.enableFSAFeature((com.scalekit.grpc.scalekit.v1.environments.EnableFSAFeatureRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DISABLE_FSAFEATURE:
          serviceImpl.disableFSAFeature((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ENABLE_FEATURE:
          serviceImpl.enableFeature((com.scalekit.grpc.scalekit.v1.environments.EnableFeatureRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DISABLE_FEATURE:
          serviceImpl.disableFeature((com.scalekit.grpc.scalekit.v1.environments.DisableFeatureRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_FEATURES:
          serviceImpl.getFeatures((com.scalekit.grpc.scalekit.v1.environments.GetFeaturesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse>) responseObserver);
          break;
        case METHODID_CREATE_ENVIRONMENT_SESSION_SETTINGS:
          serviceImpl.createEnvironmentSessionSettings((com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsResponse>) responseObserver);
          break;
        case METHODID_CREATE_ENVIRONMENT_USER_MANAGEMENT:
          serviceImpl.createEnvironmentUserManagement((com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementResponse>) responseObserver);
          break;
        case METHODID_GET_ENVIRONMENT_SESSION_SETTINGS:
          serviceImpl.getEnvironmentSessionSettings((com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsResponse>) responseObserver);
          break;
        case METHODID_GET_ENVIRONMENT_USER_MANAGEMENT:
          serviceImpl.getEnvironmentUserManagement((com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ENVIRONMENT_SESSION_SETTINGS:
          serviceImpl.updateEnvironmentSessionSettings((com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ENVIRONMENT_USER_MANAGEMENT:
          serviceImpl.updateEnvironmentUserManagement((com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementResponse>) responseObserver);
          break;
        case METHODID_GET_CONTEXT:
          serviceImpl.getContext((com.scalekit.grpc.scalekit.v1.environments.GetContextRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetContextResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CONTEXT:
          serviceImpl.updateContext((com.scalekit.grpc.scalekit.v1.environments.UpdateContextRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_CURRENT_SESSION:
          serviceImpl.getCurrentSession((com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionResponse>) responseObserver);
          break;
        case METHODID_GET_SCALEKIT_RESOURCES:
          serviceImpl.getScalekitResources((com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceResponse>) responseObserver);
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
          getGenerateNewSamlCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateRequest,
              com.scalekit.grpc.scalekit.v1.environments.GenerateSamlCertificateResponse>(
                service, METHODID_GENERATE_NEW_SAML_CERTIFICATE)))
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
        .addMethod(
          getUpdateFeaturesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.UpdateFeaturesRequest,
              com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse>(
                service, METHODID_UPDATE_FEATURES)))
        .addMethod(
          getEnableFSAFeatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.EnableFSAFeatureRequest,
              com.google.protobuf.Empty>(
                service, METHODID_ENABLE_FSAFEATURE)))
        .addMethod(
          getDisableFSAFeatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_DISABLE_FSAFEATURE)))
        .addMethod(
          getEnableFeatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.EnableFeatureRequest,
              com.google.protobuf.Empty>(
                service, METHODID_ENABLE_FEATURE)))
        .addMethod(
          getDisableFeatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.DisableFeatureRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DISABLE_FEATURE)))
        .addMethod(
          getGetFeaturesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.GetFeaturesRequest,
              com.scalekit.grpc.scalekit.v1.environments.GetFeaturesResponse>(
                service, METHODID_GET_FEATURES)))
        .addMethod(
          getCreateEnvironmentSessionSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsRequest,
              com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentSessionSettingsResponse>(
                service, METHODID_CREATE_ENVIRONMENT_SESSION_SETTINGS)))
        .addMethod(
          getCreateEnvironmentUserManagementMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementRequest,
              com.scalekit.grpc.scalekit.v1.environments.CreateEnvironmentUserManagementResponse>(
                service, METHODID_CREATE_ENVIRONMENT_USER_MANAGEMENT)))
        .addMethod(
          getGetEnvironmentSessionSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsRequest,
              com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentSessionSettingsResponse>(
                service, METHODID_GET_ENVIRONMENT_SESSION_SETTINGS)))
        .addMethod(
          getGetEnvironmentUserManagementMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementRequest,
              com.scalekit.grpc.scalekit.v1.environments.GetEnvironmentUserManagementResponse>(
                service, METHODID_GET_ENVIRONMENT_USER_MANAGEMENT)))
        .addMethod(
          getUpdateEnvironmentSessionSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsRequest,
              com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentSessionSettingsResponse>(
                service, METHODID_UPDATE_ENVIRONMENT_SESSION_SETTINGS)))
        .addMethod(
          getUpdateEnvironmentUserManagementMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementRequest,
              com.scalekit.grpc.scalekit.v1.environments.UpdateEnvironmentUserManagementResponse>(
                service, METHODID_UPDATE_ENVIRONMENT_USER_MANAGEMENT)))
        .addMethod(
          getGetContextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.GetContextRequest,
              com.scalekit.grpc.scalekit.v1.environments.GetContextResponse>(
                service, METHODID_GET_CONTEXT)))
        .addMethod(
          getUpdateContextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.UpdateContextRequest,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_CONTEXT)))
        .addMethod(
          getGetCurrentSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionRequest,
              com.scalekit.grpc.scalekit.v1.environments.GetCurrentSessionResponse>(
                service, METHODID_GET_CURRENT_SESSION)))
        .addMethod(
          getGetScalekitResourcesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceRequest,
              com.scalekit.grpc.scalekit.v1.environments.ScalekitResourceResponse>(
                service, METHODID_GET_SCALEKIT_RESOURCES)))
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
              .addMethod(getGenerateNewSamlCertificateMethod())
              .addMethod(getUpdatePortalCustomizationMethod())
              .addMethod(getGetPortalCustomizationMethod())
              .addMethod(getCreateAssetUploadURLMethod())
              .addMethod(getUpdateFeaturesMethod())
              .addMethod(getEnableFSAFeatureMethod())
              .addMethod(getDisableFSAFeatureMethod())
              .addMethod(getEnableFeatureMethod())
              .addMethod(getDisableFeatureMethod())
              .addMethod(getGetFeaturesMethod())
              .addMethod(getCreateEnvironmentSessionSettingsMethod())
              .addMethod(getCreateEnvironmentUserManagementMethod())
              .addMethod(getGetEnvironmentSessionSettingsMethod())
              .addMethod(getGetEnvironmentUserManagementMethod())
              .addMethod(getUpdateEnvironmentSessionSettingsMethod())
              .addMethod(getUpdateEnvironmentUserManagementMethod())
              .addMethod(getGetContextMethod())
              .addMethod(getUpdateContextMethod())
              .addMethod(getGetCurrentSessionMethod())
              .addMethod(getGetScalekitResourcesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
