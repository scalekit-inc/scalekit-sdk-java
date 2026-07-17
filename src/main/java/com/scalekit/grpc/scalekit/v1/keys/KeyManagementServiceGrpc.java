package com.scalekit.grpc.scalekit.v1.keys;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/keys/keys.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class KeyManagementServiceGrpc {

  private KeyManagementServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.keys.KeyManagementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.CreateDEKRequest,
      com.scalekit.grpc.scalekit.v1.keys.CreateDEKResponse> getCreateDEKMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDEK",
      requestType = com.scalekit.grpc.scalekit.v1.keys.CreateDEKRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.keys.CreateDEKResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.CreateDEKRequest,
      com.scalekit.grpc.scalekit.v1.keys.CreateDEKResponse> getCreateDEKMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.CreateDEKRequest, com.scalekit.grpc.scalekit.v1.keys.CreateDEKResponse> getCreateDEKMethod;
    if ((getCreateDEKMethod = KeyManagementServiceGrpc.getCreateDEKMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getCreateDEKMethod = KeyManagementServiceGrpc.getCreateDEKMethod) == null) {
          KeyManagementServiceGrpc.getCreateDEKMethod = getCreateDEKMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.CreateDEKRequest, com.scalekit.grpc.scalekit.v1.keys.CreateDEKResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDEK"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.CreateDEKRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.CreateDEKResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("CreateDEK"))
              .build();
        }
      }
    }
    return getCreateDEKMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.ActivateDEKRequest,
      com.scalekit.grpc.scalekit.v1.keys.ActivateDEKResponse> getActivateDEKMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivateDEK",
      requestType = com.scalekit.grpc.scalekit.v1.keys.ActivateDEKRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.keys.ActivateDEKResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.ActivateDEKRequest,
      com.scalekit.grpc.scalekit.v1.keys.ActivateDEKResponse> getActivateDEKMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.ActivateDEKRequest, com.scalekit.grpc.scalekit.v1.keys.ActivateDEKResponse> getActivateDEKMethod;
    if ((getActivateDEKMethod = KeyManagementServiceGrpc.getActivateDEKMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getActivateDEKMethod = KeyManagementServiceGrpc.getActivateDEKMethod) == null) {
          KeyManagementServiceGrpc.getActivateDEKMethod = getActivateDEKMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.ActivateDEKRequest, com.scalekit.grpc.scalekit.v1.keys.ActivateDEKResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActivateDEK"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.ActivateDEKRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.ActivateDEKResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("ActivateDEK"))
              .build();
        }
      }
    }
    return getActivateDEKMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.ReencryptDataRequest,
      com.scalekit.grpc.scalekit.v1.keys.ReencryptDataResponse> getReencryptDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReencryptData",
      requestType = com.scalekit.grpc.scalekit.v1.keys.ReencryptDataRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.keys.ReencryptDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.ReencryptDataRequest,
      com.scalekit.grpc.scalekit.v1.keys.ReencryptDataResponse> getReencryptDataMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.ReencryptDataRequest, com.scalekit.grpc.scalekit.v1.keys.ReencryptDataResponse> getReencryptDataMethod;
    if ((getReencryptDataMethod = KeyManagementServiceGrpc.getReencryptDataMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getReencryptDataMethod = KeyManagementServiceGrpc.getReencryptDataMethod) == null) {
          KeyManagementServiceGrpc.getReencryptDataMethod = getReencryptDataMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.ReencryptDataRequest, com.scalekit.grpc.scalekit.v1.keys.ReencryptDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReencryptData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.ReencryptDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.ReencryptDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("ReencryptData"))
              .build();
        }
      }
    }
    return getReencryptDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.ListDEKsRequest,
      com.scalekit.grpc.scalekit.v1.keys.ListDEKsResponse> getListDEKsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDEKs",
      requestType = com.scalekit.grpc.scalekit.v1.keys.ListDEKsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.keys.ListDEKsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.ListDEKsRequest,
      com.scalekit.grpc.scalekit.v1.keys.ListDEKsResponse> getListDEKsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.ListDEKsRequest, com.scalekit.grpc.scalekit.v1.keys.ListDEKsResponse> getListDEKsMethod;
    if ((getListDEKsMethod = KeyManagementServiceGrpc.getListDEKsMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getListDEKsMethod = KeyManagementServiceGrpc.getListDEKsMethod) == null) {
          KeyManagementServiceGrpc.getListDEKsMethod = getListDEKsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.ListDEKsRequest, com.scalekit.grpc.scalekit.v1.keys.ListDEKsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDEKs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.ListDEKsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.ListDEKsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("ListDEKs"))
              .build();
        }
      }
    }
    return getListDEKsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.GetDEKRequest,
      com.scalekit.grpc.scalekit.v1.keys.GetDEKResponse> getGetDEKMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDEK",
      requestType = com.scalekit.grpc.scalekit.v1.keys.GetDEKRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.keys.GetDEKResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.GetDEKRequest,
      com.scalekit.grpc.scalekit.v1.keys.GetDEKResponse> getGetDEKMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.GetDEKRequest, com.scalekit.grpc.scalekit.v1.keys.GetDEKResponse> getGetDEKMethod;
    if ((getGetDEKMethod = KeyManagementServiceGrpc.getGetDEKMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getGetDEKMethod = KeyManagementServiceGrpc.getGetDEKMethod) == null) {
          KeyManagementServiceGrpc.getGetDEKMethod = getGetDEKMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.GetDEKRequest, com.scalekit.grpc.scalekit.v1.keys.GetDEKResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDEK"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.GetDEKRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.GetDEKResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("GetDEK"))
              .build();
        }
      }
    }
    return getGetDEKMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.PatchDEKRequest,
      com.scalekit.grpc.scalekit.v1.keys.PatchDEKResponse> getPatchDEKMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchDEK",
      requestType = com.scalekit.grpc.scalekit.v1.keys.PatchDEKRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.keys.PatchDEKResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.PatchDEKRequest,
      com.scalekit.grpc.scalekit.v1.keys.PatchDEKResponse> getPatchDEKMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.PatchDEKRequest, com.scalekit.grpc.scalekit.v1.keys.PatchDEKResponse> getPatchDEKMethod;
    if ((getPatchDEKMethod = KeyManagementServiceGrpc.getPatchDEKMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getPatchDEKMethod = KeyManagementServiceGrpc.getPatchDEKMethod) == null) {
          KeyManagementServiceGrpc.getPatchDEKMethod = getPatchDEKMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.PatchDEKRequest, com.scalekit.grpc.scalekit.v1.keys.PatchDEKResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PatchDEK"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.PatchDEKRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.PatchDEKResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("PatchDEK"))
              .build();
        }
      }
    }
    return getPatchDEKMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.DestroyDEKRequest,
      com.google.protobuf.Empty> getDestroyDEKMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DestroyDEK",
      requestType = com.scalekit.grpc.scalekit.v1.keys.DestroyDEKRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.DestroyDEKRequest,
      com.google.protobuf.Empty> getDestroyDEKMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.DestroyDEKRequest, com.google.protobuf.Empty> getDestroyDEKMethod;
    if ((getDestroyDEKMethod = KeyManagementServiceGrpc.getDestroyDEKMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getDestroyDEKMethod = KeyManagementServiceGrpc.getDestroyDEKMethod) == null) {
          KeyManagementServiceGrpc.getDestroyDEKMethod = getDestroyDEKMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.DestroyDEKRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DestroyDEK"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.DestroyDEKRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("DestroyDEK"))
              .build();
        }
      }
    }
    return getDestroyDEKMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoRequest,
      com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoResponse> getGetBYOKSetupInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBYOKSetupInfo",
      requestType = com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoRequest,
      com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoResponse> getGetBYOKSetupInfoMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoRequest, com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoResponse> getGetBYOKSetupInfoMethod;
    if ((getGetBYOKSetupInfoMethod = KeyManagementServiceGrpc.getGetBYOKSetupInfoMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getGetBYOKSetupInfoMethod = KeyManagementServiceGrpc.getGetBYOKSetupInfoMethod) == null) {
          KeyManagementServiceGrpc.getGetBYOKSetupInfoMethod = getGetBYOKSetupInfoMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoRequest, com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBYOKSetupInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("GetBYOKSetupInfo"))
              .build();
        }
      }
    }
    return getGetBYOKSetupInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyRequest,
      com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyResponse> getVerifyBYOKKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyBYOKKey",
      requestType = com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyRequest,
      com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyResponse> getVerifyBYOKKeyMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyRequest, com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyResponse> getVerifyBYOKKeyMethod;
    if ((getVerifyBYOKKeyMethod = KeyManagementServiceGrpc.getVerifyBYOKKeyMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getVerifyBYOKKeyMethod = KeyManagementServiceGrpc.getVerifyBYOKKeyMethod) == null) {
          KeyManagementServiceGrpc.getVerifyBYOKKeyMethod = getVerifyBYOKKeyMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyRequest, com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyBYOKKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("VerifyBYOKKey"))
              .build();
        }
      }
    }
    return getVerifyBYOKKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyRequest,
      com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyResponse> getCreateMasterKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMasterKey",
      requestType = com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyRequest,
      com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyResponse> getCreateMasterKeyMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyRequest, com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyResponse> getCreateMasterKeyMethod;
    if ((getCreateMasterKeyMethod = KeyManagementServiceGrpc.getCreateMasterKeyMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getCreateMasterKeyMethod = KeyManagementServiceGrpc.getCreateMasterKeyMethod) == null) {
          KeyManagementServiceGrpc.getCreateMasterKeyMethod = getCreateMasterKeyMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyRequest, com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMasterKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("CreateMasterKey"))
              .build();
        }
      }
    }
    return getCreateMasterKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyRequest,
      com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyResponse> getActivateMasterKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivateMasterKey",
      requestType = com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyRequest,
      com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyResponse> getActivateMasterKeyMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyRequest, com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyResponse> getActivateMasterKeyMethod;
    if ((getActivateMasterKeyMethod = KeyManagementServiceGrpc.getActivateMasterKeyMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getActivateMasterKeyMethod = KeyManagementServiceGrpc.getActivateMasterKeyMethod) == null) {
          KeyManagementServiceGrpc.getActivateMasterKeyMethod = getActivateMasterKeyMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyRequest, com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActivateMasterKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("ActivateMasterKey"))
              .build();
        }
      }
    }
    return getActivateMasterKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsRequest,
      com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsResponse> getRewrapDEKsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewrapDEKs",
      requestType = com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsRequest,
      com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsResponse> getRewrapDEKsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsRequest, com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsResponse> getRewrapDEKsMethod;
    if ((getRewrapDEKsMethod = KeyManagementServiceGrpc.getRewrapDEKsMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getRewrapDEKsMethod = KeyManagementServiceGrpc.getRewrapDEKsMethod) == null) {
          KeyManagementServiceGrpc.getRewrapDEKsMethod = getRewrapDEKsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsRequest, com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewrapDEKs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("RewrapDEKs"))
              .build();
        }
      }
    }
    return getRewrapDEKsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysRequest,
      com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysResponse> getListMasterKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMasterKeys",
      requestType = com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysRequest,
      com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysResponse> getListMasterKeysMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysRequest, com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysResponse> getListMasterKeysMethod;
    if ((getListMasterKeysMethod = KeyManagementServiceGrpc.getListMasterKeysMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getListMasterKeysMethod = KeyManagementServiceGrpc.getListMasterKeysMethod) == null) {
          KeyManagementServiceGrpc.getListMasterKeysMethod = getListMasterKeysMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysRequest, com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMasterKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("ListMasterKeys"))
              .build();
        }
      }
    }
    return getListMasterKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyRequest,
      com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyResponse> getGetMasterKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMasterKey",
      requestType = com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyRequest,
      com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyResponse> getGetMasterKeyMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyRequest, com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyResponse> getGetMasterKeyMethod;
    if ((getGetMasterKeyMethod = KeyManagementServiceGrpc.getGetMasterKeyMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getGetMasterKeyMethod = KeyManagementServiceGrpc.getGetMasterKeyMethod) == null) {
          KeyManagementServiceGrpc.getGetMasterKeyMethod = getGetMasterKeyMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyRequest, com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMasterKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("GetMasterKey"))
              .build();
        }
      }
    }
    return getGetMasterKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.DestroyMasterKeyRequest,
      com.google.protobuf.Empty> getDestroyMasterKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DestroyMasterKey",
      requestType = com.scalekit.grpc.scalekit.v1.keys.DestroyMasterKeyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.DestroyMasterKeyRequest,
      com.google.protobuf.Empty> getDestroyMasterKeyMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.DestroyMasterKeyRequest, com.google.protobuf.Empty> getDestroyMasterKeyMethod;
    if ((getDestroyMasterKeyMethod = KeyManagementServiceGrpc.getDestroyMasterKeyMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getDestroyMasterKeyMethod = KeyManagementServiceGrpc.getDestroyMasterKeyMethod) == null) {
          KeyManagementServiceGrpc.getDestroyMasterKeyMethod = getDestroyMasterKeyMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.DestroyMasterKeyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DestroyMasterKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.DestroyMasterKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("DestroyMasterKey"))
              .build();
        }
      }
    }
    return getDestroyMasterKeyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeyManagementServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagementServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagementServiceStub>() {
        @java.lang.Override
        public KeyManagementServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagementServiceStub(channel, callOptions);
        }
      };
    return KeyManagementServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyManagementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagementServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagementServiceBlockingStub>() {
        @java.lang.Override
        public KeyManagementServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagementServiceBlockingStub(channel, callOptions);
        }
      };
    return KeyManagementServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeyManagementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagementServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagementServiceFutureStub>() {
        @java.lang.Override
        public KeyManagementServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagementServiceFutureStub(channel, callOptions);
        }
      };
    return KeyManagementServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateDEK creates a new DEK version in CREATED state.
     * The DEK is not used for encryption until ActivateDEK is called.
     * </pre>
     */
    default void createDEK(com.scalekit.grpc.scalekit.v1.keys.CreateDEKRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.CreateDEKResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDEKMethod(), responseObserver);
    }

    /**
     * <pre>
     * ActivateDEK promotes a CREATED DEK to ACTIVE and deprecates all other versions.
     * Only DEKs in CREATED state can be activated.
     * After activation, call ReencryptData to migrate existing encrypted data.
     * </pre>
     */
    default void activateDEK(com.scalekit.grpc.scalekit.v1.keys.ActivateDEKRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.ActivateDEKResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateDEKMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReencryptData re-encrypts all application secrets under the currently active DEK.
     * Run this after ActivateDEK to complete data migration.
     * Required before DestroyDEK is allowed on the old version.
     * </pre>
     */
    default void reencryptData(com.scalekit.grpc.scalekit.v1.keys.ReencryptDataRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.ReencryptDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReencryptDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListDEKs lists DEK versions for an environment with pagination and optional status filter.
     * </pre>
     */
    default void listDEKs(com.scalekit.grpc.scalekit.v1.keys.ListDEKsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.ListDEKsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDEKsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDEK returns a single DEK version by its version number.
     * </pre>
     */
    default void getDEK(com.scalekit.grpc.scalekit.v1.keys.GetDEKRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.GetDEKResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDEKMethod(), responseObserver);
    }

    /**
     * <pre>
     * PatchDEK updates the key_type, provider, and key_ref of a DEK version.
     * Only allowed on DEKs in CREATED state. Use this to correct a misconfigured key before activation.
     * </pre>
     */
    default void patchDEK(com.scalekit.grpc.scalekit.v1.keys.PatchDEKRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.PatchDEKResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchDEKMethod(), responseObserver);
    }

    /**
     * <pre>
     * DestroyDEK permanently deletes a DEK version.
     * Only allowed on DEPRECATED DEKs where ReencryptData has already run (rotated_at is set).
     * This operation is irreversible.
     * </pre>
     */
    default void destroyDEK(com.scalekit.grpc.scalekit.v1.keys.DestroyDEKRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDestroyDEKMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetBYOKSetupInfo returns the Scalekit service account that customers must
     * grant KMS access to when configuring a BYOK key.
     * </pre>
     */
    default void getBYOKSetupInfo(com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBYOKSetupInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * VerifyBYOKKey checks whether Scalekit's BYOK service account can encrypt using
     * the customer-supplied GCP KMS key. Call this before CreateDEK to catch IAM
     * misconfiguration early (fail-fast).
     * </pre>
     */
    default void verifyBYOKKey(com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyBYOKKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateMasterKey creates a new master key version in CREATED state.
     * The master key is not used for encryption until ActivateMasterKey is called.
     * </pre>
     */
    default void createMasterKey(com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMasterKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * ActivateMasterKey promotes a CREATED master key to ACTIVE and deprecates all other versions.
     * Only master keys in CREATED state can be activated.
     * After activation, call RewrapDEKs to re-wrap all DEKs under the new master key.
     * </pre>
     */
    default void activateMasterKey(com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateMasterKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * RewrapDEKs re-wraps all DEKs under the currently active master key.
     * Run this after ActivateMasterKey to complete master key rotation.
     * Required before DestroyMasterKey is allowed on the old version.
     * </pre>
     */
    default void rewrapDEKs(com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewrapDEKsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListMasterKeys lists master key versions with pagination and optional status filter.
     * </pre>
     */
    default void listMasterKeys(com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMasterKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetMasterKey returns a single master key version by its version number.
     * </pre>
     */
    default void getMasterKey(com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMasterKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * DestroyMasterKey permanently deletes a master key version.
     * Only allowed on DEPRECATED master keys with no DEKs still wrapped under them.
     * Run RewrapDEKs before calling this. This operation is irreversible.
     * </pre>
     */
    default void destroyMasterKey(com.scalekit.grpc.scalekit.v1.keys.DestroyMasterKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDestroyMasterKeyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service KeyManagementService.
   */
  public static abstract class KeyManagementServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return KeyManagementServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service KeyManagementService.
   */
  public static final class KeyManagementServiceStub
      extends io.grpc.stub.AbstractAsyncStub<KeyManagementServiceStub> {
    private KeyManagementServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagementServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagementServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateDEK creates a new DEK version in CREATED state.
     * The DEK is not used for encryption until ActivateDEK is called.
     * </pre>
     */
    public void createDEK(com.scalekit.grpc.scalekit.v1.keys.CreateDEKRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.CreateDEKResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDEKMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ActivateDEK promotes a CREATED DEK to ACTIVE and deprecates all other versions.
     * Only DEKs in CREATED state can be activated.
     * After activation, call ReencryptData to migrate existing encrypted data.
     * </pre>
     */
    public void activateDEK(com.scalekit.grpc.scalekit.v1.keys.ActivateDEKRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.ActivateDEKResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateDEKMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReencryptData re-encrypts all application secrets under the currently active DEK.
     * Run this after ActivateDEK to complete data migration.
     * Required before DestroyDEK is allowed on the old version.
     * </pre>
     */
    public void reencryptData(com.scalekit.grpc.scalekit.v1.keys.ReencryptDataRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.ReencryptDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReencryptDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListDEKs lists DEK versions for an environment with pagination and optional status filter.
     * </pre>
     */
    public void listDEKs(com.scalekit.grpc.scalekit.v1.keys.ListDEKsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.ListDEKsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDEKsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDEK returns a single DEK version by its version number.
     * </pre>
     */
    public void getDEK(com.scalekit.grpc.scalekit.v1.keys.GetDEKRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.GetDEKResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDEKMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PatchDEK updates the key_type, provider, and key_ref of a DEK version.
     * Only allowed on DEKs in CREATED state. Use this to correct a misconfigured key before activation.
     * </pre>
     */
    public void patchDEK(com.scalekit.grpc.scalekit.v1.keys.PatchDEKRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.PatchDEKResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchDEKMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DestroyDEK permanently deletes a DEK version.
     * Only allowed on DEPRECATED DEKs where ReencryptData has already run (rotated_at is set).
     * This operation is irreversible.
     * </pre>
     */
    public void destroyDEK(com.scalekit.grpc.scalekit.v1.keys.DestroyDEKRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDestroyDEKMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetBYOKSetupInfo returns the Scalekit service account that customers must
     * grant KMS access to when configuring a BYOK key.
     * </pre>
     */
    public void getBYOKSetupInfo(com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBYOKSetupInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VerifyBYOKKey checks whether Scalekit's BYOK service account can encrypt using
     * the customer-supplied GCP KMS key. Call this before CreateDEK to catch IAM
     * misconfiguration early (fail-fast).
     * </pre>
     */
    public void verifyBYOKKey(com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyBYOKKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateMasterKey creates a new master key version in CREATED state.
     * The master key is not used for encryption until ActivateMasterKey is called.
     * </pre>
     */
    public void createMasterKey(com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMasterKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ActivateMasterKey promotes a CREATED master key to ACTIVE and deprecates all other versions.
     * Only master keys in CREATED state can be activated.
     * After activation, call RewrapDEKs to re-wrap all DEKs under the new master key.
     * </pre>
     */
    public void activateMasterKey(com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateMasterKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RewrapDEKs re-wraps all DEKs under the currently active master key.
     * Run this after ActivateMasterKey to complete master key rotation.
     * Required before DestroyMasterKey is allowed on the old version.
     * </pre>
     */
    public void rewrapDEKs(com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewrapDEKsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListMasterKeys lists master key versions with pagination and optional status filter.
     * </pre>
     */
    public void listMasterKeys(com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMasterKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetMasterKey returns a single master key version by its version number.
     * </pre>
     */
    public void getMasterKey(com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMasterKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DestroyMasterKey permanently deletes a master key version.
     * Only allowed on DEPRECATED master keys with no DEKs still wrapped under them.
     * Run RewrapDEKs before calling this. This operation is irreversible.
     * </pre>
     */
    public void destroyMasterKey(com.scalekit.grpc.scalekit.v1.keys.DestroyMasterKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDestroyMasterKeyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service KeyManagementService.
   */
  public static final class KeyManagementServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<KeyManagementServiceBlockingStub> {
    private KeyManagementServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagementServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagementServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateDEK creates a new DEK version in CREATED state.
     * The DEK is not used for encryption until ActivateDEK is called.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.CreateDEKResponse createDEK(com.scalekit.grpc.scalekit.v1.keys.CreateDEKRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDEKMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ActivateDEK promotes a CREATED DEK to ACTIVE and deprecates all other versions.
     * Only DEKs in CREATED state can be activated.
     * After activation, call ReencryptData to migrate existing encrypted data.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.ActivateDEKResponse activateDEK(com.scalekit.grpc.scalekit.v1.keys.ActivateDEKRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateDEKMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReencryptData re-encrypts all application secrets under the currently active DEK.
     * Run this after ActivateDEK to complete data migration.
     * Required before DestroyDEK is allowed on the old version.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.ReencryptDataResponse reencryptData(com.scalekit.grpc.scalekit.v1.keys.ReencryptDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReencryptDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListDEKs lists DEK versions for an environment with pagination and optional status filter.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.ListDEKsResponse listDEKs(com.scalekit.grpc.scalekit.v1.keys.ListDEKsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDEKsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDEK returns a single DEK version by its version number.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.GetDEKResponse getDEK(com.scalekit.grpc.scalekit.v1.keys.GetDEKRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDEKMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PatchDEK updates the key_type, provider, and key_ref of a DEK version.
     * Only allowed on DEKs in CREATED state. Use this to correct a misconfigured key before activation.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.PatchDEKResponse patchDEK(com.scalekit.grpc.scalekit.v1.keys.PatchDEKRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchDEKMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DestroyDEK permanently deletes a DEK version.
     * Only allowed on DEPRECATED DEKs where ReencryptData has already run (rotated_at is set).
     * This operation is irreversible.
     * </pre>
     */
    public com.google.protobuf.Empty destroyDEK(com.scalekit.grpc.scalekit.v1.keys.DestroyDEKRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDestroyDEKMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetBYOKSetupInfo returns the Scalekit service account that customers must
     * grant KMS access to when configuring a BYOK key.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoResponse getBYOKSetupInfo(com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBYOKSetupInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VerifyBYOKKey checks whether Scalekit's BYOK service account can encrypt using
     * the customer-supplied GCP KMS key. Call this before CreateDEK to catch IAM
     * misconfiguration early (fail-fast).
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyResponse verifyBYOKKey(com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyBYOKKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateMasterKey creates a new master key version in CREATED state.
     * The master key is not used for encryption until ActivateMasterKey is called.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyResponse createMasterKey(com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMasterKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ActivateMasterKey promotes a CREATED master key to ACTIVE and deprecates all other versions.
     * Only master keys in CREATED state can be activated.
     * After activation, call RewrapDEKs to re-wrap all DEKs under the new master key.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyResponse activateMasterKey(com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateMasterKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RewrapDEKs re-wraps all DEKs under the currently active master key.
     * Run this after ActivateMasterKey to complete master key rotation.
     * Required before DestroyMasterKey is allowed on the old version.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsResponse rewrapDEKs(com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewrapDEKsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListMasterKeys lists master key versions with pagination and optional status filter.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysResponse listMasterKeys(com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMasterKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetMasterKey returns a single master key version by its version number.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyResponse getMasterKey(com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMasterKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DestroyMasterKey permanently deletes a master key version.
     * Only allowed on DEPRECATED master keys with no DEKs still wrapped under them.
     * Run RewrapDEKs before calling this. This operation is irreversible.
     * </pre>
     */
    public com.google.protobuf.Empty destroyMasterKey(com.scalekit.grpc.scalekit.v1.keys.DestroyMasterKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDestroyMasterKeyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service KeyManagementService.
   */
  public static final class KeyManagementServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<KeyManagementServiceFutureStub> {
    private KeyManagementServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagementServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagementServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateDEK creates a new DEK version in CREATED state.
     * The DEK is not used for encryption until ActivateDEK is called.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.CreateDEKResponse> createDEK(
        com.scalekit.grpc.scalekit.v1.keys.CreateDEKRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDEKMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ActivateDEK promotes a CREATED DEK to ACTIVE and deprecates all other versions.
     * Only DEKs in CREATED state can be activated.
     * After activation, call ReencryptData to migrate existing encrypted data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.ActivateDEKResponse> activateDEK(
        com.scalekit.grpc.scalekit.v1.keys.ActivateDEKRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateDEKMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ReencryptData re-encrypts all application secrets under the currently active DEK.
     * Run this after ActivateDEK to complete data migration.
     * Required before DestroyDEK is allowed on the old version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.ReencryptDataResponse> reencryptData(
        com.scalekit.grpc.scalekit.v1.keys.ReencryptDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReencryptDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListDEKs lists DEK versions for an environment with pagination and optional status filter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.ListDEKsResponse> listDEKs(
        com.scalekit.grpc.scalekit.v1.keys.ListDEKsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDEKsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDEK returns a single DEK version by its version number.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.GetDEKResponse> getDEK(
        com.scalekit.grpc.scalekit.v1.keys.GetDEKRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDEKMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PatchDEK updates the key_type, provider, and key_ref of a DEK version.
     * Only allowed on DEKs in CREATED state. Use this to correct a misconfigured key before activation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.PatchDEKResponse> patchDEK(
        com.scalekit.grpc.scalekit.v1.keys.PatchDEKRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchDEKMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DestroyDEK permanently deletes a DEK version.
     * Only allowed on DEPRECATED DEKs where ReencryptData has already run (rotated_at is set).
     * This operation is irreversible.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> destroyDEK(
        com.scalekit.grpc.scalekit.v1.keys.DestroyDEKRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDestroyDEKMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetBYOKSetupInfo returns the Scalekit service account that customers must
     * grant KMS access to when configuring a BYOK key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoResponse> getBYOKSetupInfo(
        com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBYOKSetupInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VerifyBYOKKey checks whether Scalekit's BYOK service account can encrypt using
     * the customer-supplied GCP KMS key. Call this before CreateDEK to catch IAM
     * misconfiguration early (fail-fast).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyResponse> verifyBYOKKey(
        com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyBYOKKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateMasterKey creates a new master key version in CREATED state.
     * The master key is not used for encryption until ActivateMasterKey is called.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyResponse> createMasterKey(
        com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMasterKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ActivateMasterKey promotes a CREATED master key to ACTIVE and deprecates all other versions.
     * Only master keys in CREATED state can be activated.
     * After activation, call RewrapDEKs to re-wrap all DEKs under the new master key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyResponse> activateMasterKey(
        com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateMasterKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RewrapDEKs re-wraps all DEKs under the currently active master key.
     * Run this after ActivateMasterKey to complete master key rotation.
     * Required before DestroyMasterKey is allowed on the old version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsResponse> rewrapDEKs(
        com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewrapDEKsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListMasterKeys lists master key versions with pagination and optional status filter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysResponse> listMasterKeys(
        com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMasterKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetMasterKey returns a single master key version by its version number.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyResponse> getMasterKey(
        com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMasterKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DestroyMasterKey permanently deletes a master key version.
     * Only allowed on DEPRECATED master keys with no DEKs still wrapped under them.
     * Run RewrapDEKs before calling this. This operation is irreversible.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> destroyMasterKey(
        com.scalekit.grpc.scalekit.v1.keys.DestroyMasterKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDestroyMasterKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DEK = 0;
  private static final int METHODID_ACTIVATE_DEK = 1;
  private static final int METHODID_REENCRYPT_DATA = 2;
  private static final int METHODID_LIST_DEKS = 3;
  private static final int METHODID_GET_DEK = 4;
  private static final int METHODID_PATCH_DEK = 5;
  private static final int METHODID_DESTROY_DEK = 6;
  private static final int METHODID_GET_BYOKSETUP_INFO = 7;
  private static final int METHODID_VERIFY_BYOKKEY = 8;
  private static final int METHODID_CREATE_MASTER_KEY = 9;
  private static final int METHODID_ACTIVATE_MASTER_KEY = 10;
  private static final int METHODID_REWRAP_DEKS = 11;
  private static final int METHODID_LIST_MASTER_KEYS = 12;
  private static final int METHODID_GET_MASTER_KEY = 13;
  private static final int METHODID_DESTROY_MASTER_KEY = 14;

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
        case METHODID_CREATE_DEK:
          serviceImpl.createDEK((com.scalekit.grpc.scalekit.v1.keys.CreateDEKRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.CreateDEKResponse>) responseObserver);
          break;
        case METHODID_ACTIVATE_DEK:
          serviceImpl.activateDEK((com.scalekit.grpc.scalekit.v1.keys.ActivateDEKRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.ActivateDEKResponse>) responseObserver);
          break;
        case METHODID_REENCRYPT_DATA:
          serviceImpl.reencryptData((com.scalekit.grpc.scalekit.v1.keys.ReencryptDataRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.ReencryptDataResponse>) responseObserver);
          break;
        case METHODID_LIST_DEKS:
          serviceImpl.listDEKs((com.scalekit.grpc.scalekit.v1.keys.ListDEKsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.ListDEKsResponse>) responseObserver);
          break;
        case METHODID_GET_DEK:
          serviceImpl.getDEK((com.scalekit.grpc.scalekit.v1.keys.GetDEKRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.GetDEKResponse>) responseObserver);
          break;
        case METHODID_PATCH_DEK:
          serviceImpl.patchDEK((com.scalekit.grpc.scalekit.v1.keys.PatchDEKRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.PatchDEKResponse>) responseObserver);
          break;
        case METHODID_DESTROY_DEK:
          serviceImpl.destroyDEK((com.scalekit.grpc.scalekit.v1.keys.DestroyDEKRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_BYOKSETUP_INFO:
          serviceImpl.getBYOKSetupInfo((com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoResponse>) responseObserver);
          break;
        case METHODID_VERIFY_BYOKKEY:
          serviceImpl.verifyBYOKKey((com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyResponse>) responseObserver);
          break;
        case METHODID_CREATE_MASTER_KEY:
          serviceImpl.createMasterKey((com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyResponse>) responseObserver);
          break;
        case METHODID_ACTIVATE_MASTER_KEY:
          serviceImpl.activateMasterKey((com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyResponse>) responseObserver);
          break;
        case METHODID_REWRAP_DEKS:
          serviceImpl.rewrapDEKs((com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsResponse>) responseObserver);
          break;
        case METHODID_LIST_MASTER_KEYS:
          serviceImpl.listMasterKeys((com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysResponse>) responseObserver);
          break;
        case METHODID_GET_MASTER_KEY:
          serviceImpl.getMasterKey((com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyResponse>) responseObserver);
          break;
        case METHODID_DESTROY_MASTER_KEY:
          serviceImpl.destroyMasterKey((com.scalekit.grpc.scalekit.v1.keys.DestroyMasterKeyRequest) request,
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
          getCreateDEKMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.CreateDEKRequest,
              com.scalekit.grpc.scalekit.v1.keys.CreateDEKResponse>(
                service, METHODID_CREATE_DEK)))
        .addMethod(
          getActivateDEKMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.ActivateDEKRequest,
              com.scalekit.grpc.scalekit.v1.keys.ActivateDEKResponse>(
                service, METHODID_ACTIVATE_DEK)))
        .addMethod(
          getReencryptDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.ReencryptDataRequest,
              com.scalekit.grpc.scalekit.v1.keys.ReencryptDataResponse>(
                service, METHODID_REENCRYPT_DATA)))
        .addMethod(
          getListDEKsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.ListDEKsRequest,
              com.scalekit.grpc.scalekit.v1.keys.ListDEKsResponse>(
                service, METHODID_LIST_DEKS)))
        .addMethod(
          getGetDEKMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.GetDEKRequest,
              com.scalekit.grpc.scalekit.v1.keys.GetDEKResponse>(
                service, METHODID_GET_DEK)))
        .addMethod(
          getPatchDEKMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.PatchDEKRequest,
              com.scalekit.grpc.scalekit.v1.keys.PatchDEKResponse>(
                service, METHODID_PATCH_DEK)))
        .addMethod(
          getDestroyDEKMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.DestroyDEKRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DESTROY_DEK)))
        .addMethod(
          getGetBYOKSetupInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoRequest,
              com.scalekit.grpc.scalekit.v1.keys.GetBYOKSetupInfoResponse>(
                service, METHODID_GET_BYOKSETUP_INFO)))
        .addMethod(
          getVerifyBYOKKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyRequest,
              com.scalekit.grpc.scalekit.v1.keys.VerifyBYOKKeyResponse>(
                service, METHODID_VERIFY_BYOKKEY)))
        .addMethod(
          getCreateMasterKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyRequest,
              com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyResponse>(
                service, METHODID_CREATE_MASTER_KEY)))
        .addMethod(
          getActivateMasterKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyRequest,
              com.scalekit.grpc.scalekit.v1.keys.ActivateMasterKeyResponse>(
                service, METHODID_ACTIVATE_MASTER_KEY)))
        .addMethod(
          getRewrapDEKsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsRequest,
              com.scalekit.grpc.scalekit.v1.keys.RewrapDEKsResponse>(
                service, METHODID_REWRAP_DEKS)))
        .addMethod(
          getListMasterKeysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysRequest,
              com.scalekit.grpc.scalekit.v1.keys.ListMasterKeysResponse>(
                service, METHODID_LIST_MASTER_KEYS)))
        .addMethod(
          getGetMasterKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyRequest,
              com.scalekit.grpc.scalekit.v1.keys.GetMasterKeyResponse>(
                service, METHODID_GET_MASTER_KEY)))
        .addMethod(
          getDestroyMasterKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.DestroyMasterKeyRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DESTROY_MASTER_KEY)))
        .build();
  }

  private static abstract class KeyManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyManagementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.keys.KeysProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyManagementService");
    }
  }

  private static final class KeyManagementServiceFileDescriptorSupplier
      extends KeyManagementServiceBaseDescriptorSupplier {
    KeyManagementServiceFileDescriptorSupplier() {}
  }

  private static final class KeyManagementServiceMethodDescriptorSupplier
      extends KeyManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    KeyManagementServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (KeyManagementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeyManagementServiceFileDescriptorSupplier())
              .addMethod(getCreateDEKMethod())
              .addMethod(getActivateDEKMethod())
              .addMethod(getReencryptDataMethod())
              .addMethod(getListDEKsMethod())
              .addMethod(getGetDEKMethod())
              .addMethod(getPatchDEKMethod())
              .addMethod(getDestroyDEKMethod())
              .addMethod(getGetBYOKSetupInfoMethod())
              .addMethod(getVerifyBYOKKeyMethod())
              .addMethod(getCreateMasterKeyMethod())
              .addMethod(getActivateMasterKeyMethod())
              .addMethod(getRewrapDEKsMethod())
              .addMethod(getListMasterKeysMethod())
              .addMethod(getGetMasterKeyMethod())
              .addMethod(getDestroyMasterKeyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
