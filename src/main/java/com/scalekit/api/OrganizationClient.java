package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.organizations.*;

import java.util.List;

public interface OrganizationClient {

  Organization create(CreateOrganization organization);

  Organization getById(String id);

  Organization getByExternalId(String externalId);

  Organization updateById(String id ,UpdateOrganization organization);

  Organization updateByExternalId(String externalId ,UpdateOrganization organization);

  void  deleteById(String id);

  void deleteByExternalId(String externalId);

  ListOrganizationsResponse listOrganizations(int pageSize, String pageToken);

  Link generatePortalLink(String organizationId);

  Link generatePortalLink(String organizationId,  List<Feature> features);

  Organization updateOrganizationSettings(String organizationId, List<OrganizationSettingsFeature> settings);

}
