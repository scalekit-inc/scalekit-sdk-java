// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/members/members.proto

package com.scalekit.grpc.scalekit.v1.members;

public final class MembersProto {
  private MembersProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_members_Member_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_members_Member_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_members_Member_MetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_members_Member_MetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_members_CreateMemberRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_members_CreateMemberRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_members_CreateMemberResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_members_CreateMemberResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_members_UpdateMember_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_members_UpdateMember_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_members_UpdateMember_MetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_members_UpdateMember_MetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_members_UpdateCurrentMemberRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_members_UpdateCurrentMemberRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_members_UpdateMemberRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_members_UpdateMemberRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_members_UpdateMemberResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_members_UpdateMemberResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_members_GetCurrentMemberRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_members_GetCurrentMemberRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_members_GetMemberRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_members_GetMemberRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_members_GetMemberResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_members_GetMemberResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_members_ListMemberRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_members_ListMemberRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_members_ListMemberResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_members_ListMemberResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_members_DeleteMemberRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_members_DeleteMemberRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!scalekit/v1/members/members.proto\022\023sca" +
      "lekit.v1.members\032\033buf/validate/validate." +
      "proto\032\034google/api/annotations.proto\032\033goo" +
      "gle/protobuf/empty.proto\032\037google/protobu" +
      "f/timestamp.proto\032!scalekit/v1/commons/c" +
      "ommons.proto\032!scalekit/v1/options/option" +
      "s.proto\"\243\004\n\006Member\022\016\n\002id\030\001 \001(\tR\002id\022;\n\013cr" +
      "eate_time\030\002 \001(\0132\032.google.protobuf.Timest" +
      "ampR\ncreateTime\022;\n\013update_time\030\003 \001(\0132\032.g" +
      "oogle.protobuf.TimestampR\nupdateTime\022!\n\014" +
      "workspace_id\030\004 \001(\tR\013workspaceId\0223\n\004role\030" +
      "\005 \001(\0162\037.scalekit.v1.members.MemberRoleR\004" +
      "role\022.\n\nfirst_name\030\006 \001(\tB\n\272H\007r\005\020\001\030\310\001H\000R\t" +
      "firstName\210\001\001\022,\n\tlast_name\030\007 \001(\tB\n\272H\007r\005\020\001" +
      "\030\310\001H\001R\010lastName\210\001\001\022\035\n\005email\030\010 \001(\tB\007\272H\004r\002" +
      "`\001R\005email\022`\n\010metadata\030\t \003(\0132).scalekit.v" +
      "1.members.Member.MetadataEntryB\031\272H\026\232\001\023\020\n" +
      "\"\006r\004\020\003\030\031*\007r\005\020\001\030\200\002R\010metadata\032;\n\rMetadataE" +
      "ntry\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\tR\005v" +
      "alue:\0028\001B\r\n\013_first_nameB\014\n\n_last_name\"R\n" +
      "\023CreateMemberRequest\022;\n\006member\030\001 \001(\0132\033.s" +
      "calekit.v1.members.MemberB\006\272H\003\310\001\001R\006membe" +
      "r\"K\n\024CreateMemberResponse\0223\n\006member\030\001 \001(" +
      "\0132\033.scalekit.v1.members.MemberR\006member\"\375" +
      "\002\n\014UpdateMember\0228\n\004role\030\005 \001(\0162\037.scalekit" +
      ".v1.members.MemberRoleH\000R\004role\210\001\001\022.\n\nfir" +
      "st_name\030\006 \001(\tB\n\272H\007r\005\020\001\030\310\001H\001R\tfirstName\210\001" +
      "\001\022,\n\tlast_name\030\007 \001(\tB\n\272H\007r\005\020\001\030\310\001H\002R\010last" +
      "Name\210\001\001\022f\n\010metadata\030\t \003(\0132/.scalekit.v1." +
      "members.UpdateMember.MetadataEntryB\031\272H\026\232" +
      "\001\023\020\n\"\006r\004\020\003\030\031*\007r\005\020\001\030\200\002R\010metadata\032;\n\rMetad" +
      "ataEntry\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(" +
      "\tR\005value:\0028\001B\007\n\005_roleB\r\n\013_first_nameB\014\n\n" +
      "_last_nameJ\004\010\004\020\005J\004\010\010\020\t\"W\n\032UpdateCurrentM" +
      "emberRequest\0229\n\006member\030\001 \001(\0132!.scalekit." +
      "v1.members.UpdateMemberR\006member\"k\n\023Updat" +
      "eMemberRequest\022\031\n\002id\030\001 \001(\tB\t\272H\006r\004\020\023\030\031R\002i" +
      "d\0229\n\006member\030\002 \001(\0132!.scalekit.v1.members." +
      "UpdateMemberR\006member\"K\n\024UpdateMemberResp" +
      "onse\0223\n\006member\030\001 \001(\0132\033.scalekit.v1.membe" +
      "rs.MemberR\006member\"\031\n\027GetCurrentMemberReq" +
      "uest\"-\n\020GetMemberRequest\022\031\n\002id\030\001 \001(\tB\t\272H" +
      "\006r\004\020\023\030\031R\002id\"H\n\021GetMemberResponse\0223\n\006memb" +
      "er\030\001 \001(\0132\033.scalekit.v1.members.MemberR\006m" +
      "ember\"O\n\021ListMemberRequest\022\033\n\tpage_size\030" +
      "\001 \001(\rR\010pageSize\022\035\n\npage_token\030\002 \001(\tR\tpag" +
      "eToken\"\222\001\n\022ListMemberResponse\022&\n\017next_pa" +
      "ge_token\030\001 \001(\tR\rnextPageToken\022\035\n\ntotal_s" +
      "ize\030\002 \001(\rR\ttotalSize\0225\n\007members\030\003 \003(\0132\033." +
      "scalekit.v1.members.MemberR\007members\"0\n\023D" +
      "eleteMemberRequest\022\031\n\002id\030\001 \001(\tB\t\272H\006r\004\020\023\030" +
      "\031R\002id*>\n\nMemberRole\022\033\n\027MEMBER_ROLE_UNSPE" +
      "CIFIED\020\000\022\t\n\005ADMIN\020\001\022\010\n\004USER\020\0022\323\007\n\016Member" +
      "sService\022\212\001\n\014CreateMember\022(.scalekit.v1." +
      "members.CreateMemberRequest\032).scalekit.v" +
      "1.members.CreateMemberResponse\"%\202\265\030\002\030@\202\323" +
      "\344\223\002\031\"\017/api/v1/members:\006member\022\235\001\n\023Update" +
      "CurrentMember\022/.scalekit.v1.members.Upda" +
      "teCurrentMemberRequest\032).scalekit.v1.mem" +
      "bers.UpdateMemberResponse\"*\202\265\030\002\030P\202\323\344\223\002\0362" +
      "\024/api/v1/members:this:\006member\022\217\001\n\014Update" +
      "Member\022(.scalekit.v1.members.UpdateMembe" +
      "rRequest\032).scalekit.v1.members.UpdateMem" +
      "berResponse\"*\202\265\030\002\030@\202\323\344\223\002\0362\024/api/v1/membe" +
      "rs/{id}:\006member\022\214\001\n\020GetCurrentMember\022,.s" +
      "calekit.v1.members.GetCurrentMemberReque" +
      "st\032&.scalekit.v1.members.GetMemberRespon" +
      "se\"\"\202\265\030\002\030P\202\323\344\223\002\026\022\024/api/v1/members:this\022~" +
      "\n\tGetMember\022%.scalekit.v1.members.GetMem" +
      "berRequest\032&.scalekit.v1.members.GetMemb" +
      "erResponse\"\"\202\265\030\002\030@\202\323\344\223\002\026\022\024/api/v1/member" +
      "s/{id}\022}\n\013ListMembers\022&.scalekit.v1.memb" +
      "ers.ListMemberRequest\032\'.scalekit.v1.memb" +
      "ers.ListMemberResponse\"\035\202\265\030\002\030@\202\323\344\223\002\021\022\017/a" +
      "pi/v1/members\022t\n\014DeleteMember\022(.scalekit" +
      ".v1.members.DeleteMemberRequest\032\026.google" +
      ".protobuf.Empty\"\"\202\265\030\002\030@\202\323\344\223\002\026*\024/api/v1/m" +
      "embers/{id}B\326\001\n%com.scalekit.grpc.scalek" +
      "it.v1.membersB\014MembersProtoP\001Z1github.co" +
      "m/scalekit-inc/scalekit/pkg/grpc/members" +
      "\242\002\003SVM\252\002\023Scalekit.V1.Members\312\002\023Scalekit\\" +
      "V1\\Members\342\002\037Scalekit\\V1\\Members\\GPBMeta" +
      "data\352\002\025Scalekit::V1::Membersb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.scalekit.grpc.buf.validate.ValidateProto.getDescriptor(),
          com.scalekit.grpc.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.scalekit.grpc.scalekit.v1.commons.CommonsProto.getDescriptor(),
          com.scalekit.grpc.scalekit.v1.options.OptionsProto.getDescriptor(),
        });
    internal_static_scalekit_v1_members_Member_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_scalekit_v1_members_Member_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_members_Member_descriptor,
        new java.lang.String[] { "Id", "CreateTime", "UpdateTime", "WorkspaceId", "Role", "FirstName", "LastName", "Email", "Metadata", "FirstName", "LastName", });
    internal_static_scalekit_v1_members_Member_MetadataEntry_descriptor =
      internal_static_scalekit_v1_members_Member_descriptor.getNestedTypes().get(0);
    internal_static_scalekit_v1_members_Member_MetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_members_Member_MetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_scalekit_v1_members_CreateMemberRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_scalekit_v1_members_CreateMemberRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_members_CreateMemberRequest_descriptor,
        new java.lang.String[] { "Member", });
    internal_static_scalekit_v1_members_CreateMemberResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_scalekit_v1_members_CreateMemberResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_members_CreateMemberResponse_descriptor,
        new java.lang.String[] { "Member", });
    internal_static_scalekit_v1_members_UpdateMember_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_scalekit_v1_members_UpdateMember_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_members_UpdateMember_descriptor,
        new java.lang.String[] { "Role", "FirstName", "LastName", "Metadata", "Role", "FirstName", "LastName", });
    internal_static_scalekit_v1_members_UpdateMember_MetadataEntry_descriptor =
      internal_static_scalekit_v1_members_UpdateMember_descriptor.getNestedTypes().get(0);
    internal_static_scalekit_v1_members_UpdateMember_MetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_members_UpdateMember_MetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_scalekit_v1_members_UpdateCurrentMemberRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_scalekit_v1_members_UpdateCurrentMemberRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_members_UpdateCurrentMemberRequest_descriptor,
        new java.lang.String[] { "Member", });
    internal_static_scalekit_v1_members_UpdateMemberRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_scalekit_v1_members_UpdateMemberRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_members_UpdateMemberRequest_descriptor,
        new java.lang.String[] { "Id", "Member", });
    internal_static_scalekit_v1_members_UpdateMemberResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_scalekit_v1_members_UpdateMemberResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_members_UpdateMemberResponse_descriptor,
        new java.lang.String[] { "Member", });
    internal_static_scalekit_v1_members_GetCurrentMemberRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_scalekit_v1_members_GetCurrentMemberRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_members_GetCurrentMemberRequest_descriptor,
        new java.lang.String[] { });
    internal_static_scalekit_v1_members_GetMemberRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_scalekit_v1_members_GetMemberRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_members_GetMemberRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_scalekit_v1_members_GetMemberResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_scalekit_v1_members_GetMemberResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_members_GetMemberResponse_descriptor,
        new java.lang.String[] { "Member", });
    internal_static_scalekit_v1_members_ListMemberRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_scalekit_v1_members_ListMemberRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_members_ListMemberRequest_descriptor,
        new java.lang.String[] { "PageSize", "PageToken", });
    internal_static_scalekit_v1_members_ListMemberResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_scalekit_v1_members_ListMemberResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_members_ListMemberResponse_descriptor,
        new java.lang.String[] { "NextPageToken", "TotalSize", "Members", });
    internal_static_scalekit_v1_members_DeleteMemberRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_scalekit_v1_members_DeleteMemberRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_members_DeleteMemberRequest_descriptor,
        new java.lang.String[] { "Id", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.scalekit.grpc.buf.validate.ValidateProto.field);
    registry.add(com.scalekit.grpc.google.api.AnnotationsProto.http);
    registry.add(com.scalekit.grpc.scalekit.v1.options.OptionsProto.authOption);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.scalekit.grpc.buf.validate.ValidateProto.getDescriptor();
    com.scalekit.grpc.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.scalekit.grpc.scalekit.v1.commons.CommonsProto.getDescriptor();
    com.scalekit.grpc.scalekit.v1.options.OptionsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
