package carrent.domain;

import carrent.CarManagementApplication;
import carrent.domain.Registered;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "VehicleManagementSystem_table")
@Data
public class VehicleManagementSystem {

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
    }

    public static VehicleManagementSystemRepository repository() {
        VehicleManagementSystemRepository vehicleManagementSystemRepository = CarManagementApplication.applicationContext.getBean(
            VehicleManagementSystemRepository.class
        );
        return vehicleManagementSystemRepository;
    }

    public void registerCancel() {
        Registercancelled registercancelled = new Registercancelled(this);
        registercancelled.publishAfterCommit();
    }

    public static void carStatusChange(Registered registered) {
        /** Example 1:  new item 
        VehicleManagementSystem vehicleManagementSystem = new VehicleManagementSystem();
        repository().save(vehicleManagementSystem);

        */

        /** Example 2:  finding and process
        
        repository().findById(registered.get???()).ifPresent(vehicleManagementSystem->{
            
            vehicleManagementSystem // do something
            repository().save(vehicleManagementSystem);


         });
        */

    }

    public static void carStatusChange(Registercancelled registercancelled) {
        /** Example 1:  new item 
        VehicleManagementSystem vehicleManagementSystem = new VehicleManagementSystem();
        repository().save(vehicleManagementSystem);

        */

        /** Example 2:  finding and process
        
        repository().findById(registercancelled.get???()).ifPresent(vehicleManagementSystem->{
            
            vehicleManagementSystem // do something
            repository().save(vehicleManagementSystem);


         });
        */

    }

    public static void carStatusChange(Reserved reserved) {
        /** Example 1:  new item 
        VehicleManagementSystem vehicleManagementSystem = new VehicleManagementSystem();
        repository().save(vehicleManagementSystem);

        */

        /** Example 2:  finding and process
        
        repository().findById(reserved.get???()).ifPresent(vehicleManagementSystem->{
            
            vehicleManagementSystem // do something
            repository().save(vehicleManagementSystem);


         });
        */

    }

    public static void carStatusChange(Rented rented) {
        /** Example 1:  new item 
        VehicleManagementSystem vehicleManagementSystem = new VehicleManagementSystem();
        repository().save(vehicleManagementSystem);

        */

        /** Example 2:  finding and process
        
        repository().findById(rented.get???()).ifPresent(vehicleManagementSystem->{
            
            vehicleManagementSystem // do something
            repository().save(vehicleManagementSystem);


         });
        */

    }

    public static void carStatusChange(Returned returned) {
        /** Example 1:  new item 
        VehicleManagementSystem vehicleManagementSystem = new VehicleManagementSystem();
        repository().save(vehicleManagementSystem);

        */

        /** Example 2:  finding and process
        
        repository().findById(returned.get???()).ifPresent(vehicleManagementSystem->{
            
            vehicleManagementSystem // do something
            repository().save(vehicleManagementSystem);


         });
        */

    }

    public static void carStatusChange(Reservecancelled reservecancelled) {
        /** Example 1:  new item 
        VehicleManagementSystem vehicleManagementSystem = new VehicleManagementSystem();
        repository().save(vehicleManagementSystem);

        */

        /** Example 2:  finding and process
        
        repository().findById(reservecancelled.get???()).ifPresent(vehicleManagementSystem->{
            
            vehicleManagementSystem // do something
            repository().save(vehicleManagementSystem);


         });
        */

    }
}
