package cverifier.domain;

import cverifier.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "verificationResults",
    path = "verificationResults"
)
public interface VerificationResultRepository
    extends PagingAndSortingRepository<VerificationResult, Integer> {}
