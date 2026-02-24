package com.scalekit.exceptions;

import com.google.protobuf.Any;
import com.google.rpc.Status;
import com.scalekit.grpc.scalekit.v1.errdetails.ErrorInfo;
import io.grpc.StatusRuntimeException;
import io.grpc.protobuf.StatusProto;
import lombok.Getter;

public class APIException extends RuntimeException{

    @Getter
    final String scalekitErrorCode;
    final String message;

    final int grpcsStatusCode;

    private final  ErrorInfo errorInfo;

    public APIException(String errorCode, String message, int grpcsStatusCode, ErrorInfo errorInfo) {
        super(message);
        this.scalekitErrorCode = errorCode;
        this.message = message;
        this.grpcsStatusCode = grpcsStatusCode;
        this.errorInfo = errorInfo;
    }

    public APIException(String message) {
        super(message);
        this.message = message;

        this.grpcsStatusCode = 0;
        this.scalekitErrorCode = null;
        this.errorInfo = null;
    }

    public APIException(StatusRuntimeException exception){
        super(exception);
        this.grpcsStatusCode = exception.getStatus().getCode().value();
        this.message = exception.getMessage();
        this.errorInfo = getErrorInfo(exception);
        if (errorInfo != null){
            this.scalekitErrorCode = errorInfo.getErrorCode();
        }
        else {
            this.scalekitErrorCode = "UNKNOWN_EXCEPTION";
        }
    }

    public int getGrpcsStatusCode() {
        return grpcsStatusCode;
    }

    public  String getMessage() {
        return errorInfo != null ? this.message +":"+this.errorInfo : this.message;
    }

    private ErrorInfo getErrorInfo(StatusRuntimeException exception) {
        ErrorInfo errorInfo = null;

        Status status = StatusProto.fromThrowable(exception);
        try {
            for (Any any : status.getDetailsList()) {
                if (any.is(ErrorInfo.class)) {
                    errorInfo = any.unpack(ErrorInfo.class);
                }
            }
        }
        catch (Exception e){
            throw new RuntimeException("Error when parsing the error response. Probably not Scalekit's error response.", e);
        }

       return errorInfo;
    }
}
