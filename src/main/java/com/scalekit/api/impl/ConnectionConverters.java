package com.scalekit.api.impl;

import com.google.protobuf.BoolValue;
import com.google.protobuf.StringValue;
import com.scalekit.grpc.scalekit.v1.connections.Connection;
import com.scalekit.grpc.scalekit.v1.connections.ConnectionAuthMode;
import com.scalekit.grpc.scalekit.v1.connections.ConnectionStatus;
import com.scalekit.grpc.scalekit.v1.connections.ConnectionType;
import com.scalekit.grpc.scalekit.v1.connections.GoogleDWDConfig;
import com.scalekit.grpc.scalekit.v1.connections.ListConnection;
import com.scalekit.grpc.scalekit.v1.connections.OAuthConnectionConfig;
import com.scalekit.grpc.scalekit.v1.connections.StaticAuthConfig;
import com.scalekit.grpc.scalekit.v1.connections.UpdateConnection;
import com.scalekit.grpc.scalekit.v1.tools.ConnectionReadiness;
import com.scalekit.grpc.scalekit.v1.tools.ToolReadinessState;
import com.scalekit.internal.ProtoTime;
import com.scalekit.internal.StructConverter;
import com.scalekit.models.connections.AppConnection;
import com.scalekit.models.connections.EnvironmentConnection;
import com.scalekit.models.connections.EnvironmentConnectionAuthMode;
import com.scalekit.models.connections.EnvironmentConnectionStatus;
import com.scalekit.models.connections.EnvironmentConnectionType;
import com.scalekit.models.connections.GoogleDwdConnectionSettings;
import com.scalekit.models.connections.OAuthConnectionSettings;
import com.scalekit.models.connections.UpdateEnvironmentConnectionParams;
import com.scalekit.models.tools.ScopedTool;
import com.scalekit.models.tools.SearchedTool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Converts the connection, search and scoped-tool messages to and from the SDK's models. */
final class ConnectionConverters {

    private static final String READINESS_PREFIX = "TOOL_READINESS_STATE_";

    private ConnectionConverters() {
    }

    // ---- tools ----

    static SearchedTool searchedTool(com.scalekit.grpc.scalekit.v1.tools.SearchedTool proto) {
        List<com.scalekit.models.tools.ConnectionReadiness> connections = new ArrayList<>(proto.getConnectionsCount());
        for (ConnectionReadiness readiness : proto.getConnectionsList()) {
            connections.add(com.scalekit.models.tools.ConnectionReadiness.builder()
                    .connectionName(readiness.getConnectionName())
                    .connectedAccountId(readiness.getConnectedAccountId())
                    .readinessState(readinessState(readiness.getReadinessStateValue()))
                    .build());
        }
        return SearchedTool.builder()
                .name(proto.getName())
                .provider(proto.getProvider())
                .description(proto.getDescription())
                .score(proto.getScore())
                .connections(connections)
                .build();
    }

    static com.scalekit.models.tools.ToolReadinessState readinessState(int number) {
        if (number == 0) {
            return com.scalekit.models.tools.ToolReadinessState.NOT_EVALUATED;
        }
        ToolReadinessState known = ToolReadinessState.forNumber(number);
        if (known == null) {
            return com.scalekit.models.tools.ToolReadinessState.of(Integer.toString(number));
        }
        String name = known.name();
        return com.scalekit.models.tools.ToolReadinessState.of(
                name.startsWith(READINESS_PREFIX) ? name.substring(READINESS_PREFIX.length()) : name);
    }

    static ScopedTool scopedTool(com.scalekit.grpc.scalekit.v1.tools.ScopedTool proto) {
        return ScopedTool.builder()
                .tool(proto.hasTool() ? AgentKitConverters.tool(proto.getTool()) : null)
                .identifier(proto.getIdentifier())
                .connectedAccountId(proto.getConnectedAccountId())
                .build();
    }

    // ---- enums ----

    static EnvironmentConnectionType type(int number) {
        ConnectionType known = ConnectionType.forNumber(number);
        return EnvironmentConnectionType.of(known == null ? Integer.toString(number) : known.name());
    }

    static EnvironmentConnectionStatus status(int number) {
        if (number == 0) {
            return null;
        }
        ConnectionStatus known = ConnectionStatus.forNumber(number);
        return EnvironmentConnectionStatus.of(known == null ? Integer.toString(number) : known.name());
    }

    static EnvironmentConnectionAuthMode authMode(int number) {
        if (number == 0) {
            return null;
        }
        ConnectionAuthMode known = ConnectionAuthMode.forNumber(number);
        return EnvironmentConnectionAuthMode.of(known == null ? Integer.toString(number) : known.name());
    }

