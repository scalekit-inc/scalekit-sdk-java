package com.scalekit.internal.http;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VerifyPasswordlessOptions {
    private String code;          // null if not provided
    private String linkToken;     // null if not provided
    private String authRequestId; // null if not provided
} 