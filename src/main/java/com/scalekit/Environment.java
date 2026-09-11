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

    /** Default per-call deadline in milliseconds - matches Python's/Node's 20s control-plane default. */
    public static final int DEFAULT_TIMEOUT_MILLIS = 20_000;

    public int timeout = DEFAULT_TIMEOUT_MILLIS;


    public Environment(String siteName, String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.siteName = siteName;

        String configured = System.getenv(Constants.SCALEKIT_REQUEST_TIMEOUT);
        if (configured == null) {
            this.timeout = DEFAULT_TIMEOUT_MILLIS;
        } else {
            int parsed;
            try {
                parsed = Integer.parseInt(configured);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(
                        Constants.SCALEKIT_REQUEST_TIMEOUT + " must be a positive integer (milliseconds), got: " + configured);
            }
            if (parsed <= 0) {
                throw new IllegalArgumentException(
                        Constants.SCALEKIT_REQUEST_TIMEOUT + " must be a positive number of milliseconds, got: " + parsed);
            }
            this.timeout = parsed;
        }
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

