package com.scalekit.internal;

import com.scalekit.api.AuthClient;
import io.grpc.CallCredentials;
import io.grpc.Metadata;
import io.grpc.Status;
import lombok.AccessLevel;
import lombok.Getter;

import java.time.Instant;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

@Getter
public class ScalekitCredentials extends CallCredentials {

    // AtomicReference, not a volatile field: applyRequestMetadata's first-use check ("no token
    // cached yet, fetch one") is a check-then-act sequence that concurrent callers can race on
    // cold start. compareAndSet makes the cache install atomic without putting a lock on the
    // hot path every RPC call goes through; updateCredentials()'s own synchronized block still
    // serializes *when* a refresh happens (the 5s debounce), and publishes through this same
    // reference.
    @Getter(AccessLevel.NONE)
    private final AtomicReference<String> token = new AtomicReference<>();
    private final AuthClient client;
    private Instant lastGenerated;

    public ScalekitCredentials(AuthClient client) {
        this.client = client;
    }

    public String getToken() {
        return token.get();
    }

    @Override
    public void applyRequestMetadata(RequestInfo requestInfo, Executor executor, MetadataApplier metadataApplier) {
        String currentToken = token.get();
        if (currentToken == null) {
            try {
                currentToken = client.getClientAccessToken();
            } catch (Exception e) {
                metadataApplier.fail(Status.UNAUTHENTICATED.withCause(e));
                return;
            }
            // Whichever concurrent caller's fetch wins the race is what gets cached; every
            // caller still applies the token it fetched itself, so no request is blocked or
            // starved by losing the race.
            token.compareAndSet(null, currentToken);
        }
        String headerToken = currentToken;
        executor.execute(() -> {
            try {
                Metadata headers = new Metadata();
                headers.put(Constants.AUTHORIZATION_METADATA_KEY, String.format("%s %s", Constants.BEARER_TYPE, headerToken));
                metadataApplier.apply(headers);
            } catch (Throwable e) {
                metadataApplier.fail(Status.UNAUTHENTICATED.withCause(e));
            }
        });
    }

    public synchronized void updateCredentials() {
        try {
            if (lastGenerated==null || Instant.now().isAfter(lastGenerated.plusSeconds(5))) {
                token.set(client.getClientAccessToken());
                this.lastGenerated = Instant.now();
            }

        } catch (Exception e) {
            this.lastGenerated = null;
            throw new RuntimeException("error getting access token", e);
        }
    }
}
