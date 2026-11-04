package com.scalekit.models.connectedaccounts;

/**
 * The state of a connected account. An extensible enum: values the server adds later are kept
 * as-is, with {@link #known()} returning {@link Known#_UNKNOWN}.
 *
 * <pre>{@code
 * switch (account.status().known()) {
 *     case ACTIVE: run(account); break;
 *     case EXPIRED: askUserToReconnect(account); break;
 *     default: log.info("account {} is {}", account.id(), account.status().value());
 * }
 * }</pre>
 *
 * @since 2.6.0
 */
public final class ConnectedAccountStatus {

    /** The account is connected and usable. */
    public static final ConnectedAccountStatus ACTIVE = new ConnectedAccountStatus("ACTIVE");
    /** The account's credentials expired; the user must reconnect. */
    public static final ConnectedAccountStatus EXPIRED = new ConnectedAccountStatus("EXPIRED");
    /** The account was created but the user has not authorized it yet. */
    public static final ConnectedAccountStatus PENDING_AUTH = new ConnectedAccountStatus("PENDING_AUTH");
    /** The user authorized the account; your app has not verified the user yet. */
    public static final ConnectedAccountStatus PENDING_VERIFICATION = new ConnectedAccountStatus("PENDING_VERIFICATION");
    /** The account was disconnected. */
    public static final ConnectedAccountStatus DISCONNECTED = new ConnectedAccountStatus("DISCONNECTED");

    /**
     * The statuses this SDK version knows, for use in {@code switch}.
     *
     * @since 2.6.0
     */
    public enum Known {
        /** See {@link ConnectedAccountStatus#ACTIVE}. */
        ACTIVE,
        /** See {@link ConnectedAccountStatus#EXPIRED}. */
        EXPIRED,
        /** See {@link ConnectedAccountStatus#PENDING_AUTH}. */
        PENDING_AUTH,
        /** See {@link ConnectedAccountStatus#PENDING_VERIFICATION}. */
        PENDING_VERIFICATION,
        /** See {@link ConnectedAccountStatus#DISCONNECTED}. */
        DISCONNECTED,
        /** A value this SDK version does not know; read {@link ConnectedAccountStatus#value()}. */
        _UNKNOWN
    }

    private final String value;

    private ConnectedAccountStatus(String value) {
        this.value = value;
    }

    /**
     * Returns the status for a raw value. Known values return the shared constant.
     *
     * @param value the raw value, for example {@code "ACTIVE"}
     * @return the status
     * @throws IllegalArgumentException if {@code value} is null
     */
    public static ConnectedAccountStatus of(String value) {
        if (value == null) {
            throw new IllegalArgumentException("value must not be null");
        }
        switch (value) {
            case "ACTIVE":
                return ACTIVE;
            case "EXPIRED":
                return EXPIRED;
            case "PENDING_AUTH":
                return PENDING_AUTH;
            case "PENDING_VERIFICATION":
                return PENDING_VERIFICATION;
            case "DISCONNECTED":
                return DISCONNECTED;
            default:
                return new ConnectedAccountStatus(value);
        }
    }

    /**
     * Returns the raw value.
     *
     * @return the value, never null
     */
    public String value() {
        return value;
    }

    /**
     * Returns the matching known status.
     *
     * @return the known status, or {@link Known#_UNKNOWN}
     */
    public Known known() {
        switch (value) {
            case "ACTIVE":
                return Known.ACTIVE;
            case "EXPIRED":
                return Known.EXPIRED;
            case "PENDING_AUTH":
                return Known.PENDING_AUTH;
            case "PENDING_VERIFICATION":
                return Known.PENDING_VERIFICATION;
            case "DISCONNECTED":
                return Known.DISCONNECTED;
            default:
                return Known._UNKNOWN;
        }
    }

    @Override
    public boolean equals(Object o) {
        return this == o || (o instanceof ConnectedAccountStatus && value.equals(((ConnectedAccountStatus) o).value));
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value;
    }
}
