package com.scalekit.internal;

import com.google.protobuf.Any;
import com.scalekit.exceptions.APIException;
import com.scalekit.exceptions.AuthenticationException;
import com.scalekit.exceptions.BadRequestException;
import com.scalekit.exceptions.ConflictException;
import com.scalekit.exceptions.InternalServerException;
import com.scalekit.exceptions.NotFoundException;
import com.scalekit.exceptions.PermissionDeniedException;
import com.scalekit.exceptions.RateLimitException;
import com.scalekit.exceptions.ScalekitConnectionException;
import com.scalekit.exceptions.ScalekitTimeoutException;
import com.scalekit.exceptions.ToolException;
import com.scalekit.exceptions.ToolForbiddenException;
import com.scalekit.exceptions.ToolRateLimitException;
import com.scalekit.exceptions.ToolUnauthorizedException;
import com.scalekit.grpc.scalekit.v1.errdetails.ErrorInfo;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.protobuf.StatusProto;

/**
 * Maps gRPC failures to the status-family exceptions. The gRPC status decides the class; the
 * Scalekit error code only separates tool failures ({@code TOOL_ERROR}) from the rest, because
 * handlers may report a wrapped failure with a generic code while keeping its status. Not part of
 * the public API.
 */
public final class ErrorMapper {

    /** Scalekit error code of a failure raised by a tool run. */
    public static final String TOOL_ERROR = "TOOL_ERROR";

    private ErrorMapper() {
    }

    /**
     * Returns the Scalekit error code carried in the status details.
     *
     * @param e the gRPC failure
     * @return the code, or null when the failure carries none
     */
    public static String errorCode(StatusRuntimeException e) {
        com.google.rpc.Status status = StatusProto.fromThrowable(e);
        if (status == null) {
            return null;
        }
        for (Any detail : status.getDetailsList()) {
            if (detail.is(ErrorInfo.class)) {
                try {
                    String code = detail.unpack(ErrorInfo.class).getErrorCode();
                    return code.isEmpty() ? null : code;
                } catch (Exception malformed) {
                    return null;
                }
            }
        }
        return null;
    }

    /**
     * Returns whether an UNAUTHENTICATED failure means the SDK's own credentials were rejected,
     * which a token refresh can fix. Connected-account and tool failures also use
     * UNAUTHENTICATED but carry another error code; refreshing does not help them.
     *
     * @param e the gRPC failure
     * @return true when a refresh and retry is appropriate
     */
    public static boolean isClientCredentialFailure(StatusRuntimeException e) {
        if (e.getStatus().getCode() != Status.Code.UNAUTHENTICATED) {
            return false;
        }
        String code = errorCode(e);
        return code == null || "UNAUTHENTICATED".equals(code);
    }

    /**
     * Converts a gRPC failure to the matching exception.
     *
     * @param e the gRPC failure
     * @return the exception to throw
     */
    public static APIException map(StatusRuntimeException e) {
        APIException source = new APIException(e);
        Status.Code code = e.getStatus().getCode();
        if (TOOL_ERROR.equals(errorCode(e))) {
            switch (code) {
                case UNAUTHENTICATED:
                    return new ToolUnauthorizedException(source);
                case PERMISSION_DENIED:
                    return new ToolForbiddenException(source);
                case RESOURCE_EXHAUSTED:
                    return new ToolRateLimitException(source);
                default:
                    return new ToolException(source);
            }
        }
        switch (code) {
            case INVALID_ARGUMENT:
            case FAILED_PRECONDITION:
            case OUT_OF_RANGE:
                return new BadRequestException(source);
            case NOT_FOUND:
                return new NotFoundException(source);
            case PERMISSION_DENIED:
                return new PermissionDeniedException(source);
            case ALREADY_EXISTS:
            case ABORTED:
                return new ConflictException(source);
            case RESOURCE_EXHAUSTED:
                return new RateLimitException(source);
            case UNAUTHENTICATED:
                return new AuthenticationException(source);
            case DEADLINE_EXCEEDED:
                return new ScalekitTimeoutException(source);
            case CANCELLED:
                if (hasInterruptedCause(e)) {
                    Thread.currentThread().interrupt();
                }
                return new ScalekitConnectionException(source);
            case INTERNAL:
            case UNKNOWN:
            case DATA_LOSS:
            case UNIMPLEMENTED:
            case UNAVAILABLE:
            default:
                return new InternalServerException(source);
        }
    }

    private static boolean hasInterruptedCause(Throwable e) {
        for (Throwable cause = e; cause != null; cause = cause.getCause()) {
            if (cause instanceof InterruptedException) {
                return true;
            }
            if (cause.getCause() == cause) {
                break;
            }
        }
        return false;
    }
}
