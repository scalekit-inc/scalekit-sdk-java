package com.scalekit.api.impl;

import com.google.protobuf.BoolValue;
import com.scalekit.api.ToolsClient;
import com.scalekit.grpc.scalekit.v1.tools.ExecuteToolRequest;
import com.scalekit.grpc.scalekit.v1.tools.ExecuteToolResponse;
import com.scalekit.grpc.scalekit.v1.tools.Filter;
import com.scalekit.grpc.scalekit.v1.tools.ListAvailableToolsRequest;
import com.scalekit.grpc.scalekit.v1.tools.ListAvailableToolsResponse;
import com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsRequest;
import com.scalekit.grpc.scalekit.v1.tools.ListScopedToolsResponse;
import com.scalekit.grpc.scalekit.v1.tools.ListToolsRequest;
import com.scalekit.grpc.scalekit.v1.tools.ListToolsResponse;
import com.scalekit.grpc.scalekit.v1.tools.ScopedToolFilter;
import com.scalekit.grpc.scalekit.v1.tools.SearchToolsRequest;
import com.scalekit.grpc.scalekit.v1.tools.SearchToolsResponse;
import com.scalekit.grpc.scalekit.v1.tools.ToolServiceGrpc;
import com.scalekit.internal.Preconditions;
import com.scalekit.internal.ScalekitCredentials;
import com.scalekit.internal.StructConverter;
import com.scalekit.models.Page;
import com.scalekit.models.tools.ExecuteToolParams;
import com.scalekit.models.tools.ExecuteToolResult;
import com.scalekit.models.tools.ListAvailableToolsParams;
import com.scalekit.models.tools.ListScopedToolsParams;
import com.scalekit.models.tools.ListToolsParams;
import com.scalekit.models.tools.ScopedTool;
import com.scalekit.models.tools.SearchToolsParams;
import com.scalekit.models.tools.SearchedTool;
import com.scalekit.models.tools.Tool;
import com.scalekit.models.tools.ToolPage;
import io.grpc.Channel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** {@link ToolsClient} over gRPC. Thread-safe. */
public class ScalekitToolsClient implements ToolsClient {

    private final ToolServiceGrpc.ToolServiceBlockingStub stub;
    private final ScalekitCredentials credentials;

    /**
     * Creates the client.
     *
     * @param channel     the channel
     * @param credentials the credentials attached to every call
     */
    public ScalekitToolsClient(Channel channel, ScalekitCredentials credentials) {
        this.credentials = credentials;
        this.stub = ToolServiceGrpc.newBlockingStub(channel).withCallCredentials(credentials);
    }

    @Override
    public ToolPage list() {
        return list(null);
    }

    @Override
    public ToolPage list(ListToolsParams params) {
        ListToolsParams effective = params == null ? ListToolsParams.builder().build() : params;
        return fetch(effective, effective.pageToken().orElse(null));
    }

    private ToolPage fetch(final ListToolsParams params, String pageToken) {
        ListToolsRequest.Builder request = ListToolsRequest.newBuilder();
        Filter.Builder filter = Filter.newBuilder();
        boolean hasFilter = false;
        if (params.connectionName().isPresent()) {
            filter.setConnector(params.connectionName().get());
            hasFilter = true;
        }
        if (params.identifier().isPresent()) {
            filter.setIdentifier(params.identifier().get());
            hasFilter = true;
        }
        if (params.provider().isPresent()) {
            filter.setProvider(params.provider().get());
            hasFilter = true;
        }
        if (!params.toolNames().isEmpty()) {
            filter.addAllToolName(params.toolNames());
            hasFilter = true;
        }
        if (params.query().isPresent()) {
            filter.setQuery(params.query().get());
            hasFilter = true;
        }
        if (params.connectedAccountId().isPresent()) {
            filter.setConnectedAccountId(params.connectedAccountId().get());
            hasFilter = true;
        }
        if (params.summary().isPresent()) {
            filter.setSummary(BoolValue.of(params.summary().get()));
            hasFilter = true;
        }
        if (hasFilter) {
            request.setFilter(filter);
        }
        if (params.pageSize().isPresent()) {
            request.setPageSize(params.pageSize().getAsInt());
        }
        if (pageToken != null) {
            request.setPageToken(pageToken);
        }
        final ListToolsRequest built = request.build();
        final long deadline = AgentKitCalls.nanos(params.timeout());
        ListToolsResponse response = AgentKitCalls.call(ToolServiceGrpc.getListToolsMethod(), credentials,
                () -> stub.withDeadlineAfter(deadline, AgentKitCalls.NANOS).listTools(built));

        List<Tool> tools = new ArrayList<>(response.getToolsCount());
        for (com.scalekit.grpc.scalekit.v1.tools.Tool tool : response.getToolsList()) {
            tools.add(AgentKitConverters.tool(tool));
        }
        return ToolPage.builder()
                .items(tools)
                .toolNames(response.getToolNamesList())
                .nextPageToken(response.getNextPageToken())
                .prevPageToken(response.getPrevPageToken())
                .totalSize(response.getTotalSize())
                .nextPageFetcher(next -> fetch(params, next))
                .build();
    }

