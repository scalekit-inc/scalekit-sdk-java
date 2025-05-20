package com.scalekit.grpc.scalekit.v1.events;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/events/events.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EventsServiceGrpc {

  private EventsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.events.EventsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.events.ListEventsRequest,
      com.scalekit.grpc.scalekit.v1.events.ListEventsResponse> getListEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEvents",
      requestType = com.scalekit.grpc.scalekit.v1.events.ListEventsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.events.ListEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.events.ListEventsRequest,
      com.scalekit.grpc.scalekit.v1.events.ListEventsResponse> getListEventsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.events.ListEventsRequest, com.scalekit.grpc.scalekit.v1.events.ListEventsResponse> getListEventsMethod;
    if ((getListEventsMethod = EventsServiceGrpc.getListEventsMethod) == null) {
      synchronized (EventsServiceGrpc.class) {
        if ((getListEventsMethod = EventsServiceGrpc.getListEventsMethod) == null) {
          EventsServiceGrpc.getListEventsMethod = getListEventsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.events.ListEventsRequest, com.scalekit.grpc.scalekit.v1.events.ListEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.events.ListEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.events.ListEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventsServiceMethodDescriptorSupplier("ListEvents"))
              .build();
        }
      }
    }
    return getListEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.events.SendCustomEventRequest,
      com.scalekit.grpc.scalekit.v1.events.SendCustomEventResponse> getSendCustomEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendCustomEvent",
      requestType = com.scalekit.grpc.scalekit.v1.events.SendCustomEventRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.events.SendCustomEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.events.SendCustomEventRequest,
      com.scalekit.grpc.scalekit.v1.events.SendCustomEventResponse> getSendCustomEventMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.events.SendCustomEventRequest, com.scalekit.grpc.scalekit.v1.events.SendCustomEventResponse> getSendCustomEventMethod;
    if ((getSendCustomEventMethod = EventsServiceGrpc.getSendCustomEventMethod) == null) {
      synchronized (EventsServiceGrpc.class) {
        if ((getSendCustomEventMethod = EventsServiceGrpc.getSendCustomEventMethod) == null) {
          EventsServiceGrpc.getSendCustomEventMethod = getSendCustomEventMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.events.SendCustomEventRequest, com.scalekit.grpc.scalekit.v1.events.SendCustomEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendCustomEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.events.SendCustomEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.events.SendCustomEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventsServiceMethodDescriptorSupplier("SendCustomEvent"))
              .build();
        }
      }
    }
    return getSendCustomEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventsServiceStub>() {
        @java.lang.Override
        public EventsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventsServiceStub(channel, callOptions);
        }
      };
    return EventsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventsServiceBlockingStub>() {
        @java.lang.Override
        public EventsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventsServiceBlockingStub(channel, callOptions);
        }
      };
    return EventsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventsServiceFutureStub>() {
        @java.lang.Override
        public EventsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventsServiceFutureStub(channel, callOptions);
        }
      };
    return EventsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void listEvents(com.scalekit.grpc.scalekit.v1.events.ListEventsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.events.ListEventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEventsMethod(), responseObserver);
    }

    /**
     */
    default void sendCustomEvent(com.scalekit.grpc.scalekit.v1.events.SendCustomEventRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.events.SendCustomEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendCustomEventMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EventsService.
   */
  public static abstract class EventsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EventsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EventsService.
   */
  public static final class EventsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EventsServiceStub> {
    private EventsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventsServiceStub(channel, callOptions);
    }

    /**
     */
    public void listEvents(com.scalekit.grpc.scalekit.v1.events.ListEventsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.events.ListEventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendCustomEvent(com.scalekit.grpc.scalekit.v1.events.SendCustomEventRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.events.SendCustomEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendCustomEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EventsService.
   */
  public static final class EventsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EventsServiceBlockingStub> {
    private EventsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.events.ListEventsResponse listEvents(com.scalekit.grpc.scalekit.v1.events.ListEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.events.SendCustomEventResponse sendCustomEvent(com.scalekit.grpc.scalekit.v1.events.SendCustomEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendCustomEventMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EventsService.
   */
  public static final class EventsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EventsServiceFutureStub> {
    private EventsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.events.ListEventsResponse> listEvents(
        com.scalekit.grpc.scalekit.v1.events.ListEventsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEventsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.events.SendCustomEventResponse> sendCustomEvent(
        com.scalekit.grpc.scalekit.v1.events.SendCustomEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendCustomEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_EVENTS = 0;
  private static final int METHODID_SEND_CUSTOM_EVENT = 1;

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
        case METHODID_LIST_EVENTS:
          serviceImpl.listEvents((com.scalekit.grpc.scalekit.v1.events.ListEventsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.events.ListEventsResponse>) responseObserver);
          break;
        case METHODID_SEND_CUSTOM_EVENT:
          serviceImpl.sendCustomEvent((com.scalekit.grpc.scalekit.v1.events.SendCustomEventRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.events.SendCustomEventResponse>) responseObserver);
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
          getListEventsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.events.ListEventsRequest,
              com.scalekit.grpc.scalekit.v1.events.ListEventsResponse>(
                service, METHODID_LIST_EVENTS)))
        .addMethod(
          getSendCustomEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.events.SendCustomEventRequest,
              com.scalekit.grpc.scalekit.v1.events.SendCustomEventResponse>(
                service, METHODID_SEND_CUSTOM_EVENT)))
        .build();
  }

  private static abstract class EventsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.events.EventsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventsService");
    }
  }

  private static final class EventsServiceFileDescriptorSupplier
      extends EventsServiceBaseDescriptorSupplier {
    EventsServiceFileDescriptorSupplier() {}
  }

  private static final class EventsServiceMethodDescriptorSupplier
      extends EventsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EventsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EventsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventsServiceFileDescriptorSupplier())
              .addMethod(getListEventsMethod())
              .addMethod(getSendCustomEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
