package com.scalekit.grpc.scalekit.v1.billing;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * BillingService is the workspace-facing surface of the Metronome billing generation: what plans exist,
 * whether the workspace can create production environments, and which plan each environment is on.
 * A workspace is on this generation only if it has a billing_account row; one without stays on the legacy
 * Stripe path and these RPCs report it as not found rather than rendering a plan page that does not apply.
 * See specs/billing_redesign/billing-api.md.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/billing/billing.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BillingServiceGrpc {

  private BillingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.billing.BillingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigRequest,
      com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigResponse> getGetBillingConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillingConfig",
      requestType = com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigRequest,
      com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigResponse> getGetBillingConfigMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigRequest, com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigResponse> getGetBillingConfigMethod;
    if ((getGetBillingConfigMethod = BillingServiceGrpc.getGetBillingConfigMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetBillingConfigMethod = BillingServiceGrpc.getGetBillingConfigMethod) == null) {
          BillingServiceGrpc.getGetBillingConfigMethod = getGetBillingConfigMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigRequest, com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBillingConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetBillingConfig"))
              .build();
        }
      }
    }
    return getGetBillingConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogRequest,
      com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogResponse> getGetBillingCatalogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillingCatalog",
      requestType = com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogRequest,
      com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogResponse> getGetBillingCatalogMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogRequest, com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogResponse> getGetBillingCatalogMethod;
    if ((getGetBillingCatalogMethod = BillingServiceGrpc.getGetBillingCatalogMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetBillingCatalogMethod = BillingServiceGrpc.getGetBillingCatalogMethod) == null) {
          BillingServiceGrpc.getGetBillingCatalogMethod = getGetBillingCatalogMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogRequest, com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBillingCatalog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetBillingCatalog"))
              .build();
        }
      }
    }
    return getGetBillingCatalogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountRequest,
      com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountResponse> getGetBillingAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillingAccount",
      requestType = com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountRequest,
      com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountResponse> getGetBillingAccountMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountRequest, com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountResponse> getGetBillingAccountMethod;
    if ((getGetBillingAccountMethod = BillingServiceGrpc.getGetBillingAccountMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetBillingAccountMethod = BillingServiceGrpc.getGetBillingAccountMethod) == null) {
          BillingServiceGrpc.getGetBillingAccountMethod = getGetBillingAccountMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountRequest, com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBillingAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetBillingAccount"))
              .build();
        }
      }
    }
    return getGetBillingAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodRequest,
      com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodResponse> getAddPaymentMethodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPaymentMethod",
      requestType = com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodRequest,
      com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodResponse> getAddPaymentMethodMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodRequest, com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodResponse> getAddPaymentMethodMethod;
    if ((getAddPaymentMethodMethod = BillingServiceGrpc.getAddPaymentMethodMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getAddPaymentMethodMethod = BillingServiceGrpc.getAddPaymentMethodMethod) == null) {
          BillingServiceGrpc.getAddPaymentMethodMethod = getAddPaymentMethodMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodRequest, com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPaymentMethod"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("AddPaymentMethod"))
              .build();
        }
      }
    }
    return getAddPaymentMethodMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingRequest,
      com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingResponse> getListEnvironmentBillingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEnvironmentBilling",
      requestType = com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingRequest,
      com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingResponse> getListEnvironmentBillingMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingRequest, com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingResponse> getListEnvironmentBillingMethod;
    if ((getListEnvironmentBillingMethod = BillingServiceGrpc.getListEnvironmentBillingMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getListEnvironmentBillingMethod = BillingServiceGrpc.getListEnvironmentBillingMethod) == null) {
          BillingServiceGrpc.getListEnvironmentBillingMethod = getListEnvironmentBillingMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingRequest, com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEnvironmentBilling"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ListEnvironmentBilling"))
              .build();
        }
      }
    }
    return getListEnvironmentBillingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanRequest,
      com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanResponse> getUpdateBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBillingPlan",
      requestType = com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanRequest,
      com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanResponse> getUpdateBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanRequest, com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanResponse> getUpdateBillingPlanMethod;
    if ((getUpdateBillingPlanMethod = BillingServiceGrpc.getUpdateBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getUpdateBillingPlanMethod = BillingServiceGrpc.getUpdateBillingPlanMethod) == null) {
          BillingServiceGrpc.getUpdateBillingPlanMethod = getUpdateBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanRequest, com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("UpdateBillingPlan"))
              .build();
        }
      }
    }
    return getUpdateBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageRequest,
      com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageResponse> getGetBillingUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillingUsage",
      requestType = com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageRequest,
      com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageResponse> getGetBillingUsageMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageRequest, com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageResponse> getGetBillingUsageMethod;
    if ((getGetBillingUsageMethod = BillingServiceGrpc.getGetBillingUsageMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetBillingUsageMethod = BillingServiceGrpc.getGetBillingUsageMethod) == null) {
          BillingServiceGrpc.getGetBillingUsageMethod = getGetBillingUsageMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageRequest, com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBillingUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetBillingUsage"))
              .build();
        }
      }
    }
    return getGetBillingUsageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsRequest,
      com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsResponse> getGetBillingConnectionCountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillingConnectionCounts",
      requestType = com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsRequest,
      com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsResponse> getGetBillingConnectionCountsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsRequest, com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsResponse> getGetBillingConnectionCountsMethod;
    if ((getGetBillingConnectionCountsMethod = BillingServiceGrpc.getGetBillingConnectionCountsMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetBillingConnectionCountsMethod = BillingServiceGrpc.getGetBillingConnectionCountsMethod) == null) {
          BillingServiceGrpc.getGetBillingConnectionCountsMethod = getGetBillingConnectionCountsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsRequest, com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBillingConnectionCounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetBillingConnectionCounts"))
              .build();
        }
      }
    }
    return getGetBillingConnectionCountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlRequest,
      com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlResponse> getGetInvoicesDashboardUrlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInvoicesDashboardUrl",
      requestType = com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlRequest,
      com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlResponse> getGetInvoicesDashboardUrlMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlRequest, com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlResponse> getGetInvoicesDashboardUrlMethod;
    if ((getGetInvoicesDashboardUrlMethod = BillingServiceGrpc.getGetInvoicesDashboardUrlMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetInvoicesDashboardUrlMethod = BillingServiceGrpc.getGetInvoicesDashboardUrlMethod) == null) {
          BillingServiceGrpc.getGetInvoicesDashboardUrlMethod = getGetInvoicesDashboardUrlMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlRequest, com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInvoicesDashboardUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetInvoicesDashboardUrl"))
              .build();
        }
      }
    }
    return getGetInvoicesDashboardUrlMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BillingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingServiceStub>() {
        @java.lang.Override
        public BillingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingServiceStub(channel, callOptions);
        }
      };
    return BillingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BillingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingServiceBlockingStub>() {
        @java.lang.Override
        public BillingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingServiceBlockingStub(channel, callOptions);
        }
      };
    return BillingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BillingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingServiceFutureStub>() {
        @java.lang.Override
        public BillingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingServiceFutureStub(channel, callOptions);
        }
      };
    return BillingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * BillingService is the workspace-facing surface of the Metronome billing generation: what plans exist,
   * whether the workspace can create production environments, and which plan each environment is on.
   * A workspace is on this generation only if it has a billing_account row; one without stays on the legacy
   * Stripe path and these RPCs report it as not found rather than rendering a plan page that does not apply.
   * See specs/billing_redesign/billing-api.md.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetBillingConfig returns configuration for bootstrapping client-side billing integrations.
     * Deliberately carries no dashboard permission, unlike every other RPC here: it returns only the
     * deployment-wide Stripe publishable key, which is designed to be embedded in client-side JavaScript
     * and discloses nothing about the workspace — there is nothing here for billing:read to protect.
     * </pre>
     */
    default void getBillingConfig(com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBillingConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetBillingCatalog returns the plans and prices to render.
     * </pre>
     */
    default void getBillingCatalog(com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBillingCatalogMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetBillingAccount returns the workspace's billing state — the single billing facade for every
     * workspace, whichever billing generation it is on. Never a 404: a workspace with no billing
     * artifacts reports a pending, card-less account.
     * </pre>
     */
    default void getBillingAccount(com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBillingAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddPaymentMethod starts payment-method capture, enrolling the workspace if needed.
     * Named for what it captures: Stripe Checkout runs in setup mode, so no money moves and nothing is
     * charged. Moved here from WorkspaceService, where it was called UnlockProduction.
     * </pre>
     */
    default void addPaymentMethod(com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPaymentMethodMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListEnvironmentBilling lists each production environment's plan.
     * </pre>
     */
    default void listEnvironmentBilling(com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEnvironmentBillingMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateBillingPlan changes an environment's plan on one or more lines.
     * </pre>
     */
    default void updateBillingPlan(com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetBillingUsage returns current-period usage against allowance for every metered
     * entitlement on an environment's plan. Metronome's own embeddable usage dashboard cannot be
     * scoped to one environment (only the invoices dashboard supports a contract_id filter), so this
     * is a first-party view built on the same per-environment usage query this backend already uses
     * for auto-upgrade checks.
     * </pre>
     */
    default void getBillingUsage(com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBillingUsageMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetBillingConnectionCounts returns how many SSO connections and SCIM directories are active in
     * this environment RIGHT NOW — a live database count, deliberately NOT read from GetBillingUsage:
     * that endpoint's current_usage is fractional connection-MONTHS accrued so far in the billing period
     * (e.g. 0.97), which answers "how much will this bill", not "how many exist right now", and reads
     * through Metronome's own ingest pipeline (async, dedup-protected — see specs/billing_redesign/spec.md
     * §9), which can lag a just-created or just-disabled connection by more than an instant. A caller
     * deciding whether creating ONE MORE connection would exceed a plan's included allowance needs the
     * count this RPC gives, not that one.
     * </pre>
     */
    default void getBillingConnectionCounts(com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBillingConnectionCountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetInvoicesDashboardUrl mints a short-lived, iframe-embeddable URL for Metronome's own hosted
     * invoices dashboard, scoped to this one environment's contract via Metronome's contract_id
     * dashboard option — the only dashboard type that supports a per-contract filter at all. Unlike
     * GetBillingUsage, no first-party invoice UI is built here: the invoices dashboard needs no
     * custom rendering, just embedding.
     * </pre>
     */
    default void getInvoicesDashboardUrl(com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInvoicesDashboardUrlMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BillingService.
   * <pre>
   * BillingService is the workspace-facing surface of the Metronome billing generation: what plans exist,
   * whether the workspace can create production environments, and which plan each environment is on.
   * A workspace is on this generation only if it has a billing_account row; one without stays on the legacy
   * Stripe path and these RPCs report it as not found rather than rendering a plan page that does not apply.
   * See specs/billing_redesign/billing-api.md.
   * </pre>
   */
  public static abstract class BillingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BillingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BillingService.
   * <pre>
   * BillingService is the workspace-facing surface of the Metronome billing generation: what plans exist,
   * whether the workspace can create production environments, and which plan each environment is on.
   * A workspace is on this generation only if it has a billing_account row; one without stays on the legacy
   * Stripe path and these RPCs report it as not found rather than rendering a plan page that does not apply.
   * See specs/billing_redesign/billing-api.md.
   * </pre>
   */
  public static final class BillingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BillingServiceStub> {
    private BillingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetBillingConfig returns configuration for bootstrapping client-side billing integrations.
     * Deliberately carries no dashboard permission, unlike every other RPC here: it returns only the
     * deployment-wide Stripe publishable key, which is designed to be embedded in client-side JavaScript
     * and discloses nothing about the workspace — there is nothing here for billing:read to protect.
     * </pre>
     */
    public void getBillingConfig(com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBillingConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetBillingCatalog returns the plans and prices to render.
     * </pre>
     */
    public void getBillingCatalog(com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBillingCatalogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetBillingAccount returns the workspace's billing state — the single billing facade for every
     * workspace, whichever billing generation it is on. Never a 404: a workspace with no billing
     * artifacts reports a pending, card-less account.
     * </pre>
     */
    public void getBillingAccount(com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBillingAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddPaymentMethod starts payment-method capture, enrolling the workspace if needed.
     * Named for what it captures: Stripe Checkout runs in setup mode, so no money moves and nothing is
     * charged. Moved here from WorkspaceService, where it was called UnlockProduction.
     * </pre>
     */
    public void addPaymentMethod(com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPaymentMethodMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListEnvironmentBilling lists each production environment's plan.
     * </pre>
     */
    public void listEnvironmentBilling(com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEnvironmentBillingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateBillingPlan changes an environment's plan on one or more lines.
     * </pre>
     */
    public void updateBillingPlan(com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetBillingUsage returns current-period usage against allowance for every metered
     * entitlement on an environment's plan. Metronome's own embeddable usage dashboard cannot be
     * scoped to one environment (only the invoices dashboard supports a contract_id filter), so this
     * is a first-party view built on the same per-environment usage query this backend already uses
     * for auto-upgrade checks.
     * </pre>
     */
    public void getBillingUsage(com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBillingUsageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetBillingConnectionCounts returns how many SSO connections and SCIM directories are active in
     * this environment RIGHT NOW — a live database count, deliberately NOT read from GetBillingUsage:
     * that endpoint's current_usage is fractional connection-MONTHS accrued so far in the billing period
     * (e.g. 0.97), which answers "how much will this bill", not "how many exist right now", and reads
     * through Metronome's own ingest pipeline (async, dedup-protected — see specs/billing_redesign/spec.md
     * §9), which can lag a just-created or just-disabled connection by more than an instant. A caller
     * deciding whether creating ONE MORE connection would exceed a plan's included allowance needs the
     * count this RPC gives, not that one.
     * </pre>
     */
    public void getBillingConnectionCounts(com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBillingConnectionCountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetInvoicesDashboardUrl mints a short-lived, iframe-embeddable URL for Metronome's own hosted
     * invoices dashboard, scoped to this one environment's contract via Metronome's contract_id
     * dashboard option — the only dashboard type that supports a per-contract filter at all. Unlike
     * GetBillingUsage, no first-party invoice UI is built here: the invoices dashboard needs no
     * custom rendering, just embedding.
     * </pre>
     */
    public void getInvoicesDashboardUrl(com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInvoicesDashboardUrlMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BillingService.
   * <pre>
   * BillingService is the workspace-facing surface of the Metronome billing generation: what plans exist,
   * whether the workspace can create production environments, and which plan each environment is on.
   * A workspace is on this generation only if it has a billing_account row; one without stays on the legacy
   * Stripe path and these RPCs report it as not found rather than rendering a plan page that does not apply.
   * See specs/billing_redesign/billing-api.md.
   * </pre>
   */
  public static final class BillingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BillingServiceBlockingStub> {
    private BillingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetBillingConfig returns configuration for bootstrapping client-side billing integrations.
     * Deliberately carries no dashboard permission, unlike every other RPC here: it returns only the
     * deployment-wide Stripe publishable key, which is designed to be embedded in client-side JavaScript
     * and discloses nothing about the workspace — there is nothing here for billing:read to protect.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigResponse getBillingConfig(com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBillingConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetBillingCatalog returns the plans and prices to render.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogResponse getBillingCatalog(com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBillingCatalogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetBillingAccount returns the workspace's billing state — the single billing facade for every
     * workspace, whichever billing generation it is on. Never a 404: a workspace with no billing
     * artifacts reports a pending, card-less account.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountResponse getBillingAccount(com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBillingAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddPaymentMethod starts payment-method capture, enrolling the workspace if needed.
     * Named for what it captures: Stripe Checkout runs in setup mode, so no money moves and nothing is
     * charged. Moved here from WorkspaceService, where it was called UnlockProduction.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodResponse addPaymentMethod(com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPaymentMethodMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListEnvironmentBilling lists each production environment's plan.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingResponse listEnvironmentBilling(com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEnvironmentBillingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateBillingPlan changes an environment's plan on one or more lines.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanResponse updateBillingPlan(com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetBillingUsage returns current-period usage against allowance for every metered
     * entitlement on an environment's plan. Metronome's own embeddable usage dashboard cannot be
     * scoped to one environment (only the invoices dashboard supports a contract_id filter), so this
     * is a first-party view built on the same per-environment usage query this backend already uses
     * for auto-upgrade checks.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageResponse getBillingUsage(com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBillingUsageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetBillingConnectionCounts returns how many SSO connections and SCIM directories are active in
     * this environment RIGHT NOW — a live database count, deliberately NOT read from GetBillingUsage:
     * that endpoint's current_usage is fractional connection-MONTHS accrued so far in the billing period
     * (e.g. 0.97), which answers "how much will this bill", not "how many exist right now", and reads
     * through Metronome's own ingest pipeline (async, dedup-protected — see specs/billing_redesign/spec.md
     * §9), which can lag a just-created or just-disabled connection by more than an instant. A caller
     * deciding whether creating ONE MORE connection would exceed a plan's included allowance needs the
     * count this RPC gives, not that one.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsResponse getBillingConnectionCounts(com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBillingConnectionCountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetInvoicesDashboardUrl mints a short-lived, iframe-embeddable URL for Metronome's own hosted
     * invoices dashboard, scoped to this one environment's contract via Metronome's contract_id
     * dashboard option — the only dashboard type that supports a per-contract filter at all. Unlike
     * GetBillingUsage, no first-party invoice UI is built here: the invoices dashboard needs no
     * custom rendering, just embedding.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlResponse getInvoicesDashboardUrl(com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInvoicesDashboardUrlMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BillingService.
   * <pre>
   * BillingService is the workspace-facing surface of the Metronome billing generation: what plans exist,
   * whether the workspace can create production environments, and which plan each environment is on.
   * A workspace is on this generation only if it has a billing_account row; one without stays on the legacy
   * Stripe path and these RPCs report it as not found rather than rendering a plan page that does not apply.
   * See specs/billing_redesign/billing-api.md.
   * </pre>
   */
  public static final class BillingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BillingServiceFutureStub> {
    private BillingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetBillingConfig returns configuration for bootstrapping client-side billing integrations.
     * Deliberately carries no dashboard permission, unlike every other RPC here: it returns only the
     * deployment-wide Stripe publishable key, which is designed to be embedded in client-side JavaScript
     * and discloses nothing about the workspace — there is nothing here for billing:read to protect.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigResponse> getBillingConfig(
        com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBillingConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetBillingCatalog returns the plans and prices to render.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogResponse> getBillingCatalog(
        com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBillingCatalogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetBillingAccount returns the workspace's billing state — the single billing facade for every
     * workspace, whichever billing generation it is on. Never a 404: a workspace with no billing
     * artifacts reports a pending, card-less account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountResponse> getBillingAccount(
        com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBillingAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddPaymentMethod starts payment-method capture, enrolling the workspace if needed.
     * Named for what it captures: Stripe Checkout runs in setup mode, so no money moves and nothing is
     * charged. Moved here from WorkspaceService, where it was called UnlockProduction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodResponse> addPaymentMethod(
        com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPaymentMethodMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListEnvironmentBilling lists each production environment's plan.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingResponse> listEnvironmentBilling(
        com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEnvironmentBillingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateBillingPlan changes an environment's plan on one or more lines.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanResponse> updateBillingPlan(
        com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetBillingUsage returns current-period usage against allowance for every metered
     * entitlement on an environment's plan. Metronome's own embeddable usage dashboard cannot be
     * scoped to one environment (only the invoices dashboard supports a contract_id filter), so this
     * is a first-party view built on the same per-environment usage query this backend already uses
     * for auto-upgrade checks.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageResponse> getBillingUsage(
        com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBillingUsageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetBillingConnectionCounts returns how many SSO connections and SCIM directories are active in
     * this environment RIGHT NOW — a live database count, deliberately NOT read from GetBillingUsage:
     * that endpoint's current_usage is fractional connection-MONTHS accrued so far in the billing period
     * (e.g. 0.97), which answers "how much will this bill", not "how many exist right now", and reads
     * through Metronome's own ingest pipeline (async, dedup-protected — see specs/billing_redesign/spec.md
     * §9), which can lag a just-created or just-disabled connection by more than an instant. A caller
     * deciding whether creating ONE MORE connection would exceed a plan's included allowance needs the
     * count this RPC gives, not that one.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsResponse> getBillingConnectionCounts(
        com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBillingConnectionCountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetInvoicesDashboardUrl mints a short-lived, iframe-embeddable URL for Metronome's own hosted
     * invoices dashboard, scoped to this one environment's contract via Metronome's contract_id
     * dashboard option — the only dashboard type that supports a per-contract filter at all. Unlike
     * GetBillingUsage, no first-party invoice UI is built here: the invoices dashboard needs no
     * custom rendering, just embedding.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlResponse> getInvoicesDashboardUrl(
        com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInvoicesDashboardUrlMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BILLING_CONFIG = 0;
  private static final int METHODID_GET_BILLING_CATALOG = 1;
  private static final int METHODID_GET_BILLING_ACCOUNT = 2;
  private static final int METHODID_ADD_PAYMENT_METHOD = 3;
  private static final int METHODID_LIST_ENVIRONMENT_BILLING = 4;
  private static final int METHODID_UPDATE_BILLING_PLAN = 5;
  private static final int METHODID_GET_BILLING_USAGE = 6;
  private static final int METHODID_GET_BILLING_CONNECTION_COUNTS = 7;
  private static final int METHODID_GET_INVOICES_DASHBOARD_URL = 8;

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
        case METHODID_GET_BILLING_CONFIG:
          serviceImpl.getBillingConfig((com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigResponse>) responseObserver);
          break;
        case METHODID_GET_BILLING_CATALOG:
          serviceImpl.getBillingCatalog((com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogResponse>) responseObserver);
          break;
        case METHODID_GET_BILLING_ACCOUNT:
          serviceImpl.getBillingAccount((com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountResponse>) responseObserver);
          break;
        case METHODID_ADD_PAYMENT_METHOD:
          serviceImpl.addPaymentMethod((com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodResponse>) responseObserver);
          break;
        case METHODID_LIST_ENVIRONMENT_BILLING:
          serviceImpl.listEnvironmentBilling((com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BILLING_PLAN:
          serviceImpl.updateBillingPlan((com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanResponse>) responseObserver);
          break;
        case METHODID_GET_BILLING_USAGE:
          serviceImpl.getBillingUsage((com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageResponse>) responseObserver);
          break;
        case METHODID_GET_BILLING_CONNECTION_COUNTS:
          serviceImpl.getBillingConnectionCounts((com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsResponse>) responseObserver);
          break;
        case METHODID_GET_INVOICES_DASHBOARD_URL:
          serviceImpl.getInvoicesDashboardUrl((com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlResponse>) responseObserver);
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
          getGetBillingConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigRequest,
              com.scalekit.grpc.scalekit.v1.billing.GetBillingConfigResponse>(
                service, METHODID_GET_BILLING_CONFIG)))
        .addMethod(
          getGetBillingCatalogMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogRequest,
              com.scalekit.grpc.scalekit.v1.billing.GetBillingCatalogResponse>(
                service, METHODID_GET_BILLING_CATALOG)))
        .addMethod(
          getGetBillingAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountRequest,
              com.scalekit.grpc.scalekit.v1.billing.GetBillingAccountResponse>(
                service, METHODID_GET_BILLING_ACCOUNT)))
        .addMethod(
          getAddPaymentMethodMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodRequest,
              com.scalekit.grpc.scalekit.v1.billing.AddPaymentMethodResponse>(
                service, METHODID_ADD_PAYMENT_METHOD)))
        .addMethod(
          getListEnvironmentBillingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingRequest,
              com.scalekit.grpc.scalekit.v1.billing.ListEnvironmentBillingResponse>(
                service, METHODID_LIST_ENVIRONMENT_BILLING)))
        .addMethod(
          getUpdateBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanRequest,
              com.scalekit.grpc.scalekit.v1.billing.UpdateBillingPlanResponse>(
                service, METHODID_UPDATE_BILLING_PLAN)))
        .addMethod(
          getGetBillingUsageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageRequest,
              com.scalekit.grpc.scalekit.v1.billing.GetBillingUsageResponse>(
                service, METHODID_GET_BILLING_USAGE)))
        .addMethod(
          getGetBillingConnectionCountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsRequest,
              com.scalekit.grpc.scalekit.v1.billing.GetBillingConnectionCountsResponse>(
                service, METHODID_GET_BILLING_CONNECTION_COUNTS)))
        .addMethod(
          getGetInvoicesDashboardUrlMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlRequest,
              com.scalekit.grpc.scalekit.v1.billing.GetInvoicesDashboardUrlResponse>(
                service, METHODID_GET_INVOICES_DASHBOARD_URL)))
        .build();
  }

  private static abstract class BillingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BillingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.billing.BillingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BillingService");
    }
  }

  private static final class BillingServiceFileDescriptorSupplier
      extends BillingServiceBaseDescriptorSupplier {
    BillingServiceFileDescriptorSupplier() {}
  }

  private static final class BillingServiceMethodDescriptorSupplier
      extends BillingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BillingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BillingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BillingServiceFileDescriptorSupplier())
              .addMethod(getGetBillingConfigMethod())
              .addMethod(getGetBillingCatalogMethod())
              .addMethod(getGetBillingAccountMethod())
              .addMethod(getAddPaymentMethodMethod())
              .addMethod(getListEnvironmentBillingMethod())
              .addMethod(getUpdateBillingPlanMethod())
              .addMethod(getGetBillingUsageMethod())
              .addMethod(getGetBillingConnectionCountsMethod())
              .addMethod(getGetInvoicesDashboardUrlMethod())
              .build();
        }
      }
    }
    return result;
  }
}
