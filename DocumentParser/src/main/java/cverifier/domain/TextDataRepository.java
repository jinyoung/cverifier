package cverifier.domain;

import cverifier.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "textData", path = "textData")
public interface TextDataRepository
    extends PagingAndSortingRepository<TextData, Integer> {}
