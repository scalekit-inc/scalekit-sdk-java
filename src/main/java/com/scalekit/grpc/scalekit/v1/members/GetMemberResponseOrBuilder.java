// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/members/members.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.members;

public interface GetMemberResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.members.GetMemberResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.scalekit.v1.members.Member member = 1 [json_name = "member"];</code>
   * @return Whether the member field is set.
   */
  boolean hasMember();
  /**
   * <code>.scalekit.v1.members.Member member = 1 [json_name = "member"];</code>
   * @return The member.
   */
  com.scalekit.grpc.scalekit.v1.members.Member getMember();
  /**
   * <code>.scalekit.v1.members.Member member = 1 [json_name = "member"];</code>
   */
  com.scalekit.grpc.scalekit.v1.members.MemberOrBuilder getMemberOrBuilder();
}
