package carrent.domain;

import carrent.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "carRentSystems",
    path = "carRentSystems"
)
public interface CarRentSystemRepository
    extends PagingAndSortingRepository<CarRentSystem, Long> {}
