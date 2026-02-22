package com.scalekit.internal.http;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class AccessTokenClaims implements ClaimSet {
    private String sub;
    private String iss;
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<String> aud;
    private long iat;
    private long exp;

    @JsonIgnore
    private Map<String, Object> claims;
}
