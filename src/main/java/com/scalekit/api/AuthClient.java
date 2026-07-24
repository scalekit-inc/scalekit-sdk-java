package com.scalekit.api;

import com.scalekit.exceptions.APIException;
import com.scalekit.internal.http.AuthenticationOptions;
import com.scalekit.internal.http.AuthenticationResponse;
import com.scalekit.internal.http.AuthorizationUrlOptions;
import com.scalekit.internal.http.IdpInitiatedLoginClaims;
import com.scalekit.internal.http.TokenValidationOptions;

import java.net.URL;
import java.util.Map;

public interface AuthClient {
     URL getAuthorizationUrl(String redirectUri, AuthorizationUrlOptions options);

     boolean validateAccessToken(String jwt);

     /**
      * Validates an access token, optionally enforcing the expected issuer and audience.
      * <p>
      * Returns {@code false} when the token's signature does not verify. Any other
      * validation failure — expired token, or an issuer/audience mismatch when the
      * corresponding option is set — is raised as an {@link APIException} rather than
      * returned as {@code false}.
      *
      * @param jwt     the JWT access token to validate
      * @param options optional issuer/audience validation options (may be {@code null})
      * @return {@code true} if the token is valid
      * @throws APIException if the token is expired or fails an issuer/audience check
      */
     boolean validateAccessToken(String jwt, TokenValidationOptions options);

     String generateClientToken(String clientId, String clientSecret);

     String getClientAccessToken();

     AuthenticationResponse authenticateWithCode(String code, String redirectUri, AuthenticationOptions options);

     IdpInitiatedLoginClaims getIdpInitiatedLoginClaims(String idpInitiatedLoginToken) throws APIException;

     AuthenticationResponse refreshAccessToken(String refreshToken) throws APIException;

     Map<String, Object> validateAccessTokenAndGetClaims(String jwt) throws APIException;
}
