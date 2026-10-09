package com.scalekit.internal.proxy;

import com.scalekit.models.proxy.ResumableUploadRequest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

/** The internal accessor for upload content is installed once, by ResumableUploadRequest only. */
class UploadContentAccessTest {

    private static ResumableUploadRequest request() {
        return ResumableUploadRequest.builder("c", "u", "/p").content(new byte[]{7, 8}).build();
    }

    @Test
    void theRequestInstallsTheAccessorAndTheUploaderCanOpenContent() throws IOException {
        try (InputStream in = UploadContentAccess.openContent(request())) {
            assertEquals(7, in.read());
            assertEquals(8, in.read());
            assertEquals(-1, in.read());
        }
    }

    @Test
    void anyOtherInstallFailsClearly() {
        request();
        UploadContentAccess outsider = new UploadContentAccess() {
            @Override
            protected InputStream open(ResumableUploadRequest request) {
                throw new AssertionError("never used");
            }
        };
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> UploadContentAccess.install(outsider));
        assertTrue(e.getMessage().contains("only by ResumableUploadRequest"), e.getMessage());
        assertThrows(IllegalArgumentException.class, () -> UploadContentAccess.install(null));
    }
}
