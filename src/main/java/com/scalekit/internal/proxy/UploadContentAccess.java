package com.scalekit.internal.proxy;

import com.scalekit.models.proxy.ResumableUploadRequest;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Lets the uploader open a {@link ResumableUploadRequest}'s content, which the request keeps
 * package-private so that it is not public API. {@code ResumableUploadRequest} installs the only
 * implementation from its static initializer; no reflection is involved. Not part of the public
 * API: it may change or disappear in any release.
 */
public abstract class UploadContentAccess {

    private static final AtomicReference<UploadContentAccess> INSTALLED = new AtomicReference<>();

    /** For {@code ResumableUploadRequest}'s static initializer only. */
    protected UploadContentAccess() {
    }

    /**
     * Opens the request's content. The caller closes the stream.
     *
     * @param request the request
     * @return the content stream
     */
    protected abstract InputStream open(ResumableUploadRequest request);

    /**
     * Installs the accessor. Only {@code ResumableUploadRequest}'s static initializer calls it.
     *
     * @param access an accessor declared inside {@code ResumableUploadRequest}
     * @throws IllegalArgumentException if {@code access} is null or not declared inside
     *                                  {@code ResumableUploadRequest}
     * @throws IllegalStateException    if an accessor is already installed
     */
    public static void install(UploadContentAccess access) {
        if (access == null || access.getClass().getEnclosingClass() != ResumableUploadRequest.class) {
            throw new IllegalArgumentException("UploadContentAccess is installed only by ResumableUploadRequest");
        }
        if (!INSTALLED.compareAndSet(null, access)) {
            throw new IllegalStateException("UploadContentAccess is already installed");
        }
    }

    /** Opens the request's content through the installed accessor. */
    static InputStream openContent(ResumableUploadRequest request) {
        // Holding an instance means ResumableUploadRequest is initialized, so the accessor is installed.
        UploadContentAccess access = INSTALLED.get();
        if (access == null) {
            throw new IllegalStateException("ResumableUploadRequest did not install its content accessor");
        }
        return access.open(request);
    }
}
