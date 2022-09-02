package carrent.domain;

import carrent.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "memberManagementSystems",
    path = "memberManagementSystems"
)
public interface MemberManagementSystemRepository
    extends PagingAndSortingRepository<MemberManagementSystem, Long> {}
