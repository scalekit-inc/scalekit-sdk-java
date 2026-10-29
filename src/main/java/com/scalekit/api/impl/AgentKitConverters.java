package com.scalekit.api.impl;

import com.google.protobuf.ListValue;
import com.google.protobuf.Value;
import com.scalekit.grpc.scalekit.v1.connected_accounts.ConnectedAccountForList;
import com.scalekit.grpc.scalekit.v1.connected_accounts.ConnectorStatus;
import com.scalekit.grpc.scalekit.v1.connected_accounts.ConnectorType;
import com.scalekit.grpc.scalekit.v1.connected_accounts.GoogleDWDAuth;
import com.scalekit.grpc.scalekit.v1.connected_accounts.OauthToken;
import com.scalekit.grpc.scalekit.v1.connected_accounts.StaticAuth;
import com.scalekit.grpc.scalekit.v1.connected_accounts.TrustedIDPAuth;
import com.scalekit.grpc.scalekit.v1.mcp.McpConfigConnectionToolMapping;
import com.scalekit.internal.ProtoTime;
import com.scalekit.internal.StructConverter;
import com.scalekit.models.connectedaccounts.AuthorizationDetails;
import com.scalekit.models.connectedaccounts.AuthorizationType;
import com.scalekit.models.connectedaccounts.ConnectedAccount;
import com.scalekit.models.connectedaccounts.ConnectedAccountStatus;
import com.scalekit.models.connectedaccounts.GoogleDwdAuth;
import com.scalekit.models.connectedaccounts.OAuthToken;
import com.scalekit.models.connectedaccounts.TrustedIdpAuth;
import com.scalekit.models.mcp.McpConfig;
import com.scalekit.models.mcp.McpConnectionAuthState;
import com.scalekit.models.mcp.McpConnectionToolMapping;
import com.scalekit.models.providers.AuthField;
import com.scalekit.models.providers.AuthPattern;
import com.scalekit.models.providers.AuthPatternType;
import com.scalekit.models.providers.Provider;
import com.scalekit.models.tools.Tool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/** Converts between the generated protobuf messages and the SDK's models. */
final class AgentKitConverters {

