package com.scalekit.api.impl;

import com.scalekit.Environment;
import com.scalekit.api.EventsClient;
import com.scalekit.grpc.scalekit.v1.events.*;
import com.scalekit.internal.RetryExecuter;
import com.scalekit.internal.ScalekitCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;


public class ScalekitEventsClient implements EventsClient {

    private final EventsServiceGrpc.EventsServiceBlockingStub eventsStub;
    private final ScalekitCredentials credentials;

    public ScalekitEventsClient(ManagedChannel channel, ScalekitCredentials credentials){
        try {
            this.credentials = credentials;
            this.eventsStub = EventsServiceGrpc
                    .newBlockingStub(channel)
                    .withCallCredentials(this.credentials);

        }
        catch (StatusRuntimeException e){
            throw new RuntimeException("Error creating Events client", e);
        }

    }

    /**
     * listEventsPaginated retrieves a paginated list of events
     * The response will have page tokens to retrieve the next and previous pages with the same size
     * <p>
     * @param pageSize: The number of events to retrieve default page size is 10
     * @param pageToken: The page token to retrieve the next page
     * @return ListEventsPaginatedResponse: The list of events retrieved
     */
    @Override
    public ListEventsPaginatedResponse listEventsPaginated(int pageSize, String pageToken) {
        return listEventsPaginated(EventFilter.newBuilder().build(), pageSize, pageToken);
    }

    /**
     * listEventsPaginated retrieves a paginated list of events matching the given filter
     * The response will have page tokens to retrieve the next and previous pages with the same size
     * <p>
     * @param filter: The filter to apply when listing events
     * @param pageSize: The number of events to retrieve default page size is 10
     * @param pageToken: The page token to retrieve the next page
     * @return ListEventsPaginatedResponse: The list of events retrieved
     */
    @Override
    public ListEventsPaginatedResponse listEventsPaginated(EventFilter filter, int pageSize, String pageToken) {
        String finalPageToken = pageToken;
        int finalPageSize = pageSize;
        if (Objects.isNull(finalPageToken)) {
            finalPageToken = "";
        }
        if (finalPageSize <= 0) {
            finalPageSize = 10;
        }
        final String effectivePageToken = finalPageToken;
        final int effectivePageSize = finalPageSize;
        return RetryExecuter.executeWithRetry(() -> {
            ListEventsPaginatedRequest request = ListEventsPaginatedRequest.newBuilder()
                    .setFilter(filter)
                    .setPageSize(effectivePageSize)
                    .setPageToken(effectivePageToken)
                    .build();
            return this.eventsStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .listEventsPaginated(request);
        },this.credentials);
    }

    /**
     * listEvents retrieves a list of events matching an empty filter, including a total count
     * <p>
     * @param pageSize: The number of events to retrieve default page size is 10
     * @param pageToken: The page token to retrieve the next page
     * @return ListEventsResponse: The list of events retrieved, including total_size
     */
    @Override
    public ListEventsResponse listEvents(int pageSize, String pageToken) {
        return listEvents(EventFilter.newBuilder().build(), pageSize, pageToken);
    }

    /**
     * listEvents retrieves a list of events matching the given filter, including a total count.
     * Set {@link EventFilter#getAuthRequestId()} to correlate results with a specific
     * authentication request returned by AuditLogsClient.listAuthRequests.
     * <p>
     * @param filter: The filter to apply when listing events
     * @param pageSize: The number of events to retrieve default page size is 10
     * @param pageToken: The page token to retrieve the next page
     * @return ListEventsResponse: The list of events retrieved, including total_size
     */
    @Override
    public ListEventsResponse listEvents(EventFilter filter, int pageSize, String pageToken) {
        String finalPageToken = pageToken;
        int finalPageSize = pageSize;
        if (Objects.isNull(finalPageToken)) {
            finalPageToken = "";
        }
        if (finalPageSize <= 0) {
            finalPageSize = 10;
        }
        final String effectivePageToken = finalPageToken;
        final int effectivePageSize = finalPageSize;
        return RetryExecuter.executeWithRetry(() -> {
            ListEventsRequest request = ListEventsRequest.newBuilder()
                    .setFilter(filter)
                    .setPageSize(effectivePageSize)
                    .setPageToken(effectivePageToken)
                    .build();
            return this.eventsStub
                    .withDeadlineAfter(Environment.defaultConfig().timeout, TimeUnit.MILLISECONDS)
                    .listEvents(request);
        },this.credentials);
    }

}
