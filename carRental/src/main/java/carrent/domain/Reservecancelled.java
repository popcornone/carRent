package carrent.domain;

import carrent.domain.*;
import carrent.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Reservecancelled extends AbstractEvent {

    private Long rentId;
    private String status;

    public Reservecancelled(CarRentSystem aggregate) {
        super(aggregate);
    }

    public Reservecancelled() {
        super();
    }
    // keep

}
