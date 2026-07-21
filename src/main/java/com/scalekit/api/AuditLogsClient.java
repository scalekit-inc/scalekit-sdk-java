package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.auditlogs.*;

public interface AuditLogsClient {

  ListAuthLogResponse listAuthRequests(ListAuthLogRequest request);

}
