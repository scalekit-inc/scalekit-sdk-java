package com.scalekit;

import com.scalekit.api.*;
import com.scalekit.api.impl.*;
import com.scalekit.exceptions.APIException;
import com.scalekit.internal.ScalekitCredentials;
import com.scalekit.webhooks.ScalekitWebhook;
import com.scalekit.webhooks.Webhook;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static com.scalekit.internal.Constants.*;

public class ScalekitClient {
    private final OrganizationClient organizationClient;

    private final DomainClient domainClient;

    private final ConnectionClient connectionClient;

    private final ScalekitAuthClient authenticationClient;

    private final DirectoryClient directoryClient ;

    private final UserClient userClient;

    private final PasswordlessClient passwordlessClient;

    private final RoleClient roleClient;

    private final PermissionClient permissionClient;
    private final Webhook webhook;

    private final SessionClient sessionClient;

    private final WebAuthnClient webAuthnClient;

    private final TokenClient tokenClient;

    private final M2MClient m2mClient;

    private final ResourceConsentClient resourceConsentClient;

    private final EventsClient eventsClient;

    private final LoginClient loginClient;

    /** Default: how often an idle gRPC connection is verified before reuse. */
    public static final long DEFAULT_KEEPALIVE_TIME_SECONDS = 60;

    /** Default: how long to wait for a keepalive response before treating an idle connection as dead. */
    public static final long DEFAULT_KEEPALIVE_TIMEOUT_SECONDS = 10;

    /**
     * Minimum allowed {@code keepAliveTimeSeconds}, short of passing {@code 0} to disable
     * keepalive entirely. The backend's gRPC {@code EnforcementPolicy.MinTime} is 30s - anything
     * under that is flagged as a ping-abuse strike, and enough strikes get the connection
     * GOAWAY'd (ENHANCE_YOUR_CALM), aborting whatever call was in flight. 60s keeps meaningful
     * headroom above that floor rather than sitting right on top of it.
     */
    public static final long MIN_KEEPALIVE_TIME_SECONDS = 60;

    /**
     * How long, with zero active RPCs, before the client proactively idles the channel and
     * reconnects on the next call, rather than racing a new call against the backend's own
     * MaxConnectionIdle (5 minutes, see escalekit/scalekit/cmd/grpc.go) - the same shape as the
     * Node SDK's idleConnectionTimeoutMs. This is independent of {@code keepAliveTimeSeconds}:
     * proactive idle-eviction and ping-based liveness checking are separate concerns, so it
     * applies even when keepalive pings are disabled ({@code keepAliveTimeSeconds == 0}) - a
     * connection that's dead can still be silently stale whether or not anything was pinging it.
     * Also why {@code keepAliveTimeSeconds} is capped at this value below: a ping interval longer
     * than this would never get a chance to fire before the channel idles itself out first.
     */
    public static final long IDLE_TIMEOUT_SECONDS = 240;

    public ScalekitClient(String siteName, String clientId, String clientSecret) {
        this(siteName, clientId, clientSecret, DEFAULT_KEEPALIVE_TIME_SECONDS, DEFAULT_KEEPALIVE_TIMEOUT_SECONDS);
    }

