package com.scalekit.api.util;

import lombok.*;

import java.util.List;

import com.scalekit.grpc.scalekit.v1.clients.CustomClaim;

/**
 * Fields to change on an existing resource client. Only the fields set here
 * (non-null) are sent to the server — there is no separate field mask to
 * build yourself; updateResourceClient derives it from whichever fields are
 * set.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateResourceClientOptions {
    /** Updated name, if set. Applied only when non-empty — an empty string is a no-op, not a clear. */
    String name;
    /** Updated description, if set. Applied only when non-empty — an empty string is a no-op, not a clear. */
    String description;
    /** Updated scopes, if set (replaces existing; pass an empty list to clear). */
    List<String> scopes;
    /** Updated custom claims, if set (replaces existing; pass an empty list to clear). */
    List<CustomClaim> customClaims;
    /** Updated access token lifetime in seconds, if set. */
    Long expiry;
    /** Updated redirect URIs, if set (replaces existing; pass an empty list to clear). */
    List<String> redirectUris;
}