    /** Returns the generated enum for a known value, or null for one the generated code lacks. */
    private static ConnectionType toProto(EnvironmentConnectionType type) {
        try {
            return ConnectionType.valueOf(type.value());
        } catch (IllegalArgumentException unknown) {
            return null;
        }
    }

    /**
     * Returns the wire number of a type: known names map to the generated enum, raw numbers (values
     * this SDK version received but does not know) pass through.
     */
    static int typeNumber(EnvironmentConnectionType type) {
        ConnectionType known = toProto(type);
        int number;
        if (known != null && known != ConnectionType.UNRECOGNIZED) {
            number = known.getNumber();
        } else {
            try {
                number = Integer.parseInt(type.value());
            } catch (NumberFormatException unknown) {
                throw new IllegalArgumentException("type " + type.value() + " is not supported by this SDK version");
            }
        }
        if (number <= 0) {
            throw new IllegalArgumentException("type " + type.value() + " is not a connection type");
        }
        return number;
    }

    static int authModeNumber(EnvironmentConnectionAuthMode mode) {
        try {
            ConnectionAuthMode known = ConnectionAuthMode.valueOf(mode.value());
            if (known != ConnectionAuthMode.UNRECOGNIZED) {
                return known.getNumber();
            }
        } catch (IllegalArgumentException notAName) {
            // fall through to a raw number
        }
        try {
            int number = Integer.parseInt(mode.value());
            if (number >= 0) {
                return number;
            }
        } catch (NumberFormatException notANumber) {
            // fall through to the error
        }
        throw new IllegalArgumentException("authMode " + mode.value() + " is not supported by this SDK version");
    }

    // ---- connections ----

    static AppConnection appConnection(ListConnection proto) {
        return AppConnection.builder()
                .id(proto.getId())
                .connectionName(proto.getKeyId())
                .provider(proto.getProviderKey())
                .type(type(proto.getTypeValue()))
                .status(status(proto.getStatusValue()))
                .enabled(proto.getEnabled())
                .createdAt(ProtoTime.toInstantOrNull(proto.hasCreatedAt(), proto.getCreatedAt()))
                .authMode(authMode(proto.getAuthModeValue()))
                .build();
    }

    static EnvironmentConnection environmentConnection(Connection proto) {
        EnvironmentConnection.Builder builder = EnvironmentConnection.builder()
                .id(proto.getId())
                .connectionName(proto.hasKeyId() ? proto.getKeyId() : null)
                .providerKey(proto.getProviderKey())
                .type(type(proto.getTypeValue()))
                .status(status(proto.getStatusValue()))
                .enabled(proto.getEnabled())
                .authMode(authMode(proto.getAuthModeValue()))
                .createdAt(ProtoTime.toInstantOrNull(proto.hasCreateTime(), proto.getCreateTime()))
                .updatedAt(ProtoTime.toInstantOrNull(proto.hasUpdateTime(), proto.getUpdateTime()))
                .mcpServerUrl(proto.hasMcpServerUrl() ? proto.getMcpServerUrl() : null)
                .resolvedProxyUrl(proto.hasResolvedProxyUrl() ? proto.getResolvedProxyUrl() : null);
        switch (proto.getSettingsCase()) {
            case OAUTH_CONFIG:
                builder.oauthSettings(oauthSettings(proto.getOauthConfig()));
                break;
            case STATIC_CONFIG:
                builder.staticSettings(proto.getStaticConfig().hasStaticConfig()
                        ? StructConverter.fromStruct(proto.getStaticConfig().getStaticConfig())
                        : Collections.<String, Object>emptyMap());
                break;
            case GOOGLE_DWD_CONFIG:
                builder.googleDwdSettings(googleDwdSettings(proto.getGoogleDwdConfig()));
                break;
            default:
                // Settings of login connections (OIDC, SAML, passwordless, WebAuthn) are not modelled.
                break;
        }
        return builder.build();
    }

