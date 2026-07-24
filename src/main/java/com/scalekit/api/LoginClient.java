package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.auth.User;

public interface LoginClient {
    String updateLoginUserDetails(String connectionId, String loginRequestId, User user);
}
