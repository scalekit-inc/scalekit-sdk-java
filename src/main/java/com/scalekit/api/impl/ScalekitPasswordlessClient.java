package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.api.PasswordlessClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.auth.passwordless.*;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import com.scalekit.internal.http.SendPasswordlessOptions;
import com.scalekit.internal.http.VerifyPasswordlessOptions;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

public class ScalekitPasswordlessClient implements PasswordlessClient {

    private final PasswordlessServiceGrpc.PasswordlessServiceBlockingStub passwordlessStub;
    private final ScalekitCredentials credentials;

    public ScalekitPasswordlessClient(ManagedChannel channel, ScalekitCredentials credentials) {
        try {
            this.credentials = credentials;
            this.passwordlessStub = PasswordlessServiceGrpc
                    .newBlockingStub(channel)
                    .withCallCredentials(credentials);
        } catch (StatusRuntimeException e) {
            throw new RuntimeException("Error creating Passwordless client", e);
        }
    }

    /**
     * Send a passwordless authentication email
     * @param email The email address to send the passwordless link to
     * @param options The options for sending the passwordless email
     * @return SendPasswordlessResponse The response containing auth request details
     */
    @Override
    public SendPasswordlessResponse sendPasswordlessEmail(String email, SendPasswordlessOptions options) {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email must be a valid string");
        }

        return RetryExecuter.executeWithRetry(() -> {
            SendPasswordlessRequest.Builder requestBuilder = SendPasswordlessRequest.newBuilder()
                    .setEmail(email);

            if (options != null) {
                if (options.getTemplate() != null) {
                    requestBuilder.setTemplate(options.getTemplate());
                }
                if (options.getState() != null && !options.getState().trim().isEmpty()) {
                    requestBuilder.setState(options.getState());
                }
                if (options.getMagiclinkAuthUri() != null && !options.getMagiclinkAuthUri().trim().isEmpty()) {
                    requestBuilder.setMagiclinkAuthUri(options.getMagiclinkAuthUri());
                }
                if (options.getExpiresIn() != null && options.getExpiresIn() > 0) {
                    requestBuilder.setExpiresIn(options.getExpiresIn());
                }
                if (options.getTemplateVariables() != null && !options.getTemplateVariables().isEmpty()) {
                    requestBuilder.putAllTemplateVariables(options.getTemplateVariables());
                }
            }

            return this.passwordlessStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .sendPasswordlessEmail(requestBuilder.build());
        }, this.credentials);
    }

    /**
     * Send a passwordless authentication email with default options
     * @param email The email address to send the passwordless link to
     * @return SendPasswordlessResponse The response containing auth request details
     */
    @Override
    public SendPasswordlessResponse sendPasswordlessEmail(String email) {
        return sendPasswordlessEmail(email, null);
    }

    /**
     * Verify a passwordless authentication code or link token
     * @param credential The credential to verify (code or linkToken)
     * @param authRequestId Optional auth request ID from the send response
     * @return VerifyPasswordLessResponse The response containing verification details
     */
    @Override
    public VerifyPasswordLessResponse verifyPasswordlessEmail(VerifyPasswordlessOptions credential, String authRequestId) {
        if (credential == null) {
            throw new IllegalArgumentException("Credential cannot be null");
        }
        if ((credential.getCode() == null || credential.getCode().trim().isEmpty()) &&
            (credential.getLinkToken() == null || credential.getLinkToken().trim().isEmpty())) {
            throw new IllegalArgumentException("Either code or linkToken must be provided");
        }

        return RetryExecuter.executeWithRetry(() -> {
            VerifyPasswordLessRequest.Builder requestBuilder = VerifyPasswordLessRequest.newBuilder();

            if (credential.getCode() != null && !credential.getCode().trim().isEmpty()) {
                requestBuilder.setCode(credential.getCode());
            } else if (credential.getLinkToken() != null && !credential.getLinkToken().trim().isEmpty()) {
                requestBuilder.setLinkToken(credential.getLinkToken());
            }

            if (authRequestId != null && !authRequestId.trim().isEmpty()) {
                requestBuilder.setAuthRequestId(authRequestId);
            }

            return this.passwordlessStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .verifyPasswordlessEmail(requestBuilder.build());
        }, this.credentials);
    }

    /**
     * Verify a passwordless authentication code or link token without auth request ID
     * @param credential The credential to verify (code or linkToken)
     * @return VerifyPasswordLessResponse The response containing verification details
     */
    @Override
    public VerifyPasswordLessResponse verifyPasswordlessEmail(VerifyPasswordlessOptions credential) {
        return verifyPasswordlessEmail(credential, null);
    }

    /**
     * Resend a passwordless authentication email
     * @param authRequestId The auth request ID from the original send response
     * @return SendPasswordlessResponse The response containing new auth request details
     */
    @Override
    public SendPasswordlessResponse resendPasswordlessEmail(String authRequestId) {
        if (authRequestId == null || authRequestId.trim().isEmpty()) {
            throw new IllegalArgumentException("Auth request ID must be provided");
        }

        return RetryExecuter.executeWithRetry(() -> {
            ResendPasswordlessRequest request = ResendPasswordlessRequest.newBuilder()
                    .setAuthRequestId(authRequestId)
                    .build();

            return this.passwordlessStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .resendPasswordlessEmail(request);
        }, this.credentials);
    }
} 