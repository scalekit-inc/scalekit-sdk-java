package com.scalekit.internal.http;

import java.util.Map;

public interface ClaimSet {
    Map<String, Object> getClaims();
    void setClaims(Map<String, Object> claims);
}
