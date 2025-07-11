package com.scalekit.grpc.scalekit.v1.webhooks;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/webhooks/webhooks.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WebhookServiceGrpc {

  private WebhookServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.webhooks.WebhookService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLRequest,
      com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLResponse> getGetPortalURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPortalURL",
      requestType = com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLRequest,
      com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLResponse> getGetPortalURLMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLRequest, com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLResponse> getGetPortalURLMethod;
    if ((getGetPortalURLMethod = WebhookServiceGrpc.getGetPortalURLMethod) == null) {
      synchronized (WebhookServiceGrpc.class) {
        if ((getGetPortalURLMethod = WebhookServiceGrpc.getGetPortalURLMethod) == null) {
          WebhookServiceGrpc.getGetPortalURLMethod = getGetPortalURLMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLRequest, com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPortalURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebhookServiceMethodDescriptorSupplier("GetPortalURL"))
              .build();
        }
      }
    }
    return getGetPortalURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.webhooks.WebhookWrapperRequest,
      com.google.protobuf.Struct> getWebhookWrapperMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WebhookWrapper",
      requestType = com.scalekit.grpc.scalekit.v1.webhooks.WebhookWrapperRequest.class,
      responseType = com.google.protobuf.Struct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.webhooks.WebhookWrapperRequest,
      com.google.protobuf.Struct> getWebhookWrapperMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.webhooks.WebhookWrapperRequest, com.google.protobuf.Struct> getWebhookWrapperMethod;
    if ((getWebhookWrapperMethod = WebhookServiceGrpc.getWebhookWrapperMethod) == null) {
      synchronized (WebhookServiceGrpc.class) {
        if ((getWebhookWrapperMethod = WebhookServiceGrpc.getWebhookWrapperMethod) == null) {
          WebhookServiceGrpc.getWebhookWrapperMethod = getWebhookWrapperMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.webhooks.WebhookWrapperRequest, com.google.protobuf.Struct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WebhookWrapper"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.webhooks.WebhookWrapperRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Struct.getDefaultInstance()))
              .setSchemaDescriptor(new WebhookServiceMethodDescriptorSupplier("WebhookWrapper"))
              .build();
        }
      }
    }
    return getWebhookWrapperMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventRequest,
      com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventResponse> getSendTestEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendTestEvent",
      requestType = com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventRequest,
      com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventResponse> getSendTestEventMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventRequest, com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventResponse> getSendTestEventMethod;
    if ((getSendTestEventMethod = WebhookServiceGrpc.getSendTestEventMethod) == null) {
      synchronized (WebhookServiceGrpc.class) {
        if ((getSendTestEventMethod = WebhookServiceGrpc.getSendTestEventMethod) == null) {
          WebhookServiceGrpc.getSendTestEventMethod = getSendTestEventMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventRequest, com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendTestEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebhookServiceMethodDescriptorSupplier("SendTestEvent"))
              .build();
        }
      }
    }
    return getSendTestEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WebhookServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebhookServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebhookServiceStub>() {
        @java.lang.Override
        public WebhookServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebhookServiceStub(channel, callOptions);
        }
      };
    return WebhookServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WebhookServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebhookServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebhookServiceBlockingStub>() {
        @java.lang.Override
        public WebhookServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebhookServiceBlockingStub(channel, callOptions);
        }
      };
    return WebhookServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WebhookServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebhookServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebhookServiceFutureStub>() {
        @java.lang.Override
        public WebhookServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebhookServiceFutureStub(channel, callOptions);
        }
      };
    return WebhookServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getPortalURL(com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPortalURLMethod(), responseObserver);
    }

    /**
     */
    default void webhookWrapper(com.scalekit.grpc.scalekit.v1.webhooks.WebhookWrapperRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Struct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWebhookWrapperMethod(), responseObserver);
    }

    /**
     */
    default void sendTestEvent(com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendTestEventMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WebhookService.
   */
  public static abstract class WebhookServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WebhookServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WebhookService.
   */
  public static final class WebhookServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WebhookServiceStub> {
    private WebhookServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebhookServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebhookServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPortalURL(com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPortalURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void webhookWrapper(com.scalekit.grpc.scalekit.v1.webhooks.WebhookWrapperRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Struct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWebhookWrapperMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendTestEvent(com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendTestEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WebhookService.
   */
  public static final class WebhookServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WebhookServiceBlockingStub> {
    private WebhookServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebhookServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebhookServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLResponse getPortalURL(com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPortalURLMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Struct webhookWrapper(com.scalekit.grpc.scalekit.v1.webhooks.WebhookWrapperRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWebhookWrapperMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventResponse sendTestEvent(com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendTestEventMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WebhookService.
   */
  public static final class WebhookServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WebhookServiceFutureStub> {
    private WebhookServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebhookServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebhookServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLResponse> getPortalURL(
        com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPortalURLMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Struct> webhookWrapper(
        com.scalekit.grpc.scalekit.v1.webhooks.WebhookWrapperRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWebhookWrapperMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventResponse> sendTestEvent(
        com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendTestEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PORTAL_URL = 0;
  private static final int METHODID_WEBHOOK_WRAPPER = 1;
  private static final int METHODID_SEND_TEST_EVENT = 2;

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
        case METHODID_GET_PORTAL_URL:
          serviceImpl.getPortalURL((com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLResponse>) responseObserver);
          break;
        case METHODID_WEBHOOK_WRAPPER:
          serviceImpl.webhookWrapper((com.scalekit.grpc.scalekit.v1.webhooks.WebhookWrapperRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Struct>) responseObserver);
          break;
        case METHODID_SEND_TEST_EVENT:
          serviceImpl.sendTestEvent((com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventResponse>) responseObserver);
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
          getGetPortalURLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLRequest,
              com.scalekit.grpc.scalekit.v1.webhooks.GetPortalURLResponse>(
                service, METHODID_GET_PORTAL_URL)))
        .addMethod(
          getWebhookWrapperMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.webhooks.WebhookWrapperRequest,
              com.google.protobuf.Struct>(
                service, METHODID_WEBHOOK_WRAPPER)))
        .addMethod(
          getSendTestEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventRequest,
              com.scalekit.grpc.scalekit.v1.webhooks.SendTestEventResponse>(
                service, METHODID_SEND_TEST_EVENT)))
        .build();
  }

  private static abstract class WebhookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WebhookServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.webhooks.WebhooksProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WebhookService");
    }
  }

  private static final class WebhookServiceFileDescriptorSupplier
      extends WebhookServiceBaseDescriptorSupplier {
    WebhookServiceFileDescriptorSupplier() {}
  }

  private static final class WebhookServiceMethodDescriptorSupplier
      extends WebhookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WebhookServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WebhookServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WebhookServiceFileDescriptorSupplier())
              .addMethod(getGetPortalURLMethod())
              .addMethod(getWebhookWrapperMethod())
              .addMethod(getSendTestEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
