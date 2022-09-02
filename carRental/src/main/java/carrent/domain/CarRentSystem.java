package carrent.domain;

import carrent.CarRentalApplication;
import carrent.domain.Reserved;
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
        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        carrent.external.CarRentSystem carRentSystem = new carrent.external.CarRentSystem();
        // mappings goes here
        CarRentalApplication.applicationContext
            .getBean(carrent.external.CarRentSystemService.class)
            .pay(carRentSystem);

        Reserved reserved = new Reserved(this);
        reserved.publishAfterCommit();
    }

    public static CarRentSystemRepository repository() {
        CarRentSystemRepository carRentSystemRepository = CarRentalApplication.applicationContext.getBean(
            CarRentSystemRepository.class
        );
        return carRentSystemRepository;
    }

    public void reserveCancel() {
        Reservecancelled reservecancelled = new Reservecancelled(this);
        reservecancelled.publishAfterCommit();
    }

    public void returnCar() {
        Returned returned = new Returned(this);
        returned.publishAfterCommit();
    }

    public void pay() {
        Approved approved = new Approved(this);
        approved.publishAfterCommit();
    }

    public void rent() {
        Rented rented = new Rented(this);
        rented.publishAfterCommit();
    }
}
