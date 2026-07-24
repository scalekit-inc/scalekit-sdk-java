package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.api.LoginClient;
import com.scalekit.grpc.scalekit.v1.auth.*;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

public class ScalekitLoginClient implements LoginClient {

    private final AuthServiceGrpc.AuthServiceBlockingStub stub;
    private final ScalekitCredentials credentials;

    public ScalekitLoginClient(ManagedChannel channel, ScalekitCredentials credentials) {
        try {
            this.credentials = credentials;
            this.stub = AuthServiceGrpc
                    .newBlockingStub(channel)
                    .withCallCredentials(credentials);
        } catch (StatusRuntimeException e) {
            throw new RuntimeException("Error creating Login client", e);
        }
    }

    @Override
    public String updateLoginUserDetails(String connectionId, String loginRequestId, User user) {
        if (connectionId == null || connectionId.isEmpty()) {
            throw new IllegalArgumentException("connectionId is required");
        }
        if (loginRequestId == null || loginRequestId.isEmpty()) {
            throw new IllegalArgumentException("loginRequestId is required");
        }
        if (user == null) {
            throw new IllegalArgumentException("user is required");
        }

        return RetryExecuter.executeWithRetry(() -> {
            UpdateLoginUserDetailsResponse resp = this.stub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .updateLoginUserDetails(UpdateLoginUserDetailsRequest.newBuilder()
                            .setConnectionId(connectionId)
                            .setLoginRequestId(loginRequestId)
                            .setUser(user)
                            .build());
            return resp.getAuthRequestId();
        }, this.credentials);
    }
}
