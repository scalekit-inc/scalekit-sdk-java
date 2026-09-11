package com.scalekit.grpc.scalekit.v1.logstreams;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * LogStreamService configures SIEM log-streaming destinations for an
 * environment. Each destination is delivered through Scalekit's log-streaming
 * proxy, which fans events out to the customer's SIEM.
 * Credentials supplied on create/update are write-only: they are stored on the
 * delivery infrastructure and never returned by any RPC in this service. Reads
 * return only a masked hint.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/logstreams/logstreams.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LogStreamServiceGrpc {

  private LogStreamServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.logstreams.LogStreamService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsRequest,
      com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsResponse> getListLogStreamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLogStreams",
      requestType = com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsRequest,
      com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsResponse> getListLogStreamsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsRequest, com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsResponse> getListLogStreamsMethod;
    if ((getListLogStreamsMethod = LogStreamServiceGrpc.getListLogStreamsMethod) == null) {
      synchronized (LogStreamServiceGrpc.class) {
        if ((getListLogStreamsMethod = LogStreamServiceGrpc.getListLogStreamsMethod) == null) {
          LogStreamServiceGrpc.getListLogStreamsMethod = getListLogStreamsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsRequest, com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLogStreams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogStreamServiceMethodDescriptorSupplier("ListLogStreams"))
              .build();
        }
      }
    }
    return getListLogStreamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamRequest,
      com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamResponse> getGetLogStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLogStream",
      requestType = com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamRequest,
      com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamResponse> getGetLogStreamMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamRequest, com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamResponse> getGetLogStreamMethod;
    if ((getGetLogStreamMethod = LogStreamServiceGrpc.getGetLogStreamMethod) == null) {
      synchronized (LogStreamServiceGrpc.class) {
        if ((getGetLogStreamMethod = LogStreamServiceGrpc.getGetLogStreamMethod) == null) {
          LogStreamServiceGrpc.getGetLogStreamMethod = getGetLogStreamMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamRequest, com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLogStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogStreamServiceMethodDescriptorSupplier("GetLogStream"))
              .build();
        }
      }
    }
    return getGetLogStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamRequest,
      com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamResponse> getCreateLogStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateLogStream",
      requestType = com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamRequest,
      com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamResponse> getCreateLogStreamMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamRequest, com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamResponse> getCreateLogStreamMethod;
    if ((getCreateLogStreamMethod = LogStreamServiceGrpc.getCreateLogStreamMethod) == null) {
      synchronized (LogStreamServiceGrpc.class) {
        if ((getCreateLogStreamMethod = LogStreamServiceGrpc.getCreateLogStreamMethod) == null) {
          LogStreamServiceGrpc.getCreateLogStreamMethod = getCreateLogStreamMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamRequest, com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateLogStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogStreamServiceMethodDescriptorSupplier("CreateLogStream"))
              .build();
        }
      }
    }
    return getCreateLogStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamRequest,
      com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamResponse> getUpdateLogStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLogStream",
      requestType = com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamRequest,
      com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamResponse> getUpdateLogStreamMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamRequest, com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamResponse> getUpdateLogStreamMethod;
    if ((getUpdateLogStreamMethod = LogStreamServiceGrpc.getUpdateLogStreamMethod) == null) {
      synchronized (LogStreamServiceGrpc.class) {
        if ((getUpdateLogStreamMethod = LogStreamServiceGrpc.getUpdateLogStreamMethod) == null) {
          LogStreamServiceGrpc.getUpdateLogStreamMethod = getUpdateLogStreamMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamRequest, com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateLogStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogStreamServiceMethodDescriptorSupplier("UpdateLogStream"))
              .build();
        }
      }
    }
    return getUpdateLogStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.DeleteLogStreamRequest,
      com.google.protobuf.Empty> getDeleteLogStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLogStream",
      requestType = com.scalekit.grpc.scalekit.v1.logstreams.DeleteLogStreamRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.DeleteLogStreamRequest,
      com.google.protobuf.Empty> getDeleteLogStreamMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.DeleteLogStreamRequest, com.google.protobuf.Empty> getDeleteLogStreamMethod;
    if ((getDeleteLogStreamMethod = LogStreamServiceGrpc.getDeleteLogStreamMethod) == null) {
      synchronized (LogStreamServiceGrpc.class) {
        if ((getDeleteLogStreamMethod = LogStreamServiceGrpc.getDeleteLogStreamMethod) == null) {
          LogStreamServiceGrpc.getDeleteLogStreamMethod = getDeleteLogStreamMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.logstreams.DeleteLogStreamRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLogStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.logstreams.DeleteLogStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LogStreamServiceMethodDescriptorSupplier("DeleteLogStream"))
              .build();
        }
      }
    }
    return getDeleteLogStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionRequest,
      com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionResponse> getTestLogStreamConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestLogStreamConnection",
      requestType = com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionRequest,
      com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionResponse> getTestLogStreamConnectionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionRequest, com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionResponse> getTestLogStreamConnectionMethod;
    if ((getTestLogStreamConnectionMethod = LogStreamServiceGrpc.getTestLogStreamConnectionMethod) == null) {
      synchronized (LogStreamServiceGrpc.class) {
        if ((getTestLogStreamConnectionMethod = LogStreamServiceGrpc.getTestLogStreamConnectionMethod) == null) {
          LogStreamServiceGrpc.getTestLogStreamConnectionMethod = getTestLogStreamConnectionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionRequest, com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestLogStreamConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogStreamServiceMethodDescriptorSupplier("TestLogStreamConnection"))
              .build();
        }
      }
    }
    return getTestLogStreamConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesRequest,
      com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesResponse> getListLogStreamDeliveriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLogStreamDeliveries",
      requestType = com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesRequest,
      com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesResponse> getListLogStreamDeliveriesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesRequest, com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesResponse> getListLogStreamDeliveriesMethod;
    if ((getListLogStreamDeliveriesMethod = LogStreamServiceGrpc.getListLogStreamDeliveriesMethod) == null) {
      synchronized (LogStreamServiceGrpc.class) {
        if ((getListLogStreamDeliveriesMethod = LogStreamServiceGrpc.getListLogStreamDeliveriesMethod) == null) {
          LogStreamServiceGrpc.getListLogStreamDeliveriesMethod = getListLogStreamDeliveriesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesRequest, com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLogStreamDeliveries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogStreamServiceMethodDescriptorSupplier("ListLogStreamDeliveries"))
              .build();
        }
      }
    }
    return getListLogStreamDeliveriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsRequest,
      com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsResponse> getListLogStreamDeliveryAttemptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLogStreamDeliveryAttempts",
      requestType = com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsRequest,
      com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsResponse> getListLogStreamDeliveryAttemptsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsRequest, com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsResponse> getListLogStreamDeliveryAttemptsMethod;
    if ((getListLogStreamDeliveryAttemptsMethod = LogStreamServiceGrpc.getListLogStreamDeliveryAttemptsMethod) == null) {
      synchronized (LogStreamServiceGrpc.class) {
        if ((getListLogStreamDeliveryAttemptsMethod = LogStreamServiceGrpc.getListLogStreamDeliveryAttemptsMethod) == null) {
          LogStreamServiceGrpc.getListLogStreamDeliveryAttemptsMethod = getListLogStreamDeliveryAttemptsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsRequest, com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLogStreamDeliveryAttempts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogStreamServiceMethodDescriptorSupplier("ListLogStreamDeliveryAttempts"))
              .build();
        }
      }
    }
    return getListLogStreamDeliveryAttemptsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogStreamServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogStreamServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogStreamServiceStub>() {
        @java.lang.Override
        public LogStreamServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogStreamServiceStub(channel, callOptions);
        }
      };
    return LogStreamServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogStreamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogStreamServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogStreamServiceBlockingStub>() {
        @java.lang.Override
        public LogStreamServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogStreamServiceBlockingStub(channel, callOptions);
        }
      };
    return LogStreamServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogStreamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogStreamServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogStreamServiceFutureStub>() {
        @java.lang.Override
        public LogStreamServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogStreamServiceFutureStub(channel, callOptions);
        }
      };
    return LogStreamServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * LogStreamService configures SIEM log-streaming destinations for an
   * environment. Each destination is delivered through Scalekit's log-streaming
   * proxy, which fans events out to the customer's SIEM.
   * Credentials supplied on create/update are write-only: they are stored on the
   * delivery infrastructure and never returned by any RPC in this service. Reads
   * return only a masked hint.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * ListLogStreams returns every log stream configured for the environment,
     * together with the service account email a Google SecOps destination must
     * grant Chronicle log-ingest permission to.
     * </pre>
     */
    default void listLogStreams(com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLogStreamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLogStream returns a single log stream by id.
     * </pre>
     */
    default void getLogStream(com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLogStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateLogStream configures a new destination. Unless multiple destinations
     * per provider are enabled for the environment, at most one log stream per
     * provider may exist and a duplicate create is rejected. Datadog and
     * CrowdStrike require credentials; Google SecOps authorizes through a
     * cross-project IAM grant and has no credential.
     * </pre>
     */
    default void createLogStream(com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateLogStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateLogStream changes a destination's display name, routing config,
     * event filter, or enabled state. The provider is immutable. Omitting
     * credentials keeps the existing credential unchanged.
     * </pre>
     */
    default void updateLogStream(com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateLogStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteLogStream removes a destination and stops all delivery to it.
     * </pre>
     */
    default void deleteLogStream(com.scalekit.grpc.scalekit.v1.logstreams.DeleteLogStreamRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLogStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * TestLogStreamConnection performs a real delivery against the configured
     * destination and reports the outcome.
     * </pre>
     */
    default void testLogStreamConnection(com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestLogStreamConnectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListLogStreamDeliveries returns the events sent to one log stream's destination,
     * most recent first, with the outcome of each.
     * Deliberately a dedicated RPC rather than the webhook API passthrough that backs
     * the equivalent webhook screen. That passthrough allowlists endpoint, msg, attempt
     * and event-type on the environment's WEBHOOK Svix Application; pointing it at the
     * log-stream Application would also expose endpoint/{id}/headers, and a log-stream
     * endpoint's headers hold the customer's SIEM credential in plaintext. This RPC
     * returns delivery records only, and the Application id comes from the environment
     * in context rather than from the caller.
     * </pre>
     */
    default void listLogStreamDeliveries(com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLogStreamDeliveriesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListLogStreamDeliveryAttempts returns every attempt made for ONE event on this
     * log stream, oldest first, so a retry sequence reads in order.
     * </pre>
     */
    default void listLogStreamDeliveryAttempts(com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLogStreamDeliveryAttemptsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LogStreamService.
   * <pre>
   * LogStreamService configures SIEM log-streaming destinations for an
   * environment. Each destination is delivered through Scalekit's log-streaming
   * proxy, which fans events out to the customer's SIEM.
   * Credentials supplied on create/update are write-only: they are stored on the
   * delivery infrastructure and never returned by any RPC in this service. Reads
   * return only a masked hint.
   * </pre>
   */
  public static abstract class LogStreamServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LogStreamServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LogStreamService.
   * <pre>
   * LogStreamService configures SIEM log-streaming destinations for an
   * environment. Each destination is delivered through Scalekit's log-streaming
   * proxy, which fans events out to the customer's SIEM.
   * Credentials supplied on create/update are write-only: they are stored on the
   * delivery infrastructure and never returned by any RPC in this service. Reads
   * return only a masked hint.
   * </pre>
   */
  public static final class LogStreamServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LogStreamServiceStub> {
    private LogStreamServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogStreamServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogStreamServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListLogStreams returns every log stream configured for the environment,
     * together with the service account email a Google SecOps destination must
     * grant Chronicle log-ingest permission to.
     * </pre>
     */
    public void listLogStreams(com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLogStreamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLogStream returns a single log stream by id.
     * </pre>
     */
    public void getLogStream(com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLogStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateLogStream configures a new destination. Unless multiple destinations
     * per provider are enabled for the environment, at most one log stream per
     * provider may exist and a duplicate create is rejected. Datadog and
     * CrowdStrike require credentials; Google SecOps authorizes through a
     * cross-project IAM grant and has no credential.
     * </pre>
     */
    public void createLogStream(com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateLogStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateLogStream changes a destination's display name, routing config,
     * event filter, or enabled state. The provider is immutable. Omitting
     * credentials keeps the existing credential unchanged.
     * </pre>
     */
    public void updateLogStream(com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateLogStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteLogStream removes a destination and stops all delivery to it.
     * </pre>
     */
    public void deleteLogStream(com.scalekit.grpc.scalekit.v1.logstreams.DeleteLogStreamRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLogStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TestLogStreamConnection performs a real delivery against the configured
     * destination and reports the outcome.
     * </pre>
     */
    public void testLogStreamConnection(com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestLogStreamConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListLogStreamDeliveries returns the events sent to one log stream's destination,
     * most recent first, with the outcome of each.
     * Deliberately a dedicated RPC rather than the webhook API passthrough that backs
     * the equivalent webhook screen. That passthrough allowlists endpoint, msg, attempt
     * and event-type on the environment's WEBHOOK Svix Application; pointing it at the
     * log-stream Application would also expose endpoint/{id}/headers, and a log-stream
     * endpoint's headers hold the customer's SIEM credential in plaintext. This RPC
     * returns delivery records only, and the Application id comes from the environment
     * in context rather than from the caller.
     * </pre>
     */
    public void listLogStreamDeliveries(com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLogStreamDeliveriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListLogStreamDeliveryAttempts returns every attempt made for ONE event on this
     * log stream, oldest first, so a retry sequence reads in order.
     * </pre>
     */
    public void listLogStreamDeliveryAttempts(com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLogStreamDeliveryAttemptsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LogStreamService.
   * <pre>
   * LogStreamService configures SIEM log-streaming destinations for an
   * environment. Each destination is delivered through Scalekit's log-streaming
   * proxy, which fans events out to the customer's SIEM.
   * Credentials supplied on create/update are write-only: they are stored on the
   * delivery infrastructure and never returned by any RPC in this service. Reads
   * return only a masked hint.
   * </pre>
   */
  public static final class LogStreamServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LogStreamServiceBlockingStub> {
    private LogStreamServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogStreamServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogStreamServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListLogStreams returns every log stream configured for the environment,
     * together with the service account email a Google SecOps destination must
     * grant Chronicle log-ingest permission to.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsResponse listLogStreams(com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLogStreamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLogStream returns a single log stream by id.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamResponse getLogStream(com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLogStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateLogStream configures a new destination. Unless multiple destinations
     * per provider are enabled for the environment, at most one log stream per
     * provider may exist and a duplicate create is rejected. Datadog and
     * CrowdStrike require credentials; Google SecOps authorizes through a
     * cross-project IAM grant and has no credential.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamResponse createLogStream(com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateLogStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateLogStream changes a destination's display name, routing config,
     * event filter, or enabled state. The provider is immutable. Omitting
     * credentials keeps the existing credential unchanged.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamResponse updateLogStream(com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateLogStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteLogStream removes a destination and stops all delivery to it.
     * </pre>
     */
    public com.google.protobuf.Empty deleteLogStream(com.scalekit.grpc.scalekit.v1.logstreams.DeleteLogStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLogStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TestLogStreamConnection performs a real delivery against the configured
     * destination and reports the outcome.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionResponse testLogStreamConnection(com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestLogStreamConnectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListLogStreamDeliveries returns the events sent to one log stream's destination,
     * most recent first, with the outcome of each.
     * Deliberately a dedicated RPC rather than the webhook API passthrough that backs
     * the equivalent webhook screen. That passthrough allowlists endpoint, msg, attempt
     * and event-type on the environment's WEBHOOK Svix Application; pointing it at the
     * log-stream Application would also expose endpoint/{id}/headers, and a log-stream
     * endpoint's headers hold the customer's SIEM credential in plaintext. This RPC
     * returns delivery records only, and the Application id comes from the environment
     * in context rather than from the caller.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesResponse listLogStreamDeliveries(com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLogStreamDeliveriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListLogStreamDeliveryAttempts returns every attempt made for ONE event on this
     * log stream, oldest first, so a retry sequence reads in order.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsResponse listLogStreamDeliveryAttempts(com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLogStreamDeliveryAttemptsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LogStreamService.
   * <pre>
   * LogStreamService configures SIEM log-streaming destinations for an
   * environment. Each destination is delivered through Scalekit's log-streaming
   * proxy, which fans events out to the customer's SIEM.
   * Credentials supplied on create/update are write-only: they are stored on the
   * delivery infrastructure and never returned by any RPC in this service. Reads
   * return only a masked hint.
   * </pre>
   */
  public static final class LogStreamServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LogStreamServiceFutureStub> {
    private LogStreamServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogStreamServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogStreamServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListLogStreams returns every log stream configured for the environment,
     * together with the service account email a Google SecOps destination must
     * grant Chronicle log-ingest permission to.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsResponse> listLogStreams(
        com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLogStreamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLogStream returns a single log stream by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamResponse> getLogStream(
        com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLogStreamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateLogStream configures a new destination. Unless multiple destinations
     * per provider are enabled for the environment, at most one log stream per
     * provider may exist and a duplicate create is rejected. Datadog and
     * CrowdStrike require credentials; Google SecOps authorizes through a
     * cross-project IAM grant and has no credential.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamResponse> createLogStream(
        com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateLogStreamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateLogStream changes a destination's display name, routing config,
     * event filter, or enabled state. The provider is immutable. Omitting
     * credentials keeps the existing credential unchanged.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamResponse> updateLogStream(
        com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateLogStreamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteLogStream removes a destination and stops all delivery to it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteLogStream(
        com.scalekit.grpc.scalekit.v1.logstreams.DeleteLogStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLogStreamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TestLogStreamConnection performs a real delivery against the configured
     * destination and reports the outcome.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionResponse> testLogStreamConnection(
        com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestLogStreamConnectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListLogStreamDeliveries returns the events sent to one log stream's destination,
     * most recent first, with the outcome of each.
     * Deliberately a dedicated RPC rather than the webhook API passthrough that backs
     * the equivalent webhook screen. That passthrough allowlists endpoint, msg, attempt
     * and event-type on the environment's WEBHOOK Svix Application; pointing it at the
     * log-stream Application would also expose endpoint/{id}/headers, and a log-stream
     * endpoint's headers hold the customer's SIEM credential in plaintext. This RPC
     * returns delivery records only, and the Application id comes from the environment
     * in context rather than from the caller.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesResponse> listLogStreamDeliveries(
        com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLogStreamDeliveriesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListLogStreamDeliveryAttempts returns every attempt made for ONE event on this
     * log stream, oldest first, so a retry sequence reads in order.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsResponse> listLogStreamDeliveryAttempts(
        com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLogStreamDeliveryAttemptsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_LOG_STREAMS = 0;
  private static final int METHODID_GET_LOG_STREAM = 1;
  private static final int METHODID_CREATE_LOG_STREAM = 2;
  private static final int METHODID_UPDATE_LOG_STREAM = 3;
  private static final int METHODID_DELETE_LOG_STREAM = 4;
  private static final int METHODID_TEST_LOG_STREAM_CONNECTION = 5;
  private static final int METHODID_LIST_LOG_STREAM_DELIVERIES = 6;
  private static final int METHODID_LIST_LOG_STREAM_DELIVERY_ATTEMPTS = 7;

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
        case METHODID_LIST_LOG_STREAMS:
          serviceImpl.listLogStreams((com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsResponse>) responseObserver);
          break;
        case METHODID_GET_LOG_STREAM:
          serviceImpl.getLogStream((com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamResponse>) responseObserver);
          break;
        case METHODID_CREATE_LOG_STREAM:
          serviceImpl.createLogStream((com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LOG_STREAM:
          serviceImpl.updateLogStream((com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamResponse>) responseObserver);
          break;
        case METHODID_DELETE_LOG_STREAM:
          serviceImpl.deleteLogStream((com.scalekit.grpc.scalekit.v1.logstreams.DeleteLogStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_TEST_LOG_STREAM_CONNECTION:
          serviceImpl.testLogStreamConnection((com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionResponse>) responseObserver);
          break;
        case METHODID_LIST_LOG_STREAM_DELIVERIES:
          serviceImpl.listLogStreamDeliveries((com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesResponse>) responseObserver);
          break;
        case METHODID_LIST_LOG_STREAM_DELIVERY_ATTEMPTS:
          serviceImpl.listLogStreamDeliveryAttempts((com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsResponse>) responseObserver);
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
          getListLogStreamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsRequest,
              com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamsResponse>(
                service, METHODID_LIST_LOG_STREAMS)))
        .addMethod(
          getGetLogStreamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamRequest,
              com.scalekit.grpc.scalekit.v1.logstreams.GetLogStreamResponse>(
                service, METHODID_GET_LOG_STREAM)))
        .addMethod(
          getCreateLogStreamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamRequest,
              com.scalekit.grpc.scalekit.v1.logstreams.CreateLogStreamResponse>(
                service, METHODID_CREATE_LOG_STREAM)))
        .addMethod(
          getUpdateLogStreamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamRequest,
              com.scalekit.grpc.scalekit.v1.logstreams.UpdateLogStreamResponse>(
                service, METHODID_UPDATE_LOG_STREAM)))
        .addMethod(
          getDeleteLogStreamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.logstreams.DeleteLogStreamRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_LOG_STREAM)))
        .addMethod(
          getTestLogStreamConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionRequest,
              com.scalekit.grpc.scalekit.v1.logstreams.TestLogStreamConnectionResponse>(
                service, METHODID_TEST_LOG_STREAM_CONNECTION)))
        .addMethod(
          getListLogStreamDeliveriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesRequest,
              com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveriesResponse>(
                service, METHODID_LIST_LOG_STREAM_DELIVERIES)))
        .addMethod(
          getListLogStreamDeliveryAttemptsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsRequest,
              com.scalekit.grpc.scalekit.v1.logstreams.ListLogStreamDeliveryAttemptsResponse>(
                service, METHODID_LIST_LOG_STREAM_DELIVERY_ATTEMPTS)))
        .build();
  }

  private static abstract class LogStreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogStreamServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.logstreams.LogstreamsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LogStreamService");
    }
  }

  private static final class LogStreamServiceFileDescriptorSupplier
      extends LogStreamServiceBaseDescriptorSupplier {
    LogStreamServiceFileDescriptorSupplier() {}
  }

  private static final class LogStreamServiceMethodDescriptorSupplier
      extends LogStreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LogStreamServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LogStreamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogStreamServiceFileDescriptorSupplier())
              .addMethod(getListLogStreamsMethod())
              .addMethod(getGetLogStreamMethod())
              .addMethod(getCreateLogStreamMethod())
              .addMethod(getUpdateLogStreamMethod())
              .addMethod(getDeleteLogStreamMethod())
              .addMethod(getTestLogStreamConnectionMethod())
              .addMethod(getListLogStreamDeliveriesMethod())
              .addMethod(getListLogStreamDeliveryAttemptsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
