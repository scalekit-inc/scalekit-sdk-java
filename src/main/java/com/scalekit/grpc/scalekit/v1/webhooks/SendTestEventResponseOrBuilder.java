// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/webhooks/webhooks.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.webhooks;

public interface SendTestEventResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.webhooks.SendTestEventResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string event_type = 1 [json_name = "eventType"];</code>
   * @return The eventType.
   */
  java.lang.String getEventType();
  /**
   * <code>string event_type = 1 [json_name = "eventType"];</code>
   * @return The bytes for eventType.
   */
  com.google.protobuf.ByteString
      getEventTypeBytes();

  /**
   * <code>.google.protobuf.Struct event_payload = 2 [json_name = "eventPayload"];</code>
   * @return Whether the eventPayload field is set.
   */
  boolean hasEventPayload();
  /**
   * <code>.google.protobuf.Struct event_payload = 2 [json_name = "eventPayload"];</code>
   * @return The eventPayload.
   */
  com.google.protobuf.Struct getEventPayload();
  /**
   * <code>.google.protobuf.Struct event_payload = 2 [json_name = "eventPayload"];</code>
   */
  com.google.protobuf.StructOrBuilder getEventPayloadOrBuilder();
}
