package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.auditlogs.RevokeSessionResponse;
import com.scalekit.grpc.scalekit.v1.auditlogs.SessionDetails;
import com.scalekit.grpc.scalekit.v1.auditlogs.UserSessionDetails;

public interface SessionClient {
    SessionDetails getSession(String sessionId);

    UserSessionDetails getUserSessions(String userId);

    RevokeSessionResponse revokeSession(String sessionId);
} 