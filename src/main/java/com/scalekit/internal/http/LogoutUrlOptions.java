package com.scalekit.internal.http;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogoutUrlOptions {
    private String idTokenHint;
    private String postLogoutRedirectUri;
    private String state;
}