    /**
     * @param keepAliveTimeSeconds    How often, in seconds, an idle gRPC connection is
     *                                verified before reuse. Must be {@code 0} (disables
     *                                keepalive pings entirely - idle-eviction still applies,
     *                                see {@link #IDLE_TIMEOUT_SECONDS}) or between
     *                                {@code MIN_KEEPALIVE_TIME_SECONDS} and
     *                                {@code IDLE_TIMEOUT_SECONDS} inclusive - see those
     *                                constants' javadoc for why. Defaults to 60.
     * @param keepAliveTimeoutSeconds How long, in seconds, to wait for a keepalive
     *                                response before treating an idle connection as
     *                                dead. Defaults to 10.
     */
    public ScalekitClient(
            String siteName,
            String clientId,
            String clientSecret,
            long keepAliveTimeSeconds,
            long keepAliveTimeoutSeconds
    ) {
        if (keepAliveTimeSeconds != 0
                && (keepAliveTimeSeconds < MIN_KEEPALIVE_TIME_SECONDS || keepAliveTimeSeconds > IDLE_TIMEOUT_SECONDS)) {
            throw new IllegalArgumentException(
                    "keepAliveTimeSeconds must be 0 (disabled) or between " + MIN_KEEPALIVE_TIME_SECONDS
                            + " and " + IDLE_TIMEOUT_SECONDS + " seconds, got " + keepAliveTimeSeconds
                            + ". Below " + MIN_KEEPALIVE_TIME_SECONDS
                            + "s risks the connection being GOAWAY'd (ENHANCE_YOUR_CALM) against the "
                            + "backend's 30s ping-abuse MinTime; above " + IDLE_TIMEOUT_SECONDS
                            + "s, the channel's own idle-eviction (see IDLE_TIMEOUT_SECONDS) would close "
                            + "the connection before a single ping at that cadence ever got to fire.");
        }
        // Only meaningful (and only validated) when keepalive is actually enabled - a disabled
        // keepAliveTimeSeconds=0 never reads this value at all (see the channelBuilder branch below).
        if (keepAliveTimeSeconds != 0 && keepAliveTimeoutSeconds <= 0) {
            throw new IllegalArgumentException(
                    "keepAliveTimeoutSeconds must be positive when keepalive is enabled, got " + keepAliveTimeoutSeconds);
        }

        // KNOWN LIMITATION (pre-existing, not introduced here): Environment.defaultEnv is a
        // process-wide static singleton, so this overwrites it for every already-constructed
        // ScalekitClient too - constructing a second client with different credentials mutates
        // the first one's siteName/clientId/clientSecret/timeout out from under it, and two
        // client instances in the same JVM can't hold independent per-call timeouts (unlike
        // keepAliveTimeSeconds/keepAliveTimeoutSeconds above, which are genuinely per-instance
        // via the constructor). Worth fixing (making Environment instance-scoped) before more
        // per-client configuration accumulates on top of this, but out of scope for this change.
        Environment.configure(siteName,clientId,clientSecret);
        Environment environment = Environment.defaultConfig();


        authenticationClient = new ScalekitAuthClient();
        ScalekitCredentials credentials = new ScalekitCredentials(authenticationClient);
        try {
            URL url = URI.create(environment.siteName).toURL();
            int port = url.getPort() != -1 ? url.getPort() : 443;
            // Managed channel automatically handles channel closing.
            // idleTimeout is unconditional - independent of keepAliveTimeSeconds, including when
            // keepalive pings are disabled (0) - see IDLE_TIMEOUT_SECONDS's javadoc for why.
            ManagedChannelBuilder<?> channelBuilder = ManagedChannelBuilder.forAddress(url.getHost(), port)
                    .userAgent("scalekit-sdk-java/" + version)
                    .idleTimeout(IDLE_TIMEOUT_SECONDS, TimeUnit.SECONDS);
            if (keepAliveTimeSeconds > 0) {
                // keepAliveWithoutCalls(true) so an idle channel is still periodically
                // verified: without it, keepalive pings only fire while a call is active,
                // so a connection silently dropped by a network intermediary while idle
                // isn't detected until the next real call is written to it. keepAliveTimeSeconds
                // == 0 skips all of this, leaving the channel on grpc-java's own default
                // (keepalive disabled) instead of pinging at some other, unvalidated interval.
                channelBuilder.keepAliveTime(keepAliveTimeSeconds, TimeUnit.SECONDS)
                        .keepAliveTimeout(keepAliveTimeoutSeconds, TimeUnit.SECONDS)
                        .keepAliveWithoutCalls(true);
            }
            ManagedChannel channel = channelBuilder.build();

            // Initialize all clients
            organizationClient = new ScalekitOrganizationClient(channel, credentials);
            domainClient = new ScalekitDomainClient(channel, credentials);
            connectionClient = new ScalekitConnectionClient(channel, credentials);
            directoryClient = new ScalekitDirectoryClient(channel, credentials);
            userClient = new ScalekitUserClient(channel, credentials);
            passwordlessClient = new ScalekitPasswordlessClient(channel, credentials);
            roleClient = new ScalekitRoleClient(channel, credentials);
            permissionClient = new ScalekitPermissionClient(channel, credentials);
            sessionClient = new ScalekitSessionClient(channel, credentials);
            webAuthnClient = new ScalekitWebAuthnClient(channel, credentials);
            tokenClient = new ScalekitTokenClient(channel, credentials);
            m2mClient = new ScalekitM2MClient(channel, credentials);
            resourceConsentClient = new ScalekitResourceConsentClient(channel, credentials);
            eventsClient = new ScalekitEventsClient(channel, credentials);
            loginClient = new ScalekitLoginClient(channel, credentials);
            webhook = new ScalekitWebhook();

        } catch (MalformedURLException e) {
            throw new APIException("invalid environment URL, error:" + e.getMessage());
        }



    }

    public OrganizationClient organizations() {
        return this.organizationClient;
    }

    public DomainClient domains() {
        return this.domainClient;
    }

    public ConnectionClient connections() {
        return this.connectionClient;
    }

    public AuthClient authentication() {
        return this.authenticationClient;
    }

    public Webhook webhook() {
        return this.webhook;
    }

    public DirectoryClient directories() {
        return this.directoryClient;
    }

    public UserClient users() {
        return this.userClient;
    }

    public PasswordlessClient passwordless() {
        return this.passwordlessClient;
    }

    public RoleClient roles() {
        return this.roleClient;
    }

    public PermissionClient permissions() {
        return this.permissionClient;
    }

    public SessionClient sessions() {
        return this.sessionClient;
    }

    public WebAuthnClient webAuthn() {
        return this.webAuthnClient;
    }

    public TokenClient tokens() {
        return this.tokenClient;
    }

    public M2MClient m2m() {
        return this.m2mClient;
    }

    public ResourceConsentClient resources() {
        return this.resourceConsentClient;
    }

    public EventsClient events() {
        return this.eventsClient;
    }

    public LoginClient login() {
        return this.loginClient;
    }
}
