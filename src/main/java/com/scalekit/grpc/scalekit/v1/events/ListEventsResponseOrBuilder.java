// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/events/events.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.events;

public interface ListEventsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.events.ListEventsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .scalekit.v1.events.ScalekitEvent events = 1 [json_name = "events"];</code>
   */
  java.util.List<com.scalekit.grpc.scalekit.v1.events.ScalekitEvent> 
      getEventsList();
  /**
   * <code>repeated .scalekit.v1.events.ScalekitEvent events = 1 [json_name = "events"];</code>
   */
  com.scalekit.grpc.scalekit.v1.events.ScalekitEvent getEvents(int index);
  /**
   * <code>repeated .scalekit.v1.events.ScalekitEvent events = 1 [json_name = "events"];</code>
   */
  int getEventsCount();
  /**
   * <code>repeated .scalekit.v1.events.ScalekitEvent events = 1 [json_name = "events"];</code>
   */
  java.util.List<? extends com.scalekit.grpc.scalekit.v1.events.ScalekitEventOrBuilder> 
      getEventsOrBuilderList();
  /**
   * <code>repeated .scalekit.v1.events.ScalekitEvent events = 1 [json_name = "events"];</code>
   */
  com.scalekit.grpc.scalekit.v1.events.ScalekitEventOrBuilder getEventsOrBuilder(
      int index);

  /**
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <code>string prev_page_token = 3 [json_name = "prevPageToken"];</code>
   * @return The prevPageToken.
   */
  java.lang.String getPrevPageToken();
  /**
   * <code>string prev_page_token = 3 [json_name = "prevPageToken"];</code>
   * @return The bytes for prevPageToken.
   */
  com.google.protobuf.ByteString
      getPrevPageTokenBytes();

  /**
   * <code>uint32 total_size = 4 [json_name = "totalSize"];</code>
   * @return The totalSize.
   */
  int getTotalSize();
}
