package carrent.domain;

import carrent.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "vehicleManagementSystems",
    path = "vehicleManagementSystems"
)
public interface VehicleManagementSystemRepository
    extends PagingAndSortingRepository<VehicleManagementSystem, Long> {}