    private static final Set<String> PATTERN_KEYS = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(
            "type", "display_name", "description", "is_mcp", "fields", "oauth_config", "auth_header_key_override")));
    private static final Set<String> FIELD_KEYS = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(
            "field_name", "label", "input_type", "hint", "required")));

    private AgentKitConverters() {
    }

    // ---- tools ----

    static Tool tool(com.scalekit.grpc.scalekit.v1.tools.Tool proto) {
        return Tool.builder()
                .id(proto.getId())
                .provider(proto.getProvider())
                .definition(proto.hasDefinition() ? StructConverter.fromStruct(proto.getDefinition()) : null)
                .metadata(proto.hasMetadata() ? StructConverter.fromStruct(proto.getMetadata()) : null)
                .tags(proto.getTagsList())
                .isDefault(proto.hasIsDefault() ? proto.getIsDefault().getValue() : null)
                .updatedAt(ProtoTime.toInstantOrNull(proto.hasUpdatedAt(), proto.getUpdatedAt()))
                .build();
    }

    // ---- connected accounts ----

    static ConnectedAccountStatus status(int number) {
        ConnectorStatus known = ConnectorStatus.forNumber(number);
        return ConnectedAccountStatus.of(known == null ? Integer.toString(number) : known.name());
    }

    static AuthorizationType authorizationType(int number) {
        ConnectorType known = ConnectorType.forNumber(number);
        return AuthorizationType.of(known == null ? Integer.toString(number) : known.name());
    }

    static ConnectedAccount connectedAccount(com.scalekit.grpc.scalekit.v1.connected_accounts.ConnectedAccount proto) {
        return ConnectedAccount.builder()
                .id(proto.getId())
                .identifier(proto.getIdentifier())
                .provider(proto.getProvider())
                .connectionName(proto.getConnector())
                .connectionId(proto.getConnectionId())
                .status(status(proto.getStatusValue()))
                .authorizationType(authorizationType(proto.getAuthorizationTypeValue()))
                .authorizationDetails(proto.hasAuthorizationDetails()
                        ? authorizationDetails(proto.getAuthorizationDetails()) : null)
                .apiConfig(proto.hasApiConfig() ? StructConverter.fromStruct(proto.getApiConfig()) : null)
                .tokenExpiresAt(ProtoTime.toInstantOrNull(proto.hasTokenExpiresAt(), proto.getTokenExpiresAt()))
                .updatedAt(ProtoTime.toInstantOrNull(proto.hasUpdatedAt(), proto.getUpdatedAt()))
                .lastUsedAt(ProtoTime.toInstantOrNull(proto.hasLastUsedAt(), proto.getLastUsedAt()))
                .orgWideCredential(proto.getIsOrgWideCredential())
                .build();
    }

    static ConnectedAccount connectedAccount(ConnectedAccountForList proto) {
        return ConnectedAccount.builder()
                .id(proto.getId())
                .identifier(proto.getIdentifier())
                .provider(proto.getProvider())
                .connectionName(proto.getConnector())
                .connectionId(proto.getConnectionId())
                .status(status(proto.getStatusValue()))
                .authorizationType(authorizationType(proto.getAuthorizationTypeValue()))
                .tokenExpiresAt(ProtoTime.toInstantOrNull(proto.hasTokenExpiresAt(), proto.getTokenExpiresAt()))
                .updatedAt(ProtoTime.toInstantOrNull(proto.hasUpdatedAt(), proto.getUpdatedAt()))
                .lastUsedAt(ProtoTime.toInstantOrNull(proto.hasLastUsedAt(), proto.getLastUsedAt()))
                .orgWideCredential(proto.getIsOrgWideCredential())
                .build();
    }

    static AuthorizationDetails authorizationDetails(
            com.scalekit.grpc.scalekit.v1.connected_accounts.AuthorizationDetails proto) {
        switch (proto.getDetailsCase()) {
            case OAUTH_TOKEN: {
                OauthToken token = proto.getOauthToken();
                return AuthorizationDetails.oauthToken(OAuthToken.builder()
                        .accessToken(token.getAccessToken())
                        .refreshToken(token.getRefreshToken())
                        .scopes(token.getScopesList())
                        .domain(token.getDomain())
                        .build());
            }
            case STATIC_AUTH: {
                StaticAuth staticAuth = proto.getStaticAuth();
                return AuthorizationDetails.staticAuth(staticAuth.hasDetails()
                        ? StructConverter.fromStruct(staticAuth.getDetails()) : Collections.<String, Object>emptyMap());
            }
            case GOOGLE_DWD: {
                GoogleDWDAuth dwd = proto.getGoogleDwd();
                return AuthorizationDetails.googleDwd(GoogleDwdAuth.builder(dwd.getSubject())
                        .accessToken(dwd.getAccessToken())
                        .scopes(dwd.getScopesList())
                        .tokenExpiresAt(ProtoTime.toInstantOrNull(dwd.hasTokenExpiresAt(), dwd.getTokenExpiresAt()))
                        .build());
            }
            case TRUSTED_IDP: {
                TrustedIDPAuth idp = proto.getTrustedIdp();
                return AuthorizationDetails.trustedIdp(TrustedIdpAuth.builder(idp.getDbUser())
                        .accessKeyId(idp.getAccessKeyId())
                        .secretAccessKey(idp.getSecretAccessKey())
                        .sessionToken(idp.getSessionToken())
                        .expiry(ProtoTime.toInstantOrNull(idp.hasExpiry(), idp.getExpiry()))
                        .build());
            }
            case DETAILS_NOT_SET:
            default:
                return null;
        }
    }

    static com.scalekit.grpc.scalekit.v1.connected_accounts.AuthorizationDetails toProto(AuthorizationDetails details) {
        com.scalekit.grpc.scalekit.v1.connected_accounts.AuthorizationDetails.Builder builder =
                com.scalekit.grpc.scalekit.v1.connected_accounts.AuthorizationDetails.newBuilder();
        if (details.oauthToken().isPresent()) {
            OAuthToken token = details.oauthToken().get();
            OauthToken.Builder proto = OauthToken.newBuilder().addAllScopes(token.scopes());
            token.accessToken().ifPresent(proto::setAccessToken);
            token.refreshToken().ifPresent(proto::setRefreshToken);
            token.domain().ifPresent(proto::setDomain);
            builder.setOauthToken(proto);
        } else if (details.staticAuth().isPresent()) {
            builder.setStaticAuth(StaticAuth.newBuilder().setDetails(StructConverter.toStruct(details.staticAuth().get())));
        } else if (details.googleDwd().isPresent()) {
            GoogleDwdAuth dwd = details.googleDwd().get();
            GoogleDWDAuth.Builder proto = GoogleDWDAuth.newBuilder().setSubject(dwd.subject()).addAllScopes(dwd.scopes());
            dwd.accessToken().ifPresent(proto::setAccessToken);
            if (dwd.tokenExpiresAt().isPresent()) {
                proto.setTokenExpiresAt(ProtoTime.toTimestamp(dwd.tokenExpiresAt().get()));
            }
            builder.setGoogleDwd(proto);
        } else if (details.trustedIdp().isPresent()) {
            TrustedIdpAuth idp = details.trustedIdp().get();
            TrustedIDPAuth.Builder proto = TrustedIDPAuth.newBuilder().setDbUser(idp.dbUser());
            idp.accessKeyId().ifPresent(proto::setAccessKeyId);
            idp.secretAccessKey().ifPresent(proto::setSecretAccessKey);
            idp.sessionToken().ifPresent(proto::setSessionToken);
            if (idp.expiry().isPresent()) {
                proto.setExpiry(ProtoTime.toTimestamp(idp.expiry().get()));
            }
            builder.setTrustedIdp(proto);
        }
        return builder.build();
    }

    // ---- MCP ----

    static McpConfig mcpConfig(com.scalekit.grpc.scalekit.v1.mcp.McpConfig proto) {
        List<McpConnectionToolMapping> mappings = new ArrayList<>(proto.getConnectionToolMappingsCount());
        for (McpConfigConnectionToolMapping mapping : proto.getConnectionToolMappingsList()) {
            mappings.add(McpConnectionToolMapping.builder(mapping.getConnectionName())
                    .tools(mapping.getToolsList())
                    .connectionId(mapping.getConnectionId())
                    .provider(mapping.getProvider())
                    .connectedAccountId(mapping.hasConnectedAccountId() ? mapping.getConnectedAccountId() : null)
                    .connectedAccountStatus(mapping.hasConnectedAccountStatus()
                            && !mapping.getConnectedAccountStatus().isEmpty()
                            ? ConnectedAccountStatus.of(mapping.getConnectedAccountStatus()) : null)
                    .build());
        }
        return McpConfig.builder()
                .id(proto.getId())
                .name(proto.getName())
                .description(proto.getDescription())
                .connectionToolMappings(mappings)
                .mcpServerUrl(proto.getMcpServerUrl())
                .build();
    }

    static McpConfigConnectionToolMapping toProto(McpConnectionToolMapping mapping) {
        return McpConfigConnectionToolMapping.newBuilder()
                .setConnectionName(mapping.connectionName())
                .addAllTools(mapping.tools())
                .build();
    }

    static McpConnectionAuthState authState(com.scalekit.grpc.scalekit.v1.mcp.McpConnectionAuthState proto) {
        return McpConnectionAuthState.builder()
                .connectionId(proto.getConnectionId())
                .connectionName(proto.getConnectionName())
                .provider(proto.getProvider())
                .connectedAccountId(proto.hasConnectedAccountId() ? proto.getConnectedAccountId() : null)
                .connectedAccountStatus(proto.hasConnectedAccountStatus() && !proto.getConnectedAccountStatus().isEmpty()
                        ? ConnectedAccountStatus.of(proto.getConnectedAccountStatus()) : null)
                .authenticationLink(proto.getAuthenticationLink())
                .build();
    }

    // ---- providers ----

    static Provider provider(com.scalekit.grpc.scalekit.v1.providers.Provider proto) {
        return Provider.builder()
                .id(proto.getId())
                .identifier(proto.getIdentifier())
                .displayName(proto.getDisplayName())
                .description(proto.getDescription())
                .categories(proto.getCategoriesList())
                .authPatterns(proto.hasAuthPatterns() ? authPatterns(proto.getAuthPatterns())
                        : Collections.<AuthPattern>emptyList())
                .iconSrc(proto.getIconSrc())
                .displayPriority(proto.getDisplayPriority())
                .comingSoon(proto.getComingSoon())
                .proxyUrl(proto.getProxyUrl())
                .proxyEnabled(proto.getProxyEnabled())
                .isCustom(proto.getIsCustom())
                .isCustomMcp(proto.getIsCustomMcp())
                .metadata(proto.getMetadataMap())
                .build();
    }

    static List<AuthPattern> authPatterns(ListValue list) {
        List<AuthPattern> patterns = new ArrayList<>(list.getValuesCount());
        for (Value value : list.getValuesList()) {
            if (value.getKindCase() == Value.KindCase.STRUCT_VALUE) {
                patterns.add(authPattern(StructConverter.fromStruct(value.getStructValue())));
            }
        }
        return patterns;
    }

    static ListValue toListValue(List<AuthPattern> patterns) {
        List<Object> json = new ArrayList<>(patterns.size());
        for (AuthPattern pattern : patterns) {
            json.add(toJson(pattern));
        }
        return StructConverter.toListValue(json);
    }

    static AuthPattern authPattern(Map<String, Object> json) {
        Object type = json.get("type");
        Object displayName = json.get("display_name");
        AuthPattern.Builder builder = AuthPattern.builder(
                AuthPatternType.of(type instanceof String ? (String) type : ""),
                displayName instanceof String ? (String) displayName : "");
        Map<String, Object> extra = new LinkedHashMap<>();
        for (Map.Entry<String, Object> entry : json.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ("type".equals(key) && value instanceof String
                    || "display_name".equals(key) && value instanceof String) {
                continue;
            }
            if ("description".equals(key) && value instanceof String) {
                builder.description((String) value);
            } else if ("is_mcp".equals(key) && value instanceof Boolean) {
                builder.isMcp((Boolean) value);
            } else if ("fields".equals(key) && isListOfMaps(value)) {
                List<AuthField> fields = new ArrayList<>();
                for (Object field : (List<?>) value) {
                    @SuppressWarnings("unchecked")
                    Map<String, Object> fieldJson = (Map<String, Object>) field;
                    fields.add(authField(fieldJson));
                }
                builder.fields(fields);
            } else if ("oauth_config".equals(key) && value instanceof Map) {
                @SuppressWarnings("unchecked")
                Map<String, Object> config = (Map<String, Object>) value;
                builder.oauthConfig(config);
            } else if ("auth_header_key_override".equals(key) && value instanceof String) {
                builder.authHeaderKeyOverride((String) value);
            } else {
                // Unknown keys, and known keys of an unexpected type, round-trip unchanged.
                extra.put(key, value);
            }
        }
        return builder.additionalProperties(extra).build();
    }

    static AuthField authField(Map<String, Object> json) {
        Object name = json.get("field_name");
        AuthField.Builder builder = AuthField.builder(name instanceof String ? (String) name : "");
        Map<String, Object> extra = new LinkedHashMap<>();
        for (Map.Entry<String, Object> entry : json.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ("field_name".equals(key) && value instanceof String) {
                continue;
            }
            if ("label".equals(key) && value instanceof String) {
                builder.label((String) value);
            } else if ("input_type".equals(key) && value instanceof String) {
                builder.inputType((String) value);
            } else if ("hint".equals(key) && value instanceof String) {
                builder.hint((String) value);
            } else if ("required".equals(key) && value instanceof Boolean) {
                builder.required((Boolean) value);
            } else {
                extra.put(key, value);
            }
        }
        return builder.additionalProperties(extra).build();
    }

    static Map<String, Object> toJson(AuthPattern pattern) {
        Map<String, Object> json = new LinkedHashMap<>();
        for (Map.Entry<String, Object> entry : pattern.additionalProperties().entrySet()) {
            if (!PATTERN_KEYS.contains(entry.getKey()) || !modelled(pattern, entry.getKey())) {
                json.put(entry.getKey(), entry.getValue());
            }
        }
        json.put("type", pattern.type().value());
        json.put("display_name", pattern.displayName());
        pattern.description().ifPresent(description -> json.put("description", description));
        pattern.isMcp().ifPresent(isMcp -> json.put("is_mcp", isMcp));
        if (!pattern.fields().isEmpty()) {
            List<Object> fields = new ArrayList<>(pattern.fields().size());
            for (AuthField field : pattern.fields()) {
                fields.add(toJson(field));
            }
            json.put("fields", fields);
        }
        pattern.oauthConfig().ifPresent(config -> json.put("oauth_config", config));
        pattern.authHeaderKeyOverride().ifPresent(header -> json.put("auth_header_key_override", header));
        return json;
    }

    static Map<String, Object> toJson(AuthField field) {
        Map<String, Object> json = new LinkedHashMap<>();
        for (Map.Entry<String, Object> entry : field.additionalProperties().entrySet()) {
            if (!FIELD_KEYS.contains(entry.getKey()) || !modelled(field, entry.getKey())) {
                json.put(entry.getKey(), entry.getValue());
            }
        }
        json.put("field_name", field.fieldName());
        field.label().ifPresent(label -> json.put("label", label));
        field.inputType().ifPresent(inputType -> json.put("input_type", inputType));
        field.hint().ifPresent(hint -> json.put("hint", hint));
        field.required().ifPresent(required -> json.put("required", required));
        return json;
    }

    // Whether a known key has a modelled value that should win over an additional property.
    private static boolean modelled(AuthPattern pattern, String key) {
        switch (key) {
            case "type":
            case "display_name":
                return true;
            case "description":
                return pattern.description().isPresent();
            case "is_mcp":
                return pattern.isMcp().isPresent();
            case "fields":
                return !pattern.fields().isEmpty();
            case "oauth_config":
                return pattern.oauthConfig().isPresent();
            case "auth_header_key_override":
                return pattern.authHeaderKeyOverride().isPresent();
            default:
                return false;
        }
    }

    private static boolean modelled(AuthField field, String key) {
        switch (key) {
            case "field_name":
                return true;
            case "label":
                return field.label().isPresent();
            case "input_type":
                return field.inputType().isPresent();
            case "hint":
                return field.hint().isPresent();
            case "required":
                return field.required().isPresent();
            default:
                return false;
        }
    }

    private static boolean isListOfMaps(Object value) {
        if (!(value instanceof List)) {
            return false;
        }
        for (Object element : (List<?>) value) {
            if (!(element instanceof Map)) {
                return false;
            }
        }
        return true;
    }
}
