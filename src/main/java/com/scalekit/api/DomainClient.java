package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.domains.Domain;

import java.util.List;

public interface DomainClient {

    Domain CreateDomain(String organizationId, String domainName);

    Domain GetDomainById(String organizationId, String domainId);

    List<Domain> ListDomainsByOrganizationId(String organizationId);
}
