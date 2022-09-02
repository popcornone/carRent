package carrent.domain;

import carrent.domain.*;
import carrent.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Rented extends AbstractEvent {

    private Long rentId;
    private String rentStatus;

    public Rented(CarRentSystem aggregate) {
        super(aggregate);
    }

    public Rented() {
        super();
    }
    // keep

}
