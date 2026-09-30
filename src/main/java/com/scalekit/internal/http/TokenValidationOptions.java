package com.scalekit.internal.http;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class TokenValidationOptions {
    /**
     * Single expected issuer. When non-empty, the token's {@code iss} claim must match it
     * (or any entry of {@link #issuers}).
     */
    private String issuer;

    /**
     * Accepted issuers. The token is valid if its {@code iss} claim exactly equals any entry
     * (no trailing-slash normalization). Combines with {@link #issuer}: the accepted set is
     * {@code issuer} (when non-empty) plus every entry of {@code issuers}.
     * <p>
     * The issuer check is skipped only when {@code issuer} is empty and {@code issuers} is
     * {@code null} or empty. A non-empty {@code issuers} is always enforced, even if its
     * entries are blank, so configuration built from unset values fails closed instead of
     * silently skipping validation.
     */
    private List<String> issuers;

    private List<String> audience;
}
