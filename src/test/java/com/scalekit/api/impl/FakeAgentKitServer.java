package com.scalekit.api.impl;

import com.google.protobuf.Any;
import com.google.protobuf.Message;
import com.scalekit.Environment;
import com.scalekit.api.AuthClient;
import com.scalekit.grpc.scalekit.v1.connected_accounts.*;
import com.scalekit.grpc.scalekit.v1.errdetails.ErrorInfo;
import com.scalekit.grpc.scalekit.v1.errdetails.ToolErrorInfo;
import com.scalekit.grpc.scalekit.v1.mcp.*;
import com.scalekit.grpc.scalekit.v1.providers.*;
import com.scalekit.grpc.scalekit.v1.tools.*;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ClientInterceptors;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.MethodDescriptor;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.protobuf.StatusProto;
import io.grpc.stub.StreamObserver;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

import static org.mockito.Mockito.when;

/**
 * An in-JVM gRPC server for the AgentKit services. Each RPC replies with the next scripted
 * response or error, or with an empty response when nothing is scripted; requests, call counts and
 * per-call deadlines are recorded.
 */
final class FakeAgentKitServer implements AutoCloseable {

    /** A scripted reply that waits before answering. */
    static final class Delay {
        final long millis;
        final Object then;

        Delay(long millis, Object then) {
            this.millis = millis;
            this.then = then;
        }
    }

    private final Map<String, Deque<Object>> scripts = new ConcurrentHashMap<>();
    private final Map<String, List<Object>> requests = new ConcurrentHashMap<>();
    private final Map<String, List<Long>> deadlinesNanos = new ConcurrentHashMap<>();

    final Server server;
    final ManagedChannel managedChannel;
    final Channel channel;
    final AuthClient authClient;
    final ScalekitCredentials credentials;

