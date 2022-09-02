package carrent.domain;

import carrent.domain.*;
import carrent.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Reserved extends AbstractEvent {

    private Long rentId;
    private String carId;
    private String userId;
    private Date startDate;
    private Date endDate;
    private Date regDate;
    private String status;
    private String approverId;
    private Double rentCost;

    public Reserved(CarRentSystem aggregate) {
        super(aggregate);
    }

    public Reserved() {
        super();
    }
    // keep

}
