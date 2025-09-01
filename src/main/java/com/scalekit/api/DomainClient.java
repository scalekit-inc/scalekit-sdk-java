package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.domains.CreateDomainRequest;
import com.scalekit.grpc.scalekit.v1.domains.Domain;
import com.scalekit.grpc.scalekit.v1.domains.DomainType;

import java.util.List;

public interface DomainClient {

    /**
     * createDomain creates a new domain for the organization
     * @param organizationId: The organization ID
     * @param domainName: The domain name
     * @return Domain: The domain created
     */
    Domain createDomain(String organizationId, String domainName);

    /**
     * createDomain creates a new domain for the organization with specified domain type
     * @param organizationId: The organization ID
     * @param domainName: The domain name
     * @param domainType: The type of domain
     * @return Domain: The domain created
     */
    Domain createDomain(String organizationId, String domainName, DomainType domainType);

    /**
     * createDomain creates a new domain using a request object
     * @param request: The create domain request containing domain details and optional domain type
     * @return Domain: The domain created
     */
    Domain createDomain(CreateDomainRequest request);

    Domain getDomainById(String organizationId, String domainId);

    List<Domain> listDomainsByOrganizationId(String organizationId);
}
