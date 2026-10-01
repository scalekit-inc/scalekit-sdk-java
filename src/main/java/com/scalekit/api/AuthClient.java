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

     /**
      * Validates an access token, optionally enforcing the expected issuer(s) and audience,
      * and returns the decoded claims. The token is valid if its {@code iss} claim exactly
      * equals the issuer or any entry of the issuers list.
      *
      * @param jwt     the JWT access token to validate
      * @param options optional issuer/audience validation options (may be {@code null})
      * @return the decoded claims
      * @throws APIException if the signature is invalid, the token is expired, or it fails
      *                      an issuer/audience check
      */
     Map<String, Object> validateAccessTokenAndGetClaims(String jwt, TokenValidationOptions options) throws APIException;
}
