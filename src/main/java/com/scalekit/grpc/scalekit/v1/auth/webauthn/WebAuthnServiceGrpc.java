package com.scalekit.grpc.scalekit.v1.auth.webauthn;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/auth/webauthn.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WebAuthnServiceGrpc {

  private WebAuthnServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.auth.webauthn.WebAuthnService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationRequest,
      com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationResponse> getBeginRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BeginRegistration",
      requestType = com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationRequest,
      com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationResponse> getBeginRegistrationMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationRequest, com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationResponse> getBeginRegistrationMethod;
    if ((getBeginRegistrationMethod = WebAuthnServiceGrpc.getBeginRegistrationMethod) == null) {
      synchronized (WebAuthnServiceGrpc.class) {
        if ((getBeginRegistrationMethod = WebAuthnServiceGrpc.getBeginRegistrationMethod) == null) {
          WebAuthnServiceGrpc.getBeginRegistrationMethod = getBeginRegistrationMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationRequest, com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BeginRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebAuthnServiceMethodDescriptorSupplier("BeginRegistration"))
              .build();
        }
      }
    }
    return getBeginRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationRequest,
      com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationResponse> getFinishRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinishRegistration",
      requestType = com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationRequest,
      com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationResponse> getFinishRegistrationMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationRequest, com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationResponse> getFinishRegistrationMethod;
    if ((getFinishRegistrationMethod = WebAuthnServiceGrpc.getFinishRegistrationMethod) == null) {
      synchronized (WebAuthnServiceGrpc.class) {
        if ((getFinishRegistrationMethod = WebAuthnServiceGrpc.getFinishRegistrationMethod) == null) {
          WebAuthnServiceGrpc.getFinishRegistrationMethod = getFinishRegistrationMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationRequest, com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinishRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebAuthnServiceMethodDescriptorSupplier("FinishRegistration"))
              .build();
        }
      }
    }
    return getFinishRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationRequest,
      com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationResponse> getBeginAuthenticationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BeginAuthentication",
      requestType = com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationRequest,
      com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationResponse> getBeginAuthenticationMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationRequest, com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationResponse> getBeginAuthenticationMethod;
    if ((getBeginAuthenticationMethod = WebAuthnServiceGrpc.getBeginAuthenticationMethod) == null) {
      synchronized (WebAuthnServiceGrpc.class) {
        if ((getBeginAuthenticationMethod = WebAuthnServiceGrpc.getBeginAuthenticationMethod) == null) {
          WebAuthnServiceGrpc.getBeginAuthenticationMethod = getBeginAuthenticationMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationRequest, com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BeginAuthentication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebAuthnServiceMethodDescriptorSupplier("BeginAuthentication"))
              .build();
        }
      }
    }
    return getBeginAuthenticationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationRequest,
      com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationResponse> getFinishAuthenticationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinishAuthentication",
      requestType = com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationRequest,
      com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationResponse> getFinishAuthenticationMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationRequest, com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationResponse> getFinishAuthenticationMethod;
    if ((getFinishAuthenticationMethod = WebAuthnServiceGrpc.getFinishAuthenticationMethod) == null) {
      synchronized (WebAuthnServiceGrpc.class) {
        if ((getFinishAuthenticationMethod = WebAuthnServiceGrpc.getFinishAuthenticationMethod) == null) {
          WebAuthnServiceGrpc.getFinishAuthenticationMethod = getFinishAuthenticationMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationRequest, com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinishAuthentication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebAuthnServiceMethodDescriptorSupplier("FinishAuthentication"))
              .build();
        }
      }
    }
    return getFinishAuthenticationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsRequest,
      com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsResponse> getListCredentialsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCredentials",
      requestType = com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsRequest,
      com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsResponse> getListCredentialsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsRequest, com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsResponse> getListCredentialsMethod;
    if ((getListCredentialsMethod = WebAuthnServiceGrpc.getListCredentialsMethod) == null) {
      synchronized (WebAuthnServiceGrpc.class) {
        if ((getListCredentialsMethod = WebAuthnServiceGrpc.getListCredentialsMethod) == null) {
          WebAuthnServiceGrpc.getListCredentialsMethod = getListCredentialsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsRequest, com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCredentials"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebAuthnServiceMethodDescriptorSupplier("ListCredentials"))
              .build();
        }
      }
    }
    return getListCredentialsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialRequest,
      com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialResponse> getDeleteCredentialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCredential",
      requestType = com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialRequest,
      com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialResponse> getDeleteCredentialMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialRequest, com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialResponse> getDeleteCredentialMethod;
    if ((getDeleteCredentialMethod = WebAuthnServiceGrpc.getDeleteCredentialMethod) == null) {
      synchronized (WebAuthnServiceGrpc.class) {
        if ((getDeleteCredentialMethod = WebAuthnServiceGrpc.getDeleteCredentialMethod) == null) {
          WebAuthnServiceGrpc.getDeleteCredentialMethod = getDeleteCredentialMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialRequest, com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCredential"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebAuthnServiceMethodDescriptorSupplier("DeleteCredential"))
              .build();
        }
      }
    }
    return getDeleteCredentialMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialRequest,
      com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialResponse> getUpdateCredentialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCredential",
      requestType = com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialRequest,
      com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialResponse> getUpdateCredentialMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialRequest, com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialResponse> getUpdateCredentialMethod;
    if ((getUpdateCredentialMethod = WebAuthnServiceGrpc.getUpdateCredentialMethod) == null) {
      synchronized (WebAuthnServiceGrpc.class) {
        if ((getUpdateCredentialMethod = WebAuthnServiceGrpc.getUpdateCredentialMethod) == null) {
          WebAuthnServiceGrpc.getUpdateCredentialMethod = getUpdateCredentialMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialRequest, com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCredential"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebAuthnServiceMethodDescriptorSupplier("UpdateCredential"))
              .build();
        }
      }
    }
    return getUpdateCredentialMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsRequest,
      com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsResponse> getGetRelatedOriginsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRelatedOrigins",
      requestType = com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsRequest,
      com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsResponse> getGetRelatedOriginsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsRequest, com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsResponse> getGetRelatedOriginsMethod;
    if ((getGetRelatedOriginsMethod = WebAuthnServiceGrpc.getGetRelatedOriginsMethod) == null) {
      synchronized (WebAuthnServiceGrpc.class) {
        if ((getGetRelatedOriginsMethod = WebAuthnServiceGrpc.getGetRelatedOriginsMethod) == null) {
          WebAuthnServiceGrpc.getGetRelatedOriginsMethod = getGetRelatedOriginsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsRequest, com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRelatedOrigins"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebAuthnServiceMethodDescriptorSupplier("GetRelatedOrigins"))
              .build();
        }
      }
    }
    return getGetRelatedOriginsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WebAuthnServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebAuthnServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebAuthnServiceStub>() {
        @java.lang.Override
        public WebAuthnServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebAuthnServiceStub(channel, callOptions);
        }
      };
    return WebAuthnServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WebAuthnServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebAuthnServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebAuthnServiceBlockingStub>() {
        @java.lang.Override
        public WebAuthnServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebAuthnServiceBlockingStub(channel, callOptions);
        }
      };
    return WebAuthnServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WebAuthnServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebAuthnServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebAuthnServiceFutureStub>() {
        @java.lang.Override
        public WebAuthnServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebAuthnServiceFutureStub(channel, callOptions);
        }
      };
    return WebAuthnServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void beginRegistration(com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBeginRegistrationMethod(), responseObserver);
    }

    /**
     */
    default void finishRegistration(com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFinishRegistrationMethod(), responseObserver);
    }

    /**
     */
    default void beginAuthentication(com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBeginAuthenticationMethod(), responseObserver);
    }

    /**
     */
    default void finishAuthentication(com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFinishAuthenticationMethod(), responseObserver);
    }

    /**
     */
    default void listCredentials(com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCredentialsMethod(), responseObserver);
    }

    /**
     */
    default void deleteCredential(com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCredentialMethod(), responseObserver);
    }

    /**
     */
    default void updateCredential(com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCredentialMethod(), responseObserver);
    }

    /**
     */
    default void getRelatedOrigins(com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRelatedOriginsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WebAuthnService.
   */
  public static abstract class WebAuthnServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WebAuthnServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WebAuthnService.
   */
  public static final class WebAuthnServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WebAuthnServiceStub> {
    private WebAuthnServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebAuthnServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebAuthnServiceStub(channel, callOptions);
    }

    /**
     */
    public void beginRegistration(com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBeginRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void finishRegistration(com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFinishRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void beginAuthentication(com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBeginAuthenticationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void finishAuthentication(com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFinishAuthenticationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCredentials(com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCredentialsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCredential(com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCredentialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCredential(com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCredentialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRelatedOrigins(com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRelatedOriginsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WebAuthnService.
   */
  public static final class WebAuthnServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WebAuthnServiceBlockingStub> {
    private WebAuthnServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebAuthnServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebAuthnServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationResponse beginRegistration(com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBeginRegistrationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationResponse finishRegistration(com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFinishRegistrationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationResponse beginAuthentication(com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBeginAuthenticationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationResponse finishAuthentication(com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFinishAuthenticationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsResponse listCredentials(com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCredentialsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialResponse deleteCredential(com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCredentialMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialResponse updateCredential(com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCredentialMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsResponse getRelatedOrigins(com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRelatedOriginsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WebAuthnService.
   */
  public static final class WebAuthnServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WebAuthnServiceFutureStub> {
    private WebAuthnServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebAuthnServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebAuthnServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationResponse> beginRegistration(
        com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBeginRegistrationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationResponse> finishRegistration(
        com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFinishRegistrationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationResponse> beginAuthentication(
        com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBeginAuthenticationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationResponse> finishAuthentication(
        com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFinishAuthenticationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsResponse> listCredentials(
        com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCredentialsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialResponse> deleteCredential(
        com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCredentialMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialResponse> updateCredential(
        com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCredentialMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsResponse> getRelatedOrigins(
        com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRelatedOriginsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BEGIN_REGISTRATION = 0;
  private static final int METHODID_FINISH_REGISTRATION = 1;
  private static final int METHODID_BEGIN_AUTHENTICATION = 2;
  private static final int METHODID_FINISH_AUTHENTICATION = 3;
  private static final int METHODID_LIST_CREDENTIALS = 4;
  private static final int METHODID_DELETE_CREDENTIAL = 5;
  private static final int METHODID_UPDATE_CREDENTIAL = 6;
  private static final int METHODID_GET_RELATED_ORIGINS = 7;

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
        case METHODID_BEGIN_REGISTRATION:
          serviceImpl.beginRegistration((com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationResponse>) responseObserver);
          break;
        case METHODID_FINISH_REGISTRATION:
          serviceImpl.finishRegistration((com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationResponse>) responseObserver);
          break;
        case METHODID_BEGIN_AUTHENTICATION:
          serviceImpl.beginAuthentication((com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationResponse>) responseObserver);
          break;
        case METHODID_FINISH_AUTHENTICATION:
          serviceImpl.finishAuthentication((com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationResponse>) responseObserver);
          break;
        case METHODID_LIST_CREDENTIALS:
          serviceImpl.listCredentials((com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsResponse>) responseObserver);
          break;
        case METHODID_DELETE_CREDENTIAL:
          serviceImpl.deleteCredential((com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CREDENTIAL:
          serviceImpl.updateCredential((com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialResponse>) responseObserver);
          break;
        case METHODID_GET_RELATED_ORIGINS:
          serviceImpl.getRelatedOrigins((com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsResponse>) responseObserver);
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
          getBeginRegistrationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationRequest,
              com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginRegistrationResponse>(
                service, METHODID_BEGIN_REGISTRATION)))
        .addMethod(
          getFinishRegistrationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationRequest,
              com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishRegistrationResponse>(
                service, METHODID_FINISH_REGISTRATION)))
        .addMethod(
          getBeginAuthenticationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationRequest,
              com.scalekit.grpc.scalekit.v1.auth.webauthn.BeginAuthenticationResponse>(
                service, METHODID_BEGIN_AUTHENTICATION)))
        .addMethod(
          getFinishAuthenticationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationRequest,
              com.scalekit.grpc.scalekit.v1.auth.webauthn.FinishAuthenticationResponse>(
                service, METHODID_FINISH_AUTHENTICATION)))
        .addMethod(
          getListCredentialsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsRequest,
              com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsResponse>(
                service, METHODID_LIST_CREDENTIALS)))
        .addMethod(
          getDeleteCredentialMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialRequest,
              com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialResponse>(
                service, METHODID_DELETE_CREDENTIAL)))
        .addMethod(
          getUpdateCredentialMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialRequest,
              com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialResponse>(
                service, METHODID_UPDATE_CREDENTIAL)))
        .addMethod(
          getGetRelatedOriginsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsRequest,
              com.scalekit.grpc.scalekit.v1.auth.webauthn.GetRelatedOriginsResponse>(
                service, METHODID_GET_RELATED_ORIGINS)))
        .build();
  }

  private static abstract class WebAuthnServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WebAuthnServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.auth.webauthn.WebauthnProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WebAuthnService");
    }
  }

  private static final class WebAuthnServiceFileDescriptorSupplier
      extends WebAuthnServiceBaseDescriptorSupplier {
    WebAuthnServiceFileDescriptorSupplier() {}
  }

  private static final class WebAuthnServiceMethodDescriptorSupplier
      extends WebAuthnServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WebAuthnServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WebAuthnServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WebAuthnServiceFileDescriptorSupplier())
              .addMethod(getBeginRegistrationMethod())
              .addMethod(getFinishRegistrationMethod())
              .addMethod(getBeginAuthenticationMethod())
              .addMethod(getFinishAuthenticationMethod())
              .addMethod(getListCredentialsMethod())
              .addMethod(getDeleteCredentialMethod())
              .addMethod(getUpdateCredentialMethod())
              .addMethod(getGetRelatedOriginsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
