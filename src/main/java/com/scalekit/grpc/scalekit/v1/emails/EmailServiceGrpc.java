package com.scalekit.grpc.scalekit.v1.emails;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: scalekit/v1/emails/emails.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EmailServiceGrpc {

  private EmailServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "scalekit.v1.emails.EmailService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersRequest,
      com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersResponse> getGetTemplatePlaceholdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTemplatePlaceholders",
      requestType = com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersRequest,
      com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersResponse> getGetTemplatePlaceholdersMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersRequest, com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersResponse> getGetTemplatePlaceholdersMethod;
    if ((getGetTemplatePlaceholdersMethod = EmailServiceGrpc.getGetTemplatePlaceholdersMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getGetTemplatePlaceholdersMethod = EmailServiceGrpc.getGetTemplatePlaceholdersMethod) == null) {
          EmailServiceGrpc.getGetTemplatePlaceholdersMethod = getGetTemplatePlaceholdersMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersRequest, com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTemplatePlaceholders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("GetTemplatePlaceholders"))
              .build();
        }
      }
    }
    return getGetTemplatePlaceholdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.emails.GetTemplateUseCasesResponse> getGetTemplateUseCasesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTemplateUseCases",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.scalekit.grpc.scalekit.v1.emails.GetTemplateUseCasesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.emails.GetTemplateUseCasesResponse> getGetTemplateUseCasesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.emails.GetTemplateUseCasesResponse> getGetTemplateUseCasesMethod;
    if ((getGetTemplateUseCasesMethod = EmailServiceGrpc.getGetTemplateUseCasesMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getGetTemplateUseCasesMethod = EmailServiceGrpc.getGetTemplateUseCasesMethod) == null) {
          EmailServiceGrpc.getGetTemplateUseCasesMethod = getGetTemplateUseCasesMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.emails.GetTemplateUseCasesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTemplateUseCases"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.GetTemplateUseCasesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("GetTemplateUseCases"))
              .build();
        }
      }
    }
    return getGetTemplateUseCasesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateRequest,
      com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateResponse> getCreateEmailTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEmailTemplate",
      requestType = com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateRequest,
      com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateResponse> getCreateEmailTemplateMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateRequest, com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateResponse> getCreateEmailTemplateMethod;
    if ((getCreateEmailTemplateMethod = EmailServiceGrpc.getCreateEmailTemplateMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getCreateEmailTemplateMethod = EmailServiceGrpc.getCreateEmailTemplateMethod) == null) {
          EmailServiceGrpc.getCreateEmailTemplateMethod = getCreateEmailTemplateMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateRequest, com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEmailTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("CreateEmailTemplate"))
              .build();
        }
      }
    }
    return getCreateEmailTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.PatchEmailTemplateRequest,
      com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse> getUpdateEmailTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEmailTemplate",
      requestType = com.scalekit.grpc.scalekit.v1.emails.PatchEmailTemplateRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.PatchEmailTemplateRequest,
      com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse> getUpdateEmailTemplateMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.PatchEmailTemplateRequest, com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse> getUpdateEmailTemplateMethod;
    if ((getUpdateEmailTemplateMethod = EmailServiceGrpc.getUpdateEmailTemplateMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getUpdateEmailTemplateMethod = EmailServiceGrpc.getUpdateEmailTemplateMethod) == null) {
          EmailServiceGrpc.getUpdateEmailTemplateMethod = getUpdateEmailTemplateMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.emails.PatchEmailTemplateRequest, com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEmailTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.PatchEmailTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("UpdateEmailTemplate"))
              .build();
        }
      }
    }
    return getUpdateEmailTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.emails.GetEmailConfigurationResponse> getGetEmailConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmailConfiguration",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.scalekit.grpc.scalekit.v1.emails.GetEmailConfigurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.emails.GetEmailConfigurationResponse> getGetEmailConfigurationMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.emails.GetEmailConfigurationResponse> getGetEmailConfigurationMethod;
    if ((getGetEmailConfigurationMethod = EmailServiceGrpc.getGetEmailConfigurationMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getGetEmailConfigurationMethod = EmailServiceGrpc.getGetEmailConfigurationMethod) == null) {
          EmailServiceGrpc.getGetEmailConfigurationMethod = getGetEmailConfigurationMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.emails.GetEmailConfigurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmailConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.GetEmailConfigurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("GetEmailConfiguration"))
              .build();
        }
      }
    }
    return getGetEmailConfigurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationRequest,
      com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationResponse> getUpsertEmailConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertEmailConfiguration",
      requestType = com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationRequest,
      com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationResponse> getUpsertEmailConfigurationMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationRequest, com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationResponse> getUpsertEmailConfigurationMethod;
    if ((getUpsertEmailConfigurationMethod = EmailServiceGrpc.getUpsertEmailConfigurationMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getUpsertEmailConfigurationMethod = EmailServiceGrpc.getUpsertEmailConfigurationMethod) == null) {
          EmailServiceGrpc.getUpsertEmailConfigurationMethod = getUpsertEmailConfigurationMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationRequest, com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertEmailConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("UpsertEmailConfiguration"))
              .build();
        }
      }
    }
    return getUpsertEmailConfigurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateRequest,
      com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateResponse> getEnableEmailTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableEmailTemplate",
      requestType = com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateRequest,
      com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateResponse> getEnableEmailTemplateMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateRequest, com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateResponse> getEnableEmailTemplateMethod;
    if ((getEnableEmailTemplateMethod = EmailServiceGrpc.getEnableEmailTemplateMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getEnableEmailTemplateMethod = EmailServiceGrpc.getEnableEmailTemplateMethod) == null) {
          EmailServiceGrpc.getEnableEmailTemplateMethod = getEnableEmailTemplateMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateRequest, com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableEmailTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("EnableEmailTemplate"))
              .build();
        }
      }
    }
    return getEnableEmailTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.DisableEmailTemplateRequest,
      com.google.protobuf.Empty> getDisableEmailTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableEmailTemplate",
      requestType = com.scalekit.grpc.scalekit.v1.emails.DisableEmailTemplateRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.DisableEmailTemplateRequest,
      com.google.protobuf.Empty> getDisableEmailTemplateMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.DisableEmailTemplateRequest, com.google.protobuf.Empty> getDisableEmailTemplateMethod;
    if ((getDisableEmailTemplateMethod = EmailServiceGrpc.getDisableEmailTemplateMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getDisableEmailTemplateMethod = EmailServiceGrpc.getDisableEmailTemplateMethod) == null) {
          EmailServiceGrpc.getDisableEmailTemplateMethod = getDisableEmailTemplateMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.emails.DisableEmailTemplateRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableEmailTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.DisableEmailTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("DisableEmailTemplate"))
              .build();
        }
      }
    }
    return getDisableEmailTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateRequest,
      com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse> getGetEmailTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmailTemplate",
      requestType = com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateRequest,
      com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse> getGetEmailTemplateMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateRequest, com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse> getGetEmailTemplateMethod;
    if ((getGetEmailTemplateMethod = EmailServiceGrpc.getGetEmailTemplateMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getGetEmailTemplateMethod = EmailServiceGrpc.getGetEmailTemplateMethod) == null) {
          EmailServiceGrpc.getGetEmailTemplateMethod = getGetEmailTemplateMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateRequest, com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmailTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("GetEmailTemplate"))
              .build();
        }
      }
    }
    return getGetEmailTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateRequest,
      com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateResponse> getListEmailTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEmailTemplates",
      requestType = com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateRequest,
      com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateResponse> getListEmailTemplatesMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateRequest, com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateResponse> getListEmailTemplatesMethod;
    if ((getListEmailTemplatesMethod = EmailServiceGrpc.getListEmailTemplatesMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getListEmailTemplatesMethod = EmailServiceGrpc.getListEmailTemplatesMethod) == null) {
          EmailServiceGrpc.getListEmailTemplatesMethod = getListEmailTemplatesMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateRequest, com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEmailTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("ListEmailTemplates"))
              .build();
        }
      }
    }
    return getListEmailTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.DeleteEmailTemplateRequest,
      com.google.protobuf.Empty> getDeleteEmailTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEmailTemplate",
      requestType = com.scalekit.grpc.scalekit.v1.emails.DeleteEmailTemplateRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.DeleteEmailTemplateRequest,
      com.google.protobuf.Empty> getDeleteEmailTemplateMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.DeleteEmailTemplateRequest, com.google.protobuf.Empty> getDeleteEmailTemplateMethod;
    if ((getDeleteEmailTemplateMethod = EmailServiceGrpc.getDeleteEmailTemplateMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getDeleteEmailTemplateMethod = EmailServiceGrpc.getDeleteEmailTemplateMethod) == null) {
          EmailServiceGrpc.getDeleteEmailTemplateMethod = getDeleteEmailTemplateMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.emails.DeleteEmailTemplateRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEmailTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.DeleteEmailTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("DeleteEmailTemplate"))
              .build();
        }
      }
    }
    return getDeleteEmailTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerRequest,
      com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerResponse> getCreateEmailServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEmailServer",
      requestType = com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerRequest,
      com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerResponse> getCreateEmailServerMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerRequest, com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerResponse> getCreateEmailServerMethod;
    if ((getCreateEmailServerMethod = EmailServiceGrpc.getCreateEmailServerMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getCreateEmailServerMethod = EmailServiceGrpc.getCreateEmailServerMethod) == null) {
          EmailServiceGrpc.getCreateEmailServerMethod = getCreateEmailServerMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerRequest, com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEmailServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("CreateEmailServer"))
              .build();
        }
      }
    }
    return getCreateEmailServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.PatchEmailServerSettingsRequest,
      com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse> getUpdateEmailServerSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEmailServerSettings",
      requestType = com.scalekit.grpc.scalekit.v1.emails.PatchEmailServerSettingsRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.PatchEmailServerSettingsRequest,
      com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse> getUpdateEmailServerSettingsMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.PatchEmailServerSettingsRequest, com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse> getUpdateEmailServerSettingsMethod;
    if ((getUpdateEmailServerSettingsMethod = EmailServiceGrpc.getUpdateEmailServerSettingsMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getUpdateEmailServerSettingsMethod = EmailServiceGrpc.getUpdateEmailServerSettingsMethod) == null) {
          EmailServiceGrpc.getUpdateEmailServerSettingsMethod = getUpdateEmailServerSettingsMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.emails.PatchEmailServerSettingsRequest, com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEmailServerSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.PatchEmailServerSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("UpdateEmailServerSettings"))
              .build();
        }
      }
    }
    return getUpdateEmailServerSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerRequest,
      com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerResponse> getEnableEmailServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableEmailServer",
      requestType = com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerRequest,
      com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerResponse> getEnableEmailServerMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerRequest, com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerResponse> getEnableEmailServerMethod;
    if ((getEnableEmailServerMethod = EmailServiceGrpc.getEnableEmailServerMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getEnableEmailServerMethod = EmailServiceGrpc.getEnableEmailServerMethod) == null) {
          EmailServiceGrpc.getEnableEmailServerMethod = getEnableEmailServerMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerRequest, com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableEmailServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("EnableEmailServer"))
              .build();
        }
      }
    }
    return getEnableEmailServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.DisableEmailServerRequest,
      com.google.protobuf.Empty> getDisableEmailServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableEmailServer",
      requestType = com.scalekit.grpc.scalekit.v1.emails.DisableEmailServerRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.DisableEmailServerRequest,
      com.google.protobuf.Empty> getDisableEmailServerMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.DisableEmailServerRequest, com.google.protobuf.Empty> getDisableEmailServerMethod;
    if ((getDisableEmailServerMethod = EmailServiceGrpc.getDisableEmailServerMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getDisableEmailServerMethod = EmailServiceGrpc.getDisableEmailServerMethod) == null) {
          EmailServiceGrpc.getDisableEmailServerMethod = getDisableEmailServerMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.emails.DisableEmailServerRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableEmailServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.DisableEmailServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("DisableEmailServer"))
              .build();
        }
      }
    }
    return getDisableEmailServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.GetEmailServerRequest,
      com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse> getGetEmailServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmailServer",
      requestType = com.scalekit.grpc.scalekit.v1.emails.GetEmailServerRequest.class,
      responseType = com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.GetEmailServerRequest,
      com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse> getGetEmailServerMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.GetEmailServerRequest, com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse> getGetEmailServerMethod;
    if ((getGetEmailServerMethod = EmailServiceGrpc.getGetEmailServerMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getGetEmailServerMethod = EmailServiceGrpc.getGetEmailServerMethod) == null) {
          EmailServiceGrpc.getGetEmailServerMethod = getGetEmailServerMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.emails.GetEmailServerRequest, com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmailServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.GetEmailServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("GetEmailServer"))
              .build();
        }
      }
    }
    return getGetEmailServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.emails.ListEmailServerResponse> getListEmailServersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEmailServers",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.scalekit.grpc.scalekit.v1.emails.ListEmailServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.scalekit.grpc.scalekit.v1.emails.ListEmailServerResponse> getListEmailServersMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.emails.ListEmailServerResponse> getListEmailServersMethod;
    if ((getListEmailServersMethod = EmailServiceGrpc.getListEmailServersMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getListEmailServersMethod = EmailServiceGrpc.getListEmailServersMethod) == null) {
          EmailServiceGrpc.getListEmailServersMethod = getListEmailServersMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.scalekit.grpc.scalekit.v1.emails.ListEmailServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEmailServers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.ListEmailServerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("ListEmailServers"))
              .build();
        }
      }
    }
    return getListEmailServersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.DeleteEmailServerRequest,
      com.google.protobuf.Empty> getDeleteEmailServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEmailServer",
      requestType = com.scalekit.grpc.scalekit.v1.emails.DeleteEmailServerRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.DeleteEmailServerRequest,
      com.google.protobuf.Empty> getDeleteEmailServerMethod() {
    io.grpc.MethodDescriptor<com.scalekit.grpc.scalekit.v1.emails.DeleteEmailServerRequest, com.google.protobuf.Empty> getDeleteEmailServerMethod;
    if ((getDeleteEmailServerMethod = EmailServiceGrpc.getDeleteEmailServerMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getDeleteEmailServerMethod = EmailServiceGrpc.getDeleteEmailServerMethod) == null) {
          EmailServiceGrpc.getDeleteEmailServerMethod = getDeleteEmailServerMethod =
              io.grpc.MethodDescriptor.<com.scalekit.grpc.scalekit.v1.emails.DeleteEmailServerRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEmailServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scalekit.grpc.scalekit.v1.emails.DeleteEmailServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("DeleteEmailServer"))
              .build();
        }
      }
    }
    return getDeleteEmailServerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmailServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmailServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmailServiceStub>() {
        @java.lang.Override
        public EmailServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmailServiceStub(channel, callOptions);
        }
      };
    return EmailServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmailServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmailServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmailServiceBlockingStub>() {
        @java.lang.Override
        public EmailServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmailServiceBlockingStub(channel, callOptions);
        }
      };
    return EmailServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmailServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmailServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmailServiceFutureStub>() {
        @java.lang.Override
        public EmailServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmailServiceFutureStub(channel, callOptions);
        }
      };
    return EmailServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getTemplatePlaceholders(com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTemplatePlaceholdersMethod(), responseObserver);
    }

    /**
     */
    default void getTemplateUseCases(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetTemplateUseCasesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTemplateUseCasesMethod(), responseObserver);
    }

    /**
     */
    default void createEmailTemplate(com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEmailTemplateMethod(), responseObserver);
    }

    /**
     */
    default void updateEmailTemplate(com.scalekit.grpc.scalekit.v1.emails.PatchEmailTemplateRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEmailTemplateMethod(), responseObserver);
    }

    /**
     */
    default void getEmailConfiguration(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetEmailConfigurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmailConfigurationMethod(), responseObserver);
    }

    /**
     */
    default void upsertEmailConfiguration(com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertEmailConfigurationMethod(), responseObserver);
    }

    /**
     */
    default void enableEmailTemplate(com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableEmailTemplateMethod(), responseObserver);
    }

    /**
     */
    default void disableEmailTemplate(com.scalekit.grpc.scalekit.v1.emails.DisableEmailTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableEmailTemplateMethod(), responseObserver);
    }

    /**
     */
    default void getEmailTemplate(com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmailTemplateMethod(), responseObserver);
    }

    /**
     */
    default void listEmailTemplates(com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEmailTemplatesMethod(), responseObserver);
    }

    /**
     */
    default void deleteEmailTemplate(com.scalekit.grpc.scalekit.v1.emails.DeleteEmailTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEmailTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Email Server Services
     * </pre>
     */
    default void createEmailServer(com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEmailServerMethod(), responseObserver);
    }

    /**
     */
    default void updateEmailServerSettings(com.scalekit.grpc.scalekit.v1.emails.PatchEmailServerSettingsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEmailServerSettingsMethod(), responseObserver);
    }

    /**
     */
    default void enableEmailServer(com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableEmailServerMethod(), responseObserver);
    }

    /**
     */
    default void disableEmailServer(com.scalekit.grpc.scalekit.v1.emails.DisableEmailServerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableEmailServerMethod(), responseObserver);
    }

    /**
     */
    default void getEmailServer(com.scalekit.grpc.scalekit.v1.emails.GetEmailServerRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmailServerMethod(), responseObserver);
    }

    /**
     */
    default void listEmailServers(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.ListEmailServerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEmailServersMethod(), responseObserver);
    }

    /**
     */
    default void deleteEmailServer(com.scalekit.grpc.scalekit.v1.emails.DeleteEmailServerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEmailServerMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EmailService.
   */
  public static abstract class EmailServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EmailServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EmailService.
   */
  public static final class EmailServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EmailServiceStub> {
    private EmailServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmailServiceStub(channel, callOptions);
    }

    /**
     */
    public void getTemplatePlaceholders(com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTemplatePlaceholdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTemplateUseCases(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetTemplateUseCasesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTemplateUseCasesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createEmailTemplate(com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEmailTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEmailTemplate(com.scalekit.grpc.scalekit.v1.emails.PatchEmailTemplateRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEmailTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEmailConfiguration(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetEmailConfigurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmailConfigurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void upsertEmailConfiguration(com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertEmailConfigurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableEmailTemplate(com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableEmailTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableEmailTemplate(com.scalekit.grpc.scalekit.v1.emails.DisableEmailTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableEmailTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEmailTemplate(com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmailTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listEmailTemplates(com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEmailTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEmailTemplate(com.scalekit.grpc.scalekit.v1.emails.DeleteEmailTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEmailTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Email Server Services
     * </pre>
     */
    public void createEmailServer(com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEmailServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEmailServerSettings(com.scalekit.grpc.scalekit.v1.emails.PatchEmailServerSettingsRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEmailServerSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableEmailServer(com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableEmailServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableEmailServer(com.scalekit.grpc.scalekit.v1.emails.DisableEmailServerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableEmailServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEmailServer(com.scalekit.grpc.scalekit.v1.emails.GetEmailServerRequest request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmailServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listEmailServers(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.ListEmailServerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEmailServersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEmailServer(com.scalekit.grpc.scalekit.v1.emails.DeleteEmailServerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEmailServerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EmailService.
   */
  public static final class EmailServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EmailServiceBlockingStub> {
    private EmailServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmailServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersResponse getTemplatePlaceholders(com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTemplatePlaceholdersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.emails.GetTemplateUseCasesResponse getTemplateUseCases(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTemplateUseCasesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateResponse createEmailTemplate(com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEmailTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse updateEmailTemplate(com.scalekit.grpc.scalekit.v1.emails.PatchEmailTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEmailTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.emails.GetEmailConfigurationResponse getEmailConfiguration(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmailConfigurationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationResponse upsertEmailConfiguration(com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertEmailConfigurationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateResponse enableEmailTemplate(com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableEmailTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty disableEmailTemplate(com.scalekit.grpc.scalekit.v1.emails.DisableEmailTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableEmailTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse getEmailTemplate(com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmailTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateResponse listEmailTemplates(com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEmailTemplatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteEmailTemplate(com.scalekit.grpc.scalekit.v1.emails.DeleteEmailTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEmailTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Email Server Services
     * </pre>
     */
    public com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerResponse createEmailServer(com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEmailServerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse updateEmailServerSettings(com.scalekit.grpc.scalekit.v1.emails.PatchEmailServerSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEmailServerSettingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerResponse enableEmailServer(com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableEmailServerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty disableEmailServer(com.scalekit.grpc.scalekit.v1.emails.DisableEmailServerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableEmailServerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse getEmailServer(com.scalekit.grpc.scalekit.v1.emails.GetEmailServerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmailServerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scalekit.grpc.scalekit.v1.emails.ListEmailServerResponse listEmailServers(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEmailServersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteEmailServer(com.scalekit.grpc.scalekit.v1.emails.DeleteEmailServerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEmailServerMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EmailService.
   */
  public static final class EmailServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EmailServiceFutureStub> {
    private EmailServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmailServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersResponse> getTemplatePlaceholders(
        com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTemplatePlaceholdersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.emails.GetTemplateUseCasesResponse> getTemplateUseCases(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTemplateUseCasesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateResponse> createEmailTemplate(
        com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEmailTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse> updateEmailTemplate(
        com.scalekit.grpc.scalekit.v1.emails.PatchEmailTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEmailTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.emails.GetEmailConfigurationResponse> getEmailConfiguration(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmailConfigurationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationResponse> upsertEmailConfiguration(
        com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertEmailConfigurationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateResponse> enableEmailTemplate(
        com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableEmailTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> disableEmailTemplate(
        com.scalekit.grpc.scalekit.v1.emails.DisableEmailTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableEmailTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse> getEmailTemplate(
        com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmailTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateResponse> listEmailTemplates(
        com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEmailTemplatesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteEmailTemplate(
        com.scalekit.grpc.scalekit.v1.emails.DeleteEmailTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEmailTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Email Server Services
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerResponse> createEmailServer(
        com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEmailServerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse> updateEmailServerSettings(
        com.scalekit.grpc.scalekit.v1.emails.PatchEmailServerSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEmailServerSettingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerResponse> enableEmailServer(
        com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableEmailServerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> disableEmailServer(
        com.scalekit.grpc.scalekit.v1.emails.DisableEmailServerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableEmailServerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse> getEmailServer(
        com.scalekit.grpc.scalekit.v1.emails.GetEmailServerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmailServerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scalekit.grpc.scalekit.v1.emails.ListEmailServerResponse> listEmailServers(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEmailServersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteEmailServer(
        com.scalekit.grpc.scalekit.v1.emails.DeleteEmailServerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEmailServerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TEMPLATE_PLACEHOLDERS = 0;
  private static final int METHODID_GET_TEMPLATE_USE_CASES = 1;
  private static final int METHODID_CREATE_EMAIL_TEMPLATE = 2;
  private static final int METHODID_UPDATE_EMAIL_TEMPLATE = 3;
  private static final int METHODID_GET_EMAIL_CONFIGURATION = 4;
  private static final int METHODID_UPSERT_EMAIL_CONFIGURATION = 5;
  private static final int METHODID_ENABLE_EMAIL_TEMPLATE = 6;
  private static final int METHODID_DISABLE_EMAIL_TEMPLATE = 7;
  private static final int METHODID_GET_EMAIL_TEMPLATE = 8;
  private static final int METHODID_LIST_EMAIL_TEMPLATES = 9;
  private static final int METHODID_DELETE_EMAIL_TEMPLATE = 10;
  private static final int METHODID_CREATE_EMAIL_SERVER = 11;
  private static final int METHODID_UPDATE_EMAIL_SERVER_SETTINGS = 12;
  private static final int METHODID_ENABLE_EMAIL_SERVER = 13;
  private static final int METHODID_DISABLE_EMAIL_SERVER = 14;
  private static final int METHODID_GET_EMAIL_SERVER = 15;
  private static final int METHODID_LIST_EMAIL_SERVERS = 16;
  private static final int METHODID_DELETE_EMAIL_SERVER = 17;

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
        case METHODID_GET_TEMPLATE_PLACEHOLDERS:
          serviceImpl.getTemplatePlaceholders((com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersResponse>) responseObserver);
          break;
        case METHODID_GET_TEMPLATE_USE_CASES:
          serviceImpl.getTemplateUseCases((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetTemplateUseCasesResponse>) responseObserver);
          break;
        case METHODID_CREATE_EMAIL_TEMPLATE:
          serviceImpl.createEmailTemplate((com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EMAIL_TEMPLATE:
          serviceImpl.updateEmailTemplate((com.scalekit.grpc.scalekit.v1.emails.PatchEmailTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse>) responseObserver);
          break;
        case METHODID_GET_EMAIL_CONFIGURATION:
          serviceImpl.getEmailConfiguration((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetEmailConfigurationResponse>) responseObserver);
          break;
        case METHODID_UPSERT_EMAIL_CONFIGURATION:
          serviceImpl.upsertEmailConfiguration((com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationResponse>) responseObserver);
          break;
        case METHODID_ENABLE_EMAIL_TEMPLATE:
          serviceImpl.enableEmailTemplate((com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateResponse>) responseObserver);
          break;
        case METHODID_DISABLE_EMAIL_TEMPLATE:
          serviceImpl.disableEmailTemplate((com.scalekit.grpc.scalekit.v1.emails.DisableEmailTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_EMAIL_TEMPLATE:
          serviceImpl.getEmailTemplate((com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse>) responseObserver);
          break;
        case METHODID_LIST_EMAIL_TEMPLATES:
          serviceImpl.listEmailTemplates((com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateResponse>) responseObserver);
          break;
        case METHODID_DELETE_EMAIL_TEMPLATE:
          serviceImpl.deleteEmailTemplate((com.scalekit.grpc.scalekit.v1.emails.DeleteEmailTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_EMAIL_SERVER:
          serviceImpl.createEmailServer((com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EMAIL_SERVER_SETTINGS:
          serviceImpl.updateEmailServerSettings((com.scalekit.grpc.scalekit.v1.emails.PatchEmailServerSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse>) responseObserver);
          break;
        case METHODID_ENABLE_EMAIL_SERVER:
          serviceImpl.enableEmailServer((com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerResponse>) responseObserver);
          break;
        case METHODID_DISABLE_EMAIL_SERVER:
          serviceImpl.disableEmailServer((com.scalekit.grpc.scalekit.v1.emails.DisableEmailServerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_EMAIL_SERVER:
          serviceImpl.getEmailServer((com.scalekit.grpc.scalekit.v1.emails.GetEmailServerRequest) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse>) responseObserver);
          break;
        case METHODID_LIST_EMAIL_SERVERS:
          serviceImpl.listEmailServers((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.scalekit.grpc.scalekit.v1.emails.ListEmailServerResponse>) responseObserver);
          break;
        case METHODID_DELETE_EMAIL_SERVER:
          serviceImpl.deleteEmailServer((com.scalekit.grpc.scalekit.v1.emails.DeleteEmailServerRequest) request,
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
          getGetTemplatePlaceholdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersRequest,
              com.scalekit.grpc.scalekit.v1.emails.GetPlaceholdersResponse>(
                service, METHODID_GET_TEMPLATE_PLACEHOLDERS)))
        .addMethod(
          getGetTemplateUseCasesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.scalekit.grpc.scalekit.v1.emails.GetTemplateUseCasesResponse>(
                service, METHODID_GET_TEMPLATE_USE_CASES)))
        .addMethod(
          getCreateEmailTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateRequest,
              com.scalekit.grpc.scalekit.v1.emails.CreateEmailTemplateResponse>(
                service, METHODID_CREATE_EMAIL_TEMPLATE)))
        .addMethod(
          getUpdateEmailTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.emails.PatchEmailTemplateRequest,
              com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse>(
                service, METHODID_UPDATE_EMAIL_TEMPLATE)))
        .addMethod(
          getGetEmailConfigurationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.scalekit.grpc.scalekit.v1.emails.GetEmailConfigurationResponse>(
                service, METHODID_GET_EMAIL_CONFIGURATION)))
        .addMethod(
          getUpsertEmailConfigurationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationRequest,
              com.scalekit.grpc.scalekit.v1.emails.UpsertEmailConfigurationResponse>(
                service, METHODID_UPSERT_EMAIL_CONFIGURATION)))
        .addMethod(
          getEnableEmailTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateRequest,
              com.scalekit.grpc.scalekit.v1.emails.EnableEmailTemplateResponse>(
                service, METHODID_ENABLE_EMAIL_TEMPLATE)))
        .addMethod(
          getDisableEmailTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.emails.DisableEmailTemplateRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DISABLE_EMAIL_TEMPLATE)))
        .addMethod(
          getGetEmailTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateRequest,
              com.scalekit.grpc.scalekit.v1.emails.GetEmailTemplateResponse>(
                service, METHODID_GET_EMAIL_TEMPLATE)))
        .addMethod(
          getListEmailTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateRequest,
              com.scalekit.grpc.scalekit.v1.emails.ListEmailTemplateResponse>(
                service, METHODID_LIST_EMAIL_TEMPLATES)))
        .addMethod(
          getDeleteEmailTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.emails.DeleteEmailTemplateRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_EMAIL_TEMPLATE)))
        .addMethod(
          getCreateEmailServerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerRequest,
              com.scalekit.grpc.scalekit.v1.emails.CreateEmailServerResponse>(
                service, METHODID_CREATE_EMAIL_SERVER)))
        .addMethod(
          getUpdateEmailServerSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.emails.PatchEmailServerSettingsRequest,
              com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse>(
                service, METHODID_UPDATE_EMAIL_SERVER_SETTINGS)))
        .addMethod(
          getEnableEmailServerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerRequest,
              com.scalekit.grpc.scalekit.v1.emails.EnableEmailServerResponse>(
                service, METHODID_ENABLE_EMAIL_SERVER)))
        .addMethod(
          getDisableEmailServerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.emails.DisableEmailServerRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DISABLE_EMAIL_SERVER)))
        .addMethod(
          getGetEmailServerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.emails.GetEmailServerRequest,
              com.scalekit.grpc.scalekit.v1.emails.GetEmailServerResponse>(
                service, METHODID_GET_EMAIL_SERVER)))
        .addMethod(
          getListEmailServersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.scalekit.grpc.scalekit.v1.emails.ListEmailServerResponse>(
                service, METHODID_LIST_EMAIL_SERVERS)))
        .addMethod(
          getDeleteEmailServerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.scalekit.grpc.scalekit.v1.emails.DeleteEmailServerRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_EMAIL_SERVER)))
        .build();
  }

  private static abstract class EmailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmailServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scalekit.grpc.scalekit.v1.emails.EmailsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmailService");
    }
  }

  private static final class EmailServiceFileDescriptorSupplier
      extends EmailServiceBaseDescriptorSupplier {
    EmailServiceFileDescriptorSupplier() {}
  }

  private static final class EmailServiceMethodDescriptorSupplier
      extends EmailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EmailServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EmailServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmailServiceFileDescriptorSupplier())
              .addMethod(getGetTemplatePlaceholdersMethod())
              .addMethod(getGetTemplateUseCasesMethod())
              .addMethod(getCreateEmailTemplateMethod())
              .addMethod(getUpdateEmailTemplateMethod())
              .addMethod(getGetEmailConfigurationMethod())
              .addMethod(getUpsertEmailConfigurationMethod())
              .addMethod(getEnableEmailTemplateMethod())
              .addMethod(getDisableEmailTemplateMethod())
              .addMethod(getGetEmailTemplateMethod())
              .addMethod(getListEmailTemplatesMethod())
              .addMethod(getDeleteEmailTemplateMethod())
              .addMethod(getCreateEmailServerMethod())
              .addMethod(getUpdateEmailServerSettingsMethod())
              .addMethod(getEnableEmailServerMethod())
              .addMethod(getDisableEmailServerMethod())
              .addMethod(getGetEmailServerMethod())
              .addMethod(getListEmailServersMethod())
              .addMethod(getDeleteEmailServerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
