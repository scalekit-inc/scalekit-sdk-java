package com.scalekit.api.impl;

import com.google.protobuf.BoolValue;
import com.scalekit.api.ToolsClient;
import com.scalekit.grpc.scalekit.v1.tools.ExecuteToolRequest;
import com.scalekit.grpc.scalekit.v1.tools.ExecuteToolResponse;
import com.scalekit.grpc.scalekit.v1.tools.Filter;
import com.scalekit.grpc.scalekit.v1.tools.ListToolsRequest;
import com.scalekit.grpc.scalekit.v1.tools.ListToolsResponse;
import com.scalekit.grpc.scalekit.v1.tools.ToolServiceGrpc;
import com.scalekit.internal.Preconditions;
import com.scalekit.internal.ScalekitCredentials;
import com.scalekit.internal.StructConverter;
import com.scalekit.models.tools.ExecuteToolParams;
import com.scalekit.models.tools.ExecuteToolResult;
import com.scalekit.models.tools.ListToolsParams;
import com.scalekit.models.tools.Tool;
import com.scalekit.models.tools.ToolPage;
import io.grpc.Channel;

import java.util.ArrayList;
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
}