    @Override
    public ExecuteToolResult execute(String toolName, ExecuteToolParams params) {
        String name = Preconditions.requireNonBlank(toolName, "toolName");
        ExecuteToolParams effective = params == null ? ExecuteToolParams.builder().build() : params;
        ExecuteToolRequest.Builder request = ExecuteToolRequest.newBuilder().setToolName(name);
        effective.identifier().ifPresent(request::setIdentifier);
        effective.connectionName().ifPresent(request::setConnector);
        effective.connectedAccountId().ifPresent(request::setConnectedAccountId);
        if (effective.toolInput().isPresent()) {
            request.setParams(StructConverter.toStruct(effective.toolInput().get()));
        }
        final ExecuteToolRequest built = request.build();
        final long deadline = AgentKitCalls.nanos(effective.timeout());
        ExecuteToolResponse response = AgentKitCalls.call(ToolServiceGrpc.getExecuteToolMethod(), credentials,
                () -> stub.withDeadlineAfter(deadline, AgentKitCalls.NANOS).executeTool(built));
        return ExecuteToolResult.builder()
                .data(response.hasData() ? StructConverter.fromStruct(response.getData()) : null)
                .executionId(response.getExecutionId())
                .build();
    }

    @Override
    public List<SearchedTool> search(String query) {
        return search(query, null);
    }

    @Override
    public List<SearchedTool> search(String query, SearchToolsParams params) {
        if (query == null || query.trim().isEmpty()) {
            throw new IllegalArgumentException("query is required");
        }
        SearchToolsParams effective = params == null ? SearchToolsParams.builder().build() : params;
        SearchToolsRequest.Builder request = SearchToolsRequest.newBuilder().setQuery(query);
        effective.identifier().ifPresent(request::setIdentifier);
        if (effective.topK().isPresent()) {
            request.setTopK(effective.topK().getAsInt());
        }
        final SearchToolsRequest built = request.build();
        final long deadline = AgentKitCalls.nanos(effective.timeout());
        SearchToolsResponse response = AgentKitCalls.call(ToolServiceGrpc.getSearchToolsMethod(), credentials,
                () -> stub.withDeadlineAfter(deadline, AgentKitCalls.NANOS).searchTools(built));
        List<SearchedTool> tools = new ArrayList<>(response.getToolsCount());
        for (com.scalekit.grpc.scalekit.v1.tools.SearchedTool tool : response.getToolsList()) {
            tools.add(ConnectionConverters.searchedTool(tool));
        }
        return Collections.unmodifiableList(tools);
    }

    @Override
    public Page<ScopedTool> listScoped(String identifier, ListScopedToolsParams params) {
        String owner = Preconditions.requireNonBlank(identifier, "identifier");
        if (params == null) {
            throw new IllegalArgumentException("params is required: the server needs a filter");
        }
        return fetchScoped(owner, params, params.pageToken().orElse(null));
    }

    private Page<ScopedTool> fetchScoped(final String identifier, final ListScopedToolsParams params, String pageToken) {
        ListScopedToolsRequest.Builder request = ListScopedToolsRequest.newBuilder()
                .setIdentifier(identifier)
                .setFilter(ScopedToolFilter.newBuilder()
                        .addAllProviders(params.providers())
                        .addAllToolNames(params.toolNames())
                        .addAllConnectionNames(params.connectionNames()));
        if (params.pageSize().isPresent()) {
            request.setPageSize(params.pageSize().getAsInt());
        }
        if (pageToken != null) {
            request.setPageToken(pageToken);
        }
        final ListScopedToolsRequest built = request.build();
        final long deadline = AgentKitCalls.nanos(params.timeout());
        ListScopedToolsResponse response = AgentKitCalls.call(ToolServiceGrpc.getListScopedToolsMethod(), credentials,
                () -> stub.withDeadlineAfter(deadline, AgentKitCalls.NANOS).listScopedTools(built));
        List<ScopedTool> tools = new ArrayList<>(response.getToolsCount());
        for (com.scalekit.grpc.scalekit.v1.tools.ScopedTool tool : response.getToolsList()) {
            tools.add(ConnectionConverters.scopedTool(tool));
        }
        return new Page.Builder<ScopedTool>()
                .items(tools)
                .nextPageToken(response.getNextPageToken())
                .prevPageToken(response.getPrevPageToken())
                .totalSize(response.getTotalSize())
                .nextPageFetcher(next -> fetchScoped(identifier, params, next))
                .build();
    }

    @Override
    public Page<Tool> listAvailable(String identifier) {
        return listAvailable(identifier, null);
    }

    @Override
    public Page<Tool> listAvailable(String identifier, ListAvailableToolsParams params) {
        String owner = Preconditions.requireNonBlank(identifier, "identifier");
        ListAvailableToolsParams effective = params == null ? ListAvailableToolsParams.builder().build() : params;
        return fetchAvailable(owner, effective, effective.pageToken().orElse(null));
    }

    private Page<Tool> fetchAvailable(final String identifier, final ListAvailableToolsParams params, String pageToken) {
        ListAvailableToolsRequest.Builder request = ListAvailableToolsRequest.newBuilder().setIdentifier(identifier);
        if (params.pageSize().isPresent()) {
            request.setPageSize(params.pageSize().getAsInt());
        }
        if (pageToken != null) {
            request.setPageToken(pageToken);
        }
        final ListAvailableToolsRequest built = request.build();
        final long deadline = AgentKitCalls.nanos(params.timeout());
        ListAvailableToolsResponse response = AgentKitCalls.call(ToolServiceGrpc.getListAvailableToolsMethod(),
                credentials, () -> stub.withDeadlineAfter(deadline, AgentKitCalls.NANOS).listAvailableTools(built));
        List<Tool> tools = new ArrayList<>(response.getToolsCount());
        for (com.scalekit.grpc.scalekit.v1.tools.Tool tool : response.getToolsList()) {
            tools.add(AgentKitConverters.tool(tool));
        }
        return new Page.Builder<Tool>()
                .items(tools)
                .nextPageToken(response.getNextPageToken())
                .prevPageToken(response.getPrevPageToken())
                .totalSize(response.getTotalSize())
                .nextPageFetcher(next -> fetchAvailable(identifier, params, next))
                .build();
    }
}
