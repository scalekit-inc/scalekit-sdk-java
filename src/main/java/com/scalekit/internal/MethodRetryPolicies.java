package com.scalekit.internal;

import com.scalekit.grpc.scalekit.v1.connected_accounts.ConnectedAccountServiceGrpc;
import com.scalekit.grpc.scalekit.v1.mcp.McpServiceGrpc;
import com.scalekit.grpc.scalekit.v1.providers.ProviderServiceGrpc;
import com.scalekit.grpc.scalekit.v1.tools.ToolServiceGrpc;
import io.grpc.MethodDescriptor;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The single table of retry policies for the RPCs wrapped since 2.6.0. A method missing from the
 * table is a programming error and fails fast. Not part of the public API.
 */
public final class MethodRetryPolicies {

    private static final Map<String, RetryPolicy> POLICIES;

    static {
        Map<String, RetryPolicy> policies = new HashMap<>();
        // Not idempotent: running a tool may act upstream; creates may persist before failing.
        put(policies, ToolServiceGrpc.getExecuteToolMethod(), RetryPolicy.NON_IDEMPOTENT);
        put(policies, ConnectedAccountServiceGrpc.getCreateConnectedAccountMethod(), RetryPolicy.NON_IDEMPOTENT);
        put(policies, McpServiceGrpc.getCreateMcpConfigMethod(), RetryPolicy.NON_IDEMPOTENT);
        put(policies, McpServiceGrpc.getCreateMcpSessionTokenMethod(), RetryPolicy.NON_IDEMPOTENT);
        put(policies, ProviderServiceGrpc.getCreateCustomProviderMethod(), RetryPolicy.NON_IDEMPOTENT);
        // Verification consumes the single-use auth request; a repeat could turn a success into
        // a not-found failure.
        put(policies, ConnectedAccountServiceGrpc.getVerifyConnectedAccountUserMethod(), RetryPolicy.NON_IDEMPOTENT);

        // Idempotent: reads, full-replacement updates, get-or-create style calls, and deletes (a
        // retried delete whose first attempt succeeded surfaces NOT_FOUND).
        put(policies, ToolServiceGrpc.getListToolsMethod(), RetryPolicy.IDEMPOTENT);
        put(policies, ConnectedAccountServiceGrpc.getListConnectedAccountsMethod(), RetryPolicy.IDEMPOTENT);
        put(policies, ConnectedAccountServiceGrpc.getGetConnectedAccountAuthMethod(), RetryPolicy.IDEMPOTENT);
        put(policies, ConnectedAccountServiceGrpc.getUpdateConnectedAccountMethod(), RetryPolicy.IDEMPOTENT);
        put(policies, ConnectedAccountServiceGrpc.getDeleteConnectedAccountMethod(), RetryPolicy.IDEMPOTENT);
        put(policies, ConnectedAccountServiceGrpc.getGetMagicLinkForConnectedAccountMethod(), RetryPolicy.IDEMPOTENT);
        put(policies, McpServiceGrpc.getGetMcpConfigMethod(), RetryPolicy.IDEMPOTENT);
        put(policies, McpServiceGrpc.getListMcpConfigsMethod(), RetryPolicy.IDEMPOTENT);
        put(policies, McpServiceGrpc.getUpdateMcpConfigMethod(), RetryPolicy.IDEMPOTENT);
        put(policies, McpServiceGrpc.getDeleteMcpConfigMethod(), RetryPolicy.IDEMPOTENT);
        put(policies, McpServiceGrpc.getListMcpConnectedAccountsMethod(), RetryPolicy.IDEMPOTENT);
        put(policies, ProviderServiceGrpc.getUpdateCustomProviderMethod(), RetryPolicy.IDEMPOTENT);
        put(policies, ProviderServiceGrpc.getDeleteCustomProviderMethod(), RetryPolicy.IDEMPOTENT);
        POLICIES = Collections.unmodifiableMap(policies);
    }

    private MethodRetryPolicies() {
    }

    private static void put(Map<String, RetryPolicy> policies, MethodDescriptor<?, ?> method, RetryPolicy policy) {
        policies.put(method.getFullMethodName(), policy);
    }

    /**
     * Returns the retry policy of an RPC.
     *
     * @param method the RPC
     * @return the policy
     * @throws IllegalStateException if the RPC is not in the table
     */
    public static RetryPolicy of(MethodDescriptor<?, ?> method) {
        RetryPolicy policy = POLICIES.get(method.getFullMethodName());
        if (policy == null) {
            throw new IllegalStateException("no retry policy for " + method.getFullMethodName());
        }
        return policy;
    }
}
