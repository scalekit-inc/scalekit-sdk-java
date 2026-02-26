package com.scalekit.exceptions;

import com.google.protobuf.Any;
import com.google.rpc.Status;
import com.scalekit.grpc.scalekit.v1.errdetails.ErrorInfo;
import io.grpc.StatusRuntimeException;
import io.grpc.protobuf.StatusProto;
import lombok.Getter;

import java.util.logging.Logger;

public class APIException extends RuntimeException{

    private static final Logger log = Logger.getLogger(APIException.class.getName());

    @Getter
    private final String scalekitErrorCode;
    private final String message;

    @Getter
    private final int grpcStatusCode;

    private final  ErrorInfo errorInfo;

    public APIException(String errorCode, String message, int grpcStatusCode, ErrorInfo errorInfo) {
        super(message);
        this.scalekitErrorCode = errorCode;
        this.message = message;
        this.grpcStatusCode = grpcStatusCode;
        this.errorInfo = errorInfo;
    }

    public APIException(String message) {
        super(message);
        this.message = message;

        this.grpcStatusCode = 0;
        this.scalekitErrorCode = null;
        this.errorInfo = null;
    }

    public APIException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
        this.grpcsStatusCode = 0;
        this.scalekitErrorCode = null;
        this.errorInfo = null;
    }

    public APIException(StatusRuntimeException exception){
        super(exception);
        this.grpcStatusCode = exception.getStatus().getCode().value();
        this.message = exception.getMessage();
        this.errorInfo = getErrorInfo(exception);
        if (errorInfo != null){
            this.scalekitErrorCode = errorInfo.getErrorCode();
        }
        else {
            this.scalekitErrorCode = "UNKNOWN_EXCEPTION";
        }
    }

    public  String getMessage() {
        return errorInfo != null ? this.message +":"+this.errorInfo : this.message;
    }

    private ErrorInfo getErrorInfo(StatusRuntimeException exception) {
        Status status = StatusProto.fromThrowable(exception);
        if (status == null) {
            return null;
        }
        try {
            for (Any any : status.getDetailsList()) {
                if (any.is(ErrorInfo.class)) {
                    return any.unpack(ErrorInfo.class);
                }
            }
        } catch (Exception e) {
            log.warning("Failed to unpack error details from gRPC response: " + e.getMessage());
            return null;
        }
        return null;
    }
}
