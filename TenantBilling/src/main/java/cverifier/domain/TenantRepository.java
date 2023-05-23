package cverifier.domain;

import cverifier.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tenants", path = "tenants")
public interface TenantRepository
    extends PagingAndSortingRepository<Tenant, String> {}
