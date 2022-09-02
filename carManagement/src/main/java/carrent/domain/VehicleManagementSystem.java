package carrent.domain;

import carrent.CarManagementApplication;
import carrent.domain.Registercancelled;
import carrent.domain.Registered;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "VehicleManagementSystem_table")
@Data
public class VehicleManagementSystem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long carId;

    private String model;

    private String type;

    private Date regStartDate;

    private Date regEndDate;

    private Boolean status;

    @PostPersist
    public void onPostPersist() {
        Registered registered = new Registered(this);
        registered.publishAfterCommit();

        Registercancelled registercancelled = new Registercancelled(this);
        registercancelled.publishAfterCommit();
    }

    public static VehicleManagementSystemRepository repository() {
        VehicleManagementSystemRepository vehicleManagementSystemRepository = CarManagementApplication.applicationContext.getBean(
            VehicleManagementSystemRepository.class
        );
        return vehicleManagementSystemRepository;
    }
}
