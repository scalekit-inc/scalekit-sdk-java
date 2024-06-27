package com.scalekit.api;

import com.scalekit.grpc.scalekit.v1.organizations.CreateOrganization;
import com.scalekit.grpc.scalekit.v1.organizations.Organization;
import com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganization;

public interface OrganizationClient {

  Organization Create(CreateOrganization organization);

  Organization GetById(String id);

  Organization GetByExternalId(String externalId);

  Organization UpdateById(String id ,UpdateOrganization organization);

  Organization UpdateByExternalId(String externalId ,UpdateOrganization organization);

  void  DeleteById(String id);

  void DeleteByExternalId(String externalId);

}
