package com.scalekit.grpc.scalekit.v1.gateway;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * GatewayService manages Scalekit's built-in MCP Gateway — a per-environment
 * MCP protocol endpoint mounted at &lt;env_url&gt;/mcp. Phase 0 ships
 * enable + read; lifecycle (disable, rotate, update) lands in Phase 1.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/gateway/gateway.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GatewayServiceGrpc {

  private GatewayServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.gateway.GatewayService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayRequest,
      com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayResponse> getEnableGatewayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableGateway",
      requestType = com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayRequest,
      com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayResponse> getEnableGatewayMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayRequest, com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayResponse> getEnableGatewayMethod;
    if ((getEnableGatewayMethod = GatewayServiceGrpc.getEnableGatewayMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getEnableGatewayMethod = GatewayServiceGrpc.getEnableGatewayMethod) == null) {
          GatewayServiceGrpc.getEnableGatewayMethod = getEnableGatewayMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayRequest, com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableGateway"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("EnableGateway"))
              .build();
        }
      }
    }
    return getEnableGatewayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.GetGatewayRequest,
      com.scalekit.grpc.scalekit.v1.gateway.GetGatewayResponse> getGetGatewayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGateway",
      requestType = com.scalekit.grpc.scalekit.v1.gateway.GetGatewayRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.gateway.GetGatewayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.GetGatewayRequest,
      com.scalekit.grpc.scalekit.v1.gateway.GetGatewayResponse> getGetGatewayMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.GetGatewayRequest, com.scalekit.grpc.scalekit.v1.gateway.GetGatewayResponse> getGetGatewayMethod;
    if ((getGetGatewayMethod = GatewayServiceGrpc.getGetGatewayMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getGetGatewayMethod = GatewayServiceGrpc.getGetGatewayMethod) == null) {
          GatewayServiceGrpc.getGetGatewayMethod = getGetGatewayMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.gateway.GetGatewayRequest, com.scalekit.grpc.scalekit.v1.gateway.GetGatewayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGateway"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.GetGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.GetGatewayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("GetGateway"))
              .build();
        }
      }
    }
    return getGetGatewayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityRequest,
      com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityResponse> getSetupGatewayIdentityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetupGatewayIdentity",
      requestType = com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityRequest,
      com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityResponse> getSetupGatewayIdentityMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityRequest, com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityResponse> getSetupGatewayIdentityMethod;
    if ((getSetupGatewayIdentityMethod = GatewayServiceGrpc.getSetupGatewayIdentityMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getSetupGatewayIdentityMethod = GatewayServiceGrpc.getSetupGatewayIdentityMethod) == null) {
          GatewayServiceGrpc.getSetupGatewayIdentityMethod = getSetupGatewayIdentityMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityRequest, com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetupGatewayIdentity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("SetupGatewayIdentity"))
              .build();
        }
      }
    }
    return getSetupGatewayIdentityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayRequest,
      com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayResponse> getDisableGatewayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableGateway",
      requestType = com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayRequest,
      com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayResponse> getDisableGatewayMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayRequest, com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayResponse> getDisableGatewayMethod;
    if ((getDisableGatewayMethod = GatewayServiceGrpc.getDisableGatewayMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getDisableGatewayMethod = GatewayServiceGrpc.getDisableGatewayMethod) == null) {
          GatewayServiceGrpc.getDisableGatewayMethod = getDisableGatewayMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayRequest, com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableGateway"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("DisableGateway"))
              .build();
        }
      }
    }
    return getDisableGatewayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsRequest,
      com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsResponse> getListGatewayGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGatewayGroups",
      requestType = com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsRequest,
      com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsResponse> getListGatewayGroupsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsRequest, com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsResponse> getListGatewayGroupsMethod;
    if ((getListGatewayGroupsMethod = GatewayServiceGrpc.getListGatewayGroupsMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getListGatewayGroupsMethod = GatewayServiceGrpc.getListGatewayGroupsMethod) == null) {
          GatewayServiceGrpc.getListGatewayGroupsMethod = getListGatewayGroupsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsRequest, com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListGatewayGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("ListGatewayGroups"))
              .build();
        }
      }
    }
    return getListGatewayGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupRequest,
      com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupResponse> getCreateManualGatewayGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateManualGatewayGroup",
      requestType = com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupRequest,
      com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupResponse> getCreateManualGatewayGroupMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupRequest, com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupResponse> getCreateManualGatewayGroupMethod;
    if ((getCreateManualGatewayGroupMethod = GatewayServiceGrpc.getCreateManualGatewayGroupMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getCreateManualGatewayGroupMethod = GatewayServiceGrpc.getCreateManualGatewayGroupMethod) == null) {
          GatewayServiceGrpc.getCreateManualGatewayGroupMethod = getCreateManualGatewayGroupMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupRequest, com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateManualGatewayGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("CreateManualGatewayGroup"))
              .build();
        }
      }
    }
    return getCreateManualGatewayGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupRequest,
      com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupResponse> getUpdateManualGatewayGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateManualGatewayGroup",
      requestType = com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupRequest,
      com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupResponse> getUpdateManualGatewayGroupMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupRequest, com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupResponse> getUpdateManualGatewayGroupMethod;
    if ((getUpdateManualGatewayGroupMethod = GatewayServiceGrpc.getUpdateManualGatewayGroupMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getUpdateManualGatewayGroupMethod = GatewayServiceGrpc.getUpdateManualGatewayGroupMethod) == null) {
          GatewayServiceGrpc.getUpdateManualGatewayGroupMethod = getUpdateManualGatewayGroupMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupRequest, com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateManualGatewayGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("UpdateManualGatewayGroup"))
              .build();
        }
      }
    }
    return getUpdateManualGatewayGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupRequest,
      com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupResponse> getDeleteManualGatewayGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteManualGatewayGroup",
      requestType = com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupRequest,
      com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupResponse> getDeleteManualGatewayGroupMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupRequest, com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupResponse> getDeleteManualGatewayGroupMethod;
    if ((getDeleteManualGatewayGroupMethod = GatewayServiceGrpc.getDeleteManualGatewayGroupMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getDeleteManualGatewayGroupMethod = GatewayServiceGrpc.getDeleteManualGatewayGroupMethod) == null) {
          GatewayServiceGrpc.getDeleteManualGatewayGroupMethod = getDeleteManualGatewayGroupMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupRequest, com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteManualGatewayGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("DeleteManualGatewayGroup"))
              .build();
        }
      }
    }
    return getDeleteManualGatewayGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersRequest,
      com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersResponse> getListManualGatewayGroupMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListManualGatewayGroupMembers",
      requestType = com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersRequest,
      com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersResponse> getListManualGatewayGroupMembersMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersRequest, com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersResponse> getListManualGatewayGroupMembersMethod;
    if ((getListManualGatewayGroupMembersMethod = GatewayServiceGrpc.getListManualGatewayGroupMembersMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getListManualGatewayGroupMembersMethod = GatewayServiceGrpc.getListManualGatewayGroupMembersMethod) == null) {
          GatewayServiceGrpc.getListManualGatewayGroupMembersMethod = getListManualGatewayGroupMembersMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersRequest, com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListManualGatewayGroupMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("ListManualGatewayGroupMembers"))
              .build();
        }
      }
    }
    return getListManualGatewayGroupMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberRequest,
      com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberResponse> getAddManualGatewayGroupMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddManualGatewayGroupMember",
      requestType = com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberRequest,
      com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberResponse> getAddManualGatewayGroupMemberMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberRequest, com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberResponse> getAddManualGatewayGroupMemberMethod;
    if ((getAddManualGatewayGroupMemberMethod = GatewayServiceGrpc.getAddManualGatewayGroupMemberMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getAddManualGatewayGroupMemberMethod = GatewayServiceGrpc.getAddManualGatewayGroupMemberMethod) == null) {
          GatewayServiceGrpc.getAddManualGatewayGroupMemberMethod = getAddManualGatewayGroupMemberMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberRequest, com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddManualGatewayGroupMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("AddManualGatewayGroupMember"))
              .build();
        }
      }
    }
    return getAddManualGatewayGroupMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberRequest,
      com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberResponse> getRemoveManualGatewayGroupMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveManualGatewayGroupMember",
      requestType = com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberRequest,
      com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberResponse> getRemoveManualGatewayGroupMemberMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberRequest, com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberResponse> getRemoveManualGatewayGroupMemberMethod;
    if ((getRemoveManualGatewayGroupMemberMethod = GatewayServiceGrpc.getRemoveManualGatewayGroupMemberMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getRemoveManualGatewayGroupMemberMethod = GatewayServiceGrpc.getRemoveManualGatewayGroupMemberMethod) == null) {
          GatewayServiceGrpc.getRemoveManualGatewayGroupMemberMethod = getRemoveManualGatewayGroupMemberMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberRequest, com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveManualGatewayGroupMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("RemoveManualGatewayGroupMember"))
              .build();
        }
      }
    }
    return getRemoveManualGatewayGroupMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantRequest,
      com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantResponse> getUpsertGroupConnectionGrantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertGroupConnectionGrant",
      requestType = com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantRequest,
      com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantResponse> getUpsertGroupConnectionGrantMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantRequest, com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantResponse> getUpsertGroupConnectionGrantMethod;
    if ((getUpsertGroupConnectionGrantMethod = GatewayServiceGrpc.getUpsertGroupConnectionGrantMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getUpsertGroupConnectionGrantMethod = GatewayServiceGrpc.getUpsertGroupConnectionGrantMethod) == null) {
          GatewayServiceGrpc.getUpsertGroupConnectionGrantMethod = getUpsertGroupConnectionGrantMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantRequest, com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertGroupConnectionGrant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("UpsertGroupConnectionGrant"))
              .build();
        }
      }
    }
    return getUpsertGroupConnectionGrantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantRequest,
      com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantResponse> getDeleteGroupConnectionGrantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteGroupConnectionGrant",
      requestType = com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantRequest,
      com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantResponse> getDeleteGroupConnectionGrantMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantRequest, com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantResponse> getDeleteGroupConnectionGrantMethod;
    if ((getDeleteGroupConnectionGrantMethod = GatewayServiceGrpc.getDeleteGroupConnectionGrantMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getDeleteGroupConnectionGrantMethod = GatewayServiceGrpc.getDeleteGroupConnectionGrantMethod) == null) {
          GatewayServiceGrpc.getDeleteGroupConnectionGrantMethod = getDeleteGroupConnectionGrantMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantRequest, com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteGroupConnectionGrant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("DeleteGroupConnectionGrant"))
              .build();
        }
      }
    }
    return getDeleteGroupConnectionGrantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsRequest,
      com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsResponse> getListGroupConnectionGrantsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGroupConnectionGrants",
      requestType = com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsRequest,
      com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsResponse> getListGroupConnectionGrantsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsRequest, com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsResponse> getListGroupConnectionGrantsMethod;
    if ((getListGroupConnectionGrantsMethod = GatewayServiceGrpc.getListGroupConnectionGrantsMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getListGroupConnectionGrantsMethod = GatewayServiceGrpc.getListGroupConnectionGrantsMethod) == null) {
          GatewayServiceGrpc.getListGroupConnectionGrantsMethod = getListGroupConnectionGrantsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsRequest, com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListGroupConnectionGrants"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("ListGroupConnectionGrants"))
              .build();
        }
      }
    }
    return getListGroupConnectionGrantsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesRequest,
      com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesResponse> getReplaceGroupToolPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReplaceGroupToolPolicies",
      requestType = com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesRequest,
      com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesResponse> getReplaceGroupToolPoliciesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesRequest, com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesResponse> getReplaceGroupToolPoliciesMethod;
    if ((getReplaceGroupToolPoliciesMethod = GatewayServiceGrpc.getReplaceGroupToolPoliciesMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getReplaceGroupToolPoliciesMethod = GatewayServiceGrpc.getReplaceGroupToolPoliciesMethod) == null) {
          GatewayServiceGrpc.getReplaceGroupToolPoliciesMethod = getReplaceGroupToolPoliciesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesRequest, com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReplaceGroupToolPolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("ReplaceGroupToolPolicies"))
              .build();
        }
      }
    }
    return getReplaceGroupToolPoliciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesRequest,
      com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesResponse> getListGroupToolPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGroupToolPolicies",
      requestType = com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesRequest,
      com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesResponse> getListGroupToolPoliciesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesRequest, com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesResponse> getListGroupToolPoliciesMethod;
    if ((getListGroupToolPoliciesMethod = GatewayServiceGrpc.getListGroupToolPoliciesMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getListGroupToolPoliciesMethod = GatewayServiceGrpc.getListGroupToolPoliciesMethod) == null) {
          GatewayServiceGrpc.getListGroupToolPoliciesMethod = getListGroupToolPoliciesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesRequest, com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListGroupToolPolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("ListGroupToolPolicies"))
              .build();
        }
      }
    }
    return getListGroupToolPoliciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyRequest,
      com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyResponse> getPreviewEffectivePolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PreviewEffectivePolicy",
      requestType = com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyRequest,
      com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyResponse> getPreviewEffectivePolicyMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyRequest, com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyResponse> getPreviewEffectivePolicyMethod;
    if ((getPreviewEffectivePolicyMethod = GatewayServiceGrpc.getPreviewEffectivePolicyMethod) == null) {
      synchronized (GatewayServiceGrpc.class) {
        if ((getPreviewEffectivePolicyMethod = GatewayServiceGrpc.getPreviewEffectivePolicyMethod) == null) {
          GatewayServiceGrpc.getPreviewEffectivePolicyMethod = getPreviewEffectivePolicyMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyRequest, com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PreviewEffectivePolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GatewayServiceMethodDescriptorSupplier("PreviewEffectivePolicy"))
              .build();
        }
      }
    }
    return getPreviewEffectivePolicyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GatewayServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GatewayServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GatewayServiceStub>() {
        @java.lang.Override
        public GatewayServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GatewayServiceStub(channel, callOptions);
        }
      };
    return GatewayServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GatewayServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GatewayServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GatewayServiceBlockingStub>() {
        @java.lang.Override
        public GatewayServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GatewayServiceBlockingStub(channel, callOptions);
        }
      };
    return GatewayServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GatewayServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GatewayServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GatewayServiceFutureStub>() {
        @java.lang.Override
        public GatewayServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GatewayServiceFutureStub(channel, callOptions);
        }
      };
    return GatewayServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * GatewayService manages Scalekit's built-in MCP Gateway — a per-environment
   * MCP protocol endpoint mounted at &lt;env_url&gt;/mcp. Phase 0 ships
   * enable + read; lifecycle (disable, rotate, update) lands in Phase 1.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * EnableGateway creates the singleton MCP_GATEWAY Application
     * for the calling environment if one does not already exist, and returns
     * its connection details. Idempotent — returns the existing Gateway with
     * already_enabled=true if Gateway was previously enabled for this env.
     * </pre>
     */
    default void enableGateway(com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableGatewayMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetGateway returns the current Gateway for the calling
     * environment, or an empty response if Gateway is not yet enabled.
     * </pre>
     */
    default void getGateway(com.scalekit.grpc.scalekit.v1.gateway.GetGatewayRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.GetGatewayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGatewayMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetupGatewayIdentity provisions the per-env uber-Organization that
     * anchors SSO + SCIM for all employees using the Gateway. Idempotent —
     * second call returns the existing organization. SSO and SCIM feature
     * flags are enabled on the Org automatically so the admin can configure
     * them immediately without per-feature toggling.
     * </pre>
     */
    default void setupGatewayIdentity(com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetupGatewayIdentityMethod(), responseObserver);
    }

    /**
     * <pre>
     * DisableGateway soft-disables the Gateway. /mcp returns
     * 404 gateway_disabled until re-enabled. Existing rows (applications,
     * organizations, oidc_clients, tool_call_logs) are preserved — audit
     * trail intact, identity anchor preserved for re-enable. Existing
     * agent tokens stay valid against the AS.
     * </pre>
     */
    default void disableGateway(com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableGatewayMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListGatewayGroups returns every group visible to the resolver for
     * the calling environment — builtin Everyone + SCIM directory groups
     * mirrored from the Org's directory + admin-curated manual groups.
     * </pre>
     */
    default void listGatewayGroups(com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListGatewayGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateManualGatewayGroup creates a new admin-curated group with no
     * members. Source is fixed to "manual" — directory groups arrive via
     * SCIM sync and the builtin Everyone group is created by Bootstrap.
     * </pre>
     */
    default void createManualGatewayGroup(com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateManualGatewayGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateManualGatewayGroup renames or re-describes a manual group.
     * Builtin and directory-mirrored groups reject this RPC.
     * </pre>
     */
    default void updateManualGatewayGroup(com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateManualGatewayGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteManualGatewayGroup removes a manual group and cascades to
     * its members, grants, and per-tool policies. Builtin/directory
     * groups reject this RPC.
     * </pre>
     */
    default void deleteManualGatewayGroup(com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteManualGatewayGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListManualGatewayGroupMembers returns every user explicitly added
     * to a manual group. Builtin / directory groups have implicit
     * membership and return an empty list.
     * </pre>
     */
    default void listManualGatewayGroupMembers(com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListManualGatewayGroupMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddManualGatewayGroupMember adds one user to a manual group.
     * Idempotent — re-adding an existing member returns the row.
     * </pre>
     */
    default void addManualGatewayGroupMember(com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddManualGatewayGroupMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveManualGatewayGroupMember removes one user from a manual
     * group.
     * </pre>
     */
    default void removeManualGatewayGroupMember(com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveManualGatewayGroupMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpsertGroupConnectionGrant sets a group's access policy on a
     * connection. policy_mode = ALL grants every tool; SUBSET_ALLOW /
     * SUBSET_DENY narrow access via per-tool policy rows.
     * </pre>
     */
    default void upsertGroupConnectionGrant(com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertGroupConnectionGrantMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteGroupConnectionGrant removes a (group, connection) grant
     * and cascades the per-tool policy rows tied to it.
     * </pre>
     */
    default void deleteGroupConnectionGrant(com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteGroupConnectionGrantMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListGroupConnectionGrants returns every grant on a connection
     * (one row per group with access). Used by the admin UI's
     * per-connection policy view.
     * </pre>
     */
    default void listGroupConnectionGrants(com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListGroupConnectionGrantsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReplaceGroupToolPolicies atomically replaces the per-tool policy
     * rows for a (group, connection) grant. Used when the admin clicks
     * Save on the per-tool checkbox panel — half-saved state is
     * impossible.
     * </pre>
     */
    default void replaceGroupToolPolicies(com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReplaceGroupToolPoliciesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListGroupToolPolicies returns the per-tool policy rows under a
     * (group, connection) grant. Only meaningful when grant.policy_mode
     * ∈ {SUBSET_ALLOW, SUBSET_DENY}.
     * </pre>
     */
    default void listGroupToolPolicies(com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListGroupToolPoliciesMethod(), responseObserver);
    }

    /**
     * <pre>
     * PreviewEffectivePolicy resolves the effective tool list for a
     * hypothetical caller (identified by user_id) on a connection.
     * Powers the F2 effective-policy preview panel so admins can sanity
     * check "what would Alice see on the Slack customer-support
     * connection?" before saving.
     * </pre>
     */
    default void previewEffectivePolicy(com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPreviewEffectivePolicyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GatewayService.
   * <pre>
   * GatewayService manages Scalekit's built-in MCP Gateway — a per-environment
   * MCP protocol endpoint mounted at &lt;env_url&gt;/mcp. Phase 0 ships
   * enable + read; lifecycle (disable, rotate, update) lands in Phase 1.
   * </pre>
   */
  public static abstract class GatewayServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GatewayServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GatewayService.
   * <pre>
   * GatewayService manages Scalekit's built-in MCP Gateway — a per-environment
   * MCP protocol endpoint mounted at &lt;env_url&gt;/mcp. Phase 0 ships
   * enable + read; lifecycle (disable, rotate, update) lands in Phase 1.
   * </pre>
   */
  public static final class GatewayServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GatewayServiceStub> {
    private GatewayServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GatewayServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GatewayServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * EnableGateway creates the singleton MCP_GATEWAY Application
     * for the calling environment if one does not already exist, and returns
     * its connection details. Idempotent — returns the existing Gateway with
     * already_enabled=true if Gateway was previously enabled for this env.
     * </pre>
     */
    public void enableGateway(com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableGatewayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetGateway returns the current Gateway for the calling
     * environment, or an empty response if Gateway is not yet enabled.
     * </pre>
     */
    public void getGateway(com.scalekit.grpc.scalekit.v1.gateway.GetGatewayRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.GetGatewayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGatewayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetupGatewayIdentity provisions the per-env uber-Organization that
     * anchors SSO + SCIM for all employees using the Gateway. Idempotent —
     * second call returns the existing organization. SSO and SCIM feature
     * flags are enabled on the Org automatically so the admin can configure
     * them immediately without per-feature toggling.
     * </pre>
     */
    public void setupGatewayIdentity(com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetupGatewayIdentityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DisableGateway soft-disables the Gateway. /mcp returns
     * 404 gateway_disabled until re-enabled. Existing rows (applications,
     * organizations, oidc_clients, tool_call_logs) are preserved — audit
     * trail intact, identity anchor preserved for re-enable. Existing
     * agent tokens stay valid against the AS.
     * </pre>
     */
    public void disableGateway(com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableGatewayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListGatewayGroups returns every group visible to the resolver for
     * the calling environment — builtin Everyone + SCIM directory groups
     * mirrored from the Org's directory + admin-curated manual groups.
     * </pre>
     */
    public void listGatewayGroups(com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListGatewayGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateManualGatewayGroup creates a new admin-curated group with no
     * members. Source is fixed to "manual" — directory groups arrive via
     * SCIM sync and the builtin Everyone group is created by Bootstrap.
     * </pre>
     */
    public void createManualGatewayGroup(com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateManualGatewayGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateManualGatewayGroup renames or re-describes a manual group.
     * Builtin and directory-mirrored groups reject this RPC.
     * </pre>
     */
    public void updateManualGatewayGroup(com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateManualGatewayGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteManualGatewayGroup removes a manual group and cascades to
     * its members, grants, and per-tool policies. Builtin/directory
     * groups reject this RPC.
     * </pre>
     */
    public void deleteManualGatewayGroup(com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteManualGatewayGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListManualGatewayGroupMembers returns every user explicitly added
     * to a manual group. Builtin / directory groups have implicit
     * membership and return an empty list.
     * </pre>
     */
    public void listManualGatewayGroupMembers(com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListManualGatewayGroupMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddManualGatewayGroupMember adds one user to a manual group.
     * Idempotent — re-adding an existing member returns the row.
     * </pre>
     */
    public void addManualGatewayGroupMember(com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddManualGatewayGroupMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveManualGatewayGroupMember removes one user from a manual
     * group.
     * </pre>
     */
    public void removeManualGatewayGroupMember(com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveManualGatewayGroupMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpsertGroupConnectionGrant sets a group's access policy on a
     * connection. policy_mode = ALL grants every tool; SUBSET_ALLOW /
     * SUBSET_DENY narrow access via per-tool policy rows.
     * </pre>
     */
    public void upsertGroupConnectionGrant(com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertGroupConnectionGrantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteGroupConnectionGrant removes a (group, connection) grant
     * and cascades the per-tool policy rows tied to it.
     * </pre>
     */
    public void deleteGroupConnectionGrant(com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteGroupConnectionGrantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListGroupConnectionGrants returns every grant on a connection
     * (one row per group with access). Used by the admin UI's
     * per-connection policy view.
     * </pre>
     */
    public void listGroupConnectionGrants(com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListGroupConnectionGrantsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReplaceGroupToolPolicies atomically replaces the per-tool policy
     * rows for a (group, connection) grant. Used when the admin clicks
     * Save on the per-tool checkbox panel — half-saved state is
     * impossible.
     * </pre>
     */
    public void replaceGroupToolPolicies(com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReplaceGroupToolPoliciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListGroupToolPolicies returns the per-tool policy rows under a
     * (group, connection) grant. Only meaningful when grant.policy_mode
     * ∈ {SUBSET_ALLOW, SUBSET_DENY}.
     * </pre>
     */
    public void listGroupToolPolicies(com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListGroupToolPoliciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PreviewEffectivePolicy resolves the effective tool list for a
     * hypothetical caller (identified by user_id) on a connection.
     * Powers the F2 effective-policy preview panel so admins can sanity
     * check "what would Alice see on the Slack customer-support
     * connection?" before saving.
     * </pre>
     */
    public void previewEffectivePolicy(com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPreviewEffectivePolicyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GatewayService.
   * <pre>
   * GatewayService manages Scalekit's built-in MCP Gateway — a per-environment
   * MCP protocol endpoint mounted at &lt;env_url&gt;/mcp. Phase 0 ships
   * enable + read; lifecycle (disable, rotate, update) lands in Phase 1.
   * </pre>
   */
  public static final class GatewayServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GatewayServiceBlockingStub> {
    private GatewayServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GatewayServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GatewayServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * EnableGateway creates the singleton MCP_GATEWAY Application
     * for the calling environment if one does not already exist, and returns
     * its connection details. Idempotent — returns the existing Gateway with
     * already_enabled=true if Gateway was previously enabled for this env.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayResponse enableGateway(com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableGatewayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetGateway returns the current Gateway for the calling
     * environment, or an empty response if Gateway is not yet enabled.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.gateway.GetGatewayResponse getGateway(com.scalekit.grpc.scalekit.v1.gateway.GetGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGatewayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetupGatewayIdentity provisions the per-env uber-Organization that
     * anchors SSO + SCIM for all employees using the Gateway. Idempotent —
     * second call returns the existing organization. SSO and SCIM feature
     * flags are enabled on the Org automatically so the admin can configure
     * them immediately without per-feature toggling.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityResponse setupGatewayIdentity(com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetupGatewayIdentityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DisableGateway soft-disables the Gateway. /mcp returns
     * 404 gateway_disabled until re-enabled. Existing rows (applications,
     * organizations, oidc_clients, tool_call_logs) are preserved — audit
     * trail intact, identity anchor preserved for re-enable. Existing
     * agent tokens stay valid against the AS.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayResponse disableGateway(com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableGatewayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListGatewayGroups returns every group visible to the resolver for
     * the calling environment — builtin Everyone + SCIM directory groups
     * mirrored from the Org's directory + admin-curated manual groups.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsResponse listGatewayGroups(com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListGatewayGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateManualGatewayGroup creates a new admin-curated group with no
     * members. Source is fixed to "manual" — directory groups arrive via
     * SCIM sync and the builtin Everyone group is created by Bootstrap.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupResponse createManualGatewayGroup(com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateManualGatewayGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateManualGatewayGroup renames or re-describes a manual group.
     * Builtin and directory-mirrored groups reject this RPC.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupResponse updateManualGatewayGroup(com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateManualGatewayGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteManualGatewayGroup removes a manual group and cascades to
     * its members, grants, and per-tool policies. Builtin/directory
     * groups reject this RPC.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupResponse deleteManualGatewayGroup(com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteManualGatewayGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListManualGatewayGroupMembers returns every user explicitly added
     * to a manual group. Builtin / directory groups have implicit
     * membership and return an empty list.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersResponse listManualGatewayGroupMembers(com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListManualGatewayGroupMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddManualGatewayGroupMember adds one user to a manual group.
     * Idempotent — re-adding an existing member returns the row.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberResponse addManualGatewayGroupMember(com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddManualGatewayGroupMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveManualGatewayGroupMember removes one user from a manual
     * group.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberResponse removeManualGatewayGroupMember(com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveManualGatewayGroupMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpsertGroupConnectionGrant sets a group's access policy on a
     * connection. policy_mode = ALL grants every tool; SUBSET_ALLOW /
     * SUBSET_DENY narrow access via per-tool policy rows.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantResponse upsertGroupConnectionGrant(com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertGroupConnectionGrantMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteGroupConnectionGrant removes a (group, connection) grant
     * and cascades the per-tool policy rows tied to it.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantResponse deleteGroupConnectionGrant(com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteGroupConnectionGrantMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListGroupConnectionGrants returns every grant on a connection
     * (one row per group with access). Used by the admin UI's
     * per-connection policy view.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsResponse listGroupConnectionGrants(com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListGroupConnectionGrantsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReplaceGroupToolPolicies atomically replaces the per-tool policy
     * rows for a (group, connection) grant. Used when the admin clicks
     * Save on the per-tool checkbox panel — half-saved state is
     * impossible.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesResponse replaceGroupToolPolicies(com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReplaceGroupToolPoliciesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListGroupToolPolicies returns the per-tool policy rows under a
     * (group, connection) grant. Only meaningful when grant.policy_mode
     * ∈ {SUBSET_ALLOW, SUBSET_DENY}.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesResponse listGroupToolPolicies(com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListGroupToolPoliciesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PreviewEffectivePolicy resolves the effective tool list for a
     * hypothetical caller (identified by user_id) on a connection.
     * Powers the F2 effective-policy preview panel so admins can sanity
     * check "what would Alice see on the Slack customer-support
     * connection?" before saving.
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyResponse previewEffectivePolicy(com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPreviewEffectivePolicyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GatewayService.
   * <pre>
   * GatewayService manages Scalekit's built-in MCP Gateway — a per-environment
   * MCP protocol endpoint mounted at &lt;env_url&gt;/mcp. Phase 0 ships
   * enable + read; lifecycle (disable, rotate, update) lands in Phase 1.
   * </pre>
   */
  public static final class GatewayServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GatewayServiceFutureStub> {
    private GatewayServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GatewayServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GatewayServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * EnableGateway creates the singleton MCP_GATEWAY Application
     * for the calling environment if one does not already exist, and returns
     * its connection details. Idempotent — returns the existing Gateway with
     * already_enabled=true if Gateway was previously enabled for this env.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayResponse> enableGateway(
        com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableGatewayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetGateway returns the current Gateway for the calling
     * environment, or an empty response if Gateway is not yet enabled.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.gateway.GetGatewayResponse> getGateway(
        com.scalekit.grpc.scalekit.v1.gateway.GetGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGatewayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetupGatewayIdentity provisions the per-env uber-Organization that
     * anchors SSO + SCIM for all employees using the Gateway. Idempotent —
     * second call returns the existing organization. SSO and SCIM feature
     * flags are enabled on the Org automatically so the admin can configure
     * them immediately without per-feature toggling.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityResponse> setupGatewayIdentity(
        com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetupGatewayIdentityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DisableGateway soft-disables the Gateway. /mcp returns
     * 404 gateway_disabled until re-enabled. Existing rows (applications,
     * organizations, oidc_clients, tool_call_logs) are preserved — audit
     * trail intact, identity anchor preserved for re-enable. Existing
     * agent tokens stay valid against the AS.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayResponse> disableGateway(
        com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableGatewayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListGatewayGroups returns every group visible to the resolver for
     * the calling environment — builtin Everyone + SCIM directory groups
     * mirrored from the Org's directory + admin-curated manual groups.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsResponse> listGatewayGroups(
        com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListGatewayGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateManualGatewayGroup creates a new admin-curated group with no
     * members. Source is fixed to "manual" — directory groups arrive via
     * SCIM sync and the builtin Everyone group is created by Bootstrap.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupResponse> createManualGatewayGroup(
        com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateManualGatewayGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateManualGatewayGroup renames or re-describes a manual group.
     * Builtin and directory-mirrored groups reject this RPC.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupResponse> updateManualGatewayGroup(
        com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateManualGatewayGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteManualGatewayGroup removes a manual group and cascades to
     * its members, grants, and per-tool policies. Builtin/directory
     * groups reject this RPC.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupResponse> deleteManualGatewayGroup(
        com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteManualGatewayGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListManualGatewayGroupMembers returns every user explicitly added
     * to a manual group. Builtin / directory groups have implicit
     * membership and return an empty list.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersResponse> listManualGatewayGroupMembers(
        com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListManualGatewayGroupMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddManualGatewayGroupMember adds one user to a manual group.
     * Idempotent — re-adding an existing member returns the row.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberResponse> addManualGatewayGroupMember(
        com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddManualGatewayGroupMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveManualGatewayGroupMember removes one user from a manual
     * group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberResponse> removeManualGatewayGroupMember(
        com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveManualGatewayGroupMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpsertGroupConnectionGrant sets a group's access policy on a
     * connection. policy_mode = ALL grants every tool; SUBSET_ALLOW /
     * SUBSET_DENY narrow access via per-tool policy rows.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantResponse> upsertGroupConnectionGrant(
        com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertGroupConnectionGrantMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteGroupConnectionGrant removes a (group, connection) grant
     * and cascades the per-tool policy rows tied to it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantResponse> deleteGroupConnectionGrant(
        com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteGroupConnectionGrantMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListGroupConnectionGrants returns every grant on a connection
     * (one row per group with access). Used by the admin UI's
     * per-connection policy view.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsResponse> listGroupConnectionGrants(
        com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListGroupConnectionGrantsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ReplaceGroupToolPolicies atomically replaces the per-tool policy
     * rows for a (group, connection) grant. Used when the admin clicks
     * Save on the per-tool checkbox panel — half-saved state is
     * impossible.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesResponse> replaceGroupToolPolicies(
        com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReplaceGroupToolPoliciesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListGroupToolPolicies returns the per-tool policy rows under a
     * (group, connection) grant. Only meaningful when grant.policy_mode
     * ∈ {SUBSET_ALLOW, SUBSET_DENY}.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesResponse> listGroupToolPolicies(
        com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListGroupToolPoliciesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PreviewEffectivePolicy resolves the effective tool list for a
     * hypothetical caller (identified by user_id) on a connection.
     * Powers the F2 effective-policy preview panel so admins can sanity
     * check "what would Alice see on the Slack customer-support
     * connection?" before saving.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyResponse> previewEffectivePolicy(
        com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPreviewEffectivePolicyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENABLE_GATEWAY = 0;
  private static final int METHODID_GET_GATEWAY = 1;
  private static final int METHODID_SETUP_GATEWAY_IDENTITY = 2;
  private static final int METHODID_DISABLE_GATEWAY = 3;
  private static final int METHODID_LIST_GATEWAY_GROUPS = 4;
  private static final int METHODID_CREATE_MANUAL_GATEWAY_GROUP = 5;
  private static final int METHODID_UPDATE_MANUAL_GATEWAY_GROUP = 6;
  private static final int METHODID_DELETE_MANUAL_GATEWAY_GROUP = 7;
  private static final int METHODID_LIST_MANUAL_GATEWAY_GROUP_MEMBERS = 8;
  private static final int METHODID_ADD_MANUAL_GATEWAY_GROUP_MEMBER = 9;
  private static final int METHODID_REMOVE_MANUAL_GATEWAY_GROUP_MEMBER = 10;
  private static final int METHODID_UPSERT_GROUP_CONNECTION_GRANT = 11;
  private static final int METHODID_DELETE_GROUP_CONNECTION_GRANT = 12;
  private static final int METHODID_LIST_GROUP_CONNECTION_GRANTS = 13;
  private static final int METHODID_REPLACE_GROUP_TOOL_POLICIES = 14;
  private static final int METHODID_LIST_GROUP_TOOL_POLICIES = 15;
  private static final int METHODID_PREVIEW_EFFECTIVE_POLICY = 16;

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
        case METHODID_ENABLE_GATEWAY:
          serviceImpl.enableGateway((com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayResponse>) responseObserver);
          break;
        case METHODID_GET_GATEWAY:
          serviceImpl.getGateway((com.scalekit.grpc.scalekit.v1.gateway.GetGatewayRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.GetGatewayResponse>) responseObserver);
          break;
        case METHODID_SETUP_GATEWAY_IDENTITY:
          serviceImpl.setupGatewayIdentity((com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityResponse>) responseObserver);
          break;
        case METHODID_DISABLE_GATEWAY:
          serviceImpl.disableGateway((com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayResponse>) responseObserver);
          break;
        case METHODID_LIST_GATEWAY_GROUPS:
          serviceImpl.listGatewayGroups((com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE_MANUAL_GATEWAY_GROUP:
          serviceImpl.createManualGatewayGroup((com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MANUAL_GATEWAY_GROUP:
          serviceImpl.updateManualGatewayGroup((com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupResponse>) responseObserver);
          break;
        case METHODID_DELETE_MANUAL_GATEWAY_GROUP:
          serviceImpl.deleteManualGatewayGroup((com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupResponse>) responseObserver);
          break;
        case METHODID_LIST_MANUAL_GATEWAY_GROUP_MEMBERS:
          serviceImpl.listManualGatewayGroupMembers((com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersResponse>) responseObserver);
          break;
        case METHODID_ADD_MANUAL_GATEWAY_GROUP_MEMBER:
          serviceImpl.addManualGatewayGroupMember((com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberResponse>) responseObserver);
          break;
        case METHODID_REMOVE_MANUAL_GATEWAY_GROUP_MEMBER:
          serviceImpl.removeManualGatewayGroupMember((com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberResponse>) responseObserver);
          break;
        case METHODID_UPSERT_GROUP_CONNECTION_GRANT:
          serviceImpl.upsertGroupConnectionGrant((com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantResponse>) responseObserver);
          break;
        case METHODID_DELETE_GROUP_CONNECTION_GRANT:
          serviceImpl.deleteGroupConnectionGrant((com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantResponse>) responseObserver);
          break;
        case METHODID_LIST_GROUP_CONNECTION_GRANTS:
          serviceImpl.listGroupConnectionGrants((com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsResponse>) responseObserver);
          break;
        case METHODID_REPLACE_GROUP_TOOL_POLICIES:
          serviceImpl.replaceGroupToolPolicies((com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesResponse>) responseObserver);
          break;
        case METHODID_LIST_GROUP_TOOL_POLICIES:
          serviceImpl.listGroupToolPolicies((com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesResponse>) responseObserver);
          break;
        case METHODID_PREVIEW_EFFECTIVE_POLICY:
          serviceImpl.previewEffectivePolicy((com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyResponse>) responseObserver);
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
          getEnableGatewayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayRequest,
              com.scalekit.grpc.scalekit.v1.gateway.EnableGatewayResponse>(
                service, METHODID_ENABLE_GATEWAY)))
        .addMethod(
          getGetGatewayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.gateway.GetGatewayRequest,
              com.scalekit.grpc.scalekit.v1.gateway.GetGatewayResponse>(
                service, METHODID_GET_GATEWAY)))
        .addMethod(
          getSetupGatewayIdentityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityRequest,
              com.scalekit.grpc.scalekit.v1.gateway.SetupGatewayIdentityResponse>(
                service, METHODID_SETUP_GATEWAY_IDENTITY)))
        .addMethod(
          getDisableGatewayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayRequest,
              com.scalekit.grpc.scalekit.v1.gateway.DisableGatewayResponse>(
                service, METHODID_DISABLE_GATEWAY)))
        .addMethod(
          getListGatewayGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsRequest,
              com.scalekit.grpc.scalekit.v1.gateway.ListGatewayGroupsResponse>(
                service, METHODID_LIST_GATEWAY_GROUPS)))
        .addMethod(
          getCreateManualGatewayGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupRequest,
              com.scalekit.grpc.scalekit.v1.gateway.CreateManualGatewayGroupResponse>(
                service, METHODID_CREATE_MANUAL_GATEWAY_GROUP)))
        .addMethod(
          getUpdateManualGatewayGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupRequest,
              com.scalekit.grpc.scalekit.v1.gateway.UpdateManualGatewayGroupResponse>(
                service, METHODID_UPDATE_MANUAL_GATEWAY_GROUP)))
        .addMethod(
          getDeleteManualGatewayGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupRequest,
              com.scalekit.grpc.scalekit.v1.gateway.DeleteManualGatewayGroupResponse>(
                service, METHODID_DELETE_MANUAL_GATEWAY_GROUP)))
        .addMethod(
          getListManualGatewayGroupMembersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersRequest,
              com.scalekit.grpc.scalekit.v1.gateway.ListManualGatewayGroupMembersResponse>(
                service, METHODID_LIST_MANUAL_GATEWAY_GROUP_MEMBERS)))
        .addMethod(
          getAddManualGatewayGroupMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberRequest,
              com.scalekit.grpc.scalekit.v1.gateway.AddManualGatewayGroupMemberResponse>(
                service, METHODID_ADD_MANUAL_GATEWAY_GROUP_MEMBER)))
        .addMethod(
          getRemoveManualGatewayGroupMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberRequest,
              com.scalekit.grpc.scalekit.v1.gateway.RemoveManualGatewayGroupMemberResponse>(
                service, METHODID_REMOVE_MANUAL_GATEWAY_GROUP_MEMBER)))
        .addMethod(
          getUpsertGroupConnectionGrantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantRequest,
              com.scalekit.grpc.scalekit.v1.gateway.UpsertGroupConnectionGrantResponse>(
                service, METHODID_UPSERT_GROUP_CONNECTION_GRANT)))
        .addMethod(
          getDeleteGroupConnectionGrantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantRequest,
              com.scalekit.grpc.scalekit.v1.gateway.DeleteGroupConnectionGrantResponse>(
                service, METHODID_DELETE_GROUP_CONNECTION_GRANT)))
        .addMethod(
          getListGroupConnectionGrantsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsRequest,
              com.scalekit.grpc.scalekit.v1.gateway.ListGroupConnectionGrantsResponse>(
                service, METHODID_LIST_GROUP_CONNECTION_GRANTS)))
        .addMethod(
          getReplaceGroupToolPoliciesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesRequest,
              com.scalekit.grpc.scalekit.v1.gateway.ReplaceGroupToolPoliciesResponse>(
                service, METHODID_REPLACE_GROUP_TOOL_POLICIES)))
        .addMethod(
          getListGroupToolPoliciesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesRequest,
              com.scalekit.grpc.scalekit.v1.gateway.ListGroupToolPoliciesResponse>(
                service, METHODID_LIST_GROUP_TOOL_POLICIES)))
        .addMethod(
          getPreviewEffectivePolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyRequest,
              com.scalekit.grpc.scalekit.v1.gateway.PreviewEffectivePolicyResponse>(
                service, METHODID_PREVIEW_EFFECTIVE_POLICY)))
        .build();
  }

  private static abstract class GatewayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GatewayServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.gateway.GatewayProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GatewayService");
    }
  }

  private static final class GatewayServiceFileDescriptorSupplier
      extends GatewayServiceBaseDescriptorSupplier {
    GatewayServiceFileDescriptorSupplier() {}
  }

  private static final class GatewayServiceMethodDescriptorSupplier
      extends GatewayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GatewayServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GatewayServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GatewayServiceFileDescriptorSupplier())
              .addMethod(getEnableGatewayMethod())
              .addMethod(getGetGatewayMethod())
              .addMethod(getSetupGatewayIdentityMethod())
              .addMethod(getDisableGatewayMethod())
              .addMethod(getListGatewayGroupsMethod())
              .addMethod(getCreateManualGatewayGroupMethod())
              .addMethod(getUpdateManualGatewayGroupMethod())
              .addMethod(getDeleteManualGatewayGroupMethod())
              .addMethod(getListManualGatewayGroupMembersMethod())
              .addMethod(getAddManualGatewayGroupMemberMethod())
              .addMethod(getRemoveManualGatewayGroupMemberMethod())
              .addMethod(getUpsertGroupConnectionGrantMethod())
              .addMethod(getDeleteGroupConnectionGrantMethod())
              .addMethod(getListGroupConnectionGrantsMethod())
              .addMethod(getReplaceGroupToolPoliciesMethod())
              .addMethod(getListGroupToolPoliciesMethod())
              .addMethod(getPreviewEffectivePolicyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
