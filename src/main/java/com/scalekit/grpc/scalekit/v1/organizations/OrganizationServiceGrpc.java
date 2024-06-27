package com.scalekit.grpc.scalekit.v1.organizations;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: scalekit/v1/organizations/organizations.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OrganizationServiceGrpc {

  private OrganizationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.organizations.OrganizationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationRequest,
      com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationResponse> getCreateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrganization",
      requestType = com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationRequest,
      com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationResponse> getCreateOrganizationMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationRequest, com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationResponse> getCreateOrganizationMethod;
    if ((getCreateOrganizationMethod = OrganizationServiceGrpc.getCreateOrganizationMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getCreateOrganizationMethod = OrganizationServiceGrpc.getCreateOrganizationMethod) == null) {
          OrganizationServiceGrpc.getCreateOrganizationMethod = getCreateOrganizationMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationRequest, com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("CreateOrganization"))
              .build();
        }
      }
    }
    return getCreateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationRequest,
      com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationResponse> getUpdateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganization",
      requestType = com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationRequest,
      com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationResponse> getUpdateOrganizationMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationRequest, com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationResponse> getUpdateOrganizationMethod;
    if ((getUpdateOrganizationMethod = OrganizationServiceGrpc.getUpdateOrganizationMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getUpdateOrganizationMethod = OrganizationServiceGrpc.getUpdateOrganizationMethod) == null) {
          OrganizationServiceGrpc.getUpdateOrganizationMethod = getUpdateOrganizationMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationRequest, com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("UpdateOrganization"))
              .build();
        }
      }
    }
    return getUpdateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationRequest,
      com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationResponse> getGetOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganization",
      requestType = com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationRequest,
      com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationResponse> getGetOrganizationMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationRequest, com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationResponse> getGetOrganizationMethod;
    if ((getGetOrganizationMethod = OrganizationServiceGrpc.getGetOrganizationMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getGetOrganizationMethod = OrganizationServiceGrpc.getGetOrganizationMethod) == null) {
          OrganizationServiceGrpc.getGetOrganizationMethod = getGetOrganizationMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationRequest, com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("GetOrganization"))
              .build();
        }
      }
    }
    return getGetOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsRequest,
      com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsResponse> getListOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrganization",
      requestType = com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsRequest,
      com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsResponse> getListOrganizationMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsRequest, com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsResponse> getListOrganizationMethod;
    if ((getListOrganizationMethod = OrganizationServiceGrpc.getListOrganizationMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getListOrganizationMethod = OrganizationServiceGrpc.getListOrganizationMethod) == null) {
          OrganizationServiceGrpc.getListOrganizationMethod = getListOrganizationMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsRequest, com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("ListOrganization"))
              .build();
        }
      }
    }
    return getListOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsRequest,
      com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse> getSearchOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchOrganization",
      requestType = com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsRequest,
      com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse> getSearchOrganizationMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsRequest, com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse> getSearchOrganizationMethod;
    if ((getSearchOrganizationMethod = OrganizationServiceGrpc.getSearchOrganizationMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getSearchOrganizationMethod = OrganizationServiceGrpc.getSearchOrganizationMethod) == null) {
          OrganizationServiceGrpc.getSearchOrganizationMethod = getSearchOrganizationMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsRequest, com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("SearchOrganization"))
              .build();
        }
      }
    }
    return getSearchOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.DeleteOrganizationRequest,
      com.google.protobuf.Empty> getDeleteOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOrganization",
      requestType = com.scalekit.grpc.scalekit.v1.organizations.DeleteOrganizationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.DeleteOrganizationRequest,
      com.google.protobuf.Empty> getDeleteOrganizationMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.DeleteOrganizationRequest, com.google.protobuf.Empty> getDeleteOrganizationMethod;
    if ((getDeleteOrganizationMethod = OrganizationServiceGrpc.getDeleteOrganizationMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getDeleteOrganizationMethod = OrganizationServiceGrpc.getDeleteOrganizationMethod) == null) {
          OrganizationServiceGrpc.getDeleteOrganizationMethod = getDeleteOrganizationMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.organizations.DeleteOrganizationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.organizations.DeleteOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("DeleteOrganization"))
              .build();
        }
      }
    }
    return getDeleteOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkRequest,
      com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkResponse> getGeneratePortalLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GeneratePortalLink",
      requestType = com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkRequest,
      com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkResponse> getGeneratePortalLinkMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkRequest, com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkResponse> getGeneratePortalLinkMethod;
    if ((getGeneratePortalLinkMethod = OrganizationServiceGrpc.getGeneratePortalLinkMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getGeneratePortalLinkMethod = OrganizationServiceGrpc.getGeneratePortalLinkMethod) == null) {
          OrganizationServiceGrpc.getGeneratePortalLinkMethod = getGeneratePortalLinkMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkRequest, com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GeneratePortalLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("GeneratePortalLink"))
              .build();
        }
      }
    }
    return getGeneratePortalLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkRequest,
      com.google.protobuf.Empty> getDeletePortalLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePortalLink",
      requestType = com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkRequest,
      com.google.protobuf.Empty> getDeletePortalLinkMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkRequest, com.google.protobuf.Empty> getDeletePortalLinkMethod;
    if ((getDeletePortalLinkMethod = OrganizationServiceGrpc.getDeletePortalLinkMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getDeletePortalLinkMethod = OrganizationServiceGrpc.getDeletePortalLinkMethod) == null) {
          OrganizationServiceGrpc.getDeletePortalLinkMethod = getDeletePortalLinkMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePortalLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("DeletePortalLink"))
              .build();
        }
      }
    }
    return getDeletePortalLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkByIdRequest,
      com.google.protobuf.Empty> getDeletePortalLinkByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePortalLinkByID",
      requestType = com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkByIdRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkByIdRequest,
      com.google.protobuf.Empty> getDeletePortalLinkByIDMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkByIdRequest, com.google.protobuf.Empty> getDeletePortalLinkByIDMethod;
    if ((getDeletePortalLinkByIDMethod = OrganizationServiceGrpc.getDeletePortalLinkByIDMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getDeletePortalLinkByIDMethod = OrganizationServiceGrpc.getDeletePortalLinkByIDMethod) == null) {
          OrganizationServiceGrpc.getDeletePortalLinkByIDMethod = getDeletePortalLinkByIDMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkByIdRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePortalLinkByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("DeletePortalLinkByID"))
              .build();
        }
      }
    }
    return getDeletePortalLinkByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinkRequest,
      com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse> getGetPortalLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPortalLinks",
      requestType = com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinkRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinkRequest,
      com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse> getGetPortalLinksMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinkRequest, com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse> getGetPortalLinksMethod;
    if ((getGetPortalLinksMethod = OrganizationServiceGrpc.getGetPortalLinksMethod) == null) {
      synchronized (OrganizationServiceGrpc.class) {
        if ((getGetPortalLinksMethod = OrganizationServiceGrpc.getGetPortalLinksMethod) == null) {
          OrganizationServiceGrpc.getGetPortalLinksMethod = getGetPortalLinksMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinkRequest, com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPortalLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationServiceMethodDescriptorSupplier("GetPortalLinks"))
              .build();
        }
      }
    }
    return getGetPortalLinksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrganizationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizationServiceStub>() {
        @java.lang.Override
        public OrganizationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizationServiceStub(channel, callOptions);
        }
      };
    return OrganizationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrganizationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizationServiceBlockingStub>() {
        @java.lang.Override
        public OrganizationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizationServiceBlockingStub(channel, callOptions);
        }
      };
    return OrganizationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrganizationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizationServiceFutureStub>() {
        @java.lang.Override
        public OrganizationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizationServiceFutureStub(channel, callOptions);
        }
      };
    return OrganizationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create Organization
     * </pre>
     */
    default void createOrganization(com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrganizationMethod(), responseObserver);
    }

    /**
     */
    default void updateOrganization(com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationMethod(), responseObserver);
    }

    /**
     */
    default void getOrganization(com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationMethod(), responseObserver);
    }

    /**
     */
    default void listOrganization(com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrganizationMethod(), responseObserver);
    }

    /**
     */
    default void searchOrganization(com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     *Delete an Organization
     * </pre>
     */
    default void deleteOrganization(com.scalekit.grpc.scalekit.v1.organizations.DeleteOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     *Generate Portal Link for Org
     * </pre>
     */
    default void generatePortalLink(com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGeneratePortalLinkMethod(), responseObserver);
    }

    /**
     */
    default void deletePortalLink(com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePortalLinkMethod(), responseObserver);
    }

    /**
     */
    default void deletePortalLinkByID(com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkByIdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePortalLinkByIDMethod(), responseObserver);
    }

    /**
     */
    default void getPortalLinks(com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinkRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPortalLinksMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OrganizationService.
   */
  public static abstract class OrganizationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OrganizationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OrganizationService.
   */
  public static final class OrganizationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OrganizationServiceStub> {
    private OrganizationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create Organization
     * </pre>
     */
    public void createOrganization(com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOrganization(com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrganization(com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOrganization(com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchOrganization(com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Delete an Organization
     * </pre>
     */
    public void deleteOrganization(com.scalekit.grpc.scalekit.v1.organizations.DeleteOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Generate Portal Link for Org
     * </pre>
     */
    public void generatePortalLink(com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGeneratePortalLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePortalLink(com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePortalLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePortalLinkByID(com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkByIdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePortalLinkByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPortalLinks(com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinkRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPortalLinksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OrganizationService.
   */
  public static final class OrganizationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OrganizationServiceBlockingStub> {
    private OrganizationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create Organization
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationResponse createOrganization(com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationResponse updateOrganization(com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationResponse getOrganization(com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsResponse listOrganization(com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse searchOrganization(com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Delete an Organization
     * </pre>
     */
    public com.google.protobuf.Empty deleteOrganization(com.scalekit.grpc.scalekit.v1.organizations.DeleteOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Generate Portal Link for Org
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkResponse generatePortalLink(com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGeneratePortalLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deletePortalLink(com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePortalLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deletePortalLinkByID(com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePortalLinkByIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse getPortalLinks(com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPortalLinksMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OrganizationService.
   */
  public static final class OrganizationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OrganizationServiceFutureStub> {
    private OrganizationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create Organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationResponse> createOrganization(
        com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationResponse> updateOrganization(
        com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationResponse> getOrganization(
        com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsResponse> listOrganization(
        com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse> searchOrganization(
        com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Delete an Organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteOrganization(
        com.scalekit.grpc.scalekit.v1.organizations.DeleteOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Generate Portal Link for Org
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkResponse> generatePortalLink(
        com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGeneratePortalLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deletePortalLink(
        com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePortalLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deletePortalLinkByID(
        com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePortalLinkByIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse> getPortalLinks(
        com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPortalLinksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ORGANIZATION = 0;
  private static final int METHODID_UPDATE_ORGANIZATION = 1;
  private static final int METHODID_GET_ORGANIZATION = 2;
  private static final int METHODID_LIST_ORGANIZATION = 3;
  private static final int METHODID_SEARCH_ORGANIZATION = 4;
  private static final int METHODID_DELETE_ORGANIZATION = 5;
  private static final int METHODID_GENERATE_PORTAL_LINK = 6;
  private static final int METHODID_DELETE_PORTAL_LINK = 7;
  private static final int METHODID_DELETE_PORTAL_LINK_BY_ID = 8;
  private static final int METHODID_GET_PORTAL_LINKS = 9;

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
        case METHODID_CREATE_ORGANIZATION:
          serviceImpl.createOrganization((com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION:
          serviceImpl.updateOrganization((com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION:
          serviceImpl.getOrganization((com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationResponse>) responseObserver);
          break;
        case METHODID_LIST_ORGANIZATION:
          serviceImpl.listOrganization((com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ORGANIZATION:
          serviceImpl.searchOrganization((com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse>) responseObserver);
          break;
        case METHODID_DELETE_ORGANIZATION:
          serviceImpl.deleteOrganization((com.scalekit.grpc.scalekit.v1.organizations.DeleteOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GENERATE_PORTAL_LINK:
          serviceImpl.generatePortalLink((com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkResponse>) responseObserver);
          break;
        case METHODID_DELETE_PORTAL_LINK:
          serviceImpl.deletePortalLink((com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_PORTAL_LINK_BY_ID:
          serviceImpl.deletePortalLinkByID((com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_PORTAL_LINKS:
          serviceImpl.getPortalLinks((com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse>) responseObserver);
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
          getCreateOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationRequest,
              com.scalekit.grpc.scalekit.v1.organizations.CreateOrganizationResponse>(
                service, METHODID_CREATE_ORGANIZATION)))
        .addMethod(
          getUpdateOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationRequest,
              com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganizationResponse>(
                service, METHODID_UPDATE_ORGANIZATION)))
        .addMethod(
          getGetOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationRequest,
              com.scalekit.grpc.scalekit.v1.organizations.GetOrganizationResponse>(
                service, METHODID_GET_ORGANIZATION)))
        .addMethod(
          getListOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsRequest,
              com.scalekit.grpc.scalekit.v1.organizations.ListOrganizationsResponse>(
                service, METHODID_LIST_ORGANIZATION)))
        .addMethod(
          getSearchOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsRequest,
              com.scalekit.grpc.scalekit.v1.organizations.SearchOrganizationsResponse>(
                service, METHODID_SEARCH_ORGANIZATION)))
        .addMethod(
          getDeleteOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.organizations.DeleteOrganizationRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ORGANIZATION)))
        .addMethod(
          getGeneratePortalLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkRequest,
              com.scalekit.grpc.scalekit.v1.organizations.GeneratePortalLinkResponse>(
                service, METHODID_GENERATE_PORTAL_LINK)))
        .addMethod(
          getDeletePortalLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_PORTAL_LINK)))
        .addMethod(
          getDeletePortalLinkByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.organizations.DeletePortalLinkByIdRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_PORTAL_LINK_BY_ID)))
        .addMethod(
          getGetPortalLinksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinkRequest,
              com.scalekit.grpc.scalekit.v1.organizations.GetPortalLinksResponse>(
                service, METHODID_GET_PORTAL_LINKS)))
        .build();
  }

  private static abstract class OrganizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrganizationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.organizations.OrganizationsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrganizationService");
    }
  }

  private static final class OrganizationServiceFileDescriptorSupplier
      extends OrganizationServiceBaseDescriptorSupplier {
    OrganizationServiceFileDescriptorSupplier() {}
  }

  private static final class OrganizationServiceMethodDescriptorSupplier
      extends OrganizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OrganizationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OrganizationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrganizationServiceFileDescriptorSupplier())
              .addMethod(getCreateOrganizationMethod())
              .addMethod(getUpdateOrganizationMethod())
              .addMethod(getGetOrganizationMethod())
              .addMethod(getListOrganizationMethod())
              .addMethod(getSearchOrganizationMethod())
              .addMethod(getDeleteOrganizationMethod())
              .addMethod(getGeneratePortalLinkMethod())
              .addMethod(getDeletePortalLinkMethod())
              .addMethod(getDeletePortalLinkByIDMethod())
              .addMethod(getGetPortalLinksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
