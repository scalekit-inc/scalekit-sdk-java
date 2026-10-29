package com.scalekit.models.connectedaccounts;

import com.scalekit.internal.JsonValues;
import com.scalekit.internal.Redaction;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * The credentials of a connected account. Exactly one kind is set: OAuth token, static
 * credentials (API key, basic auth, bearer token...), Google domain-wide delegation, or a trusted
 * identity provider. Secrets are never printed by {@link #toString()}. Immutable and thread-safe.
 *
 * <pre>{@code
 * AuthorizationDetails apiKey = AuthorizationDetails.staticAuth(
 *         Collections.singletonMap("api_key", System.getenv("VENDOR_API_KEY")));
 * }</pre>
 *
 * @since 2.6.0
 */
public final class AuthorizationDetails {

    private final OAuthToken oauthToken;
    private final Map<String, Object> staticAuth;
    private final GoogleDwdAuth googleDwd;
    private final TrustedIdpAuth trustedIdp;

    private AuthorizationDetails(OAuthToken oauthToken, Map<String, Object> staticAuth, GoogleDwdAuth googleDwd,
                                 TrustedIdpAuth trustedIdp) {
        this.oauthToken = oauthToken;
        this.staticAuth = staticAuth;
        this.googleDwd = googleDwd;
        this.trustedIdp = trustedIdp;
    }

    /**
     * Creates OAuth credentials.
     *
     * @param token the token; {@code OAuthToken.builder().build()} for an account the user
     *              authorizes later
     * @return the details
     * @throws IllegalArgumentException if {@code token} is null
     */
    public static AuthorizationDetails oauthToken(OAuthToken token) {
        if (token == null) {
            throw new IllegalArgumentException("token is required");
        }
        return new AuthorizationDetails(token, null, null, null);
    }

    /**
     * Creates static credentials, such as {@code {"api_key": "..."}} or
     * {@code {"username": "...", "password": "..."}}. The keys depend on the connection. An empty
     * map is the form used for connections that need no credentials.
     *
     * @param details JSON-compatible map of credential fields
     * @return the details
     * @throws IllegalArgumentException if {@code details} is null or holds a value that is not
     *                                  JSON-compatible
     */
    public static AuthorizationDetails staticAuth(Map<String, ?> details) {
        if (details == null) {
            throw new IllegalArgumentException("details is required");
        }
        return new AuthorizationDetails(null, JsonValues.copyObject(details, "staticAuth"), null, null);
    }

    /**
     * Creates Google Workspace domain-wide delegation credentials.
     *
     * @param auth the credentials; set at least the subject
     * @return the details
     * @throws IllegalArgumentException if {@code auth} is null
     */
    public static AuthorizationDetails googleDwd(GoogleDwdAuth auth) {
        if (auth == null) {
            throw new IllegalArgumentException("auth is required");
        }
        return new AuthorizationDetails(null, null, auth, null);
    }

    /**
     * Creates trusted identity provider credentials.
     *
     * @param auth the credentials; set at least the database user
     * @return the details
     * @throws IllegalArgumentException if {@code auth} is null
     */
    public static AuthorizationDetails trustedIdp(TrustedIdpAuth auth) {
        if (auth == null) {
            throw new IllegalArgumentException("auth is required");
        }
        return new AuthorizationDetails(null, null, null, auth);
    }

    /**
     * Returns the OAuth credentials.
     *
     * @return the token, or empty when the details are of another kind
     */
    public Optional<OAuthToken> oauthToken() {
        return Optional.ofNullable(oauthToken);
    }

    /**
     * Returns the static credential fields. The values are secrets.
     *
     * @return an unmodifiable map, or empty when the details are of another kind
     */
    public Optional<Map<String, Object>> staticAuth() {
        return Optional.ofNullable(staticAuth);
    }

    /**
     * Returns the Google domain-wide delegation credentials.
     *
     * @return the credentials, or empty when the details are of another kind
     */
    public Optional<GoogleDwdAuth> googleDwd() {
        return Optional.ofNullable(googleDwd);
    }

    /**
     * Returns the trusted identity provider credentials.
     *
     * @return the credentials, or empty when the details are of another kind
     */
    public Optional<TrustedIdpAuth> trustedIdp() {
        return Optional.ofNullable(trustedIdp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthorizationDetails)) {
            return false;
        }
        AuthorizationDetails that = (AuthorizationDetails) o;
        return Objects.equals(oauthToken, that.oauthToken) && Objects.equals(staticAuth, that.staticAuth)
                && Objects.equals(googleDwd, that.googleDwd) && Objects.equals(trustedIdp, that.trustedIdp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oauthToken, staticAuth, googleDwd, trustedIdp);
    }

    @Override
    public String toString() {
        if (oauthToken != null) {
            return "AuthorizationDetails{oauthToken=" + oauthToken + "}";
        }
        if (staticAuth != null) {
            StringBuilder fields = new StringBuilder("{");
            for (String key : staticAuth.keySet()) {
                if (fields.length() > 1) {
                    fields.append(", ");
                }
                fields.append(key).append('=').append(Redaction.REDACTED);
            }
            return "AuthorizationDetails{staticAuth=" + fields.append('}') + "}";
        }
        if (googleDwd != null) {
            return "AuthorizationDetails{googleDwd=" + googleDwd + "}";
        }
        return "AuthorizationDetails{trustedIdp=" + trustedIdp + "}";
    }
}
