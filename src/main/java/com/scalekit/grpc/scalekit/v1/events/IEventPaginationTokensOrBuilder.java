// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/events/events.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.events;

public interface IEventPaginationTokensOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.events.IEventPaginationTokens)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string NextPage = 1 [json_name = "NextPage"];</code>
   * @return The nextPage.
   */
  java.lang.String getNextPage();
  /**
   * <code>string NextPage = 1 [json_name = "NextPage"];</code>
   * @return The bytes for nextPage.
   */
  com.google.protobuf.ByteString
      getNextPageBytes();

  /**
   * <code>string PreviousPage = 2 [json_name = "PreviousPage"];</code>
   * @return The previousPage.
   */
  java.lang.String getPreviousPage();
  /**
   * <code>string PreviousPage = 2 [json_name = "PreviousPage"];</code>
   * @return The bytes for previousPage.
   */
  com.google.protobuf.ByteString
      getPreviousPageBytes();

  /**
   * <code>uint32 Total = 3 [json_name = "Total"];</code>
   * @return The total.
   */
  int getTotal();
}
