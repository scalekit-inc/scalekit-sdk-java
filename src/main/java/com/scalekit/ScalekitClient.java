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

    public ScalekitClient(String siteName, String clientId, String clientSecret) {
        this(siteName, clientId, clientSecret, DEFAULT_KEEPALIVE_TIME_SECONDS, DEFAULT_KEEPALIVE_TIMEOUT_SECONDS);
    }

    /**
     * @param keepAliveTimeSeconds    How often, in seconds, an idle gRPC connection is
     *                                verified before reuse. Must be {@code 0} (disables
     *                                keepalive entirely) or {@code >= MIN_KEEPALIVE_TIME_SECONDS}
     *                                - see that constant's javadoc for why. Defaults to 60.
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
        if (keepAliveTimeSeconds != 0 && keepAliveTimeSeconds < MIN_KEEPALIVE_TIME_SECONDS) {
            throw new IllegalArgumentException(
                    "keepAliveTimeSeconds must be 0 (disabled) or >= " + MIN_KEEPALIVE_TIME_SECONDS
                            + " seconds, got " + keepAliveTimeSeconds
                            + ". The backend's gRPC keepalive MinTime is 30s; pinging faster than "
                            + "that risks the connection being GOAWAY'd (ENHANCE_YOUR_CALM) after "
                            + "repeated strikes, aborting whatever call was in flight.");
        }

        Environment.configure(siteName,clientId,clientSecret);
        Environment environment = Environment.defaultConfig();


        authenticationClient = new ScalekitAuthClient();
        ScalekitCredentials credentials = new ScalekitCredentials(authenticationClient);
        try {
            URL url = URI.create(environment.siteName).toURL();
            int port = url.getPort() != -1 ? url.getPort() : 443;
            // Managed channel automatically handles channel closing
            ManagedChannelBuilder<?> channelBuilder = ManagedChannelBuilder.forAddress(url.getHost(), port)
                    .userAgent("scalekit-sdk-java/" + version);
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

                // The backend closes a connection with zero active RPCs after its own
                // MaxConnectionIdle (5 minutes, see escalekit/scalekit/cmd/grpc.go). Idling the
                // channel client-side first - well before that - means the *client* always
                // initiates the next reconnect on its own terms, instead of racing a new call
                // against the server's GOAWAY for the same connection. Derived from
                // keepAliveTimeSeconds (same shape as the Node SDK's idleConnectionTimeoutMs),
                // capped at 240s to stay safely under the server's 300s bound with margin.
                long idleTimeoutSeconds = Math.min(240, keepAliveTimeSeconds * 5);
                channelBuilder.idleTimeout(idleTimeoutSeconds, TimeUnit.SECONDS);
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
            eventsClient = new ScalekitEventsClient(channel, credentials);
            loginClient = new ScalekitLoginClient(channel, credentials);
            webhook = new ScalekitWebhook();

        } catch (MalformedURLException e) {
            throw new APIException("invalid environment URL, error:" + e.getMessage());
        }



    }

    /**
     * Overrides the per-call deadline for calls made on the current thread until the returned
     * scope is closed, instead of the client-wide default ({@code Environment.defaultConfig().timeout},
     * itself defaulting to 10s or the {@code SCALEKIT_REQUEST_TIMEOUT} env var). Use for a call
     * that legitimately needs longer (or a tighter budget than the default):
     * <pre>{@code
     * try (var scope = scalekitClient.withTimeout(5, TimeUnit.SECONDS)) {
     *     scalekitClient.organizations().getById("org_123");
     * }
     * }</pre>
     * Scoped per-thread - see {@link com.scalekit.internal.CallTimeout} for propagation caveats.
     */
    public com.scalekit.internal.CallTimeout.Scope withTimeout(long timeout, TimeUnit unit) {
        return com.scalekit.internal.CallTimeout.override(unit.toMillis(timeout));
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

    public EventsClient events() {
        return this.eventsClient;
    }

    public LoginClient login() {
        return this.loginClient;
    }
}
