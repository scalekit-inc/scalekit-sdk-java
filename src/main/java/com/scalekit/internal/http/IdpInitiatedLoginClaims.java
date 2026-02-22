package com.scalekit.internal.http;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.Map;

@Getter
@Setter
public class IdpInitiatedLoginClaims implements ClaimSet {
    @JsonProperty("connection_id")
    String ConnectionID;

    @JsonProperty("organization_id")
    String OrganizationID;

    @JsonProperty("login_hint")
    String LoginHint;

    @JsonProperty("relay_state")
    String RelayState;

    @JsonIgnore
    private Map<String, Object> claims;
}