    FakeAgentKitServer() throws IOException {
        Environment.configure("https://test.scalekit.local", "test-client-id", "test-client-secret");
        server = ServerBuilder.forPort(0)
                .addService(new Tools())
                .addService(new Accounts())
                .addService(new Mcp())
                .addService(new Providers())
                .build()
                .start();
        managedChannel = ManagedChannelBuilder.forAddress("localhost", server.getPort()).usePlaintext().build();
        channel = ClientInterceptors.intercept(managedChannel, new ClientInterceptor() {
            @Override
            public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
                                                                       CallOptions callOptions, Channel next) {
                if (callOptions.getDeadline() != null) {
                    record(deadlinesNanos, method.getBareMethodName(),
                            callOptions.getDeadline().timeRemaining(TimeUnit.NANOSECONDS));
                }
                return next.newCall(method, callOptions);
            }
        });
        authClient = Mockito.mock(AuthClient.class);
        when(authClient.getClientAccessToken()).thenReturn("token-1", "token-2", "token-3", "token-4");
        credentials = new ScalekitCredentials(authClient);
    }

    void enqueue(String method, Object... replies) {
        Deque<Object> queue = scripts.computeIfAbsent(method, k -> new ArrayDeque<>());
        synchronized (queue) {
            Collections.addAll(queue, replies);
        }
    }

    @SuppressWarnings("unchecked")
    <T> List<T> requests(String method) {
        List<Object> list = requests.get(method);
        return list == null ? Collections.<T>emptyList() : (List<T>) new ArrayList<>(list);
    }

    <T> T lastRequest(String method) {
        List<T> list = requests(method);
        if (list.isEmpty()) {
            throw new AssertionError("no " + method + " request");
        }
        return list.get(list.size() - 1);
    }

    int calls(String method) {
        return requests(method).size();
    }

    int totalCalls() {
        int total = 0;
        for (List<Object> list : requests.values()) {
            total += list.size();
        }
        return total;
    }

    List<Long> deadlines(String method) {
        List<Long> list = deadlinesNanos.get(method);
        return list == null ? Collections.<Long>emptyList() : new ArrayList<>(list);
    }

    static StatusRuntimeException error(Status.Code code, String errorCode) {
        return error(code, errorCode, null);
    }

    static StatusRuntimeException error(Status.Code code, String errorCode, ToolErrorInfo toolErrorInfo) {
        com.google.rpc.Status.Builder status = com.google.rpc.Status.newBuilder()
                .setCode(code.value())
                .setMessage("fake " + code);
        if (errorCode != null) {
            ErrorInfo.Builder info = ErrorInfo.newBuilder().setErrorCode(errorCode);
            if (toolErrorInfo != null) {
                info.setToolErrorInfo(toolErrorInfo);
            }
            status.addDetails(Any.pack(info.build()));
        }
        return StatusProto.toStatusRuntimeException(status.build());
    }

    @Override
    public void close() throws InterruptedException {
        managedChannel.shutdownNow();
        managedChannel.awaitTermination(5, TimeUnit.SECONDS);
        server.shutdownNow();
        server.awaitTermination(5, TimeUnit.SECONDS);
    }

    private static <V> void record(Map<String, List<V>> map, String key, V value) {
        map.computeIfAbsent(key, k -> Collections.synchronizedList(new ArrayList<V>())).add(value);
    }

    @SuppressWarnings("unchecked")
    private <R extends Message> void handle(String method, Object request, StreamObserver<R> observer, R empty) {
        record(requests, method, request);
        Object reply = null;
        Deque<Object> queue = scripts.get(method);
        if (queue != null) {
            synchronized (queue) {
                reply = queue.poll();
            }
        }
        if (reply instanceof Delay) {
            try {
                Thread.sleep(((Delay) reply).millis);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            reply = ((Delay) reply).then;
        }
        if (reply instanceof StatusRuntimeException) {
            observer.onError((StatusRuntimeException) reply);
            return;
        }
        observer.onNext(reply == null ? empty : (R) reply);
        observer.onCompleted();
    }

    private final class Tools extends ToolServiceGrpc.ToolServiceImplBase {
        @Override
        public void listTools(ListToolsRequest request, StreamObserver<ListToolsResponse> observer) {
            handle("ListTools", request, observer, ListToolsResponse.getDefaultInstance());
        }

        @Override
        public void executeTool(ExecuteToolRequest request, StreamObserver<ExecuteToolResponse> observer) {
            handle("ExecuteTool", request, observer, ExecuteToolResponse.getDefaultInstance());
        }
    }

    private final class Accounts extends ConnectedAccountServiceGrpc.ConnectedAccountServiceImplBase {
        @Override
        public void listConnectedAccounts(ListConnectedAccountsRequest request,
                                          StreamObserver<ListConnectedAccountsResponse> observer) {
            handle("ListConnectedAccounts", request, observer, ListConnectedAccountsResponse.getDefaultInstance());
        }

        @Override
        public void createConnectedAccount(CreateConnectedAccountRequest request,
                                           StreamObserver<CreateConnectedAccountResponse> observer) {
            handle("CreateConnectedAccount", request, observer, CreateConnectedAccountResponse.getDefaultInstance());
        }

        @Override
        public void updateConnectedAccount(UpdateConnectedAccountRequest request,
                                           StreamObserver<UpdateConnectedAccountResponse> observer) {
            handle("UpdateConnectedAccount", request, observer, UpdateConnectedAccountResponse.getDefaultInstance());
        }

        @Override
        public void deleteConnectedAccount(DeleteConnectedAccountRequest request,
                                           StreamObserver<DeleteConnectedAccountResponse> observer) {
            handle("DeleteConnectedAccount", request, observer, DeleteConnectedAccountResponse.getDefaultInstance());
        }

        @Override
        public void getMagicLinkForConnectedAccount(GetMagicLinkForConnectedAccountRequest request,
                                                    StreamObserver<GetMagicLinkForConnectedAccountResponse> observer) {
            handle("GetMagicLinkForConnectedAccount", request, observer,
                    GetMagicLinkForConnectedAccountResponse.getDefaultInstance());
        }

        @Override
        public void getConnectedAccountAuth(GetConnectedAccountByIdentifierRequest request,
                                            StreamObserver<GetConnectedAccountByIdentifierResponse> observer) {
            handle("GetConnectedAccountAuth", request, observer,
                    GetConnectedAccountByIdentifierResponse.getDefaultInstance());
        }

        @Override
        public void verifyConnectedAccountUser(VerifyConnectedAccountUserRequest request,
                                               StreamObserver<VerifyConnectedAccountUserResponse> observer) {
            handle("VerifyConnectedAccountUser", request, observer,
                    VerifyConnectedAccountUserResponse.getDefaultInstance());
        }
    }

    private final class Mcp extends McpServiceGrpc.McpServiceImplBase {
        @Override
        public void createMcpConfig(CreateMcpConfigRequest request, StreamObserver<CreateMcpConfigResponse> observer) {
            handle("CreateMcpConfig", request, observer, CreateMcpConfigResponse.getDefaultInstance());
        }

        @Override
        public void getMcpConfig(GetMcpConfigRequest request, StreamObserver<GetMcpConfigResponse> observer) {
            handle("GetMcpConfig", request, observer, GetMcpConfigResponse.getDefaultInstance());
        }

        @Override
        public void listMcpConfigs(ListMcpConfigsRequest request, StreamObserver<ListMcpConfigsResponse> observer) {
            handle("ListMcpConfigs", request, observer, ListMcpConfigsResponse.getDefaultInstance());
        }

        @Override
        public void updateMcpConfig(UpdateMcpConfigRequest request, StreamObserver<UpdateMcpConfigResponse> observer) {
            handle("UpdateMcpConfig", request, observer, UpdateMcpConfigResponse.getDefaultInstance());
        }

        @Override
        public void deleteMcpConfig(DeleteMcpConfigRequest request, StreamObserver<DeleteMcpConfigResponse> observer) {
            handle("DeleteMcpConfig", request, observer, DeleteMcpConfigResponse.getDefaultInstance());
        }

        @Override
        public void listMcpConnectedAccounts(ListMcpConnectedAccountsRequest request,
                                             StreamObserver<ListMcpConnectedAccountsResponse> observer) {
            handle("ListMcpConnectedAccounts", request, observer,
                    ListMcpConnectedAccountsResponse.getDefaultInstance());
        }

        @Override
        public void createMcpSessionToken(CreateMcpSessionTokenRequest request,
                                          StreamObserver<CreateMcpSessionTokenResponse> observer) {
            handle("CreateMcpSessionToken", request, observer, CreateMcpSessionTokenResponse.getDefaultInstance());
        }
    }

    private final class Providers extends ProviderServiceGrpc.ProviderServiceImplBase {
        @Override
        public void createCustomProvider(CreateCustomProviderRequest request,
                                         StreamObserver<CreateProviderResponse> observer) {
            handle("CreateCustomProvider", request, observer, CreateProviderResponse.getDefaultInstance());
        }

        @Override
        public void updateCustomProvider(UpdateCustomProviderRequest request,
                                         StreamObserver<UpdateProviderResponse> observer) {
            handle("UpdateCustomProvider", request, observer, UpdateProviderResponse.getDefaultInstance());
        }

        @Override
        public void deleteCustomProvider(DeleteProviderRequest request,
                                         StreamObserver<DeleteProviderResponse> observer) {
            handle("DeleteCustomProvider", request, observer, DeleteProviderResponse.getDefaultInstance());
        }
    }
}
