package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.auth.User;
import com.scalekit.internal.http.UpdateLoginUserDetailsResult;

public interface LoginClient {
    UpdateLoginUserDetailsResult updateLoginUserDetails(String connectionId, String loginRequestId, User user);
}
