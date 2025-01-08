package com.scalekit.internal;

import com.scalekit.exceptions.APIException;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.Callable;

public class RetryExecuter {

    public static  <T> T executeWithRetry(Callable<T> callable, ScalekitCredentials credentials) {
        try {
            return callable.call();
        } catch (StatusRuntimeException e) {
            if (e.getStatus().getCode() == Status.Code.UNAUTHENTICATED) {
                credentials.updateCredentials();
                try {
                    return callable.call();
                } catch (Exception ex) {
                    throw new APIException(ex.getMessage());
                }
            } else {
                throw new APIException(e);
            }
        } catch (Exception e) {
            throw new APIException(e.getMessage());
        }
    }
}
