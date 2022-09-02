package carrent.domain;

import carrent.CarRentalApplication;
import carrent.domain.Approved;
import carrent.domain.Confirmed;
import carrent.domain.Rented;
import carrent.domain.Reservecancelled;
import carrent.domain.Reserved;
import carrent.domain.Returned;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "CarRentSystem_table")
@Data
public class CarRentSystem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rentId;

    private String carId;

    private String userId;

    private Date rentStartDate;

    private Date rentEndDate;

    private Date regDate;

    private String rentStatus;

    private String approverId;

    private Double rentCost;

    @PostPersist
    public void onPostPersist() {
        Returned returned = new Returned(this);
        returned.publishAfterCommit();

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        carrent.external.CarRentSystem carRentSystem = new carrent.external.CarRentSystem();
        // mappings goes here
        CarRentalApplication.applicationContext
            .getBean(carrent.external.CarRentSystemService.class)
            .pay(carRentSystem);

        Reserved reserved = new Reserved(this);
        reserved.publishAfterCommit();

        Reservecancelled reservecancelled = new Reservecancelled(this);
        reservecancelled.publishAfterCommit();

        Approved approved = new Approved(this);
        approved.publishAfterCommit();

        Confirmed confirmed = new Confirmed(this);
        confirmed.publishAfterCommit();

        Rented rented = new Rented(this);
        rented.publishAfterCommit();
    }

    public static CarRentSystemRepository repository() {
        CarRentSystemRepository carRentSystemRepository = CarRentalApplication.applicationContext.getBean(
            CarRentSystemRepository.class
        );
        return carRentSystemRepository;
    }

    public static void carStatusChange(Registered registered) {
        /** Example 1:  new item 
        CarRentSystem carRentSystem = new CarRentSystem();
        repository().save(carRentSystem);

        */

        /** Example 2:  finding and process
        
        repository().findById(registered.get???()).ifPresent(carRentSystem->{
            
            carRentSystem // do something
            repository().save(carRentSystem);


         });
        */

    }

    public static void carStatusChange(Registercancelled registercancelled) {
        /** Example 1:  new item 
        CarRentSystem carRentSystem = new CarRentSystem();
        repository().save(carRentSystem);

        */

        /** Example 2:  finding and process
        
        repository().findById(registercancelled.get???()).ifPresent(carRentSystem->{
            
            carRentSystem // do something
            repository().save(carRentSystem);


         });
        */

    }
}
