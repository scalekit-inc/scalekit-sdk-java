package com.scalekit.api.impl;

import com.scalekit.api.McpClient;
import com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigRequest;
import com.scalekit.grpc.scalekit.v1.mcp.CreateMcpConfigResponse;
import com.scalekit.grpc.scalekit.v1.mcp.CreateMcpSessionTokenRequest;
import com.scalekit.grpc.scalekit.v1.mcp.CreateMcpSessionTokenResponse;
import com.scalekit.grpc.scalekit.v1.mcp.DeleteMcpConfigRequest;
import com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigRequest;
import com.scalekit.grpc.scalekit.v1.mcp.GetMcpConfigResponse;
import com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsRequest;
import com.scalekit.grpc.scalekit.v1.mcp.ListMcpConfigsResponse;
import com.scalekit.grpc.scalekit.v1.mcp.ListMcpConnectedAccountsRequest;
import com.scalekit.grpc.scalekit.v1.mcp.ListMcpConnectedAccountsResponse;
import com.scalekit.grpc.scalekit.v1.mcp.McpServiceGrpc;
import com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigRequest;
import com.scalekit.grpc.scalekit.v1.mcp.UpdateMcpConfigResponse;
import com.scalekit.internal.Preconditions;
import com.scalekit.internal.ProtoTime;
import com.scalekit.internal.ScalekitCredentials;
import com.scalekit.models.Page;
import com.scalekit.models.mcp.CreateMcpConfigParams;
import com.scalekit.models.mcp.CreateMcpSessionTokenParams;
import com.scalekit.models.mcp.ListMcpConfigsParams;
import com.scalekit.models.mcp.ListMcpConnectedAccountsParams;
import com.scalekit.models.mcp.McpConfig;
import com.scalekit.models.mcp.McpConnectionAuthState;
import com.scalekit.models.mcp.McpConnectionToolMapping;
import com.scalekit.models.mcp.McpSessionToken;
import com.scalekit.models.mcp.UpdateMcpConfigParams;
import io.grpc.Channel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** {@link McpClient} over gRPC. Thread-safe. */
public class ScalekitMcpClient implements McpClient {

    private final McpServiceGrpc.McpServiceBlockingStub stub;
    private final ScalekitCredentials credentials;

    /**
     * Creates the client.
     *
     * @param channel     the channel
     * @param credentials the credentials attached to every call
     */
    public ScalekitMcpClient(Channel channel, ScalekitCredentials credentials) {
        this.credentials = credentials;
        this.stub = McpServiceGrpc.newBlockingStub(channel).withCallCredentials(credentials);
    }

    private McpServiceGrpc.McpServiceBlockingStub stub() {
        return stub.withDeadlineAfter(AgentKitCalls.controlPlaneTimeoutMillis(), AgentKitCalls.MILLIS);
    }

    @Override
    public McpConfig createConfig(String name, CreateMcpConfigParams params) {
        com.scalekit.grpc.scalekit.v1.mcp.McpConfig.Builder config = com.scalekit.grpc.scalekit.v1.mcp.McpConfig
                .newBuilder()
                .setName(Preconditions.requireNonEmpty(name, "name"));
        if (params != null) {
            params.description().ifPresent(config::setDescription);
            for (McpConnectionToolMapping mapping : params.connectionToolMappings()) {
                config.addConnectionToolMappings(AgentKitConverters.toProto(mapping));
            }
        }
        final CreateMcpConfigRequest built = CreateMcpConfigRequest.newBuilder().setConfig(config).build();
        CreateMcpConfigResponse response = AgentKitCalls.call(McpServiceGrpc.getCreateMcpConfigMethod(), credentials,
                () -> stub().createMcpConfig(built));
        return AgentKitConverters.mcpConfig(response.getConfig());
    }

    @Override
    public McpConfig getConfig(String configId) {
        final GetMcpConfigRequest built = GetMcpConfigRequest.newBuilder()
                .setConfigId(Preconditions.requireNonEmpty(configId, "configId"))
                .build();
        GetMcpConfigResponse response = AgentKitCalls.call(McpServiceGrpc.getGetMcpConfigMethod(), credentials,
                () -> stub().getMcpConfig(built));
        return AgentKitConverters.mcpConfig(response.getConfig());
    }

    @Override
    public Page<McpConfig> listConfigs() {
        return listConfigs(null);
    }

    @Override
    public Page<McpConfig> listConfigs(ListMcpConfigsParams params) {
        ListMcpConfigsParams effective = params == null ? ListMcpConfigsParams.builder().build() : params;
        return fetch(effective, effective.pageToken().orElse(null));
    }

