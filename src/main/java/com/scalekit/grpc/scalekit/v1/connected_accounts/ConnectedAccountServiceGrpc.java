package com.scalekit.grpc.scalekit.v1.connected_accounts;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/connected_accounts/connected_accounts.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConnectedAccountServiceGrpc {

  private ConnectedAccountServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.connected_accounts.ConnectedAccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsRequest,
      com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsResponse> getListConnectedAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListConnectedAccounts",
      requestType = com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsRequest,
      com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsResponse> getListConnectedAccountsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsRequest, com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsResponse> getListConnectedAccountsMethod;
    if ((getListConnectedAccountsMethod = ConnectedAccountServiceGrpc.getListConnectedAccountsMethod) == null) {
      synchronized (ConnectedAccountServiceGrpc.class) {
        if ((getListConnectedAccountsMethod = ConnectedAccountServiceGrpc.getListConnectedAccountsMethod) == null) {
          ConnectedAccountServiceGrpc.getListConnectedAccountsMethod = getListConnectedAccountsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsRequest, com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListConnectedAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectedAccountServiceMethodDescriptorSupplier("ListConnectedAccounts"))
              .build();
        }
      }
    }
    return getListConnectedAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsRequest,
      com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsResponse> getSearchConnectedAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchConnectedAccounts",
      requestType = com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsRequest,
      com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsResponse> getSearchConnectedAccountsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsRequest, com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsResponse> getSearchConnectedAccountsMethod;
    if ((getSearchConnectedAccountsMethod = ConnectedAccountServiceGrpc.getSearchConnectedAccountsMethod) == null) {
      synchronized (ConnectedAccountServiceGrpc.class) {
        if ((getSearchConnectedAccountsMethod = ConnectedAccountServiceGrpc.getSearchConnectedAccountsMethod) == null) {
          ConnectedAccountServiceGrpc.getSearchConnectedAccountsMethod = getSearchConnectedAccountsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsRequest, com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchConnectedAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectedAccountServiceMethodDescriptorSupplier("SearchConnectedAccounts"))
              .build();
        }
      }
    }
    return getSearchConnectedAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountRequest,
      com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountResponse> getCreateConnectedAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateConnectedAccount",
      requestType = com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountRequest,
      com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountResponse> getCreateConnectedAccountMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountRequest, com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountResponse> getCreateConnectedAccountMethod;
    if ((getCreateConnectedAccountMethod = ConnectedAccountServiceGrpc.getCreateConnectedAccountMethod) == null) {
      synchronized (ConnectedAccountServiceGrpc.class) {
        if ((getCreateConnectedAccountMethod = ConnectedAccountServiceGrpc.getCreateConnectedAccountMethod) == null) {
          ConnectedAccountServiceGrpc.getCreateConnectedAccountMethod = getCreateConnectedAccountMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountRequest, com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateConnectedAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectedAccountServiceMethodDescriptorSupplier("CreateConnectedAccount"))
              .build();
        }
      }
    }
    return getCreateConnectedAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountRequest,
      com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountResponse> getUpdateConnectedAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateConnectedAccount",
      requestType = com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountRequest,
      com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountResponse> getUpdateConnectedAccountMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountRequest, com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountResponse> getUpdateConnectedAccountMethod;
    if ((getUpdateConnectedAccountMethod = ConnectedAccountServiceGrpc.getUpdateConnectedAccountMethod) == null) {
      synchronized (ConnectedAccountServiceGrpc.class) {
        if ((getUpdateConnectedAccountMethod = ConnectedAccountServiceGrpc.getUpdateConnectedAccountMethod) == null) {
          ConnectedAccountServiceGrpc.getUpdateConnectedAccountMethod = getUpdateConnectedAccountMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountRequest, com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateConnectedAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectedAccountServiceMethodDescriptorSupplier("UpdateConnectedAccount"))
              .build();
        }
      }
    }
    return getUpdateConnectedAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountRequest,
      com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountResponse> getDeleteConnectedAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteConnectedAccount",
      requestType = com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountRequest,
      com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountResponse> getDeleteConnectedAccountMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountRequest, com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountResponse> getDeleteConnectedAccountMethod;
    if ((getDeleteConnectedAccountMethod = ConnectedAccountServiceGrpc.getDeleteConnectedAccountMethod) == null) {
      synchronized (ConnectedAccountServiceGrpc.class) {
        if ((getDeleteConnectedAccountMethod = ConnectedAccountServiceGrpc.getDeleteConnectedAccountMethod) == null) {
          ConnectedAccountServiceGrpc.getDeleteConnectedAccountMethod = getDeleteConnectedAccountMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountRequest, com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteConnectedAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectedAccountServiceMethodDescriptorSupplier("DeleteConnectedAccount"))
              .build();
        }
      }
    }
    return getDeleteConnectedAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRequest,
      com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountResponse> getGetMagicLinkForConnectedAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMagicLinkForConnectedAccount",
      requestType = com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRequest,
      com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountResponse> getGetMagicLinkForConnectedAccountMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRequest, com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountResponse> getGetMagicLinkForConnectedAccountMethod;
    if ((getGetMagicLinkForConnectedAccountMethod = ConnectedAccountServiceGrpc.getGetMagicLinkForConnectedAccountMethod) == null) {
      synchronized (ConnectedAccountServiceGrpc.class) {
        if ((getGetMagicLinkForConnectedAccountMethod = ConnectedAccountServiceGrpc.getGetMagicLinkForConnectedAccountMethod) == null) {
          ConnectedAccountServiceGrpc.getGetMagicLinkForConnectedAccountMethod = getGetMagicLinkForConnectedAccountMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRequest, com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMagicLinkForConnectedAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectedAccountServiceMethodDescriptorSupplier("GetMagicLinkForConnectedAccount"))
              .build();
        }
      }
    }
    return getGetMagicLinkForConnectedAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierRequest,
      com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierResponse> getGetConnectedAccountAuthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConnectedAccountAuth",
      requestType = com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierRequest,
      com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierResponse> getGetConnectedAccountAuthMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierRequest, com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierResponse> getGetConnectedAccountAuthMethod;
    if ((getGetConnectedAccountAuthMethod = ConnectedAccountServiceGrpc.getGetConnectedAccountAuthMethod) == null) {
      synchronized (ConnectedAccountServiceGrpc.class) {
        if ((getGetConnectedAccountAuthMethod = ConnectedAccountServiceGrpc.getGetConnectedAccountAuthMethod) == null) {
          ConnectedAccountServiceGrpc.getGetConnectedAccountAuthMethod = getGetConnectedAccountAuthMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierRequest, com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConnectedAccountAuth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectedAccountServiceMethodDescriptorSupplier("GetConnectedAccountAuth"))
              .build();
        }
      }
    }
    return getGetConnectedAccountAuthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectRequest,
      com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectResponse> getGetMagicLinkForConnectedAccountWithRedirectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMagicLinkForConnectedAccountWithRedirect",
      requestType = com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectRequest,
      com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectResponse> getGetMagicLinkForConnectedAccountWithRedirectMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectRequest, com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectResponse> getGetMagicLinkForConnectedAccountWithRedirectMethod;
    if ((getGetMagicLinkForConnectedAccountWithRedirectMethod = ConnectedAccountServiceGrpc.getGetMagicLinkForConnectedAccountWithRedirectMethod) == null) {
      synchronized (ConnectedAccountServiceGrpc.class) {
        if ((getGetMagicLinkForConnectedAccountWithRedirectMethod = ConnectedAccountServiceGrpc.getGetMagicLinkForConnectedAccountWithRedirectMethod) == null) {
          ConnectedAccountServiceGrpc.getGetMagicLinkForConnectedAccountWithRedirectMethod = getGetMagicLinkForConnectedAccountWithRedirectMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectRequest, com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMagicLinkForConnectedAccountWithRedirect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectedAccountServiceMethodDescriptorSupplier("GetMagicLinkForConnectedAccountWithRedirect"))
              .build();
        }
      }
    }
    return getGetMagicLinkForConnectedAccountWithRedirectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConnectedAccountServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectedAccountServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectedAccountServiceStub>() {
        @java.lang.Override
        public ConnectedAccountServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectedAccountServiceStub(channel, callOptions);
        }
      };
    return ConnectedAccountServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConnectedAccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectedAccountServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectedAccountServiceBlockingStub>() {
        @java.lang.Override
        public ConnectedAccountServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectedAccountServiceBlockingStub(channel, callOptions);
        }
      };
    return ConnectedAccountServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConnectedAccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectedAccountServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectedAccountServiceFutureStub>() {
        @java.lang.Override
        public ConnectedAccountServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectedAccountServiceFutureStub(channel, callOptions);
        }
      };
    return ConnectedAccountServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void listConnectedAccounts(com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListConnectedAccountsMethod(), responseObserver);
    }

    /**
     */
    default void searchConnectedAccounts(com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchConnectedAccountsMethod(), responseObserver);
    }

    /**
     */
    default void createConnectedAccount(com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateConnectedAccountMethod(), responseObserver);
    }

    /**
     */
    default void updateConnectedAccount(com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateConnectedAccountMethod(), responseObserver);
    }

    /**
     */
    default void deleteConnectedAccount(com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteConnectedAccountMethod(), responseObserver);
    }

    /**
     */
    default void getMagicLinkForConnectedAccount(com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMagicLinkForConnectedAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * this will return the auth details for a connected account by its identifier
     * </pre>
     */
    default void getConnectedAccountAuth(com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConnectedAccountAuthMethod(), responseObserver);
    }

    /**
     */
    default void getMagicLinkForConnectedAccountWithRedirect(com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMagicLinkForConnectedAccountWithRedirectMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ConnectedAccountService.
   */
  public static abstract class ConnectedAccountServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ConnectedAccountServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ConnectedAccountService.
   */
  public static final class ConnectedAccountServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ConnectedAccountServiceStub> {
    private ConnectedAccountServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectedAccountServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectedAccountServiceStub(channel, callOptions);
    }

    /**
     */
    public void listConnectedAccounts(com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListConnectedAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchConnectedAccounts(com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchConnectedAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createConnectedAccount(com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateConnectedAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateConnectedAccount(com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateConnectedAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteConnectedAccount(com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteConnectedAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMagicLinkForConnectedAccount(com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMagicLinkForConnectedAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this will return the auth details for a connected account by its identifier
     * </pre>
     */
    public void getConnectedAccountAuth(com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConnectedAccountAuthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMagicLinkForConnectedAccountWithRedirect(com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMagicLinkForConnectedAccountWithRedirectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ConnectedAccountService.
   */
  public static final class ConnectedAccountServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ConnectedAccountServiceBlockingStub> {
    private ConnectedAccountServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectedAccountServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectedAccountServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsResponse listConnectedAccounts(com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListConnectedAccountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsResponse searchConnectedAccounts(com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchConnectedAccountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountResponse createConnectedAccount(com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateConnectedAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountResponse updateConnectedAccount(com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateConnectedAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountResponse deleteConnectedAccount(com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteConnectedAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountResponse getMagicLinkForConnectedAccount(com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMagicLinkForConnectedAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this will return the auth details for a connected account by its identifier
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierResponse getConnectedAccountAuth(com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConnectedAccountAuthMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectResponse getMagicLinkForConnectedAccountWithRedirect(com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMagicLinkForConnectedAccountWithRedirectMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ConnectedAccountService.
   */
  public static final class ConnectedAccountServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ConnectedAccountServiceFutureStub> {
    private ConnectedAccountServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectedAccountServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectedAccountServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsResponse> listConnectedAccounts(
        com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListConnectedAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsResponse> searchConnectedAccounts(
        com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchConnectedAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountResponse> createConnectedAccount(
        com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateConnectedAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountResponse> updateConnectedAccount(
        com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateConnectedAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountResponse> deleteConnectedAccount(
        com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteConnectedAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountResponse> getMagicLinkForConnectedAccount(
        com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMagicLinkForConnectedAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this will return the auth details for a connected account by its identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierResponse> getConnectedAccountAuth(
        com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConnectedAccountAuthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectResponse> getMagicLinkForConnectedAccountWithRedirect(
        com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMagicLinkForConnectedAccountWithRedirectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_CONNECTED_ACCOUNTS = 0;
  private static final int METHODID_SEARCH_CONNECTED_ACCOUNTS = 1;
  private static final int METHODID_CREATE_CONNECTED_ACCOUNT = 2;
  private static final int METHODID_UPDATE_CONNECTED_ACCOUNT = 3;
  private static final int METHODID_DELETE_CONNECTED_ACCOUNT = 4;
  private static final int METHODID_GET_MAGIC_LINK_FOR_CONNECTED_ACCOUNT = 5;
  private static final int METHODID_GET_CONNECTED_ACCOUNT_AUTH = 6;
  private static final int METHODID_GET_MAGIC_LINK_FOR_CONNECTED_ACCOUNT_WITH_REDIRECT = 7;

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
        case METHODID_LIST_CONNECTED_ACCOUNTS:
          serviceImpl.listConnectedAccounts((com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_CONNECTED_ACCOUNTS:
          serviceImpl.searchConnectedAccounts((com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsResponse>) responseObserver);
          break;
        case METHODID_CREATE_CONNECTED_ACCOUNT:
          serviceImpl.createConnectedAccount((com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CONNECTED_ACCOUNT:
          serviceImpl.updateConnectedAccount((com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountResponse>) responseObserver);
          break;
        case METHODID_DELETE_CONNECTED_ACCOUNT:
          serviceImpl.deleteConnectedAccount((com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountResponse>) responseObserver);
          break;
        case METHODID_GET_MAGIC_LINK_FOR_CONNECTED_ACCOUNT:
          serviceImpl.getMagicLinkForConnectedAccount((com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountResponse>) responseObserver);
          break;
        case METHODID_GET_CONNECTED_ACCOUNT_AUTH:
          serviceImpl.getConnectedAccountAuth((com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierResponse>) responseObserver);
          break;
        case METHODID_GET_MAGIC_LINK_FOR_CONNECTED_ACCOUNT_WITH_REDIRECT:
          serviceImpl.getMagicLinkForConnectedAccountWithRedirect((com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectResponse>) responseObserver);
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
          getListConnectedAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsRequest,
              com.scalekit.grpc.scalekit.v1.connected_accounts.ListConnectedAccountsResponse>(
                service, METHODID_LIST_CONNECTED_ACCOUNTS)))
        .addMethod(
          getSearchConnectedAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsRequest,
              com.scalekit.grpc.scalekit.v1.connected_accounts.SearchConnectedAccountsResponse>(
                service, METHODID_SEARCH_CONNECTED_ACCOUNTS)))
        .addMethod(
          getCreateConnectedAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountRequest,
              com.scalekit.grpc.scalekit.v1.connected_accounts.CreateConnectedAccountResponse>(
                service, METHODID_CREATE_CONNECTED_ACCOUNT)))
        .addMethod(
          getUpdateConnectedAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountRequest,
              com.scalekit.grpc.scalekit.v1.connected_accounts.UpdateConnectedAccountResponse>(
                service, METHODID_UPDATE_CONNECTED_ACCOUNT)))
        .addMethod(
          getDeleteConnectedAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountRequest,
              com.scalekit.grpc.scalekit.v1.connected_accounts.DeleteConnectedAccountResponse>(
                service, METHODID_DELETE_CONNECTED_ACCOUNT)))
        .addMethod(
          getGetMagicLinkForConnectedAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRequest,
              com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountResponse>(
                service, METHODID_GET_MAGIC_LINK_FOR_CONNECTED_ACCOUNT)))
        .addMethod(
          getGetConnectedAccountAuthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierRequest,
              com.scalekit.grpc.scalekit.v1.connected_accounts.GetConnectedAccountByIdentifierResponse>(
                service, METHODID_GET_CONNECTED_ACCOUNT_AUTH)))
        .addMethod(
          getGetMagicLinkForConnectedAccountWithRedirectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectRequest,
              com.scalekit.grpc.scalekit.v1.connected_accounts.GetMagicLinkForConnectedAccountRedirectResponse>(
                service, METHODID_GET_MAGIC_LINK_FOR_CONNECTED_ACCOUNT_WITH_REDIRECT)))
        .build();
  }

  private static abstract class ConnectedAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConnectedAccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.connected_accounts.ConnectedAccountsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConnectedAccountService");
    }
  }

  private static final class ConnectedAccountServiceFileDescriptorSupplier
      extends ConnectedAccountServiceBaseDescriptorSupplier {
    ConnectedAccountServiceFileDescriptorSupplier() {}
  }

  private static final class ConnectedAccountServiceMethodDescriptorSupplier
      extends ConnectedAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ConnectedAccountServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ConnectedAccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConnectedAccountServiceFileDescriptorSupplier())
              .addMethod(getListConnectedAccountsMethod())
              .addMethod(getSearchConnectedAccountsMethod())
              .addMethod(getCreateConnectedAccountMethod())
              .addMethod(getUpdateConnectedAccountMethod())
              .addMethod(getDeleteConnectedAccountMethod())
              .addMethod(getGetMagicLinkForConnectedAccountMethod())
              .addMethod(getGetConnectedAccountAuthMethod())
              .addMethod(getGetMagicLinkForConnectedAccountWithRedirectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
