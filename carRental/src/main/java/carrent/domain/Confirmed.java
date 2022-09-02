package carrent.domain;

import carrent.domain.*;
import carrent.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Confirmed extends AbstractEvent {

    private Long id;

    public Confirmed(CarRentSystem aggregate) {
        super(aggregate);
    }

    public Confirmed() {
        super();
    }
    // keep

}
