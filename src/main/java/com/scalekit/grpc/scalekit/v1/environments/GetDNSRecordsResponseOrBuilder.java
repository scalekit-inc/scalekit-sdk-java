// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/environments/environments.proto

package com.scalekit.grpc.scalekit.v1.environments;

public interface GetDNSRecordsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.environments.GetDNSRecordsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .scalekit.v1.environments.DNSRecords dns_records = 1 [json_name = "dnsRecords"];</code>
   */
  java.util.List<com.scalekit.grpc.scalekit.v1.environments.DNSRecords> 
      getDnsRecordsList();
  /**
   * <code>repeated .scalekit.v1.environments.DNSRecords dns_records = 1 [json_name = "dnsRecords"];</code>
   */
  com.scalekit.grpc.scalekit.v1.environments.DNSRecords getDnsRecords(int index);
  /**
   * <code>repeated .scalekit.v1.environments.DNSRecords dns_records = 1 [json_name = "dnsRecords"];</code>
   */
  int getDnsRecordsCount();
  /**
   * <code>repeated .scalekit.v1.environments.DNSRecords dns_records = 1 [json_name = "dnsRecords"];</code>
   */
  java.util.List<? extends com.scalekit.grpc.scalekit.v1.environments.DNSRecordsOrBuilder> 
      getDnsRecordsOrBuilderList();
  /**
   * <code>repeated .scalekit.v1.environments.DNSRecords dns_records = 1 [json_name = "dnsRecords"];</code>
   */
  com.scalekit.grpc.scalekit.v1.environments.DNSRecordsOrBuilder getDnsRecordsOrBuilder(
      int index);
}
