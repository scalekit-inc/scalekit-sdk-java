package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.api.SessionClient;
import com.scalekit.grpc.scalekit.v1.sessions.*;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

public class ScalekitSessionClient implements SessionClient {

    private final SessionServiceGrpc.SessionServiceBlockingStub sessionStub;
    private final ScalekitCredentials credentials;

    public ScalekitSessionClient(ManagedChannel channel, ScalekitCredentials credentials) {
        try {
            this.credentials = credentials;
            this.sessionStub = SessionServiceGrpc
                    .newBlockingStub(channel)
                    .withCallCredentials(credentials);
        } catch (StatusRuntimeException e) {
            throw new RuntimeException("Error creating Session client", e);
        }
    }

    @Override
    public SessionDetails getSession(String sessionId) {
        return RetryExecuter.executeWithRetry(() -> this.sessionStub
                .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                .getSession(SessionDetailsRequest.newBuilder()
                        .setSessionId(sessionId)
                        .build()), this.credentials);
    }

    @Override
    public UserSessionDetails getUserSessions(String userId, Integer pageSize, String pageToken, UserSessionFilter filter) {
        UserSessionDetailsRequest.Builder requestBuilder = UserSessionDetailsRequest.newBuilder()
                .setUserId(userId);

        if (pageSize != null) {
            requestBuilder.setPageSize(pageSize);
        }

        if (pageToken != null && !pageToken.trim().isEmpty()) {
            requestBuilder.setPageToken(pageToken);
        }

        if (filter != null) {
            requestBuilder.setFilter(filter);
        }

        return RetryExecuter.executeWithRetry(() -> this.sessionStub
                .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                .getUserSessions(requestBuilder.build()), this.credentials);
    }

    @Override
    public RevokeSessionResponse revokeSession(String sessionId) {
        return RetryExecuter.executeWithRetry(() -> this.sessionStub
                .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                .revokeSession(RevokeSessionRequest.newBuilder()
                        .setSessionId(sessionId)
                        .build()), this.credentials);
    }

    @Override
    public RevokeAllUserSessionsResponse revokeAllUserSessions(String userId) {
        return RetryExecuter.executeWithRetry(() -> this.sessionStub
                .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                .revokeAllUserSessions(RevokeAllUserSessionsRequest.newBuilder()
                        .setUserId(userId)
                        .build()), this.credentials);
    }
} 