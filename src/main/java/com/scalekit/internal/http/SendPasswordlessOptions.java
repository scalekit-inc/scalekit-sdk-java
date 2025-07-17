package com.scalekit.internal.http;

import com.scalekit.grpc.scalekit.v1.auth.passwordless.TemplateType;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class SendPasswordlessOptions {
    private TemplateType template;
    private String state;
    private String magiclinkAuthUri;
    private Integer expiresIn;
    private Map<String, String> templateVariables;
} 