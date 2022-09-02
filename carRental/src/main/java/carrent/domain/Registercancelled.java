package carrent.domain;

import carrent.domain.*;
import carrent.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Registercancelled extends AbstractEvent {

    private Long carId;
    private Boolean status;
    // keep

}
