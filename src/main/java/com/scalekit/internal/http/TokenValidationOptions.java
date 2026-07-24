package com.scalekit.internal.http;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class TokenValidationOptions {
    private String issuer;
    private List<String> audience;
}
