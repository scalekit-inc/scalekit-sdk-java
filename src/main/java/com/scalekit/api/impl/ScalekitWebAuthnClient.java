package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.api.WebAuthnClient;
import com.scalekit.grpc.scalekit.v1.auth.webauthn.*;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

public class ScalekitWebAuthnClient implements WebAuthnClient {

    private final WebAuthnServiceGrpc.WebAuthnServiceBlockingStub webAuthnStub;
    private final ScalekitCredentials credentials;

    public ScalekitWebAuthnClient(ManagedChannel channel, ScalekitCredentials credentials) {
        try {
            this.credentials = credentials;
            this.webAuthnStub = WebAuthnServiceGrpc
                    .newBlockingStub(channel)
                    .withCallCredentials(credentials);
        } catch (StatusRuntimeException e) {
            throw new RuntimeException("Error creating WebAuthn client", e);
        }
    }

    /**
     * Lists all WebAuthn credentials for a user
     * @param userId The ID of the user whose credentials to list
     * @return ListCredentialsResponse The response containing the list of credentials
     */
    @Override
    public ListCredentialsResponse listCredentials(String userId) {
        if (userId == null || userId.trim().isEmpty()) {
            throw new IllegalArgumentException("User ID must be provided");
        }

        return RetryExecuter.executeWithRetry(() -> {
            ListCredentialsRequest request = ListCredentialsRequest.newBuilder()
                    .setUserId(userId)
                    .build();

            return this.webAuthnStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .listCredentials(request);
        }, this.credentials);
    }

    /**
     * Updates a WebAuthn credential's display name
     * @param credentialId The ID of the credential to update
     * @param displayName The new display name for the credential
     * @return UpdateCredentialResponse The response containing the updated credential
     */
    @Override
    public UpdateCredentialResponse updateCredential(String credentialId, String displayName) {
        if (credentialId == null || credentialId.trim().isEmpty()) {
            throw new IllegalArgumentException("Credential ID must be provided");
        }
        if (displayName == null || displayName.trim().isEmpty()) {
            throw new IllegalArgumentException("Display name must be provided");
        }

        return RetryExecuter.executeWithRetry(() -> {
            UpdateCredentialRequest request = UpdateCredentialRequest.newBuilder()
                    .setCredentialId(credentialId)
                    .setDisplayName(displayName)
                    .build();

            return this.webAuthnStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .updateCredential(request);
        }, this.credentials);
    }

    /**
     * Deletes a WebAuthn credential
     * @param credentialId The ID of the credential to delete
     * @return DeleteCredentialResponse The response containing deletion status
     */
    @Override
    public DeleteCredentialResponse deleteCredential(String credentialId) {
        if (credentialId == null || credentialId.trim().isEmpty()) {
            throw new IllegalArgumentException("Credential ID must be provided");
        }

        return RetryExecuter.executeWithRetry(() -> {
            DeleteCredentialRequest request = DeleteCredentialRequest.newBuilder()
                    .setCredentialId(credentialId)
                    .build();

            return this.webAuthnStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .deleteCredential(request);
        }, this.credentials);
    }
}

