package com.scalekit.grpc.scalekit.v1.triggers;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * AgentKit Triggers — third-party events delivered to a customer's agent.
 * Everything a client renders comes from these RPCs and nothing else. That is the property the
 * contract exists to protect: adding a connector must require no client change, which only holds
 * if every difference between connectors — detection mode, setup style, required scopes, config
 * fields, and whether a trigger is usable at all on a given connection — is described in data
 * rather than in the client's own code.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/triggers/triggers.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TriggerServiceGrpc {

  private TriggerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.triggers.TriggerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersRequest,
      com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersResponse> getListAvailableTriggersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAvailableTriggers",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersRequest,
      com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersResponse> getListAvailableTriggersMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersRequest, com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersResponse> getListAvailableTriggersMethod;
    if ((getListAvailableTriggersMethod = TriggerServiceGrpc.getListAvailableTriggersMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getListAvailableTriggersMethod = TriggerServiceGrpc.getListAvailableTriggersMethod) == null) {
          TriggerServiceGrpc.getListAvailableTriggersMethod = getListAvailableTriggersMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersRequest, com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAvailableTriggers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("ListAvailableTriggers"))
              .build();
        }
      }
    }
    return getListAvailableTriggersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsRequest,
      com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsResponse> getListEligibleAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEligibleAccounts",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsRequest,
      com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsResponse> getListEligibleAccountsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsRequest, com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsResponse> getListEligibleAccountsMethod;
    if ((getListEligibleAccountsMethod = TriggerServiceGrpc.getListEligibleAccountsMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getListEligibleAccountsMethod = TriggerServiceGrpc.getListEligibleAccountsMethod) == null) {
          TriggerServiceGrpc.getListEligibleAccountsMethod = getListEligibleAccountsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsRequest, com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEligibleAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("ListEligibleAccounts"))
              .build();
        }
      }
    }
    return getListEligibleAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsRequest,
      com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsResponse> getListTriggerSubscriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTriggerSubscriptions",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsRequest,
      com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsResponse> getListTriggerSubscriptionsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsRequest, com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsResponse> getListTriggerSubscriptionsMethod;
    if ((getListTriggerSubscriptionsMethod = TriggerServiceGrpc.getListTriggerSubscriptionsMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getListTriggerSubscriptionsMethod = TriggerServiceGrpc.getListTriggerSubscriptionsMethod) == null) {
          TriggerServiceGrpc.getListTriggerSubscriptionsMethod = getListTriggerSubscriptionsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsRequest, com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTriggerSubscriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("ListTriggerSubscriptions"))
              .build();
        }
      }
    }
    return getListTriggerSubscriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerSubscriptionRequest,
      com.scalekit.grpc.scalekit.v1.triggers.TriggerSubscription> getCreateTriggerSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTriggerSubscription",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerSubscriptionRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.TriggerSubscription.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerSubscriptionRequest,
      com.scalekit.grpc.scalekit.v1.triggers.TriggerSubscription> getCreateTriggerSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerSubscriptionRequest, com.scalekit.grpc.scalekit.v1.triggers.TriggerSubscription> getCreateTriggerSubscriptionMethod;
    if ((getCreateTriggerSubscriptionMethod = TriggerServiceGrpc.getCreateTriggerSubscriptionMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getCreateTriggerSubscriptionMethod = TriggerServiceGrpc.getCreateTriggerSubscriptionMethod) == null) {
          TriggerServiceGrpc.getCreateTriggerSubscriptionMethod = getCreateTriggerSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerSubscriptionRequest, com.scalekit.grpc.scalekit.v1.triggers.TriggerSubscription>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTriggerSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.TriggerSubscription.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("CreateTriggerSubscription"))
              .build();
        }
      }
    }
    return getCreateTriggerSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsRequest,
      com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsResponse> getBatchCreateTriggerSubscriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchCreateTriggerSubscriptions",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsRequest,
      com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsResponse> getBatchCreateTriggerSubscriptionsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsRequest, com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsResponse> getBatchCreateTriggerSubscriptionsMethod;
    if ((getBatchCreateTriggerSubscriptionsMethod = TriggerServiceGrpc.getBatchCreateTriggerSubscriptionsMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getBatchCreateTriggerSubscriptionsMethod = TriggerServiceGrpc.getBatchCreateTriggerSubscriptionsMethod) == null) {
          TriggerServiceGrpc.getBatchCreateTriggerSubscriptionsMethod = getBatchCreateTriggerSubscriptionsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsRequest, com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchCreateTriggerSubscriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("BatchCreateTriggerSubscriptions"))
              .build();
        }
      }
    }
    return getBatchCreateTriggerSubscriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.DeleteTriggerSubscriptionRequest,
      com.google.protobuf.Empty> getDeleteTriggerSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTriggerSubscription",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.DeleteTriggerSubscriptionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.DeleteTriggerSubscriptionRequest,
      com.google.protobuf.Empty> getDeleteTriggerSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.DeleteTriggerSubscriptionRequest, com.google.protobuf.Empty> getDeleteTriggerSubscriptionMethod;
    if ((getDeleteTriggerSubscriptionMethod = TriggerServiceGrpc.getDeleteTriggerSubscriptionMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getDeleteTriggerSubscriptionMethod = TriggerServiceGrpc.getDeleteTriggerSubscriptionMethod) == null) {
          TriggerServiceGrpc.getDeleteTriggerSubscriptionMethod = getDeleteTriggerSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.DeleteTriggerSubscriptionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTriggerSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.DeleteTriggerSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("DeleteTriggerSubscription"))
              .build();
        }
      }
    }
    return getDeleteTriggerSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsRequest,
      com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsResponse> getBatchDeleteTriggerSubscriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchDeleteTriggerSubscriptions",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsRequest,
      com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsResponse> getBatchDeleteTriggerSubscriptionsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsRequest, com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsResponse> getBatchDeleteTriggerSubscriptionsMethod;
    if ((getBatchDeleteTriggerSubscriptionsMethod = TriggerServiceGrpc.getBatchDeleteTriggerSubscriptionsMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getBatchDeleteTriggerSubscriptionsMethod = TriggerServiceGrpc.getBatchDeleteTriggerSubscriptionsMethod) == null) {
          TriggerServiceGrpc.getBatchDeleteTriggerSubscriptionsMethod = getBatchDeleteTriggerSubscriptionsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsRequest, com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchDeleteTriggerSubscriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("BatchDeleteTriggerSubscriptions"))
              .build();
        }
      }
    }
    return getBatchDeleteTriggerSubscriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityRequest,
      com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityResponse> getGetTriggerActivityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTriggerActivity",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityRequest,
      com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityResponse> getGetTriggerActivityMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityRequest, com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityResponse> getGetTriggerActivityMethod;
    if ((getGetTriggerActivityMethod = TriggerServiceGrpc.getGetTriggerActivityMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getGetTriggerActivityMethod = TriggerServiceGrpc.getGetTriggerActivityMethod) == null) {
          TriggerServiceGrpc.getGetTriggerActivityMethod = getGetTriggerActivityMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityRequest, com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTriggerActivity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("GetTriggerActivity"))
              .build();
        }
      }
    }
    return getGetTriggerActivityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageRequest,
      com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageResponse> getGetTriggerUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTriggerUsage",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageRequest,
      com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageResponse> getGetTriggerUsageMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageRequest, com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageResponse> getGetTriggerUsageMethod;
    if ((getGetTriggerUsageMethod = TriggerServiceGrpc.getGetTriggerUsageMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getGetTriggerUsageMethod = TriggerServiceGrpc.getGetTriggerUsageMethod) == null) {
          TriggerServiceGrpc.getGetTriggerUsageMethod = getGetTriggerUsageMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageRequest, com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTriggerUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("GetTriggerUsage"))
              .build();
        }
      }
    }
    return getGetTriggerUsageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerIngressEndpointRequest,
      com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> getGetTriggerIngressEndpointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTriggerIngressEndpoint",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.GetTriggerIngressEndpointRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerIngressEndpointRequest,
      com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> getGetTriggerIngressEndpointMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerIngressEndpointRequest, com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> getGetTriggerIngressEndpointMethod;
    if ((getGetTriggerIngressEndpointMethod = TriggerServiceGrpc.getGetTriggerIngressEndpointMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getGetTriggerIngressEndpointMethod = TriggerServiceGrpc.getGetTriggerIngressEndpointMethod) == null) {
          TriggerServiceGrpc.getGetTriggerIngressEndpointMethod = getGetTriggerIngressEndpointMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerIngressEndpointRequest, com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTriggerIngressEndpoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.GetTriggerIngressEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("GetTriggerIngressEndpoint"))
              .build();
        }
      }
    }
    return getGetTriggerIngressEndpointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerIngressEndpointRequest,
      com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> getCreateTriggerIngressEndpointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTriggerIngressEndpoint",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerIngressEndpointRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerIngressEndpointRequest,
      com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> getCreateTriggerIngressEndpointMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerIngressEndpointRequest, com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> getCreateTriggerIngressEndpointMethod;
    if ((getCreateTriggerIngressEndpointMethod = TriggerServiceGrpc.getCreateTriggerIngressEndpointMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getCreateTriggerIngressEndpointMethod = TriggerServiceGrpc.getCreateTriggerIngressEndpointMethod) == null) {
          TriggerServiceGrpc.getCreateTriggerIngressEndpointMethod = getCreateTriggerIngressEndpointMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerIngressEndpointRequest, com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTriggerIngressEndpoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerIngressEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("CreateTriggerIngressEndpoint"))
              .build();
        }
      }
    }
    return getCreateTriggerIngressEndpointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.SetTriggerSigningSecretRequest,
      com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> getSetTriggerSigningSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTriggerSigningSecret",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.SetTriggerSigningSecretRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.SetTriggerSigningSecretRequest,
      com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> getSetTriggerSigningSecretMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.SetTriggerSigningSecretRequest, com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> getSetTriggerSigningSecretMethod;
    if ((getSetTriggerSigningSecretMethod = TriggerServiceGrpc.getSetTriggerSigningSecretMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getSetTriggerSigningSecretMethod = TriggerServiceGrpc.getSetTriggerSigningSecretMethod) == null) {
          TriggerServiceGrpc.getSetTriggerSigningSecretMethod = getSetTriggerSigningSecretMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.SetTriggerSigningSecretRequest, com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetTriggerSigningSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.SetTriggerSigningSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("SetTriggerSigningSecret"))
              .build();
        }
      }
    }
    return getSetTriggerSigningSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ConfirmTriggerSigningSecretRotationRequest,
      com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> getConfirmTriggerSigningSecretRotationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmTriggerSigningSecretRotation",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.ConfirmTriggerSigningSecretRotationRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ConfirmTriggerSigningSecretRotationRequest,
      com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> getConfirmTriggerSigningSecretRotationMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ConfirmTriggerSigningSecretRotationRequest, com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> getConfirmTriggerSigningSecretRotationMethod;
    if ((getConfirmTriggerSigningSecretRotationMethod = TriggerServiceGrpc.getConfirmTriggerSigningSecretRotationMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getConfirmTriggerSigningSecretRotationMethod = TriggerServiceGrpc.getConfirmTriggerSigningSecretRotationMethod) == null) {
          TriggerServiceGrpc.getConfirmTriggerSigningSecretRotationMethod = getConfirmTriggerSigningSecretRotationMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.ConfirmTriggerSigningSecretRotationRequest, com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmTriggerSigningSecretRotation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.ConfirmTriggerSigningSecretRotationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("ConfirmTriggerSigningSecretRotation"))
              .build();
        }
      }
    }
    return getConfirmTriggerSigningSecretRotationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretRequest,
      com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretResponse> getGenerateTriggerSigningSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateTriggerSigningSecret",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretRequest,
      com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretResponse> getGenerateTriggerSigningSecretMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretRequest, com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretResponse> getGenerateTriggerSigningSecretMethod;
    if ((getGenerateTriggerSigningSecretMethod = TriggerServiceGrpc.getGenerateTriggerSigningSecretMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getGenerateTriggerSigningSecretMethod = TriggerServiceGrpc.getGenerateTriggerSigningSecretMethod) == null) {
          TriggerServiceGrpc.getGenerateTriggerSigningSecretMethod = getGenerateTriggerSigningSecretMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretRequest, com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateTriggerSigningSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("GenerateTriggerSigningSecret"))
              .build();
        }
      }
    }
    return getGenerateTriggerSigningSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsRequest,
      com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsResponse> getSyncTriggerDefinitionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyncTriggerDefinitions",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsRequest,
      com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsResponse> getSyncTriggerDefinitionsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsRequest, com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsResponse> getSyncTriggerDefinitionsMethod;
    if ((getSyncTriggerDefinitionsMethod = TriggerServiceGrpc.getSyncTriggerDefinitionsMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getSyncTriggerDefinitionsMethod = TriggerServiceGrpc.getSyncTriggerDefinitionsMethod) == null) {
          TriggerServiceGrpc.getSyncTriggerDefinitionsMethod = getSyncTriggerDefinitionsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsRequest, com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SyncTriggerDefinitions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("SyncTriggerDefinitions"))
              .build();
        }
      }
    }
    return getSyncTriggerDefinitionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointRequest,
      com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointResponse> getListTriggerDeliveryAttemptsByEndpointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTriggerDeliveryAttemptsByEndpoint",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointRequest,
      com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointResponse> getListTriggerDeliveryAttemptsByEndpointMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointRequest, com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointResponse> getListTriggerDeliveryAttemptsByEndpointMethod;
    if ((getListTriggerDeliveryAttemptsByEndpointMethod = TriggerServiceGrpc.getListTriggerDeliveryAttemptsByEndpointMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getListTriggerDeliveryAttemptsByEndpointMethod = TriggerServiceGrpc.getListTriggerDeliveryAttemptsByEndpointMethod) == null) {
          TriggerServiceGrpc.getListTriggerDeliveryAttemptsByEndpointMethod = getListTriggerDeliveryAttemptsByEndpointMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointRequest, com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTriggerDeliveryAttemptsByEndpoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("ListTriggerDeliveryAttemptsByEndpoint"))
              .build();
        }
      }
    }
    return getListTriggerDeliveryAttemptsByEndpointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointRequest,
      com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointResponse> getListTriggerDeliveriesByEndpointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTriggerDeliveriesByEndpoint",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointRequest,
      com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointResponse> getListTriggerDeliveriesByEndpointMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointRequest, com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointResponse> getListTriggerDeliveriesByEndpointMethod;
    if ((getListTriggerDeliveriesByEndpointMethod = TriggerServiceGrpc.getListTriggerDeliveriesByEndpointMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getListTriggerDeliveriesByEndpointMethod = TriggerServiceGrpc.getListTriggerDeliveriesByEndpointMethod) == null) {
          TriggerServiceGrpc.getListTriggerDeliveriesByEndpointMethod = getListTriggerDeliveriesByEndpointMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointRequest, com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTriggerDeliveriesByEndpoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("ListTriggerDeliveriesByEndpoint"))
              .build();
        }
      }
    }
    return getListTriggerDeliveriesByEndpointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageRequest,
      com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageResponse> getListTriggerDeliveryAttemptsByMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTriggerDeliveryAttemptsByMessage",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageRequest,
      com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageResponse> getListTriggerDeliveryAttemptsByMessageMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageRequest, com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageResponse> getListTriggerDeliveryAttemptsByMessageMethod;
    if ((getListTriggerDeliveryAttemptsByMessageMethod = TriggerServiceGrpc.getListTriggerDeliveryAttemptsByMessageMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getListTriggerDeliveryAttemptsByMessageMethod = TriggerServiceGrpc.getListTriggerDeliveryAttemptsByMessageMethod) == null) {
          TriggerServiceGrpc.getListTriggerDeliveryAttemptsByMessageMethod = getListTriggerDeliveryAttemptsByMessageMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageRequest, com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTriggerDeliveryAttemptsByMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("ListTriggerDeliveryAttemptsByMessage"))
              .build();
        }
      }
    }
    return getListTriggerDeliveryAttemptsByMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryRequest,
      com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryResponse> getLookupTriggerDeliveryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LookupTriggerDelivery",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryRequest,
      com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryResponse> getLookupTriggerDeliveryMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryRequest, com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryResponse> getLookupTriggerDeliveryMethod;
    if ((getLookupTriggerDeliveryMethod = TriggerServiceGrpc.getLookupTriggerDeliveryMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getLookupTriggerDeliveryMethod = TriggerServiceGrpc.getLookupTriggerDeliveryMethod) == null) {
          TriggerServiceGrpc.getLookupTriggerDeliveryMethod = getLookupTriggerDeliveryMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryRequest, com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LookupTriggerDelivery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("LookupTriggerDelivery"))
              .build();
        }
      }
    }
    return getLookupTriggerDeliveryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesRequest,
      com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesResponse> getBatchLookupTriggerDeliveriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchLookupTriggerDeliveries",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesRequest,
      com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesResponse> getBatchLookupTriggerDeliveriesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesRequest, com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesResponse> getBatchLookupTriggerDeliveriesMethod;
    if ((getBatchLookupTriggerDeliveriesMethod = TriggerServiceGrpc.getBatchLookupTriggerDeliveriesMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getBatchLookupTriggerDeliveriesMethod = TriggerServiceGrpc.getBatchLookupTriggerDeliveriesMethod) == null) {
          TriggerServiceGrpc.getBatchLookupTriggerDeliveriesMethod = getBatchLookupTriggerDeliveriesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesRequest, com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchLookupTriggerDeliveries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("BatchLookupTriggerDeliveries"))
              .build();
        }
      }
    }
    return getBatchLookupTriggerDeliveriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesRequest,
      com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesResponse> getBatchResendTriggerDeliveriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchResendTriggerDeliveries",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesRequest,
      com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesResponse> getBatchResendTriggerDeliveriesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesRequest, com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesResponse> getBatchResendTriggerDeliveriesMethod;
    if ((getBatchResendTriggerDeliveriesMethod = TriggerServiceGrpc.getBatchResendTriggerDeliveriesMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getBatchResendTriggerDeliveriesMethod = TriggerServiceGrpc.getBatchResendTriggerDeliveriesMethod) == null) {
          TriggerServiceGrpc.getBatchResendTriggerDeliveriesMethod = getBatchResendTriggerDeliveriesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesRequest, com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchResendTriggerDeliveries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("BatchResendTriggerDeliveries"))
              .build();
        }
      }
    }
    return getBatchResendTriggerDeliveriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesRequest,
      com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesResponse> getRecoverTriggerDeliveriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecoverTriggerDeliveries",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesRequest,
      com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesResponse> getRecoverTriggerDeliveriesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesRequest, com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesResponse> getRecoverTriggerDeliveriesMethod;
    if ((getRecoverTriggerDeliveriesMethod = TriggerServiceGrpc.getRecoverTriggerDeliveriesMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getRecoverTriggerDeliveriesMethod = TriggerServiceGrpc.getRecoverTriggerDeliveriesMethod) == null) {
          TriggerServiceGrpc.getRecoverTriggerDeliveriesMethod = getRecoverTriggerDeliveriesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesRequest, com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecoverTriggerDeliveries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("RecoverTriggerDeliveries"))
              .build();
        }
      }
    }
    return getRecoverTriggerDeliveriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.TriggerWebhookWrapperRequest,
      com.google.protobuf.Struct> getTriggerWebhookWrapperMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerWebhookWrapper",
      requestType = com.scalekit.grpc.scalekit.v1.triggers.TriggerWebhookWrapperRequest.class,
      responseType = com.google.protobuf.Struct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.TriggerWebhookWrapperRequest,
      com.google.protobuf.Struct> getTriggerWebhookWrapperMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.triggers.TriggerWebhookWrapperRequest, com.google.protobuf.Struct> getTriggerWebhookWrapperMethod;
    if ((getTriggerWebhookWrapperMethod = TriggerServiceGrpc.getTriggerWebhookWrapperMethod) == null) {
      synchronized (TriggerServiceGrpc.class) {
        if ((getTriggerWebhookWrapperMethod = TriggerServiceGrpc.getTriggerWebhookWrapperMethod) == null) {
          TriggerServiceGrpc.getTriggerWebhookWrapperMethod = getTriggerWebhookWrapperMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.triggers.TriggerWebhookWrapperRequest, com.google.protobuf.Struct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerWebhookWrapper"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.triggers.TriggerWebhookWrapperRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Struct.getDefaultInstance()))
              .setSchemaDescriptor(new TriggerServiceMethodDescriptorSupplier("TriggerWebhookWrapper"))
              .build();
        }
      }
    }
    return getTriggerWebhookWrapperMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TriggerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TriggerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TriggerServiceStub>() {
        @java.lang.Override
        public TriggerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TriggerServiceStub(channel, callOptions);
        }
      };
    return TriggerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TriggerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TriggerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TriggerServiceBlockingStub>() {
        @java.lang.Override
        public TriggerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TriggerServiceBlockingStub(channel, callOptions);
        }
      };
    return TriggerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TriggerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TriggerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TriggerServiceFutureStub>() {
        @java.lang.Override
        public TriggerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TriggerServiceFutureStub(channel, callOptions);
        }
      };
    return TriggerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AgentKit Triggers — third-party events delivered to a customer's agent.
   * Everything a client renders comes from these RPCs and nothing else. That is the property the
   * contract exists to protect: adding a connector must require no client change, which only holds
   * if every difference between connectors — detection mode, setup style, required scopes, config
   * fields, and whether a trigger is usable at all on a given connection — is described in data
   * rather than in the client's own code.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void listAvailableTriggers(com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAvailableTriggersMethod(), responseObserver);
    }

    /**
     */
    default void listEligibleAccounts(com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEligibleAccountsMethod(), responseObserver);
    }

    /**
     */
    default void listTriggerSubscriptions(com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTriggerSubscriptionsMethod(), responseObserver);
    }

    /**
     */
    default void createTriggerSubscription(com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.TriggerSubscription> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTriggerSubscriptionMethod(), responseObserver);
    }

    /**
     */
    default void batchCreateTriggerSubscriptions(com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchCreateTriggerSubscriptionsMethod(), responseObserver);
    }

    /**
     */
    default void deleteTriggerSubscription(com.scalekit.grpc.scalekit.v1.triggers.DeleteTriggerSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTriggerSubscriptionMethod(), responseObserver);
    }

    /**
     */
    default void batchDeleteTriggerSubscriptions(com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchDeleteTriggerSubscriptionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTriggerActivity retrieves counts of what happened to this environment's trigger events
     * over the last day.
     * </pre>
     */
    default void getTriggerActivity(com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTriggerActivityMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTriggerUsage reads the trigger deliveries Metronome metered for this environment, either for
     * a preset period ending now (by the hour for 24h, by UTC day for 7d and 30d) or on each UTC day
     * of a date range, cut to the days that can be read: today and the 30 days before it.
     * </pre>
     */
    default void getTriggerUsage(com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTriggerUsageMethod(), responseObserver);
    }

    /**
     */
    default void getTriggerIngressEndpoint(com.scalekit.grpc.scalekit.v1.triggers.GetTriggerIngressEndpointRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTriggerIngressEndpointMethod(), responseObserver);
    }

    /**
     */
    default void createTriggerIngressEndpoint(com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerIngressEndpointRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTriggerIngressEndpointMethod(), responseObserver);
    }

    /**
     */
    default void setTriggerSigningSecret(com.scalekit.grpc.scalekit.v1.triggers.SetTriggerSigningSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetTriggerSigningSecretMethod(), responseObserver);
    }

    /**
     */
    default void confirmTriggerSigningSecretRotation(com.scalekit.grpc.scalekit.v1.triggers.ConfirmTriggerSigningSecretRotationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmTriggerSigningSecretRotationMethod(), responseObserver);
    }

    /**
     */
    default void generateTriggerSigningSecret(com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateTriggerSigningSecretMethod(), responseObserver);
    }

    /**
     */
    default void syncTriggerDefinitions(com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyncTriggerDefinitionsMethod(), responseObserver);
    }

    /**
     */
    default void listTriggerDeliveryAttemptsByEndpoint(com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTriggerDeliveryAttemptsByEndpointMethod(), responseObserver);
    }

    /**
     */
    default void listTriggerDeliveriesByEndpoint(com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTriggerDeliveriesByEndpointMethod(), responseObserver);
    }

    /**
     */
    default void listTriggerDeliveryAttemptsByMessage(com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTriggerDeliveryAttemptsByMessageMethod(), responseObserver);
    }

    /**
     */
    default void lookupTriggerDelivery(com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLookupTriggerDeliveryMethod(), responseObserver);
    }

    /**
     */
    default void batchLookupTriggerDeliveries(com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchLookupTriggerDeliveriesMethod(), responseObserver);
    }

    /**
     */
    default void batchResendTriggerDeliveries(com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchResendTriggerDeliveriesMethod(), responseObserver);
    }

    /**
     */
    default void recoverTriggerDeliveries(com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecoverTriggerDeliveriesMethod(), responseObserver);
    }

    /**
     */
    default void triggerWebhookWrapper(com.scalekit.grpc.scalekit.v1.triggers.TriggerWebhookWrapperRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Struct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTriggerWebhookWrapperMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TriggerService.
   * <pre>
   * AgentKit Triggers — third-party events delivered to a customer's agent.
   * Everything a client renders comes from these RPCs and nothing else. That is the property the
   * contract exists to protect: adding a connector must require no client change, which only holds
   * if every difference between connectors — detection mode, setup style, required scopes, config
   * fields, and whether a trigger is usable at all on a given connection — is described in data
   * rather than in the client's own code.
   * </pre>
   */
  public static abstract class TriggerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TriggerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TriggerService.
   * <pre>
   * AgentKit Triggers — third-party events delivered to a customer's agent.
   * Everything a client renders comes from these RPCs and nothing else. That is the property the
   * contract exists to protect: adding a connector must require no client change, which only holds
   * if every difference between connectors — detection mode, setup style, required scopes, config
   * fields, and whether a trigger is usable at all on a given connection — is described in data
   * rather than in the client's own code.
   * </pre>
   */
  public static final class TriggerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TriggerServiceStub> {
    private TriggerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TriggerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TriggerServiceStub(channel, callOptions);
    }

    /**
     */
    public void listAvailableTriggers(com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAvailableTriggersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listEligibleAccounts(com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEligibleAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTriggerSubscriptions(com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTriggerSubscriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTriggerSubscription(com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.TriggerSubscription> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTriggerSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchCreateTriggerSubscriptions(com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchCreateTriggerSubscriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTriggerSubscription(com.scalekit.grpc.scalekit.v1.triggers.DeleteTriggerSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTriggerSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchDeleteTriggerSubscriptions(com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchDeleteTriggerSubscriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTriggerActivity retrieves counts of what happened to this environment's trigger events
     * over the last day.
     * </pre>
     */
    public void getTriggerActivity(com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTriggerActivityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTriggerUsage reads the trigger deliveries Metronome metered for this environment, either for
     * a preset period ending now (by the hour for 24h, by UTC day for 7d and 30d) or on each UTC day
     * of a date range, cut to the days that can be read: today and the 30 days before it.
     * </pre>
     */
    public void getTriggerUsage(com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTriggerUsageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTriggerIngressEndpoint(com.scalekit.grpc.scalekit.v1.triggers.GetTriggerIngressEndpointRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTriggerIngressEndpointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTriggerIngressEndpoint(com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerIngressEndpointRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTriggerIngressEndpointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTriggerSigningSecret(com.scalekit.grpc.scalekit.v1.triggers.SetTriggerSigningSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetTriggerSigningSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void confirmTriggerSigningSecretRotation(com.scalekit.grpc.scalekit.v1.triggers.ConfirmTriggerSigningSecretRotationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmTriggerSigningSecretRotationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateTriggerSigningSecret(com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateTriggerSigningSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void syncTriggerDefinitions(com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSyncTriggerDefinitionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTriggerDeliveryAttemptsByEndpoint(com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTriggerDeliveryAttemptsByEndpointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTriggerDeliveriesByEndpoint(com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTriggerDeliveriesByEndpointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTriggerDeliveryAttemptsByMessage(com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTriggerDeliveryAttemptsByMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lookupTriggerDelivery(com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLookupTriggerDeliveryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchLookupTriggerDeliveries(com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchLookupTriggerDeliveriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchResendTriggerDeliveries(com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchResendTriggerDeliveriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void recoverTriggerDeliveries(com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecoverTriggerDeliveriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void triggerWebhookWrapper(com.scalekit.grpc.scalekit.v1.triggers.TriggerWebhookWrapperRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Struct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTriggerWebhookWrapperMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TriggerService.
   * <pre>
   * AgentKit Triggers — third-party events delivered to a customer's agent.
   * Everything a client renders comes from these RPCs and nothing else. That is the property the
   * contract exists to protect: adding a connector must require no client change, which only holds
   * if every difference between connectors — detection mode, setup style, required scopes, config
   * fields, and whether a trigger is usable at all on a given connection — is described in data
   * rather than in the client's own code.
   * </pre>
   */
  public static final class TriggerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TriggerServiceBlockingStub> {
    private TriggerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TriggerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TriggerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersResponse listAvailableTriggers(com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAvailableTriggersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsResponse listEligibleAccounts(com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEligibleAccountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsResponse listTriggerSubscriptions(com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTriggerSubscriptionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.triggers.TriggerSubscription createTriggerSubscription(com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTriggerSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsResponse batchCreateTriggerSubscriptions(com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchCreateTriggerSubscriptionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteTriggerSubscription(com.scalekit.grpc.scalekit.v1.triggers.DeleteTriggerSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTriggerSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsResponse batchDeleteTriggerSubscriptions(com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchDeleteTriggerSubscriptionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTriggerActivity retrieves counts of what happened to this environment's trigger events
     * over the last day.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityResponse getTriggerActivity(com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTriggerActivityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTriggerUsage reads the trigger deliveries Metronome metered for this environment, either for
     * a preset period ending now (by the hour for 24h, by UTC day for 7d and 30d) or on each UTC day
     * of a date range, cut to the days that can be read: today and the 30 days before it.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageResponse getTriggerUsage(com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTriggerUsageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint getTriggerIngressEndpoint(com.scalekit.grpc.scalekit.v1.triggers.GetTriggerIngressEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTriggerIngressEndpointMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint createTriggerIngressEndpoint(com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerIngressEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTriggerIngressEndpointMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint setTriggerSigningSecret(com.scalekit.grpc.scalekit.v1.triggers.SetTriggerSigningSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetTriggerSigningSecretMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint confirmTriggerSigningSecretRotation(com.scalekit.grpc.scalekit.v1.triggers.ConfirmTriggerSigningSecretRotationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmTriggerSigningSecretRotationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretResponse generateTriggerSigningSecret(com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateTriggerSigningSecretMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsResponse syncTriggerDefinitions(com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSyncTriggerDefinitionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointResponse listTriggerDeliveryAttemptsByEndpoint(com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTriggerDeliveryAttemptsByEndpointMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointResponse listTriggerDeliveriesByEndpoint(com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTriggerDeliveriesByEndpointMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageResponse listTriggerDeliveryAttemptsByMessage(com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTriggerDeliveryAttemptsByMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryResponse lookupTriggerDelivery(com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLookupTriggerDeliveryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesResponse batchLookupTriggerDeliveries(com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchLookupTriggerDeliveriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesResponse batchResendTriggerDeliveries(com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchResendTriggerDeliveriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesResponse recoverTriggerDeliveries(com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecoverTriggerDeliveriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Struct triggerWebhookWrapper(com.scalekit.grpc.scalekit.v1.triggers.TriggerWebhookWrapperRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTriggerWebhookWrapperMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TriggerService.
   * <pre>
   * AgentKit Triggers — third-party events delivered to a customer's agent.
   * Everything a client renders comes from these RPCs and nothing else. That is the property the
   * contract exists to protect: adding a connector must require no client change, which only holds
   * if every difference between connectors — detection mode, setup style, required scopes, config
   * fields, and whether a trigger is usable at all on a given connection — is described in data
   * rather than in the client's own code.
   * </pre>
   */
  public static final class TriggerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TriggerServiceFutureStub> {
    private TriggerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TriggerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TriggerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersResponse> listAvailableTriggers(
        com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAvailableTriggersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsResponse> listEligibleAccounts(
        com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEligibleAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsResponse> listTriggerSubscriptions(
        com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTriggerSubscriptionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.TriggerSubscription> createTriggerSubscription(
        com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTriggerSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsResponse> batchCreateTriggerSubscriptions(
        com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchCreateTriggerSubscriptionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTriggerSubscription(
        com.scalekit.grpc.scalekit.v1.triggers.DeleteTriggerSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTriggerSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsResponse> batchDeleteTriggerSubscriptions(
        com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchDeleteTriggerSubscriptionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTriggerActivity retrieves counts of what happened to this environment's trigger events
     * over the last day.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityResponse> getTriggerActivity(
        com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTriggerActivityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTriggerUsage reads the trigger deliveries Metronome metered for this environment, either for
     * a preset period ending now (by the hour for 24h, by UTC day for 7d and 30d) or on each UTC day
     * of a date range, cut to the days that can be read: today and the 30 days before it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageResponse> getTriggerUsage(
        com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTriggerUsageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> getTriggerIngressEndpoint(
        com.scalekit.grpc.scalekit.v1.triggers.GetTriggerIngressEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTriggerIngressEndpointMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> createTriggerIngressEndpoint(
        com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerIngressEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTriggerIngressEndpointMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> setTriggerSigningSecret(
        com.scalekit.grpc.scalekit.v1.triggers.SetTriggerSigningSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetTriggerSigningSecretMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint> confirmTriggerSigningSecretRotation(
        com.scalekit.grpc.scalekit.v1.triggers.ConfirmTriggerSigningSecretRotationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmTriggerSigningSecretRotationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretResponse> generateTriggerSigningSecret(
        com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateTriggerSigningSecretMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsResponse> syncTriggerDefinitions(
        com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSyncTriggerDefinitionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointResponse> listTriggerDeliveryAttemptsByEndpoint(
        com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTriggerDeliveryAttemptsByEndpointMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointResponse> listTriggerDeliveriesByEndpoint(
        com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTriggerDeliveriesByEndpointMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageResponse> listTriggerDeliveryAttemptsByMessage(
        com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTriggerDeliveryAttemptsByMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryResponse> lookupTriggerDelivery(
        com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLookupTriggerDeliveryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesResponse> batchLookupTriggerDeliveries(
        com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchLookupTriggerDeliveriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesResponse> batchResendTriggerDeliveries(
        com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchResendTriggerDeliveriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesResponse> recoverTriggerDeliveries(
        com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecoverTriggerDeliveriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Struct> triggerWebhookWrapper(
        com.scalekit.grpc.scalekit.v1.triggers.TriggerWebhookWrapperRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTriggerWebhookWrapperMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_AVAILABLE_TRIGGERS = 0;
  private static final int METHODID_LIST_ELIGIBLE_ACCOUNTS = 1;
  private static final int METHODID_LIST_TRIGGER_SUBSCRIPTIONS = 2;
  private static final int METHODID_CREATE_TRIGGER_SUBSCRIPTION = 3;
  private static final int METHODID_BATCH_CREATE_TRIGGER_SUBSCRIPTIONS = 4;
  private static final int METHODID_DELETE_TRIGGER_SUBSCRIPTION = 5;
  private static final int METHODID_BATCH_DELETE_TRIGGER_SUBSCRIPTIONS = 6;
  private static final int METHODID_GET_TRIGGER_ACTIVITY = 7;
  private static final int METHODID_GET_TRIGGER_USAGE = 8;
  private static final int METHODID_GET_TRIGGER_INGRESS_ENDPOINT = 9;
  private static final int METHODID_CREATE_TRIGGER_INGRESS_ENDPOINT = 10;
  private static final int METHODID_SET_TRIGGER_SIGNING_SECRET = 11;
  private static final int METHODID_CONFIRM_TRIGGER_SIGNING_SECRET_ROTATION = 12;
  private static final int METHODID_GENERATE_TRIGGER_SIGNING_SECRET = 13;
  private static final int METHODID_SYNC_TRIGGER_DEFINITIONS = 14;
  private static final int METHODID_LIST_TRIGGER_DELIVERY_ATTEMPTS_BY_ENDPOINT = 15;
  private static final int METHODID_LIST_TRIGGER_DELIVERIES_BY_ENDPOINT = 16;
  private static final int METHODID_LIST_TRIGGER_DELIVERY_ATTEMPTS_BY_MESSAGE = 17;
  private static final int METHODID_LOOKUP_TRIGGER_DELIVERY = 18;
  private static final int METHODID_BATCH_LOOKUP_TRIGGER_DELIVERIES = 19;
  private static final int METHODID_BATCH_RESEND_TRIGGER_DELIVERIES = 20;
  private static final int METHODID_RECOVER_TRIGGER_DELIVERIES = 21;
  private static final int METHODID_TRIGGER_WEBHOOK_WRAPPER = 22;

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
        case METHODID_LIST_AVAILABLE_TRIGGERS:
          serviceImpl.listAvailableTriggers((com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersResponse>) responseObserver);
          break;
        case METHODID_LIST_ELIGIBLE_ACCOUNTS:
          serviceImpl.listEligibleAccounts((com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsResponse>) responseObserver);
          break;
        case METHODID_LIST_TRIGGER_SUBSCRIPTIONS:
          serviceImpl.listTriggerSubscriptions((com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsResponse>) responseObserver);
          break;
        case METHODID_CREATE_TRIGGER_SUBSCRIPTION:
          serviceImpl.createTriggerSubscription((com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.TriggerSubscription>) responseObserver);
          break;
        case METHODID_BATCH_CREATE_TRIGGER_SUBSCRIPTIONS:
          serviceImpl.batchCreateTriggerSubscriptions((com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsResponse>) responseObserver);
          break;
        case METHODID_DELETE_TRIGGER_SUBSCRIPTION:
          serviceImpl.deleteTriggerSubscription((com.scalekit.grpc.scalekit.v1.triggers.DeleteTriggerSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BATCH_DELETE_TRIGGER_SUBSCRIPTIONS:
          serviceImpl.batchDeleteTriggerSubscriptions((com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsResponse>) responseObserver);
          break;
        case METHODID_GET_TRIGGER_ACTIVITY:
          serviceImpl.getTriggerActivity((com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityResponse>) responseObserver);
          break;
        case METHODID_GET_TRIGGER_USAGE:
          serviceImpl.getTriggerUsage((com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageResponse>) responseObserver);
          break;
        case METHODID_GET_TRIGGER_INGRESS_ENDPOINT:
          serviceImpl.getTriggerIngressEndpoint((com.scalekit.grpc.scalekit.v1.triggers.GetTriggerIngressEndpointRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint>) responseObserver);
          break;
        case METHODID_CREATE_TRIGGER_INGRESS_ENDPOINT:
          serviceImpl.createTriggerIngressEndpoint((com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerIngressEndpointRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint>) responseObserver);
          break;
        case METHODID_SET_TRIGGER_SIGNING_SECRET:
          serviceImpl.setTriggerSigningSecret((com.scalekit.grpc.scalekit.v1.triggers.SetTriggerSigningSecretRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint>) responseObserver);
          break;
        case METHODID_CONFIRM_TRIGGER_SIGNING_SECRET_ROTATION:
          serviceImpl.confirmTriggerSigningSecretRotation((com.scalekit.grpc.scalekit.v1.triggers.ConfirmTriggerSigningSecretRotationRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint>) responseObserver);
          break;
        case METHODID_GENERATE_TRIGGER_SIGNING_SECRET:
          serviceImpl.generateTriggerSigningSecret((com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretResponse>) responseObserver);
          break;
        case METHODID_SYNC_TRIGGER_DEFINITIONS:
          serviceImpl.syncTriggerDefinitions((com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsResponse>) responseObserver);
          break;
        case METHODID_LIST_TRIGGER_DELIVERY_ATTEMPTS_BY_ENDPOINT:
          serviceImpl.listTriggerDeliveryAttemptsByEndpoint((com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointResponse>) responseObserver);
          break;
        case METHODID_LIST_TRIGGER_DELIVERIES_BY_ENDPOINT:
          serviceImpl.listTriggerDeliveriesByEndpoint((com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointResponse>) responseObserver);
          break;
        case METHODID_LIST_TRIGGER_DELIVERY_ATTEMPTS_BY_MESSAGE:
          serviceImpl.listTriggerDeliveryAttemptsByMessage((com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageResponse>) responseObserver);
          break;
        case METHODID_LOOKUP_TRIGGER_DELIVERY:
          serviceImpl.lookupTriggerDelivery((com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryResponse>) responseObserver);
          break;
        case METHODID_BATCH_LOOKUP_TRIGGER_DELIVERIES:
          serviceImpl.batchLookupTriggerDeliveries((com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesResponse>) responseObserver);
          break;
        case METHODID_BATCH_RESEND_TRIGGER_DELIVERIES:
          serviceImpl.batchResendTriggerDeliveries((com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesResponse>) responseObserver);
          break;
        case METHODID_RECOVER_TRIGGER_DELIVERIES:
          serviceImpl.recoverTriggerDeliveries((com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesResponse>) responseObserver);
          break;
        case METHODID_TRIGGER_WEBHOOK_WRAPPER:
          serviceImpl.triggerWebhookWrapper((com.scalekit.grpc.scalekit.v1.triggers.TriggerWebhookWrapperRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Struct>) responseObserver);
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
          getListAvailableTriggersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersRequest,
              com.scalekit.grpc.scalekit.v1.triggers.ListAvailableTriggersResponse>(
                service, METHODID_LIST_AVAILABLE_TRIGGERS)))
        .addMethod(
          getListEligibleAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsRequest,
              com.scalekit.grpc.scalekit.v1.triggers.ListEligibleAccountsResponse>(
                service, METHODID_LIST_ELIGIBLE_ACCOUNTS)))
        .addMethod(
          getListTriggerSubscriptionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsRequest,
              com.scalekit.grpc.scalekit.v1.triggers.ListTriggerSubscriptionsResponse>(
                service, METHODID_LIST_TRIGGER_SUBSCRIPTIONS)))
        .addMethod(
          getCreateTriggerSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerSubscriptionRequest,
              com.scalekit.grpc.scalekit.v1.triggers.TriggerSubscription>(
                service, METHODID_CREATE_TRIGGER_SUBSCRIPTION)))
        .addMethod(
          getBatchCreateTriggerSubscriptionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsRequest,
              com.scalekit.grpc.scalekit.v1.triggers.BatchCreateTriggerSubscriptionsResponse>(
                service, METHODID_BATCH_CREATE_TRIGGER_SUBSCRIPTIONS)))
        .addMethod(
          getDeleteTriggerSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.DeleteTriggerSubscriptionRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_TRIGGER_SUBSCRIPTION)))
        .addMethod(
          getBatchDeleteTriggerSubscriptionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsRequest,
              com.scalekit.grpc.scalekit.v1.triggers.BatchDeleteTriggerSubscriptionsResponse>(
                service, METHODID_BATCH_DELETE_TRIGGER_SUBSCRIPTIONS)))
        .addMethod(
          getGetTriggerActivityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityRequest,
              com.scalekit.grpc.scalekit.v1.triggers.GetTriggerActivityResponse>(
                service, METHODID_GET_TRIGGER_ACTIVITY)))
        .addMethod(
          getGetTriggerUsageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageRequest,
              com.scalekit.grpc.scalekit.v1.triggers.GetTriggerUsageResponse>(
                service, METHODID_GET_TRIGGER_USAGE)))
        .addMethod(
          getGetTriggerIngressEndpointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.GetTriggerIngressEndpointRequest,
              com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint>(
                service, METHODID_GET_TRIGGER_INGRESS_ENDPOINT)))
        .addMethod(
          getCreateTriggerIngressEndpointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.CreateTriggerIngressEndpointRequest,
              com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint>(
                service, METHODID_CREATE_TRIGGER_INGRESS_ENDPOINT)))
        .addMethod(
          getSetTriggerSigningSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.SetTriggerSigningSecretRequest,
              com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint>(
                service, METHODID_SET_TRIGGER_SIGNING_SECRET)))
        .addMethod(
          getConfirmTriggerSigningSecretRotationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.ConfirmTriggerSigningSecretRotationRequest,
              com.scalekit.grpc.scalekit.v1.triggers.TriggerIngressEndpoint>(
                service, METHODID_CONFIRM_TRIGGER_SIGNING_SECRET_ROTATION)))
        .addMethod(
          getGenerateTriggerSigningSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretRequest,
              com.scalekit.grpc.scalekit.v1.triggers.GenerateTriggerSigningSecretResponse>(
                service, METHODID_GENERATE_TRIGGER_SIGNING_SECRET)))
        .addMethod(
          getSyncTriggerDefinitionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsRequest,
              com.scalekit.grpc.scalekit.v1.triggers.SyncTriggerDefinitionsResponse>(
                service, METHODID_SYNC_TRIGGER_DEFINITIONS)))
        .addMethod(
          getListTriggerDeliveryAttemptsByEndpointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointRequest,
              com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByEndpointResponse>(
                service, METHODID_LIST_TRIGGER_DELIVERY_ATTEMPTS_BY_ENDPOINT)))
        .addMethod(
          getListTriggerDeliveriesByEndpointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointRequest,
              com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveriesByEndpointResponse>(
                service, METHODID_LIST_TRIGGER_DELIVERIES_BY_ENDPOINT)))
        .addMethod(
          getListTriggerDeliveryAttemptsByMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageRequest,
              com.scalekit.grpc.scalekit.v1.triggers.ListTriggerDeliveryAttemptsByMessageResponse>(
                service, METHODID_LIST_TRIGGER_DELIVERY_ATTEMPTS_BY_MESSAGE)))
        .addMethod(
          getLookupTriggerDeliveryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryRequest,
              com.scalekit.grpc.scalekit.v1.triggers.LookupTriggerDeliveryResponse>(
                service, METHODID_LOOKUP_TRIGGER_DELIVERY)))
        .addMethod(
          getBatchLookupTriggerDeliveriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesRequest,
              com.scalekit.grpc.scalekit.v1.triggers.BatchLookupTriggerDeliveriesResponse>(
                service, METHODID_BATCH_LOOKUP_TRIGGER_DELIVERIES)))
        .addMethod(
          getBatchResendTriggerDeliveriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesRequest,
              com.scalekit.grpc.scalekit.v1.triggers.BatchResendTriggerDeliveriesResponse>(
                service, METHODID_BATCH_RESEND_TRIGGER_DELIVERIES)))
        .addMethod(
          getRecoverTriggerDeliveriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesRequest,
              com.scalekit.grpc.scalekit.v1.triggers.RecoverTriggerDeliveriesResponse>(
                service, METHODID_RECOVER_TRIGGER_DELIVERIES)))
        .addMethod(
          getTriggerWebhookWrapperMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.triggers.TriggerWebhookWrapperRequest,
              com.google.protobuf.Struct>(
                service, METHODID_TRIGGER_WEBHOOK_WRAPPER)))
        .build();
  }

  private static abstract class TriggerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TriggerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.triggers.TriggersProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TriggerService");
    }
  }

  private static final class TriggerServiceFileDescriptorSupplier
      extends TriggerServiceBaseDescriptorSupplier {
    TriggerServiceFileDescriptorSupplier() {}
  }

  private static final class TriggerServiceMethodDescriptorSupplier
      extends TriggerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TriggerServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TriggerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TriggerServiceFileDescriptorSupplier())
              .addMethod(getListAvailableTriggersMethod())
              .addMethod(getListEligibleAccountsMethod())
              .addMethod(getListTriggerSubscriptionsMethod())
              .addMethod(getCreateTriggerSubscriptionMethod())
              .addMethod(getBatchCreateTriggerSubscriptionsMethod())
              .addMethod(getDeleteTriggerSubscriptionMethod())
              .addMethod(getBatchDeleteTriggerSubscriptionsMethod())
              .addMethod(getGetTriggerActivityMethod())
              .addMethod(getGetTriggerUsageMethod())
              .addMethod(getGetTriggerIngressEndpointMethod())
              .addMethod(getCreateTriggerIngressEndpointMethod())
              .addMethod(getSetTriggerSigningSecretMethod())
              .addMethod(getConfirmTriggerSigningSecretRotationMethod())
              .addMethod(getGenerateTriggerSigningSecretMethod())
              .addMethod(getSyncTriggerDefinitionsMethod())
              .addMethod(getListTriggerDeliveryAttemptsByEndpointMethod())
              .addMethod(getListTriggerDeliveriesByEndpointMethod())
              .addMethod(getListTriggerDeliveryAttemptsByMessageMethod())
              .addMethod(getLookupTriggerDeliveryMethod())
              .addMethod(getBatchLookupTriggerDeliveriesMethod())
              .addMethod(getBatchResendTriggerDeliveriesMethod())
              .addMethod(getRecoverTriggerDeliveriesMethod())
              .addMethod(getTriggerWebhookWrapperMethod())
              .build();
        }
      }
    }
    return result;
  }
}
