package com.scalekit.api;

import com.scalekit.internal.http.AuthenticationOptions;
import com.scalekit.internal.http.AuthenticationResponse;
import com.scalekit.internal.http.AuthorizationUrlOptions;

import java.net.URL;

public interface AuthClient {
     URL getAuthorizationUrl(String redirectUri, AuthorizationUrlOptions options);

     boolean validateAccessToken(String jwt);

     String getClientAccessToken();

     AuthenticationResponse authenticateWithCode(String code, String redirectUri, AuthenticationOptions options);

}