    static OAuthConnectionSettings oauthSettings(OAuthConnectionConfig proto) {
        OAuthConnectionSettings.Builder builder = OAuthConnectionSettings.builder().scopes(proto.getScopesList());
        if (proto.hasClientId()) {
            builder.clientId(proto.getClientId().getValue());
        }
        if (proto.hasClientSecret()) {
            builder.clientSecret(proto.getClientSecret().getValue());
        }
        if (proto.hasAuthorizeUri()) {
            builder.authorizeUri(proto.getAuthorizeUri().getValue());
        }
        if (proto.hasTokenUri()) {
            builder.tokenUri(proto.getTokenUri().getValue());
        }
        if (proto.hasUserInfoUri()) {
            builder.userInfoUri(proto.getUserInfoUri().getValue());
        }
        builder.redirectUri(proto.getRedirectUri());
        if (proto.hasPkceEnabled()) {
            builder.pkceEnabled(proto.getPkceEnabled().getValue());
        }
        if (proto.hasPrompt()) {
            builder.prompt(proto.getPrompt().getValue());
        }
        if (proto.hasAccessType()) {
            builder.accessType(proto.getAccessType().getValue());
        }
        if (proto.hasTokenAccessType()) {
            builder.tokenAccessType(proto.getTokenAccessType().getValue());
        }
        if (proto.hasUsePlatformCreds()) {
            builder.usePlatformCreds(proto.getUsePlatformCreds().getValue());
        }
        if (proto.hasCustomScopeName()) {
            builder.customScopeName(proto.getCustomScopeName().getValue());
        }
        if (proto.hasTenantId()) {
            builder.tenantId(proto.getTenantId().getValue());
        }
        if (proto.hasAppName()) {
            builder.appName(proto.getAppName().getValue());
        }
        if (proto.hasTokenEndpointAuthMethod()) {
            builder.tokenEndpointAuthMethod(proto.getTokenEndpointAuthMethod().getValue());
        }
        if (proto.hasGoogleadsDeveloperToken()) {
            builder.googleadsDeveloperToken(proto.getGoogleadsDeveloperToken().getValue());
        }
        return builder.build();
    }

    static OAuthConnectionConfig toProto(OAuthConnectionSettings settings) {
        OAuthConnectionConfig.Builder builder = OAuthConnectionConfig.newBuilder().addAllScopes(settings.scopes());
        settings.clientId().ifPresent(v -> builder.setClientId(StringValue.of(v)));
        settings.clientSecret().ifPresent(v -> builder.setClientSecret(StringValue.of(v)));
        settings.authorizeUri().ifPresent(v -> builder.setAuthorizeUri(StringValue.of(v)));
        settings.tokenUri().ifPresent(v -> builder.setTokenUri(StringValue.of(v)));
        settings.userInfoUri().ifPresent(v -> builder.setUserInfoUri(StringValue.of(v)));
        settings.pkceEnabled().ifPresent(v -> builder.setPkceEnabled(BoolValue.of(v)));
        settings.prompt().ifPresent(v -> builder.setPrompt(StringValue.of(v)));
        settings.accessType().ifPresent(v -> builder.setAccessType(StringValue.of(v)));
        settings.tokenAccessType().ifPresent(v -> builder.setTokenAccessType(StringValue.of(v)));
        settings.usePlatformCreds().ifPresent(v -> builder.setUsePlatformCreds(BoolValue.of(v)));
        settings.customScopeName().ifPresent(v -> builder.setCustomScopeName(StringValue.of(v)));
        settings.tenantId().ifPresent(v -> builder.setTenantId(StringValue.of(v)));
        settings.appName().ifPresent(v -> builder.setAppName(StringValue.of(v)));
        settings.tokenEndpointAuthMethod().ifPresent(v -> builder.setTokenEndpointAuthMethod(StringValue.of(v)));
        settings.googleadsDeveloperToken().ifPresent(v -> builder.setGoogleadsDeveloperToken(StringValue.of(v)));
        // redirectUri is set by the server and not sent.
        return builder.build();
    }

    static GoogleDwdConnectionSettings googleDwdSettings(GoogleDWDConfig proto) {
        GoogleDwdConnectionSettings.Builder builder = GoogleDwdConnectionSettings.builder().scopes(proto.getScopesList());
        if (proto.hasServiceAccountJson()) {
            builder.serviceAccountJson(proto.getServiceAccountJson().getValue());
        }
        if (proto.hasTokenUri()) {
            builder.tokenUri(proto.getTokenUri().getValue());
        }
        return builder.build();
    }

    static GoogleDWDConfig toProto(GoogleDwdConnectionSettings settings) {
        GoogleDWDConfig.Builder builder = GoogleDWDConfig.newBuilder().addAllScopes(settings.scopes());
        settings.serviceAccountJson().ifPresent(v -> builder.setServiceAccountJson(StringValue.of(v)));
        settings.tokenUri().ifPresent(v -> builder.setTokenUri(StringValue.of(v)));
        return builder.build();
    }

    static UpdateConnection toProto(UpdateEnvironmentConnectionParams params) {
        UpdateConnection.Builder builder = UpdateConnection.newBuilder()
                .setKeyId(params.connectionName())
                .setProviderKey(params.providerKey());
        builder.setTypeValue(typeNumber(params.type()));
        if (params.oauthSettings().isPresent()) {
            builder.setOauthConfig(toProto(params.oauthSettings().get()));
        } else if (params.staticSettings().isPresent()) {
            builder.setStaticConfig(StaticAuthConfig.newBuilder()
                    .setStaticConfig(StructConverter.toStruct(params.staticSettings().get())));
        } else if (params.googleDwdSettings().isPresent()) {
            builder.setGoogleDwdConfig(toProto(params.googleDwdSettings().get()));
        }
        return builder.build();
    }
}
