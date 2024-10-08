// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/errdetails/errdetails.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.errdetails;

public interface RequestInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.errdetails.RequestInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An opaque string that should only be interpreted by the service generating
   * it. For example, it can be used to identify requests in the service's logs.
   * </pre>
   *
   * <code>string request_id = 1 [json_name = "requestId"];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * An opaque string that should only be interpreted by the service generating
   * it. For example, it can be used to identify requests in the service's logs.
   * </pre>
   *
   * <code>string request_id = 1 [json_name = "requestId"];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * Any data that was used to serve this request. For example, an encrypted
   * stack trace that can be sent back to the service provider for debugging.
   * </pre>
   *
   * <code>string serving_data = 2 [json_name = "servingData"];</code>
   * @return The servingData.
   */
  java.lang.String getServingData();
  /**
   * <pre>
   * Any data that was used to serve this request. For example, an encrypted
   * stack trace that can be sent back to the service provider for debugging.
   * </pre>
   *
   * <code>string serving_data = 2 [json_name = "servingData"];</code>
   * @return The bytes for servingData.
   */
  com.google.protobuf.ByteString
      getServingDataBytes();
}
