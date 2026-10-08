package com.scalekit.internal.proxy;

/** Resumable uploads over the HttpURLConnection transport, used on Java 8 and where java.net.http is missing. */
class UrlConnectionResumableUploadTest extends ResumableUploaderContract {

    @Override
    HttpTransport newTransport() {
        return new UrlConnectionTransport();
    }
}
