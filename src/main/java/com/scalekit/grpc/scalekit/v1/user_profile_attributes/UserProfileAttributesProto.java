// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/user_profile_attributes/user_profile_attributes.proto

// Protobuf Java Version: 3.25.3
package com.scalekit.grpc.scalekit.v1.user_profile_attributes;

public final class UserProfileAttributesProto {
  private UserProfileAttributesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_user_profile_attributes_UserProfileAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_user_profile_attributes_UserProfileAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_user_profile_attributes_CreateUserProfileAttributeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_user_profile_attributes_CreateUserProfileAttributeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_user_profile_attributes_CreateUserProfileAttributeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_user_profile_attributes_CreateUserProfileAttributeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_user_profile_attributes_ListUserProfileAttributesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_user_profile_attributes_ListUserProfileAttributesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_user_profile_attributes_UpdateUserProfileAttributeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_user_profile_attributes_UpdateUserProfileAttributeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_user_profile_attributes_UpdateUserProfileAttributeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_user_profile_attributes_UpdateUserProfileAttributeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scalekit_v1_user_profile_attributes_DeleteUserProfileAttributeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scalekit_v1_user_profile_attributes_DeleteUserProfileAttributeRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAscalekit/v1/user_profile_attributes/us" +
      "er_profile_attributes.proto\022#scalekit.v1" +
      ".user_profile_attributes\032\033buf/validate/v" +
      "alidate.proto\032\034google/api/annotations.pr" +
      "oto\032\037google/api/field_behavior.proto\032\031go" +
      "ogle/protobuf/any.proto\032\036google/protobuf" +
      "/duration.proto\032\033google/protobuf/empty.p" +
      "roto\032\037google/protobuf/timestamp.proto\032\034g" +
      "oogle/protobuf/struct.proto\032!scalekit/v1" +
      "/commons/commons.proto\032!scalekit/v1/opti" +
      "ons/options.proto\"\202\004\n\024UserProfileAttribu" +
      "te\022*\n\003key\030\001 \001(\tB\030\272H\025r\023\020\003\030\0312\r^[a-zA-Z-_]+" +
      "$R\003key\022\030\n\007enabled\030\002 \001(\010R\007enabled\022\032\n\010requ" +
      "ired\030\003 \001(\010R\010required\022 \n\005label\030\004 \001(\tB\n\272H\007" +
      "r\005\020\003\030\372\001R\005label\022h\n\010datatype\030\005 \001(\0162A.scale" +
      "kit.v1.user_profile_attributes.UserProfi" +
      "leAttributeDatatypeB\t\272H\006\202\001\003\"\001\000R\010datatype" +
      "\022b\n\010category\030\006 \001(\0162A.scalekit.v1.user_pr" +
      "ofile_attributes.UserProfileAttributeCat" +
      "egoryB\003\340A\003R\010category\022K\n\024default_saml_map" +
      "ping\030\007 \001(\tB\031\272H\026r\024\020\000\030\0312\016^[a-zA-Z-_]+|$R\022d" +
      "efaultSamlMapping\022K\n\024default_oidc_mappin" +
      "g\030\010 \001(\tB\031\272H\026r\024\020\000\030\0312\016^[a-zA-Z-_]+|$R\022defa" +
      "ultOidcMapping\"\234\001\n!CreateUserProfileAttr" +
      "ibuteRequest\022w\n\026user_profile_attribute\030\001" +
      " \001(\01329.scalekit.v1.user_profile_attribut" +
      "es.UserProfileAttributeB\006\272H\003\310\001\001R\024userPro" +
      "fileAttribute\"\225\001\n\"CreateUserProfileAttri" +
      "buteResponse\022o\n\026user_profile_attribute\030\001" +
      " \001(\01329.scalekit.v1.user_profile_attribut" +
      "es.UserProfileAttributeR\024userProfileAttr" +
      "ibute\"\226\001\n!ListUserProfileAttributesRespo" +
      "nse\022q\n\027user_profile_attributes\030\001 \003(\01329.s" +
      "calekit.v1.user_profile_attributes.UserP" +
      "rofileAttributeR\025userProfileAttributes\"\272" +
      "\001\n!UpdateUserProfileAttributeRequest\022\034\n\003" +
      "key\030\001 \001(\tB\n\272H\007r\005\020\003\030\372\001R\003key\022w\n\026user_profi" +
      "le_attribute\030\002 \001(\01329.scalekit.v1.user_pr" +
      "ofile_attributes.UserProfileAttributeB\006\272" +
      "H\003\310\001\001R\024userProfileAttribute\"\225\001\n\"UpdateUs" +
      "erProfileAttributeResponse\022o\n\026user_profi" +
      "le_attribute\030\001 \001(\01329.scalekit.v1.user_pr" +
      "ofile_attributes.UserProfileAttributeR\024u" +
      "serProfileAttribute\"A\n!DeleteUserProfile" +
      "AttributeRequest\022\034\n\003key\030\001 \001(\tB\n\272H\007r\005\020\003\030\372" +
      "\001R\003key*q\n\034UserProfileAttributeDatatype\022\030" +
      "\n\024UNSPECIFIED_DATATYPE\020\000\022\n\n\006STRING\020\001\022\n\n\006" +
      "NUMBER\020\002\022\010\n\004BOOL\020\003\022\t\n\005ARRAY\020\004\022\n\n\006OBJECT\020" +
      "\005*R\n\034UserProfileAttributeCategory\022\030\n\024UNS" +
      "PECIFIED_CATEGORY\020\000\022\014\n\010STANDARD\020\001\022\n\n\006CUS" +
      "TOM\020\0022\362\006\n\033UserProfileAttributeService\022\364\001" +
      "\n\032CreateUserProfileAttribute\022F.scalekit." +
      "v1.user_profile_attributes.CreateUserPro" +
      "fileAttributeRequest\032G.scalekit.v1.user_" +
      "profile_attributes.CreateUserProfileAttr" +
      "ibuteResponse\"E\202\265\030\002\0304\202\323\344\223\0029\"\037/api/v1/use" +
      "r-profile-attributes:\026user_profile_attri" +
      "bute\022\252\001\n\031ListUserProfileAttributes\022\026.goo" +
      "gle.protobuf.Empty\032F.scalekit.v1.user_pr" +
      "ofile_attributes.ListUserProfileAttribut" +
      "esResponse\"-\202\265\030\002\0304\202\323\344\223\002!\022\037/api/v1/user-p" +
      "rofile-attributes\022\372\001\n\032UpdateUserProfileA" +
      "ttribute\022F.scalekit.v1.user_profile_attr" +
      "ibutes.UpdateUserProfileAttributeRequest" +
      "\032G.scalekit.v1.user_profile_attributes.U" +
      "pdateUserProfileAttributeResponse\"K\202\265\030\002\030" +
      "4\202\323\344\223\002?2%/api/v1/user-profile-attributes" +
      "/{key}:\026user_profile_attribute\022\261\001\n\032Delet" +
      "eUserProfileAttribute\022F.scalekit.v1.user" +
      "_profile_attributes.DeleteUserProfileAtt" +
      "ributeRequest\032\026.google.protobuf.Empty\"3\202" +
      "\265\030\002\0304\202\323\344\223\002\'*%/api/v1/user-profile-attrib" +
      "utes/{key}B\274\002\n5com.scalekit.grpc.scaleki" +
      "t.v1.user_profile_attributesB\032UserProfil" +
      "eAttributesProtoP\001ZAgithub.com/scalekit-" +
      "inc/scalekit/pkg/grpc/user_profile_attri" +
      "butes\242\002\003SVU\252\002!Scalekit.V1.UserProfileAtt" +
      "ributes\312\002!Scalekit\\V1\\UserProfileAttribu" +
      "tes\342\002-Scalekit\\V1\\UserProfileAttributes\\" +
      "GPBMetadata\352\002#Scalekit::V1::UserProfileA" +
      "ttributesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.scalekit.grpc.buf.validate.ValidateProto.getDescriptor(),
          com.scalekit.grpc.google.api.AnnotationsProto.getDescriptor(),
          com.scalekit.grpc.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.scalekit.grpc.scalekit.v1.commons.CommonsProto.getDescriptor(),
          com.scalekit.grpc.scalekit.v1.options.OptionsProto.getDescriptor(),
        });
    internal_static_scalekit_v1_user_profile_attributes_UserProfileAttribute_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_scalekit_v1_user_profile_attributes_UserProfileAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_user_profile_attributes_UserProfileAttribute_descriptor,
        new java.lang.String[] { "Key", "Enabled", "Required", "Label", "Datatype", "Category", "DefaultSamlMapping", "DefaultOidcMapping", });
    internal_static_scalekit_v1_user_profile_attributes_CreateUserProfileAttributeRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_scalekit_v1_user_profile_attributes_CreateUserProfileAttributeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_user_profile_attributes_CreateUserProfileAttributeRequest_descriptor,
        new java.lang.String[] { "UserProfileAttribute", });
    internal_static_scalekit_v1_user_profile_attributes_CreateUserProfileAttributeResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_scalekit_v1_user_profile_attributes_CreateUserProfileAttributeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_user_profile_attributes_CreateUserProfileAttributeResponse_descriptor,
        new java.lang.String[] { "UserProfileAttribute", });
    internal_static_scalekit_v1_user_profile_attributes_ListUserProfileAttributesResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_scalekit_v1_user_profile_attributes_ListUserProfileAttributesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_user_profile_attributes_ListUserProfileAttributesResponse_descriptor,
        new java.lang.String[] { "UserProfileAttributes", });
    internal_static_scalekit_v1_user_profile_attributes_UpdateUserProfileAttributeRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_scalekit_v1_user_profile_attributes_UpdateUserProfileAttributeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_user_profile_attributes_UpdateUserProfileAttributeRequest_descriptor,
        new java.lang.String[] { "Key", "UserProfileAttribute", });
    internal_static_scalekit_v1_user_profile_attributes_UpdateUserProfileAttributeResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_scalekit_v1_user_profile_attributes_UpdateUserProfileAttributeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_user_profile_attributes_UpdateUserProfileAttributeResponse_descriptor,
        new java.lang.String[] { "UserProfileAttribute", });
    internal_static_scalekit_v1_user_profile_attributes_DeleteUserProfileAttributeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_scalekit_v1_user_profile_attributes_DeleteUserProfileAttributeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scalekit_v1_user_profile_attributes_DeleteUserProfileAttributeRequest_descriptor,
        new java.lang.String[] { "Key", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.scalekit.grpc.buf.validate.ValidateProto.field);
    registry.add(com.scalekit.grpc.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.scalekit.grpc.google.api.AnnotationsProto.http);
    registry.add(com.scalekit.grpc.scalekit.v1.options.OptionsProto.authOption);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.scalekit.grpc.buf.validate.ValidateProto.getDescriptor();
    com.scalekit.grpc.google.api.AnnotationsProto.getDescriptor();
    com.scalekit.grpc.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.scalekit.grpc.scalekit.v1.commons.CommonsProto.getDescriptor();
    com.scalekit.grpc.scalekit.v1.options.OptionsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
