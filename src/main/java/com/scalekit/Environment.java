package com.scalekit;

import com.scalekit.internal.Constants;

public class Environment {

    /**
     * You can get your client secret from API config in scalekit web app.
     */
    public final String clientId;

    /**
     * You can generate client secret from the scalekit web app.
     */
    public final String clientSecret ;

    public final String siteName;

    private static Environment defaultEnv; // singleton

    public int timeout = 10000;


    public Environment(String siteName, String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.siteName = siteName;
        this.timeout = System.getenv(Constants.SCALEKIT_REQUEST_TIMEOUT) != null ?
                Integer.parseInt(System.getenv(Constants.SCALEKIT_REQUEST_TIMEOUT)) :
                10000;
    }

    public static void configure(String siteName, String clientId, String clientSecret) {
        Environment.defaultEnv = new Environment(siteName, clientId,clientSecret);
    }

    public static Environment defaultConfig() {
        if(defaultEnv == null) {
            throw new RuntimeException("The default environment has not been configured");
        }
        return defaultEnv;
    }

}

