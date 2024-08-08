package com.scalekit.internal.http;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IdpInitiatedLoginClaims {
    @JsonProperty("connection_id")
    String ConnectionID;

    @JsonProperty("organization_id")
    String OrganizationID;

    @JsonProperty("login_hint")
    String LoginHint;

    @JsonProperty("relay_state")
    String RelayState;
}
