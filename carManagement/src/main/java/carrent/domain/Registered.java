package carrent.domain;

import carrent.domain.*;
import carrent.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Registered extends AbstractEvent {

    private Long carId;
    private Boolean status;

    public Registered(VehicleManagementSystem aggregate) {
        super(aggregate);
    }

    public Registered() {
        super();
    }
    // keep

}
