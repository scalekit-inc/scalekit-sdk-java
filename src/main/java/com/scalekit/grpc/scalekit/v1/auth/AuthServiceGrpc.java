package com.scalekit.grpc.scalekit.v1.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/auth/auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.auth.AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsRequest,
      com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse> getListAuthMethodsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAuthMethods",
      requestType = com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsRequest,
      com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse> getListAuthMethodsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsRequest, com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse> getListAuthMethodsMethod;
    if ((getListAuthMethodsMethod = AuthServiceGrpc.getListAuthMethodsMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getListAuthMethodsMethod = AuthServiceGrpc.getListAuthMethodsMethod) == null) {
          AuthServiceGrpc.getListAuthMethodsMethod = getListAuthMethodsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsRequest, com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAuthMethods"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ListAuthMethods"))
              .build();
        }
      }
    }
    return getListAuthMethodsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodRequest,
      com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodResponse> getDiscoveryAuthMethodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DiscoveryAuthMethod",
      requestType = com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodRequest,
      com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodResponse> getDiscoveryAuthMethodMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodRequest, com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodResponse> getDiscoveryAuthMethodMethod;
    if ((getDiscoveryAuthMethodMethod = AuthServiceGrpc.getDiscoveryAuthMethodMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getDiscoveryAuthMethodMethod = AuthServiceGrpc.getDiscoveryAuthMethodMethod) == null) {
          AuthServiceGrpc.getDiscoveryAuthMethodMethod = getDiscoveryAuthMethodMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodRequest, com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DiscoveryAuthMethod"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("DiscoveryAuthMethod"))
              .build();
        }
      }
    }
    return getDiscoveryAuthMethodMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpRequest,
      com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpResponse> getVerifyPasswordLessOtpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyPasswordLessOtp",
      requestType = com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpRequest,
      com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpResponse> getVerifyPasswordLessOtpMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpRequest, com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpResponse> getVerifyPasswordLessOtpMethod;
    if ((getVerifyPasswordLessOtpMethod = AuthServiceGrpc.getVerifyPasswordLessOtpMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getVerifyPasswordLessOtpMethod = AuthServiceGrpc.getVerifyPasswordLessOtpMethod) == null) {
          AuthServiceGrpc.getVerifyPasswordLessOtpMethod = getVerifyPasswordLessOtpMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpRequest, com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyPasswordLessOtp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("VerifyPasswordLessOtp"))
              .build();
        }
      }
    }
    return getVerifyPasswordLessOtpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getResendPasswordlessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResendPasswordless",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getResendPasswordlessMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getResendPasswordlessMethod;
    if ((getResendPasswordlessMethod = AuthServiceGrpc.getResendPasswordlessMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getResendPasswordlessMethod = AuthServiceGrpc.getResendPasswordlessMethod) == null) {
          AuthServiceGrpc.getResendPasswordlessMethod = getResendPasswordlessMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResendPasswordless"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ResendPasswordless"))
              .build();
        }
      }
    }
    return getResendPasswordlessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.auth.ListUserOrganizationsResponse> getListUserOrganizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserOrganizations",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.ListUserOrganizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.auth.ListUserOrganizationsResponse> getListUserOrganizationsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.auth.ListUserOrganizationsResponse> getListUserOrganizationsMethod;
    if ((getListUserOrganizationsMethod = AuthServiceGrpc.getListUserOrganizationsMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getListUserOrganizationsMethod = AuthServiceGrpc.getListUserOrganizationsMethod) == null) {
          AuthServiceGrpc.getListUserOrganizationsMethod = getListUserOrganizationsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.auth.ListUserOrganizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserOrganizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.ListUserOrganizationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ListUserOrganizations"))
              .build();
        }
      }
    }
    return getListUserOrganizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationRequest,
      com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationResponse> getSignupOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignupOrganization",
      requestType = com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationRequest,
      com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationResponse> getSignupOrganizationMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationRequest, com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationResponse> getSignupOrganizationMethod;
    if ((getSignupOrganizationMethod = AuthServiceGrpc.getSignupOrganizationMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getSignupOrganizationMethod = AuthServiceGrpc.getSignupOrganizationMethod) == null) {
          AuthServiceGrpc.getSignupOrganizationMethod = getSignupOrganizationMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationRequest, com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignupOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("SignupOrganization"))
              .build();
        }
      }
    }
    return getSignupOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse> getGetAuthStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthState",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse> getGetAuthStateMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse> getGetAuthStateMethod;
    if ((getGetAuthStateMethod = AuthServiceGrpc.getGetAuthStateMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetAuthStateMethod = AuthServiceGrpc.getGetAuthStateMethod) == null) {
          AuthServiceGrpc.getGetAuthStateMethod = getGetAuthStateMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAuthState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetAuthState"))
              .build();
        }
      }
    }
    return getGetAuthStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorRequest,
      com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorResponse> getGetAuthErrorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthError",
      requestType = com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorRequest,
      com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorResponse> getGetAuthErrorMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorRequest, com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorResponse> getGetAuthErrorMethod;
    if ((getGetAuthErrorMethod = AuthServiceGrpc.getGetAuthErrorMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetAuthErrorMethod = AuthServiceGrpc.getGetAuthErrorMethod) == null) {
          AuthServiceGrpc.getGetAuthErrorMethod = getGetAuthErrorMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorRequest, com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAuthError"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetAuthError"))
              .build();
        }
      }
    }
    return getGetAuthErrorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Logout",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getLogoutMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getLogoutMethod;
    if ((getLogoutMethod = AuthServiceGrpc.getLogoutMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getLogoutMethod = AuthServiceGrpc.getLogoutMethod) == null) {
          AuthServiceGrpc.getLogoutMethod = getLogoutMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("Logout"))
              .build();
        }
      }
    }
    return getLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsRequest,
      com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsResponse> getGetAuthCustomizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthCustomizations",
      requestType = com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsRequest,
      com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsResponse> getGetAuthCustomizationsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsRequest, com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsResponse> getGetAuthCustomizationsMethod;
    if ((getGetAuthCustomizationsMethod = AuthServiceGrpc.getGetAuthCustomizationsMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetAuthCustomizationsMethod = AuthServiceGrpc.getGetAuthCustomizationsMethod) == null) {
          AuthServiceGrpc.getGetAuthCustomizationsMethod = getGetAuthCustomizationsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsRequest, com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAuthCustomizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetAuthCustomizations"))
              .build();
        }
      }
    }
    return getGetAuthCustomizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.auth.GetAuthFeaturesResponse> getGetAuthFeaturesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthFeatures",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.scalekit.grpc.scalekit.v1.auth.GetAuthFeaturesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.auth.GetAuthFeaturesResponse> getGetAuthFeaturesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.auth.GetAuthFeaturesResponse> getGetAuthFeaturesMethod;
    if ((getGetAuthFeaturesMethod = AuthServiceGrpc.getGetAuthFeaturesMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetAuthFeaturesMethod = AuthServiceGrpc.getGetAuthFeaturesMethod) == null) {
          AuthServiceGrpc.getGetAuthFeaturesMethod = getGetAuthFeaturesMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.auth.GetAuthFeaturesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAuthFeatures"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.GetAuthFeaturesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetAuthFeatures"))
              .build();
        }
      }
    }
    return getGetAuthFeaturesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.UpdateLoginUserDetailsRequest,
      com.google.protobuf.Empty> getUpdateLoginUserDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLoginUserDetails",
      requestType = com.scalekit.grpc.scalekit.v1.auth.UpdateLoginUserDetailsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.UpdateLoginUserDetailsRequest,
      com.google.protobuf.Empty> getUpdateLoginUserDetailsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.auth.UpdateLoginUserDetailsRequest, com.google.protobuf.Empty> getUpdateLoginUserDetailsMethod;
    if ((getUpdateLoginUserDetailsMethod = AuthServiceGrpc.getUpdateLoginUserDetailsMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getUpdateLoginUserDetailsMethod = AuthServiceGrpc.getUpdateLoginUserDetailsMethod) == null) {
          AuthServiceGrpc.getUpdateLoginUserDetailsMethod = getUpdateLoginUserDetailsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.auth.UpdateLoginUserDetailsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateLoginUserDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.auth.UpdateLoginUserDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("UpdateLoginUserDetails"))
              .build();
        }
      }
    }
    return getUpdateLoginUserDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub>() {
        @java.lang.Override
        public AuthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceStub(channel, callOptions);
        }
      };
    return AuthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub>() {
        @java.lang.Override
        public AuthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub>() {
        @java.lang.Override
        public AuthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceFutureStub(channel, callOptions);
        }
      };
    return AuthServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void listAuthMethods(com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAuthMethodsMethod(), responseObserver);
    }

    /**
     */
    default void discoveryAuthMethod(com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDiscoveryAuthMethodMethod(), responseObserver);
    }

    /**
     */
    default void verifyPasswordLessOtp(com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyPasswordLessOtpMethod(), responseObserver);
    }

    /**
     */
    default void resendPasswordless(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResendPasswordlessMethod(), responseObserver);
    }

    /**
     */
    default void listUserOrganizations(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.ListUserOrganizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUserOrganizationsMethod(), responseObserver);
    }

    /**
     */
    default void signupOrganization(com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignupOrganizationMethod(), responseObserver);
    }

    /**
     */
    default void getAuthState(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAuthStateMethod(), responseObserver);
    }

    /**
     */
    default void getAuthError(com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAuthErrorMethod(), responseObserver);
    }

    /**
     */
    default void logout(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    /**
     */
    default void getAuthCustomizations(com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAuthCustomizationsMethod(), responseObserver);
    }

    /**
     */
    default void getAuthFeatures(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.GetAuthFeaturesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAuthFeaturesMethod(), responseObserver);
    }

    /**
     */
    default void updateLoginUserDetails(com.scalekit.grpc.scalekit.v1.auth.UpdateLoginUserDetailsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateLoginUserDetailsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AuthService.
   */
  public static abstract class AuthServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AuthService.
   */
  public static final class AuthServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AuthServiceStub> {
    private AuthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     */
    public void listAuthMethods(com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAuthMethodsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void discoveryAuthMethod(com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDiscoveryAuthMethodMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verifyPasswordLessOtp(com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyPasswordLessOtpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resendPasswordless(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResendPasswordlessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUserOrganizations(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.ListUserOrganizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUserOrganizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signupOrganization(com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignupOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAuthState(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAuthStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAuthError(com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAuthErrorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAuthCustomizations(com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAuthCustomizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAuthFeatures(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.GetAuthFeaturesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAuthFeaturesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateLoginUserDetails(com.scalekit.grpc.scalekit.v1.auth.UpdateLoginUserDetailsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateLoginUserDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AuthService.
   */
  public static final class AuthServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse listAuthMethods(com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAuthMethodsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodResponse discoveryAuthMethod(com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDiscoveryAuthMethodMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpResponse verifyPasswordLessOtp(com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyPasswordLessOtpMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty resendPasswordless(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResendPasswordlessMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.ListUserOrganizationsResponse listUserOrganizations(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUserOrganizationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationResponse signupOrganization(com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignupOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse getAuthState(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAuthStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorResponse getAuthError(com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAuthErrorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty logout(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsResponse getAuthCustomizations(com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAuthCustomizationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.auth.GetAuthFeaturesResponse getAuthFeatures(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAuthFeaturesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateLoginUserDetails(com.scalekit.grpc.scalekit.v1.auth.UpdateLoginUserDetailsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateLoginUserDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AuthService.
   */
  public static final class AuthServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse> listAuthMethods(
        com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAuthMethodsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodResponse> discoveryAuthMethod(
        com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDiscoveryAuthMethodMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpResponse> verifyPasswordLessOtp(
        com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyPasswordLessOtpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> resendPasswordless(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResendPasswordlessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.ListUserOrganizationsResponse> listUserOrganizations(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUserOrganizationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationResponse> signupOrganization(
        com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignupOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse> getAuthState(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAuthStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorResponse> getAuthError(
        com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAuthErrorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> logout(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsResponse> getAuthCustomizations(
        com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAuthCustomizationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.auth.GetAuthFeaturesResponse> getAuthFeatures(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAuthFeaturesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateLoginUserDetails(
        com.scalekit.grpc.scalekit.v1.auth.UpdateLoginUserDetailsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateLoginUserDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_AUTH_METHODS = 0;
  private static final int METHODID_DISCOVERY_AUTH_METHOD = 1;
  private static final int METHODID_VERIFY_PASSWORD_LESS_OTP = 2;
  private static final int METHODID_RESEND_PASSWORDLESS = 3;
  private static final int METHODID_LIST_USER_ORGANIZATIONS = 4;
  private static final int METHODID_SIGNUP_ORGANIZATION = 5;
  private static final int METHODID_GET_AUTH_STATE = 6;
  private static final int METHODID_GET_AUTH_ERROR = 7;
  private static final int METHODID_LOGOUT = 8;
  private static final int METHODID_GET_AUTH_CUSTOMIZATIONS = 9;
  private static final int METHODID_GET_AUTH_FEATURES = 10;
  private static final int METHODID_UPDATE_LOGIN_USER_DETAILS = 11;

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
        case METHODID_LIST_AUTH_METHODS:
          serviceImpl.listAuthMethods((com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse>) responseObserver);
          break;
        case METHODID_DISCOVERY_AUTH_METHOD:
          serviceImpl.discoveryAuthMethod((com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodResponse>) responseObserver);
          break;
        case METHODID_VERIFY_PASSWORD_LESS_OTP:
          serviceImpl.verifyPasswordLessOtp((com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpResponse>) responseObserver);
          break;
        case METHODID_RESEND_PASSWORDLESS:
          serviceImpl.resendPasswordless((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_USER_ORGANIZATIONS:
          serviceImpl.listUserOrganizations((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.ListUserOrganizationsResponse>) responseObserver);
          break;
        case METHODID_SIGNUP_ORGANIZATION:
          serviceImpl.signupOrganization((com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationResponse>) responseObserver);
          break;
        case METHODID_GET_AUTH_STATE:
          serviceImpl.getAuthState((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse>) responseObserver);
          break;
        case METHODID_GET_AUTH_ERROR:
          serviceImpl.getAuthError((com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_AUTH_CUSTOMIZATIONS:
          serviceImpl.getAuthCustomizations((com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsResponse>) responseObserver);
          break;
        case METHODID_GET_AUTH_FEATURES:
          serviceImpl.getAuthFeatures((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.auth.GetAuthFeaturesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LOGIN_USER_DETAILS:
          serviceImpl.updateLoginUserDetails((com.scalekit.grpc.scalekit.v1.auth.UpdateLoginUserDetailsRequest) request,
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
          getListAuthMethodsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsRequest,
              com.scalekit.grpc.scalekit.v1.auth.ListAuthMethodsResponse>(
                service, METHODID_LIST_AUTH_METHODS)))
        .addMethod(
          getDiscoveryAuthMethodMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodRequest,
              com.scalekit.grpc.scalekit.v1.auth.DiscoveryAuthMethodResponse>(
                service, METHODID_DISCOVERY_AUTH_METHOD)))
        .addMethod(
          getVerifyPasswordLessOtpMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpRequest,
              com.scalekit.grpc.scalekit.v1.auth.VerifyPasswordLessOtpResponse>(
                service, METHODID_VERIFY_PASSWORD_LESS_OTP)))
        .addMethod(
          getResendPasswordlessMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_RESEND_PASSWORDLESS)))
        .addMethod(
          getListUserOrganizationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.scalekit.grpc.scalekit.v1.auth.ListUserOrganizationsResponse>(
                service, METHODID_LIST_USER_ORGANIZATIONS)))
        .addMethod(
          getSignupOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationRequest,
              com.scalekit.grpc.scalekit.v1.auth.SignupOrganizationResponse>(
                service, METHODID_SIGNUP_ORGANIZATION)))
        .addMethod(
          getGetAuthStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.scalekit.grpc.scalekit.v1.auth.GetAuthStateResponse>(
                service, METHODID_GET_AUTH_STATE)))
        .addMethod(
          getGetAuthErrorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorRequest,
              com.scalekit.grpc.scalekit.v1.auth.GetAuthErrorResponse>(
                service, METHODID_GET_AUTH_ERROR)))
        .addMethod(
          getLogoutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_LOGOUT)))
        .addMethod(
          getGetAuthCustomizationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsRequest,
              com.scalekit.grpc.scalekit.v1.auth.GetAuthCustomizationsResponse>(
                service, METHODID_GET_AUTH_CUSTOMIZATIONS)))
        .addMethod(
          getGetAuthFeaturesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.scalekit.grpc.scalekit.v1.auth.GetAuthFeaturesResponse>(
                service, METHODID_GET_AUTH_FEATURES)))
        .addMethod(
          getUpdateLoginUserDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.auth.UpdateLoginUserDetailsRequest,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_LOGIN_USER_DETAILS)))
        .build();
  }

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.auth.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AuthServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getListAuthMethodsMethod())
              .addMethod(getDiscoveryAuthMethodMethod())
              .addMethod(getVerifyPasswordLessOtpMethod())
              .addMethod(getResendPasswordlessMethod())
              .addMethod(getListUserOrganizationsMethod())
              .addMethod(getSignupOrganizationMethod())
              .addMethod(getGetAuthStateMethod())
              .addMethod(getGetAuthErrorMethod())
              .addMethod(getLogoutMethod())
              .addMethod(getGetAuthCustomizationsMethod())
              .addMethod(getGetAuthFeaturesMethod())
              .addMethod(getUpdateLoginUserDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
