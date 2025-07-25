package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.auth.passwordless.SendPasswordlessResponse;
import com.scalekit.grpc.scalekit.v1.auth.passwordless.VerifyPasswordLessResponse;
import com.scalekit.internal.http.SendPasswordlessOptions;
import com.scalekit.internal.http.VerifyPasswordlessOptions;

public interface PasswordlessClient {
    
    /**
     * Send a passwordless authentication email
     * @param email The email address to send the passwordless link to
     * @param options The options for sending the passwordless email
     * @return SendPasswordlessResponse The response containing auth request details
     */
    SendPasswordlessResponse sendPasswordlessEmail(String email, SendPasswordlessOptions options);
    
    /**
     * Send a passwordless authentication email with default options
     * @param email The email address to send the passwordless link to
     * @return SendPasswordlessResponse The response containing auth request details
     */
    SendPasswordlessResponse sendPasswordlessEmail(String email);
    
    /**
     * Verify a passwordless authentication code or link token
     * @param credential The credential to verify (code or linkToken)
     * @param authRequestId Optional auth request ID from the send response
     * @return VerifyPasswordLessResponse The response containing verification details
     */
    VerifyPasswordLessResponse verifyPasswordlessEmail(VerifyPasswordlessOptions credential, String authRequestId);
    
    /**
     * Verify a passwordless authentication code or link token without auth request ID
     * @param credential The credential to verify (code or linkToken)
     * @return VerifyPasswordLessResponse The response containing verification details
     */
    VerifyPasswordLessResponse verifyPasswordlessEmail(VerifyPasswordlessOptions credential);
    
    /**
     * Resend a passwordless authentication email
     * @param authRequestId The auth request ID from the original send response
     * @return SendPasswordlessResponse The response containing new auth request details
     */
    SendPasswordlessResponse resendPasswordlessEmail(String authRequestId);
} 