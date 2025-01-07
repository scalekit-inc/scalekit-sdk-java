package com.scalekit.internal;

import com.scalekit.api.AuthClient;
import io.grpc.CallCredentials;
import io.grpc.Metadata;
import io.grpc.Status;
import lombok.Getter;

import java.time.Instant;
import java.util.concurrent.Executor;

@Getter
public class ScalekitCredentials extends CallCredentials {

    private  String token;
    private final AuthClient client;
    private Instant lastGenerated;

    public ScalekitCredentials(AuthClient client) {
        this.client = client;
    }

    @Override
    public void applyRequestMetadata(RequestInfo requestInfo, Executor executor, MetadataApplier metadataApplier) {
        if (this.token == null) {
            try {
                this.token = client.getClientAccessToken();
            } catch (Exception e) {
                metadataApplier.fail(Status.UNAUTHENTICATED.withCause(e));
                return;
            }
        }
        executor.execute(() -> {
            try {
                Metadata headers = new Metadata();
                headers.put(Constants.AUTHORIZATION_METADATA_KEY, String.format("%s %s", Constants.BEARER_TYPE, token));
                metadataApplier.apply(headers);
            } catch (Throwable e) {
                metadataApplier.fail(Status.UNAUTHENTICATED.withCause(e));
            }
        });
    }

    public synchronized void updateCredentials() {
        try {
            if (lastGenerated==null || Instant.now().isAfter(lastGenerated.plusSeconds(5))) {
                this.token = client.getClientAccessToken();
                this.lastGenerated = Instant.now();
            }

        } catch (Exception e) {
            this.lastGenerated = null;
            throw new RuntimeException("error getting access token", e);
        }
    }
}
