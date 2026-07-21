package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.api.AuditLogsClient;
import com.scalekit.grpc.scalekit.v1.auditlogs.*;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

public class ScalekitAuditLogsClient implements AuditLogsClient {

    private final AuditLogsServiceGrpc.AuditLogsServiceBlockingStub auditLogsStub;
    private final ScalekitCredentials credentials;

    public ScalekitAuditLogsClient(ManagedChannel channel, ScalekitCredentials credentials) {
        try {
            this.credentials = credentials;
            this.auditLogsStub = AuditLogsServiceGrpc
                    .newBlockingStub(channel)
                    .withCallCredentials(this.credentials);
        } catch (StatusRuntimeException e) {
            throw new RuntimeException("Error creating AuditLogs client", e);
        }
    }

    /**
     * Lists authentication request logs for the current environment, ordered most-recent first.
     * Each entry's authRequestId can be passed to EventsClient.listEvents via
     * EventFilter.setAuthRequestId to see every event a specific login produced.
     * @param request: The list authentication request logs request containing filters and pagination options
     * @return ListAuthLogResponse: The response containing the log entries and pagination info
     */
    @Override
    public ListAuthLogResponse listAuthRequests(ListAuthLogRequest request) {
        return RetryExecuter.executeWithRetry(() -> {
            return auditLogsStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .listAuthRequests(request);
        }, this.credentials);
    }
}
