package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.internal.MethodRetryPolicies;
import com.scalekit.internal.Preconditions;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.MethodDescriptor;

import java.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/** Runs AgentKit RPCs through the retry executor with the policy from the method table. */
final class AgentKitCalls {

    private AgentKitCalls() {
    }

    static <T> T call(MethodDescriptor<?, ?> method, ScalekitCredentials credentials, Callable<T> callable) {
        return RetryExecuter.executeWithRetry(callable, credentials, MethodRetryPolicies.of(method));
    }

    /** The per-attempt deadline of control-plane calls, in milliseconds. */
    static long controlPlaneTimeoutMillis() {
        return Environment.defaultConfig().timeout;
    }

    static long nanos(Duration timeout) {
        return Preconditions.saturatedNanos(timeout);
    }

    static final TimeUnit MILLIS = TimeUnit.MILLISECONDS;
    static final TimeUnit NANOS = TimeUnit.NANOSECONDS;
}
