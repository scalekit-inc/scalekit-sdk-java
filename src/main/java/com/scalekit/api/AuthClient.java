package com.scalekit.api;

import com.scalekit.internal.http.AuthorizationUrlOptions;

import java.net.URL;

public interface AuthClient {
     URL getAuthorizationUrl(String redirectUri, AuthorizationUrlOptions options);

     public boolean validateAccessToken(String jwt);

     public String getClientAccessToken();

}
