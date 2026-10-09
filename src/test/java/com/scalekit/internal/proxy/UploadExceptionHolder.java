package com.scalekit.internal.proxy;

import com.scalekit.exceptions.UploadException;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/** Assertion helper for upload tests. */
final class UploadExceptionHolder {

    private UploadExceptionHolder() {
    }

    static UploadException assertUploadException(int status, Executable upload) {
        UploadException e = assertThrows(UploadException.class, upload);
        assertEquals(status, e.statusCode());
        return e;
    }
}
