package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.sessions.RevokeAllUserSessionsResponse;
import com.scalekit.grpc.scalekit.v1.sessions.RevokeSessionResponse;
import com.scalekit.grpc.scalekit.v1.sessions.SessionDetails;
import com.scalekit.grpc.scalekit.v1.sessions.UserSessionDetails;
import com.scalekit.grpc.scalekit.v1.sessions.UserSessionFilter;

public interface SessionClient {
    SessionDetails getSession(String sessionId);

    UserSessionDetails getUserSessions(String userId, Integer pageSize, String pageToken, UserSessionFilter filter);

    RevokeSessionResponse revokeSession(String sessionId);

    RevokeAllUserSessionsResponse revokeAllUserSessions(String userId);
} 