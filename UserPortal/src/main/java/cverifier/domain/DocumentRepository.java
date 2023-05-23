package cverifier.domain;

import cverifier.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "documents", path = "documents")
public interface DocumentRepository
    extends PagingAndSortingRepository<Document, String> {}
