package com.scalekit.exceptions;

import com.google.protobuf.Any;
import com.google.rpc.Status;
import com.scalekit.grpc.scalekit.v1.errdetails.ErrorInfo;
import io.grpc.StatusRuntimeException;
import io.grpc.protobuf.StatusProto;
import lombok.Getter;

import java.util.logging.Logger;

public class APIException extends RuntimeException{

    // The value 2.5.0 computed by default; pinned so that adding members keeps serialized
    // exceptions compatible across versions.
    private static final long serialVersionUID = 6552959028139681125L;

    private static final Logger log = Logger.getLogger(APIException.class.getName());

    @Getter
    private final String scalekitErrorCode;
    private final String message;

    @Getter
    private final int grpcStatusCode;

    private final  ErrorInfo errorInfo;

    // True only for the status-family subclasses created through APIException(APIException):
    // their message is already a single line, so getMessage() must not append ErrorInfo.
    private final boolean compactMessage;

    public APIException(String errorCode, String message, int grpcStatusCode, ErrorInfo errorInfo) {
        super(message);
        this.scalekitErrorCode = errorCode;
        this.message = message;
        this.grpcStatusCode = grpcStatusCode;
        this.errorInfo = errorInfo;
        this.compactMessage = false;
    }

    public APIException(String message) {
        super(message);
        this.message = message;

        this.grpcStatusCode = 0;
        this.scalekitErrorCode = null;
        this.errorInfo = null;
        this.compactMessage = false;
    }

    public APIException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
        this.grpcStatusCode = 0;
        this.scalekitErrorCode = null;
        this.errorInfo = null;
        this.compactMessage = false;
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
        this.compactMessage = false;
    }

    /**
     * Copies a failure into a more specific subclass, keeping its status, error code, error
     * details and cause, with a one-line message.
     */
    APIException(APIException source) {
        super(compactMessageOf(source), source.getCause());
        this.message = compactMessageOf(source);
        this.grpcStatusCode = source.grpcStatusCode;
        this.scalekitErrorCode = source.scalekitErrorCode;
        this.errorInfo = source.errorInfo;
        this.compactMessage = true;
    }

    /** The unpacked error details, or null. For subclasses in this package. */
    ErrorInfo errorInfo() {
        return errorInfo;
    }

    private static String compactMessageOf(APIException source) {
        StringBuilder text = new StringBuilder(source.message == null ? "" : source.message);
        ErrorInfo info = source.errorInfo;
        if (info != null) {
            String code = info.getErrorCode();
            if (!code.isEmpty()) {
                text.append(" (error_code: ").append(code).append(')');
            }
            if (info.hasRequestInfo() && !info.getRequestInfo().getRequestId().isEmpty()) {
                text.append(" (request-id: ").append(info.getRequestInfo().getRequestId()).append(')');
            }
        }
        return text.toString();
    }

    public  String getMessage() {
        if (compactMessage) {
            return this.message;
        }
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
