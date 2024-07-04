package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.domains.Domain;

import java.util.List;

public interface DomainClient {

    Domain createDomain(String organizationId, String domainName);

    Domain getDomainById(String organizationId, String domainId);

    List<Domain> listDomainsByOrganizationId(String organizationId);
}
