package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.auth.webauthn.DeleteCredentialResponse;
import com.scalekit.grpc.scalekit.v1.auth.webauthn.ListCredentialsResponse;
import com.scalekit.grpc.scalekit.v1.auth.webauthn.UpdateCredentialResponse;

public interface WebAuthnClient {
    
    /**
     * Lists all WebAuthn credentials for a user
     * @param userId The ID of the user whose credentials to list
     * @return ListCredentialsResponse The response containing the list of credentials
     */
    ListCredentialsResponse listCredentials(String userId);
    
    /**
     * Updates a WebAuthn credential's display name
     * @param credentialId The ID of the credential to update
     * @param displayName The new display name for the credential
     * @return UpdateCredentialResponse The response containing the updated credential
     */
    UpdateCredentialResponse updateCredential(String credentialId, String displayName);
    
    /**
     * Deletes a WebAuthn credential
     * @param credentialId The ID of the credential to delete
     * @return DeleteCredentialResponse The response containing deletion status
     */
    DeleteCredentialResponse deleteCredential(String credentialId);
}