    private Page<McpConfig> fetch(final ListMcpConfigsParams params, String pageToken) {
        ListMcpConfigsRequest.Builder request = ListMcpConfigsRequest.newBuilder();
        params.search().ifPresent(request::setSearch);
        if (params.pageSize().isPresent()) {
            request.setPageSize(params.pageSize().getAsInt());
        }
        if (pageToken != null) {
            request.setPageToken(pageToken);
        }
        final ListMcpConfigsRequest built = request.build();
        ListMcpConfigsResponse response = AgentKitCalls.call(McpServiceGrpc.getListMcpConfigsMethod(), credentials,
                () -> stub().listMcpConfigs(built));
        List<McpConfig> configs = new ArrayList<>(response.getConfigsCount());
        for (com.scalekit.grpc.scalekit.v1.mcp.McpConfig config : response.getConfigsList()) {
            configs.add(AgentKitConverters.mcpConfig(config));
        }
        return new Page.Builder<McpConfig>()
                .items(configs)
                .nextPageToken(response.getNextPageToken())
                .prevPageToken(response.getPrevPageToken())
                .totalSize(response.getTotalSize())
                .nextPageFetcher(next -> fetch(params, next))
                .build();
    }

    @Override
    public McpConfig updateConfig(String configId, UpdateMcpConfigParams params) {
        String id = Preconditions.requireNonEmpty(configId, "configId");
        if (params == null) {
            throw new IllegalArgumentException("params is required");
        }
        UpdateMcpConfigRequest.Builder request = UpdateMcpConfigRequest.newBuilder().setConfigId(id);
        params.description().ifPresent(request::setDescription);
        for (McpConnectionToolMapping mapping : params.connectionToolMappings()) {
            request.addConnectionToolMappings(AgentKitConverters.toProto(mapping));
        }
        final UpdateMcpConfigRequest built = request.build();
        UpdateMcpConfigResponse response = AgentKitCalls.call(McpServiceGrpc.getUpdateMcpConfigMethod(), credentials,
                () -> stub().updateMcpConfig(built));
        return AgentKitConverters.mcpConfig(response.getConfig());
    }

    @Override
    public void deleteConfig(String configId) {
        final DeleteMcpConfigRequest built = DeleteMcpConfigRequest.newBuilder()
                .setConfigId(Preconditions.requireNonEmpty(configId, "configId"))
                .build();
        AgentKitCalls.call(McpServiceGrpc.getDeleteMcpConfigMethod(), credentials,
                () -> stub().deleteMcpConfig(built));
    }

    @Override
    public List<McpConnectionAuthState> listConnectedAccounts(String configId, String identifier) {
        return listConnectedAccounts(configId, identifier, null);
    }

    @Override
    public List<McpConnectionAuthState> listConnectedAccounts(String configId, String identifier,
                                                              ListMcpConnectedAccountsParams params) {
        ListMcpConnectedAccountsRequest.Builder request = ListMcpConnectedAccountsRequest.newBuilder()
                .setConfigId(Preconditions.requireNonEmpty(configId, "configId"))
                .setIdentifier(Preconditions.requireNonEmpty(identifier, "identifier"));
        if (params != null) {
            request.setIncludeAuthLink(params.includeAuthLink());
        }
        final ListMcpConnectedAccountsRequest built = request.build();
        ListMcpConnectedAccountsResponse response = AgentKitCalls.call(
                McpServiceGrpc.getListMcpConnectedAccountsMethod(), credentials,
                () -> stub().listMcpConnectedAccounts(built));
        List<McpConnectionAuthState> states = new ArrayList<>(response.getConnectedAccountsCount());
        for (com.scalekit.grpc.scalekit.v1.mcp.McpConnectionAuthState state : response.getConnectedAccountsList()) {
            states.add(AgentKitConverters.authState(state));
        }
        return Collections.unmodifiableList(states);
    }

    @Override
    public McpSessionToken createSessionToken(String mcpConfigId, String identifier) {
        return createSessionToken(mcpConfigId, identifier, null);
    }

    @Override
    public McpSessionToken createSessionToken(String mcpConfigId, String identifier,
                                              CreateMcpSessionTokenParams params) {
        CreateMcpSessionTokenRequest.Builder request = CreateMcpSessionTokenRequest.newBuilder()
                .setMcpConfigId(Preconditions.requireNonEmpty(mcpConfigId, "mcpConfigId"))
                .setIdentifier(Preconditions.requireNonEmpty(identifier, "identifier"));
        if (params != null && params.expiry().isPresent()) {
            request.setExpiry(ProtoTime.toProto(params.expiry().get()));
        }
        final CreateMcpSessionTokenRequest built = request.build();
        CreateMcpSessionTokenResponse response = AgentKitCalls.call(
                McpServiceGrpc.getCreateMcpSessionTokenMethod(), credentials,
                () -> stub().createMcpSessionToken(built));
        return McpSessionToken.builder()
                .token(response.getToken())
                .expiresAt(ProtoTime.toInstantOrNull(response.hasExpiresAt(), response.getExpiresAt()))
                .build();
    }
}
