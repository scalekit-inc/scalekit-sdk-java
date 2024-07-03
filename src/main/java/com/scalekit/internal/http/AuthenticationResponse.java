package com.scalekit.internal.http;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AuthenticationResponse {
    @JsonProperty("id_token")
    private String idToken;

    @JsonProperty("access_token")
    private String accessToken;
}
