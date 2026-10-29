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
import com.scalekit.grpc.scalekit.v1.errdetails.ErrorInfo;
import com.scalekit.grpc.scalekit.v1.errdetails.RequestInfo;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.protobuf.StatusProto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ErrorMapperTest {

    @AfterEach
    void clearInterrupt() {
        Thread.interrupted();
    }

    private static StatusRuntimeException withCode(Status.Code code, String errorCode) {
        com.google.rpc.Status.Builder status = com.google.rpc.Status.newBuilder().setCode(code.value()).setMessage("boom");
        if (errorCode != null) {
            status.addDetails(Any.pack(ErrorInfo.newBuilder().setErrorCode(errorCode)
                    .setRequestInfo(RequestInfo.newBuilder().setRequestId("req-1")).build()));
        }
        return StatusProto.toStatusRuntimeException(status.build());
    }

    @Test
    void everyGrpcCodeMapsToItsFamily() {
        Map<Status.Code, Class<? extends APIException>> expected = new EnumMap<>(Status.Code.class);
        expected.put(Status.Code.CANCELLED, ScalekitConnectionException.class);
        expected.put(Status.Code.UNKNOWN, InternalServerException.class);
        expected.put(Status.Code.INVALID_ARGUMENT, BadRequestException.class);
        expected.put(Status.Code.DEADLINE_EXCEEDED, ScalekitTimeoutException.class);
        expected.put(Status.Code.NOT_FOUND, NotFoundException.class);
        expected.put(Status.Code.ALREADY_EXISTS, ConflictException.class);
        expected.put(Status.Code.PERMISSION_DENIED, PermissionDeniedException.class);
        expected.put(Status.Code.RESOURCE_EXHAUSTED, RateLimitException.class);
        expected.put(Status.Code.FAILED_PRECONDITION, BadRequestException.class);
        expected.put(Status.Code.ABORTED, ConflictException.class);
        expected.put(Status.Code.OUT_OF_RANGE, BadRequestException.class);
        expected.put(Status.Code.UNIMPLEMENTED, InternalServerException.class);
        expected.put(Status.Code.INTERNAL, InternalServerException.class);
        expected.put(Status.Code.UNAVAILABLE, InternalServerException.class);
        expected.put(Status.Code.DATA_LOSS, InternalServerException.class);
        expected.put(Status.Code.UNAUTHENTICATED, AuthenticationException.class);

        for (Map.Entry<Status.Code, Class<? extends APIException>> entry : expected.entrySet()) {
            APIException mapped = ErrorMapper.map(withCode(entry.getKey(), "SOME_CODE"));
            assertEquals(entry.getValue(), mapped.getClass(), entry.getKey().toString());
            assertEquals(entry.getKey().value(), mapped.getGrpcStatusCode());
            assertEquals("SOME_CODE", mapped.getScalekitErrorCode());
            assertTrue(mapped.getCause() instanceof StatusRuntimeException);
            assertFalse(mapped.getMessage().contains("\n"), mapped.getMessage());
            assertTrue(mapped.getMessage().contains("(request-id: req-1)"), mapped.getMessage());
        }
    }

    @Test
    void toolErrorCodeSelectsTheToolFamilyForAnyStatus() {
        assertEquals(ToolException.class, ErrorMapper.map(withCode(Status.Code.INTERNAL, "TOOL_ERROR")).getClass());
        assertEquals(ToolException.class,
                ErrorMapper.map(withCode(Status.Code.FAILED_PRECONDITION, "TOOL_ERROR")).getClass());
    }

    @Test
    void failuresWithoutDetailsStillMap() {
        APIException mapped = ErrorMapper.map(Status.NOT_FOUND.withDescription("gone").asRuntimeException());
        assertTrue(mapped instanceof NotFoundException);
        assertEquals("UNKNOWN_EXCEPTION", mapped.getScalekitErrorCode());
        assertEquals("NOT_FOUND: gone", mapped.getMessage());
    }

    @Test
    void interruptCausedCancellationRestoresTheInterruptFlag() {
        StatusRuntimeException cancelled = Status.CANCELLED.withDescription("Thread interrupted")
                .withCause(new InterruptedException()).asRuntimeException();
        assertFalse(Thread.currentThread().isInterrupted());
        APIException mapped = ErrorMapper.map(cancelled);
        assertTrue(mapped instanceof ScalekitConnectionException);
        assertTrue(Thread.currentThread().isInterrupted());
    }

    @Test
    void credentialRefreshIsAnAllowList() {
        assertTrue(ErrorMapper.isClientCredentialFailure(withCode(Status.Code.UNAUTHENTICATED, null)));
        assertTrue(ErrorMapper.isClientCredentialFailure(withCode(Status.Code.UNAUTHENTICATED, "UNAUTHENTICATED")));
        assertFalse(ErrorMapper.isClientCredentialFailure(withCode(Status.Code.UNAUTHENTICATED, "TOOL_ERROR")));
        assertFalse(ErrorMapper.isClientCredentialFailure(withCode(Status.Code.UNAUTHENTICATED, "REAUTHENTICATION_NEEDED")));
        assertFalse(ErrorMapper.isClientCredentialFailure(withCode(Status.Code.UNAUTHENTICATED, "REFRESH_TOKEN_MISSING")));
        assertFalse(ErrorMapper.isClientCredentialFailure(withCode(Status.Code.PERMISSION_DENIED, null)));
    }

    @Test
    void legacyApiExceptionMessageIsUnchanged() {
        StatusRuntimeException e = withCode(Status.Code.NOT_FOUND, "X");
        APIException legacy = new APIException(e);
        assertTrue(legacy.getMessage().contains("error_code: \"X\""), "legacy message still appends ErrorInfo");
    }
}
