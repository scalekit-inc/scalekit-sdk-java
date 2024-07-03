package com.scalekit.internal;
import io.grpc.Metadata;

import static io.grpc.Metadata.ASCII_STRING_MARSHALLER;
public class Constants {

    public static String version = "0.1";
    public static final String BEARER_TYPE = "Bearer";

    public static final String GRANT_TYPE = "grant_type";
    public static final String CLIENT_ID = "client_id";

    public static final String CLIENT_SECRET = "client_secret";

    public static final String AUTHORIZATION_CODE = "authorization_code";

    public static final String TOKEN_ENDPOINT = "oauth/token";


    public static final Metadata.Key<String> AUTHORIZATION_METADATA_KEY = Metadata.Key.of("Authorization", ASCII_STRING_MARSHALLER);

}
