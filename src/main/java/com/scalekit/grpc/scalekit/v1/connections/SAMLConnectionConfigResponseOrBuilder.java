// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scalekit/v1/connections/connections.proto

package com.scalekit.grpc.scalekit.v1.connections;

public interface SAMLConnectionConfigResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scalekit.v1.connections.SAMLConnectionConfigResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sp_entity_id = 1 [json_name = "spEntityId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The spEntityId.
   */
  java.lang.String getSpEntityId();
  /**
   * <code>string sp_entity_id = 1 [json_name = "spEntityId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for spEntityId.
   */
  com.google.protobuf.ByteString
      getSpEntityIdBytes();

  /**
   * <code>string sp_assertion_url = 2 [json_name = "spAssertionUrl", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The spAssertionUrl.
   */
  java.lang.String getSpAssertionUrl();
  /**
   * <code>string sp_assertion_url = 2 [json_name = "spAssertionUrl", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for spAssertionUrl.
   */
  com.google.protobuf.ByteString
      getSpAssertionUrlBytes();

  /**
   * <code>string sp_metadata_url = 3 [json_name = "spMetadataUrl", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The spMetadataUrl.
   */
  java.lang.String getSpMetadataUrl();
  /**
   * <code>string sp_metadata_url = 3 [json_name = "spMetadataUrl", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for spMetadataUrl.
   */
  com.google.protobuf.ByteString
      getSpMetadataUrlBytes();

  /**
   * <code>.google.protobuf.StringValue idp_metadata_url = 4 [json_name = "idpMetadataUrl", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the idpMetadataUrl field is set.
   */
  boolean hasIdpMetadataUrl();
  /**
   * <code>.google.protobuf.StringValue idp_metadata_url = 4 [json_name = "idpMetadataUrl", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The idpMetadataUrl.
   */
  com.google.protobuf.StringValue getIdpMetadataUrl();
  /**
   * <code>.google.protobuf.StringValue idp_metadata_url = 4 [json_name = "idpMetadataUrl", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getIdpMetadataUrlOrBuilder();

  /**
   * <code>.google.protobuf.StringValue idp_entity_id = 5 [json_name = "idpEntityId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the idpEntityId field is set.
   */
  boolean hasIdpEntityId();
  /**
   * <code>.google.protobuf.StringValue idp_entity_id = 5 [json_name = "idpEntityId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The idpEntityId.
   */
  com.google.protobuf.StringValue getIdpEntityId();
  /**
   * <code>.google.protobuf.StringValue idp_entity_id = 5 [json_name = "idpEntityId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getIdpEntityIdOrBuilder();

  /**
   * <code>.google.protobuf.StringValue idp_sso_url = 6 [json_name = "idpSsoUrl", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the idpSsoUrl field is set.
   */
  boolean hasIdpSsoUrl();
  /**
   * <code>.google.protobuf.StringValue idp_sso_url = 6 [json_name = "idpSsoUrl", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The idpSsoUrl.
   */
  com.google.protobuf.StringValue getIdpSsoUrl();
  /**
   * <code>.google.protobuf.StringValue idp_sso_url = 6 [json_name = "idpSsoUrl", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getIdpSsoUrlOrBuilder();

  /**
   * <code>repeated .scalekit.v1.connections.IDPCertificate idp_certificates = 7 [json_name = "idpCertificates", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  java.util.List<com.scalekit.grpc.scalekit.v1.connections.IDPCertificate> 
      getIdpCertificatesList();
  /**
   * <code>repeated .scalekit.v1.connections.IDPCertificate idp_certificates = 7 [json_name = "idpCertificates", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.scalekit.grpc.scalekit.v1.connections.IDPCertificate getIdpCertificates(int index);
  /**
   * <code>repeated .scalekit.v1.connections.IDPCertificate idp_certificates = 7 [json_name = "idpCertificates", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  int getIdpCertificatesCount();
  /**
   * <code>repeated .scalekit.v1.connections.IDPCertificate idp_certificates = 7 [json_name = "idpCertificates", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  java.util.List<? extends com.scalekit.grpc.scalekit.v1.connections.IDPCertificateOrBuilder> 
      getIdpCertificatesOrBuilderList();
  /**
   * <code>repeated .scalekit.v1.connections.IDPCertificate idp_certificates = 7 [json_name = "idpCertificates", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.scalekit.grpc.scalekit.v1.connections.IDPCertificateOrBuilder getIdpCertificatesOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.StringValue idp_slo_url = 8 [json_name = "idpSloUrl", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the idpSloUrl field is set.
   */
  boolean hasIdpSloUrl();
  /**
   * <code>.google.protobuf.StringValue idp_slo_url = 8 [json_name = "idpSloUrl", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The idpSloUrl.
   */
  com.google.protobuf.StringValue getIdpSloUrl();
  /**
   * <code>.google.protobuf.StringValue idp_slo_url = 8 [json_name = "idpSloUrl", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getIdpSloUrlOrBuilder();

  /**
   * <code>.google.protobuf.StringValue ui_button_title = 9 [json_name = "uiButtonTitle", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the uiButtonTitle field is set.
   */
  boolean hasUiButtonTitle();
  /**
   * <code>.google.protobuf.StringValue ui_button_title = 9 [json_name = "uiButtonTitle", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The uiButtonTitle.
   */
  com.google.protobuf.StringValue getUiButtonTitle();
  /**
   * <code>.google.protobuf.StringValue ui_button_title = 9 [json_name = "uiButtonTitle", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getUiButtonTitleOrBuilder();

  /**
   * <code>.scalekit.v1.connections.NameIdFormat idp_name_id_format = 10 [json_name = "idpNameIdFormat", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enum numeric value on the wire for idpNameIdFormat.
   */
  int getIdpNameIdFormatValue();
  /**
   * <code>.scalekit.v1.connections.NameIdFormat idp_name_id_format = 10 [json_name = "idpNameIdFormat", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The idpNameIdFormat.
   */
  com.scalekit.grpc.scalekit.v1.connections.NameIdFormat getIdpNameIdFormat();

  /**
   * <code>.scalekit.v1.connections.RequestBinding idp_sso_request_binding = 11 [json_name = "idpSsoRequestBinding", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enum numeric value on the wire for idpSsoRequestBinding.
   */
  int getIdpSsoRequestBindingValue();
  /**
   * <code>.scalekit.v1.connections.RequestBinding idp_sso_request_binding = 11 [json_name = "idpSsoRequestBinding", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The idpSsoRequestBinding.
   */
  com.scalekit.grpc.scalekit.v1.connections.RequestBinding getIdpSsoRequestBinding();

  /**
   * <code>.scalekit.v1.connections.RequestBinding idp_slo_request_binding = 12 [json_name = "idpSloRequestBinding", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enum numeric value on the wire for idpSloRequestBinding.
   */
  int getIdpSloRequestBindingValue();
  /**
   * <code>.scalekit.v1.connections.RequestBinding idp_slo_request_binding = 12 [json_name = "idpSloRequestBinding", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The idpSloRequestBinding.
   */
  com.scalekit.grpc.scalekit.v1.connections.RequestBinding getIdpSloRequestBinding();

  /**
   * <code>.scalekit.v1.connections.SAMLSigningOptions saml_signing_option = 13 [json_name = "samlSigningOption", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enum numeric value on the wire for samlSigningOption.
   */
  int getSamlSigningOptionValue();
  /**
   * <code>.scalekit.v1.connections.SAMLSigningOptions saml_signing_option = 13 [json_name = "samlSigningOption", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The samlSigningOption.
   */
  com.scalekit.grpc.scalekit.v1.connections.SAMLSigningOptions getSamlSigningOption();

  /**
   * <code>.google.protobuf.BoolValue allow_idp_initiated_login = 14 [json_name = "allowIdpInitiatedLogin", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the allowIdpInitiatedLogin field is set.
   */
  boolean hasAllowIdpInitiatedLogin();
  /**
   * <code>.google.protobuf.BoolValue allow_idp_initiated_login = 14 [json_name = "allowIdpInitiatedLogin", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The allowIdpInitiatedLogin.
   */
  com.google.protobuf.BoolValue getAllowIdpInitiatedLogin();
  /**
   * <code>.google.protobuf.BoolValue allow_idp_initiated_login = 14 [json_name = "allowIdpInitiatedLogin", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.BoolValueOrBuilder getAllowIdpInitiatedLoginOrBuilder();

  /**
   * <code>.google.protobuf.BoolValue force_authn = 15 [json_name = "forceAuthn", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the forceAuthn field is set.
   */
  boolean hasForceAuthn();
  /**
   * <code>.google.protobuf.BoolValue force_authn = 15 [json_name = "forceAuthn", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The forceAuthn.
   */
  com.google.protobuf.BoolValue getForceAuthn();
  /**
   * <code>.google.protobuf.BoolValue force_authn = 15 [json_name = "forceAuthn", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.BoolValueOrBuilder getForceAuthnOrBuilder();

  /**
   * <code>.google.protobuf.StringValue default_redirect_uri = 16 [json_name = "defaultRedirectUri", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the defaultRedirectUri field is set.
   */
  boolean hasDefaultRedirectUri();
  /**
   * <code>.google.protobuf.StringValue default_redirect_uri = 16 [json_name = "defaultRedirectUri", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The defaultRedirectUri.
   */
  com.google.protobuf.StringValue getDefaultRedirectUri();
  /**
   * <code>.google.protobuf.StringValue default_redirect_uri = 16 [json_name = "defaultRedirectUri", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getDefaultRedirectUriOrBuilder();

  /**
   * <code>.google.protobuf.BoolValue assertion_encrypted = 17 [json_name = "assertionEncrypted", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the assertionEncrypted field is set.
   */
  boolean hasAssertionEncrypted();
  /**
   * <code>.google.protobuf.BoolValue assertion_encrypted = 17 [json_name = "assertionEncrypted", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The assertionEncrypted.
   */
  com.google.protobuf.BoolValue getAssertionEncrypted();
  /**
   * <code>.google.protobuf.BoolValue assertion_encrypted = 17 [json_name = "assertionEncrypted", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.BoolValueOrBuilder getAssertionEncryptedOrBuilder();

  /**
   * <code>.google.protobuf.BoolValue want_request_signed = 18 [json_name = "wantRequestSigned", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the wantRequestSigned field is set.
   */
  boolean hasWantRequestSigned();
  /**
   * <code>.google.protobuf.BoolValue want_request_signed = 18 [json_name = "wantRequestSigned", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The wantRequestSigned.
   */
  com.google.protobuf.BoolValue getWantRequestSigned();
  /**
   * <code>.google.protobuf.BoolValue want_request_signed = 18 [json_name = "wantRequestSigned", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.BoolValueOrBuilder getWantRequestSignedOrBuilder();
}
