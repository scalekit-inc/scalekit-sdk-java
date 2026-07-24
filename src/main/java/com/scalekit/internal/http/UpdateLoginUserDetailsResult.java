package com.scalekit.internal.http;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Result of {@code LoginClient.updateLoginUserDetails}.
 * <p>
 * Wraps the response so additional fields can be added in future without
 * breaking the method signature. Today it carries only the auth request ID.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateLoginUserDetailsResult {
    /**
     * The auth request ID, which can be used to look up the authentication
     * journey of the user via auth logs.
     */
    private String authRequestId;
}
