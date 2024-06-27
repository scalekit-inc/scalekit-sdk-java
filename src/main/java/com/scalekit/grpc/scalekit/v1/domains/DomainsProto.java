// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/domains/domains.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.domains;

public final class DomainsProto {
  private DomainsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_domains_CreateDomainRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_domains_CreateDomainRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_domains_CreateDomainResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_domains_CreateDomainResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_domains_CreateDomain_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_domains_CreateDomain_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_domains_UpdateDomainRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_domains_UpdateDomainRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_domains_UpdateDomain_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_domains_UpdateDomain_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_domains_UpdateDomainResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_domains_UpdateDomainResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_domains_GetDomainRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_domains_GetDomainRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_domains_GetDomainResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_domains_GetDomainResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_domains_DeleteDomainRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_domains_DeleteDomainRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_domains_ListDomainRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_domains_ListDomainRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_domains_ListDomainResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_domains_ListDomainResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_domains_Domain_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_domains_Domain_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!scalekit/v1/domains/domains.proto\022\023sca" +
      "lekit.v1.domains\032\033buf/validate/validate." +
      "proto\032\034google/api/annotations.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\033google/pro" +
      "tobuf/empty.proto\032\037google/protobuf/times" +
      "tamp.proto\032\036google/protobuf/wrappers.pro" +
      "to\032!scalekit/v1/options/options.proto\"\376\001" +
      "\n\023CreateDomainRequest\0224\n\017organization_id" +
      "\030\001 \001(\tB\t\272H\006r\004\020\001\030 H\000R\016organizationId\022,\n\013e" +
      "xternal_id\030\002 \001(\tB\t\272H\006r\004\020\001\030 H\000R\nexternalI" +
      "d\022(\n\rconnection_id\030\003 \001(\tH\001R\014connectionId" +
      "\210\001\001\0229\n\006domain\030\004 \001(\0132!.scalekit.v1.domain" +
      "s.CreateDomainR\006domainB\014\n\nidentitiesB\020\n\016" +
      "_connection_id\"K\n\024CreateDomainResponse\0223" +
      "\n\006domain\030\001 \001(\0132\033.scalekit.v1.domains.Dom" +
      "ainR\006domain\"5\n\014CreateDomain\022%\n\006domain\030\001 " +
      "\001(\tB\r\272H\nr\005\020\004\030\377\001\310\001\001R\006domain\"\216\002\n\023UpdateDom" +
      "ainRequest\0224\n\017organization_id\030\001 \001(\tB\t\272H\006" +
      "r\004\020\001\030 H\000R\016organizationId\022,\n\013external_id\030" +
      "\002 \001(\tB\t\272H\006r\004\020\001\030 H\000R\nexternalId\022(\n\rconnec" +
      "tion_id\030\003 \001(\tH\001R\014connectionId\210\001\001\022\016\n\002id\030\004" +
      " \001(\tR\002id\0229\n\006domain\030\005 \001(\0132!.scalekit.v1.d" +
      "omains.UpdateDomainR\006domainB\014\n\nidentitie" +
      "sB\020\n\016_connection_id\"\016\n\014UpdateDomain\"K\n\024U" +
      "pdateDomainResponse\0223\n\006domain\030\001 \001(\0132\033.sc" +
      "alekit.v1.domains.DomainR\006domain\"\224\001\n\020Get" +
      "DomainRequest\0224\n\017organization_id\030\001 \001(\tB\t" +
      "\272H\006r\004\020\001\030 H\000R\016organizationId\022,\n\013external_" +
      "id\030\002 \001(\tB\t\272H\006r\004\020\001\030 H\000R\nexternalId\022\016\n\002id\030" +
      "\003 \001(\tR\002idB\014\n\nidentities\"H\n\021GetDomainResp" +
      "onse\0223\n\006domain\030\001 \001(\0132\033.scalekit.v1.domai" +
      "ns.DomainR\006domain\"\323\001\n\023DeleteDomainReques" +
      "t\022\016\n\002id\030\001 \001(\tR\002id\0224\n\017organization_id\030\002 \001" +
      "(\tB\t\272H\006r\004\020\001\030 H\000R\016organizationId\022,\n\013exter" +
      "nal_id\030\003 \001(\tB\t\272H\006r\004\020\001\030 H\000R\nexternalId\022(\n" +
      "\rconnection_id\030\004 \001(\tH\001R\014connectionId\210\001\001B" +
      "\014\n\nidentitiesB\020\n\016_connection_id\"\344\002\n\021List" +
      "DomainRequest\0224\n\017organization_id\030\001 \001(\tB\t" +
      "\272H\006r\004\020\001\030 H\000R\016organizationId\022,\n\013external_" +
      "id\030\002 \001(\tB\t\272H\006r\004\020\001\030 H\000R\nexternalId\022(\n\rcon" +
      "nection_id\030\003 \001(\tH\001R\014connectionId\210\001\001\022\035\n\007i" +
      "nclude\030\004 \001(\tH\002R\007include\210\001\001\0228\n\tpage_size\030" +
      "\005 \001(\0132\033.google.protobuf.Int32ValueR\010page" +
      "Size\022<\n\013page_number\030\006 \001(\0132\033.google.proto" +
      "buf.Int32ValueR\npageNumberB\014\n\nidentities" +
      "B\020\n\016_connection_idB\n\n\010_include\"\211\001\n\022ListD" +
      "omainResponse\022\033\n\tpage_size\030\001 \001(\005R\010pageSi" +
      "ze\022\037\n\013page_number\030\002 \001(\005R\npageNumber\0225\n\007d" +
      "omains\030\003 \003(\0132\033.scalekit.v1.domains.Domai" +
      "nR\007domains\"\376\003\n\006Domain\022\016\n\002id\030\001 \001(\tR\002id\022\026\n" +
      "\006domain\030\002 \001(\tR\006domain\022%\n\016environment_id\030" +
      "\003 \001(\tR\renvironmentId\022\'\n\017organization_id\030" +
      "\004 \001(\tR\016organizationId\022#\n\rconnection_id\030\005" +
      " \001(\tR\014connectionId\022$\n\016txt_record_key\030\006 \001" +
      "(\tR\014txtRecordKey\022*\n\021txt_record_secret\030\007 " +
      "\001(\tR\017txtRecordSecret\022X\n\023verification_sta" +
      "tus\030\010 \001(\0162\'.scalekit.v1.domains.Verifica" +
      "tionStatusR\022verificationStatus\022;\n\013create" +
      "_time\030\t \001(\0132\032.google.protobuf.TimestampR" +
      "\ncreateTime\022;\n\013update_time\030\n \001(\0132\032.googl" +
      "e.protobuf.TimestampR\nupdateTime\022\"\n\ncrea" +
      "ted_by\030\013 \001(\tH\000R\tcreatedBy\210\001\001B\r\n\013_created" +
      "_by*`\n\022VerificationStatus\022#\n\037VERIFICATIO" +
      "N_STATUS_UNSPECIFIED\020\000\022\013\n\007PENDING\020\001\022\014\n\010V" +
      "ERIFIED\020\002\022\n\n\006FAILED\020\0032\217\010\n\rDomainService\022" +
      "\325\001\n\014CreateDomain\022(.scalekit.v1.domains.C" +
      "reateDomainRequest\032).scalekit.v1.domains" +
      ".CreateDomainResponse\"p\202\265\030\002\030\024\202\323\344\223\002d\"//ap" +
      "i/v1/organizations/{organization_id}/dom" +
      "ains:\006domainZ)\"\037/api/v1/organizations/-/" +
      "domains:\006domain\022\332\001\n\014UpdateDomain\022(.scale" +
      "kit.v1.domains.UpdateDomainRequest\032).sca" +
      "lekit.v1.domains.UpdateDomainResponse\"u\202" +
      "\265\030\002\030\024\202\323\344\223\002i24/api/v1/organizations/{orga" +
      "nization_id}/domains/{id}:\006domainZ)2\037/ap" +
      "i/v1/organizations/-/domains:\006domain\022\306\001\n" +
      "\tGetDomain\022%.scalekit.v1.domains.GetDoma" +
      "inRequest\032&.scalekit.v1.domains.GetDomai" +
      "nResponse\"j\202\265\030\002\030\024\202\323\344\223\002^\0224/api/v1/organiz" +
      "ations/{organization_id}/domains/{id}Z&\022" +
      "$/api/v1/organizations/-/domains/{id}\022\274\001" +
      "\n\014DeleteDomain\022(.scalekit.v1.domains.Del" +
      "eteDomainRequest\032\026.google.protobuf.Empty" +
      "\"j\202\265\030\002\030\024\202\323\344\223\002^*4/api/v1/organizations/{o" +
      "rganization_id}/domains/{id}Z&*$/api/v1/" +
      "organizations/-/domains/{id}\022\300\001\n\013ListDom" +
      "ains\022&.scalekit.v1.domains.ListDomainReq" +
      "uest\032\'.scalekit.v1.domains.ListDomainRes" +
      "ponse\"`\202\265\030\002\030\024\202\323\344\223\002T\022//api/v1/organizatio" +
      "ns/{organization_id}/domainsZ!\022\037/api/v1/" +
      "organizations/-/domainsB\326\001\n%com.scalekit" +
      ".grpc.scalekit.v1.domainsB\014DomainsProtoP" +
      "\001Z1github.com/scalekit-inc/scalekit/pkg/" +
      "grpc/domains\242\002\003SVD\252\002\023Scalekit.V1.Domains" +
      "\312\002\023Scalekit\\V1\\Domains\342\002\037Scalekit\\V1\\Dom" +
      "ains\\GPBMetadata\352\002\025Scalekit::V1::Domains" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.scalekit.grpc.buf.validate.ValidateProto.getDescriptor(),
          com.scalekit.grpc.google.api.AnnotationsProto.getDescriptor(),
          com.scalekit.grpc.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.scalekit.grpc.scalekit.v1.options.OptionsProto.getDescriptor(),
        });
    internal_static_scalekit_v1_domains_CreateDomainRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_scalekit_v1_domains_CreateDomainRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_domains_CreateDomainRequest_descriptor,
        new java.lang.String[] { "OrganizationId", "ExternalId", "ConnectionId", "Domain", "Identities", });
    internal_static_scalekit_v1_domains_CreateDomainResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_scalekit_v1_domains_CreateDomainResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_domains_CreateDomainResponse_descriptor,
        new java.lang.String[] { "Domain", });
    internal_static_scalekit_v1_domains_CreateDomain_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_scalekit_v1_domains_CreateDomain_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_domains_CreateDomain_descriptor,
        new java.lang.String[] { "Domain", });
    internal_static_scalekit_v1_domains_UpdateDomainRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_scalekit_v1_domains_UpdateDomainRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_domains_UpdateDomainRequest_descriptor,
        new java.lang.String[] { "OrganizationId", "ExternalId", "ConnectionId", "Id", "Domain", "Identities", });
    internal_static_scalekit_v1_domains_UpdateDomain_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_scalekit_v1_domains_UpdateDomain_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_domains_UpdateDomain_descriptor,
        new java.lang.String[] { });
    internal_static_scalekit_v1_domains_UpdateDomainResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_scalekit_v1_domains_UpdateDomainResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_domains_UpdateDomainResponse_descriptor,
        new java.lang.String[] { "Domain", });
    internal_static_scalekit_v1_domains_GetDomainRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_scalekit_v1_domains_GetDomainRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_domains_GetDomainRequest_descriptor,
        new java.lang.String[] { "OrganizationId", "ExternalId", "Id", "Identities", });
    internal_static_scalekit_v1_domains_GetDomainResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_scalekit_v1_domains_GetDomainResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_domains_GetDomainResponse_descriptor,
        new java.lang.String[] { "Domain", });
    internal_static_scalekit_v1_domains_DeleteDomainRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_scalekit_v1_domains_DeleteDomainRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_domains_DeleteDomainRequest_descriptor,
        new java.lang.String[] { "Id", "OrganizationId", "ExternalId", "ConnectionId", "Identities", });
    internal_static_scalekit_v1_domains_ListDomainRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_scalekit_v1_domains_ListDomainRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_domains_ListDomainRequest_descriptor,
        new java.lang.String[] { "OrganizationId", "ExternalId", "ConnectionId", "Include", "PageSize", "PageNumber", "Identities", });
    internal_static_scalekit_v1_domains_ListDomainResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_scalekit_v1_domains_ListDomainResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_domains_ListDomainResponse_descriptor,
        new java.lang.String[] { "PageSize", "PageNumber", "Domains", });
    internal_static_scalekit_v1_domains_Domain_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_scalekit_v1_domains_Domain_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_domains_Domain_descriptor,
        new java.lang.String[] { "Id", "Domain", "EnvironmentId", "OrganizationId", "ConnectionId", "TxtRecordKey", "TxtRecordSecret", "VerificationStatus", "CreateTime", "UpdateTime", "CreatedBy", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.scalekit.grpc.buf.validate.ValidateProto.field);
    registry.add(com.scalekit.grpc.google.api.AnnotationsProto.http);
    registry.add(com.scalekit.grpc.scalekit.v1.options.OptionsProto.authOption);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.scalekit.grpc.buf.validate.ValidateProto.getDescriptor();
    com.scalekit.grpc.google.api.AnnotationsProto.getDescriptor();
    com.scalekit.grpc.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.scalekit.grpc.scalekit.v1.options.OptionsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
