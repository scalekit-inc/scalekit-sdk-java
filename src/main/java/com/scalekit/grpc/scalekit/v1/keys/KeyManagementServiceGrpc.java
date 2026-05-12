package com.scalekit.grpc.scalekit.v1.keys;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * KeyManagementService provides operations for managing encryption keys
 * including Data Encryption Keys (DEKs) and master key rotation.
 * </pre>
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

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.RotateDEKRequest,
      com.scalekit.grpc.scalekit.v1.keys.RotateDEKResponse> getRotateDEKMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RotateDEK",
      requestType = com.scalekit.grpc.scalekit.v1.keys.RotateDEKRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.keys.RotateDEKResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.RotateDEKRequest,
      com.scalekit.grpc.scalekit.v1.keys.RotateDEKResponse> getRotateDEKMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.RotateDEKRequest, com.scalekit.grpc.scalekit.v1.keys.RotateDEKResponse> getRotateDEKMethod;
    if ((getRotateDEKMethod = KeyManagementServiceGrpc.getRotateDEKMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getRotateDEKMethod = KeyManagementServiceGrpc.getRotateDEKMethod) == null) {
          KeyManagementServiceGrpc.getRotateDEKMethod = getRotateDEKMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.RotateDEKRequest, com.scalekit.grpc.scalekit.v1.keys.RotateDEKResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RotateDEK"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.RotateDEKRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.RotateDEKResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("RotateDEK"))
              .build();
        }
      }
    }
    return getRotateDEKMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.DeleteDEKRequest,
      com.google.protobuf.Empty> getDeleteDEKMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDEK",
      requestType = com.scalekit.grpc.scalekit.v1.keys.DeleteDEKRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.DeleteDEKRequest,
      com.google.protobuf.Empty> getDeleteDEKMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.DeleteDEKRequest, com.google.protobuf.Empty> getDeleteDEKMethod;
    if ((getDeleteDEKMethod = KeyManagementServiceGrpc.getDeleteDEKMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getDeleteDEKMethod = KeyManagementServiceGrpc.getDeleteDEKMethod) == null) {
          KeyManagementServiceGrpc.getDeleteDEKMethod = getDeleteDEKMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.DeleteDEKRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDEK"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.DeleteDEKRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("DeleteDEK"))
              .build();
        }
      }
    }
    return getDeleteDEKMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyRequest,
      com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyResponse> getRotateMasterKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RotateMasterKey",
      requestType = com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyRequest,
      com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyResponse> getRotateMasterKeyMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyRequest, com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyResponse> getRotateMasterKeyMethod;
    if ((getRotateMasterKeyMethod = KeyManagementServiceGrpc.getRotateMasterKeyMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getRotateMasterKeyMethod = KeyManagementServiceGrpc.getRotateMasterKeyMethod) == null) {
          KeyManagementServiceGrpc.getRotateMasterKeyMethod = getRotateMasterKeyMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyRequest, com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RotateMasterKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("RotateMasterKey"))
              .build();
        }
      }
    }
    return getRotateMasterKeyMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKRequest,
      com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKResponse> getSetActiveDEKMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetActiveDEK",
      requestType = com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKRequest,
      com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKResponse> getSetActiveDEKMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKRequest, com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKResponse> getSetActiveDEKMethod;
    if ((getSetActiveDEKMethod = KeyManagementServiceGrpc.getSetActiveDEKMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getSetActiveDEKMethod = KeyManagementServiceGrpc.getSetActiveDEKMethod) == null) {
          KeyManagementServiceGrpc.getSetActiveDEKMethod = getSetActiveDEKMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKRequest, com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetActiveDEK"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("SetActiveDEK"))
              .build();
        }
      }
    }
    return getSetActiveDEKMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyRequest,
      com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyResponse> getSetActiveMasterKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetActiveMasterKey",
      requestType = com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyRequest,
      com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyResponse> getSetActiveMasterKeyMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyRequest, com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyResponse> getSetActiveMasterKeyMethod;
    if ((getSetActiveMasterKeyMethod = KeyManagementServiceGrpc.getSetActiveMasterKeyMethod) == null) {
      synchronized (KeyManagementServiceGrpc.class) {
        if ((getSetActiveMasterKeyMethod = KeyManagementServiceGrpc.getSetActiveMasterKeyMethod) == null) {
          KeyManagementServiceGrpc.getSetActiveMasterKeyMethod = getSetActiveMasterKeyMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyRequest, com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetActiveMasterKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagementServiceMethodDescriptorSupplier("SetActiveMasterKey"))
              .build();
        }
      }
    }
    return getSetActiveMasterKeyMethod;
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
   * <pre>
   * KeyManagementService provides operations for managing encryption keys
   * including Data Encryption Keys (DEKs) and master key rotation.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateDEK creates a new Data Encryption Key (DEK) for an environment.
     * If a DEK already exists, this will create a new version.
     * </pre>
     */
    default void createDEK(com.scalekit.grpc.scalekit.v1.keys.CreateDEKRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.CreateDEKResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDEKMethod(), responseObserver);
    }

    /**
     * <pre>
     * RotateDEK creates a new DEK version for an environment.
     * Re-encrypts existing data (oidc_client_secrets, connection client_secrets) and deprecates old DEK versions.
     * </pre>
     */
    default void rotateDEK(com.scalekit.grpc.scalekit.v1.keys.RotateDEKRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.RotateDEKResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRotateDEKMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListDEKs lists DEKs for an environment with pagination.
     * </pre>
     */
    default void listDEKs(com.scalekit.grpc.scalekit.v1.keys.ListDEKsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.ListDEKsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDEKsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteDEK deprecates or permanently deletes a DEK version.
     * Deprecated DEKs can still be used for decryption but not for encryption.
     * </pre>
     */
    default void deleteDEK(com.scalekit.grpc.scalekit.v1.keys.DeleteDEKRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDEKMethod(), responseObserver);
    }

    /**
     * <pre>
     * RotateMasterKey rotates the master key and rewraps all DEKs.
     * This operation is idempotent and supports zero-downtime rotation.
     * </pre>
     */
    default void rotateMasterKey(com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRotateMasterKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateMasterKey creates a new master key version (in a non-active state).
     * </pre>
     */
    default void createMasterKey(com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMasterKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetActiveDEK sets a specific DEK version as active for an environment.
     * </pre>
     */
    default void setActiveDEK(com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetActiveDEKMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetActiveMasterKey sets a specific master key version as active.
     * </pre>
     */
    default void setActiveMasterKey(com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetActiveMasterKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * DestroyDEK permanently deletes a DEK version.
     * WARNING: This operation is irreversible and will make data encrypted with this DEK unrecoverable.
     * </pre>
     */
    default void destroyDEK(com.scalekit.grpc.scalekit.v1.keys.DestroyDEKRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDestroyDEKMethod(), responseObserver);
    }

    /**
     * <pre>
     * DestroyMasterKey permanently deletes a master key version.
     * WARNING: This operation is irreversible and will make DEKs wrapped with this master key unrecoverable.
     * </pre>
     */
    default void destroyMasterKey(com.scalekit.grpc.scalekit.v1.keys.DestroyMasterKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDestroyMasterKeyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service KeyManagementService.
   * <pre>
   * KeyManagementService provides operations for managing encryption keys
   * including Data Encryption Keys (DEKs) and master key rotation.
   * </pre>
   */
  public static abstract class KeyManagementServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return KeyManagementServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service KeyManagementService.
   * <pre>
   * KeyManagementService provides operations for managing encryption keys
   * including Data Encryption Keys (DEKs) and master key rotation.
   * </pre>
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
     * CreateDEK creates a new Data Encryption Key (DEK) for an environment.
     * If a DEK already exists, this will create a new version.
     * </pre>
     */
    public void createDEK(com.scalekit.grpc.scalekit.v1.keys.CreateDEKRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.CreateDEKResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDEKMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RotateDEK creates a new DEK version for an environment.
     * Re-encrypts existing data (oidc_client_secrets, connection client_secrets) and deprecates old DEK versions.
     * </pre>
     */
    public void rotateDEK(com.scalekit.grpc.scalekit.v1.keys.RotateDEKRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.RotateDEKResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRotateDEKMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListDEKs lists DEKs for an environment with pagination.
     * </pre>
     */
    public void listDEKs(com.scalekit.grpc.scalekit.v1.keys.ListDEKsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.ListDEKsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDEKsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteDEK deprecates or permanently deletes a DEK version.
     * Deprecated DEKs can still be used for decryption but not for encryption.
     * </pre>
     */
    public void deleteDEK(com.scalekit.grpc.scalekit.v1.keys.DeleteDEKRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDEKMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RotateMasterKey rotates the master key and rewraps all DEKs.
     * This operation is idempotent and supports zero-downtime rotation.
     * </pre>
     */
    public void rotateMasterKey(com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRotateMasterKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateMasterKey creates a new master key version (in a non-active state).
     * </pre>
     */
    public void createMasterKey(com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMasterKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetActiveDEK sets a specific DEK version as active for an environment.
     * </pre>
     */
    public void setActiveDEK(com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetActiveDEKMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetActiveMasterKey sets a specific master key version as active.
     * </pre>
     */
    public void setActiveMasterKey(com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetActiveMasterKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DestroyDEK permanently deletes a DEK version.
     * WARNING: This operation is irreversible and will make data encrypted with this DEK unrecoverable.
     * </pre>
     */
    public void destroyDEK(com.scalekit.grpc.scalekit.v1.keys.DestroyDEKRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDestroyDEKMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DestroyMasterKey permanently deletes a master key version.
     * WARNING: This operation is irreversible and will make DEKs wrapped with this master key unrecoverable.
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
   * <pre>
   * KeyManagementService provides operations for managing encryption keys
   * including Data Encryption Keys (DEKs) and master key rotation.
   * </pre>
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
     * CreateDEK creates a new Data Encryption Key (DEK) for an environment.
     * If a DEK already exists, this will create a new version.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.CreateDEKResponse createDEK(com.scalekit.grpc.scalekit.v1.keys.CreateDEKRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDEKMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RotateDEK creates a new DEK version for an environment.
     * Re-encrypts existing data (oidc_client_secrets, connection client_secrets) and deprecates old DEK versions.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.RotateDEKResponse rotateDEK(com.scalekit.grpc.scalekit.v1.keys.RotateDEKRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRotateDEKMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListDEKs lists DEKs for an environment with pagination.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.ListDEKsResponse listDEKs(com.scalekit.grpc.scalekit.v1.keys.ListDEKsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDEKsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteDEK deprecates or permanently deletes a DEK version.
     * Deprecated DEKs can still be used for decryption but not for encryption.
     * </pre>
     */
    public com.google.protobuf.Empty deleteDEK(com.scalekit.grpc.scalekit.v1.keys.DeleteDEKRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDEKMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RotateMasterKey rotates the master key and rewraps all DEKs.
     * This operation is idempotent and supports zero-downtime rotation.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyResponse rotateMasterKey(com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRotateMasterKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateMasterKey creates a new master key version (in a non-active state).
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyResponse createMasterKey(com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMasterKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetActiveDEK sets a specific DEK version as active for an environment.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKResponse setActiveDEK(com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetActiveDEKMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetActiveMasterKey sets a specific master key version as active.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyResponse setActiveMasterKey(com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetActiveMasterKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DestroyDEK permanently deletes a DEK version.
     * WARNING: This operation is irreversible and will make data encrypted with this DEK unrecoverable.
     * </pre>
     */
    public com.google.protobuf.Empty destroyDEK(com.scalekit.grpc.scalekit.v1.keys.DestroyDEKRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDestroyDEKMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DestroyMasterKey permanently deletes a master key version.
     * WARNING: This operation is irreversible and will make DEKs wrapped with this master key unrecoverable.
     * </pre>
     */
    public com.google.protobuf.Empty destroyMasterKey(com.scalekit.grpc.scalekit.v1.keys.DestroyMasterKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDestroyMasterKeyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service KeyManagementService.
   * <pre>
   * KeyManagementService provides operations for managing encryption keys
   * including Data Encryption Keys (DEKs) and master key rotation.
   * </pre>
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
     * CreateDEK creates a new Data Encryption Key (DEK) for an environment.
     * If a DEK already exists, this will create a new version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.CreateDEKResponse> createDEK(
        com.scalekit.grpc.scalekit.v1.keys.CreateDEKRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDEKMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RotateDEK creates a new DEK version for an environment.
     * Re-encrypts existing data (oidc_client_secrets, connection client_secrets) and deprecates old DEK versions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.RotateDEKResponse> rotateDEK(
        com.scalekit.grpc.scalekit.v1.keys.RotateDEKRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRotateDEKMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListDEKs lists DEKs for an environment with pagination.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.ListDEKsResponse> listDEKs(
        com.scalekit.grpc.scalekit.v1.keys.ListDEKsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDEKsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteDEK deprecates or permanently deletes a DEK version.
     * Deprecated DEKs can still be used for decryption but not for encryption.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDEK(
        com.scalekit.grpc.scalekit.v1.keys.DeleteDEKRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDEKMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RotateMasterKey rotates the master key and rewraps all DEKs.
     * This operation is idempotent and supports zero-downtime rotation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyResponse> rotateMasterKey(
        com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRotateMasterKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateMasterKey creates a new master key version (in a non-active state).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyResponse> createMasterKey(
        com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMasterKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetActiveDEK sets a specific DEK version as active for an environment.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKResponse> setActiveDEK(
        com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetActiveDEKMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetActiveMasterKey sets a specific master key version as active.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyResponse> setActiveMasterKey(
        com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetActiveMasterKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DestroyDEK permanently deletes a DEK version.
     * WARNING: This operation is irreversible and will make data encrypted with this DEK unrecoverable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> destroyDEK(
        com.scalekit.grpc.scalekit.v1.keys.DestroyDEKRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDestroyDEKMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DestroyMasterKey permanently deletes a master key version.
     * WARNING: This operation is irreversible and will make DEKs wrapped with this master key unrecoverable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> destroyMasterKey(
        com.scalekit.grpc.scalekit.v1.keys.DestroyMasterKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDestroyMasterKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DEK = 0;
  private static final int METHODID_ROTATE_DEK = 1;
  private static final int METHODID_LIST_DEKS = 2;
  private static final int METHODID_DELETE_DEK = 3;
  private static final int METHODID_ROTATE_MASTER_KEY = 4;
  private static final int METHODID_CREATE_MASTER_KEY = 5;
  private static final int METHODID_SET_ACTIVE_DEK = 6;
  private static final int METHODID_SET_ACTIVE_MASTER_KEY = 7;
  private static final int METHODID_DESTROY_DEK = 8;
  private static final int METHODID_DESTROY_MASTER_KEY = 9;

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
        case METHODID_ROTATE_DEK:
          serviceImpl.rotateDEK((com.scalekit.grpc.scalekit.v1.keys.RotateDEKRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.RotateDEKResponse>) responseObserver);
          break;
        case METHODID_LIST_DEKS:
          serviceImpl.listDEKs((com.scalekit.grpc.scalekit.v1.keys.ListDEKsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.ListDEKsResponse>) responseObserver);
          break;
        case METHODID_DELETE_DEK:
          serviceImpl.deleteDEK((com.scalekit.grpc.scalekit.v1.keys.DeleteDEKRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ROTATE_MASTER_KEY:
          serviceImpl.rotateMasterKey((com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyResponse>) responseObserver);
          break;
        case METHODID_CREATE_MASTER_KEY:
          serviceImpl.createMasterKey((com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyResponse>) responseObserver);
          break;
        case METHODID_SET_ACTIVE_DEK:
          serviceImpl.setActiveDEK((com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKResponse>) responseObserver);
          break;
        case METHODID_SET_ACTIVE_MASTER_KEY:
          serviceImpl.setActiveMasterKey((com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyResponse>) responseObserver);
          break;
        case METHODID_DESTROY_DEK:
          serviceImpl.destroyDEK((com.scalekit.grpc.scalekit.v1.keys.DestroyDEKRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
          getRotateDEKMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.RotateDEKRequest,
              com.scalekit.grpc.scalekit.v1.keys.RotateDEKResponse>(
                service, METHODID_ROTATE_DEK)))
        .addMethod(
          getListDEKsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.ListDEKsRequest,
              com.scalekit.grpc.scalekit.v1.keys.ListDEKsResponse>(
                service, METHODID_LIST_DEKS)))
        .addMethod(
          getDeleteDEKMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.DeleteDEKRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_DEK)))
        .addMethod(
          getRotateMasterKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyRequest,
              com.scalekit.grpc.scalekit.v1.keys.RotateMasterKeyResponse>(
                service, METHODID_ROTATE_MASTER_KEY)))
        .addMethod(
          getCreateMasterKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyRequest,
              com.scalekit.grpc.scalekit.v1.keys.CreateMasterKeyResponse>(
                service, METHODID_CREATE_MASTER_KEY)))
        .addMethod(
          getSetActiveDEKMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKRequest,
              com.scalekit.grpc.scalekit.v1.keys.SetActiveDEKResponse>(
                service, METHODID_SET_ACTIVE_DEK)))
        .addMethod(
          getSetActiveMasterKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyRequest,
              com.scalekit.grpc.scalekit.v1.keys.SetActiveMasterKeyResponse>(
                service, METHODID_SET_ACTIVE_MASTER_KEY)))
        .addMethod(
          getDestroyDEKMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.keys.DestroyDEKRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DESTROY_DEK)))
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
              .addMethod(getRotateDEKMethod())
              .addMethod(getListDEKsMethod())
              .addMethod(getDeleteDEKMethod())
              .addMethod(getRotateMasterKeyMethod())
              .addMethod(getCreateMasterKeyMethod())
              .addMethod(getSetActiveDEKMethod())
              .addMethod(getSetActiveMasterKeyMethod())
              .addMethod(getDestroyDEKMethod())
              .addMethod(getDestroyMasterKeyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
