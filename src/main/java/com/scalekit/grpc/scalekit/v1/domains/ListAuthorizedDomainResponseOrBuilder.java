// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/domains/domains.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.domains;

public interface ListAuthorizedDomainResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.domains.ListAuthorizedDomainResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string domains = 1 [json_name = "domains"];</code>
   * @return A list containing the domains.
   */
  java.util.List<java.lang.String>
      getDomainsList();
  /**
   * <code>repeated string domains = 1 [json_name = "domains"];</code>
   * @return The count of domains.
   */
  int getDomainsCount();
  /**
   * <code>repeated string domains = 1 [json_name = "domains"];</code>
   * @param index The index of the element to return.
   * @return The domains at the given index.
   */
  java.lang.String getDomains(int index);
  /**
   * <code>repeated string domains = 1 [json_name = "domains"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the domains at the given index.
   */
  com.google.protobuf.ByteString
      getDomainsBytes(int index);
}
