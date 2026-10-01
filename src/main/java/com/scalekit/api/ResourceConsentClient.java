package com.scalekit.api;

/**
 * @deprecated Use {@link ResourcesClient} instead. This interface named every
 * method after "consent" even though most of them manage resources and
 * resource clients, not consents. Kept only for binary compatibility; will be
 * removed in 3.0.
 */
@Deprecated
public interface ResourceConsentClient extends ResourcesClient {
}
