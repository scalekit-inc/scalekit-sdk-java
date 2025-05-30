package com.scalekit.internal.http;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class AuthorizationUrlOptions {
    private String connectionId;
    private String organizationId;
    private List<String> scopes;
    private String state;
    private String nonce;
    private String domainHint;
    private String loginHint;
    private String codeChallenge;
    private String codeChallengeMethod;
    private String provider;
    private String prompt;
}