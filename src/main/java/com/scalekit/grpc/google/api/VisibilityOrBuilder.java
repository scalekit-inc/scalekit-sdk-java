// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/visibility.proto

package com.scalekit.grpc.google.api;

public interface VisibilityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Visibility)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1 [json_name = "rules"];</code>
   */
  java.util.List<com.scalekit.grpc.google.api.VisibilityRule> 
      getRulesList();
  /**
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1 [json_name = "rules"];</code>
   */
  com.scalekit.grpc.google.api.VisibilityRule getRules(int index);
  /**
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1 [json_name = "rules"];</code>
   */
  int getRulesCount();
  /**
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1 [json_name = "rules"];</code>
   */
  java.util.List<? extends com.scalekit.grpc.google.api.VisibilityRuleOrBuilder> 
      getRulesOrBuilderList();
  /**
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1 [json_name = "rules"];</code>
   */
  com.scalekit.grpc.google.api.VisibilityRuleOrBuilder getRulesOrBuilder(
      int index);
}