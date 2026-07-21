package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.events.*;

public interface EventsClient {

  ListEventsPaginatedResponse listEventsPaginated(int pageSize, String pageToken);

  ListEventsPaginatedResponse listEventsPaginated(EventFilter filter, int pageSize, String pageToken);

  ListEventsResponse listEvents(int pageSize, String pageToken);

  ListEventsResponse listEvents(EventFilter filter, int pageSize, String pageToken);

}
