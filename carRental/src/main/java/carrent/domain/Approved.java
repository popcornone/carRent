package carrent.domain;

import carrent.domain.*;
import carrent.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Approved extends AbstractEvent {

    private Long id;
    private Long rentId;
    private String status;
    private String approverId;

    public Approved(CarRentSystem aggregate) {
        super(aggregate);
    }

    public Approved() {
        super();
    }
    // keep

}
